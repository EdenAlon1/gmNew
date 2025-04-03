package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxbr {
    public static kml a(Context context) {
        kml b = b(context);
        b.i(context.getResources().getString(R.string.mdd_foreground_service_notification_title));
        b.r(android.R.drawable.stat_notify_sync_noanim);
        return b;
    }

    public static kml b(Context context) {
        kml kmlVar = new kml(context, "download-notification-channel-id");
        kmlVar.A = "service";
        kmlVar.p(true);
        return kmlVar;
    }

    public static void c(Context context) {
        ((NotificationManager) context.getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel("download-notification-channel-id", context.getResources().getString(R.string.mdd_download_notification_channel_name), 3));
    }

    public static void d(Context context, Class cls, String str) {
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("key", str);
        context.startForegroundService(intent);
    }

    public static void e(Context context, Class cls, String str) {
        Intent intent = new Intent(context, (Class<?>) cls);
        intent.putExtra("stop-service", true);
        intent.putExtra("key", str);
        context.startForegroundService(intent);
    }
}
