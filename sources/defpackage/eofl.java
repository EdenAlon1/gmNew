package defpackage;

import j$.util.Collection;
import j$.util.function.BiPredicate$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import j$.util.stream.StreamSupport;
import java.util.Collection;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class eofl implements AutoCloseable {
    /* JADX WARN: Multi-variable type inference failed */
    public static eofl f(Iterable iterable) {
        return new eofk(iterable instanceof Collection ? Collection.EL.stream(iterable) : StreamSupport.stream(new eofh(iterable.iterator()), false), Function$CC.identity(), Function$CC.identity());
    }

    public Stream a() {
        return e();
    }

    public abstract eofl b(Function function);

    public abstract eofl c(Function function);

    public abstract Object d(eofb eofbVar);

    public abstract Stream e();

    public final eofl g(final Predicate predicate) {
        final BiPredicate biPredicate = new BiPredicate() { // from class: eofc
            public final /* synthetic */ BiPredicate and(BiPredicate biPredicate2) {
                return BiPredicate$CC.$default$and(this, biPredicate2);
            }

            public final /* synthetic */ BiPredicate negate() {
                return BiPredicate$CC.$default$negate(this);
            }

            public final /* synthetic */ BiPredicate or(BiPredicate biPredicate2) {
                return BiPredicate$CC.$default$or(this, biPredicate2);
            }

            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                boolean test;
                test = Predicate.this.test(obj);
                return test;
            }
        };
        Stream filter = a().filter(new Predicate() { // from class: eoff
            public final /* synthetic */ Predicate and(Predicate predicate2) {
                return Predicate$CC.$default$and(this, predicate2);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate2) {
                return Predicate$CC.$default$or(this, predicate2);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean test;
                Map.Entry entry = (Map.Entry) obj;
                test = BiPredicate.this.test(entry.getKey(), entry.getValue());
                return test;
            }
        });
        return new eofg(filter, new Function() { // from class: eofd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getKey();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: eofe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Map.Entry) obj).getValue();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, filter);
    }
}
