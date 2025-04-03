package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
abstract class AbstractC0060b implements BaseStream {
    private final AbstractC0060b a;
    private final AbstractC0060b b;
    protected final int c;
    private AbstractC0060b d;
    private int e;
    private int f;
    private Spliterator g;
    private boolean h;
    private boolean i;
    private Runnable j;
    private boolean k;

    AbstractC0060b(Spliterator spliterator, int i, boolean z) {
        this.b = null;
        this.g = spliterator;
        this.a = this;
        int i2 = EnumC0124n3.g & i;
        this.c = i2;
        this.f = (~(i2 << 1)) & EnumC0124n3.l;
        this.e = 0;
        this.k = z;
    }

    private Spliterator N(int i) {
        int i2;
        int i3;
        AbstractC0060b abstractC0060b = this.a;
        Spliterator spliterator = abstractC0060b.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0060b.g = null;
        if (abstractC0060b.k && abstractC0060b.i) {
            AbstractC0060b abstractC0060b2 = abstractC0060b.d;
            int i4 = 1;
            while (abstractC0060b != this) {
                int i5 = abstractC0060b2.c;
                if (abstractC0060b2.L()) {
                    if (EnumC0124n3.SHORT_CIRCUIT.y(i5)) {
                        i5 &= ~EnumC0124n3.u;
                    }
                    spliterator = abstractC0060b2.K(abstractC0060b, spliterator);
                    if (spliterator.hasCharacteristics(64)) {
                        i2 = (~EnumC0124n3.t) & i5;
                        i3 = EnumC0124n3.s;
                    } else {
                        i2 = (~EnumC0124n3.s) & i5;
                        i3 = EnumC0124n3.t;
                    }
                    i5 = i2 | i3;
                    i4 = 0;
                }
                int i6 = i4 + 1;
                abstractC0060b2.e = i4;
                abstractC0060b2.f = EnumC0124n3.o(i5, abstractC0060b.f);
                AbstractC0060b abstractC0060b3 = abstractC0060b2;
                abstractC0060b2 = abstractC0060b2.d;
                abstractC0060b = abstractC0060b3;
                i4 = i6;
            }
        }
        if (i != 0) {
            this.f = EnumC0124n3.o(i, this.f);
        }
        return spliterator;
    }

    abstract K0 A(AbstractC0060b abstractC0060b, Spliterator spliterator, boolean z, IntFunction intFunction);

    final long B(Spliterator spliterator) {
        if (EnumC0124n3.SIZED.y(this.f)) {
            return spliterator.getExactSizeIfKnown();
        }
        return -1L;
    }

    abstract boolean C(Spliterator spliterator, InterfaceC0157u2 interfaceC0157u2);

    abstract EnumC0129o3 D();

    final EnumC0129o3 E() {
        AbstractC0060b abstractC0060b = this;
        while (abstractC0060b.e > 0) {
            abstractC0060b = abstractC0060b.b;
        }
        return abstractC0060b.D();
    }

    final int F() {
        return this.f;
    }

    final boolean G() {
        return EnumC0124n3.ORDERED.y(this.f);
    }

    final /* synthetic */ Spliterator H() {
        return N(0);
    }

    abstract C0 I(long j, IntFunction intFunction);

    K0 J(AbstractC0060b abstractC0060b, Spliterator spliterator, IntFunction intFunction) {
        throw new UnsupportedOperationException("Parallel evaluation is not supported");
    }

    Spliterator K(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        return J(abstractC0060b, spliterator, new g4(1)).spliterator();
    }

    abstract boolean L();

    abstract InterfaceC0157u2 M(int i, InterfaceC0157u2 interfaceC0157u2);

    final Spliterator O() {
        AbstractC0060b abstractC0060b = this.a;
        if (this != abstractC0060b) {
            throw new IllegalStateException();
        }
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        Spliterator spliterator = abstractC0060b.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0060b.g = null;
        return spliterator;
    }

    abstract Spliterator P(AbstractC0060b abstractC0060b, Supplier supplier, boolean z);

    final InterfaceC0157u2 Q(Spliterator spliterator, InterfaceC0157u2 interfaceC0157u2) {
        interfaceC0157u2.getClass();
        p(spliterator, R(interfaceC0157u2));
        return interfaceC0157u2;
    }

    final InterfaceC0157u2 R(InterfaceC0157u2 interfaceC0157u2) {
        interfaceC0157u2.getClass();
        AbstractC0060b abstractC0060b = this;
        while (abstractC0060b.e > 0) {
            AbstractC0060b abstractC0060b2 = abstractC0060b.b;
            interfaceC0157u2 = abstractC0060b.M(abstractC0060b2.f, interfaceC0157u2);
            abstractC0060b = abstractC0060b2;
        }
        return interfaceC0157u2;
    }

    final Spliterator S(Spliterator spliterator) {
        return this.e == 0 ? spliterator : P(this, new C0055a(13, spliterator), this.a.k);
    }

    @Override // j$.util.stream.BaseStream, java.lang.AutoCloseable
    public final void close() {
        this.h = true;
        this.g = null;
        AbstractC0060b abstractC0060b = this.a;
        Runnable runnable = abstractC0060b.j;
        if (runnable != null) {
            abstractC0060b.j = null;
            runnable.run();
        }
    }

    @Override // j$.util.stream.BaseStream
    public final boolean isParallel() {
        return this.a.k;
    }

    @Override // j$.util.stream.BaseStream
    public final BaseStream onClose(Runnable runnable) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        runnable.getClass();
        AbstractC0060b abstractC0060b = this.a;
        Runnable runnable2 = abstractC0060b.j;
        if (runnable2 != null) {
            runnable = new S3(0, runnable2, runnable);
        }
        abstractC0060b.j = runnable;
        return this;
    }

    final void p(Spliterator spliterator, InterfaceC0157u2 interfaceC0157u2) {
        interfaceC0157u2.getClass();
        if (EnumC0124n3.SHORT_CIRCUIT.y(this.f)) {
            s(spliterator, interfaceC0157u2);
            return;
        }
        interfaceC0157u2.k(spliterator.getExactSizeIfKnown());
        spliterator.forEachRemaining(interfaceC0157u2);
        interfaceC0157u2.j();
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final BaseStream parallel() {
        this.a.k = true;
        return this;
    }

    final boolean s(Spliterator spliterator, InterfaceC0157u2 interfaceC0157u2) {
        AbstractC0060b abstractC0060b = this;
        while (abstractC0060b.e > 0) {
            abstractC0060b = abstractC0060b.b;
        }
        interfaceC0157u2.k(spliterator.getExactSizeIfKnown());
        boolean C = abstractC0060b.C(spliterator, interfaceC0157u2);
        interfaceC0157u2.j();
        return C;
    }

    @Override // j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final BaseStream sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.BaseStream
    public Spliterator spliterator() {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        AbstractC0060b abstractC0060b = this.a;
        if (this != abstractC0060b) {
            return P(this, new C0055a(0, this), abstractC0060b.k);
        }
        Spliterator spliterator = abstractC0060b.g;
        if (spliterator == null) {
            throw new IllegalStateException("source already consumed or closed");
        }
        abstractC0060b.g = null;
        return spliterator;
    }

    final K0 t(Spliterator spliterator, boolean z, IntFunction intFunction) {
        if (this.a.k) {
            return A(this, spliterator, z, intFunction);
        }
        C0 I = I(B(spliterator), intFunction);
        Q(spliterator, I);
        return I.build();
    }

    final Object w(X3 x3) {
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        return this.a.k ? x3.b(this, N(x3.c())) : x3.a(this, N(x3.c()));
    }

    final K0 z(IntFunction intFunction) {
        AbstractC0060b abstractC0060b;
        if (this.h) {
            throw new IllegalStateException("stream has already been operated upon or closed");
        }
        this.h = true;
        if (!this.a.k || (abstractC0060b = this.b) == null || !L()) {
            return t(N(0), true, intFunction);
        }
        this.e = 0;
        return J(abstractC0060b, abstractC0060b.N(0), intFunction);
    }

    AbstractC0060b(AbstractC0060b abstractC0060b, int i) {
        if (!abstractC0060b.h) {
            abstractC0060b.h = true;
            abstractC0060b.d = this;
            this.b = abstractC0060b;
            this.c = EnumC0124n3.h & i;
            this.f = EnumC0124n3.o(i, abstractC0060b.f);
            AbstractC0060b abstractC0060b2 = abstractC0060b.a;
            this.a = abstractC0060b2;
            if (L()) {
                abstractC0060b2.i = true;
            }
            this.e = abstractC0060b.e + 1;
            return;
        }
        throw new IllegalStateException("stream has already been operated upon or closed");
    }
}
