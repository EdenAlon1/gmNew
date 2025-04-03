package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes9.dex */
final class Z1 extends AbstractC0073d2 implements InterfaceC0142r2 {
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        o((Double) obj);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.nio.channels.c.a(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC0142r2
    public final /* synthetic */ void o(Double d) {
        AbstractC0175y0.e(this, d);
    }

    @Override // j$.util.stream.AbstractC0073d2, j$.util.stream.InterfaceC0157u2
    public final void accept(double d) {
        this.b++;
    }
}
