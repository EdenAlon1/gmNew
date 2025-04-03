package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eumq extends BroadcastReceiver {
    public static final AtomicReference a = new AtomicReference();
    private final Context b;

    public eumq(Context context) {
        this.b = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (eumr.a) {
            Iterator it = eumr.b.values().iterator();
            while (it.hasNext()) {
                ((eumr) it.next()).j();
            }
        }
        this.b.unregisterReceiver(this);
    }
}
