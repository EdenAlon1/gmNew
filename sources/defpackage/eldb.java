package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eldb implements erog {
    final /* synthetic */ elat a;
    final /* synthetic */ erog b;

    public eldb(elat elatVar, erog erogVar) {
        this.a = elatVar;
        this.b = erogVar;
    }

    @Override // defpackage.erog
    public final ListenableFuture a() {
        elao b = ekyf.b();
        elat h = ekyf.h(b, this.a);
        try {
            ListenableFuture a = this.b.a();
            ekyf.h(b, h);
            a.getClass();
            return a;
        } finally {
        }
    }

    public final String toString() {
        return "propagating=[" + this.b + "]";
    }
}
