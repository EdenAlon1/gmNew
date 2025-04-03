package j$.util.stream;

import java.util.function.IntFunction;

/* loaded from: classes9.dex */
abstract class V0 extends M0 implements J0 {
    @Override // j$.util.stream.J0
    public final Object c() {
        long count = count();
        if (count >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object b = b((int) count);
        r(0, b);
        return b;
    }

    @Override // j$.util.stream.J0
    public final void d(Object obj) {
        ((J0) this.a).d(obj);
        ((J0) this.b).d(obj);
    }

    @Override // j$.util.stream.K0
    public final /* synthetic */ Object[] n(IntFunction intFunction) {
        return AbstractC0175y0.m(this, intFunction);
    }

    @Override // j$.util.stream.J0
    public final void r(int i, Object obj) {
        K0 k0 = this.a;
        ((J0) k0).r(i, obj);
        ((J0) this.b).r(i + ((int) ((J0) k0).count()), obj);
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
