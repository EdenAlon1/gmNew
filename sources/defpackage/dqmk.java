package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqmk extends dqml {
    public final Throwable a;

    public dqmk(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dqmk) && ffkj.e(this.a, ((dqmk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Rejected(cause=" + this.a + ")";
    }
}
