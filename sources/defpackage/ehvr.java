package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehvr extends BroadcastReceiver {
    final /* synthetic */ ehvs a;

    public ehvr(ehvs ehvsVar) {
        this.a = ehvsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.a.a(context, intent);
    }
}
