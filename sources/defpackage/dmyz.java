package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmyz implements dmym {
    private final ffix a;
    private final ffbz b;

    public dmyz(ffix ffixVar) {
        this.a = ffixVar;
        this.b = ffca.b(3, ffixVar);
    }

    @Override // defpackage.dmym
    public final dmyy a() {
        return (dmyy) this.b.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmyz) && ffkj.e(this.a, ((dmyz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LazyFavoriteUiData(initializer=" + this.a + ")";
    }
}
