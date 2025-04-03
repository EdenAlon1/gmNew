package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xvz {
    public final xhm a;

    public xvz(xhm xhmVar) {
        this.a = xhmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xvz) && ffkj.e(this.a, ((xvz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Add(attachment=" + this.a + ")";
    }
}
