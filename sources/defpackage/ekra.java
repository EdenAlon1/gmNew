package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekra {
    public final ekql a;
    private final ffbr b;

    public ekra(ffbr ffbrVar, ekql ekqlVar) {
        this.b = ffbrVar;
        this.a = ekqlVar;
    }

    public final effy a(final ekqy ekqyVar, efbm efbmVar) {
        emxf.m(true, "LamsConfig in ProtoDataStoreConfig must be used together with @LamsSync annotation");
        emxf.m(true, "Custom IOExecutor should not be used with a BlockingSafeProtoDataStore config");
        ekqs ekqsVar = (ekqs) ekqyVar;
        Executor executor = ekqsVar.g;
        if (executor == null) {
            executor = (Executor) this.b.b();
        }
        Executor executor2 = executor;
        ListenableFuture j = elfr.j(erqt.i(""), new emwl() { // from class: ekqz
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                String str = (String) obj;
                str.getClass();
                StringBuilder sb = new StringBuilder();
                ekqs ekqsVar2 = (ekqs) ekqyVar;
                sb.append(ekqsVar2.a);
                sb.append(str);
                sb.append(".pb");
                return ekra.this.a.c(ekqsVar2.c, sb.toString());
            }
        }, executor2);
        effy a = efhr.a(ekqsVar.a, j, ekqsVar.b, eyfc.a(), executor2, ekqsVar.e, efbmVar);
        if (!ekqsVar.d.isEmpty()) {
            a.d(new effx(ekqsVar.d, executor2));
        }
        return a;
    }
}
