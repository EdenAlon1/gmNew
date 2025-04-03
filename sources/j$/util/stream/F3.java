package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
final class F3 extends H3 implements Spliterator.OfInt {
    @Override // j$.util.stream.J3
    protected final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new F3((Spliterator.OfInt) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.H3
    protected final Object b() {
        return new F0(1);
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
