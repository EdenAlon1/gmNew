package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xlq implements xlw {
    public final alxh a;

    public xlq(alxh alxhVar) {
        this.a = alxhVar;
        if (alxhVar == alxh.NONE) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xlq) && this.a == ((xlq) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisabledTransportCapabilityData(composeDisabledReason=" + this.a + ")";
    }
}
