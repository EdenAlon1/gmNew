package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edxc {
    private static final enru a = enru.c("com/google/android/libraries/privatetelemetry/mobalt/nontiktok/AndroidFutures");

    static /* synthetic */ void a(ListenableFuture listenableFuture, Object[] objArr) {
        try {
            erqt.q(listenableFuture);
        } catch (CancellationException unused) {
        } catch (ExecutionException e) {
            ((enrr) ((enrr) ((enrr) a.i()).g(e.getCause())).h("com/google/android/libraries/privatetelemetry/mobalt/nontiktok/AndroidFutures", "logOnFailure", 27, "AndroidFutures.java")).Q("Mobalt: one or more reports failed to be logged to", objArr);
        }
    }
}
