package defpackage;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feji {
    static final Logger a = Logger.getLogger(fdxm.class.getName());
    public final Object b = new Object();
    public final fdzv c;

    public feji(fdzv fdzvVar, long j, String str) {
        fdzvVar.getClass();
        this.c = fdzvVar;
        fdzm fdzmVar = new fdzm();
        fdzmVar.a = str.concat(" created");
        fdzmVar.b = fdzn.CT_INFO;
        fdzmVar.b(j);
        b(fdzmVar.a());
    }

    static void a(fdzv fdzvVar, Level level, String str) {
        Logger logger = a;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + fdzvVar.toString() + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    final void b(fdzo fdzoVar) {
        int ordinal = fdzoVar.b.ordinal();
        Level level = ordinal != 2 ? ordinal != 3 ? Level.FINEST : Level.FINE : Level.FINER;
        synchronized (this.b) {
        }
        a(this.c, level, fdzoVar.a);
    }
}
