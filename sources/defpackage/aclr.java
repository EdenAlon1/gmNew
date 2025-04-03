package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aclr {
    private final String a;
    private final long b;

    public aclr(String str) {
        this.a = str;
        long j = -1;
        if (str != null && !ffpc.J(str)) {
            try {
                j = Long.parseLong(ffpc.t(str, "cid:") ? ffpc.q(str, "cid:", "") : str);
            } catch (NumberFormatException unused) {
            }
        }
        this.b = j;
    }

    public final String a() {
        return b() ? "" : String.valueOf(this.b);
    }

    public final boolean b() {
        return this.a == null || this.b < 0;
    }

    public final String toString() {
        String str = this.a;
        return (str == null || b()) ? "" : !ffpc.t(str, "cid") ? "cid:".concat(String.valueOf(this.a)) : this.a;
    }
}
