import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void newEncrypt_instantiatesCorrectly(){
        Encrypt testEncrypt = new Encrypt("baba", 1 );
        assertEquals(true, testEncrypt instanceof Encrypt);
    }

}