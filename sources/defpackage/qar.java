package defpackage;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qar {
    public static final String a = ppt.d("WakeLocks");

    public static final PowerManager.WakeLock a(Context context, String str) {
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("power");
        systemService.getClass();
        String concat = "WorkManager: ".concat(str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, concat);
        synchronized (qas.a) {
        }
        newWakeLock.getClass();
        return newWakeLock;
    }
}
