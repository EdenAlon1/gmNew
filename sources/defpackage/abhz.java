package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhz implements dmfn {
    public final String a;
    public final String b;
    public final List c;
    public final fgdj d;
    public final List e;
    public final Integer f;
    public final dnem g;
    public final Integer h;
    public final dnmk i;
    public final doas j;
    public final boolean k;
    public final ffix l;
    private final doas m;
    private final boolean n;

    public abhz(String str, String str2, List list, fgdj fgdjVar, List list2, Integer num, dnem dnemVar, Integer num2, dnmk dnmkVar, doas doasVar, boolean z, boolean z2, ffix ffixVar) {
        dnemVar.getClass();
        dnmkVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = fgdjVar;
        this.e = list2;
        this.f = num;
        this.g = dnemVar;
        this.h = num2;
        this.i = dnmkVar;
        this.j = doasVar;
        this.m = null;
        this.k = z;
        this.n = z2;
        this.l = ffixVar;
    }

    public static /* synthetic */ abhz d(abhz abhzVar, String str, String str2, List list, fgdj fgdjVar, List list2, Integer num, dnem dnemVar, Integer num2, dnmk dnmkVar, doas doasVar, boolean z, boolean z2, ffix ffixVar, int i) {
        if ((i & 1) != 0) {
            str = abhzVar.a;
        }
        String str3 = str;
        String str4 = (i & 2) != 0 ? abhzVar.b : str2;
        List list3 = (i & 4) != 0 ? abhzVar.c : list;
        fgdj fgdjVar2 = (i & 8) != 0 ? abhzVar.d : fgdjVar;
        List list4 = (i & 16) != 0 ? abhzVar.e : list2;
        Integer num3 = (i & 32) != 0 ? abhzVar.f : num;
        dnem dnemVar2 = (i & 64) != 0 ? abhzVar.g : dnemVar;
        Integer num4 = (i & 128) != 0 ? abhzVar.h : num2;
        dnmk dnmkVar2 = (i & 256) != 0 ? abhzVar.i : dnmkVar;
        doas doasVar2 = (i & 512) != 0 ? abhzVar.j : doasVar;
        if ((i & 1024) != 0) {
            doas doasVar3 = abhzVar.m;
        }
        boolean z3 = (i & 2048) != 0 ? abhzVar.k : z;
        boolean z4 = (i & 4096) != 0 ? abhzVar.n : z2;
        ffix ffixVar2 = (i & 8192) != 0 ? abhzVar.l : ffixVar;
        str3.getClass();
        list3.getClass();
        fgdjVar2.getClass();
        list4.getClass();
        dnemVar2.getClass();
        dnmkVar2.getClass();
        ffixVar2.getClass();
        return new abhz(str3, str4, list3, fgdjVar2, list4, num3, dnemVar2, num4, dnmkVar2, doasVar2, z3, z4, ffixVar2);
    }

    @Override // defpackage.dmfn
    public final dmfn a(ffix ffixVar) {
        return d(this, this.a, this.b, this.c, this.d, this.e, this.f, this.g, null, this.i, this.j, this.k, this.n, ffixVar, 128);
    }

    @Override // defpackage.dmfn
    public final ffix b() {
        return this.l;
    }

    @Override // defpackage.dmfn
    public final boolean c() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abhz)) {
            return false;
        }
        abhz abhzVar = (abhz) obj;
        if (!ffkj.e(this.a, abhzVar.a) || !ffkj.e(this.b, abhzVar.b) || !ffkj.e(this.c, abhzVar.c) || !ffkj.e(this.d, abhzVar.d) || !ffkj.e(this.e, abhzVar.e) || !ffkj.e(this.f, abhzVar.f) || !ffkj.e(this.g, abhzVar.g) || !ffkj.e(this.h, abhzVar.h) || !ffkj.e(this.i, abhzVar.i) || !ffkj.e(this.j, abhzVar.j)) {
            return false;
        }
        doas doasVar = abhzVar.m;
        return ffkj.e(null, null) && this.k == abhzVar.k && this.n == abhzVar.n && ffkj.e(this.l, abhzVar.l);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        Integer num = this.f;
        int hashCode3 = (((hashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.g.hashCode()) * 31;
        Integer num2 = this.h;
        int hashCode4 = (((hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31) + this.i.hashCode()) * 31;
        doas doasVar = this.j;
        return ((((((hashCode4 + (doasVar != null ? doasVar.hashCode() : 0)) * 961) + abhx.a(this.k)) * 31) + abhx.a(this.n)) * 31) + this.l.hashCode();
    }

    public final String toString() {
        return "ChatbotUnsubscribeBottomSheetUiData(title=" + this.a + ", body=" + this.b + ", bodyAnnotations=" + this.c + ", selectedReasonIndexFlow=" + this.d + ", listItems=" + this.e + ", spamReasonIndex=" + this.f + ", spamCheckbox=" + this.g + ", otherReasonIndex=" + this.h + ", otherReasonTextInput=" + this.i + ", confirmButton=" + this.j + ", denyButton=null, showCloseButton=" + this.k + ", includeScrim=" + this.n + ", onDismiss=" + this.l + ")";
    }
}
