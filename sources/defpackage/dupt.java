package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dupt {
    public static Object a(ListenableFuture listenableFuture, Object obj) {
        try {
            return erqt.q(listenableFuture);
        } catch (IllegalStateException | ExecutionException unused) {
            return obj;
        }
    }
}
