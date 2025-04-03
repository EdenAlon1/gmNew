package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssg implements srz {
    public final String a;
    public final String b;
    public final String c;
    public final ssk d;
    public final ssc e;
    public final ssc f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final ffix j;
    public final ffix k;

    public /* synthetic */ ssg(String str, String str2, String str3, ssk sskVar, ssc sscVar, ssc sscVar2, ffix ffixVar, ffix ffixVar2, int i) {
        ffix ffixVar3 = (i & 512) != 0 ? new ffix() { // from class: sse
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar;
        ffix ffixVar4 = (i & 1024) != 0 ? new ffix() { // from class: ssf
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        } : ffixVar2;
        int i2 = i & 128;
        int i3 = i & 64;
        int i4 = i & 32;
        int i5 = i & 16;
        int i6 = i & 8;
        int i7 = i & 4;
        int i8 = i & 2;
        boolean z = (i & 256) != 0;
        boolean z2 = i2 != 0;
        boolean z3 = i3 != 0;
        ssc sscVar3 = i4 != 0 ? null : sscVar2;
        ssc sscVar4 = i5 != 0 ? null : sscVar;
        ssk sskVar2 = i6 != 0 ? null : sskVar;
        str3 = i7 != 0 ? null : str3;
        str2 = i8 != 0 ? null : str2;
        ffixVar3.getClass();
        ffixVar4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = sskVar2;
        this.e = sscVar4;
        this.f = sscVar3;
        this.g = z3;
        this.h = z2;
        this.i = z;
        this.j = ffixVar3;
        this.k = ffixVar4;
    }

    @Override // defpackage.srz
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ssg)) {
            return false;
        }
        ssg ssgVar = (ssg) obj;
        return ffkj.e(this.a, ssgVar.a) && ffkj.e(this.b, ssgVar.b) && ffkj.e(this.c, ssgVar.c) && ffkj.e(this.d, ssgVar.d) && ffkj.e(this.e, ssgVar.e) && ffkj.e(this.f, ssgVar.f) && this.g == ssgVar.g && this.h == ssgVar.h && this.i == ssgVar.i && ffkj.e(this.j, ssgVar.j) && ffkj.e(this.k, ssgVar.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ssk sskVar = this.d;
        int hashCode4 = (hashCode3 + (sskVar == null ? 0 : sskVar.hashCode())) * 31;
        ssc sscVar = this.e;
        int hashCode5 = (hashCode4 + (sscVar == null ? 0 : sscVar.hashCode())) * 31;
        ssc sscVar2 = this.f;
        return ((((((((((hashCode5 + (sscVar2 != null ? sscVar2.hashCode() : 0)) * 31) + ssd.a(this.g)) * 31) + ssd.a(this.h)) * 31) + ssd.a(this.i)) * 31) + this.j.hashCode()) * 31) + this.k.hashCode();
    }

    public final String toString() {
        return "FullBannerContent(id=" + this.a + ", title=" + this.b + ", text=" + this.c + ", symbol=" + this.d + ", confirmButton=" + this.e + ", dismissButton=" + this.f + ", showCloseButton=" + this.g + ", dismissAfterClicked=" + this.h + ", collapsible=" + this.i + ", onShownCallback=" + this.j + ", onHiddenCallback=" + this.k + ")";
    }
}
