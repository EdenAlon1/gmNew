package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class muu extends msa implements mum {
    private final lwm d;
    private final mpm e;
    private final int f;
    private final lqc g;
    private boolean h = true;
    private long i = -9223372036854775807L;
    private boolean j;
    private boolean k;
    private lxp l;
    private lqw m;
    private final mus n;

    public muu(lqw lqwVar, lwm lwmVar, mus musVar, mpm mpmVar, int i, lqc lqcVar) {
        this.m = lqwVar;
        this.d = lwmVar;
        this.n = musVar;
        this.e = mpmVar;
        this.f = i;
        this.g = lqcVar;
    }

    private final void u() {
        lru mvgVar = new mvg(this.i, this.j, this.k, F());
        if (this.h) {
            mvgVar = new mur(mvgVar);
        }
        l(mvgVar);
    }

    @Override // defpackage.mtn
    public final synchronized lqw F() {
        return this.m;
    }

    @Override // defpackage.mum
    public final void a(long j, ndn ndnVar, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.i;
        }
        boolean y = ndnVar.y();
        if (!this.h && this.i == j && this.j == y && this.k == z) {
            return;
        }
        this.i = j;
        this.j = y;
        this.k = z;
        this.h = false;
        u();
    }

    @Override // defpackage.msa
    protected final void k(lxp lxpVar) {
        this.l = lxpVar;
        Looper myLooper = Looper.myLooper();
        lti.f(myLooper);
        this.e.h(myLooper, J());
        this.e.f();
        u();
    }

    @Override // defpackage.msa
    protected final void n() {
        this.e.g();
    }

    @Override // defpackage.msa, defpackage.mtn
    public final synchronized void q(lqw lqwVar) {
        this.m = lqwVar;
    }

    @Override // defpackage.mtn
    public final void v(mtj mtjVar) {
        muq muqVar = (muq) mtjVar;
        if (muqVar.n) {
            for (mvb mvbVar : muqVar.m) {
                mvbVar.h();
                mvbVar.j();
            }
        }
        myf myfVar = muqVar.f;
        myb mybVar = myfVar.c;
        if (mybVar != null) {
            mybVar.a(true);
        }
        myfVar.e.execute(new myd(muqVar));
        myk mykVar = myfVar.e;
        mykVar.b.a(mykVar.a);
        muqVar.j.removeCallbacksAndMessages(null);
        muqVar.k = null;
        muqVar.x = true;
    }

    @Override // defpackage.mtn
    public final mtj w(mtl mtlVar, mxt mxtVar, long j) {
        lwn a = this.d.a();
        lxp lxpVar = this.l;
        if (lxpVar != null) {
            a.f(lxpVar);
        }
        lqt lqtVar = F().b;
        lti.f(lqtVar);
        mus musVar = this.n;
        J();
        nct nctVar = musVar.a;
        int i = mut.d;
        return new muq(lqtVar.a, a, new msd(nctVar), this.e, b(mtlVar), c(mtlVar), this, mxtVar, this.f, this.g, lvf.u(lqtVar.i));
    }

    @Override // defpackage.mtn
    public final void t() {
    }
}
