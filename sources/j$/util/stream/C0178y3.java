package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.y3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0178y3 extends AbstractC0134p3 implements j$.util.V {
    @Override // j$.util.stream.AbstractC0134p3
    final void d() {
        Y2 y2 = new Y2();
        this.h = y2;
        this.e = this.b.R(new C0173x3(y2, 0));
        this.f = new C0055a(7, this);
    }

    @Override // j$.util.stream.AbstractC0134p3
    final AbstractC0134p3 e(Spliterator spliterator) {
        return new C0178y3(this.b, spliterator, this.a);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.Q.a(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.Q.e(this, consumer);
    }

    @Override // j$.util.stream.AbstractC0134p3, j$.util.Spliterator
    public final j$.util.V trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.d0
    public final boolean tryAdvance(DoubleConsumer doubleConsumer) {
        doubleConsumer.getClass();
        boolean a = a();
        if (a) {
            Y2 y2 = (Y2) this.h;
            long j = this.g;
            int x = y2.x(j);
            doubleConsumer.accept((y2.c == 0 && x == 0) ? ((double[]) y2.e)[(int) j] : ((double[][]) y2.f)[x][(int) (j - y2.d[x])]);
        }
        return a;
    }

    @Override // j$.util.stream.AbstractC0134p3, j$.util.Spliterator
    public final j$.util.d0 trySplit() {
        return (j$.util.V) super.trySplit();
    }

    @Override // j$.util.d0
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        if (this.h == null && !this.i) {
            doubleConsumer.getClass();
            c();
            C0173x3 c0173x3 = new C0173x3(doubleConsumer, 1);
            this.b.Q(this.d, c0173x3);
            this.i = true;
            return;
        }
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // j$.util.stream.AbstractC0134p3, j$.util.Spliterator
    public final Spliterator trySplit() {
        return (j$.util.V) super.trySplit();
    }
}
