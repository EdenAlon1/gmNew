package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.dittosatellite.backgroundhandler.SatelliteBackgroundHandlerService;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acjw implements acjc {
    public static final entd a = entd.c("BugleSatelliteBg");
    public final Context b;
    public final errl c;
    public final Intent d;
    public final Set e = new HashSet();
    public final AtomicReference f = new AtomicReference(Optional.empty());
    public final AtomicBoolean g = new AtomicBoolean(false);
    private final Executor h;

    public acjw(Context context, errl errlVar) {
        this.b = context;
        this.c = errlVar;
        this.d = akuv.c(context, SatelliteBackgroundHandlerService.class, "android.intent.action.VIEW").a();
        this.h = new ersb(errlVar);
    }

    @Override // defpackage.acjc
    public final elfl a() {
        return elfo.h(new erog() { // from class: acjl
            @Override // defpackage.erog
            public final ListenableFuture a() {
                acjw acjwVar = acjw.this;
                acjwVar.f();
                if (!((Optional) acjwVar.f.get()).isPresent()) {
                    return elfo.e(false);
                }
                ((ensz) ((ensz) acjw.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl", "pauseBackgroundHandler", 132, "SatelliteBackgroundHandlerManagerImpl.java")).q("Pausing Ditto background service");
                return acjwVar.e(new Function() { // from class: acjj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        Object obj2;
                        obj2 = ((ackb) obj).b.get();
                        return ((acrw) obj2).c();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).h(new emwl() { // from class: acjk
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        Boolean bool = (Boolean) obj;
                        ((ensz) ((ensz) acjw.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl", "pauseBackgroundHandler", 137, "SatelliteBackgroundHandlerManagerImpl.java")).q("Successfully paused Ditto background service");
                        return bool;
                    }
                }, acjwVar.c);
            }
        }, this.h);
    }

    @Override // defpackage.acjc
    public final elfl b() {
        this.g.set(true);
        ((ensz) ((ensz) a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl", "startOrResumeBackgroundHandler", 94, "SatelliteBackgroundHandlerManagerImpl.java")).q("Starting Ditto background service");
        return e(new Function() { // from class: acje
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object obj2;
                obj2 = ((ackb) obj).b.get();
                return ((acrw) obj2).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).h(new emwl() { // from class: acjf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                ((ensz) ((ensz) acjw.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl", "startOrResumeBackgroundHandler", 99, "SatelliteBackgroundHandlerManagerImpl.java")).q("Successfully started Ditto background service");
                return bool;
            }
        }, this.c);
    }

    @Override // defpackage.acjc
    public final elfl c() {
        return elfo.f(new Runnable() { // from class: acjh
            @Override // java.lang.Runnable
            public final void run() {
                acjw acjwVar = acjw.this;
                acjwVar.f();
                Optional optional = (Optional) acjwVar.f.getAndSet(Optional.empty());
                final Context context = acjwVar.b;
                context.getClass();
                optional.ifPresent(new Consumer() { // from class: acjg
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        context.unbindService((acjv) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                acjwVar.b.stopService(acjwVar.d);
                acjwVar.g.set(false);
                ((ensz) ((ensz) acjw.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl", "stopBackgroundHandler", 156, "SatelliteBackgroundHandlerManagerImpl.java")).q("Stopped Ditto background service");
            }
        }, this.h);
    }

    @Override // defpackage.acjc
    public final elfl d() {
        return b().e(Exception.class, new emwl() { // from class: acji
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((ensz) ((ensz) ((ensz) acjw.a.j()).g((Exception) obj)).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl", "tryToStartOrResumeBackgroundHandler", 116, "SatelliteBackgroundHandlerManagerImpl.java")).q("Could not start the background handler service.");
                return false;
            }
        }, this.c);
    }

    public final elfl e(final Function function) {
        final elfl h = elfj.e(new eros() { // from class: acjr
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                acjw acjwVar = acjw.this;
                acjwVar.b.startService(acjwVar.d);
                if (((Optional) acjwVar.f.get()).isEmpty()) {
                    ((ensz) ((ensz) acjw.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl", "attachServiceHealthMonitoringConnection", 249, "SatelliteBackgroundHandlerManagerImpl.java")).q("HealthMonitoringConnection connecting");
                    acjv acjvVar = new acjv(acjwVar);
                    AtomicReference atomicReference = acjwVar.f;
                    Optional empty = Optional.empty();
                    Optional of = Optional.of(acjvVar);
                    while (true) {
                        if (atomicReference.compareAndSet(empty, of)) {
                            acjwVar.b.bindService(acjwVar.d, acjvVar, 20);
                            break;
                        }
                        if (atomicReference.get() != empty) {
                            break;
                        }
                    }
                }
                acju acjuVar = new acju();
                erpcVar.a(eldl.j(new acjs(acjwVar, acjwVar.d, acjuVar)), erpp.a);
                return elfj.c(acjuVar.b).a;
            }
        }, this.h).g(new erot() { // from class: acjm
            @Override // defpackage.erot
            public final erph a(erpc erpcVar, Object obj) {
                Object apply;
                Optional optional = (Optional) obj;
                entd entdVar = acjw.a;
                optional.getClass();
                if (!optional.isPresent()) {
                    throw new CancellationException();
                }
                apply = Function.this.apply((ackb) optional.get());
                return elfj.c((ListenableFuture) apply).a;
            }
        }, this.c).h();
        return elfo.g(new Callable() { // from class: acjn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(acjw.this.e.add(h));
            }
        }, this.h).i(new eroh() { // from class: acjo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                entd entdVar = acjw.a;
                return elfl.this;
            }
        }, this.c).h(new emwl() { // from class: acjp
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Boolean bool = (Boolean) obj;
                acjw.this.e.remove(h);
                return bool;
            }
        }, this.h).f(Exception.class, new eroh() { // from class: acjq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                acjw acjwVar = acjw.this;
                final Exception exc = (Exception) obj;
                acjwVar.e.remove(h);
                ((ensz) ((ensz) acjw.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerManagerImpl", "makeAsyncCallOnBoundBackgroundHandlerServicePeer", 208, "SatelliteBackgroundHandlerManagerImpl.java")).q("Stopping Ditto background service due to an exception");
                return acjwVar.c().h(new emwl() { // from class: acjd
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        entd entdVar = acjw.a;
                        Exception exc2 = exc;
                        if (!(exc2 instanceof RuntimeException)) {
                            throw new IllegalStateException(exc2);
                        }
                        exc2.getClass();
                        throw ((RuntimeException) exc2);
                    }
                }, acjwVar.c);
            }
        }, this.h);
    }

    public final void f() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((elfl) it.next()).cancel(false);
        }
        this.e.clear();
    }
}
