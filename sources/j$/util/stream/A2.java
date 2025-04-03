package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
final class A2 extends AbstractC0121n0 {
    final /* synthetic */ long m;
    final /* synthetic */ long n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A2(AbstractC0126o0 abstractC0126o0, int i, long j, long j2) {
        super(abstractC0126o0, i, 0);
        this.m = j;
        this.n = j2;
    }

    @Override // j$.util.stream.AbstractC0060b
    final K0 J(AbstractC0060b abstractC0060b, Spliterator spliterator, IntFunction intFunction) {
        Object invoke;
        long j;
        long j2;
        long B = abstractC0060b.B(spliterator);
        if (B > 0 && spliterator.hasCharacteristics(16384)) {
            return AbstractC0175y0.E(abstractC0060b, F2.c(abstractC0060b.E(), spliterator, this.m, this.n), true);
        }
        if (EnumC0124n3.ORDERED.y(abstractC0060b.F())) {
            invoke = new E2(this, abstractC0060b, spliterator, intFunction, this.m, this.n).invoke();
            return (K0) invoke;
        }
        Spliterator.OfLong ofLong = (Spliterator.OfLong) abstractC0060b.S(spliterator);
        long j3 = this.m;
        long j4 = this.n;
        if (j3 <= B) {
            long j5 = B - j3;
            j = j4 >= 0 ? Math.min(j4, j5) : j5;
            j2 = 0;
        } else {
            j = j4;
            j2 = j3;
        }
        return AbstractC0175y0.E(this, new M3(ofLong, j2, j), true);
    }

    @Override // j$.util.stream.AbstractC0060b
    final Spliterator K(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        Object invoke;
        long B = abstractC0060b.B(spliterator);
        long j = this.n;
        if (B > 0 && spliterator.hasCharacteristics(16384)) {
            Spliterator.OfLong ofLong = (Spliterator.OfLong) abstractC0060b.S(spliterator);
            long j2 = this.m;
            return new G3(ofLong, j2, F2.b(j2, j));
        }
        if (EnumC0124n3.ORDERED.y(abstractC0060b.F())) {
            invoke = new E2(this, abstractC0060b, spliterator, new W(25), this.m, this.n).invoke();
            return ((K0) invoke).spliterator();
        }
        Spliterator.OfLong ofLong2 = (Spliterator.OfLong) abstractC0060b.S(spliterator);
        long j3 = this.m;
        if (j3 <= B) {
            long j4 = B - j3;
            if (j >= 0) {
                j4 = Math.min(j, j4);
            }
            j = j4;
            j3 = 0;
        }
        return new M3(ofLong2, j3, j);
    }

    @Override // j$.util.stream.AbstractC0060b
    final InterfaceC0157u2 M(int i, InterfaceC0157u2 interfaceC0157u2) {
        return new C0182z2(this, interfaceC0157u2);
    }
}
