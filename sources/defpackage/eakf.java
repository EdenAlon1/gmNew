package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eakf {
    public static void a(ListenableFuture listenableFuture, emxs emxsVar, emxs emxsVar2) {
        b(listenableFuture, emxsVar, emxsVar2, erpp.a);
    }

    public static void b(ListenableFuture listenableFuture, emxs emxsVar, emxs emxsVar2, Executor executor) {
        erqt.r(listenableFuture, new eake(emxsVar, emxsVar2), executor);
    }
}
