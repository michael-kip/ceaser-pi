import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void newEncrypt_instantiatesCorrectly(){
        Encrypt testEncrypt = new Encrypt("baba", 1 );
        assertEquals(true, testEncrypt instanceof Encrypt);
    }
    @Test
    public void  newEncrypt_ifInputAString(){
        Encrypt testEncrypt = new Encrypt("baba", 1);
        assertEquals("baba", testEncrypt.getInputForEncryption());
    }
    @Test
    public void newEncrypt_ifInputIsKeyInt(){
        Encrypt testEncrypt = new Encrypt("baba", 1);
        assertEquals(1, testEncrypt.getEncryptionKey());
    }
    @Test
    public void newEncrypt_replaceLetter(){
        Encrypt testEncrypt = new Encrypt("a", 2);
        assertEquals("c", testEncrypt.isEncrypted());
    }
    @Test
    public void newEncrypt_replaceSingleLetter(){
        Encrypt testEncrypt = new Encrypt("a", 2);
        assertEquals("C", testEncrypt.Encrypt("a", 2));
    }
    @Test
    public void newEncrypt_replaceMultipleLetters(){
        Encrypt testEncrypt = new Encrypt("abc", 2);
        assertEquals("CDE", testEncrypt.Encrypt("abc", 2));
    }
}
