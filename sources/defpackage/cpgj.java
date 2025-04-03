package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpgj {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/tachygram/bindings/TachygramFlogger");

    public static final void a(esri esriVar) {
        esrf esrfVar = (esrf) esriVar;
        int i = esrfVar.e - 1;
        enrr a2 = a.a(i != 0 ? i != 1 ? i != 2 ? Level.FINEST : Level.INFO : Level.WARNING : Level.SEVERE);
        a2.Y(ente.a, "tachygram");
        enrr enrrVar = (enrr) a2.g((Throwable) esrfVar.c.orElse(null));
        enrrVar.Y(csux.e, (String) esrfVar.b.orElse(null));
        enrrVar.Y(csux.x, (String) esrfVar.d.orElse(null));
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/tachygram/bindings/TachygramFlogger", "log", 34, "TachygramFlogger.java")).t("TachygramLogger: %s", esrfVar.a);
    }
}
