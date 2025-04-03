package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dzda extends BroadcastReceiver {
    final /* synthetic */ dzdb a;

    public dzda(dzdb dzdbVar) {
        this.a = dzdbVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (dyjr.a(context)) {
            fdxk fdxkVar = this.a.c;
            if (fdxkVar instanceof feau) {
                ((feau) fdxkVar).e();
            }
        }
    }
}
