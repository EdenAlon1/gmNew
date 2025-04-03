package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class akvr {
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/alarm/BugleAlarmScheduler");
    public final Context a;
    public AlarmManager b;
    private final akvx d;

    public akvr(Context context, akvx akvxVar) {
        context.getClass();
        this.a = context;
        this.d = akvxVar;
    }

    public final void a(akvt akvtVar) {
        akvtVar.getClass();
        Object systemService = this.a.getSystemService("alarm");
        systemService.getClass();
        this.b = (AlarmManager) systemService;
        Intent a = akuv.b(new ComponentName(this.a, "com.google.android.apps.messaging.shared.alarm.BugleAlarmReceiver"), "com.google.android.apps.messaging.shared.alarm.ACTION_BUGLE_ALARM").a();
        a.getClass();
        PendingIntent a2 = this.d.a(a, akvtVar);
        AlarmManager alarmManager = this.b;
        if (alarmManager == null) {
            ffkj.c("alarmManager");
            alarmManager = null;
        }
        alarmManager.cancel(a2);
    }

    public final void b(Instant instant, akvt akvtVar, boolean z, ffjn ffjnVar, ffjn ffjnVar2) {
        boolean canScheduleExactAlarms;
        Intent a = akuv.b(new ComponentName(this.a, "com.google.android.apps.messaging.shared.alarm.BugleAlarmReceiver"), "com.google.android.apps.messaging.shared.alarm.ACTION_BUGLE_ALARM").a();
        a.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            AlarmManager alarmManager = this.b;
            if (alarmManager == null) {
                ffkj.c("alarmManager");
                alarmManager = null;
            }
            canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
            if (!canScheduleExactAlarms) {
                if (!z) {
                    throw new SecurityException("Missing permission to use exact alarms.");
                }
                ((enrr) c.h().h("com/google/android/apps/messaging/shared/alarm/BugleAlarmScheduler", "scheduleInternalWithFallback", 86, "BugleAlarmScheduler.kt")).q("Missing permission to use exact alarms.");
                ffjnVar2.a(0, Long.valueOf(instant.toEpochMilli()), this.d.a(a, akvtVar));
                return;
            }
        }
        ffjnVar.a(0, Long.valueOf(instant.toEpochMilli()), this.d.a(a, akvtVar));
    }
}
