package j$.util.stream;

/* loaded from: classes9.dex */
final class Z extends AbstractC0128o2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z(int i, InterfaceC0157u2 interfaceC0157u2) {
        super(interfaceC0157u2);
        this.b = i;
    }

    @Override // j$.util.stream.InterfaceC0147s2, j$.util.stream.InterfaceC0157u2, java.util.function.IntConsumer
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(i);
                break;
            default:
                this.a.accept(i);
                break;
        }
    }
}
