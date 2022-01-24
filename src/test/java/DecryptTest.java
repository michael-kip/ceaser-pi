import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
    @Test
    public void newDecrypt_instantiatesCorrectly(){
        Decrypt testDecrypt = new Decrypt("bcd", 1);
        assertEquals(true, testDecrypt instanceof Decrypt);
    }
    @Test
    public void newDecrypt_ifInputIsAString(){
        Decrypt testDecrypt = new Decrypt("bcd", 1);
        assertEquals("ABC", testDecrypt.getInputForEncryption());
    }
    @Test
    public void newDecrypt_ifKeyInputIsInt(){
        Decrypt testDecrypt = new Decrypt("bcd", 1);
        assertEquals(1, testDecrypt.getEncryptionKey());
    }
    @Test
    public void newDecrypt_replaceSingleLetter(){
        Decrypt testDecrypt = new Decrypt("b", 1);
        assertEquals("A", testDecrypt.Decrypt("b", 1));
    }
    @Test
    public void newDecrypt_replaceMultipleLetters(){
        Decrypt testDecrypt = new Decrypt("bcde",1);
        assertEquals("ABCD", testDecrypt.Decrypt("bcde", 1));
    }
}