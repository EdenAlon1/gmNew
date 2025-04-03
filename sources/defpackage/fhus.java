package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhus extends fhup {
    final byte[] c;
    final byte[] d;

    public fhus(fhuq fhuqVar, byte[] bArr) {
        super(false, fhuqVar);
        this.c = fics.g(bArr, 0, 32);
        this.d = fics.g(bArr, 32, bArr.length);
    }

    public final byte[] a() {
        return fics.e(this.c, this.d);
    }

    public final byte[] b() {
        return fics.c(this.d);
    }

    public fhus(fhuq fhuqVar, byte[] bArr, byte[] bArr2) {
        super(false, fhuqVar);
        this.c = fics.c(bArr);
        this.d = fics.c(bArr2);
    }
}
