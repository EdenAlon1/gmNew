package defpackage;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chnf {
    private final comc a;
    private final chmb b;

    public chnf(comy comyVar, chmb chmbVar, akzt akztVar, errl errlVar) {
        this.b = chmbVar;
        comu c = comv.c();
        c.d(comb.FIREBASE);
        c.f(chlj.a);
        c.e(new chnd(chmbVar, errlVar, akztVar));
        c.c(new Supplier() { // from class: chmz
            @Override // java.util.function.Supplier
            public final Object get() {
                return new chne();
            }
        });
        this.a = comyVar.a(c.a());
    }

    public final elfl a() {
        return this.a.h().h(new emwl() { // from class: chmy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Long.valueOf(((chlj) obj).b);
            }
        }, erpp.a);
    }

    public final elfl b(final Long l) {
        return elfo.m(elfl.g(this.b.a.b(eldl.a(new emwl() { // from class: chlx
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chlq chlqVar = (chlq) ((chlr) obj).toBuilder();
                long longValue = l.longValue();
                chlqVar.copyOnWrite();
                ((chlr) chlqVar.instance).f = longValue;
                return (chlr) chlqVar.build();
            }
        }), erpp.a)), this.a.j(new emwl() { // from class: chna
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                chli chliVar = (chli) ((chlj) obj).toBuilder();
                long longValue = l.longValue();
                chliVar.copyOnWrite();
                ((chlj) chliVar.instance).b = longValue;
                return (chlj) chliVar.build();
            }
        })).a(new Callable() { // from class: chnb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, erpp.a);
    }
}
