package defpackage;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class etqe implements etpu {
    private final euic a;
    private final etpp b;

    private etqe(etpp etppVar, euic euicVar) {
        this.b = etppVar;
        this.a = euicVar;
    }

    static etqe d(euic euicVar) {
        int ordinal = euicVar.ordinal();
        if (ordinal == 0) {
            return new etqe(new etpp("HmacSha256"), euic.NIST_P256);
        }
        if (ordinal == 1) {
            return new etqe(new etpp("HmacSha384"), euic.NIST_P384);
        }
        if (ordinal == 2) {
            return new etqe(new etpp("HmacSha512"), euic.NIST_P521);
        }
        throw new GeneralSecurityException("invalid curve type: ".concat(String.valueOf(String.valueOf(euicVar))));
    }

    private final byte[] e(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        byte[] b = euhs.b(bArr2, bArr3);
        byte[] c = etqb.c(c());
        etpp etppVar = this.b;
        return etppVar.e(bArr, b, c, etppVar.a());
    }

    @Override // defpackage.etpu
    public final etpv a(byte[] bArr) {
        euic euicVar = this.a;
        KeyPair b = euif.b(euicVar);
        byte[] k = euif.k((ECPrivateKey) b.getPrivate(), euif.f(euicVar, euie.UNCOMPRESSED, bArr));
        byte[] l = euif.l(this.a, euie.UNCOMPRESSED, ((ECPublicKey) b.getPublic()).getW());
        return new etpv(e(k, l, bArr), l);
    }

    @Override // defpackage.etpu
    public final byte[] b(byte[] bArr, etpw etpwVar) {
        return e(euif.k(euif.d(this.a, etpwVar.a.c()), euif.f(this.a, euie.UNCOMPRESSED, bArr)), bArr, etpwVar.b.c());
    }

    @Override // defpackage.etpu
    public final byte[] c() {
        int ordinal = this.a.ordinal();
        if (ordinal == 0) {
            return etqb.c;
        }
        if (ordinal == 1) {
            return etqb.d;
        }
        if (ordinal == 2) {
            return etqb.e;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
