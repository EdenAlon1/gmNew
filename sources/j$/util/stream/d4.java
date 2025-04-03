package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* loaded from: classes9.dex */
final class d4 extends AbstractC0113l2 implements j4 {
    final /* synthetic */ Predicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(AbstractC0118m2 abstractC0118m2, int i, Predicate predicate) {
        super(abstractC0118m2, i, 0);
        this.m = predicate;
    }

    @Override // j$.util.stream.AbstractC0060b
    final K0 J(AbstractC0060b abstractC0060b, Spliterator spliterator, IntFunction intFunction) {
        Object invoke;
        invoke = new l4(this, abstractC0060b, spliterator, intFunction).invoke();
        return (K0) invoke;
    }

    @Override // j$.util.stream.AbstractC0060b
    final Spliterator K(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        return EnumC0124n3.ORDERED.y(abstractC0060b.F()) ? J(abstractC0060b, spliterator, new W(22)).spliterator() : new q4(abstractC0060b.S(spliterator), this.m, 0);
    }

    @Override // j$.util.stream.AbstractC0060b
    final InterfaceC0157u2 M(int i, InterfaceC0157u2 interfaceC0157u2) {
        return new c4(this, interfaceC0157u2, false);
    }

    @Override // j$.util.stream.j4
    public final k4 i(C0 c0, boolean z) {
        return new c4(this, c0, z);
    }
}
