package com.google.android.ims.messaging;

import android.content.Intent;
import android.os.IBinder;
import defpackage.djci;
import defpackage.emyl;
import defpackage.enip;
import defpackage.evcv;
import defpackage.evcw;
import defpackage.fdxe;
import defpackage.feef;
import defpackage.feen;
import defpackage.feeo;
import defpackage.feez;
import defpackage.ffbr;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MessagingEngineEndpointService extends djci {
    public ffbr a;
    private emyl b;

    @Override // defpackage.lkx, android.app.Service
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        return ((evcw) this.b).get();
    }

    @Override // defpackage.djci, defpackage.lkx, android.app.Service
    public final void onCreate() {
        super.onCreate();
        feef b = feef.b(getApplicationContext());
        feeo feeoVar = new feeo();
        feen feenVar = new feen(b, feeoVar);
        feenVar.c((fdxe) this.a.b());
        HashMap hashMap = new HashMap();
        feez.b("bugle.smapi.rcs.MessagingEngineNotificationService", evcv.c(getApplicationContext(), enip.r("com.google.android.ims", "com.google.android.apps.messaging")), hashMap);
        feenVar.e(feez.a(hashMap));
        this.b = new evcw(feenVar.d(), feeoVar, this);
    }
}
