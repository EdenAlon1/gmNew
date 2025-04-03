package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qss extends qsu {
    public final qsw a;

    public qss(qsw qswVar) {
        this.a = qswVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qss) && ffkj.e(this.a, ((qss) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ImmediateGlideSize(size=" + this.a + ")";
    }
}
