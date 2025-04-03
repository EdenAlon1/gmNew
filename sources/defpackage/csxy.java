package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csxy extends BroadcastReceiver {
    final /* synthetic */ csxz a;

    public csxy(csxz csxzVar) {
        this.a = csxzVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || !action.equals("com.google.gservices.intent.action.GSERVICES_CHANGED")) {
            return;
        }
        final csxz csxzVar = this.a;
        axnw.h(csxzVar.e.submit(eldl.l(new Runnable() { // from class: csxv
            @Override // java.lang.Runnable
            public final void run() {
                csxz csxzVar2 = csxz.this;
                synchronized (csxzVar2.f) {
                    Iterator it = csxzVar2.f.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
            }
        })));
    }
}
