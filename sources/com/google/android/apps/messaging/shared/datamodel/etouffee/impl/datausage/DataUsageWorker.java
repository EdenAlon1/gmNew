package com.google.android.apps.messaging.shared.datamodel.etouffee.impl.datausage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.elfo;
import defpackage.ppn;
import defpackage.ppr;
import defpackage.pqr;

/* compiled from: PG */
@Deprecated
/* loaded from: classes7.dex */
public final class DataUsageWorker extends ppr {
    private final Context e;

    public DataUsageWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.e = context;
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        pqr.a(this.e).a("data_usage_recurring_worker");
        return elfo.e(new ppn());
    }
}
