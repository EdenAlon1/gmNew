package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmiy {
    public final dmiw a;
    public final List b;
    public final boolean c;
    public final dmiq d;
    private final dmiq e;
    private final boolean f;

    public /* synthetic */ dmiy(dmiw dmiwVar, List list, boolean z, dmiq dmiqVar, int i) {
        this.a = dmiwVar;
        this.b = list;
        this.c = ((i & 4) == 0) & z;
        this.e = null;
        this.d = (i & 16) != 0 ? null : dmiqVar;
        this.f = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmiy)) {
            return false;
        }
        dmiy dmiyVar = (dmiy) obj;
        if (!ffkj.e(this.a, dmiyVar.a) || !ffkj.e(this.b, dmiyVar.b) || this.c != dmiyVar.c) {
            return false;
        }
        dmiq dmiqVar = dmiyVar.e;
        if (!ffkj.e(null, null) || !ffkj.e(this.d, dmiyVar.d)) {
            return false;
        }
        boolean z = dmiyVar.f;
        return true;
    }

    public final int hashCode() {
        dmiw dmiwVar = this.a;
        int hashCode = ((dmiwVar == null ? 0 : dmiwVar.hashCode()) * 31) + this.b.hashCode();
        boolean z = this.c;
        dmiq dmiqVar = this.d;
        return (((((hashCode * 31) + dmix.a(z)) * 961) + (dmiqVar != null ? dmiqVar.hashCode() : 0)) * 31) + dmix.a(true);
    }

    public final String toString() {
        return "CardstoneUiData(title=" + this.a + ", listItems=" + this.b + ", isError=" + this.c + ", confirmButton=null, cancelButton=" + this.d + ", useOutline=true)";
    }
}
