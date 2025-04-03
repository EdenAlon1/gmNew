package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csta {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/ditto/DittoRequestSubIdProvider");
    private final ctwb b;

    public csta(ctwb ctwbVar) {
        ctwbVar.getClass();
        this.b = ctwbVar;
    }

    public final Optional a(escu escuVar) {
        escuVar.getClass();
        if (b(escuVar)) {
            return Optional.of(Integer.valueOf(escuVar.c));
        }
        enru enruVar = a;
        ensk h = enruVar.h();
        h.Y(ente.a, "BugleNetwork");
        ((enrr) h.h("com/google/android/apps/messaging/shared/util/ditto/DittoRequestSubIdProvider", "getSubId", 28, "DittoRequestSubIdProvider.kt")).q("No valid subId set.");
        if (this.b.a() == 1) {
            ensk h2 = enruVar.h();
            h2.Y(ente.a, "BugleNetwork");
            ((enrr) h2.h("com/google/android/apps/messaging/shared/util/ditto/DittoRequestSubIdProvider", "getSubId", 33, "DittoRequestSubIdProvider.kt")).q("No valid subId found, but there is only one active subscription. Falling back to the default SMS subId.");
            return Optional.of(Integer.valueOf(this.b.c()));
        }
        ensk j = enruVar.j();
        j.Y(ente.a, "BugleNetwork");
        ((enrr) j.h("com/google/android/apps/messaging/shared/util/ditto/DittoRequestSubIdProvider", "getSubId", 39, "DittoRequestSubIdProvider.kt")).q("Falied to retrieve subId.");
        return Optional.empty();
    }

    public final boolean b(escu escuVar) {
        int b;
        escuVar.getClass();
        escq escqVar = (escq) escr.a.createBuilder();
        escqVar.getClass();
        eyfy build = escqVar.build();
        build.getClass();
        return (ffkj.e(escuVar, (escr) build) || (b = esct.b(escuVar.b)) == 0 || b != 4 || escuVar.c == -1) ? false : true;
    }
}
