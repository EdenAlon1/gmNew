package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fbbz {
    private static final emwl a = new fbbv();
    private static final eroh b = new fbbw();

    static {
        erqt.i(enoz.a);
    }

    public static ListenableFuture a(ListenableFuture listenableFuture) {
        return ernq.g(erny.f(listenableFuture, a, erpp.a), Throwable.class, b, erpp.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static fbbm b(fbbm fbbmVar, fbbu fbbuVar) {
        if (fbbmVar instanceof fbbt) {
            return fbbmVar.g(fbbuVar);
        }
        Objects.toString(fbbmVar);
        throw new IllegalArgumentException("entryPointViewOf called with non-CancellableProducer: ".concat(String.valueOf(fbbmVar)));
    }

    public static fbbm c(fbbm fbbmVar) {
        if (fbbmVar instanceof fbbt) {
            return ((fbbt) fbbmVar).f();
        }
        Objects.toString(fbbmVar);
        throw new IllegalArgumentException("nonCancellationPropagatingViewOf called with non-CancellableProducer: ".concat(String.valueOf(fbbmVar)));
    }

    public static fbbm d(fbbf fbbfVar) {
        fbbfVar.getClass();
        return new fbbx(fbbfVar);
    }

    public static void e(fbbm fbbmVar, boolean z) {
        if (fbbmVar instanceof fbbt) {
            ((fbbt) fbbmVar).h(z);
        } else {
            Objects.toString(fbbmVar);
            throw new IllegalArgumentException("cancel called with non-CancellableProducer: ".concat(String.valueOf(fbbmVar)));
        }
    }
}
