package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qbc {
    public final qak a;
    public final ffsd b;
    final Handler c = new Handler(Looper.getMainLooper());
    public final Executor d = new qbb(this);

    public qbc(Executor executor) {
        qak qakVar = new qak(executor);
        this.a = qakVar;
        this.b = fftu.b(qakVar);
    }

    public final /* synthetic */ void a(Runnable runnable) {
        this.a.execute(runnable);
    }
}
