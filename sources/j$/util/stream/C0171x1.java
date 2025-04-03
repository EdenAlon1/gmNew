package j$.util.stream;

import java.util.function.IntFunction;

/* renamed from: j$.util.stream.x1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0171x1 extends C0084f3 implements K0, C0 {
    @Override // j$.util.stream.K0
    public final K0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ void accept(double d) {
        AbstractC0175y0.d();
        throw null;
    }

    @Override // j$.util.stream.C0
    public final K0 build() {
        return this;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ K0 g(long j, long j2, IntFunction intFunction) {
        return AbstractC0175y0.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.K0
    public final void h(Object[] objArr, int i) {
        long j = i;
        long count = count() + j;
        if (count > objArr.length || count < j) {
            throw new IndexOutOfBoundsException("does not fit");
        }
        if (this.c == 0) {
            System.arraycopy(this.e, 0, objArr, i, this.b);
            return;
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            Object[] objArr2 = this.f[i2];
            System.arraycopy(objArr2, 0, objArr, i, objArr2.length);
            i += this.f[i2].length;
        }
        int i3 = this.b;
        if (i3 > 0) {
            System.arraycopy(this.e, 0, objArr, i, i3);
        }
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final void j() {
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final void k(long j) {
        clear();
        u(j);
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public final /* synthetic */ boolean m() {
        return false;
    }

    @Override // j$.util.stream.K0
    public final Object[] n(IntFunction intFunction) {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) count);
        h(objArr, 0);
        return objArr;
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
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
