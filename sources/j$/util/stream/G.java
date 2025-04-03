package j$.util.stream;

import j$.util.OptionalDouble;
import java.util.function.DoubleConsumer;

/* loaded from: classes9.dex */
final class G extends K implements InterfaceC0142r2 {
    static final F c;
    static final F d;

    static {
        EnumC0129o3 enumC0129o3 = EnumC0129o3.DOUBLE_VALUE;
        c = new F(true, enumC0129o3, OptionalDouble.a(), new C0110l(24), new C0105k(18));
        d = new F(false, enumC0129o3, OptionalDouble.a(), new C0110l(24), new C0105k(18));
    }

    @Override // j$.util.stream.K, j$.util.stream.InterfaceC0157u2
    public final void accept(double d2) {
        o(Double.valueOf(d2));
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.nio.channels.c.a(this, doubleConsumer);
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return OptionalDouble.b(((Double) this.b).doubleValue());
        }
        return null;
    }
}
