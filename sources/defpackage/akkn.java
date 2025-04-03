package defpackage;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.Vibrator;
import android.system.Os;
import android.util.Log;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.rcsmigration.RcsStateProvider;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraActivity;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerActivity;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.libraries.onegoogle.accountmenu.features.education.db.EducationDatabase;
import com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextContext;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentLinkedQueue;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.security.Security;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import javax.microedition.khronos.egl.EGLContext;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akkn implements fbbf {
    public final akis a;
    private final int b;

    public akkn(akis akisVar, int i) {
        this.a = akisVar;
        this.b = i;
    }

    private final Object a() {
        int i = this.b;
        switch (i) {
            case 0:
                return new enpx(this.a.b.bA());
            case 1:
                return new vjl();
            case 2:
                return new cnix(this.a.b.g);
            case 3:
                return new enpx((cnih) this.a.b.f.b());
            case 4:
                return cnii.a(this.a.b.e.b());
            case 5:
                return new cnid(fbaz.a(this.a.b.d), (errl) this.a.p.b());
            case 6:
                akko akkoVar = this.a.b;
                return new cnjq(akkoVar.cP(), akkoVar.cQ(), akkoVar.cR());
            case 7:
                return new cnjd(this.a.p);
            case 8:
                akis akisVar = this.a;
                return new acer(akisVar.q, akisVar.a.cD, akisVar.b.j);
            case 9:
                enhd h = enhk.h(138);
                h.k("$primary+a2p_conversation_subscriptions", bqbi.a());
                h.k("$primary+active_sims", azkw.a());
                h.k("$primary+add_contact_banner", bqcq.a());
                h.k("backup+conversation_participants_backup", bbkh.a());
                h.k("backup+conversation_pins_backup", bblp.a());
                h.k("backup+conversations_backup", bbox.a());
                h.k("$primary+backup_id_map", bqeb.a());
                h.k("backup+link_preview_backup", bbqw.a());
                h.k("backup+message_captions_backup", bbrz.a());
                h.k("backup+message_reactions_backup", bbtr.a());
                h.k("backup+message_replies_backup", bbve.a());
                h.k("backup+message_star_backup", bbwj.a());
                h.k("backup+messages_backup", bcbc.a());
                h.k("backup+backup_metadata", bcfc.a());
                h.k("backup+my_identities_backup", bcgj.a());
                h.k("backup+participants_backup", bcjk.a());
                h.k("backup+parts_backup", bcdu.a());
                h.k("$primary+business_conversations_metadata", bqfy.a());
                h.k("$primary+cms_backup_dependency_cache_table", bqhh.a());
                h.k("$primary+cms_blobs_pending_delete", bqij.a());
                h.k("$primary+cms_dead_letter_queue", bqky.a());
                h.k("$primary+cms_deleted_messages_buffer", bqmo.a());
                h.k("$primary+cms_incremental_events", bqoo.a());
                h.k("$primary+cms_media_notifications", bqpx.a());
                h.k("$primary+cms_notifications", bqrq.a());
                h.k("$primary+cms_restore_dependency_cache_table", bqti.a());
                h.k("$primary+cms_status", bqvc.a());
                h.k("$primary+cms", bqwt.a());
                h.k("$primary+contacts", bqzw.a());
                h.k("$primary+conversation_classifications_table", brbt.a());
                h.k("$primary+conversation_labels", brse.a());
                h.k("$primary+conversation_matcher_cache", aykh.a());
                h.k("$primary+conversation_notification_settings_table", brtg.a());
                h.k("$primary+conversation_participants_audit_log", bruy.a());
                h.k("$primary+conversation_participants", brwx.a());
                h.k("$primary+conversation_pin", bryi.a());
                h.k("$primary+conversation_suggestions", bsan.a());
                h.k("$primary+conversation_to_participants_audit_log", bsby.a());
                h.k("$primary+conversation_to_participants", bsds.a());
                h.k("$primary+conversations", bson.a());
                h.k("$primary+custodian_rcs_group_ids", bspm.a());
                h.k("$primary+data_upgrade_workers", bsqq.a());
                h.k("$primary+data_usage", bsro.a());
                h.k("$primary+desktop", bsvf.a());
                h.k("$primary+destinations", azeb.a());
                h.k("$primary+disambiguations", bswg.a());
                h.k("$primary+drafts", bsyc.a());
                h.k("$primary+emergency_sessions", bszn.a());
                h.k("$primary+etouffee_rcs_metadata", btcl.a());
                h.k("$primary+events", btdx.a());
                h.k("$primary+file_processing", awfs.a());
                h.k("$primary+file_transfer", cqtl.a());
                h.k("$primary+flagged_messages", btfp.a());
                h.k("$primary+gemini_conversation_id_mappings", btgz.a());
                h.k("$primary+gemini", bthz.a());
                h.k("$primary+generic_worker_queue", btkj.a());
                h.k("$primary+group_members", azhd.a());
                h.k("$primary+groups", azjs.a());
                h.k("$primary+lighter_conversations_table", btmv.a());
                h.k("$primary+link_preview_participants_table", btoc.a());
                h.k("$primary+link_preview", btqr.a());
                h.k("$primary+linked_account", btrp.a());
                h.k("$primary+messages_annotations", bttg.a());
                h.k("$primary+message_captions", btum.a());
                h.k("$primary+message_classifications_table", btvz.a());
                h.k("$primary+message_destinations", btxj.a());
                h.k("$primary+message_edits", btzb.a());
                h.k("$primary+message_labels", buaz.a());
                h.k("$primary+message_photos_sharing", bucc.a());
                h.k("$primary+message_reactions", bueh.a());
                h.k("$primary+message_replies", bufz.a());
                h.k("$primary+message_send_receive_attempt", buil.a());
                h.k("$primary+message_spam", bule.a());
                h.k("$primary+message_star", bumn.a());
                h.k("$primary+message_status", buod.a());
                h.k("$primary+messages", buya.a());
                h.k("$primary+mls_epoch_records", cfnw.a());
                h.k("$primary+mls_group_states", cfox.a());
                h.k("$primary+mls_key_packages", cfpw.a());
                h.k("$primary+mls_processed_results", cfrd.a());
                h.k("$primary+mls_zinnia_states", cfse.a());
                h.k("$primary+modified_by", buzi.a());
                h.k("$primary+my_identities", azoj.a());
                h.k("$primary+smarts_personalization_decayed_feature_values", bvas.a());
                h.k("$primary+smarts_personalization_features", bvbv.a());
                h.k("$primary+smarts_personalization_normalized_feature_values", bvcz.a());
                h.k("$primary+p2p_conversation_suggestion_event", bvfi.a());
                h.k("$primary+p2p_suggestions", bvho.a());
                h.k("$primary+parent_disallowed_conversations", bvio.a());
                h.k("$primary+participants_audit_log", bvoz.a());
                h.k("$primary+participants", bvvx.a());
                h.k("$primary+parts", bwdn.a());
                h.k("$primary+pending_incoming_message_rcs_table", bwgx.a());
                h.k("$primary+phone_number_min_match_guesser", bwhz.a());
                h.k("$primary+pii_hash", bwji.a());
                h.k("$primary+pipeline_work", bwlh.a());
                h.k("$primary+profiles_table", bwos.a());
                h.k("$primary+rbm_business_info_properties", bwqh.a());
                h.k("$primary+rbm_business_info", bwsp.a());
                h.k("$primary+rbm_business_verifier_info", bwtz.a());
                h.k("$primary+rcs_remote_capabilities_cache", avoe.a());
                h.k("$primary+read_reports", bwvz.a());
                h.k("$primary+received_message_phone_numbers", bwwv.a());
                h.k("$primary+recent_expressive_stickers", bwyk.a());
                h.k("$primary+recent_gifs", bxae.a());
                h.k("$primary+recent_stickers", bxbb.a());
                h.k("$primary+reminders", bxcu.a());
                h.k("$primary+remote_instances", bxeo.a());
                h.k("$primary+remote_registrations_table", bxgm.a());
                h.k("$primary+remote_user_id_info_table", bxhs.a());
                h.k("$primary+remote_user_id_to_registration_id", bxiw.a());
                h.k("$primary+restore_workflow_executions", bxlf.a());
                h.k("$primary+restore_workflow_files", bxmx.a());
                h.k("$primary+restore_workflow_scratch_duplicates", bxoa.a());
                h.k("$primary+restore_workflow_scratch_suffix", bxpc.a());
                h.k("$primary+restore_workflow_scratch_timestamps", bxqh.a());
                h.k("$primary+satellite_emergency_details", bxrf.a());
                h.k("$primary+scheduled_send", coiv.a());
                h.k("$primary+self_participants", bxti.a());
                h.k("$primary+self_profiles", bxvf.a());
                h.k("$primary+settings", bxwt.a());
                h.k("$primary+spam_logging_ids_table", cuir.a());
                h.k("$primary+sqlite_master", bxxx.a());
                h.k("$primary+sqlite_stat1", bxyx.a());
                h.k("$primary+sticker_sets_localization", bxzu.a());
                h.k("$primary+sticker_sets", bybm.a());
                h.k("$primary+stickers_localization", bycr.a());
                h.k("$primary+stickers", byeb.a());
                h.k("$primary+subscriptions", azuz.a());
                h.k("$primary+supersort_labels", byfk.a());
                h.k("$primary+trigger_flags", bygf.a());
                h.k("$primary+user_references", bytl.a());
                h.k("$primary+verified_sms_blacklisted_senders", byug.a());
                h.k("$primary+verified_sms_brands", byvz.a());
                h.k("$primary+verified_sms_senders", byxd.a());
                h.k("$primary+vmt", byyl.a());
                h.k("$primary+work_queue", cfbh.a());
                h.k("$primary+work_queue_work_manager_ids", cfgu.a());
                return h.h();
            case 10:
                return new acev(this.a.q);
            case 11:
                akis akisVar2 = this.a;
                akko akkoVar2 = akisVar2.b;
                return new actk(akkoVar2.s, akkoVar2.t, akisVar2.p);
            case 12:
                akis akisVar3 = this.a;
                ctbs ci = akisVar3.b.ci();
                errm errmVar = (errm) akisVar3.p.b();
                akis akisVar4 = this.a;
                fbbf fbbfVar = akisVar4.aJ;
                akko akkoVar3 = akisVar4.b;
                return new acuq(ci, errmVar, akkoVar3.C(), akkoVar3.r, (elbx) fbbfVar.b());
            case 13:
                return new acyz();
            case 14:
                return new aczf();
            case 15:
                bzed bzedVar = (bzed) this.a.a.jW.b();
                Optional optional = (Optional) this.a.b.q.b();
                akis akisVar5 = this.a;
                return new aciu(bzedVar, optional, akisVar5.aZ, akisVar5.a.be, (errl) akisVar5.p.b(), (errl) this.a.t.b());
            case 16:
                return Optional.of((aclb) this.a.b.p.b());
            case 17:
                return new aclq((ejvb) this.a.dy.b(), (ejvp) this.a.aR.b(), (errl) this.a.p.b(), (effy) this.a.b.o.b(), this.a.dQ);
            case 18:
                akis akisVar6 = this.a;
                return ackv.a(acla.a(), akisVar6.eA(), (efbm) akisVar6.aM.b());
            case 19:
                return new acjw((Context) this.a.q.b(), (errl) this.a.p.b());
            case 20:
                Context context = (Context) this.a.q.b();
                cinl cinlVar = (cinl) this.a.a.aL.b();
                akko akkoVar4 = this.a.b;
                return new acxb(context, cinlVar, akkoVar4.D(), akkoVar4.E(), akkoVar4.F());
            case 21:
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                akis akisVar7 = this.a;
                return new aira(ffskVar, akisVar7.a.Dz, akisVar7.b.U(), (ejoc) akisVar7.dX.b());
            case 22:
                return new erqa();
            case 23:
                return new cmqe(this.a.a.cc);
            case 24:
                return enip.r((dihl) this.a.a.cG.b(), (dihl) this.a.a.CE.b());
            case 25:
                final fbbf fbbfVar2 = this.a.a.s;
                return new asve() { // from class: asdj
                    @Override // defpackage.asve
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.trigger_rcs_provisioning_after_fi_sim_activation");
                    }
                };
            case 26:
                final fbbf fbbfVar3 = this.a.a.s;
                return new asvc() { // from class: asdf
                    @Override // defpackage.asvc
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.acknowledge_and_check_tycho_intent_in_pre_execute");
                    }
                };
            case 27:
                akis akisVar8 = this.a;
                akkp akkpVar = akisVar8.a;
                return new ajoi(akkpVar.br, akkpVar.gJ, akkpVar.fQ, akkpVar.CE, (errm) akisVar8.t.b(), (errm) this.a.aK.b(), this.a.a.Fd);
            case 28:
                akis akisVar9 = this.a;
                akkp akkpVar2 = akisVar9.a;
                fbbf fbbfVar4 = akkpVar2.jx;
                fbbf fbbfVar5 = akkpVar2.f;
                fbbf fbbfVar6 = akkpVar2.fP;
                fbbf fbbfVar7 = akisVar9.b.D;
                Optional of = Optional.of(akkpVar2.aP);
                akis akisVar10 = this.a;
                akko akkoVar5 = akisVar10.b;
                fbbf fbbfVar8 = akkoVar5.at;
                fbbf fbbfVar9 = akisVar10.hv;
                akkp akkpVar3 = akisVar10.a;
                return new cnfa(fbbfVar4, akisVar9.aZ, akisVar9.cz, akisVar9.aU, akisVar9.aO, fbbfVar5, fbbfVar6, fbbfVar7, of, fbbfVar8, fbbfVar9, akkpVar3.RQ, akkoVar5.aw, akkoVar5.ax, akkpVar3.fM, akkoVar5.ay, akkpVar3.pC, akkoVar5.az);
            case 29:
                Context context2 = (Context) this.a.q.b();
                bzgd bzgdVar = (bzgd) this.a.a.fa.b();
                ctwb ctwbVar = (ctwb) this.a.a.c.b();
                cthp cthpVar = (cthp) this.a.a.an.b();
                altk altkVar = (altk) this.a.a.fP.b();
                akzt akztVar = (akzt) this.a.a.f.b();
                fazb a = fbaz.a(this.a.a.EV);
                akis akisVar11 = this.a;
                fbbf fbbfVar10 = akisVar11.a.az;
                ctyz ctyzVar = (ctyz) akisVar11.fM.b();
                csjk csjkVar = (csjk) this.a.a.fQ.b();
                ctvb ctvbVar = (ctvb) this.a.a.u.b();
                crjx crjxVar = (crjx) this.a.a.r.b();
                ctyx ctyxVar = (ctyx) this.a.aU.b();
                ctud ctudVar = (ctud) this.a.cT.b();
                cqoh cqohVar = (cqoh) this.a.cz.b();
                Optional optional2 = (Optional) this.a.aV.b();
                alhk alhkVar = (alhk) this.a.ms.b();
                crln crlnVar = (crln) this.a.a.Dr.b();
                ckds ckdsVar = (ckds) this.a.a.dp.b();
                aliv alivVar = (aliv) this.a.ig.b();
                alir alirVar = (alir) this.a.hv.b();
                algm algmVar = (algm) this.a.a.Dt.b();
                errl errlVar = (errl) this.a.t.b();
                errl errlVar2 = (errl) this.a.p.b();
                errl errlVar3 = (errl) this.a.aK.b();
                dkpp dkppVar = (dkpp) this.a.aQ.b();
                akis akisVar12 = this.a;
                akko akkoVar6 = akisVar12.b;
                bzqf bB = akkoVar6.bB();
                fbbf fbbfVar11 = akkoVar6.M;
                Optional of2 = Optional.of(akisVar12.cr());
                Optional of3 = Optional.of(this.a.fx());
                akis akisVar13 = this.a;
                akko akkoVar7 = akisVar13.b;
                fbbf fbbfVar12 = akkoVar7.O;
                fbbf fbbfVar13 = akkoVar7.P;
                fbbf fbbfVar14 = akkoVar7.U;
                fbbf fbbfVar15 = akisVar13.a.rb;
                fbbf fbbfVar16 = akkoVar7.W;
                Optional of4 = Optional.of(akkoVar7.ag);
                akis akisVar14 = this.a;
                fbbf fbbfVar17 = akisVar14.os;
                akkp akkpVar4 = akisVar14.a;
                akko akkoVar8 = akisVar14.b;
                fbbf fbbfVar18 = akkoVar8.ah;
                fbbf fbbfVar19 = akkoVar8.ai;
                fbbf fbbfVar20 = akkoVar8.aj;
                fbbf fbbfVar21 = akkpVar4.ix;
                Optional of5 = Optional.of(fbbfVar17);
                Optional of6 = Optional.of(akkpVar4.No);
                akis akisVar15 = this.a;
                Optional empty = Optional.empty();
                akkp akkpVar5 = akisVar15.a;
                fbbf fbbfVar22 = akkpVar5.Dy;
                akko akkoVar9 = akisVar15.b;
                return new almw(context2, bzgdVar, ctwbVar, cthpVar, altkVar, akztVar, a, fbbfVar10, ctyzVar, csjkVar, ctvbVar, crjxVar, ctyxVar, ctudVar, cqohVar, optional2, alhkVar, crlnVar, ckdsVar, alivVar, alirVar, algmVar, errlVar, errlVar2, errlVar3, dkppVar, bB, fbbfVar11, of2, of3, fbbfVar12, fbbfVar13, fbbfVar14, fbbfVar15, fbbfVar16, of4, fbbfVar18, fbbfVar19, fbbfVar20, fbbfVar21, of5, of6, empty, fbbfVar22, akkoVar9.ak, akkpVar5.ck, akkoVar9.an, akkpVar5.qL, akkpVar5.DL, akkoVar9.aq, akkpVar5.bo, akkoVar9.ar, akisVar15.lR, akkpVar5.br, akkpVar5.ig);
            case 30:
                akis akisVar16 = this.a;
                fbbf fbbfVar23 = akisVar16.q;
                akko akkoVar10 = akisVar16.b;
                fbbf fbbfVar24 = akkoVar10.D;
                akkp akkpVar6 = akisVar16.a;
                return new batn(fbbfVar23, fbbfVar24, akkpVar6.f, akkoVar10.K, akkpVar6.jw, akkpVar6.jt, akisVar16.t, akisVar16.aK, akkoVar10.L);
            case 31:
                almw almwVar = (almw) this.a.b.D.b();
                akvy akvyVar = (akvy) this.a.a.DY.b();
                csjk csjkVar2 = (csjk) this.a.a.fQ.b();
                errl errlVar4 = (errl) this.a.aK.b();
                akis akisVar17 = this.a;
                akko akkoVar11 = akisVar17.b;
                fbbf fbbfVar25 = akkoVar11.E;
                fbbf fbbfVar26 = akkoVar11.J;
                errl errlVar5 = (errl) akisVar17.p.b();
                akkp akkpVar7 = this.a.a;
                return new alns(almwVar, akvyVar, csjkVar2, errlVar4, fbbfVar25, fbbfVar26, errlVar5, akkpVar7.wf, akkpVar7.bj, akkpVar7.cN);
            case 32:
                akis akisVar18 = this.a;
                return new cszl(akisVar18.dE, (Context) akisVar18.q.b(), (cqoh) this.a.cz.b(), (dfpi) this.a.dF.b(), (ctyx) this.a.aU.b(), (errl) this.a.p.b(), (errl) this.a.aK.b());
            case 33:
                return new cszs((cszl) this.a.b.E.b(), (errl) this.a.p.b(), this.a.b.dI(), new ctac(), this.a.b.I);
            case 34:
                return new csyy((effy) this.a.b.F.b());
            case 35:
                akis akisVar19 = this.a;
                return csyz.a(csyn.a(), akisVar19.eA(), (efbm) akisVar19.aM.b());
            case 36:
                final fbbf fbbfVar27 = this.a.a.s;
                return new auwa() { // from class: auvy
                    @Override // defpackage.auwa
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_rcs_disabled_v2_survey");
                    }
                };
            case 37:
                return new cszy(this.a.b.aU());
            case 38:
                return Long.valueOf(fcwi.a(this.a.a.nA()));
            case Maneuver.TYPE_DESTINATION /* 39 */:
                akis akisVar20 = this.a;
                fbbf fbbfVar28 = akisVar20.cz;
                akkp akkpVar8 = akisVar20.a;
                return new ddpl(akkpVar8.fP, akkpVar8.az, akkpVar8.lO, (cqoh) fbbfVar28.b(), (errl) this.a.t.b());
            case 40:
                return Optional.of((coke) this.a.a.RH.b());
            case 41:
                akis akisVar21 = this.a;
                return new cvqf(akisVar21.a.dF, new aqcf(), (Executor) akisVar21.p.b());
            case 42:
                akis akisVar22 = this.a;
                akkp akkpVar9 = akisVar22.a;
                return new ajht(akkpVar9.az, akkpVar9.f, (errl) akisVar22.t.b());
            case 43:
                return Optional.of((cjqj) this.a.b.T.b());
            case 44:
                akkp akkpVar10 = this.a.a;
                fbbf fbbfVar29 = akkpVar10.lO;
                ffsk ffskVar2 = (ffsk) akkpVar10.aq.b();
                akis akisVar23 = this.a;
                fbbf fbbfVar30 = akisVar23.cP;
                akko akkoVar12 = akisVar23.b;
                cjwz bV = akkoVar12.bV();
                akkp akkpVar11 = akisVar23.a;
                fbbf fbbfVar31 = akkpVar11.Dy;
                fbbf fbbfVar32 = akkpVar11.gN;
                fbbf fbbfVar33 = akkoVar12.Q;
                ffhd ffhdVar = (ffhd) fbbfVar30.b();
                akko akkoVar13 = this.a.b;
                return new cjrb(fbbfVar29, ffskVar2, bV, fbbfVar31, fbbfVar32, fbbfVar33, ffhdVar, akkoVar13.R, akkoVar13.S);
            case 45:
                return new asuh() { // from class: asbu
                };
            case 46:
                return new cjtu(this.a.a.aT);
            case 47:
                final fbbf fbbfVar34 = this.a.a.s;
                return new auli() { // from class: aukp
                    @Override // defpackage.auli
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_profile_sharing_preference_logging");
                    }
                };
            case 48:
                return new alli((errl) this.a.p.b(), (algm) this.a.a.Dt.b(), this.a.b.V);
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return aljc.a((Context) this.a.q.b());
            case 50:
                akis akisVar24 = this.a;
                PackageManager S = akisVar24.S();
                ehur ehurVar = (ehur) akisVar24.b.X.b();
                errl errlVar6 = (errl) this.a.p.b();
                akis akisVar25 = this.a;
                akko akkoVar14 = akisVar25.b;
                fbbf fbbfVar35 = akisVar25.cz;
                fbbf fbbfVar36 = akkoVar14.Y;
                aevb R = akkoVar14.R();
                akkp akkpVar12 = akisVar25.a;
                return new aevr(S, ehurVar, errlVar6, fbbfVar35, fbbfVar36, R, akkpVar12.Ln, akkpVar12.Ll);
            case 51:
                return aeum.a((Context) this.a.q.b());
            case 52:
                return aevs.a(this.a.a.aT);
            case 53:
                return Long.valueOf(fdea.a(this.a.b.dk()));
            case 54:
                return Long.valueOf(fdeb.a(this.a.b.dk()));
            case 55:
                return Long.valueOf(fdee.a(this.a.b.dk()));
            case 56:
                return Long.valueOf(fded.a(this.a.b.dk()));
            case 57:
                return Long.valueOf(fdec.a(this.a.b.dk()));
            case 58:
                return Long.valueOf(fdeg.a(this.a.b.dk()));
            case 59:
                return Long.valueOf(fdef.a(this.a.b.dk()));
            case 60:
                return Long.valueOf(fddy.a(this.a.b.dk()));
            case 61:
                return Long.valueOf(fddz.a(this.a.b.dk()));
            case 62:
                return new aeva(this.a.a.az);
            case 63:
                akis akisVar26 = this.a;
                akkp akkpVar13 = akisVar26.a;
                return new ayzj(akkpVar13.az, akkpVar13.hQ, akkpVar13.cf, (errl) akisVar26.p.b());
            case 64:
                akis akisVar27 = this.a;
                return new cinf(akisVar27.a.az, (Context) akisVar27.q.b());
            case 65:
                return new twk(this.a.a.dF, new twc(), (Executor) this.a.p.b());
            case 66:
                akko akkoVar15 = this.a.b;
                return enip.s(akkoVar15.bu(), akkoVar15.y(), akkoVar15.ad());
            case 67:
                return new abva(this.a.b.dK());
            case 68:
                return new abrh(this.a.a.H);
            case 69:
                ffhd ffhdVar2 = (ffhd) this.a.cP.b();
                ffsk ffskVar3 = (ffsk) this.a.a.aq.b();
                akis akisVar28 = this.a;
                akkp akkpVar14 = akisVar28.a;
                return new cgfj(ffhdVar2, ffskVar3, akkpVar14.bi, akkpVar14.Dy, akisVar28.b.ap);
            case 70:
                return new cggd((ffhd) this.a.cP.b(), (ffsk) this.a.a.aq.b(), (effy) this.a.b.ao.b());
            case 71:
                akis akisVar29 = this.a;
                return cgge.a(cgfu.a(), akisVar29.eA(), (efbm) akisVar29.aM.b());
            case 72:
                return new cghj((cghm) this.a.a.eX.b(), (akzt) this.a.a.C.b());
            case 73:
                Context context3 = (Context) this.a.q.b();
                akis akisVar30 = this.a;
                return new cnew(context3, akisVar30.aV, akisVar30.aO, akisVar30.lQ, akisVar30.b.as);
            case 74:
                return new cteu((Context) this.a.q.b(), (Optional) this.a.aV.b(), (ctfj) this.a.a.nP.b());
            case 75:
                akis akisVar31 = this.a;
                akko akkoVar16 = akisVar31.b;
                fbbf fbbfVar37 = akkoVar16.av;
                Object pg = akisVar31.a.pg();
                ccba bE = akkoVar16.bE();
                cnjx cnjxVar = (cnjx) fbbfVar37.b();
                akis akisVar32 = this.a;
                return enip.v(pg, bE, cnjxVar, akisVar32.b.ds(), (cnjx) akisVar32.a.CE.b(), this.a.b.W(), this.a.b.cb(), this.a.b.aa());
            case 76:
                ffsk ffskVar4 = (ffsk) this.a.a.p.b();
                akis akisVar33 = this.a;
                fbbf fbbfVar38 = akisVar33.aZ;
                akkp akkpVar15 = akisVar33.a;
                fbbf fbbfVar39 = akkpVar15.HR;
                fbbf fbbfVar40 = akkpVar15.HY;
                fbbf fbbfVar41 = akkpVar15.Ig;
                ctvs ctvsVar = (ctvs) fbbfVar38.b();
                akis akisVar34 = this.a;
                fbbf fbbfVar42 = akisVar34.mY;
                fbbf fbbfVar43 = akisVar34.dX;
                akkp akkpVar16 = akisVar34.a;
                return new axvh(ffskVar4, fbbfVar39, fbbfVar40, fbbfVar41, ctvsVar, fbbfVar42, fbbfVar43, akkpVar16.PY, akkpVar16.ml, akkpVar16.RB, akisVar34.b.au, akkpVar16.mn);
            case 77:
                akis akisVar35 = this.a;
                akkp akkpVar17 = akisVar35.a;
                return new ayei(akkpVar17.mn, akisVar35.mY, akkpVar17.mo);
            case 78:
                akis akisVar36 = this.a;
                fbbf fbbfVar44 = akisVar36.b.av;
                Object pg2 = akisVar36.a.pg();
                cnjs cnjsVar = (cnjs) fbbfVar44.b();
                akis akisVar37 = this.a;
                akkp akkpVar18 = akisVar37.a;
                cnvb jR = akkpVar18.jR();
                Object ds = akisVar37.b.ds();
                cnjs cnjsVar2 = (cnjs) akkpVar18.CE.b();
                akis akisVar38 = this.a;
                akko akkoVar17 = akisVar38.b;
                akby W = akisVar38.b.W();
                akis akisVar39 = this.a;
                return enip.v(pg2, cnjsVar, jR, ds, cnjsVar2, W, akkoVar17.cb(), akisVar39.b.aa(), akisVar39.a.jT());
            case 79:
                return Optional.of(this.a.b.dv());
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                return new cnho((ejoc) this.a.dX.b());
            case 81:
                return Optional.of(this.a.b.bL());
            case 82:
                return new edys(this.a.b.dB());
            case 83:
                final emxc j = emxc.j(dtnt.a());
                return new edyz() { // from class: dtnr
                    @Override // defpackage.edyz
                    public final void a() {
                        dtns.d = (dtns) ((emxn) emxc.this).a;
                    }
                };
            case 84:
                return ekno.a((Context) this.a.q.b(), this.a.b.a());
            case 85:
                final enip q = enip.q();
                return new edyz() { // from class: ekzk
                    @Override // defpackage.edyz
                    public final void a() {
                        elau.a = 1;
                        ekxm.a = 3;
                        elag.a = 1;
                        Set set = q;
                        if (!set.isEmpty()) {
                            ekyf.t(enip.o(set));
                        }
                        ekxo.a = 3;
                    }
                };
            case 86:
                this.a.a.mo();
                return new edyz() { // from class: ecji
                    @Override // defpackage.edyz
                    public final void a() {
                        Boolean bool = false;
                        bool.getClass();
                    }
                };
            case 87:
                final Context context4 = (Context) this.a.q.b();
                akko akkoVar18 = this.a.b;
                final emxc j2 = emxc.j(akkoVar18.dd());
                final edyp ed = this.a.ed();
                final fbbf fbbfVar45 = akkoVar18.aI;
                return new edyz() { // from class: edyu
                    /* JADX WARN: Type inference failed for: r0v4, types: [emwl, java.lang.Object] */
                    @Override // defpackage.edyz
                    public final void a() {
                        if (!edyp.this.a()) {
                            Boolean bool = false;
                            bool.getClass();
                            return;
                        }
                        emxc emxcVar = j2;
                        ffbr ffbrVar = fbbfVar45;
                        Application application = (Application) context4;
                        application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks) ((emxn) emxcVar).a.apply(new edyv(application, ffbrVar, emxcVar)));
                    }
                };
            case 88:
                akko akkoVar19 = this.a.b;
                return enip.t(akkoVar19.c(), akkoVar19.b(), new eknk(), this.a.b.d());
            case 89:
                return ejjm.a((ffhd) this.a.a.rZ.b());
            case 90:
                return new ekgh();
            case 91:
                final Context context5 = (Context) this.a.q.b();
                return new edyz() { // from class: ekqg
                    @Override // defpackage.edyz
                    public final void a() {
                        efao efaoVar = new efao(new efar());
                        efap efapVar = new efap(context5);
                        synchronized (efao.b) {
                            if (efap.a != null) {
                                return;
                            }
                            efap.a = efapVar;
                            if (efao.c == null) {
                                efao.c = new efat();
                            }
                            if (Security.insertProviderAt(efao.c, 1) != 1) {
                                throw new RuntimeException("Failed to install SslGuard with top priority.");
                            }
                            efas efasVar = efaoVar.d;
                            efas efasVar2 = efav.a;
                            if (efasVar == null) {
                                throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
                            }
                            efav.a = efasVar;
                            efas efasVar3 = efaoVar.d;
                            efas efasVar4 = efau.a;
                            if (efasVar3 == null) {
                                throw new AssertionError("Cannot initialize SslGuardSocketFactory will null");
                            }
                            efau.a = efasVar3;
                            efao.b();
                            efao.a();
                            Log.i(efao.a, "SslGuard completed installation.");
                        }
                    }
                };
            case 92:
                akis akisVar40 = this.a;
                final enip q2 = enip.q();
                final emxc j3 = emxc.j(Boolean.valueOf(akisVar40.b.dM()));
                return new edyz() { // from class: eleh
                    @Override // defpackage.edyz
                    public final void a() {
                        Set set = q2;
                        if (!set.isEmpty()) {
                            ekyf.t(enip.o(set));
                        }
                        if (((Boolean) ((emxn) j3).a).booleanValue()) {
                            ekyf.a = false;
                        } else {
                            ekyf.a = true;
                        }
                    }
                };
            case 93:
                return new eeqq((Context) this.a.q.b());
            case 94:
                this.a.ed();
                Optional empty2 = Optional.empty();
                Optional.empty();
                akko akkoVar20 = this.a.b;
                return new ekid(empty2, akkoVar20.bc, akkoVar20.be, akkoVar20.bf);
            case 95:
                Context context6 = (Context) this.a.q.b();
                akis akisVar41 = this.a;
                edyp ed2 = akisVar41.ed();
                akko akkoVar21 = akisVar41.b;
                Map dD = akkoVar21.dD();
                Map dz = akkoVar21.dz();
                errl errlVar7 = (errl) akisVar41.t.b();
                fazb a2 = fbaz.a(this.a.a.n);
                akis akisVar42 = this.a;
                return new ekic(context6, ed2, dD, dz, errlVar7, a2, akisVar42.aJ, akisVar42.bw);
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                final eiyh mv = this.a.a.mv();
                return new ekhx() { // from class: eiyn
                    @Override // defpackage.ekhx
                    public final ListenableFuture a() {
                        ejjz.c(eiyh.this.b(), "Failed account invalidation.", new Object[0]);
                        return erre.a;
                    }
                };
            case 97:
                final Context context7 = (Context) this.a.q.b();
                return new ekhx() { // from class: ekqf
                    @Override // defpackage.ekhx
                    public final ListenableFuture a() {
                        Context context8 = context7;
                        try {
                            PackageInfo packageInfo = context8.getPackageManager().getPackageInfo(context8.getPackageName(), 0);
                            if (packageInfo.applicationInfo.targetSdkVersion < 24) {
                                try {
                                    Os.chmod(packageInfo.applicationInfo.dataDir, 448);
                                } catch (Exception e) {
                                    throw new IOException(e);
                                }
                            }
                        } catch (PackageManager.NameNotFoundException | IOException unused) {
                        }
                        return erre.a;
                    }
                };
            case 98:
                return new dvvq((dvva) this.a.b.aT.b());
            case 99:
                errl errlVar8 = (errl) this.a.gA.b();
                akis akisVar43 = this.a;
                fbbf fbbfVar46 = akisVar43.gY;
                fazb a3 = fbaz.a(akisVar43.gl);
                String str = (String) this.a.fR.b();
                akis akisVar44 = this.a;
                akisVar44.dU();
                return new dvvg(errlVar8, fbbfVar46, a3, str, fbaz.a(akisVar44.b.aS));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.b;
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return dvgg.a((dvfu) this.a.b.aR.b(), (ffsk) this.a.a.p.b());
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return new dvgf((ealf) this.a.gP.b(), fbaz.a(this.a.gi), (ffhd) this.a.co.b(), (Context) this.a.q.b(), this.a.b.dC());
            case 102:
                return Long.valueOf(dvqh.b());
            case 103:
                return Long.valueOf(dvqh.a(((Boolean) this.a.gE.b()).booleanValue()));
            case 104:
                return ekfr.a((ekav) this.a.a.ba.b(), this.a.ed(), emxc.h());
            case 105:
                ecxc ecxcVar = (ecxc) this.a.bH.b();
                akis akisVar = this.a;
                return ekfs.a(ecxcVar, akisVar.b.cY(), akisVar.ed(), emxc.h());
            case 106:
                akis akisVar2 = this.a;
                return ekby.a(enhk.k(), enhk.k(), akisVar2.fS(), (Map) akisVar2.bO.b(), (Map) this.a.bR.b());
            case 107:
                akis akisVar3 = this.a;
                return ekbz.a(enhk.k(), akisVar3.fS(), (Map) akisVar3.bO.b(), (Map) this.a.bR.b());
            case 108:
                akis akisVar4 = this.a;
                return new ekua(akisVar4.b.ba, ((Boolean) akisVar4.cd.b()).booleanValue());
            case 109:
                boolean booleanValue = ((Boolean) this.a.cd.b()).booleanValue();
                akis akisVar5 = this.a;
                return ektt.a(booleanValue, akisVar5.a.Ui, akisVar5.b.aZ);
            case 110:
                return new ekrx();
            case 111:
                Context context = (Context) this.a.q.b();
                akis akisVar6 = this.a;
                edyp ed = akisVar6.ed();
                ExecutorService executorService = (ExecutorService) akisVar6.p.b();
                ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.t.b();
                akis akisVar7 = this.a;
                akko akkoVar = akisVar7.b;
                return new ekjg(context, ed, executorService, scheduledExecutorService, akisVar7.N(), akkoVar.dD(), akkoVar.dz(), fbaz.a(akkoVar.bd));
            case 112:
                return ekjh.a((Context) this.a.q.b(), (efix) this.a.v.b());
            case 113:
                return new ejnq((Executor) this.a.aK.b());
            case 114:
                return new ejzp((Context) this.a.q.b(), (errl) this.a.t.b(), (ejjz) this.a.a.n.b(), this.a.b.bj);
            case 115:
                akis akisVar8 = this.a;
                return new ejzq(akisVar8.b.dc(), akisVar8.b.bi, fbbh.a());
            case 116:
                return new enpx(this.a.b.da());
            case 117:
                return enip.t((enus) this.a.b.bl.b(), (enus) this.a.b.br.b(), (enus) this.a.b.bs.b(), (enus) this.a.b.bu.b());
            case 118:
                return ekmf.a(this.a.a.PE.b());
            case 119:
                Context context2 = (Context) this.a.q.b();
                fazb a = fbaz.a(this.a.dR);
                akko akkoVar2 = this.a.b;
                return eklw.a(context2, a, akkoVar2.bo.b(), (dfmp) akkoVar2.bq.b(), this.a.fF());
            case 120:
                return new ekma((evif) this.a.b.bm.b(), fbaz.a(this.a.a.au), (ekly) this.a.b.bn.b());
            case 121:
                return eklv.a((Context) this.a.q.b(), fbaz.a(this.a.dR), emxc.j(true));
            case 122:
                return new ekly();
            case 123:
                return new dfmp(this.a.b.bp);
            case 124:
                return evim.a();
            case 125:
                return new ecft((ecfu) this.a.b.bt.b());
            case 126:
                return new ecfu((ecga) this.a.aa.b());
            case 127:
                return enip.r((edyw) this.a.a.PE.b(), this.a.fp());
            case 128:
                Context context3 = (Context) this.a.q.b();
                ScheduledExecutorService scheduledExecutorService2 = (ScheduledExecutorService) this.a.t.b();
                ScheduledExecutorService scheduledExecutorService3 = (ScheduledExecutorService) this.a.aK.b();
                akis akisVar9 = this.a;
                elbx elbxVar = (elbx) akisVar9.aJ.b();
                akis akisVar10 = this.a;
                return new cpef(context3, scheduledExecutorService2, scheduledExecutorService3, akisVar9.cT, elbxVar, akisVar10.aZ, akisVar10.b.cj);
            case 129:
                akis akisVar11 = this.a;
                cpdp cpdpVar = cpdp.APP_CREATED;
                akko akkoVar3 = akisVar11.b;
                return enhk.n(cpdpVar, akkoVar3.bC, cpdp.PERMISSIONS_ACQUIRED, akkoVar3.bN, cpdp.APP_INTERACTIVE, akkoVar3.ci);
            case 130:
                return new enpx(this.a.b.ck());
            case 131:
                Context context4 = (Context) this.a.q.b();
                akis akisVar12 = this.a;
                fbbf fbbfVar = akisVar12.aK;
                akkp akkpVar = akisVar12.a;
                fbbf fbbfVar2 = akkpVar.f;
                fbbf fbbfVar3 = akkpVar.sO;
                fbbf fbbfVar4 = akkpVar.di;
                fbbf fbbfVar5 = akkpVar.fP;
                fbbf fbbfVar6 = akkpVar.jZ;
                fbbf fbbfVar7 = akkpVar.cI;
                fbbf fbbfVar8 = akkpVar.fJ;
                errl errlVar = (errl) fbbfVar.b();
                akis akisVar13 = this.a;
                akkp akkpVar2 = akisVar13.a;
                fbbf fbbfVar9 = akkpVar2.iK;
                fbbf fbbfVar10 = akkpVar2.cT;
                fbbf fbbfVar11 = akkpVar2.H;
                fbbf fbbfVar12 = akkpVar2.Ex;
                fbbf fbbfVar13 = akisVar13.b.bz;
                return new akvb(context4, akisVar12.aO, fbbfVar2, fbbfVar3, akisVar12.b.by, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, akisVar12.aZ, fbbfVar8, errlVar, fbbfVar9, fbbfVar10, fbbfVar11, fbbfVar12, fbbfVar13);
            case 132:
                akis akisVar14 = this.a;
                return alah.a(akisVar14.a.al, akisVar14.ae());
            case 133:
                return Boolean.valueOf(fcwl.a(this.a.a.nB()));
            case 134:
                Context context5 = (Context) this.a.q.b();
                akis akisVar15 = this.a;
                return new cwjn(context5, akisVar15.cb, akisVar15.a.f, (errl) akisVar15.t.b());
            case 135:
                akko akkoVar4 = this.a.b;
                return enip.r(akkoVar4.cl(), akkoVar4.bG());
            case 136:
                Context context6 = (Context) this.a.q.b();
                akis akisVar16 = this.a;
                fazb a2 = fbaz.a(akisVar16.a.c);
                fazb a3 = fbaz.a(this.a.a.fu);
                errl errlVar2 = (errl) this.a.t.b();
                akis akisVar17 = this.a;
                akkp akkpVar3 = akisVar17.a;
                fbbf fbbfVar14 = akkpVar3.EM;
                fbbf fbbfVar15 = akkpVar3.sY;
                akko akkoVar5 = akisVar17.b;
                return new akve(context6, akisVar16.aU, a2, a3, errlVar2, fbbfVar14, fbbfVar15, akisVar17.aZ, akkoVar5.bK, akkoVar5.bL);
            case 137:
                Context context7 = (Context) this.a.q.b();
                Executor executor = (Executor) this.a.t.b();
                errl errlVar3 = (errl) this.a.aK.b();
                ffsk ffskVar = (ffsk) this.a.a.q.b();
                ffsk ffskVar2 = (ffsk) this.a.a.aq.b();
                akis akisVar18 = this.a;
                fbbf fbbfVar16 = akisVar18.a.Om;
                ejlk ejlkVar = (ejlk) akisVar18.ds.b();
                akis akisVar19 = this.a;
                akko akkoVar6 = akisVar19.b;
                return new coqx(context7, executor, errlVar3, ffskVar, ffskVar2, fbbfVar16, ejlkVar, akisVar19.aJ, akisVar19.mq, akkoVar6.bG, akkoVar6.bH, akkoVar6.bI, akkoVar6.bJ);
            case 138:
                akis akisVar20 = this.a;
                akkp akkpVar4 = akisVar20.a;
                akko akkoVar7 = akisVar20.b;
                return new coqz(akkoVar7.bD, akkpVar4.NU, akkpVar4.aq, akisVar20.dX, akkoVar7.bF, akkpVar4.NX);
            case 139:
                return Long.valueOf(fdep.a(this.a.a.ol()));
            case 140:
                return fdeo.a(this.a.a.ol());
            case 141:
                return new corg(this.a.a.cc);
            case 142:
                return new cosg((Context) this.a.q.b(), (ffsk) this.a.a.aq.b());
            case 143:
                final fbbf fbbfVar17 = this.a.a.s;
                return new atrp() { // from class: atow
                    @Override // defpackage.atrp
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_context_registered_receiver");
                    }
                };
            case 144:
                final fbbf fbbfVar18 = this.a.a.s;
                return new atrr() { // from class: atpa
                    @Override // defpackage.atrr
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_manifest_registered_receiver");
                    }
                };
            case 145:
                akkp akkpVar5 = this.a.a;
                return new cnfc(akkpVar5.ft, akkpVar5.hO);
            case 146:
                cpdo cpdoVar = (cpdo) this.a.b.bO.b();
                akko akkoVar8 = this.a.b;
                fbbf fbbfVar19 = akkoVar8.bS;
                cpdo cg = akkoVar8.cg();
                cpdo ch = akkoVar8.ch();
                cpdo cpdoVar2 = (cpdo) fbbfVar19.b();
                akis akisVar21 = this.a;
                akko akkoVar9 = akisVar21.b;
                return enip.v(cpdoVar, cg, ch, cpdoVar2, akkoVar9.i(), akkoVar9.z(), akisVar21.b.cn(), this.a.b.bJ(), this.a.b.I(), this.a.b.bC(), this.a.b.bM(), this.a.b.cz(), this.a.b.bF(), this.a.b.bw(), this.a.b.ab(), this.a.b.cm(), this.a.b.bY(), this.a.b.bN(), this.a.b.cw());
            case 147:
                akis akisVar22 = this.a;
                fbbf fbbfVar20 = akisVar22.aK;
                akkp akkpVar6 = akisVar22.a;
                return new ayga(akkpVar6.hv, akkpVar6.mF, (errl) fbbfVar20.b());
            case 148:
                ejmh ejmhVar = (ejmh) this.a.hA.b();
                ffsk ffskVar3 = (ffsk) this.a.a.q.b();
                akis akisVar23 = this.a;
                return new cves(ejmhVar, ffskVar3, akisVar23.a.Dh, akisVar23.b.ce(), (ctud) akisVar23.cT.b(), (cqoh) this.a.cz.b());
            case 149:
                akis akisVar24 = this.a;
                fbbf fbbfVar21 = akisVar24.aK;
                fbbf fbbfVar22 = akisVar24.a.tR;
                errl errlVar4 = (errl) fbbfVar21.b();
                akis akisVar25 = this.a;
                akkp akkpVar7 = akisVar25.a;
                akko akkoVar10 = akisVar25.b;
                return new ceox(fbbfVar22, akkoVar10.bQ, akkpVar7.uc, akkoVar10.bR, akkpVar7.f, errlVar4);
            case 150:
                return new ceos((Context) this.a.q.b(), (elbx) this.a.aJ.b());
            case 151:
                akis akisVar26 = this.a;
                akkp akkpVar8 = akisVar26.a;
                Set dL = akisVar26.b.dL();
                return new cbdj(dL, this.a.a.SE);
            case 152:
                return new abqs(this.a.b.dJ());
            case 153:
                abqx abqxVar = new abqx();
                akis akisVar27 = this.a;
                return new abqy(abqxVar, akisVar27.b.v(), akisVar27.b.bX);
            case 154:
                dtuu dtuuVar = (dtuu) this.a.a.ay.b();
                akis akisVar28 = this.a;
                akko akkoVar11 = akisVar28.b;
                return new absv(dtuuVar, akkoVar11.bT, akkoVar11.bW, akisVar28.a.dn, (asvb) akkoVar11.bV.b(), (asnw) this.a.a.hr.b());
            case 155:
                akis akisVar29 = this.a;
                return new abrc(akisVar29.t, akisVar29.p, akisVar29.b.al);
            case 156:
                akis akisVar30 = this.a;
                akkp akkpVar9 = akisVar30.a;
                fbbf fbbfVar23 = akkpVar9.jA;
                akko akkoVar12 = akisVar30.b;
                return new absk(fbbfVar23, akkoVar12.am, akkpVar9.L, akkpVar9.dB, akkpVar9.Z, akkoVar12.al, akkpVar9.aO, akkpVar9.c, akkpVar9.hX, akkpVar9.aq, akkoVar12.bU, akkpVar9.al, akkoVar12.by, akkoVar12.bV, akkpVar9.mu, akkpVar9.mT);
            case 157:
                return new emar();
            case 158:
                final fbbf fbbfVar24 = this.a.a.s;
                return new asvb() { // from class: asdd
                    @Override // defpackage.asvb
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.rcs_group_forking_with_same_group_name_fix");
                    }
                };
            case 159:
                abqx abqxVar2 = new abqx();
                akko akkoVar13 = this.a.b;
                return new abtj(abqxVar2, akkoVar13.x(), akkoVar13.w());
            case 160:
                return new coly((effy) this.a.b.cb.b());
            case 161:
                akis akisVar31 = this.a;
                return cols.a(akisVar31.b.cZ(), akisVar31.eA(), (efbm) akisVar31.aM.b());
            case 162:
                return new caib(this.a.a.cc);
            case 163:
                return new cqol((Context) this.a.q.b(), (ffsk) this.a.a.p.b(), (cqoh) this.a.cz.b());
            case 164:
                return new cesd(this.a.a.cc);
            case 165:
                Context context8 = (Context) this.a.q.b();
                dtuu dtuuVar2 = (dtuu) this.a.a.ay.b();
                akkp akkpVar10 = this.a.a;
                return new cbxr(context8, dtuuVar2, akkpVar10.ib, akkpVar10.dn, (baam) akkpVar10.JM.b(), (cvbr) this.a.a.fe.b(), (ctyz) this.a.fM.b(), (cbgf) this.a.a.dA.b(), (errl) this.a.t.b());
            case 166:
                return new cbxv((cvbr) this.a.a.fe.b(), (cvad) this.a.a.EY.b(), (akzt) this.a.a.f.b(), (errl) this.a.p.b());
            case 167:
                return enip.t(new cskd(), (csiv) this.a.b.cn.b(), new ciuy(), this.a.b.co());
            case 168:
                return new csiu(this.a.b.dH());
            case 169:
                csic csicVar = (csic) this.a.b.e.b();
                csic csicVar2 = (csic) this.a.aN.b();
                akko akkoVar14 = this.a.b;
                return enip.t(csicVar, csicVar2, akkoVar14.cy(), akkoVar14.du());
            case 170:
                ffsk ffskVar4 = (ffsk) this.a.a.p.b();
                ffhd ffhdVar = (ffhd) this.a.cn.b();
                ffhd ffhdVar2 = (ffhd) this.a.cP.b();
                akkp akkpVar11 = this.a.a;
                return new chgf(ffskVar4, ffhdVar, ffhdVar2, akkpVar11.br, akkpVar11.cG, akkpVar11.gr, akkpVar11.kd);
            case 171:
                return new azyu((azzc) this.a.fr());
            case 172:
                return duaz.a(this.a.b.dG());
            case 173:
                return new dycq(new akmc(this.a));
            case 174:
                return new dlru(this.a.b.cI());
            case 175:
                akis akisVar32 = this.a;
                return airc.a(akisVar32.b.w, akisVar32.eq());
            case 176:
                akis akisVar33 = this.a;
                return cnhu.a(akisVar33.b.ct, akisVar33.eq());
            case 177:
                ffsk ffskVar5 = (ffsk) this.a.a.aq.b();
                Context context9 = (Context) this.a.q.b();
                akis akisVar34 = this.a;
                akkp akkpVar12 = akisVar34.a;
                fbbf fbbfVar25 = akkpVar12.jx;
                fbbf fbbfVar26 = akisVar34.aZ;
                fbbf fbbfVar27 = akisVar34.cz;
                fbbf fbbfVar28 = akisVar34.aU;
                fbbf fbbfVar29 = akkpVar12.fP;
                akko akkoVar15 = akisVar34.b;
                return new cnhs(ffskVar5, context9, fbbfVar25, fbbfVar26, fbbfVar27, fbbfVar28, fbbfVar29, akkoVar15.D, akkoVar15.at, akisVar34.hv, akkpVar12.RQ, akkoVar15.ax, akkoVar15.ay, akkpVar12.pC);
            case 178:
                akis akisVar35 = this.a;
                return ayby.a(akisVar35.b.cv, akisVar35.eq());
            case 179:
                ffsk ffskVar6 = (ffsk) this.a.a.p.b();
                aycf aycfVar = (aycf) this.a.mX.b();
                akis akisVar36 = this.a;
                fbbf fbbfVar30 = akisVar36.a.HT;
                ejoc ejocVar = (ejoc) akisVar36.dX.b();
                akis akisVar37 = this.a;
                akkp akkpVar13 = akisVar37.a;
                return new aybw(ffskVar6, aycfVar, fbbfVar30, ejocVar, akkpVar13.mj, akisVar37.mY, akkpVar13.HR, akkpVar13.If);
            case 180:
                akis akisVar38 = this.a;
                return axuu.a(akisVar38.b.cx, akisVar38.eq());
            case 181:
                return new axus((ffsk) this.a.a.p.b(), this.a.b.av);
            case 182:
                akis akisVar39 = this.a;
                return aydb.a(akisVar39.b.cz, akisVar39.eq());
            case 183:
                ffsk ffskVar7 = (ffsk) this.a.a.p.b();
                aycf aycfVar2 = (aycf) this.a.mX.b();
                akis akisVar40 = this.a;
                fbbf fbbfVar31 = akisVar40.a.Ib;
                ejoc ejocVar2 = (ejoc) akisVar40.dX.b();
                akis akisVar41 = this.a;
                akkp akkpVar14 = akisVar41.a;
                return new aycz(ffskVar7, aycfVar2, fbbfVar31, ejocVar2, akkpVar14.mj, akisVar41.mY, akkpVar14.HR, akkpVar14.If);
            case 184:
                akis akisVar42 = this.a;
                return ayze.a(akisVar42.b.cB, akisVar42.eq());
            case 185:
                return new ayzc((ejoc) this.a.dX.b(), (errl) this.a.p.b());
            case 186:
                akis akisVar43 = this.a;
                return cmmn.a(akisVar43.b.cQ, akisVar43.eq());
            case 187:
                Context context10 = (Context) this.a.q.b();
                akis akisVar44 = this.a;
                fbbf fbbfVar32 = akisVar44.aK;
                akkp akkpVar15 = akisVar44.a;
                fbbf fbbfVar33 = akkpVar15.gJ;
                fbbf fbbfVar34 = akkpVar15.cL;
                fbbf fbbfVar35 = akkpVar15.fQ;
                errl errlVar5 = (errl) fbbfVar32.b();
                akkp akkpVar16 = this.a.a;
                fbbf fbbfVar36 = akkpVar16.Cw;
                fbbf fbbfVar37 = akkpVar16.Cz;
                asvd bR = akkpVar16.bR();
                fbbf fbbfVar38 = akkpVar16.cK;
                fbbf fbbfVar39 = akkpVar16.EP;
                akko akkoVar16 = akisVar44.b;
                return new cmml(context10, fbbfVar33, fbbfVar34, akkoVar16.cE, akkoVar16.cP, fbbfVar35, akkoVar16.cF, errlVar5, fbbfVar36, fbbfVar37, bR, fbbfVar38, fbbfVar39);
            case 188:
                return new djxv((dkeh) this.a.b.cD.b(), (dkpm) this.a.a.EM.b(), (dkcp) this.a.a.gJ.b(), (cguo) this.a.a.cK.b());
            case 189:
                return new dkeh();
            case 190:
                dikl diklVar = (dikl) this.a.a.Cw.b();
                djxx djxxVar = (djxx) this.a.b.cF.b();
                djtw djtwVar = (djtw) this.a.b.cG.b();
                dkpm dkpmVar = (dkpm) this.a.a.EM.b();
                djvk djvkVar = (djvk) this.a.b.cO.b();
                ctwb ctwbVar = (ctwb) this.a.a.c.b();
                ExecutorService executorService2 = (ExecutorService) this.a.aK.b();
                akis akisVar45 = this.a;
                return new djvo(diklVar, djxxVar, djtwVar, dkpmVar, djvkVar, ctwbVar, executorService2, akisVar45.hk, akisVar45.a.cK);
            case 191:
                return new djxx(this.a.b.cF());
            case 192:
                Context context11 = (Context) this.a.q.b();
                akis akisVar46 = this.a;
                return new djtw(context11, akisVar46.b.cE(), (ctwb) akisVar46.a.c.b());
            case 193:
                Context context12 = (Context) this.a.q.b();
                diju dijuVar = (diju) this.a.b.cH.b();
                dkrx dkrxVar = (dkrx) this.a.dO.b();
                dkdv dkdvVar = (dkdv) this.a.b.cJ.b();
                ctvb ctvbVar = (ctvb) this.a.a.u.b();
                dkcp dkcpVar = (dkcp) this.a.a.gJ.b();
                dkpp dkppVar = (dkpp) this.a.aQ.b();
                dkpj dkpjVar = (dkpj) this.a.b.cK.b();
                dkpm dkpmVar2 = (dkpm) this.a.a.EM.b();
                akis akisVar47 = this.a;
                akkp akkpVar17 = akisVar47.a;
                fbbf fbbfVar40 = akisVar47.hk;
                fbbf fbbfVar41 = akkpVar17.bj;
                akko akkoVar17 = akisVar47.b;
                return new djvk(context12, dijuVar, dkrxVar, dkdvVar, ctvbVar, dkcpVar, dkppVar, dkpjVar, dkpmVar2, fbbfVar40, fbbfVar41, akkoVar17.cL, akkoVar17.cM, akkpVar17.cK, akkoVar17.cN);
            case 194:
                return new diju((djix) this.a.a.cM.b(), (dkpp) this.a.aQ.b(), cmnc.a(), (errl) this.a.aK.b(), (dijt) this.a.a.cN.b());
            case 195:
                Context context13 = (Context) this.a.q.b();
                efgc efgcVar = (efgc) this.a.hU.b();
                dikr dikrVar = (dikr) this.a.b.cI.b();
                errl errlVar6 = (errl) this.a.aK.b();
                akis akisVar48 = this.a;
                return new dkdv(context13, efgcVar, dikrVar, errlVar6, akisVar48.hk, akisVar48.a.cN);
            case 196:
                return new dikr((djix) this.a.a.cM.b(), (dkpp) this.a.aQ.b(), cmnc.a(), (errl) this.a.aK.b(), (dijt) this.a.a.cN.b());
            case 197:
                return new dkpj((dksa) this.a.a.gH.b());
            case 198:
                return new divl(this.a.a.s);
            case 199:
                return new divf(this.a.a.s);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object d() {
        int i = this.b;
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                return new diwc(this.a.a.s);
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                akis akisVar = this.a;
                return cmmt.a(akisVar.b.cS, akisVar.eq());
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                Context context = (Context) this.a.q.b();
                akis akisVar2 = this.a;
                fbbf fbbfVar = akisVar2.aK;
                akkp akkpVar = akisVar2.a;
                fbbf fbbfVar2 = akkpVar.gJ;
                fbbf fbbfVar3 = akkpVar.fQ;
                errl errlVar = (errl) fbbfVar.b();
                akkp akkpVar2 = this.a.a;
                fbbf fbbfVar4 = akkpVar2.bj;
                fbbf fbbfVar5 = akkpVar2.cK;
                akko akkoVar = akisVar2.b;
                return new cmmr(context, fbbfVar2, akkoVar.cE, akkoVar.cP, fbbfVar3, errlVar, fbbfVar4, fbbfVar5);
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                akis akisVar3 = this.a;
                return cnox.a(akisVar3.b.cV, akisVar3.eq());
            case 204:
                azei azeiVar = (azei) this.a.a.Pa.b();
                akis akisVar4 = this.a;
                akkp akkpVar3 = akisVar4.a;
                cnom ca = akisVar4.b.ca();
                azpx azpxVar = (azpx) akkpVar3.hB.b();
                azpo azpoVar = (azpo) this.a.a.he.b();
                csjk csjkVar = (csjk) this.a.a.el.b();
                ejoc ejocVar = (ejoc) this.a.dX.b();
                akis akisVar5 = this.a;
                return new cnov(azeiVar, ca, azpxVar, azpoVar, csjkVar, ejocVar, akisVar5.b.dp(), (ffsk) akisVar5.a.aq.b(), (ffhd) this.a.cP.b());
            case 205:
                return Long.valueOf(fdho.a(this.a.b.m164do()));
            case 206:
                akis akisVar6 = this.a;
                return cnpv.a(akisVar6.b.cZ, akisVar6.eq());
            case 207:
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                akis akisVar7 = this.a;
                akko akkoVar2 = akisVar7.b;
                return new cnpt(ffskVar, akkoVar2.cX, akkoVar2.cY, akisVar7.aN);
            case 208:
                akkp akkpVar4 = this.a.a;
                return new cnpx(akkpVar4.kd, akkpVar4.br, akkpVar4.bC, (csmk) akkpVar4.hc.b());
            case 209:
                akkp akkpVar5 = this.a.a;
                return new cnpo(akkpVar5.bj, (ctwb) akkpVar5.c.b(), this.a.b.de());
            case 210:
                akis akisVar8 = this.a;
                return cjsb.a(akisVar8.b.dc, akisVar8.eq());
            case 211:
                ffsk ffskVar2 = (ffsk) this.a.a.q.b();
                akis akisVar9 = this.a;
                akko akkoVar3 = akisVar9.b;
                akkp akkpVar6 = akisVar9.a;
                return new cjrz(ffskVar2, akkpVar6.dg, akkpVar6.df, akkpVar6.Lr, akkpVar6.dn, akkoVar3.db);
            case 212:
                final fbbf fbbfVar6 = this.a.a.s;
                return new aulh() { // from class: aukn
                    @Override // defpackage.aulh
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.clear_self_profiles_table_in_worker");
                    }
                };
            case 213:
                return delw.a((Context) this.a.q.b(), (eivc) this.a.a.Ul.b(), enhk.k(), (Executor) this.a.t.b(), (Executor) this.a.p.b());
            case 214:
                return cjxh.a((Context) this.a.q.b(), (eivc) this.a.a.Ul.b(), enhk.k(), (Executor) this.a.t.b(), (Executor) this.a.p.b());
            case 215:
                akis akisVar10 = this.a;
                return clep.a(akisVar10.b.dh, akisVar10.eq());
            case 216:
                return new clen(this.a.b.dg);
            case 217:
                cqoh cqohVar = (cqoh) this.a.cz.b();
                errl errlVar2 = (errl) this.a.t.b();
                errl errlVar3 = (errl) this.a.p.b();
                akis akisVar11 = this.a;
                akko akkoVar4 = akisVar11.b;
                akkp akkpVar7 = akisVar11.a;
                return new cleh(cqohVar, errlVar2, errlVar3, akkpVar7.hP, akisVar11.lH, akkpVar7.hw, akkpVar7.Z, akisVar11.ki, akkoVar4.bv(), akkpVar7.hK, akkpVar7.br, (atky) akkpVar7.rs.b());
            case 218:
                akis akisVar12 = this.a;
                return cmob.a(akisVar12.b.dn, akisVar12.eq());
            case 219:
                akis akisVar13 = this.a;
                errm errmVar = (errm) akisVar13.p.b();
                errl errlVar4 = (errl) this.a.t.b();
                akis akisVar14 = this.a;
                fbbf fbbfVar7 = akisVar14.aK;
                akkp akkpVar8 = akisVar14.a;
                fbbf fbbfVar8 = akkpVar8.wi;
                fbbf fbbfVar9 = akkpVar8.D;
                errl errlVar5 = (errl) fbbfVar7.b();
                akko akkoVar5 = akisVar13.b;
                return new cmnz(akkoVar5.dm, akkoVar5.dk, errmVar, errlVar4, fbbfVar8, fbbfVar9, errlVar5);
            case 220:
                Context context2 = (Context) this.a.q.b();
                akis akisVar15 = this.a;
                dkcp dkcpVar = (dkcp) akisVar15.a.gJ.b();
                dikl diklVar = (dikl) this.a.a.Cw.b();
                dkpm dkpmVar = (dkpm) this.a.a.EM.b();
                djuo djuoVar = (djuo) this.a.b.dk.b();
                djup djupVar = (djup) this.a.b.dl.b();
                errl errlVar6 = (errl) this.a.t.b();
                cguo cguoVar = (cguo) this.a.a.cK.b();
                cgud cgudVar = (cgud) this.a.a.vW.b();
                errl errlVar7 = (errl) this.a.aK.b();
                akis akisVar16 = this.a;
                return new djuk(context2, akisVar15.b.dj, dkcpVar, diklVar, dkpmVar, djuoVar, djupVar, errlVar6, cguoVar, cgudVar, errlVar7, akisVar16.a.CA, akisVar16.hk);
            case 221:
                return new deys((Context) this.a.q.b());
            case 222:
                return new djuo((dkcp) this.a.a.gJ.b());
            case 223:
                return new djuq((dkcp) this.a.a.gJ.b(), (dlpw) this.a.l.b(), this.a.b.cA());
            case 224:
                akis akisVar17 = this.a;
                return corp.a(akisVar17.b.dp, akisVar17.eq());
            case 225:
                return new corn((ffsk) this.a.a.q.b(), (ffhd) this.a.cP.b(), (coqc) this.a.a.Om.b());
            case 226:
                akis akisVar18 = this.a;
                return eizx.a(akisVar18.b.dr, akisVar18.eq());
            case 227:
                eiyx eiyxVar = (eiyx) this.a.a.Ud.b();
                akis akisVar19 = this.a;
                return new eizv(eiyxVar, akisVar19.a.mv(), (Executor) akisVar19.p.b());
            case 228:
                akis akisVar20 = this.a;
                return ekuj.a(akisVar20.b.dt, akisVar20.eq());
            case 229:
                eksc ekscVar = (eksc) this.a.b.ba.b();
                ejoc ejocVar2 = (ejoc) this.a.dX.b();
                akis akisVar21 = this.a;
                return new ekuh(ekscVar, ejocVar2, akisVar21.a.mF(), (errl) akisVar21.p.b(), ((Boolean) this.a.cd.b()).booleanValue());
            case 230:
                akis akisVar22 = this.a;
                return ekuu.a(akisVar22.b.dv, akisVar22.eq());
            case 231:
                eksc ekscVar2 = (eksc) this.a.b.ba.b();
                ejoc ejocVar3 = (ejoc) this.a.dX.b();
                akis akisVar23 = this.a;
                ektx mF = akisVar23.a.mF();
                errl errlVar8 = (errl) akisVar23.p.b();
                akis akisVar24 = this.a;
                return new ekus(ekscVar2, ejocVar3, mF, errlVar8, akisVar24.ed(), ((Boolean) akisVar24.cd.b()).booleanValue());
            case 232:
                akis akisVar25 = this.a;
                return cqmb.a(akisVar25.b.dx, akisVar25.eq());
            case 233:
                return new cqlz(this.a.a.kH());
            case 234:
                akis akisVar26 = this.a;
                return demg.a(akisVar26.b.dB, akisVar26.eq());
            case 235:
                ffsk ffskVar3 = (ffsk) this.a.a.p.b();
                akis akisVar27 = this.a;
                akko akkoVar6 = akisVar27.b;
                akkp akkpVar9 = akisVar27.a;
                return new deme(ffskVar3, akkpVar9.Tg, akkoVar6.dz, akkpVar9.gE, akkoVar6.dA, akkpVar9.Th, akisVar27.dG, akisVar27.dX, akisVar27.cz);
            case 236:
                return Long.valueOf(fdjq.a(this.a.a.oM()));
            case 237:
                return Long.valueOf(fdjp.a(this.a.a.oM()));
            case 238:
                akis akisVar28 = this.a;
                return ejqe.a(akisVar28.a.Un, akisVar28.eq());
            case 239:
                akis akisVar29 = this.a;
                return ayfd.a(akisVar29.b.dF, akisVar29.eq());
            case 240:
                ffsk ffskVar4 = (ffsk) this.a.a.p.b();
                akis akisVar30 = this.a;
                akko akkoVar7 = akisVar30.b;
                fbbf fbbfVar10 = akkoVar7.au;
                fbbf fbbfVar11 = akisVar30.dX;
                akkp akkpVar10 = akisVar30.a;
                return new ayfb(ffskVar4, fbbfVar10, fbbfVar11, akkpVar10.HR, akkpVar10.RD, akisVar30.cz, akkoVar7.dE);
            case 241:
                ffhd ffhdVar = (ffhd) this.a.cP.b();
                akis akisVar31 = this.a;
                akkp akkpVar11 = akisVar31.a;
                return new ayex(ffhdVar, akisVar31.cz, akkpVar11.HR, akkpVar11.Z, akkpVar11.mo, akkpVar11.HS, akkpVar11.Hn, akkpVar11.Hv, akisVar31.cN, akkpVar11.C);
            case 242:
                akis akisVar32 = this.a;
                return cfbp.a(akisVar32.b.dI, akisVar32.eq());
            case 243:
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                cfjc cfjcVar = (cfjc) this.a.a.OH.b();
                cfim cfimVar = (cfim) this.a.a.OI.b();
                akis akisVar33 = this.a;
                return new cfbn(cqohVar2, cfjcVar, cfimVar, akisVar33.b.dH, (ejoc) akisVar33.dX.b(), (ffsk) this.a.a.q.b());
            case 244:
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                ceyw ceywVar = (ceyw) this.a.a.ON.b();
                cfdt cfdtVar = (cfdt) this.a.a.OL.b();
                ejoc ejocVar4 = (ejoc) this.a.dX.b();
                cexi cexiVar = (cexi) this.a.a.OM.b();
                akkp akkpVar12 = this.a.a;
                return new cfgt(cqohVar3, ceywVar, cfdtVar, ejocVar4, cexiVar, akkpVar12.C, (ffsk) akkpVar12.q.b(), (ffsk) this.a.a.aq.b());
            case 245:
                return new akkl(this);
            case 246:
                dlib dlibVar = (dlib) this.a.kN.b();
                dkyy dkyyVar = (dkyy) this.a.kT.b();
                akko akkoVar8 = this.a.b;
                dlbc cH = akkoVar8.cH();
                dlax cG = akkoVar8.cG();
                akkoVar8.dR();
                this.a.b.dS();
                return new dlbp(dlibVar, dkyyVar, cH, cG, this.a.gD());
            case 247:
                return dlbu.a(this.a.b.dy());
            case 248:
                return new akkm(this);
            case 249:
                return Boolean.valueOf(aroc.a((ersq) this.a.a.s.b()));
            case 250:
                return Optional.of((adaq) this.a.a.jm.b());
            case 251:
                akis akisVar34 = this.a;
                Map dE = akisVar34.b.dE();
                akisVar34.ac();
                return new akvk(dE);
            case 252:
                return new cfzh(this.a.a.qY());
            case 253:
                akkp akkpVar13 = this.a.a;
                return new badt(akkpVar13.el, akkpVar13.f);
            case 254:
                akis akisVar35 = this.a;
                akkp akkpVar14 = akisVar35.a;
                return new badx(akisVar35.cz, akisVar35.b.dU, akkpVar14.HL);
            case PrivateKeyType.INVALID /* 255 */:
                akis akisVar36 = this.a;
                akko akkoVar9 = akisVar36.b;
                akkp akkpVar15 = akisVar36.a;
                return new bafk(akkpVar15.cD, akkpVar15.cn, akkoVar9.dV);
            case 256:
                Context context3 = (Context) this.a.q.b();
                cuxh cuxhVar = (cuxh) this.a.a.ae.b();
                akkp akkpVar16 = this.a.a;
                return new azwd(context3, cuxhVar, akkpVar16.pD, akkpVar16.nU);
            case 257:
                akis akisVar37 = this.a;
                akkp akkpVar17 = akisVar37.a;
                fbbf fbbfVar12 = akisVar37.q;
                fbbf fbbfVar13 = akkpVar17.c;
                fbbf fbbfVar14 = akkpVar17.nW;
                fbbf fbbfVar15 = akkpVar17.nE;
                fbbf fbbfVar16 = akkpVar17.f;
                fbbf fbbfVar17 = akkpVar17.dB;
                fbbf fbbfVar18 = akkpVar17.nr;
                fbbf fbbfVar19 = akkpVar17.hx;
                fbbf fbbfVar20 = akkpVar17.Z;
                fbbf fbbfVar21 = akkpVar17.xP;
                fbbf fbbfVar22 = akisVar37.iq;
                fbbf fbbfVar23 = akkpVar17.aO;
                fbbf fbbfVar24 = akkpVar17.dn;
                akko akkoVar10 = akisVar37.b;
                return new bait(fbbfVar12, fbbfVar13, fbbfVar14, fbbfVar15, fbbfVar16, fbbfVar17, fbbfVar18, fbbfVar19, fbbfVar20, fbbfVar21, fbbfVar22, fbbfVar23, fbbfVar24, akisVar37.cz, akkpVar17.tP, akkoVar10.dX, akkoVar10.dY, akkpVar17.pB, akkpVar17.sY);
            case 258:
                final fbbf fbbfVar25 = this.a.a.s;
                return new auih() { // from class: auii
                    @Override // defpackage.auih
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.add_logging_for_system_replies");
                    }
                };
            case 259:
                return new cjcl(this.a.a.C);
            case 260:
                final fbbf fbbfVar26 = this.a.a.s;
                return new atqs() { // from class: atnd
                    @Override // defpackage.atqs
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_check_rcs_availability_before_retrying_rcs_pending_messages");
                    }
                };
            case 261:
                akis akisVar38 = this.a;
                fbbf fbbfVar27 = akisVar38.cz;
                akkp akkpVar18 = akisVar38.a;
                fbbf fbbfVar28 = akisVar38.b.eb;
                fbbf fbbfVar29 = akkpVar18.pt;
                fbbf fbbfVar30 = akkpVar18.Kd;
                fbbf fbbfVar31 = akkpVar18.aO;
                fbbf fbbfVar32 = akkpVar18.fP;
                cqoh cqohVar4 = (cqoh) fbbfVar27.b();
                akkp akkpVar19 = this.a.a;
                return new baio(fbbfVar28, fbbfVar29, fbbfVar30, fbbfVar31, fbbfVar32, cqohVar4, akkpVar19.JO, akkpVar19.aw);
            case 262:
                return new ceqw(this.a.a.cc);
            case 263:
                return new bajp((ctwb) this.a.a.c.b(), (csjk) this.a.a.el.b(), (bbfo) this.a.jU.b());
            case 264:
                akko akkoVar11 = this.a.b;
                return enhk.m(eqna.TRANSPORT_RCS, akkoVar11.bX(), eqna.TRANSPORT_SINGLE_REGISTRATION, akkoVar11.bX());
            case 265:
                return Long.valueOf(fdge.a(this.a.b.dm()));
            case 266:
                return new bajm((aslt) this.a.a.iL.b());
            case 267:
                final fbbf fbbfVar33 = this.a.a.s;
                return new atsc() { // from class: atpv
                    @Override // defpackage.atsc
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.remove_fallback_from_pending_message_processor");
                    }
                };
            case 268:
                return new chhj(fbaz.a(this.a.ip));
            case 269:
                akis akisVar39 = this.a;
                akkp akkpVar20 = akisVar39.a;
                return new baks(akkpVar20.dB, akisVar39.cz, akkpVar20.iN, akkpVar20.fP, akkpVar20.ay);
            case 270:
                akis akisVar40 = this.a;
                akkp akkpVar21 = akisVar40.a;
                return new baon(akisVar40.q, akkpVar21.dB, akkpVar21.fJ, akkpVar21.c, akkpVar21.di, akkpVar21.pt, akkpVar21.hx, akkpVar21.dA, akkpVar21.Ee, akkpVar21.iN, akisVar40.cz);
            case 271:
                return new bapa();
            case 272:
                fbbf fbbfVar34 = this.a.b.en;
                return new bapk(fbbfVar34, fbbfVar34);
            case 273:
                akis akisVar41 = this.a;
                akkp akkpVar22 = akisVar41.a;
                return new barb(akisVar41.q, akkpVar22.ib, akkpVar22.dn, akkpVar22.dB, akkpVar22.fs, akkpVar22.ki, akkpVar22.sY, akkpVar22.aO, akisVar41.cz, akkpVar22.iN, akkpVar22.c, akkpVar22.fw, akkpVar22.ap, akkpVar22.fP, akkpVar22.nE, akkpVar22.nD, akkpVar22.iM, akkpVar22.ft, akkpVar22.tw, akkpVar22.ty, akkpVar22.jd, akkpVar22.JM, akkpVar22.yz, akkpVar22.pt, akkpVar22.hw, akkpVar22.hx, akkpVar22.dA, akkpVar22.jh, akkpVar22.dv, akkpVar22.er, akkpVar22.kG, akkpVar22.qJ, akkpVar22.fJ, akkpVar22.pg, akkpVar22.ip, akkpVar22.AV, akkpVar22.Z, akisVar41.b.em, akkpVar22.ia, akkpVar22.kk, akkpVar22.yC, akkpVar22.kt, akkpVar22.pw, akkpVar22.pC, akkpVar22.p, akisVar41.cn, akkpVar22.q, akisVar41.co, akisVar41.cP, akkpVar22.f, akkpVar22.wf, akkpVar22.pQ, akkpVar22.JN, akkpVar22.iK, akisVar41.lS, akisVar41.jT, akkpVar22.ku, akisVar41.ou, akkpVar22.pB, akisVar41.gW, akkpVar22.pA, akkpVar22.py);
            case 274:
                return new asrf() { // from class: aryc
                };
            case 275:
                akis akisVar42 = this.a;
                return new basc(akisVar42.a.yL, akisVar42.t, akisVar42.cN, akisVar42.b.ep);
            case 276:
                return new alsh((ecrj) this.a.cN.b());
            case 277:
                akis akisVar43 = this.a;
                akkp akkpVar23 = akisVar43.a;
                return new bati(akisVar43.q, akkpVar23.sY, akisVar43.cz, akkpVar23.ds, akkpVar23.ap, akkpVar23.fP, akkpVar23.iN, akkpVar23.ib, akkpVar23.dB, akkpVar23.fs, akkpVar23.ki, akkpVar23.aO, akkpVar23.JM, akkpVar23.HK, akkpVar23.jh, akkpVar23.pt, akkpVar23.iy, akkpVar23.ad, akkpVar23.ay, akkpVar23.fJ, akkpVar23.jr, akkpVar23.ip, akkpVar23.pC, akkpVar23.pQ, akkpVar23.ia, akkpVar23.kt, akkpVar23.Z);
            case 278:
                akis akisVar44 = this.a;
                akko akkoVar12 = akisVar44.b;
                akkp akkpVar24 = akisVar44.a;
                return new bauh(akisVar44.q, akkpVar24.ib, akkpVar24.dB, akkpVar24.fs, akkpVar24.ki, akkpVar24.ia, akkpVar24.sY, akkpVar24.tw, akkpVar24.ty, akkpVar24.di, akkpVar24.ds, akkpVar24.aO, akkpVar24.fP, akkpVar24.pt, akkpVar24.jh, akkoVar12.eq, akkpVar24.iy, akkpVar24.ay, akkpVar24.fJ, akkpVar24.ip, akkpVar24.pQ, akkpVar24.rg, akkpVar24.kt, akkpVar24.Z, akkpVar24.pC, akkpVar24.hw, akkpVar24.ku);
            case 279:
                return new bbbj();
            case 280:
                return new bbct(this.a.b.eu);
            case 281:
                return new bbcs((cqoh) this.a.cz.b(), (bbcf) this.a.a.fI.b());
            case 282:
                return new aswf() { // from class: asex
                };
            case 283:
                Context context4 = (Context) this.a.q.b();
                akis akisVar45 = this.a;
                akko akkoVar13 = akisVar45.b;
                fbbf fbbfVar35 = akkoVar13.ex;
                akkp akkpVar25 = akisVar45.a;
                return new cbhg(context4, fbbfVar35, akisVar45.aU, akkpVar25.vV, akisVar45.cT, akkpVar25.u, akkoVar13.ey, akkpVar25.bj);
            case 284:
                return new cuat((Context) this.a.q.b());
            case 285:
                return new cgtz(this.a.b.cd());
            case 286:
                return Optional.of((ckaj) this.a.a.CE.b());
            case 287:
                akko akkoVar14 = this.a.b;
                enhd h = enhk.h(6);
                h.k(ciux.NAT_QUICK_REPLY, akkoVar14.bS());
                h.k(ciux.NAT_WEARABLE_QUICK_REPLY, this.a.b.bU());
                h.k(ciux.NAT_MARK_AS_READ, this.a.b.bR());
                h.k(ciux.NAT_COPY_OTP, this.a.b.bP());
                h.k(ciux.NAT_DIRECTOR, this.a.b.bQ());
                h.k(ciux.NAT_INSTALL_SAFETYCORE, this.a.b.bT());
                return h.h();
            case 288:
                akis akisVar46 = this.a;
                return new csks(akisVar46.a.aT, (errl) akisVar46.t.b(), (errl) this.a.p.b());
            case 289:
                final fbbf fbbfVar36 = this.a.a.s;
                return new asqr() { // from class: arxc
                    @Override // defpackage.asqr
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_multi_sim_logging_rcs_availability_log_worker");
                    }
                };
            case 290:
                akis akisVar47 = this.a;
                enhd h2 = enhk.h(9);
                h2.k("com.google.android.apps.messaging.messaging_service_add_user_to_group_response", akisVar47.a.aln);
                h2.k("com.google.android.apps.messaging.messaging_service_create_group_response", this.a.a.alo);
                h2.k("com.google.android.apps.messaging.shared.messaging.incoming_group_notification_action", this.a.b.eE);
                h2.k("com.google.android.apps.messaging.shared.messaging.incoming_chat_message_action", this.a.a.CP);
                h2.k("com.google.android.apps.messaging.messaging_service_remove_user_from_group_response", this.a.a.alp);
                h2.k("com.google.android.apps.messaging.messaging_service_revoke_message_response", this.a.a.alq);
                h2.k("com.google.android.apps.messaging.messaging_service_send_message_response", this.a.a.alr);
                h2.k("com.google.android.apps.messaging.messaging_service_trigger_group_notification_response", this.a.a.als);
                h2.k("com.google.android.apps.messaging.messaging_service_update_group_response", this.a.a.alt);
                return h2.h();
            case 291:
                avkh avkhVar = (avkh) this.a.a.kh.b();
                akis akisVar48 = this.a;
                cliq bW = akisVar48.b.bW();
                ctzw ctzwVar = (ctzw) akisVar48.dI.b();
                akis akisVar49 = this.a;
                akkp akkpVar26 = akisVar49.a;
                return new clfo(avkhVar, bW, ctzwVar, akkpVar26.rJ(), (clfb) akisVar49.fl(), (clhd) akkpVar26.BV.b(), (errl) this.a.p.b(), (errl) this.a.t.b(), (errl) this.a.aK.b());
            case 292:
                return new djva((dkcp) this.a.a.gJ.b(), (cguo) this.a.a.cK.b());
            case 293:
                return new djvi((dkcp) this.a.a.gJ.b(), (dlpw) this.a.l.b());
            case 294:
                return new djuu((Context) this.a.q.b(), (djix) this.a.a.cM.b(), (dkpp) this.a.aQ.b(), (errl) this.a.aK.b(), (dijt) this.a.a.cN.b());
            case 295:
                return new diwp() { // from class: diut
                };
            case 296:
                akis akisVar50 = this.a;
                akko akkoVar15 = akisVar50.b;
                akkp akkpVar27 = akisVar50.a;
                return new cmpv(akkpVar27.aq, akkoVar15.eK, akkpVar27.HO);
            case 297:
                return new cmpt(this.a.a.cc);
            case 298:
                final fbbf fbbfVar37 = this.a.a.s;
                return new dixo() { // from class: diwk
                    @Override // defpackage.dixo
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("cslib.remove_unnecessary_grpc_to_tycho");
                    }
                };
            case 299:
                return new cmoh();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object e() {
        ejps ejpsVar;
        int i = this.b;
        switch (i) {
            case 300:
                final fbbf fbbfVar = this.a.a.s;
                return new dixl() { // from class: diwe
                    @Override // defpackage.dixl
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("cslib.send_request_on_missing_msisdn_token");
                    }
                };
            case 301:
                final fbbf fbbfVar2 = this.a.a.s;
                return new dixj() { // from class: diwa
                    @Override // defpackage.dixj
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("cslib.block_manual_msisdn_for_wear");
                    }
                };
            case 302:
                return Optional.of(new enpx((cnju) this.a.b.a.a.CE.b()));
            case 303:
                cnjv cnjvVar = (cnjv) this.a.b.eR.b();
                akis akisVar = this.a;
                return enip.v(cnjvVar, akisVar.a.pg(), (cnjv) akisVar.b.av.b(), (cnjv) this.a.jF.b(), (cnjv) this.a.b.eS.b(), (cnjv) this.a.a.CE.b(), (cnjv) this.a.b.eT.b());
            case 304:
                return new aknf(this.a.a.jn);
            case 305:
                Context context = (Context) this.a.q.b();
                errl errlVar = (errl) this.a.p.b();
                akkp akkpVar = this.a.a;
                return new cimg(context, errlVar, akkpVar.aT, akkpVar.gr, akkpVar.f, akkpVar.Fe);
            case 306:
                akis akisVar2 = this.a;
                return new degq(akisVar2.a.SC, akisVar2.aK);
            case 307:
                Context context2 = (Context) this.a.q.b();
                errl errlVar2 = (errl) this.a.t.b();
                crbq crbqVar = (crbq) this.a.a.pk.b();
                akis akisVar3 = this.a;
                fbbf fbbfVar3 = akisVar3.a.f;
                cqoh cqohVar = (cqoh) akisVar3.cz.b();
                akis akisVar4 = this.a;
                return new cnko(context2, errlVar2, crbqVar, fbbfVar3, cqohVar, new crai(akisVar4.b.a.a.cc), (cqxl) akisVar4.a.Kn.b());
            case 308:
                return new cepo(this.a.a.cc);
            case 309:
                return new ckps(this.a.a.cc);
            case 310:
                return new asmz() { // from class: arre
                };
            case 311:
                akis akisVar5 = this.a;
                fbbf fbbfVar4 = akisVar5.a.ap;
                Context context3 = (Context) akisVar5.q.b();
                akis akisVar6 = this.a;
                return new ctbd(fbbfVar4, context3, akisVar6.b.eZ, akisVar6.iL);
            case 312:
                return new ctee((Context) this.a.q.b());
            case 313:
                return new cirw(this.a.a.cc);
            case 314:
                return new cuai(this.a.aU);
            case 315:
                return new akwl((Context) this.a.q.b());
            case 316:
                akis akisVar7 = this.a;
                return new cpxr(akisVar7.a.az, fbaz.a(akisVar7.aV), akisVar7.aZ, akisVar7.eb);
            case 317:
                akis akisVar8 = this.a;
                akkp akkpVar2 = akisVar8.a;
                return new copl(akkpVar2.cJ, akisVar8.aQ, akkpVar2.cT, akkpVar2.fQ, akkpVar2.uV, akkpVar2.fM, akkpVar2.Oe);
            case 318:
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                akis akisVar9 = this.a;
                Optional of = Optional.of(akisVar9.a.Px);
                akkp akkpVar3 = akisVar9.a;
                fbbf fbbfVar5 = akkpVar3.ap;
                fbbf fbbfVar6 = akkpVar3.iN;
                fbbf fbbfVar7 = akkpVar3.yL;
                errl errlVar3 = (errl) akisVar9.aK.b();
                akis akisVar10 = this.a;
                akkp akkpVar4 = akisVar10.a;
                fbbf fbbfVar8 = akisVar10.b.es;
                fbbf fbbfVar9 = akkpVar4.iK;
                ecrj ecrjVar = (ecrj) akisVar10.cN.b();
                alsh alshVar = (alsh) this.a.b.ep.b();
                akis akisVar11 = this.a;
                akko akkoVar = akisVar11.b;
                akkp akkpVar5 = akisVar11.a;
                return new cnkx(cqohVar2, of, fbbfVar5, fbbfVar6, fbbfVar7, errlVar3, fbbfVar8, fbbfVar9, ecrjVar, alshVar, akkpVar5.fP, akkpVar5.iy, akkpVar5.aO, akkpVar5.ca, akkpVar5.cb, akkoVar.fg);
            case 319:
                akkp akkpVar6 = this.a.a;
                return new cjpx(akkpVar6.ir(), (ffsk) akkpVar6.p.b());
            case 320:
                akzt akztVar = (akzt) this.a.a.al.b();
                Optional optional = (Optional) this.a.a.uP.b();
                akko akkoVar2 = this.a.b;
                return new cfyh(akztVar, optional, akkoVar2.bI(), akkoVar2.bH());
            case 321:
                final fbbf fbbfVar10 = this.a.a.s;
                return new atqw() { // from class: atnl
                    @Override // defpackage.atqw
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_fix_tachygram_channel_bind");
                    }
                };
            case 322:
                ejvb ejvbVar = (ejvb) this.a.dy.b();
                ffhd ffhdVar = (ffhd) this.a.co.b();
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                akis akisVar12 = this.a;
                return new cwkj(ejvbVar, ffhdVar, ffskVar, akisVar12.a.nr, (ejvp) akisVar12.aR.b(), (cqoh) this.a.cz.b(), this.a.a.nq);
            case 323:
                akkp akkpVar7 = this.a.a;
                return new cxfx(akkpVar7.c, akkpVar7.aO, akkpVar7.jc);
            case 324:
                byzp byzpVar = (byzp) this.a.a.iy.b();
                bcwz bcwzVar = (bcwz) this.a.a.ad.b();
                cgte cgteVar = (cgte) this.a.a.AL.b();
                fazb a = fbaz.a(this.a.a.iN);
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                covs covsVar = (covs) this.a.a.ds.b();
                Context context4 = (Context) this.a.q.b();
                akis akisVar13 = this.a;
                akkp akkpVar8 = akisVar13.a;
                return new davk(byzpVar, bcwzVar, cgteVar, a, cqohVar3, covsVar, context4, akisVar13.ce, akkpVar8.fJ, (ddzb) akkpVar8.nk.b(), Optional.of((cpdd) this.a.a.jo.b()), (asmj) this.a.a.jD.b(), this.a.a.jF);
            case 325:
                return new dbzl(this.a.a.ad);
            case 326:
                return new ddqi((Context) this.a.q.b());
            case 327:
                csum csumVar = (csum) this.a.a.dr.b();
                Context context5 = (Context) this.a.q.b();
                akis akisVar14 = this.a;
                return new bdiw(csumVar, context5, akisVar14.b.eZ, (csuu) akisVar14.iL.b(), (akzt) this.a.a.f.b(), (bcxm) this.a.a.nQ.b(), (byzp) this.a.a.iy.b(), this.a.a.nV);
            case 328:
                final fbbf fbbfVar11 = this.a.a.s;
                return new aueb() { // from class: audp
                    @Override // defpackage.aueb
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_mapi_in_assistant_search_action");
                    }
                };
            case 329:
                return new cvhm(this.a.a.f);
            case 330:
                return new cvho(this.a.a.az, Optional.empty());
            case 331:
                Context context6 = (Context) this.a.q.b();
                akko akkoVar3 = this.a.b;
                akis akisVar15 = akkoVar3.a;
                Optional dq = akkoVar3.dq();
                long b = digu.b(((Context) akisVar15.q.b()).getContentResolver(), "android_id", 0L);
                akis akisVar16 = this.a;
                dlqc.a();
                Optional of2 = Optional.of(fbaz.a(akisVar16.bG));
                errl errlVar4 = (errl) this.a.aK.b();
                errl errlVar5 = (errl) this.a.p.b();
                akis akisVar17 = this.a;
                akko akkoVar4 = akisVar17.b;
                cgtm hA = akisVar17.a.hA();
                fazb a2 = fbaz.a(akkoVar4.fu);
                engw s = engw.s("ANDROID_MESSAGING", "CARRIER_SERVICES");
                s.getClass();
                return new dlrg(context6, dq, b, of2, errlVar4, errlVar5, hA, a2, s);
            case 332:
                return new dlqv((dfad) this.a.b.ft.b(), (Context) this.a.q.b());
            case 333:
                return new dfae((Context) this.a.q.b());
            case 334:
                return new azwj((akzt) this.a.a.f.b());
            case 335:
                Map map = (Map) this.a.b.j.b();
                Map map2 = (Map) ((fbbb) fbbd.a).a;
                Context context7 = dtub.b;
                final enhd enhdVar = new enhd();
                Collection.EL.stream(map2.entrySet()).forEach(new Consumer() { // from class: dtts
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        Context context8 = dtub.b;
                        dtzy a3 = ((dtzz) ((Map.Entry) obj).getValue()).a();
                        enhd.this.k(a3.b() + "+" + a3.c(), engw.r(a3.a()));
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return new dtxa(map, enhdVar.c());
            case 336:
                Context context8 = (Context) this.a.q.b();
                eapp eappVar = (eapp) this.a.gu.b();
                akko akkoVar5 = this.a.b;
                return new eahe(context8, eappVar, new eaft((eapp) akkoVar5.a.gu.b(), (ffhd) akkoVar5.a.co.b(), (Context) akkoVar5.a.q.b(), enpd.a), (earu) this.a.b.fy.b(), (eajw) this.a.gR.b(), (ears) this.a.gl.b(), (eajz) this.a.a.eK.b(), enpd.a);
            case 337:
                return new earv((Context) this.a.q.b());
            case 338:
                return new eahl(this.a.b.cV());
            case 339:
                return new eajo();
            case 340:
                akis akisVar18 = this.a;
                akkp akkpVar9 = akisVar18.a;
                akko akkoVar6 = akisVar18.b;
                fbbf fbbfVar12 = akkoVar6.fD;
                fbbf fbbfVar13 = akisVar18.gR;
                fbbf fbbfVar14 = akkpVar9.eK;
                fbbf fbbfVar15 = akisVar18.l;
                fbbf fbbfVar16 = akkoVar6.fE;
                fbbf fbbfVar17 = akkoVar6.fF;
                Context context9 = (Context) akisVar18.q.b();
                akis akisVar19 = this.a;
                akko akkoVar7 = akisVar19.b;
                return new eaic(fbbfVar12, fbbfVar13, fbbfVar14, fbbfVar15, fbbfVar16, fbbfVar17, context9, akisVar19.gl, akkoVar7.fG, akkoVar7.fH, akkoVar7.fI, akisVar19.gA);
            case 341:
                return new eaie((eapp) this.a.gu.b(), (eaku) this.a.a.ev.b());
            case 342:
                return new eakc();
            case 343:
                akko akkoVar8 = this.a.b;
                dvjc dvjcVar = new dvjc((ealf) akkoVar8.a.gP.b(), akkoVar8.cT(), (eajw) akkoVar8.a.gR.b(), (eajz) akkoVar8.a.a.eK.b(), akkoVar8.a.gY);
                ffsk ffskVar2 = (ffsk) akkoVar8.a.a.p.b();
                ffskVar2.getClass();
                return emxc.j(new dvja(dvjcVar, ffskVar2));
            case 344:
                return new eaig(this.a.b.cV());
            case 345:
                return new eaii(this.a.b.cV());
            case 346:
                return new eaik(this.a.b.cV());
            case 347:
                return new akgw(this.a);
            case 348:
                errl errlVar6 = (errl) this.a.aK.b();
                ejjz ejjzVar = (ejjz) this.a.a.n.b();
                ejlk ejlkVar = (ejlk) this.a.ds.b();
                return new eauv(errlVar6, ejjzVar, ejlkVar);
            case 349:
                return new akkq(this.a);
            case 350:
                return new akgy(this.a);
            case 351:
                return new akgh(this.a);
            case 352:
                return new akkr(this.a);
            case 353:
                return new akgx(this.a);
            case 354:
                return new eajn();
            case 355:
                return new eajq();
            case 356:
                return new eajp();
            case 357:
                return new eajm();
            case 358:
                return new eajv();
            case 359:
                return new eajt();
            case 360:
                return new eaju();
            case 361:
                return new eajr();
            case 362:
                return new eajs();
            case 363:
                return new ersb((errl) this.a.aK.b());
            case 364:
                Context context10 = (Context) this.a.q.b();
                akko akkoVar9 = this.a.b;
                eixo eixoVar = (eixo) akkoVar9.a.a.as.b();
                emxc j = emxc.j(new ejby((eixo) akkoVar9.a.a.as.b(), (eiyx) akkoVar9.a.a.Ud.b(), (ejoc) akkoVar9.a.dX.b(), (ejvp) akkoVar9.a.aR.b(), (ffsk) akkoVar9.a.a.p.b(), new ejbw(true, 1)));
                eixoVar.getClass();
                return new ejaj(context10, new enpx(((emxn) j).a), (errl) this.a.p.b(), (ejjz) this.a.a.n.b());
            case 365:
                return new pod((pob) this.a.b.gf.b());
            case 366:
                Context context11 = (Context) this.a.q.b();
                akis akisVar20 = this.a;
                akko akkoVar10 = akisVar20.b;
                Context context12 = (Context) akkoVar10.a.q.b();
                errl errlVar7 = (errl) akkoVar10.a.t.b();
                ejjz ejjzVar2 = (ejjz) akkoVar10.a.a.n.b();
                PackageManager S = akkoVar10.a.S();
                ejqp iK = akis.iK();
                int ordinal = iK.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        ejpsVar = ejps.WARN_AT_STARTUP;
                        ejps ejpsVar2 = ejpsVar;
                        ejpsVar2.getClass();
                        final ejow ejowVar = new ejow(context12, errlVar7, ejjzVar2, S, ejpsVar2);
                        errm errmVar = (errm) akisVar20.t.b();
                        ffhd ffhdVar2 = (ffhd) this.a.co.b();
                        ejlk ejlkVar2 = (ejlk) this.a.ds.b();
                        pqy pqyVar = (pqy) this.a.b.dO.b();
                        pob pobVar = new pob();
                        pobVar.a(errmVar);
                        pobVar.e = new ejox(ejlkVar2);
                        pobVar.b(errmVar);
                        ffhdVar2.getClass();
                        pobVar.b = ffhdVar2;
                        pobVar.c(pqyVar);
                        final String packageName = context11.getPackageName();
                        ((enrr) ((enrr) ejow.a.h()).h("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateAsynchronouslyAndMaybeCrash", 68, "DefaultProcessValidator.java")).q("Validating WorkManager process");
                        ejowVar.d.e(elfr.g(new Runnable() { // from class: ejov
                            @Override // java.lang.Runnable
                            public final void run() {
                                ejow ejowVar2 = ejow.this;
                                String str = packageName;
                                try {
                                    ServiceInfo serviceInfo = ejowVar2.e.getServiceInfo(new ComponentName(ejowVar2.b, "androidx.work.impl.background.systemjob.SystemJobService"), 0);
                                    boolean equals = Objects.equals(serviceInfo.processName, str);
                                    ((enrr) ((enrr) ejow.a.h()).h("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 97, "DefaultProcessValidator.java")).K("Processes: %s, %s, %s, %s", ejowVar2.f, Boolean.valueOf(equals), serviceInfo.processName, str);
                                    if (equals) {
                                        return;
                                    }
                                    int ordinal2 = ejowVar2.f.ordinal();
                                    if (ordinal2 == 1) {
                                        ((enrr) ((enrr) ejow.a.i()).h("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 123, "DefaultProcessValidator.java")).D("WorkManager's Manifest components must have the same process as the configured defaultProcessName (%s). It was found in (%s). If you are moving the WorkManager defaultProcess, use both TikTokWorkManagerClientConfiguration#setDefaultProcessName() and Manifest overrides to set the processes for the components defined in android/platform/frameworks/support/androidx-main/work/work-runtime/src/main/AndroidManifest.xml", str, serviceInfo.processName);
                                    } else {
                                        if (ordinal2 != 2) {
                                            return;
                                        }
                                        ((enrr) ((enrr) ejow.a.j()).h("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 119, "DefaultProcessValidator.java")).q("Invalid process");
                                        throw new IllegalStateException(String.format("WorkManager's Manifest components must have the same process as the configured defaultProcessName (%s). It was found in (%s). If you are moving the WorkManager defaultProcess, use both TikTokWorkManagerClientConfiguration#setDefaultProcessName() and Manifest overrides to set the processes for the components defined in android/platform/frameworks/support/androidx-main/work/work-runtime/src/main/AndroidManifest.xml", str, serviceInfo.processName));
                                    }
                                } catch (PackageManager.NameNotFoundException e) {
                                    ((enrr) ((enrr) ((enrr) ejow.a.j()).g(e)).h("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 'j', "DefaultProcessValidator.java")).q("The WorkManager SystemJobService could not be found. If you are trying to disable WorkManager, make sure not to initialize it.");
                                } catch (RuntimeException e2) {
                                    ((enrr) ((enrr) ((enrr) ejow.a.j()).g(e2)).h("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 'p', "DefaultProcessValidator.java")).q("Failed to look up WorkManager manifest process");
                                }
                            }
                        }, ejowVar.c), 1L, TimeUnit.MINUTES);
                        return pobVar;
                    }
                    if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                        throw new AssertionError(iK);
                    }
                }
                ejpsVar = ejps.NONE;
                ejps ejpsVar22 = ejpsVar;
                ejpsVar22.getClass();
                final ejow ejowVar2 = new ejow(context12, errlVar7, ejjzVar2, S, ejpsVar22);
                errm errmVar2 = (errm) akisVar20.t.b();
                ffhd ffhdVar22 = (ffhd) this.a.co.b();
                ejlk ejlkVar22 = (ejlk) this.a.ds.b();
                pqy pqyVar2 = (pqy) this.a.b.dO.b();
                pob pobVar2 = new pob();
                pobVar2.a(errmVar2);
                pobVar2.e = new ejox(ejlkVar22);
                pobVar2.b(errmVar2);
                ffhdVar22.getClass();
                pobVar2.b = ffhdVar22;
                pobVar2.c(pqyVar2);
                final String packageName2 = context11.getPackageName();
                ((enrr) ((enrr) ejow.a.h()).h("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateAsynchronouslyAndMaybeCrash", 68, "DefaultProcessValidator.java")).q("Validating WorkManager process");
                ejowVar2.d.e(elfr.g(new Runnable() { // from class: ejov
                    @Override // java.lang.Runnable
                    public final void run() {
                        ejow ejowVar22 = ejow.this;
                        String str = packageName2;
                        try {
                            ServiceInfo serviceInfo = ejowVar22.e.getServiceInfo(new ComponentName(ejowVar22.b, "androidx.work.impl.background.systemjob.SystemJobService"), 0);
                            boolean equals = Objects.equals(serviceInfo.processName, str);
                            ((enrr) ((enrr) ejow.a.h()).h("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 97, "DefaultProcessValidator.java")).K("Processes: %s, %s, %s, %s", ejowVar22.f, Boolean.valueOf(equals), serviceInfo.processName, str);
                            if (equals) {
                                return;
                            }
                            int ordinal2 = ejowVar22.f.ordinal();
                            if (ordinal2 == 1) {
                                ((enrr) ((enrr) ejow.a.i()).h("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 123, "DefaultProcessValidator.java")).D("WorkManager's Manifest components must have the same process as the configured defaultProcessName (%s). It was found in (%s). If you are moving the WorkManager defaultProcess, use both TikTokWorkManagerClientConfiguration#setDefaultProcessName() and Manifest overrides to set the processes for the components defined in android/platform/frameworks/support/androidx-main/work/work-runtime/src/main/AndroidManifest.xml", str, serviceInfo.processName);
                            } else {
                                if (ordinal2 != 2) {
                                    return;
                                }
                                ((enrr) ((enrr) ejow.a.j()).h("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 119, "DefaultProcessValidator.java")).q("Invalid process");
                                throw new IllegalStateException(String.format("WorkManager's Manifest components must have the same process as the configured defaultProcessName (%s). It was found in (%s). If you are moving the WorkManager defaultProcess, use both TikTokWorkManagerClientConfiguration#setDefaultProcessName() and Manifest overrides to set the processes for the components defined in android/platform/frameworks/support/androidx-main/work/work-runtime/src/main/AndroidManifest.xml", str, serviceInfo.processName));
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            ((enrr) ((enrr) ((enrr) ejow.a.j()).g(e)).h("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 'j', "DefaultProcessValidator.java")).q("The WorkManager SystemJobService could not be found. If you are trying to disable WorkManager, make sure not to initialize it.");
                        } catch (RuntimeException e2) {
                            ((enrr) ((enrr) ((enrr) ejow.a.j()).g(e2)).h("com/google/apps/tiktok/contrib/work/impl/DefaultProcessValidator", "validateInternal", 'p', "DefaultProcessValidator.java")).q("Failed to look up WorkManager manifest process");
                        }
                    }
                }, ejowVar2.c), 1L, TimeUnit.MINUTES);
                return pobVar2;
            case 367:
                return new ekjr(this.a.b.gg);
            case 368:
                return new akhc(this.a);
            case 369:
                akis akisVar21 = this.a;
                return new crks(akisVar21.a.nc, akisVar21.p);
            case 370:
                return new ejch((Context) this.a.q.b());
            case 371:
                return new ersz((ersq) this.a.a.s.b());
            case 372:
                akis akisVar22 = this.a;
                return new eahj(akisVar22.b.dC(), akisVar22.dU(), (ffhd) akisVar22.cn.b());
            case 373:
                return new dvse((Context) this.a.q.b(), (eauy) this.a.a.eE.b());
            case 374:
                Context context13 = (Context) this.a.q.b();
                akis akisVar23 = this.a;
                return new ekgy(context13, fbaz.a(akisVar23.bU), (ecvo) akisVar23.bK.b(), (eixo) this.a.a.as.b(), this.a.a.mz(), akis.iT());
            case 375:
                this.a.a.sj();
                return tlx.a();
            case 376:
                return Boolean.valueOf(((ekck) this.a.b.a.a.j.b()).a("com.google.android.apps.messaging.auto 45619430").e());
            case 377:
                return Long.valueOf(((ekck) this.a.b.a.a.j.b()).a("com.google.android.apps.messaging.auto 45620656").b());
            case 378:
                String a3 = chjp.a();
                ekpc ekpcVar = new ekpc();
                ekpcVar.a = a3;
                ekpcVar.b = 443;
                ekpcVar.b(fcpf.h);
                return ekpcVar.c();
            case 379:
                final fbbf fbbfVar18 = this.a.a.s;
                return new asok() { // from class: artn
                    @Override // defpackage.asok
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_shared_tik_tok_grpc_messaging_stubs");
                    }
                };
            case 380:
                cfup cfupVar = chjp.a;
                ekpc ekpcVar2 = new ekpc();
                ekpcVar2.a = "instantmessaging-pa.googleapis.com";
                ekpcVar2.b = 443;
                ekpcVar2.b(fcpt.o);
                return ekpcVar2.c();
            case 381:
                comy comyVar = (comy) this.a.a.aT.b();
                akis akisVar24 = this.a;
                return new chlh(comyVar, akisVar24.ca(), (akzt) akisVar24.a.f.b());
            case 382:
                crpp crppVar = (crpp) this.a.b.gx.b();
                akis akisVar25 = this.a;
                return new crvz(crppVar, akisVar25.cE);
            case 383:
                return new crpp(this.a.a.f);
            case 384:
                ekzz f = eleg.f("provideExtensionRegistry");
                try {
                    eyfc a4 = eyfc.a();
                    f.close();
                    a4.getClass();
                    return a4;
                } finally {
                }
            case 385:
                return Long.valueOf(((ekck) this.a.a.or().a.b()).a("com.google.android.apps.messaging.auto 45414161").b());
            case 386:
                return Long.valueOf(((ekck) this.a.a.or().a.b()).a("com.google.android.apps.messaging.auto 45414334").b());
            case 387:
                return Long.valueOf(((ekck) this.a.a.or().a.b()).a("com.google.android.apps.messaging.auto 206375").b());
            case 388:
                return new asug() { // from class: asbs
                };
            case 389:
                ekpc ekpcVar3 = new ekpc();
                ekpcVar3.b(ewum.ac);
                ekpcVar3.a = "people-pa.googleapis.com";
                ekpcVar3.b = 443;
                return ekpcVar3.c();
            case 390:
                return Long.valueOf(((ekck) this.a.a.or().a.b()).a("com.google.android.apps.messaging.auto 45412292").b());
            case 391:
                return Long.valueOf(((ekck) this.a.a.or().a.b()).a("com.google.android.apps.messaging.auto 45649411").b());
            case 392:
                return Long.valueOf(((ekck) this.a.a.or().a.b()).a("com.google.android.apps.messaging.auto 45649708").b());
            case 393:
                return Long.valueOf(((ekck) this.a.a.or().a.b()).a("com.google.android.apps.messaging.auto 45660113").b());
            case 394:
                final fbbf fbbfVar19 = this.a.a.s;
                return new aulg() { // from class: aukl
                    @Override // defpackage.aulg
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.check_transport_for_one_to_one_profile_sharing");
                    }
                };
            case 395:
                final fbbf fbbfVar20 = this.a.a.s;
                return new aulp() { // from class: auld
                    @Override // defpackage.aulp
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.reduce_profile_sharing_priority");
                    }
                };
            case 396:
                String a5 = chjp.a();
                ekpc ekpcVar4 = new ekpc();
                ekpcVar4.a = a5;
                ekpcVar4.b = 443;
                ekpcVar4.b(fcpt.o);
                return ekpcVar4.c();
            case 397:
                final fbbf fbbfVar21 = this.a.a.s;
                return new asio() { // from class: arjq
                    @Override // defpackage.asio
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.initial_sync_progress_counters_v2");
                    }
                };
            case 398:
                return new ConcurrentLinkedQueue();
            case 399:
                return new ConcurrentLinkedQueue();
            default:
                throw new AssertionError(i);
        }
    }

    private final Object f() {
        int i = this.b;
        switch (i) {
            case 400:
                return new ConcurrentLinkedQueue();
            case 401:
                final fbbf fbbfVar = this.a.a.s;
                return new atab() { // from class: aszi
                    @Override // defpackage.atab
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_mms_group_upgrade_for_cms");
                    }
                };
            case 402:
                return new asjb() { // from class: arkp
                };
            case 403:
                final fbbf fbbfVar2 = this.a.a.s;
                return new ashv() { // from class: arij
                    @Override // defpackage.ashv
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_batch_create_request_validation");
                    }
                };
            case 404:
                final fbbf fbbfVar3 = this.a.a.s;
                return new asjs() { // from class: arlu
                    @Override // defpackage.asjs
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_batch_fetch_for_cms_backup");
                    }
                };
            case 405:
                final fbbf fbbfVar4 = this.a.a.s;
                return new asjc() { // from class: arkr
                    @Override // defpackage.asjc
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.optimize_handle_batch_process_insertion_results");
                    }
                };
            case 406:
                return new atae() { // from class: aszn
                };
            case 407:
                return new asia() { // from class: aris
                };
            case 408:
                faws fawsVar = (faws) this.a.a.Fv.b();
                Context context = (Context) this.a.q.b();
                this.a.a.sj();
                return new chgq(fawsVar, context, (csuu) this.a.iL.b());
            case 409:
                akko akkoVar = this.a.b;
                return new cdhz(new cdlq((ceyo) akkoVar.a.a.OJ.b(), (Context) akkoVar.a.q.b()), (axkm) this.a.a.ck.b(), (cqoh) this.a.cz.b());
            case 410:
                return Boolean.valueOf(((ersq) this.a.a.s.b()).a("bugle.skip_restore_message_during_restore_conversation"));
            case 411:
                final fbbf fbbfVar5 = this.a.a.s;
                return new ashl() { // from class: arht
                    @Override // defpackage.ashl
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.batch_restore_messages_in_conversation_restore");
                    }
                };
            case 412:
                return Boolean.valueOf(((ekck) this.a.a.or().a.b()).a("com.google.android.apps.messaging.auto 45446485").e());
            case 413:
                final fbbf fbbfVar6 = this.a.a.s;
                return new aulo() { // from class: aulb
                    @Override // defpackage.aulo
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.move_profile_refresh_to_synclet");
                    }
                };
            case 414:
                return new AtomicBoolean(false);
            case 415:
                return ((ekck) this.a.a.oM().a.b()).a("com.google.android.apps.messaging.auto 45648171").d();
            case 416:
                return ((ekck) this.a.a.oM().a.b()).a("com.google.android.apps.messaging.auto 45648172").d();
            case 417:
                return Boolean.valueOf(((ekck) this.a.a.oM().a.b()).a("com.google.android.apps.messaging.auto 45647256").e());
            case 418:
                return Boolean.valueOf(((ekck) this.a.a.oM().a.b()).a("com.google.android.apps.messaging.auto 45647257").e());
            case 419:
                final fbbf fbbfVar7 = this.a.a.s;
                return new avdl() { // from class: avdf
                    @Override // defpackage.avdl
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.migrate_welcome_counters_to_clearcut");
                    }
                };
            case 420:
                Context context2 = (Context) this.a.q.b();
                akis akisVar = this.a;
                ffsk ffskVar = (ffsk) akisVar.a.aq.b();
                akis akisVar2 = this.a;
                akko akkoVar2 = akisVar2.b;
                return new emdw(context2, akisVar.aK, ffskVar, akisVar2.p, akkoVar2.hk, akisVar2.lm, akkoVar2.hl);
            case 421:
                return new emcw();
            case 422:
                return new aizh();
            case 423:
                return new ctbe((Context) this.a.q.b());
            case 424:
                return new cshz();
            case 425:
                return new asie() { // from class: ariz
                };
            case 426:
                final fbbf fbbfVar8 = this.a.a.s;
                return new dixa() { // from class: divj
                    @Override // defpackage.dixa
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("cslib.log_fi_multi_device_sync_sign_out");
                    }
                };
            case 427:
                akis akisVar3 = this.a;
                return new alcg(akisVar3.a.dF, new alcs(), (Executor) akisVar3.p.b());
            case 428:
                final fbbf fbbfVar9 = this.a.a.s;
                return new atrg() { // from class: atof
                    @Override // defpackage.atrg
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_remove_rcs_utils_is_data_disabled");
                    }
                };
            case 429:
                return new uct((bcwz) this.a.a.ad.b(), (bcxm) this.a.a.nQ.b());
            case 430:
                return new azei(fbbh.a, (ffsk) this.a.a.p.b());
            case 431:
                return new ajql((ffhd) this.a.cn.b(), (ffhd) this.a.co.b(), (ajqp) this.a.b.hv.b(), (aled) this.a.b.hw.b(), cqom.a());
            case 432:
                return new ajqp();
            case 433:
                ffsk ffskVar2 = (ffsk) this.a.a.p.b();
                cfyt cfytVar = (cfyt) this.a.a.cf.b();
                akis akisVar4 = this.a;
                return new aled(ffskVar2, cfytVar, akisVar4.a.dF, new alcs(), (Executor) akisVar4.p.b());
            case 434:
                final fbbf fbbfVar10 = this.a.a.s;
                return new asrb() { // from class: arxv
                    @Override // defpackage.asrb
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_system_default_sub_id_in_convo1");
                    }
                };
            case 435:
                return new askn() { // from class: arnd
                };
            case 436:
                return dszx.a(dszr.b, dqua.a);
            case 437:
                return dszx.a(dszr.b, dqvp.a);
            case 438:
                dqii dqiiVar = (dqii) this.a.b.hD.b();
                dqka mb = this.a.a.mb();
                dqiiVar.getClass();
                return mb.a(dqiiVar);
            case 439:
                dqok dqokVar = (dqok) this.a.b.hC.b();
                dqokVar.getClass();
                return new dqii("emoji", new ffji() { // from class: dqrq
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        dqqj dqqjVar = (dqqj) obj;
                        dqqjVar.getClass();
                        return dqqjVar.a().a().toString();
                    }
                }, new dqrr(dqokVar, null));
            case 440:
                return new dqow((ffsk) this.a.a.p.b());
            case 441:
                akko akkoVar3 = this.a.b;
                return new dqpv(akkoVar3.hF, (effy) akkoVar3.hG.b(), (ffsk) this.a.a.q.b(), (dqok) this.a.b.hC.b(), (dqoh) this.a.b.hC.b());
            case 442:
                return Optional.of((dqsv) this.a.hI.b());
            case 443:
                Context context3 = (Context) this.a.q.b();
                efgc efgcVar = (efgc) this.a.hU.b();
                context3.getClass();
                efgcVar.getClass();
                dqrj dqrjVar = dqrj.a;
                dqrjVar.getClass();
                return dqht.a(context3, efgcVar, dqrjVar, "emoji", "preferences");
            case 444:
                return new uja((Context) this.a.q.b(), (alcb) this.a.b.hI.b(), this.a.a.cf);
            case 445:
                akis akisVar5 = this.a;
                return new alcb(akisVar5.a.dF, new alcs(), (Executor) akisVar5.p.b());
            case 446:
                return new ulu((xgw) this.a.b.hK.b());
            case 447:
                return new xgw((aled) this.a.b.hw.b());
            case 448:
                return Boolean.valueOf(((ersq) this.a.a.s.b()).a("bugle.commit_fragment_transactions_immediately"));
            case 449:
                return Boolean.valueOf(((ersq) this.a.a.s.b()).a("bugle.fix_reattach_on_configuration_change"));
            case 450:
                return new dris();
            case 451:
                return new ugn();
            case 452:
                LocationManager locationManager = (LocationManager) ((Context) this.a.q.b()).getSystemService("location");
                locationManager.getClass();
                return locationManager;
            case 453:
                return new czfd((Context) this.a.q.b(), (effy) this.a.b.hR.b(), (errl) this.a.t.b());
            case 454:
                ekqx k = ekqy.k();
                ((ekqr) k).a = "EmojiVariantPreferences";
                k.d(czek.a);
                ekqy a = k.a();
                akis akisVar6 = this.a;
                return akisVar6.eA().a(a, (efbm) akisVar6.aM.b());
            case 455:
                return new czex((Executor) this.a.t.b(), (ctyx) this.a.aU.b());
            case 456:
                final fbbf fbbfVar11 = this.a.a.s;
                return new atrd() { // from class: atnz
                    @Override // defpackage.atrd
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_remove_rcs_msisdn_accessor_from_message_details");
                    }
                };
            case 457:
                return new czkq((baae) this.a.b.hW.b());
            case 458:
                cqoh cqohVar = (cqoh) this.a.cz.b();
                akis akisVar7 = this.a;
                return new baae(cqohVar, akisVar7.dD, akisVar7.b.hV, (errl) akisVar7.ps.b(), (errm) this.a.p.b());
            case 459:
                Context context4 = (Context) this.a.q.b();
                csjy.l("Bugle", "FirebaseUserActions initialized");
                return eunp.a(context4);
            case 460:
                akis akisVar8 = this.a;
                fbbf fbbfVar12 = akisVar8.aK;
                akko akkoVar4 = akisVar8.b;
                akkp akkpVar = akisVar8.a;
                return new bdmz(akkpVar.Gv, akkpVar.ej, akkoVar4.hY, (errl) fbbfVar12.b());
            case 461:
                return new bdjj(new enpx(new ajtd((ajrp) this.a.b.a.a.FA.b())), (ecrj) this.a.cN.b());
            case 462:
                return new uwp();
            case 463:
                cbar cbarVar = (cbar) this.a.cB.b();
                akis akisVar9 = this.a;
                akko akkoVar5 = akisVar9.b;
                akkp akkpVar2 = akkoVar5.a.a;
                akkp akkpVar3 = akisVar9.a;
                fbbf fbbfVar13 = akkpVar3.fP;
                fbbf fbbfVar14 = akkoVar5.ib;
                fbbf fbbfVar15 = akkoVar5.ic;
                fbbf fbbfVar16 = akkpVar3.f;
                fbbf fbbfVar17 = akkpVar2.fP;
                fbbf fbbfVar18 = akkpVar2.Df;
                fbbfVar17.getClass();
                fbbfVar14.getClass();
                fbbfVar18.getClass();
                ddzb ddzbVar = (ddzb) akkpVar3.nk.b();
                aolr aolrVar = (aolr) this.a.a.Z.b();
                return new ttm(cbarVar, fbbfVar13, fbbfVar14, fbbfVar15, fbbfVar16, ddzbVar, aolrVar, this.a.a.ko);
            case 464:
                akis akisVar10 = this.a;
                return new tto(akisVar10.a.dF, (Executor) akisVar10.p.b());
            case 465:
                akis akisVar11 = this.a;
                return new ttx(akisVar11.a.dF, (Executor) akisVar11.p.b());
            case 466:
                akis akisVar12 = this.a;
                return new cuah(akisVar12.aU, (csjk) akisVar12.a.fQ.b(), this.a.a.CR);
            case 467:
                return new csuv();
            case 468:
                akis akisVar13 = this.a;
                akko akkoVar6 = akisVar13.b;
                return new cmqt(akisVar13.p, akkoVar6.hw, akisVar13.cz, akkoVar6.ig);
            case 469:
                return new cmqw((Executor) this.a.t.b());
            case 470:
                cins cinsVar = (cins) this.a.a.jc.b();
                akko akkoVar7 = this.a.b;
                return new abxj(cinsVar, new abxi((Context) akkoVar7.a.q.b(), (ciqn) akkoVar7.a.a.aN.b()), (abxg) this.a.b.ii.b());
            case 471:
                akis akisVar14 = this.a;
                return new abxg(akisVar14.a.az, akisVar14.aO, (errl) akisVar14.t.b());
            case 472:
                akis akisVar15 = this.a;
                return new acaj(akisVar15.b.ik, akisVar15.a.cf);
            case 473:
                akkp akkpVar4 = this.a.a;
                return new abya(akkpVar4.ql, (Optional) akkpVar4.uP.b(), (errl) this.a.p.b(), (errl) this.a.t.b(), (Context) this.a.q.b(), (ctvb) this.a.a.u.b());
            case 474:
                return new ason() { // from class: arts
                };
            case 475:
                ejvp ejvpVar = (ejvp) this.a.aR.b();
                akkp akkpVar5 = this.a.a;
                fbbf fbbfVar19 = akkpVar5.nr;
                ffsk ffskVar3 = (ffsk) akkpVar5.p.b();
                fbbf fbbfVar20 = this.a.b.a.a.aT;
                fbbfVar20.getClass();
                comy comyVar = (comy) fbbfVar20.b();
                comu c = comv.c();
                c.d(comb.SUGGESTION_SHORTCUT_SETTINGS);
                c.f(czvy.a);
                return new czvw(ejvpVar, fbbfVar19, ffskVar3, comyVar.a(c.a()));
            case 476:
                akis akisVar16 = this.a;
                akkp akkpVar6 = akisVar16.a;
                return new ahny(akkpVar6.KU, akisVar16.fM, (ffsk) akkpVar6.p.b(), (cqoh) this.a.cz.b());
            case 477:
                return new asvr() { // from class: asec
                };
            case 478:
                return new dede((ctyx) this.a.aU.b(), (ddzb) this.a.a.nk.b());
            case 479:
                return new dbir(this.a.a.nk);
            case 480:
                return Boolean.valueOf(((ekck) this.a.a.oe().a.b()).a("com.google.android.apps.messaging.auto 45417049").e());
            case 481:
                akis akisVar17 = this.a;
                akkp akkpVar7 = akisVar17.b.a.a;
                fbbf fbbfVar21 = akisVar17.dI;
                BiFunction i2 = ((colj) akkpVar7.dj.b()).i();
                akis akisVar18 = this.a;
                return new cklj(fbbfVar21, i2, akisVar18.a.f, akisVar18.cU(), (errl) akisVar18.p.b());
            case 482:
                akko akkoVar8 = this.a.b;
                return Optional.of(new aitx((errl) akkoVar8.a.p.b(), (effy) akkoVar8.a.nD.b()));
            case 483:
                fazb a2 = fbaz.a(this.a.b.iC);
                Optional empty = (this.a.b.s().a() && ((Optional) a2.b()).isPresent()) ? (Optional) a2.b() : Optional.empty();
                empty.getClass();
                return empty;
            case 484:
                return Optional.of(new aajd(this.a.b.iB));
            case 485:
                ffsk ffskVar4 = (ffsk) this.a.a.p.b();
                ffhd ffhdVar = (ffhd) this.a.co.b();
                akis akisVar19 = this.a;
                return new aaja(ffskVar4, ffhdVar, akisVar19.a.aT, akisVar19.b.iA);
            case 486:
                return new aaip(this.a.a.qf);
            case 487:
                Context context5 = (Context) this.a.q.b();
                akis akisVar20 = this.a;
                return new dacp(context5, akisVar20.a.rh, (errl) akisVar20.t.b());
            case 488:
                return new dacm((cbwj) this.a.a.kG.b());
            case 489:
                return Optional.of(new dblq());
            case 490:
                return new asqo() { // from class: arww
                };
            case 491:
                return new asgy() { // from class: argw
                };
            case 492:
                return Optional.of(new daxj());
            case 493:
                return new aczg((ffsk) this.a.a.p.b(), (ersv) this.a.a.akO.b(), (asqs) this.a.a.bo.b());
            case 494:
                return Boolean.valueOf(((ekck) this.a.a.or().a.b()).a("com.google.android.apps.messaging.auto 45419609").e());
            case 495:
                return new cqmi((cevh) this.a.a.cc.b(), (ffsk) this.a.a.q.b());
            case 496:
                ffsk ffskVar5 = (ffsk) this.a.a.p.b();
                akis akisVar21 = this.a;
                return new axvj(ffskVar5, akisVar21.b.av, akisVar21.mY, akisVar21.a.Hq);
            case 497:
                akis akisVar22 = this.a;
                akkp akkpVar8 = akisVar22.a;
                akko akkoVar9 = akisVar22.b;
                fbbf fbbfVar22 = akkoVar9.iP;
                fbbf fbbfVar23 = akkoVar9.iQ;
                fbbf fbbfVar24 = akkpVar8.ay;
                Context context6 = (Context) akisVar22.q.b();
                ffsk ffskVar6 = (ffsk) this.a.a.aq.b();
                akis akisVar23 = this.a;
                akko akkoVar10 = akisVar23.b;
                akkp akkpVar9 = akkoVar10.a.a;
                fbbf fbbfVar25 = akisVar23.a.Lz;
                bbhv bbhvVar = new bbhv(new bbic(akkpVar9.dt, akkpVar9.qf, (ffsk) akkpVar9.q.b(), akkoVar10.a.a.LE), (ffsk) akkoVar10.a.a.p.b(), (ffhd) akkoVar10.a.cP.b());
                akis akisVar24 = this.a;
                return new bbhs(fbbfVar22, fbbfVar23, fbbfVar24, context6, ffskVar6, fbbfVar25, bbhvVar, akisVar24.b.aM(), (bbhg) akisVar24.nv.b(), this.a.a.cc());
            case 498:
                bbip bbipVar = (bbip) this.a.b.iO.b();
                bbhy eM = this.a.a.eM();
                bbipVar.getClass();
                eM.a();
                return bbipVar.a;
            case 499:
                return new bbip(new bbio(bcgi.a), new bcji(), new bbio(bbow.a), new bbkf(), new bbio(bcbb.a), new bbio(bcdt.a), new bcfb((cqoh) this.a.b.a.cz.b()), new bbio(bblo.a), new bbio(bbvd.a), new bbio(bbtq.a), new bbio(bbwi.a), new bbio(bbqv.a), new bbio(bbry.a), (aucl) this.a.a.Lu.b());
            default:
                throw new AssertionError(i);
        }
    }

    private final Object g() {
        int i = this.b;
        switch (i) {
            case 500:
                bbip bbipVar = (bbip) this.a.b.iO.b();
                bbipVar.getClass();
                List list = bbipVar.b;
                list.getClass();
                return list;
            case 501:
                return new dbjc((Context) this.a.q.b(), (errl) this.a.ps.b(), this.a.b.k);
            case 502:
                final fbbf fbbfVar = this.a.a.s;
                return new atkr() { // from class: atkb
                    @Override // defpackage.atkr
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_database_debug_tool");
                    }
                };
            case 503:
                return new bduy((ejtr) this.a.a.f7do.b(), (cqoh) this.a.cz.b(), (ctud) this.a.cT.b(), (ctml) this.a.a.ni.b(), (bdva) this.a.b.iU.b(), (elbx) this.a.aJ.b());
            case 504:
                Context context = (Context) this.a.q.b();
                akis akisVar = this.a;
                fbbf fbbfVar2 = akisVar.a.dB;
                errl errlVar = (errl) akisVar.t.b();
                akko akkoVar = this.a.b;
                errl errlVar2 = (errl) akkoVar.a.t.b();
                cqoh cqohVar = (cqoh) akkoVar.a.cz.b();
                akkp akkpVar = akkoVar.a.a;
                fbbf fbbfVar3 = akkpVar.nr;
                cbgf cbgfVar = (cbgf) akkpVar.dA.b();
                akkp akkpVar2 = akkoVar.a.a;
                return new bdva(context, fbbfVar2, errlVar, new bdvd(errlVar2, cqohVar, fbbfVar3, cbgfVar, akkpVar2.nC, akkpVar2.tJ, akkpVar2.nD));
            case 505:
                return new cswx((Context) this.a.q.b(), (cswh) this.a.b.iW.b(), (errl) this.a.cK.b(), (errl) this.a.p.b(), (csjk) this.a.a.el.b());
            case 506:
                fhgs fhgsVar = (fhgs) this.a.iC.b();
                fazb a = fbaz.a(this.a.hj);
                fjdw fjdwVar = new fjdw();
                fjdwVar.d("https://api.tenor.com/");
                fjdwVar.b(new fjek());
                fjdwVar.c(fjem.c((evkn) a.b()));
                fhgsVar.getClass();
                fjdwVar.a = fhgsVar;
                cswh cswhVar = (cswh) fjdwVar.a().a(cswh.class);
                cswhVar.getClass();
                return cswhVar;
            case 507:
                fazb a2 = fbaz.a(this.a.b.fo);
                akis akisVar2 = this.a;
                return new ddov(a2, akisVar2.b.N, akisVar2.a.ej);
            case 508:
                final fbbf fbbfVar4 = this.a.a.s;
                return new askw() { // from class: arnt
                    @Override // defpackage.askw
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.add_missing_intent_category_for_launcher_activity");
                    }
                };
            case 509:
                return new cbpk((cbsf) this.a.a.sp.b());
            case 510:
                akkp akkpVar3 = this.a.a;
                return new cvqs(akkpVar3.zX, fbaz.a(akkpVar3.Z), this.a.b.jb);
            case 511:
                return new cvqp();
            case 512:
                return Boolean.valueOf(((ersq) this.a.a.s.b()).a("bugle.enable_smart_reply_sent_sound"));
            case 513:
                return Long.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45411436").b());
            case 514:
                final fbbf fbbfVar5 = this.a.a.s;
                return new asuf() { // from class: asbq
                    @Override // defpackage.asuf
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.remove_suggested_texts_from_magic_compose");
                    }
                };
            case 515:
                final fbbf fbbfVar6 = this.a.a.s;
                return new auus() { // from class: auud
                    @Override // defpackage.auus
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.cancel_future_before_unbinding_from_aicore");
                    }
                };
            case 516:
                final fbbf fbbfVar7 = this.a.a.s;
                return new auut() { // from class: auuf
                    @Override // defpackage.auut
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.catch_exception_when_unbinding_from_aicore");
                    }
                };
            case 517:
                Context context2 = (Context) this.a.q.b();
                akis akisVar3 = this.a;
                akko akkoVar2 = akisVar3.b;
                akkp akkpVar4 = akisVar3.a;
                return new abae(context2, akkpVar4.fp, akisVar3.cp, akisVar3.jy, akkpVar4.Fo, (Optional) akkoVar2.ji.b());
            case 518:
                return Optional.of(new wot());
            case 519:
                cfup cfupVar = aizc.a;
                return new aizb();
            case 520:
                String a3 = aizd.a();
                cfup cfupVar2 = aizc.a;
                ekpc ekpcVar = new ekpc();
                ekpcVar.a = a3;
                ekpcVar.b = 443;
                ekpcVar.b(famy.e);
                return ekpcVar.c();
            case 521:
                akis akisVar4 = this.a;
                akkp akkpVar5 = akisVar4.a;
                return new wor(akkpVar5.nc, akkpVar5.QO, akkpVar5.Rc, akisVar4.p, akisVar4.t, akisVar4.cn);
            case 522:
                return Long.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45409908").b());
            case 523:
                return Long.valueOf(((ekck) this.a.a.on().a.b()).a("com.google.android.apps.messaging.auto 45409907").b());
            case 524:
                dqii dqiiVar = (dqii) this.a.b.jp.b();
                dqka mb = this.a.a.mb();
                dqiiVar.getClass();
                return mb.a(dqiiVar);
            case 525:
                return new dqii("magic_compose_style", new ffji() { // from class: drgy
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        esgx esgxVar = (esgx) obj;
                        esgxVar.getClass();
                        return esgxVar.name();
                    }
                }, drgz.a);
            case 526:
                akis akisVar5 = this.a;
                return new dccz(akisVar5.b.bz(), (ctyx) akisVar5.aU.b(), (csjk) this.a.a.el.b(), (errl) this.a.cK.b(), (errm) this.a.t.b(), (errl) this.a.p.b());
            case 527:
                return MediaViewerActivity.class;
            case 528:
                akko akkoVar3 = this.a.b;
                return Optional.of(new alhc((ffsk) akkoVar3.a.a.aq.b(), (Context) akkoVar3.a.q.b(), (cins) akkoVar3.a.a.jc.b()));
            case 529:
                return Long.valueOf(((ekck) this.a.b.a.a.j.b()).a("com.google.android.apps.messaging.auto 45530923").b());
            case 530:
                return new alez(fbaz.a(this.a.b.jx), fbaz.a(this.a.b.jy), fbaz.a(this.a.b.jz), fbaz.a(this.a.b.jA), fbaz.a(this.a.ji));
            case 531:
                return new dvyc((dvzc) this.a.b.jw.b());
            case 532:
                akko akkoVar4 = this.a.b;
                enpd enpdVar = enpd.a;
                dvzi dvziVar = (dvzi) akkoVar4.jv.b();
                entd entdVar = dwbz.a;
                dwbx dwbxVar = new dwbx();
                enin eninVar = new enin();
                eninVar.j(enpdVar);
                eninVar.c(dvziVar.e);
                return new dvzc(eninVar.g(), dwbxVar);
            case 533:
                dvwi dvwiVar = (dvwi) this.a.a.lL.b();
                final elbx elbxVar = (elbx) this.a.b.a.aJ.b();
                emxc j = emxc.j(new dvyk() { // from class: ejil
                    @Override // defpackage.dvyk
                    public final Runnable a(final Runnable runnable) {
                        if (ekyf.v()) {
                            return eldl.l(runnable);
                        }
                        final elbx elbxVar2 = elbx.this;
                        return new Runnable() { // from class: ejik
                            @Override // java.lang.Runnable
                            public final void run() {
                                elbx elbxVar3 = elbx.this;
                                Runnable runnable2 = runnable;
                                ekzm b = elbxVar3.b("AutoGIL");
                                try {
                                    runnable2.run();
                                    b.close();
                                } catch (Throwable th) {
                                    try {
                                        b.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        };
                    }
                });
                this.a.a.mi();
                dvzi dvziVar2 = new dvzi(dvwiVar, (dvyk) j.e(new dvyk() { // from class: dvzq
                    @Override // defpackage.dvyk
                    public final Runnable a(Runnable runnable) {
                        return runnable;
                    }
                }), (dvwa) this.a.jh.b());
                if (!"robolectric".equals(Build.FINGERPRINT) && !Build.TAGS.contains("dev-keys") && !Build.TAGS.contains("test-keys")) {
                    Integer num = 500;
                    num.getClass();
                    dvziVar2.f = 500;
                }
                return dvziVar2;
            case 534:
                return ((dvyc) this.a.b.jx.b()).b;
            case 535:
                dvzc dvzcVar = (dvzc) this.a.b.jw.b();
                errl errlVar3 = (errl) this.a.t.b();
                dvzi dvziVar3 = (dvzi) this.a.b.jv.b();
                dvzcVar.getClass();
                errlVar3.getClass();
                dvziVar3.getClass();
                new ersb(errlVar3);
                return new dvyu(dvzcVar);
            case 536:
                dvwi dvwiVar2 = (dvwi) this.a.a.lL.b();
                dvwa dvwaVar = (dvwa) this.a.jh.b();
                Boolean bool = false;
                bool.getClass();
                return new dvzn(dvwiVar2, dvwaVar);
            case 537:
                return new aspv() { // from class: arvo
                };
            case 538:
                return new abai();
            case 539:
                ffsk ffskVar = (ffsk) this.a.a.aq.b();
                akis akisVar6 = this.a;
                akkp akkpVar6 = akisVar6.a;
                akko akkoVar5 = akisVar6.b;
                return new alqj(ffskVar, akkoVar5.jG, akkoVar5.jH, akkpVar6.Dt);
            case 540:
                akis akisVar7 = this.a;
                akko akkoVar6 = akisVar7.b;
                akkp akkpVar7 = akisVar7.a;
                return new aljx(akkpVar7.bi, akkpVar7.cK, akkpVar7.br, akkoVar6.jF, akkpVar7.bj);
            case 541:
                return new alka((lap) this.a.b.jE.b());
            case 542:
                ekqt f = ekqu.f();
                ekqp ekqpVar = (ekqp) f;
                ekqpVar.a = "RcsCujData";
                alkc alkcVar = (alkc) alkd.a.createBuilder();
                alkcVar.getClass();
                ekqpVar.b = alke.a(alkcVar);
                f.b(new ldq(new ffji() { // from class: alkb
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        ((laf) obj).getClass();
                        alkc alkcVar2 = (alkc) alkd.a.createBuilder();
                        alkcVar2.getClass();
                        return alke.a(alkcVar2);
                    }
                }));
                return this.a.a.mB().a(f.a());
            case 543:
                akkp akkpVar8 = this.a.a;
                return new alql(akkpVar8.Dt, akkpVar8.bi, (ffsk) akkpVar8.aq.b());
            case 544:
                final fbbf fbbfVar8 = this.a.a.s;
                return new asmv() { // from class: arqz
                    @Override // defpackage.asmv
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_rcs_cuj_logging");
                    }
                };
            case 545:
                final fbbf fbbfVar9 = this.a.a.s;
                return new auof() { // from class: auny
                    @Override // defpackage.auof
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.fix_conversation_focus_on_resume");
                    }
                };
            case 546:
                final fbbf fbbfVar10 = this.a.a.s;
                return new atbq() { // from class: atar
                    @Override // defpackage.atbq
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_direct_send_viewer_v2");
                    }
                };
            case 547:
                final fbbf fbbfVar11 = this.a.a.s;
                return new aufr() { // from class: aufd
                    @Override // defpackage.aufr
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_projector_in_waffle");
                    }
                };
            case 548:
                final fbbf fbbfVar12 = this.a.a.s;
                return new athb() { // from class: atfr
                    @Override // defpackage.athb
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.consume_compose_row_state_from_intent");
                    }
                };
            case 549:
                final fbbf fbbfVar13 = this.a.a.s;
                return new avdj() { // from class: avdb
                    @Override // defpackage.avdj
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_welcome_profile_primitive");
                    }
                };
            case 550:
                errl errlVar4 = (errl) this.a.p.b();
                akis akisVar8 = this.a;
                return new acmb(errlVar4, akisVar8.a.aT, akisVar8.dQ, (ejvb) akisVar8.dy.b(), fbaz.a(this.a.a.eY));
            case 551:
                return new dczd((errl) this.a.p.b(), this.a.a.EP);
            case 552:
                final fbbf fbbfVar14 = this.a.a.s;
                return new atzl() { // from class: atyb
                    @Override // defpackage.atzl
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.crop_rcs_group_icon");
                    }
                };
            case 553:
                return Long.valueOf(((ekck) this.a.b.dh().a.b()).a("com.google.android.apps.messaging.auto 45664219").b());
            case 554:
                return Long.valueOf(((ekck) this.a.b.dh().a.b()).a("com.google.android.apps.messaging.auto 45664220").b());
            case 555:
                return new asou() { // from class: arue
                };
            case 556:
                final fbbf fbbfVar15 = this.a.a.s;
                return new asql() { // from class: arwr
                    @Override // defpackage.asql
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_mms_group_upgrade_ui_home_screen");
                    }
                };
            case 557:
                return Boolean.valueOf(((ekck) this.a.b.dh().a.b()).a("com.google.android.apps.messaging.auto 45662759").e());
            case 558:
                final fbbf fbbfVar16 = this.a.a.s;
                return new aubg() { // from class: auat
                    @Override // defpackage.aubg
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.fix_draft_cut_off");
                    }
                };
            case 559:
                final fbbf fbbfVar17 = this.a.a.s;
                return new askd() { // from class: arml
                    @Override // defpackage.askd
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_in_bubble_read_receipts");
                    }
                };
            case 560:
                return Long.valueOf(((ekck) this.a.a.nK().a.b()).a("com.google.android.apps.messaging.auto 45665592").b());
            case 561:
                final fbbf fbbfVar18 = this.a.a.s;
                return new auzz() { // from class: auyr
                    @Override // defpackage.auzz
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_status_ux_updates");
                    }
                };
            case 562:
                final fbbf fbbfVar19 = this.a.a.s;
                return new asom() { // from class: artq
                    @Override // defpackage.asom
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_adapter_get_item_null_counter");
                    }
                };
            case 563:
                cmel cmelVar = (cmel) this.a.a.vV.b();
                ejvo ejvoVar = new ejvo((ejvp) this.a.b.a.aR.b());
                ejvo ejvoVar2 = new ejvo((ejvp) this.a.b.a.aR.b());
                ejvb ejvbVar = (ejvb) this.a.dy.b();
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                csjk csjkVar = (csjk) this.a.a.fQ.b();
                errl errlVar5 = (errl) this.a.t.b();
                errl errlVar6 = (errl) this.a.aK.b();
                errl errlVar7 = (errl) this.a.p.b();
                ctyx ctyxVar = (ctyx) this.a.aU.b();
                ejvp ejvpVar = (ejvp) this.a.aR.b();
                cort cortVar = (cort) this.a.a.bj.b();
                akkp akkpVar9 = this.a.a;
                return new cmao(cmelVar, ejvoVar, ejvoVar2, ejvbVar, cqohVar2, csjkVar, errlVar5, errlVar6, errlVar7, ctyxVar, ejvpVar, cortVar, akkpVar9.bo, akkpVar9.cK, akkpVar9.CR);
            case 564:
                Context context3 = (Context) this.a.q.b();
                Executor executor = (Executor) this.a.t.b();
                akis akisVar9 = this.a;
                akko akkoVar7 = akisVar9.b;
                return new dday(context3, executor, akisVar9.hk, akkoVar7.kc, akkoVar7.kd);
            case 565:
                ffhd ffhdVar = (ffhd) this.a.cP.b();
                ffsk ffskVar2 = (ffsk) this.a.a.aq.b();
                akis akisVar10 = this.a;
                akkp akkpVar10 = akisVar10.a;
                fbbf fbbfVar20 = akkpVar10.bi;
                fbbf fbbfVar21 = akkpVar10.cN;
                Context context4 = (Context) akisVar10.q.b();
                akis akisVar11 = this.a;
                return new cmfb(ffhdVar, ffskVar2, fbbfVar20, fbbfVar21, context4, akisVar11.fM, akisVar11.a.Dr);
            case 566:
                final fbbf fbbfVar22 = this.a.a.s;
                return new auyb() { // from class: auxn
                    @Override // defpackage.auyb
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_home_cool_ranch_phase3");
                    }
                };
            case 567:
                ekqx k = ekqy.k();
                ((ekqr) k).a = "SwipeActionSettingsDataStore";
                k.d(cxhw.a);
                ekqy a4 = k.a();
                akis akisVar12 = this.a;
                return akisVar12.eA().a(a4, (efbm) akisVar12.aM.b());
            case 568:
                final fbbf fbbfVar23 = this.a.a.s;
                return new asoo() { // from class: artu
                    @Override // defpackage.asoo
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_conversation_list_debug_menu");
                    }
                };
            case 569:
                final fbbf fbbfVar24 = this.a.a.s;
                return new asot() { // from class: aruc
                    @Override // defpackage.asot
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.tint_menu_item_intead_of_icon");
                    }
                };
            case 570:
                return new stg();
            case 571:
                return new ajgd((akyb) this.a.a.bi.b());
            case 572:
                return new aelp((ctbk) this.a.hi.b(), (ffsk) this.a.a.p.b(), (ffsk) this.a.a.aq.b(), (awti) this.a.ju.b(), (aolr) this.a.a.Z.b(), (cqoh) this.a.cz.b());
            case 573:
                return new aelg((ffsk) this.a.a.p.b(), (aqvh) this.a.a.gN.b());
            case 574:
                return new aela((ffsk) this.a.a.aq.b(), (ctbk) this.a.hi.b(), this.a.b.N());
            case 575:
                final fbbf fbbfVar25 = this.a.a.s;
                return new aubi() { // from class: auax
                    @Override // defpackage.aubi
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.reduce_invalidate");
                    }
                };
            case 576:
                return new AtomicBoolean(false);
            case 577:
                akis akisVar13 = this.a;
                return akisVar13.eA().a(adju.a(), (efbm) akisVar13.aM.b());
            case 578:
                akko akkoVar8 = this.a.b;
                return new dwci(akkoVar8.jx, akkoVar8.jy, akkoVar8.jA);
            case 579:
                final Context context5 = (Context) this.a.q.b();
                emxc j2 = emxc.j((errl) this.a.t.b());
                final EducationDatabase educationDatabase = (EducationDatabase) this.a.b.ks.b();
                final ExecutorService executorService = (ExecutorService) j2.e(Executors.newCachedThreadPool(ebog.a()));
                return new emyl() { // from class: ebiu
                    @Override // defpackage.emyl
                    public final Object get() {
                        ebit ebitVar = new ebit(context5, executorService);
                        ebitVar.d = educationDatabase;
                        return ebitVar;
                    }
                };
            case 580:
                EducationDatabase x = EducationDatabase.x((Context) this.a.q.b(), (ExecutorService) emxc.j((errl) this.a.t.b()).e(Executors.newCachedThreadPool(ebog.a())));
                x.getClass();
                return x;
            case 581:
                enhk enhkVar = enoz.a;
                LinkedHashMap linkedHashMap = new LinkedHashMap(ffew.a(((enoz) enhkVar).d));
                for (Map.Entry entry : enhkVar.entrySet()) {
                    dozm dozmVar = (dozm) entry.getKey();
                    drlx a5 = drlo.a(dozmVar.a());
                    if (a5 == null) {
                        throw new IllegalArgumentException("Invalid MediaType registered: '" + dozmVar.a() + "'");
                    }
                    linkedHashMap.put(a5, entry.getValue());
                }
                return linkedHashMap;
            case 582:
                return new drqi((Context) this.a.q.b(), (dqhs) this.a.b.kw.b(), new drps((ffsk) this.a.b.a.a.q.b()), new drpu((ffsk) this.a.b.a.a.q.b()), new drql((ffsk) this.a.b.a.a.q.b()), (ffsk) this.a.a.q.b(), this.a.b.ky);
            case 583:
                return new dqhs((Context) this.a.q.b(), (ffsk) this.a.a.q.b(), this.a.b.kv);
            case 584:
                return Optional.of(Boolean.valueOf(((ersq) new atdu(this.a.b.a.a.s).a.b()).a("bugle.allow_android_contact_uri_in_hugo")));
            case 585:
                return Optional.of((dozj) this.a.b.kx.b());
            case 586:
                return new dozj(true, true, true, false);
            case 587:
                final fbbf fbbfVar26 = this.a.a.s;
                return new asxz() { // from class: asxs
                    @Override // defpackage.asxz
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_mini_camera_lifecycle_observer_fix");
                    }
                };
            case 588:
                return Optional.of((adpp) this.a.b.kC.b());
            case 589:
                akkp akkpVar11 = this.a.a;
                return new adpp(akkpVar11.al, akkpVar11.C);
            case 590:
                return Boolean.valueOf(((ekck) this.a.a.oM().a.b()).a("com.google.android.apps.messaging.auto 45653938").e());
            case 591:
                return ((ekck) this.a.a.oc().a.b()).a("com.google.android.apps.messaging.auto 45648946").d();
            case 592:
                final fbbf fbbfVar27 = this.a.a.s;
                return new aubf() { // from class: auar
                    @Override // defpackage.aubf
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_status_bar_fix_in_archive_and_spam_screen");
                    }
                };
            case 593:
                final fbbf fbbfVar28 = this.a.a.s;
                return new aube() { // from class: auap
                    @Override // defpackage.aube
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_migrate_to_flogger");
                    }
                };
            case 594:
                final fbbf fbbfVar29 = this.a.a.s;
                return new aubd() { // from class: auan
                    @Override // defpackage.aubd
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_go_to_top_for_all");
                    }
                };
            case 595:
                final fbbf fbbfVar30 = this.a.a.s;
                return new aunk() { // from class: aump
                    @Override // defpackage.aunk
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.remove_fullscreen_variant_for_phone_number_input_popup");
                    }
                };
            case 596:
                final fbbf fbbfVar31 = this.a.a.s;
                return new aubb() { // from class: auak
                    @Override // defpackage.aubb
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_fix_archive_and_spam_in_one_ui");
                    }
                };
            case 597:
                final fbbf fbbfVar32 = this.a.a.s;
                return new auaz() { // from class: auag
                    @Override // defpackage.auaz
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.disable_scrollbar");
                    }
                };
            case 598:
                return Boolean.valueOf(((ersq) this.a.a.s.b()).a("bugle.enable_lighter_settings_page_as_view"));
            case 599:
                return Boolean.valueOf(((ersq) this.a.a.s.b()).a("bugle.enable_smart_context"));
            default:
                throw new AssertionError(i);
        }
    }

    private final Object h() {
        boolean isIsolated;
        int i = this.b;
        switch (i) {
            case 600:
                final fbbf fbbfVar = this.a.a.s;
                return new atmy() { // from class: atnb
                    @Override // defpackage.atmy
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.always_pass_self_identity_to_start_chat_if_available");
                    }
                };
            case 601:
                return new wlu(this.a.b.jf);
            case 602:
                return new eknb((Context) this.a.q.b());
            case 603:
                final fbbf fbbfVar2 = this.a.a.s;
                return new audg() { // from class: aucy
                    @Override // defpackage.audg
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.fix_bugle_open_cause");
                    }
                };
            case 604:
                return Boolean.valueOf(((ekck) this.a.b.a.a.j.b()).a("com.google.android.apps.messaging.auto 45460584").e());
            case 605:
                final fbbf fbbfVar3 = this.a.a.s;
                return new auto() { // from class: autm
                    @Override // defpackage.auto
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.deprecate_sim_messages");
                    }
                };
            case 606:
                final fbbf fbbfVar4 = this.a.a.s;
                return new atiy() { // from class: atia
                    @Override // defpackage.atiy
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_edge_to_edge");
                    }
                };
            case 607:
                final fbbf fbbfVar5 = this.a.a.s;
                return new asln() { // from class: arox
                    @Override // defpackage.asln
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.disable_edge_to_edge_on_ditto_welcome_fragment");
                    }
                };
            case 608:
                final fbbf fbbfVar6 = this.a.a.s;
                return new aslh() { // from class: arol
                    @Override // defpackage.aslh
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.deprecate_announce_for_accessibility");
                    }
                };
            case 609:
                final fbbf fbbfVar7 = this.a.a.s;
                return new auya() { // from class: auxl
                    @Override // defpackage.auya
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_device_pairing_cool_ranch_phase3");
                    }
                };
            case 610:
                return new cbou((cbsf) this.a.a.sp.b(), (cbpl) this.a.a.sr.b(), (errl) this.a.t.b(), (errl) this.a.aK.b());
            case 611:
                final fbbf fbbfVar8 = this.a.a.s;
                return new auyd() { // from class: auxq
                    @Override // defpackage.auyd
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_search_cool_ranch_phase3");
                    }
                };
            case 612:
                return new smw((Context) this.a.q.b());
            case 613:
                Context context = (Context) this.a.q.b();
                return new azzw(context);
            case 614:
                return new vfd();
            case 615:
                return new ajgc(this.a.a.dF, new ajfr(), (Executor) this.a.p.b());
            case 616:
                return new csmj();
            case 617:
                return Boolean.valueOf(((ersq) this.a.a.s.b()).a("bugle.fix_gif_flickering_in_message_list"));
            case 618:
                return new asst() { // from class: arzr
                };
            case 619:
                final fbbf fbbfVar9 = this.a.a.s;
                return new aupj() { // from class: aupb
                    @Override // defpackage.aupj
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.fix_rcs_sim_status_margin_and_punctuation");
                    }
                };
            case 620:
                final fbbf fbbfVar10 = this.a.a.s;
                return new aupl() { // from class: aupd
                    @Override // defpackage.aupl
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.move_retry_button_to_rcs_sim_status_view");
                    }
                };
            case 621:
                return new bdwv((ctud) this.a.cT.b(), (errl) this.a.t.b(), this.a.q);
            case 622:
                return new ctdf((errl) this.a.t.b());
            case 623:
                Vibrator vibrator = (Vibrator) ((Context) this.a.q.b()).getSystemService("vibrator");
                vibrator.getClass();
                return vibrator;
            case 624:
                return new aksx((cqoh) this.a.cz.b(), (Context) this.a.q.b(), (acdc) this.a.b.lm.b());
            case 625:
                return new acdc((Context) this.a.q.b());
            case 626:
                return new akpn((akzt) this.a.a.f.b());
            case 627:
                return new cteg((ekmz) this.a.gH.b());
            case 628:
                final fbbf fbbfVar11 = this.a.a.s;
                return new asoi() { // from class: artk
                    @Override // defpackage.asoi
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.remove_send_ripple_on_go");
                    }
                };
            case 629:
                final fbbf fbbfVar12 = this.a.a.s;
                return new aupm() { // from class: aupf
                    @Override // defpackage.aupm
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.remove_disabled_via_welcome_message_counter");
                    }
                };
            case 630:
                fbbf fbbfVar13 = this.a.b.ls;
                fbbfVar13.getClass();
                isIsolated = Process.isIsolated();
                return Boolean.valueOf(!isIsolated && ((Boolean) fbbfVar13.b()).booleanValue());
            case 631:
                return Boolean.valueOf(((ekck) this.a.a.oO().a.b()).a("tiktok.directboot 45677379").e());
            case 632:
                return ((ekck) this.a.a.oM().a.b()).a("com.google.android.apps.messaging.auto 45660384").d();
            case 633:
                final fbbf fbbfVar14 = this.a.a.s;
                return new avdk() { // from class: avdd
                    @Override // defpackage.avdk
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.fix_preference_padding");
                    }
                };
            case 634:
                final fbbf fbbfVar15 = this.a.a.s;
                return new avdh() { // from class: avcx
                    @Override // defpackage.avdh
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.change_welcome_customization_title");
                    }
                };
            case 635:
                final fbbf fbbfVar16 = this.a.a.s;
                return new avcr() { // from class: avct
                    @Override // defpackage.avcr
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.add_minor_ui_tweaks_to_welcome");
                    }
                };
            case 636:
                final fbbf fbbfVar17 = this.a.a.s;
                return new avcs() { // from class: avcv
                    @Override // defpackage.avcs
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.add_welcome_flow_to_ui_data");
                    }
                };
            case 637:
                final fbbf fbbfVar18 = this.a.a.s;
                return new atji() { // from class: atir
                    @Override // defpackage.atji
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_temporary_group_recipient_flow_fix");
                    }
                };
            case 638:
                final fbbf fbbfVar19 = this.a.a.s;
                return new auxw() { // from class: auxf
                    @Override // defpackage.auxw
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_conversation_details_cool_ranch_phase3");
                    }
                };
            case 639:
                return new ativ() { // from class: athv
                };
            case 640:
                return ((ekck) this.a.b.a.a.j.b()).a("com.google.android.apps.messaging.auto 45650861").d();
            case 641:
                return Long.valueOf(((ekck) this.a.b.df().a.b()).a("com.google.android.apps.messaging.auto 45477694").b());
            case 642:
                return Long.valueOf(((ekck) this.a.b.df().a.b()).a("com.google.android.apps.messaging.auto 45618039").b());
            case 643:
                return new abcp((aleq) this.a.a.lO.b());
            case 644:
                final fbbf fbbfVar20 = this.a.a.s;
                return new atej() { // from class: ateg
                    @Override // defpackage.atej
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_compose_row3");
                    }
                };
            case 645:
                return Long.valueOf(((ekck) this.a.b.df().a.b()).a("com.google.android.apps.messaging.auto 45477695").b());
            case 646:
                return Boolean.valueOf(((ersq) this.a.a.s.b()).a("bugle.enable_cdp_education"));
            case 647:
                ekqx k = ekqy.k();
                ((ekqr) k).a = "CdpEducationTooltipData";
                k.d(ablv.a);
                ekqy a = k.a();
                akis akisVar = this.a;
                return akisVar.eA().a(a, (efbm) akisVar.aM.b());
            case 648:
                final fbbf fbbfVar21 = this.a.a.s;
                return new atws() { // from class: atvj
                    @Override // defpackage.atws
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_early_processing_for_videos");
                    }
                };
            case 649:
                return new yal();
            case 650:
                akkp akkpVar = this.a.a;
                return akkpVar.df().f(akkpVar.di());
            case 651:
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                akko akkoVar = this.a.b;
                akkoVar.m();
                xgo xgoVar = new xgo((cstx) akkoVar.a.cp.b());
                xfu xfuVar = new xfu();
                Optional optional = (Optional) this.a.ka.b();
                akko akkoVar2 = this.a.b;
                Optional of = Optional.of(new cmjr((ffhd) akkoVar2.a.co.b(), (cqoh) akkoVar2.a.cz.b()));
                akis akisVar2 = this.a;
                return new xhe(ffskVar, xgoVar, xfuVar, optional, of, akisVar2.a.dF, new alcs(), (Executor) akisVar2.p.b());
            case 652:
                return new adao();
            case 653:
                akis akisVar3 = this.a;
                akko akkoVar3 = akisVar3.b;
                fbbf fbbfVar22 = akisVar3.a.qf;
                fbbf fbbfVar23 = akkoVar3.lP;
                fbbf fbbfVar24 = akkoVar3.lO;
                fbbfVar22.getClass();
                fbbfVar23.getClass();
                fbbfVar24.getClass();
                return new adan(fbbfVar22, fbbfVar23, fbbfVar24);
            case 654:
                cqoh cqohVar = (cqoh) this.a.cz.b();
                cqohVar.getClass();
                return new adak(cqohVar);
            case 655:
                Executor executor = (Executor) this.a.a.m.b();
                executor.getClass();
                return fftu.b(executor);
            case 656:
                return new atbp() { // from class: atat
                };
            case 657:
                final fbbf fbbfVar25 = this.a.a.s;
                return new atbu() { // from class: atbb
                    @Override // defpackage.atbu
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.fix_shortcuts_for_dual_sim");
                    }
                };
            case 658:
                final fbbf fbbfVar26 = this.a.a.s;
                return new aurs() { // from class: aurm
                    @Override // defpackage.aurs
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.read_samsung_bit_instead_of_overlay_provider");
                    }
                };
            case 659:
                final fbbf fbbfVar27 = this.a.a.s;
                return new aski() { // from class: armt
                    @Override // defpackage.aski
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.prevent_input_close_on_scroll");
                    }
                };
            case 660:
                final fbbf fbbfVar28 = this.a.a.s;
                return new atdq() { // from class: atdf
                    @Override // defpackage.atdq
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_ignore_stale_draft_extras");
                    }
                };
            case 661:
                return new cbac(this.a.b.lZ);
            case 662:
                akis akisVar4 = this.a;
                akko akkoVar4 = akisVar4.b;
                akkp akkpVar2 = akisVar4.a;
                return new cbad(akisVar4.f4if, akkpVar2.ab, akkoVar4.lX, akkoVar4.lY, akkpVar2.Z);
            case 663:
                akis akisVar5 = this.a;
                return new cbal(akisVar5.q, akisVar5.cz);
            case 664:
                return new cbak(this.a.q);
            case 665:
                final fbbf fbbfVar29 = this.a.a.s;
                return new atmx() { // from class: atmz
                    @Override // defpackage.atmx
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.add_conversation_id_to_bugle_compose_disabled_event");
                    }
                };
            case 666:
                final fbbf fbbfVar30 = this.a.a.s;
                return new atbo() { // from class: atap
                    @Override // defpackage.atbo
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_direct_send_from_camera_gallery_input");
                    }
                };
            case 667:
                final fbbf fbbfVar31 = this.a.a.s;
                return new avaf() { // from class: auyv
                    @Override // defpackage.avaf
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.fix_text_on_white_background");
                    }
                };
            case 668:
                final fbbf fbbfVar32 = this.a.a.s;
                return new aval() { // from class: auze
                    @Override // defpackage.aval
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.show_spacer_for_null_shortcuts");
                    }
                };
            case 669:
                return new atbs() { // from class: atax
                };
            case 670:
                return Long.valueOf(((ekck) this.a.b.di().a.b()).a("com.google.android.apps.messaging.auto 45667967").b());
            case 671:
                return Long.valueOf(((ekck) this.a.b.di().a.b()).a("com.google.android.apps.messaging.auto 45667968").b());
            case 672:
                return Long.valueOf(((ekck) this.a.b.di().a.b()).a("com.google.android.apps.messaging.auto 45667969").b());
            case 673:
                return Long.valueOf(((ekck) this.a.b.di().a.b()).a("com.google.android.apps.messaging.auto 45667970").b());
            case 674:
                final fbbf fbbfVar33 = this.a.a.s;
                return new atbl() { // from class: atak
                    @Override // defpackage.atbl
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_clear_attachments_on_close_in_direct_send_viewer_v2");
                    }
                };
            case 675:
                return new dtma((Context) this.a.q.b(), (ffsk) this.a.a.q.b(), new dtlk(ernk.a(30L), ffew.g(new ffcf("arcade_messages_bunny", Integer.valueOf(R.string.bunny_display_name)), new ffcf("arcade_messages_film_noir", Integer.valueOf(R.string.film_noir_display_name)), new ffcf("arcade_messages_cute_glasses", Integer.valueOf(R.string.cute_glasses_display_name)), new ffcf("arcade_messages_feathery_dinosaur", Integer.valueOf(R.string.feathery_dinosaur_display_name)), new ffcf("arcade_messages_glowing_hat", Integer.valueOf(R.string.glowing_hat_display_name)), new ffcf("arcade_messages_strawberry", Integer.valueOf(R.string.strawberry_display_name)), new ffcf("arcade_olympic_runner", Integer.valueOf(R.string.olympic_runner_display_name)), new ffcf("valentines_day_panda", Integer.valueOf(R.string.valentines_day_panda_display_name)), new ffcf("arcade_retouch_meet", Integer.valueOf(R.string.portrait_touchup_display_name))), ffew.c(new ffcf("arcade_retouch_meet", Integer.valueOf(R.drawable.gs_face_retouch_vd_theme_24))), ffew.c(new ffcf("arcade_retouch_meet", new dszp()))));
            case 676:
                final fbbf fbbfVar34 = this.a.a.s;
                return new asgt() { // from class: argp
                    @Override // defpackage.asgt
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_cfx");
                    }
                };
            case 677:
                final fbbf fbbfVar35 = this.a.a.s;
                return new asyc() { // from class: asxx
                    @Override // defpackage.asyc
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_simultaneous_use_cases");
                    }
                };
            case 678:
                final fbbf fbbfVar36 = this.a.a.s;
                return new atcx() { // from class: atco
                    @Override // defpackage.atcx
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_direct_send_pager_dynamic_offset");
                    }
                };
            case 679:
                return Long.valueOf(((ekck) this.a.b.a.a.j.b()).a("com.google.android.apps.messaging.auto 45662831").b());
            case 680:
                final fbbf fbbfVar37 = this.a.a.s;
                return new auji() { // from class: aujb
                    @Override // defpackage.auji
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.open_suggested_text_from_shortcut");
                    }
                };
            case 681:
                final fbbf fbbfVar38 = this.a.a.s;
                return new aujj() { // from class: aujd
                    @Override // defpackage.aujj
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.update_magic_compose_shortcut_string");
                    }
                };
            case 682:
                return Long.valueOf(((ekck) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto 45598668").b());
            case 683:
                return Long.valueOf(((ekck) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto 45598669").b());
            case 684:
                return Long.valueOf(((ekck) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto 45598667").b());
            case 685:
                return Long.valueOf(((ekck) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto 45598670").b());
            case 686:
                return Boolean.valueOf(((ekck) this.a.a.nG().a.b()).a("com.google.android.apps.messaging.auto 45613505").e());
            case 687:
                final fbbf fbbfVar39 = this.a.a.s;
                return new asof() { // from class: artg
                    @Override // defpackage.asof
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_using_parent_theme_on_hugo_compose_screens");
                    }
                };
            case 688:
                return Boolean.valueOf(((ersq) this.a.a.s.b()).a("bugle.enable_voice_screen_invocations"));
            case 689:
                final fbbf fbbfVar40 = this.a.a.s;
                return new asqk() { // from class: arwp
                    @Override // defpackage.asqk
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_mms_group_upgrade_ui_conversation_screen");
                    }
                };
            case 690:
                final fbbf fbbfVar41 = this.a.a.s;
                return new attc() { // from class: atso
                    @Override // defpackage.attc
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_dismiss_dunestar_snackbar_button");
                    }
                };
            case 691:
                final fbbf fbbfVar42 = this.a.a.s;
                return new atbx() { // from class: atbg
                    @Override // defpackage.atbx
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.use_android_fragment_in_hugo");
                    }
                };
            case 692:
                final fbbf fbbfVar43 = this.a.a.s;
                return new atth() { // from class: atsy
                    @Override // defpackage.atth
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.fix_dunestar_compose_row_snackbar");
                    }
                };
            case 693:
                return Long.valueOf(((ekck) this.a.b.dh().a.b()).a("com.google.android.apps.messaging.auto 45662674").b());
            case 694:
                final fbbf fbbfVar44 = this.a.a.s;
                return new atqx() { // from class: atnn
                    @Override // defpackage.atqx
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_fix_top_app_bar_middle_ui_adapter_impl");
                    }
                };
            case 695:
                ekqx k2 = ekqy.k();
                ((ekqr) k2).a = "EarlyFeedbackData";
                k2.d(abnn.a);
                ekqy a2 = k2.a();
                akis akisVar6 = this.a;
                return akisVar6.eA().a(a2, (efbm) akisVar6.aM.b());
            case 696:
                return Long.valueOf(((ekck) this.a.b.df().a.b()).a("com.google.android.apps.messaging.auto 45427029").b());
            case 697:
                return Long.valueOf(((ekck) this.a.b.df().a.b()).a("com.google.android.apps.messaging.auto 45427030").b());
            case 698:
                return Boolean.valueOf(((ekck) this.a.b.df().a.b()).a("com.google.android.apps.messaging.auto 45476294").e());
            case 699:
                final fbbf fbbfVar45 = this.a.a.s;
                return new atfl() { // from class: atfn
                    @Override // defpackage.atfl
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.allow_alert_card_in_bottom_content");
                    }
                };
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        int i = this.b;
        switch (i) {
            case 700:
                return Boolean.valueOf(((ekck) this.a.b.dh().a.b()).a("com.google.android.apps.messaging.auto 45667618").e());
            case 701:
                final fbbf fbbfVar = this.a.a.s;
                return new asum() { // from class: ascc
                    @Override // defpackage.asum
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_profile_name_in_reactions");
                    }
                };
            case 702:
                final fbbf fbbfVar2 = this.a.a.s;
                return new ashf() { // from class: arhj
                    @Override // defpackage.ashf
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.check_compose_constraints_for_resend_as_rcs_action");
                    }
                };
            case 703:
                final fbbf fbbfVar3 = this.a.a.s;
                return new askx() { // from class: arnv
                    @Override // defpackage.askx
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_e2ee_transient_bottom_notice");
                    }
                };
            case 704:
                return Long.valueOf(((ekck) this.a.b.dh().a.b()).a("com.google.android.apps.messaging.auto 45664398").b());
            case 705:
                return new czmd((ffsk) this.a.a.q.b(), this.a.a.nc);
            case 706:
                return Long.valueOf(((ekck) this.a.b.a.a.j.b()).a("com.google.android.apps.messaging.auto 45639922").b());
            case 707:
                final fbbf fbbfVar4 = this.a.a.s;
                return new asqb() { // from class: arvy
                    @Override // defpackage.asqb
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_media_viewer_reactions");
                    }
                };
            case 708:
                final fbbf fbbfVar5 = this.a.a.s;
                return new asqc() { // from class: arwa
                    @Override // defpackage.asqc
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_media_viewer_replies");
                    }
                };
            case 709:
                return Long.valueOf(((ekck) this.a.b.a.a.j.b()).a("com.google.android.apps.messaging.auto 45648581").b());
            case 710:
                return Long.valueOf(((ekck) this.a.b.dl().a.b()).a("com.google.android.apps.messaging.auto 45665041").b());
            case 711:
                return Long.valueOf(((ekck) this.a.b.dl().a.b()).a("com.google.android.apps.messaging.auto 45665042").b());
            case 712:
                return Long.valueOf(((ekck) this.a.b.dl().a.b()).a("com.google.android.apps.messaging.auto 45665043").b());
            case 713:
                return Long.valueOf(((ekck) this.a.b.dl().a.b()).a("com.google.android.apps.messaging.auto 45665044").b());
            case 714:
                return Long.valueOf(((ekck) this.a.b.df().a.b()).a("com.google.android.apps.messaging.auto 45613917").b());
            case 715:
                return Long.valueOf(((ekck) this.a.b.df().a.b()).a("com.google.android.apps.messaging.auto 45640007").b());
            case 716:
                return Boolean.valueOf(((ekck) this.a.b.dh().a.b()).a("com.google.android.apps.messaging.auto 45656178").e());
            case 717:
                final fbbf fbbfVar6 = this.a.a.s;
                return new auux() { // from class: auum
                    @Override // defpackage.auux
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_toolstone_close_and_logging");
                    }
                };
            case 718:
                return new auuz() { // from class: auuq
                };
            case 719:
                return new crnr((Context) this.a.q.b(), (ffsk) this.a.a.p.b());
            case 720:
                return Long.valueOf(((ekck) this.a.b.df().a.b()).a("com.google.android.apps.messaging.auto 45629264").b());
            case 721:
                return Long.valueOf(((ekck) this.a.b.a.a.j.b()).a("com.google.android.apps.messaging.auto 45630590").b());
            case 722:
                return Long.valueOf(((ekck) this.a.b.df().a.b()).a("com.google.android.apps.messaging.auto 45478358").b());
            case 723:
                akkp akkpVar = this.a.a;
                return new aavn(akkpVar.nc, (ffsk) akkpVar.q.b(), this.a.b.bl());
            case 724:
                final fbbf fbbfVar7 = this.a.a.s;
                return new atsh() { // from class: atqf
                    @Override // defpackage.atsh
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.show_sim_name_for_one_self_identity_group");
                    }
                };
            case 725:
                final fbbf fbbfVar8 = this.a.a.s;
                return new athn() { // from class: atgp
                    @Override // defpackage.athn
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_provide_assist_content");
                    }
                };
            case 726:
                final fbbf fbbfVar9 = this.a.a.s;
                return new aujg() { // from class: auix
                    @Override // defpackage.aujg
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_gemini_tos_ari");
                    }
                };
            case 727:
                return new ajba();
            case 728:
                return new ausc() { // from class: aurw
                };
            case 729:
                return Long.valueOf(((ekck) this.a.b.dj().a.b()).a("com.google.android.apps.messaging.auto 45426357").b());
            case 730:
                final fbbf fbbfVar10 = this.a.a.s;
                return new auhn() { // from class: auhg
                    @Override // defpackage.auhn
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_edge_to_edge_in_multishare");
                    }
                };
            case 731:
                return Long.valueOf(((ekck) this.a.b.dj().a.b()).a("com.google.android.apps.messaging.auto 45409228").b());
            case 732:
                return Long.valueOf(((ekck) this.a.b.dj().a.b()).a("com.google.android.apps.messaging.auto 45409229").b());
            case 733:
                return Long.valueOf(((ekck) this.a.b.dj().a.b()).a("com.google.android.apps.messaging.auto 45409230").b());
            case 734:
                return Long.valueOf(((ekck) this.a.b.dj().a.b()).a("com.google.android.apps.messaging.auto 45428666").b());
            case 735:
                return Long.valueOf(((ekck) this.a.b.dj().a.b()).a("com.google.android.apps.messaging.auto 45428705").b());
            case 736:
                final fbbf fbbfVar11 = this.a.a.s;
                return new auhm() { // from class: auhe
                    @Override // defpackage.auhm
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_disable_send_when_sending");
                    }
                };
            case 737:
                final fbbf fbbfVar12 = this.a.a.s;
                return new auho() { // from class: auhi
                    @Override // defpackage.auho
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_multishare_create_conv_without_name");
                    }
                };
            case 738:
                fbbf fbbfVar13 = this.a.b.nw;
                fbbfVar13.getClass();
                ekpc ekpcVar = new ekpc();
                ekpcVar.b(ewqy.M);
                ekpcVar.a = (String) fbbfVar13.b();
                ekpcVar.b = 443;
                return ekpcVar.c();
            case 739:
                return ((ekck) this.a.a.or().a.b()).a("com.google.android.apps.messaging.auto 45416769").d();
            case 740:
                final fbbf fbbfVar14 = this.a.a.s;
                return new asvt() { // from class: asef
                    @Override // defpackage.asvt
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.start_chat_enable_rcs_check_timeout");
                    }
                };
            case 741:
                final fbbf fbbfVar15 = this.a.a.s;
                return new asur() { // from class: ascm
                    @Override // defpackage.asur
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_bot_id_resolver_via_bot_info");
                    }
                };
            case 742:
                final fbbf fbbfVar16 = this.a.a.s;
                return new asus() { // from class: asci
                    @Override // defpackage.asus
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_bot_id_resolver_via_bot_info_germany");
                    }
                };
            case 743:
                final fbbf fbbfVar17 = this.a.a.s;
                return new asut() { // from class: asck
                    @Override // defpackage.asut
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_bot_id_resolver_via_bot_info_global");
                    }
                };
            case 744:
                final fbbf fbbfVar18 = this.a.a.s;
                return new asuq() { // from class: ascg
                    @Override // defpackage.asuq
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_bot_id_resolver_in_chat_starter");
                    }
                };
            case 745:
                return Long.valueOf(((ekck) this.a.a.ot().a.b()).a("com.google.android.apps.messaging.auto 45418255").b());
            case 746:
                return Long.valueOf(((ekck) this.a.a.ot().a.b()).a("com.google.android.apps.messaging.auto 45618101").b());
            case 747:
                final fbbf fbbfVar19 = this.a.a.s;
                return new auvr() { // from class: auvc
                    @Override // defpackage.auvr
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_edge_to_edge_in_start_chat");
                    }
                };
            case 748:
                final fbbf fbbfVar20 = this.a.a.s;
                return new auvv() { // from class: auvk
                    @Override // defpackage.auvv
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_start_chat_back_behavior_fix");
                    }
                };
            case 749:
                final fbbf fbbfVar21 = this.a.a.s;
                return new audf() { // from class: aucw
                    @Override // defpackage.audf
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_set_theme_in_activity");
                    }
                };
            case 750:
                return new acgq();
            case 751:
                ekgy ekgyVar = (ekgy) this.a.b.gp.b();
                ekgyVar.getClass();
                return new ekan(ekgyVar);
            case 752:
                eiyk eiykVar = (eiyk) this.a.a.o.b();
                akis akisVar = this.a;
                enhd h = enhk.h(10);
                akko akkoVar = akisVar.b;
                h.k(ejfp.class, akkoVar.nK);
                h.k(ejgc.class, akkoVar.a.a.Uk);
                h.k(set.class, akkoVar.nL);
                h.k(adjr.class, akkoVar.nO);
                h.k(cgki.class, akkoVar.nP);
                h.k(tdd.class, akkoVar.nQ);
                h.k(acnf.class, akkoVar.nS);
                h.k(ejgm.class, akkoVar.nT);
                h.k(ejed.class, akkoVar.nU);
                h.k(seu.class, akkoVar.nV);
                enhk c = h.c();
                akko akkoVar2 = this.a.b;
                return new eiwj(eiykVar, c, enhk.m(ejhv.class, akkoVar2.nW, admh.class, akkoVar2.nX), enhk.l(tcy.class, this.a.b.nY), new enpx("pseudonymous"), (eivc) this.a.a.Ul.b());
            case 753:
                akko akkoVar3 = this.a.b;
                return new ejfp(new ejfr((ejvb) akkoVar3.a.dy.b(), (eiyk) akkoVar3.a.a.o.b(), (eixo) akkoVar3.a.a.as.b()), emxc.j(Boolean.valueOf(((ekck) this.a.b.a.a.j.b()).a("tiktok.device 45670050").e())));
            case 754:
                return new set((ejgc) this.a.a.Uk.b(), new ejfv((ejgc) this.a.b.a.a.Uk.b()));
            case 755:
                eixo eixoVar = (eixo) this.a.a.as.b();
                eiyk eiykVar2 = (eiyk) this.a.a.o.b();
                akko akkoVar4 = this.a.b;
                adke adkeVar = new adke((ffsk) akkoVar4.a.a.aq.b(), (effy) akkoVar4.kq.b(), akkoVar4.nM);
                akis akisVar2 = this.a;
                akkp akkpVar2 = akisVar2.a;
                fbbf fbbfVar22 = akisVar2.b.nN;
                ffsk ffskVar = (ffsk) akkpVar2.aq.b();
                akis akisVar3 = this.a;
                ejvb ejvbVar = (ejvb) akisVar3.dy.b();
                akis akisVar4 = this.a;
                akkp akkpVar3 = akisVar4.a;
                return new adjr(eixoVar, eiykVar2, adkeVar, fbbfVar22, ffskVar, akisVar3.cz, ejvbVar, akisVar4.b.ap, akkpVar3.Dy, (ffsk) akkpVar3.p.b());
            case 756:
                ffsk ffskVar2 = (ffsk) this.a.a.aq.b();
                dkvu dkvuVar = (dkvu) this.a.hl.b();
                akis akisVar5 = this.a;
                return new deip(ffskVar2, dkvuVar, akisVar5.b.cf(), (eixo) akisVar5.a.as.b(), (ejvb) this.a.dy.b());
            case 757:
                return new adkf(this.a.a.C);
            case 758:
                return new cgki((ejgc) this.a.a.Uk.b(), (eixo) this.a.a.as.b(), (errl) this.a.t.b());
            case 759:
                return new tdd((babf) this.a.a.pN.b());
            case 760:
                return new acnf((acmx) this.a.b.nR.b(), (errl) this.a.p.b());
            case 761:
                return new acmx((eixo) this.a.a.as.b(), (errl) this.a.t.b(), (ejar) this.a.a.au.b(), (ebwq) this.a.pd.b(), (errl) this.a.p.b(), (aclb) this.a.b.p.b());
            case 762:
                return new ejgm();
            case 763:
                akis akisVar6 = this.a;
                return new ejed(akisVar6.b.cX(), (eiyk) akisVar6.a.o.b());
            case 764:
                return new seu(Optional.empty(), (eiyk) this.a.a.o.b(), this.a.b.cX());
            case 765:
                return new ejhv((Context) this.a.q.b());
            case 766:
                Context context = (Context) this.a.q.b();
                cgfd cgfdVar = (cgfd) this.a.a.Dy.b();
                akis akisVar7 = this.a;
                return new admh(context, cgfdVar, akisVar7.a.ck, (errl) akisVar7.p.b());
            case 767:
                return new tcw((ffsk) this.a.a.p.b(), (Context) this.a.q.b());
            case 768:
                return Boolean.valueOf(((ersq) this.a.a.s.b()).a("bugle.enable_no_account_available_error_exception_fix"));
            case 769:
                Context context2 = (Context) this.a.q.b();
                ffsk ffskVar3 = (ffsk) this.a.a.aq.b();
                akkp akkpVar4 = this.a.a;
                return new acnk(context2, ffskVar3, akkpVar4.C, (ejar) akkpVar4.au.b(), this.a.a.cf);
            case 770:
                return new acnh();
            case 771:
                akis akisVar8 = this.a;
                akko akkoVar5 = akisVar8.b;
                akkp akkpVar5 = akisVar8.a;
                return new dekv(akkpVar5.p, akkpVar5.al, akkpVar5.bi, akkoVar5.hj);
            case 772:
                ekqx k = ekqy.k();
                ((ekqr) k).a = "EsiFlowEvent";
                k.d(eqpf.a);
                ekqy a = k.a();
                akis akisVar9 = this.a;
                return akisVar9.eA().a(a, (efbm) akisVar9.aM.b());
            case 773:
                return new elfk();
            case 774:
                return new AtomicLong();
            case 775:
                return new adii();
            case 776:
                final fbbf fbbfVar23 = this.a.a.s;
                return new aubh() { // from class: auav
                    @Override // defpackage.aubh
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.prevent_home_screen_invalid_change_listener");
                    }
                };
            case 777:
                return Boolean.valueOf(((ersq) this.a.a.s.b()).a("bugle.enable_lighter_startup_differentiate_signin_shown"));
            case 778:
                return new wqn();
            case 779:
                final fbbf fbbfVar24 = this.a.a.s;
                return new aude() { // from class: aucu
                    @Override // defpackage.aude
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_log_root_fragment_type");
                    }
                };
            case 780:
                return new audd() { // from class: aucs
                };
            case 781:
                return new audc() { // from class: aucq
                };
            case 782:
                final fbbf fbbfVar25 = this.a.a.s;
                return new audh() { // from class: auda
                    @Override // defpackage.audh
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.fix_root_fragment_reattachment_check");
                    }
                };
            case 783:
                final fbbf fbbfVar26 = this.a.a.s;
                return new asqd() { // from class: arwc
                    @Override // defpackage.asqd
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.support_ultra_hdr");
                    }
                };
            case 784:
                return new asgz() { // from class: argy
                };
            case 785:
                return new dacf((ddzb) this.a.a.nk.b(), (cbeq) this.a.a.fy.b(), (elbx) this.a.aJ.b(), (aolr) this.a.a.Z.b(), (errl) this.a.aK.b());
            case 786:
                return new daxf((cers) this.a.a.sF.b());
            case 787:
                akko akkoVar6 = this.a.b;
                axkm axkmVar = (axkm) akkoVar6.a.a.ck.b();
                errl errlVar = (errl) akkoVar6.a.t.b();
                errl errlVar2 = (errl) akkoVar6.a.p.b();
                akkp akkpVar6 = akkoVar6.a.a;
                dazm dazmVar = new dazm(axkmVar, errlVar, errlVar2, akkpVar6.cc, (babf) akkpVar6.pN.b(), (elbx) akkoVar6.a.aJ.b(), (axmm) akkoVar6.a.a.qL.b());
                dbir dbirVar = (dbir) akkoVar6.ir.b();
                akkp akkpVar7 = akkoVar6.a.a;
                fbbf fbbfVar27 = akkpVar7.aT;
                axmm axmmVar = (axmm) akkpVar7.qL.b();
                ffsk ffskVar4 = (ffsk) akkoVar6.a.a.q.b();
                ffhd ffhdVar = (ffhd) akkoVar6.a.cn.b();
                akkp akkpVar8 = akkoVar6.a.a;
                fbbf fbbfVar28 = akkoVar6.it;
                fbbf fbbfVar29 = akkoVar6.iu;
                fbbf fbbfVar30 = akkpVar8.pN;
                cgwa cgwaVar = (cgwa) akkpVar8.zO.b();
                akis akisVar10 = akkoVar6.a;
                akkp akkpVar9 = akisVar10.a;
                return Optional.of(new dayt(dazmVar, dbirVar, fbbfVar27, axmmVar, ffskVar4, ffhdVar, fbbfVar28, fbbfVar29, fbbfVar30, cgwaVar, akkpVar9.gE, akkpVar9.gr, akkpVar9.bn(), akisVar10.aJ, akkoVar6.iv, akkpVar9.tY, akkpVar9.tZ, akkpVar9.qK, akkpVar9.ua));
            case 788:
                return Optional.of((aeyq) this.a.a.IM.b());
            case 789:
                ffsk ffskVar5 = (ffsk) this.a.a.p.b();
                akko akkoVar7 = this.a.b;
                return new ayeg(ffskVar5, akkoVar7.dE, akkoVar7.au);
            case 790:
                final fbbf fbbfVar31 = this.a.a.s;
                return new asmo() { // from class: arql
                    @Override // defpackage.asmo
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_null_check_for_ditto_activity_peer");
                    }
                };
            case 791:
                return Boolean.valueOf(((ersq) this.a.a.s.b()).a("bugle.location_skip_throwing_exception_on_api_error"));
            case 792:
                return new ddnz((altk) this.a.a.fP.b());
            case 793:
                final fbbf fbbfVar32 = this.a.a.s;
                return new avei() { // from class: avdy
                    @Override // defpackage.avei
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.avoid_post_in_link_card_vm_constructor");
                    }
                };
            case 794:
                final fbbf fbbfVar33 = this.a.a.s;
                return new avej() { // from class: avea
                    @Override // defpackage.avej
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.cancel_fetch_message_search_results");
                    }
                };
            case 795:
                return new emyg(emtt.a);
            case 796:
                Context context3 = (Context) this.a.q.b();
                emxc.j(this.a.b.Y());
                return new akod(context3, this.a.a.jm);
            case 797:
                return new acdu((Context) this.a.q.b(), (akzt) this.a.a.f.b());
            case 798:
                Context context4 = (Context) this.a.q.b();
                ffsk ffskVar6 = (ffsk) this.a.a.q.b();
                akkp akkpVar10 = this.a.a;
                return new czog(context4, ffskVar6, akkpVar10.BM, akkpVar10.eT, akkpVar10.BK, akkpVar10.BL);
            case 799:
                Context context5 = (Context) this.a.q.b();
                ffsk ffskVar7 = (ffsk) this.a.a.q.b();
                akis akisVar11 = this.a;
                fbbf fbbfVar34 = akisVar11.a.eT;
                akko akkoVar8 = akisVar11.b;
                return new czqi(context5, ffskVar7, fbbfVar34, akkoVar8.fa, akkoVar8.oG);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object j() {
        int i = this.b;
        switch (i) {
            case 800:
                final fbbf fbbfVar = this.a.a.s;
                return new asmu() { // from class: arqx
                    @Override // defpackage.asmu
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_rbm_sms_deep_linking");
                    }
                };
            case 801:
                return new eljl((eljg) this.a.w.b(), (dlpw) this.a.l.b(), (ejvp) this.a.aR.b());
            case 802:
                return new ellq((elbx) this.a.aJ.b());
            case 803:
                return new ddwu((elbx) this.a.aJ.b());
            case 804:
                return new cmqy(this.a.aJ);
            case 805:
                return dozk.a(this.a.b.dF());
            case 806:
                drpz drpzVar = (drpz) this.a.b.kA.b();
                ernh ernhVar = (ernh) this.a.lm.b();
                akko akkoVar = this.a.b;
                return new drpd(drpzVar, ernhVar, akkoVar.oM, akkoVar.ky);
            case 807:
                return new dqgo((dqhs) this.a.b.kw.b(), this.a.b.cK());
            case 808:
                akkp akkpVar = this.a.a;
                return new abwe(akkpVar.ib, (cpdg) akkpVar.ap.b());
            case 809:
                Context context = (Context) this.a.q.b();
                akis akisVar = this.a;
                acef B = akisVar.b.B();
                akko akkoVar2 = akisVar.b;
                return new acee(context, B, akkoVar2.oS, (acfk) akkoVar2.oQ.b());
            case 810:
                return new acdz((Context) this.a.q.b(), (csxu) this.a.aO.b(), (cqoh) this.a.cz.b());
            case 811:
                return new acea((csxu) this.a.aO.b(), this.a.a.RF);
            case 812:
                return new acei((Executor) this.a.t.b());
            case 813:
                return new aczb();
            case 814:
                acuz acuzVar = (acuz) this.a.b.oV.b();
                akis akisVar2 = this.a;
                fbbf fbbfVar2 = akisVar2.b.p;
                elbx elbxVar = (elbx) akisVar2.aJ.b();
                akis akisVar3 = this.a;
                return new acpo(acuzVar, fbbfVar2, elbxVar, akisVar3.a.f, (errl) akisVar3.p.b(), (errm) this.a.p.b());
            case 815:
                Optional optional = (Optional) this.a.b.q.b();
                acxa acxaVar = (acxa) this.a.b.v.b();
                errl errlVar = (errl) this.a.p.b();
                ctbk ctbkVar = (ctbk) this.a.hi.b();
                akis akisVar4 = this.a;
                return new acuz(optional, acxaVar, errlVar, ctbkVar, akisVar4.b.r, akisVar4.a.C);
            case 816:
                akis akisVar5 = this.a;
                return new acmm(akisVar5.fP, akisVar5.b.r, akisVar5.a.f, (errl) akisVar5.p.b(), this.a.a.H);
            case 817:
                akis akisVar6 = this.a;
                return new acmh(akisVar6.fP, akisVar6.b.r, akisVar6.a.f, (errl) akisVar6.p.b());
            case 818:
                return new acux((Context) this.a.q.b(), (cfvu) this.a.a.cr.b(), (acmx) this.a.b.nR.b(), (errl) this.a.p.b());
            case 819:
                return new acva((Context) this.a.q.b());
            case 820:
                return new acsz((Context) this.a.q.b(), (errl) this.a.t.b(), (errl) this.a.p.b());
            case 821:
                return new acwm((acxa) this.a.b.v.b());
            case 822:
                return new acxe((Context) this.a.q.b(), (acxa) this.a.b.v.b());
            case 823:
                return new acxf((acxa) this.a.b.v.b());
            case 824:
                Context context2 = (Context) this.a.q.b();
                akko akkoVar3 = this.a.b;
                fbbf fbbfVar3 = akkoVar3.hQ;
                akis akisVar7 = akkoVar3.a;
                return new aduc(context2, new adua(fbbfVar3, akisVar7.cT, akisVar7.p), (errl) this.a.p.b());
            case 825:
                akis akisVar8 = this.a;
                akkp akkpVar2 = akisVar8.a;
                atuf cj = akkpVar2.cj();
                bzrn fc = akkpVar2.fc();
                errl errlVar2 = (errl) akisVar8.t.b();
                errl errlVar3 = (errl) this.a.p.b();
                bzqa bzqaVar = (bzqa) this.a.cI.b();
                akkp akkpVar3 = this.a.a;
                fbbf fbbfVar4 = akkpVar3.sQ;
                cafi cafiVar = (cafi) akkpVar3.cv.b();
                akkp akkpVar4 = this.a.a;
                return new cait(cj, fc, errlVar2, errlVar3, bzqaVar, fbbfVar4, cafiVar, akkpVar4.ib, (bzqb) akkpVar4.qq.b(), this.a.a.G);
            case 826:
                final fbbf fbbfVar5 = this.a.a.s;
                return new atrf() { // from class: atod
                    @Override // defpackage.atrf
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.dsdr_remove_rcs_utils_in_message_send_failure_ui");
                    }
                };
            case 827:
                return new asqh() { // from class: arwj
                };
            case 828:
                final fbbf fbbfVar6 = this.a.a.s;
                return new aulq() { // from class: aulr
                    @Override // defpackage.aulq
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.add_disabled_automatic_provisioning_rule_to_rcs_settings");
                    }
                };
            case 829:
                final fbbf fbbfVar7 = this.a.a.s;
                return new aupn() { // from class: auph
                    @Override // defpackage.aupn
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.remove_update_rcs_sim_status_preference");
                    }
                };
            case 830:
                final fbbf fbbfVar8 = this.a.a.s;
                return new asvh() { // from class: asdo
                    @Override // defpackage.asvh
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.remove_announce_in_sim_messages");
                    }
                };
            case 831:
                final fbbf fbbfVar9 = this.a.a.s;
                return new auoe() { // from class: aunw
                    @Override // defpackage.auoe
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_rbm_sms_short_code_deep_links");
                    }
                };
            case 832:
                final fbbf fbbfVar10 = this.a.a.s;
                return new atfj() { // from class: atff
                    @Override // defpackage.atfj
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.check_empty_recipients_before_launch_conversation");
                    }
                };
            case 833:
                akis akisVar9 = this.a;
                return new cvlw(akisVar9.a.aT, (errl) akisVar9.p.b());
            case 834:
                return new akou(this.a.a.ag());
            case 835:
                return new cylu((ejvb) this.a.dy.b(), (ejvp) this.a.aR.b(), (bctx) this.a.a.Fz.b(), (errl) this.a.t.b());
            case 836:
                return new ddlw((Context) this.a.q.b(), (cqoh) this.a.cz.b(), (acdc) this.a.b.lm.b());
            case 837:
                return new cygz((ejvb) this.a.dy.b(), (errl) this.a.t.b(), (bctx) this.a.a.Fz.b());
            case 838:
                return new byzz((ejvb) this.a.dy.b(), (ejvp) this.a.aR.b());
            case 839:
                final fbbf fbbfVar11 = this.a.a.s;
                return new asux() { // from class: ascv
                    @Override // defpackage.asux
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.remove_bot_availability_check_via_bot_info");
                    }
                };
            case 840:
                return new asud() { // from class: asbm
                };
            case 841:
                return new asue() { // from class: asbo
                };
            case 842:
                return ((ekck) this.a.a.os().a.b()).a("com.google.android.apps.messaging.auto 45476179").d();
            case 843:
                return Boolean.valueOf(((ersq) this.a.a.s.b()).a("bugle.fix_google_tos_button_clickability"));
            case 844:
                akkp akkpVar5 = this.a.a;
                fbbf fbbfVar12 = akkpVar5.FE;
                fbbf fbbfVar13 = akkpVar5.ql;
                Optional optional2 = (Optional) akkpVar5.uP.b();
                cibf cibfVar = (cibf) this.a.lU.b();
                errl errlVar4 = (errl) this.a.t.b();
                bzgd bzgdVar = (bzgd) this.a.a.fa.b();
                akkp akkpVar6 = this.a.a;
                fbbf fbbfVar14 = akkpVar6.jZ;
                chyw chywVar = (chyw) akkpVar6.vb.b();
                chhw chhwVar = (chhw) this.a.a.aX.b();
                chyp chypVar = (chyp) this.a.a.ve.b();
                akis akisVar10 = this.a;
                return new cstj(fbbfVar12, fbbfVar13, optional2, cibfVar, errlVar4, bzgdVar, fbbfVar14, chywVar, chhwVar, chypVar, akisVar10.a.FU, akisVar10.da);
            case 845:
                return CameraActivity.class;
            case 846:
                Optional of = Optional.of((Executor) this.a.b.pB.b());
                Optional of2 = Optional.of((EGLContext) this.a.b.pC.b());
                akis akisVar11 = this.a;
                return new dcoz(of, of2, akisVar11.b.cs(), (errl) akisVar11.ps.b(), (errl) this.a.t.b(), (Context) this.a.q.b(), (ctcy) this.a.nZ.b(), this.a.a.ej, Optional.of(new Object() { // from class: dcpb
                }), Optional.of(new Object() { // from class: dcpa
                }));
            case 847:
                HandlerThread handlerThread = new HandlerThread("CameraThread");
                handlerThread.start();
                final Handler handler = new Handler(handlerThread.getLooper());
                return new Executor() { // from class: dcpd
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handler.post(runnable);
                    }
                };
            case 848:
                EGLContext eGLContext = new exmf(null).c;
                eGLContext.getClass();
                return eGLContext;
            case 849:
                return new dcwc((Context) this.a.q.b(), (eept) this.a.b.pG.b(), (errl) this.a.t.b(), (errm) this.a.p.b(), (ekmz) this.a.gH.b());
            case 850:
                return new eepu((ExpressiveTextContext) this.a.b.pE.b(), (eepy) this.a.b.pF.b());
            case 851:
                return new ExpressiveTextContext();
            case 852:
                return new eepy();
            case 853:
                return new ddzl();
            case 854:
                return new ddzm();
            case 855:
                dqle dqleVar = new dqle((dwub) this.a.b.a.a.iQ.b());
                Optional optional3 = (Optional) this.a.hV.b();
                akkp akkpVar7 = this.a.b.a.a;
                return new dqsn(dqleVar, optional3, Optional.of(new uid(akkpVar7.f, akkpVar7.di)));
            case 856:
                Context context3 = (Context) this.a.q.b();
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                dqok dqokVar = (dqok) this.a.b.hC.b();
                dqoy dqoyVar = (dqoy) this.a.b.hH.b();
                Optional of3 = Optional.of(new dqoj(null));
                dqrc cL = this.a.b.cL();
                context3.getClass();
                ffskVar.getClass();
                dqokVar.getClass();
                dqoyVar.getClass();
                of3.isPresent();
                of3.get();
                return new dqqw(context3, ffskVar, dqokVar, dqoyVar, cL);
            case 857:
                return new dqrd();
            case 858:
                return new dqqp((Context) this.a.q.b(), this.a.b.cL());
            case 859:
                return new dqvc();
            case 860:
                return new drbd(null);
            case 861:
                akko akkoVar4 = this.a.b;
                return ujt.a(new atul(akkoVar4.a.a.s), akkoVar4.aW());
            case 862:
                String str = uma.a().a;
                Locale locale = Locale.ROOT;
                locale.getClass();
                String lowerCase = "MEDIUM".toLowerCase(locale);
                lowerCase.getClass();
                return new dsey(str, lowerCase);
            case 863:
                return this.a.a.mb().a(new dqii("gif", drcw.a, new drcx(drew.a)));
            case 864:
                return new elew((elbx) this.a.aJ.b());
            case 865:
                return ulz.a(this.a.b.aW());
            case 866:
                return this.a.a.mb().a(new dqii("sticker", dscq.a, new dscr(drey.a)));
            case 867:
                Context context4 = (Context) this.a.q.b();
                errl errlVar5 = (errl) this.a.aK.b();
                engw engwVar = (engw) this.a.a.iV.b();
                dwub dwubVar = (dwub) this.a.a.iQ.b();
                int i2 = engw.d;
                engr engrVar = new engr();
                context4.getClass();
                Context applicationContext = context4.getApplicationContext();
                errlVar5.getClass();
                engrVar.j(engwVar);
                dwubVar.getClass();
                applicationContext.getClass();
                return new dwym(applicationContext, errlVar5, dwubVar, engrVar.g());
            case 868:
                return new ejhh((ebwq) this.a.pd.b(), this.a.a.mv());
            case 869:
                return new ejgz(this.a.a.mv());
            case 870:
                return new cxmc((csmj) this.a.b.le.b(), (cuxz) this.a.kf.b(), (elbx) this.a.aJ.b());
            case 871:
                return new acex(new acfh(this.a.b.a.q), new acez(this.a.b.a.q), new acff(this.a.b.a.q), new acfd(this.a.b.a.q), new acfb(this.a.b.a.q));
            case 872:
                return new czmh(this.a.a.al);
            case 873:
                return new emgr((Context) this.a.q.b());
            case 874:
                akis akisVar12 = this.a;
                return new emhb(akisVar12.b.G(), (Optional) akisVar12.b.qd.b());
            case 875:
                return Optional.of((adak) this.a.b.lP.b());
            case 876:
                return new evcf(this.a.b.qf);
            case 877:
                Context context5 = (Context) this.a.q.b();
                dfbf dfbfVar = new dfbf(new Bundle());
                dfqs dfqsVar = dfbe.a;
                return new dfdt(context5, dfbfVar);
            case 878:
                final fbbf fbbfVar15 = this.a.a.s;
                return new asgw() { // from class: argt
                    @Override // defpackage.asgw
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_auto_app_open_logging");
                    }
                };
            case 879:
                akis akisVar13 = this.a;
                Map dA = akisVar13.b.dA();
                final elbx elbxVar2 = (elbx) akisVar13.aJ.b();
                enhd enhdVar = new enhd();
                for (final Map.Entry entry : ((enhk) dA).entrySet()) {
                    enhdVar.k((String) entry.getKey(), new ffbr() { // from class: elgj
                        @Override // defpackage.ffbr, defpackage.ffbq
                        public final Object b() {
                            Map.Entry entry2 = entry;
                            elas g = elbx.this.g("Create gRPC Service Impl ".concat(String.valueOf((String) entry2.getKey())), elad.a);
                            try {
                                fdxe fdxeVar = (fdxe) ((ffbr) entry2.getValue()).b();
                                g.close();
                                return fdxeVar;
                            } catch (Throwable th) {
                                try {
                                    g.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        }
                    });
                }
                return new evgz(enhdVar.c());
            case 880:
                final spw g = this.a.b.g();
                return new fdxe() { // from class: sqg
                    @Override // defpackage.fdxe
                    public final fedb w() {
                        return fecy.a(spw.this, dfiv.b);
                    }
                };
            case 881:
                final fbbf fbbfVar16 = this.a.a.s;
                return new aspa() { // from class: arun
                    @Override // defpackage.aspa
                    public final boolean a() {
                        return ((ersq) ffbr.this.b()).a("bugle.enable_improved_d2d_for_backup_and_restore");
                    }
                };
            case 882:
                return Long.valueOf(((ekck) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto 45620681").b());
            case 883:
                return Double.valueOf(((ekck) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto 45620682").a());
            case 884:
                return Long.valueOf(((ekck) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto 45620757").b());
            case 885:
                akis akisVar14 = this.a;
                return new sqf(akisVar14.b.qm, (ffsk) akisVar14.a.p.b(), (ffhd) this.a.cP.b(), (dksa) this.a.a.gH.b(), (cqoh) this.a.cz.b());
            case 886:
                akkp akkpVar8 = this.a.a;
                return new sqv(akkpVar8.dt, akkpVar8.qf, (ffsk) akkpVar8.q.b(), this.a.a.LE);
            case 887:
                return Long.valueOf(((ekck) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto 45626505").b());
            case 888:
                return Long.valueOf(((ekck) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto 45633091").b());
            case 889:
                return Long.valueOf(((ekck) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto 45633090").b());
            case 890:
                return Boolean.valueOf(((ekck) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto 45647547").e());
            case 891:
                return Long.valueOf(((ekck) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto 45647766").b());
            case 892:
                akis akisVar15 = this.a;
                return new sql(akisVar15.a.aT, (ffhd) akisVar15.cP.b());
            case 893:
                final akee X = this.a.b.X();
                return new fdxe() { // from class: akeg
                    @Override // defpackage.fdxe
                    public final fedb w() {
                        return fecy.a(akee.this, dfiv.b);
                    }
                };
            case 894:
                akis akisVar16 = this.a;
                return new akef(akisVar16.b.qm, (cqoh) akisVar16.cz.b());
            case 895:
                return Long.valueOf(((ekck) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto 45650000").b());
            case 896:
                return Long.valueOf(((ekck) this.a.a.nF().a.b()).a("com.google.android.apps.messaging.auto 45650002").b());
            case 897:
                return new akek();
            case 898:
                ffhd ffhdVar = (ffhd) this.a.cn.b();
                akis akisVar17 = this.a;
                return new cnqp(ffhdVar, akisVar17.b.cc(), (cqoh) akisVar17.cz.b());
            case 899:
                akis akisVar18 = this.a;
                akkp akkpVar9 = akisVar18.a;
                fbbf fbbfVar17 = akkpVar9.BW;
                fbbf fbbfVar18 = akkpVar9.BT;
                fbbf fbbfVar19 = akkpVar9.BY;
                fbbf fbbfVar20 = akkpVar9.BX;
                fbbf fbbfVar21 = akkpVar9.BZ;
                fbbf fbbfVar22 = akkpVar9.Ca;
                fbbf fbbfVar23 = akkpVar9.Cb;
                fbbf fbbfVar24 = akkpVar9.kh;
                akko akkoVar5 = akisVar18.b;
                akkp akkpVar10 = akkoVar5.a.a;
                clli clliVar = new clli(new cltj(akkpVar10.G), new clkt(), (chco) akkpVar10.wU.b(), akkoVar5.a.a.dM());
                cllj clljVar = new cllj();
                akis akisVar19 = this.a;
                errl errlVar6 = (errl) akisVar19.t.b();
                errl errlVar7 = (errl) this.a.p.b();
                akko akkoVar6 = akisVar19.b;
                return new clgq(fbbfVar17, fbbfVar18, fbbfVar19, fbbfVar20, fbbfVar21, fbbfVar22, fbbfVar23, fbbfVar24, akkoVar5.qB, clliVar, clljVar, akkoVar6.qC, akkoVar6.qD, akkoVar6.qE, akkoVar6.qF, errlVar6, errlVar7);
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        int i = this.b;
        switch (i / 100) {
            case 0:
                return a();
            case 1:
                return c();
            case 2:
                return d();
            case 3:
                return e();
            case 4:
                return f();
            case 5:
                return g();
            case 6:
                return h();
            case 7:
                return i();
            case 8:
                return j();
            default:
                switch (i) {
                    case 900:
                        clls cllsVar = new clls((cqoh) this.a.b.a.cz.b());
                        akis akisVar = this.a.b.a;
                        clie jg = akisVar.a.jg();
                        return new clug(cllsVar, new cluh(jg));
                    case 901:
                        return new cllc(this.a.a.wU);
                    case 902:
                        akkp akkpVar = this.a.a;
                        return new clky(akkpVar.G, akkpVar.wU);
                    case 903:
                        return new clld();
                    case 904:
                        final fbbf fbbfVar = this.a.a.s;
                        return new atsd() { // from class: atpx
                            @Override // defpackage.atsd
                            public final boolean a() {
                                return ((ersq) ffbr.this.b()).a("bugle.remove_on_send_file_over_msrp_completed_slm_cleanup");
                            }
                        };
                    case 905:
                        return new djia();
                    case 906:
                        ambs ambsVar = (ambs) this.a.a.qO.b();
                        cqoh cqohVar = (cqoh) this.a.cz.b();
                        akko akkoVar = this.a.b;
                        Context context = (Context) akkoVar.a.q.b();
                        byzp byzpVar = (byzp) akkoVar.a.a.iy.b();
                        bcwz bcwzVar = (bcwz) akkoVar.a.a.ad.b();
                        akkp akkpVar2 = akkoVar.a.a;
                        fbbf fbbfVar2 = akkpVar2.iP;
                        bcvw bcvwVar = (bcvw) akkpVar2.gB.b();
                        akkp akkpVar3 = akkoVar.a.a;
                        fbbf fbbfVar3 = akkpVar3.dn;
                        aolr aolrVar = (aolr) akkpVar3.Z.b();
                        akis akisVar2 = akkoVar.a;
                        adgd adgdVar = new adgd(context, byzpVar, bcwzVar, fbbfVar2, bcvwVar, fbbfVar3, aolrVar, akisVar2.a.fr, (errl) akisVar2.t.b(), akkoVar.a.a.gQ, akkoVar.qI);
                        akko akkoVar2 = this.a.b;
                        errl errlVar = (errl) akkoVar2.a.t.b();
                        bbeq bbeqVar = (bbeq) akkoVar2.a.a.wW.b();
                        akkp akkpVar4 = akkoVar2.a.a;
                        adeh adehVar = new adeh(errlVar, bbeqVar, akkoVar2.qJ, akkpVar4.mx, akkpVar4.gN, akkpVar4.mu, akkpVar4.Z, akkpVar4.dn, akkpVar4.jG);
                        akis akisVar3 = this.a;
                        akkp akkpVar5 = akisVar3.a;
                        fbbf fbbfVar4 = akkpVar5.dB;
                        fbbf fbbfVar5 = akkpVar5.DG;
                        fbbf fbbfVar6 = akkpVar5.aT;
                        errm errmVar = (errm) akisVar3.t.b();
                        errl errlVar2 = (errl) this.a.aK.b();
                        akis akisVar4 = this.a;
                        fbbf fbbfVar7 = akisVar4.a.jm;
                        errm errmVar2 = (errm) akisVar4.p.b();
                        akis akisVar5 = this.a;
                        adea adeaVar = new adea(akisVar5.b.a.a.az);
                        akkp akkpVar6 = akisVar5.a;
                        fbbf fbbfVar8 = akkpVar6.qT;
                        Object b = akkpVar6.pR.b();
                        akko akkoVar3 = akisVar4.b;
                        return new adfw(ambsVar, cqohVar, adgdVar, adehVar, fbbfVar4, fbbfVar5, akisVar3.b.qK, fbbfVar6, errmVar, errlVar2, fbbfVar7, akkoVar3.qL, akkoVar3.qM, errmVar2, adeaVar, fbbfVar8, (asix) b, this.a.b.qI);
                    case 907:
                        akis akisVar6 = this.a;
                        akkp akkpVar7 = akisVar6.a;
                        return new ayhl(akkpVar7.iN, akkpVar7.dn, akkpVar7.ia, akisVar6.cv, akkpVar7.kr, akkpVar7.ky);
                    case 908:
                        final fbbf fbbfVar9 = this.a.a.s;
                        return new auea() { // from class: audn
                            @Override // defpackage.auea
                            public final boolean a() {
                                return ((ersq) ffbr.this.b()).a("bugle.enable_mapi_conversation_in_external_api");
                            }
                        };
                    case 909:
                        akkp akkpVar8 = this.a.a;
                        return new adap(akkpVar8.D, akkpVar8.fQ, akkpVar8.wi);
                    case 910:
                        akis akisVar7 = this.a;
                        akkp akkpVar9 = akisVar7.a;
                        return new adfx(akkpVar9.dn, akkpVar9.Z, akisVar7.b.qI, akkpVar9.uM);
                    case 911:
                        return new adds((errm) this.a.t.b(), (cbsf) this.a.a.sp.b(), new addw((errl) this.a.b.a.t.b()));
                    case 912:
                        return new cnqs((ffhd) this.a.cn.b(), this.a.b.cc());
                    case 913:
                        final elbx elbxVar = (elbx) this.a.aJ.b();
                        emux emuxVar = emux.a;
                        int i2 = engw.d;
                        engr engrVar = new engr();
                        engrVar.h((fecw) emuxVar.d(new emyl() { // from class: evhi
                            @Override // defpackage.emyl
                            public final Object get() {
                                return new elgo(elbx.this);
                            }
                        }));
                        engw g = engrVar.g();
                        g.getClass();
                        return g;
                    case 914:
                        Context context2 = (Context) this.a.q.b();
                        atjk aL = this.a.b.aL();
                        enip enipVar = sqm.a;
                        context2.getClass();
                        return feex.a(evcv.c(context2, sqm.b), feex.c(context2.getPackageManager(), "com.sec.android.easyMover", sqm.d), aL.a() ? feex.a(feex.b(context2.getPackageManager(), "com.google.android.messagestestapp", eoeg.h.k("103938EE4537E59E8EE792F654504FB8346FC6B346D0BBC4415FC339FCFC8EC1")), feex.b(context2.getPackageManager(), "com.google.communication.testing.bugle.messagetransferhelper", eoeg.h.k("103938EE4537E59E8EE792F654504FB8346FC6B346D0BBC4415FC339FCFC8EC1"))) : feex.b(context2.getPackageManager(), "com.google.android.messagestestapp", eoeg.h.k("103938EE4537E59E8EE792F654504FB8346FC6B346D0BBC4415FC339FCFC8EC1")));
                    case 915:
                        return new acxm(Optional.empty());
                    case 916:
                        Context context3 = (Context) this.a.q.b();
                        akis akisVar8 = this.a;
                        fbbf fbbfVar10 = akisVar8.aK;
                        fbbf fbbfVar11 = akisVar8.a.dj;
                        errl errlVar3 = (errl) fbbfVar10.b();
                        akis akisVar9 = this.a;
                        cfuw cfuwVar = (cfuw) akisVar9.aW.b();
                        akis akisVar10 = this.a;
                        return new RcsStateProvider(context3, fbbfVar11, errlVar3, akisVar9.b.cG, cfuwVar, akisVar10.aP, akisVar10.mK, akisVar10.hk);
                    case 917:
                        Context context4 = (Context) this.a.q.b();
                        akko akkoVar4 = this.a.b;
                        auwm auwmVar = new auwm(akkoVar4.a.a.s);
                        atjk aL2 = akkoVar4.aL();
                        enip enipVar2 = sqm.a;
                        context4.getClass();
                        feey c = evcv.c(context4, sqm.a);
                        feey c2 = feex.c(context4.getPackageManager(), "com.sec.android.easyMover", sqm.d);
                        feey a = aL2.a() ? feex.a(feex.b(context4.getPackageManager(), "com.google.android.messagestestapp", eoeg.h.k("103938EE4537E59E8EE792F654504FB8346FC6B346D0BBC4415FC339FCFC8EC1")), feex.b(context4.getPackageManager(), "com.google.communication.testing.bugle.messagetransferhelper", eoeg.h.k("103938EE4537E59E8EE792F654504FB8346FC6B346D0BBC4415FC339FCFC8EC1"))) : feex.b(context4.getPackageManager(), "com.google.android.messagestestapp", eoeg.h.k("103938EE4537E59E8EE792F654504FB8346FC6B346D0BBC4415FC339FCFC8EC1"));
                        return ((ersq) auwmVar.a.b()).a("bugle.add_retail_demo_data_pop_signature_policy") ? feex.a(c, feex.c(context4.getPackageManager(), "com.google.android.apps.retaildemo.datapop", sqm.c), c2, a) : feex.a(c, c2, a);
                    case 918:
                        return new babu((babf) this.a.a.pN.b(), (cfyt) this.a.a.cf.b(), (asjt) this.a.a.ch.b(), (Context) this.a.q.b(), (errl) this.a.t.b(), (errl) this.a.p.b());
                    case 919:
                        return new adsi((Context) this.a.q.b(), this.a.b.qW);
                    case 920:
                        return new eaiq((dlpw) this.a.l.b(), (eaht) this.a.b.fJ.b(), new easv());
                    case 921:
                        akzt akztVar = (akzt) this.a.a.f.b();
                        Optional optional = (Optional) this.a.a.uP.b();
                        akis akisVar11 = this.a;
                        akko akkoVar5 = akisVar11.b;
                        cfyo bI = akkoVar5.bI();
                        cfxl bH = akkoVar5.bH();
                        akkp akkpVar10 = akisVar11.a;
                        return new clwe(akztVar, optional, bI, bH, akkpVar10.cB, akkpVar10.kb, akisVar11.lR);
                    case 922:
                        return new cbhk((ckds) this.a.a.dp.b());
                    case 923:
                        akzt akztVar2 = (akzt) this.a.a.f.b();
                        cfvu cfvuVar = (cfvu) this.a.a.cr.b();
                        akis akisVar12 = this.a;
                        return new acku(akztVar2, cfvuVar, akisVar12.dQ, (actk) akisVar12.b.u.b(), (acuq) this.a.b.s.b(), (errl) this.a.p.b(), (acjc) this.a.b.t.b(), this.a.b.r);
                    case 924:
                        final fbbf fbbfVar12 = this.a.a.s;
                        return new atsl() { // from class: atqm
                            @Override // defpackage.atsl
                            public final boolean a() {
                                return ((ersq) ffbr.this.b()).a("bugle.use_get_rcs_available_phone_numbers_async_in_tickle_handler");
                            }
                        };
                    case 925:
                        Context context5 = (Context) this.a.q.b();
                        akis akisVar13 = this.a;
                        return new tss(context5, akisVar13.a.pN, (errl) akisVar13.p.b());
                    case 926:
                        Context context6 = (Context) this.a.q.b();
                        ejlk ejlkVar = (ejlk) this.a.ds.b();
                        context6.getClass();
                        ejlkVar.getClass();
                        diag a2 = cvgu.a(ejlkVar);
                        dfqt dfqtVar = diah.a;
                        return new dibp(context6, a2.a());
                    case 927:
                        return new bazd(this.a.b.by());
                    case 928:
                        return new aswz() { // from class: asfx
                        };
                    case 929:
                        final fbbf fbbfVar13 = this.a.a.s;
                        return new avcn() { // from class: avcd
                            @Override // defpackage.avcn
                            public final boolean a() {
                                return ((ersq) ffbr.this.b()).a("bugle.wearable_bind_service_handle_null_bytes");
                            }
                        };
                    case 930:
                        feep feepVar = new feep();
                        feepVar.b();
                        return feepVar.a();
                    default:
                        throw new AssertionError(i);
                }
        }
    }
}
