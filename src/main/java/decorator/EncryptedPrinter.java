package decorator;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class EncryptedPrinter extends PrinterDecorator {
    private static final String ALGO = "AES";
    private static String key;

    public EncryptedPrinter(Printer printer) {
        super(printer);
        this.key = "Default123456789";
    }

    // Löysin nämä netistä nämä simppelit encyptionit.
    public static String encrypt(String data) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), ALGO);
            Cipher cipher = Cipher.getInstance(ALGO);
            cipher.init(Cipher.ENCRYPT_MODE, keySpec);

            byte[] encrypted = cipher.doFinal(data.getBytes());
            return Base64.getEncoder().encodeToString(encrypted);
        } catch (Exception e) {
            System.err.println("Encryption error: " + e.getMessage());
            return null;
        }
    }

    public static String decrypt(String encryptedData) {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(key.getBytes(), ALGO);
            Cipher cipher = Cipher.getInstance(ALGO);
            cipher.init(Cipher.DECRYPT_MODE, keySpec);

            byte[] decoded = Base64.getDecoder().decode(encryptedData);
            return new String(cipher.doFinal(decoded));
        } catch (Exception e) {
            System.err.println("Decryption error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void print(String message) throws Exception {
        super.print(encrypt(message));
    }
}
