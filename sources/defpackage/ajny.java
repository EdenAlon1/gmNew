package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.rcsprovisioning.singleregistration.SingleRegistrationCapabilityReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class ajny extends cniz {
    private volatile boolean a = false;
    private final Object b = new Object();

    @Override // defpackage.cnjf
    public final void d(Context context) {
        if (this.a) {
            return;
        }
        synchronized (this.b) {
            if (!this.a) {
                ((ajoe) fbad.a(context)).K((SingleRegistrationCapabilityReceiver) this);
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
