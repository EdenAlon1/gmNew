package j$.util.stream;

import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Collector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.m2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
abstract class AbstractC0118m2 extends AbstractC0060b implements Stream {
    @Override // j$.util.stream.AbstractC0060b
    final K0 A(AbstractC0060b abstractC0060b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0175y0.B(abstractC0060b, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.AbstractC0060b
    final boolean C(Spliterator spliterator, InterfaceC0157u2 interfaceC0157u2) {
        boolean m;
        do {
            m = interfaceC0157u2.m();
            if (m) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC0157u2));
        return m;
    }

    @Override // j$.util.stream.AbstractC0060b
    final EnumC0129o3 D() {
        return EnumC0129o3.REFERENCE;
    }

    @Override // j$.util.stream.AbstractC0060b
    final C0 I(long j, IntFunction intFunction) {
        return AbstractC0175y0.A(j, intFunction);
    }

    @Override // j$.util.stream.AbstractC0060b
    final Spliterator P(AbstractC0060b abstractC0060b, Supplier supplier, boolean z) {
        return new R3(abstractC0060b, supplier, z);
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) w(AbstractC0175y0.Q(EnumC0160v0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) w(AbstractC0175y0.Q(EnumC0160v0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        supplier.getClass();
        biConsumer.getClass();
        biConsumer2.getClass();
        return w(new H1(EnumC0129o3.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) w(new J1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new C0144s(this, EnumC0124n3.m | EnumC0124n3.t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i = s4.a;
        predicate.getClass();
        return new d4(this, s4.b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        predicate.getClass();
        return new C0164w(this, EnumC0124n3.t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) w(J.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) w(J.c);
    }

    @Override // j$.util.stream.Stream
    public final Stream flatMap(Function function) {
        function.getClass();
        return new C0093h2(this, EnumC0124n3.p | EnumC0124n3.n | EnumC0124n3.t, function, 1);
    }

    public void forEach(Consumer consumer) {
        consumer.getClass();
        w(new P(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        consumer.getClass();
        w(new P(consumer, true));
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    /* renamed from: iterator */
    public final Iterator iterator2() {
        return Spliterators.iterator(spliterator2());
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j >= 0) {
            return F2.h(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        function.getClass();
        return new C0093h2(this, EnumC0124n3.p | EnumC0124n3.n, function, 0);
    }

    @Override // j$.util.stream.Stream
    public final DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        toDoubleFunction.getClass();
        return new C0169x(this, EnumC0124n3.p | EnumC0124n3.n, toDoubleFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        toIntFunction.getClass();
        return new Y(this, EnumC0124n3.p | EnumC0124n3.n, toIntFunction, 4);
    }

    @Override // j$.util.stream.Stream
    public final LongStream mapToLong(ToLongFunction toLongFunction) {
        toLongFunction.getClass();
        return new C0106k0(this, EnumC0124n3.p | EnumC0124n3.n, toLongFunction, 4);
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        comparator.getClass();
        return reduce(new j$.util.function.b(comparator, 0));
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        comparator.getClass();
        return reduce(new j$.util.function.b(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) w(AbstractC0175y0.Q(EnumC0160v0.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        consumer.getClass();
        return new C0164w(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final LongStream r(C0125o c0125o) {
        return new C0106k0(this, EnumC0124n3.p | EnumC0124n3.n | EnumC0124n3.t, c0125o, 3);
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        binaryOperator.getClass();
        return (Optional) w(new F1(EnumC0129o3.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : F2.h(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new Q2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i = s4.a;
        predicate.getClass();
        return new b4(this, s4.a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC0175y0.I(z(intFunction), intFunction).n(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !G() ? this : new C0088g2(this, EnumC0124n3.r, 1);
    }

    @Override // j$.util.stream.Stream
    public final DoubleStream x(C0125o c0125o) {
        return new C0169x(this, EnumC0124n3.p | EnumC0124n3.n | EnumC0124n3.t, c0125o, 4);
    }

    @Override // j$.util.stream.Stream
    public final IntStream y(C0125o c0125o) {
        return new Y(this, EnumC0124n3.p | EnumC0124n3.n | EnumC0124n3.t, c0125o, 5);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new Q2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new W(23));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        biFunction.getClass();
        binaryOperator.getClass();
        return w(new H1(EnumC0129o3.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Collector collector2;
        Object w;
        if (isParallel() && collector.characteristics().contains(Collector.Characteristics.CONCURRENT) && (!G() || collector.characteristics().contains(Collector.Characteristics.UNORDERED))) {
            w = collector.supplier().get();
            forEach(new C0115m(6, collector.accumulator(), w));
            collector2 = collector;
        } else {
            collector.getClass();
            Supplier supplier = collector.supplier();
            collector2 = collector;
            w = w(new O1(EnumC0129o3.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        }
        return collector2.characteristics().contains(Collector.Characteristics.IDENTITY_FINISH) ? w : collector2.finisher().apply(w);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        binaryOperator.getClass();
        return w(new H1(EnumC0129o3.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }
}
