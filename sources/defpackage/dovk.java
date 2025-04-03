package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dovk implements dnmt {
    public final Uri a;
    public final Uri b;
    public final ffix c;
    public final String d;
    public final dnal e;
    public final dovj f;
    public final String g;
    private final boolean h;
    private final boolean i;
    private final Integer j;
    private final Integer k;
    private final doml l;
    private final ffix m;
    private final ffix n;
    private final dnmm o;
    private final int p;

    public dovk(Uri uri, Uri uri2, ffix ffixVar, String str, dnal dnalVar, dovj dovjVar, String str2, boolean z, Integer num, Integer num2, int i, ffix ffixVar2, ffix ffixVar3, dnmm dnmmVar) {
        ffixVar.getClass();
        this.a = uri;
        this.b = uri2;
        this.h = false;
        this.c = ffixVar;
        this.d = str;
        this.e = dnalVar;
        this.f = dovjVar;
        this.g = str2;
        this.i = z;
        this.j = num;
        this.k = num2;
        this.l = null;
        this.p = i;
        this.m = ffixVar2;
        this.n = ffixVar3;
        this.o = dnmmVar;
    }

    @Override // defpackage.dnoq
    public final String a() {
        throw null;
    }

    @Override // defpackage.dnoq
    public final ffix b() {
        return this.m;
    }

    @Override // defpackage.dnoq
    public final ffix c() {
        throw null;
    }

    @Override // defpackage.dnoq
    public final boolean d() {
        return this.i;
    }

    @Override // defpackage.dnmt
    public final dnmm e() {
        return this.o;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dovk)) {
            return false;
        }
        dovk dovkVar = (dovk) obj;
        if (!ffkj.e(this.a, dovkVar.a) || !ffkj.e(this.b, dovkVar.b)) {
            return false;
        }
        boolean z = dovkVar.h;
        if (!ffkj.e(this.c, dovkVar.c) || !ffkj.e(this.d, dovkVar.d) || !ffkj.e(this.e, dovkVar.e) || !ffkj.e(this.f, dovkVar.f) || !ffkj.e(this.g, dovkVar.g) || this.i != dovkVar.i || !ffkj.e(this.j, dovkVar.j) || !ffkj.e(this.k, dovkVar.k)) {
            return false;
        }
        doml domlVar = dovkVar.l;
        return ffkj.e(null, null) && this.p == dovkVar.p && ffkj.e(this.m, dovkVar.m) && ffkj.e(this.n, dovkVar.n) && ffkj.e(this.o, dovkVar.o);
    }

    @Override // defpackage.dnmt
    public final /* bridge */ /* synthetic */ domw f() {
        return null;
    }

    @Override // defpackage.dnmt
    public final Integer g() {
        return this.k;
    }

    @Override // defpackage.dnmt
    public final Integer h() {
        return this.j;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        int hashCode2 = (((((hashCode + (uri == null ? 0 : uri.hashCode())) * 31) + dovi.a(false)) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        dnal dnalVar = this.e;
        int hashCode4 = (((hashCode3 + (dnalVar == null ? 0 : dnalVar.hashCode())) * 31) + this.f.hashCode()) * 31;
        String str2 = this.g;
        int hashCode5 = (((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + dovi.a(this.i)) * 31;
        Integer num = this.j;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.k;
        return ((((((((hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 961) + this.p) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + this.o.hashCode();
    }

    @Override // defpackage.dnmt
    public final int j() {
        return this.p;
    }

    public final String toString() {
        return "VideoBubbleUiData(uri=" + this.a + ", previewUri=" + this.b + ", isTransferring=false, onPlayButtonClick=" + this.c + ", formattedTimeString=" + this.d + ", requestListener=" + this.e + ", videoBubbleFlags=" + this.f + ", contentDescription=" + this.g + ", isHighlighted=" + this.i + ", width=" + this.j + ", height=" + this.k + ", caption=null, displayMode=" + ((Object) dnms.a(this.p)) + ", onClick=" + this.m + ", onLayout=" + this.n + ", flags=" + this.o + ")";
    }
}
