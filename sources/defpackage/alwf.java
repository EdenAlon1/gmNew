package defpackage;

import j$.util.Optional;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class alwf {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/analytics/statistics/cobalt/ActiveUserActionCobaltLogger");
    public final Optional b;
    public final dfoq c;
    private final alwn d;
    private final ffbr e;
    private final errl f;
    private final errl g;
    private final errl h;
    private final ffbr i;

    public alwf(ffbr ffbrVar, Optional optional, dfoq dfoqVar, alwn alwnVar, ffbr ffbrVar2, errl errlVar, errl errlVar2, errl errlVar3) {
        this.i = ffbrVar;
        this.b = optional;
        this.c = dfoqVar;
        this.d = alwnVar;
        this.e = ffbrVar2;
        this.f = errlVar;
        this.g = errlVar2;
        this.h = errlVar3;
    }

    private final void d(ekzz ekzzVar, errl errlVar) {
        elfl f = elfo.f(new Runnable() { // from class: alwc
            @Override // java.lang.Runnable
            public final void run() {
                alwf alwfVar = alwf.this;
                ((alwk) alwfVar.b.get()).a(1L, alwfVar.a());
            }
        }, errlVar);
        ekzzVar.b(f);
        axnw.h(f);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011e, code lost:
    
        if (r2.equals("UNKNOWN") != false) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.engw a() {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alwf.a():engw");
    }

    public final void b() {
        ekzz f;
        if (((Boolean) ((cfup) alwj.c.get()).e()).booleanValue()) {
            if (this.b.isPresent()) {
                f = eleg.f("ActiveUserActionCobaltLogger::logCobaltActiveUserMetric");
                try {
                    if (((Boolean) ((cfup) alwj.f.get()).e()).booleanValue()) {
                        d(f, this.g);
                    } else if (((Boolean) ((cfup) alwj.e.get()).e()).booleanValue()) {
                        d(f, this.h);
                    } else {
                        d(f, this.f);
                    }
                    f.close();
                } catch (Throwable th) {
                    throw th;
                }
            }
            f = eleg.f("ActiveUserActionCobaltLogger::logCobaltActiveUserMetricGmsCore");
            try {
                elfl g = elfo.g(new Callable() { // from class: alwd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        alwf alwfVar = alwf.this;
                        dhre a2 = alwfVar.c.a(3, ermn.l(alwfVar.a()));
                        a2.t(new dhqv() { // from class: alwe
                            @Override // defpackage.dhqv
                            public final void d(Exception exc) {
                                if ((exc instanceof dfqu) && ((dfqu) exc).a() == 17) {
                                    return;
                                }
                                ((enrr) ((enrr) ((enrr) alwf.a.j()).g(exc)).h("com/google/android/apps/messaging/shared/analytics/statistics/cobalt/ActiveUserActionCobaltLogger", "logUnexpectedFailure", 168, "ActiveUserActionCobaltLogger.java")).t("Failed to log to Cobalt in GMS Core: %s", exc);
                            }
                        });
                        return a2;
                    }
                }, this.h);
                f.b(g);
                axnw.h(g);
                f.close();
            } finally {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
        }
    }

    public final void c(boolean z) {
        if (z) {
            b();
        }
    }
}
