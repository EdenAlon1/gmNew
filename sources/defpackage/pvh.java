package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pvh {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public pvh(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvh)) {
            return false;
        }
        pvh pvhVar = (pvh) obj;
        return this.a == pvhVar.a && this.b == pvhVar.b && this.c == pvhVar.c && this.d == pvhVar.d;
    }

    public final int hashCode() {
        int a = pvg.a(this.a);
        boolean z = this.d;
        return (((((a * 31) + pvg.a(this.b)) * 31) + pvg.a(this.c)) * 31) + pvg.a(z);
    }

    public final String toString() {
        return "NetworkState(isConnected=" + this.a + ", isValidated=" + this.b + ", isMetered=" + this.c + ", isNotRoaming=" + this.d + ')';
    }
}
