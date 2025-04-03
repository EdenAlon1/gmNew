package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eqm {
    public static final eql a = a(50);

    public static final eql a(int i) {
        eqe a2 = eqg.a(i);
        return new eql(a2, a2, a2, a2);
    }

    public static final eql b(float f) {
        eqh eqhVar = new eqh(f);
        return new eql(eqhVar, eqhVar, eqhVar, eqhVar);
    }

    public static final eql c(float f, float f2, float f3, float f4) {
        return new eql(new eqh(f), new eqh(f2), new eqh(f3), new eqh(f4));
    }

    public static /* synthetic */ eql d(float f, float f2, float f3, float f4, int i) {
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if (1 == (i & 1)) {
            f = 0.0f;
        }
        return c(f, f2, f3, f4);
    }
}
