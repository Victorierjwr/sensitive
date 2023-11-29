package com.cib.crypto.aes;

import com.cib.crypto.abe.policy.PairingManager;
import it.unisa.dia.gas.jpbc.Element;
import org.junit.jupiter.api.Test;

import javax.crypto.Cipher;
import java.io.*;
import java.nio.file.Files;

import static com.cib.crypto.aes.AES.crypto;

public class AESTest {

    @Test
    public void encToDec() throws IOException {
        File f = new File("README.md");
        File enc_out = new File("enc_out");
        if(!enc_out.exists()){
            enc_out.createNewFile();
        }
        File dec_out = new File("dec_out");
        if(!dec_out.exists()){
            dec_out.createNewFile();
        }
        Element e = PairingManager.defaultPairing.getGT().newRandomElement();
        InputStream is = Files.newInputStream(f.toPath());
        OutputStream os = Files.newOutputStream(enc_out.toPath());
        crypto(Cipher.ENCRYPT_MODE, is, os, e);
        is.close();
        os.close();
        is = Files.newInputStream(enc_out.toPath());
        os = Files.newOutputStream(dec_out.toPath());
        crypto(Cipher.DECRYPT_MODE, is, os, e);
    }
}
