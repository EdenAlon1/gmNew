package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
final class N2 extends A {
    @Override // j$.util.stream.AbstractC0060b
    public final K0 J(AbstractC0060b abstractC0060b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC0124n3.SORTED.y(abstractC0060b.F())) {
            return abstractC0060b.t(spliterator, false, intFunction);
        }
        double[] dArr = (double[]) ((E0) abstractC0060b.t(spliterator, true, intFunction)).c();
        Arrays.sort(dArr);
        return new X0(dArr);
    }

    @Override // j$.util.stream.AbstractC0060b
    public final InterfaceC0157u2 M(int i, InterfaceC0157u2 interfaceC0157u2) {
        interfaceC0157u2.getClass();
        return EnumC0124n3.SORTED.y(i) ? interfaceC0157u2 : EnumC0124n3.SIZED.y(i) ? new S2(interfaceC0157u2) : new K2(interfaceC0157u2);
    }
}
