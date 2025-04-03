package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes9.dex */
final class r extends AbstractC0138q2 {
    public final /* synthetic */ int b;
    Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(AbstractC0060b abstractC0060b, InterfaceC0157u2 interfaceC0157u2, int i) {
        super(interfaceC0157u2);
        this.b = i;
        this.c = abstractC0060b;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (!((HashSet) this.c).contains(obj)) {
                    ((HashSet) this.c).add(obj);
                    this.a.accept((InterfaceC0157u2) obj);
                    break;
                }
                break;
            case 1:
                ((Consumer) ((C0164w) this.c).n).accept(obj);
                this.a.accept((InterfaceC0157u2) obj);
                break;
            case 2:
                if (((Predicate) ((C0164w) this.c).n).test(obj)) {
                    this.a.accept((InterfaceC0157u2) obj);
                    break;
                }
                break;
            case 3:
                this.a.accept((InterfaceC0157u2) ((C0093h2) this.c).n.apply(obj));
                break;
            case 4:
                this.a.accept(((ToIntFunction) ((Y) this.c).n).applyAsInt(obj));
                break;
            case 5:
                this.a.accept(((ToLongFunction) ((C0106k0) this.c).n).applyAsLong(obj));
                break;
            default:
                this.a.accept(((ToDoubleFunction) ((C0169x) this.c).n).applyAsDouble(obj));
                break;
        }
    }

    @Override // j$.util.stream.AbstractC0138q2, j$.util.stream.InterfaceC0157u2
    public void j() {
        switch (this.b) {
            case 0:
                this.c = null;
                this.a.j();
                break;
            default:
                super.j();
                break;
        }
    }

    @Override // j$.util.stream.AbstractC0138q2, j$.util.stream.InterfaceC0157u2
    public void k(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                this.a.k(-1L);
                break;
            case 1:
            default:
                super.k(j);
                break;
            case 2:
                this.a.k(-1L);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(InterfaceC0157u2 interfaceC0157u2) {
        super(interfaceC0157u2);
        this.b = 0;
    }
}
