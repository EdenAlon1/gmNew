package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abkr {
    public final abkq a;
    public final dmzz b;
    public final String c;
    public final String d;
    public final ffix e;
    public final ffix f;

    public abkr(abkq abkqVar, dmzz dmzzVar, String str, String str2, ffix ffixVar, ffix ffixVar2) {
        dmzzVar.getClass();
        this.a = abkqVar;
        this.b = dmzzVar;
        this.c = str;
        this.d = str2;
        this.e = ffixVar;
        this.f = ffixVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abkr)) {
            return false;
        }
        abkr abkrVar = (abkr) obj;
        return ffkj.e(this.a, abkrVar.a) && this.b == abkrVar.b && ffkj.e(this.c, abkrVar.c) && ffkj.e(this.d, abkrVar.d) && ffkj.e(this.e, abkrVar.e) && ffkj.e(this.f, abkrVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "SpatulaApprovalBottomSheetUiData(customBottomSheetUiData=" + this.a + ", icon=" + this.b + ", continueButtonText=" + this.c + ", backButtonText=" + this.d + ", onBack=" + this.e + ", onContinue=" + this.f + ")";
    }
}
