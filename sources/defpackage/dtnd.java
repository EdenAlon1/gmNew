package defpackage;

import android.os.Looper;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class dtnd implements ThreadFactory {
    public final /* synthetic */ ThreadFactory a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.a.newThread(runnable);
        if (newThread.getContextClassLoader() == null) {
            newThread.setContextClassLoader(Looper.getMainLooper().getThread().getContextClassLoader());
        }
        return newThread;
    }
}
