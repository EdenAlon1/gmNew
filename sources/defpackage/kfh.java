package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes.dex */
public final class kfh implements Executor {
    public static final kfh a;
    private static final /* synthetic */ kfh[] b;

    static {
        kfh kfhVar = new kfh();
        a = kfhVar;
        b = new kfh[]{kfhVar};
    }

    private kfh() {
    }

    public static kfh[] values() {
        return (kfh[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
