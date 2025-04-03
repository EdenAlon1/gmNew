package j$.util.stream;

import j$.util.OptionalDouble;
import j$.util.OptionalLong;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongUnaryOperator;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.o0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
abstract class AbstractC0126o0 extends AbstractC0060b implements LongStream {
    /* JADX INFO: Access modifiers changed from: private */
    public static Spliterator.OfLong U(Spliterator spliterator) {
        if (spliterator instanceof Spliterator.OfLong) {
            return (Spliterator.OfLong) spliterator;
        }
        if (!a4.a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        a4.a(AbstractC0060b.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC0060b
    final K0 A(AbstractC0060b abstractC0060b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0175y0.E(abstractC0060b, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC0060b
    final boolean C(Spliterator spliterator, InterfaceC0157u2 interfaceC0157u2) {
        LongConsumer c0091h0;
        boolean m;
        Spliterator.OfLong U = U(spliterator);
        if (interfaceC0157u2 instanceof LongConsumer) {
            c0091h0 = (LongConsumer) interfaceC0157u2;
        } else {
            if (a4.a) {
                a4.a(AbstractC0060b.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            interfaceC0157u2.getClass();
            c0091h0 = new C0091h0(interfaceC0157u2);
        }
        do {
            m = interfaceC0157u2.m();
            if (m) {
                break;
            }
        } while (U.tryAdvance(c0091h0));
        return m;
    }

    @Override // j$.util.stream.AbstractC0060b
    final EnumC0129o3 D() {
        return EnumC0129o3.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC0060b
    final C0 I(long j, IntFunction intFunction) {
        return AbstractC0175y0.O(j);
    }

    @Override // j$.util.stream.AbstractC0060b
    final Spliterator P(AbstractC0060b abstractC0060b, Supplier supplier, boolean z) {
        return new D3(abstractC0060b, supplier, z);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream a() {
        int i = s4.a;
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final DoubleStream asDoubleStream() {
        return new C0179z(this, EnumC0124n3.n, 2);
    }

    @Override // j$.util.stream.LongStream
    public final OptionalDouble average() {
        long j = ((long[]) collect(new W(16), new W(17), new W(18)))[0];
        return j > 0 ? OptionalDouble.b(r0[1] / j) : OptionalDouble.a();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream b() {
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final Stream boxed() {
        return new C0164w(this, 0, new W(15), 2);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream c() {
        int i = s4.a;
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        biConsumer.getClass();
        C0154u c0154u = new C0154u(biConsumer, 2);
        supplier.getClass();
        objLongConsumer.getClass();
        return w(new H1(EnumC0129o3.LONG_VALUE, c0154u, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.LongStream
    public final long count() {
        return ((Long) w(new J1(0))).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream d(C0055a c0055a) {
        return new C0106k0(this, EnumC0124n3.p | EnumC0124n3.n | EnumC0124n3.t, c0055a, 1);
    }

    @Override // j$.util.stream.LongStream
    public final LongStream distinct() {
        return ((AbstractC0118m2) boxed()).distinct().mapToLong(new W(12));
    }

    @Override // j$.util.stream.LongStream
    public final boolean f() {
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong findAny() {
        return (OptionalLong) w(I.d);
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong findFirst() {
        return (OptionalLong) w(I.c);
    }

    public void forEach(LongConsumer longConsumer) {
        longConsumer.getClass();
        w(new O(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        longConsumer.getClass();
        w(new O(longConsumer, true));
    }

    @Override // j$.util.stream.LongStream
    public final DoubleStream j() {
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final LongStream limit(long j) {
        if (j >= 0) {
            return F2.g(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream map(LongUnaryOperator longUnaryOperator) {
        longUnaryOperator.getClass();
        return new C0106k0(this, EnumC0124n3.p | EnumC0124n3.n, longUnaryOperator, 0);
    }

    @Override // j$.util.stream.LongStream
    public final Stream mapToObj(LongFunction longFunction) {
        longFunction.getClass();
        return new C0164w(this, EnumC0124n3.p | EnumC0124n3.n, longFunction, 2);
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong max() {
        return reduce(new W(19));
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong min() {
        return reduce(new W(11));
    }

    @Override // j$.util.stream.LongStream
    public final boolean n() {
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final LongStream peek(LongConsumer longConsumer) {
        longConsumer.getClass();
        return new C0106k0(this, longConsumer);
    }

    @Override // j$.util.stream.LongStream
    public final boolean q() {
        throw null;
    }

    @Override // j$.util.stream.LongStream
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        longBinaryOperator.getClass();
        return ((Long) w(new D1(EnumC0129o3.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.LongStream
    public final LongStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : F2.g(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.LongStream
    public final LongStream sorted() {
        return new P2(this, EnumC0124n3.q | EnumC0124n3.o, 0);
    }

    @Override // j$.util.stream.LongStream
    public final long sum() {
        return reduce(0L, new W(20));
    }

    @Override // j$.util.stream.LongStream
    public final j$.util.B summaryStatistics() {
        return (j$.util.B) collect(new C0110l(7), new W(10), new W(13));
    }

    @Override // j$.util.stream.LongStream
    public final long[] toArray() {
        return (long[]) AbstractC0175y0.L((I0) z(new W(14))).c();
    }

    @Override // j$.util.stream.LongStream
    public final IntStream u() {
        throw null;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !G() ? this : new C0056a0(this, EnumC0124n3.r, 1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.Spliterator$OfLong] */
    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    /* renamed from: iterator */
    public final Iterator<Long> iterator2() {
        return Spliterators.h(spliterator2());
    }

    @Override // j$.util.stream.AbstractC0060b, j$.util.stream.BaseStream
    /* renamed from: spliterator */
    public final Spliterator<Long> spliterator2() {
        return U(super.spliterator2());
    }

    @Override // j$.util.stream.LongStream
    public final OptionalLong reduce(LongBinaryOperator longBinaryOperator) {
        longBinaryOperator.getClass();
        return (OptionalLong) w(new F1(EnumC0129o3.LONG_VALUE, longBinaryOperator, 0));
    }
}
