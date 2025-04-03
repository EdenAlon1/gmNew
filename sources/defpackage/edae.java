package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edae {
    static void a(final ListenableFuture listenableFuture) {
        listenableFuture.b(new Runnable() { // from class: edac
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    erqt.q(ListenableFuture.this);
                } catch (ExecutionException e) {
                    efbd.e(new Runnable() { // from class: edad
                        @Override // java.lang.Runnable
                        public final void run() {
                            throw new RuntimeException(e.getCause());
                        }
                    });
                }
            }
        }, erpp.a);
    }
}
