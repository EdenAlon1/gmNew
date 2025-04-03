package defpackage;

import androidx.car.app.model.Alert;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duhe {
    static final String a;
    private static final String b;
    private static final String c;
    private static final String d;

    static {
        String format = String.format(Locale.US, "INSERT INTO %1$s(%2$s, %3$s) ", "geller_database_info_table", "key", "info");
        b = format;
        String format2 = String.format(Locale.US, "SELECT '%1$s', ABS(RANDOM() %% %2$d) ", "database_id", Integer.valueOf(Alert.DURATION_SHOW_INDEFINITELY));
        c = format2;
        String format3 = String.format(Locale.US, "WHERE NOT EXISTS (SELECT 1 FROM %1$s WHERE %2$s = '%3$s');", "geller_database_info_table", "key", "database_id");
        d = format3;
        a = format + format2 + format3;
    }
}
