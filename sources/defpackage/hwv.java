package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hwv {
    public final int a;
    public final jhv b;
    public final int c;
    private final long d;

    public hwv(int i, long j, int i2, jhv jhvVar) {
        this.a = i;
        this.d = j;
        this.c = i2;
        this.b = jhvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwv)) {
            return false;
        }
        hwv hwvVar = (hwv) obj;
        return this.a == hwvVar.a && this.d == hwvVar.d && this.c == hwvVar.c && ffkj.e(this.b, hwvVar.b);
    }

    public final int hashCode() {
        jhv jhvVar = this.b;
        int hashCode = jhvVar == null ? 0 : jhvVar.hashCode();
        long j = this.d;
        return (((((this.a * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.c) * 31) + hashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentCaptureEvent(id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.d);
        sb.append(", type=");
        sb.append((Object) (this.c != 1 ? "VIEW_DISAPPEAR" : "VIEW_APPEAR"));
        sb.append(", structureCompat=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
