package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class erqg<V> extends erqh<V> {
    public final ListenableFuture b;

    protected erqg(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        this.b = listenableFuture;
    }

    @Override // defpackage.erqf, defpackage.enfm
    protected final /* synthetic */ Object hC() {
        return this.b;
    }

    @Override // defpackage.erqh
    protected final ListenableFuture hh() {
        return this.b;
    }

    @Override // defpackage.erqh, defpackage.erqf
    protected final /* synthetic */ Future hi() {
        return this.b;
    }
}
