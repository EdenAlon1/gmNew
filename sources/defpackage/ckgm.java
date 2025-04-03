package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckgm extends ckfc {
    public csjk a;
    public elbx b;

    @Override // defpackage.cniz
    public final ekzm a() {
        return this.b.b("ShutdownReceiver Receive broadcast");
    }

    @Override // defpackage.cniz
    public final String b() {
        return null;
    }

    @Override // defpackage.cniz
    public final void c(Context context, Intent intent) {
        if ("android.intent.action.ACTION_SHUTDOWN".equals(intent.getAction())) {
            csjy.i("Bugle", "Device is shutting down. RCS availability will not be updated until after reboot.");
            ((ckge) this.a.a()).m();
        }
    }
}
