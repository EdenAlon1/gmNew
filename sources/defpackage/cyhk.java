package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cyhk extends cyhm {
    private final engw a;
    private final boolean b;

    public cyhk(engw engwVar, boolean z) {
        if (engwVar == null) {
            throw new NullPointerException("Null remindersData");
        }
        this.a = engwVar;
        this.b = z;
    }

    @Override // defpackage.cyhm
    public final engw a() {
        return this.a;
    }

    @Override // defpackage.cyhm
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cyhm) {
            cyhm cyhmVar = (cyhm) obj;
            if (enkr.h(this.a, cyhmVar.a()) && this.b == cyhmVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "RemindersBannerLoadedData{remindersData=" + this.a.toString() + ", bannerEligible=" + this.b + "}";
    }
}
