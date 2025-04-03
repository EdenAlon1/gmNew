package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpqg implements dpqk {
    public final Throwable a;

    public dpqg(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dpqg) && ffkj.e(this.a, ((dpqg) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th == null) {
            return 0;
        }
        return th.hashCode();
    }

    public final String toString() {
        return "Error(cause=" + this.a + ")";
    }
}
