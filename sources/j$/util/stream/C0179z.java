package j$.util.stream;

/* renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0179z extends A {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0179z(AbstractC0060b abstractC0060b, int i, int i2) {
        super(abstractC0060b, i, 1);
        this.m = i2;
    }

    @Override // j$.util.stream.AbstractC0060b
    final InterfaceC0157u2 M(int i, InterfaceC0157u2 interfaceC0157u2) {
        switch (this.m) {
            case 0:
                return interfaceC0157u2;
            case 1:
                return new Z(1, interfaceC0157u2);
            default:
                return new C0101j0(interfaceC0157u2);
        }
    }
}
