package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eogi extends ernr {
    public static final Logger a = Logger.getLogger(eogi.class.getCanonicalName());
    public static final Object b = new Object();
    static final eogh c = new eogb();
    public final emyl d;
    public final eofx e;
    public final emxg f;
    public final emyg g;
    public final errm h;
    public final eogh i;
    private final Executor n;
    public volatile int j = 0;
    private final AtomicReference o = new AtomicReference(erqt.i(new Object()));

    public eogi(emyl emylVar, eofx eofxVar, emxg emxgVar, Executor executor, ScheduledExecutorService scheduledExecutorService, emyv emyvVar, eogh eoghVar) {
        this.d = emylVar;
        this.e = eofxVar;
        this.f = emxgVar;
        this.n = new eogd(this, executor);
        this.h = errs.b(scheduledExecutorService);
        this.i = eoghVar;
        this.g = emyg.c(emyvVar);
        d(0L, TimeUnit.MILLISECONDS);
        b(new eogc(eoghVar), executor);
    }

    public final void d(final long j, final TimeUnit timeUnit) {
        AtomicReference atomicReference = this.o;
        SettableFuture create = SettableFuture.create();
        ListenableFuture listenableFuture = (ListenableFuture) atomicReference.getAndSet(create);
        if (j != 0) {
            listenableFuture = erny.g(listenableFuture, new eroh() { // from class: eofy
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return eogi.this.h.schedule(new eroi(null), j, timeUnit);
                }
            }, erpp.a);
        }
        final ListenableFuture g = erny.g(listenableFuture, new eroh() { // from class: eofz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                eogi eogiVar = eogi.this;
                eogiVar.j++;
                try {
                    eogiVar.i.b();
                    return (ListenableFuture) eogiVar.d.get();
                } catch (Exception e) {
                    eogiVar.setException(e);
                    return erqt.i(null);
                }
            }
        }, this.n);
        create.m(ernq.g(g, Exception.class, new eroh() { // from class: eoga
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                ListenableFuture listenableFuture2 = g;
                Exception exc = (Exception) obj;
                if (listenableFuture2.isCancelled()) {
                    return listenableFuture2;
                }
                eogi eogiVar = eogi.this;
                int i = eogiVar.j;
                eogiVar.g.d().getClass();
                eofx eofxVar = eogiVar.e;
                long millis = (!eofxVar.b(i) ? eofx.d : eofxVar.a(i)).toMillis();
                if (millis < 0 || !eogiVar.f.a(exc)) {
                    eogiVar.i.d(exc);
                    int i2 = eogiVar.j;
                    throw new eofq(exc);
                }
                eogiVar.i.c(exc, millis);
                eogiVar.d(millis, TimeUnit.MILLISECONDS);
                return erqt.i(eogi.b);
            }
        }, this.n));
        create.b(new eoge(this, create), erpp.a);
    }

    @Override // defpackage.ernr
    protected final String gP() {
        ListenableFuture listenableFuture = (ListenableFuture) this.o.get();
        String obj = listenableFuture.toString();
        eofx eofxVar = this.e;
        emxg emxgVar = this.f;
        return "futureSupplier=[" + this.d.toString() + "], shouldContinue=[" + emxgVar.toString() + "], strategy=[" + eofxVar.toString() + "], tries=[" + this.j + "]" + (listenableFuture.isDone() ? "" : a.a(obj, ", activeTry=[", "]"));
    }

    @Override // defpackage.ernr
    protected final void gQ() {
        ListenableFuture listenableFuture = (ListenableFuture) this.o.getAndSet(erqt.g());
        if (listenableFuture != null) {
            boolean z = true;
            if (isCancelled() && !n()) {
                z = false;
            }
            listenableFuture.cancel(z);
        }
    }
}
