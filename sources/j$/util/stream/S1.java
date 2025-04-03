package j$.util.stream;

import java.util.function.IntBinaryOperator;

/* loaded from: classes9.dex */
final class S1 extends AbstractC0175y0 {
    final /* synthetic */ IntBinaryOperator h;
    final /* synthetic */ int i;

    S1(EnumC0129o3 enumC0129o3, IntBinaryOperator intBinaryOperator, int i) {
        this.h = intBinaryOperator;
        this.i = i;
    }

    @Override // j$.util.stream.AbstractC0175y0
    public final X1 R() {
        return new R1(this.i, this.h);
    }
}
