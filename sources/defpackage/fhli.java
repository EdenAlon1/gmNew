package defpackage;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhli extends Handler {
    public static final fhli a = new fhli();

    private fhli() {
    }

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        logRecord.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = fhlh.a;
        String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        int i = logRecord.getLevel().intValue() > Level.INFO.intValue() ? 5 : logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        message.getClass();
        Throwable thrown = logRecord.getThrown();
        String str = (String) fhlh.b.get(loggerName);
        if (str == null) {
            str = ffpc.ac(loggerName, 23);
        }
        if (!Log.isLoggable(str, i)) {
            return;
        }
        if (thrown != null) {
            message = message + "\n" + Log.getStackTraceString(thrown);
        }
        int i2 = 0;
        while (true) {
            int length = message.length();
            if (i2 >= length) {
                return;
            }
            int P = ffpc.P(message, '\n', i2, 4);
            if (P != -1) {
                length = P;
            }
            while (true) {
                min = Math.min(length, i2 + 4000);
                String substring = message.substring(i2, min);
                substring.getClass();
                Log.println(i, str, substring);
                if (min >= length) {
                    break;
                } else {
                    i2 = min;
                }
            }
            i2 = min + 1;
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
