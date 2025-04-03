package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0144s extends AbstractC0113l2 {
    static O0 T(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        C0110l c0110l = new C0110l(12);
        C0110l c0110l2 = new C0110l(13);
        return new O0((Collection) new H1(EnumC0129o3.REFERENCE, new C0110l(14), c0110l2, c0110l, 3).b(abstractC0060b, spliterator));
    }

    @Override // j$.util.stream.AbstractC0060b
    final K0 J(AbstractC0060b abstractC0060b, Spliterator spliterator, IntFunction intFunction) {
        if (EnumC0124n3.DISTINCT.y(abstractC0060b.F())) {
            return abstractC0060b.t(spliterator, false, intFunction);
        }
        if (EnumC0124n3.ORDERED.y(abstractC0060b.F())) {
            return T(abstractC0060b, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new P(new C0115m(5, atomicBoolean, concurrentHashMap), false).b(abstractC0060b, spliterator);
        Collection keySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(keySet);
            hashSet.add(null);
            keySet = hashSet;
        }
        return new O0(keySet);
    }

    @Override // j$.util.stream.AbstractC0060b
    final Spliterator K(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        return EnumC0124n3.DISTINCT.y(abstractC0060b.F()) ? abstractC0060b.S(spliterator) : EnumC0124n3.ORDERED.y(abstractC0060b.F()) ? T(abstractC0060b, spliterator).spliterator() : new C0168w3(abstractC0060b.S(spliterator));
    }

    @Override // j$.util.stream.AbstractC0060b
    final InterfaceC0157u2 M(int i, InterfaceC0157u2 interfaceC0157u2) {
        interfaceC0157u2.getClass();
        return EnumC0124n3.DISTINCT.y(i) ? interfaceC0157u2 : EnumC0124n3.SORTED.y(i) ? new C0135q(interfaceC0157u2) : new r(interfaceC0157u2);
    }
}
