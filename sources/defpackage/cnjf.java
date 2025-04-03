package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cnjf extends BroadcastReceiver {
    private volatile boolean Q = false;
    private final Object R = new Object();

    public void d(Context context) {
        if (this.Q) {
            return;
        }
        synchronized (this.R) {
            if (!this.Q) {
                ((cnja) fbad.a(context)).gI((cniz) this);
                this.Q = true;
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        throw null;
    }
}
