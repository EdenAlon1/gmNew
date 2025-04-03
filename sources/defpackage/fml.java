package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fml {
    public final long a;
    private final frj b = null;

    public fml(long j) {
        this.a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fml)) {
            return false;
        }
        long j = this.a;
        fml fmlVar = (fml) obj;
        long j2 = fmlVar.a;
        long j3 = ibw.a;
        if (!ffcp.a(j, j2)) {
            return false;
        }
        frj frjVar = fmlVar.b;
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
