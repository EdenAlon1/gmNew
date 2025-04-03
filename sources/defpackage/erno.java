package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erno extends ernq {
    public erno(ListenableFuture listenableFuture, Class cls, eroh erohVar) {
        super(listenableFuture, cls, erohVar);
    }

    @Override // defpackage.ernq
    public final /* bridge */ /* synthetic */ Object d(Object obj, Throwable th) {
        ListenableFuture a = ((eroh) obj).a(th);
        a.getClass();
        return a;
    }

    @Override // defpackage.ernq
    public final /* synthetic */ void e(Object obj) {
        m((ListenableFuture) obj);
    }
}
