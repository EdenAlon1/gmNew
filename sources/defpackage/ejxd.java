package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejxd implements ejuh {
    final /* synthetic */ String a = "LINK_PREVIEW_ENABLED_PREF_DEFAULT_DATASOURCE_KEY";
    final /* synthetic */ ffsk b;
    final /* synthetic */ ffji c;
    final /* synthetic */ ffji d;

    public ejxd(ffsk ffskVar, ffji ffjiVar, ffji ffjiVar2) {
        this.b = ffskVar;
        this.c = ffjiVar;
        this.d = ffjiVar2;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return new erph(fgfz.a(ffra.b(this.b, ekxi.a(ffheVar), ffsmVar, new ejxc(null, this.c))));
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return fgfz.a(ffra.b(this.b, ekxi.a(ffheVar), ffsmVar, new ejxb(null, this.d)));
    }

    @Override // defpackage.ejuh
    public final /* synthetic */ Object c() {
        return this.a;
    }
}
