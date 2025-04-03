package j$.util.stream;

/* renamed from: j$.util.stream.b0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0061b0 extends AbstractC0128o2 {
    boolean b;
    V c;
    final /* synthetic */ Y d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0061b0(Y y, InterfaceC0157u2 interfaceC0157u2) {
        super(interfaceC0157u2);
        this.d = y;
        this.c = new V(interfaceC0157u2);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.Spliterator$OfInt] */
    @Override // j$.util.stream.InterfaceC0147s2, j$.util.stream.InterfaceC0157u2, java.util.function.IntConsumer
    public final void accept(int i) {
        IntStream intStream = (IntStream) ((Q0) this.d.n).apply(i);
        if (intStream != null) {
            try {
                boolean z = this.b;
                V v = this.c;
                if (z) {
                    ?? spliterator2 = intStream.sequential().spliterator2();
                    while (!this.a.m() && spliterator2.tryAdvance(v)) {
                    }
                } else {
                    intStream.sequential().forEach(v);
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC0128o2, j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        this.a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC0128o2, j$.util.stream.InterfaceC0157u2
    public final boolean m() {
        this.b = true;
        return this.a.m();
    }
}
