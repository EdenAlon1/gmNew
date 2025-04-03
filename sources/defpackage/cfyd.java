package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfyd implements cfvy {
    public static final /* synthetic */ int c = 0;
    public final fazb b;
    private final akzt e;
    private final Optional f;
    private final cfyo g;
    private final cfxl h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private static final enru d = enru.c("com/google/android/apps/messaging/shared/fcm/impl/PhoneTachyonTickleHandler");
    static final cfva a = cfvl.i(cfvl.b, "open_bind_after_pull", true);

    public cfyd(akzt akztVar, fazb fazbVar, Optional optional, cfyo cfyoVar, cfxl cfxlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.e = akztVar;
        this.b = fazbVar;
        this.f = optional;
        this.g = cfyoVar;
        this.h = cfxlVar;
        this.i = ffbrVar;
        this.j = ffbrVar2;
        this.k = ffbrVar3;
        this.l = ffbrVar4;
    }

    private final boolean d() {
        return chru.a();
    }

    @Override // defpackage.cfvy
    public final elfl a() {
        if (!d()) {
            ensk e = d.e();
            e.Y(ente.a, "BugleNetwork");
            ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/fcm/impl/PhoneTachyonTickleHandler", "refreshToken", 138, "PhoneTachyonTickleHandler.java")).q("Skipping tachyon registration refresh because phone registration is not enabled.");
            return elfo.e(null);
        }
        if (((atsl) this.l.b()).a()) {
            return ((djrv) this.j.b()).f().i(new eroh() { // from class: cfxx
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Stream stream = Collection.EL.stream((Set) obj);
                    final cfyd cfydVar = cfyd.this;
                    Stream map = stream.map(new Function() { // from class: cfxt
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj2) {
                            return ((chbx) cfyd.this.b.b()).d(((djrj) obj2).a, 10).i(new eroh() { // from class: cfxv
                                @Override // defpackage.eroh
                                public final ListenableFuture a(Object obj3) {
                                    int i = cfyd.c;
                                    return ((chbu) obj3).l(cgwm.FORCE_REFRESH);
                                }
                            }, erpp.a);
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i = engw.d;
                    return elfo.j((Iterable) map.collect(endq.a)).a(new Callable() { // from class: cfxu
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i2 = cfyd.c;
                            return null;
                        }
                    }, erpp.a);
                }
            }, erpp.a);
        }
        Stream map = Collection.EL.stream((enip) Collection.EL.stream(((djrv) this.j.b()).p()).map(new Function() { // from class: cfxy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((djrj) obj).a;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.b)).map(new Function() { // from class: cfxz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((chbx) cfyd.this.b.b()).d((String) obj, 10).i(new eroh() { // from class: cfxw
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        return ((chbu) obj2).w();
                    }
                }, erpp.a);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        return elfo.j((Iterable) map.collect(endq.a)).a(new Callable() { // from class: cfya
            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2 = cfyd.c;
                return null;
            }
        }, erpp.a);
    }

    @Override // defpackage.cfvy
    public final void b(long j) {
        this.e.e("Bugle.Fcm.Tickle.Downgrade.Counts", cfvw.a(3));
    }

    @Override // defpackage.cfvy
    public final void c(fcek fcekVar, String str, int i, int i2) {
        ekzz f = eleg.f("PhoneTachyonTickleHandler::onTickleReceived");
        try {
            if (this.f.isEmpty()) {
                ensk h = d.h();
                h.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h).h("com/google/android/apps/messaging/shared/fcm/impl/PhoneTachyonTickleHandler", "onTickleReceivedInSpan", 102, "PhoneTachyonTickleHandler.java")).q("Ignore received Firebase message because TachyonReceiverManager is not present.");
            } else if (d()) {
                cimr cimrVar = (cimr) this.i.b();
                bdhg a2 = bdhg.a(str);
                fgkd fgkdVar = (fgkd) fgki.a.createBuilder();
                fjay a3 = cslr.a();
                fgkdVar.copyOnWrite();
                fgki fgkiVar = (fgki) fgkdVar.instance;
                a3.getClass();
                fgkiVar.c = a3;
                fgkiVar.b |= 1;
                fgkdVar.copyOnWrite();
                ((fgki) fgkdVar.instance).e = fgkh.a(5);
                fgkdVar.copyOnWrite();
                ((fgki) fgkdVar.instance).g = fgkg.a(47);
                fgkb fgkbVar = (fgkb) fgkc.a.createBuilder();
                fgkbVar.a(str);
                fgkc fgkcVar = (fgkc) fgkbVar.build();
                fgkdVar.copyOnWrite();
                fgki fgkiVar2 = (fgki) fgkdVar.instance;
                fgkcVar.getClass();
                fgkiVar2.d = fgkcVar;
                fgkiVar2.b |= 2;
                cimrVar.b(a2, fgkdVar);
                this.e.c("Bugle.PhoneIdentity.FcmPush");
                cfyo cfyoVar = this.g;
                final cfxl cfxlVar = this.h;
                cfyoVar.b(str, fcekVar, new emwl() { // from class: cfyb
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return cfxl.this.c((fcek) obj);
                    }
                }, new emwl() { // from class: cfyc
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return cfxl.this.d((fcek) obj);
                    }
                }, "Phone", cfyo.c(i, i2), ((Boolean) a.e()).booleanValue(), ((Boolean) cpex.a.e()).booleanValue(), ((Boolean) cpex.b.e()).booleanValue(), ((Boolean) cpex.c.e()).booleanValue());
            } else {
                ensk h2 = d.h();
                h2.Y(ente.a, "BugleNetwork");
                ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/shared/fcm/impl/PhoneTachyonTickleHandler", "onTickleReceivedInSpan", 108, "PhoneTachyonTickleHandler.java")).q("Ignore phone tickle when phone registration is not enabled.");
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }
}
