package defpackage;

import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeeu implements aefk {
    public static final cskc a = cskc.g("Bugle", "ConversationListBannerHost");
    public final ffbr b;
    public final cqoh c;
    public final ffbr d;
    public final ausa e;
    public aefb f = aefb.m();
    public Optional g = Optional.empty();
    public boolean h;
    public boolean i;
    private final aefc j;

    public aeeu(aefc aefcVar, ffbr ffbrVar, cqoh cqohVar, ffbr ffbrVar2, ausa ausaVar) {
        this.j = aefcVar;
        this.b = ffbrVar;
        this.c = cqohVar;
        this.d = ffbrVar2;
        this.e = ausaVar;
    }

    @Override // defpackage.aefk
    public final void a(Optional optional) {
        if (djai.F()) {
            this.g = optional;
        }
        aefi aefiVar = (aefi) this.j;
        aefiVar.f.set(true);
        aefiVar.g.a(elfo.e(null), aefi.a);
    }

    @Override // defpackage.aefk
    public final void b(ejwl ejwlVar, final cgix cgixVar) {
        ejvx a2;
        final aefi aefiVar = (aefi) this.j;
        eros erosVar = new eros() { // from class: aefh
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                elfl a3;
                aefi aefiVar2 = aefi.this;
                if (((Boolean) ((Optional) aefiVar2.h.b()).map(new Function() { // from class: aefe
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((akes) obj).b());
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(false)).booleanValue()) {
                    ((enrr) ((enrr) aefi.b.e()).h("com/google/android/apps/messaging/home/banner/HomeBannerDataServiceImpl", "getDataSourceWithTopBannerIfReady", 106, "HomeBannerDataServiceImpl.java")).q("Suppressing getDataSourceWithTopBannerIfReady for Retail Mode device.");
                    a3 = elfo.e(aefb.m());
                } else if (aefiVar2.f.get()) {
                    final cgix cgixVar2 = cgixVar;
                    Stream sorted = Collection.EL.stream(enpw.d((Set) aefiVar2.d.b(), aefiVar2.e)).filter(new Predicate() { // from class: aeff
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
                            enru enruVar = aefi.b;
                            return ((aeev) obj).c().contains(cgix.this);
                        }
                    }).sorted(Comparator.CC.comparingInt(new ToIntFunction() { // from class: aefg
                        @Override // java.util.function.ToIntFunction
                        public final int applyAsInt(Object obj) {
                            return ((aeev) obj).d() - 2;
                        }
                    }));
                    int i = engw.d;
                    a3 = aefiVar2.a((engw) sorted.collect(endq.a), 0);
                } else {
                    a3 = elfo.e(aefb.m());
                }
                return new erph(a3);
            }
        };
        if (djai.F()) {
            enin eninVar = new enin();
            eninVar.c(aefi.a);
            eninVar.c(cmel.b);
            eninVar.c(cmel.c);
            eninVar.c(ckgv.a);
            a2 = ejvx.a(eninVar.g());
        } else {
            a2 = ejvx.a(enip.s(aefi.a, cmel.b, ckgv.a));
        }
        ejwlVar.b(new ejuy(aefiVar.c, erosVar, a2), new ejwd<aefb>() { // from class: aeeu.1
            @Override // defpackage.ejwd
            public final void a(Throwable th) {
                aeeu.a.r("onError is thrown while calling getBannerEligibility.");
            }

            @Override // defpackage.ejwd
            public final /* bridge */ /* synthetic */ void b(Object obj) {
                aeeu aeeuVar = aeeu.this;
                aefb aefbVar = aeeuVar.f;
                aeeuVar.f = (aefb) obj;
                if (aefbVar.i().equals(aeeuVar.f.i())) {
                    aeeu.a.m("Ignoring update to HomeBanner since we are already showing the same banner.");
                    return;
                }
                aeeu aeeuVar2 = aeeu.this;
                boolean equals = aeeuVar2.f.i().equals("stub_banner_name");
                boolean z = !equals;
                if (djai.F() && !aeeuVar2.i && equals) {
                    aeeu.a.p("Ignoring update to HomeBanner since it's the first banner and it's not eligible");
                    return;
                }
                if (djai.F() && djai.o() >= 0 && !aeeuVar2.i && ((!aeeuVar2.e.a() || aeeuVar2.f.j()) && aeeuVar2.g.isPresent() && aeeuVar2.c.f().toEpochMilli() - ((Long) aeeuVar2.g.get()).longValue() > djai.o())) {
                    aeeu.a.p("Ignoring eligilibilty update for initial banner calulcation, its been too long since app interactive");
                    aeeuVar2.g = Optional.empty();
                    return;
                }
                aeeuVar2.i = true;
                boolean z2 = aeeuVar2.h;
                aeeuVar2.h = z;
                if (z2 && !equals) {
                    ((aefj) aeeuVar2.b.b()).b(3);
                    return;
                }
                if (z2 && equals) {
                    ((aefj) aeeuVar2.b.b()).b(2);
                } else {
                    if (z2 || equals) {
                        return;
                    }
                    ((aefj) aeeuVar2.b.b()).b(1);
                }
            }

            @Override // defpackage.ejwd
            public final /* synthetic */ void hB() {
            }
        });
    }
}
