package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpwh {
    public final ecri a;
    public final String b;

    public dpwh(ecri ecriVar, String str) {
        this.a = ecriVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpwh)) {
            return false;
        }
        dpwh dpwhVar = (dpwh) obj;
        return ffkj.e(this.a, dpwhVar.a) && ffkj.e(this.b, dpwhVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "EffectsTimerEvent(timerEvent=" + this.a + ", effectId=" + this.b + ")";
    }
}
