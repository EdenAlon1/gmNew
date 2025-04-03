package defpackage;

import android.os.IBinder;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feft extends fefu implements feve {
    public final List a;
    private fevf b;

    public feft(ferd ferdVar, fdxd fdxdVar, List list, IBinder iBinder) {
        super(ferdVar, fdxdVar, fdzv.a(feft.class, "from ".concat(String.valueOf(String.valueOf(fdxdVar.a(fdzi.a))))));
        this.a = list;
        x(fegu.b(iBinder, this.i));
    }

    @Override // defpackage.fefu
    protected final fegj B(int i) {
        return new fegg(this, this.k, i);
    }

    final synchronized Status b(fevc fevcVar, String str, febo feboVar) {
        fdyg fdygVar;
        if (w()) {
            return Status.p.withDescription("transport is shutdown");
        }
        fevf fevfVar = ((fefc) this.b).a;
        int i = ffbo.a;
        Executor feufVar = ((feux) fevfVar).c.d != erpp.a ? new feuf(((feux) fevfVar).c.d) : new feub();
        boolean z = true;
        if (feboVar.h(fend.c)) {
            String str2 = (String) feboVar.b(fend.c);
            if (((feux) fevfVar).c.p.a(str2) == null) {
                fevcVar.i(feuy.c);
                fevcVar.e(Status.n.withDescription(String.format("Can't find decompressor for %s", str2)), new febo());
                return Status.b;
            }
        }
        fevo b = fevcVar.b();
        b.getClass();
        Long l = (Long) feboVar.b(fend.b);
        fdyn fdynVar = ((feux) fevfVar).c.o;
        fedo[] fedoVarArr = b.b;
        if (fedoVarArr.length > 0) {
            throw null;
        }
        fdyn l2 = fdynVar.l(fdzy.a, ((feux) fevfVar).c);
        if (l == null) {
            fdygVar = new fdyg(l2);
        } else {
            fdys d = fdys.d(l.longValue(), TimeUnit.NANOSECONDS, ((feux) fevfVar).c.s);
            ScheduledExecutorService scheduledExecutorService = ((fefu) ((feux) fevfVar).a).i;
            fdyn.m(scheduledExecutorService, "scheduler");
            fdys b2 = l2.b();
            if (b2 != null && b2.compareTo(d) <= 0) {
                z = false;
                d = b2;
            }
            fdyg fdygVar2 = new fdyg(l2, d);
            if (z) {
                if (d.g()) {
                    fdygVar2.j(new TimeoutException("context timed out"));
                } else {
                    synchronized (fdygVar2) {
                        fdyf fdyfVar = new fdyf(fdygVar2);
                        fdys.h(scheduledExecutorService, "scheduler");
                        fdygVar2.b = scheduledExecutorService.schedule(fdyfVar, d.c - System.nanoTime(), TimeUnit.NANOSECONDS);
                    }
                }
            }
            fdygVar = fdygVar2;
        }
        feuo feuoVar = new feuo(feufVar, ((feux) fevfVar).c.d, fevcVar, fdygVar);
        fevcVar.i(feuoVar);
        SettableFuture create = SettableFuture.create();
        fdyg fdygVar3 = fdygVar;
        feufVar.execute(new feuu((feux) fevfVar, fdygVar3, str, fevcVar, feuoVar, create, b, feboVar));
        feufVar.execute(new feut(fdygVar3, create, feboVar, fevcVar, feuoVar));
        return Status.b;
    }

    public final synchronized void e(fevf fevfVar) {
        this.b = fevfVar;
        if (w()) {
            y(5);
            k();
            m();
            return;
        }
        fegu feguVar = this.m;
        feguVar.getClass();
        r(feguVar);
        if (w()) {
            return;
        }
        y(3);
        fdxd fdxdVar = this.k;
        fevf fevfVar2 = ((fefc) fevfVar).a;
        ((feux) fevfVar2).b.cancel(false);
        ((feux) fevfVar2).b = null;
        Iterator it = ((feux) fevfVar2).c.g.iterator();
        if (it.hasNext()) {
            throw null;
        }
        this.k = fdxdVar;
    }

    @Override // defpackage.feve
    public final synchronized void f() {
        t(Status.b, false);
    }

    @Override // defpackage.feve
    public final synchronized void g(Status status) {
        t(status, true);
    }

    @Override // defpackage.fefu
    public final void k() {
        Runnable a;
        fevf fevfVar = this.b;
        if (fevfVar != null) {
            fefc fefcVar = (fefc) fevfVar;
            feux feuxVar = (feux) fefcVar.a;
            Future future = feuxVar.b;
            if (future != null) {
                future.cancel(false);
                feuxVar.b = null;
            }
            Iterator it = feuxVar.c.g.iterator();
            if (it.hasNext()) {
                throw null;
            }
            feuy feuyVar = feuxVar.c;
            feve feveVar = feuxVar.a;
            synchronized (feuyVar.l) {
                if (!feuyVar.n.remove(feveVar)) {
                    throw new AssertionError("Transport already removed");
                }
                fdzq.c((fdzp) feuyVar.q.g.get(Long.valueOf(fdzq.a(feuyVar))), feveVar);
                feuyVar.d();
            }
            fefd fefdVar = fefcVar.b;
            synchronized (fefdVar) {
                fefdVar.c--;
                a = fefdVar.a();
            }
            if (a != null) {
                a.run();
            }
        }
    }

    @Override // defpackage.fefu
    public final void j(Status status) {
    }
}
