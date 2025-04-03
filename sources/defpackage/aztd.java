package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aztd implements bdil {
    public final azpl a;
    public final dtuu b;
    public final ffhd c;
    private final ffsk d;
    private final ffsk e;
    private final byys f;

    public aztd(azpl azplVar, dtuu dtuuVar, ffsk ffskVar, ffhd ffhdVar, ffsk ffskVar2) {
        azplVar.getClass();
        dtuuVar.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        ffskVar2.getClass();
        this.a = azplVar;
        this.b = dtuuVar;
        this.d = ffskVar;
        this.c = ffhdVar;
        this.e = ffskVar2;
        this.f = byys.PARTICIPANTS_TABLE_MY_IDENTITY;
    }

    @Override // defpackage.bdil
    public final byys a() {
        return this.f;
    }

    @Override // defpackage.bdil
    public final elfl b() {
        elfl c;
        c = axol.c(this.d, ffhe.a, ffsm.a, new azsw(this, null));
        return c;
    }

    @Override // defpackage.bdil
    public final elfl c(long j) {
        elfl c;
        c = axol.c(this.e, ffhe.a, ffsm.a, new azsx(this, j, null));
        return c;
    }

    @Override // defpackage.bdil
    public final elfl d(Optional optional) {
        elfl c;
        optional.getClass();
        c = axol.c(this.e, ffhe.a, ffsm.a, new aztc(this, optional, null));
        return c;
    }

    @Override // defpackage.bdil
    public final void f() {
    }
}
