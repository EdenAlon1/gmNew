package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctaw implements ejxi {
    final /* synthetic */ ctax a;

    public ctaw(ctax ctaxVar) {
        this.a = ctaxVar;
    }

    @Override // defpackage.ejxi
    public final /* synthetic */ ejuj a() {
        return ctax.a;
    }

    @Override // defpackage.ejxi
    public final ListenableFuture b() {
        return this.a.b().h();
    }
}
