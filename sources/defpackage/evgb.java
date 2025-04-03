package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evgb {
    public static final evgb a = new evgb(1, null, null, null);
    public final evfx b;
    public final fdxj c;
    public final int d;
    private final ListenableFuture e;

    public evgb(int i, evfx evfxVar, ListenableFuture listenableFuture, fdxj fdxjVar) {
        this.d = i;
        this.b = evfxVar;
        this.e = listenableFuture;
        this.c = fdxjVar;
    }

    public static evgb b(Status status, febo feboVar) {
        status.getClass();
        emxf.m(!status.f(), "Error status must not be ok");
        return new evgb(2, new evfx(status, feboVar), null, null);
    }

    public static evgb c(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        return new evgb(4, null, listenableFuture, null);
    }

    public final ListenableFuture a() {
        emxf.l(this.d == 4);
        return this.e;
    }
}
