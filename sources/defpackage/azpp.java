package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azpp {
    public final azop a;
    private final ctwb b;

    public azpp(azop azopVar, ctwb ctwbVar) {
        this.a = azopVar;
        this.b = ctwbVar;
    }

    public final enip a() {
        return this.a.j();
    }

    public final Optional b() {
        return this.a.d();
    }

    public final Optional c() {
        Stream map = Collection.EL.stream(this.b.m()).map(new Function() { // from class: azpm
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((ctwi) obj).a());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final enip a = a();
        a.getClass();
        return map.filter(new Predicate() { // from class: azpn
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
                return enip.this.contains((Integer) obj);
            }
        }).findFirst();
    }

    public final Optional d() {
        return this.a.g();
    }
}
