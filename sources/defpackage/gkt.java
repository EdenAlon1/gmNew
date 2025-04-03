package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkt {
    public final long a;
    private final frj b = null;

    public gkt(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkt)) {
            return false;
        }
        long j = this.a;
        gkt gktVar = (gkt) obj;
        long j2 = gktVar.a;
        long j3 = ibw.a;
        if (!ffcp.a(j, j2)) {
            return false;
        }
        frj frjVar = gktVar.b;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        long j = ibw.a;
        return ffco.a(this.a) * 31;
    }

    public final String toString() {
        return "RippleConfiguration(color=" + ((Object) ibw.g(this.a)) + ", rippleAlpha=null)";
    }
}
