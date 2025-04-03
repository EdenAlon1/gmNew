package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import defpackage.ppt;
import defpackage.pte;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    private static final String a = ppt.d("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ppt c = ppt.c();
        String str = a;
        Objects.toString(intent);
        c.a(str, "Received intent ".concat(String.valueOf(intent)));
        try {
            pte m = pte.m(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (pte.b) {
                BroadcastReceiver.PendingResult pendingResult = m.j;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                m.j = goAsync;
                if (m.i) {
                    m.j.finish();
                    m.j = null;
                }
            }
        } catch (IllegalStateException e) {
            ppt.c();
            Log.e(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
