package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class erpw implements erog {
    final /* synthetic */ erpy a;
    final /* synthetic */ erog b;

    public erpw(erpy erpyVar, erog erogVar) {
        this.a = erpyVar;
        this.b = erogVar;
    }

    @Override // defpackage.erog
    public final ListenableFuture a() {
        return !this.a.compareAndSet(erpx.NOT_RUN, erpx.STARTED) ? erqt.g() : this.b.a();
    }

    public final String toString() {
        return this.b.toString();
    }
}
