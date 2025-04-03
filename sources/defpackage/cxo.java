package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxo {
    public static final /* synthetic */ int a = 0;
    private static final dac b = cxu.b(0.0f, 0.0f, null, 7);
    private static final dac c;

    static {
        iam iamVar = ddh.a;
        c = cxu.b(0.0f, 0.0f, new jzq(0.1f), 3);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
        Float.floatToRawIntBits(0.5f);
    }

    public static final hkx a(Object obj, dbv dbvVar, cxt cxtVar, Object obj2, ffji ffjiVar, hfd hfdVar, int i, int i2) {
        if ((i2 & 4) != 0) {
            Object f = hfdVar.f();
            if (f == hfc.a) {
                f = cxu.b(0.0f, 0.0f, null, 7);
                hfdVar.y(f);
            }
            cxtVar = (dac) f;
        }
        if ((i2 & 8) != 0) {
            obj2 = null;
        }
        Object f2 = hfdVar.f();
        if (f2 == hfc.a) {
            Object hicVar = new hic(null, hla.a);
            hfdVar.y(hicVar);
            f2 = hicVar;
        }
        hho hhoVar = (hho) f2;
        Object f3 = hfdVar.f();
        if (f3 == hfc.a) {
            f3 = new cxj(obj, dbvVar, obj2);
            hfdVar.y(f3);
        }
        cxj cxjVar = (cxj) f3;
        hkx a2 = hku.a(ffjiVar, hfdVar);
        if (obj2 != null && (cxtVar instanceof dac)) {
            dac dacVar = (dac) cxtVar;
            if (!ffkj.e(dacVar.c, obj2)) {
                cxtVar = new dac(dacVar.a, dacVar.b, obj2);
            }
        }
        hkx a3 = hku.a(cxtVar, hfdVar);
        Object f4 = hfdVar.f();
        if (f4 == hfc.a) {
            f4 = ffwp.a(-1, 0, 6);
            hfdVar.y(f4);
        }
        ffwm ffwmVar = (ffwm) f4;
        boolean F = hfdVar.F(ffwmVar) | ((((i & 14) ^ 6) > 4 && hfdVar.F(obj)) || (i & 6) == 4);
        Object f5 = hfdVar.f();
        if (F || f5 == hfc.a) {
            f5 = new cxl(ffwmVar, obj);
            hfdVar.y(f5);
        }
        hgs.i((ffix) f5, hfdVar);
        boolean F2 = hfdVar.F(ffwmVar) | hfdVar.F(cxjVar) | hfdVar.D(a3) | hfdVar.D(a2);
        Object f6 = hfdVar.f();
        if (F2 || f6 == hfc.a) {
            Object cxnVar = new cxn(ffwmVar, cxjVar, a3, a2, null);
            hfdVar.y(cxnVar);
            f6 = cxnVar;
        }
        hgs.g(ffwmVar, (ffjm) f6, hfdVar);
        hkx hkxVar = (hkx) hhoVar.a();
        return hkxVar == null ? cxjVar.b : hkxVar;
    }

    public static final hkx b(float f, cxt cxtVar, hfd hfdVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            cxtVar = c;
        }
        cxt cxtVar2 = cxtVar;
        jzq jzqVar = new jzq(f);
        int i3 = i & 14;
        int i4 = i << 3;
        return a(jzqVar, dcp.c, cxtVar2, null, null, hfdVar, i3 | (i4 & 896) | (57344 & (i << 6)), 8);
    }

    public static final hkx c(float f, cxt cxtVar, ffji ffjiVar, hfd hfdVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            cxtVar = b;
        }
        float f2 = (i2 & 4) != 0 ? 0.01f : 0.0f;
        if ((i2 & 16) != 0) {
            ffjiVar = null;
        }
        ffji ffjiVar2 = ffjiVar;
        if (cxtVar == b) {
            hfdVar.v(1125558999);
            boolean z = true;
            if ((((i & 896) ^ 384) <= 256 || !hfdVar.A(f2)) && (i & 384) != 256) {
                z = false;
            }
            Object f3 = hfdVar.f();
            if (z || f3 == hfc.a) {
                f3 = cxu.b(0.0f, 0.0f, Float.valueOf(f2), 3);
                hfdVar.y(f3);
            }
            cxtVar = (dac) f3;
            hfdVar.o();
        } else {
            hfdVar.v(1125668925);
            hfdVar.o();
        }
        int i3 = i << 3;
        return a(Float.valueOf(f), dcp.a, cxtVar, Float.valueOf(f2), ffjiVar2, hfdVar, (i & 14) | (i3 & 7168) | (i3 & 57344), 0);
    }
}
