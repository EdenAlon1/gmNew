package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elmc {
    public static ListenableFuture a(ListenableFuture listenableFuture, emwl emwlVar, Executor executor) {
        SettableFuture create = SettableFuture.create();
        erqt.r(listenableFuture, new ellx(new elly(create), new ellz(emwlVar, create)), new elmb(executor, create));
        return create;
    }
}
