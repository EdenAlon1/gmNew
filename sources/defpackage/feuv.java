package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class feuv implements Runnable {
    final /* synthetic */ feux a;

    public feuv(feux feuxVar) {
        this.a = feuxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.a.g(Status.c.withDescription("Handshake timeout exceeded"));
    }
}
