package defpackage;

import android.os.HandlerThread;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mia {
    public final Object a = new Object();
    public Looper b = null;
    public HandlerThread c = null;
    public int d = 0;

    public final void a() {
        HandlerThread handlerThread;
        synchronized (this.a) {
            lti.c(this.d > 0);
            int i = this.d - 1;
            this.d = i;
            if (i == 0 && (handlerThread = this.c) != null) {
                handlerThread.quit();
                this.c = null;
                this.b = null;
            }
        }
    }
}
