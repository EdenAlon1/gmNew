package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qsm extends qsu {
    public final ffji a;

    public qsm(ffji ffjiVar) {
        this.a = ffjiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qsm) && ffkj.e(this.a, ((qsm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "AsyncGlideSize(asyncSize=" + this.a + ")";
    }
}
