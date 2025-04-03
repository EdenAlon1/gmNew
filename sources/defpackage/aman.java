package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aman implements amav {
    final amaq a;
    public final amah b;
    private final errl c;
    private final emyl d;
    private final ffbr e;

    public aman(final amac amacVar, errl errlVar, amaq amaqVar, amah amahVar, ffbr ffbrVar) {
        this.c = errlVar;
        this.a = amaqVar;
        this.b = amahVar;
        this.d = emys.a(new emyl() { // from class: amak
            @Override // defpackage.emyl
            public final Object get() {
                errl errlVar2 = (errl) amacVar.a.b();
                errlVar2.getClass();
                return new amab(errlVar2, aman.this);
            }
        });
        this.e = ffbrVar;
    }

    @Override // defpackage.amav
    public final amau a() {
        return (amau) this.d.get();
    }

    @Override // defpackage.amav
    public final amaw b() {
        return (amaw) this.e.b();
    }

    @Override // defpackage.amav
    public final elfl c() {
        ekzz f = eleg.f("BugleContactRepository#getContactHeaderSections");
        try {
            elfl g = elfo.g(new Callable() { // from class: amal
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    bqzs a = bqzv.a();
                    a.z("getContactHeaderSections");
                    a.r();
                    a.e(new Function() { // from class: amaj
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((bqyn) obj).n;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                    int i = 0;
                    a.n(new dtzq("COUNT(distinct $V)", new Object[]{bqzv.c.b}), "count");
                    bqyn bqynVar = bqzv.c;
                    a.c(new bqzp(bqynVar.o), new bqzp(bqynVar.m));
                    a.v(bqzv.c.n);
                    bqyp bqypVar = (bqyp) a.b().o();
                    try {
                        int i2 = engw.d;
                        engr engrVar = new engr();
                        while (bqypVar.moveToNext()) {
                            int parseInt = Integer.parseInt(bqypVar.dd("count"));
                            engrVar.h(new amas(bqypVar.h(), i, parseInt));
                            i += parseInt;
                        }
                        engw g2 = engrVar.g();
                        bqypVar.close();
                        return g2;
                    } catch (Throwable th) {
                        try {
                            bqypVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }, this.c);
            f.b(g);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.amav
    public final elfl d(final int i, final int i2) {
        ekzz f = eleg.f("BugleContactRepository#getContacts");
        try {
            elfl g = elfo.g(new Callable() { // from class: amam
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final int i3 = i;
                    final int i4 = i2;
                    return aman.this.b.a("getContacts", new Function() { // from class: amae
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            bqzu bqzuVar = (bqzu) obj;
                            bqzs a = bqzv.a();
                            a.z("pagingInnerQuery");
                            a.t();
                            a.e(new Function() { // from class: amad
                                @Override // java.util.function.Function
                                /* renamed from: andThen */
                                public final /* synthetic */ Function mo448andThen(Function function) {
                                    return Function$CC.$default$andThen(this, function);
                                }

                                @Override // java.util.function.Function
                                public final Object apply(Object obj2) {
                                    return ((bqyn) obj2).b;
                                }

                                public final /* synthetic */ Function compose(Function function) {
                                    return Function$CC.$default$compose(this, function);
                                }
                            });
                            bqyn bqynVar = bqzv.c;
                            a.c(new bqzp(bqynVar.o), new bqzp(bqynVar.m));
                            a.A(i3);
                            a.x(i4);
                            bqzuVar.aq(new dtru("contacts.contact_id", 3, a.b()));
                            return bqzuVar;
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    });
                }
            }, this.c);
            f.b(g);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.amav
    public final elfl e() {
        elfl b;
        ekzz f = eleg.f("BugleContactRepository#getFavoritePhoneContacts");
        try {
            amaq amaqVar = this.a;
            Optional optional = (Optional) amaqVar.c.getAndSet(Optional.empty());
            if (optional.isPresent()) {
                amaq.a.p("returning existing preloaded favorite contacts and skipping the query");
                b = ((amap) optional.get()).a;
            } else {
                b = amaqVar.b();
            }
            f.b(b);
            f.close();
            return b;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.amav
    public final elfl f() {
        ekzz f = eleg.f("BugleContactRepository#getTotalContactsCount");
        try {
            elfl g = elfo.g(new Callable() { // from class: amai
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Integer.valueOf(csre.a());
                }
            }, this.c);
            f.b(g);
            f.close();
            return g;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.amav
    public final void g() {
        amaq.a.p("cleaning up favorite contacts preloaded state");
        this.a.c.set(Optional.empty());
        ((amab) this.d.get()).f();
    }

    @Override // defpackage.amav
    public final void h(Boolean bool) {
        g();
        amab amabVar = (amab) this.d.get();
        amaa amaaVar = new amaa();
        amaaVar.a = ((Integer) cvqt.d.e()).intValue();
        csjb c = amab.a.c();
        c.I("starting preloading contacts");
        c.y("limit", amaaVar.a);
        c.r();
        amaaVar.b = amabVar.b(amabVar.b.d(0, amaaVar.a), amabVar.b.f(), 0);
        emxf.l(((Optional) amabVar.c.getAndSet(Optional.of(amaaVar))).isEmpty());
        if (bool.booleanValue()) {
            amaq amaqVar = this.a;
            amap amapVar = new amap();
            csjb c2 = amaq.a.c();
            c2.I("starting preloading favorite contacts");
            c2.r();
            amapVar.a = amaqVar.b();
            emxf.l(((Optional) amaqVar.c.getAndSet(Optional.of(amapVar))).isEmpty());
        }
    }
}
