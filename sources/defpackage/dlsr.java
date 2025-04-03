package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlsr {
    public final String a;
    public final dmzz b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final ffix j;
    public final ffix k;

    public /* synthetic */ dlsr(String str, dmzz dmzzVar, boolean z, boolean z2, boolean z3, boolean z4, List list, boolean z5, ffix ffixVar, ffix ffixVar2, int i) {
        List list2 = (i & 64) != 0 ? ffel.a : list;
        int i2 = i & 16;
        int i3 = i & 4;
        int i4 = i & 2;
        boolean z6 = (!((i & 32) == 0)) | z4;
        boolean z7 = (!(i2 == 0)) | z3;
        boolean z8 = ((i & 8) == 0) & z2;
        boolean z9 = z & (i3 == 0);
        dmzzVar = i4 != 0 ? null : dmzzVar;
        boolean z10 = ((i & 128) == 0) & z5;
        boolean z11 = (i & 256) != 0;
        ffix ffixVar3 = (i & 512) == 0 ? ffixVar : null;
        str.getClass();
        list2.getClass();
        ffixVar2.getClass();
        this.a = str;
        this.b = dmzzVar;
        this.c = z9;
        this.d = z8;
        this.e = z7;
        this.f = z6;
        this.g = list2;
        this.h = z10;
        this.i = z11;
        this.j = ffixVar3;
        this.k = ffixVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlsr)) {
            return false;
        }
        dlsr dlsrVar = (dlsr) obj;
        return ffkj.e(this.a, dlsrVar.a) && this.b == dlsrVar.b && this.c == dlsrVar.c && this.d == dlsrVar.d && this.e == dlsrVar.e && this.f == dlsrVar.f && ffkj.e(this.g, dlsrVar.g) && this.h == dlsrVar.h && this.i == dlsrVar.i && ffkj.e(this.j, dlsrVar.j) && ffkj.e(this.k, dlsrVar.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dmzz dmzzVar = this.b;
        int hashCode2 = (((((((((((((((hashCode + (dmzzVar == null ? 0 : dmzzVar.hashCode())) * 31) + dlsq.a(this.c)) * 31) + dlsq.a(this.d)) * 31) + dlsq.a(this.e)) * 31) + dlsq.a(this.f)) * 31) + this.g.hashCode()) * 31) + dlsq.a(this.h)) * 31) + dlsq.a(this.i)) * 31;
        ffix ffixVar = this.j;
        return ((hashCode2 + (ffixVar != null ? ffixVar.hashCode() : 0)) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "ActionUiData(title=" + this.a + ", icon=" + this.b + ", isIconBadged=" + this.c + ", pinToOverflowMenu=" + this.d + ", isVisible=" + this.e + ", canExecute=" + this.f + ", subActions=" + this.g + ", showIconsForSubActions=" + this.h + ", shouldTint=" + this.i + ", onResume=" + this.j + ", execute=" + this.k + ")";
    }
}
