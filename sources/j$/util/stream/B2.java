package j$.util.stream;

/* loaded from: classes9.dex */
final class B2 extends AbstractC0123n2 {
    long b;
    long c;
    final /* synthetic */ C2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B2(C2 c2, InterfaceC0157u2 interfaceC0157u2) {
        super(interfaceC0157u2);
        this.d = c2;
        this.b = c2.m;
        long j = c2.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.InterfaceC0142r2, j$.util.stream.InterfaceC0157u2
    public final void accept(double d) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            this.a.accept(d);
        }
    }

    @Override // j$.util.stream.AbstractC0123n2, j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        this.a.k(F2.a(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.AbstractC0123n2, j$.util.stream.InterfaceC0157u2
    public final boolean m() {
        return this.c == 0 || this.a.m();
    }
}
