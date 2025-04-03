package j$.util.stream;

/* renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0056a0 extends AbstractC0121n0 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0056a0(AbstractC0060b abstractC0060b, int i, int i2) {
        super(abstractC0060b, i, 1);
        this.m = i2;
    }

    @Override // j$.util.stream.AbstractC0060b
    final InterfaceC0157u2 M(int i, InterfaceC0157u2 interfaceC0157u2) {
        switch (this.m) {
            case 0:
                return new Z(0, interfaceC0157u2);
            default:
                return interfaceC0157u2;
        }
    }
}
