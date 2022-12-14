package Singleton;

// Early / Early Instance
public class AircraftEagar {
    // 1. So that instance created at load time
    // 2. private member -> no Outside class can access it to create instance
    // 3. static -> Inside AircraftEager class you don't want any kind of new instance be loaded
    private static AircraftEagar instance = new AircraftEagar();

    private AircraftEagar(){}

    public static AircraftEagar getInstance(){
        return instance;
    }

    public void fly(){
        System.out.println("Flying some Aircraft from Early");
    }

}


// Lazy Instance
class AircraftLazy {
    // 1. So that instance created at load time
    // 2. private member -> no Outside class can access it to create instance
    // 3. static -> Inside AircraftEager class you don't want any kind of new instance be loaded
    private static AircraftLazy instance ;

    private AircraftLazy(){}

    public static AircraftLazy getInstance(){
        if(instance == null){
            instance = new AircraftLazy();
        }
        return instance;
    }

    public void fly(){
        System.out.println("Flying some Aircraft from Lazy");
    }

}


class client{
    public static void main(String[] args) {
        // Now we can't make a object because constructor is private.

        // Early Instance (instance created in compile time)
        AircraftEagar obj1 = AircraftEagar.getInstance();
        obj1.fly();

        // Lazy Instance (instance created in run time)
        AircraftLazy obj2 = AircraftLazy.getInstance();
        obj2.fly();

    }
}

// Session
// Gmail
// => Gmail arjunUser = new Gmail()
// == arjunUser.login() => Typed is Password, Username
// Sessions[ Expery time[ 1Day ] for Instance closed ] => they keep a track of Instance Creation
// Arjun got logged in !15 th sep 9:00 => saves session time in memory
// For more than a day session time get expired and wheneven I try a new Instance would be created
// It tries to access the old instance
// Closed Browser
// == Gmail  michealUser = new Gmail
// Cache => Stores UserName, Debit Card Details


