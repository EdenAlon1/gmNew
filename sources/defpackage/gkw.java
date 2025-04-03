package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gkw {
    public static final hik a = new hgq(hla.a, gkv.a);
    private static final gky b;
    private static final gky c;

    static {
        long j = ibw.h;
        b = new gky(true, Float.NaN, j);
        c = new gky(false, Float.NaN, j);
    }

    public static /* synthetic */ dhf a(boolean z, float f, long j, int i) {
        if ((i & 4) != 0) {
            j = ibw.h;
        }
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        int i2 = (z ? 1 : 0) | (i & 1);
        if (jzq.b(f, Float.NaN) && ffcp.a(j, ibw.h)) {
            return i2 != 0 ? b : c;
        }
        return new gky(1 == i2, f, j);
    }
}
