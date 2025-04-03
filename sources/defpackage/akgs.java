package defpackage;

import android.app.Activity;
import android.content.Context;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;
import com.google.android.apps.messaging.conversation2.viewmodel.ConversationViewModel;
import com.google.android.rcs.client.profile.RcsProfileService;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akgs implements fbbf {
    public final akis a;
    public final akgb b;
    public final akgt c;
    private final akgg d;
    private final int e;

    public akgs(akis akisVar, akgg akggVar, akgb akgbVar, akgt akgtVar, int i) {
        this.a = akisVar;
        this.d = akggVar;
        this.b = akgbVar;
        this.c = akgtVar;
        this.e = i;
    }

    private final Object a() {
        int i = this.e;
        switch (i) {
            case 0:
                akgt akgtVar = this.c;
                return ejxo.a((ea) ((fbbb) akgtVar.d).a, (eklq) akgtVar.e.b(), (ejvw) this.a.aR.b(), (Executor) this.a.a.m.b());
            case 1:
                ea eaVar = (ea) ((fbbb) this.c.d).a;
                return eklq.a(eaVar, eaVar);
            case 2:
                return ejrm.a((ffhd) this.a.a.rZ.b(), (ea) ((fbbb) this.c.d).a);
            case 3:
                return svi.a((ea) ((fbbb) this.c.d).a);
            case 4:
                return tvy.a((ea) ((fbbb) this.c.d).a);
            case 5:
                return new elld((ea) ((fbbb) this.c.d).a, (ellq) this.a.b.oJ.b(), emxc.j(new ella()));
            case 6:
                return new ejwk((ea) ((fbbb) this.c.d).a, (Executor) this.a.a.m.b());
            case 7:
                return ejlx.a((ea) ((fbbb) this.c.d).a);
            case 8:
                akgb akgbVar = this.b;
                akgt akgtVar2 = this.c;
                return new dsfh(akgbVar.d, akgbVar.bx, akgtVar2.p, fbbg.a(akgtVar2.q), fbbg.a(akgtVar2.r), akgtVar2.g, akgbVar.bl);
            case 9:
                akis akisVar = this.a;
                akgt akgtVar3 = this.c;
                return new dsxh(akisVar.lm, akgtVar3.n, akgtVar3.o);
            case 10:
                return new dszm(this.b.d, this.c.m);
            case 11:
                return new dsxv(this.a.lm);
            case 12:
                return new dszj(this.b.d, this.c.m);
            case 13:
                enhd h = enhk.h(10);
                h.k(dqfc.class, dqfe.a());
                h.k(dqtz.class, (dslk) this.a.b.hA.b());
                h.k(drcf.class, drch.a());
                h.k(dqvo.class, (dslk) this.a.b.hB.b());
                h.k(drds.class, drdu.a());
                h.k(drwz.class, drxf.a());
                h.k(dsbf.class, dsbi.a());
                h.k(dsed.class, dsef.a());
                h.k(dtjq.class, dtks.a());
                h.k(drie.class, drir.a());
                return h.c();
            case 14:
                akko akkoVar = this.a.b;
                enhd h2 = enhk.h(9);
                h2.k(dszr.b, akkoVar.cN());
                h2.k(dszr.a, dqfe.a());
                h2.k(dszr.i, drch.a());
                h2.k(dszr.c, drdu.a());
                h2.k(dszr.d, drxf.a());
                h2.k(dszr.e, dsbi.a());
                h2.k(dszr.f, dsef.a());
                h2.k(dszr.g, dtks.a());
                h2.k(dszr.h, drir.a());
                return h2.c();
            case 15:
                akis akisVar2 = this.a;
                return new dqnk(akisVar2.a.p, akisVar2.lm, akisVar2.b.hH);
            case 16:
                return yqc.a(this.a.b.bk());
            case 17:
                return new vzq((errl) this.a.p.b(), this.a.a.c);
            case 18:
                return Optional.of(this.a.b.dt());
            case 19:
                return new bcuk(this.d.bT);
            case 20:
                eg egVar = (eg) this.b.f.b();
                akgt akgtVar4 = this.c;
                akis akisVar3 = this.a;
                akgg akggVar = this.d;
                fbbf fbbfVar = akisVar3.aJ;
                akkp akkpVar = akisVar3.a;
                fbbf fbbfVar2 = akkpVar.Df;
                elbx elbxVar = (elbx) fbbfVar.b();
                akis akisVar4 = this.a;
                return new taa(egVar, akgtVar4.z, akkpVar.Px, akggVar.bt, fbbfVar2, elbxVar, akisVar4.a.eT);
            case 21:
                akgb akgbVar2 = this.b;
                akgg akggVar2 = this.d;
                akgt akgtVar5 = this.c;
                akis akisVar5 = this.a;
                akkp akkpVar2 = akisVar5.a;
                fbbf fbbfVar3 = akkpVar2.nW;
                fbbf fbbfVar4 = akkpVar2.nk;
                errl errlVar = (errl) akisVar5.t.b();
                return new BlockAndReportSpamCallbacks(akgbVar2.f, akggVar2.ac, akgtVar5.y, fbbfVar3, fbbfVar4, akgtVar5.l, akggVar2.k, errlVar);
            case 22:
                return new sxp((eg) this.b.f.b());
            case 23:
                ejvb ejvbVar = (ejvb) this.a.dy.b();
                errl errlVar2 = (errl) this.a.t.b();
                akis akisVar6 = this.a;
                akkp akkpVar3 = akisVar6.a;
                return new was(ejvbVar, errlVar2, akkpVar3.ib, akisVar6.li, (avff) akkpVar3.uf.b());
            case 24:
                akis akisVar7 = this.a;
                akkp akkpVar4 = akisVar7.a;
                return new bcuo(akkpVar4.RO, akkpVar4.ft, akisVar7.cX, akisVar7.cI, akisVar7.lz);
            case 25:
                return wcs.a((ea) ((fbbb) this.c.d).a);
            case 26:
                return ((emxn) emxc.j((ekji) this.c.E.b())).a;
            case 27:
                return ekjl.a((ea) ((fbbb) this.c.d).a);
            case 28:
                return new wcm((akzt) this.a.a.f.b());
            case 29:
                return new byzz((ejvb) this.a.dy.b(), (ejvp) this.a.aR.b());
            case 30:
                return whj.a((ea) ((fbbb) this.c.d).a);
            case 31:
                Context context = (Context) this.a.q.b();
                ffhd ffhdVar = (ffhd) this.a.co.b();
                lmy lmyVar = (lmy) this.c.J.b();
                Optional of = Optional.of(new dpnf(null));
                this.c.O();
                return uii.a(context, ffhdVar, lmyVar, of, (sfz) this.a.nR.b(), (ejmh) this.a.hA.b(), Optional.of(uik.a((dpon) this.c.O.b())), Optional.empty(), this.a.b.kB);
            case 32:
                return dqmh.a((Activity) this.b.d.b(), (ea) ((fbbb) this.c.d).a, Optional.empty());
            case 33:
                dpaa dpaaVar = (dpaa) this.c.L.b();
                ernh ernhVar = (ernh) this.a.lm.b();
                fazb a = fbaz.a(this.a.b.ku);
                akis akisVar8 = this.a;
                fazb a2 = fbaz.a(akisVar8.b.oO);
                akko akkoVar2 = akisVar8.b;
                return new dozh(dpaaVar, ernhVar, a, a2, akkoVar2.oM, akkoVar2.ky);
            case 34:
                return new dpaa((Context) this.a.q.b(), (ffsk) this.c.K.b());
            case 35:
                return dsfe.a((ffhd) this.a.cP.b());
            case 36:
                return Optional.of(this.a.b.j());
            case 37:
                return new akgq(this);
            case 38:
                return abzd.a((ea) ((fbbb) this.c.d).a);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                akis akisVar9 = this.a;
                akgg akggVar3 = this.d;
                akkp akkpVar5 = akisVar9.a;
                return new abzn(akkpVar5.xi, akkpVar5.Px, akggVar3.bt);
            case 40:
                akis akisVar10 = this.a;
                return new abwo(akisVar10.t, akisVar10.p, akisVar10.cz, this.c.S);
            case 41:
                akgg akggVar4 = this.d;
                return enhk.m("AllMessagesDonationConversationCollector", akggVar4.b(), "RecentMessagesDonationConversationCollector", akggVar4.c());
            case 42:
                return new acaa((errl) this.a.p.b(), (abya) this.a.b.ik.b());
            case 43:
                akis akisVar11 = this.a;
                return new acyk(akisVar11.aJ, akisVar11.a.di, akisVar11.hi);
            case 44:
                return new acyv(this.a.a.f);
            case 45:
                akgt akgtVar6 = this.c;
                akis akisVar12 = this.a;
                akko akkoVar3 = akisVar12.b;
                return new acqd(akgtVar6.Z, akkoVar3.t, akkoVar3.p, akisVar12.p);
            case 46:
                akko akkoVar4 = this.a.b;
                fbbf fbbfVar5 = akkoVar4.u;
                fbbf a3 = fbbg.a(akkoVar4.s);
                akis akisVar13 = this.a;
                fbbf fbbfVar6 = this.c.Y;
                akko akkoVar5 = akisVar13.b;
                akkp akkpVar6 = akisVar13.a;
                return new acrx(fbbfVar5, a3, akisVar13.p, akkpVar6.m, akkpVar6.f, akkoVar5.nR, akkoVar5.p, akkpVar6.di, fbbg.a(fbbfVar6));
            case 47:
                return new acuu(this.c.X);
            case 48:
                akko akkoVar6 = this.a.b;
                enhd h3 = enhk.h(11);
                h3.k(111, akkoVar6.oX);
                h3.k(110, this.a.b.oY);
                h3.k(109, this.a.b.oc);
                h3.k(100, this.a.b.oZ);
                h3.k(108, this.a.b.pa);
                h3.k(Integer.valueOf(EnergyProfile.EVCONNECTOR_TYPE_OTHER), this.a.b.oV);
                h3.k(207, this.a.b.pb);
                h3.k(106, this.a.b.pc);
                h3.k(105, this.a.b.pd);
                h3.k(104, this.a.b.pe);
                h3.k(107, this.b.cM);
                return h3.c();
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return eklf.a((ea) ((fbbb) this.c.d).a);
            case 50:
                return new enpx("Bugle_DittoSatellite");
            case 51:
                Context context2 = (Context) this.a.q.b();
                ffhd ffhdVar2 = (ffhd) this.a.cn.b();
                ffhd ffhdVar3 = (ffhd) this.a.co.b();
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                akis akisVar14 = this.a;
                return new acsu(context2, ffhdVar2, ffhdVar3, ffskVar, akisVar14.a.f, akisVar14.b.u);
            case 52:
                return new adiw((babf) this.a.a.pN.b(), (ffsk) this.a.a.p.b());
            case 53:
                return new adix((elbx) this.a.aJ.b(), (ejvp) this.a.aR.b());
            case 54:
                return new ejzc((ea) ((fbbb) this.c.d).a, (ejvw) this.a.aR.b(), (Executor) this.a.a.m.b());
            case 55:
                return new eizh(this.c.M());
            case 56:
                akis akisVar15 = this.a;
                return new adtv(akisVar15.a.az, akisVar15.eb);
            case 57:
                akis akisVar16 = this.a;
                akgg akggVar5 = this.d;
                return new advg(akisVar16.q, akisVar16.p, akisVar16.t, akisVar16.cz, akggVar5.k, akisVar16.a.iy, akggVar5.C);
            case 58:
                return aesv.a((ea) ((fbbb) this.c.d).a);
            case 59:
                return ahhp.a((ea) ((fbbb) this.c.d).a);
            case 60:
                return new elhk(this.a.b.db());
            case 61:
                return ajfl.a((ea) ((fbbb) this.c.d).a);
            case 62:
                return akoq.a((ea) ((fbbb) this.c.d).a);
            case 63:
                akis akisVar17 = this.a;
                return new akom(akisVar17.a.aT, (ejvb) akisVar17.dy.b(), (errl) this.a.p.b(), (ejvp) this.a.aR.b());
            case 64:
                return akqq.a((ea) ((fbbb) this.c.d).a);
            case 65:
                return akqv.a((ea) ((fbbb) this.c.d).a);
            case 66:
                return akrd.a((ea) ((fbbb) this.c.d).a);
            case 67:
                return cgdu.a((ea) ((fbbb) this.c.d).a);
            case 68:
                return cwli.a((ea) ((fbbb) this.c.d).a);
            case 69:
                ea eaVar2 = (ea) ((fbbb) this.c.d).a;
                if (eaVar2 instanceof cwyb) {
                    return (cwyb) eaVar2;
                }
                throw new IllegalStateException(a.J(eaVar2, cwyp.class));
            case 70:
                akgg akggVar6 = this.d;
                fazb a4 = fbaz.a(this.a.a.fP);
                dcxt dcxtVar = (dcxt) this.c.aw.b();
                akzt akztVar = (akzt) this.a.a.f.b();
                cpbs cpbsVar = (cpbs) this.a.a.ft.b();
                akkp akkpVar7 = this.a.a;
                ddzb ddzbVar = (ddzb) akkpVar7.nk.b();
                elbx elbxVar2 = (elbx) this.a.aJ.b();
                return new ddxs(akggVar6.bt, a4, dcxtVar, akztVar, cpbsVar, akkpVar7.Px, ddzbVar, elbxVar2);
            case 71:
                akis akisVar18 = this.a;
                akkp akkpVar8 = akisVar18.a;
                fbbf fbbfVar7 = akisVar18.q;
                fbbf a5 = fbbg.a(akkpVar8.fP);
                akis akisVar19 = this.a;
                akgg akggVar7 = this.d;
                akkp akkpVar9 = akisVar19.a;
                fbbf fbbfVar8 = akkpVar9.f;
                akko akkoVar7 = akisVar19.b;
                return new dcxt(fbbfVar7, akisVar18.aU, a5, fbbfVar8, akkoVar7.hn, akkoVar7.ie, akkpVar9.Cv, akkoVar7.dk, akisVar19.cz, akkpVar9.gJ, akisVar19.aJ, akisVar19.aK, akkpVar9.bj, akkpVar9.cK, akggVar7.bI, akkpVar9.bo);
            case 72:
                akgb akgbVar3 = this.b;
                akis akisVar20 = this.a;
                return new cwue(akgbVar3.d, akisVar20.a.ha, akisVar20.aU);
            case 73:
                return new cxaw(this.a.aU);
            case 74:
                return new ckmb((RcsProfileService) this.a.a.dl.b());
            case 75:
                akkp akkpVar10 = this.a.a;
                fbbf fbbfVar9 = akkpVar10.bi;
                fbbf fbbfVar10 = akkpVar10.bj;
                fbbf fbbfVar11 = akkpVar10.cN;
                fbbf fbbfVar12 = akkpVar10.br;
                ffsk ffskVar2 = (ffsk) akkpVar10.aq.b();
                akis akisVar21 = this.a;
                fbbf fbbfVar13 = akisVar21.b.pi;
                akkp akkpVar11 = akisVar21.a;
                return new cxka(fbbfVar9, fbbfVar10, fbbfVar11, fbbfVar12, ffskVar2, fbbfVar13, akkpVar11.br, akkpVar11.kP);
            case 76:
                ffsk ffskVar3 = (ffsk) this.a.a.aq.b();
                ffsk ffskVar4 = (ffsk) this.a.a.p.b();
                akgt akgtVar7 = this.c;
                akis akisVar22 = this.a;
                akkp akkpVar12 = akisVar22.a;
                fbbf fbbfVar14 = akkpVar12.Dr;
                csjk csjkVar = (csjk) akkpVar12.fQ.b();
                akis akisVar23 = this.a;
                akkp akkpVar13 = akisVar23.a;
                return new dcyg(ffskVar3, ffskVar4, akgtVar7.aw, akisVar22.aU, fbbfVar14, csjkVar, akisVar23.aQ, akkpVar13.cK, akkpVar13.bj, akkpVar13.wi);
            case 77:
                return new cxfi((ejvp) this.a.aR.b(), (ejtr) this.a.a.f7do.b(), (cqoh) this.a.cz.b(), (csrh) this.a.a.xi.b(), (errl) this.a.t.b(), (ctwb) this.a.a.c.b(), this.a.a.Z);
            case 78:
                return new akgr(this);
            case 79:
                return new woi((ffsk) this.a.a.p.b(), (ffhd) this.a.cn.b(), (ffhd) this.a.co.b(), (comc) this.a.a.Lb.b(), (ejvb) this.a.dy.b());
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                return Optional.of((wmf) this.a.a.Lc.b());
            case 81:
                akgb akgbVar4 = this.b;
                akgt akgtVar8 = this.c;
                akis akisVar24 = this.a;
                akkp akkpVar14 = akisVar24.a;
                return new cxii(akgbVar4.d, akgtVar8.aH, akisVar24.aJ, akkpVar14.f);
            case 82:
                akis akisVar25 = this.a;
                return new cxig(akisVar25.b.kg, akisVar25.aR);
            case 83:
                return new cery(this.a.a.cc);
            case 84:
                akis akisVar26 = this.a;
                akgg akggVar8 = this.d;
                return new vxu(akisVar26.cz, akisVar26.p, akisVar26.t, akggVar8.g, akisVar26.a.aO, akggVar8.c);
            case 85:
                akko akkoVar8 = this.a.b;
                return new czoi(akkoVar8.fa, akkoVar8.pm, akkoVar8.nE);
            case 86:
                akgt akgtVar9 = this.c;
                return cxzj.a(akgtVar9.k(), akgtVar9.m(), akgtVar9.r(), akgtVar9.v(), akgtVar9.w(), akgtVar9.x(), akgtVar9.u(), akgtVar9.t(), akgtVar9.s(), akgtVar9.n(), akgtVar9.o(), akgtVar9.p(), akgtVar9.q());
            case 87:
                akis akisVar27 = this.a;
                akgt akgtVar10 = this.c;
                return new cyai(akisVar27.aJ, akgtVar10.aM, akgtVar10.aN, akisVar27.a.f);
            case 88:
                return new eler((elbx) this.a.aJ.b());
            case 89:
                return new Object() { // from class: cxzi
                };
            case 90:
                return new cvlx((Context) this.b.d.b());
            case 91:
                return new cvlo(this.c.l(), (cvlw) this.a.b.po.b(), (errl) this.a.p.b());
            case 92:
                return cgvd.a((ea) ((fbbb) this.c.d).a);
            case 93:
                ejvb ejvbVar2 = (ejvb) this.a.dy.b();
                ejvp ejvpVar = (ejvp) this.a.aR.b();
                akgg akggVar9 = this.d;
                akgt akgtVar11 = this.c;
                bctx bctxVar = (bctx) this.a.a.Fz.b();
                cuye cuyeVar = (cuye) this.a.a.ff.b();
                altk altkVar = (altk) this.a.a.fP.b();
                return new cycj(ejvbVar2, ejvpVar, akggVar9.p, akgtVar11.aS, bctxVar, cuyeVar, altkVar, (ctas) this.a.a.lF.b(), (errl) this.a.t.b(), (Long) this.a.a.lG.b(), (Long) this.a.a.lH.b());
            case 94:
                akgg akggVar10 = this.d;
                return new cycm(akggVar10.k, (errm) this.a.t.b());
            case 95:
                akgt akgtVar12 = this.c;
                akis akisVar28 = this.a;
                return new cxzq(akgtVar12.aM, akisVar28.aJ, akisVar28.a.f);
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                return Optional.of((czqb) this.b.bj.b());
            case 97:
                return new cyay(this.c.aO);
            case 98:
                return new cydc(this.a.a.az);
            case 99:
                return new cydk((ejvb) this.a.dy.b(), (errm) this.a.t.b());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        int i = this.e;
        if (i / 100 == 0) {
            return a();
        }
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                akgt akgtVar = this.c;
                cydy o = akgtVar.o();
                cyeq p = akgtVar.p();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new cxxx(o, new cxxz(1, false, true, true)));
                arrayList.add(new cxxx(p, new cxxz(2, false, true, true)));
                engw D = engw.D(arrayList);
                D.getClass();
                return D;
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                ea eaVar = (ea) ((fbbb) this.c.d).a;
                if (eaVar instanceof cymk) {
                    return (cymk) eaVar;
                }
                throw new IllegalStateException(a.J(eaVar, cyml.class));
            case 102:
                akis akisVar = this.a;
                akkp akkpVar = akisVar.a;
                return new cymj(akisVar.dy, akisVar.t, akkpVar.el, akisVar.aR, akisVar.b.dT);
            case 103:
                return new czdp();
            case 104:
                return new azwc(this.a.aJ, this.b.T);
            case 105:
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                akis akisVar2 = this.a;
                akgg akggVar = this.d;
                akkp akkpVar2 = akisVar2.a;
                fbbf fbbfVar = akkpVar2.BQ;
                fbbf fbbfVar2 = akkpVar2.Z;
                fbbf fbbfVar3 = akkpVar2.G;
                fbbf fbbfVar4 = akkpVar2.fT;
                fbbf fbbfVar5 = akkpVar2.eT;
                azaw azawVar = (azaw) akkpVar2.lu.b();
                return new avhw(ffskVar, fbbfVar, akisVar2.cz, akggVar.c, akggVar.g, akggVar.f, fbbfVar2, fbbfVar3, fbbfVar4, akisVar2.b.pu, fbbfVar5, azawVar);
            case 106:
                ea eaVar2 = (ea) ((fbbb) this.c.d).a;
                if (eaVar2 instanceof czum) {
                    return (czum) eaVar2;
                }
                throw new IllegalStateException(a.J(eaVar2, czup.class));
            case 107:
                return new aifv(this.a.a.dF, new aifp(), (Executor) this.a.p.b(), this.a.cN);
            case 108:
                akis akisVar3 = this.a;
                akgt akgtVar2 = this.c;
                akkp akkpVar3 = akisVar3.a;
                return new bcri(akkpVar3.IB, akkpVar3.sY, akgtVar2.be);
            case 109:
                return new czzh(this.a.a.dQ, this.b.T);
            case 110:
                return Optional.of(this.a.b.T());
            case 111:
                cmel cmelVar = (cmel) this.a.a.vV.b();
                crln crlnVar = (crln) this.a.a.Dr.b();
                akgt akgtVar3 = this.c;
                return new clyt(cmelVar, crlnVar, new crll((ctyx) akgtVar3.a.aU.b(), (crln) akgtVar3.a.a.Dr.b(), (cuah) akgtVar3.a.b.ie.b(), (errl) akgtVar3.a.t.b(), (cort) akgtVar3.a.a.bj.b(), (cguo) akgtVar3.a.a.cK.b(), (cgud) akgtVar3.a.a.vW.b(), (errl) akgtVar3.a.aK.b(), (errl) akgtVar3.a.p.b()), (errl) this.a.t.b(), (errl) this.a.p.b(), (cqoh) this.a.cz.b());
            case 112:
                akgt akgtVar4 = this.c;
                akkp akkpVar4 = akgtVar4.a.a;
                return new dbbj(akgtVar4.y(), new dbdj(akkpVar4.aT, (ffsk) akkpVar4.q.b()));
            case 113:
                return new dbda((ffhd) this.a.co.b());
            case 114:
                return new dbcy((ffhd) this.a.co.b());
            case 115:
                akis akisVar4 = this.a;
                return new dbdc(akisVar4.a.ib, (ffhd) akisVar4.co.b());
            case 116:
                return new dbbt(this.c.y());
            case 117:
                ea eaVar3 = (ea) ((fbbb) this.c.d).a;
                if (eaVar3 instanceof dbdq) {
                    return (dbdq) eaVar3;
                }
                throw new IllegalStateException(a.J(eaVar3, dbdu.class));
            case 118:
                return new dbed((babf) this.a.a.pN.b(), (ffsk) this.a.a.p.b(), (Context) this.b.d.b());
            case 119:
                ea eaVar4 = (ea) ((fbbb) this.c.d).a;
                if (eaVar4 instanceof dbet) {
                    return (dbet) eaVar4;
                }
                throw new IllegalStateException(a.J(eaVar4, dbfg.class));
            case 120:
                akgt akgtVar5 = this.c;
                ejvb ejvbVar = (ejvb) akgtVar5.a.dy.b();
                eixo eixoVar = (eixo) akgtVar5.a.a.as.b();
                ejar ejarVar = (ejar) akgtVar5.a.a.au.b();
                Optional of = Optional.of(akgtVar5.a.a.dV());
                akkp akkpVar5 = akgtVar5.a.a;
                return new dbip(new dbfy(ejvbVar, eixoVar, ejarVar, of, akkpVar5.Gj, (ffsk) akkpVar5.p.b()), (Context) this.b.d.b());
            case 121:
                return new dbgh((babf) this.a.a.pN.b(), (ffsk) this.a.a.p.b(), (Context) this.b.d.b());
            case 122:
                fazb a = fbaz.a(this.a.a.gr);
                akis akisVar5 = this.a;
                return new dbmk(a, akisVar5.a.wU, (errl) akisVar5.p.b(), (errl) this.a.aK.b());
            case 123:
                ea eaVar5 = (ea) ((fbbb) this.c.d).a;
                if (eaVar5 instanceof dbpf) {
                    return (dbpf) eaVar5;
                }
                throw new IllegalStateException(a.J(eaVar5, dbpr.class));
            case 124:
                return new dbpe((Context) this.a.q.b(), (cqoh) this.a.cz.b(), (cfjc) this.a.a.OH.b(), (ffsk) this.a.a.q.b());
            case 125:
                return new bcxh(this.c.be);
            case 126:
                akis akisVar6 = this.a;
                akgt akgtVar6 = this.c;
                akko akkoVar = akisVar6.b;
                akkp akkpVar6 = akisVar6.a;
                return new dbrj(akkpVar6.xi, akkoVar.hn, akkpVar6.f, akkpVar6.C, akkpVar6.ql, akisVar6.gX, akkpVar6.Al, akkpVar6.jZ, akkoVar.oJ, akisVar6.aJ, akkpVar6.r, akgtVar6.bA, akkoVar.hp);
            case 127:
                Context context = (Context) this.a.q.b();
                akgb akgbVar = this.b;
                akzt akztVar = (akzt) this.a.a.f.b();
                csum csumVar = (csum) this.a.a.dr.b();
                ctap ctapVar = (ctap) this.a.a.co.b();
                cbar cbarVar = (cbar) this.a.cB.b();
                akkp akkpVar7 = this.a.a;
                ctfj ctfjVar = (ctfj) akkpVar7.nP.b();
                cqoh cqohVar = (cqoh) this.a.cz.b();
                return new dcgl(context, akgbVar.bk, akztVar, csumVar, ctapVar, cbarVar, akkpVar7.Px, ctfjVar, cqohVar);
            case 128:
                akgt akgtVar7 = this.c;
                akis akisVar7 = this.a;
                ea eaVar6 = (ea) ((fbbb) akgtVar7.d).a;
                dede dedeVar = (dede) akisVar7.b.iq.b();
                tam tamVar = (tam) this.b.m.b();
                akis akisVar8 = this.c.a;
                return new dbxg(eaVar6, dedeVar, tamVar, new cwpg(akisVar8.b.iq, akisVar8.a.nk));
            case 129:
                return new dcxx(this.a.a.c);
            case 130:
                return new cmba((cmel) this.a.a.vV.b(), (cqoh) this.a.cz.b(), (cguo) this.a.a.cK.b());
            case 131:
                return new clyz((ffsk) this.a.a.aq.b(), this.a.a.bj);
            case 132:
                return new ddpm(this.a.a.f);
            case 133:
                return new bcyc((Context) this.a.q.b(), (crji) this.a.a.ab.b(), this.a.a.Z);
            case 134:
                akgt akgtVar8 = this.c;
                akis akisVar9 = this.a;
                ea eaVar7 = (ea) ((fbbb) akgtVar8.d).a;
                this.c.f();
                ddzt ddztVar = (ddzt) new deaf(eaVar7, ddzt.class).b(new ffbr() { // from class: ddzr
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        return new ddzt();
                    }
                });
                ddztVar.getClass();
                return ddztVar;
            case 135:
                Context context2 = (Context) this.a.q.b();
                csqw csqwVar = (csqw) this.a.a.hC.b();
                return new ddzq(context2, csqwVar);
            case 136:
                return dqmg.a((lmy) this.c.J.b());
            case 137:
                akgb akgbVar2 = this.b;
                akgt akgtVar9 = this.c;
                return new drpr(akgbVar2.d, akgtVar9.bL, akgtVar9.bM, this.a.ll, akgtVar9.g);
            case 138:
                return new drro();
            case 139:
                akgb akgbVar3 = this.b;
                akis akisVar10 = this.a;
                akgt akgtVar10 = this.c;
                fbbf fbbfVar6 = akgbVar3.d;
                akkp akkpVar8 = akisVar10.a;
                fbbf fbbfVar7 = akkpVar8.m;
                fbbf fbbfVar8 = akisVar10.lm;
                fbbf fbbfVar9 = akisVar10.t;
                fbbf fbbfVar10 = akkpVar8.q;
                akko akkoVar2 = akisVar10.b;
                return new dpuj(fbbfVar6, fbbfVar7, fbbfVar8, fbbfVar9, fbbfVar10, akgtVar10.N, akkoVar2.kw, akkoVar2.oN);
            case 140:
                return new dtdg(this.b.d, this.c.bP);
            case 141:
                return new dtcz(this.c.g);
            case 142:
                return new dtaj((dqjj) this.a.ln.b(), (dqki) this.a.b.hE.b());
            case 143:
                return new dqwd((Context) this.a.q.b(), (ffsk) this.c.g.b(), this.c.A());
            case 144:
                akgb akgbVar4 = this.b;
                akgt akgtVar11 = this.c;
                return new draz(akgbVar4.d, akgtVar11.g, akgtVar11.bL, this.a.ll);
            case 145:
                return Optional.of((drau) this.a.b.lQ.b());
            case 146:
                akgb akgbVar5 = this.b;
                akgt akgtVar12 = this.c;
                return new drfd(akgbVar5.d, akgtVar12.g, akgtVar12.bL, this.a.ll);
            case 147:
                return new drff(this.c.D());
            case 148:
                return new dtaj((dqjj) this.a.ln.b(), (dqki) this.a.b.pS.b());
            case 149:
                return new drye(this.b.bx);
            case 150:
                return new drxx(this.c.g);
            case 151:
                return new drzz(this.c.ca, this.a.ll);
            case 152:
                return new dtbz((Context) this.b.d.b());
            case 153:
                return new drff(this.c.D());
            case 154:
                return new dtaj((dqjj) this.a.ln.b(), (dqki) this.a.b.pV.b());
            case 155:
                xgw xgwVar = (xgw) this.a.b.hK.b();
                ataz atazVar = new ataz(this.a.b.a.a.s);
                xgwVar.getClass();
                return new dsgx(xgwVar, ((ersq) atazVar.a.b()).a("bugle.enable_opening_shortcuts_directly"), 10);
            case 156:
                lmy lmyVar = (lmy) this.c.J.b();
                lmyVar.getClass();
                ConversationViewModel conversationViewModel = (ConversationViewModel) new lmw(lmyVar).a(ConversationViewModel.class);
                Object b = conversationViewModel.e.b();
                b.getClass();
                Object b2 = conversationViewModel.f.b();
                b2.getClass();
                return new dqls((dqmn) b, (dqlx) b2);
            case 157:
                return new egde(this.a.b.oC);
            case 158:
                akgb akgbVar6 = this.b;
                akko akkoVar3 = this.a.b;
                return new egbo(akgbVar6.bU, akkoVar3.jx, akkoVar3.jA);
            case 159:
                akgb akgbVar7 = this.b;
                akko akkoVar4 = this.a.b;
                return new egav(akgbVar7.bU, akkoVar4.jx, akkoVar4.jA);
            case 160:
                akgt akgtVar13 = this.c;
                akgb akgbVar8 = this.b;
                ea eaVar8 = (ea) ((fbbb) akgtVar13.d).a;
                eito eitoVar = (eito) akgbVar8.w.b();
                akgt akgtVar14 = this.c;
                emxc j = emxc.j("google");
                return new ejgy(eaVar8, eitoVar, j, (elbx) this.a.aJ.b());
            case 161:
                akgb akgbVar9 = this.b;
                akgt akgtVar15 = this.c;
                akis akisVar11 = this.a;
                return ekni.a(akgbVar9.bb(), (ea) ((fbbb) akgtVar15.d).a, akisVar11.b.kQ.b());
            case 162:
                ea eaVar9 = (ea) ((fbbb) this.c.d).a;
                if (eaVar9 instanceof emgi) {
                    return (emgi) eaVar9;
                }
                throw new IllegalStateException(a.J(eaVar9, emgm.class));
            case 163:
                return new smu();
            case 164:
                akis akisVar12 = this.a;
                akgb akgbVar10 = this.b;
                akgt akgtVar16 = this.c;
                fbbf fbbfVar11 = akgbVar10.aq;
                fbbf fbbfVar12 = akgtVar16.cn;
                return ahkb.a(akisVar12.a.IM, akgbVar10.H, fbbfVar12.b(), (ahkc) fbbfVar11.b(), (ahkd) this.c.co.b(), (ejlq) this.c.l.b(), (ejwl) this.c.k.b(), (errl) this.a.p.b());
            case 165:
                return new ahju();
            case 166:
                return new ahkd((ahkc) this.b.aq.b());
            case 167:
                akis akisVar13 = this.a;
                akgt akgtVar17 = this.c;
                fbbf fbbfVar13 = this.b.aU;
                return aive.a(akisVar13.a.IM, akgtVar17.cq.b(), (aium) fbbfVar13.b(), (ejlq) this.c.l.b(), (ejwl) this.c.k.b());
            case 168:
                return new aiva();
            case 169:
                return new cjjb();
            case 170:
                return Optional.of(new ugi());
            case 171:
                return new adgn(Optional.of(fbaz.a(this.c.cu)), Optional.of(this.c.c()));
            case 172:
                return new aepo();
            default:
                throw new AssertionError(i);
        }
    }
}
