package j$.util.stream;

import j$.util.C0189y;
import j$.util.OptionalDouble;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
public interface DoubleStream extends BaseStream<Double, DoubleStream> {
    DoubleStream a();

    OptionalDouble average();

    DoubleStream b();

    Stream boxed();

    DoubleStream c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    DoubleStream d(C0055a c0055a);

    DoubleStream distinct();

    OptionalDouble findAny();

    OptionalDouble findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    boolean g();

    LongStream h();

    @Override // 
    /* renamed from: iterator */
    Iterator<Double> iterator2();

    boolean l();

    DoubleStream limit(long j);

    DoubleStream map(DoubleUnaryOperator doubleUnaryOperator);

    Stream mapToObj(DoubleFunction doubleFunction);

    OptionalDouble max();

    OptionalDouble min();

    IntStream o();

    @Override // 
    DoubleStream parallel();

    DoubleStream peek(DoubleConsumer doubleConsumer);

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // 
    DoubleStream sequential();

    DoubleStream skip(long j);

    DoubleStream sorted();

    @Override // j$.util.stream.BaseStream
    /* renamed from: spliterator */
    Spliterator<Double> spliterator2();

    double sum();

    C0189y summaryStatistics();

    double[] toArray();

    boolean v();
}
