package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class xwk {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final Long d;
    public final Float e;

    public xwk(boolean z, boolean z2, boolean z3, Long l, Float f) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = l;
        this.e = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xwk)) {
            return false;
        }
        xwk xwkVar = (xwk) obj;
        return this.a == xwkVar.a && this.b == xwkVar.b && this.c == xwkVar.c && ffkj.e(this.d, xwkVar.d) && ffkj.e(this.e, xwkVar.e);
    }

    public final int hashCode() {
        Long l = this.d;
        int hashCode = l == null ? 0 : l.hashCode();
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        Float f = this.e;
        return (((((((xwj.a(z) * 31) + xwj.a(z2)) * 31) + xwj.a(z3)) * 31) + hashCode) * 31) + (f != null ? f.hashCode() : 0);
    }

    public final String toString() {
        return "DraftAudioFlowRequirements(isPlaying=" + this.a + ", isLoading=" + this.b + ", hasError=" + this.c + ", currentPositionInMillis=" + this.d + ", seekProgress=" + this.e + ")";
    }
}
