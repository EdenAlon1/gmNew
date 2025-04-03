package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emrf {
    String e = null;
    int c = -1;
    int d = -1;
    int a = -1;
    int b = -1;

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof emrf)) {
            return false;
        }
        emrf emrfVar = (emrf) obj;
        return this.e.equals(emrfVar.e) && this.c == emrfVar.c && this.d == emrfVar.d && this.a == emrfVar.a && this.b == emrfVar.b;
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode() + (this.c << 24);
        int i = this.d << 20;
        return hashCode + i + (this.a << 16) + (this.b << 12);
    }

    public final String toString() {
        return String.format("[Replacement value=[%s], truncate at %d, skip to %d, whitespaces: (%d, %d)]", this.e, Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
