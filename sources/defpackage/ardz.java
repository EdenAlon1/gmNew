package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ardz implements arec {
    public final ardy a;

    public ardz(ardy ardyVar) {
        this.a = ardyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ardz) && ffkj.e(this.a, ((ardz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(reason=" + this.a + ")";
    }
}
