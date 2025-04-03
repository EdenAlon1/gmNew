package defpackage;

import android.os.Handler;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kry implements Executor {
    private final Handler a;

    public kry(Handler handler) {
        ksw.h(handler);
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ksw.h(runnable);
        if (this.a.post(runnable)) {
            return;
        }
        Handler handler = this.a;
        Objects.toString(handler);
        throw new RejectedExecutionException(handler.toString().concat(" is shutting down"));
    }
}
