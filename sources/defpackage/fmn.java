package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fmn {
    public static final hik a = new hgq(hla.a, fmm.a);
    public static final frj b;
    public static final frj c;
    public static final frj d;
    private static final fmp e;
    private static final fmp f;

    static {
        long j = ibw.h;
        e = new fmp(true, Float.NaN, j);
        f = new fmp(false, Float.NaN, j);
        b = new frj(0.16f, 0.24f, 0.08f, 0.24f);
        c = new frj(0.08f, 0.12f, 0.04f, 0.12f);
        d = new frj(0.08f, 0.12f, 0.04f, 0.1f);
    }

    public static /* synthetic */ dhf a(boolean z, float f2, int i) {
        int i2 = i & 2;
        long j = ibw.h;
        if (i2 != 0) {
            f2 = Float.NaN;
        }
        boolean b2 = jzq.b(f2, Float.NaN);
        int i3 = (z ? 1 : 0) | (i & 1);
        if (b2 && ffcp.a(j, ibw.h)) {
            return i3 != 0 ? e : f;
        }
        return new fmp(1 == i3, f2, j);
    }
}
