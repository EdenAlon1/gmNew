package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjko {
    public final Throwable a;
    public final int b;

    public cjko(int i, Throwable th) {
        this.b = i;
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cjko)) {
            return false;
        }
        cjko cjkoVar = (cjko) obj;
        return this.b == cjkoVar.b && ffkj.e(this.a, cjkoVar.a);
    }

    public final int hashCode() {
        Throwable th = this.a;
        return (this.b * 31) + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "PipelineWorkResult(executionResult=" + ((Object) cjkn.a(this.b)) + ", exception=" + this.a + ")";
    }

    public /* synthetic */ cjko(int i) {
        this(i, null);
    }
}
