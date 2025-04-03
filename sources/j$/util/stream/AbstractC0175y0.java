package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.LongConsumer;
import java.util.function.Predicate;

/* renamed from: j$.util.stream.y0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract /* synthetic */ class AbstractC0175y0 implements X3 {
    private static final C0072d1 a = new C0072d1();
    private static final G0 b = new C0062b1();
    private static final I0 c = new C0067c1();
    private static final E0 d = new C0057a1();
    private static final int[] e = new int[0];
    private static final long[] f = new long[0];
    private static final double[] g = new double[0];

    static C0 A(long j, IntFunction intFunction) {
        return (j < 0 || j >= 2147483639) ? new C0171x1() : new C0082f1(j, intFunction);
    }

    public static K0 B(AbstractC0060b abstractC0060b, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long B = abstractC0060b.B(spliterator);
        if (B < 0 || !spliterator.hasCharacteristics(16384)) {
            Q0 q0 = new Q0();
            q0.a = intFunction;
            K0 k0 = (K0) new P0(abstractC0060b, spliterator, q0, new C0105k(28)).invoke();
            return z ? I(k0, intFunction) : k0;
        }
        if (B >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) B);
        new C0161v1(spliterator, abstractC0060b, objArr).invoke();
        return new N0(objArr);
    }

    public static E0 C(AbstractC0060b abstractC0060b, Spliterator spliterator, boolean z) {
        long B = abstractC0060b.B(spliterator);
        if (B < 0 || !spliterator.hasCharacteristics(16384)) {
            E0 e0 = (E0) new P0(abstractC0060b, spliterator, new C0105k(22), new C0105k(23)).invoke();
            return z ? J(e0) : e0;
        }
        if (B >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) B];
        new C0146s1(spliterator, abstractC0060b, dArr).invoke();
        return new X0(dArr);
    }

    public static G0 D(AbstractC0060b abstractC0060b, Spliterator spliterator, boolean z) {
        long B = abstractC0060b.B(spliterator);
        if (B < 0 || !spliterator.hasCharacteristics(16384)) {
            G0 g0 = (G0) new P0(abstractC0060b, spliterator, new C0105k(24), new C0105k(25)).invoke();
            return z ? K(g0) : g0;
        }
        if (B >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) B];
        new C0151t1(spliterator, abstractC0060b, iArr).invoke();
        return new C0087g1(iArr);
    }

    public static I0 E(AbstractC0060b abstractC0060b, Spliterator spliterator, boolean z) {
        long B = abstractC0060b.B(spliterator);
        if (B < 0 || !spliterator.hasCharacteristics(16384)) {
            I0 i0 = (I0) new P0(abstractC0060b, spliterator, new C0105k(26), new C0105k(27)).invoke();
            return z ? L(i0) : i0;
        }
        if (B >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) B];
        new C0156u1(spliterator, abstractC0060b, jArr).invoke();
        return new C0132p1(jArr);
    }

    static M0 F(EnumC0129o3 enumC0129o3, K0 k0, K0 k02) {
        int i = L0.a[enumC0129o3.ordinal()];
        if (i == 1) {
            return new W0(k0, k02);
        }
        if (i == 2) {
            return new T0((G0) k0, (G0) k02);
        }
        if (i == 3) {
            return new U0((I0) k0, (I0) k02);
        }
        if (i == 4) {
            return new S0((E0) k0, (E0) k02);
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(enumC0129o3)));
    }

    static InterfaceC0180z0 G(long j) {
        return (j < 0 || j >= 2147483639) ? new Z0() : new Y0(j);
    }

    static AbstractC0077e1 H(EnumC0129o3 enumC0129o3) {
        int i = L0.a[enumC0129o3.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return (AbstractC0077e1) b;
        }
        if (i == 3) {
            return (AbstractC0077e1) c;
        }
        if (i == 4) {
            return (AbstractC0077e1) d;
        }
        throw new IllegalStateException("Unknown shape ".concat(String.valueOf(enumC0129o3)));
    }

    public static K0 I(K0 k0, IntFunction intFunction) {
        if (k0.q() <= 0) {
            return k0;
        }
        long count = k0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        new B1(k0, objArr, 1).invoke();
        return new N0(objArr);
    }

    public static E0 J(E0 e0) {
        if (e0.q() <= 0) {
            return e0;
        }
        long count = e0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) count];
        new C0176y1(e0, dArr, 0).invoke();
        return new X0(dArr);
    }

    public static G0 K(G0 g0) {
        if (g0.q() <= 0) {
            return g0;
        }
        long count = g0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) count];
        new C0181z1(g0, iArr, 0).invoke();
        return new C0087g1(iArr);
    }

    public static I0 L(I0 i0) {
        if (i0.q() <= 0) {
            return i0;
        }
        long count = i0.count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) count];
        new A1(i0, jArr, 0).invoke();
        return new C0132p1(jArr);
    }

    public static C0125o M(Function function) {
        C0125o c0125o = new C0125o();
        c0125o.b = function;
        return c0125o;
    }

    static A0 N(long j) {
        return (j < 0 || j >= 2147483639) ? new C0097i1() : new C0092h1(j);
    }

    static B0 O(long j) {
        return (j < 0 || j >= 2147483639) ? new C0141r1() : new C0137q1(j);
    }

    public static C0165w0 P(EnumC0160v0 enumC0160v0, IntPredicate intPredicate) {
        intPredicate.getClass();
        enumC0160v0.getClass();
        return new C0165w0(EnumC0129o3.INT_VALUE, enumC0160v0, new C0115m(2, enumC0160v0, intPredicate));
    }

    public static C0165w0 Q(EnumC0160v0 enumC0160v0, Predicate predicate) {
        predicate.getClass();
        enumC0160v0.getClass();
        return new C0165w0(EnumC0129o3.REFERENCE, enumC0160v0, new C0115m(3, enumC0160v0, predicate));
    }

    public static void d() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void e(InterfaceC0142r2 interfaceC0142r2, Double d2) {
        if (a4.a) {
            a4.a(interfaceC0142r2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC0142r2.accept(d2.doubleValue());
    }

    public static void g(InterfaceC0147s2 interfaceC0147s2, Integer num) {
        if (a4.a) {
            a4.a(interfaceC0147s2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC0147s2.accept(num.intValue());
    }

    public static void i(InterfaceC0152t2 interfaceC0152t2, Long l) {
        if (a4.a) {
            a4.a(interfaceC0152t2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC0152t2.accept(l.longValue());
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static Object[] m(J0 j0, IntFunction intFunction) {
        if (a4.a) {
            a4.a(j0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (j0.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) j0.count());
        j0.h(objArr, 0);
        return objArr;
    }

    public static void n(E0 e0, Double[] dArr, int i) {
        if (a4.a) {
            a4.a(e0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) e0.c();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static void o(G0 g0, Integer[] numArr, int i) {
        if (a4.a) {
            a4.a(g0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) g0.c();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static void p(I0 i0, Long[] lArr, int i) {
        if (a4.a) {
            a4.a(i0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) i0.c();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static void q(E0 e0, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            e0.d((DoubleConsumer) consumer);
        } else {
            if (a4.a) {
                a4.a(e0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.V) e0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void r(G0 g0, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            g0.d((IntConsumer) consumer);
        } else {
            if (a4.a) {
                a4.a(g0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.OfInt) g0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void s(I0 i0, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            i0.d((LongConsumer) consumer);
        } else {
            if (a4.a) {
                a4.a(i0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.OfLong) i0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static E0 t(E0 e0, long j, long j2) {
        if (j == 0 && j2 == e0.count()) {
            return e0;
        }
        long j3 = j2 - j;
        j$.util.V v = (j$.util.V) e0.spliterator();
        InterfaceC0180z0 G = G(j3);
        G.k(j3);
        for (int i = 0; i < j && v.tryAdvance((DoubleConsumer) new D0(0)); i++) {
        }
        if (j2 == e0.count()) {
            v.forEachRemaining((DoubleConsumer) G);
        } else {
            for (int i2 = 0; i2 < j3 && v.tryAdvance((DoubleConsumer) G); i2++) {
            }
        }
        G.j();
        return G.build();
    }

    public static G0 u(G0 g0, long j, long j2) {
        if (j == 0 && j2 == g0.count()) {
            return g0;
        }
        long j3 = j2 - j;
        Spliterator.OfInt ofInt = (Spliterator.OfInt) g0.spliterator();
        A0 N = N(j3);
        N.k(j3);
        for (int i = 0; i < j && ofInt.tryAdvance((IntConsumer) new F0(0)); i++) {
        }
        if (j2 == g0.count()) {
            ofInt.forEachRemaining((IntConsumer) N);
        } else {
            for (int i2 = 0; i2 < j3 && ofInt.tryAdvance((IntConsumer) N); i2++) {
            }
        }
        N.j();
        return N.build();
    }

    public static I0 v(I0 i0, long j, long j2) {
        if (j == 0 && j2 == i0.count()) {
            return i0;
        }
        long j3 = j2 - j;
        Spliterator.OfLong ofLong = (Spliterator.OfLong) i0.spliterator();
        B0 O = O(j3);
        O.k(j3);
        for (int i = 0; i < j && ofLong.tryAdvance((LongConsumer) new H0(0)); i++) {
        }
        if (j2 == i0.count()) {
            ofLong.forEachRemaining((LongConsumer) O);
        } else {
            for (int i2 = 0; i2 < j3 && ofLong.tryAdvance((LongConsumer) O); i2++) {
            }
        }
        O.j();
        return O.build();
    }

    public static K0 w(K0 k0, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == k0.count()) {
            return k0;
        }
        Spliterator spliterator = k0.spliterator();
        long j3 = j2 - j;
        C0 A = A(j3, intFunction);
        A.k(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new W(21)); i++) {
        }
        if (j2 == k0.count()) {
            spliterator.forEachRemaining(A);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(A); i2++) {
            }
        }
        A.j();
        return A.build();
    }

    public abstract X1 R();

    @Override // j$.util.stream.X3
    public Object a(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        X1 R = R();
        abstractC0060b.p(spliterator, abstractC0060b.R(R));
        return R.get();
    }

    @Override // j$.util.stream.X3
    public Object b(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        return ((X1) new C0078e2(this, abstractC0060b, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.X3
    public /* synthetic */ int c() {
        return 0;
    }
}
