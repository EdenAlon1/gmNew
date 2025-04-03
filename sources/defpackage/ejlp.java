package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.contrib.android.ProtoParsers;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejlp {
    public final ListenableFuture a;

    public ejlp(ListenableFuture listenableFuture) {
        this.a = listenableFuture;
    }

    public static ejlp a(ListenableFuture listenableFuture) {
        return new ejlp(erny.f(listenableFuture, new emwl() { // from class: ejlo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return new ProtoParsers.InternalDontUse(null, (eyhs) obj);
            }
        }, erpp.a));
    }

    public static ejlp b(ListenableFuture listenableFuture) {
        return new ejlp(erny.f(listenableFuture, new emwn(null), erpp.a));
    }
}
