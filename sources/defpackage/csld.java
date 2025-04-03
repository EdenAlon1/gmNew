package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
@Deprecated
/* loaded from: classes8.dex */
public abstract class csld implements Runnable, cslb {
    public static final enru g = enru.c("com/google/android/apps/messaging/shared/util/common/SafeAsyncRunnable");
    public final String h;

    public csld(String str) {
        this.h = str;
    }

    public static void a(Context context, csld csldVar) {
        Executor a = csky.a();
        synchronized (f) {
            f.put(csldVar, Long.valueOf(System.currentTimeMillis()));
        }
        try {
            a.execute(new cslc(csldVar.h, csldVar, context));
        } catch (RejectedExecutionException e) {
            csky.b(csldVar, e);
            throw e;
        }
    }

    public final String toString() {
        return this.h;
    }
}
