package j$.util.stream;

import j$.util.C0042f;
import j$.util.Map;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0125o implements BiFunction, Function {
    public final /* synthetic */ int a;
    public Function b;

    public /* synthetic */ C0125o() {
        this.a = 2;
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                Map map = (Map) obj;
                Set set = Collectors.a;
                Map.EL.replaceAll(map, new C0125o(this.b, 0));
                return map;
            default:
                Object apply = this.b.apply(obj);
                if (apply == null) {
                    return null;
                }
                if (apply instanceof Stream) {
                    return Stream.Wrapper.convert((Stream) apply);
                }
                if (AbstractC0080f.D(apply)) {
                    return C0104j3.i(AbstractC0080f.t(apply));
                }
                if (apply instanceof IntStream) {
                    return IntStream.Wrapper.convert((IntStream) apply);
                }
                if (AbstractC0080f.w(apply)) {
                    return IntStream.VivifiedWrapper.convert(AbstractC0080f.q(apply));
                }
                if (apply instanceof DoubleStream) {
                    return E.i((DoubleStream) apply);
                }
                if (j$.util.Y.D(apply)) {
                    return D.i(AbstractC0080f.o(apply));
                }
                if (apply instanceof LongStream) {
                    return C0140r0.i((LongStream) apply);
                }
                if (AbstractC0080f.B(apply)) {
                    return C0136q0.i(AbstractC0080f.s(apply));
                }
                C0042f.a("java.util.stream.*Stream", apply.getClass());
                throw null;
        }
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$compose(this, function);
    }

    public /* synthetic */ C0125o(Function function, int i) {
        this.a = i;
        this.b = function;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo448andThen(Function function) {
        switch (this.a) {
        }
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        Set set = Collectors.a;
        return this.b.apply(obj2);
    }
}
