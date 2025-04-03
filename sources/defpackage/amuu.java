package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amuu {
    public final amvm a;
    public final int b;
    public final amvl c;

    public amuu(amvm amvmVar, int i, amvl amvlVar) {
        amvmVar.getClass();
        this.a = amvmVar;
        this.b = i;
        this.c = amvlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amuu)) {
            return false;
        }
        amuu amuuVar = (amuu) obj;
        return this.a == amuuVar.a && this.b == amuuVar.b && ffkj.e(this.c, amuuVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        amvl amvlVar = this.c;
        return ((hashCode + this.b) * 31) + (amvlVar == null ? 0 : amvlVar.hashCode());
    }

    public final String toString() {
        return "EligibilityResult(upgradeEligibilityStatus=" + this.a + ", capabilitiesNetworkRequestCount=" + this.b + ", nonNormalizedParticipantInfo=" + this.c + ")";
    }

    public /* synthetic */ amuu(amvm amvmVar, int i, int i2) {
        this(amvmVar, i & ((i2 & 2) != 0 ? 0 : 1), (amvl) null);
    }
}
