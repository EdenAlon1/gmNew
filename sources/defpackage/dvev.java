package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvev implements dvdy {
    private static final entd a = entd.c("GnpSdk");
    private final eafv b;
    private final dlpw c;

    public dvev(eafv eafvVar, dlpw dlpwVar) {
        this.b = eafvVar;
        this.c = dlpwVar;
    }

    private static String g(String str, Object... objArr) {
        return objArr.length > 0 ? String.format(str, objArr) : str;
    }

    private final void h(dvdp dvdpVar, String str) {
        evts c = dvdpVar.c();
        String e = dvdpVar.e();
        if (fdno.b()) {
            dvfk dvfkVar = (dvfk) dvfl.a.createBuilder();
            dvfkVar.copyOnWrite();
            dvfl dvflVar = (dvfl) dvfkVar.instance;
            c.getClass();
            dvflVar.c = c;
            dvflVar.b |= 1;
            long epochMilli = this.c.f().toEpochMilli();
            dvfkVar.copyOnWrite();
            dvfl dvflVar2 = (dvfl) dvfkVar.instance;
            dvflVar2.b |= 4;
            dvflVar2.e = epochMilli;
            dvfkVar.copyOnWrite();
            dvfl dvflVar3 = (dvfl) dvfkVar.instance;
            str.getClass();
            dvflVar3.b |= 8;
            dvflVar3.f = str;
            if (e != null) {
                dvfkVar.copyOnWrite();
                dvfl dvflVar4 = (dvfl) dvfkVar.instance;
                dvflVar4.b |= 2;
                dvflVar4.d = e;
            }
            ((dvmt) this.b.a(e)).d(UUID.randomUUID().toString(), (dvfl) dvfkVar.build());
        }
    }

    @Override // defpackage.dvdy
    public final void a(dvdp dvdpVar, String str, Object... objArr) {
        String g = g(str, objArr);
        ensz enszVar = (ensz) a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/debug/impl/PromoEvalLoggerImpl", "logDebug", 103, "PromoEvalLoggerImpl.java");
        evub evubVar = dvdpVar.c().c;
        if (evubVar == null) {
            evubVar = evub.a;
        }
        enszVar.w("Promo ID [%s]: %s", evubVar.b, g);
        h(dvdpVar, g);
    }

    @Override // defpackage.dvdy
    public final void b(dvdp dvdpVar, String str, Object... objArr) {
        String g = g(str, objArr);
        ensz enszVar = (ensz) ((ensz) a.i()).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/impl/PromoEvalLoggerImpl", "logError", 38, "PromoEvalLoggerImpl.java");
        evub evubVar = dvdpVar.c().c;
        if (evubVar == null) {
            evubVar = evub.a;
        }
        enszVar.w("Promo ID [%s]: %s", evubVar.b, g);
        h(dvdpVar, g);
    }

    @Override // defpackage.dvdy
    public final void c(dvdp dvdpVar, String str, Object... objArr) {
        String g = g(str, objArr);
        ensz enszVar = (ensz) a.o().h("com/google/android/libraries/internal/growth/growthkit/internal/debug/impl/PromoEvalLoggerImpl", "logVerbose", 90, "PromoEvalLoggerImpl.java");
        evub evubVar = dvdpVar.c().c;
        if (evubVar == null) {
            evubVar = evub.a;
        }
        enszVar.w("Promo ID [%s]: %s", evubVar.b, g);
        h(dvdpVar, g);
    }

    @Override // defpackage.dvdy
    public final void d(dvdp dvdpVar, String str, Object... objArr) {
        String g = g(str, objArr);
        ensz enszVar = (ensz) ((ensz) a.j()).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/impl/PromoEvalLoggerImpl", "logWarning", 63, "PromoEvalLoggerImpl.java");
        evub evubVar = ((dvdj) dvdpVar).a.c;
        if (evubVar == null) {
            evubVar = evub.a;
        }
        enszVar.w("Promo ID [%s]: %s", evubVar.b, g);
        h(dvdpVar, g);
    }

    @Override // defpackage.dvdy
    public final void e(dvdp dvdpVar, Throwable th, Object... objArr) {
        String g = g("Unexpected exception while rendering promotion.", objArr);
        ensz enszVar = (ensz) ((ensz) ((ensz) a.i()).g(th)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/impl/PromoEvalLoggerImpl", "logError", 52, "PromoEvalLoggerImpl.java");
        evub evubVar = dvdpVar.c().c;
        if (evubVar == null) {
            evubVar = evub.a;
        }
        enszVar.w("Promo ID [%s]: %s", evubVar.b, g);
        h(dvdpVar, g);
    }

    @Override // defpackage.dvdy
    public final void f(dvdp dvdpVar, Throwable th, Object... objArr) {
        String g = g("getPackageInfo(%s) failed", objArr);
        ensz enszVar = (ensz) ((ensz) ((ensz) a.j()).g(th)).h("com/google/android/libraries/internal/growth/growthkit/internal/debug/impl/PromoEvalLoggerImpl", "logWarning", 77, "PromoEvalLoggerImpl.java");
        evub evubVar = ((dvdj) dvdpVar).a.c;
        if (evubVar == null) {
            evubVar = evub.a;
        }
        enszVar.w("Promo ID [%s]: %s", evubVar.b, g);
        h(dvdpVar, g);
    }
}
