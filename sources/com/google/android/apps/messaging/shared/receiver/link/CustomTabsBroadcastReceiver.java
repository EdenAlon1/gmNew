package com.google.android.apps.messaging.shared.receiver.link;

import android.content.BroadcastReceiver;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import defpackage.emxe;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class CustomTabsBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String dataString = intent.getDataString();
        if (emxe.c(dataString)) {
            return;
        }
        ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(null, dataString));
    }
}
