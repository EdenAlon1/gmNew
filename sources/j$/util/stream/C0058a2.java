package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0058a2 extends AbstractC0073d2 implements InterfaceC0147s2 {
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

    @Override // j$.util.stream.AbstractC0073d2, j$.util.stream.InterfaceC0157u2, java.util.function.IntConsumer
    public final void accept(int i) {
        this.b++;
    }
}
