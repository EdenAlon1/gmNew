package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class elpn {
    public static void a(ListenableFuture listenableFuture, elpf elpfVar, Executor executor) {
        listenableFuture.b(new elpm(listenableFuture, elpfVar), executor);
    }
}
