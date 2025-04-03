package j$.util.stream;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.stream.x, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0169x extends A {
    public final /* synthetic */ int m;
    final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0169x(AbstractC0060b abstractC0060b, int i, Object obj, int i2) {
        super(abstractC0060b, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.AbstractC0060b
    final InterfaceC0157u2 M(int i, InterfaceC0157u2 interfaceC0157u2) {
        switch (this.m) {
            case 0:
                return new C0159v(this, interfaceC0157u2, 1);
            case 1:
                return new C0174y(this, interfaceC0157u2);
            case 2:
                return new C0159v(this, interfaceC0157u2, 2);
            case 3:
                return new r(this, interfaceC0157u2, 6);
            default:
                return new C0103j2(this, interfaceC0157u2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0169x(A a, DoubleConsumer doubleConsumer) {
        super(a, 0, 1);
        this.m = 2;
        this.n = doubleConsumer;
    }
}
