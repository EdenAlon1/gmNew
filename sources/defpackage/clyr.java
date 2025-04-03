package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clyr implements ejxi {
    final /* synthetic */ clxx a;
    final /* synthetic */ clyt b;

    public clyr(clyt clytVar, clxx clxxVar) {
        this.a = clxxVar;
        this.b = clytVar;
    }

    @Override // defpackage.ejxi
    public final ejuj a() {
        return cmel.c;
    }

    @Override // defpackage.ejxi
    public final ListenableFuture b() {
        return this.b.c(this.a);
    }
}
