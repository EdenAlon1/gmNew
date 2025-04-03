package com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.elfo;
import defpackage.ppp;
import defpackage.ppr;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class RequestRegisteredVerifiedSmsSendersWork extends ppr {
    public RequestRegisteredVerifiedSmsSendersWork(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // defpackage.ppr
    public final ListenableFuture b() {
        return elfo.e(new ppp());
    }
}
