package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmyy implements dmym {
    public final dnym a;
    public final String b;
    public final ffix c;
    public final dlsf d;
    public final dmyy e;

    public dmyy(dnym dnymVar, String str, ffix ffixVar, dlsf dlsfVar) {
        ffixVar.getClass();
        this.a = dnymVar;
        this.b = str;
        this.c = ffixVar;
        this.d = dlsfVar;
        this.e = this;
    }

    @Override // defpackage.dmym
    public final dmyy a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmyy)) {
            return false;
        }
        dmyy dmyyVar = (dmyy) obj;
        return ffkj.e(this.a, dmyyVar.a) && ffkj.e(this.b, dmyyVar.b) && ffkj.e(this.c, dmyyVar.c) && ffkj.e(this.d, dmyyVar.d);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        dlsf dlsfVar = this.d;
        return (hashCode * 31) + (dlsfVar == null ? 0 : dlsfVar.hashCode());
    }

    public final String toString() {
        return "FavoriteUiData(monogram=" + this.a + ", text=" + this.b + ", onClick=" + this.c + ", onRemove=" + this.d + ")";
    }

    public /* synthetic */ dmyy(dnym dnymVar, String str, ffix ffixVar, dlsf dlsfVar, int i) {
        this(dnymVar, str, (i & 4) != 0 ? new ffix() { // from class: dmyx
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar, (i & 8) != 0 ? null : dlsfVar);
    }
}
