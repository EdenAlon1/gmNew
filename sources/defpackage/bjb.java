package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bjb implements Executor {
    private static volatile bjb a;

    public static Executor a() {
        if (a == null) {
            synchronized (bjb.class) {
                if (a == null) {
                    a = new bjb();
                }
            }
        }
        return a;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
