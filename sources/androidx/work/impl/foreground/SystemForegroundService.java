package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import defpackage.lkx;
import defpackage.ppt;
import defpackage.pwu;
import defpackage.pwv;
import defpackage.pww;
import defpackage.pwx;
import defpackage.pzu;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemForegroundService extends lkx implements pwv {
    public static final String a = ppt.d("SystemFgService");
    pww b;
    NotificationManager c;
    private boolean d;

    private final void e() {
        this.c = (NotificationManager) getApplicationContext().getSystemService("notification");
        pww pwwVar = new pww(getApplicationContext());
        this.b = pwwVar;
        if (pwwVar.i == null) {
            pwwVar.i = this;
        } else {
            ppt.c();
            Log.e(pww.a, "A callback already exists.");
        }
    }

    @Override // defpackage.pwv
    public final void a(int i) {
        this.c.cancel(i);
    }

    @Override // defpackage.pwv
    public final void b(int i, Notification notification) {
        this.c.notify(i, notification);
    }

    @Override // defpackage.pwv
    public final void c(int i, int i2, Notification notification) {
        if (Build.VERSION.SDK_INT >= 31) {
            pwx.a(this, i, notification, i2);
        } else if (Build.VERSION.SDK_INT >= 29) {
            startForeground(i, notification, i2);
        } else {
            startForeground(i, notification);
        }
    }

    @Override // defpackage.pwv
    public final void d() {
        this.d = true;
        ppt.c().a(a, "Shutting down.");
        stopForeground(true);
        stopSelf();
    }

    @Override // defpackage.lkx, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e();
    }

    @Override // defpackage.lkx, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            ppt.c();
            Log.i(a, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.b.c();
            e();
            this.d = false;
        }
        if (intent == null) {
            return 3;
        }
        pww pwwVar = this.b;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            ppt.c();
            String str = pww.a;
            Objects.toString(intent);
            Log.i(str, "Started foreground service ".concat(intent.toString()));
            pwwVar.j.a(new pwu(pwwVar, intent.getStringExtra("KEY_WORKSPEC_ID")));
            pwwVar.b(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            pwwVar.b(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            ppt.c();
            Log.i(pww.a, "Stopping foreground service");
            pwv pwvVar = pwwVar.i;
            if (pwvVar == null) {
                return 3;
            }
            pwvVar.d();
            return 3;
        }
        ppt.c();
        String str2 = pww.a;
        Objects.toString(intent);
        Log.i(str2, "Stopping foreground work for ".concat(intent.toString()));
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        pzu.a(UUID.fromString(stringExtra), pwwVar.b);
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.b.d(2048);
    }

    public final void onTimeout(int i, int i2) {
        this.b.d(i2);
    }
}
