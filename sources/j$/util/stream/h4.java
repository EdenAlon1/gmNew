package j$.util.stream;

/* loaded from: classes9.dex */
final class h4 extends AbstractC0128o2 implements k4 {
    long b;
    boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ i4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h4(i4 i4Var, InterfaceC0157u2 interfaceC0157u2, boolean z) {
        super(interfaceC0157u2);
        this.d = z;
        this.e = i4Var;
    }

    @Override // j$.util.stream.InterfaceC0147s2, j$.util.stream.InterfaceC0157u2, java.util.function.IntConsumer
    public final void accept(int i) {
        boolean z;
        boolean z2;
        if (!this.c) {
            boolean test = this.e.m.test(i);
            this.c = !test;
            if (test) {
                z = false;
                z2 = this.d;
                if (z2 && !z) {
                    this.b++;
                }
                if (!z2 || z) {
                    this.a.accept(i);
                }
                return;
            }
        }
        z = true;
        z2 = this.d;
        if (z2) {
            this.b++;
        }
        if (z2) {
        }
        this.a.accept(i);
    }

    @Override // j$.util.stream.k4
    public final long e() {
        return this.b;
    }
}
