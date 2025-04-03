package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbrw implements ejxi {
    final /* synthetic */ dbrz a;

    public dbrw(dbrz dbrzVar) {
        this.a = dbrzVar;
    }

    @Override // defpackage.ejxi
    public final /* bridge */ /* synthetic */ ejuj a() {
        return new ejtz("BARCODE_DETECTOR");
    }

    @Override // defpackage.ejxi
    public final ListenableFuture b() {
        return elfo.g(new Callable() { // from class: dbrv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new dbrs();
            }
        }, this.a.a);
    }
}
