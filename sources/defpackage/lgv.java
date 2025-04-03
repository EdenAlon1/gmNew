package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lgv {
    public final Context a;
    public final krj b;
    public final Object c = new Object();
    public Executor d;
    public ThreadPoolExecutor e;
    lgk f;

    public lgv(Context context, krj krjVar) {
        ksw.i(context, "Context cannot be null");
        this.a = context.getApplicationContext();
        this.b = krjVar;
    }

    public final void a() {
        synchronized (this.c) {
            this.f = null;
            ThreadPoolExecutor threadPoolExecutor = this.e;
            if (threadPoolExecutor != null) {
                threadPoolExecutor.shutdown();
            }
            this.d = null;
            this.e = null;
        }
    }
}
