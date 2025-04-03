package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.DropBoxManager;
import android.util.Log;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edti {
    private static DropBoxManager a;
    private static final LinkedHashMap b = new edth();
    private static String c;

    public static synchronized void a(Context context) {
        synchronized (edti.class) {
            if (a == null) {
                a = (DropBoxManager) context.getApplicationContext().getSystemService("dropbox");
                c = "com.google.android.libraries.places";
            }
        }
    }

    public static synchronized void b(Throwable th) {
        DropBoxManager dropBoxManager;
        synchronized (edti.class) {
            long id = Thread.currentThread().getId();
            int hashCode = th.hashCode();
            Integer num = (Integer) b.get(Long.valueOf(id));
            if ((num == null || num.intValue() != hashCode) && (dropBoxManager = a) != null && dropBoxManager.isTagEnabled("system_app_crash")) {
                DropBoxManager dropBoxManager2 = a;
                StringBuilder sb = new StringBuilder();
                List i = emye.b('.').i("4.2.0");
                long j = -1;
                if (i.size() == 3) {
                    long j2 = 0;
                    for (int i2 = 0; i2 < i.size(); i2++) {
                        try {
                            j2 = (j2 * 100) + Integer.parseInt((String) i.get(i2));
                        } catch (NumberFormatException unused) {
                        }
                    }
                    j = j2;
                }
                sb.append(String.format("Package: %s v%d (%s)\n", c, Long.valueOf(j), "4.2.0"));
                sb.append(String.format("Build: %s\n", Build.FINGERPRINT));
                sb.append("\n");
                sb.append(Log.getStackTraceString(th));
                dropBoxManager2.addText("system_app_crash", sb.toString());
                b.put(Long.valueOf(id), Integer.valueOf(hashCode));
            }
        }
    }
}
