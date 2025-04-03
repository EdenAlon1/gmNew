package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gky implements dhf {
    public final long a;
    private final boolean b;
    private final float c;
    private final ibz d = null;

    public gky(boolean z, float f, long j) {
        this.b = z;
        this.c = f;
        this.a = j;
    }

    @Override // defpackage.dhf
    public final isw a(dwn dwnVar) {
        return new gdi(dwnVar, this.b, this.c, new gkx(this));
    }

    @Override // defpackage.dgz
    public final /* synthetic */ dig b(hfd hfdVar) {
        return dgy.a(hfdVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gky)) {
            return false;
        }
        gky gkyVar = (gky) obj;
        if (this.b != gkyVar.b || !jzq.b(this.c, gkyVar.c)) {
            return false;
        }
        ibz ibzVar = gkyVar.d;
        if (!ffkj.e(null, null)) {
            return false;
        }
        long j = this.a;
        long j2 = gkyVar.a;
        long j3 = ibw.a;
        return ffcp.a(j, j2);
    }

    @Override // defpackage.dhf
    public final int hashCode() {
        int floatToIntBits = ((true != this.b ? 1237 : 1231) * 31) + Float.floatToIntBits(this.c);
        long j = this.a;
        long j2 = ibw.a;
        return (floatToIntBits * 961) + ffco.a(j);
    }
}
