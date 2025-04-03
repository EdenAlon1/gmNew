package defpackage;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtpk implements ThreadFactory {
    private final ThreadFactory a;

    public dtpk(ThreadFactory threadFactory) {
        this.a = threadFactory;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(final Runnable runnable) {
        return this.a.newThread(new Runnable() { // from class: dtpj
            @Override // java.lang.Runnable
            public final void run() {
                Process.myTid();
                runnable.run();
            }
        });
    }
}
