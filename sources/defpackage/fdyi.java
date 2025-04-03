package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes6.dex */
final class fdyi implements Executor {
    public static final fdyi a;
    private static final /* synthetic */ fdyi[] b;

    static {
        fdyi fdyiVar = new fdyi();
        a = fdyiVar;
        b = new fdyi[]{fdyiVar};
    }

    private fdyi() {
    }

    public static fdyi[] values() {
        return (fdyi[]) b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Context.DirectExecutor";
    }
}
