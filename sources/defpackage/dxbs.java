package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxbs extends dxbt {
    public dwub a;

    private final void b(Notification notification) {
        if (Build.VERSION.SDK_INT >= 34) {
            startForeground(1585575426, notification, 1);
        } else {
            startForeground(1585575426, notification);
        }
    }

    private final void c(Notification notification, String str) {
        if (Build.VERSION.SDK_INT < 31) {
            b(notification);
            return;
        }
        try {
            b(notification);
        } catch (ForegroundServiceStartNotAllowedException e) {
            dxth.i("%s: Failed to startForeground for Key %s with exception %s", "MDD Foreground Download Service", str, e);
            this.a.l(str);
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        dxth.b("%s: ForegroundDownloadService.onStartCommand.", "MDD Foreground Download Service");
        String stringExtra = intent.getStringExtra("key");
        if (emxe.c(stringExtra)) {
            dxth.g("%s: KEY_EXTRA is null or empty!", "MDD Foreground Download Service");
            return 2;
        }
        if (intent.getBooleanExtra("stop-service", false)) {
            dxth.b("%s: Stopping ForegroundDownloadService.", "MDD Foreground Download Service");
            c(dxbr.a(this).a(), stringExtra);
            stopForeground(true);
            stopSelf(i2);
            return 2;
        }
        if (intent.hasExtra("cancel-action")) {
            dxth.c("%s: Cancel notification for: %s", "MDD Foreground Download Service", stringExtra);
            this.a.l(stringExtra);
        }
        dxth.b("%s: before calling startForeground.", "MDD Foreground Download Service");
        c(dxbr.a(this).a(), stringExtra);
        return 2;
    }

    public final void onTimeout(int i, int i2) {
        dxth.o("%s: onTimeout: %s", "MDD Foreground Download Service", Integer.valueOf(i2));
        super.onTimeout(i, i2);
        stopForeground(true);
        stopSelf(i);
    }
}
