package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwz {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new qwy());

    public final synchronized void a(qwv qwvVar, boolean z) {
        if (!this.a && !z) {
            this.a = true;
            qwvVar.e();
            this.a = false;
            return;
        }
        this.b.obtainMessage(1, qwvVar).sendToTarget();
    }
}
