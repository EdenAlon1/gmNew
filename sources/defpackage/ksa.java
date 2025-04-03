package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ksa implements Runnable {
    private final Callable a;
    private final ksp b;
    private final Handler c;

    public ksa(Handler handler, Callable callable, ksp kspVar) {
        this.a = callable;
        this.b = kspVar;
        this.c = handler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        krp krpVar;
        try {
            krpVar = ((krn) this.a).call();
        } catch (Exception unused) {
            krpVar = null;
        }
        this.c.post(new krz(this.b, krpVar));
    }
}
