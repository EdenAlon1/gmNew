package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes9.dex */
final class N extends Q implements InterfaceC0147s2 {
    final IntConsumer b;

    N(IntConsumer intConsumer, boolean z) {
        super(z);
        this.b = intConsumer;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0147s2
    public final /* synthetic */ void l(Integer num) {
        AbstractC0175y0.g(this, num);
    }

    @Override // j$.util.stream.Q, j$.util.stream.InterfaceC0157u2, java.util.function.IntConsumer
    public final void accept(int i) {
        this.b.accept(i);
    }
}
