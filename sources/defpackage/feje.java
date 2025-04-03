package defpackage;

import java.net.SocketAddress;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feje implements fejx {
    public final Executor a;
    private final fejx b;

    public feje(fejx fejxVar, Executor executor) {
        this.b = fejxVar;
        executor.getClass();
        this.a = executor;
    }

    @Override // defpackage.fejx
    public final fekh a(SocketAddress socketAddress, fejw fejwVar, fdxm fdxmVar) {
        return new fejd(this, this.b.a(socketAddress, fejwVar, fdxmVar), fejwVar.a);
    }

    @Override // defpackage.fejx
    public final Collection b() {
        return this.b.b();
    }

    @Override // defpackage.fejx
    public final ScheduledExecutorService c() {
        return this.b.c();
    }

    @Override // defpackage.fejx, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }
}
