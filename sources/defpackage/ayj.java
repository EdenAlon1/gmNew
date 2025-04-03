package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ayj extends bab {
    private final bad a;
    private final avr b;

    public ayj(bad badVar, avr avrVar) {
        if (badVar == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.a = badVar;
        this.b = avrVar;
    }

    @Override // defpackage.bab
    public final avr a() {
        return this.b;
    }

    @Override // defpackage.bab
    public final bad b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bab) {
            bab babVar = (bab) obj;
            if (this.a.equals(babVar.b()) && this.b.equals(babVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "InputPacket{processingRequest=" + this.a + ", imageProxy=" + this.b + "}";
    }
}
