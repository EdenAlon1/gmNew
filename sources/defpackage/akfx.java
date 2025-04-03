package defpackage;

import android.content.Context;
import android.util.Log;
import j$.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akfx implements fbbf {
    private final akis a;
    private final akhy b;
    private final akfy c;
    private final int d;

    public akfx(akis akisVar, akhy akhyVar, akfy akfyVar, int i) {
        this.a = akisVar;
        this.b = akhyVar;
        this.c = akfyVar;
        this.d = i;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        switch (this.d) {
            case 0:
                return new fazv();
            case 1:
                wmx wmxVar = (wmx) this.a.nq.b();
                akis akisVar = this.a;
                wmxVar.getClass();
                return new wmv(wmxVar, akisVar.nr);
            case 2:
                akfy akfyVar = this.c;
                akhy akhyVar = this.b;
                fbbf fbbfVar = this.a.cN;
                emdc a = akfyVar.a();
                ecrj ecrjVar = (ecrj) fbbfVar.b();
                akis akisVar2 = this.a;
                akfy akfyVar2 = this.c;
                akkp akkpVar = akisVar2.a;
                fbbf fbbfVar2 = akisVar2.b.jm;
                ffsk ffskVar = (ffsk) akkpVar.aq.b();
                ffhd ffhdVar = (ffhd) this.a.co.b();
                ffsk ffskVar2 = (ffsk) this.a.a.q.b();
                akhy akhyVar2 = this.b;
                akis akisVar3 = this.a;
                akfy akfyVar3 = this.c;
                akko akkoVar = akisVar3.b;
                akkp akkpVar2 = akisVar3.a;
                fbbf fbbfVar3 = akhyVar2.nM;
                fbbf fbbfVar4 = akkpVar2.QI;
                fbbf fbbfVar5 = akfyVar3.e;
                fbbf fbbfVar6 = akkpVar2.QK;
                fbbf fbbfVar7 = akkpVar2.QM;
                fbbf fbbfVar8 = akkpVar2.Ra;
                fbbf fbbfVar9 = akkpVar2.Rg;
                fbbf fbbfVar10 = akkpVar2.Ri;
                fbbf fbbfVar11 = akkpVar2.Rm;
                fbbf fbbfVar12 = akkpVar2.Ro;
                fbbf fbbfVar13 = akkpVar2.Rq;
                auuy bm = akkoVar.bm();
                fbbf fbbfVar14 = akkpVar2.Rs;
                fbbf fbbfVar15 = akkpVar2.Ru;
                return new wpe(a, akhyVar.ba, ecrjVar, fbbfVar2, akfyVar2.d, ffskVar, ffhdVar, ffskVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, fbbfVar9, fbbfVar10, fbbfVar11, fbbfVar12, fbbfVar13, bm, fbbfVar14, fbbfVar15);
            case 3:
                return Optional.of((wmf) this.a.a.Lc.b());
            case 4:
                akis akisVar4 = this.a;
                akkp akkpVar3 = akisVar4.a;
                return new wim(akisVar4.cz, akkpVar3.nc, akisVar4.ld, akkpVar3.QO, akkpVar3.QQ, akkpVar3.QS, akkpVar3.QU, akkpVar3.QW, akkpVar3.QY, akkpVar3.Ra);
            case 5:
                akfy akfyVar4 = this.c;
                fbbf fbbfVar16 = this.a.cN;
                emdc a2 = akfyVar4.a();
                ecrj ecrjVar2 = (ecrj) fbbfVar16.b();
                ffsk ffskVar3 = (ffsk) this.a.a.aq.b();
                akhy akhyVar3 = this.b;
                akis akisVar5 = this.a;
                akfy akfyVar5 = this.c;
                akko akkoVar2 = akisVar5.b;
                akkp akkpVar4 = akisVar5.a;
                return new wmd(a2, ecrjVar2, ffskVar3, akhyVar3.nM, akkpVar4.QG, akfyVar5.e, akkpVar4.QK, akkpVar4.QM, akkpVar4.Ra, akkoVar2.bm());
            case 6:
                return new aihq((aiii) this.c.i.b(), this.c.k);
            case 7:
                return new aiik((ffsk) this.c.h.b());
            case 8:
                ffhd ffhdVar2 = (ffhd) this.a.a.rZ.b();
                fazv fazvVar = (fazv) this.c.b.b();
                ffhdVar2.getClass();
                fazvVar.getClass();
                if (!efbd.g()) {
                    throw new IllegalStateException("The ActivityRetained coroutine scope cannot be initialized/provided on any thread other than the main thread, because initializing it on a different thread isn't safe. See b/157167956 for background.");
                }
                final ffsk b = ffsl.b(ffhdVar2.plus(new ffvf(null)));
                fazvVar.a(new fbap() { // from class: ejqu
                    @Override // defpackage.fbap
                    public final void g() {
                        ffsl.e(ffsk.this, null);
                    }
                });
                return b;
            case 9:
                fbaz.a(this.c.j);
                Log.i("FeatureExperiment", "LegacyNavigationRouterAdapterFacade based on SingleActivityArchitectureFlags.EnableSingleActivityArchitecture is disabled.");
                return Optional.empty();
            case 10:
                return new cwos((Context) this.a.q.b());
            case 11:
                eisx eisxVar = (eisx) this.b.b.b();
                ecrj ecrjVar3 = (ecrj) this.a.cN.b();
                ecnx ecnxVar = (ecnx) this.a.fC.b();
                cpdr cpdrVar = (cpdr) this.a.b.ck.b();
                aleq aleqVar = (aleq) this.a.a.lO.b();
                cpev cpevVar = (cpev) this.a.a.gp.b();
                alse alseVar = (alse) this.a.he.b();
                fbaz.a(this.a.b.jt);
                akis akisVar6 = this.a;
                akkp akkpVar5 = akisVar6.a;
                akko akkoVar3 = akisVar6.b;
                Optional empty = Optional.empty();
                fbbf fbbfVar17 = akkoVar3.ju;
                fbbf fbbfVar18 = akkpVar5.ck;
                ffsk ffskVar4 = (ffsk) akkpVar5.q.b();
                akkp akkpVar6 = this.a.a;
                return new abao(eisxVar, ecrjVar3, ecnxVar, cpdrVar, aleqVar, cpevVar, alseVar, empty, fbbfVar17, fbbfVar18, ffskVar4, akkpVar6.go, (AtomicReference) akkpVar6.cj.b(), this.c.n, this.a.a.ci);
            case 12:
                return new zer();
            case 13:
                return new abjx((ffhd) this.a.co.b(), (ffsk) this.c.h.b(), this.a.a.aT);
            case 14:
                akfy akfyVar6 = this.c;
                akkp akkpVar7 = this.a.a;
                return new dekk(akfyVar6.q, akkpVar7.au, (ffsk) akkpVar7.p.b(), this.a.b.jO);
            case 15:
                return new dekd(this.a.a.KU);
            case 16:
                akis akisVar7 = this.a;
                return new aidc(akisVar7.cN, (ecnx) akisVar7.fC.b());
            case 17:
                return new cwdv((ecrj) this.a.cN.b(), (ecnx) this.a.fC.b(), (alse) this.a.he.b());
            case 18:
                return new deln();
            case 19:
                akis akisVar8 = this.c.a;
                return new demu(akisVar8.b.R, (ffsk) akisVar8.a.p.b());
            case 20:
                return new crpw(this.c.w, this.a.b.jR);
            case 21:
                return new crps((crjx) this.a.a.r.b());
            case 22:
                fbaz.a(this.c.y);
                return Optional.empty();
            default:
                return new stm((Context) this.a.q.b());
        }
    }
}
