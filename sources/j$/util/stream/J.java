package j$.util.stream;

import j$.util.Optional;

/* loaded from: classes9.dex */
final class J extends K {
    static final F c;
    static final F d;

    static {
        EnumC0129o3 enumC0129o3 = EnumC0129o3.REFERENCE;
        c = new F(true, enumC0129o3, Optional.empty(), new C0110l(27), new C0105k(21));
        d = new F(false, enumC0129o3, Optional.empty(), new C0110l(27), new C0105k(21));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.a) {
            return Optional.of(this.b);
        }
        return null;
    }
}
