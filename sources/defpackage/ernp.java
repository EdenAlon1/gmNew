package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ernp extends ernq {
    public ernp(ListenableFuture listenableFuture, Class cls, emwl emwlVar) {
        super(listenableFuture, cls, emwlVar);
    }

    @Override // defpackage.ernq
    public final /* bridge */ /* synthetic */ Object d(Object obj, Throwable th) {
        return ((emwl) obj).apply(th);
    }

    @Override // defpackage.ernq
    public final void e(Object obj) {
        set(obj);
    }
}
