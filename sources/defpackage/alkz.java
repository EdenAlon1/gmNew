package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class alkz extends alnt {
    private final elfl a;
    private final eqwf b;
    private final eosr c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final eovb j;
    private final int k;
    private final enhk l;
    private final enhk m;
    private final enhk n;
    private final int o;
    private final enip p;

    public alkz(elfl elflVar, eqwf eqwfVar, eosr eosrVar, int i, int i2, int i3, int i4, int i5, int i6, eovb eovbVar, int i7, enhk enhkVar, enhk enhkVar2, enhk enhkVar3, int i8, enip enipVar) {
        this.a = elflVar;
        if (eqwfVar == null) {
            throw new NullPointerException("Null rcsAvailability");
        }
        this.b = eqwfVar;
        if (eosrVar == null) {
            throw new NullPointerException("Null rcsUninitializedReason");
        }
        this.c = eosrVar;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
        this.h = i5;
        this.i = i6;
        if (eovbVar == null) {
            throw new NullPointerException("Null happinessTrackingMode");
        }
        this.j = eovbVar;
        this.k = i7;
        if (enhkVar == null) {
            throw new NullPointerException("Null rbmBotsFromInteractiveRbmConversations1Day");
        }
        this.l = enhkVar;
        if (enhkVar2 == null) {
            throw new NullPointerException("Null rbmBotsFromInteractiveRbmConversations7Days");
        }
        this.m = enhkVar2;
        if (enhkVar3 == null) {
            throw new NullPointerException("Null rbmBotsFromInteractiveRbmConversations28Days");
        }
        this.n = enhkVar3;
        this.o = i8;
        if (enipVar == null) {
            throw new NullPointerException("Null rcsAvailabilityForSim");
        }
        this.p = enipVar;
    }

    @Override // defpackage.alnt
    public final int a() {
        return this.d;
    }

    @Override // defpackage.alnt
    public final int b() {
        return this.e;
    }

    @Override // defpackage.alnt
    public final int c() {
        return this.h;
    }

    @Override // defpackage.alnt
    public final int d() {
        return this.i;
    }

    @Override // defpackage.alnt
    public final int e() {
        return this.k;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alnt) {
            alnt alntVar = (alnt) obj;
            if (this.a.equals(alntVar.i()) && this.b.equals(alntVar.p()) && this.c.equals(alntVar.n()) && this.d == alntVar.a() && this.e == alntVar.b() && this.f == alntVar.g() && this.g == alntVar.h() && this.h == alntVar.c() && this.i == alntVar.d() && this.j.equals(alntVar.o()) && this.k == alntVar.e() && this.l.equals(alntVar.j()) && this.m.equals(alntVar.l()) && this.n.equals(alntVar.k()) && this.o == alntVar.f() && this.p.equals(alntVar.m())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.alnt
    public final int f() {
        return this.o;
    }

    @Override // defpackage.alnt
    public final int g() {
        return this.f;
    }

    @Override // defpackage.alnt
    public final int h() {
        return this.g;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003) ^ this.f) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o) * 1000003) ^ this.p.hashCode();
    }

    @Override // defpackage.alnt
    public final elfl i() {
        return this.a;
    }

    @Override // defpackage.alnt
    public final enhk j() {
        return this.l;
    }

    @Override // defpackage.alnt
    public final enhk k() {
        return this.n;
    }

    @Override // defpackage.alnt
    public final enhk l() {
        return this.m;
    }

    @Override // defpackage.alnt
    public final enip m() {
        return this.p;
    }

    @Override // defpackage.alnt
    public final eosr n() {
        return this.c;
    }

    @Override // defpackage.alnt
    public final eovb o() {
        return this.j;
    }

    @Override // defpackage.alnt
    public final eqwf p() {
        return this.b;
    }

    public final String toString() {
        enip enipVar = this.p;
        enhk enhkVar = this.n;
        enhk enhkVar2 = this.m;
        enhk enhkVar3 = this.l;
        eovb eovbVar = this.j;
        eosr eosrVar = this.c;
        eqwf eqwfVar = this.b;
        return "SharedRecurringMetrics{engagementLevel=" + this.a.toString() + ", rcsAvailability=" + eqwfVar.toString() + ", rcsUninitializedReason=" + eosrVar.toString() + ", activeRcsGroups1DayCount=" + this.d + ", activeRcsGroups28DayCount=" + this.e + ", outgoingRcsFtSuccess1DayCount=" + this.f + ", outgoingRcsFtSuccess28DaysCount=" + this.g + ", activeShortCodeConversations1DayCount=" + this.h + ", activeShortCodeConversations28DaysCount=" + this.i + ", happinessTrackingMode=" + eovbVar.toString() + ", happinessTrackingDisabledReasons=" + this.k + ", rbmBotsFromInteractiveRbmConversations1Day=" + enhkVar3.toString() + ", rbmBotsFromInteractiveRbmConversations7Days=" + enhkVar2.toString() + ", rbmBotsFromInteractiveRbmConversations28Days=" + enhkVar.toString() + ", messageCount=" + this.o + ", rcsAvailabilityForSim=" + enipVar.toString() + "}";
    }
}
