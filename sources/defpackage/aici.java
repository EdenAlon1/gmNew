package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aici {
    public final boolean a;
    private final boolean b;

    public aici(boolean z) {
        this.a = z;
        this.b = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aici)) {
            return false;
        }
        aici aiciVar = (aici) obj;
        if (this.a != aiciVar.a) {
            return false;
        }
        boolean z = aiciVar.b;
        return true;
    }

    public final int hashCode() {
        return (aich.a(this.a) * 31) + aich.a(false);
    }

    public final String toString() {
        return "Flags(enableEdgeToEdge=" + this.a + ", enableMultiShareCoolRanchPhase3=false)";
    }

    public aici() {
        this(false);
    }
}
