package defpackage;

import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class albl {
    public final cqoh a;
    public final ffbr b;
    public final emyl c;
    public final emyl d;

    public albl(cqoh cqohVar, final ffbr ffbrVar, final ffbr ffbrVar2) {
        this.a = cqohVar;
        this.b = ffbrVar2;
        this.d = emys.a(new emyl() { // from class: albc
            @Override // defpackage.emyl
            public final Object get() {
                return ((asvv) ffbr.this.b()).a() ? (enhk) eofl.f(((albp) ffbrVar.b()).b).g(new Predicate() { // from class: albi
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
                        return ((albn) obj).b == 1;
                    }
                }).b(new Function() { // from class: albj
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        albn albnVar = (albn) obj;
                        if (albnVar.b != 1) {
                            return eolt.UNKNOWN_BUGLE_EVENT_TYPE;
                        }
                        eolt b = eolt.b(((Integer) albnVar.c).intValue());
                        return b == null ? eolt.UNKNOWN_BUGLE_EVENT_TYPE : b;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).c(new albg()).d(new eofb(new BinaryOperator() { // from class: albk
                    public final /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return (Integer) obj2;
                    }
                })) : enoz.a;
            }
        });
        this.c = emys.a(new emyl() { // from class: albd
            @Override // defpackage.emyl
            public final Object get() {
                return ((asvv) ffbr.this.b()).a() ? (enhk) eofl.f(((albp) ffbrVar.b()).b).g(new Predicate() { // from class: albe
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
                        return ((albn) obj).b == 2;
                    }
                }).b(new Function() { // from class: albf
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        albn albnVar = (albn) obj;
                        if (albnVar.b != 2) {
                            return epyw.UNKNOWN_BUGLE_EVENT_CODE;
                        }
                        epyw b = epyw.b(((Integer) albnVar.c).intValue());
                        return b == null ? epyw.UNKNOWN_BUGLE_EVENT_CODE : b;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).c(new albg()).d(new eofb(new BinaryOperator() { // from class: albh
                    public final /* synthetic */ BiFunction andThen(Function function) {
                        return BiFunction$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return (Integer) obj2;
                    }
                })) : enoz.a;
            }
        });
    }
}
