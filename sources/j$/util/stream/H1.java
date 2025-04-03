package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes9.dex */
final class H1 extends AbstractC0175y0 {
    public final /* synthetic */ int h;
    final /* synthetic */ Object i;
    final /* synthetic */ Object j;
    final /* synthetic */ Object k;

    public /* synthetic */ H1(EnumC0129o3 enumC0129o3, Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    @Override // j$.util.stream.AbstractC0175y0
    public final X1 R() {
        switch (this.h) {
            case 0:
                return new E1((Supplier) this.i, (ObjLongConsumer) this.k, (C0154u) this.j);
            case 1:
                return new K1((Supplier) this.i, (ObjDoubleConsumer) this.k, (C0154u) this.j);
            case 2:
                return new M1(this.i, (BiFunction) this.k, (BinaryOperator) this.j);
            case 3:
                return new Q1((Supplier) this.i, (BiConsumer) this.k, (BiConsumer) this.j);
            default:
                return new U1((Supplier) this.i, (ObjIntConsumer) this.k, (C0154u) this.j);
        }
    }
}
