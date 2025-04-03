package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Process;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabase;
import j$.util.Optional;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dipj implements fbbf {
    public final dipk a;
    private final int b;

    public dipj(dipk dipkVar, int i) {
        this.a = dipkVar;
        this.b = i;
    }

    private final Object a() {
        int i = this.b;
        switch (i) {
            case 0:
                return new diyu();
            case 1:
                dipk dipkVar = this.a;
                Context context = (Context) ((fbbb) dipkVar.b).a;
                ctvi ctviVar = (ctvi) dipkVar.n.b();
                dipk dipkVar2 = this.a;
                fazb a = fbaz.a(dipkVar2.v);
                dizc.m();
                return new ctvb(context, dipkVar.d, dipkVar2.at, dipkVar.g, ctviVar, a);
            case 2:
                return new dkuh((dkrx) this.a.c.b());
            case 3:
                return new dkrx((Context) ((fbbb) this.a.b).a);
            case 4:
                dipk dipkVar3 = this.a;
                return new ctwg(dipkVar3.e, dipkVar3.ar, dipkVar3.n, dipkVar3.h, dipkVar3.af, dipkVar3.as).a((Context) ((fbbb) dipkVar3.b).a, dipkVar3.d);
            case 5:
                return new dkui();
            case 6:
                return new ctue((Context) ((fbbb) this.a.b).a);
            case 7:
                dipk dipkVar4 = this.a;
                ctwv ctwvVar = new ctwv(dipkVar4.g, dipkVar4.af, dipkVar4.n, dipkVar4.v, dipkVar4.ag);
                dipk dipkVar5 = this.a;
                return ctwl.a(ctwvVar, dipkVar5.am.b(), dipkVar5.ao.b(), dipkVar5.ap.b(), new ctxp(dipkVar5.aq, dipkVar5.b));
            case 8:
                dipk dipkVar6 = this.a;
                return aoge.a(dipkVar6.ab, dipkVar6.ac, dipkVar6.ad, dipkVar6.ae, (aojk) dipkVar6.k.b());
            case 9:
                dipk dipkVar7 = this.a;
                fbbf fbbfVar = dipkVar7.aa;
                fbbf fbbfVar2 = dipkVar7.o;
                return new aodp(fbaz.a(dipkVar7.j), fbaz.a(dipkVar7.m), fbaz.a(dipkVar7.h), fbaz.a(fbbfVar2), fbaz.a(fbbfVar));
            case 10:
                dipk dipkVar8 = this.a;
                return new aoqw(fbaz.a(dipkVar8.h), fbaz.a(dipkVar8.i));
            case 11:
                return new avkc((ctvb) this.a.h.b(), (cfsk) this.a.l.b());
            case 12:
                dipk dipkVar9 = this.a;
                return new cfsl(dipkVar9.k, dipkVar9.h);
            case 13:
                return aogg.a(enpd.a);
            case 14:
                return new ctve((ctvi) this.a.n.b());
            case 15:
                return new ctvi(this.a.g);
            case 16:
                dipk dipkVar10 = this.a;
                return new aokt(fbbg.a(dipkVar10.Z), dipkVar10.h, dipkVar10.l);
            case 17:
                dipk dipkVar11 = this.a;
                Object obj = ((fbbb) dipkVar11.b).a;
                fbbf fbbfVar3 = dipkVar11.h;
                fbbf fbbfVar4 = dipkVar11.o;
                return new aolq((Context) obj, fbaz.a(dipkVar11.Y), fbaz.a(dipkVar11.g), fbaz.a(dipkVar11.v), fbaz.a(fbbfVar4), fbaz.a(fbbfVar3));
            case 18:
                dipk dipkVar12 = this.a;
                return new ayvn(dipkVar12.o, dipkVar12.q, dipkVar12.r, dipkVar12.t, dipkVar12.v, dipkVar12.V, dipkVar12.W, dipkVar12.X);
            case 19:
                return new clbc((cuwz) this.a.p.b());
            case 20:
                return new cuwz();
            case 21:
                return new ckdo(this.a.p);
            case 22:
                return new ayvq((ayvp) this.a.s.b());
            case 23:
                return new ayvp();
            case 24:
                return ctvl.a(this.a.u);
            case 25:
                dipk dipkVar13 = this.a;
                return new esfv((Context) ((fbbb) dipkVar13.b).a, (esfn) dipkVar13.k.b());
            case 26:
                return new divw(this.a.U);
            case 27:
                dipk dipkVar14 = this.a;
                return new ersq(dipkVar14.x(), (ersv) dipkVar14.T.b());
            case 28:
                return Boolean.valueOf(ertd.a());
            case 29:
                return Boolean.valueOf(ertd.b());
            case 30:
                return Boolean.valueOf(ertd.c());
            case 31:
                return Boolean.valueOf(ertd.d());
            case 32:
                return Boolean.valueOf(ertd.e());
            case 33:
                return Boolean.valueOf(ertd.f());
            case 34:
                return Boolean.valueOf(ertd.g());
            case 35:
                return Boolean.valueOf(ertd.h());
            case 36:
                return Boolean.valueOf(ertd.i());
            case 37:
                return Boolean.valueOf(ertd.j());
            case 38:
                return Boolean.valueOf(ertd.k());
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return Boolean.valueOf(ertd.l());
            case 40:
                return Boolean.valueOf(ertd.m());
            case 41:
                return Boolean.valueOf(ertd.n());
            case 42:
                return Boolean.valueOf(ertd.o());
            case 43:
                return Boolean.valueOf(ertd.p());
            case 44:
                return Boolean.valueOf(ertd.q());
            case 45:
                return Boolean.valueOf(ertd.r());
            case 46:
                return Boolean.valueOf(ertd.s());
            case 47:
                return Boolean.valueOf(ertd.t());
            case 48:
                return Boolean.valueOf(ertd.u());
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return Boolean.valueOf(ertd.v());
            case 50:
                return new ersv(Optional.empty(), Optional.empty(), this.a.x());
            case 51:
                return new erta();
            case 52:
                enhd h = enhk.h(28);
                h.k(dixh.class, "cslib.anonymize_non_latin_digits");
                h.k(dixj.class, "cslib.block_manual_msisdn_for_wear");
                h.k(diwz.class, "");
                h.k(dixb.class, "cslib.delete_sim_preferences_reset_private_jibe_data");
                h.k(diwn.class, "cslib.disable_oob_consent_expiration");
                h.k(dixc.class, "cslib.enable_all_subscriptions_as_verified");
                h.k(dixm.class, "cslib.enable_compose_actions");
                h.k(diwp.class, "");
                h.k(diwq.class, "cslib.enable_fi_multi_sync_help_article_in_rcs_settings");
                h.k(diws.class, "cslib.enable_grpc_to_tycho_for_fi_multi_sync_status");
                h.k(dixd.class, "");
                h.k(dixe.class, "cslib.enable_is_sim_loaded_comparison_event");
                h.k(dixf.class, "cslib.enable_lookup_by_sim_subscription_info_retriever");
                h.k(diwt.class, "");
                h.k(diwu.class, "cslib.enable_one_time_verification_for_ts43_carrier_tos_provisioning");
                h.k(dixn.class, "cslib.enable_open_url_webview_actions");
                h.k(dixi.class, "cslib.enable_provisioning_apis_comparison_logging");
                h.k(diwv.class, "");
                h.k(diww.class, "cslib.enable_synchronized_update_value_flag");
                h.k(diwy.class, "cslib.enable_welcome_message_suppression");
                h.k(dixg.class, "cslib.handle_sim_loaded_in_phone_sims_state_updater");
                h.k(dixk.class, "cslib.log_config_state_in_config_info_logs");
                h.k(dixa.class, "cslib.log_fi_multi_device_sync_sign_out");
                h.k(dixo.class, "cslib.remove_unnecessary_grpc_to_tycho");
                h.k(dixl.class, "cslib.send_request_on_missing_msisdn_token");
                h.k(dixr.class, "");
                h.k(dixs.class, "cslib.test_ramp_down");
                h.k(diwm.class, "cslib.use_character_anonymizer");
                return h.c();
            case 53:
                return new diup(this.a.U);
            case 54:
                dipk dipkVar15 = this.a;
                return new ayhi(dipkVar15.t, dipkVar15.V);
            case 55:
                dipk dipkVar16 = this.a;
                fbbf fbbfVar5 = dipkVar16.k;
                fbbf fbbfVar6 = dipkVar16.aa;
                fbbf fbbfVar7 = dipkVar16.o;
                fbbf fbbfVar8 = dipkVar16.m;
                return new aoih(fbaz.a(dipkVar16.j), fbaz.a(dipkVar16.h), fbaz.a(dipkVar16.v), fbaz.a(fbbfVar8), fbaz.a(fbbfVar7), fbaz.a(fbbfVar6), fbaz.a(fbbfVar5));
            case 56:
                dipk dipkVar17 = this.a;
                fbbf fbbfVar9 = dipkVar17.k;
                fbbf fbbfVar10 = dipkVar17.l;
                fbbf fbbfVar11 = dipkVar17.aa;
                fbbf fbbfVar12 = dipkVar17.o;
                return new aogb(fbaz.a(dipkVar17.j), fbaz.a(dipkVar17.m), fbaz.a(dipkVar17.h), fbaz.a(fbbfVar12), fbaz.a(fbbfVar11), fbaz.a(fbbfVar10), fbaz.a(fbbfVar9), fbaz.a(fbbfVar9));
            case 57:
                dipk dipkVar18 = this.a;
                Object obj2 = ((fbbb) dipkVar18.b).a;
                fbbf fbbfVar13 = dipkVar18.k;
                fbbf fbbfVar14 = dipkVar18.aa;
                fbbf fbbfVar15 = dipkVar18.h;
                fbbf fbbfVar16 = dipkVar18.o;
                fbbf fbbfVar17 = dipkVar18.v;
                fbbf fbbfVar18 = dipkVar18.g;
                fbbf fbbfVar19 = dipkVar18.Y;
                fbbf fbbfVar20 = dipkVar18.ac;
                fazb a2 = fbaz.a(dipkVar18.ab);
                fazb a3 = fbaz.a(fbbfVar20);
                fazb a4 = fbaz.a(fbbfVar19);
                fazb a5 = fbaz.a(fbbfVar18);
                fazb a6 = fbaz.a(fbbfVar17);
                fazb a7 = fbaz.a(fbbfVar16);
                fazb a8 = fbaz.a(fbbfVar15);
                fazb a9 = fbaz.a(fbbfVar14);
                fbaz.a(fbbfVar13);
                return aogd.a((Context) obj2, a2, a3, a4, a5, a6, a7, a8, a9);
            case 58:
                dipk dipkVar19 = this.a;
                return new ctvw(dipkVar19.v, dipkVar19.g, dipkVar19.af);
            case 59:
                dipk dipkVar20 = this.a;
                return new ctxf(dipkVar20.al, dipkVar20.ai, dipkVar20.b);
            case 60:
                dipk dipkVar21 = this.a;
                return new ctxc(dipkVar21.aj, dipkVar21.ak, dipkVar21.g, dipkVar21.ai, dipkVar21.b);
            case 61:
                dipk dipkVar22 = this.a;
                return new ctxa(dipkVar22.b, dipkVar22.ah, dipkVar22.ai);
            case 62:
                return new ctvx();
            case 63:
                return new ctwx((Context) ((fbbb) this.a.b).a);
            case 64:
                dipk dipkVar23 = this.a;
                return new ctwh((Context) ((fbbb) dipkVar23.b).a, (ctud) dipkVar23.f.b());
            case 65:
                dipk dipkVar24 = this.a;
                return new ctxj(dipkVar24.an, dipkVar24.ai, dipkVar24.b);
            case 66:
                dipk dipkVar25 = this.a;
                return new ctxh(dipkVar25.am, dipkVar25.ai);
            case 67:
                dipk dipkVar26 = this.a;
                return new ctxl(dipkVar26.ao, dipkVar26.g);
            case 68:
                dipk dipkVar27 = this.a;
                return new ctxn(dipkVar27.ap, dipkVar27.g, dipkVar27.ai);
            case 69:
                return new dipi(this);
            case 70:
                return new ctvs((Context) ((fbbb) this.a.b).a);
            case 71:
                errl a10 = errs.a(Executors.newCachedThreadPool());
                a10.getClass();
                return a10;
            case 72:
                return new eefn((Context) ((fbbb) this.a.b).a);
            case 73:
                dipk dipkVar28 = this.a;
                return new djiy((Context) ((fbbb) dipkVar28.b).a, (dked) dipkVar28.aF.b());
            case 74:
                dipk dipkVar29 = this.a;
                return new dked(dipkVar29.c, dipkVar29.ax, (cguo) dipkVar29.aC.b(), (cort) this.a.aE.b());
            case 75:
                return new dkpp(this.a.aw);
            case 76:
                return cfvo.a((Context) ((fbbb) this.a.b).a);
            case 77:
                dipk dipkVar30 = this.a;
                Object obj3 = ((fbbb) dipkVar30.b).a;
                fbbf fbbfVar21 = dipkVar30.aB;
                return csjc.j() ? new cguj(fbbfVar21, new erpq()) : new cguj(fbbfVar21, ((cguk) ekhw.a((Context) obj3, cguk.class)).eP());
            case 78:
                return Optional.of((dlqm) this.a.aA.b());
            case 79:
                dipk dipkVar31 = this.a;
                Object obj4 = ((fbbb) dipkVar31.b).a;
                errl errlVar = (errl) dipkVar31.az.b();
                errl errlVar2 = (errl) this.a.az.b();
                Context context2 = (Context) ((fbbb) this.a.b).a;
                Uri a11 = dlrs.a();
                dlqc.a();
                dlrl dlrlVar = new dlrl(context2, a11);
                dlqc.a();
                return new dlqp((Context) obj4, errlVar, errlVar2, dlrlVar);
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                dipk dipkVar32 = this.a;
                return dkcm.a((Context) ((fbbb) dipkVar32.b).a, (errl) dipkVar32.au.b());
            case 81:
                dipk dipkVar33 = this.a;
                cort ct = csjc.j() ? (cort) dipkVar33.aD.b() : ((corr) ekhw.a((Context) ((fbbb) dipkVar33.b).a, corr.class)).ct();
                ct.getClass();
                return ct;
            case 82:
                return new cotc();
            case 83:
                return new dijt((cort) this.a.aE.b(), (errl) this.a.aH.b(), this.a.aI);
            case 84:
                Object a12 = dkcl.c() ? dkcl.a((Context) ((fbbb) this.a.b).a) : errs.a(new ThreadPoolExecutor(0, 4, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new dkck()));
                a12.getClass();
                return a12;
            case 85:
                return dhvm.a((Context) ((fbbb) this.a.b).a);
            case 86:
                dipk dipkVar34 = this.a;
                erni.a();
                return new dinl(dipkVar34.aA, dipkVar34.aR, dipkVar34.w());
            case 87:
                dipk dipkVar35 = this.a;
                Object obj5 = ((fbbb) dipkVar35.b).a;
                dkpn dkpnVar = (dkpn) dipkVar35.aQ.b();
                dkpq dkpqVar = (dkpq) this.a.aM.b();
                dkpp dkppVar = (dkpp) this.a.ax.b();
                ecwj.f((Context) obj5);
                dizc.m();
                return new dkpm(dkpnVar, dkpqVar, dkppVar);
            case 88:
                dipk dipkVar36 = this.a;
                dkpx dkpxVar = new dkpx(dipkVar36.aL, dipkVar36.aM, dipkVar36.ax, dipkVar36.aN, dipkVar36.v);
                dipk dipkVar37 = this.a;
                Object obj6 = ((fbbb) dipkVar37.b).a;
                dkpl dkplVar = (dkpl) dipkVar37.aO.b();
                errl errlVar3 = (errl) this.a.au.b();
                final fbbf fbbfVar22 = this.a.aP;
                return dkpxVar.a((Context) obj6, dkplVar, new ffbr() { // from class: dkpo
                    @Override // defpackage.ffbr, defpackage.ffbq
                    public final Object b() {
                        return Boolean.valueOf(((dixg) ffbr.this.b()).a());
                    }
                }, errlVar3);
            case 89:
                dipk dipkVar38 = this.a;
                return new dksa((Context) ((fbbb) dipkVar38.b).a, (dijv) dipkVar38.aK.b());
            case 90:
                dipk dipkVar39 = this.a;
                return new dijv((Context) ((fbbb) dipkVar39.b).a, (errl) dipkVar39.au.b(), (dkpp) this.a.ax.b(), (dijt) this.a.aJ.b());
            case 91:
                return new dkpq();
            case 92:
                dipk dipkVar40 = this.a;
                return new dikv((Context) ((fbbb) dipkVar40.b).a, (dkpp) dipkVar40.ax.b(), (dijt) this.a.aJ.b());
            case 93:
                return new dkpz((dkpi) this.a.aN.b());
            case 94:
                return new divu(this.a.U);
            case 95:
                return new divl(this.a.U);
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                return new diuz();
            case 97:
                return new divf(this.a.U);
            case 98:
                return new diwc(this.a.U);
            case 99:
                return new ersz((ersq) this.a.U.b());
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        Object newFixedThreadPool;
        errm b;
        int i = this.b;
        if (i / 100 == 0) {
            return a();
        }
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return new dkpj((dksa) this.a.aL.b());
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                dipk dipkVar = this.a;
                Object obj = ((fbbb) dipkVar.b).a;
                efgc efgcVar = (efgc) dipkVar.bc.b();
                dikr dikrVar = (dikr) this.a.be.b();
                dipk dipkVar2 = this.a;
                return new dkdv((Context) obj, efgcVar, dikrVar, dipkVar2.w(), dipkVar2.bg, dipkVar2.aJ);
            case 102:
                return efij.a((Executor) this.a.aZ.b(), (efbm) this.a.ba.b(), new enpx((efif) this.a.bb.b()));
            case 103:
                Context context = (Context) ((fbbb) this.a.b).a;
                if (dkcl.c()) {
                    newFixedThreadPool = dkcl.a(context);
                } else {
                    ersf ersfVar = new ersf();
                    ersfVar.d("ProtoDataStore-%d");
                    newFixedThreadPool = Executors.newFixedThreadPool(4, ersf.b(ersfVar));
                }
                newFixedThreadPool.getClass();
                return newFixedThreadPool;
            case 104:
                return new efbm(Collections.singletonList(new efbp(new efbo((Context) ((fbbb) this.a.b).a))));
            case 105:
                return efho.a;
            case 106:
                djix djixVar = (djix) this.a.aG.b();
                dkpp dkppVar = (dkpp) this.a.ax.b();
                eplu epluVar = (eplu) this.a.bd.b();
                dipk dipkVar3 = this.a;
                return new dikr(djixVar, dkppVar, epluVar, dipkVar3.w(), (dijt) dipkVar3.aJ.b());
            case 107:
                eplu epluVar2 = eplu.CARRIER_SERVICES_EVENT_SOURCE_RCS;
                epluVar2.getClass();
                return epluVar2;
            case 108:
                dipk dipkVar4 = this.a;
                return new dkdy((Context) ((fbbb) dipkVar4.b).a, (evkn) dipkVar4.bf.b());
            case 109:
                return csyb.a(enpd.a);
            case 110:
                dipk dipkVar5 = this.a;
                Context context2 = (Context) ((fbbb) dipkVar5.b).a;
                dksa dksaVar = (dksa) dipkVar5.aL.b();
                dkpp dkppVar2 = (dkpp) this.a.ax.b();
                dipk dipkVar6 = this.a;
                return new dkcp(context2, dksaVar, dkppVar2, dipkVar6.w(), (dikw) dipkVar6.bi.b(), (cguo) this.a.aC.b(), this.a.bg);
            case 111:
                djix djixVar2 = (djix) this.a.aG.b();
                dkpp dkppVar3 = (dkpp) this.a.ax.b();
                eplu epluVar3 = (eplu) this.a.bd.b();
                dipk dipkVar7 = this.a;
                return new dikw(djixVar2, dkppVar3, epluVar3, dipkVar7.w(), (dijt) dipkVar7.aJ.b());
            case 112:
                dipk dipkVar8 = this.a;
                dkpp dkppVar4 = (dkpp) dipkVar8.ax.b();
                diks diksVar = (diks) this.a.bk.b();
                dkdv dkdvVar = (dkdv) this.a.bh.b();
                dipk dipkVar9 = this.a;
                return new dkel(dkppVar4, diksVar, dkdvVar, dipkVar9.bg, dipkVar9.bl);
            case 113:
                dipk dipkVar10 = this.a;
                return new diks((Context) ((fbbb) dipkVar10.b).a, (djix) dipkVar10.aG.b(), (dkpp) this.a.ax.b(), (errl) this.a.au.b(), (dijt) this.a.aJ.b());
            case 114:
                return new dkcq();
            case 115:
                djix djixVar3 = (djix) this.a.aG.b();
                dkpp dkppVar5 = (dkpp) this.a.ax.b();
                eplu epluVar4 = (eplu) this.a.bd.b();
                dipk dipkVar11 = this.a;
                return new dikg(djixVar3, dkppVar5, epluVar4, dipkVar11.w(), (dijt) dipkVar11.aJ.b());
            case 116:
                dipk dipkVar12 = this.a;
                return new dikj((Context) ((fbbb) dipkVar12.b).a, (djix) dipkVar12.aG.b(), (dkpp) this.a.ax.b(), (eplu) this.a.bd.b(), (errl) this.a.au.b(), (dijt) this.a.aJ.b());
            case 117:
                djix djixVar4 = (djix) this.a.aG.b();
                dkpp dkppVar6 = (dkpp) this.a.ax.b();
                eplu epluVar5 = (eplu) this.a.bd.b();
                dipk dipkVar13 = this.a;
                return new diju(djixVar4, dkppVar6, epluVar5, dipkVar13.w(), (dijt) dipkVar13.aJ.b());
            case 118:
                return new diku((djix) this.a.aG.b(), (dkpp) this.a.ax.b(), (eplu) this.a.bd.b(), (errl) this.a.au.b(), (dijt) this.a.aJ.b());
            case 119:
                return new dlqb();
            case 120:
                return new dkeh();
            case 121:
                dfpi dfpiVar = dfpi.a;
                dfpiVar.getClass();
                return dfpiVar;
            case 122:
                dipk dipkVar14 = this.a;
                Object obj2 = ((fbbb) dipkVar14.b).a;
                diju dijuVar = (diju) dipkVar14.bp.b();
                dkrx dkrxVar = (dkrx) this.a.c.b();
                dkdv dkdvVar2 = (dkdv) this.a.bh.b();
                ctvb ctvbVar = (ctvb) this.a.h.b();
                dkcp dkcpVar = (dkcp) this.a.bj.b();
                dkpp dkppVar7 = (dkpp) this.a.ax.b();
                dkpj dkpjVar = (dkpj) this.a.aY.b();
                dkpm dkpmVar = (dkpm) this.a.aR.b();
                dipk dipkVar15 = this.a;
                return new djvk((Context) obj2, dijuVar, dkrxVar, dkdvVar2, ctvbVar, dkcpVar, dkppVar7, dkpjVar, dkpmVar, dipkVar15.bg, dipkVar15.aE, dipkVar15.aT, dipkVar15.aV, dipkVar15.aC, dipkVar15.aW);
            case 123:
                dipk dipkVar16 = this.a;
                return new djtw((Context) ((fbbb) dipkVar16.b).a, dipkVar16.o(), (ctwb) dipkVar16.g.b());
            case 124:
                dipk dipkVar17 = this.a;
                return new dips((Context) ((fbbb) dipkVar17.b).a, dipkVar17.k(), errs.a(Executors.newSingleThreadExecutor()));
            case 125:
                Context context3 = (Context) ((fbbb) this.a.b).a;
                if (dkcl.c()) {
                    b = dkcl.b(context3);
                } else {
                    ersf ersfVar2 = new ersf();
                    ersfVar2.c(true);
                    ersfVar2.d("BlockingListeningScheduledExecutorService-%d");
                    ersfVar2.a = new ThreadFactory() { // from class: dkci
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(final Runnable runnable) {
                            return new Thread(new Runnable() { // from class: dkch
                                @Override // java.lang.Runnable
                                public final void run() {
                                    Process.setThreadPriority(10);
                                    runnable.run();
                                }
                            });
                        }
                    };
                    ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, ersf.b(ersfVar2));
                    scheduledThreadPoolExecutor.setRemoveOnCancelPolicy(true);
                    b = errs.b(scheduledThreadPoolExecutor);
                }
                b.getClass();
                return b;
            case 126:
                dipk dipkVar18 = this.a;
                return new diyp((Context) ((fbbb) dipkVar18.b).a, (diku) dipkVar18.bq.b());
            case 127:
                Object b2 = dkcl.c() ? dkcl.b((Context) ((fbbb) this.a.b).a) : Executors.newSingleThreadExecutor();
                b2.getClass();
                return b2;
            case 128:
                dipk dipkVar19 = this.a;
                return new dipa((Context) ((fbbb) dipkVar19.b).a, (dlpw) dipkVar19.br.b());
            case 129:
                return new dipg((Context) ((fbbb) this.a.b).a);
            case 130:
                BusinessInfoDatabase businessInfoDatabase = BusinessInfoDatabase.getInstance((Context) ((fbbb) this.a.b).a);
                businessInfoDatabase.getClass();
                return businessInfoDatabase;
            case 131:
                return new dkib((dipa) this.a.by.b());
            case 132:
                dipk dipkVar20 = this.a;
                return new diib((Context) ((fbbb) dipkVar20.b).a, (BusinessInfoDatabase) dipkVar20.bA.b(), (ctvb) this.a.h.b(), (djqt) this.a.bC.b());
            case 133:
                dipk dipkVar21 = this.a;
                return new djqt((Context) ((fbbb) dipkVar21.b).a, (ctud) dipkVar21.f.b());
            case 134:
                dipk dipkVar22 = this.a;
                enhk o = enhk.o(eecf.SIP, dipkVar22.bE, eecf.MSRP_SERVER, dipkVar22.bF, eecf.MSRP_CLIENT, dipkVar22.bG, eecf.HTTP, dipkVar22.bH);
                int[] iArr = djkm.a;
                return new eecg(o);
            case 135:
                dipk dipkVar23 = this.a;
                dikj dikjVar = (dikj) dipkVar23.bo.b();
                int[] iArr2 = djkm.a;
                eecy eecyVar = new eecy() { // from class: eecu
                    @Override // defpackage.eecy
                    public final SSLContext a() {
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, null, null);
                        return sSLContext;
                    }
                };
                dikjVar.getClass();
                return new eece(eecyVar, new eecq(Optional.of(new eecs(Optional.of(new djki(new eean(4, new djkj(dikjVar)))))), dikjVar));
            case 136:
                dipk dipkVar24 = this.a;
                dikj dikjVar2 = (dikj) dipkVar24.bo.b();
                int[] iArr3 = djkm.a;
                eecy eecyVar2 = new eecy() { // from class: eecv
                    @Override // defpackage.eecy
                    public final SSLContext a() {
                        return SSLContext.getDefault();
                    }
                };
                dikjVar2.getClass();
                return new eece(eecyVar2, new eecq(Optional.of(new eecs(Optional.of(new djki(new eean(3, new djkj(dikjVar2)))))), dikjVar2));
            case 137:
                dipk dipkVar25 = this.a;
                dikj dikjVar3 = (dikj) dipkVar25.bo.b();
                eefo eefoVar = (eefo) this.a.av.b();
                int[] iArr4 = djkm.a;
                eecx eecxVar = new eecx(eefoVar.b(), eefoVar.a());
                dikjVar3.getClass();
                return new eece(eecxVar, new eecq(Optional.of(new eecs(Optional.of(new djki(new eean(3, new djkj(dikjVar3)))))), dikjVar3));
            case 138:
                dipk dipkVar26 = this.a;
                dikj dikjVar4 = (dikj) dipkVar26.bo.b();
                int[] iArr5 = djkm.a;
                eecy eecyVar3 = new eecy() { // from class: eecw
                    @Override // defpackage.eecy
                    public final SSLContext a() {
                        SSLContext sSLContext = SSLContext.getInstance("TLS");
                        sSLContext.init(null, null, null);
                        return sSLContext;
                    }
                };
                dikjVar4.getClass();
                return new eece(eecyVar3, new eecq(Optional.of(new eecs(Optional.of(new djki(new eean(2, new djkj(dikjVar4)))))), dikjVar4));
            case 139:
                dipk dipkVar27 = this.a;
                Object obj3 = ((fbbb) dipkVar27.b).a;
                eefo eefoVar2 = (eefo) dipkVar27.av.b();
                eecg eecgVar = (eecg) this.a.bI.b();
                eebr eebrVar = (eebr) this.a.bJ.b();
                int[] iArr6 = djkm.a;
                return new eeft((Context) obj3, eefoVar2, eecgVar, eebrVar);
            case 140:
                dipk dipkVar28 = this.a;
                Context context4 = (Context) ((fbbb) dipkVar28.b).a;
                errl errlVar = (errl) dipkVar28.au.b();
                dipk dipkVar29 = this.a;
                eeby eebyVar = new eeby((Context) ((fbbb) dipkVar29.b).a, dipkVar29.k());
                djix djixVar5 = (djix) this.a.aG.b();
                int[] iArr7 = djkm.a;
                return new eebr(errlVar, dkvo.f(context4), dkvt.g(context4), eebyVar, djixVar5);
            case 141:
                enhk enhkVar = ((eecg) this.a.bI.b()).a;
                int[] iArr8 = djkm.a;
                ffbr ffbrVar = (ffbr) enhkVar.get(eecf.HTTP);
                ffbrVar.getClass();
                return new eefk((eece) ffbrVar.b());
            case 142:
                return new eefj();
            case 143:
                return new dkmv((dkrx) this.a.c.b());
            case 144:
                return new dkrp((dkmv) this.a.bN.b(), (ctvb) this.a.h.b(), (djqt) this.a.bC.b());
            case 145:
                return new djyc();
            case 146:
                dipk dipkVar30 = this.a;
                return new diho((Context) ((fbbb) dipkVar30.b).a, (errm) dipkVar30.bv.b(), (dlpw) this.a.br.b(), (dikg) this.a.bn.b());
            case 147:
                dipk dipkVar31 = this.a;
                return new dkwo(enip.v(new dkwf(), new dkwq(), new dkwj(), new dkws(dipkVar31.bR), new dkxp(dipkVar31.bU), new dkyc(dipkVar31.bV), new dkwb[0]));
            case 148:
                return new dkwt(this.a.bQ);
            case 149:
                dipk dipkVar32 = this.a;
                return new dkxl(dipkVar32.bS, dipkVar32.bT);
            case 150:
                return new dkxn(this.a.bQ);
            case 151:
                return new dkxr(this.a.bQ);
            case 152:
                return new dkyb(this.a.bQ);
            case 153:
                djke djkeVar = new djke();
                int[] iArr9 = djkm.a;
                return new csjl(djkeVar);
            case 154:
                return new djva((dkcp) this.a.bj.b(), (cguo) this.a.aC.b());
            case 155:
                return new djvi((dkcp) this.a.bj.b(), (dlpw) this.a.br.b());
            case 156:
                dipk dipkVar33 = this.a;
                Context context5 = (Context) ((fbbb) dipkVar33.b).a;
                dkpq dkpqVar = (dkpq) dipkVar33.aM.b();
                dkpp dkppVar8 = (dkpp) this.a.ax.b();
                dipk dipkVar34 = this.a;
                return new djjc(context5, dkpqVar, dkppVar8, dipkVar34.k(), (dkcp) dipkVar34.bj.b());
            case 157:
                return (clpn) clpn.h(new clpl(), (fdxk) this.a.bX.b());
            case 158:
                dipk dipkVar35 = this.a;
                Context context6 = (Context) ((fbbb) dipkVar35.b).a;
                errm errmVar = (errm) dipkVar35.bv.b();
                feej s = feej.s(feef.c("com.google.android.apps.messaging", "com.google.android.apps.messaging.shared.rcs.messaging.MessagingEngineNotificationServer"), context6);
                s.v(errmVar);
                s.g(errmVar);
                s.j(errmVar);
                s.w(evcv.b(context6));
                s.h(60L, TimeUnit.SECONDS);
                return s.a();
            case 159:
                return new dgat((Context) ((fbbb) this.a.b).a);
            case 160:
                dipk dipkVar36 = this.a;
                Context context7 = (Context) ((fbbb) dipkVar36.b).a;
                djix djixVar6 = (djix) dipkVar36.aG.b();
                dkpp dkppVar9 = (dkpp) this.a.ax.b();
                dipk dipkVar37 = this.a;
                return new djuu(context7, djixVar6, dkppVar9, dipkVar37.w(), (dijt) dipkVar37.aJ.b());
            case 161:
                return new cmjb();
            case 162:
                return new ckhj();
            default:
                throw new AssertionError(i);
        }
    }
}
