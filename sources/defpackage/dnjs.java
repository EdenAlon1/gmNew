package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnjs implements dndt {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final ffix e;
    public final doie f;

    public dnjs(doie doieVar, String str, String str2, boolean z, boolean z2, ffix ffixVar) {
        this.f = doieVar;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
        this.e = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnjs)) {
            return false;
        }
        dnjs dnjsVar = (dnjs) obj;
        return ffkj.e(this.f, dnjsVar.f) && ffkj.e(this.a, dnjsVar.a) && ffkj.e(this.b, dnjsVar.b) && this.c == dnjsVar.c && this.d == dnjsVar.d && ffkj.e(this.e, dnjsVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() * 31) + this.a.hashCode();
        String str = this.b;
        return (((((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + dnjr.a(this.c)) * 31) + dnjr.a(this.d)) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "SimRadioButtonListItemUiData(simIconUiData=" + this.f + ", title=" + this.a + ", subtitle=" + this.b + ", isSelected=" + this.c + ", isDefault=" + this.d + ", onClick=" + this.e + ")";
    }
}
