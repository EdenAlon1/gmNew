package j$.util.stream;

/* renamed from: j$.util.stream.f2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0083f2 extends AbstractC0138q2 {
    boolean b;
    C0091h0 c;
    final /* synthetic */ C0106k0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0083f2(C0106k0 c0106k0, InterfaceC0157u2 interfaceC0157u2) {
        super(interfaceC0157u2);
        this.d = c0106k0;
        this.c = new C0091h0(interfaceC0157u2);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.Spliterator$OfLong] */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        LongStream longStream = (LongStream) ((C0125o) this.d.n).apply(obj);
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

    @Override // j$.util.stream.AbstractC0138q2, j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        this.a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC0138q2, j$.util.stream.InterfaceC0157u2
    public final boolean m() {
        this.b = true;
        return this.a.m();
    }
}
