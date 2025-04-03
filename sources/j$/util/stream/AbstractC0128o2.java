package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* renamed from: j$.util.stream.o2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0128o2 implements InterfaceC0147s2 {
    protected final InterfaceC0157u2 a;

    public AbstractC0128o2(InterfaceC0157u2 interfaceC0157u2) {
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

    @Override // j$.util.stream.InterfaceC0147s2
    public final /* synthetic */ void l(Integer num) {
        AbstractC0175y0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public boolean m() {
        return this.a.m();
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ void accept(long j) {
        AbstractC0175y0.l();
        throw null;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        l((Integer) obj);
    }
}
