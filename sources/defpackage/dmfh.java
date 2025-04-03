package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmfh implements dmfn {
    public final String a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final doas g;
    public final doas h;
    public final List i;
    public final List j;
    public final dmeb k;
    public final int l;
    public final hun m;
    public final dohr n;
    public final dmfg o;
    private final String p;
    private final List q;
    private final boolean r;
    private final boolean s;
    private final ffix t;

    public /* synthetic */ dmfh(String str, Integer num, Integer num2, String str2, String str3, String str4, doas doasVar, doas doasVar2, List list, List list2, List list3, dmeb dmebVar, hun hunVar, dohr dohrVar, dmfg dmfgVar, ffix ffixVar) {
        dmebVar.getClass();
        this.a = str;
        this.b = num;
        this.c = num2;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = doasVar;
        this.h = doasVar2;
        this.i = list;
        this.j = list2;
        this.p = null;
        this.q = list3;
        this.r = true;
        this.k = dmebVar;
        this.l = 5;
        this.m = hunVar;
        this.n = dohrVar;
        this.o = dmfgVar;
        this.s = true;
        this.t = ffixVar;
    }

    @Override // defpackage.dmfn
    public final dmfn a(ffix ffixVar) {
        return new dmfh(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.q, this.k, this.m, this.n, this.o, ffixVar);
    }

    @Override // defpackage.dmfn
    public final ffix b() {
        return this.t;
    }

    @Override // defpackage.dmfn
    public final boolean c() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmfh)) {
            return false;
        }
        dmfh dmfhVar = (dmfh) obj;
        if (!ffkj.e(this.a, dmfhVar.a) || !ffkj.e(this.b, dmfhVar.b) || !ffkj.e(this.c, dmfhVar.c) || !ffkj.e(this.d, dmfhVar.d) || !ffkj.e(this.e, dmfhVar.e) || !ffkj.e(this.f, dmfhVar.f) || !ffkj.e(this.g, dmfhVar.g) || !ffkj.e(this.h, dmfhVar.h) || !ffkj.e(this.i, dmfhVar.i) || !ffkj.e(this.j, dmfhVar.j)) {
            return false;
        }
        String str = dmfhVar.p;
        if (!ffkj.e(null, null) || !ffkj.e(this.q, dmfhVar.q)) {
            return false;
        }
        boolean z = dmfhVar.r;
        if (this.k != dmfhVar.k) {
            return false;
        }
        int i = dmfhVar.l;
        if (!jyj.b(5, 5) || !ffkj.e(this.m, dmfhVar.m) || !ffkj.e(this.n, dmfhVar.n) || !ffkj.e(this.o, dmfhVar.o)) {
            return false;
        }
        boolean z2 = dmfhVar.s;
        return ffkj.e(this.t, dmfhVar.t);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + 1) * 31) + this.j.hashCode()) * 961) + 1) * 31) + 1231) * 31) + this.k.hashCode()) * 31) + 5) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode()) * 31) + 1231) * 31) + this.t.hashCode();
    }

    public final String toString() {
        return "GaiaOptIn(title=" + this.a + ", titleHighlightStart=" + this.b + ", titleHighlightEnd=" + this.c + ", accountName=" + this.d + ", accountAvatarUri=" + this.e + ", headerIconUri=" + this.f + ", confirmButton=" + this.g + ", denyButton=" + this.h + ", items=" + this.i + ", itemsV2=" + this.j + ", body=null, bodyAnnotations=" + this.q + ", useEqualButtons=true, buttonLayout=" + this.k + ", bodyAnnotationTextAlign=" + jyj.a(5) + ", bodyAnnotationAlignment=" + this.m + ", scrollToBottomUiData=" + this.n + ", flags=" + this.o + ", includeScrim=true, onDismiss=" + this.t + ")";
    }
}
