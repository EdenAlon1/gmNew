package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxm implements ahxn {
    public final xhu a;

    public ahxm(xhu xhuVar) {
        xhuVar.getClass();
        this.a = xhuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahxm) && ffkj.e(this.a, ((ahxm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Enabled(draft=" + this.a + ")";
    }
}
