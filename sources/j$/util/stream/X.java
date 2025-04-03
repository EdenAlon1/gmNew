package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntUnaryOperator;

/* loaded from: classes9.dex */
final class X extends AbstractC0128o2 {
    public final /* synthetic */ int b;
    final /* synthetic */ AbstractC0060b c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ X(AbstractC0060b abstractC0060b, InterfaceC0157u2 interfaceC0157u2, int i) {
        super(interfaceC0157u2);
        this.b = i;
        this.c = abstractC0060b;
    }

    @Override // j$.util.stream.InterfaceC0147s2, j$.util.stream.InterfaceC0157u2, java.util.function.IntConsumer
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept((InterfaceC0157u2) ((IntFunction) ((C0164w) this.c).n).apply(i));
                break;
            case 1:
                ((IntConsumer) ((Y) this.c).n).accept(i);
                this.a.accept(i);
                break;
            case 2:
                this.a.accept(((IntUnaryOperator) ((Y) this.c).n).applyAsInt(i));
                break;
            default:
                if (((IntPredicate) ((Y) this.c).n).test(i)) {
                    this.a.accept(i);
                    break;
                }
                break;
        }
    }

    @Override // j$.util.stream.AbstractC0128o2, j$.util.stream.InterfaceC0157u2
    public void k(long j) {
        switch (this.b) {
            case 3:
                this.a.k(-1L);
                break;
            default:
                super.k(j);
                break;
        }
    }
}
