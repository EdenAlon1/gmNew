package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnuw implements dnux {
    public final Float a;
    public final ffix b;

    public dnuw(Float f, ffix ffixVar) {
        this.a = f;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnuw)) {
            return false;
        }
        dnuw dnuwVar = (dnuw) obj;
        return ffkj.e(this.a, dnuwVar.a) && ffkj.e(this.b, dnuwVar.b);
    }

    public final int hashCode() {
        Float f = this.a;
        return ((f == null ? 0 : f.hashCode()) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Transferring(progressPercentage=" + this.a + ", onCancelButtonClicked=" + this.b + ")";
    }
}
