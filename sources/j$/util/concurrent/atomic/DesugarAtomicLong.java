package j$.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongUnaryOperator;

/* loaded from: classes9.dex */
public class DesugarAtomicLong {
    public static long updateAndGet(AtomicLong atomicLong, LongUnaryOperator longUnaryOperator) {
        long j;
        long applyAsLong;
        do {
            j = atomicLong.get();
            applyAsLong = longUnaryOperator.applyAsLong(j);
        } while (!atomicLong.compareAndSet(j, applyAsLong));
        return applyAsLong;
    }
}
