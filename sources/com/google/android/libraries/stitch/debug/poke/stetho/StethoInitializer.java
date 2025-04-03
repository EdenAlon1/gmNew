package com.google.android.libraries.stitch.debug.poke.stetho;

import android.app.Application;
import android.content.Context;
import defpackage.eewu;
import defpackage.eewv;
import defpackage.eeww;
import defpackage.eexg;
import defpackage.eexh;
import defpackage.roc;
import defpackage.rod;
import defpackage.rof;
import defpackage.roi;
import defpackage.roj;
import defpackage.rpb;
import defpackage.rpe;
import defpackage.rpg;
import defpackage.rpj;
import defpackage.rpp;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class StethoInitializer implements eewv {
    @Override // defpackage.eewv
    public final void a(Context context) {
        eexh eexhVar = eeww.a;
        if (eewu.b) {
            rof rofVar = new rof(context);
            rofVar.b = new eexg(context);
            roc rocVar = new roc(rofVar);
            Context context2 = rocVar.b;
            rpe rpeVar = rpe.a;
            Application application = (Application) context2.getApplicationContext();
            if (rpeVar.d == null) {
                rpb rpbVar = new rpb(application, rpeVar);
                rpbVar.a.registerActivityLifecycleCallbacks(rpbVar.c);
                rpeVar.d = rpbVar;
            } else {
                roi.d("Automatic activity tracking not available on this API level, caller must invoke ActivityTracker methods manually!");
            }
            rpj rpjVar = new rpj("stetho_" + roj.a() + "_devtools_remote", new rpg(new rod(rocVar)));
            new rpp("StethoListener-".concat(rpjVar.a), rpjVar).start();
        }
    }
}
