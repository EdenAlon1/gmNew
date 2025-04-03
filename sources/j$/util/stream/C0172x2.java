package j$.util.stream;

/* renamed from: j$.util.stream.x2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0172x2 extends AbstractC0128o2 {
    long b;
    long c;
    final /* synthetic */ C0177y2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0172x2(C0177y2 c0177y2, InterfaceC0157u2 interfaceC0157u2) {
        super(interfaceC0157u2);
        this.d = c0177y2;
        this.b = c0177y2.m;
        long j = c0177y2.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.InterfaceC0147s2, j$.util.stream.InterfaceC0157u2, java.util.function.IntConsumer
    public final void accept(int i) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            this.a.accept(i);
        }
    }

    @Override // j$.util.stream.AbstractC0128o2, j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        this.a.k(F2.a(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.AbstractC0128o2, j$.util.stream.InterfaceC0157u2
    public final boolean m() {
        return this.c == 0 || this.a.m();
    }
}
