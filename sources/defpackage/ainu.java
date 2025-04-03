package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ainu implements aihs {
    public final cvqo a;
    private final int b = 3;

    public ainu(cvqo cvqoVar) {
        this.a = cvqoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ainu)) {
            return false;
        }
        ainu ainuVar = (ainu) obj;
        int i = ainuVar.b;
        return ffkj.e(this.a, ainuVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + 93;
    }

    public final String toString() {
        return cskt.b(super.toString()).toString();
    }
}
