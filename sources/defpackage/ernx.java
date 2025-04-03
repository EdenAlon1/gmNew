package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ernx extends erny {
    public ernx(ListenableFuture listenableFuture, emwl emwlVar) {
        super(listenableFuture, emwlVar);
    }

    @Override // defpackage.erny
    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2) {
        return ((emwl) obj).apply(obj2);
    }

    @Override // defpackage.erny
    public final void e(Object obj) {
        set(obj);
    }
}
