package defpackage;

import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eimh extends eild {
    static final emwd a = new eimg();
    static final emwd b = new einh();
    static final emwd c = new eimc();

    @Override // defpackage.eild
    public final void c(eifn eifnVar, final cloi cloiVar) {
        eifnVar.c().ifPresent(new Consumer() { // from class: eimd
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Iterable iterable = (Iterable) Collection.EL.stream((enip) obj).map(new Function() { // from class: eimf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        return (cloc) eimh.c.m().fP((eigj) obj2);
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.b);
                cloi cloiVar2 = cloi.this;
                cloiVar2.copyOnWrite();
                cloj clojVar = (cloj) cloiVar2.instance;
                eygj eygjVar = cloj.a;
                eygi eygiVar = clojVar.i;
                if (!eygiVar.c()) {
                    clojVar.i = eyfy.mutableCopy(eygiVar);
                }
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    clojVar.i.h(((cloc) it.next()).e);
                }
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    @Override // defpackage.eild
    public final void d(eifn eifnVar, cloi cloiVar) {
        clqw clqwVar = (clqw) clqx.a.createBuilder();
        String f = eifnVar.f();
        clqwVar.copyOnWrite();
        clqx clqxVar = (clqx) clqwVar.instance;
        clqxVar.b |= 1;
        clqxVar.c = f;
        cloiVar.copyOnWrite();
        cloj clojVar = (cloj) cloiVar.instance;
        clqx clqxVar2 = (clqx) clqwVar.build();
        eygj eygjVar = cloj.a;
        clqxVar2.getClass();
        clojVar.d = clqxVar2;
        clojVar.c |= 1;
    }

    @Override // defpackage.eild
    public final void e(eifn eifnVar, cloi cloiVar) {
        eyja b2 = eykj.b((Instant) eifnVar.e().get());
        cloiVar.copyOnWrite();
        cloj clojVar = (cloj) cloiVar.instance;
        eygj eygjVar = cloj.a;
        b2.getClass();
        clojVar.h = b2;
        clojVar.c |= 16;
    }

    @Override // defpackage.eild
    public final void f(cloj clojVar, eifk eifkVar) {
        if (new eygk(clojVar.i, cloj.a).isEmpty()) {
            return;
        }
        Stream stream = Collection.EL.stream(new eygk(clojVar.i, cloj.a));
        final emwd emwdVar = c;
        ((eiec) eifkVar).f = Optional.of((enip) stream.map(new Function() { // from class: eime
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (eigj) emwd.this.fP((cloc) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(endq.b));
    }

    @Override // defpackage.eild
    public final void g(cloj clojVar, eifk eifkVar) {
        clqx clqxVar = clojVar.d;
        if (clqxVar == null) {
            clqxVar = clqx.a;
        }
        String str = clqxVar.c;
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        ((eiec) eifkVar).a = str;
    }

    @Override // defpackage.eild
    public final void h(cloj clojVar, eifk eifkVar) {
        if ((clojVar.c & 16) != 0) {
            eyja eyjaVar = clojVar.h;
            if (eyjaVar == null) {
                eyjaVar = eyja.a;
            }
            ((eiec) eifkVar).e = Optional.of(eykj.d(eyjaVar));
        }
    }
}
