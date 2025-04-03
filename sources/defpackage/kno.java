package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kno {
    public static String b;
    private static knn f;
    public final NotificationManager d;
    private final Context g;
    public static final Object a = new Object();
    public static Set c = new HashSet();
    private static final Object e = new Object();

    public kno(Context context) {
        this.g = context;
        this.d = (NotificationManager) context.getSystemService("notification");
    }

    public final NotificationChannel a(String str) {
        NotificationChannel notificationChannel;
        notificationChannel = this.d.getNotificationChannel(str);
        return notificationChannel;
    }

    public final NotificationChannel b(String str, String str2) {
        NotificationChannel notificationChannel;
        if (Build.VERSION.SDK_INT < 30) {
            return a(str);
        }
        notificationChannel = this.d.getNotificationChannel(str, str2);
        return notificationChannel;
    }

    public final List c() {
        List notificationChannels;
        notificationChannels = this.d.getNotificationChannels();
        return notificationChannels;
    }

    public final void d(String str, int i) {
        this.d.cancel(str, i);
    }

    public final void e(NotificationChannelGroup notificationChannelGroup) {
        this.d.createNotificationChannelGroup(notificationChannelGroup);
    }

    public final void f(int i, Notification notification) {
        g(null, i, notification);
    }

    public final void g(String str, int i, Notification notification) {
        Bundle bundle = notification.extras;
        if (bundle == null || !bundle.getBoolean("android.support.useSideChannel")) {
            this.d.notify(str, i, notification);
            return;
        }
        knk knkVar = new knk(this.g.getPackageName(), i, str, notification);
        synchronized (e) {
            if (f == null) {
                f = new knn(this.g.getApplicationContext());
            }
            f.a.obtainMessage(0, knkVar).sendToTarget();
        }
        this.d.cancel(str, i);
    }

    public final boolean h() {
        boolean areNotificationsEnabled;
        areNotificationsEnabled = this.d.areNotificationsEnabled();
        return areNotificationsEnabled;
    }
}
