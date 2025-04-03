package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongUnaryOperator;

/* renamed from: j$.util.stream.i0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0096i0 extends AbstractC0133p2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC0060b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0096i0(AbstractC0060b abstractC0060b, InterfaceC0157u2 interfaceC0157u2, int i) {
        super(interfaceC0157u2);
        this.b = i;
        this.c = abstractC0060b;
    }

    @Override // j$.util.stream.InterfaceC0152t2, j$.util.stream.InterfaceC0157u2
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept((InterfaceC0157u2) ((LongFunction) ((C0164w) this.c).n).apply(j));
                break;
            case 1:
                this.a.accept(((LongUnaryOperator) ((C0106k0) this.c).n).applyAsLong(j));
                break;
            default:
                ((LongConsumer) ((C0106k0) this.c).n).accept(j);
                this.a.accept(j);
                break;
        }
    }
}
