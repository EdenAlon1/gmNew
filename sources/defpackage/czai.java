package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czai {
    public final dnym a;
    public final cjwi b;
    public final String c;
    public final boolean d;
    public final String e;
    public final ffix f;

    public czai(dnym dnymVar, cjwi cjwiVar, String str, boolean z, String str2, ffix ffixVar) {
        cjwiVar.getClass();
        this.a = dnymVar;
        this.b = cjwiVar;
        this.c = str;
        this.d = z;
        this.e = str2;
        this.f = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czai)) {
            return false;
        }
        czai czaiVar = (czai) obj;
        return ffkj.e(this.a, czaiVar.a) && this.b == czaiVar.b && ffkj.e(this.c, czaiVar.c) && this.d == czaiVar.d && ffkj.e(this.e, czaiVar.e) && ffkj.e(this.f, czaiVar.f);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        String str = this.e;
        int hashCode2 = ((((hashCode * 31) + (true != this.d ? 1237 : 1231)) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        ffix ffixVar = this.f;
        return hashCode2 + (ffixVar != null ? ffixVar.hashCode() : 0);
    }

    public final String toString() {
        return "PhotoUiData(monogramUiData=" + this.a + ", photoSource=" + this.b + ", title=" + this.c + ", isCurrentSelection=" + this.d + ", subTitle=" + this.e + ", onSubTitleClick=" + this.f + ")";
    }
}
