package j$.util.stream;

import j$.util.OptionalLong;
import j$.util.function.LongConsumer$CC;
import java.util.function.LongConsumer;

/* loaded from: classes9.dex */
final class I extends K implements InterfaceC0152t2 {
    static final F c;
    static final F d;

    static {
        EnumC0129o3 enumC0129o3 = EnumC0129o3.LONG_VALUE;
        c = new F(true, enumC0129o3, OptionalLong.empty(), new C0110l(26), new C0105k(20));
        d = new F(false, enumC0129o3, OptionalLong.empty(), new C0110l(26), new C0105k(20));
    }

    @Override // j$.util.stream.K, j$.util.stream.InterfaceC0157u2
    public final void accept(long j) {
        o(Long.valueOf(j));
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return OptionalLong.of(((Long) this.b).longValue());
        }
        return null;
    }
}
