package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvzr {
    public final String a;
    public final dnyn b;
    public final cvyo c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final boolean h;
    public final String i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final ffji m;
    public final ffix n;
    public final abo o;
    public final cvzq p;

    public cvzr() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvzr)) {
            return false;
        }
        cvzr cvzrVar = (cvzr) obj;
        return ffkj.e(this.a, cvzrVar.a) && ffkj.e(this.b, cvzrVar.b) && ffkj.e(this.c, cvzrVar.c) && ffkj.e(this.d, cvzrVar.d) && ffkj.e(this.e, cvzrVar.e) && ffkj.e(this.f, cvzrVar.f) && ffkj.e(this.g, cvzrVar.g) && this.h == cvzrVar.h && ffkj.e(this.i, cvzrVar.i) && this.j == cvzrVar.j && this.k == cvzrVar.k && this.l == cvzrVar.l && ffkj.e(this.m, cvzrVar.m) && ffkj.e(this.n, cvzrVar.n) && ffkj.e(this.o, cvzrVar.o) && ffkj.e(this.p, cvzrVar.p);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dnyn dnynVar = this.b;
        int hashCode2 = (hashCode + (dnynVar == null ? 0 : dnynVar.hashCode())) * 31;
        cvyo cvyoVar = this.c;
        int hashCode3 = (((((((((((((((((((((((hashCode2 + (cvyoVar == null ? 0 : cvyoVar.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + cvzn.a(this.h)) * 31) + this.i.hashCode()) * 31) + cvzn.a(this.j)) * 31) + cvzn.a(this.k)) * 31) + cvzn.a(this.l)) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31;
        abo aboVar = this.o;
        return ((hashCode3 + (aboVar != null ? aboVar.hashCode() : 0)) * 31) + 1237;
    }

    public final String toString() {
        return "GroupNameUiData(topBarTitle=" + this.a + ", multiMonogramUiData=" + this.b + ", duplicateGroupNoticeUiData=" + this.c + ", textFieldTitle=" + this.d + ", groupName=" + this.e + ", placeholder=" + this.f + ", actionButtonText=" + this.g + ", actionButtonEnabled=" + this.h + ", groupNameDescriptionText=" + this.i + ", isVisible=" + this.j + ", isEnabled=" + this.k + ", isError=" + this.l + ", onTextChange=" + this.m + ", onDoneClick=" + this.n + ", onBackPressed=" + this.o + ", flags=" + this.p + ")";
    }

    public cvzr(String str, dnyn dnynVar, cvyo cvyoVar, String str2, String str3, String str4, String str5, boolean z, String str6, boolean z2, boolean z3, boolean z4, ffji ffjiVar, ffix ffixVar, abo aboVar, cvzq cvzqVar) {
        this.a = str;
        this.b = dnynVar;
        this.c = cvyoVar;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = z;
        this.i = str6;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = ffjiVar;
        this.n = ffixVar;
        this.o = aboVar;
        this.p = cvzqVar;
    }

    public /* synthetic */ cvzr(byte[] bArr) {
        this("", null, null, "", "", "", "", false, "", false, false, false, new ffji() { // from class: cvzo
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((String) obj).getClass();
                return ffcu.a;
            }
        }, new ffix() { // from class: cvzp
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, null, new cvzq((char[]) null));
    }
}
