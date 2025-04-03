package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cwo {
    private static final dac a = cxu.b(0.0f, 0.0f, null, 7);

    /* JADX WARN: Type inference failed for: r3v2, types: [dbv, java.lang.Object] */
    public static final cxj a(long j) {
        return new cxj(new ibw(j), csh.a.invoke(ibw.f(j)), null, 12);
    }

    public static final hkx b(long j, cxt cxtVar, hfd hfdVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            cxtVar = a;
        }
        cxt cxtVar2 = cxtVar;
        boolean D = hfdVar.D(ibw.f(j));
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            f = csh.a.invoke(ibw.f(j));
            hfdVar.y(f);
        }
        return cxo.a(new ibw(j), (dbv) f, cxtVar2, null, null, hfdVar, (i & 14) | ((i << 3) & 896) | (57344 & (i << 6)), 8);
    }
}
