package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ealc {
    public static final entd a = entd.c("GnpSdk");
    public static final ealc b = new ealc(1, null);
    public final Throwable c;
    public final int d;

    public ealc(int i, Throwable th) {
        this.d = i;
        this.c = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ealc)) {
            return false;
        }
        ealc ealcVar = (ealc) obj;
        return this.d == ealcVar.d && ffkj.e(this.c, ealcVar.c);
    }

    public final int hashCode() {
        Throwable th = this.c;
        return (this.d * 31) + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GnpJobResult(status=");
        int i = this.d;
        sb.append((Object) (i != 1 ? i != 2 ? "PERMANENT_FAILURE" : "TRANSIENT_FAILURE" : "SUCCESS"));
        sb.append(", error=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
