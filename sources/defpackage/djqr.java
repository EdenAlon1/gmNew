package defpackage;

import android.content.Context;
import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djqr implements eehp {
    public static final /* synthetic */ int h = 0;
    private static final long i = TimeUnit.MINUTES.toMillis(1);
    public final ditq a;
    public final dktn b;
    public long f;
    private final dlpw j;
    private final errm k;
    private final ffbr o;
    private final AtomicReference l = new AtomicReference();
    private final djqq m = new djqq(this);
    private final djqp n = new djqp(this);
    public ffbr c = new ffbr() { // from class: djqn
        @Override // defpackage.ffbr, defpackage.ffbq
        public final Object b() {
            return Optional.empty();
        }
    };
    public int d = 180;
    public int e = 180;
    private final AtomicBoolean p = new AtomicBoolean(false);
    public final Collection g = new CopyOnWriteArrayList();

    public djqr(dlpw dlpwVar, Context context, ffbr ffbrVar, dktn dktnVar, errm errmVar) {
        this.j = dlpwVar;
        this.b = dktnVar;
        this.o = ffbrVar;
        this.k = errmVar;
        this.a = ditq.a(context, dktnVar.a.concat(".keep_alive_manager"));
    }

    private final String l() {
        djjt a = a();
        return a == null ? "Unknown Network Interface" : String.valueOf(a.h);
    }

    private final void m() {
        this.p.set(true);
        if (ctid.d) {
            DesugarAtomicReference.updateAndGet(this.l, new UnaryOperator() { // from class: djqo
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    ScheduledFuture scheduledFuture = (ScheduledFuture) obj;
                    int i2 = djqr.h;
                    if (scheduledFuture == null) {
                        return null;
                    }
                    scheduledFuture.cancel(false);
                    return null;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
        } else {
            this.a.b();
        }
    }

    private final void n() {
        i(this.d);
    }

    private final void o(Runnable runnable, long j) {
        this.l.set(this.k.schedule(runnable, j, TimeUnit.SECONDS));
    }

    private final synchronized void p() {
        eehy eehyVar = ((eehz) this.o).a;
        try {
            dkty.d(this.b, "Sending keep-alive response on i/f = %s", l());
            try {
                dkty.d(eehyVar.a(), "Sending keepAlive response message", new Object[0]);
                eehyVar.c().d(new eels());
                dkty.d(eehyVar.a(), "KeepAliveResponse sent", new Object[0]);
            } catch (eejg e) {
                dkty.j(e, eehyVar.a(), "Can't send keep alive response", new Object[0]);
                throw e;
            }
        } catch (eejg e2) {
            dkty.t(e2, this.b, "Sending keep-alive response has failed. Restarting IMS connection.", new Object[0]);
        }
    }

    public final djjt a() {
        return (djjt) ((Optional) this.c.b()).orElse(null);
    }

    public final void b(djqs djqsVar) {
        this.g.add(djqsVar);
    }

    public final synchronized void c() {
        m();
    }

    public final synchronized void d(int i2) {
        this.d = i2;
        dkty.l(this.b, "Enabling keep-alives. Period = %ds", Integer.valueOf(i2));
        n();
    }

    @Override // defpackage.eehp
    public final synchronized void e() {
        dkty.d(this.b, "Received keep-alive request on i/f = %s", l());
        p();
        h();
    }

    @Override // defpackage.eehp
    public final synchronized void f() {
        dkty.d(this.b, "Received keep-alive response on i/f = %s", l());
        m();
        n();
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((djqs) it.next()).a();
        }
    }

    public final void g(djqs djqsVar) {
        this.g.remove(djqsVar);
    }

    public final synchronized void h() {
        if (k()) {
            dkty.l(this.b, "Resetting keep-alive timer. Next ping in %ds on i/f = %s", Integer.valueOf((int) (this.d * 0.9d)), l());
            this.f = this.j.f().toEpochMilli();
            m();
            n();
        }
    }

    public final void i(int i2) {
        this.p.set(false);
        Thread b = dkwa.a().b("keep_alive_sender", this.n, i);
        if (i2 <= 0) {
            dkty.r(this.b, "Starting keep-alive immediately. %d", Integer.valueOf(i2));
            b.start();
            return;
        }
        long j = (long) (i2 * 0.9d);
        if (ctid.d) {
            o(this.n, j);
        } else {
            this.a.d(b, j);
        }
    }

    public final synchronized void j() {
        eehy eehyVar = ((eehz) this.o).a;
        if (!eehyVar.v()) {
            if (this.p.get()) {
                dkty.d(this.b, "Canceled", new Object[0]);
                return;
            }
            try {
                dkty.d(this.b, "Sending keep-alive request on i/f = %s", l());
                if (ctid.d) {
                    o(this.m, djao.d());
                } else {
                    this.a.d(dkwa.a().b("keep_alive_timeout", this.m, i), djao.d());
                }
                try {
                    dkty.d(eehyVar.a(), "Sending keepAlive request message", new Object[0]);
                    eehyVar.c().d(new eelr());
                    dkty.d(eehyVar.a(), "KeepAliveRequest sent", new Object[0]);
                    this.f = this.j.f().toEpochMilli();
                } catch (eejg e) {
                    dkty.j(e, eehyVar.a(), "Can't send keep alive", new Object[0]);
                    throw e;
                }
            } catch (Exception e2) {
                dkty.t(e2, this.b, "Sending keep-alive request has failed. Restarting IMS connection.", new Object[0]);
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((djqs) it.next()).c();
                }
            }
        }
    }

    public final boolean k() {
        if (!ctid.d) {
            return this.a.e();
        }
        ScheduledFuture scheduledFuture = (ScheduledFuture) this.l.get();
        return (scheduledFuture == null || scheduledFuture.isDone()) ? false : true;
    }
}
