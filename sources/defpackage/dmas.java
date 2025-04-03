package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmas {
    public final List a;
    public final dlti b;
    public final ffix c;
    public final ffix d;
    public final dmar e;
    private final String f;

    public dmas() {
        this(null, null, null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmas)) {
            return false;
        }
        dmas dmasVar = (dmas) obj;
        if (!ffkj.e(this.a, dmasVar.a)) {
            return false;
        }
        String str = dmasVar.f;
        return ffkj.e(null, null) && ffkj.e(this.b, dmasVar.b) && ffkj.e(this.c, dmasVar.c) && ffkj.e(this.d, dmasVar.d) && ffkj.e(this.e, dmasVar.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 961;
        dlti dltiVar = this.b;
        return ((((((hashCode + (dltiVar == null ? 0 : dltiVar.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "BadgeGroupUiData(items=" + this.a + ", contentDescription=null, initialCompositionElement=" + this.b + ", onClick=" + this.c + ", onShown=" + this.d + ", flags=" + this.e + ")";
    }

    public /* synthetic */ dmas(List list, dlti dltiVar, ffix ffixVar, ffix ffixVar2, dmar dmarVar, int i) {
        list = (i & 1) != 0 ? ffel.a : list;
        dltiVar = (i & 4) != 0 ? null : dltiVar;
        ffixVar = (i & 8) != 0 ? new ffix() { // from class: dmap
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar;
        ffixVar2 = (i & 16) != 0 ? new ffix() { // from class: dmaq
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar2;
        dmarVar = (i & 32) != 0 ? new dmar((byte[]) null) : dmarVar;
        list.getClass();
        ffixVar.getClass();
        ffixVar2.getClass();
        dmarVar.getClass();
        this.a = list;
        this.f = null;
        this.b = dltiVar;
        this.c = ffixVar;
        this.d = ffixVar2;
        this.e = dmarVar;
    }
}
