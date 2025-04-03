package defpackage;

import android.util.Pair;
import j$.util.function.BiFunction$CC;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cfzy implements BiFunction {
    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return new Pair((String) obj, (elfl) obj2);
    }
}
