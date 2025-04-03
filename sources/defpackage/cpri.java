package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpri implements fbba {
    public static esrx a(final akke akkeVar, final essk esskVar, final esph esphVar, Optional optional) {
        akkeVar.getClass();
        final ffji ffjiVar = new ffji() { // from class: cprf
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((estl) obj).getClass();
                return akke.this.a(esskVar, esphVar);
            }
        };
        Object orElseGet = optional.map(new Function() { // from class: cprg
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
        }).orElseGet(new Supplier() { // from class: cprh
            @Override // java.util.function.Supplier
            public final Object get() {
                esun a;
                a = akke.this.a(esskVar, esphVar);
                return a;
            }
        });
        orElseGet.getClass();
        return (esrx) orElseGet;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
