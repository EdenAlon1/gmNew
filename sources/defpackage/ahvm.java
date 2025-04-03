package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvm {
    public final boolean a;
    private final boolean b;

    public ahvm(boolean z) {
        this.a = z;
        this.b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahvm)) {
            return false;
        }
        ahvm ahvmVar = (ahvm) obj;
        if (this.a != ahvmVar.a) {
            return false;
        }
        boolean z = ahvmVar.b;
        return true;
    }

    public final int hashCode() {
        return (ahvl.a(this.a) * 31) + ahvl.a(false);
    }

    public final String toString() {
        return "Flags(enableEdgeToEdge=" + this.a + ", enableMultiShareCoolRanchPhase3=false)";
    }

    public ahvm() {
        this(false);
    }
}
