package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feom implements Runnable {
    final /* synthetic */ feop a;

    public feom(feop feopVar) {
        this.a = feopVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        long nextLong;
        synchronized (this.a) {
            feop feopVar = this.a;
            feopVar.f = null;
            int i = feopVar.k;
            z = true;
            if (i == 2) {
                feopVar.k = 4;
                feopVar.e = feopVar.c.schedule(feopVar.g, feopVar.j, TimeUnit.NANOSECONDS);
                z2 = true;
            } else {
                if (i == 3) {
                    feopVar.f = feopVar.c.schedule(feopVar.h, feopVar.i - feopVar.d.a(TimeUnit.NANOSECONDS), TimeUnit.NANOSECONDS);
                    this.a.k = 2;
                }
                z2 = false;
            }
        }
        if (z2) {
            feoo feooVar = this.a.l;
            fekh fekhVar = feooVar.a;
            feon feonVar = new feon(feooVar);
            Object obj = ((feyg) fekhVar).j;
            erpp erppVar = erpp.a;
            synchronized (obj) {
                emxf.l(((feyg) fekhVar).h != null);
                if (((feyg) fekhVar).r) {
                    ((feyg) fekhVar).g();
                    fenj.b(feonVar, erppVar);
                    return;
                }
                fenj fenjVar = ((feyg) fekhVar).q;
                if (fenjVar != null) {
                    nextLong = 0;
                    z = false;
                } else {
                    nextLong = ((feyg) fekhVar).e.nextLong();
                    emyg emygVar = new emyg();
                    emygVar.f();
                    fenj fenjVar2 = new fenj(nextLong, emygVar);
                    ((feyg) fekhVar).q = fenjVar2;
                    ((feyg) fekhVar).D.f++;
                    fenjVar = fenjVar2;
                }
                if (z) {
                    ((feyg) fekhVar).h.e(false, (int) (nextLong >>> 32), (int) nextLong);
                }
                synchronized (fenjVar) {
                    if (fenjVar.d) {
                        fenj.a(erppVar, fenjVar.e != null ? new feni(feonVar) : new fenh());
                    } else {
                        fenjVar.c.put(feonVar, erppVar);
                    }
                }
            }
        }
    }
}
