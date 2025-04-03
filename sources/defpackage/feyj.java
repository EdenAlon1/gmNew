package defpackage;

import java.util.EnumMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feyj {
    public final Logger a;
    public final Level b;

    public feyj(Level level, Class cls) {
        Logger logger = Logger.getLogger(cls.getName());
        level.getClass();
        this.b = level;
        logger.getClass();
        this.a = logger;
    }

    private static String h(fhmt fhmtVar) {
        long j = fhmtVar.b;
        return j <= 64 ? fhmtVar.v().d() : fhmtVar.w((int) Math.min(j, 64L)).d().concat("...");
    }

    public final boolean a() {
        return this.a.isLoggable(this.b);
    }

    final void b(int i, int i2, fhmt fhmtVar, int i3, boolean z) {
        if (a()) {
            this.a.logp(this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logData", feyh.a(i) + " DATA: streamId=" + i2 + " endStream=" + z + " length=" + i3 + " bytes=" + h(fhmtVar));
        }
    }

    final void c(int i, int i2, fezm fezmVar, fhmx fhmxVar) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            String a = feyh.a(i);
            String valueOf = String.valueOf(fezmVar);
            int b = fhmxVar.b();
            fhmt fhmtVar = new fhmt();
            fhmtVar.K(fhmxVar);
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logGoAway", a + " GO_AWAY: lastStreamId=" + i2 + " errorCode=" + valueOf + " length=" + b + " bytes=" + h(fhmtVar));
        }
    }

    final void d(int i, long j) {
        if (a()) {
            this.a.logp(this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logPing", feyh.a(i) + " PING: ack=false bytes=" + j);
        }
    }

    final void e(int i, int i2, fezm fezmVar) {
        if (a()) {
            this.a.logp(this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logRstStream", feyh.a(i) + " RST_STREAM: streamId=" + i2 + " errorCode=" + String.valueOf(fezmVar));
        }
    }

    final void f(int i, fezz fezzVar) {
        if (a()) {
            Logger logger = this.a;
            Level level = this.b;
            String a = feyh.a(i);
            EnumMap enumMap = new EnumMap(feyi.class);
            for (feyi feyiVar : feyi.values()) {
                int i2 = feyiVar.g;
                if (fezzVar.c(i2)) {
                    enumMap.put((EnumMap) feyiVar, (feyi) Integer.valueOf(fezzVar.a(i2)));
                }
            }
            logger.logp(level, "io.grpc.okhttp.OkHttpFrameLogger", "logSettings", a + " SETTINGS: ack=false settings=" + enumMap.toString());
        }
    }

    final void g(int i, int i2, long j) {
        if (a()) {
            this.a.logp(this.b, "io.grpc.okhttp.OkHttpFrameLogger", "logWindowsUpdate", feyh.a(i) + " WINDOW_UPDATE: streamId=" + i2 + " windowSizeIncrement=" + j);
        }
    }
}
