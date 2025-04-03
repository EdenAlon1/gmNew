package defpackage;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eufj implements etgi {
    public static final byte[] a = new byte[0];
    public static final byte[] b = {0};
    private final RSAPublicKey c;
    private final String d;
    private final PSSParameterSpec e;
    private final byte[] f;
    private final byte[] g;
    private final Provider h;

    public eufj(RSAPublicKey rSAPublicKey, eudo eudoVar, eudo eudoVar2, int i, byte[] bArr, byte[] bArr2, Provider provider) {
        if (!etmj.a(2)) {
            throw new GeneralSecurityException("Cannot use RSA SSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        if (!eudoVar.equals(eudoVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        eujq.b(rSAPublicKey.getModulus().bitLength());
        eujq.c(rSAPublicKey.getPublicExponent());
        this.c = rSAPublicKey;
        this.d = b(eudoVar);
        this.e = d(eudoVar, eudoVar2, i);
        this.f = bArr;
        this.g = bArr2;
        this.h = provider;
    }

    static String b(eudo eudoVar) {
        if (eudoVar == eudo.a) {
            return "SHA256withRSA/PSS";
        }
        if (eudoVar == eudo.b) {
            return "SHA384withRSA/PSS";
        }
        if (eudoVar == eudo.c) {
            return "SHA512withRSA/PSS";
        }
        throw new IllegalArgumentException("Unsupported hash: ".concat(String.valueOf(String.valueOf(eudoVar))));
    }

    public static Provider c() {
        if (ettp.d()) {
            ettp.c().intValue();
        }
        return etqr.a();
    }

    static PSSParameterSpec d(eudo eudoVar, eudo eudoVar2, int i) {
        String str;
        MGF1ParameterSpec mGF1ParameterSpec;
        eudo eudoVar3 = eudo.a;
        if (eudoVar == eudoVar3) {
            str = "SHA-256";
        } else if (eudoVar == eudo.b) {
            str = "SHA-384";
        } else {
            if (eudoVar != eudo.c) {
                throw new IllegalArgumentException("Unsupported MD hash: ".concat(String.valueOf(String.valueOf(eudoVar))));
            }
            str = "SHA-512";
        }
        if (eudoVar2 == eudoVar3) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA256;
        } else if (eudoVar2 == eudo.b) {
            mGF1ParameterSpec = MGF1ParameterSpec.SHA384;
        } else {
            if (eudoVar2 != eudo.c) {
                throw new IllegalArgumentException("Unsupported MGF1 hash: ".concat(String.valueOf(String.valueOf(eudoVar2))));
            }
            mGF1ParameterSpec = MGF1ParameterSpec.SHA512;
        }
        return new PSSParameterSpec(str, "MGF1", mGF1ParameterSpec, i, 1);
    }

    @Override // defpackage.etgi
    public final void a(byte[] bArr, byte[] bArr2) {
        if (!ettp.e(this.f, bArr)) {
            throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
        }
        String str = this.d;
        Provider provider = this.h;
        RSAPublicKey rSAPublicKey = this.c;
        Signature signature = Signature.getInstance(str, provider);
        signature.initVerify(rSAPublicKey);
        signature.setParameter(this.e);
        signature.update(bArr2);
        byte[] bArr3 = this.g;
        if (bArr3.length > 0) {
            signature.update(bArr3);
        }
        byte[] bArr4 = this.f;
        int length = bArr.length;
        int length2 = bArr4.length;
        if (!signature.verify(bArr, length2, length - length2)) {
            throw new GeneralSecurityException("signature verification failed");
        }
    }
}
