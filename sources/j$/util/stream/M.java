package j$.util.stream;

import java.util.function.DoubleConsumer;

/* loaded from: classes9.dex */
final class M extends Q implements InterfaceC0142r2 {
    final DoubleConsumer b;

    M(DoubleConsumer doubleConsumer, boolean z) {
        super(z);
        this.b = doubleConsumer;
    }

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

    @Override // j$.util.stream.Q, j$.util.stream.InterfaceC0157u2
    public final void accept(double d) {
        this.b.accept(d);
    }
}
