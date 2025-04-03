package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
final class M1 extends Y1 implements X1 {
    final /* synthetic */ Object b;
    final /* synthetic */ BiFunction c;
    final /* synthetic */ BinaryOperator d;

    M1(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        this.b = obj;
        this.c = biFunction;
        this.d = binaryOperator;
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ void accept(double d) {
        AbstractC0175y0.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.X1
    public final void f(X1 x1) {
        this.a = this.d.apply(this.a, ((M1) x1).a);
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ void j() {
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        this.a = this.b;
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ boolean m() {
        return false;
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

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void o(Object obj) {
        this.a = this.c.apply(this.a, obj);
    }
}
