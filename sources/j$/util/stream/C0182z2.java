package j$.util.stream;

/* renamed from: j$.util.stream.z2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0182z2 extends AbstractC0133p2 {
    long b;
    long c;
    final /* synthetic */ A2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0182z2(A2 a2, InterfaceC0157u2 interfaceC0157u2) {
        super(interfaceC0157u2);
        this.d = a2;
        this.b = a2.m;
        long j = a2.n;
        this.c = j < 0 ? Long.MAX_VALUE : j;
    }

    @Override // j$.util.stream.InterfaceC0152t2, j$.util.stream.InterfaceC0157u2
    public final void accept(long j) {
        long j2 = this.b;
        if (j2 != 0) {
            this.b = j2 - 1;
            return;
        }
        long j3 = this.c;
        if (j3 > 0) {
            this.c = j3 - 1;
            this.a.accept(j);
        }
    }

    @Override // j$.util.stream.AbstractC0133p2, j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        this.a.k(F2.a(j, this.d.m, this.c));
    }

    @Override // j$.util.stream.AbstractC0133p2, j$.util.stream.InterfaceC0157u2
    public final boolean m() {
        return this.c == 0 || this.a.m();
    }
}
