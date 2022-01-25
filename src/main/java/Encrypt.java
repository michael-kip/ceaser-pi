public class Encrypt {
    private String mAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String mInputForEncryption;
    private int mEncryptionKey;

    public String getInputForEncryption(){
        return mInputForEncryption;
    }
    public int getEncryptionKey(){
        return mEncryptionKey;
    }
    public String isEncrypted(){
        mInputForEncryption = "c";
        return mInputForEncryption;
    }

    public Encrypt(String inputForEncryption, int encryptionKey){
        this.mInputForEncryption = inputForEncryption;
        this.mEncryptionKey = encryptionKey;
    }
    public String Encrypt(String inputForEncryption, int encryptionKey){
        inputForEncryption = inputForEncryption.toUpperCase();
        String encryptionResults = "";
        for (int i=0; i<inputForEncryption.length(); i++){
            int characterIndex = mAlphabet.indexOf(inputForEncryption.charAt(i));
            int newCharacterIndex = (characterIndex + encryptionKey)% 26;
            char encryptedChar = mAlphabet.charAt(newCharacterIndex);
            encryptionResults = encryptionResults + encryptedChar;
        }
        return encryptionResults;

    }

}
