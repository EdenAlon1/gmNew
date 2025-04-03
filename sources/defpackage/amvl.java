package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amvl {
    public final aoqz a;
    public final int b;
    public final int c;
    public final boolean d;
    public final int e;

    public amvl() {
        this(aoqz.UNKNOWN_DESTINATION_TYPE, 0, 0, false, 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amvl)) {
            return false;
        }
        amvl amvlVar = (amvl) obj;
        return this.a == amvlVar.a && this.b == amvlVar.b && this.c == amvlVar.c && this.d == amvlVar.d && this.e == amvlVar.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        return ((((((hashCode + this.b) * 31) + this.c) * 31) + (true != this.d ? 1237 : 1231)) * 31) + this.e;
    }

    public final String toString() {
        return "NonNormalizedParticipantDebugInfo(destinationType=" + this.a + ", localDestinationLength=" + this.b + ", internationalDestinationLength=" + this.c + ", targetCallingCodeMatchesSelfIdentity=" + this.d + ", selfTargetCallingCode=" + this.e + ")";
    }

    public amvl(aoqz aoqzVar, int i, int i2, boolean z, int i3) {
        aoqzVar.getClass();
        this.a = aoqzVar;
        this.b = i;
        this.c = i2;
        this.d = z;
        this.e = i3;
    }
}
