public class MixMatch
{
    public static void main(String[] args)
    {
        String varString = "Hello, Java!";
        char varChar = 'J';
        short varShort = 32000;
        int varInt = 2025;
        long varLong = 9876543210L;
        float varFloat = 3.14f;
        double varDouble = 3.1415926535;
        boolean varBoolean = true;

        System.out.println(varString + " <- String, stores sequences of characters.");
        System.out.println(varChar + " <- Char, stores a single character (16-bit Unicode).");
        System.out.println(varShort + " <- Short, stores whole numbers from -32,768 to 32,767.");
        System.out.println(varInt + " <- Integer, stores whole numbers from -2,147,483,648 to 2,147,483,647.");
        System.out.println(varLong + " <- Long, stores very large whole numbers, up to 9,223,372,036,854,775,807.");
        System.out.println(varFloat + " <- Float, stores decimal numbers with up to 6-7 digits of precision.");
        System.out.println(varDouble + " <- Double, stores decimal numbers with up to 15-16 digits of precision.");
        System.out.println(varBoolean + " <- Boolean, stores true or false values.");

        // Output multiple variables in a single print statement
        System.out.println("Mix & Match: " + varString + ", " + varChar + ", " + varShort + ", " + varInt + ", " + varLong + ", " + varFloat + ", " + varDouble + ", " + varBoolean);
 
    }
}