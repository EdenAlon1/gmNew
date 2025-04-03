package j$.util;

import java.util.function.DoubleConsumer;

/* loaded from: classes9.dex */
public interface V extends d0 {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // j$.util.d0, j$.util.Spliterator
    V trySplit();
}
