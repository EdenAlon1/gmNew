package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes9.dex */
final class B3 extends AbstractC0134p3 implements Spliterator.OfInt {
    @Override // j$.util.stream.AbstractC0134p3
    final void d() {
        C0059a3 c0059a3 = new C0059a3();
        this.h = c0059a3;
        this.e = this.b.R(new A3(c0059a3, 0));
        this.f = new C0055a(8, this);
    }

    @Override // j$.util.stream.AbstractC0134p3
    final AbstractC0134p3 e(Spliterator spliterator) {
        return new B3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Q.b(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.Q.f(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0134p3, j$.util.Spliterator
    public final Spliterator.OfInt trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(IntConsumer intConsumer) {
        intConsumer.getClass();
        boolean a = a();
        if (a) {
            C0059a3 c0059a3 = (C0059a3) this.h;
            long j = this.g;
            int x = c0059a3.x(j);
            intConsumer.accept((c0059a3.c == 0 && x == 0) ? ((int[]) c0059a3.e)[(int) j] : ((int[][]) c0059a3.f)[x][(int) (j - c0059a3.d[x])]);
        }
        return a;
    }

    @Override // j$.util.stream.AbstractC0134p3, j$.util.Spliterator
    public final j$.util.d0 trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }

    @Override // j$.util.d0
    public final void forEachRemaining(IntConsumer intConsumer) {
        if (this.h == null && !this.i) {
            intConsumer.getClass();
            c();
            A3 a3 = new A3(intConsumer, 1);
            this.b.Q(this.d, a3);
            this.i = true;
            return;
        }
        while (tryAdvance(intConsumer)) {
        }
    }

    @Override // j$.util.stream.AbstractC0134p3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (Spliterator.OfInt) super.trySplit();
    }
}
