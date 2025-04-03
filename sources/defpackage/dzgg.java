package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes4.dex */
public interface dzgg {
    ListenableFuture a(fcfo fcfoVar);

    ListenableFuture b(ListenableFuture listenableFuture, Object obj);

    Object c(Object obj);

    void d(UUID uuid, int i, Status status, dyyt dyytVar, long j);

    void e(UUID uuid, Object obj, dyyt dyytVar, long j);
}
