package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.shared.alarm.BugleAlarmReceiver;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class akvv extends cnhy {
    private volatile boolean a = false;
    private final Object b = new Object();

    @Override // defpackage.cnje, defpackage.cnjf
    public final void d(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((akvm) fbad.a(context)).gH((BugleAlarmReceiver) this);
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
