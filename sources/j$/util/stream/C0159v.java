package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoubleUnaryOperator;

/* renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0159v extends AbstractC0123n2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC0060b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0159v(AbstractC0060b abstractC0060b, InterfaceC0157u2 interfaceC0157u2, int i) {
        super(interfaceC0157u2);
        this.b = i;
        this.c = abstractC0060b;
    }

    @Override // j$.util.stream.InterfaceC0142r2, j$.util.stream.InterfaceC0157u2
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                this.a.accept((InterfaceC0157u2) ((DoubleFunction) ((C0164w) this.c).n).apply(d));
                break;
            case 1:
                this.a.accept(((DoubleUnaryOperator) ((C0169x) this.c).n).applyAsDouble(d));
                break;
            default:
                ((DoubleConsumer) ((C0169x) this.c).n).accept(d);
                this.a.accept(d);
                break;
        }
    }
}
