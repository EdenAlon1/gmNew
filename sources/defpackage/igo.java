package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igo extends igq {
    public int a;
    private final ich b;
    private final long c;
    private final long d;
    private final long e;
    private float f;
    private ibx g;

    public igo(ich ichVar, long j) {
        int i;
        int i2;
        this.b = ichVar;
        this.c = 0L;
        this.d = j;
        this.a = 1;
        if (kaa.a(0L) < 0 || kaa.b(0L) < 0 || (i = (int) (j >> 32)) < 0 || (i2 = (int) (4294967295L & j)) < 0 || i > ichVar.c() || i2 > ichVar.b()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.e = j;
        this.f = 1.0f;
    }

    @Override // defpackage.igq
    public final long a() {
        return kag.d(this.e);
    }

    @Override // defpackage.igq
    protected final void b(ifr ifrVar) {
        ifq.l(ifrVar, this.b, this.d, (Math.round(Float.intBitsToFloat((int) (ifrVar.b() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (ifrVar.b() & 4294967295L))) & 4294967295L), this.f, this.g, this.a, 328);
    }

    @Override // defpackage.igq
    protected final void c(float f) {
        this.f = f;
    }

    @Override // defpackage.igq
    protected final void d(ibx ibxVar) {
        this.g = ibxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igo)) {
            return false;
        }
        igo igoVar = (igo) obj;
        if (!ffkj.e(this.b, igoVar.b)) {
            return false;
        }
        long j = igoVar.c;
        return kaa.f(0L, 0L) && kaf.e(this.d, igoVar.d) && icd.a(this.a, igoVar.a);
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + jzz.a(0L)) * 31) + kae.a(this.d)) * 31) + this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.b);
        sb.append(", srcOffset=");
        sb.append((Object) kaa.e(0L));
        sb.append(", srcSize=");
        sb.append((Object) kaf.c(this.d));
        sb.append(", filterQuality=");
        int i = this.a;
        sb.append((Object) (icd.a(i, 0) ? "None" : icd.a(i, 1) ? "Low" : icd.a(i, 2) ? "Medium" : icd.a(i, 3) ? "High" : "Unknown"));
        sb.append(')');
        return sb.toString();
    }

    public /* synthetic */ igo(ich ichVar) {
        this(ichVar, (ichVar.c() << 32) | (ichVar.b() & 4294967295L));
    }
}
