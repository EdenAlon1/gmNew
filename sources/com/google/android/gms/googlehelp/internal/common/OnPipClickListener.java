package com.google.android.gms.googlehelp.internal.common;

import android.app.Activity;
import android.util.Log;
import defpackage.dfra;
import defpackage.dfre;
import defpackage.dfwu;
import defpackage.dfwv;
import defpackage.dgno;
import defpackage.dgoj;
import defpackage.dgop;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class OnPipClickListener extends SimpleGoogleHelpCallbacks {
    private final WeakReference a;
    boolean isToggling;

    OnPipClickListener(Activity activity, boolean z) {
        this.a = new WeakReference(activity);
        this.isToggling = z;
    }

    public dgno createGoogleHelpLauncher(Activity activity) {
        return new dgno(activity);
    }

    @Override // com.google.android.gms.googlehelp.internal.common.SimpleGoogleHelpCallbacks, com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks
    public void onPipClick() {
        if (this.isToggling) {
            Log.d("gH_OnPipClickListener", "Double click gets discarded.");
            return;
        }
        Activity activity = (Activity) this.a.get();
        if (activity == null) {
            Log.d("gH_OnPipClickListener", "Calling activity is null. Pip click discarded.");
            return;
        }
        this.isToggling = true;
        Object obj = createGoogleHelpLauncher(activity).b.get();
        dgop dgopVar = (dgop) obj;
        dfwv.n(dgopVar.a);
        dfre dfreVar = ((dfra) obj).k;
        dgoj dgojVar = new dgoj(dfreVar, new WeakReference(dgopVar.a));
        dfreVar.b(dgojVar);
        dfwu.b(dgojVar);
    }

    public OnPipClickListener(WeakReference<Activity> weakReference) {
        this.a = weakReference;
    }
}
