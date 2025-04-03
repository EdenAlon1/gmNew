package defpackage;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fehs implements fejx {
    private final ScheduledExecutorService a;
    private final Executor b;
    private final int c;
    private final feht d;
    private final fevw e;
    private final boolean f;

    public fehs(feht fehtVar, Executor executor, ScheduledExecutorService scheduledExecutorService, int i, fevw fevwVar) {
        boolean z = scheduledExecutorService == null;
        this.f = z;
        this.a = z ? (ScheduledExecutorService) fevm.a(fend.p) : scheduledExecutorService;
        this.c = i;
        this.d = fehtVar;
        executor.getClass();
        this.b = executor;
        this.e = fevwVar;
    }

    @Override // defpackage.fejx
    public final fekh a(SocketAddress socketAddress, fejw fejwVar, fdxm fdxmVar) {
        String str = fejwVar.a;
        String str2 = fejwVar.c;
        fdxd fdxdVar = fejwVar.b;
        Executor executor = this.b;
        int i = this.c;
        return new feid(this.d, (InetSocketAddress) socketAddress, str, str2, fdxdVar, executor, i, this.e);
    }

    @Override // defpackage.fejx
    public final Collection b() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // defpackage.fejx
    public final ScheduledExecutorService c() {
        return this.a;
    }

    @Override // defpackage.fejx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            fevm.d(fend.p, this.a);
        }
    }
}
