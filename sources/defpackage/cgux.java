package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgux implements cgun {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/XmsConfigurationListener");

    @Override // defpackage.cgun
    public final elfl a(engw engwVar) {
        Stream map = Collection.EL.stream(engwVar).map(new Function() { // from class: cguw
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((cgue) obj).d();
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i = engw.d;
        engw engwVar2 = (engw) map.collect(endq.a);
        ensk e = a.e();
        e.Y(ente.a, "Bugle");
        ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/mobileconfiguration/accessor/XmsConfigurationListener", "onNewConfig", 34, "XmsConfigurationListener.java")).t("XmsConfigurationListener: Xms flags configuration ids updated: %s", engwVar2);
        return elfo.e(null);
    }
}
