class ByteOverflow {
    public static void main(String[] args) {

        byte b = 127;   // maximum value of byte
        b++;

        System.out.println("Value after overflow: " + b);
    }
}
