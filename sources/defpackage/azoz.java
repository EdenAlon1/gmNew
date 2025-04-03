package defpackage;

import j$.lang.Iterable$EL;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azoz {
    public volatile enip a = enpd.a;
    public volatile enhk b = enoz.a;

    final engw a() {
        Stream filter = Collection.EL.stream(this.b.values()).filter(new Predicate() { // from class: azoy
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
                return ((azop) obj).e().isEmpty();
            }
        });
        int i = engw.d;
        return (engw) filter.collect(endq.a);
    }

    final Optional b(azsu azsuVar) {
        azop azopVar = (azop) this.b.get(azsuVar);
        if (azopVar != null && azopVar.e().isPresent()) {
            azopVar = (azop) this.b.get(azopVar.e().get());
        }
        return Optional.ofNullable(azopVar);
    }

    final void c(Iterable iterable) {
        this.a = enip.n(iterable);
    }

    final void d(Iterable iterable) {
        final enhd enhdVar = new enhd();
        Iterable$EL.forEach(iterable, new Consumer() { // from class: azox
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                azop azopVar = (azop) obj;
                enhd.this.k(azopVar.b(), azopVar);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        this.b = enhdVar.c();
    }
}
