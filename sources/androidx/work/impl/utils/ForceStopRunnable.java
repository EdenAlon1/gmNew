package androidx.work.impl.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.android.vcard.VCardConfig;
import defpackage.pps;
import defpackage.ppt;
import defpackage.pte;
import defpackage.qaf;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ForceStopRunnable implements Runnable {
    private static final String a = ppt.d("ForceStopRunnable");
    private static final long b = TimeUnit.DAYS.toMillis(3650);
    private final Context c;
    private final pte d;
    private final qaf e;
    private int f = 0;

    /* compiled from: PG */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String a = ppt.d("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            int i = ((pps) ppt.c()).a;
            String str = a;
            if (i <= 2) {
                Log.v(str, "Rescheduling alarm that keeps track of force-stops.");
            }
            ForceStopRunnable.a(context);
        }
    }

    public ForceStopRunnable(Context context, pte pteVar) {
        this.c = context.getApplicationContext();
        this.d = pteVar;
        this.e = pteVar.h;
    }

    static void a(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent b2 = b(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        long currentTimeMillis = System.currentTimeMillis() + b;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, b2);
        }
    }

    private static PendingIntent b(Context context, int i) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return PendingIntent.getBroadcast(context, -1, intent, i);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(35:38|39|40|41|(2:44|42)|45|46|(1:48)(1:175)|49|(3:53|(4:56|(3:62|63|64)(3:58|59|60)|61|54)|65)|66|(2:67|(2:69|(2:71|72)(1:172))(2:173|174))|73|(7:75|76|77|(2:80|78)|81|82|83)|89|90|91|(3:93|(5:96|97|98|99|94)|103)|105|106|107|108|109|110|111|112|(3:116|117|(5:124|125|(1:127)(1:157)|128|(4:(1:131)|132|(5:136|(1:138)|139|(4:142|(2:144|(3:146|147|148)(1:149))(1:151)|150|140)|152)|(1:154)(0))(2:(2:156|148)|(0)(0)))(1:121))|162|117|(1:119)|124|125|(0)(0)|128|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0367, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x036a, code lost:
    
        defpackage.ppt.c();
        android.util.Log.w(androidx.work.impl.utils.ForceStopRunnable.a, "Ignoring exception", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0369, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0033, code lost:
    
        if (r0 == false) goto L198;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x034f A[Catch: SQLiteTableLockedException -> 0x03ca, SQLiteFullException -> 0x03cc, SQLiteDiskIOException -> 0x03ce, SQLiteDatabaseLockedException -> 0x03d0, SQLiteDatabaseCorruptException -> 0x03d2, SQLiteConstraintException -> 0x03d4, SQLiteCantOpenDatabaseException -> 0x03d6, SQLiteAccessPermException -> 0x03d8, all -> 0x046c, TRY_ENTER, TryCatch #3 {all -> 0x046c, blocks: (B:3:0x0006, B:5:0x0012, B:8:0x0037, B:10:0x0049, B:12:0x007b, B:14:0x00b6, B:16:0x00c1, B:17:0x00d7, B:18:0x00df, B:20:0x00e5, B:23:0x00fd, B:25:0x0103, B:26:0x0118, B:28:0x011e, B:29:0x0131, B:32:0x0127, B:36:0x00ca, B:37:0x013b, B:39:0x0146, B:46:0x0187, B:48:0x018f, B:49:0x0195, B:51:0x019c, B:53:0x01a2, B:54:0x01a6, B:56:0x01ac, B:63:0x01b8, B:59:0x01be, B:66:0x01c6, B:67:0x01ca, B:69:0x01d0, B:72:0x01dc, B:75:0x01ee, B:83:0x020c, B:86:0x0211, B:87:0x0214, B:89:0x0215, B:101:0x03bc, B:102:0x03bf, B:112:0x028e, B:117:0x029a, B:119:0x02ac, B:121:0x02b6, B:125:0x02de, B:128:0x02e9, B:131:0x02f7, B:132:0x02fa, B:134:0x030b, B:136:0x0311, B:138:0x031f, B:140:0x0323, B:142:0x0329, B:144:0x0339, B:148:0x0374, B:150:0x0342, B:154:0x034f, B:156:0x0347, B:160:0x036a, B:182:0x03eb, B:193:0x03f3, B:196:0x0400, B:198:0x0415, B:199:0x0422, B:184:0x0423, B:187:0x0445, B:178:0x03c1, B:179:0x03c9, B:210:0x044b, B:212:0x0462, B:213:0x046b, B:214:0x001e), top: B:2:0x0006, inners: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0423 A[Catch: all -> 0x046c, TRY_LEAVE, TryCatch #3 {all -> 0x046c, blocks: (B:3:0x0006, B:5:0x0012, B:8:0x0037, B:10:0x0049, B:12:0x007b, B:14:0x00b6, B:16:0x00c1, B:17:0x00d7, B:18:0x00df, B:20:0x00e5, B:23:0x00fd, B:25:0x0103, B:26:0x0118, B:28:0x011e, B:29:0x0131, B:32:0x0127, B:36:0x00ca, B:37:0x013b, B:39:0x0146, B:46:0x0187, B:48:0x018f, B:49:0x0195, B:51:0x019c, B:53:0x01a2, B:54:0x01a6, B:56:0x01ac, B:63:0x01b8, B:59:0x01be, B:66:0x01c6, B:67:0x01ca, B:69:0x01d0, B:72:0x01dc, B:75:0x01ee, B:83:0x020c, B:86:0x0211, B:87:0x0214, B:89:0x0215, B:101:0x03bc, B:102:0x03bf, B:112:0x028e, B:117:0x029a, B:119:0x02ac, B:121:0x02b6, B:125:0x02de, B:128:0x02e9, B:131:0x02f7, B:132:0x02fa, B:134:0x030b, B:136:0x0311, B:138:0x031f, B:140:0x0323, B:142:0x0329, B:144:0x0339, B:148:0x0374, B:150:0x0342, B:154:0x034f, B:156:0x0347, B:160:0x036a, B:182:0x03eb, B:193:0x03f3, B:196:0x0400, B:198:0x0415, B:199:0x0422, B:184:0x0423, B:187:0x0445, B:178:0x03c1, B:179:0x03c9, B:210:0x044b, B:212:0x0462, B:213:0x046b, B:214:0x001e), top: B:2:0x0006, inners: #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03f3 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1139
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.utils.ForceStopRunnable.run():void");
    }
}
