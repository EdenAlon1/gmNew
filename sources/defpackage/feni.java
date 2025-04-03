package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feni implements Runnable {
    final /* synthetic */ feon a;

    public feni(feon feonVar) {
        this.a = feonVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.a.o(Status.p.withDescription("Keepalive failed. The connection is likely gone"));
    }
}
