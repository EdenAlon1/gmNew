package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duvs {
    public static volatile duvs a;
    public final Executor b;

    private duvs(Executor executor) {
        this.b = executor == null ? dunl.a().d : executor;
    }

    public static void a(Executor executor) {
        if (a == null) {
            synchronized (duvs.class) {
                if (a == null) {
                    a = new duvs(executor);
                }
            }
        }
    }
}
