package j$.util.stream;

import j$.util.C0042f;
import j$.util.Map;
import j$.util.Spliterator;
import j$.util.StringJoiner;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/* renamed from: j$.util.stream.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0055a implements Supplier, BiConsumer, Function, BinaryOperator, Consumer, BooleanSupplier, InterfaceC0157u2, DoubleFunction, LongFunction {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ C0055a(int i) {
        this.a = i;
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 10:
                AbstractC0175y0.d();
                throw null;
            default:
                AbstractC0175y0.d();
                throw null;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object apply = ((DoubleFunction) this.b).apply(d);
        if (apply == null) {
            return null;
        }
        if (apply instanceof DoubleStream) {
            return E.i((DoubleStream) apply);
        }
        if (j$.util.Y.D(apply)) {
            return D.i(AbstractC0080f.o(apply));
        }
        C0042f.a("java.util.stream.DoubleStream", apply.getClass());
        throw null;
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 0:
                return ((AbstractC0060b) this.b).H();
            case 3:
                Set set = Collectors.a;
                return new StringJoiner((CharSequence) this.b, "", "");
            default:
                return (Spliterator) this.b;
        }
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 7:
                C0178y3 c0178y3 = (C0178y3) this.b;
                return c0178y3.d.tryAdvance(c0178y3.e);
            case 8:
                B3 b3 = (B3) this.b;
                return b3.d.tryAdvance(b3.e);
            case 9:
                D3 d3 = (D3) this.b;
                return d3.d.tryAdvance(d3.e);
            default:
                R3 r3 = (R3) this.b;
                return r3.d.tryAdvance(r3.e);
        }
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public /* synthetic */ void j() {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public /* synthetic */ void k(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public /* synthetic */ boolean m() {
        switch (this.a) {
        }
        return false;
    }

    public /* synthetic */ C0055a(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // j$.util.stream.InterfaceC0157u2, java.util.function.IntConsumer
    public /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 10:
                AbstractC0175y0.k();
                throw null;
            default:
                AbstractC0175y0.k();
                throw null;
        }
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 6:
                break;
            case 10:
                break;
            case 12:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC0157u2
    public /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 10:
                AbstractC0175y0.l();
                throw null;
            default:
                AbstractC0175y0.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 6:
                ((InterfaceC0157u2) this.b).accept((InterfaceC0157u2) obj);
                break;
            case 10:
                ((C0084f3) this.b).accept(obj);
                break;
            case 12:
                ((Consumer) this.b).accept(obj);
                break;
            default:
                ((ArrayList) this.b).add(obj);
                break;
        }
    }

    @Override // java.util.function.Function
    /* renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function mo448andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object apply = ((LongFunction) this.b).apply(j);
        if (apply == null) {
            return null;
        }
        if (apply instanceof LongStream) {
            return C0140r0.i((LongStream) apply);
        }
        if (AbstractC0080f.B(apply)) {
            return C0136q0.i(AbstractC0080f.s(apply));
        }
        C0042f.a("java.util.stream.LongStream", apply.getClass());
        throw null;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 1:
                int[] iArr = (int[]) obj;
                Set set = Collectors.a;
                iArr[0] = ((ToIntFunction) this.b).applyAsInt(obj2) + iArr[0];
                break;
            default:
                long[] jArr = (long[]) obj;
                Set set2 = Collectors.a;
                jArr[0] = ((C0105k) this.b).applyAsLong(obj2) + jArr[0];
                break;
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        Map map = (Map) obj;
        Set set = Collectors.a;
        for (Map.Entry entry : ((Map) obj2).entrySet()) {
            Map.EL.a(map, entry.getKey(), entry.getValue(), (BinaryOperator) this.b);
        }
        return map;
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Set set = Collectors.a;
        return ((Supplier) this.b).get();
    }

    private final /* synthetic */ void a(long j) {
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c() {
    }

    private final /* synthetic */ void d() {
    }
}
