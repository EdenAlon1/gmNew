package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffwq extends ffwr {
    public final Throwable a;

    public ffwq(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ffwq) && ffkj.e(this.a, ((ffwq) obj).a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.ffwr
    public final String toString() {
        return "Closed(" + this.a + ")";
    }
}
