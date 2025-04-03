package j$.util.stream;

import java.util.function.IntConsumer;

/* loaded from: classes9.dex */
final class Y extends AbstractC0076e0 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Y(AbstractC0060b abstractC0060b, int i, Object obj, int i2) {
        super(abstractC0060b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.AbstractC0060b
    final InterfaceC0157u2 M(int i, InterfaceC0157u2 interfaceC0157u2) {
        switch (this.m) {
            case 0:
                return new X(this, interfaceC0157u2, 1);
            case 1:
                return new X(this, interfaceC0157u2, 2);
            case 2:
                return new C0061b0(this, interfaceC0157u2);
            case 3:
                return new X(this, interfaceC0157u2, 3);
            case 4:
                return new r(this, interfaceC0157u2, 4);
            default:
                return new C0098i2(this, interfaceC0157u2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(AbstractC0081f0 abstractC0081f0, IntConsumer intConsumer) {
        super(abstractC0081f0, 0, 1);
        this.m = 0;
        this.n = intConsumer;
    }
}
