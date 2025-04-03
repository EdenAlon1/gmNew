package j$.util.stream;

/* renamed from: j$.util.stream.l0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0111l0 extends AbstractC0133p2 {
    boolean b;
    C0091h0 c;
    final /* synthetic */ C0106k0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0111l0(C0106k0 c0106k0, InterfaceC0157u2 interfaceC0157u2) {
        super(interfaceC0157u2);
        this.d = c0106k0;
        this.c = new C0091h0(interfaceC0157u2);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [j$.util.Spliterator$OfLong] */
    @Override // j$.util.stream.InterfaceC0152t2, j$.util.stream.InterfaceC0157u2
    public final void accept(long j) {
        LongStream longStream = (LongStream) ((C0055a) this.d.n).apply(j);
        if (longStream != null) {
            try {
                boolean z = this.b;
                C0091h0 c0091h0 = this.c;
                if (z) {
                    ?? spliterator2 = longStream.sequential().spliterator2();
                    while (!this.a.m() && spliterator2.tryAdvance(c0091h0)) {
                    }
                } else {
                    longStream.sequential().forEach(c0091h0);
                }
            } catch (Throwable th) {
                try {
                    longStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (longStream != null) {
            longStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC0133p2, j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        this.a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC0133p2, j$.util.stream.InterfaceC0157u2
    public final boolean m() {
        this.b = true;
        return this.a.m();
    }
}
