package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.d0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0071d0 extends AbstractC0081f0 {
    @Override // j$.util.stream.AbstractC0060b
    final boolean L() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0060b
    final InterfaceC0157u2 M(int i, InterfaceC0157u2 interfaceC0157u2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC0081f0, j$.util.stream.IntStream
    public final void forEach(IntConsumer intConsumer) {
        Spliterator.OfInt U;
        if (isParallel()) {
            super.forEach(intConsumer);
        } else {
            U = AbstractC0081f0.U(O());
            U.forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC0081f0, j$.util.stream.IntStream
    public final void forEachOrdered(IntConsumer intConsumer) {
        Spliterator.OfInt U;
        if (isParallel()) {
            super.forEachOrdered(intConsumer);
        } else {
            U = AbstractC0081f0.U(O());
            U.forEachRemaining(intConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC0060b, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    @Override // j$.util.stream.AbstractC0060b, j$.util.stream.BaseStream, j$.util.stream.DoubleStream
    public final /* bridge */ /* synthetic */ IntStream sequential() {
        sequential();
        return this;
    }
}
