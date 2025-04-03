package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mzn implements nat, mzo {
    public final int a;
    public lsi b;
    public lqc c;
    public int d;
    public long e;
    public long f;
    public naq g;
    public Executor h;
    final /* synthetic */ mzs i;
    private engw j;

    public mzn(mzs mzsVar, Context context) {
        this.i = mzsVar;
        this.a = lvf.l(context);
        int i = engw.d;
        this.j = enou.a;
        this.f = -9223372036854775807L;
        this.g = naq.b;
        this.h = mzs.a;
    }

    @Override // defpackage.nat
    public final void a(boolean z) {
        lvb lvbVar;
        if (j()) {
            lsi lsiVar = this.b;
            mac macVar = (mac) lsiVar;
            if (macVar.d.c()) {
                macVar.k = false;
                try {
                    mdj a = ((mac) lsiVar).d.a();
                    a.l();
                    final mdt mdtVar = ((mac) lsiVar).e;
                    synchronized (mdtVar.a) {
                        mdtVar.c = true;
                        mdtVar.b.clear();
                    }
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    mdtVar.h(new mds() { // from class: mdq
                        @Override // defpackage.mds
                        public final void a() {
                            mdt mdtVar2 = mdt.this;
                            synchronized (mdtVar2.a) {
                                mdtVar2.c = false;
                            }
                            countDownLatch.countDown();
                        }
                    }, false);
                    countDownLatch.await();
                    a.o();
                    final CountDownLatch countDownLatch2 = new CountDownLatch(1);
                    a.s(new mds() { // from class: lzs
                        @Override // defpackage.mds
                        public final void a() {
                            countDownLatch2.countDown();
                        }
                    });
                    mdt mdtVar2 = ((mac) lsiVar).e;
                    final max maxVar = ((mac) lsiVar).h;
                    mdtVar2.d(new mds() { // from class: lzt
                        @Override // defpackage.mds
                        public final void a() {
                            max.this.c();
                        }
                    });
                    countDownLatch2.await();
                    a.s(null);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                macVar.k();
            }
        }
        this.f = -9223372036854775807L;
        final mzs mzsVar = this.i;
        if (mzsVar.o == 1) {
            mzsVar.n++;
            nat natVar = mzsVar.h;
            if (z) {
                ((myr) natVar).a.h();
            }
            myr myrVar = (myr) natVar;
            nad nadVar = myrVar.b;
            nadVar.e.d();
            nadVar.f = -9223372036854775807L;
            nadVar.g = -9223372036854775807L;
            nadVar.h = -9223372036854775807L;
            lvb lvbVar2 = nadVar.d;
            if (lvbVar2.a() > 0) {
                Long l = (Long) nad.a(lvbVar2);
                l.longValue();
                nadVar.d.e(0L, l);
            }
            lvb lvbVar3 = nadVar.c;
            if (lvbVar3.a() > 0) {
                nadVar.c.e(0L, (lsl) nad.a(lvbVar3));
            }
            myrVar.c.clear();
            while (true) {
                lvbVar = mzsVar.c;
                if (lvbVar.a() <= 1) {
                    break;
                } else {
                    lvbVar.c();
                }
            }
            if (lvbVar.a() == 1) {
                Long l2 = (Long) lvbVar.c();
                lti.f(l2);
                mzsVar.h.f(l2.longValue(), mzsVar.s);
            }
            mzsVar.p = -9223372036854775807L;
            mzsVar.q = -9223372036854775807L;
            mzsVar.r = false;
            lua luaVar = mzsVar.k;
            lti.g(luaVar);
            luaVar.b(new Runnable() { // from class: mze
                @Override // java.lang.Runnable
                public final void run() {
                    mzs mzsVar2 = mzs.this;
                    mzsVar2.n--;
                }
            });
        }
    }

    @Override // defpackage.nat
    public final void b(boolean z) {
        ((myr) this.i.h).a.c(z);
    }

    @Override // defpackage.nat
    public final void c(int i) {
        ((myr) this.i.h).a.i(i);
    }

    @Override // defpackage.nat
    public final void d(Surface surface, lux luxVar) {
        mzs mzsVar = this.i;
        Pair pair = mzsVar.m;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((lux) mzsVar.m.second).equals(luxVar)) {
            return;
        }
        mzsVar.m = Pair.create(surface, luxVar);
        mzsVar.g(surface, luxVar.c, luxVar.d);
    }

    @Override // defpackage.nat
    public final void e(float f) {
        ((myr) this.i.h).a.l(f);
    }

    @Override // defpackage.nat
    public final void f(long j, long j2) {
        long j3 = this.f;
        long j4 = j3 == -9223372036854775807L ? 0L : j3 + 1;
        this.i.c.e(j4, Long.valueOf(j));
        this.e = j2;
        mzs mzsVar = this.i;
        mzsVar.s = j2;
        mzsVar.h.f(mzsVar.l, j2);
    }

    @Override // defpackage.nat
    public final void g(List list) {
        if (enkr.h(this.j, list)) {
            return;
        }
        m(list);
        lqc lqcVar = this.c;
        if (lqcVar != null) {
            l(lqcVar);
        }
    }

    @Override // defpackage.nat
    public final void h(mzv mzvVar) {
        ((myr) this.i.h).i = mzvVar;
    }

    @Override // defpackage.nat
    public final void i() {
        mzs mzsVar = this.i;
        long j = this.f;
        mzsVar.q = j;
        if (mzsVar.p >= j) {
            mzsVar.h.i();
            this.i.r = true;
        }
    }

    @Override // defpackage.nat
    public final boolean j() {
        return this.b != null;
    }

    @Override // defpackage.nat
    public final void k(lqc lqcVar, List list) {
        throw null;
    }

    public final void l(lqc lqcVar) {
        lqb lqbVar = new lqb(lqcVar);
        lqbVar.A = mzs.f(lqcVar.C);
        lqc lqcVar2 = new lqc(lqbVar);
        lsi lsiVar = this.b;
        lti.g(lsiVar);
        lsiVar.c(this.d, lqcVar2, this.j, 0L);
    }

    public final void m(List list) {
        engr engrVar = new engr();
        engrVar.j(list);
        engrVar.j(this.i.f);
        this.j = engrVar.g();
    }

    @Override // defpackage.mzo
    public final void n(final lsf lsfVar) {
        final naq naqVar = this.g;
        this.h.execute(new Runnable() { // from class: mzk
            @Override // java.lang.Runnable
            public final void run() {
                lqc lqcVar = mzn.this.c;
                lti.g(lqcVar);
                naqVar.a(new nas(lsfVar, lqcVar));
            }
        });
    }

    @Override // defpackage.mzo
    public final void o() {
        final naq naqVar = this.g;
        this.h.execute(new Runnable() { // from class: mzl
            @Override // java.lang.Runnable
            public final void run() {
                naq.this.b();
            }
        });
    }

    @Override // defpackage.mzo
    public final void p() {
        final naq naqVar = this.g;
        this.h.execute(new Runnable() { // from class: mzm
            @Override // java.lang.Runnable
            public final void run() {
                naq.this.c();
            }
        });
    }

    @Override // defpackage.mzo
    public final void q(final lsl lslVar) {
        final naq naqVar = this.g;
        this.h.execute(new Runnable() { // from class: mzj
            @Override // java.lang.Runnable
            public final void run() {
                naq.this.d(lslVar);
            }
        });
    }
}
