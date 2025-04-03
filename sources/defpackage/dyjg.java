package defpackage;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyjg {
    public static eyee a(String str, KeyPair keyPair) {
        byte[] b = dyhv.b(str);
        try {
            PrivateKey privateKey = keyPair.getPrivate();
            Signature signature = Signature.getInstance("SHA256withECDSA");
            signature.initSign(privateKey);
            signature.update(b);
            return eyee.x(signature.sign());
        } catch (InvalidKeyException | NoSuchAlgorithmException | SignatureException e) {
            dyhr.c("CryptoUtils", e.toString().concat(" failed to signBytes"));
            return null;
        }
    }
}
