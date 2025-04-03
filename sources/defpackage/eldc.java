package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eldc implements eroh {
    final /* synthetic */ elat a;
    final /* synthetic */ eroh b;

    public eldc(elat elatVar, eroh erohVar) {
        this.a = elatVar;
        this.b = erohVar;
    }

    @Override // defpackage.eroh
    public final ListenableFuture a(Object obj) {
        elat h = ekyf.h(ekyf.b(), this.a);
        try {
            ListenableFuture a = this.b.a(obj);
            if (a != null) {
                return a;
            }
            throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
