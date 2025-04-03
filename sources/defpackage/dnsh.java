package defpackage;

import java.util.List;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnsh implements dnmw {
    public final boolean A;
    public final dnsg B;
    public final dnwi C;
    public final int D;
    private final dnuo E;
    public final String a;
    public final List b;
    public final List c;
    public final dnsj d;
    public final ffix e;
    public final dnor f;
    public final dnry g;
    public final boolean h;
    public final boolean i;
    public final dnve j;
    public final dnto k;
    public final dnto l;
    public final dnvr m;
    public final dmcg n;
    public final dofn o;
    public final boolean p;
    public final ffix q;
    public final ffix r;
    public final ffjm s;
    public final ffji t;
    public final String u;
    public final ffix v;
    public final boolean w;
    public final boolean x;
    public final eykv y;
    public final ffix z;

    public dnsh(String str, List list, List list2, dnsj dnsjVar, ffix ffixVar, dnor dnorVar, dnry dnryVar, boolean z, boolean z2, int i, dnve dnveVar, dnuo dnuoVar, dnto dntoVar, dnto dntoVar2, dnvr dnvrVar, dmcg dmcgVar, dofn dofnVar, boolean z3, ffix ffixVar2, ffix ffixVar3, ffjm ffjmVar, ffji ffjiVar, String str2, ffix ffixVar4, boolean z4, boolean z5, eykv eykvVar, ffix ffixVar5, boolean z6, dnsg dnsgVar, dnwi dnwiVar) {
        str.getClass();
        list.getClass();
        list2.getClass();
        ffixVar.getClass();
        dnorVar.getClass();
        dnryVar.getClass();
        if (i == 0) {
            throw null;
        }
        ffixVar2.getClass();
        ffixVar3.getClass();
        ffjmVar.getClass();
        dnsgVar.getClass();
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = dnsjVar;
        this.e = ffixVar;
        this.f = dnorVar;
        this.g = dnryVar;
        this.h = z;
        this.i = z2;
        this.D = i;
        this.j = dnveVar;
        this.E = dnuoVar;
        this.k = dntoVar;
        this.l = dntoVar2;
        this.m = dnvrVar;
        this.n = dmcgVar;
        this.o = dofnVar;
        this.p = z3;
        this.q = ffixVar2;
        this.r = ffixVar3;
        this.s = ffjmVar;
        this.t = ffjiVar;
        this.u = str2;
        this.v = ffixVar4;
        this.w = z4;
        this.x = z5;
        this.y = eykvVar;
        this.z = ffixVar5;
        this.A = z6;
        this.B = dnsgVar;
        this.C = dnwiVar;
    }

    @Override // defpackage.dnmw
    public final String b() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnsh)) {
            return false;
        }
        dnsh dnshVar = (dnsh) obj;
        return ffkj.e(this.a, dnshVar.a) && ffkj.e(this.b, dnshVar.b) && ffkj.e(this.c, dnshVar.c) && ffkj.e(this.d, dnshVar.d) && ffkj.e(this.e, dnshVar.e) && this.f == dnshVar.f && this.g == dnshVar.g && this.h == dnshVar.h && this.i == dnshVar.i && this.D == dnshVar.D && ffkj.e(this.j, dnshVar.j) && ffkj.e(this.E, dnshVar.E) && ffkj.e(this.k, dnshVar.k) && ffkj.e(this.l, dnshVar.l) && ffkj.e(this.m, dnshVar.m) && ffkj.e(this.n, dnshVar.n) && ffkj.e(this.o, dnshVar.o) && this.p == dnshVar.p && ffkj.e(this.q, dnshVar.q) && ffkj.e(this.r, dnshVar.r) && ffkj.e(this.s, dnshVar.s) && ffkj.e(this.t, dnshVar.t) && ffkj.e(this.u, dnshVar.u) && ffkj.e(this.v, dnshVar.v) && this.w == dnshVar.w && this.x == dnshVar.x && ffkj.e(this.y, dnshVar.y) && ffkj.e(this.z, dnshVar.z) && this.A == dnshVar.A && ffkj.e(this.B, dnshVar.B) && ffkj.e(this.C, dnshVar.C);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        dnsj dnsjVar = this.d;
        int hashCode2 = ((((((((((((((hashCode * 31) + (dnsjVar == null ? 0 : dnsjVar.hashCode())) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + dnrz.a(this.h)) * 31) + dnrz.a(this.i)) * 31) + this.D) * 31;
        dnve dnveVar = this.j;
        int hashCode3 = (hashCode2 + (dnveVar == null ? 0 : dnveVar.hashCode())) * 31;
        dnuo dnuoVar = this.E;
        int hashCode4 = (hashCode3 + (dnuoVar == null ? 0 : dnuoVar.hashCode())) * 31;
        dnto dntoVar = this.k;
        int hashCode5 = (hashCode4 + (dntoVar == null ? 0 : dntoVar.hashCode())) * 31;
        dnto dntoVar2 = this.l;
        int hashCode6 = (hashCode5 + (dntoVar2 == null ? 0 : dntoVar2.hashCode())) * 31;
        dnvr dnvrVar = this.m;
        int hashCode7 = (hashCode6 + (dnvrVar == null ? 0 : dnvrVar.hashCode())) * 31;
        dmcg dmcgVar = this.n;
        int hashCode8 = (hashCode7 + (dmcgVar == null ? 0 : dmcgVar.hashCode())) * 31;
        dofn dofnVar = this.o;
        int hashCode9 = (((((((((hashCode8 + (dofnVar == null ? 0 : dofnVar.hashCode())) * 31) + dnrz.a(this.p)) * 31) + this.q.hashCode()) * 31) + this.r.hashCode()) * 31) + this.s.hashCode()) * 31;
        ffji ffjiVar = this.t;
        int hashCode10 = (hashCode9 + (ffjiVar == null ? 0 : ffjiVar.hashCode())) * 31;
        String str = this.u;
        int hashCode11 = (hashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        ffix ffixVar = this.v;
        int hashCode12 = (((((hashCode11 + (ffixVar == null ? 0 : ffixVar.hashCode())) * 31) + dnrz.a(this.w)) * 31) + dnrz.a(this.x)) * 31;
        eykv eykvVar = this.y;
        int hashCode13 = (hashCode12 + (eykvVar == null ? 0 : eykvVar.hashCode())) * 31;
        ffix ffixVar2 = this.z;
        int hashCode14 = (((((hashCode13 + (ffixVar2 == null ? 0 : ffixVar2.hashCode())) * 31) + dnrz.a(this.A)) * 31) + this.B.hashCode()) * 31;
        dnwi dnwiVar = this.C;
        return hashCode14 + (dnwiVar != null ? dnwiVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageBubbleUiData(id=");
        sb.append(this.a);
        sb.append(", extraIcons=");
        sb.append(this.b);
        sb.append(", extraText=");
        sb.append(this.c);
        sb.append(", suggestionShortcutUiData=");
        sb.append(this.d);
        sb.append(", getTimestamp=");
        sb.append(this.e);
        sb.append(", horizontalAlignment=");
        sb.append(this.f);
        sb.append(", shape=");
        sb.append(this.g);
        sb.append(", animateShape=");
        sb.append(this.h);
        sb.append(", isExpandable=");
        sb.append(this.i);
        sb.append(", widthModifier=");
        int i = this.D;
        sb.append((Object) (i != 1 ? i != 2 ? "FILL_MAX_WIDTH" : "INTRINSIC_MIN" : "INTRINSIC_MAX"));
        sb.append(", reactionsBar=");
        sb.append(this.j);
        sb.append(", progressBar=");
        sb.append(this.E);
        sb.append(", topMetatext=");
        sb.append(this.k);
        sb.append(", bottomMetatext=");
        sb.append(this.l);
        sb.append(", separators=");
        sb.append(this.m);
        sb.append(", badges=");
        sb.append(this.n);
        sb.append(", replySnippet=");
        sb.append(this.o);
        sb.append(", isError=");
        sb.append(this.p);
        sb.append(", contentOnClick=");
        sb.append(this.q);
        sb.append(", onClick=");
        sb.append(this.r);
        sb.append(", onLongClick=");
        sb.append(this.s);
        sb.append(", onDoubleTap=");
        sb.append(this.t);
        sb.append(", doubleTapLabel=");
        dnwi dnwiVar = this.C;
        dnsg dnsgVar = this.B;
        boolean z = this.A;
        ffix ffixVar = this.z;
        eykv eykvVar = this.y;
        boolean z2 = this.x;
        boolean z3 = this.w;
        ffix ffixVar2 = this.v;
        sb.append(this.u);
        sb.append(", onSwiped=");
        sb.append(ffixVar2);
        sb.append(", allowFocusOnContentDecoratorsForAccessibility=");
        sb.append(z3);
        sb.append(", useGroupHorizontalPadding=");
        sb.append(z2);
        sb.append(", effect=");
        sb.append(eykvVar);
        sb.append(", onEffectFinished=");
        sb.append(ffixVar);
        sb.append(", shouldShowTimestampHint=");
        sb.append(z);
        sb.append(", flags=");
        sb.append(dnsgVar);
        sb.append(", statusUiData=");
        sb.append(dnwiVar);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ dnsh(String str, List list, dnor dnorVar, dnry dnryVar, dmcg dmcgVar, dnsg dnsgVar, int i) {
        this(str, (i & 2) != 0 ? ffel.a : list, (i & 4) != 0 ? ffel.a : null, null, (i & 16) != 0 ? new ffix() { // from class: dnsa
            @Override // defpackage.ffix
            public final Object invoke() {
                return "";
            }
        } : null, (i & 32) != 0 ? dnor.a : dnorVar, (i & 64) != 0 ? dnry.a : dnryVar, false, (i & 256) != 0, (i & 512) != 0 ? 1 : 0, null, null, null, null, null, (32768 & i) != 0 ? null : dmcgVar, null, false, (262144 & i) != 0 ? new ffix() { // from class: dnsb
            @Override // defpackage.ffix
            public final Object invoke() {
                return false;
            }
        } : null, (524288 & i) != 0 ? new ffix() { // from class: dnsc
            @Override // defpackage.ffix
            public final Object invoke() {
                return false;
            }
        } : null, (1048576 & i) != 0 ? new ffjm() { // from class: dnsd
            @Override // defpackage.ffjm
            public final Object a(Object obj, Object obj2) {
                ((Integer) obj).intValue();
                ((Integer) obj2).intValue();
                return false;
            }
        } : null, null, null, null, (16777216 & i) != 0, false, null, null, (268435456 & i) != 0, (i & 536870912) != 0 ? new dnsg(false, false, false, false, PrivateKeyType.INVALID) : dnsgVar, null);
    }
}
