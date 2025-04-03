package j$.util.stream;

import j$.util.C0189y;
import j$.util.C0190z;
import j$.util.Optional;
import j$.util.OptionalDouble;
import j$.util.OptionalInt;
import j$.util.OptionalLong;
import j$.util.StringJoiner;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;

/* renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0110l implements Supplier, BiConsumer, BinaryOperator, Function, DoubleBinaryOperator, ObjDoubleConsumer, DoubleFunction, ToDoubleFunction, IntFunction, Predicate {
    public final /* synthetic */ int a;

    public /* synthetic */ C0110l(int i) {
        this.a = i;
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        ((C0189y) obj).accept(d);
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 1:
                break;
            case 3:
                break;
            case 6:
                break;
            case 8:
                break;
            case 13:
                break;
            case 14:
                break;
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        switch (this.a) {
            case 15:
                return Math.min(d, d2);
            default:
                return Math.max(d, d2);
        }
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 0:
                return new C0189y();
            case 2:
                return new ArrayList();
            case 4:
                return new C0190z();
            case 5:
                return new HashSet();
            case 7:
                return new j$.util.B();
            case 11:
                return new HashMap();
            case 12:
                return new LinkedHashSet();
            case 16:
                return new double[4];
            default:
                return new double[3];
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
            case 24:
                return ((OptionalDouble) obj).isPresent();
            case 25:
                return ((OptionalInt) obj).isPresent();
            case 26:
                return ((OptionalLong) obj).isPresent();
            default:
                return ((Optional) obj).isPresent();
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                ((Collection) obj).add(obj2);
                break;
            case 3:
                ((List) obj).add(obj2);
                break;
            case 6:
                ((Set) obj).add(obj2);
                break;
            case 8:
                ((StringJoiner) obj).add((CharSequence) obj2);
                break;
            case 13:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 14:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            default:
                ((C0189y) obj).a((C0189y) obj2);
                break;
        }
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        return ((StringJoiner) obj).toString();
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        return ((StringJoiner) obj).c((StringJoiner) obj2);
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 21:
                return new Double[i];
            case 28:
                return new Object[i];
            default:
                return new Integer[i];
        }
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }
}
