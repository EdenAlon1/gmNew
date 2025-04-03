package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dntl implements dnsp {
    public final String a;
    public final ffix b;
    public final ffix c;
    public final boolean d;
    public final String e;
    public final Integer f;
    public final boolean g;
    public final boolean h;

    public /* synthetic */ dntl(String str, ffix ffixVar, ffix ffixVar2, boolean z, String str2, Integer num, boolean z2, boolean z3, int i) {
        str.getClass();
        this.a = str;
        this.b = (i & 2) != 0 ? null : ffixVar;
        this.c = (i & 4) != 0 ? null : ffixVar2;
        this.d = ((i & 8) == 0) & z;
        this.e = (i & 16) != 0 ? null : str2;
        this.f = (i & 32) != 0 ? null : num;
        this.g = ((i & 64) == 0) & z2;
        this.h = ((i & 128) == 0) & z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dntl)) {
            return false;
        }
        dntl dntlVar = (dntl) obj;
        return ffkj.e(this.a, dntlVar.a) && ffkj.e(this.b, dntlVar.b) && ffkj.e(this.c, dntlVar.c) && this.d == dntlVar.d && ffkj.e(this.e, dntlVar.e) && ffkj.e(this.f, dntlVar.f) && this.g == dntlVar.g && this.h == dntlVar.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ffix ffixVar = this.b;
        int hashCode2 = (hashCode + (ffixVar == null ? 0 : ffixVar.hashCode())) * 31;
        ffix ffixVar2 = this.c;
        int hashCode3 = (((hashCode2 + (ffixVar2 == null ? 0 : ffixVar2.hashCode())) * 31) + dntk.a(this.d)) * 31;
        String str = this.e;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f;
        return ((((hashCode4 + (num != null ? num.hashCode() : 0)) * 31) + dntk.a(this.g)) * 31) + dntk.a(this.h);
    }

    public final String toString() {
        return "MetatextTextItemUiData(text=" + this.a + ", onClick=" + this.b + ", onLayout=" + this.c + ", shouldTruncate=" + this.d + ", colorIdentifier=" + this.e + ", colorInt=" + this.f + ", useMediumWeight=" + this.g + ", ellipseLastItem=" + this.h + ")";
    }
}
