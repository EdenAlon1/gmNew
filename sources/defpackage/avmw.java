package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.AbstractMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avmw {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/chatapi/capabilities/cache/database/RcsCapabilitiesDatabaseOperations");
    public final dtuu b;

    public avmw(dtuu dtuuVar) {
        this.b = dtuuVar;
    }

    public static avnd a(Map.Entry entry) {
        String[] strArr = avod.a;
        avng avngVar = new avng();
        avngVar.c(((awui) entry.getKey()).d);
        avngVar.d(((avmz) entry.getValue()).a());
        avngVar.b(((avmz) entry.getValue()).b());
        return avngVar.a();
    }

    public static enhk b(Iterable iterable) {
        final enhk enhkVar = (enhk) enqc.a(iterable).collect(endq.a(new Function() { // from class: avmr
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((awui) obj).d;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }, new Function() { // from class: avms
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (awui) obj;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }));
        String[] strArr = avod.a;
        avny avnyVar = new avny(avod.a);
        avnyVar.z("getRcsCapabilities");
        avnyVar.c(new Function() { // from class: avmt
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                avoc avocVar = (avoc) obj;
                avocVar.aq(new dtrw("rcs_remote_capabilities_cache.msisdn", 3, avoc.at(enhk.this.keySet()), false));
                return avocVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return (enhk) Collection.EL.stream(((avnp) avnyVar.b().o()).cX(new dtsp() { // from class: avmu
            @Override // defpackage.dtsp
            public final Object a(Object obj) {
                avnd avndVar = (avnd) obj;
                int i = avmz.b;
                avml avmlVar = new avml();
                avmlVar.c(avndVar.d());
                avmlVar.b(avndVar.e());
                avmz a2 = avmlVar.a();
                avndVar.az(0, "msisdn");
                awui awuiVar = (awui) enhkVar.get(avndVar.a);
                awuiVar.getClass();
                return new AbstractMap.SimpleImmutableEntry(awuiVar, a2);
            }
        })).collect(enhk.v());
    }
}
