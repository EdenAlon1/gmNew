package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.workers.DiagnosticsWorker;
import defpackage.ppt;
import defpackage.ppv;
import defpackage.ppw;
import defpackage.pqr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    private static final String a = ppt.d("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        ppt.c().a(a, "Requesting diagnostics");
        try {
            pqr.a(context).d((ppw) new ppv(DiagnosticsWorker.class).b());
        } catch (IllegalStateException e) {
            ppt.c();
            Log.e(a, "WorkManager is not initialized", e);
        }
    }
}
