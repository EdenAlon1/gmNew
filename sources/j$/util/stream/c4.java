package j$.util.stream;

/* loaded from: classes9.dex */
final class c4 extends AbstractC0138q2 implements k4 {
    long b;
    boolean c;
    final /* synthetic */ boolean d;
    final /* synthetic */ d4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c4(d4 d4Var, InterfaceC0157u2 interfaceC0157u2, boolean z) {
        super(interfaceC0157u2);
        this.d = z;
        this.e = d4Var;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        if (!this.c) {
            boolean test = this.e.m.test(obj);
            this.c = !test;
            if (test) {
                z = false;
                z2 = this.d;
                if (z2 && !z) {
                    this.b++;
                }
                if (!z2 || z) {
                    this.a.accept((InterfaceC0157u2) obj);
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
        this.a.accept((InterfaceC0157u2) obj);
    }

    @Override // j$.util.stream.k4
    public final long e() {
        return this.b;
    }
}
