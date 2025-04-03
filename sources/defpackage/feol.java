package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feol implements Runnable {
    final /* synthetic */ feop a;

    public feol(feop feopVar) {
        this.a = feopVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        synchronized (this.a) {
            feop feopVar = this.a;
            if (feopVar.k != 6) {
                feopVar.k = 6;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            feop feopVar2 = this.a;
            feopVar2.l.a.o(Status.p.withDescription("Keepalive failed. The connection is likely gone"));
        }
    }
}
