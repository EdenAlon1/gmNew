package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cysm {
    public final cytr a;
    public final cyub b;
    public final cytm c;
    public final dlsr d;
    public final ffix e;
    public final cysl f;

    public cysm(cytr cytrVar, cyub cyubVar, cytm cytmVar, dlsr dlsrVar, ffix ffixVar, cysl cyslVar) {
        cytrVar.getClass();
        cyubVar.getClass();
        cytmVar.getClass();
        this.a = cytrVar;
        this.b = cyubVar;
        this.c = cytmVar;
        this.d = dlsrVar;
        this.e = ffixVar;
        this.f = cyslVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cysm)) {
            return false;
        }
        cysm cysmVar = (cysm) obj;
        return ffkj.e(this.a, cysmVar.a) && ffkj.e(this.b, cysmVar.b) && ffkj.e(this.c, cysmVar.c) && ffkj.e(this.d, cysmVar.d) && ffkj.e(this.e, cysmVar.e) && ffkj.e(this.f, cysmVar.f);
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        dlsr dlsrVar = this.d;
        int hashCode2 = ((hashCode * 31) + (dlsrVar == null ? 0 : dlsrVar.hashCode())) * 31;
        ffix ffixVar = this.e;
        return ((hashCode2 + (ffixVar != null ? ffixVar.hashCode() : 0)) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "HeaderUiData(avatarUiData=" + this.a + ", titleUiData=" + this.b + ", actionButtons=" + this.c + ", goBackAction=" + this.d + ", onAvatarEditClick=" + this.e + ", flags=" + this.f + ")";
    }
}
