package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fhzr {
    private final int a;
    public final int d;
    public final long e;
    public final int f;

    protected fhzr(fhzq fhzqVar) {
        this.d = fhzqVar.e;
        this.e = fhzqVar.f;
        this.a = fhzqVar.d;
        this.f = fhzqVar.g;
    }

    protected byte[] a() {
        byte[] bArr = new byte[32];
        ficw.e(this.d, bArr, 0);
        ficw.g(this.e, bArr, 4);
        ficw.e(this.a, bArr, 12);
        ficw.e(this.f, bArr, 28);
        return bArr;
    }
}
