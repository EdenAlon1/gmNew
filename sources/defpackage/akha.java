package defpackage;

import android.content.Context;
import androidx.car.app.hardware.info.EnergyProfile;
import j$.util.Optional;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akha implements fbbf {
    private final akis a;
    private final akhb b;
    private final int c;

    public akha(akis akisVar, akhb akhbVar, int i) {
        this.a = akisVar;
        this.b = akhbVar;
        this.c = i;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        switch (this.c) {
            case 0:
                akis akisVar = this.a;
                fbbf fbbfVar = akisVar.q;
                akkp akkpVar = akisVar.a;
                return new snq(fbbfVar, akkpVar.al, akisVar.p, akkpVar.mx, akisVar.iq, akisVar.cN, akkpVar.cn, akkpVar.RV, akkpVar.ab, akisVar.b.qh);
            case 1:
                akhb akhbVar = this.b;
                return new evgy(akhbVar.a, (ScheduledExecutorService) this.a.p.b(), (fdzj) this.a.b.qP.b(), emxc.j((List) this.a.b.qQ.b()));
            case 2:
                Context context = (Context) this.a.q.b();
                acuq acuqVar = (acuq) this.a.b.s.b();
                akhb akhbVar2 = this.b;
                return new acke(context, acuqVar, akhbVar2.e, (acyk) akhbVar2.f.b(), (acyv) this.b.g.b());
            case 3:
                return new enpx("Bugle_DittoSatellite");
            case 4:
                akis akisVar2 = this.a;
                return new acyk(akisVar2.aJ, akisVar2.a.di, akisVar2.hi);
            case 5:
                return new acyv(this.a.a.f);
            case 6:
                akko akkoVar = this.a.b;
                fbbf fbbfVar2 = akkoVar.u;
                fbbf a = fbbg.a(akkoVar.s);
                akis akisVar3 = this.a;
                fbbf fbbfVar3 = this.b.j;
                akko akkoVar2 = akisVar3.b;
                akkp akkpVar2 = akisVar3.a;
                return new acrx(fbbfVar2, a, akisVar3.p, akkpVar2.m, akkpVar2.f, akkoVar2.nR, akkoVar2.p, akkpVar2.di, fbbg.a(fbbfVar3));
            case 7:
                return new acuu(this.b.i);
            case 8:
                akko akkoVar3 = this.a.b;
                enhd h = enhk.h(11);
                h.k(111, akkoVar3.oX);
                h.k(110, this.a.b.oY);
                h.k(109, this.a.b.oc);
                h.k(100, this.a.b.oZ);
                h.k(108, this.a.b.pa);
                h.k(Integer.valueOf(EnergyProfile.EVCONNECTOR_TYPE_OTHER), this.a.b.oV);
                h.k(207, this.a.b.pb);
                h.k(106, this.a.b.pc);
                h.k(105, this.a.b.pd);
                h.k(104, this.a.b.pe);
                h.k(107, this.a.b.qS);
                return h.c();
            case 9:
                akhb akhbVar3 = this.b;
                return new cfxg(enhk.o(15, akhbVar3.b.b.ra, 13, akhbVar3.l, 16, akhbVar3.n, 1, akhbVar3.o), (cfvu) this.a.a.cr.b(), (cqoh) this.a.cz.b(), this.a.lR);
            case 10:
                akzt akztVar = (akzt) this.a.a.f.b();
                akis akisVar4 = this.a;
                akkp akkpVar3 = akisVar4.a;
                return new cfwh(akztVar, akisVar4.b.ei, akkpVar3.jZ, fbaz.a(akkpVar3.uV), (Optional) this.a.ip.b(), fbaz.a(this.a.a.jV), (Optional) this.a.a.uP.b(), (errl) this.a.t.b());
            case 11:
                Map map = (Map) this.a.a.wn.b();
                akis akisVar5 = this.a;
                akkp akkpVar4 = akisVar5.a;
                cfyo bI = akisVar5.b.bI();
                akzt akztVar2 = (akzt) akkpVar4.f.b();
                akhb akhbVar4 = this.b;
                akko akkoVar4 = this.a.b;
                fbbf fbbfVar4 = akkoVar4.ra;
                return new cfwy(map, bI, akztVar2, fbaz.a(akhbVar4.m), Optional.of(new ackh(akkoVar4.a.dQ, (acku) fbbfVar4.b(), akkoVar4.jP, akkoVar4.a.a.p)), (cetc) this.a.a.yh.b(), (cgcu) this.a.da.b(), (errl) this.a.t.b());
            case 12:
                akzt akztVar3 = (akzt) this.a.a.f.b();
                akis akisVar6 = this.a;
                akkp akkpVar5 = akisVar6.a;
                fbbf fbbfVar5 = akisVar6.b.ei;
                fbbf fbbfVar6 = akkpVar5.jZ;
                fazb a2 = fbaz.a(akkpVar5.uV);
                Optional optional = (Optional) this.a.ip.b();
                akis akisVar7 = this.a;
                return new cfwr(akztVar3, fbbfVar5, fbbfVar6, a2, optional, akisVar7.a.fa, (errl) akisVar7.t.b());
            case 13:
                akzt akztVar4 = (akzt) this.a.a.f.b();
                fazb a3 = fbaz.a(this.a.a.gr);
                Optional optional2 = (Optional) this.a.a.uP.b();
                akis akisVar8 = this.a;
                akkp akkpVar6 = akisVar8.a;
                akko akkoVar5 = akisVar8.b;
                return new cfyd(akztVar4, a3, optional2, akkoVar5.bI(), akkoVar5.bH(), akkpVar6.kb, akkpVar6.br, akisVar8.lR, akisVar8.b.rb);
            case 14:
                return new cfyk(this.b.t);
            case 15:
                akis akisVar9 = this.a;
                akhb akhbVar5 = this.b;
                fbbf fbbfVar7 = akhbVar5.r;
                return enhk.o("CMS", akisVar9.b.rc, "Bugle", akhbVar5.q, "GDitto", fbbfVar7, "RCS", akhbVar5.s);
            case 16:
                return new cfvz(fbaz.a(this.a.a.jV));
            case 17:
                akis akisVar10 = this.a;
                akkp akkpVar7 = akisVar10.a;
                fbbf fbbfVar8 = akisVar10.q;
                fazb a4 = fbaz.a(akkpVar7.cX);
                akis akisVar11 = this.a;
                fbbf fbbfVar9 = akisVar11.cP;
                return new cfwi(fbbfVar8, a4, akisVar11.a.au, akisVar11.da, (ffhd) fbbfVar9.b(), (ffsk) this.a.a.p.b());
            case 18:
                chbx chbxVar = (chbx) this.a.a.gr.b();
                errl errlVar = (errl) this.a.t.b();
                akis akisVar12 = this.a;
                return new cfxs(chbxVar, errlVar, akisVar12.a.br, akisVar12.lR);
            case 19:
                return Optional.of(new aipr());
            case 20:
                akis akisVar13 = this.a;
                return new debw(akisVar13.a.dF, (Executor) akisVar13.p.b());
            case 21:
                return new decs(Optional.of(this.a.W()), (errl) this.a.t.b(), (cqoh) this.a.cz.b());
            case 22:
                return new decv(Optional.of(this.a.W()), (errl) this.a.t.b(), (cqoh) this.a.cz.b());
            case 23:
                akhb akhbVar6 = this.b;
                return new degt(akhbVar6.z, (ffhd) this.a.cn.b(), (ffhd) this.a.co.b(), (ffsk) this.a.a.p.b());
            case 24:
                akkp akkpVar8 = this.a.a;
                return new degw(akkpVar8.Ni, akkpVar8.rq, akkpVar8.vL, akkpVar8.vK, (atky) akkpVar8.rs.b(), (ffhd) this.a.co.b(), this.a.q);
            default:
                return new degz((ffsk) this.a.a.p.b());
        }
    }
}
