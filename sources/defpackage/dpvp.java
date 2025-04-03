package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpvp implements dpvu {
    public final Integer a;
    public final Throwable b;

    public dpvp(Integer num, Throwable th) {
        this.a = num;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpvp)) {
            return false;
        }
        dpvp dpvpVar = (dpvp) obj;
        return ffkj.e(this.a, dpvpVar.a) && ffkj.e(this.b, dpvpVar.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = num == null ? 0 : num.hashCode();
        Throwable th = this.b;
        return (hashCode * 31) + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "Finalize(error=" + this.a + ", cause=" + this.b + ")";
    }

    public dpvp() {
        this(null, null);
    }
}
