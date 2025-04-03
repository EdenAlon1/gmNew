package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dejx implements ejxi {
    final /* synthetic */ dekb a;

    public dejx(dekb dekbVar) {
        this.a = dekbVar;
    }

    @Override // defpackage.ejxi
    public final ejuj a() {
        return dekb.a;
    }

    @Override // defpackage.ejxi
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        elfl c;
        dekb dekbVar = this.a;
        c = axol.c(dekbVar.d, ffhe.a, ffsm.a, new dejw(dekbVar, null));
        return c;
    }
}
