package j$.util.stream;

/* renamed from: j$.util.stream.v2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0162v2 extends AbstractC0138q2 {
    long b;
    long c;
    final /* synthetic */ C0167w2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0162v2(C0167w2 c0167w2, InterfaceC0157u2 interfaceC0157u2) {
        super(interfaceC0157u2);
        this.d = c0167w2;
        this.b = c0167w2.m;
        long j = c0167w2.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        long j = this.b;
        if (j != 0) {
            this.b = j - 1;
            return;
        }
        long j2 = this.c;
        if (j2 > 0) {
            this.c = j2 - 1;
            this.a.accept((InterfaceC0157u2) obj);
        }
    }

    @Override // j$.util.stream.AbstractC0138q2, j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        this.a.k(F2.a(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.AbstractC0138q2, j$.util.stream.InterfaceC0157u2
    public final boolean m() {
        return this.c == 0 || this.a.m();
    }
}
