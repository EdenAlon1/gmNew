package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deng {
    public final String a;
    public final String b;
    public final String c;
    public final dend d;
    public final ffix e;
    public final ffix f;
    public final denf g;
    public final cvjl h;

    public deng(String str, String str2, String str3, dend dendVar, ffix ffixVar, ffix ffixVar2, denf denfVar, cvjl cvjlVar) {
        cvjlVar.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dendVar;
        this.e = ffixVar;
        this.f = ffixVar2;
        this.g = denfVar;
        this.h = cvjlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof deng)) {
            return false;
        }
        deng dengVar = (deng) obj;
        return ffkj.e(this.a, dengVar.a) && ffkj.e(this.b, dengVar.b) && ffkj.e(this.c, dengVar.c) && ffkj.e(this.d, dengVar.d) && ffkj.e(this.e, dengVar.e) && ffkj.e(this.f, dengVar.f) && ffkj.e(this.g, dengVar.g) && this.h == dengVar.h;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return "WelcomeAccountScreenUiData(title=" + this.a + ", subtitle=" + this.b + ", profileSharingPreference=" + this.c + ", profileSharingMenuUiData=" + this.d + ", onEditPhoto=" + this.e + ", onEditName=" + this.f + ", flags=" + this.g + ", welcomeFlow=" + this.h + ")";
    }
}
