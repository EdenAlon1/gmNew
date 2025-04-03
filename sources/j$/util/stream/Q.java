package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
abstract class Q implements X3, Y3 {
    private final boolean a;

    protected Q(boolean z) {
        this.a = z;
    }

    @Override // j$.util.stream.X3
    public final Object a(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        abstractC0060b.p(spliterator, abstractC0060b.R(this));
        return null;
    }

    public /* synthetic */ void accept(double d) {
        AbstractC0175y0.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.X3
    public final Object b(AbstractC0060b abstractC0060b, Spliterator spliterator) {
        if (this.a) {
            new T(abstractC0060b, spliterator, this).invoke();
            return null;
        }
        new U(abstractC0060b, spliterator, abstractC0060b.R(this)).invoke();
        return null;
    }

    @Override // j$.util.stream.X3
    public final int c() {
        if (this.a) {
            return 0;
        }
        return EnumC0124n3.r;
    }

    @Override // java.util.function.Supplier
    public final /* bridge */ /* synthetic */ Object get() {
        return null;
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ void k(long j) {
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
