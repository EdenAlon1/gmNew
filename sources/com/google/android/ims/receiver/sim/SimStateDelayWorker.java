package com.google.android.ims.receiver.sim;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.dipp;
import defpackage.dkpm;
import defpackage.dkpr;
import defpackage.dkty;
import defpackage.erqt;
import defpackage.ppn;
import defpackage.ppp;
import defpackage.ppq;
import defpackage.ppr;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class SimStateDelayWorker extends ppr {
    ppq e;
    private final Context f;
    private final dkpm g;

    public SimStateDelayWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.e = new ppn();
        this.f = context;
        this.g = ((dkpr) dipp.a(dkpr.class)).q();
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SIM_STATE_CHANGED");
        Context context = this.f;
        Intent intent = null;
        Intent registerReceiver = context != null ? context.registerReceiver(null, intentFilter) : null;
        if (registerReceiver == null) {
            dkty.k("No SIM state found", new Object[0]);
        } else {
            intent = registerReceiver;
        }
        this.g.a.m(this.f, intent);
        ppp pppVar = new ppp();
        this.e = pppVar;
        return erqt.i(pppVar);
    }
}
