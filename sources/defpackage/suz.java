package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class suz implements ffjm {
    final /* synthetic */ svh a;

    public suz(svh svhVar) {
        this.a = svhVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        log logVar;
        ffhd ffhdVar;
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            svj svjVar = (svj) this.a.b.a();
            sxb sxbVar = svjVar.a;
            synchronized (lmm.a) {
                logVar = (log) svjVar.fz("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
                if (logVar == null) {
                    try {
                        ffsd ffsdVar = fftc.a;
                        ffhdVar = fghh.a.j();
                    } catch (ffce | IllegalStateException unused) {
                        ffhdVar = ffhe.a;
                    }
                    log logVar2 = new log(ffhdVar.plus(new ffvf(null)));
                    svjVar.fB("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", logVar2);
                    logVar = logVar2;
                }
            }
            sxa sxaVar = (sxa) sxbVar.a.b();
            svr svrVar = (svr) sxaVar.a.b();
            swu swuVar = (swu) sxaVar.b.b();
            svs svsVar = (svs) sxaVar.c.b();
            svsVar.getClass();
            swp.a(new sxh(new swz(svrVar, swuVar, svsVar, logVar).d), hfdVar, 0);
        }
        return ffcu.a;
    }
}
