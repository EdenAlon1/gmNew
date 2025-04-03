package defpackage;

import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acin implements csic {
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    private final errm g;
    private static final long f = TimeUnit.SECONDS.toMillis(2);
    public static final enru a = enru.c("com/google/android/apps/messaging/ditto/TachyonBindApplicationStateManager");

    public acin(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, errm errmVar, ffbr ffbrVar4) {
        this.c = ffbrVar;
        this.b = ffbrVar2;
        this.d = ffbrVar3;
        this.g = errmVar;
        this.e = ffbrVar4;
    }

    @Override // defpackage.csic
    public final void a() {
        ekzz f2 = eleg.f("TachyonBindApplicationStateManager#onFirstActivityStarted_tachyonReceiverManager");
        try {
            errm errmVar = this.g;
            Runnable l = eldl.l(new Runnable() { // from class: acik
                @Override // java.lang.Runnable
                public final void run() {
                    acin acinVar = acin.this;
                    byte[] r = ((ctyx) acinVar.c.b()).r("ditto_active_desktop_id");
                    if (r == null) {
                        ensk h = acin.a.h();
                        h.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) h).h("com/google/android/apps/messaging/ditto/TachyonBindApplicationStateManager", "hasDittoActiveAnonymousDesktopId", 150, "TachyonBindApplicationStateManager.java")).q("No need to start anonymous Tachyon binding due to no active desktop id");
                        return;
                    }
                    try {
                        if (!((fcek) eyfy.parseFrom(fcek.a, r, eyfc.a())).d.equals("Bugle")) {
                            ensk h2 = acin.a.h();
                            h2.Y(ente.a, "BugleNetwork");
                            ((enrr) ((enrr) h2).h("com/google/android/apps/messaging/ditto/TachyonBindApplicationStateManager", "hasDittoActiveAnonymousDesktopId", 160, "TachyonBindApplicationStateManager.java")).q("No need to start anonymous Tachyon binding for non-anonymous app");
                        } else {
                            ensk h3 = acin.a.h();
                            h3.Y(ente.a, "BugleNetwork");
                            ((enrr) ((enrr) h3).h("com/google/android/apps/messaging/ditto/TachyonBindApplicationStateManager", "onFirstActivityStarted", 76, "TachyonBindApplicationStateManager.java")).q("Start anonymous Tachyon binding for Bugle app");
                            ((cilk) acinVar.b.b()).d();
                        }
                    } catch (eygu e) {
                        ensk j = acin.a.j();
                        j.Y(ente.a, "BugleNetwork");
                        ((enrr) ((enrr) ((enrr) j).g(e)).h("com/google/android/apps/messaging/ditto/TachyonBindApplicationStateManager", "hasDittoActiveAnonymousDesktopId", (char) 162, "TachyonBindApplicationStateManager.java")).q("Skip anonymous Tachyon binding because unable to parse desktop id");
                    }
                }
            });
            long j = f;
            f2.b(elfl.g(errmVar.schedule(l, j, TimeUnit.MILLISECONDS)));
            f2.close();
            ekzz f3 = eleg.f("TachyonBindApplicationStateManager#onFirstActivityStarted_gaiaBindManagerMap");
            try {
                f3.b(elfl.g(this.g.schedule(eldl.l(new Runnable() { // from class: acil
                    @Override // java.lang.Runnable
                    public final void run() {
                        acin acinVar = acin.this;
                        for (String str : ((Map) acinVar.d.b()).keySet()) {
                            if (str.equals("CMS")) {
                                ((ciap) ((Map) acinVar.d.b()).get(str)).g();
                            } else {
                                ((ciap) ((Map) acinVar.d.b()).get(str)).d();
                            }
                        }
                    }
                }), j, TimeUnit.MILLISECONDS)));
                f3.close();
                errm errmVar2 = this.g;
                f3 = eleg.f("TachyonBindApplicationStateManager#scheduleBindTachygramChannels");
                try {
                    f3.b(errmVar2.schedule(eldl.l(new Runnable() { // from class: acim
                        @Override // java.lang.Runnable
                        public final void run() {
                            chgf chgfVar = (chgf) acin.this.e.b();
                            axol.c(chgfVar.b, ffhe.a, ffsm.a, new chgd(chgfVar, null));
                        }
                    }), j, TimeUnit.MILLISECONDS));
                    f3.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.csic
    public final void b() {
        ((cilk) this.b.b()).f();
    }
}
