package j$.util.stream;

import java.util.function.Function;

/* renamed from: j$.util.stream.h2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0093h2 extends AbstractC0113l2 {
    public final /* synthetic */ int m;
    final /* synthetic */ Function n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0093h2(AbstractC0118m2 abstractC0118m2, int i, Function function, int i2) {
        super(abstractC0118m2, i, 1);
        this.m = i2;
        this.n = function;
    }

    @Override // j$.util.stream.AbstractC0060b
    final InterfaceC0157u2 M(int i, InterfaceC0157u2 interfaceC0157u2) {
        switch (this.m) {
            case 0:
                return new r(this, interfaceC0157u2, 3);
            default:
                return new C0135q(this, interfaceC0157u2);
        }
    }
}
