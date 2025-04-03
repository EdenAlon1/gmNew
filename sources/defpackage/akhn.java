package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akhn implements ekgu {
    final /* synthetic */ akhx a;

    public akhn(akhx akhxVar) {
        this.a = akhxVar;
    }

    @Override // defpackage.ekgu
    public final ekgt a(String str) {
        eisx eisxVar = (eisx) this.a.b.b.b();
        eixo eixoVar = (eixo) this.a.a.a.as.b();
        akis akisVar = this.a.a;
        ekem mz = akisVar.a.mz();
        ekgy ekgyVar = (ekgy) akisVar.b.gp.b();
        akhx akhxVar = this.a;
        fbbf fbbfVar = akhxVar.b.d;
        Executor executor = (Executor) akhxVar.a.p.b();
        akis.iT();
        return new ekgt(eisxVar, eixoVar, mz, ekgyVar, fbbfVar, executor, str);
    }
}
