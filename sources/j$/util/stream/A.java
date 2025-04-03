package j$.util.stream;

import defpackage.eobe;
import j$.util.C0189y;
import j$.util.OptionalDouble;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
abstract class A extends AbstractC0060b implements DoubleStream {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A(AbstractC0060b abstractC0060b, int i, int i2) {
        super(abstractC0060b, i);
        this.l = i2;
    }

    @Override // j$.util.stream.AbstractC0060b
    final K0 A(AbstractC0060b abstractC0060b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC0175y0.C(abstractC0060b, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC0060b
    final boolean C(Spliterator spliterator, InterfaceC0157u2 interfaceC0157u2) {
        DoubleConsumer c0149t;
        boolean m;
        if (!(spliterator instanceof j$.util.V)) {
            if (!a4.a) {
                throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
            }
            a4.a(AbstractC0060b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        j$.util.V v = (j$.util.V) spliterator;
        if (interfaceC0157u2 instanceof DoubleConsumer) {
            c0149t = (DoubleConsumer) interfaceC0157u2;
        } else {
            if (a4.a) {
                a4.a(AbstractC0060b.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            interfaceC0157u2.getClass();
            c0149t = new C0149t(interfaceC0157u2);
        }
        do {
            m = interfaceC0157u2.m();
            if (m) {
                break;
            }
        } while (v.tryAdvance(c0149t));
        return m;
    }

    @Override // j$.util.stream.AbstractC0060b
    final EnumC0129o3 D() {
        return EnumC0129o3.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC0060b
    final C0 I(long j, IntFunction intFunction) {
        return AbstractC0175y0.G(j);
    }

    @Override // j$.util.stream.AbstractC0060b
    final boolean L() {
        switch (this.l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.AbstractC0060b
    final Spliterator P(AbstractC0060b abstractC0060b, Supplier supplier, boolean z) {
        return new C0178y3(abstractC0060b, supplier, z);
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream a() {
        int i = s4.a;
        throw null;
    }

    @Override // j$.util.stream.DoubleStream
    public final OptionalDouble average() {
        int i = 16;
        double[] dArr = (double[]) collect(new C0110l(i), new C0105k(15), new C0105k(i));
        if (dArr[2] <= eobe.a) {
            return OptionalDouble.a();
        }
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return OptionalDouble.b(d / dArr[2]);
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream b() {
        throw null;
    }

    @Override // j$.util.stream.DoubleStream
    public final Stream boxed() {
        return new C0164w(this, 0, new C0110l(19), 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream c() {
        int i = s4.a;
        throw null;
    }

    @Override // j$.util.stream.DoubleStream
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        biConsumer.getClass();
        C0154u c0154u = new C0154u(biConsumer, 0);
        supplier.getClass();
        objDoubleConsumer.getClass();
        return w(new H1(EnumC0129o3.DOUBLE_VALUE, c0154u, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.DoubleStream
    public final long count() {
        return ((Long) w(new J1(1))).longValue();
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream d(C0055a c0055a) {
        return new C0169x(this, EnumC0124n3.p | EnumC0124n3.n | EnumC0124n3.t, c0055a, 1);
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream distinct() {
        return ((AbstractC0118m2) boxed()).distinct().mapToDouble(new C0110l(20));
    }

    @Override // j$.util.stream.DoubleStream
    public final OptionalDouble findAny() {
        return (OptionalDouble) w(G.d);
    }

    @Override // j$.util.stream.DoubleStream
    public final OptionalDouble findFirst() {
        return (OptionalDouble) w(G.c);
    }

    @Override // j$.util.stream.DoubleStream
    public final void forEach(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        w(new M(doubleConsumer, false));
    }

    @Override // j$.util.stream.DoubleStream
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        w(new M(doubleConsumer, true));
    }

    @Override // j$.util.stream.DoubleStream
    public final boolean g() {
        throw null;
    }

    @Override // j$.util.stream.DoubleStream
    public final LongStream h() {
        throw null;
    }

    @Override // j$.util.stream.DoubleStream
    public final boolean l() {
        throw null;
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream limit(long j) {
        if (j >= 0) {
            return F2.e(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream map(DoubleUnaryOperator doubleUnaryOperator) {
        doubleUnaryOperator.getClass();
        return new C0169x(this, EnumC0124n3.p | EnumC0124n3.n, doubleUnaryOperator, 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        doubleFunction.getClass();
        return new C0164w(this, EnumC0124n3.p | EnumC0124n3.n, doubleFunction, 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final OptionalDouble max() {
        return reduce(new C0110l(22));
    }

    @Override // j$.util.stream.DoubleStream
    public final OptionalDouble min() {
        return reduce(new C0110l(15));
    }

    @Override // j$.util.stream.DoubleStream
    public final IntStream o() {
        throw null;
    }

    @Override // j$.util.stream.AbstractC0060b, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* bridge */ /* synthetic */ DoubleStream parallel() {
        switch (this.l) {
            case 0:
                parallel();
                break;
            default:
                parallel();
                break;
        }
        return this;
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream peek(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        return new C0169x(this, doubleConsumer);
    }

    @Override // j$.util.stream.DoubleStream
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        doubleBinaryOperator.getClass();
        return ((Double) w(new L1(EnumC0129o3.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // j$.util.stream.AbstractC0060b, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* bridge */ /* synthetic */ DoubleStream sequential() {
        switch (this.l) {
            case 0:
                sequential();
                break;
            default:
                sequential();
                break;
        }
        return this;
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : F2.e(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.DoubleStream
    public final DoubleStream sorted() {
        return new N2(this, EnumC0124n3.q | EnumC0124n3.o, 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final double sum() {
        double[] dArr = (double[]) collect(new C0110l(23), new C0105k(17), new C0105k(14));
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.DoubleStream
    public final C0189y summaryStatistics() {
        return (C0189y) collect(new C0110l(0), new C0110l(17), new C0110l(18));
    }

    @Override // j$.util.stream.DoubleStream
    public final double[] toArray() {
        return (double[]) AbstractC0175y0.J((E0) z(new C0110l(21))).c();
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream unordered() {
        return !G() ? this : new C0179z(this, EnumC0124n3.r, 0);
    }

    @Override // j$.util.stream.DoubleStream
    public final boolean v() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.V] */
    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    /* renamed from: iterator */
    public final Iterator<Double> iterator2() {
        return Spliterators.f(spliterator2());
    }

    @Override // j$.util.stream.AbstractC0060b, j$.util.stream.BaseStream
    /* renamed from: spliterator, reason: avoid collision after fix types in other method */
    public final Spliterator<Double> spliterator2() {
        Spliterator spliterator2 = super.spliterator2();
        if (spliterator2 instanceof j$.util.V) {
            return (j$.util.V) spliterator2;
        }
        if (!a4.a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        a4.a(AbstractC0060b.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.DoubleStream
    public final OptionalDouble reduce(DoubleBinaryOperator doubleBinaryOperator) {
        doubleBinaryOperator.getClass();
        return (OptionalDouble) w(new F1(EnumC0129o3.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }
}
