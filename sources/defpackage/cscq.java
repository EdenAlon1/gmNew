package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Stream;
import java.util.function.Function;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cscq {
    public static final /* synthetic */ int a = 0;
    private static final entd b = entd.c("BugleCmsPrimaryDevice");

    public static engw a(esvv esvvVar) {
        Stream map = Collection.EL.stream(esvvVar.f).filter(new Predicate() { // from class: csco
            public final /* synthetic */ Predicate and(Predicate predicate) {
                return Predicate$CC.$default$and(this, predicate);
            }

            @Override // java.util.function.Predicate
            /* renamed from: negate */
            public final /* synthetic */ Predicate mo439negate() {
                return Predicate$CC.$default$negate(this);
            }

            public final /* synthetic */ Predicate or(Predicate predicate) {
                return Predicate$CC.$default$or(this, predicate);
            }

            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                int a2;
                esvx esvxVar = (esvx) obj;
                int i = cscq.a;
                int a3 = esvz.a(esvxVar.c);
                return a3 != 0 && a3 == 3 && (a2 = esvy.a(esvxVar.d)) != 0 && a2 == 4;
            }
        }).map(new Function() { // from class: cscp
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = cscq.a;
                return ((esvx) obj).b;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        engw engwVar = (engw) map.collect(endq.a);
        if (engwVar.size() > 1) {
            ensz enszVar = (ensz) b.j();
            enszVar.Y(cdii.o, eirv.b().a(engwVar));
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/util/cloudstore/CmsPrimaryDeviceUtility", "getBoxPrimaryDeviceIds", 37, "CmsPrimaryDeviceUtility.java")).q("Found more than 1 primary devices in box");
        }
        return engwVar;
    }
}
