package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class azsi {
    public final azsu a;
    public final boolean b;

    public azsi(azsu azsuVar, boolean z) {
        azsuVar.getClass();
        this.a = azsuVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azsi)) {
            return false;
        }
        azsi azsiVar = (azsi) obj;
        return ffkj.e(this.a, azsiVar.a) && this.b == azsiVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "MyIdentityUpdateResult(token=" + this.a + ", hasChanges=" + this.b + ")";
    }
}
