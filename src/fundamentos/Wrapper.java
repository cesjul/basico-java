package fundamentos;

public class Wrapper {
    public static void main(String[] args) {
        //Byte = 1 byte
        Byte b = 100;
        // Short = 2 bytes
        Short s = 1000;
        // Integer = 4 bytes
        Integer i = 10000;
        // Long = 8 bytes
        Long l = 100000L;

        Float f = 123.10F;
        Double d = 456.1;

        System.out.println(b.byteValue());
        System.out.println(i.toString());

    }
}
