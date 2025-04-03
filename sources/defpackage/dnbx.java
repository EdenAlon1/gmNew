package defpackage;

import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnbx implements dnbm {
    public final dnbw a;
    public final boolean b;
    public final ffix c;
    public final String d;
    public final ffix e;

    public /* synthetic */ dnbx(dnbw dnbwVar, boolean z, ffix ffixVar, String str, ffix ffixVar2, int i) {
        this.a = dnbwVar;
        this.b = ((i & 2) == 0) & z;
        this.c = (i & 4) != 0 ? null : ffixVar;
        this.d = (i & 8) != 0 ? null : str;
        this.e = (i & 16) != 0 ? null : ffixVar2;
    }

    @Override // defpackage.dnoq
    public final String a() {
        return this.a.k;
    }

    @Override // defpackage.dnoq
    public final ffix b() {
        return this.a.p;
    }

    @Override // defpackage.dnoq
    public final ffix c() {
        return this.a.q;
    }

    @Override // defpackage.dnoq
    public final boolean d() {
        return this.a.l;
    }

    @Override // defpackage.dnmt
    public final dnmm e() {
        return this.a.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnbx)) {
            return false;
        }
        dnbx dnbxVar = (dnbx) obj;
        return ffkj.e(this.a, dnbxVar.a) && this.b == dnbxVar.b && ffkj.e(this.c, dnbxVar.c) && ffkj.e(this.d, dnbxVar.d) && ffkj.e(this.e, dnbxVar.e);
    }

    @Override // defpackage.dnmt
    public final domw f() {
        return this.a.o;
    }

    @Override // defpackage.dnmt
    public final Integer g() {
        return this.a.n;
    }

    @Override // defpackage.dnmt
    public final Integer h() {
        return this.a.m;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ffix ffixVar = this.c;
        int hashCode2 = (((hashCode + (true != this.b ? 1237 : 1231)) * 31) + (ffixVar == null ? 0 : ffixVar.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ffix ffixVar2 = this.e;
        return hashCode3 + (ffixVar2 != null ? ffixVar2.hashCode() : 0);
    }

    @Override // defpackage.dnbm
    public final Uri i() {
        return this.a.c;
    }

    @Override // defpackage.dnmt
    public final int j() {
        return this.a.r;
    }

    @Override // defpackage.dnbm
    public final Uri k() {
        return this.a.b;
    }

    @Override // defpackage.dnbm
    public final Uri l() {
        return this.a.a;
    }

    @Override // defpackage.dnbm
    public final dnbl m() {
        return this.a.f;
    }

    @Override // defpackage.dnbm
    public final dnuo n() {
        return this.a.e;
    }

    @Override // defpackage.dnbm
    public final String o() {
        return this.a.h;
    }

    @Override // defpackage.dnbm
    public final String p() {
        return this.a.g;
    }

    @Override // defpackage.dnbm
    public final boolean q() {
        return this.a.i;
    }

    public final String toString() {
        return "MaskedImageBubbleUiData(imageBubbleUiData=" + this.a + ", showLoadingIndicator=" + this.b + ", onClickToggle=" + this.c + ", contentMaskText=" + this.d + ", onClickContentMask=" + this.e + ")";
    }
}
