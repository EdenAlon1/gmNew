package j$.util.stream;

import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* loaded from: classes9.dex */
final class X2 extends AbstractC0074d3 implements j$.util.V {
    final /* synthetic */ Y2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    X2(Y2 y2, int i, int i2, int i3, int i4) {
        super(y2, i, i2, i3, i4);
        this.g = y2;
    }

    @Override // j$.util.stream.AbstractC0074d3
    final void a(int i, Object obj, Object obj2) {
        ((DoubleConsumer) obj2).accept(((double[]) obj)[i]);
    }

    @Override // j$.util.stream.AbstractC0074d3
    final j$.util.d0 b(Object obj, int i, int i2) {
        return Spliterators.i((double[]) obj, i, i2 + i);
    }

    @Override // j$.util.stream.AbstractC0074d3
    final j$.util.d0 c(int i, int i2, int i3, int i4) {
        return new X2(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Q.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.Q.e(this, consumer);
    }
}
