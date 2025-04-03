package j$.util.stream;

import j$.util.Map;
import j$.util.Objects;
import j$.util.function.BiConsumer$CC;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0120n implements BiConsumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ C0120n(Function function, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = function;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.function.BiConsumer
    public final void accept(Object obj, Object obj2) {
        Object obj3 = this.d;
        Object obj4 = this.c;
        Function function = this.b;
        Map map = (Map) obj;
        switch (this.a) {
            case 0:
                Set set = Collectors.a;
                Map.EL.a(map, function.apply(obj2), ((Function) obj4).apply(obj2), (BinaryOperator) obj3);
                break;
            default:
                Set set2 = Collectors.a;
                Object apply = function.apply(obj2);
                Objects.a(apply, "element cannot be mapped to a null key");
                BiConsumer biConsumer = (BiConsumer) obj3;
                biConsumer.accept(Map.EL.computeIfAbsent(map, apply, new C0055a(2, (Supplier) obj4)), obj2);
                break;
        }
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
        }
        return BiConsumer$CC.$default$andThen(this, biConsumer);
    }
}
