package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxif implements ejxi {
    final /* synthetic */ cxig a;

    public cxif(cxig cxigVar) {
        this.a = cxigVar;
    }

    @Override // defpackage.ejxi
    public final /* synthetic */ ejuj a() {
        return cxig.a;
    }

    @Override // defpackage.ejxi
    public final ListenableFuture b() {
        return !this.a.d.get() ? elfo.e(Optional.empty()) : elfl.g(((effy) this.a.e.b()).a()).h(new emwl() { // from class: cxie
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Optional.ofNullable((cxhw) obj);
            }
        }, erpp.a);
    }
}
