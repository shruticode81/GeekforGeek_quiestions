var isLoggedin = true;
var isEmailverified = true;
var Cardinfo = false;
if(isLoggedin){
    console.log("you r logged in");
    if(isEmailverified){
        console.log("your email is verified");
        if(Cardinfo){
            console.log("you can purchase the course");
        }
    }
}