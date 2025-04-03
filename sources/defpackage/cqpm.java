package defpackage;

import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqpm implements cnoz {
    public static final cfup a = cfvl.a("file_transfer_timeout", 86400000);
    public static final enru b = enru.c("com/google/android/apps/messaging/shared/transfer/FileTransferConnectionMonitor");
    public final ffbr c;
    public final ffbr d;
    private final errl e;

    public cqpm(errl errlVar, ffbr ffbrVar, ffbr ffbrVar2) {
        this.e = errlVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
    }

    @Override // defpackage.cnoz
    public final void c(azsu azsuVar) {
        axnw.h(elfo.f(new Runnable() { // from class: cqpl
            @Override // java.lang.Runnable
            public final void run() {
                cqpm cqpmVar = cqpm.this;
                cqrl cqrlVar = (cqrl) cqpmVar.c.b();
                final Duration ofMillis = Duration.ofMillis(((Long) cqpm.a.e()).longValue());
                efbd.b();
                emxf.b(!ofMillis.isNegative(), "duration should not be negative");
                final Instant f = cqrlVar.e.f();
                engw engwVar = (engw) cqrlVar.d.c("updateRcsFileTransferToAutoResume", new emyl() { // from class: cqqw
                    @Override // defpackage.emyl
                    public final Object get() {
                        entd entdVar = cqrl.a;
                        int i = engw.d;
                        engr engrVar = new engr();
                        Instant instant = Instant.this;
                        Duration duration = ofMillis;
                        engrVar.j(cqrl.d(instant, 110, 104, duration));
                        engrVar.j(cqrl.d(instant, 12, 7, duration));
                        return engrVar.g();
                    }
                });
                ensk e = cqpm.b.e();
                e.Y(ente.a, "BugleFileTransfer");
                ((enrr) ((enrr) e).h("com/google/android/apps/messaging/shared/transfer/FileTransferConnectionMonitor", "scheduleFileTransferResume", 87, "FileTransferConnectionMonitor.java")).t("Resume file transfers %s that paused by satellite", engwVar);
                if (engwVar.isEmpty()) {
                    return;
                }
                ((bbfo) cqpmVar.d.b()).b(9).x(0L);
            }
        }, this.e));
    }

    @Override // defpackage.cnoz
    public final /* synthetic */ void a(azsu azsuVar) {
    }

    @Override // defpackage.cnoz
    public final /* synthetic */ void b(azsu azsuVar) {
    }

    @Override // defpackage.cnoz
    public final /* synthetic */ void d(azsu azsuVar) {
    }

    @Override // defpackage.cnoz
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.cnoz
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.cnoz
    public final /* synthetic */ void g() {
    }
}
