package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.t, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0149t implements DoubleConsumer {
    public final /* synthetic */ InterfaceC0157u2 a;

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.a.accept(d);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.nio.channels.c.a(this, doubleConsumer);
    }
}
