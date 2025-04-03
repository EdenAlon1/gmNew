package defpackage;

import android.content.Context;
import android.os.HandlerThread;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgcz {
    private static dgcl a;

    public static synchronized dgcl a(Context context) {
        dgcl dgclVar;
        synchronized (dgcz.class) {
            if (a == null) {
                HandlerThread handlerThread = new HandlerThread("DG");
                handlerThread.start();
                dgxx dgxxVar = new dgxx(handlerThread.getLooper());
                Context applicationContext = context.getApplicationContext();
                dgda dgdaVar = new dgda();
                dgcy dgcyVar = new dgcy(dgxxVar, new dgbe(applicationContext, dgxxVar.getLooper(), dgdaVar, dgdaVar), dgdaVar);
                dgxv dgxvVar = dgxw.a;
                a = new dgdj(dgcyVar, dgxv.d(1), new dgdc(context));
            }
            dgclVar = a;
        }
        return dgclVar;
    }
}
