package j$.util.stream;

import j$.util.C0190z;
import j$.util.OptionalDouble;
import j$.util.OptionalInt;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.f0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
abstract class AbstractC0081f0 extends AbstractC0060b implements IntStream {
    /* JADX INFO: Access modifiers changed from: private */
    public static Spliterator.OfInt U(Spliterator spliterator) {
        if (spliterator instanceof Spliterator.OfInt) {
            return (Spliterator.OfInt) spliterator;
        }
        if (!a4.a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        a4.a(AbstractC0060b.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC0060b
    final K0 A(AbstractC0060b abstractC0060b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0175y0.D(abstractC0060b, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC0060b
    final boolean C(Spliterator spliterator, InterfaceC0157u2 interfaceC0157u2) {
        IntConsumer v;
        boolean m;
        Spliterator.OfInt U = U(spliterator);
        if (interfaceC0157u2 instanceof IntConsumer) {
            v = (IntConsumer) interfaceC0157u2;
        } else {
            if (a4.a) {
                a4.a(AbstractC0060b.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            interfaceC0157u2.getClass();
            v = new V(interfaceC0157u2);
        }
        do {
            m = interfaceC0157u2.m();
            if (m) {
                break;
            }
        } while (U.tryAdvance(v));
        return m;
    }

    @Override // j$.util.stream.AbstractC0060b
    final EnumC0129o3 D() {
        return EnumC0129o3.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC0060b
    final C0 I(long j, IntFunction intFunction) {
        return AbstractC0175y0.N(j);
    }

    @Override // j$.util.stream.AbstractC0060b
    final Spliterator P(AbstractC0060b abstractC0060b, Supplier supplier, boolean z) {
        return new B3(abstractC0060b, supplier, z);
    }

    @Override // j$.util.stream.IntStream
    public final boolean allMatch(IntPredicate intPredicate) {
        return ((Boolean) w(AbstractC0175y0.P(EnumC0160v0.ALL, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean anyMatch(IntPredicate intPredicate) {
        return ((Boolean) w(AbstractC0175y0.P(EnumC0160v0.ANY, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final DoubleStream asDoubleStream() {
        return new C0179z(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final LongStream asLongStream() {
        return new C0056a0(this, 0, 0);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalDouble average() {
        long j = ((long[]) collect(new W(7), new W(8), new W(9)))[0];
        return j > 0 ? OptionalDouble.b(r0[1] / j) : OptionalDouble.a();
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new C0164w(this, 0, new W(1), 1);
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        biConsumer.getClass();
        C0154u c0154u = new C0154u(biConsumer, 1);
        supplier.getClass();
        objIntConsumer.getClass();
        return w(new H1(EnumC0129o3.INT_VALUE, c0154u, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) w(new J1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC0118m2) boxed()).distinct().mapToInt(new W(0));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream dropWhile(IntPredicate intPredicate) {
        int i = s4.a;
        intPredicate.getClass();
        return new i4(this, s4.b, intPredicate);
    }

    @Override // j$.util.stream.IntStream
    public final DoubleStream e() {
        throw null;
    }

    @Override // j$.util.stream.IntStream
    public final IntStream filter(IntPredicate intPredicate) {
        intPredicate.getClass();
        return new Y(this, EnumC0124n3.t, intPredicate, 3);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt findAny() {
        return (OptionalInt) w(H.d);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt findFirst() {
        return (OptionalInt) w(H.c);
    }

    public void forEach(IntConsumer intConsumer) {
        intConsumer.getClass();
        w(new N(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        intConsumer.getClass();
        w(new N(intConsumer, true));
    }

    @Override // j$.util.stream.IntStream
    public final LongStream k() {
        throw null;
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j >= 0) {
            return F2.f(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream m(Q0 q0) {
        return new Y(this, EnumC0124n3.p | EnumC0124n3.n | EnumC0124n3.t, q0, 2);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream map(IntUnaryOperator intUnaryOperator) {
        intUnaryOperator.getClass();
        return new Y(this, EnumC0124n3.p | EnumC0124n3.n, intUnaryOperator, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        intFunction.getClass();
        return new C0164w(this, EnumC0124n3.p | EnumC0124n3.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt max() {
        return reduce(new W(6));
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt min() {
        return reduce(new W(2));
    }

    @Override // j$.util.stream.IntStream
    public final boolean noneMatch(IntPredicate intPredicate) {
        return ((Boolean) w(AbstractC0175y0.P(EnumC0160v0.NONE, intPredicate))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        intConsumer.getClass();
        return new Y(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        intBinaryOperator.getClass();
        return ((Integer) w(new S1(EnumC0129o3.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : F2.f(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new O2(this, EnumC0124n3.q | EnumC0124n3.o, 0);
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new W(5));
    }

    @Override // j$.util.stream.IntStream
    public final C0190z summaryStatistics() {
        return (C0190z) collect(new C0110l(4), new W(3), new W(4));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream takeWhile(IntPredicate intPredicate) {
        int i = s4.a;
        intPredicate.getClass();
        return new f4(this, s4.a, intPredicate);
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC0175y0.K((G0) z(new C0110l(29))).c();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !G() ? this : new C0066c0(this, EnumC0124n3.r, 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.Spliterator$OfInt] */
    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    /* renamed from: iterator, reason: merged with bridge method [inline-methods] */
    public final Iterator<Integer> iterator2() {
        return Spliterators.g(spliterator2());
    }

    @Override // j$.util.stream.AbstractC0060b, j$.util.stream.BaseStream
    /* renamed from: spliterator, reason: merged with bridge method [inline-methods] */
    public final Spliterator<Integer> spliterator2() {
        return U(super.spliterator2());
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        intBinaryOperator.getClass();
        return (OptionalInt) w(new F1(EnumC0129o3.INT_VALUE, intBinaryOperator, 3));
    }
}
