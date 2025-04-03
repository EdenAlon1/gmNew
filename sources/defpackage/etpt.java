package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class etpt implements etfr {
    private static final byte[] a = new byte[0];
    private final byte[] b;
    private final etpu c;
    private final etpq d;
    private final byte[] e;
    private final etpp f;

    private etpt(eujt eujtVar, etpu etpuVar, etpp etppVar, etpq etpqVar, eujt eujtVar2) {
        this.b = eujtVar.c();
        this.c = etpuVar;
        this.f = etppVar;
        this.d = etpqVar;
        this.e = eujtVar2.c();
    }

    public static etfr b(etok etokVar) {
        etob etobVar = etokVar.a;
        return new etpt(etokVar.b, d(etobVar.a), e(etobVar.b), c(etobVar.c), etokVar.c);
    }

    static etpq c(etnw etnwVar) {
        if (etnwVar.equals(etnw.a)) {
            return new etpb(16);
        }
        if (etnwVar.equals(etnw.b)) {
            return new etpb(32);
        }
        if (etnwVar.equals(etnw.c)) {
            return new etpc();
        }
        throw new GeneralSecurityException("Unrecognized HPKE AEAD identifier");
    }

    static etpu d(etnz etnzVar) {
        if (etnzVar.equals(etnz.f)) {
            return new etqj(new etpp("HmacSha256"));
        }
        if (etnzVar.equals(etnz.a)) {
            return etqe.d(euic.NIST_P256);
        }
        if (etnzVar.equals(etnz.b)) {
            return etqe.d(euic.NIST_P384);
        }
        if (etnzVar.equals(etnz.c)) {
            return etqe.d(euic.NIST_P521);
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    static etpp e(etny etnyVar) {
        if (etnyVar.equals(etny.a)) {
            return new etpp("HmacSha256");
        }
        if (etnyVar.equals(etny.b)) {
            return new etpp("HmacSha384");
        }
        if (etnyVar.equals(etny.c)) {
            return new etpp("HmacSha512");
        }
        throw new GeneralSecurityException("Unrecognized HPKE KDF identifier");
    }

    @Override // defpackage.etfr
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        byte[] bArr4 = this.b;
        etpu etpuVar = this.c;
        etpp etppVar = this.f;
        etpq etpqVar = this.d;
        etpv a2 = etpuVar.a(bArr4);
        etpr b = etpr.b(etqb.a, a2.b, a2.a, etpuVar, etppVar, etpqVar, bArr3);
        byte[] bArr5 = b.c;
        int length = this.e.length;
        int length2 = bArr5.length;
        byte[] bArr6 = a;
        byte[] a3 = b.a();
        byte[] d = b.a.d(b.b, a3, bArr, length + length2, bArr6);
        byte[] bArr7 = this.e;
        System.arraycopy(bArr7, 0, d, 0, bArr7.length);
        System.arraycopy(bArr5, 0, d, this.e.length, length2);
        return d;
    }
}
