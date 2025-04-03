package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.ui.debug.LoadReactionsReceiver;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dawc extends cniz {
    private volatile boolean a = false;
    private final Object b = new Object();

    @Override // defpackage.cnjf
    public final void d(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((daxa) fbad.a(context)).hb((LoadReactionsReceiver) this);
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
