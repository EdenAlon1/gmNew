package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.samsung.settings.CmcUserConsentSettingsActivity;
import com.google.android.apps.messaging.ui.appsettings.SimSelectionSettingsActivity;
import com.google.android.apps.messaging.ui.conversation.rbm.OpenRbmDeepLinkActivity;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.libraries.user.profile.photopicker.fragment.devicephotos.DevicePhotosFragment;
import com.google.chat.smartmessaging.penpal.ui.EmotifyActivity;
import j$.util.Optional;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.chromium.net.CronetEngine;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akga implements fbbf {
    private final akis a;
    private final akgg b;
    private final akgb c;
    private final int d;

    public akga(akis akisVar, akgg akggVar, akgb akgbVar, int i) {
        this.a = akisVar;
        this.b = akggVar;
        this.c = akgbVar;
        this.d = i;
    }

    /* JADX WARN: Type inference failed for: r4v15, types: [eiuk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v9, types: [eitw, java.lang.Object] */
    private final Object a() {
        int i = this.d;
        switch (i) {
            case 0:
                Activity activity = this.c.a;
                if (activity != null) {
                    return activity;
                }
                throw new IllegalStateException("Attempted use of the activity when it is null");
            case 1:
                Context context = (Context) this.a.q.b();
                akis akisVar = this.a;
                fbbf fbbfVar = akisVar.cz;
                akkp akkpVar = akisVar.a;
                fbbf fbbfVar2 = akkpVar.fP;
                cqoh cqohVar = (cqoh) fbbfVar.b();
                ExecutorService executorService = (ExecutorService) this.a.p.b();
                akis akisVar2 = this.a;
                akko akkoVar = akisVar2.b;
                akkp akkpVar2 = akisVar2.a;
                return new cwqc(context, akisVar.cT, akkpVar.Px, fbbfVar2, cqohVar, executorService, akkpVar2.Dt, akkpVar2.u, akkpVar2.sY, akkoVar.kR, akkpVar2.f);
            case 2:
                return new ctuo((eg) this.c.f.b(), (cqoh) this.a.cz.b(), (ctuc) this.a.cT.b());
            case 3:
                Activity activity2 = (Activity) this.c.d.b();
                try {
                    eg egVar = (eg) activity2;
                    egVar.getClass();
                    return egVar;
                } catch (ClassCastException e) {
                    throw new IllegalStateException("Expected activity to be a FragmentActivity: ".concat(String.valueOf(String.valueOf(activity2))), e);
                }
            case 4:
                akis akisVar3 = this.a;
                Optional of = Optional.of(new cwmx());
                akkp akkpVar3 = this.a.a;
                return new cwmk(akisVar3.a.RV, of, akkpVar3.RR, akkpVar3.RU);
            case 5:
                Context context2 = (Context) this.c.d.b();
                akgb akgbVar = this.c;
                akis akisVar4 = this.a;
                fazb a = fbaz.a(akgbVar.i);
                fbbf fbbfVar3 = akisVar4.b.nI;
                errl errlVar = (errl) akisVar4.p.b();
                akis akisVar5 = this.a;
                return new acgj(context2, a, fbbfVar3, errlVar, akisVar5.a.fP, akisVar5.nX);
            case 6:
                return new acgg((Context) this.a.q.b(), (cqoh) this.a.cz.b(), (errl) this.a.p.b());
            case 7:
                return new ddwp();
            case 8:
                return suu.a((Activity) this.c.d.b());
            case 9:
                return new tam();
            case 10:
                eito eitoVar = (eito) this.c.v.b();
                eitoVar.getClass();
                return eitoVar;
            case 11:
                ekki ekkiVar = (ekki) this.c.n.b();
                akgb akgbVar2 = this.c;
                return new eits(ekkiVar, akgbVar2.aZ(), akgbVar2.aS(), akgbVar2.aM(), (ejlq) akgbVar2.u.b(), (eivw) this.c.o.b(), (eixi) this.c.p.b(), (eiwj) this.a.b.nZ.b(), (eivc) this.a.a.Ul.b(), (emxc) ((fbbb) this.c.q).a, emxc.j(eixj.a()));
            case 12:
                return ekle.a(this.c.aT(), null);
            case 13:
                ekki ekkiVar2 = (ekki) this.c.n.b();
                eivw eivwVar = (eivw) this.c.o.b();
                eixi eixiVar = (eixi) this.c.p.b();
                akgb akgbVar3 = this.c;
                return new eiwo(ekkiVar2, eivwVar, eixiVar, (emxc) ((fbbb) akgbVar3.q).a, (ekjp) akgbVar3.s.b());
            case 14:
                return new eivw(this.c.be());
            case 15:
                return new eixi((ekki) this.c.n.b());
            case 16:
                return new ekjp((ekki) this.c.n.b(), this.c.bk());
            case 17:
                return emxc.j(this.c.aK());
            case 18:
                ekki ekkiVar3 = (ekki) this.c.n.b();
                eivw eivwVar2 = (eivw) this.c.o.b();
                eixi eixiVar2 = (eixi) this.c.p.b();
                akgb akgbVar4 = this.c;
                return new eiwq(ekkiVar3, eivwVar2, eixiVar2, (emxc) ((fbbb) akgbVar4.q).a, (ekjp) akgbVar4.s.b());
            case 19:
                final ekki ekkiVar4 = (ekki) this.c.n.b();
                ekkiVar4.getClass();
                ffbr ffbrVar = new ffbr() { // from class: ejlv
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        return ekki.this.a();
                    }
                };
                lkk P = ekkiVar4.P();
                Boolean bool = false;
                bool.getClass();
                return new ejlu(ffbrVar, ekkiVar4, P);
            case 20:
                ekki ekkiVar5 = (ekki) this.c.n.b();
                akgb akgbVar5 = this.c;
                return new eiue(ekkiVar5, akgbVar5.ba(), akgbVar5.aS(), akgbVar5.aM(), (ejlq) akgbVar5.u.b(), (eivw) this.c.o.b(), (eixi) this.c.p.b(), (eiwj) this.a.b.nZ.b(), (eivc) this.a.a.Ul.b(), (emxc) ((fbbb) this.c.q).a, emxc.j(eixj.a()));
            case 21:
                return new adio((cfyt) this.a.a.cf.b(), (eito) this.c.w.b(), (Activity) this.c.d.b(), this.a.a.f);
            case 22:
                return new uhb((Activity) this.c.d.b(), (ddwp) this.c.k.b(), (cxzh) this.c.y.b());
            case 23:
                return new cxzh();
            case 24:
                return new uhd((Activity) this.c.d.b());
            case 25:
                return new uij((eg) this.c.f.b());
            case 26:
                eg egVar2 = (eg) this.c.f.b();
                akgb akgbVar6 = this.c;
                akis akisVar6 = this.a;
                fbbf fbbfVar4 = akisVar6.cz;
                return new uph(egVar2, akgbVar6.C, akisVar6.a.az, (cqoh) fbbfVar4.b());
            case 27:
                return new adhk(Optional.empty());
            case 28:
                return new vyx();
            case 29:
                return new wfj((eg) this.c.f.b());
            case 30:
                return abyp.a((Activity) this.c.d.b());
            case 31:
                return Optional.of(this.a.b.A());
            case 32:
                akgb akgbVar7 = this.c;
                akis akisVar7 = this.a;
                akkp akkpVar4 = akisVar7.a;
                return new acnd(akgbVar7.x, akisVar7.b.oa, (ejar) akkpVar4.au.b(), (errl) this.a.p.b(), (aclb) this.a.b.p.b(), this.a.b.ob);
            case 33:
                return Optional.of((admk) this.c.J.b());
            case 34:
                cgfd cgfdVar = (cgfd) this.a.a.Dy.b();
                akis akisVar8 = this.a;
                return new admr(cgfdVar, akisVar8.a.ck, (errl) akisVar8.p.b());
            case 35:
                return new acja(this.c.L);
            case 36:
                Activity activity3 = (Activity) this.c.d.b();
                akis akisVar9 = this.a;
                return new aciy(activity3, akisVar9.b.u, (ffhd) akisVar9.cn.b(), (ffsk) this.a.a.p.b());
            case 37:
                return new adhr((ffsk) this.c.N.b());
            case 38:
                ffhd ffhdVar = (ffhd) this.a.a.rZ.b();
                ekki ekkiVar6 = (ekki) this.c.n.b();
                ffhdVar.getClass();
                ekkiVar6.getClass();
                return eklj.a(ffhdVar, ekkiVar6.P());
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return Optional.of(this.c.C());
            case 40:
                return Optional.of(this.c.B());
            case 41:
                return Optional.of(this.c.D());
            case 42:
                akgb akgbVar8 = this.c;
                Object bb = akgbVar8.bb();
                Activity activity4 = (Activity) akgbVar8.d.b();
                boolean z = activity4 instanceof eg;
                eknb eknbVar = (eknb) this.a.b.kQ.b();
                if (!z) {
                    throw new IllegalStateException("must use FragmentActivity");
                }
                final eg egVar3 = (eg) activity4;
                return new ekmz(new ekng((eknh) bb, new ffbr() { // from class: eknc
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        eg egVar4 = eg.this;
                        return (ekmt) qpt.f(egVar4).d(egVar4);
                    }
                }), new ekmw(egVar3, eknbVar), true);
            case 43:
                return new ekyo((elbx) this.a.aJ.b());
            case 44:
                return Optional.of(this.c.A());
            case 45:
                return Optional.of(this.c.F());
            case 46:
                return Optional.of(this.c.G());
            case 47:
                return Optional.of(this.c.H());
            case 48:
                return new adng();
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return new adnn();
            case 50:
                return new adno((effy) this.a.b.oe.b(), (ffsk) this.a.a.p.b());
            case 51:
                return Optional.of((adht) this.c.ac.b());
            case 52:
                return new adht((adii) this.a.b.oh.b());
            case 53:
                errl errlVar2 = (errl) this.a.t.b();
                errl errlVar3 = (errl) this.a.aK.b();
                akis akisVar10 = this.a;
                akkp akkpVar5 = akisVar10.a;
                bzac bC = akisVar10.bC();
                fbbf fbbfVar5 = akkpVar5.ib;
                fbbf fbbfVar6 = akkpVar5.id;
                ejvb ejvbVar = (ejvb) akisVar10.dy.b();
                akgg akggVar = this.b;
                this.a.b.dQ();
                return new aegg(errlVar2, errlVar3, bC, fbbfVar5, fbbfVar6, ejvbVar, akggVar.ab, this.a.aR);
            case 54:
                return aehp.a((eg) this.c.f.b(), this.c.am);
            case 55:
                akgb akgbVar9 = this.c;
                akis akisVar11 = this.a;
                aeik P2 = akgbVar9.P();
                Context context3 = (Context) akisVar11.q.b();
                errl errlVar4 = (errl) this.a.aK.b();
                akis akisVar12 = this.a;
                return new aeiz(P2, context3, errlVar4, akisVar12.a.RQ, new aekm(), this.a.b.ko);
            case 56:
                errl errlVar5 = (errl) this.a.t.b();
                akis akisVar13 = this.a;
                fbbf fbbfVar7 = akisVar13.cz;
                akkp akkpVar6 = akisVar13.a;
                fbbf fbbfVar8 = akkpVar6.fP;
                fbbf fbbfVar9 = akkpVar6.az;
                fbbf fbbfVar10 = akkpVar6.lO;
                cqoh cqohVar2 = (cqoh) fbbfVar7.b();
                return new aemg(errlVar5, fbbfVar8, fbbfVar9, akisVar13.aU, fbbfVar10, akisVar13.cN, cqohVar2);
            case 57:
                return new aeze((cqoh) this.a.cz.b(), this.c.W(), this.a.b.oi);
            case 58:
                return new crpw(this.c.ah, this.a.b.jR);
            case 59:
                return new crps((crjx) this.a.a.r.b());
            case 60:
                return new stm((Context) this.a.q.b());
            case 61:
                return Optional.of(this.a.b.ct());
            case 62:
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                akkp akkpVar7 = this.a.a;
                fbbf fbbfVar11 = akkpVar7.f;
                ffsk ffskVar = (ffsk) akkpVar7.aq.b();
                akgb akgbVar10 = this.c;
                eg egVar4 = (eg) akgbVar10.f.b();
                akis akisVar14 = this.a;
                akko akkoVar2 = akisVar14.b;
                return new aemc(cqohVar3, fbbfVar11, ffskVar, akgbVar10.C, egVar4, akisVar14.a.az, (aube) akkoVar2.kH.b());
            case 63:
                return new ahkc(this.c.ap);
            case 64:
                Context context4 = (Context) this.a.q.b();
                this.a.bC();
                ejvb ejvbVar2 = (ejvb) this.a.dy.b();
                errl errlVar6 = (errl) this.a.p.b();
                akkp akkpVar8 = this.a.a;
                return new afal(context4, ejvbVar2, errlVar6, akkpVar8.dG, (afar) akkpVar8.dJ.b());
            case 65:
                akis akisVar15 = this.a;
                akgb akgbVar11 = this.c;
                akkp akkpVar9 = akisVar15.a;
                return new bcqt(akkpVar9.dQ, akkpVar9.aO, akgbVar11.ar, akkpVar9.Fz, akisVar15.cS, akkpVar9.br);
            case 66:
                csjk csjkVar = (csjk) this.a.a.el.b();
                akis akisVar16 = this.a;
                akkp akkpVar10 = akisVar16.a;
                fbbf fbbfVar12 = akisVar16.b.hs;
                ckds ckdsVar = (ckds) akkpVar10.dp.b();
                akkp akkpVar11 = this.a.a;
                fbbf fbbfVar13 = akkpVar11.br;
                azbq azbqVar = (azbq) akkpVar11.AO.b();
                akkp akkpVar12 = this.a.a;
                return new aqgi(csjkVar, fbbfVar12, ckdsVar, fbbfVar13, azbqVar, akkpVar12.An, akkpVar12.iA);
            case 67:
                akis akisVar17 = this.a;
                akgb akgbVar12 = this.c;
                akgg akggVar2 = this.b;
                akkp akkpVar13 = akisVar17.a;
                fbbf fbbfVar14 = akisVar17.cz;
                fbbf fbbfVar15 = akkpVar13.fR;
                fbbf fbbfVar16 = akkpVar13.dp;
                fbbf fbbfVar17 = akkpVar13.ft;
                fbbf fbbfVar18 = akkpVar13.fw;
                fbbf fbbfVar19 = akisVar17.q;
                fbbf fbbfVar20 = akisVar17.aO;
                fbbf fbbfVar21 = akkpVar13.c;
                fbbf fbbfVar22 = akkpVar13.ha;
                fbbf fbbfVar23 = akkpVar13.jd;
                fbbf fbbfVar24 = akkpVar13.ac;
                fbbf fbbfVar25 = akkpVar13.Bs;
                fbbf fbbfVar26 = akkpVar13.gB;
                akko akkoVar3 = akisVar17.b;
                return new bcvs(fbbfVar14, fbbfVar15, fbbfVar16, fbbfVar17, fbbfVar18, fbbfVar19, fbbfVar20, fbbfVar21, fbbfVar22, fbbfVar23, fbbfVar24, fbbfVar25, fbbfVar26, akgbVar12.ar, akkpVar13.jh, akkpVar13.nQ, akkpVar13.iy, akkoVar3.ht, akgbVar12.at, akggVar2.d, akkpVar13.br, akkpVar13.Bb, akkoVar3.hu, akisVar17.t);
            case 68:
                return new bdis((ckds) this.a.a.dp.b(), (cpbs) this.a.a.ft.b(), (aqgi) this.c.ar.b(), this.a.a.br, this.b.d);
            case 69:
                akgb akgbVar13 = this.c;
                return new adsg(akgbVar13.av, akgbVar13.ax, this.a.a.Pt);
            case 70:
                akis akisVar18 = this.a;
                enhd h = enhk.h(6);
                h.k("SuperSortPromo", akisVar18.b.S());
                h.k("IMessagePromo", this.c.L());
                h.k("DittoBatteryPromo", this.c.K());
                h.k("VerifiedSmsInvestigativeRpcPromo", this.c.M());
                h.k("BlockListAutoMigratedPromo", this.c.J());
                h.k("GaiaPairingPromo", new adsr());
                return h.c();
            case 71:
                akgb akgbVar14 = this.c;
                return enhk.m("DataDonationNotification", akgbVar14.aY(), "ScheduledSendTooltip", (adsn) akgbVar14.aw.b());
            case 72:
                return new aktl();
            case 73:
                return new uxv();
            case 74:
                return new sfs(this.c.aA);
            case 75:
                return new sfq(this.a.a.iy);
            case 76:
                akis akisVar19 = this.a;
                akgb akgbVar15 = this.c;
                akkp akkpVar14 = akisVar19.a;
                return new adin(akisVar19.cz, akgbVar15.aC, akkpVar14.f, akkpVar14.Dy, akisVar19.p, akisVar19.t);
            case 77:
                return new adnp(this.a.a.az);
            case 78:
                return new adit((ffsk) this.a.a.aq.b(), this.a.a.av);
            case 79:
                return Optional.of(this.c.t());
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                Context context5 = (Context) this.a.q.b();
                akgb akgbVar16 = this.c;
                acxk acxkVar = (acxk) akgbVar16.aH.b();
                akis akisVar20 = this.a;
                akgb akgbVar17 = this.c;
                akkp akkpVar15 = akisVar20.a;
                return new acxj(context5, akgbVar16.aF, akgbVar16.aG, acxkVar, akisVar20.aZ, akkpVar15.Px, akgbVar17.aI, akkpVar15.al);
            case 81:
                return new acxo((Context) this.c.d.b());
            case 82:
                return Optional.of((acls) this.a.b.jP.b());
            case 83:
                return new acxk((ctwb) this.a.a.c.b(), (ctud) this.a.cT.b());
            case 84:
                akis akisVar21 = this.a;
                akkp akkpVar16 = akisVar21.a;
                return new acso(akisVar21.b.fa, akkpVar16.dr, akkpVar16.f);
            case 85:
                akis akisVar22 = this.a;
                fbbf fbbfVar27 = akisVar22.a.az;
                fbbf fbbfVar28 = akisVar22.n;
                return new axpn(fbbfVar27, fbbfVar28, (errl) this.a.t.b());
            case 86:
                return new ahpb((Activity) this.c.d.b());
            case 87:
                return new ahrb(this.c.aN);
            case 88:
                adjm adjmVar = new adjm(this.b.bu);
                dbty dbtyVar = new dbty(this.a.b.a.a.FU);
                akko akkoVar4 = this.a.b;
                akkp akkpVar17 = akkoVar4.a.a;
                tja tjaVar = new tja(akkoVar4.ol, akkpVar17.fo, akkpVar17.C, akkpVar17.q);
                akko akkoVar5 = this.a.b;
                ffsk ffskVar2 = (ffsk) akkoVar5.a.a.aq.b();
                Optional optional = (Optional) akkoVar5.a.a.uJ.b();
                ajba ajbaVar = (ajba) akkoVar5.nl.b();
                akis akisVar23 = akkoVar5.a;
                ajfa ajfaVar = new ajfa(ffskVar2, optional, ajbaVar, akisVar23.a.as, (ejvb) akisVar23.dy.b());
                akis akisVar24 = this.a;
                return enip.v(adjmVar, dbtyVar, tjaVar, ajfaVar, akisVar24.b.J(), new cvon(akisVar24.b.a.a.at), new ahrc[0]);
            case 89:
                return Optional.of(this.c.u());
            case 90:
                return new aitp((aitz) this.a.a.Nu.b(), (ejvp) this.a.aR.b(), (aiuv) this.a.a.Nv.b());
            case 91:
                akis akisVar25 = this.a;
                return new aitt(akisVar25.aJ, akisVar25.aR, this.c.aS, akisVar25.a.Nv);
            case 92:
                return new aisv((errl) this.a.t.b(), (errl) this.a.p.b(), (aitz) this.a.a.Nu.b(), this.b.e(), (aiuv) this.a.a.Nv.b());
            case 93:
                return new aium(this.a.a.Nu);
            case 94:
                return ajkl.a((Activity) this.c.d.b());
            case 95:
                return new ajlz();
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                Activity activity5 = (Activity) this.c.d.b();
                if (!(activity5 instanceof CmcUserConsentSettingsActivity)) {
                    throw new IllegalStateException(a.I(activity5, akof.class, "Attempt to inject a Activity wrapper of type "));
                }
                CmcUserConsentSettingsActivity cmcUserConsentSettingsActivity = (CmcUserConsentSettingsActivity) activity5;
                cmcUserConsentSettingsActivity.getClass();
                return cmcUserConsentSettingsActivity;
            case 97:
                akis akisVar26 = this.a;
                akkp akkpVar18 = akisVar26.a;
                return new cvom(akkpVar18.ih, akkpVar18.ig, akkpVar18.ii, akisVar26.dy, akisVar26.t);
            case 98:
                akis akisVar27 = this.a;
                return new alef(akisVar27.a.bi, akisVar27.eb);
            case 99:
                return new drte((Context) this.a.q.b(), this.c.am());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.d;
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                Activity activity = (Activity) this.c.d.b();
                if (!(activity instanceof SimSelectionSettingsActivity)) {
                    throw new IllegalStateException(a.I(activity, cxfv.class, "Attempt to inject a Activity wrapper of type "));
                }
                SimSelectionSettingsActivity simSelectionSettingsActivity = (SimSelectionSettingsActivity) activity;
                simSelectionSettingsActivity.getClass();
                return simSelectionSettingsActivity;
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return new cynd((Context) this.a.q.b(), this.c.bc, this.a.a.f);
            case 102:
                return Optional.of(this.a.b.cq());
            case 103:
                return new cyne(fbaz.a(this.c.be));
            case 104:
                return Optional.of((cynd) this.c.bd.b());
            case 105:
                return Optional.of(new cynk());
            case 106:
                return new cvqi(this.a.b.jc);
            case 107:
                Activity activity2 = (Activity) this.c.d.b();
                if (!(activity2 instanceof OpenRbmDeepLinkActivity)) {
                    throw new IllegalStateException(a.I(activity2, cznl.class, "Attempt to inject a Activity wrapper of type "));
                }
                OpenRbmDeepLinkActivity openRbmDeepLinkActivity = (OpenRbmDeepLinkActivity) activity2;
                openRbmDeepLinkActivity.getClass();
                return openRbmDeepLinkActivity;
            case 108:
                return new czqb();
            case 109:
                akkp akkpVar = this.a.a;
                fbbf fbbfVar = akkpVar.dF;
                alcs alcsVar = new alcs();
                return new alct(fbbfVar, alcsVar, (Executor) this.a.p.b());
            case 110:
                return new dqlp((Activity) this.c.d.b(), Optional.empty(), (dqkk) this.a.ll.b());
            case 111:
                return ujm.a((atbq) this.a.b.jL.b());
            case 112:
                return new dcit(this.c.bn);
            case 113:
                return new cxqk(this.a.cz);
            case 114:
                return new dczq((errl) this.a.t.b());
            case 115:
                ddqu ddquVar = (ddqu) new deae((eg) this.c.f.b(), ddrc.class).b(this.c.bs);
                ddquVar.getClass();
                return ddquVar;
            case 116:
                Context context = (Context) this.a.q.b();
                cbnj cbnjVar = (cbnj) this.a.a.ss.b();
                cbop cbopVar = (cbop) this.a.b.kY.b();
                akis akisVar = this.a;
                akko akkoVar = akisVar.b;
                cbmu fI = akisVar.a.fI();
                ddqh ddqhVar = (ddqh) akkoVar.fo.b();
                akgb akgbVar = this.c;
                return new ddrc(context, cbnjVar, cbopVar, fI, ddqhVar, akgbVar.ai(), akgbVar.ah(), (azze) this.a.a.fx.b(), (daxg) this.c.br.b(), (errl) this.a.p.b(), this.c.ag(), (ddpl) this.a.b.N.b(), (alrv) this.a.a.ej.b(), this.a.b.oB);
            case 117:
                return new ddwg((Context) this.a.q.b(), (csrh) this.a.a.xi.b(), this.a.a.Z);
            case 118:
                return new daxg((csrv) this.a.a.iK.b(), (ddzb) this.a.a.nk.b());
            case 119:
                Activity activity3 = (Activity) this.c.d.b();
                akgb akgbVar2 = this.c;
                return new dsml(activity3, akgbVar2.ao(), akgbVar2.aq(), (dqkk) this.a.ll.b(), (ffsk) this.c.N.b(), Optional.of(Boolean.valueOf(uju.a(new aruh(this.a.b.a.a.s)))));
            case 120:
                return new dsnw((Activity) this.c.d.b(), new dsnq(this.c.b.ll));
            case 121:
                return new dsmx((Activity) this.c.d.b(), this.c.ap());
            case 122:
                Context context2 = (Context) this.a.q.b();
                efgc efgcVar = (efgc) this.a.hU.b();
                context2.getClass();
                efgcVar.getClass();
                dson dsonVar = dson.a;
                dsonVar.getClass();
                return dqht.a(context2, efgcVar, dsonVar, "keyboard", "keyboard");
            case 123:
                return new lmw((eg) this.c.f.b(), this.c.av());
            case 124:
                return new efvj(this.c.aU());
            case 125:
                egdr egdrVar = (egdr) new lmw((eg) this.c.f.b(), this.c.ay()).a(egdr.class);
                egdrVar.getClass();
                return egdrVar;
            case 126:
                return new egdu(this.a.b.oC);
            case 127:
                return new egct((egaa) this.c.bz.b());
            case 128:
                return new egaa((Context) this.a.q.b());
            case 129:
                Context context3 = (Context) this.a.q.b();
                emxc emxcVar = (emxc) this.c.bC.b();
                exel aW = this.c.aW();
                List list = dfld.m;
                dfla dflaVar = new dfla(context3, "OBAKE");
                dflaVar.g = (String) emxcVar.f();
                if (fdrm.a.get().B()) {
                    dflaVar.h = new dflg() { // from class: egdf
                        @Override // defpackage.dflg
                        public final dfli a() {
                            return dfli.c(86129221, faxv.LOGGER_DEFERRING_PROVIDER);
                        }
                    };
                }
                return new egdh(context3, dflaVar.c(), aW);
            case 130:
                return ((egrb) this.c.bB.b()).a;
            case 131:
                return new egrb((eg) this.c.f.b(), this.c.bf());
            case 132:
                return ((egrb) this.c.bB.b()).c.c();
            case 133:
                exfi exfiVar = ((egrb) this.c.bB.b()).d;
                exfiVar.getClass();
                return exfiVar;
            case 134:
                return new egcl((egco) this.c.bK.b(), (errl) this.a.aK.b());
            case 135:
                return new egcr((feau) this.c.bG.b(), (errl) this.a.aK.b(), new egcm((Context) this.a.q.b(), "oauth2:https://www.googleapis.com/auth/peopleapi.readonly"), (emxc) this.c.bH.b(), (egcs) this.c.bJ.b());
            case 136:
                egcu egcuVar = egcu.PROD;
                egcuVar.getClass();
                return new fexv((String) egcv.a.get(egcuVar), 443).a();
            case 137:
                return ((egrb) this.c.bB.b()).b;
            case 138:
                return new egcs((dfdt) this.c.bI.b());
            case 139:
                Context context4 = (Context) this.a.q.b();
                dfbf dfbfVar = new dfbf(new Bundle());
                dfqs dfqsVar = dfbe.a;
                return new dfdt(context4, dfbfVar);
            case 140:
                exgs exgsVar = (exgs) this.c.bD.b();
                ewjb ewjbVar = (ewjb) ewjg.a.createBuilder();
                ewjc ewjcVar = (ewjc) ewjf.a.createBuilder();
                ewjcVar.copyOnWrite();
                ewjf ewjfVar = (ewjf) ewjcVar.instance;
                ewjfVar.d = 1;
                ewjfVar.b |= 2;
                ewjcVar.copyOnWrite();
                ewjf ewjfVar2 = (ewjf) ewjcVar.instance;
                ewjfVar2.c = 5;
                ewjfVar2.b |= 1;
                String str = exgsVar.d;
                ewjcVar.copyOnWrite();
                ewjf ewjfVar3 = (ewjf) ewjcVar.instance;
                str.getClass();
                ewjfVar3.b |= 4;
                ewjfVar3.e = str;
                fapp b = fapp.b(exgsVar.c);
                if (b == null) {
                    b = fapp.UNKNOWN_APPLICATION;
                }
                ewjcVar.copyOnWrite();
                ewjf ewjfVar4 = (ewjf) ewjcVar.instance;
                ewjfVar4.f = b.cJ;
                ewjfVar4.b |= 8;
                ewjbVar.copyOnWrite();
                ewjg ewjgVar = (ewjg) ewjbVar.instance;
                ewjf ewjfVar5 = (ewjf) ewjcVar.build();
                ewjfVar5.getClass();
                ewjgVar.c = ewjfVar5;
                ewjgVar.b = 1 | ewjgVar.b;
                ewjg ewjgVar2 = (ewjg) ewjbVar.build();
                ewjgVar2.getClass();
                return ewjgVar2;
            case 141:
                ewip ewipVar = (ewip) ewiq.a.createBuilder();
                ewipVar.copyOnWrite();
                ewiq ewiqVar = (ewiq) ewipVar.instance;
                ewiqVar.b |= 1;
                ewiqVar.c = true;
                ewiq ewiqVar2 = (ewiq) ewipVar.build();
                ewiqVar2.getClass();
                return ewiqVar2;
            case 142:
                return new egia((egcn) this.c.bL.b(), (errl) this.a.aK.b(), (ewjg) this.c.bM.b());
            case 143:
                return new eghs((egcn) this.c.bL.b(), (errl) this.a.aK.b(), (ewjg) this.c.bM.b());
            case 144:
                efzz efzzVar = (efzz) this.c.bS.b();
                errl errlVar = (errl) this.a.aK.b();
                akgb akgbVar3 = this.c;
                akko akkoVar2 = this.a.b;
                egad ax = akgbVar3.ax();
                emyg emygVar = (emyg) akkoVar2.oC.b();
                akgb akgbVar4 = this.c;
                return new efxf(efzzVar, errlVar, ax, emygVar, akgbVar4.aA(), (efwk) akgbVar4.bW.b());
            case 145:
                return new efzz(this.c.aw());
            case 146:
                return new egaj((emxc) this.c.bT.b(), ((Activity) this.c.d.b()).getResources());
            case 147:
                Activity activity4 = (Activity) this.c.d.b();
                efzv bf = this.c.bf();
                String stringExtra = activity4.getIntent().getStringExtra("com.google.profile.photopicker.ACCOUNT");
                if (!TextUtils.isEmpty(stringExtra)) {
                    for (Account account : bf.a()) {
                        if (account.name.equals(stringExtra)) {
                            return emxc.j(new efzx(activity4, account, bf));
                        }
                    }
                }
                return emux.a;
            case 148:
                return new egjw((egdg) this.c.bF.b(), (emyg) this.a.b.oC.b(), (emyg) this.a.b.oC.b());
            case 149:
                return efwj.a((eg) this.c.f.b());
            case 150:
                return new efxz(this.c.aB());
            case 151:
                return new efyz(this.c.aD());
            case 152:
                return new efzi(this.c.aC());
            case 153:
                return new egle(this.c.aF());
            case 154:
                return new egko((efzz) this.c.bS.b(), (errl) this.a.aK.b(), this.c.ax(), (emyg) this.a.b.oC.b());
            case 155:
                akgb akgbVar5 = this.c;
                return new egmy(akgbVar5.aG(), akgbVar5.aF(), akgbVar5.aH(), (egrb) akgbVar5.bB.b());
            case 156:
                return new egkx(this.c.aE());
            case 157:
                return new egnt(this.c.aG());
            case 158:
                return new egpq(((egdv) this.c.ch.b()).b(), (egiu) this.c.ci.b());
            case 159:
                egdv egdvVar = (egdv) new lmw((eg) this.c.f.b(), this.c.az()).a(egdv.class);
                egdvVar.getClass();
                return egdvVar;
            case 160:
                dydc a = ((dydd) this.a.pc.b()).a((Account) ((emxc) this.c.bH.b()).c());
                a.getClass();
                return a;
            case 161:
                return ((egdv) this.c.ch.b()).a();
            case 162:
                return new egpm((efmq) this.c.ck.b(), (Context) this.a.q.b(), (emxc) this.c.bH.b(), (egdg) this.c.bF.b(), (egiu) this.c.ci.b(), (egjk) this.c.cm.b(), (exgs) this.c.bD.b());
            case 163:
                Context context5 = (Context) this.a.q.b();
                return efmq.c(context5, new CronetEngine.Builder(context5).build());
            case 164:
                egjk egjkVar = (egjk) ((lmw) this.c.cl.b()).a(egjk.class);
                egjkVar.getClass();
                return egjkVar;
            case 165:
                return new egpw(this.c.aH());
            case 166:
                return new egjk();
            case 167:
                return new egcw((eg) this.c.f.b(), ((egrb) this.c.bB.b()).f.a(new efur(emux.a).a));
            case 168:
                eg egVar = (eg) this.c.f.b();
                egrj egrjVar = (egrj) this.c.cs.b();
                dvxi dvxiVar = (dvxi) this.a.b.jA.b();
                akgb akgbVar6 = this.c;
                fbbf fbbfVar2 = akgbVar6.ct;
                egre aJ = akgbVar6.aJ();
                akgb akgbVar7 = this.c;
                return new egrh(egVar, egrjVar, dvxiVar, aJ, akgbVar7.cx, akgbVar7.cy);
            case 169:
                return new egrj((egdg) this.c.bF.b(), (egda) this.c.cr.b(), (egjk) this.c.cm.b());
            case 170:
                return new egda(this.a.b.oC);
            case 171:
                return new egku();
            case 172:
                return new eglb();
            case 173:
                return new egpg();
            case 174:
                return new egnr();
            case 175:
                return new egoj();
            case 176:
                return new egpu();
            case 177:
                eg egVar2 = (eg) this.c.f.b();
                egrj egrjVar2 = (egrj) this.c.cs.b();
                dvxi dvxiVar2 = (dvxi) this.a.b.jA.b();
                akgb akgbVar8 = this.c;
                fbbf fbbfVar3 = akgbVar8.ct;
                egre aJ2 = akgbVar8.aJ();
                return new egrp(egVar2, egrjVar2, dvxiVar2, aJ2, this.c.cy);
            case 178:
                return new efxl();
            case 179:
                return new DevicePhotosFragment();
            case 180:
                return new egly();
            case 181:
                return new eklg((Activity) this.c.d.b(), enpd.a);
            case 182:
                return new eknt((eito) this.c.w.b(), (Activity) this.c.d.b());
            case 183:
                Activity activity5 = (Activity) this.c.d.b();
                if (!(activity5 instanceof EmotifyActivity)) {
                    throw new IllegalStateException(a.I(activity5, emeq.class, "Attempt to inject a Activity wrapper of type "));
                }
                EmotifyActivity emotifyActivity = (EmotifyActivity) activity5;
                emotifyActivity.getClass();
                return emotifyActivity;
            case 184:
                return Optional.of((adak) this.a.b.lP.b());
            case 185:
                this.a.bC();
                this.c.bj();
                return new cknj();
            case 186:
                return eklb.a((eg) this.c.f.b());
            case 187:
                return ekjl.b((ekki) this.c.n.b());
            case 188:
                return new acxm((Optional) this.c.aK.b());
            case 189:
                return new ahhx((ejvb) this.a.dy.b(), (aisv) this.c.aS.b(), (aitz) this.a.a.Nu.b(), (ahik) this.a.a.dG.b(), (errl) this.a.p.b(), (ejvp) this.a.aR.b());
            case 190:
                return new dqxy((Activity) this.c.d.b());
            case 191:
                Context context6 = (Context) this.c.d.b();
                akis akisVar2 = this.a;
                return uon.a(context6, akisVar2.a.RT, akisVar2.jz, akisVar2.b.lU, this.c.cQ);
            case 192:
                Map map = (Map) this.a.a.RT.b();
                Optional optional = (Optional) this.a.jz.b();
                akis akisVar3 = this.a;
                return new uof(map, optional, akisVar3.b.lU, (akmj) akisVar3.cq.b());
            case 193:
                return new efyj();
            case 194:
                return new efyu();
            case 195:
                return new efvg();
            case 196:
                acd acdVar = (eg) this.c.f.b();
                emxf.b(acdVar instanceof egri, "Activity has to implement PhotoPickerNavigationProvider");
                egrf E = ((egri) acdVar).E();
                E.getClass();
                return E;
            case 197:
                return new egcx(((Context) this.a.q.b()).getPackageManager());
            case 198:
                akgb akgbVar9 = this.c;
                adlb w = akgbVar9.w();
                adlm adlmVar = new adlm((Activity) akgbVar9.d.b(), (elbx) akgbVar9.b.aJ.b(), akgbVar9.da);
                akgb akgbVar10 = this.c;
                return adkz.a(w, adlmVar, akgbVar10.z(), akgbVar10.y(), akgbVar10.x(), akgbVar10.I(), akgbVar10.X());
            case 199:
                akgb akgbVar11 = this.c;
                return adhp.a(fbaz.a(akgbVar11.O), fbaz.a(akgbVar11.cY), new atxr(this.a.b.a.a.s));
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        int i = this.d;
        int i2 = i / 100;
        if (i2 == 0) {
            return a();
        }
        if (i2 == 1) {
            return c();
        }
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                return new adho((Activity) this.c.d.b());
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                Activity activity = (Activity) this.c.d.b();
                akis akisVar = this.a;
                akgb akgbVar = this.c;
                akkp akkpVar = akisVar.a;
                return new adll(activity, akkpVar.Px, akkpVar.fo, akgbVar.v());
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                return new adlc((Activity) this.c.d.b(), this.b.bN, this.c.v());
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                return new adle(this.a.a.iK);
            case 204:
                return new adpn();
            case 205:
                return Optional.of((dsma) this.c.bx.b());
            case 206:
                ctyz ctyzVar = (ctyz) this.a.fM.b();
                akgb akgbVar2 = this.c;
                return new ddtv(ctyzVar, akgbVar2.dg, (akvg) this.a.a.Px.b(), (adtc) this.b.bt.b(), (Context) this.c.d.b());
            case 207:
                return new ddpm(this.a.a.f);
            case 208:
                akgb akgbVar3 = this.c;
                return new cvnv(akgbVar3.aY, akgbVar3.dl, akgbVar3.dk);
            case 209:
                akgb akgbVar4 = this.c;
                return new cvnx(akgbVar4.dj, akgbVar4.dk);
            case 210:
                akgb akgbVar5 = this.c;
                akkp akkpVar2 = this.a.a;
                return new cuks(akgbVar5.di, akkpVar2.tq, akkpVar2.tp, akkpVar2.iv, akkpVar2.tt, akkpVar2.ta, (ffsk) akkpVar2.aq.b());
            case 211:
                return enip.o(cubh.a(this.a.b.a.a.ls()));
            case 212:
                akgb akgbVar6 = this.c;
                return new cvnt(akgbVar6.f, akgbVar6.dj);
            default:
                throw new AssertionError(i);
        }
    }
}
