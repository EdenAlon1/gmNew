package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
final class S0 extends V0 implements E0 {
    @Override // j$.util.stream.J0
    public final Object b(int i) {
        return new double[i];
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0175y0.q(this, consumer);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 g(long j, long j2, IntFunction intFunction) {
        return AbstractC0175y0.t(this, j, j2);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void h(Object[] objArr, int i) {
        AbstractC0175y0.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.K0
    public final j$.util.d0 spliterator() {
        return new C0102j1(this);
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return new C0102j1(this);
    }
}
