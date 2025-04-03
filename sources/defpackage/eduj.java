package defpackage;

import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class eduj implements BiFunction {
    public final /* synthetic */ BiFunction a;

    public /* synthetic */ eduj(BiFunction biFunction) {
        this.a = biFunction;
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        Object apply;
        Long l = (Long) obj;
        Optional optional = (Optional) obj2;
        enru enruVar = edva.a;
        if (optional.isEmpty() || ((eduz) optional.get()).d()) {
            return Optional.of(eduz.a(l.longValue()));
        }
        edxp c = ((eduz) optional.get()).c();
        long longValue = c.b == 1 ? ((Long) c.c).longValue() : 0L;
        BiFunction biFunction = this.a;
        Long valueOf = Long.valueOf(longValue);
        apply = biFunction.apply(l, valueOf);
        Long l2 = (Long) apply;
        return l2.equals(valueOf) ? Optional.empty() : Optional.of(eduz.a(l2.longValue()));
    }
}
