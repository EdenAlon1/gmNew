package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doml implements dlut, domw {
    public final String a;
    public final List b;
    public final doms c;
    public final String d;
    public final boolean e;
    public final ffix f;
    public final boolean g;
    public final List h;
    public final domv i;
    public final ffix j;
    public final boolean k;
    public final eykv l;
    public final boolean m;
    public final dofn n;
    public final dnwi o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final ffix v;

    public doml(String str, List list, doms domsVar, boolean z, boolean z2, String str2, boolean z3, boolean z4, ffix ffixVar, ffix ffixVar2, boolean z5, List list2, domv domvVar, ffix ffixVar3, boolean z6, eykv eykvVar, boolean z7, dofn dofnVar, dnwi dnwiVar, boolean z8, boolean z9, boolean z10) {
        str.getClass();
        list.getClass();
        ffixVar.getClass();
        ffixVar2.getClass();
        domvVar.getClass();
        ffixVar3.getClass();
        this.a = str;
        this.b = list;
        this.c = domsVar;
        this.s = z;
        this.t = z2;
        this.d = str2;
        this.e = z3;
        this.u = z4;
        this.v = ffixVar;
        this.f = ffixVar2;
        this.g = z5;
        this.h = list2;
        this.i = domvVar;
        this.j = ffixVar3;
        this.k = z6;
        this.l = eykvVar;
        this.m = z7;
        this.n = dofnVar;
        this.o = dnwiVar;
        this.p = z8;
        this.q = z9;
        this.r = z10;
    }

    public static /* synthetic */ doml l(doml domlVar, String str, List list, doms domsVar, ffix ffixVar, eykv eykvVar, boolean z, boolean z2, int i) {
        String str2 = (i & 1) != 0 ? domlVar.a : str;
        List list2 = (i & 2) != 0 ? domlVar.b : list;
        doms domsVar2 = (i & 4) != 0 ? domlVar.c : domsVar;
        boolean z3 = (i & 8) != 0 ? domlVar.s : false;
        boolean z4 = (i & 16) != 0 ? domlVar.t : false;
        String str3 = (i & 32) != 0 ? domlVar.d : null;
        boolean z5 = (i & 64) != 0 ? domlVar.e : false;
        boolean z6 = (i & 128) != 0 ? domlVar.u : false;
        ffix ffixVar2 = (i & 256) != 0 ? domlVar.v : null;
        ffix ffixVar3 = (i & 512) != 0 ? domlVar.f : ffixVar;
        boolean z7 = (i & 1024) != 0 ? domlVar.g : false;
        List list3 = (i & 2048) != 0 ? domlVar.h : null;
        domv domvVar = (i & 4096) != 0 ? domlVar.i : null;
        ffix ffixVar4 = (i & 8192) != 0 ? domlVar.j : null;
        boolean z8 = (i & 16384) != 0 ? domlVar.k : false;
        eykv eykvVar2 = (32768 & i) != 0 ? domlVar.l : eykvVar;
        boolean z9 = (65536 & i) != 0 ? domlVar.m : z;
        dofn dofnVar = (131072 & i) != 0 ? domlVar.n : null;
        dnwi dnwiVar = (262144 & i) != 0 ? domlVar.o : null;
        boolean z10 = (524288 & i) != 0 ? domlVar.p : false;
        boolean z11 = (i & 1048576) != 0 ? domlVar.q : z2;
        boolean z12 = domlVar.r;
        str2.getClass();
        list2.getClass();
        ffixVar2.getClass();
        ffixVar3.getClass();
        domvVar.getClass();
        ffixVar4.getClass();
        return new doml(str2, list2, domsVar2, z3, z4, str3, z5, z6, ffixVar2, ffixVar3, z7, list3, domvVar, ffixVar4, z8, eykvVar2, z9, dofnVar, dnwiVar, z10, z11, z12);
    }

    @Override // defpackage.dlut
    public final String a() {
        return this.d;
    }

    @Override // defpackage.dnoq
    public final ffix b() {
        return this.v;
    }

    @Override // defpackage.dnoq
    public final ffix c() {
        throw null;
    }

    @Override // defpackage.domw, defpackage.dnoq
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.dlut
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doml)) {
            return false;
        }
        doml domlVar = (doml) obj;
        return ffkj.e(this.a, domlVar.a) && ffkj.e(this.b, domlVar.b) && ffkj.e(this.c, domlVar.c) && this.s == domlVar.s && this.t == domlVar.t && ffkj.e(this.d, domlVar.d) && this.e == domlVar.e && this.u == domlVar.u && ffkj.e(this.v, domlVar.v) && ffkj.e(this.f, domlVar.f) && this.g == domlVar.g && ffkj.e(this.h, domlVar.h) && ffkj.e(this.i, domlVar.i) && ffkj.e(this.j, domlVar.j) && this.k == domlVar.k && ffkj.e(this.l, domlVar.l) && this.m == domlVar.m && ffkj.e(this.n, domlVar.n) && ffkj.e(this.o, domlVar.o) && this.p == domlVar.p && this.q == domlVar.q && this.r == domlVar.r;
    }

    @Override // defpackage.dlut
    public final List f() {
        return this.b;
    }

    @Override // defpackage.domw
    public final boolean g() {
        return this.g;
    }

    @Override // defpackage.domw
    public final boolean h() {
        return this.u;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        doms domsVar = this.c;
        int hashCode2 = ((((((hashCode * 31) + (domsVar == null ? 0 : domsVar.hashCode())) * 31) + domh.a(this.s)) * 31) + domh.a(this.t)) * 31;
        String str = this.d;
        int hashCode3 = (((((((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + domh.a(this.e)) * 31) + domh.a(this.u)) * 31) + this.v.hashCode()) * 31) + this.f.hashCode()) * 31) + domh.a(this.g)) * 31;
        List list = this.h;
        int hashCode4 = (((((((hashCode3 + (list == null ? 0 : list.hashCode())) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + domh.a(this.k)) * 31;
        eykv eykvVar = this.l;
        int hashCode5 = (((hashCode4 + (eykvVar == null ? 0 : eykvVar.hashCode())) * 31) + domh.a(this.m)) * 31;
        dofn dofnVar = this.n;
        int hashCode6 = (hashCode5 + (dofnVar == null ? 0 : dofnVar.hashCode())) * 31;
        dnwi dnwiVar = this.o;
        return ((((((hashCode6 + (dnwiVar != null ? dnwiVar.hashCode() : 0)) * 31) + domh.a(this.p)) * 31) + domh.a(this.q)) * 31) + domh.a(this.r);
    }

    @Override // defpackage.domw
    public final boolean i() {
        return this.k;
    }

    @Override // defpackage.domw
    public final boolean j() {
        return this.s;
    }

    @Override // defpackage.domw
    public final boolean k() {
        return this.p;
    }

    @Override // defpackage.domw
    public final boolean s() {
        return this.t;
    }

    public final String toString() {
        return "TextBubbleUiData(text=" + this.a + ", annotations=" + this.b + ", preview=" + this.c + ", isRichType=" + this.s + ", useLargeFontSize=" + this.t + ", contentDescription=" + this.d + ", isHighlighted=" + this.e + ", isOutgoing=" + this.u + ", onClick=" + this.v + ", onLayout=" + this.f + ", isEmojiOnly=" + this.g + ", emojiAnimationFiles=" + this.h + ", flags=" + this.i + ", onAnimatedEmojiShown=" + this.j + ", isReply=" + this.k + ", effect=" + this.l + ", isCaption=" + this.m + ", messageReplySnippetUiData=" + this.n + ", statusUiData=" + this.o + ", isSensitiveContent=" + this.p + ", shouldDisplayBackground=" + this.q + ", hasSuggestionShortcut=" + this.r + ")";
    }

    public /* synthetic */ doml(String str, List list, boolean z, boolean z2, String str2, boolean z3, boolean z4, ffix ffixVar, boolean z5, List list2, domv domvVar, ffix ffixVar2, boolean z6, boolean z7, dofn dofnVar, dnwi dnwiVar, boolean z8, boolean z9, boolean z10, int i) {
        this(str, (i & 2) != 0 ? ffel.a : list, null, ((i & 8) == 0) & z, ((i & 16) == 0) & z2, str2, ((i & 64) == 0) & z3, ((i & 128) == 0) & z4, (i & 256) != 0 ? new ffix() { // from class: domi
            @Override // defpackage.ffix
            public final Object invoke() {
                return false;
            }
        } : null, (i & 512) != 0 ? new ffix() { // from class: domj
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar, ((i & 1024) == 0) & z5, (i & 2048) != 0 ? null : list2, (i & 4096) != 0 ? new domv(false, false, false, 127) : domvVar, (i & 8192) != 0 ? new ffix() { // from class: domk
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar2, ((i & 16384) == 0) & z6, null, ((65536 & i) == 0) & z7, (131072 & i) != 0 ? null : dofnVar, (262144 & i) != 0 ? null : dnwiVar, ((524288 & i) == 0) & z8, (!((1048576 & i) == 0)) | z9, ((i & 2097152) == 0) & z10);
    }
}
