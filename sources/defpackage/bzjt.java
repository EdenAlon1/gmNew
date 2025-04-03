package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bzjt implements ejxi {
    final /* synthetic */ bzjx a;
    final /* synthetic */ eisx b;

    public bzjt(bzjx bzjxVar, eisx eisxVar) {
        this.a = bzjxVar;
        this.b = eisxVar;
    }

    @Override // defpackage.ejxi
    public final ejuj a() {
        ejui ejuiVar = bzkl.a;
        ejuiVar.getClass();
        return ejuiVar;
    }

    @Override // defpackage.ejxi
    public final ListenableFuture b() {
        elfl c;
        bzjx bzjxVar = this.a;
        c = axol.c(bzjxVar.h, ffhe.a, ffsm.a, new bzjs(bzjxVar, this.b, null));
        return c;
    }
}
