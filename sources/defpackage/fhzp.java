package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fhzp {
    public final byte[][] a;

    protected fhzp(fhzo fhzoVar, byte[][] bArr) {
        if (fiai.e(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        }
        if (bArr.length != fhzoVar.b) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != fhzoVar.a) {
                throw new IllegalArgumentException("wrong publicKey format");
            }
        }
        this.a = fiai.k(bArr);
    }
}
