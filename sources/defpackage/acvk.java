package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvk implements acvo {
    public static final cskc a = cskc.g("Bugle", "JsBridgeTransportV1ToV2Wrapper");
    public final ctby b;
    private final errl c;
    private final AtomicReference d = new AtomicReference(Optional.empty());
    private final acwj e;

    public acvk(ctbk ctbkVar, errl errlVar, acwj acwjVar) {
        this.e = acwjVar;
        this.c = errlVar;
        this.b = new ctby(ctbkVar, acvm.NOT_STARTED);
    }

    @Override // defpackage.acvd
    public final void a(String str) {
        acwj acwjVar = this.e;
        if (!acwjVar.h.isPresent()) {
            throw new acvb();
        }
        Object obj = acwjVar.h.get();
        if (!pga.h.d()) {
            throw new UnsupportedOperationException("This method is not supported by the current version of the framework and the current WebView APK");
        }
        ((pfm) obj).a.postMessage(str);
    }

    @Override // defpackage.acvo
    public final acvm b() {
        return (acvm) this.b.d();
    }

    @Override // defpackage.acvo
    public final ctbx c(String str, ctbf ctbfVar) {
        return this.b.a(str, ctbfVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        acwj acwjVar = this.e;
        synchronized (acwjVar.b) {
            acwjVar.k = true;
            acwjVar.j = null;
            acwjVar.h = Optional.empty();
            if (acwjVar.i.isPresent()) {
                ((kfb) acwjVar.i.get()).d();
                acwjVar.i = Optional.empty();
            }
        }
        acwjVar.c.a(acwjVar.e, acwjVar.f);
        ((Optional) this.d.getAndSet(Optional.empty())).ifPresent(new Consumer() { // from class: acvi
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((elfl) obj).cancel(false);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.b.f(acvm.CLOSED);
    }

    @Override // defpackage.acvo
    public final void d() {
        elfl g;
        this.b.g(acvm.NOT_STARTED, acvm.CONNECTING);
        final acwj acwjVar = this.e;
        synchronized (acwjVar.b) {
            acwjVar.k = false;
            if (acwjVar.j == null) {
                acwjVar.j = new ejlc(new erog() { // from class: acwh
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        final acwj acwjVar2 = acwj.this;
                        return elfl.g(kfg.a(new kfd() { // from class: acwg
                            @Override // defpackage.kfd
                            public final Object a(kfb kfbVar) {
                                acwj acwjVar3 = acwj.this;
                                synchronized (acwjVar3.b) {
                                    acwjVar3.i = Optional.of(kfbVar);
                                }
                                acwjVar3.c.b(acwjVar3.e, acwjVar3.f, acsw.a, new acwi(acwjVar3, acwjVar3));
                                return null;
                            }
                        }));
                    }
                }, acwjVar.d);
            }
            g = elfl.g(acwjVar.j.c());
        }
        elfl e = g.h(new emwl() { // from class: acvf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                acvk.this.b.g(acvm.CONNECTING, acvm.CONNECTED);
                return null;
            }
        }, this.c).e(Exception.class, new emwl() { // from class: acvg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Exception exc = (Exception) obj;
                if (exc instanceof CancellationException) {
                    return null;
                }
                acvk acvkVar = acvk.this;
                acvk.a.s("JsBridgeTransport#open() failed", exc);
                acvkVar.b.g(acvm.CONNECTING, acvm.NOT_STARTED);
                return null;
            }
        }, this.c);
        ((Optional) this.d.getAndSet(Optional.of(e))).ifPresent(new Consumer() { // from class: acvh
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((elfl) obj).cancel(false);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        e.k(axnw.b(), this.c);
    }

    @Override // defpackage.acvo
    public final /* synthetic */ boolean e() {
        return acvl.a(this);
    }
}
