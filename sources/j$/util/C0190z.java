package j$.util;

import androidx.car.app.model.Alert;
import defpackage.eobe;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* renamed from: j$.util.z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0190z implements IntConsumer {
    private long count;
    private long sum;
    private int min = Alert.DURATION_SHOW_INDEFINITELY;
    private int max = Integer.MIN_VALUE;

    public final void a(C0190z c0190z) {
        this.count += c0190z.count;
        this.sum += c0190z.sum;
        this.min = Math.min(this.min, c0190z.min);
        this.max = Math.max(this.max, c0190z.max);
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        this.count++;
        this.sum += i;
        this.min = Math.min(this.min, i);
        this.max = Math.max(this.max, i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    public final String toString() {
        String simpleName = C0190z.class.getSimpleName();
        Long valueOf = Long.valueOf(this.count);
        Long valueOf2 = Long.valueOf(this.sum);
        Integer valueOf3 = Integer.valueOf(this.min);
        long j = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, valueOf, valueOf2, valueOf3, Double.valueOf(j > 0 ? this.sum / j : eobe.a), Integer.valueOf(this.max));
    }
}
