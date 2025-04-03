package com.google.frameworks.client.data.android.server.tiktok;

import android.content.Intent;
import android.os.IBinder;
import defpackage.evgy;
import defpackage.evhh;
import defpackage.feeq;
import defpackage.feez;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class MainProcessEndpointService extends evhh {
    public evgy a;
    public feeq b;

    @Override // defpackage.lkx, android.app.Service
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        return this.a.a();
    }

    @Override // defpackage.evhh, defpackage.lkx, android.app.Service
    public final void onCreate() {
        super.onCreate();
        this.a.c(feez.a(new HashMap()), this.b);
    }
}
