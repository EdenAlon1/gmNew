package defpackage;

import j$.util.Map;
import j$.util.function.Function$CC;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejbj {
    public static final void a(String str, eixz eixzVar, Map map) {
        final ffji ffjiVar = new ffji() { // from class: ejbh
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((String) obj).getClass();
                return new LinkedHashMap();
            }
        };
        Object computeIfAbsent = Map.EL.computeIfAbsent(map, str, new Function() { // from class: ejbi
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ffji.this.invoke(obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        computeIfAbsent.getClass();
        java.util.Map map2 = (java.util.Map) computeIfAbsent;
        if (map2.containsKey(eixzVar.g)) {
            throw new IllegalStateException("Found 2 accounts with the same account name.");
        }
        map2.put(eixzVar.g, eixzVar);
    }
}
