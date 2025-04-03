package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dycd extends erqg {
    private dycd(ListenableFuture listenableFuture) {
        super(listenableFuture);
    }

    public static dycd e(ListenableFuture listenableFuture) {
        return listenableFuture instanceof dycd ? (dycd) listenableFuture : new dycd(listenableFuture);
    }

    public final dycd c(Class cls, emwl emwlVar, Executor executor) {
        return new dycd(elfr.e(this.b, cls, emwlVar, executor));
    }

    public final dycd d(Class cls, eroh erohVar, Executor executor) {
        return new dycd(elfr.f(this.b, cls, erohVar, executor));
    }

    public final dycd f(emwl emwlVar, Executor executor) {
        return new dycd(elfr.j(this.b, emwlVar, executor));
    }

    public final dycd g(eroh erohVar, Executor executor) {
        return new dycd(elfr.k(this.b, erohVar, executor));
    }
}
