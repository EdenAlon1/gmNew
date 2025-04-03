package defpackage;

import androidx.work.WorkerParameters;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejpg implements ejny {
    public final ffbr a;
    private final ejol b;

    public ejpg(ffbr ffbrVar, ejol ejolVar) {
        this.a = ffbrVar;
        this.b = ejolVar;
    }

    @Override // defpackage.ejok
    public final ListenableFuture a(WorkerParameters workerParameters) {
        return ((ejny) this.a.b()).a(workerParameters);
    }

    @Override // defpackage.ejny, defpackage.ejok
    public final ListenableFuture b(final WorkerParameters workerParameters) {
        final ekzz f = eleg.f("NoAccountWorkerFactory startWork()");
        try {
            ListenableFuture b = this.b.b(new erog() { // from class: ejpf
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    ListenableFuture b2 = ((ejny) ejpg.this.a.b()).b(workerParameters);
                    f.b(b2);
                    return b2;
                }
            });
            f.close();
            return b;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
