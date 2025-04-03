package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;

/* renamed from: j$.util.stream.i1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0097i1 extends C0059a3 implements G0, A0 {
    @Override // j$.util.stream.K0
    public final /* bridge */ /* synthetic */ K0 a(int i) {
        a(i);
        throw null;
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ void accept(double d) {
        AbstractC0175y0.d();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.A0, j$.util.stream.C0
    public final G0 build() {
        return this;
    }

    @Override // j$.util.stream.AbstractC0079e3, j$.util.stream.J0
    public final Object c() {
        return (int[]) super.c();
    }

    @Override // j$.util.stream.AbstractC0079e3, j$.util.stream.J0
    public final void d(Object obj) {
        super.d((IntConsumer) obj);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 g(long j, long j2, IntFunction intFunction) {
        return AbstractC0175y0.u(this, j, j2);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ void h(Object[] objArr, int i) {
        AbstractC0175y0.o(this, (Integer[]) objArr, i);
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final void j() {
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        clear();
        y(j);
    }

    @Override // j$.util.stream.InterfaceC0147s2
    public final /* synthetic */ void l(Integer num) {
        AbstractC0175y0.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ Object[] n(IntFunction intFunction) {
        return AbstractC0175y0.m(this, intFunction);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
    }

    @Override // j$.util.stream.AbstractC0079e3, j$.util.stream.J0
    public final void r(int i, Object obj) {
        super.r(i, (int[]) obj);
    }

    @Override // j$.util.stream.C0059a3, java.lang.Iterable, j$.lang.a, j$.util.Collection
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

    @Override // j$.util.stream.C0059a3, java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final Spliterator spliterator() {
        return super.spliterator();
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final /* bridge */ /* synthetic */ void o(Object obj) {
        l((Integer) obj);
    }
}
