package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.d2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
abstract class AbstractC0073d2 extends Y1 implements X1 {
    long b;

    public /* synthetic */ void accept(double d) {
        AbstractC0175y0.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.X1
    public final void f(X1 x1) {
        this.b += ((AbstractC0073d2) x1).b;
    }

    @Override // j$.util.stream.Y1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        this.b = 0L;
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ boolean m() {
        return false;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC0175y0.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC0175y0.l();
        throw null;
    }
}
