package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eufa implements etgi {
    public static final byte[] a = new byte[0];
    public static final byte[] b = {0};
    private final RSAPublicKey c;
    private final String d;
    private final byte[] e;
    private final byte[] f;
    private final Provider g;

    public eufa(RSAPublicKey rSAPublicKey, eudc eudcVar, byte[] bArr, byte[] bArr2, Provider provider) {
        String str;
        if (!etmj.a(2)) {
            throw new GeneralSecurityException("Can not use RSA-PKCS1.5 in FIPS-mode, as BoringCrypto module is not available.");
        }
        eujq.b(rSAPublicKey.getModulus().bitLength());
        eujq.c(rSAPublicKey.getPublicExponent());
        this.c = rSAPublicKey;
        if (eudcVar == eudc.a) {
            str = "SHA256withRSA";
        } else if (eudcVar == eudc.b) {
            str = "SHA384withRSA";
        } else {
            if (eudcVar != eudc.c) {
                throw new GeneralSecurityException("unknown hash type");
            }
            str = "SHA512withRSA";
        }
        this.d = str;
        this.e = bArr;
        this.f = bArr2;
        this.g = provider;
    }

    @Override // defpackage.etgi
    public final void a(byte[] bArr, byte[] bArr2) {
        if (!ettp.e(this.e, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.d;
        Provider provider = this.g;
        RSAPublicKey rSAPublicKey = this.c;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.update(bArr2);
        byte[] bArr3 = this.f;
        if (bArr3.length > 0) {
            signature.update(bArr3);
        }
        try {
            if (signature.verify(Arrays.copyOfRange(bArr, this.e.length, bArr.length))) {
                return;
            }
        } catch (RuntimeException unused) {
        }
        throw new GeneralSecurityException("Invalid signature");
    }
}
