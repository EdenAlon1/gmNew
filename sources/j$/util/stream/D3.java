package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* loaded from: classes9.dex */
final class D3 extends AbstractC0134p3 implements Spliterator.OfLong {
    @Override // j$.util.stream.AbstractC0134p3
    final void d() {
        C0069c3 c0069c3 = new C0069c3();
        this.h = c0069c3;
        this.e = this.b.R(new C3(c0069c3, 0));
        this.f = new C0055a(9, this);
    }

    @Override // j$.util.stream.AbstractC0134p3
    final AbstractC0134p3 e(Spliterator spliterator) {
        return new D3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Q.c(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.Q.g(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0134p3, j$.util.Spliterator
    public final Spliterator.OfLong trySplit() {
        return (Spliterator.OfLong) super.trySplit();
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(LongConsumer longConsumer) {
        longConsumer.getClass();
        boolean a = a();
        if (a) {
            C0069c3 c0069c3 = (C0069c3) this.h;
            long j = this.g;
            int x = c0069c3.x(j);
            longConsumer.accept((c0069c3.c == 0 && x == 0) ? ((long[]) c0069c3.e)[(int) j] : ((long[][]) c0069c3.f)[x][(int) (j - c0069c3.d[x])]);
        }
        return a;
    }

    @Override // j$.util.stream.AbstractC0134p3, j$.util.Spliterator
    public final j$.util.d0 trySplit() {
        return (Spliterator.OfLong) super.trySplit();
    }

    @Override // j$.util.d0
    public final void forEachRemaining(LongConsumer longConsumer) {
        if (this.h == null && !this.i) {
            longConsumer.getClass();
            c();
            C3 c3 = new C3(longConsumer, 1);
            this.b.Q(this.d, c3);
            this.i = true;
            return;
        }
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // j$.util.stream.AbstractC0134p3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Spliterator.OfLong) super.trySplit();
    }
}
