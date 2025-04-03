package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dosk implements dosl {
    public final String a;
    public final String b;
    public final dnym c;
    public final boolean d;
    public final dorc e;
    public final dosg f;
    public final ffix g;
    private final boolean h;

    public /* synthetic */ dosk(String str, String str2, dnym dnymVar, boolean z, dorc dorcVar, dosg dosgVar, ffix ffixVar, int i) {
        dosgVar = (i & 64) != 0 ? new dosg((byte[]) null) : dosgVar;
        int i2 = i & 32;
        int i3 = i & 4;
        int i4 = i & 2;
        boolean z2 = (i & 16) == 0;
        dorcVar = i2 != 0 ? null : dorcVar;
        boolean z3 = z & z2;
        dnymVar = i3 != 0 ? null : dnymVar;
        str2 = i4 != 0 ? null : str2;
        ffixVar = (i & 128) != 0 ? null : ffixVar;
        str.getClass();
        dosgVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = dnymVar;
        this.h = false;
        this.d = z3;
        this.e = dorcVar;
        this.f = dosgVar;
        this.g = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dosk)) {
            return false;
        }
        dosk doskVar = (dosk) obj;
        if (!ffkj.e(this.a, doskVar.a) || !ffkj.e(this.b, doskVar.b) || !ffkj.e(this.c, doskVar.c)) {
            return false;
        }
        boolean z = doskVar.h;
        return this.d == doskVar.d && ffkj.e(this.e, doskVar.e) && ffkj.e(this.f, doskVar.f) && ffkj.e(this.g, doskVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        dnym dnymVar = this.c;
        int hashCode3 = (((((hashCode2 + (dnymVar == null ? 0 : dnymVar.hashCode())) * 31) + dosj.a(false)) * 31) + dosj.a(this.d)) * 31;
        dorc dorcVar = this.e;
        int hashCode4 = (((hashCode3 + (dorcVar == null ? 0 : dorcVar.hashCode())) * 31) + this.f.a) * 31;
        ffix ffixVar = this.g;
        return hashCode4 + (ffixVar != null ? ffixVar.hashCode() : 0);
    }

    public final String toString() {
        return "Title(title=" + this.a + ", subtitle=" + this.b + ", monogram=" + this.c + ", autoFitTitle=false, highlight=" + this.d + ", tooltip=" + this.e + ", flags=" + this.f + ", onClick=" + this.g + ")";
    }
}
