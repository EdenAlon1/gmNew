package j$.util.stream;

import j$.util.function.LongConsumer$CC;
import java.util.function.LongConsumer;

/* loaded from: classes9.dex */
final class O extends Q implements InterfaceC0152t2 {
    final LongConsumer b;

    O(LongConsumer longConsumer, boolean z) {
        super(z);
        this.b = longConsumer;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        i((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC0152t2
    public final /* synthetic */ void i(Long l) {
        AbstractC0175y0.i(this, l);
    }

    @Override // j$.util.stream.Q, j$.util.stream.InterfaceC0157u2
    public final void accept(long j) {
        this.b.accept(j);
    }
}
