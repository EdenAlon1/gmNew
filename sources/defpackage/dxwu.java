package defpackage;

import android.app.ForegroundServiceStartNotAllowedException;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxwu extends dxwv {
    public dxwg a;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        dxth.b("%s: ForegroundDownloadService.onStartCommand.", "MDD Foreground Download Service");
        if (intent.getBooleanExtra("stop-service", false)) {
            dxth.b("%s: Stopping ForegroundDownloadService.", "MDD Foreground Download Service");
            stopSelf();
            return 2;
        }
        String stringExtra = intent.getStringExtra("key");
        if (emxe.c(stringExtra)) {
            dxth.g("%s: KEY_EXTRA is null or empty!", "MDD Foreground Download Service");
            return 2;
        }
        if (intent.hasExtra("cancel-action")) {
            dxth.c("%s: Cancel notification for: %s", "MDD Foreground Download Service", stringExtra);
            this.a.b(stringExtra);
            return 2;
        }
        dxth.c("%s: before calling startForeground for Key %s", "MDD Foreground Download Service", stringExtra);
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                startForeground(1, dxbr.a(this).a());
            } catch (ForegroundServiceStartNotAllowedException e) {
                dxth.i("%s: Failed to startForeground for Key %s with exception %s", "MDD Foreground Download Service", stringExtra, e);
                this.a.b(stringExtra);
            }
        } else {
            startForeground(1, dxbr.a(this).a());
        }
        return 2;
    }

    public final void onTimeout(int i, int i2) {
        dxth.o("%s: onTimeout: %s", "MDD Foreground Download Service", Integer.valueOf(i2));
        super.onTimeout(i, i2);
        stopForeground(true);
        stopSelf(i);
    }
}
