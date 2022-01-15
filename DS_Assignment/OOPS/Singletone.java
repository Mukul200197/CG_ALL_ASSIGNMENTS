
class Singleton {
    // Static variable single_instance of type Singleton
    private static Singleton instance = null;
 
    // Declaring a variable of type String
    public String s;
 
    // Constructor of this class
    // Here private constructor is is used to
    // restricted to this class itself
    private Singleton()
    {
        s = "String of Singletone class";
    }
 
    // Method
    // Static method to create instance of Singleton class
    public static Singleton Singleton()
    {
        // To ensure only one instance is created
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
 
// Class 2
// Main class
class GFG {
    // Main driver method
    public static void main(String args[])
    {
        Singleton A = Singleton.Singleton();

        Singleton B = Singleton.Singleton();

    
        System.out.println(" A is " + A.s);
        System.out.println(" B is " + B.s);
        System.out.println("\n");
 
    }
}