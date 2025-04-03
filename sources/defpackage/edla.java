package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
abstract class edla extends edop {
    public final edou a;
    public final Double b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Instant f;

    public edla(edou edouVar, Double d, Integer num, Integer num2, Integer num3, Instant instant) {
        if (edouVar == null) {
            throw new NullPointerException("Null type");
        }
        this.a = edouVar;
        this.b = d;
        this.c = num;
        this.d = num2;
        this.e = num3;
        this.f = instant;
    }

    @Override // defpackage.edop
    public final edou a() {
        return this.a;
    }

    @Override // defpackage.edop
    public final Instant b() {
        return this.f;
    }

    @Override // defpackage.edop
    public final Double c() {
        return this.b;
    }

    @Override // defpackage.edop
    public final Integer d() {
        return this.d;
    }

    @Override // defpackage.edop
    public final Integer e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        Integer num;
        Integer num2;
        Instant instant;
        if (obj == this) {
            return true;
        }
        if (obj instanceof edop) {
            edop edopVar = (edop) obj;
            if (this.a.equals(edopVar.a()) && this.b.equals(edopVar.c()) && this.c.equals(edopVar.e()) && ((num = this.d) != null ? num.equals(edopVar.d()) : edopVar.d() == null) && ((num2 = this.e) != null ? num2.equals(edopVar.f()) : edopVar.f() == null) && ((instant = this.f) != null ? instant.equals(edopVar.b()) : edopVar.b() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.edop
    public final Integer f() {
        return this.e;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        Integer num = this.d;
        int hashCode2 = ((hashCode * 1000003) ^ (num == null ? 0 : num.hashCode())) * 1000003;
        Integer num2 = this.e;
        int hashCode3 = (hashCode2 ^ (num2 == null ? 0 : num2.hashCode())) * 1000003;
        Instant instant = this.f;
        return hashCode3 ^ (instant != null ? instant.hashCode() : 0);
    }

    public final String toString() {
        Instant instant = this.f;
        return "ConnectorAggregation{type=" + this.a.toString() + ", maxChargeRateKw=" + this.b + ", count=" + this.c + ", availableCount=" + this.d + ", outOfServiceCount=" + this.e + ", availabilityLastUpdateTime=" + String.valueOf(instant) + "}";
    }
}
