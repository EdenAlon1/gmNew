package com.google.android.libraries.compose.photos.api.callback;

import android.content.Intent;
import android.os.IBinder;
import defpackage.drue;
import defpackage.drug;
import defpackage.edfg;
import defpackage.emyl;
import defpackage.enpx;
import defpackage.evcv;
import defpackage.evcw;
import defpackage.feef;
import defpackage.feen;
import defpackage.feeo;
import defpackage.feez;
import defpackage.ffkj;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class PhotosApiCallbackService extends drue {
    public drug a;
    private emyl b;

    @Override // defpackage.lkx, android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        super.onBind(intent);
        emyl emylVar = this.b;
        if (emylVar == null) {
            ffkj.c("binder");
            emylVar = null;
        }
        IBinder iBinder = ((evcw) emylVar).get();
        iBinder.getClass();
        return iBinder;
    }

    @Override // defpackage.drue, defpackage.lkx, android.app.Service
    public final void onCreate() {
        super.onCreate();
        feeo feeoVar = new feeo();
        feen feenVar = new feen(feef.b(this), feeoVar);
        HashMap hashMap = new HashMap();
        feez.b(edfg.b().a, evcv.c(getApplicationContext(), new enpx("com.google.android.apps.photos")), hashMap);
        feenVar.e(feez.a(hashMap));
        drug drugVar = this.a;
        if (drugVar == null) {
            ffkj.c("callback");
            drugVar = null;
        }
        feenVar.c(drugVar);
        this.b = new evcw(feenVar.d(), feeoVar, this);
    }
}
