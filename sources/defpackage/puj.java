package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class puj {
    public static final String a = ppt.d("Alarms");

    public static void a(Context context, pxs pxsVar, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, puk.c(context, pxsVar), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        ppt.c().a(a, "Cancelling existing alarm with (workSpecId, systemId) (" + pxsVar + ", " + i + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, pxs pxsVar, long j) {
        pxm A = workDatabase.A();
        pxk a2 = pxl.a(A, pxsVar);
        if (a2 != null) {
            a(context, pxsVar, a2.c);
            c(context, pxsVar, a2.c, j);
            return;
        }
        final pzz pzzVar = new pzz(workDatabase);
        Object f = pzzVar.a.f(new Callable() { // from class: pzx
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(qaa.a(pzz.this.a, "next_alarm_manager_id"));
            }
        });
        f.getClass();
        int intValue = ((Number) f).intValue();
        A.a(pxr.a(pxsVar, intValue));
        c(context, pxsVar, intValue, j);
    }

    private static void c(Context context, pxs pxsVar, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, puk.c(context, pxsVar), 201326592);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
