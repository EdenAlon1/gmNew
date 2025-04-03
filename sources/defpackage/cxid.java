package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxid implements ejxi {
    final /* synthetic */ cxig a;

    public cxid(cxig cxigVar) {
        this.a = cxigVar;
    }

    @Override // defpackage.ejxi
    public final /* synthetic */ ejuj a() {
        return cxig.a;
    }

    @Override // defpackage.ejxi
    public final ListenableFuture b() {
        return elfl.g(((effy) this.a.e.b()).a()).h(new emwl() { // from class: cxic
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Optional.ofNullable((cxhw) obj);
            }
        }, erpp.a);
    }
}
