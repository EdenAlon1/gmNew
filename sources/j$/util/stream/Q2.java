package j$.util.stream;

import j$.util.Comparator;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
final class Q2 extends AbstractC0113l2 {
    private final boolean m;
    private final Comparator n;

    Q2(AbstractC0118m2 abstractC0118m2) {
        super(abstractC0118m2, EnumC0124n3.q | EnumC0124n3.o, 0);
        this.m = true;
        this.n = Comparator.CC.naturalOrder();
    }

    @Override // j$.util.stream.AbstractC0060b
    public final K0 J(AbstractC0060b abstractC0060b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC0124n3.SORTED.y(abstractC0060b.F()) && this.m) {
            return abstractC0060b.t(spliterator, false, intFunction);
        }
        Object[] n = abstractC0060b.t(spliterator, true, intFunction).n(intFunction);
        Arrays.sort(n, this.n);
        return new N0(n);
    }

    @Override // j$.util.stream.AbstractC0060b
    public final InterfaceC0157u2 M(int i, InterfaceC0157u2 interfaceC0157u2) {
        interfaceC0157u2.getClass();
        if (EnumC0124n3.SORTED.y(i) && this.m) {
            return interfaceC0157u2;
        }
        boolean y = EnumC0124n3.SIZED.y(i);
        java.util.Comparator comparator = this.n;
        return y ? new V2(interfaceC0157u2, comparator) : new R2(interfaceC0157u2, comparator);
    }

    Q2(AbstractC0118m2 abstractC0118m2, java.util.Comparator comparator) {
        super(abstractC0118m2, EnumC0124n3.q | EnumC0124n3.p, 0);
        this.m = false;
        comparator.getClass();
        this.n = comparator;
    }
}
