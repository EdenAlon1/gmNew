package com.google.android.libraries.appdoctor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.libraries.appdoctor.AppDoctorReceiver;
import com.google.common.util.concurrent.ListenableFuture;
import defpackage.dexc;
import defpackage.dllf;
import defpackage.dllg;
import defpackage.dlli;
import defpackage.dlln;
import defpackage.erqt;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class AppDoctorReceiver extends BroadcastReceiver {
    public static /* synthetic */ void a(ListenableFuture listenableFuture, BroadcastReceiver.PendingResult pendingResult) {
        try {
            try {
                listenableFuture.get(8L, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                Log.w("AppDoctorReceiver", "Failed to complete fix in time for broadcast.");
            }
        } finally {
            Log.i("AppDoctorReceiver", "App doctor is complete.");
            pendingResult.setResultCode(-1);
            pendingResult.finish();
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final Context context, Intent intent) {
        if (!"com.google.android.libraries.appdoctor.ACTION_TELE_DOCTOR_FIX".equals(intent.getAction())) {
            Log.e("AppDoctorReceiver", "Wrong action.");
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("com.google.android.libraries.appdoctor.EXTRA_TELE_FIX")) {
            Log.w("AppDoctorReceiver", "No fix found in broadcast.");
            return;
        }
        final dllg a = new dllf().a();
        final dexc dexcVar = dexc.TELEDOCTOR;
        final ListenableFuture i = !dlli.a(context) ? erqt.i(false) : dlln.a(new Callable() { // from class: dlle
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(dllg.this.g(context, dexcVar));
            }
        });
        setResultCode(-1);
        if (i.isDone()) {
            Log.i("AppDoctorReceiver", "Fix has already been completed.");
        } else {
            final BroadcastReceiver.PendingResult goAsync = goAsync();
            dlln.a(new Callable() { // from class: dllk
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    AppDoctorReceiver.a(ListenableFuture.this, goAsync);
                    return null;
                }
            });
        }
    }
}
