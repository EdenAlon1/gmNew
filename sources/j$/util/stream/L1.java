package j$.util.stream;

import java.util.function.DoubleBinaryOperator;

/* loaded from: classes9.dex */
final class L1 extends AbstractC0175y0 {
    final /* synthetic */ DoubleBinaryOperator h;
    final /* synthetic */ double i;

    L1(EnumC0129o3 enumC0129o3, DoubleBinaryOperator doubleBinaryOperator, double d) {
        this.h = doubleBinaryOperator;
        this.i = d;
    }

    @Override // j$.util.stream.AbstractC0175y0
    public final X1 R() {
        return new G1(this.i, this.h);
    }
}
