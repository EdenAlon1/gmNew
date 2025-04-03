package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltr {
    public final long a;
    public int b;
    private final int c;

    public ltr(long j) {
        lti.a(j > 0);
        lti.a(false);
        lti.a(j > 0);
        this.a = j;
        this.c = Math.max(Math.round((j / 1000000.0f) * (-2.14748365E9f)), 1);
    }

    public final boolean a() {
        return this.b < this.c;
    }
}
