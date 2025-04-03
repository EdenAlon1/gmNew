package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clyy implements ejxi {
    final /* synthetic */ clyz a;
    final /* synthetic */ String b;

    public clyy(clyz clyzVar, String str) {
        this.a = clyzVar;
        this.b = str;
    }

    @Override // defpackage.ejxi
    public final ejuj a() {
        return clyz.a;
    }

    @Override // defpackage.ejxi
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        elfl c;
        clyz clyzVar = this.a;
        c = axol.c(clyzVar.b, ffhe.a, ffsm.a, new clyx(clyzVar, this.b, null));
        return c;
    }
}
