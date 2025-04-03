package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnbw implements dnbm {
    public final Uri a;
    public final Uri b;
    public final Uri c;
    public final dnal d;
    public final dnuo e;
    public final dnbl f;
    public final String g;
    public final String h;
    public final boolean i;
    public final dnmm j;
    public final String k;
    public final boolean l;
    public final Integer m;
    public final Integer n;
    public final domw o;
    public final ffix p;
    public final ffix q;
    public final int r;

    public dnbw(Uri uri, Uri uri2, Uri uri3, dnal dnalVar, dnuo dnuoVar, dnbl dnblVar, String str, String str2, boolean z, dnmm dnmmVar, String str3, boolean z2, Integer num, Integer num2, domw domwVar, int i, ffix ffixVar, ffix ffixVar2) {
        dnblVar.getClass();
        this.a = uri;
        this.b = uri2;
        this.c = uri3;
        this.d = dnalVar;
        this.e = dnuoVar;
        this.f = dnblVar;
        this.g = str;
        this.h = str2;
        this.i = z;
        this.j = dnmmVar;
        this.k = str3;
        this.l = z2;
        this.m = num;
        this.n = num2;
        this.o = domwVar;
        this.r = i;
        this.p = ffixVar;
        this.q = ffixVar2;
    }

    public static /* synthetic */ dnbw r(dnbw dnbwVar, dnuo dnuoVar, dnbl dnblVar, String str, String str2, boolean z, domw domwVar, ffix ffixVar, ffix ffixVar2, int i) {
        Uri uri = (i & 1) != 0 ? dnbwVar.a : null;
        Uri uri2 = (i & 2) != 0 ? dnbwVar.b : null;
        Uri uri3 = (i & 4) != 0 ? dnbwVar.c : null;
        dnal dnalVar = (i & 8) != 0 ? dnbwVar.d : null;
        dnuo dnuoVar2 = (i & 16) != 0 ? dnbwVar.e : dnuoVar;
        dnbl dnblVar2 = (i & 32) != 0 ? dnbwVar.f : dnblVar;
        String str3 = (i & 64) != 0 ? dnbwVar.g : str;
        String str4 = (i & 128) != 0 ? dnbwVar.h : str2;
        boolean z2 = (i & 256) != 0 ? dnbwVar.i : z;
        dnmm dnmmVar = (i & 512) != 0 ? dnbwVar.j : null;
        String str5 = (i & 1024) != 0 ? dnbwVar.k : null;
        boolean z3 = (i & 2048) != 0 ? dnbwVar.l : false;
        Integer num = (i & 4096) != 0 ? dnbwVar.m : null;
        Integer num2 = (i & 8192) != 0 ? dnbwVar.n : null;
        domw domwVar2 = (i & 16384) != 0 ? dnbwVar.o : domwVar;
        int i2 = (32768 & i) != 0 ? dnbwVar.r : 0;
        ffix ffixVar3 = (65536 & i) != 0 ? dnbwVar.p : ffixVar;
        ffix ffixVar4 = (i & 131072) != 0 ? dnbwVar.q : ffixVar2;
        dnblVar2.getClass();
        str3.getClass();
        str4.getClass();
        dnmmVar.getClass();
        if (i2 == 0) {
            throw null;
        }
        ffixVar3.getClass();
        ffixVar4.getClass();
        return new dnbw(uri, uri2, uri3, dnalVar, dnuoVar2, dnblVar2, str3, str4, z2, dnmmVar, str5, z3, num, num2, domwVar2, i2, ffixVar3, ffixVar4);
    }

    @Override // defpackage.dnoq
    public final String a() {
        return this.k;
    }

    @Override // defpackage.dnoq
    public final ffix b() {
        return this.p;
    }

    @Override // defpackage.dnoq
    public final ffix c() {
        return this.q;
    }

    @Override // defpackage.dnoq
    public final boolean d() {
        return this.l;
    }

    @Override // defpackage.dnmt
    public final dnmm e() {
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnbw)) {
            return false;
        }
        dnbw dnbwVar = (dnbw) obj;
        return ffkj.e(this.a, dnbwVar.a) && ffkj.e(this.b, dnbwVar.b) && ffkj.e(this.c, dnbwVar.c) && ffkj.e(this.d, dnbwVar.d) && ffkj.e(this.e, dnbwVar.e) && this.f == dnbwVar.f && ffkj.e(this.g, dnbwVar.g) && ffkj.e(this.h, dnbwVar.h) && this.i == dnbwVar.i && ffkj.e(this.j, dnbwVar.j) && ffkj.e(this.k, dnbwVar.k) && this.l == dnbwVar.l && ffkj.e(this.m, dnbwVar.m) && ffkj.e(this.n, dnbwVar.n) && ffkj.e(this.o, dnbwVar.o) && this.r == dnbwVar.r && ffkj.e(this.p, dnbwVar.p) && ffkj.e(this.q, dnbwVar.q);
    }

    @Override // defpackage.dnmt
    public final domw f() {
        return this.o;
    }

    @Override // defpackage.dnmt
    public final Integer g() {
        return this.n;
    }

    @Override // defpackage.dnmt
    public final Integer h() {
        return this.m;
    }

    public final int hashCode() {
        Uri uri = this.a;
        int hashCode = uri == null ? 0 : uri.hashCode();
        Uri uri2 = this.b;
        int hashCode2 = uri2 == null ? 0 : uri2.hashCode();
        int i = hashCode * 31;
        Uri uri3 = this.c;
        int hashCode3 = (((i + hashCode2) * 31) + (uri3 == null ? 0 : uri3.hashCode())) * 31;
        dnal dnalVar = this.d;
        int hashCode4 = (hashCode3 + (dnalVar == null ? 0 : dnalVar.hashCode())) * 31;
        dnuo dnuoVar = this.e;
        int hashCode5 = (((((((((((hashCode4 + (dnuoVar == null ? 0 : dnuoVar.hashCode())) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + dnbv.a(this.i)) * 31) + this.j.hashCode()) * 31;
        String str = this.k;
        int hashCode6 = (((hashCode5 + (str == null ? 0 : str.hashCode())) * 31) + dnbv.a(this.l)) * 31;
        Integer num = this.m;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.n;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        domw domwVar = this.o;
        return ((((((hashCode8 + (domwVar != null ? domwVar.hashCode() : 0)) * 31) + this.r) * 31) + this.p.hashCode()) * 31) + this.q.hashCode();
    }

    @Override // defpackage.dnbm
    public final Uri i() {
        return this.c;
    }

    @Override // defpackage.dnmt
    public final int j() {
        return this.r;
    }

    @Override // defpackage.dnbm
    public final Uri k() {
        return this.b;
    }

    @Override // defpackage.dnbm
    public final Uri l() {
        return this.a;
    }

    @Override // defpackage.dnbm
    public final dnbl m() {
        return this.f;
    }

    @Override // defpackage.dnbm
    public final dnuo n() {
        return this.e;
    }

    @Override // defpackage.dnbm
    public final String o() {
        return this.h;
    }

    @Override // defpackage.dnbm
    public final String p() {
        return this.g;
    }

    @Override // defpackage.dnbm
    public final boolean q() {
        return this.i;
    }

    public final String toString() {
        return "ImageBubbleUiData(uri=" + this.a + ", previewUri=" + this.b + ", fallbackUri=" + this.c + ", requestListener=" + this.d + ", progressBarOverlayUiData=" + this.e + ", state=" + this.f + ", attachmentBubbleTitle=" + this.g + ", attachmentBubbleSubtitle=" + this.h + ", needBlur=" + this.i + ", flags=" + this.j + ", contentDescription=" + this.k + ", isHighlighted=" + this.l + ", width=" + this.m + ", height=" + this.n + ", caption=" + this.o + ", displayMode=" + ((Object) dnms.a(this.r)) + ", onClick=" + this.p + ", onLayout=" + this.q + ")";
    }
}
