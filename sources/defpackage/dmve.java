package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmve implements dmvt {
    public final String a;
    public final List b;
    public final dmzz c;
    public final String d;
    public final boolean e;
    public final boolean f;
    public final doas g;
    public final doas h;
    public final ffix i;

    public dmve(String str, List list, dmzz dmzzVar, String str2, boolean z, boolean z2, doas doasVar, doas doasVar2, ffix ffixVar) {
        list.getClass();
        ffixVar.getClass();
        this.a = str;
        this.b = list;
        this.c = dmzzVar;
        this.d = str2;
        this.e = z;
        this.f = z2;
        this.g = doasVar;
        this.h = doasVar2;
        this.i = ffixVar;
    }

    @Override // defpackage.dmvt
    public final /* synthetic */ dmvt a(boolean z, ffix ffixVar) {
        return dmvb.a(this, z, ffixVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmve)) {
            return false;
        }
        dmve dmveVar = (dmve) obj;
        return ffkj.e(this.a, dmveVar.a) && ffkj.e(this.b, dmveVar.b) && this.c == dmveVar.c && ffkj.e(this.d, dmveVar.d) && this.e == dmveVar.e && this.f == dmveVar.f && ffkj.e(this.g, dmveVar.g) && ffkj.e(this.h, dmveVar.h) && ffkj.e(this.i, dmveVar.i);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        dmzz dmzzVar = this.c;
        int hashCode2 = ((hashCode * 31) + (dmzzVar == null ? 0 : dmzzVar.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + dmvc.a(this.e)) * 31) + dmvc.a(this.f)) * 31) + this.g.hashCode()) * 31;
        doas doasVar = this.h;
        return ((hashCode3 + (doasVar != null ? doasVar.hashCode() : 0)) * 31) + this.i.hashCode();
    }

    public final String toString() {
        return "Alert(body=" + this.a + ", bodyAnnotations=" + this.b + ", icon=" + this.c + ", title=" + this.d + ", selectableText=" + this.e + ", isError=" + this.f + ", confirmButton=" + this.g + ", dismissButton=" + this.h + ", onDismissRequest=" + this.i + ")";
    }

    public /* synthetic */ dmve(String str, List list, dmzz dmzzVar, String str2, boolean z, boolean z2, doas doasVar, doas doasVar2, ffix ffixVar, int i) {
        this(str, (i & 2) != 0 ? ffel.a : list, (i & 4) != 0 ? null : dmzzVar, (i & 8) != 0 ? null : str2, ((i & 16) == 0) & z, ((i & 32) == 0) & z2, doasVar, (i & 128) != 0 ? null : doasVar2, (i & 256) != 0 ? new ffix() { // from class: dmvd
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar);
    }
}
