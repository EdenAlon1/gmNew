package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.LongConsumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* renamed from: j$.util.stream.p2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0133p2 implements InterfaceC0152t2 {
    protected final InterfaceC0157u2 a;

    public AbstractC0133p2(InterfaceC0157u2 interfaceC0157u2) {
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

    @Override // j$.util.stream.InterfaceC0152t2
    public final /* synthetic */ void i(Long l) {
        AbstractC0175y0.i(this, l);
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

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return LongConsumer$CC.$default$andThen(this, longConsumer);
    }

    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        i((Long) obj);
    }
}
