package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class poy implements Executor {
    public static final poy a;
    private static final /* synthetic */ poy[] b;

    static {
        poy poyVar = new poy();
        a = poyVar;
        b = new poy[]{poyVar};
    }

    private poy() {
    }

    public static poy[] values() {
        return (poy[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
