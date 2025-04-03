package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public abstract class feeg extends feey {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.feey
    @Deprecated
    public final Status a(int i) {
        try {
            return (Status) b(i).get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return Status.c.d(e);
        } catch (CancellationException e2) {
            return Status.c.d(e2);
        } catch (ExecutionException e3) {
            return Status.c(e3);
        }
    }

    public abstract ListenableFuture b(int i);
}
