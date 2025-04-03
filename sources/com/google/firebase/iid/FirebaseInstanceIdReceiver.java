package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.CloudMessage;
import defpackage.dfnt;
import defpackage.dhrt;
import defpackage.euwe;
import defpackage.euwj;
import defpackage.euxa;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class FirebaseInstanceIdReceiver extends dfnt {
    @Override // defpackage.dfnt
    protected final int a(Context context, CloudMessage cloudMessage) {
        try {
            return ((Integer) dhrt.f(euwj.b(cloudMessage.a, context, new euwe()))).intValue();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e);
            return 500;
        }
    }

    @Override // defpackage.dfnt
    protected final void b(Bundle bundle) {
        Intent putExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (euxa.f(putExtras)) {
            euxa.d("_nd", putExtras.getExtras());
        }
    }
}
