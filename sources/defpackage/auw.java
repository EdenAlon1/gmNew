package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class auw extends aup {
    final Executor n;
    public final Object o = new Object();
    avr p;
    public auv q;

    public auw(Executor executor) {
        this.n = executor;
    }

    @Override // defpackage.aup
    public final avr b(bev bevVar) {
        return bevVar.f();
    }

    @Override // defpackage.aup
    public final void d() {
        synchronized (this.o) {
            avr avrVar = this.p;
            if (avrVar != null) {
                avrVar.close();
                this.p = null;
            }
        }
    }

    @Override // defpackage.aup
    public final void e(avr avrVar) {
        synchronized (this.o) {
            if (!this.m) {
                avrVar.close();
                return;
            }
            if (this.q == null) {
                auv auvVar = new auv(avrVar, this);
                this.q = auvVar;
                bkj.i(c(auvVar), new aus(auvVar), bjb.a());
            } else {
                if (avrVar.e().a() <= this.q.e().a()) {
                    avrVar.close();
                } else {
                    avr avrVar2 = this.p;
                    if (avrVar2 != null) {
                        avrVar2.close();
                    }
                    this.p = avrVar;
                }
            }
        }
    }
}
