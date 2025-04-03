package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mlz extends BroadcastReceiver {
    final /* synthetic */ mma a;

    public mlz(mma mmaVar) {
        this.a = mmaVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        mma mmaVar = this.a;
        mmaVar.a(mlw.c(context, intent, mmaVar.h, mmaVar.g));
    }
}
