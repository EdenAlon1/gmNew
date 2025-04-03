package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.analytics.recurringmetrics.AnalyticsAlarmReceiver;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class alla extends cnhy {
    private volatile boolean a = false;
    private final Object b = new Object();

    @Override // defpackage.cnje, defpackage.cnjf
    public final void d(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((alky) fbad.a(context)).gF((AnalyticsAlarmReceiver) this);
                this.a = true;
            }
        }
    }

    @Override // defpackage.cnje, defpackage.cniz, defpackage.cnjf, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        d(context);
        super.onReceive(context, intent);
    }
}
