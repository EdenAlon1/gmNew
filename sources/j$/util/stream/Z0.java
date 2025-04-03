package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
final class Z0 extends Y2 implements E0, InterfaceC0180z0 {
    @Override // j$.util.stream.K0
    public final /* bridge */ /* synthetic */ K0 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0157u2, java.util.function.IntConsumer
    public final /* synthetic */ void accept(int i) {
        AbstractC0175y0.k();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0180z0, j$.util.stream.C0
    public final E0 build() {
        return this;
    }

    @Override // j$.util.stream.AbstractC0079e3, j$.util.stream.J0
    public final Object c() {
        return (double[]) super.c();
    }

    @Override // j$.util.stream.AbstractC0079e3, j$.util.stream.J0
    public final void d(Object obj) {
        super.d((DoubleConsumer) obj);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 g(long j, long j2, IntFunction intFunction) {
        return AbstractC0175y0.t(this, j, j2);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void h(Object[] objArr, int i) {
        AbstractC0175y0.n(this, (Double[]) objArr, i);
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final void j() {
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        clear();
        y(j);
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ Object[] n(IntFunction intFunction) {
        return AbstractC0175y0.m(this, intFunction);
    }

    @Override // j$.util.stream.InterfaceC0142r2
    public final /* synthetic */ void o(Double d) {
        AbstractC0175y0.e(this, d);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.AbstractC0079e3, j$.util.stream.J0
    public final void r(int i, Object obj) {
        super.r(i, (double[]) obj);
    }

    @Override // j$.util.stream.Y2, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final j$.util.d0 spliterator() {
        return super.spliterator();
    }

    @Override // j$.util.stream.J0, j$.util.stream.K0
    public final J0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ void accept(long j) {
        AbstractC0175y0.l();
        throw null;
    }

    @Override // j$.util.stream.C0
    public final K0 build() {
        return this;
    }

    @Override // j$.util.stream.Y2, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        o((Double) obj);
    }
}
