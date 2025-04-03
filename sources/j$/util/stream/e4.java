package j$.util.stream;

/* loaded from: classes9.dex */
final class e4 extends AbstractC0128o2 {
    boolean b;
    final /* synthetic */ f4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e4(f4 f4Var, InterfaceC0157u2 interfaceC0157u2) {
        super(interfaceC0157u2);
        this.c = f4Var;
        this.b = true;
    }

    @Override // j$.util.stream.InterfaceC0147s2, j$.util.stream.InterfaceC0157u2, java.util.function.IntConsumer
    public final void accept(int i) {
        if (this.b) {
            boolean test = this.c.m.test(i);
            this.b = test;
            if (test) {
                this.a.accept(i);
            }
        }
    }

    @Override // j$.util.stream.AbstractC0128o2, j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        this.a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC0128o2, j$.util.stream.InterfaceC0157u2
    public final boolean m() {
        return !this.b || this.a.m();
    }
}
