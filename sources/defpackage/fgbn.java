package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class fgbn {
    public static final fgcq a(ffxx ffxxVar, ffsk ffskVar, fgcz fgczVar, int i) {
        fgcx c = c(ffxxVar, i);
        int i2 = c.b;
        int i3 = c.d;
        ffhd ffhdVar = c.c;
        ffxx ffxxVar2 = c.a;
        fgcl d = fgcu.d(i, i2, i3);
        d(ffskVar, ffhdVar, ffxxVar2, d, fgczVar, fgcu.a);
        return new fgcn(d);
    }

    public static final fgdj b(ffxx ffxxVar, ffsk ffskVar, fgcz fgczVar, Object obj) {
        fgcx c = c(ffxxVar, 1);
        ffhd ffhdVar = c.c;
        ffxx ffxxVar2 = c.a;
        fgcm a = fgdm.a(obj);
        d(ffskVar, ffhdVar, ffxxVar2, a, fgczVar, obj);
        return new fgco(a);
    }

    private static final fgcx c(ffxx ffxxVar, int i) {
        fgea fgeaVar;
        ffxx f;
        boolean z = ffso.a;
        int i2 = ffwm.f;
        int f2 = ffmk.f(i, ffwl.a) - i;
        if (!(ffxxVar instanceof fgea) || (f = (fgeaVar = (fgea) ffxxVar).f()) == null) {
            return new fgcx(ffxxVar, f2, 1, ffhe.a);
        }
        int i3 = fgeaVar.b;
        if (i3 != -3 && i3 != -2 && i3 != 0) {
            f2 = i3;
        } else if (fgeaVar.c != 1 || i3 == 0) {
            f2 = 0;
        }
        return new fgcx(f, f2, fgeaVar.c, fgeaVar.a);
    }

    private static final void d(ffsk ffskVar, ffhd ffhdVar, ffxx ffxxVar, fgcl fgclVar, fgcz fgczVar, Object obj) {
        ffra.c(ffskVar, ffhdVar, ffkj.e(fgczVar, fgcy.a) ? ffsm.a : ffsm.d, new fgbm(fgczVar, ffxxVar, fgclVar, obj, null));
    }
}
