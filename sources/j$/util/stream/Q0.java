package j$.util.stream;

import j$.util.C0042f;
import j$.util.stream.IntStream;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/* loaded from: classes9.dex */
public final /* synthetic */ class Q0 implements LongFunction, IntFunction {
    public IntFunction a;

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        Object apply = this.a.apply(i);
        if (apply == null) {
            return null;
        }
        if (apply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) apply);
        }
        if (AbstractC0080f.w(apply)) {
            return IntStream.VivifiedWrapper.convert(AbstractC0080f.q(apply));
        }
        C0042f.a("java.util.stream.IntStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return AbstractC0175y0.A(j, this.a);
    }
}
