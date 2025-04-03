package defpackage;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.messaging.R;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejwz {
    public final dlpw a;
    public final ejvw b;
    public final ejlj c;
    public final Executor d;
    public ejvv f;
    public ejwc h;
    public ejwb i;
    public ejwe j;
    public final ejld k;
    public final ejld l;
    public boolean e = false;
    public final AtomicReference g = new AtomicReference(null);

    public ejwz(ejuh ejuhVar, dlpw dlpwVar, ejvw ejvwVar, ejlj ejljVar, Executor executor) {
        ejwd ejwdVar = ejwe.f;
        emux emuxVar = emux.a;
        this.j = new ejuc(0L, ejwdVar, false, emuxVar, emuxVar);
        this.k = new ejld(2, new emwl() { // from class: ejwo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((ejvc) obj).a.cancel(false);
                return null;
            }
        });
        this.l = new ejld(1, new emwl() { // from class: ejwp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((ejvg) obj).c();
                return null;
            }
        });
        this.a = dlpwVar;
        this.b = ejvwVar;
        this.c = ejljVar;
        ejua ejuaVar = new ejua(ejuhVar, ejuhVar.c(), new ejul(), 0L, 1, new ejub(ejuhVar, Long.MIN_VALUE, new ejts(0L), new ejtt(0L), 0, Instant.ofEpochMilli(Long.MIN_VALUE)));
        this.i = ejuaVar;
        this.h = ejuaVar.e;
        this.d = executor;
    }

    public static ejwe a(ejwe ejweVar, boolean z, ejvg ejvgVar) {
        emxc j;
        emxc emxcVar;
        ejwe f;
        ejuc ejucVar = (ejuc) ejweVar;
        emxc emxcVar2 = ejucVar.e;
        if (emxcVar2.g() && emxcVar2.c() == ejvgVar) {
            j = z ? emxc.j(ejvgVar.a().e()) : emux.a;
            emxcVar = emux.a;
            f = ejweVar.f(ejvgVar);
        } else {
            if (!ejucVar.e.g()) {
                emxc emxcVar3 = ejucVar.d;
                if (emxcVar3.g() && emxcVar3.c() == ejvgVar) {
                    j = emxc.j(((ejvg) ejucVar.d.c()).a().e());
                    emux emuxVar = emux.a;
                    f = ejweVar.f((ejvg) ejucVar.d.c());
                    emxcVar = emuxVar;
                }
            }
            emxc emxcVar4 = ejucVar.e;
            if (!emxcVar4.g() || !((ejvg) emxcVar4.c()).a().e().equals(ejvgVar.a().e())) {
                j = emxc.j(ejvgVar.a().e());
                emxcVar = ejucVar.d;
                f = ejweVar.f(ejvgVar);
            } else if (z) {
                j = emxc.j(ejvgVar.a().e());
                emxcVar = emxc.j(ejucVar.d.c());
                f = ejweVar.f(ejvgVar);
            } else {
                j = emux.a;
                emxcVar = emxc.j(ejvgVar);
                f = ejweVar;
            }
        }
        if (j.g()) {
            ekzz f2 = eleg.f("SubscriptionCallbacks.onNewData");
            try {
                ejkt a = ejku.a();
                try {
                    ((ejuc) ejweVar).b.b(ejvgVar.a().e());
                    a.close();
                    f2.close();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    f2.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (emxcVar.g()) {
            ((ejvg) emxcVar.c()).c();
        }
        return f;
    }

    public static void g(ejud ejudVar) {
        ekzz f = eleg.f("BackgroundCallbacks.onBackgroundFetch");
        try {
            ejudVar.a();
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void h(ejud ejudVar) {
        ekzz f = eleg.f("BackgroundCallbacks.onBackgroundFetchSucceeded");
        try {
            ejudVar.b();
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    final void b() {
        ejvv ejvvVar = this.f;
        if (ejvvVar != null) {
            this.b.e(((ejua) this.i).b, ejvvVar);
            this.f = null;
        }
        this.k.a();
        this.l.a();
        emxc emxcVar = ((ejuc) this.j).d;
        if (emxcVar.g()) {
            ((ejvg) emxcVar.c()).c();
        }
        ejuc ejucVar = (ejuc) this.j;
        emxc emxcVar2 = ejucVar.e;
        if (!emxcVar2.g() || emxcVar2.equals(ejucVar.d)) {
            return;
        }
        ((ejvg) ((ejuc) this.j).e.c()).c();
    }

    public final void c(ejwc ejwcVar, ejvg ejvgVar) {
        emxf.l(ejvgVar.a().f());
        ejwe a = a(this.j, this.e, ejvgVar);
        this.j = a;
        this.h = ejwcVar;
        if (this.e) {
            ejwd ejwdVar = ((ejuc) a).b;
            if (ejwdVar instanceof elib) {
                elib elibVar = (elib) ejwdVar;
                ekzz f = eleg.f("RefreshCallbacks.onRefreshSucceeded");
                try {
                    ((SwipeRefreshLayout) elibVar.a.a.N().findViewById(R.id.pull_to_refresh)).d(false);
                    f.close();
                    this.e = false;
                } catch (Throwable th) {
                    try {
                        f.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        }
    }

    final void d() {
        ejuc ejucVar = (ejuc) this.j;
        this.j = new ejuc(ejucVar.a + 1, ejwe.f, false, ejucVar.d, emux.a);
    }

    public final void e(ejwc ejwcVar) {
        ekzz f;
        efbd.c();
        ejuc ejucVar = (ejuc) this.j;
        if (!ejucVar.d.g() && !this.e) {
            ejwd ejwdVar = ejucVar.b;
            f = eleg.f("SubscriptionCallbacks.onPending");
            try {
                ejkt a = ejku.a();
                try {
                    ejwdVar.hB();
                    a.close();
                    f.close();
                } finally {
                }
            } finally {
            }
        } else if ((ejucVar.b instanceof ejud) && this.k.b()) {
            ejwe ejweVar = this.j;
            if (!((ejuc) ejweVar).c) {
                ejwe g = ejweVar.g(true);
                this.j = g;
                g((ejud) ((ejuc) g).b);
            }
        }
        ejub ejubVar = (ejub) ejwcVar;
        ejuh ejuhVar = ejubVar.a;
        long j = ejubVar.b;
        ejts ejtsVar = (ejts) ejubVar.c;
        emxf.m(ejtsVar.a != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        final ejub ejubVar2 = new ejub(ejuhVar, j, new ejts(ejtsVar.a + 1), ejubVar.d, ejubVar.e, ejubVar.f);
        ejuh ejuhVar2 = ejubVar2.a;
        f = eleg.f("DataSource fetchAndStoreData()");
        try {
            ListenableFuture b = ejuhVar2.b();
            f.b(b);
            final ejvc ejvcVar = new ejvc(b);
            f.close();
            this.k.d(ejvcVar);
            ejvcVar.a.b(eldl.l(new Runnable() { // from class: ejws
                @Override // java.lang.Runnable
                public final void run() {
                    final ejwz ejwzVar = ejwz.this;
                    final ejwc ejwcVar2 = ejubVar2;
                    final ejvc ejvcVar2 = ejvcVar;
                    ejwzVar.c.execute(new Runnable() { // from class: ejwu
                        @Override // java.lang.Runnable
                        public final void run() {
                            ejwz ejwzVar2 = ejwz.this;
                            ejwc ejwcVar3 = ejwcVar2;
                            ejld ejldVar = ejwzVar2.k;
                            ejvc ejvcVar3 = ejvcVar2;
                            if (!ejldVar.c(ejvcVar3) || ejvcVar3.a.isCancelled()) {
                                return;
                            }
                            efbd.c();
                            try {
                                try {
                                    erqt.q(ejvcVar3.a);
                                    if ((((ejub) ejwcVar3).a.c() instanceof ejvi) && ejwcVar3.h(ejwzVar2.h)) {
                                        ejvw ejvwVar = ejwzVar2.b;
                                        ejvr ejvrVar = (ejvr) ejvwVar;
                                        ejvrVar.c(erqt.i(null), ((ejub) ejwcVar3).a.c(), ejvu.a, emux.a, ejwzVar2.c);
                                        return;
                                    }
                                    if (ejwcVar3.h(ejwzVar2.h)) {
                                        if (((ejuc) ejwzVar2.j).c && ejwzVar2.j()) {
                                            emxf.m(((ejuc) ejwzVar2.j).d.g(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                                            ejwz.h((ejud) ((ejuc) ejwzVar2.j).b);
                                            ejwzVar2.j = ejwzVar2.j.g(false);
                                            return;
                                        }
                                        return;
                                    }
                                    ejwzVar2.f(ejwcVar3);
                                    ejvw ejvwVar2 = ejwzVar2.b;
                                    ListenableFuture i = erqt.i(null);
                                    Object c = ((ejub) ejwcVar3).a.c();
                                    ejvv ejvvVar = ejwzVar2.f;
                                    ejvr ejvrVar2 = (ejvr) ejvwVar2;
                                    ejvrVar2.c(i, c, ejvu.a, emxc.j(ejvvVar), ejwzVar2.c);
                                } catch (ExecutionException e) {
                                    ejwzVar2.i(e.getCause());
                                }
                            } catch (Throwable th) {
                                ejwzVar2.d.execute(new Runnable() { // from class: ejwt
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        throw th;
                                    }
                                });
                            }
                        }
                    });
                }
            }), erpp.a);
        } finally {
        }
    }

    public final void f(ejwc ejwcVar) {
        efbd.c();
        ejub ejubVar = (ejub) ejwcVar;
        ejtt ejttVar = (ejtt) ejubVar.d;
        emxf.m(ejttVar.a != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        final ejub ejubVar2 = new ejub(ejubVar.a, ejubVar.b, ejubVar.c, new ejtt(ejttVar.a + 1), ejubVar.e + 1, ejubVar.f);
        ejuh ejuhVar = ejubVar2.a;
        ekzz f = eleg.f("DataSource loadData()");
        try {
            erph a = ejuhVar.a();
            f.a(a);
            final ejvg ejvgVar = new ejvg(a);
            f.close();
            this.l.d(ejvgVar);
            ejvgVar.b().b(eldl.l(new Runnable() { // from class: ejwq
                @Override // java.lang.Runnable
                public final void run() {
                    final ejwz ejwzVar = ejwz.this;
                    final ejwc ejwcVar2 = ejubVar2;
                    final ejvg ejvgVar2 = ejvgVar;
                    ejwzVar.c.execute(new Runnable() { // from class: ejwr
                        @Override // java.lang.Runnable
                        public final void run() {
                            efbd.c();
                            ejwz ejwzVar2 = ejwz.this;
                            ejwc ejwcVar3 = ejwcVar2;
                            emxf.m(!ejwcVar3.equals(ejwzVar2.h), "The same LoadTask was processed twice.");
                            ejvg ejvgVar3 = ejvgVar2;
                            emxf.l(ejvgVar3.b().isDone());
                            if (!ejwzVar2.l.c(ejvgVar3) || ejvgVar3.b().isCancelled()) {
                                return;
                            }
                            try {
                                try {
                                    if (ejwcVar3.h(ejwzVar2.h)) {
                                        ejvgVar3.c();
                                    } else if (!ejvgVar3.b().isCancelled()) {
                                        int a2 = ((ejua) ejwzVar2.i).c.a(((ejub) ejwcVar3).f, ejvgVar3.a(), !ejwcVar3.i()) - 1;
                                        if (a2 == 0) {
                                            ejvgVar3.c();
                                            if (ejwcVar3.i()) {
                                                ejve ejveVar = new ejve();
                                                ejveVar.addSuppressed(eldx.c());
                                                ejwzVar2.i(ejveVar);
                                            } else {
                                                ejwzVar2.e(ejwcVar3);
                                            }
                                        } else if (a2 != 1) {
                                            ejwzVar2.c(ejwcVar3, ejvgVar3);
                                            if (ejwcVar3.i()) {
                                                ejve ejveVar2 = new ejve();
                                                ejveVar2.addSuppressed(eldx.c());
                                                ejwzVar2.i(ejveVar2);
                                            } else {
                                                ejwzVar2.e(ejwcVar3);
                                            }
                                        } else {
                                            ejwzVar2.c(ejwcVar3, ejvgVar3);
                                            if (((ejuc) ejwzVar2.j).c && ejwzVar2.j()) {
                                                emxf.m(((ejuc) ejwzVar2.j).d.g(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                                                ejwz.h((ejud) ((ejuc) ejwzVar2.j).b);
                                                ejwzVar2.j = ejwzVar2.j.g(false);
                                            }
                                        }
                                    }
                                    if (((ejuc) ejwzVar2.j).c && ejwzVar2.j()) {
                                        emxf.m(((ejuc) ejwzVar2.j).d.g(), "Completed load, fetch is still open, and the callbacks didn't receive data. This is an impossible state.");
                                        ejwz.h((ejud) ((ejuc) ejwzVar2.j).b);
                                        ejwzVar2.j = ejwzVar2.j.g(false);
                                    }
                                } catch (ejwf e) {
                                    ejwzVar2.i(e.getCause());
                                }
                            } catch (Throwable th) {
                                ejwzVar2.d.execute(new Runnable() { // from class: ejwv
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        throw th;
                                    }
                                });
                            }
                        }
                    });
                }
            }), erpp.a);
        } finally {
        }
    }

    public final void i(Throwable th) {
        ejuc ejucVar = (ejuc) this.j;
        if (ejucVar.d.g()) {
            ejwd ejwdVar = ejucVar.b;
            if (ejwdVar instanceof elib) {
                elib elibVar = (elib) ejwdVar;
                ekzz f = eleg.f("RefreshCallbacks.onRefreshError");
                try {
                    ((SwipeRefreshLayout) elibVar.a.a.N().findViewById(R.id.pull_to_refresh)).d(false);
                    f.close();
                    this.e = false;
                } catch (Throwable th2) {
                    try {
                        f.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } else {
            ejwd ejwdVar2 = ejucVar.b;
            ekzz f2 = eleg.f("SubscriptionCallbacks.onError");
            try {
                ejkt a = ejku.a();
                try {
                    ejwdVar2.a(th);
                    a.close();
                    f2.close();
                } finally {
                }
            } catch (Throwable th4) {
                try {
                    f2.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
        if (((ejuc) this.j).c && j()) {
            ejud ejudVar = (ejud) ((ejuc) this.j).b;
            ekzz f3 = eleg.f("BackgroundCallbacks.onBackgroundFetchError");
            try {
                ejudVar.c();
                f3.close();
                this.j = this.j.g(false);
            } catch (Throwable th6) {
                try {
                    f3.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        }
    }

    public final boolean j() {
        if (!(((ejuc) this.j).b instanceof ejud) || !this.k.b() || !this.l.b()) {
            return false;
        }
        emxf.l(((ejuc) this.j).c);
        return true;
    }
}
