package com.google.android.apps.messaging.diagnostics;

import android.content.Intent;
import android.os.IBinder;
import defpackage.acej;
import defpackage.aces;
import defpackage.cins;
import defpackage.cskc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DiagnosticsService extends aces {
    private static final cskc b = cskc.f("BugleDiagnostics", DiagnosticsService.class);
    public cins a;
    private boolean c = false;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new acej();
    }

    @Override // defpackage.aces, android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (this.c) {
            return;
        }
        this.a.s();
        b.q("Diagnostics service created");
        this.c = true;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.a.h();
        b.q("Diagnostics service destroyed");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
