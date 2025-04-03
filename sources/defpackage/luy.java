package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class luy implements ltn {
    protected luy() {
    }

    @Override // defpackage.ltn
    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    @Override // defpackage.ltn
    public final lua b(Looper looper, Handler.Callback callback) {
        return new lva(new Handler(looper, callback));
    }
}
