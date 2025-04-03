package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dyoi extends BroadcastReceiver {
    final /* synthetic */ dyol a;

    public dyoi(dyol dyolVar) {
        this.a = dyolVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean a = dyjr.a(this.a.a);
        if (a) {
            this.a.s();
        }
        dyol dyolVar = this.a;
        int i = true != a ? 3 : 2;
        dypi dypiVar = dyolVar.j;
        if (dypiVar.d == i) {
            return;
        }
        dypiVar.d = i;
        dypiVar.a();
    }
}
