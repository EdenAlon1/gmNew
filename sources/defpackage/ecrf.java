package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ecrf {
    public abstract ecrg a();

    public abstract ecrf b(int i);

    public abstract void c(int i);

    public abstract void d(float f);

    public final ecrf e(boolean z) {
        return b(true != z ? 2 : 3);
    }

    public final ecrg f() {
        ecrg a = a();
        ecrd ecrdVar = (ecrd) a;
        emxf.m(ecrdVar.a >= 0, "Rate limit per second must be >= 0");
        float f = ecrdVar.b;
        emxf.m(f > 0.0f && f <= 1.0f, "Sampling Probability shall be > 0 and <= 1");
        return a;
    }
}
