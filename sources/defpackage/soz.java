package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class soz {
    public final eqom a;
    private final long b;
    private final long c;
    private final long d;
    private final long e;

    public soz(long j, long j2, long j3, long j4, eqom eqomVar) {
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.a = eqomVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof soz)) {
            return false;
        }
        soz sozVar = (soz) obj;
        return this.b == sozVar.b && this.c == sozVar.c && this.d == sozVar.d && this.e == sozVar.e && this.a == sozVar.a;
    }

    public final int hashCode() {
        eqom eqomVar = this.a;
        return (((((((soy.a(this.b) * 31) + soy.a(this.c)) * 31) + soy.a(this.d)) * 31) + soy.a(this.e)) * 31) + (eqomVar == null ? 0 : eqomVar.hashCode());
    }

    public final String toString() {
        return "MessagesVersionCheckResult(targetMessagesVersion=" + this.b + ", sourceMessagesVersion=" + this.c + ", minTargetMessagesVersion=" + this.d + ", minSourceMessagesVersion=" + this.e + ", failureReason=" + this.a + ")";
    }
}
