package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class muv {
    public long a;
    public long b;
    public mxn c;
    public muv d;

    public muv(long j) {
        c(j);
    }

    public final int a(long j) {
        long j2 = j - this.a;
        int i = this.c.b;
        return (int) j2;
    }

    public final muv b() {
        this.c = null;
        muv muvVar = this.d;
        this.d = null;
        return muvVar;
    }

    public final void c(long j) {
        lti.c(this.c == null);
        this.a = j;
        this.b = j + 65536;
    }
}
