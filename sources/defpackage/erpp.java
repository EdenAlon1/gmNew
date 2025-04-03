package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class erpp implements Executor {
    public static final erpp a;
    private static final /* synthetic */ erpp[] b;

    static {
        erpp erppVar = new erpp();
        a = erppVar;
        b = new erpp[]{erppVar};
    }

    private erpp() {
    }

    public static erpp[] values() {
        return (erpp[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "MoreExecutors.directExecutor()";
    }
}
