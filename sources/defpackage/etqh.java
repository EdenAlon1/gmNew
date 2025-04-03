package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etqh implements etqg {
    public static final /* synthetic */ int b = 0;
    private static final byte[] c = {48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32};
    private static final byte[] d = {48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0};
    final Provider a;

    public etqh(Provider provider) {
        this.a = provider;
    }

    @Override // defpackage.etqg
    public final etqf a() {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("XDH", this.a);
        keyPairGenerator.initialize(PrivateKeyType.INVALID);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        byte[] encoded = generateKeyPair.getPrivate().getEncoded();
        if (encoded.length != 48) {
            throw new GeneralSecurityException("Invalid encoded private key length");
        }
        if (!ettp.e(c, encoded)) {
            throw new GeneralSecurityException("Invalid encoded private key prefix");
        }
        byte[] copyOfRange = Arrays.copyOfRange(encoded, 16, 48);
        byte[] encoded2 = generateKeyPair.getPublic().getEncoded();
        if (encoded2.length != 44) {
            throw new GeneralSecurityException("Invalid encoded public key length");
        }
        if (ettp.e(d, encoded2)) {
            return new etqf(copyOfRange, Arrays.copyOfRange(encoded2, 12, 44));
        }
        throw new GeneralSecurityException("Invalid encoded public key prefix");
    }

    @Override // defpackage.etqg
    public final byte[] b(byte[] bArr, byte[] bArr2) {
        KeyFactory keyFactory = KeyFactory.getInstance("XDH", this.a);
        if (bArr.length != 32) {
            throw new InvalidKeyException("Invalid X25519 private key");
        }
        PrivateKey generatePrivate = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(euhs.b(c, bArr)));
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Invalid X25519 public key");
        }
        PublicKey generatePublic = keyFactory.generatePublic(new X509EncodedKeySpec(euhs.b(d, bArr2)));
        KeyAgreement keyAgreement = KeyAgreement.getInstance("XDH", this.a);
        keyAgreement.init(generatePrivate);
        keyAgreement.doPhase(generatePublic, true);
        return keyAgreement.generateSecret();
    }
}
