package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.m0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0116m0 extends AbstractC0126o0 {
    @Override // j$.util.stream.AbstractC0060b
    final boolean L() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0060b
    final InterfaceC0157u2 M(int i, InterfaceC0157u2 interfaceC0157u2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0126o0, j$.util.stream.LongStream
    public final void forEach(LongConsumer longConsumer) {
        Spliterator.OfLong U;
        if (isParallel()) {
            super.forEach(longConsumer);
        } else {
            U = AbstractC0126o0.U(O());
            U.forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC0126o0, j$.util.stream.LongStream
    public final void forEachOrdered(LongConsumer longConsumer) {
        Spliterator.OfLong U;
        if (isParallel()) {
            super.forEachOrdered(longConsumer);
        } else {
            U = AbstractC0126o0.U(O());
            U.forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC0060b, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* bridge */ /* synthetic */ LongStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0060b, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* bridge */ /* synthetic */ LongStream sequential() {
        sequential();
        return this;
    }
}
