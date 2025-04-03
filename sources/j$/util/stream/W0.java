package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* loaded from: classes9.dex */
final class W0 extends M0 {
    @Override // j$.util.stream.K0
    public final void forEach(Consumer consumer) {
        this.a.forEach(consumer);
        this.b.forEach(consumer);
    }

    @Override // j$.util.stream.K0
    public final K0 g(long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == count()) {
            return this;
        }
        long count = this.a.count();
        if (j >= count) {
            return this.b.g(j - count, j2 - count, intFunction);
        }
        if (j2 <= count) {
            return this.a.g(j, j2, intFunction);
        }
        return AbstractC0175y0.F(EnumC0129o3.REFERENCE, this.a.g(j, count, intFunction), this.b.g(0L, j2 - count, intFunction));
    }

    @Override // j$.util.stream.K0
    public final void h(Object[] objArr, int i) {
        objArr.getClass();
        K0 k0 = this.a;
        k0.h(objArr, i);
        this.b.h(objArr, i + ((int) k0.count()));
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
    public final Spliterator spliterator() {
        return new C0122n1(this);
    }

    public final String toString() {
        return count() < 32 ? String.format("ConcNode[%s.%s]", this.a, this.b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
    }
}
