public class Decrypt {
    private String mAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String mInputForEncryption;
    private int mEncryptionKey;

    public String getInputForEncryption(){
        return mInputForEncryption;
    }
    public int getEncryptionKey(){
        return mEncryptionKey;
    }

    public Decrypt(String inputForEncryption, int encryptionKey){
        this.mInputForEncryption = inputForEncryption;
        this.mEncryptionKey = encryptionKey;
    }

    public String Decrypt(String inputForEncryption, int encryptionKey){
        inputForEncryption = inputForEncryption.toUpperCase();
        String decryptionResults = "";
        for (int i=0; i<inputForEncryption.length(); i++){
            int characterIndex = mAlphabet.indexOf(inputForEncryption.charAt(i));
            int newCharIndex = (characterIndex - encryptionKey) % 26;
            if (newCharIndex < 0){
                newCharIndex = mAlphabet.length() + newCharIndex;
            }
            char decryptedChar = mAlphabet.charAt(newCharIndex);
            decryptionResults = decryptionResults + decryptedChar;
        }
        return decryptionResults;

    }
}
