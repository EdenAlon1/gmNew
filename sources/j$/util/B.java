package j$.util;

import defpackage.eobe;
import j$.util.function.IntConsumer$CC;
import j$.util.function.LongConsumer$CC;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* loaded from: classes9.dex */
public final class B implements LongConsumer, IntConsumer {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    public final void a(B b) {
        this.count += b.count;
        this.sum += b.sum;
        this.min = Math.min(this.min, b.min);
        this.max = Math.max(this.max, b.max);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        accept(i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    public final String toString() {
        String simpleName = B.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        Long valueOf2 = Long.valueOf(this.sum);
        Long valueOf3 = Long.valueOf(this.min);
        long j = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(j > 0 ? this.sum / j : eobe.a), Long.valueOf(this.max));
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        this.count++;
        this.sum += j;
        this.min = Math.min(this.min, j);
        this.max = Math.max(this.max, j);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }
}
