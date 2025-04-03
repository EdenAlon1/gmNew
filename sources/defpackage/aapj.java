package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aapj implements dnmt {
    public final Uri a;
    public final Uri b;
    public final long c;
    public final dnuo d;
    public final aapi e;
    public final String f;
    public final String g;
    public final dnal h;
    public final dnmm i;
    public final String j;
    public final boolean k;
    public final Integer l;
    public final Integer m;
    public final ffix n;
    public final ffix o;
    public final int p;
    private final boolean q;
    private final doml r;

    public aapj(Uri uri, Uri uri2, long j, dnuo dnuoVar, aapi aapiVar, String str, String str2, dnal dnalVar, dnmm dnmmVar, String str3, boolean z, Integer num, Integer num2, int i, ffix ffixVar, ffix ffixVar2) {
        aapiVar.getClass();
        this.a = uri;
        this.b = uri2;
        this.q = false;
        this.c = j;
        this.d = dnuoVar;
        this.e = aapiVar;
        this.f = str;
        this.g = str2;
        this.h = dnalVar;
        this.i = dnmmVar;
        this.j = str3;
        this.k = z;
        this.l = num;
        this.m = num2;
        this.r = null;
        this.p = i;
        this.n = ffixVar;
        this.o = ffixVar2;
    }

    public static /* synthetic */ aapj i(aapj aapjVar, dnuo dnuoVar, aapi aapiVar, String str, String str2, ffix ffixVar, ffix ffixVar2, int i) {
        Uri uri = (i & 1) != 0 ? aapjVar.a : null;
        Uri uri2 = (i & 2) != 0 ? aapjVar.b : null;
        long j = (i & 8) != 0 ? aapjVar.c : 0L;
        dnuo dnuoVar2 = (i & 16) != 0 ? aapjVar.d : dnuoVar;
        aapi aapiVar2 = (i & 32) != 0 ? aapjVar.e : aapiVar;
        String str3 = (i & 64) != 0 ? aapjVar.f : str;
        String str4 = (i & 128) != 0 ? aapjVar.g : str2;
        dnal dnalVar = (i & 256) != 0 ? aapjVar.h : null;
        dnmm dnmmVar = (i & 512) != 0 ? aapjVar.i : null;
        String str5 = (i & 1024) != 0 ? aapjVar.j : null;
        boolean z = (i & 2048) != 0 ? aapjVar.k : false;
        Integer num = (i & 4096) != 0 ? aapjVar.l : null;
        Integer num2 = (i & 8192) != 0 ? aapjVar.m : null;
        int i2 = (32768 & i) != 0 ? aapjVar.p : 0;
        ffix ffixVar3 = (65536 & i) != 0 ? aapjVar.n : ffixVar;
        ffix ffixVar4 = (i & 131072) != 0 ? aapjVar.o : ffixVar2;
        uri.getClass();
        aapiVar2.getClass();
        str3.getClass();
        str4.getClass();
        dnmmVar.getClass();
        if (i2 == 0) {
            throw null;
        }
        ffixVar3.getClass();
        ffixVar4.getClass();
        return new aapj(uri, uri2, j, dnuoVar2, aapiVar2, str3, str4, dnalVar, dnmmVar, str5, z, num, num2, i2, ffixVar3, ffixVar4);
    }

    @Override // defpackage.dnoq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dnoq
    public final ffix b() {
        return this.n;
    }

    @Override // defpackage.dnoq
    public final ffix c() {
        throw null;
    }

    @Override // defpackage.dnoq
    public final boolean d() {
        return this.k;
    }

    @Override // defpackage.dnmt
    public final dnmm e() {
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aapj)) {
            return false;
        }
        aapj aapjVar = (aapj) obj;
        if (!ffkj.e(this.a, aapjVar.a) || !ffkj.e(this.b, aapjVar.b)) {
            return false;
        }
        boolean z = aapjVar.q;
        if (this.c != aapjVar.c || !ffkj.e(this.d, aapjVar.d) || this.e != aapjVar.e || !ffkj.e(this.f, aapjVar.f) || !ffkj.e(this.g, aapjVar.g) || !ffkj.e(this.h, aapjVar.h) || !ffkj.e(this.i, aapjVar.i) || !ffkj.e(this.j, aapjVar.j) || this.k != aapjVar.k || !ffkj.e(this.l, aapjVar.l) || !ffkj.e(this.m, aapjVar.m)) {
            return false;
        }
        doml domlVar = aapjVar.r;
        return ffkj.e(null, null) && this.p == aapjVar.p && ffkj.e(this.n, aapjVar.n) && ffkj.e(this.o, aapjVar.o);
    }

    @Override // defpackage.dnmt
    public final /* bridge */ /* synthetic */ domw f() {
        return null;
    }

    @Override // defpackage.dnmt
    public final Integer g() {
        return this.m;
    }

    @Override // defpackage.dnmt
    public final Integer h() {
        return this.l;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int hashCode2 = (((hashCode + (uri == null ? 0 : uri.hashCode())) * 31) + aaph.a(false)) * 31;
        long j = this.c;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        dnuo dnuoVar = this.d;
        int hashCode3 = (((((((i + (dnuoVar == null ? 0 : dnuoVar.hashCode())) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        dnal dnalVar = this.h;
        int hashCode4 = (((hashCode3 + (dnalVar == null ? 0 : dnalVar.hashCode())) * 31) + this.i.hashCode()) * 31;
        String str = this.j;
        int hashCode5 = (((hashCode4 + (str == null ? 0 : str.hashCode())) * 31) + aaph.a(this.k)) * 31;
        Integer num = this.l;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.m;
        return ((((((hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 961) + this.p) * 31) + this.n.hashCode()) * 31) + this.o.hashCode();
    }

    @Override // defpackage.dnmt
    public final int j() {
        return this.p;
    }

    public final String toString() {
        return "VideoBubbleUiData(uri=" + this.a + ", previewUri=" + this.b + ", isTransferring=false, durationMillis=" + this.c + ", progressBarOverlayUiData=" + this.d + ", state=" + this.e + ", attachmentBubbleTitle=" + this.f + ", attachmentBubbleSubtitle=" + this.g + ", requestListener=" + this.h + ", flags=" + this.i + ", contentDescription=" + this.j + ", isHighlighted=" + this.k + ", width=" + this.l + ", height=" + this.m + ", caption=null, displayMode=" + ((Object) dnms.a(this.p)) + ", onClick=" + this.n + ", onLayout=" + this.o + ")";
    }
}
