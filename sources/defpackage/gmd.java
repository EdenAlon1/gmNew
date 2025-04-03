package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gmd {
    public static final cxt a = cxu.c(300, 0, cyp.a, 2);

    public static final gmk a(boolean z, ffji ffjiVar, gml gmlVar, boolean z2, hfd hfdVar, int i, int i2) {
        ffji ffjiVar2 = (i2 & 2) != 0 ? glz.a : ffjiVar;
        gml gmlVar2 = (i2 & 4) != 0 ? gml.a : gmlVar;
        boolean z3 = ((i2 & 8) == 0) & z2;
        jzn jznVar = (jzn) hfdVar.e(jdr.e);
        boolean D = hfdVar.D(jznVar) | hfdVar.A(56.0f);
        Object f = hfdVar.f();
        if (D || f == hfc.a) {
            f = new gmb(jznVar);
            hfdVar.y(f);
        }
        ffix ffixVar = (ffix) f;
        boolean D2 = hfdVar.D(jznVar) | hfdVar.A(125.0f);
        Object f2 = hfdVar.f();
        if (D2 || f2 == hfc.a) {
            f2 = new gmc(jznVar);
            hfdVar.y(f2);
        }
        boolean z4 = 1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1));
        ffix ffixVar2 = (ffix) f2;
        Object[] objArr = {Boolean.valueOf(z4), ffjiVar2, Boolean.valueOf(z3)};
        ffji ffjiVar3 = ffjiVar2;
        hrk hrkVar = new hrk(gme.a, new gmf(z4, ffixVar, ffixVar2, ffjiVar3, z3));
        boolean D3 = ((((i & 14) ^ 6) > 4 && hfdVar.E(z4)) || (i & 6) == 4) | hfdVar.D(ffixVar) | hfdVar.D(ffixVar2) | ((((i & 896) ^ 384) > 256 && hfdVar.D(gmlVar2)) || (i & 384) == 256) | ((((i & 112) ^ 48) > 32 && hfdVar.D(ffjiVar3)) || (i & 48) == 32) | hfdVar.E(z3);
        Object f3 = hfdVar.f();
        if (D3 || f3 == hfc.a) {
            Object gmaVar = new gma(z4, ffixVar, ffixVar2, gmlVar2, ffjiVar3, z3);
            hfdVar.y(gmaVar);
            f3 = gmaVar;
        }
        return (gmk) hqr.c(objArr, hrkVar, (ffix) f3, hfdVar, 0, 4);
    }
}
