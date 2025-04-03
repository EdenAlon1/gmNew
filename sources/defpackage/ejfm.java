package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejfm {
    private final ffbr a;
    private final ejfo b;

    public ejfm(ffbr ffbrVar, ejfo ejfoVar) {
        this.a = ffbrVar;
        this.b = ejfoVar;
    }

    public final effy a(final ekqy ekqyVar, efbm efbmVar) {
        emxf.m(true, "LamsConfig in ProtoDataStoreConfig must be used together with @LamsSync annotation");
        emxf.m(true, "Custom IOExecutor should not be used with a BlockingSafeProtoDataStore config");
        ekqs ekqsVar = (ekqs) ekqyVar;
        Executor executor = ekqsVar.g;
        if (executor == null) {
            executor = (Executor) this.a.b();
        }
        Executor executor2 = executor;
        final ejfo ejfoVar = this.b;
        executor2.getClass();
        ListenableFuture m = erqt.m(eldl.m(new Callable() { // from class: ejfn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ekqs ekqsVar2 = (ekqs) ekqyVar;
                return ejfo.this.a.a(ekqsVar2.c, ekqsVar2.a.concat(".pb")).a();
            }
        }), executor2);
        effy a = efhr.a(ekqsVar.a, m, ekqsVar.b, eyfc.a(), executor2, ekqsVar.e, efbmVar);
        if (!ekqsVar.d.isEmpty()) {
            a.d(new effx(ekqsVar.d, executor2));
        }
        return a;
    }
}
