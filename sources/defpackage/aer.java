package defpackage;

import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aer extends aeu {
    public static final Executor a = new aep();
    public static final Executor b = new aeq();
    private static volatile aer d;
    public final aeu c;
    private final aeu e;

    private aer() {
        aet aetVar = new aet();
        this.e = aetVar;
        this.c = aetVar;
    }

    public static aer a() {
        if (d == null) {
            synchronized (aer.class) {
                if (d == null) {
                    d = new aer();
                }
            }
        }
        return d;
    }

    @Override // defpackage.aeu
    public final void b(Runnable runnable) {
        aeu aeuVar = this.c;
        aet aetVar = (aet) aeuVar;
        if (aetVar.c == null) {
            synchronized (aetVar.a) {
                if (((aet) aeuVar).c == null) {
                    ((aet) aeuVar).c = aet.a(Looper.getMainLooper());
                }
            }
        }
        aetVar.c.post(runnable);
    }

    @Override // defpackage.aeu
    public final boolean c() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
