package defpackage;

import java.util.concurrent.Executor;
import org.chromium.net.InlineExecutionProhibitedException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fila implements Executor {
    private final Executor a;

    public fila(Executor executor) {
        this.a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        fikz fikzVar = new fikz(runnable, Thread.currentThread());
        this.a.execute(fikzVar);
        InlineExecutionProhibitedException inlineExecutionProhibitedException = fikzVar.b;
        if (inlineExecutionProhibitedException != null) {
            throw inlineExecutionProhibitedException;
        }
        fikzVar.a = null;
    }
}
