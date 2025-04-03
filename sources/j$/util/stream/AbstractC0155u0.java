package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* renamed from: j$.util.stream.u0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
abstract class AbstractC0155u0 implements InterfaceC0157u2 {
    boolean a;
    boolean b;

    AbstractC0155u0(EnumC0160v0 enumC0160v0) {
        boolean z;
        z = enumC0160v0.b;
        this.b = !z;
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public /* synthetic */ void accept(double d) {
        AbstractC0175y0.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ void k(long j) {
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final boolean m() {
        return this.a;
    }

    @Override // j$.util.stream.InterfaceC0157u2, java.util.function.IntConsumer
    public /* synthetic */ void accept(int i) {
        AbstractC0175y0.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public /* synthetic */ void accept(long j) {
        AbstractC0175y0.l();
        throw null;
    }
}
