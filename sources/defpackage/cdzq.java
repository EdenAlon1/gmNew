package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdzq implements ceac {
    public final babf a;
    public final axkm b;
    public final dtuu c;
    public final eixo d;
    public final errl e;
    public final errl f;
    public final fjft g;
    public final ffbr h;
    public final cbwj i;

    public cdzq(babf babfVar, axkm axkmVar, fjft fjftVar, eixo eixoVar, errl errlVar, errl errlVar2, ffbr ffbrVar, cbwj cbwjVar, dtuu dtuuVar) {
        this.a = babfVar;
        this.b = axkmVar;
        this.g = fjftVar;
        this.d = eixoVar;
        this.e = errlVar;
        this.f = errlVar2;
        this.i = cbwjVar;
        this.c = dtuuVar;
        this.h = ffbrVar;
    }

    @Override // defpackage.ceac
    public final elfl a(int i, ceal cealVar) {
        throw null;
    }

    public final void b() {
        this.b.S(axeu.DISABLED);
        this.b.U(axes.ENCRYPTION_STATUS_UNSPECIFIED);
        this.b.aj("");
    }

    public final void c() {
        this.c.g(new dtut() { // from class: cdzj
            @Override // defpackage.dtut
            public final ekzz a() {
                return eleg.f("CCOOBS::notifyStateChange::runAfterCommit");
            }
        }, "CmsCompleteOptOutBnrStep#doWork", new Runnable() { // from class: cdzk
            @Override // java.lang.Runnable
            public final void run() {
                cdzq cdzqVar = cdzq.this;
                fjft fjftVar = cdzqVar.g;
                ((axkm) fjftVar.a.b()).getClass();
                babf babfVar = (babf) fjftVar.b.b();
                babfVar.getClass();
                eixo eixoVar = (eixo) fjftVar.c.b();
                eixoVar.getClass();
                ejvp ejvpVar = (ejvp) fjftVar.d.b();
                ejvpVar.getClass();
                ffsk ffskVar = (ffsk) fjftVar.e.b();
                ffskVar.getClass();
                new fjfs(babfVar, eixoVar, ejvpVar, ffskVar, (Optional) ((fbbb) fjftVar.f).a, fjftVar.g, null).c.a(elfo.e(null), csfw.a);
                if (csgj.a()) {
                    cdzqVar.b.N();
                }
            }
        });
    }
}
