package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edbo {
    public final eyee a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    private final boolean f;
    private final List g;
    private final List h;
    private final List i;
    private final boolean j;

    public edbo(boolean z, List list, eyee eyeeVar, String str, String str2, List list2, List list3, boolean z2, boolean z3, boolean z4) {
        list.getClass();
        eyeeVar.getClass();
        str.getClass();
        str2.getClass();
        list2.getClass();
        list3.getClass();
        this.f = z;
        this.g = list;
        this.a = eyeeVar;
        this.b = str;
        this.c = str2;
        this.h = list2;
        this.i = list3;
        this.j = z2;
        this.d = z3;
        this.e = z4;
    }

    public final boolean a(eull eullVar) {
        eullVar.getClass();
        return this.f && this.g.contains(eullVar);
    }

    public final int b(eull eullVar, String str) {
        eullVar.getClass();
        str.getClass();
        if (!this.j) {
            return 14;
        }
        if (!a(eullVar)) {
            return 3;
        }
        if (this.a.H()) {
            return 4;
        }
        if (this.h.isEmpty() || this.h.contains(str)) {
            return this.i.contains(str) ? 6 : 0;
        }
        return 5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edbo)) {
            return false;
        }
        edbo edboVar = (edbo) obj;
        return this.f == edboVar.f && ffkj.e(this.g, edboVar.g) && ffkj.e(this.a, edboVar.a) && ffkj.e(this.b, edboVar.b) && ffkj.e(this.c, edboVar.c) && ffkj.e(this.h, edboVar.h) && ffkj.e(this.i, edboVar.i) && this.j == edboVar.j && this.d == edboVar.d && this.e == edboVar.e;
    }

    public final int hashCode() {
        int a = (((((((((((edbn.a(this.f) * 31) + this.g.hashCode()) * 31) + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode();
        boolean z = this.e;
        return (((((a * 31) + edbn.a(this.j)) * 31) + edbn.a(this.d)) * 31) + edbn.a(z);
    }

    public final String toString() {
        return "SharedStorageInfo(shouldUseSharedStorage=" + this.f + ", enabledBackings=" + this.g + ", secret=" + this.a + ", dirPath=" + this.b + ", gmsCoreDirPath=" + this.c + ", includeStaticConfigPackages=" + this.h + ", excludeStaticConfigPackages=" + this.i + ", hasStorageInfoFromGms=" + this.j + ", allowEmptySnapshotToken=" + this.d + ", enableCommitV2Api=" + this.e + ")";
    }
}
