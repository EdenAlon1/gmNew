package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dgxx extends Handler {
    public dgxx() {
        Looper.getMainLooper();
    }

    protected void b(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        b(message);
    }

    public dgxx(Looper looper) {
        super(looper);
        Looper.getMainLooper();
    }

    public dgxx(Looper looper, Handler.Callback callback) {
        super(looper, callback);
        Looper.getMainLooper();
    }
}
