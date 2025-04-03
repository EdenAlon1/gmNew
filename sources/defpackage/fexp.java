package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fexp implements fevl {
    @Override // defpackage.fevl
    public final /* bridge */ /* synthetic */ Object a() {
        return Executors.newCachedThreadPool(fend.k("grpc-okhttp-%d"));
    }

    @Override // defpackage.fevl
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((ExecutorService) obj).shutdown();
    }
}
