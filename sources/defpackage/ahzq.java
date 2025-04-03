package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahzq {
    public final boolean a;
    private final boolean b;

    public ahzq(boolean z) {
        this.a = z;
        this.b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahzq)) {
            return false;
        }
        ahzq ahzqVar = (ahzq) obj;
        if (this.a != ahzqVar.a) {
            return false;
        }
        boolean z = ahzqVar.b;
        return true;
    }

    public final int hashCode() {
        return (ahzp.a(this.a) * 31) + ahzp.a(false);
    }

    public final String toString() {
        return "Flags(enableEdgeToEdge=" + this.a + ", enableMultiShareCoolRanchPhase3=false)";
    }

    public ahzq() {
        this(false);
    }
}
