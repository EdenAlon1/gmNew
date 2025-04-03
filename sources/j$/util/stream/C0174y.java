package j$.util.stream;

/* renamed from: j$.util.stream.y, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0174y extends AbstractC0123n2 {
    boolean b;
    C0149t c;
    final /* synthetic */ C0169x d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0174y(C0169x c0169x, InterfaceC0157u2 interfaceC0157u2) {
        super(interfaceC0157u2);
        this.d = c0169x;
        this.c = new C0149t(interfaceC0157u2);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [j$.util.V] */
    @Override // j$.util.stream.InterfaceC0142r2, j$.util.stream.InterfaceC0157u2
    public final void accept(double d) {
        DoubleStream doubleStream = (DoubleStream) ((C0055a) this.d.n).apply(d);
        if (doubleStream != null) {
            try {
                boolean z = this.b;
                C0149t c0149t = this.c;
                if (z) {
                    ?? spliterator2 = doubleStream.sequential().spliterator2();
                    while (!this.a.m() && spliterator2.tryAdvance(c0149t)) {
                    }
                } else {
                    doubleStream.sequential().forEach(c0149t);
                }
            } catch (Throwable th) {
                try {
                    doubleStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (doubleStream != null) {
            doubleStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC0123n2, j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        this.a.k(-1L);
    }

    @Override // j$.util.stream.AbstractC0123n2, j$.util.stream.InterfaceC0157u2
    public final boolean m() {
        this.b = true;
        return this.a.m();
    }
}
