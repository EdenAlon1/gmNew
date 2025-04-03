package defpackage;

import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccjc implements ccjf {
    @Override // defpackage.ccjf
    public final elfl a(engw engwVar, Optional optional) {
        return elfo.e(new ccam(1, (Map) Collection.EL.stream(engwVar).collect(Collectors.toMap(new Function() { // from class: cciy
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (ccce) obj;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: cciz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return new cckg();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new BinaryOperator() { // from class: ccja
            public final /* synthetic */ BiFunction andThen(Function function) {
                return BiFunction$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return (ccki) obj;
            }
        }, new Supplier() { // from class: ccjb
            @Override // java.util.function.Supplier
            public final Object get() {
                return new HashMap();
            }
        }))));
    }

    @Override // defpackage.ccjf
    public final /* synthetic */ elfl b(String str, String str2, int i, boolean z) {
        throw new UnsupportedOperationException("NotImplementedYet");
    }

    @Override // defpackage.ccjf
    public final boolean c(int i) {
        return false;
    }

    @Override // defpackage.ccjf
    public final elfl d(String str, String str2, int i) {
        return elfo.e(true);
    }
}
