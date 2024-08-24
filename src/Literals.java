public class Literals {
    public static void main(String[] args)
    {
        int decimal = 100;       // Decimal literal
        int octal = 0144;        // Octal literal (equivalent to 100 in decimal)
        //0 before declaring a hexadecimal
        int hex = 0x64;          // Hexadecimal literal (equivalent to 100 in decimal)
        int binary = 0b1100100;  // Binary literal (equivalent to 100 in decimal)

        System.out.println("Decimal: " + decimal);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Binary: " + binary);
    }
}
