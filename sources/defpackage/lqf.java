package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lqf {
    public final lqc a;
    public final long b;

    public lqf(lqc lqcVar, long j) {
        lti.b(lqcVar.C != null, "format colorInfo must be set");
        int i = lqcVar.v;
        lti.b(i > 0, a.h(i, "format width must be positive, but is: "));
        int i2 = lqcVar.w;
        lti.b(i2 > 0, a.h(i2, "format height must be positive, but is: "));
        this.a = lqcVar;
        this.b = j;
    }
}
