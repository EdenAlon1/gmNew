package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lfd implements leu {
    public final Context a;
    public final krj b;
    public final Object c = new Object();
    lev d;
    private Handler e;
    private HandlerThread f;

    public lfd(Context context, krj krjVar) {
        ksw.i(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = krjVar;
    }

    @Override // defpackage.leu
    public final void a(lev levVar) {
        synchronized (this.c) {
            if (this.e == null) {
                HandlerThread handlerThread = new HandlerThread("emojiCompat", 10);
                this.f = handlerThread;
                handlerThread.start();
                this.e = new Handler(this.f.getLooper());
            }
            this.e.post(new lfc(this, levVar));
        }
    }

    public final void b() {
        this.d = null;
        synchronized (this.c) {
            this.e.removeCallbacks(null);
            HandlerThread handlerThread = this.f;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            this.e = null;
            this.f = null;
        }
    }
}
