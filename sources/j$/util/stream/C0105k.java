package j$.util.stream;

import j$.util.Map;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.ToLongFunction;

/* renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0105k implements BinaryOperator, Supplier, Function, ToLongFunction, BiConsumer, ObjDoubleConsumer, LongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ C0105k(int i) {
        this.a = i;
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        double[] dArr = (double[]) obj;
        switch (this.a) {
            case 15:
                dArr[2] = dArr[2] + 1.0d;
                Collectors.a(dArr, d);
                dArr[3] = dArr[3] + d;
                break;
            default:
                Collectors.a(dArr, d);
                dArr[2] = dArr[2] + d;
                break;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 22:
                return AbstractC0175y0.G(j);
            case 23:
            default:
                return AbstractC0175y0.O(j);
            case 24:
                return AbstractC0175y0.N(j);
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        Set set = Collectors.a;
        return 1L;
    }

    public /* synthetic */ Function compose(Function function) {
        switch (this.a) {
            case 3:
                break;
            case 6:
                break;
            case 8:
                break;
        }
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 1:
                Set set = Collectors.a;
                return new int[1];
            case 11:
                Set set2 = Collectors.a;
                return new long[1];
            case 18:
                return new G();
            case 19:
                return new H();
            case 20:
                return new I();
            default:
                return new J();
        }
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 0:
                break;
            case 2:
                break;
            case 4:
                break;
            case 5:
                break;
            case 7:
                break;
            case 9:
                break;
            case 12:
                break;
            case 23:
                break;
            case 25:
                break;
            case 27:
                break;
        }
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                Set set = Collectors.a;
                return Integer.valueOf(((int[]) obj)[0]);
            case 6:
                Set set2 = Collectors.a;
                return j$.desugar.sun.nio.fs.g.b(((List) obj).toArray());
            case 8:
                Set set3 = Collectors.a;
                return obj;
            default:
                Set set4 = Collectors.a;
                return Long.valueOf(((long[]) obj)[0]);
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        double[] dArr = (double[]) obj;
        double[] dArr2 = (double[]) obj2;
        switch (this.a) {
            case 14:
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            default:
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                dArr[3] = dArr[3] + dArr2[3];
                break;
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map map = (Map) obj;
                Set set = Collectors.a;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    value.getClass();
                    Object putIfAbsent = Map.EL.putIfAbsent(map, key, value);
                    if (putIfAbsent != null) {
                        throw new IllegalStateException(String.format("Duplicate key %s (attempted merging values %s and %s)", key, putIfAbsent, value));
                    }
                }
                return map;
            case 2:
                int[] iArr = (int[]) obj;
                Set set2 = Collectors.a;
                iArr[0] = iArr[0] + ((int[]) obj2)[0];
                return iArr;
            case 4:
                Collection collection = (Collection) obj;
                Set set3 = Collectors.a;
                collection.addAll((Collection) obj2);
                return collection;
            case 5:
                List list = (List) obj;
                Set set4 = Collectors.a;
                list.addAll((List) obj2);
                return list;
            case 7:
                List list2 = (List) obj;
                Set set5 = Collectors.a;
                list2.addAll((List) obj2);
                return list2;
            case 9:
                Set set6 = (Set) obj;
                Set set7 = (Set) obj2;
                Set set8 = Collectors.a;
                if (set6.size() < set7.size()) {
                    set7.addAll(set6);
                    return set7;
                }
                set6.addAll(set7);
                return set6;
            case 12:
                long[] jArr = (long[]) obj;
                Set set9 = Collectors.a;
                jArr[0] = jArr[0] + ((long[]) obj2)[0];
                return jArr;
            case 23:
                return new S0((E0) obj, (E0) obj2);
            case 25:
                return new T0((G0) obj, (G0) obj2);
            case 27:
                return new U0((I0) obj, (I0) obj2);
            default:
                return new W0((K0) obj, (K0) obj2);
        }
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public /* synthetic */ Function mo448andThen(Function function) {
        switch (this.a) {
            case 3:
                break;
            case 6:
                break;
            case 8:
                break;
        }
        return Function$CC.$default$andThen(this, function);
    }
}
