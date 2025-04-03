package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bdje extends bdnd {
    private final byzj a;
    private final enhk b;

    public bdje(byzj byzjVar, enhk enhkVar) {
        this.a = byzjVar;
        this.b = enhkVar;
    }

    @Override // defpackage.bdnd
    public final byzj a() {
        return this.a;
    }

    @Override // defpackage.bdnd
    public final enhk b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdnd) {
            bdnd bdndVar = (bdnd) obj;
            if (this.a.equals(bdndVar.a()) && ennc.m(this.b, bdndVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "MessageSendReceiveAttempt{transportProtocol=" + this.a.toString() + ", regionCodes=" + ennc.g(this.b) + "}";
    }
}
