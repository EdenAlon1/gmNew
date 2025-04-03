package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import defpackage.lkx;
import defpackage.ppt;
import defpackage.pus;
import defpackage.puu;
import defpackage.qar;
import defpackage.qas;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemAlarmService extends lkx implements pus {
    private static final String a = ppt.d("SystemAlarmService");
    private puu b;
    private boolean c;

    private final void b() {
        puu puuVar = new puu(this);
        this.b = puuVar;
        if (puuVar.i == null) {
            puuVar.i = this;
        } else {
            ppt.c();
            Log.e(puu.a, "A completion listener for SystemAlarmDispatcher already exists.");
        }
    }

    @Override // defpackage.pus
    public final void a() {
        this.c = true;
        ppt.c().a(a, "All commands completed in dispatcher");
        String str = qar.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (qas.a) {
            linkedHashMap.putAll(qas.b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                ppt.c();
                Log.w(qar.a, "WakeLock held for ".concat(String.valueOf(str2)));
            }
        }
        stopSelf();
    }

    @Override // defpackage.lkx, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b();
        this.c = false;
    }

    @Override // defpackage.lkx, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c = true;
        this.b.b();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            ppt.c();
            Log.i(a, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.b.b();
            b();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.b.d(intent, i2);
        return 3;
    }
}
