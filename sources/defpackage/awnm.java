package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awnm extends awno {
    private final cqpn a;

    public awnm(cqpn cqpnVar) {
        cqpnVar.getClass();
        this.a = cqpnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof awnm) && this.a == ((awnm) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Failure(fileTransferFailureReason=" + this.a + ")";
    }
}
