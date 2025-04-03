package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes9.dex */
final class Z2 extends AbstractC0074d3 implements Spliterator.OfInt {
    final /* synthetic */ C0059a3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z2(C0059a3 c0059a3, int i, int i2, int i3, int i4) {
        super(c0059a3, i, i2, i3, i4);
        this.g = c0059a3;
    }

    @Override // j$.util.stream.AbstractC0074d3
    final void a(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    @Override // j$.util.stream.AbstractC0074d3
    final j$.util.d0 b(Object obj, int i, int i2) {
        return Spliterators.spliterator((int[]) obj, i, i2 + i, 1040);
    }

    @Override // j$.util.stream.AbstractC0074d3
    final j$.util.d0 c(int i, int i2, int i3, int i4) {
        return new Z2(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Q.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.Q.f(this, consumer);
    }
}
