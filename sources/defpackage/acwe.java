package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import j$.util.Optional;
import j$.util.concurrent.atomic.DesugarAtomicReference;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acwe implements acvo {
    public static final cskc a = cskc.g("Bugle", "MessagePortJsBridgeTransport");
    public final acyw b;
    public final errl c;
    public final errl d;
    public final acyu e;
    public final String f;
    public final acve g;
    public final ctby h;
    public final AtomicReference i = new AtomicReference(Optional.empty());
    public final AtomicBoolean j = new AtomicBoolean(false);
    public final eoel k = new eoel();

    public acwe(ctbk ctbkVar, acyw acywVar, errl errlVar, errl errlVar2, acyu acyuVar, String str, acve acveVar) {
        this.b = acywVar;
        this.c = errlVar;
        this.d = errlVar2;
        this.e = acyuVar;
        this.f = str;
        this.g = acveVar;
        this.h = new ctby(ctbkVar, acvm.NOT_STARTED);
    }

    @Override // defpackage.acvd
    public final void a(String str) {
        Optional optional = (Optional) this.i.get();
        if (!optional.isPresent()) {
            throw new acvb();
        }
        ((peu) optional.get()).d(new pes(str, (peu[]) null));
    }

    @Override // defpackage.acvo
    public final acvm b() {
        return (acvm) this.h.d();
    }

    @Override // defpackage.acvo
    public final ctbx c(String str, ctbf ctbfVar) {
        return this.h.a(str, ctbfVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.j.set(true);
        this.k.close();
        this.h.f(acvm.CLOSED);
        Optional optional = (Optional) this.i.getAndSet(Optional.empty());
        if (optional.isEmpty()) {
            a.p("Not closing channel, as no channel is open");
        } else {
            a.p("Closing channel");
            ((peu) optional.get()).c();
        }
    }

    @Override // defpackage.acvo
    public final void d() {
        a.p("Opening MessagePort JsBridge. Waiting for Ditto signal.");
        if (!this.e.b().isPresent()) {
            throw new IllegalStateException("WebView has been destroyed");
        }
        this.h.g(acvm.NOT_STARTED, acvm.CONNECTING);
        final acyu acyuVar = this.e;
        elfo.g(new Callable() { // from class: acvu
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return acyu.this.a();
            }
        }, this.d).h(new emwl() { // from class: acvv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Optional optional = (Optional) obj;
                final acwe acweVar = acwe.this;
                if (acweVar.j.get()) {
                    return null;
                }
                acwe.a.p("Waiting on new message port channel");
                optional.getClass();
                acyj acyjVar = (acyj) optional.orElseThrow(new Supplier() { // from class: acwc
                    @Override // java.util.function.Supplier
                    public final Object get() {
                        return new IllegalStateException("Could not get WebViewClient");
                    }
                });
                acweVar.k.a(acyjVar.a("MessagePortJsBridgeTransport detected Ditto load", new ctbf() { // from class: acvs
                    @Override // defpackage.ctbf
                    public final elfl a(Object obj2) {
                        acwe.this.f();
                        acwe.a.p("Received Ditto Load event.");
                        return elfo.e(null);
                    }
                }));
                acweVar.k.a(acyjVar.g.a(new ctbf() { // from class: acvt
                    @Override // defpackage.ctbf
                    public final elfl a(Object obj2) {
                        String str = (String) obj2;
                        final acwe acweVar2 = acwe.this;
                        if (str.equals("listening_on_".concat(acweVar2.f))) {
                            acwe.a.p("Received interceptor signal. Starting JsBridge connection");
                            acweVar2.f();
                            return elfo.g(new Callable() { // from class: acvx
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    acwe acweVar3 = acwe.this;
                                    return acweVar3.b.b(acweVar3.e);
                                }
                            }, acweVar2.d).h(new emwl() { // from class: acvy
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    peu[] peuVarArr = (peu[]) obj3;
                                    acwe.a.p("Ditto ready, establishing channel");
                                    int length = peuVarArr.length;
                                    if (length != 2) {
                                        throw new IllegalStateException(String.format("Port pair contains %d ports, not two", Integer.valueOf(length)));
                                    }
                                    acwe acweVar3 = acwe.this;
                                    ((Optional) acweVar3.i.getAndSet(Optional.of(peuVarArr[0]))).ifPresent(new Consumer() { // from class: acvw
                                        @Override // java.util.function.Consumer
                                        public final void accept(Object obj4) {
                                            ((peu) obj4).c();
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                    peuVarArr[0].e(new acwd(acweVar3));
                                    return new pes(acweVar3.f, new peu[]{peuVarArr[1]});
                                }
                            }, acweVar2.c).h(new emwl() { // from class: acvz
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    acwe acweVar3 = acwe.this;
                                    acyu acyuVar2 = acweVar3.e;
                                    pes pesVar = (pes) obj3;
                                    Optional map = acyuVar2.b().map(new Function() { // from class: acyt
                                        @Override // java.util.function.Function
                                        /* renamed from: andThen */
                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                            return Function$CC.$default$andThen(this, function);
                                        }

                                        @Override // java.util.function.Function
                                        public final Object apply(Object obj4) {
                                            return ((WebView) obj4).getUrl();
                                        }

                                        public final /* synthetic */ Function compose(Function function) {
                                            return Function$CC.$default$compose(this, function);
                                        }
                                    });
                                    if (map.isEmpty()) {
                                        acwe.a.r("WebView had no origin");
                                        throw new acvc();
                                    }
                                    enqu listIterator = acsw.a.listIterator();
                                    while (listIterator.hasNext()) {
                                        String str2 = (String) listIterator.next();
                                        if (((String) map.get()).startsWith(str2)) {
                                            acweVar3.b.a(acyuVar2, pesVar, Uri.parse(str2));
                                            return null;
                                        }
                                    }
                                    throw new acvc();
                                }
                            }, acweVar2.d).h(new emwl() { // from class: acwa
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    Void r4 = (Void) obj3;
                                    acwe.this.h.g(acvm.CONNECTING, acvm.CONNECTED);
                                    return r4;
                                }
                            }, acweVar2.c).e(Exception.class, new emwl() { // from class: acwb
                                @Override // defpackage.emwl
                                public final Object apply(Object obj3) {
                                    acwe.a.s("Could not connect to WebView", (Exception) obj3);
                                    acwe.this.h.g(acvm.CONNECTING, acvm.NOT_STARTED);
                                    return null;
                                }
                            }, acweVar2.c);
                        }
                        csjb c = acwe.a.c();
                        c.I("Ignoring interceptor signal");
                        c.A("signal", str);
                        c.r();
                        return elfo.e(null);
                    }
                }, "Subscribe to Ditto Request Interceptor Events", "MessagePortJsBridgeTransport detected Ditto interceptor signal", "Unsubscribe from Ditto Request Interceptor Events"));
                return null;
            }
        }, this.c).k(axnw.b(), this.c);
    }

    @Override // defpackage.acvo
    public final /* synthetic */ boolean e() {
        return acvl.a(this);
    }

    public final void f() {
        UnaryOperator unaryOperator = new UnaryOperator() { // from class: acvr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                acvm acvmVar = (acvm) obj;
                return (acvmVar == acvm.NOT_STARTED || acvmVar == acvm.CLOSED) ? acvmVar : acvm.CONNECTING;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        };
        ctby ctbyVar = this.h;
        ctby.h(DesugarAtomicReference.updateAndGet(ctbyVar.a, unaryOperator));
        ctbyVar.e();
    }
}
