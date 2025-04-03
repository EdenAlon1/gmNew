package defpackage;

import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgyh {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/net/MsisdnDiscoveryService");
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;

    public cgyh(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar8.getClass();
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.b = ffbrVar4;
        this.c = ffbrVar5;
        this.d = ffbrVar8;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [aoku, java.lang.Object] */
    public final Optional a(djrm djrmVar) {
        djrmVar.getClass();
        Optional f = ((djsi) this.e.b()).f(djrmVar);
        final ffji ffjiVar = new ffji() { // from class: cgyf
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return ((aolr) cgyh.this.b.b()).r(((djrj) obj).a);
            }
        };
        Optional map = f.map(new Function() { // from class: cgyg
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
        djtp djtpVar = (djtp) fflm.b(((djry) this.f.b()).i(djrmVar));
        Object obj = null;
        if (djtpVar == null) {
            ((enrr) a.j().h("com/google/android/apps/messaging/shared/net/MsisdnDiscoveryService", "getMessagingIdentityFromRcsConfiguration", 81, "MsisdnDiscoveryService.kt")).t("RCS Configuration not found for %s", dktx.SIM_ID.c(djrn.a(djrmVar).a));
        } else {
            Optional a2 = ((csmk) this.g.b()).a(djtpVar);
            if (a2.isPresent() && a2.get().e().isPresent()) {
                obj = a2.get();
            }
        }
        return Optional.ofNullable(map.orElse(obj));
    }
}
