package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zkq {
    public final olu a;

    public zkq(olu oluVar) {
        oluVar.getClass();
        this.a = oluVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zkq) && ffkj.e(this.a, ((zkq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LazyPagingWrapper(items=" + this.a + ")";
    }
}
