package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.blockandreportspam.ui.dialog.BlockAndReportSpamCallbacks;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akgn implements fbbf {
    public final akis a;
    public final akfv b;
    public final akgo c;
    private final akhy d;
    private final akfy e;
    private final int f;

    public akgn(akis akisVar, akhy akhyVar, akfy akfyVar, akfv akfvVar, akgo akgoVar, int i) {
        this.a = akisVar;
        this.d = akhyVar;
        this.e = akfyVar;
        this.b = akfvVar;
        this.c = akgoVar;
        this.f = i;
    }

    /* JADX WARN: Type inference failed for: r1v341, types: [adif, java.lang.Object] */
    private final Object a() {
        int i = this.f;
        switch (i) {
            case 0:
                return ejlx.a((ea) ((fbbb) this.c.e).a);
            case 1:
                return new ejwk((ea) ((fbbb) this.c.e).a, (Executor) this.a.a.m.b());
            case 2:
                return new elhk(new ekww((elbx) this.d.ap.b()));
            case 3:
                return new axkt((axkm) this.a.a.ck.b(), (ffsk) this.a.a.q.b(), (cdkg) this.d.fI.b(), (cdnd) this.d.nw.b(), (cdhz) this.a.b.gZ.b());
            case 4:
                akkp akkpVar = this.a.a;
                return new cmpz(akkpVar.al, (ffsk) akkpVar.p.b());
            case 5:
                return new thb((eisx) this.d.b.b(), (axkm) this.a.a.ck.b(), (chje) this.d.o.b(), (ctvb) this.a.a.u.b(), (aolr) this.a.a.Z.b(), (ffsk) this.a.a.q.b(), (eixo) this.a.a.as.b());
            case 6:
                akgo akgoVar = this.c;
                return ejxo.a((ea) ((fbbb) akgoVar.e).a, (eklq) akgoVar.m.b(), (ejvw) this.a.aR.b(), (Executor) this.a.a.m.b());
            case 7:
                ea eaVar = (ea) ((fbbb) this.c.e).a;
                return eklq.a(eaVar, eaVar);
            case 8:
                return new byzz((ejvb) this.a.dy.b(), (ejvp) this.a.aR.b());
            case 9:
                akis akisVar = this.a;
                return new alcb(akisVar.a.dF, new alcs(), (Executor) akisVar.p.b());
            case 10:
                akgo akgoVar2 = this.c;
                return new arcs((ea) ((fbbb) akgoVar2.e).a, akgoVar2.f, akgoVar2.s, this.a.b.hr);
            case 11:
                akis akisVar2 = this.a;
                akgo akgoVar3 = this.c;
                return new ardb(akisVar2.q, akisVar2.t, akgoVar3.q, this.d.ap, akgoVar3.r);
            case 12:
                return new arbs((Context) this.a.q.b());
            case 13:
                return new sgw();
            case 14:
                return new deaj((Context) this.a.q.b(), (ctvs) this.a.aZ.b(), (ctwb) this.a.a.c.b(), (ddzb) this.a.a.nk.b());
            case 15:
                return wpi.a((ea) ((fbbb) this.c.e).a);
            case 16:
                return new adgn(Optional.of(fbaz.a(this.a.a.pX)), Optional.of(this.c.n()));
            case 17:
                return Optional.of(new ugi());
            case 18:
                return Optional.of((ajtb) this.a.a.FA.b());
            case 19:
                bpzk bpzkVar = bpzk.a;
                bpzkVar.getClass();
                return new ucq(new enpx(bpzkVar));
            case 20:
                return new akgj(this);
            case 21:
                csjk csjkVar = (csjk) this.a.a.el.b();
                akis akisVar3 = this.a;
                akkp akkpVar2 = akisVar3.a;
                fbbf fbbfVar = akisVar3.b.hs;
                ckds ckdsVar = (ckds) akkpVar2.dp.b();
                akkp akkpVar3 = this.a.a;
                fbbf fbbfVar2 = akkpVar3.br;
                azbq azbqVar = (azbq) akkpVar3.AO.b();
                akkp akkpVar4 = this.a.a;
                return new aqgi(csjkVar, fbbfVar, ckdsVar, fbbfVar2, azbqVar, akkpVar4.An, akkpVar4.iA);
            case 22:
                akis akisVar4 = this.a;
                akhy akhyVar = this.d;
                akgo akgoVar4 = this.c;
                akkp akkpVar5 = akisVar4.a;
                fbbf fbbfVar3 = akisVar4.cz;
                fbbf fbbfVar4 = akkpVar5.fR;
                fbbf fbbfVar5 = akkpVar5.dp;
                fbbf fbbfVar6 = akkpVar5.ft;
                fbbf fbbfVar7 = akkpVar5.fw;
                fbbf fbbfVar8 = akisVar4.q;
                fbbf fbbfVar9 = akisVar4.aO;
                fbbf fbbfVar10 = akkpVar5.c;
                fbbf fbbfVar11 = akkpVar5.ha;
                fbbf fbbfVar12 = akkpVar5.jd;
                fbbf fbbfVar13 = akkpVar5.ac;
                fbbf fbbfVar14 = akkpVar5.Bs;
                fbbf fbbfVar15 = akhyVar.bo;
                fbbf fbbfVar16 = akgoVar4.A;
                akko akkoVar = akisVar4.b;
                return new bcvs(fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, fbbfVar9, fbbfVar10, fbbfVar11, fbbfVar12, fbbfVar13, fbbfVar14, fbbfVar15, fbbfVar16, akhyVar.bn, akkpVar5.nQ, akkpVar5.iy, akkoVar.ht, akgoVar4.C, akhyVar.aF, akkpVar5.br, akkpVar5.Bb, akkoVar.hu, akisVar4.t);
            case 23:
                return new bdis((ckds) this.a.a.dp.b(), (cpbs) this.a.a.ft.b(), (aqgi) this.c.A.b(), this.a.a.br, this.d.aF);
            case 24:
                akko akkoVar2 = this.a.b;
                akkp akkpVar6 = akkoVar2.a.a;
                return Optional.of(new ajte(akkpVar6.p, akkpVar6.FA, akkoVar2.hx));
            case 25:
                akis akisVar5 = this.a;
                fbbf fbbfVar17 = akisVar5.cz;
                return new upg(akisVar5.aU, akisVar5.a.az, akisVar5.eb, (cqoh) fbbfVar17.b());
            case 26:
                return Optional.of((wmu) this.e.c.b());
            case 27:
                akgo akgoVar5 = this.c;
                akis akisVar6 = this.a;
                fbbf fbbfVar18 = akgoVar5.e;
                fbbf fbbfVar19 = akgoVar5.O;
                fbbf fbbfVar20 = akgoVar5.R;
                akko akkoVar3 = akisVar6.b;
                return new ukw(fbbfVar18, fbbfVar19, fbbfVar20, akkoVar3.hJ, akgoVar5.S, akgoVar5.U, akgoVar5.V, akgoVar5.W, akgoVar5.X, akgoVar5.ad, akgoVar5.ae, akgoVar5.af, akgoVar5.ag, akgoVar5.ah, akgoVar5.am, akkoVar3.hL, akgoVar5.aw, akgoVar5.ay, akisVar6.a.fo, akgoVar5.az, akkoVar3.hM, akkoVar3.hN, akgoVar5.aA, akgoVar5.aB);
            case 28:
                akfv akfvVar = this.b;
                akgo akgoVar6 = this.c;
                return new dsfh(akfvVar.i, akfvVar.k, akgoVar6.K, fbbg.a(akgoVar6.L), fbbg.a(akgoVar6.M), akgoVar6.N, akfvVar.l);
            case 29:
                akis akisVar7 = this.a;
                akgo akgoVar7 = this.c;
                return new dsxh(akisVar7.lm, akgoVar7.I, akgoVar7.J);
            case 30:
                return new dszm(this.b.i, this.c.H);
            case 31:
                return new dsxv(this.a.lm);
            case 32:
                return new dszj(this.b.i, this.c.H);
            case 33:
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
            case 34:
                akko akkoVar4 = this.a.b;
                enhd h2 = enhk.h(9);
                h2.k(dszr.b, akkoVar4.cN());
                h2.k(dszr.a, dqfe.a());
                h2.k(dszr.i, drch.a());
                h2.k(dszr.c, drdu.a());
                h2.k(dszr.d, drxf.a());
                h2.k(dszr.e, dsbi.a());
                h2.k(dszr.f, dsef.a());
                h2.k(dszr.g, dtks.a());
                h2.k(dszr.h, drir.a());
                return h2.c();
            case 35:
                return ejrm.a((ffhd) this.a.a.rZ.b(), (ea) ((fbbb) this.c.e).a);
            case 36:
                akis akisVar8 = this.a;
                akgo akgoVar8 = this.c;
                return new dqmx(akisVar8.b.hE, akgoVar8.P, akgoVar8.Q, this.d.jB);
            case 37:
                akis akisVar9 = this.a;
                return new dqnk(akisVar9.a.p, akisVar9.lm, akisVar9.b.hH);
            case 38:
                akis akisVar10 = this.a;
                return new dqng(akisVar10.a.p, akisVar10.b.hC);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return new uio(this.c.p, this.a.b.ht);
            case 40:
                akgo akgoVar9 = this.c;
                return new uit(akgoVar9.p, akgoVar9.T);
            case 41:
                return new uot((bcxm) this.a.a.nQ.b(), (bcwz) this.a.a.ad.b());
            case 42:
                return new uje(this.c.p, this.a.b.ht);
            case 43:
                akgo akgoVar10 = this.c;
                return new ujj(akgoVar10.p, akgoVar10.T);
            case 44:
                return new ujs(this.a.b.ht, this.c.T);
            case 45:
                akfv akfvVar2 = this.b;
                akis akisVar11 = this.a;
                akgo akgoVar11 = this.c;
                return new ulf(akfvVar2.i, akisVar11.b.ht, akgoVar11.Y, akgoVar11.p, akgoVar11.ac);
            case 46:
                return new adgn(Optional.of(fbaz.a(this.d.ls)), Optional.of(this.c.n()));
            case 47:
                return new adgn(Optional.of(fbaz.a(this.c.ab)), Optional.of(this.c.n()));
            case 48:
                ffsk ffskVar = (ffsk) this.a.a.q.b();
                akgo akgoVar12 = this.c;
                return new drur(ffskVar, akgoVar12.T(), (ea) ((fbbb) akgoVar12.e).a, akgoVar12.s(), this.c.o());
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return new drte((Context) this.a.q.b(), this.c.S());
            case 50:
                return new aeud((effy) this.d.of.b());
            case 51:
                akgo akgoVar13 = this.c;
                akis akisVar12 = this.a;
                akhy akhyVar2 = this.d;
                return new umh(akgoVar13.e, akisVar12.q, akisVar12.b.ht, akgoVar13.Y, akhyVar2.oe, akgoVar13.p, akgoVar13.ac);
            case 52:
                return new ulk(this.c.p, this.a.b.ht);
            case 53:
                akgo akgoVar14 = this.c;
                return new ulp(akgoVar14.p, akgoVar14.T);
            case 54:
                return new uly(this.a.b.ht, this.c.T);
            case 55:
                akgo akgoVar15 = this.c;
                akis akisVar13 = this.a;
                fbbf fbbfVar21 = akgoVar15.ai;
                akkp akkpVar7 = akisVar13.a;
                return new uoq(fbbfVar21, akkpVar7.q, akisVar13.hA, akisVar13.cz, akkpVar7.ad, akgoVar15.aj, akkpVar7.nk, akgoVar15.ak, akgoVar15.al);
            case 56:
                return new arby((Context) this.a.q.b(), (errm) this.a.p.b(), (errl) this.a.t.b(), new arbt(), (cvjg) this.a.a.wf.b());
            case 57:
                return new arca((ffsk) this.a.a.q.b());
            case 58:
                akis akisVar14 = this.a;
                return new aldm(akisVar14.a.dF, new alcs(), (Executor) akisVar14.p.b());
            case 59:
                akis akisVar15 = this.a;
                return new aldr(akisVar15.a.dF, new alcs(), (Executor) akisVar15.p.b());
            case 60:
                akgo akgoVar16 = this.c;
                return new unw(akgoVar16.as, akgoVar16.at, akgoVar16.au, akgoVar16.av, this.a.b.hK);
            case 61:
                akfv akfvVar3 = this.b;
                akgo akgoVar17 = this.c;
                akis akisVar16 = this.a;
                fbbf fbbfVar22 = akisVar16.co;
                fbbf fbbfVar23 = akgoVar17.ap;
                fbbf fbbfVar24 = akisVar16.cn;
                fbbf fbbfVar25 = akgoVar17.N;
                return new umy(akfvVar3.i, akgoVar17.ao, akgoVar17.p, fbbfVar22, fbbfVar23, akgoVar17.aq, akisVar16.q, akgoVar17.e, fbbfVar24, fbbfVar25, akgoVar17.ar, akisVar16.b.fn);
            case 62:
                akfv akfvVar4 = this.b;
                akis akisVar17 = this.a;
                akgo akgoVar18 = this.c;
                return new unt(akfvVar4.i, akisVar17.cz, akgoVar18.an, akisVar17.a.cf, akgoVar18.N);
            case 63:
                akkp akkpVar8 = this.a.a;
                fbbf fbbfVar26 = akkpVar8.dF;
                alcs alcsVar = new alcs();
                return new alct(fbbfVar26, alcsVar, (Executor) this.a.p.b());
            case 64:
                return new dbzh((ejtr) this.d.aB.b(), (Executor) this.a.t.b(), (cfyt) this.a.a.cf.b());
            case 65:
                return new dbzj((Context) this.a.q.b());
            case 66:
                Context context = (Context) this.a.q.b();
                csqw csqwVar = (csqw) this.a.a.hC.b();
                return new ddzq(context, csqwVar);
            case 67:
                akfv akfvVar5 = this.b;
                akgo akgoVar19 = this.c;
                akis akisVar18 = this.a;
                akhy akhyVar3 = this.d;
                return new ung(akfvVar5.i, akgoVar19.ao, akisVar18.co, akgoVar19.p, akhyVar3.bn, akisVar18.a.dr);
            case 68:
                return new unm(this.b.i, this.c.ao, this.a.jz);
            case 69:
                return new unn();
            case 70:
                return dqmg.a((lmy) this.c.ax.b());
            case 71:
                return dqmh.a((Activity) this.b.i.b(), (ea) ((fbbb) this.c.e).a, Optional.empty());
            case 72:
                return new cteg((ekmz) this.a.gH.b());
            case 73:
                return new dqme((Activity) this.b.i.b());
            case 74:
                return Optional.of((dris) this.a.b.hO.b());
            case 75:
                akfv akfvVar6 = this.b;
                return new ugc(akfvVar6.i, akfvVar6.n, akfvVar6.o, akfvVar6.p);
            case 76:
                return new adgn(Optional.of(fbaz.a(this.c.aE)), Optional.of(this.c.n()));
            case 77:
                akgo akgoVar20 = this.c;
                aerk q = akgoVar20.q();
                ea eaVar2 = (ea) ((fbbb) akgoVar20.e).a;
                akfv akfvVar7 = this.b;
                akis akisVar19 = this.a;
                akgo akgoVar21 = this.c;
                return new aerc(q, eaVar2, akfvVar7.G(), akisVar19.a.Px, akgoVar21.O(), akgoVar21.r());
            case 78:
                return new dcax(this.c.aT, this.a.aU);
            case 79:
                akgo akgoVar22 = this.c;
                dcjv M = akgoVar22.M();
                dcfz I = akgoVar22.I();
                dcbw F = akgoVar22.F();
                dccp G = akgoVar22.G();
                dcje L = akgoVar22.L();
                dcgz J = akgoVar22.J();
                dcdd H = akgoVar22.H();
                dbyl E = akgoVar22.E();
                dcbg dcbgVar = new dcbg();
                enhd enhdVar = new enhd();
                enhdVar.k(eymn.CAMERA_GALLERY, J);
                enhdVar.k(eymn.EMOJI, F);
                enhdVar.k(eymn.GALLERY, I);
                enhdVar.k(eymn.GIF, L);
                enhdVar.k(eymn.EXPRESSIVE_STICKER, G);
                enhdVar.k(eymn.LOCATION, M);
                enhdVar.k(eymn.CONTACT, E);
                enhdVar.k(eymn.FILE, H);
                enhdVar.k(eymn.CUSTOMIZATION, dcbgVar);
                return enhdVar.c();
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                akis akisVar20 = this.a;
                return new dcjr(akisVar20.a.r, akisVar20.cT);
            case 81:
                return ufs.a((eisx) this.d.b.b());
            case 82:
                akis akisVar21 = this.a;
                akgo akgoVar23 = this.c;
                akfv akfvVar8 = this.b;
                akhy akhyVar4 = this.d;
                fbbf fbbfVar27 = akisVar21.q;
                fbbf fbbfVar28 = akgoVar23.aH;
                akkp akkpVar9 = akisVar21.a;
                return new dcft(fbbfVar27, fbbfVar28, akisVar21.cz, akkpVar9.fo, akisVar21.cT, akfvVar8.r, akisVar21.t, akisVar21.ps, akkpVar9.nk, akisVar21.nR, akhyVar4.oe, akgoVar23.aJ, akkpVar9.ej);
            case 83:
                return new adgn(Optional.of(fbaz.a(this.c.aI)), Optional.of(this.c.n()));
            case 84:
                ffsk ffskVar2 = (ffsk) this.a.a.q.b();
                akgo akgoVar24 = this.c;
                return new aetk(ffskVar2, (ea) ((fbbb) akgoVar24.e).a, akgoVar24.s(), akgoVar24.T(), (aepg) this.d.ls.b(), this.c.o());
            case 85:
                Context context2 = (Context) this.a.q.b();
                ctud ctudVar = (ctud) this.a.cT.b();
                akis akisVar22 = this.a;
                ContentResolver O = akisVar22.O();
                errl errlVar = (errl) akisVar22.t.b();
                akgo akgoVar25 = this.c;
                return new dchy(context2, ctudVar, O, errlVar, akgoVar25.v(), akgoVar25.K());
            case 86:
                akgo akgoVar26 = this.c;
                return new dcbt(akgoVar26.p, this.a.b.hS, akgoVar26.aM);
            case 87:
                return new czdp();
            case 88:
                akis akisVar23 = this.a;
                akgo akgoVar27 = this.c;
                return new dccm(akisVar23.q, akisVar23.a.fP, akgoVar27.aO);
            case 89:
                return new cxqk(this.a.cz);
            case 90:
                Context context3 = (Context) this.a.q.b();
                akhy akhyVar5 = this.d;
                akis akisVar24 = this.a;
                return new dccj(context3, akhyVar5.mi, akisVar24.O(), (errl) akisVar24.cK.b(), (errl) this.a.ps.b(), this.a.a.vS);
            case 91:
                Context context4 = (Context) this.a.q.b();
                ctud ctudVar2 = (ctud) this.a.cT.b();
                akis akisVar25 = this.a;
                ContentResolver O2 = akisVar25.O();
                errl errlVar2 = (errl) akisVar25.t.b();
                akgo akgoVar28 = this.c;
                return new dchs(context4, ctudVar2, O2, errlVar2, akgoVar28.v(), akgoVar28.K());
            case 92:
                return true;
            case 93:
                return new dcba((ctyx) this.a.aU.b(), (enhk) this.c.aT.b());
            case 94:
                akis akisVar26 = this.a;
                akfv akfvVar9 = this.b;
                akgo akgoVar29 = this.c;
                return new uqz(akisVar26.cz, akfvVar9.t, akgoVar29.aW, akgoVar29.aY, (uwp) akisVar26.b.ia.b());
            case 95:
                return new ekyo((elbx) this.d.ap.b());
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                akgo akgoVar30 = this.c;
                akis akisVar27 = this.a;
                akhy akhyVar6 = this.d;
                fbbf fbbfVar29 = akgoVar30.aX;
                akko akkoVar5 = akisVar27.b;
                akkp akkpVar10 = akisVar27.a;
                return new uwi(fbbfVar29, akkpVar10.Gv, akkoVar5.hZ, akhyVar6.P, akhyVar6.ap, akkoVar5.hY, akkpVar10.sm, akkpVar10.vK, akkpVar10.m);
            case 97:
                return new uwn(this.d.ap);
            case 98:
                akis akisVar28 = this.a;
                return new ups(akisVar28.q, akisVar28.cz);
            case 99:
                return new uqj(this.a.cz, this.c.aW);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.f;
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return new cxqd((ekyo) this.c.aW.b());
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                akhy akhyVar = this.d;
                return Optional.of(new akpw(akhyVar.oh, akhyVar.a.a.vK));
            case 102:
                return Optional.of(new akqa((Context) this.a.b.a.q.b()));
            case 103:
                return new upl(this.c.af());
            case 104:
                Context context = (Context) this.a.q.b();
                cqoh cqohVar = (cqoh) this.a.cz.b();
                akgo akgoVar = this.c;
                ejlq ejlqVar = (ejlq) akgoVar.f.b();
                ea eaVar = (ea) ((fbbb) this.c.e).a;
                fazb a = fbaz.a(this.d.gQ);
                akgo akgoVar2 = this.c;
                return new ddll(context, cqohVar, akgoVar.bf, ejlqVar, eaVar, a, akgoVar2.bh, akgoVar2.bi);
            case 105:
                return new acdr((ea) ((fbbb) this.c.e).a);
            case 106:
                return new ddlw((Context) this.a.q.b(), (cqoh) this.a.cz.b(), (acdc) this.c.bg.b());
            case 107:
                return new acdc((Context) this.a.q.b());
            case 108:
                return new ddlv((Context) this.a.q.b(), (ddlw) this.c.bh.b(), (cnla) this.d.gQ.b(), (errl) this.a.p.b());
            case 109:
                akhy akhyVar2 = this.d;
                fazb a2 = fbaz.a(this.a.a.fP);
                dcxt dcxtVar = (dcxt) this.c.bl.b();
                akzt akztVar = (akzt) this.a.a.f.b();
                cpbs cpbsVar = (cpbs) this.a.a.ft.b();
                akkp akkpVar = this.a.a;
                ddzb ddzbVar = (ddzb) akkpVar.nk.b();
                elbx elbxVar = (elbx) this.d.ap.b();
                return new ddxs(akhyVar2.ob, a2, dcxtVar, akztVar, cpbsVar, akkpVar.Px, ddzbVar, elbxVar);
            case 110:
                akis akisVar = this.a;
                akkp akkpVar2 = akisVar.a;
                fbbf fbbfVar = akisVar.q;
                fbbf a3 = fbbg.a(akkpVar2.fP);
                akis akisVar2 = this.a;
                akhy akhyVar3 = this.d;
                akkp akkpVar3 = akisVar2.a;
                fbbf fbbfVar2 = akkpVar3.f;
                akko akkoVar = akisVar2.b;
                return new dcxt(fbbfVar, akisVar.aU, a3, fbbfVar2, akkoVar.hn, akkoVar.ie, akkpVar3.Cv, akkoVar.dk, akisVar2.cz, akkpVar3.gJ, akhyVar3.ap, akisVar2.aK, akkpVar3.bj, akkpVar3.cK, akhyVar3.ok, akkpVar3.bo);
            case 111:
                akhy akhyVar4 = this.d;
                akis akisVar3 = akhyVar4.a;
                akko akkoVar2 = akisVar3.b;
                vit l = akkoVar2.l();
                vip vipVar = new vip(new vjc(akhyVar4.ol, akkoVar2.ih, akhyVar4.om, akisVar3.lY, akhyVar4.ap), (cmsl) akhyVar4.a.lY.b());
                cndk cndkVar = (cndk) akhyVar4.mA.b();
                akis akisVar4 = akhyVar4.a;
                return Optional.of(new vfs(l, vipVar, cndkVar, akisVar4.b.k(), (cmsl) akisVar4.lY.b(), (errl) akhyVar4.a.t.b(), akhyVar4.a.a.jG(), (cyfw) akhyVar4.dJ.b()));
            case 112:
                return Optional.of(this.b.C());
            case 113:
                return Optional.of((ahka) this.c.bs.b());
            case 114:
                akhy akhyVar5 = this.d;
                akgo akgoVar3 = this.c;
                akfv akfvVar = this.b;
                fbbf fbbfVar3 = akgoVar3.br;
                fbbf fbbfVar4 = akgoVar3.bq;
                return ahkb.a(akhyVar5.iH, akgoVar3.bp, fbbfVar4.b(), akfvVar.q(), (ahkd) fbbfVar3.b(), (ejlq) this.c.f.b(), (ejwl) this.c.g.b(), (errl) this.a.p.b());
            case 115:
                return Optional.of(this.a.b.A());
            case 116:
                return new ahju();
            case 117:
                return new ahkd(this.b.q());
            case 118:
                return Optional.of((aivd) this.c.bv.b());
            case 119:
                akhy akhyVar6 = this.d;
                akgo akgoVar4 = this.c;
                akfv akfvVar2 = this.b;
                return aive.a(akhyVar6.iH, akgoVar4.bu.b(), akfvVar2.v(), (ejlq) akgoVar4.f.b(), (ejwl) this.c.g.b());
            case 120:
                return new aiva();
            case 121:
                Executor executor = (Executor) this.a.t.b();
                akis akisVar5 = this.a;
                return new vfa(executor, akisVar5.a.aT, (ejvp) akisVar5.aR.b());
            case 122:
                return new cyna(fbaz.a(this.c.by));
            case 123:
                return Optional.of(this.b.B());
            case 124:
                return new uqv((errm) this.a.p.b(), (wpk) this.c.v.b(), this.c.A());
            case 125:
                return new ddya(this.c.bB);
            case 126:
                errl errlVar = (errl) this.a.t.b();
                akis akisVar6 = this.a;
                fbbf fbbfVar5 = akisVar6.cz;
                akkp akkpVar4 = akisVar6.a;
                fbbf fbbfVar6 = akkpVar4.fP;
                fbbf fbbfVar7 = akkpVar4.az;
                fbbf fbbfVar8 = akkpVar4.lO;
                cqoh cqohVar2 = (cqoh) fbbfVar5.b();
                return new aemg(errlVar, fbbfVar6, fbbfVar7, akisVar6.aU, fbbfVar8, akisVar6.cN, cqohVar2);
            case 127:
                return new ddyf((errl) this.a.aK.b(), this.c.bB);
            case 128:
                return Optional.of(this.a.b.cq());
            case 129:
                akis akisVar7 = this.a;
                fbbf fbbfVar9 = akisVar7.a.dF;
                Executor executor2 = (Executor) akisVar7.p.b();
                akkp akkpVar5 = this.a.a;
                return new uxi(fbbfVar9, executor2, akkpVar5.dE, (ffsk) akkpVar5.q.b(), (ffhd) this.a.co.b(), (Context) this.a.q.b());
            case 130:
                return Optional.of((czvw) this.a.b.in.b());
            case 131:
                return new axor();
            case 132:
                akgo akgoVar5 = this.c;
                return Optional.of(new sjw((ea) ((fbbb) akgoVar5.e).a, akgoVar5.b.j(), akgoVar5.a.a.q(), (ffsk) akgoVar5.N.b()));
            case 133:
                return Optional.of(this.b.x());
            case 134:
                return Optional.of(this.a.b.T());
            case 135:
                return new wez((errm) this.a.t.b(), (wpk) this.c.v.b(), (bdtd) this.a.a.aO.b());
            case 136:
                akgo akgoVar6 = this.c;
                return new wds(akgoVar6.bM, this.b.i, this.d.ap, akgoVar6.bN);
            case 137:
                akis akisVar8 = this.a;
                akfv akfvVar3 = this.b;
                akkp akkpVar6 = akisVar8.a;
                return new wdr(akkpVar6.Df, akkpVar6.Z, akfvVar3.i);
            case 138:
                return new elet((elbx) this.d.ap.b());
            case 139:
                akhy akhyVar7 = this.d;
                akgo akgoVar7 = this.c;
                akis akisVar9 = this.a;
                fbbf fbbfVar10 = akhyVar7.fg;
                fbbf fbbfVar11 = akgoVar7.p;
                fbbf fbbfVar12 = akgoVar7.an;
                fbbf fbbfVar13 = akgoVar7.aU;
                fbbf fbbfVar14 = akgoVar7.aV;
                akkp akkpVar7 = akisVar9.a;
                return new czfy(fbbfVar10, fbbfVar11, fbbfVar12, fbbfVar13, fbbfVar14, akkpVar7.fP, akisVar9.jv, akisVar9.cz, akkpVar7.af, akgoVar7.T, akisVar9.b.ht, akkpVar7.nk, akkpVar7.iy);
            case 140:
                return new czfh(this.a.q);
            case 141:
                return new czgc(this.a.b.iq);
            case 142:
                return new csmj();
            case 143:
                return Optional.of(new aktt(this.d.oh));
            case 144:
                return new cycm(this.d.P, (errm) this.a.t.b());
            case 145:
                akis akisVar10 = this.a;
                akgo akgoVar8 = this.c;
                akfv akfvVar4 = this.b;
                akkp akkpVar8 = akisVar10.a;
                akko akkoVar3 = akisVar10.b;
                fbbf fbbfVar15 = akisVar10.q;
                fbbf fbbfVar16 = akkoVar3.id;
                fbbf fbbfVar17 = akkpVar8.ha;
                fbbf fbbfVar18 = akkpVar8.ft;
                fbbf fbbfVar19 = akkpVar8.ne;
                fbbf fbbfVar20 = akkpVar8.ni;
                fbbf fbbfVar21 = akkoVar3.iX;
                fbbf fbbfVar22 = akkoVar3.fn;
                fbbf a4 = fbbg.a(akkpVar8.fp);
                fbbf a5 = fbbg.a(this.a.a.rg);
                return new czrp(fbbfVar15, fbbfVar16, fbbfVar17, fbbfVar18, akisVar10.cT, akgoVar8.bV, akfvVar4.r, fbbfVar19, fbbfVar20, fbbfVar21, akkpVar8.Px, akgoVar8.ar, fbbfVar22, a4, a5);
            case 146:
                return new ctui();
            case 147:
                akis akisVar11 = this.a;
                akgo akgoVar9 = this.c;
                akfv akfvVar5 = this.b;
                akkp akkpVar9 = akisVar11.a;
                return new czrl(akkpVar9.nm, akisVar11.cT, akgoVar9.bV, akfvVar5.r, akkpVar9.nk, akkpVar9.f, akisVar11.jz, akisVar11.jy);
            case 148:
                akis akisVar12 = this.a;
                akhy akhyVar8 = this.d;
                akkp akkpVar10 = akisVar12.a;
                fbbf fbbfVar23 = akisVar12.jv;
                fbbf fbbfVar24 = akkpVar10.nj;
                altk altkVar = (altk) akkpVar10.fP.b();
                cpbs cpbsVar2 = (cpbs) this.a.a.ft.b();
                cstx cstxVar = (cstx) this.a.cp.b();
                akkp akkpVar11 = this.a.a;
                alde am = akkpVar11.am();
                akvz akvzVar = (akvz) akkpVar11.dE.b();
                akgo akgoVar10 = this.c;
                akis akisVar13 = this.a;
                Object Z = akgoVar10.Z();
                errl errlVar2 = (errl) akisVar13.t.b();
                akhy akhyVar9 = this.d;
                akko akkoVar4 = this.a.b;
                fbbf fbbfVar25 = akhyVar9.fo;
                Optional of = Optional.of((ugy) akkoVar4.hJ.b());
                akhy akhyVar10 = this.d;
                akgo akgoVar11 = this.c;
                akkp akkpVar12 = this.a.a;
                fbbf fbbfVar26 = akhyVar10.fd;
                fbbf fbbfVar27 = akkpVar12.qe;
                return new cxxh(fbbfVar23, fbbfVar24, akhyVar8.bb, altkVar, cpbsVar2, cstxVar, am, akvzVar, (cxwh) Z, errlVar2, fbbfVar25, of, fbbfVar26, akgoVar11.bY, akgoVar11.G, fbbfVar27);
            case 149:
                return Optional.of((wmf) this.a.a.Lc.b());
            case 150:
                return new ddyc(this.a.gH);
            case 151:
                eg egVar = (eg) this.b.m.b();
                akgo akgoVar12 = this.c;
                akis akisVar14 = this.a;
                akhy akhyVar11 = this.d;
                akkp akkpVar13 = akisVar14.a;
                return new taa(egVar, akgoVar12.cc, akkpVar13.Px, akhyVar11.ob, akkpVar13.Df, (elbx) akhyVar11.ap.b(), this.a.a.eT);
            case 152:
                akfv akfvVar6 = this.b;
                akhy akhyVar12 = this.d;
                akgo akgoVar13 = this.c;
                akis akisVar15 = this.a;
                akkp akkpVar14 = akisVar15.a;
                fbbf fbbfVar28 = akhyVar12.gu;
                fbbf fbbfVar29 = akhyVar12.an;
                fbbf fbbfVar30 = akkpVar14.nk;
                fbbf fbbfVar31 = akgoVar13.f;
                fbbf fbbfVar32 = akhyVar12.P;
                errl errlVar3 = (errl) akisVar15.t.b();
                return new BlockAndReportSpamCallbacks(akfvVar6.m, fbbfVar28, akgoVar13.cb, fbbfVar29, fbbfVar30, fbbfVar31, fbbfVar32, errlVar3);
            case 153:
                return new sxp((eg) this.b.m.b());
            case 154:
                return cgvd.a((ea) ((fbbb) this.c.e).a);
            case 155:
                ea eaVar2 = (ea) ((fbbb) this.c.e).a;
                akis akisVar16 = this.a;
                akhy akhyVar13 = this.d;
                akkp akkpVar15 = akisVar16.a;
                return new cvfa(eaVar2, akkpVar15.fp, akisVar16.fO, akkpVar15.Z, akhyVar13.ap, akkpVar15.az);
            case 156:
                return new ajsc();
            case 157:
                return new sft(this.a.a.az);
            case 158:
                return new ddpm(this.a.a.f);
            case 159:
                akgo akgoVar14 = this.c;
                akhy akhyVar14 = this.d;
                akis akisVar17 = this.a;
                return new czxf(akgoVar14.cj, akhyVar14.hv, akgoVar14.cd, akisVar17.a.eT);
            case 160:
                return new czxo((Context) this.a.q.b(), Optional.empty());
            case 161:
                akis akisVar18 = this.a;
                return new vyz(akisVar18.cI, akisVar18.a.Il);
            case 162:
                return new woi((ffsk) this.a.a.p.b(), (ffhd) this.a.cn.b(), (ffhd) this.a.co.b(), (comc) this.a.a.Lb.b(), (ejvb) this.a.dy.b());
            case 163:
                return new elew((elbx) this.d.ap.b());
            case 164:
                return Optional.of(this.c.g());
            case 165:
                return new wlw((Context) this.a.q.b());
            case 166:
                akgo akgoVar15 = this.c;
                return Optional.of(new whb((ea) ((fbbb) akgoVar15.e).a, akgoVar15.b.ob));
            case 167:
                return Optional.of((czti) this.c.cs.b());
            case 168:
                Context context2 = (Context) this.a.q.b();
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                ffhd ffhdVar = (ffhd) this.a.co.b();
                akgo akgoVar16 = this.c;
                Optional of2 = Optional.of((wov) this.e.f.b());
                akhy akhyVar15 = this.d;
                fbbf fbbfVar33 = this.a.cN;
                fbbf fbbfVar34 = akhyVar15.S;
                ecrj ecrjVar = (ecrj) fbbfVar33.b();
                akis akisVar19 = this.a;
                akgo akgoVar17 = this.c;
                akko akkoVar5 = akisVar19.b;
                fbbf fbbfVar35 = akkoVar5.jn;
                akkp akkpVar16 = akisVar19.a;
                return new czti(context2, ffskVar, ffhdVar, akgoVar16.cr, of2, fbbfVar34, ecrjVar, fbbfVar35, akgoVar17.bY, akgoVar17.cp, akkpVar16.nk, akkoVar5.hO, akgoVar17.G);
            case 169:
                return Optional.of((abad) this.a.b.jj.b());
            case 170:
                return Optional.of((wly) this.e.g.b());
            case 171:
                return Optional.of((wnp) this.c.cv.b());
            case 172:
                return new wnp((ffsk) this.c.N.b(), this.c.ag());
            case 173:
                akgo akgoVar18 = this.c;
                akis akisVar20 = this.a;
                akhy akhyVar16 = this.d;
                akkp akkpVar17 = akisVar20.a;
                return new cojr(akgoVar18.cx, akisVar20.aR, akhyVar16.ap, (ffsk) akkpVar17.aq.b());
            case 174:
                akis akisVar21 = this.a;
                akhy akhyVar17 = this.d;
                fbbf fbbfVar36 = akisVar21.q;
                fbbf fbbfVar37 = akisVar21.ds;
                akkp akkpVar18 = akisVar21.a;
                ffsk ffskVar2 = (ffsk) akkpVar18.aq.b();
                return new cojl(akkpVar18.Sq, fbbfVar36, fbbfVar37, akhyVar17.cT, ffskVar2);
            case 175:
                return new axoz((ffhd) this.a.cn.b(), (ffhd) this.a.co.b());
            case 176:
                return adpk.a((ea) ((fbbb) this.c.e).a);
            case 177:
                akis akisVar22 = this.a;
                fbbf fbbfVar38 = akisVar22.aZ;
                return new aedr(akisVar22.a.r, (ctvs) fbbfVar38.b(), this.a.a.nk, this.d.fm, this.c.cB);
            case 178:
                return new aeox((crjx) this.a.a.r.b(), (Context) this.b.i.b(), (elbx) this.d.ap.b());
            case 179:
                akhy akhyVar18 = this.d;
                return Optional.of(new adns(akhyVar18.b, akhyVar18.a.a.as));
            case 180:
                return Optional.of(this.b.c());
            case 181:
                akhy akhyVar19 = this.d;
                return Optional.of(new dbwa(Optional.of((bzme) akhyVar19.a.a.zK.b()), akhyVar19.oS));
            case 182:
                return Optional.of(new acxp(this.b.W));
            case 183:
                akhy akhyVar20 = this.d;
                akis akisVar23 = this.a;
                akgo akgoVar19 = this.c;
                return new bcri(akhyVar20.gP, akisVar23.a.sY, akgoVar19.cH);
            case 184:
                return new azwc(this.d.ap, this.c.aW);
            case 185:
                akgo akgoVar20 = this.c;
                ea eaVar3 = (ea) ((fbbb) akgoVar20.e).a;
                akis akisVar24 = this.a;
                fbbf fbbfVar39 = akgoVar20.cJ;
                akkp akkpVar19 = akisVar24.a;
                fbbf fbbfVar40 = akkpVar19.fP;
                fbbf fbbfVar41 = akkpVar19.f;
                fbbf fbbfVar42 = akkpVar19.c;
                cwll z = akgoVar20.z();
                dcxx dcxxVar = (dcxx) fbbfVar39.b();
                akgo akgoVar21 = this.c;
                return new dabe(eaVar3, fbbfVar40, fbbfVar41, fbbfVar42, akgoVar20.bl, z, dcxxVar, akgoVar21.cK, akgoVar21.cM);
            case 186:
                return new dcxx(this.a.a.c);
            case 187:
                return new clyt((cmel) this.a.a.vV.b(), (crln) this.a.a.Dr.b(), this.c.x(), (errl) this.a.t.b(), (errl) this.a.p.b(), (cqoh) this.a.cz.b());
            case 188:
                return new clya((cqoh) this.a.cz.b(), (errl) this.a.t.b(), (cmel) this.a.a.vV.b(), this.c.cL);
            case 189:
                ffhd ffhdVar2 = (ffhd) this.a.cP.b();
                ffsk ffskVar3 = (ffsk) this.a.a.aq.b();
                akis akisVar25 = this.a;
                akkp akkpVar20 = akisVar25.a;
                fbbf fbbfVar43 = akkpVar20.bi;
                fbbf fbbfVar44 = akkpVar20.cN;
                Context context3 = (Context) akisVar25.q.b();
                akis akisVar26 = this.a;
                return new cmfb(ffhdVar2, ffskVar3, fbbfVar43, fbbfVar44, context3, akisVar26.fM, akisVar26.a.Dr);
            case 190:
                akgo akgoVar22 = this.c;
                ea eaVar4 = (ea) ((fbbb) akgoVar22.e).a;
                akis akisVar27 = this.a;
                akkp akkpVar21 = akisVar27.a;
                return new dczm(eaVar4, akisVar27.b.jQ, akkpVar21.fP, akkpVar21.f, akgoVar22.cL);
            case 191:
                akis akisVar28 = this.a;
                akgo akgoVar23 = this.c;
                akkp akkpVar22 = akisVar28.a;
                return new dabh(akisVar28.aU, akkpVar22.f, akisVar28.cz, fbbg.a(akgoVar23.cQ));
            case 192:
                akis akisVar29 = this.a;
                fbbf fbbfVar45 = this.c.cP;
                akko akkoVar6 = akisVar29.b;
                return new cszo(akkoVar6.E, akkoVar6.J, fbaz.a(fbbfVar45), (errl) akisVar29.p.b());
            case 193:
                akko akkoVar7 = this.a.b;
                return new csze(new cszz((aipn) akkoVar7.a.a.rh.b(), akkoVar7.a.a.az), this.a.a.az);
            case 194:
                akis akisVar30 = this.a;
                akgo akgoVar24 = this.c;
                akkp akkpVar23 = akisVar30.a;
                return new ddbt(akkpVar23.fP, akkpVar23.f, akkpVar23.c, akkpVar23.Px, akkpVar23.vV, akkpVar23.Df, akisVar30.t, akisVar30.aK, akgoVar24.bl, akkpVar23.bj, akkpVar23.cK, akgoVar24.cL, akkpVar23.gE, akkpVar23.Z);
            case 195:
                akis akisVar31 = this.a;
                return new dcyu(akisVar31.t, akisVar31.aK, akisVar31.a.EP);
            case 196:
                Context context4 = (Context) this.b.i.b();
                Activity activity = (Activity) this.b.i.b();
                errl errlVar4 = (errl) this.a.t.b();
                ellq ellqVar = (ellq) this.b.e.b();
                elbx elbxVar2 = (elbx) this.d.ap.b();
                aejb aejbVar = new aejb(this.c.ab());
                tam tamVar = (tam) this.b.s.b();
                akis akisVar32 = this.a;
                return new aehw(context4, activity, errlVar4, ellqVar, elbxVar2, aejbVar, tamVar, akisVar32.a.C, akisVar32.b.kb, Optional.of(new cyvs()));
            case 197:
                return new aeiu(Optional.of(this.c.i()), this.c.aW);
            case 198:
                return enip.o(this.c.ac());
            case 199:
                return new ddbg((clzh) this.a.a.Pw.b(), (cmao) this.a.b.kc.b(), (ajid) this.c.cW.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        int i = this.f;
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                akis akisVar = this.a;
                cqoh cqohVar = (cqoh) akisVar.cz.b();
                ejvp ejvpVar = (ejvp) this.a.aR.b();
                akgo akgoVar = this.c;
                akkp akkpVar = this.a.a;
                return new ajid(akisVar.aU, cqohVar, ejvpVar, akgoVar.cV, akkpVar.Pt);
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                return new ajih(this.a.a.C);
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                return new cvpb(this.a.a.C);
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                akhy akhyVar = this.d;
                akgo akgoVar2 = this.c;
                fbbf fbbfVar = akgoVar2.dg;
                return new aenw(akhyVar.ap, fbaz.a(akgoVar2.db), fbaz.a(fbbfVar), (ejxn) akgoVar2.n.b());
            case 204:
                akis akisVar2 = this.a;
                return new cxig(akisVar2.b.kg, akisVar2.aR);
            case 205:
                akgo akgoVar3 = this.c;
                return enhk.n(cxhv.DELETE, akgoVar3.k(), cxhv.ARCHIVE, akgoVar3.j(), cxhv.MARK_AS_READ_OR_UNREAD, akgoVar3.l());
            case 206:
                return aeor.a(this.c.X());
            case 207:
                return aeoq.a(this.c.X());
            case 208:
                return ((aeop) this.c.X()).a("animated-mark-as-unread-icon.json");
            case 209:
                return aeos.a(this.c.X());
            case 210:
                return new cgdc(this.c.w(), this.a.mu);
            case 211:
                return Optional.of((aend) this.a.od.b());
            case 212:
                return Optional.of((dbtn) this.c.dm.b());
            case 213:
                ea eaVar = (ea) ((fbbb) this.c.e).a;
                eisx eisxVar = (eisx) this.d.b.b();
                ejlq ejlqVar = (ejlq) this.c.f.b();
                akgo akgoVar4 = this.c;
                akis akisVar3 = this.a;
                akfv akfvVar = this.b;
                return new dbtn(eaVar, eisxVar, ejlqVar, akgoVar4.dk, akisVar3.a.Px, akgoVar4.dl, akfvVar.J, akfvVar.L);
            case 214:
                return new dbtr();
            case 215:
                eisx eisxVar2 = (eisx) this.d.b.b();
                akis akisVar4 = this.a;
                akhy akhyVar2 = this.d;
                akkp akkpVar2 = akisVar4.a;
                fbbf fbbfVar2 = akkpVar2.as;
                fbbf fbbfVar3 = akkpVar2.cX;
                fbbf fbbfVar4 = akhyVar2.ec;
                chvu dk = akhyVar2.dk();
                bzic bzicVar = (bzic) akhyVar2.np.b();
                akkp akkpVar3 = this.a.a;
                return new bzjx(eisxVar2, fbbfVar2, fbbfVar3, fbbfVar4, akhyVar2.nF, akisVar4.pd, dk, bzicVar, akkpVar3.C, (ffsk) akkpVar3.p.b(), (ffsk) this.a.a.q.b());
            case 216:
                akfv akfvVar2 = this.b;
                akis akisVar5 = this.a;
                akgo akgoVar5 = this.c;
                akkp akkpVar4 = akisVar5.a;
                return new czza(akfvVar2.i, akkpVar4.ff, akkpVar4.ft, akisVar5.cX, akgoVar5.ds, akisVar5.b.ki, akkpVar4.Z, akkpVar4.RR);
            case 217:
                return Optional.of(new aemk((engw) this.c.dr.b()));
            case 218:
                akgo akgoVar6 = this.c;
                return aemj.a(akgoVar6.N(), akgoVar6.B(), akgoVar6.D(), akgoVar6.C(), this.a.b.kh, akgoVar6.dq);
            case 219:
                errl errlVar = (errl) this.a.t.b();
                dtuu dtuuVar = (dtuu) this.a.a.ay.b();
                akis akisVar6 = this.a;
                akhy akhyVar3 = this.d;
                return new ajhr(errlVar, dtuuVar, akisVar6.a.fo, akisVar6.b.P, akhyVar3.O);
            case 220:
                return new adzb((Context) this.a.q.b());
            case 221:
                return new aegl((Context) this.b.i.b(), (ejlq) this.c.f.b(), (ffsk) this.a.a.q.b());
            case 222:
                eg egVar = (eg) this.b.m.b();
                akgo akgoVar7 = this.c;
                akis akisVar7 = this.a;
                akhy akhyVar4 = this.d;
                return new acdy(egVar, akgoVar7.du, akisVar7.a.f, (elbx) akhyVar4.ap.b());
            case 223:
                akis akisVar8 = this.a;
                akhy akhyVar5 = this.d;
                return new ahgl(fbaz.a(akisVar8.cz), akhyVar5.gn, akisVar8.cs, akisVar8.a.Z);
            case 224:
                akgo akgoVar8 = this.c;
                return new adsg(akgoVar8.dw, akgoVar8.dx, this.a.a.Pt);
            case 225:
                akis akisVar9 = this.a;
                enhd h = enhk.h(6);
                h.k("SuperSortPromo", akisVar9.b.S());
                h.k("IMessagePromo", this.b.f());
                h.k("DittoBatteryPromo", this.b.e());
                h.k("VerifiedSmsInvestigativeRpcPromo", this.b.g());
                h.k("BlockListAutoMigratedPromo", this.b.d());
                h.k("GaiaPairingPromo", new adsr());
                return h.c();
            case 226:
                akfv akfvVar3 = this.b;
                return enhk.m("DataDonationNotification", akfvVar3.F(), "ScheduledSendTooltip", akfvVar3.z());
            case 227:
                akgo akgoVar9 = this.c;
                return enip.r(akgoVar9.t(), akgoVar9.u());
            case 228:
                akis akisVar10 = this.a;
                return new alef(akisVar10.a.bi, akisVar10.eb);
            case 229:
                return Optional.of(this.b.y());
            case 230:
                return Optional.of(new ahgq(this.c.dC));
            case 231:
                akfv akfvVar4 = this.b;
                return enip.s(akfvVar4.t(), akfvVar4.u(), (ejlr) this.c.cX.b());
            case 232:
                return Optional.of(new aego());
            case 233:
                return Optional.of(this.c.P());
            case 234:
                return new aedw();
            case 235:
                return new aeem((aedw) this.c.dG.b());
            case 236:
                return Optional.of((ajem) this.c.dI.b());
            case 237:
                ejlq ejlqVar2 = (ejlq) this.c.f.b();
                ejxn ejxnVar = (ejxn) this.c.n.b();
                elbx elbxVar = (elbx) this.d.ap.b();
                Optional optional = (Optional) this.a.cs.b();
                akis akisVar11 = this.a;
                akhy akhyVar6 = this.d;
                return new ajem(ejlqVar2, ejxnVar, elbxVar, optional, akisVar11.a.Z, akhyVar6.aE, akhyVar6.ao, akhyVar6.aG, akisVar11.b.kk);
            case 238:
                return new elhe((elbx) this.d.ap.b());
            case 239:
                akkp akkpVar5 = this.a.a;
                return new cluo(akkpVar5.az, akkpVar5.f);
            case 240:
                ea eaVar2 = (ea) ((fbbb) this.c.e).a;
                akis akisVar12 = this.a;
                fbbf fbbfVar5 = akisVar12.b.kc;
                akkp akkpVar6 = akisVar12.a;
                return new ddat(eaVar2, fbbfVar5, akkpVar6.Pw, akkpVar6.Px);
            case 241:
                return Optional.of(this.a.b.Q());
            case 242:
                akgo akgoVar10 = this.c;
                ea eaVar3 = (ea) ((fbbb) akgoVar10.e).a;
                akkp akkpVar7 = this.a.a;
                fbbf fbbfVar6 = akgoVar10.dR;
                ffsk ffskVar = (ffsk) akkpVar7.aq.b();
                akgo akgoVar11 = this.c;
                akis akisVar13 = this.a;
                fbbf fbbfVar7 = akgoVar11.cW;
                return new dcyp(eaVar3, fbbfVar6, ffskVar, akgoVar11.bl, akgoVar11.cL, akisVar13.a.fP, (ajid) fbbfVar7.b());
            case 243:
                ffsk ffskVar2 = (ffsk) this.a.a.aq.b();
                ffsk ffskVar3 = (ffsk) this.a.a.p.b();
                akgo akgoVar12 = this.c;
                akis akisVar14 = this.a;
                akkp akkpVar8 = akisVar14.a;
                fbbf fbbfVar8 = akkpVar8.Dr;
                csjk csjkVar = (csjk) akkpVar8.fQ.b();
                akis akisVar15 = this.a;
                akkp akkpVar9 = akisVar15.a;
                return new dcyg(ffskVar2, ffskVar3, akgoVar12.bl, akisVar14.aU, fbbfVar8, csjkVar, akisVar15.aQ, akkpVar9.cK, akkpVar9.bj, akkpVar9.wi);
            case 244:
                akis akisVar16 = this.a;
                akkp akkpVar10 = akisVar16.a;
                asjq ai = akisVar16.b.ai();
                axkm axkmVar = (axkm) akkpVar10.ck.b();
                akfv akfvVar5 = this.b;
                return new aeep(ai, axkmVar, akfvVar5.X, (axmm) this.a.a.qL.b());
            case 245:
                akis akisVar17 = this.a;
                fbbf fbbfVar9 = akisVar17.a.az;
                fbbf fbbfVar10 = akisVar17.n;
                return new axpn(fbbfVar9, fbbfVar10, (errl) this.a.t.b());
            case 246:
                akgo akgoVar13 = this.c;
                return new aekp(akgoVar13.ad(), (byzz) akgoVar13.o.b(), (ejvp) this.a.aR.b(), (aubi) this.a.b.ko.b());
            case 247:
                return Optional.of(this.c.h());
            case 248:
                ffsk ffskVar4 = (ffsk) this.a.a.aq.b();
                dkvu dkvuVar = (dkvu) this.a.hl.b();
                akis akisVar18 = this.a;
                return new deip(ffskVar4, dkvuVar, akisVar18.b.cf(), (eixo) akisVar18.a.as.b(), (ejvb) this.a.dy.b());
            case 249:
                return new adjk((dwch) this.a.b.kr.b(), this.a.b.kt);
            case 250:
                return new adkf(this.a.a.C);
            case 251:
                return Optional.of(this.c.m());
            case 252:
                return Optional.of((dqdf) this.c.ef.b());
            case 253:
                Context context = (Context) this.a.q.b();
                ffhd ffhdVar = (ffhd) this.a.co.b();
                lmy lmyVar = (lmy) this.c.ax.b();
                Optional of = Optional.of(new dpnf(null));
                this.c.a.a.q.getClass();
                return uii.a(context, ffhdVar, lmyVar, of, (sfz) this.a.nR.b(), (ejmh) this.a.hA.b(), Optional.of(this.c.Q()), Optional.empty(), this.a.b.kB);
            case 254:
                dpaa dpaaVar = (dpaa) this.c.eb.b();
                ernh ernhVar = (ernh) this.a.lm.b();
                fazb a = fbaz.a(this.a.b.ku);
                akhy akhyVar7 = this.d;
                akis akisVar19 = this.a;
                return new dozh(dpaaVar, ernhVar, a, fbaz.a(akhyVar7.oY), akhyVar7.oW, akisVar19.b.ky);
            case PrivateKeyType.INVALID /* 255 */:
                return new dpaa((Context) this.a.q.b(), (ffsk) this.c.ea.b());
            case 256:
                return dsfe.a((ffhd) this.a.cP.b());
            case 257:
                return Optional.of(this.a.b.j());
            case 258:
                return new akgk(this);
            case 259:
                return new adzt((errl) this.a.p.b(), this.a.gH);
            case 260:
                return Optional.of(this.d.u());
            case 261:
                return Optional.of(this.b.w());
            case 262:
                return Optional.of((adzm) this.c.el.b());
            case 263:
                return new adzm(this.b.b(), (ffsk) this.c.N.b(), (lkk) this.c.ek.b(), new atxl(this.a.b.a.a.s));
            case 264:
                return eklf.a((ea) ((fbbb) this.c.e).a);
            case 265:
                return Optional.of(new aemx());
            case 266:
                return Optional.of((aehc) this.c.eo.b());
            case 267:
                return new aehc((ea) ((fbbb) this.c.e).a, this.d.b, (ffsk) this.a.a.p.b(), Optional.of(this.a.b.N()), this.a.a.al);
            case 268:
                return Optional.of((ajgd) this.a.b.kk.b());
            case 269:
                return new ajcb(this.a.a.Z);
            case 270:
                return new cgiw((elbx) this.d.ap.b(), this.a.b.kF);
            case 271:
                return new enpx(this.d.eF());
            case 272:
                return new akgl();
            case 273:
                akgo akgoVar14 = this.c;
                return new ahmx(akgoVar14.e, akgoVar14.O, akgoVar14.ev, akgoVar14.ew);
            case 274:
                akfv akfvVar6 = this.b;
                return new ahmo(akfvVar6.m, this.c.e, akfvVar6.k, akfvVar6.o);
            case 275:
                return new ahmn((dqlu) this.c.ay.b(), (dqme) this.c.aA.b(), new atdw(this.a.b.a.a.s), this.c.R());
            case 276:
                return ahug.a((ea) ((fbbb) this.c.e).a);
            case 277:
                ea eaVar4 = (ea) ((fbbb) this.c.e).a;
                if (eaVar4 instanceof cvqu) {
                    return (cvqu) eaVar4;
                }
                throw new IllegalStateException(a.J(eaVar4, cvri.class));
            case 278:
                return new akgm(this);
            case 279:
                return new cwvh((Context) this.b.i.b(), (ctxt) this.a.mx.b());
            case 280:
                return Optional.of(this.b.p());
            case 281:
                return new cwxz();
            case 282:
                return new cixd((Context) this.a.q.b());
            case 283:
                return Optional.of(this.a.b.cp());
            case 284:
                return new ejzc((ea) ((fbbb) this.c.e).a, (ejvw) this.a.aR.b(), (Executor) this.a.a.m.b());
            case 285:
                Context context2 = (Context) this.a.q.b();
                ffsk ffskVar5 = (ffsk) this.a.a.p.b();
                akis akisVar20 = this.a;
                akhy akhyVar8 = this.d;
                akkp akkpVar11 = akisVar20.b.a.a;
                fbbf fbbfVar11 = akhyVar8.M;
                final fbbf fbbfVar12 = akkpVar11.s;
                asng asngVar = new asng() { // from class: arrp
                    @Override // defpackage.asng
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_sub_id_in_chat_identity_based_settings");
                    }
                };
                akkp akkpVar12 = akisVar20.a;
                return new cwuo(context2, ffskVar5, akkpVar12.Px, fbbfVar11, asngVar, akkpVar12.c);
            case 286:
                akgo akgoVar15 = this.c;
                return ekni.a(akgoVar15.Y(), (ea) ((fbbb) akgoVar15.e).a, this.a.b.kQ.b());
            case 287:
                Context context3 = (Context) this.a.q.b();
                akis akisVar21 = this.a;
                fbbf fbbfVar13 = akisVar21.cz;
                akkp akkpVar13 = akisVar21.a;
                fbbf fbbfVar14 = akkpVar13.fP;
                cqoh cqohVar2 = (cqoh) fbbfVar13.b();
                ExecutorService executorService = (ExecutorService) this.a.p.b();
                akis akisVar22 = this.a;
                akko akkoVar = akisVar22.b;
                akkp akkpVar14 = akisVar22.a;
                return new cwqc(context3, akisVar21.cT, akkpVar13.Px, fbbfVar14, cqohVar2, executorService, akkpVar14.Dt, akkpVar14.u, akkpVar14.sY, akkoVar.kR, akkpVar14.f);
            case 288:
                return Optional.of((sfc) this.c.eK.b());
            case 289:
                return new sfc();
            case 290:
                return new ahoq((ctyx) this.a.aU.b(), (ctyz) this.a.fM.b(), (Context) this.a.q.b(), (ejvb) this.a.dy.b(), (errl) this.a.t.b(), (errl) this.a.p.b(), (ejvp) this.a.aR.b(), (ahns) this.a.b.f21io.b());
            case 291:
                ea eaVar5 = (ea) ((fbbb) this.c.e).a;
                if (eaVar5 instanceof cynv) {
                    return (cynv) eaVar5;
                }
                throw new IllegalStateException(a.J(eaVar5, cyof.class));
            case 292:
                ea eaVar6 = (ea) ((fbbb) this.c.e).a;
                if (eaVar6 instanceof dbqf) {
                    return (dbqf) eaVar6;
                }
                throw new IllegalStateException(a.J(eaVar6, dbqg.class));
            case 293:
                return new bcxh(this.c.cH);
            case 294:
                akis akisVar23 = this.a;
                akhy akhyVar9 = this.d;
                akfv akfvVar7 = this.b;
                akgo akgoVar16 = this.c;
                akko akkoVar2 = akisVar23.b;
                akkp akkpVar15 = akisVar23.a;
                return new dbrj(akkpVar15.xi, akkoVar2.hn, akkpVar15.f, akkpVar15.C, akkpVar15.ql, akisVar23.gX, akhyVar9.mc, akkpVar15.jZ, akfvVar7.e, akhyVar9.ap, akkpVar15.r, akgoVar16.dn, akkoVar2.hp);
            case 295:
                ea eaVar7 = (ea) ((fbbb) this.c.e).a;
                if (eaVar7 instanceof dbud) {
                    return (dbud) eaVar7;
                }
                throw new IllegalStateException(a.J(eaVar7, dbuw.class));
            case 296:
                akgo akgoVar17 = this.c;
                akis akisVar24 = this.a;
                akhy akhyVar10 = this.d;
                akkp akkpVar16 = akisVar24.a;
                return new dbtx(akgoVar17.eR, akkpVar16.xi, akhyVar10.ap, akkpVar16.C, akisVar24.gH);
            case 297:
                Context context4 = (Context) this.a.q.b();
                akgo akgoVar18 = this.c;
                akzt akztVar = (akzt) this.a.a.f.b();
                csum csumVar = (csum) this.a.a.dr.b();
                ctap ctapVar = (ctap) this.a.a.co.b();
                cbar cbarVar = (cbar) this.a.cB.b();
                akkp akkpVar17 = this.a.a;
                return new dcgl(context4, akgoVar18.an, akztVar, csumVar, ctapVar, cbarVar, akkpVar17.Px, (ctfj) akkpVar17.nP.b(), (cqoh) this.a.cz.b());
            case 298:
                return new dchr((Context) this.a.q.b(), (errl) this.a.t.b(), (lkr) ((fbbb) this.c.e).a, (ejtr) this.d.aB.b(), (elbx) this.d.ap.b(), (ejvp) this.a.aR.b(), this.c.v(), (ctud) this.a.cT.b(), (cqoh) this.a.cz.b(), this.c.K());
            case 299:
                return new ddoe((ffsk) this.a.a.aq.b(), (ddqh) this.a.b.fo.b(), this.c.ae());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        int i = this.f;
        int i2 = i / 100;
        if (i2 == 0) {
            return a();
        }
        if (i2 == 1) {
            return c();
        }
        if (i2 == 2) {
            return d();
        }
        switch (i) {
            case 300:
                ea eaVar = (ea) ((fbbb) this.c.e).a;
                if (eaVar instanceof deiv) {
                    return (deiv) eaVar;
                }
                throw new IllegalStateException(a.J(eaVar, deji.class));
            case 301:
                return new smu();
            case 302:
                return new cjjb();
            case 303:
                return new adgn(Optional.of(fbaz.a(this.c.eZ)), Optional.of(this.c.n()));
            case 304:
                return new aepo();
            case 305:
                return ((emxn) emxc.j((ekji) this.c.fb.b())).a;
            case 306:
                return ekjl.a((ea) ((fbbb) this.c.e).a);
            default:
                throw new AssertionError(i);
        }
    }
}
