package defpackage;

import android.os.Handler;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qod {
    private final Executor a;

    public qod(Handler handler) {
        this.a = new qob(handler);
    }

    public final void a(qol qolVar, qou qouVar) {
        qolVar.d("post-error");
        this.a.execute(new qoc(qolVar, new qor(qouVar), null));
    }

    public final void b(qol qolVar, qor qorVar) {
        c(qolVar, qorVar, null);
    }

    public final void c(qol qolVar, qor qorVar, Runnable runnable) {
        qolVar.h();
        qolVar.d("post-response");
        this.a.execute(new qoc(qolVar, qorVar, runnable));
    }
}
