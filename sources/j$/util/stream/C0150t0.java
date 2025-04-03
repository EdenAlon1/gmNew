package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* renamed from: j$.util.stream.t0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0150t0 extends AbstractC0155u0 implements InterfaceC0147s2 {
    final /* synthetic */ EnumC0160v0 c;
    final /* synthetic */ IntPredicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0150t0(EnumC0160v0 enumC0160v0, IntPredicate intPredicate) {
        super(enumC0160v0);
        this.c = enumC0160v0;
        this.d = intPredicate;
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC0147s2
    public final /* synthetic */ void l(Integer num) {
        AbstractC0175y0.g(this, num);
    }

    @Override // j$.util.stream.AbstractC0155u0, j$.util.stream.InterfaceC0157u2, java.util.function.IntConsumer
    public final void accept(int i) {
        boolean z;
        boolean z2;
        if (this.a) {
            return;
        }
        boolean test = this.d.test(i);
        EnumC0160v0 enumC0160v0 = this.c;
        z = enumC0160v0.a;
        if (test == z) {
            this.a = true;
            z2 = enumC0160v0.b;
            this.b = z2;
        }
    }
}
