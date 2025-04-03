package j$.util.stream;

import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.LongBinaryOperator;

/* loaded from: classes9.dex */
final class F1 extends AbstractC0175y0 {
    public final /* synthetic */ int h;
    final /* synthetic */ Object i;

    public /* synthetic */ F1(EnumC0129o3 enumC0129o3, Object obj, int i) {
        this.h = i;
        this.i = obj;
    }

    @Override // j$.util.stream.AbstractC0175y0
    public final X1 R() {
        switch (this.h) {
            case 0:
                return new W1((LongBinaryOperator) this.i);
            case 1:
                return new I1((DoubleBinaryOperator) this.i);
            case 2:
                return new N1((BinaryOperator) this.i);
            default:
                return new T1((IntBinaryOperator) this.i);
        }
    }
}
