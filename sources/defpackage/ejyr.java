package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejyr {
    public static final enru a = enru.c("com/google/apps/tiktok/dataservice/local/LocalSubscriptionMixinUpdater");
    public final engf b;
    public final Executor c;
    public final Executor d;
    public final ejlj e;
    public final Set f = new cmj();
    public Set g = new cmj();
    public int h = 2;

    public ejyr(engf engfVar, Executor executor, Executor executor2, ejlj ejljVar) {
        this.b = engfVar;
        this.c = executor;
        this.d = executor2;
        this.e = ejljVar;
    }

    public static void b(ejxk ejxkVar, ejyx ejyxVar) {
        ekzz f;
        ejkt a2;
        efbd.c();
        if (ejyxVar.c()) {
            f = eleg.f("LocalSubscription onLoaded()");
            try {
                a2 = ejku.a();
                try {
                    ejxkVar.b(ejyxVar.b());
                    a2.close();
                    f.close();
                    return;
                } finally {
                }
            } finally {
            }
        }
        f = eleg.f("LocalSubscription onLoadError()");
        try {
            a2 = ejku.a();
            try {
                ejxkVar.a(ejyxVar.a());
                a2.close();
                f.close();
            } finally {
                try {
                    a2.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } finally {
        }
    }

    private final void e(final ListenableFuture listenableFuture) {
        efbd.c();
        this.g.add(listenableFuture);
        listenableFuture.b(eldl.l(new Runnable() { // from class: ejye
            @Override // java.lang.Runnable
            public final void run() {
                Set set = ejyr.this.g;
                if (set != null) {
                    set.remove(listenableFuture);
                }
            }
        }), this.d);
    }

    public final void a(final ejyu ejyuVar, ListenableFuture listenableFuture) {
        e(elfr.e(elfr.j(erqt.j(listenableFuture), new emwl() { // from class: ejyh
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ejyu ejyuVar2 = ejyuVar;
                ejyuVar2.a();
                ejyr.this.c(ejyuVar2);
                return null;
            }
        }, this.d), Throwable.class, new emwl() { // from class: ejyi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                boolean z = th instanceof CancellationException;
                ejyr ejyrVar = ejyr.this;
                ejyu ejyuVar2 = ejyuVar;
                if (z) {
                    throw ((CancellationException) th);
                }
                try {
                    ejyuVar2.a();
                    ejyrVar.c(ejyuVar2);
                    return null;
                } catch (NullPointerException e) {
                    ((enrr) ((enrr) ((enrr) ejyr.a.i()).g(e)).h("com/google/apps/tiktok/dataservice/local/LocalSubscriptionMixinUpdater", "appendLoadCompletion", (char) 334, "LocalSubscriptionMixinUpdater.java")).q("LocalSubscriptionMixinUpdater silently ignored NullPointerException");
                    throw e;
                }
            }
        }, this.d));
    }

    public final void c(ejyu ejyuVar) {
        efbd.c();
        this.f.add(ejyuVar);
        if (this.h == 2) {
            this.h = 1;
            e(elfr.g(new Runnable() { // from class: ejyl
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    efbd.c();
                    ejyr ejyrVar = ejyr.this;
                    emxf.m(ejyrVar.h == 1, "Duplicate or leaked callback task.");
                    int i = engw.d;
                    engr engrVar = new engr();
                    ejyrVar.h = 2;
                    cmi cmiVar = new cmi((cmj) ejyrVar.f);
                    while (cmiVar.hasNext()) {
                        ejyu ejyuVar2 = (ejyu) cmiVar.next();
                        efbd.c();
                        ejys ejysVar = ejyuVar2.a;
                        ejysVar.getClass();
                        emxf.m(ejysVar.c().g(), "Isolation failure in updateToPublish(). The state to publish has gone missing. Please report this error as a P1 bug at go/tiktok-bug.");
                        ejys ejysVar2 = ejyuVar2.a;
                        ejyuVar2.a = ejysVar2.e((ejyx) ejysVar2.c().c());
                        engrVar.h(new ejxe((ejxk) ((enot) ejyrVar.b).d.get(ejyuVar2), (ejyx) ejyuVar2.a.d().c()));
                    }
                    ejyrVar.f.clear();
                    engw g = engrVar.g();
                    int i2 = ((enou) g).c;
                    for (int i3 = 0; i3 < i2; i3++) {
                        ejyq ejyqVar = (ejyq) g.get(i3);
                        try {
                            ejyr.b(ejyqVar.a(), ejyqVar.b());
                        } catch (Throwable th) {
                            ejyrVar.c.execute(eldl.l(new Runnable() { // from class: ejyk
                                @Override // java.lang.Runnable
                                public final void run() {
                                    throw th;
                                }
                            }));
                        }
                    }
                }
            }, this.e));
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [ejxi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    public final void d(final ejyu ejyuVar) {
        emxs emxsVar = new emxs() { // from class: ejym
            @Override // defpackage.emxs
            public final void a(Object obj) {
                ejyr.this.a(ejyuVar, (ListenableFuture) obj);
            }
        };
        efbd.c();
        ejys ejysVar = ejyuVar.a;
        ejysVar.getClass();
        emxs emxsVar2 = new emxs() { // from class: ejyt
            @Override // defpackage.emxs
            public final void a(Object obj) {
                ejyu.this.a = (ejys) obj;
            }
        };
        if (ejysVar.a().g()) {
            ejysVar.a().c().cancel(false);
        }
        if (ejysVar.b().g()) {
            ekzz f = eleg.f("LocalSubscription newLoad");
            try {
                ListenableFuture b = ejysVar.b().c().b();
                f.b(b);
                emxsVar2.a(new ejxf(ejysVar.b(), emxc.j(b), ejysVar.c(), ejysVar.d()));
                emxsVar.a(b);
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
    }
}
