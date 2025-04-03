package j$.desugar.sun.nio.fs;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.MonthDay;
import j$.time.temporal.TemporalAccessor;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* loaded from: classes9.dex */
public final /* synthetic */ class n implements Predicate, j$.time.temporal.m, Function, UnaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ n(int i) {
        this.a = i;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo448andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        int i = this.a;
        return obj;
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // j$.time.temporal.m
    public Object g(TemporalAccessor temporalAccessor) {
        switch (this.a) {
            case 1:
                return Instant.a0(temporalAccessor);
            case 2:
                return LocalDate.b0(temporalAccessor);
            default:
                return MonthDay.from(temporalAccessor);
        }
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public /* synthetic */ Predicate mo439negate() {
        switch (this.a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return !((String) obj).isEmpty();
            default:
                return Objects.isNull(obj);
        }
    }
}
