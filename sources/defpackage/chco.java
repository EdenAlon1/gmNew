package defpackage;

import android.text.TextUtils;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class chco {
    public static final cskc a = cskc.g("BugleNetwork", "RcsMsisdnAccessor");
    public final ffbr b;
    public final ffbr c;
    public final errl d;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    public int f = -2;
    public final AtomicReference g = new AtomicReference(null);
    public final AtomicReference h = new AtomicReference();
    public final ConcurrentMap e = new ConcurrentHashMap(2);

    public chco(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, errl errlVar, ffbr ffbrVar8, ffbr ffbrVar9) {
        this.b = ffbrVar;
        this.o = ffbrVar7;
        this.i = ffbrVar2;
        this.c = ffbrVar3;
        this.j = ffbrVar4;
        this.k = ffbrVar5;
        this.l = ffbrVar6;
        this.d = errlVar;
        this.m = ffbrVar8;
        this.n = ffbrVar9;
    }

    public static Optional d(Optional optional) {
        return optional.map(new Function() { // from class: chcf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aoku) obj).n();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).filter(new Predicate() { // from class: chcg
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return !TextUtils.isEmpty((String) obj);
            }
        });
    }

    private final void j(int i) {
        ((akzt) this.k.b()).e("Bugle.Rcs.PhoneNumber.Invalid.Counts", i);
    }

    @Deprecated
    public final elfl a() {
        ekzz f = eleg.f("RcsMsisdnAccessor::getRcsMsisdnAsync");
        try {
            elfl g = elfo.g(new Callable() { // from class: chce
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return chco.this.f();
                }
            }, this.d);
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

    @Deprecated
    public final emyl b() {
        emyl emylVar = new emyl() { // from class: chcm
            @Override // defpackage.emyl
            public final Object get() {
                return chco.this.h();
            }
        };
        ffbr ffbrVar = this.n;
        ffbrVar.getClass();
        return emys.b(emylVar, Duration.ofSeconds(((Long) ffbrVar.b()).longValue()));
    }

    @Deprecated
    public final Optional c() {
        Optional n = ((ckds) this.b.b()).n();
        if (!n.isPresent()) {
            n = e(((ckby) this.c.b()).a(ckcf.m), true);
        }
        return n.flatMap(new Function() { // from class: chch
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((aoku) obj).e();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15, types: [aoku, java.lang.Object] */
    public final Optional e(int i, boolean z) {
        ekzz f = eleg.f("RcsMsisdnAccessor::getRcsMessagingIdentityWithFallback");
        try {
            ConcurrentMap concurrentMap = this.e;
            Integer valueOf = Integer.valueOf(i);
            Optional optional = (Optional) concurrentMap.get(valueOf);
            if (optional != null) {
                j(7);
            } else {
                optional = Optional.empty();
                if (!z) {
                    optional = ((ckds) this.b.b()).n();
                }
                if (d(optional).isPresent()) {
                    this.e.putIfAbsent(valueOf, optional);
                } else if (((djrv) this.i.b()).x(i)) {
                    Optional i2 = ((ctwb) this.j.b()).h(i).i(false);
                    Optional filter = i2.map(new Function() { // from class: chcb
                        @Override // java.util.function.Function
                        /* renamed from: andThen */
                        public final /* synthetic */ Function mo448andThen(Function function) {
                            return Function$CC.$default$andThen(this, function);
                        }

                        @Override // java.util.function.Function
                        public final Object apply(Object obj) {
                            return ((aoku) obj).h();
                        }

                        public final /* synthetic */ Function compose(Function function) {
                            return Function$CC.$default$compose(this, function);
                        }
                    }).filter(new Predicate() { // from class: chcc
                        public final /* synthetic */ Predicate and(Predicate predicate) {
                            return Predicate$CC.$default$and(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        /* renamed from: negate */
                        public final /* synthetic */ Predicate mo439negate() {
                            return Predicate$CC.$default$negate(this);
                        }

                        public final /* synthetic */ Predicate or(Predicate predicate) {
                            return Predicate$CC.$default$or(this, predicate);
                        }

                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            return !TextUtils.isEmpty((String) obj);
                        }
                    });
                    if (filter.isPresent()) {
                        final String str = (String) filter.get();
                        optional = Optional.of(((aobh) this.l.b()).g(i2.get(), new emyl() { // from class: chck
                            @Override // defpackage.emyl
                            public final Object get() {
                                return str;
                            }
                        }));
                        this.e.putIfAbsent(valueOf, optional);
                        j(8);
                    } else {
                        csjb e = a.e();
                        e.I("Failed to access Rcs msisdn or Rcs MessagingIdentity.");
                        e.y("subId", i);
                        e.r();
                        j(2);
                        optional = Optional.empty();
                    }
                } else {
                    optional = Optional.empty();
                }
            }
            f.close();
            return optional;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Deprecated
    public final String f() {
        if (((atqt) this.o.b()).a()) {
            return h();
        }
        if (this.h.get() == null) {
            this.h.set(b());
        }
        String str = (String) ((emyl) this.h.get()).get();
        return (((Boolean) this.m.b()).booleanValue() && TextUtils.isEmpty(str)) ? h() : str;
    }

    public final String g(int i) {
        return (String) d(e(i, false)).orElse("");
    }

    public final String h() {
        ekzz f = eleg.f("RcsMsisdnAccessor::getRcsMsisdn");
        try {
            String s = ((ckds) this.b.b()).s();
            if (TextUtils.isEmpty(s)) {
                s = (String) d(e(((ckby) this.c.b()).a(ckcf.l), true)).orElse("");
            }
            f.close();
            return s;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final String i(final int i) {
        chbz.a(this.g, elfo.f(new Runnable() { // from class: chci
            @Override // java.lang.Runnable
            public final void run() {
                chco chcoVar = chco.this;
                final int i2 = i;
                chco.d(chcoVar.e(i2, false)).ifPresent(new Consumer() { // from class: chca
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        csjb a2 = chco.a.a();
                        a2.I("Updating subscription map with: ");
                        a2.k((String) obj);
                        a2.I(" for subscription: ");
                        a2.G(i2);
                        a2.r();
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                chcoVar.g.set(null);
            }
        }, this.d));
        return "";
    }
}
