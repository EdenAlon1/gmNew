package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.a1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0057a1 extends AbstractC0077e1 implements E0 {
    @Override // j$.util.stream.AbstractC0077e1, j$.util.stream.K0
    public final /* bridge */ /* synthetic */ K0 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.J0
    public final Object c() {
        double[] dArr;
        dArr = AbstractC0175y0.g;
        return dArr;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void forEach(Consumer consumer) {
        AbstractC0175y0.q(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0077e1, j$.util.stream.K0
    public final /* synthetic */ K0 g(long j, long j2, IntFunction intFunction) {
        return AbstractC0175y0.t(this, j, j2);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void h(Object[] objArr, int i) {
        AbstractC0175y0.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.K0
    public final j$.util.d0 spliterator() {
        return Spliterators.b();
    }

    @Override // j$.util.stream.AbstractC0077e1, j$.util.stream.K0
    public final J0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final Spliterator spliterator() {
        return Spliterators.b();
    }
}
