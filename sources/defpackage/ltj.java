package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ltj {
    private static Executor a;

    public static synchronized Executor a() {
        Executor executor;
        synchronized (ltj.class) {
            if (a == null) {
                a = lvf.Q("ExoPlayer:BackgroundExecutor");
            }
            executor = a;
        }
        return executor;
    }
}
