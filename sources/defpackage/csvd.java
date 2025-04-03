package defpackage;

import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csvd {
    static final cfup a;
    static final cfup b;
    static final cfup c;
    static final cfup d;
    private static final int e;

    static {
        int intValue = Level.INFO.intValue();
        e = intValue;
        a = cfvl.e(cfvl.b, "flogger_client_logging_minimum_log_level", Level.WARNING.intValue());
        b = cfvl.e(cfvl.b, "flogger_logs_file_rotation_set_size", 4);
        c = cfvl.e(cfvl.b, "flogger_logs_file_size_limit", 4194304);
        d = cfvl.e(cfvl.b, "flogger_logs_file_minimum_log_level", intValue);
    }
}
