package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.interfaces.RSAPrivateCrtKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateCrtKeySpec;
import java.security.spec.RSAPublicKeySpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euje implements etgh {
    private static final byte[] a = new byte[0];
    private static final byte[] b = {0};
    private static final byte[] c = {1, 2, 3};
    private final RSAPrivateCrtKey d;
    private final RSAPublicKey e;
    private final String f;
    private final byte[] g;
    private final byte[] h;

    private euje(RSAPrivateCrtKey rSAPrivateCrtKey, euiu euiuVar, byte[] bArr, byte[] bArr2) {
        if (!etmj.a(2)) {
            throw new GeneralSecurityException("Can not use RSA PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        eujq.d(euiuVar);
        eujq.b(rSAPrivateCrtKey.getModulus().bitLength());
        eujq.c(rSAPrivateCrtKey.getPublicExponent());
        this.d = rSAPrivateCrtKey;
        eujq.d(euiuVar);
        this.f = euiuVar.toString().concat("withRSA");
        this.e = (RSAPublicKey) ((KeyFactory) euil.g.a("RSA")).generatePublic(new RSAPublicKeySpec(rSAPrivateCrtKey.getModulus(), rSAPrivateCrtKey.getPublicExponent()));
        this.g = bArr;
        this.h = bArr2;
    }

    public static etgh a(eudg eudgVar) {
        euje eujeVar = new euje((RSAPrivateCrtKey) ((KeyFactory) euil.g.a("RSA")).generatePrivate(new RSAPrivateCrtKeySpec(eudgVar.a.b, eudgVar.c().c, eudgVar.b.a, eudgVar.c.a, eudgVar.d.a, eudgVar.e.a, eudgVar.f.a, eudgVar.g.a)), (euiu) eujg.a.a(eudgVar.c().e), eudgVar.f().c(), eudgVar.c().d.equals(eudd.c) ? b : a);
        etgi b2 = eujg.b(eudgVar.a);
        try {
            byte[] bArr = c;
            Signature signature = (Signature) euil.c.a(eujeVar.f);
            signature.initSign(eujeVar.d);
            signature.update(bArr);
            byte[] bArr2 = eujeVar.h;
            if (bArr2.length > 0) {
                signature.update(bArr2);
            }
            byte[] sign = signature.sign();
            Signature signature2 = (Signature) euil.c.a(eujeVar.f);
            signature2.initVerify(eujeVar.e);
            signature2.update(bArr);
            byte[] bArr3 = eujeVar.h;
            if (bArr3.length > 0) {
                signature2.update(bArr3);
            }
            if (!signature2.verify(sign)) {
                throw new IllegalStateException("Security bug: RSA signature computation error");
            }
            byte[] bArr4 = eujeVar.g;
            if (bArr4.length != 0) {
                sign = euhs.b(bArr4, sign);
            }
            b2.a(sign, bArr);
            return eujeVar;
        } catch (GeneralSecurityException e) {
            throw new GeneralSecurityException("RsaSsaPkcs1 signing with private key followed by verifying with public key failed. The key may be corrupted.", e);
        }
    }
}
