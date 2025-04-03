package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
final class G3 extends H3 implements Spliterator.OfLong {
    @Override // j$.util.stream.J3
    protected final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new G3((Spliterator.OfLong) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.H3
    protected final Object b() {
        return new H0(1);
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
