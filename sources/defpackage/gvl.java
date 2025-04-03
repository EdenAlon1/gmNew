package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvl {
    public static final gvo a(gvr gvrVar, ffix ffixVar, cxt cxtVar, cyj cyjVar, hfd hfdVar, int i) {
        hfd hfdVar2;
        if ((i & 1) != 0) {
            float f = fub.a;
            Object[] objArr = new Object[0];
            hrh hrhVar = gvr.a;
            boolean A = hfdVar.A(-3.4028235E38f) | hfdVar.A(0.0f) | hfdVar.A(0.0f);
            hfm hfmVar = (hfm) hfdVar;
            Object R = hfmVar.R();
            if (A || R == hfc.a) {
                R = new ftx();
                hfmVar.ad(R);
            }
            ffix ffixVar2 = (ffix) R;
            hfdVar2 = hfdVar;
            gvrVar = (gvr) hqr.c(objArr, hrhVar, ffixVar2, hfdVar2, 0, 4);
        } else {
            hfdVar2 = hfdVar;
        }
        if ((i & 2) != 0) {
            ffixVar = gvk.a;
        }
        if ((i & 4) != 0) {
            cxtVar = gjb.a(4, hfdVar2);
        }
        if ((i & 8) != 0) {
            cyjVar = cxd.a(hfdVar2);
        }
        boolean D = hfdVar2.D(ffixVar) | hfdVar2.D(gvrVar) | hfdVar2.D(cxtVar) | hfdVar2.D(cyjVar);
        hfm hfmVar2 = (hfm) hfdVar2;
        Object R2 = hfmVar2.R();
        if (D || R2 == hfc.a) {
            R2 = new gdq(gvrVar, cxtVar, cyjVar);
            hfmVar2.ad(R2);
        }
        return (gdq) R2;
    }

    public static final gvj b(long j, long j2, long j3, long j4, long j5, long j6, hfd hfdVar, int i) {
        long j7;
        long j8 = (i & 1) != 0 ? ibw.h : j;
        long j9 = (i & 2) != 0 ? ibw.h : j2;
        long j10 = (i & 4) != 0 ? ibw.h : j3;
        long j11 = (i & 8) != 0 ? ibw.h : j4;
        long j12 = (i & 16) != 0 ? ibw.h : j5;
        long j13 = (i & 32) != 0 ? ibw.h : j6;
        fxz a = gft.a(hfdVar);
        gvj gvjVar = a.R;
        if (gvjVar == null) {
            j7 = j8;
            gvjVar = new gvj(fyc.g(a, 35), fyc.g(a, 37), fyc.g(a, 18), fyc.g(a, 18), fyc.g(a, 19), fyc.g(a, 19));
            a.R = gvjVar;
        } else {
            j7 = j8;
        }
        long j14 = j7 != 16 ? j7 : gvjVar.a;
        if (j9 == 16) {
            j9 = gvjVar.b;
        }
        if (j10 == 16) {
            j10 = gvjVar.c;
        }
        if (j11 == 16) {
            j11 = gvjVar.d;
        }
        if (j12 == 16) {
            j12 = gvjVar.e;
        }
        if (j13 == 16) {
            j13 = gvjVar.f;
        }
        return new gvj(j14, j9, j10, j11, j12, j13);
    }
}
