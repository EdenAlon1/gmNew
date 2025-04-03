package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwcp {
    public final boolean a;
    private final boolean b;

    public cwcp(boolean z) {
        this.a = z;
        this.b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwcp)) {
            return false;
        }
        cwcp cwcpVar = (cwcp) obj;
        if (this.a != cwcpVar.a) {
            return false;
        }
        boolean z = cwcpVar.b;
        return true;
    }

    public final int hashCode() {
        return (cwco.a(this.a) * 31) + cwco.a(false);
    }

    public final String toString() {
        return "Flags(enableEdgeToEdge=" + this.a + ", enableStartChatCoolRanchPhase3=false)";
    }

    public cwcp() {
        this(false);
    }
}
