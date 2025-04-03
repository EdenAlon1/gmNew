package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efes extends efgo {
    private final efgn a;

    public efes(efgn efgnVar) {
        if (efgnVar == null) {
            throw new NullPointerException("Null service");
        }
        this.a = efgnVar;
    }

    @Override // defpackage.efgo
    public final efgn a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof efgo) {
            return this.a.equals(((efgo) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "SignallingConfig{service=" + this.a.toString() + "}";
    }
}
