package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqqn {
    public final ffbr a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;

    public cqqn(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
        this.f = ffbrVar6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqqn)) {
            return false;
        }
        cqqn cqqnVar = (cqqn) obj;
        return ffkj.e(this.a, cqqnVar.a) && ffkj.e(this.b, cqqnVar.b) && ffkj.e(this.c, cqqnVar.c) && ffkj.e(this.d, cqqnVar.d) && ffkj.e(this.e, cqqnVar.e) && ffkj.e(this.f, cqqnVar.f);
    }

    public final int hashCode() {
        return (((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        return "BugleCronetConfig(copperHostsList=" + this.a + ", cronetCacheMaxSize=" + this.b + ", staleDnsFreshLookoutTimeout=" + this.c + ", staleDnsMaxExpiredDelay=" + this.d + ", staleDnsAllowCrossNetworkUsage=" + this.e + ", quicRetransmittableOnWireTimeoutMillis=" + this.f + ")";
    }
}
