package j$.util.stream;

import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0106k0 extends AbstractC0121n0 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0106k0(AbstractC0060b abstractC0060b, int i, Object obj, int i2) {
        super(abstractC0060b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.AbstractC0060b
    final InterfaceC0157u2 M(int i, InterfaceC0157u2 interfaceC0157u2) {
        switch (this.m) {
            case 0:
                return new C0096i0(this, interfaceC0157u2, 1);
            case 1:
                return new C0111l0(this, interfaceC0157u2);
            case 2:
                return new C0096i0(this, interfaceC0157u2, 2);
            case 3:
                return new C0083f2(this, interfaceC0157u2);
            default:
                return new r(this, interfaceC0157u2, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0106k0(AbstractC0126o0 abstractC0126o0, LongConsumer longConsumer) {
        super(abstractC0126o0, 0, 1);
        this.m = 2;
        this.n = longConsumer;
    }
}
