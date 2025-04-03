package com.google.android.apps.messaging.shared;

import android.content.Intent;
import defpackage.akuw;
import defpackage.bbfh;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class NoConfirmationSmsSendService extends akuw {
    public bbfh a;

    public NoConfirmationSmsSendService() {
        setIntentRedelivery(true);
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(Intent intent) {
        this.a.d(null, intent);
    }
}
