package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.Closeable;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class acra implements acql {
    public final acpg a;
    public final AtomicReference b = new AtomicReference(Optional.empty());
    final /* synthetic */ acrw c;

    public acra(acrw acrwVar, acpg acpgVar) {
        this.c = acrwVar;
        this.a = acpgVar;
    }

    @Override // defpackage.acql
    public final acrp a() {
        return acrp.CONNECTED;
    }

    @Override // defpackage.acql
    public final acrp b() {
        return acrp.CONNECTING;
    }

    @Override // defpackage.acql
    public final elfl c() {
        acrw acrwVar = this.c;
        acrwVar.g.b(acrwVar.j);
        return e(3).h(new emwl() { // from class: acqx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                acra acraVar = acra.this;
                acrw acrwVar2 = acraVar.c;
                Void r4 = (Void) obj;
                acrwVar2.g.n(acrwVar2.j);
                acraVar.c.e.c("Bugle.Satellite.DittoLoadSuccess.Count");
                return r4;
            }
        }, this.c.c).e(Exception.class, new emwl() { // from class: acqy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                acrw acrwVar2 = acra.this.c;
                Exception exc = (Exception) obj;
                acrwVar2.g.e(acrwVar2.j);
                if (exc instanceof RuntimeException) {
                    throw ((RuntimeException) exc);
                }
                throw new IllegalStateException(exc);
            }
        }, this.c.c);
    }

    @Override // defpackage.acql
    public final void d() {
        ((Optional) this.b.getAndSet(Optional.empty())).ifPresent(new Consumer() { // from class: acqu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                acra acraVar = acra.this;
                ((acuq) acraVar.c.b.b()).b(acraVar.c.i, (acyu) obj);
                final acpg acpgVar = acraVar.a;
                acpgVar.getClass();
                elfo.f(new Runnable() { // from class: acqt
                    @Override // java.lang.Runnable
                    public final void run() {
                        acpg.this.b();
                    }
                }, acraVar.c.d).k(axnw.b(), acraVar.c.c);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final elfl e(final int i) {
        if (i != 0) {
            return elfo.g(new Callable() { // from class: acqz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return acra.this.a.a(enoz.a);
                }
            }, this.c.d).i(new eroh() { // from class: acqo
                /* JADX WARN: Type inference failed for: r0v20, types: [acvn, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v22, types: [acvn, java.lang.Object] */
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    final acra acraVar;
                    AtomicReference atomicReference;
                    acum acumVar;
                    acum acumVar2;
                    elfl j;
                    acyu acyuVar = (acyu) obj;
                    Optional empty = Optional.empty();
                    Optional of = Optional.of(acyuVar);
                    do {
                        acraVar = acra.this;
                        atomicReference = acraVar.b;
                        if (atomicReference.compareAndSet(empty, of)) {
                            break;
                        }
                    } while (atomicReference.get() == empty);
                    ListenableFuture[] listenableFutureArr = new ListenableFuture[2];
                    acyuVar.getClass();
                    listenableFutureArr[0] = (ListenableFuture) acyuVar.a().map(new Function() { // from class: acyp
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((acyj) obj2).d;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).orElseThrow(new Supplier() { // from class: acqv
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new IllegalStateException();
                        }
                    });
                    acrw acrwVar = acraVar.c;
                    ((Optional) acrwVar.k.getAndSet(Optional.of(acyuVar))).ifPresent(new Consumer() { // from class: acqr
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj2) {
                            acra acraVar2 = acra.this;
                            ((acuq) acraVar2.c.b.b()).b(acraVar2.c.i, (acyu) obj2);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    final acuq acuqVar = (acuq) acraVar.c.b.b();
                    acrw acrwVar2 = acraVar.c;
                    Map map = (Map) ((acuu) acrwVar2.h.b()).a.b();
                    map.getClass();
                    acut acutVar = new acut(map);
                    final acua acuaVar = acrwVar2.i;
                    if (acuaVar == acua.AGNOSTIC) {
                        throw new IllegalStateException("Cannot connect a WebView with the agnostic host type");
                    }
                    synchronized (acuq.b) {
                        acumVar = (acum) acuqVar.i.get(acuaVar);
                    }
                    if (acumVar != null) {
                        if (acumVar.h() && acumVar.d().equals(acyuVar)) {
                            if (acumVar.g()) {
                                acuqVar.f(acuaVar);
                            }
                            j = elfo.e(false);
                            listenableFutureArr[1] = j.i(new eroh() { // from class: acqs
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj2) {
                                    Boolean bool = (Boolean) obj2;
                                    bool.getClass();
                                    if (!bool.booleanValue()) {
                                        throw new IllegalStateException("JsBridgeManager did not create new channel");
                                    }
                                    ((ensz) ((ensz) acrw.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectOperation", "createJsBridgeInternal", 590, "JsBridgeDittoControllerV2.java")).q("ConnectOperation establishing new connection");
                                    return elfo.e(null);
                                }
                            }, acraVar.c.c);
                            return elfo.m(listenableFutureArr).a(new Callable() { // from class: acqw
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    return null;
                                }
                            }, acraVar.c.c);
                        }
                        acuqVar.b(acuaVar, acumVar.d());
                    }
                    final acvo a = acuqVar.f.b().a(acyuVar, "sat_jsb_dittotobugle", new acuf(acuqVar, acuaVar));
                    final acvo a2 = acuqVar.f.b().a(acyuVar, "sat_jsb_bugletoditto", new acup(acuqVar, acuaVar));
                    final emwl emwlVar = new emwl() { // from class: actu
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            final acum acumVar3 = (acum) obj2;
                            final acuq acuqVar2 = acuq.this;
                            final acvo acvoVar = a;
                            final acua acuaVar2 = acuaVar;
                            final acvo acvoVar2 = a2;
                            return elfj.e(new eros() { // from class: actw
                                @Override // defpackage.eros
                                public final erph a(erpc erpcVar) {
                                    acuq acuqVar3 = acuq.this;
                                    erpcVar.a(eldl.j(new acub(acuqVar3, acuaVar2, acumVar3)), erpp.a);
                                    acvm acvmVar = acvm.CONNECTED;
                                    acvo acvoVar3 = acvoVar;
                                    actl actlVar = new actl(acvoVar3);
                                    acvm acvmVar2 = acvm.CONNECTED;
                                    acvo acvoVar4 = acvoVar2;
                                    erph erphVar = elfj.c(elfo.b(acuqVar3.d.a(acvmVar, "Connecting incoming request channel", actlVar), acuqVar3.d.a(acvmVar2, "Connecting outgoing request channel", new actl(acvoVar4))).h(new emwl() { // from class: acts
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj3) {
                                            cskc cskcVar = acuq.a;
                                            return null;
                                        }
                                    }, acuqVar3.e)).a;
                                    acvoVar3.d();
                                    acvoVar4.d();
                                    return erphVar;
                                }
                            }, acuqVar2.e).h();
                        }
                    };
                    final AtomicReference atomicReference2 = new AtomicReference(Optional.empty());
                    final emyl emylVar = new emyl() { // from class: acuh
                        @Override // defpackage.emyl
                        public final Object get() {
                            return (acum) ((Optional) atomicReference2.get()).orElseThrow(new Supplier() { // from class: acug
                                @Override // java.util.function.Supplier
                                public final Object get() {
                                    return new IllegalStateException();
                                }
                            });
                        }
                    };
                    atomicReference2.set(Optional.of(new acsv(acyuVar, a, a2, acutVar, emys.a(new emyl() { // from class: acui
                        @Override // defpackage.emyl
                        public final Object get() {
                            return emwl.this.apply(emylVar.get());
                        }
                    }), false, new ConcurrentHashMap())));
                    Object obj2 = emylVar.get();
                    final Consumer consumer = new Consumer() { // from class: actr
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj3) {
                            acuq acuqVar2 = acuq.this;
                            acua acuaVar2 = acuaVar;
                            if (acuqVar2.h(acuaVar2)) {
                                acuqVar2.e(acuaVar2);
                            }
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer2) {
                            return Consumer$CC.$default$andThen(this, consumer2);
                        }
                    };
                    final acum acumVar3 = (acum) obj2;
                    final ctbx c = acumVar3.b().c("attachChannelToOpenCompleters", new ctbf() { // from class: acuj
                        @Override // defpackage.ctbf
                        public final elfl a(Object obj3) {
                            consumer.o(Boolean.valueOf(acum.this.h()));
                            return elfo.e(null);
                        }
                    });
                    final ctbx c2 = acumVar3.c().c("attachChannelToOpenCompleters", new ctbf() { // from class: acuk
                        @Override // defpackage.ctbf
                        public final elfl a(Object obj3) {
                            consumer.o(Boolean.valueOf(acum.this.h()));
                            return elfo.e(null);
                        }
                    });
                    acumVar3.f().put(eldl.j(new Closeable() { // from class: acul
                        @Override // java.io.Closeable, java.lang.AutoCloseable
                        public final void close() {
                            ctbx.this.a();
                            c2.a();
                        }
                    }), true);
                    synchronized (acuq.b) {
                        acumVar2 = (acum) acuqVar.i.get(acuaVar);
                        acuqVar.i.put(acuaVar, obj2);
                    }
                    if (acumVar2 != null) {
                        try {
                            acumVar2.close();
                        } catch (IOException e) {
                            acuq.a.o("Failed when closing a JsBridgeChannel", e);
                        }
                    }
                    j = ((elfl) acumVar3.e().get()).h(new emwl() { // from class: actt
                        @Override // defpackage.emwl
                        public final Object apply(Object obj3) {
                            acuq.this.e(acuaVar);
                            return true;
                        }
                    }, acuqVar.e).j(60000L, TimeUnit.MILLISECONDS, acuqVar.e);
                    listenableFutureArr[1] = j.i(new eroh() { // from class: acqs
                        @Override // defpackage.eroh
                        public final ListenableFuture a(Object obj22) {
                            Boolean bool = (Boolean) obj22;
                            bool.getClass();
                            if (!bool.booleanValue()) {
                                throw new IllegalStateException("JsBridgeManager did not create new channel");
                            }
                            ((ensz) ((ensz) acrw.a.h()).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectOperation", "createJsBridgeInternal", 590, "JsBridgeDittoControllerV2.java")).q("ConnectOperation establishing new connection");
                            return elfo.e(null);
                        }
                    }, acraVar.c.c);
                    return elfo.m(listenableFutureArr).a(new Callable() { // from class: acqw
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return null;
                        }
                    }, acraVar.c.c);
                }
            }, this.c.d).f(acyi.class, new eroh() { // from class: acqp
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    acyi acyiVar = (acyi) obj;
                    ((ensz) ((ensz) ((ensz) acrw.a.j()).g(acyiVar)).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectOperation", "startWebViewInternal", (char) 554, "JsBridgeDittoControllerV2.java")).q("WebView load failed.");
                    acra acraVar = acra.this;
                    acraVar.d();
                    acyiVar.getClass();
                    acraVar.c.e.e("Bugle.Satellite.DittoLoadFailure.LoadError", acyiVar.a.getErrorCode());
                    return acraVar.e(i - 1);
                }
            }, this.c.c).f(TimeoutException.class, new eroh() { // from class: acqq
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    ((ensz) ((ensz) ((ensz) acrw.a.j()).g((TimeoutException) obj)).h("com/google/android/apps/messaging/dittosatellite/impl/JsBridgeDittoControllerV2$ConnectOperation", "startWebViewInternal", 566, "JsBridgeDittoControllerV2.java")).q("WebView connection timed out.");
                    acra acraVar = acra.this;
                    acraVar.d();
                    acraVar.c.e.c("Bugle.Satellite.DittoLoadFailure.JsBridgeTimeoutError.Count");
                    return acraVar.e(i - 1);
                }
            }, this.c.c);
        }
        throw new acqn();
    }
}
