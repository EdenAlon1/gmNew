package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;

/* loaded from: classes9.dex */
final class i4 extends AbstractC0076e0 implements j4 {
    final /* synthetic */ IntPredicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(AbstractC0081f0 abstractC0081f0, int i, IntPredicate intPredicate) {
        super(abstractC0081f0, i, 0);
        this.m = intPredicate;
    }

    @Override // j$.util.stream.AbstractC0060b
    final K0 J(AbstractC0060b abstractC0060b, Spliterator spliterator, IntFunction intFunction) {
        Object invoke;
        invoke = new l4(this, abstractC0060b, spliterator, intFunction).invoke();
        return (K0) invoke;
    }

    @Override // j$.util.stream.AbstractC0060b
    final Spliterator K(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        return EnumC0124n3.ORDERED.y(abstractC0060b.F()) ? J(abstractC0060b, spliterator, new g4(0)).spliterator() : new n4((Spliterator.OfInt) abstractC0060b.S(spliterator), this.m);
    }

    @Override // j$.util.stream.AbstractC0060b
    final InterfaceC0157u2 M(int i, InterfaceC0157u2 interfaceC0157u2) {
        return new h4(this, interfaceC0157u2, false);
    }

    @Override // j$.util.stream.j4
    public final k4 i(C0 c0, boolean z) {
        return new h4(this, c0, z);
    }
}
