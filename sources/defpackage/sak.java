package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface sak extends AutoCloseable {
    ListenableFuture a(int i);

    ListenableFuture b(int i, int i2);

    ListenableFuture c(saq saqVar);

    @Override // java.lang.AutoCloseable
    void close();

    ListenableFuture d();

    errl e();

    Executor f();

    ListenableFuture g(saq saqVar, emdl emdlVar);
}
