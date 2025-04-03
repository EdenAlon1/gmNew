package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igp extends igq {
    private final long a;
    private float b = 1.0f;
    private ibx c;

    public igp(long j) {
        this.a = j;
    }

    @Override // defpackage.igq
    public final long a() {
        return 9205357640488583168L;
    }

    @Override // defpackage.igq
    protected final void b(ifr ifrVar) {
        ifrVar.r(this.a, 0L, (r20 & 4) != 0 ? ifq.c(ifrVar.b(), 0L) : 0L, (r20 & 8) != 0 ? 1.0f : this.b, (r20 & 16) != 0 ? ifu.a : null, (r20 & 32) != 0 ? null : this.c, (r20 & 64) != 0 ? 3 : 0);
    }

    @Override // defpackage.igq
    protected final void c(float f) {
        this.b = f;
    }

    @Override // defpackage.igq
    protected final void d(ibx ibxVar) {
        this.c = ibxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igp)) {
            return false;
        }
        long j = this.a;
        long j2 = ((igp) obj).a;
        long j3 = ibw.a;
        return ffcp.a(j, j2);
    }

    public final int hashCode() {
        long j = ibw.a;
        return ffco.a(this.a);
    }

    public final String toString() {
        return "ColorPainter(color=" + ((Object) ibw.g(this.a)) + ')';
    }
}
