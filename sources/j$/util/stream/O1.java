package j$.util.stream;

import j$.util.stream.Collector;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
final class O1 extends AbstractC0175y0 {
    final /* synthetic */ BinaryOperator h;
    final /* synthetic */ BiConsumer i;
    final /* synthetic */ Supplier j;
    final /* synthetic */ Collector k;

    O1(EnumC0129o3 enumC0129o3, BinaryOperator binaryOperator, BiConsumer biConsumer, Supplier supplier, Collector collector) {
        this.h = binaryOperator;
        this.i = biConsumer;
        this.j = supplier;
        this.k = collector;
    }

    @Override // j$.util.stream.AbstractC0175y0
    public final X1 R() {
        return new P1(this.j, this.i, this.h);
    }

    @Override // j$.util.stream.AbstractC0175y0, j$.util.stream.X3
    public final int c() {
        if (this.k.characteristics().contains(Collector.Characteristics.UNORDERED)) {
            return EnumC0124n3.r;
        }
        return 0;
    }
}
