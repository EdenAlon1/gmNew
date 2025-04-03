package j$.util.stream;

import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
final class P2 extends AbstractC0121n0 {
    @Override // j$.util.stream.AbstractC0060b
    public final K0 J(AbstractC0060b abstractC0060b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC0124n3.SORTED.y(abstractC0060b.F())) {
            return abstractC0060b.t(spliterator, false, intFunction);
        }
        long[] jArr = (long[]) ((I0) abstractC0060b.t(spliterator, true, intFunction)).c();
        Arrays.sort(jArr);
        return new C0132p1(jArr);
    }

    @Override // j$.util.stream.AbstractC0060b
    public final InterfaceC0157u2 M(int i, InterfaceC0157u2 interfaceC0157u2) {
        interfaceC0157u2.getClass();
        return EnumC0124n3.SORTED.y(i) ? interfaceC0157u2 : EnumC0124n3.SIZED.y(i) ? new U2(interfaceC0157u2) : new M2(interfaceC0157u2);
    }
}
