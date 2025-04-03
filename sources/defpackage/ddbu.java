package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.ui.reminder.ReminderReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ddbu extends cniz {
    private volatile boolean a = false;
    private final Object b = new Object();

    @Override // defpackage.cnjf
    public final void d(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((ddkd) fbad.a(context)).hk((ReminderReceiver) this);
                this.a = true;
            }
        }
    }

    @Override // defpackage.cniz, defpackage.cnjf, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        d(context);
        super.onReceive(context, intent);
    }
}
