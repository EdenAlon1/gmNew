package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.q2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0138q2 implements InterfaceC0157u2 {
    protected final InterfaceC0157u2 a;

    public AbstractC0138q2(InterfaceC0157u2 interfaceC0157u2) {
        interfaceC0157u2.getClass();
        this.a = interfaceC0157u2;
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ void accept(double d) {
        AbstractC0175y0.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public void j() {
        this.a.j();
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public void k(long j) {
        this.a.k(j);
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public boolean m() {
        return this.a.m();
    }

    @Override // j$.util.stream.InterfaceC0157u2, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        AbstractC0175y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ void accept(long j) {
        AbstractC0175y0.l();
        throw null;
    }
}
