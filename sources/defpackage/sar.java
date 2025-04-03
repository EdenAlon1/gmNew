package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sar extends sal {
    public Context a;
    public ExecutorService b;
    public Executor c;
    public boolean d;
    public byte e;

    @Override // defpackage.sal
    public final void a() {
        this.d = true;
        this.e = (byte) 1;
    }

    @Override // defpackage.sal
    public final void b(Executor executor) {
        if (executor == null) {
            throw new NullPointerException("Null callbackExecutor");
        }
        this.c = executor;
    }
}
