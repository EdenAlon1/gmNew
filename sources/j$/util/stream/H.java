package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* loaded from: classes9.dex */
final class H extends K implements InterfaceC0147s2 {
    static final F c;
    static final F d;

    static {
        EnumC0129o3 enumC0129o3 = EnumC0129o3.INT_VALUE;
        c = new F(true, enumC0129o3, OptionalInt.empty(), new C0110l(25), new C0105k(19));
        d = new F(false, enumC0129o3, OptionalInt.empty(), new C0110l(25), new C0105k(19));
    }

    @Override // j$.util.stream.K, j$.util.stream.InterfaceC0157u2, java.util.function.IntConsumer
    public final void accept(int i) {
        o(Integer.valueOf(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return OptionalInt.of(((Integer) this.b).intValue());
        }
        return null;
    }
}
