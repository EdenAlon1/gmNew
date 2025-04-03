package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
final class E3 extends H3 implements j$.util.V {
    @Override // j$.util.stream.J3
    protected final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new E3((j$.util.V) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.H3
    protected final Object b() {
        return new D0(1);
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
