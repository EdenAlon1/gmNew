package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cilu implements cilk {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl");
    public final Context b;
    public final errl c;
    public final ffbr d;
    public final Optional e;
    public final Optional f;
    public final Optional g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    private final errl k;
    private final emyl l;
    private final ffbr m;
    private final ConcurrentMap n = new ConcurrentHashMap();
    private final ffbr o;
    private final ffbr p;
    private final ffbr q;

    public cilu(ffbr ffbrVar, final Context context, final errl errlVar, errl errlVar2, ffbr ffbrVar2, final ffbr ffbrVar3, final ffbr ffbrVar4, ffbr ffbrVar5, final Optional optional, final Optional optional2, final Optional optional3, final Optional optional4, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9) {
        this.b = context;
        this.c = errlVar;
        this.k = errlVar2;
        this.q = ffbrVar2;
        this.d = ffbrVar3;
        this.g = optional4;
        this.e = optional2;
        this.f = optional3;
        this.h = ffbrVar6;
        this.i = ffbrVar;
        this.o = ffbrVar7;
        this.p = ffbrVar8;
        this.l = emys.a(new emyl() { // from class: cilr
            /* JADX WARN: Type inference failed for: r9v0, types: [chzl, java.lang.Object] */
            @Override // defpackage.emyl
            public final Object get() {
                Optional optional5 = Optional.this;
                Optional optional6 = optional2;
                Optional optional7 = optional3;
                cilu.k(optional5, optional6, optional7);
                final chrv chrvVar = (chrv) ffbrVar3.b();
                chrvVar.getClass();
                ffbr ffbrVar10 = new ffbr() { // from class: cilt
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        return chrv.this.a();
                    }
                };
                ffbr ffbrVar11 = ffbrVar4;
                Object obj = optional5.get();
                ?? r9 = optional6.get();
                Object obj2 = optional7.get();
                cgwn cgwnVar = (cgwn) ffbrVar11.b();
                Optional optional8 = optional;
                return Optional.ofNullable(new cilj(context, ffbrVar10, (cija) obj, r9, (cihi) obj2, errlVar, cgwnVar, 2, optional8.isPresent() ? Optional.of(new chhk((chhm) optional8.get())) : Optional.empty(), chzl.a, Duration.ofSeconds(((Integer) cgyj.j.e()).intValue()), ((Integer) cgyj.k.e()).intValue(), ((Integer) cgyj.l.e()).intValue(), false, false, true));
            }
        });
        this.m = ffbrVar5;
        this.j = ffbrVar9;
    }

    public static void k(Optional optional, Optional optional2, Optional optional3) {
        optional.isPresent();
        optional2.isPresent();
        optional3.isPresent();
    }

    private final void l() {
        k(this.g, this.e, this.f);
    }

    @Override // defpackage.cilk
    public final elfl a(fcek fcekVar) {
        return b(fcekVar, Optional.empty());
    }

    @Override // defpackage.cilk
    public final elfl b(final fcek fcekVar, final Optional optional) {
        final String str = fcekVar.c;
        if (TextUtils.isEmpty(str)) {
            return elfo.e(null);
        }
        l();
        ensk h = a.h();
        h.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "pullMessagesForPhone", 286, "TachyonReceiverManagerImpl.java")).q("beginning of pullMessagesForPhone");
        return ((chbx) this.m.b()).d(str, 20).i(new eroh() { // from class: cilm
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                cilj j = cilu.this.j(str, (chbu) obj);
                fcek fcekVar2 = fcekVar;
                Optional optional2 = optional;
                if (!optional2.isPresent()) {
                    return j.b(fcekVar2);
                }
                Object obj2 = optional2.get();
                j.f = true;
                return j.a(fcekVar2, ((cigx) j.e.get()).b((cgwm) obj2));
            }
        }, this.k).h(new emwl() { // from class: ciln
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ensk h2 = cilu.a.h();
                h2.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "pullMessagesForPhone", 301, "TachyonReceiverManagerImpl.java")).q("End of pullMessagesForPhone");
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.cilk
    public final elfl c(final fcek fcekVar) {
        final String str = fcekVar.c;
        if (TextUtils.isEmpty(str)) {
            return elfo.e(new ppn());
        }
        l();
        ensk e = a.e();
        e.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "pullMessagesForPhoneFromWorker", 315, "TachyonReceiverManagerImpl.java")).q("beginning of pullMessagesForPhoneFromWorker");
        return ((chbx) this.m.b()).d(str, 19).i(new eroh() { // from class: cils
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return cilu.this.j(str, (chbu) obj).c(fcekVar);
            }
        }, this.k);
    }

    @Override // defpackage.cilk
    public final elfl d() {
        if (!((aslq) this.p.b()).a() || ((cspt) this.o.b()).a()) {
            ensk e = a.e();
            e.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "startAnonymousBindHandler", 158, "TachyonReceiverManagerImpl.java")).q("beginning of startAnonymousBindHandler");
            return ((Optional) this.l.get()).isEmpty() ? elfo.e(null) : ((cilj) ((Optional) this.l.get()).get()).d();
        }
        ensk h = a.h();
        h.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "startAnonymousBindHandler", 155, "TachyonReceiverManagerImpl.java")).q("Device data over satellite, skipping start bind");
        return elfo.e(null);
    }

    @Override // defpackage.cilk
    public final elfl e(final String str) {
        if (TextUtils.isEmpty(str)) {
            return elfo.e(null);
        }
        l();
        ensk e = a.e();
        e.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "startPhoneBindHandler", 334, "TachyonReceiverManagerImpl.java")).q("beginning of startPhoneBindHandler");
        return ((chbx) this.m.b()).d(str, 18).i(new eroh() { // from class: cilo
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return cilu.this.j(str, (chbu) obj).d();
            }
        }, this.k);
    }

    @Override // defpackage.cilk
    public final void f() {
        ensk e = a.e();
        e.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "onAppBackgrounding", 206, "TachyonReceiverManagerImpl.java")).q("Notifying TachyonReceivers for backgrounding");
        Iterator it = this.n.values().iterator();
        while (it.hasNext()) {
            ((chzk) ((cilj) it.next()).d.get()).b();
        }
    }

    @Override // defpackage.cilk
    public final synchronized void g() {
        ensk e = a.e();
        e.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "stopAnonymousBindHandler", 182, "TachyonReceiverManagerImpl.java")).q("stopping anonymous bind");
        ((akzt) this.q.b()).e("Bugle.Ditto.Binding.Stop.Counts", 1);
        ((Optional) this.l.get()).ifPresent(new Consumer() { // from class: cill
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                ((cilj) obj).e();
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.cilk
    public final synchronized void h(String str) {
        if (this.n.containsKey(str)) {
            ensk h = a.h();
            h.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "stopPhoneBindHandler", 198, "TachyonReceiverManagerImpl.java")).t("Stopping phone bind for %s", cskt.b(str));
            ((cilj) this.n.get(str)).e();
        }
    }

    @Override // defpackage.cilk
    public final elfl i(String str) {
        if (!((aslq) this.p.b()).a() || ((cspt) this.o.b()).a()) {
            ensk e = a.e();
            e.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "startAnonymousBindHandlerFromTickle", 173, "TachyonReceiverManagerImpl.java")).q("beginning of startBindHandler from tickle");
            return ((Optional) this.l.get()).isEmpty() ? elfo.e(null) : ((cilj) ((Optional) this.l.get()).get()).f(str);
        }
        ensk h = a.h();
        h.Y(ente.a, "BugleNetwork");
        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/net/tachyonreceiver/TachyonReceiverManagerImpl", "startAnonymousBindHandlerFromTickle", 170, "TachyonReceiverManagerImpl.java")).q("Device data over satellite, skipping start bind");
        return elfo.e(null);
    }

    public final cilj j(final String str, final cgwn cgwnVar) {
        l();
        emxf.l(true);
        return (cilj) ConcurrentMap.EL.computeIfAbsent(this.n, str, new Function() { // from class: cilq
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            /* JADX WARN: Type inference failed for: r6v0, types: [chzl, java.lang.Object] */
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                final cilu ciluVar = cilu.this;
                final String str2 = str;
                ffbr ffbrVar = new ffbr() { // from class: cilp
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        cilu ciluVar2 = cilu.this;
                        chxe chxeVar = (chxe) ciluVar2.i.b();
                        String str3 = str2;
                        chxeVar.a(str3, 21);
                        awui c = ((avkc) ciluVar2.h.b()).c(str3);
                        chrv chrvVar = (chrv) ciluVar2.d.b();
                        fcek b = cpta.b(c);
                        ekzz f = eleg.f("GrpcProxies#getPhoneMessagingGrpcProxy");
                        try {
                            ensk e = chrv.a.e();
                            e.Y(ente.a, "BugleNetwork");
                            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/net/grpcproxies/GrpcProxies", "getPhoneMessagingGrpcProxy", 81, "GrpcProxies.java")).q("Phone channel bound to identity messaging grpc is used.");
                            chhw a2 = ((chhx) chrvVar.d.b()).a(b);
                            f.close();
                            return a2;
                        } catch (Throwable th) {
                            try {
                                f.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                };
                Object obj2 = ciluVar.g.get();
                ?? r6 = ciluVar.e.get();
                Object obj3 = ciluVar.f.get();
                return new cilj(ciluVar.b, ffbrVar, (cija) obj2, r6, (cihi) obj3, ciluVar.c, cgwnVar, 3, Optional.empty(), eykj.c((eyev) ciluVar.j.b()), Duration.ofSeconds(((Integer) cgyj.g.e()).intValue()), ((Integer) cgyj.h.e()).intValue(), ((Integer) cgyj.i.e()).intValue(), true, true, false);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }
}
