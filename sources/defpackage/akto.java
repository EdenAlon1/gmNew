package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.scheduledsend.scheduling.ScheduledSendAlarmReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class akto extends cnhy {
    private volatile boolean a = false;
    private final Object b = new Object();

    @Override // defpackage.cnje, defpackage.cnjf
    public final void d(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((aktp) fbad.a(context)).ho((ScheduledSendAlarmReceiver) this);
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
