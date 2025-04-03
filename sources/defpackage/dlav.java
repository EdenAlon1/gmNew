package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlav {
    public static final long a = TimeUnit.HOURS.toMillis(1);

    public static final pot a(dlgb dlgbVar) {
        dlgbVar.getClass();
        pon ponVar = new pon();
        ponVar.e("key_client_id", dlgbVar.a());
        return ponVar.a();
    }

    public static final dlgb b(pot potVar) {
        String d = potVar.d("key_client_id");
        if (d != null) {
            if (d.length() <= 0) {
                d = null;
            }
            if (d != null) {
                List V = ffpc.V(d, new String[]{":"}, 2, 2);
                return V.size() == 1 ? new dlgb(d, "") : new dlgb((String) V.get(0), (String) V.get(1));
            }
        }
        return null;
    }

    public static final String c(String str, dlgb dlgbVar) {
        dlgbVar.getClass();
        String format = String.format("%s:%s", Arrays.copyOf(new Object[]{str, dlgbVar.a()}, 2));
        format.getClass();
        return format;
    }

    public static final int d(int i) {
        return i + (-1) != 1 ? 2 : 3;
    }
}
