package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class carj {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;

    public carj(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
        this.f = ffbrVar6;
        this.g = ffbrVar7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof carj)) {
            return false;
        }
        carj carjVar = (carj) obj;
        return ffkj.e(this.a, carjVar.a) && ffkj.e(this.b, carjVar.b) && ffkj.e(this.c, carjVar.c) && ffkj.e(this.d, carjVar.d) && ffkj.e(this.e, carjVar.e) && ffkj.e(this.f, carjVar.f) && ffkj.e(this.g, carjVar.g);
    }

    public final int hashCode() {
        return (((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode();
    }

    public final String toString() {
        return "OnSubscriptionsChangedParams(countryCodeDetectorActionFactory=" + this.a + ", countryCodeDetectorActionDelayMs=" + this.b + ", mmsConfigManager=" + this.c + ", carrierConfigValuesLoaderProvider=" + this.d + ", selfParticipantsRefreshActionFactory=" + this.e + ", selfParticipantsRefreshActionDelayMs=" + this.f + ", callbackEventUmaCounter=" + this.g + ")";
    }
}
