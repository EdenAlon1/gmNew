package j$.util.stream;

import java.util.function.LongBinaryOperator;

/* loaded from: classes9.dex */
final class D1 extends AbstractC0175y0 {
    final /* synthetic */ LongBinaryOperator h;
    final /* synthetic */ long i;

    D1(EnumC0129o3 enumC0129o3, LongBinaryOperator longBinaryOperator, long j) {
        this.h = longBinaryOperator;
        this.i = j;
    }

    @Override // j$.util.stream.AbstractC0175y0
    public final X1 R() {
        return new V1(this.i, this.h);
    }
}
