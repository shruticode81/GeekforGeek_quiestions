//Implementation of hashMap using separate chaining hash method
//when collision happens the key and value is stored inside the same 
//index position inside a linkedlist
import java.util.ArrayList;
public class Map<K,V>{
    ArrayList<MapNode<K,V>> buckets;
    int size; // size of element present in map
    int numBuckets; // size of arraylist
    public Map(){
        numBuckets=20;
        buckets=new ArrayList<>();
        for(int i=0;i<20;i++){
            buckets.add(null);
        }
    }
    private int getBucketIndex(K key){
        //to get a index from key
        //we need a hashfunc hashCode
        int hashcode = key.hashCode();
        //every onject in java is extends from Object subclass
        //and Object has hashcode() func implemenation
        //so we can directly use it
        //or we can also create one for ourselfs
        //like String has its own hashCode()
        return hashcode%numBuckets;
    }
    public void insert(K key,V value){
        int bucketIndex = getBucketIndex(key);
        //find the head at this index
        MapNode<K,V> head = buckets.get(bucketIndex);//this contain address of head node
        while(head!=null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        //key not found create a new node and insert at front
        head = buckets.get(bucketIndex);
        MapNode<K,V> newNode = new MapNode<K,V>(key,value);
        size++;
        newNode.next = head;
        buckets.set(bucketIndex,newNode);
        double loadfactor = (1.0*size)/numBuckets;
        if(loadfactor>0.7){
            rehash();
        }
    }
    public V getValue(K key){
        int bucketIndex=getBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        while(head!=null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
        
    }
    public int size(){
        return size;
    }
    public V removeKey(K key){
        int bucketIndex = getBucketIndex(key);
        MapNode<K,V> head = buckets.get(bucketIndex);
        MapNode<K,v> prev = null;
        while(head!=null){
            if(head.key.equals(key)){
                size--;
                if(prev==null){
                    buckets.set(bucketIndex,head.next);
                }else{
                    prev.next = head.next;
                }
                return head.value;
            }
            prev = head;
            head = head.next;
        }
        return null;
    }
}