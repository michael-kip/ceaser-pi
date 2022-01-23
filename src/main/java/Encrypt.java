public class Encrypt {
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
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
    public String Encrypt(String inputForEncryption, int encryptionKey){
        inputForEncryption = inputForEncryption.toUpperCase();
        String encryptionResults = "";
        for (int i=0; i<inputForEncryption.length(); i++){
            int characterIndex = alphabet.indexOf(inputForEncryption.charAt(i));
            int newCharacterIndex = (characterIndex + encryptionKey)% 26;
            char encryptedChar = alphabet.charAt(newCharacterIndex);
            encryptionResults = encryptionResults + encryptedChar;
        }
        return encryptionResults;

    }

}
