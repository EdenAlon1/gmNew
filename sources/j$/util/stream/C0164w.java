package j$.util.stream;

import java.util.function.Consumer;

/* renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0164w extends AbstractC0113l2 {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0164w(AbstractC0060b abstractC0060b, int i, Object obj, int i2) {
        super(abstractC0060b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.AbstractC0060b
    final InterfaceC0157u2 M(int i, InterfaceC0157u2 interfaceC0157u2) {
        switch (this.m) {
            case 0:
                return new C0159v(this, interfaceC0157u2, 0);
            case 1:
                return new X(this, interfaceC0157u2, 0);
            case 2:
                return new C0096i0(this, interfaceC0157u2, 0);
            case 3:
                return new r(this, interfaceC0157u2, 1);
            default:
                return new r(this, interfaceC0157u2, 2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0164w(AbstractC0118m2 abstractC0118m2, Consumer consumer) {
        super(abstractC0118m2, 0, 1);
        this.m = 3;
        this.n = consumer;
    }
}
