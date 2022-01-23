public class Encrypt {
    private String inputForEncryption;
    private int encryptionKey;

    public String getInputForEncryption(){
        return inputForEncryption;
    }
    public int getEncryptionKey(){
        return encryptionKey;
    }

    public Encrypt(String inputForEncryption, int encryptionKey){
        this.inputForEncryption = inputForEncryption;
        this.encryptionKey = encryptionKey;

    }
}
