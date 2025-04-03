package j$.util.stream;

import java.util.function.IntFunction;

/* renamed from: j$.util.stream.e1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
abstract class AbstractC0077e1 implements K0 {
    @Override // j$.util.stream.K0
    public K0 a(int i) {
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return 0L;
    }

    public final void d(Object obj) {
    }

    @Override // j$.util.stream.K0
    public /* synthetic */ K0 g(long j, long j2, IntFunction intFunction) {
        return AbstractC0175y0.w(this, j, j2, intFunction);
    }

    @Override // j$.util.stream.K0
    public final Object[] n(IntFunction intFunction) {
        return (Object[]) intFunction.apply(0);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ int q() {
        return 0;
    }

    public final void r(int i, Object obj) {
    }
}
