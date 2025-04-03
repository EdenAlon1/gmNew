package j$.util.stream;

import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.b3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0064b3 extends AbstractC0074d3 implements Spliterator.OfLong {
    final /* synthetic */ C0069c3 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0064b3(C0069c3 c0069c3, int i, int i2, int i3, int i4) {
        super(c0069c3, i, i2, i3, i4);
        this.g = c0069c3;
    }

    @Override // j$.util.stream.AbstractC0074d3
    final void a(int i, Object obj, Object obj2) {
        ((LongConsumer) obj2).accept(((long[]) obj)[i]);
    }

    @Override // j$.util.stream.AbstractC0074d3
    final j$.util.d0 b(Object obj, int i, int i2) {
        return Spliterators.spliterator((long[]) obj, i, i2 + i, 1040);
    }

    @Override // j$.util.stream.AbstractC0074d3
    final j$.util.d0 c(int i, int i2, int i3, int i4) {
        return new C0064b3(this.g, i, i2, i3, i4);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Q.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.Q.g(this, consumer);
    }
}
