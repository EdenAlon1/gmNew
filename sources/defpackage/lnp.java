package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lnp {
    public static final void a(lki lkiVar, lkr lkrVar, ffix ffixVar, hfd hfdVar, int i) {
        int i2;
        int i3 = i & 6;
        hfd b = hfdVar.b(-709389590);
        if (i3 == 0) {
            i2 = (true != b.D(lkiVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= true != b.F(ffixVar) ? 128 : 256;
        }
        if ((i2 & 147) == 146 && b.I()) {
            b.s();
        } else {
            b.t();
            if ((i & 1) == 0 || b.G()) {
                lkrVar = (lkr) b.e(lnr.a);
            } else {
                b.s();
            }
            b.l();
            if (lkiVar == lki.ON_DESTROY) {
                throw new IllegalArgumentException("LifecycleEventEffect cannot be used to listen for Lifecycle.Event.ON_DESTROY, since Compose disposes of the composition before ON_DESTROY observers are invoked.");
            }
            hkx a = hku.a(ffixVar, b);
            boolean D = b.D(a) | ((i2 & 14) == 4) | b.F(lkrVar);
            hfm hfmVar = (hfm) b;
            Object R = hfmVar.R();
            if (D || R == hfc.a) {
                R = new lnn(lkrVar, lkiVar, a);
                hfmVar.ad(R);
            }
            hgs.c(lkrVar, (ffji) R, b);
        }
        hio L = b.L();
        if (L != null) {
            L.d = new lno(lkiVar, lkrVar, ffixVar, i);
        }
    }
}
