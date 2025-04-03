package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmxv implements domw {
    public final List a;
    public final ffix b;
    public final eykv c;
    public final String d;
    public final boolean e;
    public final ffix f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final dofn j;
    public final dnwi k;
    public final boolean l;
    public final domv m;
    private final boolean n;
    private final ffix o;
    private final boolean p;
    private final boolean q;
    private final boolean r;
    private final boolean s = false;

    public dmxv(List list, ffix ffixVar, eykv eykvVar, String str, boolean z, boolean z2, ffix ffixVar2, ffix ffixVar3, String str2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, dofn dofnVar, dnwi dnwiVar, boolean z8, domv domvVar) {
        this.a = list;
        this.b = ffixVar;
        this.c = eykvVar;
        this.d = str;
        this.n = z;
        this.e = z2;
        this.o = ffixVar2;
        this.f = ffixVar3;
        this.g = str2;
        this.p = z3;
        this.q = z4;
        this.r = z5;
        this.h = z6;
        this.i = z7;
        this.j = dofnVar;
        this.k = dnwiVar;
        this.l = z8;
        this.m = domvVar;
    }

    public static /* synthetic */ dmxv l(dmxv dmxvVar, eykv eykvVar, boolean z, boolean z2, int i) {
        List list = (i & 1) != 0 ? dmxvVar.a : null;
        ffix ffixVar = (i & 2) != 0 ? dmxvVar.b : null;
        eykv eykvVar2 = (i & 4) != 0 ? dmxvVar.c : eykvVar;
        String str = (i & 8) != 0 ? dmxvVar.d : null;
        boolean z3 = (i & 16) != 0 ? dmxvVar.n : false;
        boolean z4 = (i & 32) != 0 ? dmxvVar.e : false;
        ffix ffixVar2 = (i & 64) != 0 ? dmxvVar.o : null;
        ffix ffixVar3 = (i & 128) != 0 ? dmxvVar.f : null;
        String str2 = (i & 256) != 0 ? dmxvVar.g : null;
        boolean z5 = (i & 512) != 0 ? dmxvVar.p : false;
        boolean z6 = (i & 1024) != 0 ? dmxvVar.q : false;
        boolean z7 = (i & 2048) != 0 ? dmxvVar.r : false;
        boolean z8 = (i & 4096) != 0 ? dmxvVar.h : false;
        boolean z9 = (i & 8192) != 0 ? dmxvVar.i : z;
        dofn dofnVar = (i & 16384) != 0 ? dmxvVar.j : null;
        dnwi dnwiVar = (32768 & i) != 0 ? dmxvVar.k : null;
        if ((65536 & i) != 0) {
            boolean z10 = dmxvVar.s;
        }
        boolean z11 = (i & 131072) != 0 ? dmxvVar.l : z2;
        domv domvVar = dmxvVar.m;
        ffixVar.getClass();
        str.getClass();
        ffixVar2.getClass();
        ffixVar3.getClass();
        return new dmxv(list, ffixVar, eykvVar2, str, z3, z4, ffixVar2, ffixVar3, str2, z5, z6, z7, z8, z9, dofnVar, dnwiVar, z11, domvVar);
    }

    @Override // defpackage.domw, defpackage.dnoq
    public final String a() {
        return this.g;
    }

    @Override // defpackage.dnoq
    public final ffix b() {
        return this.o;
    }

    @Override // defpackage.dnoq
    public final ffix c() {
        throw null;
    }

    @Override // defpackage.domw, defpackage.dnoq
    public final boolean d() {
        return this.e;
    }

    @Override // defpackage.domw
    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmxv)) {
            return false;
        }
        dmxv dmxvVar = (dmxv) obj;
        if (!ffkj.e(this.a, dmxvVar.a) || !ffkj.e(this.b, dmxvVar.b) || !ffkj.e(this.c, dmxvVar.c) || !ffkj.e(this.d, dmxvVar.d) || this.n != dmxvVar.n || this.e != dmxvVar.e || !ffkj.e(this.o, dmxvVar.o) || !ffkj.e(this.f, dmxvVar.f) || !ffkj.e(this.g, dmxvVar.g) || this.p != dmxvVar.p || this.q != dmxvVar.q || this.r != dmxvVar.r || this.h != dmxvVar.h || this.i != dmxvVar.i || !ffkj.e(this.j, dmxvVar.j) || !ffkj.e(this.k, dmxvVar.k)) {
            return false;
        }
        boolean z = dmxvVar.s;
        return this.l == dmxvVar.l && ffkj.e(this.m, dmxvVar.m);
    }

    @Override // defpackage.domw
    public final boolean g() {
        return this.r;
    }

    @Override // defpackage.domw
    public final boolean h() {
        return this.q;
    }

    public final int hashCode() {
        List list = this.a;
        int hashCode = ((list == null ? 0 : list.hashCode()) * 31) + this.b.hashCode();
        eykv eykvVar = this.c;
        int hashCode2 = ((((((((((((hashCode * 31) + (eykvVar == null ? 0 : eykvVar.hashCode())) * 31) + this.d.hashCode()) * 31) + dmxs.a(this.n)) * 31) + dmxs.a(this.e)) * 31) + this.o.hashCode()) * 31) + this.f.hashCode()) * 31;
        String str = this.g;
        int hashCode3 = (((((((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + dmxs.a(this.p)) * 31) + dmxs.a(this.q)) * 31) + dmxs.a(this.r)) * 31) + dmxs.a(this.h)) * 31) + dmxs.a(this.i)) * 31;
        dofn dofnVar = this.j;
        int hashCode4 = (hashCode3 + (dofnVar == null ? 0 : dofnVar.hashCode())) * 31;
        dnwi dnwiVar = this.k;
        return ((((((hashCode4 + (dnwiVar == null ? 0 : dnwiVar.hashCode())) * 31) + dmxs.a(false)) * 31) + dmxs.a(this.l)) * 31) + this.m.hashCode();
    }

    @Override // defpackage.domw
    public final boolean i() {
        return this.h;
    }

    @Override // defpackage.domw
    public final boolean j() {
        return this.n;
    }

    @Override // defpackage.domw
    public final boolean k() {
        return false;
    }

    @Override // defpackage.domw
    public final boolean s() {
        return this.p;
    }

    public final String toString() {
        return "EmojiBubbleUiData(emojiAnimationFiles=" + this.a + ", onAnimatedEmojiShown=" + this.b + ", effect=" + this.c + ", text=" + this.d + ", isRichType=" + this.n + ", isHighlighted=" + this.e + ", onClick=" + this.o + ", onLayout=" + this.f + ", contentDescription=" + this.g + ", useLargeFontSize=" + this.p + ", isOutgoing=" + this.q + ", isEmojiOnly=" + this.r + ", isReply=" + this.h + ", isCaption=" + this.i + ", messageReplySnippetUiData=" + this.j + ", statusUiData=" + this.k + ", isSensitiveContent=false, shouldDisplayBackground=" + this.l + ", flags=" + this.m + ")";
    }
}
