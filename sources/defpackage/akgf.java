package defpackage;

import android.content.Context;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import j$.util.Optional;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akgf implements fbbf {
    public final akis a;
    public final akgg b;
    private final int c;

    public akgf(akis akisVar, akgg akggVar, int i) {
        this.a = akisVar;
        this.b = akggVar;
        this.c = i;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [ampj, java.lang.Object] */
    private final Object a() {
        int i = this.c;
        switch (i) {
            case 0:
                return new fazv();
            case 1:
                return new ajvm((Context) this.a.q.b(), this.b.bm, this.a.nX);
            case 2:
                return new adza((Context) this.a.q.b(), (crjx) this.a.a.r.b(), fbaz.a(this.b.bl), this.a.cU);
            case 3:
                return new cgag(this.b.M(), (errl) this.a.p.b(), this.a.a.cl());
            case 4:
                akgg akggVar = this.b;
                akis akisVar = this.a;
                fbbf fbbfVar = akisVar.cz;
                amiz i2 = akggVar.i();
                ?? fj = akisVar.fj();
                akkp akkpVar = akisVar.a;
                fbbf fbbfVar2 = akkpVar.wO;
                fbbf fbbfVar3 = akkpVar.mF;
                fbbf fbbfVar4 = akkpVar.id;
                fbbf fbbfVar5 = akkpVar.xe;
                fbbf fbbfVar6 = akkpVar.xf;
                fbbf fbbfVar7 = akkpVar.xm;
                fbbf fbbfVar8 = akkpVar.br;
                cqoh cqohVar = (cqoh) fbbfVar.b();
                errl errlVar = (errl) this.a.p.b();
                errl errlVar2 = (errl) this.a.t.b();
                errl errlVar3 = (errl) this.a.aK.b();
                cbwj cbwjVar = (cbwj) this.a.a.kG.b();
                ckqj ckqjVar = (ckqj) this.b.aj.b();
                akgg akggVar2 = this.b;
                akis akisVar2 = this.a;
                fbbf fbbfVar9 = akggVar2.af;
                akkp akkpVar2 = akisVar2.a;
                fbbf fbbfVar10 = akkpVar2.ia;
                fbbf fbbfVar11 = akkpVar2.pB;
                amsk amskVar = (amsk) fbbfVar9.b();
                akgg akggVar3 = this.b;
                akkp akkpVar3 = this.a.a;
                fbbf fbbfVar12 = akkpVar3.xz;
                fbbf fbbfVar13 = akkpVar3.wL;
                fbbf fbbfVar14 = akkpVar3.xA;
                fbbf fbbfVar15 = akkpVar3.xC;
                fbbf fbbfVar16 = akkpVar3.xE;
                fbbf fbbfVar17 = akkpVar3.xF;
                fbbf fbbfVar18 = akkpVar3.yS;
                fbbf fbbfVar19 = akkpVar3.yT;
                atbw atbwVar = (atbw) akkpVar3.ry.b();
                fbbf fbbfVar20 = this.a.a.yW;
                fbbf fbbfVar21 = akggVar3.an;
                fbbf fbbfVar22 = akggVar3.am;
                fbbf fbbfVar23 = akggVar3.al;
                fbbf fbbfVar24 = akggVar2.ak;
                fbbf fbbfVar25 = akggVar.ai;
                fbbf fbbfVar26 = akggVar.ah;
                fbbf fbbfVar27 = akggVar.ag;
                return new amkx(i2, akggVar.S, fj, fbbfVar2, akggVar.T, akggVar.l, akggVar.V, akggVar.k, fbbfVar3, akggVar.ac, fbbfVar4, fbbfVar27, fbbfVar5, fbbfVar6, fbbfVar26, fbbfVar7, fbbfVar25, fbbfVar8, cqohVar, errlVar, errlVar2, errlVar3, cbwjVar, ckqjVar, fbbfVar24, fbbfVar10, fbbfVar11, amskVar, fbbfVar23, fbbfVar12, fbbfVar13, fbbfVar14, fbbfVar22, fbbfVar15, fbbfVar16, fbbfVar17, fbbfVar18, fbbfVar19, fbbfVar21, atbwVar, fbbfVar20);
            case 5:
                Context context = (Context) this.a.q.b();
                errl errlVar4 = (errl) this.a.p.b();
                errl errlVar5 = (errl) this.a.aK.b();
                akis akisVar3 = this.a;
                arai aw = akisVar3.aw();
                ctbk ctbkVar = (ctbk) akisVar3.hi.b();
                aolr aolrVar = (aolr) this.a.a.Z.b();
                akgg akggVar4 = this.b;
                akis akisVar4 = this.a;
                aqhl o = akggVar4.o();
                aqky aqkyVar = (aqky) akisVar4.a.kp.b();
                akis akisVar5 = this.a;
                akgg akggVar5 = this.b;
                akkp akkpVar4 = akisVar5.a;
                return new aqjw(context, errlVar4, errlVar5, aw, ctbkVar, aolrVar, o, aqkyVar, akkpVar4.lZ, akkpVar4.ma, akkpVar4.mb, akkpVar4.mc, akisVar5.cy, akkpVar4.ib, akkpVar4.ay, akkpVar4.mq, akkpVar4.gX, Optional.of(akggVar5.p()), Optional.of(this.a.a.me), this.a.ho);
            case 6:
                akis akisVar6 = this.a;
                fbbf fbbfVar28 = this.b.c;
                return new aqmh(akisVar6.jl, akisVar6.cP, akisVar6.a.p, akisVar6.jm, akisVar6.cN, (aqvh) fbbfVar28.b(), (cghm) this.a.a.eX.b(), this.a.a.lU);
            case 7:
                aqte aqteVar = (aqte) this.a.a.hA.b();
                this.b.P();
                aqvg.a(aqteVar);
                return aqteVar;
            case 8:
                return new akgd(this);
            case 9:
                return new aqwd(this.b.aA);
            case 10:
                akgg akggVar6 = this.b;
                akis akisVar7 = this.a;
                fbbf fbbfVar29 = akisVar7.hi;
                fbbf fbbfVar30 = akisVar7.t;
                akkp akkpVar5 = akisVar7.a;
                return new aqwo(akggVar6.d, fbbfVar29, fbbfVar30, akkpVar5.cx, fbbg.a(akkpVar5.gR));
            case 11:
                akis akisVar8 = this.a;
                akgg akggVar7 = this.b;
                fbbf fbbfVar31 = akisVar8.cn;
                akkp akkpVar6 = akisVar8.a;
                return new ckac(akkpVar6.gE, akggVar7.c, akggVar7.k, akkpVar6.gO, akkpVar6.G, akkpVar6.bF, akkpVar6.gP, akkpVar6.u, (ffhd) fbbfVar31.b(), (ffhd) this.a.cP.b(), (ffsk) this.a.a.p.b());
            case 12:
                akis akisVar9 = this.a;
                akgg akggVar8 = this.b;
                fbbf fbbfVar32 = akggVar8.e;
                akkp akkpVar7 = akisVar9.a;
                fbbf fbbfVar33 = akkpVar7.aO;
                Optional of = Optional.of(fbbfVar32);
                fbbf fbbfVar34 = akkpVar7.f;
                fbbf fbbfVar35 = akkpVar7.C;
                fbbf fbbfVar36 = akkpVar7.MX;
                fbbf fbbfVar37 = akkpVar7.ab;
                fbbf fbbfVar38 = akkpVar7.fx;
                dtuu dtuuVar = (dtuu) akkpVar7.ay.b();
                akis akisVar10 = this.a;
                fbbf fbbfVar39 = akisVar10.cz;
                fbbf fbbfVar40 = akisVar10.a.ib;
                fbbf fbbfVar41 = akisVar10.mE;
                cqoh cqohVar2 = (cqoh) fbbfVar39.b();
                akis akisVar11 = this.a;
                akgg akggVar9 = this.b;
                akkp akkpVar8 = akisVar11.a;
                return new bdem(fbbfVar33, of, fbbfVar34, fbbfVar35, fbbfVar36, akggVar8.l, fbbfVar37, fbbfVar38, dtuuVar, fbbfVar40, fbbfVar41, cqohVar2, akkpVar8.ej, akkpVar8.Z, akkpVar8.u, akkpVar8.ia, akkpVar8.zw, akkpVar8.G, akkpVar8.MY, akggVar9.az, akkpVar8.L, akkpVar8.Q, akkpVar8.MR, akkpVar8.kv, akkpVar8.Pm, akkpVar8.hJ);
            case 13:
                akis akisVar12 = this.a;
                akkp akkpVar9 = akisVar12.a;
                fbbf fbbfVar42 = akkpVar9.aS;
                fbbf fbbfVar43 = akkpVar9.dQ;
                fbbf fbbfVar44 = akkpVar9.cn;
                Context context2 = (Context) akisVar12.q.b();
                akis akisVar13 = this.a;
                fbbf fbbfVar45 = akisVar13.cz;
                fbbf fbbfVar46 = akisVar13.a.ae;
                cqoh cqohVar3 = (cqoh) fbbfVar45.b();
                akis akisVar14 = this.a;
                fbbf fbbfVar47 = akisVar14.aK;
                akkp akkpVar10 = akisVar14.a;
                fbbf fbbfVar48 = akkpVar10.r;
                errl errlVar6 = (errl) fbbfVar47.b();
                errl errlVar7 = (errl) this.a.t.b();
                errm errmVar = (errm) this.a.p.b();
                akis akisVar15 = this.a;
                akgg akggVar10 = this.b;
                akkp akkpVar11 = akisVar15.a;
                return new debh(fbbfVar42, fbbfVar43, fbbfVar44, context2, fbbfVar46, cqohVar3, fbbfVar48, akkpVar10.Pj, errlVar6, errlVar7, errmVar, Optional.empty(), akggVar10.aw, (cuay) akkpVar11.Jn.b(), this.a.a.Jm);
            case 14:
                return new amet(this.b.g);
            case 15:
                akgg akggVar11 = this.b;
                akis akisVar16 = this.a;
                Map K = akggVar11.K();
                akkp akkpVar12 = akisVar16.a;
                return new amfk(K, akkpVar12.Q, akkpVar12.no, akkpVar12.ld, akkpVar12.hJ);
            case 16:
                return new aprl(this.b.H);
            case 17:
                akis akisVar17 = this.a;
                akgg akggVar12 = this.b;
                akkp akkpVar13 = akisVar17.a;
                return new apin(akkpVar13.p, akggVar12.G, akisVar17.cz, akkpVar13.lh, akkpVar13.ll, akkpVar13.lm, akkpVar13.ln, akkpVar13.lo, akkpVar13.lp, akkpVar13.lq);
            case 18:
                akis akisVar18 = this.a;
                akgg akggVar13 = this.b;
                fbbf fbbfVar49 = akisVar18.p;
                fbbf fbbfVar50 = akisVar18.aK;
                fbbf fbbfVar51 = akisVar18.t;
                akkp akkpVar14 = akisVar18.a;
                return new apsa(fbbfVar49, fbbfVar50, fbbfVar51, akkpVar14.kX, akkpVar14.iy, akkpVar14.kY, akkpVar14.la, akkpVar14.lc, akggVar13.d, akisVar18.iz, akggVar13.p, akkpVar14.Q, akisVar18.cz, akkpVar14.ld, akkpVar14.lb, akkpVar14.kW, akkpVar14.le, akkpVar14.lf, akkpVar14.hH);
            case 19:
                akis akisVar19 = this.a;
                akgg akggVar14 = this.b;
                akkp akkpVar15 = akisVar19.a;
                return new bdmq(akkpVar15.ab, akkpVar15.iy, akggVar14.C, akisVar19.kk, akkpVar15.ib, akggVar14.k, akkpVar15.ay, akggVar14.l, akkpVar15.Kt, akkpVar15.Z, akkpVar15.ad, akkpVar15.pQ, akisVar19.kv, akkpVar15.SV, akkpVar15.pU);
            case 20:
                akis akisVar20 = this.a;
                akgg akggVar15 = this.b;
                fbbf fbbfVar52 = akisVar20.q;
                akkp akkpVar16 = akisVar20.a;
                return new bdpt(fbbfVar52, akkpVar16.ad, akkpVar16.dy, akggVar15.l, akkpVar16.ay);
            case 21:
                Context context3 = (Context) this.a.q.b();
                dtuu dtuuVar2 = (dtuu) this.a.a.ay.b();
                ejvp ejvpVar = (ejvp) this.a.aR.b();
                akgg akggVar16 = this.b;
                akis akisVar21 = this.a;
                return new cbgf(context3, dtuuVar2, ejvpVar, Optional.of(akggVar16.e), akggVar16.F, akisVar21.da, (errl) akisVar21.aK.b(), (errl) this.a.p.b());
            case 22:
                return new cesz(this.a.a.cc);
            case 23:
                return Optional.of((ceww) this.b.z.b());
            case 24:
                return new cewx(this.b.E, this.a.nN);
            case 25:
                akkp akkpVar17 = this.a.a;
                enhd h = enhk.h(206);
                h.k("backup_self_participant", akkpVar17.Gp);
                h.k("block_on_telephony_sync", this.a.a.Gq);
                h.k("cms_backfill_missing_field_work_handler", this.a.a.Gr);
                h.k("cms_backup_validation_work_handler", this.a.a.Gs);
                h.k("cms_batch_backup_foreground", this.a.a.Gt);
                h.k("disable_multi_device_on_server_when_enable_bnr", this.a.a.Gu);
                h.k("cms_local_media_restore", this.a.a.Gw);
                h.k("cms_local_media_restore_requiring_charging", this.a.a.Gx);
                h.k("cms_local_media_restore_requiring_wifi", this.a.a.Gy);
                h.k("cms_local_media_restore_requiring_wifi_and_charging", this.a.a.Gz);
                h.k("cms_local_media_restore_requiring_battery_not_low", this.a.a.GA);
                h.k("cms_local_media_restore_requiring_wifi_and_battery_not_low", this.a.a.GB);
                h.k("cms_media_download_queuer_work_handler", this.a.a.GC);
                h.k("cms_media_upload_queuer_work_handler", this.a.a.GG);
                h.k("cms_initial_sync_media_upload_requiring_battery_not_low", this.a.a.GH);
                h.k("cms_initial_sync_media_upload_requiring_wifi_and_battery_not_low", this.a.a.GI);
                h.k("cms_initial_sync_media_upload_requiring_wifi", this.a.a.GJ);
                h.k("cms_initial_sync_media_upload", this.a.a.GK);
                h.k("cms_initial_sync_media_upload_foreground", this.a.a.GL);
                h.k("cms_initial_sync_media_upload_requiring_battery_not_low_foreground", this.a.a.GM);
                h.k("cms_initial_sync_media_upload_requiring_wifi_and_battery_not_low_foreground", this.a.a.GN);
                h.k("cms_initial_sync_media_upload_requiring_wifi_foreground", this.a.a.GO);
                h.k("cms_incremental_sync_media_upload", this.a.a.GP);
                h.k("cms_incremental_sync_media_upload_requiring_wifi", this.a.a.GQ);
                h.k("cms_set_feature_enabled_on_server", this.a.a.GR);
                h.k("cms_set_initial_sync_status_on_server", this.a.a.GS);
                h.k("cms_restore_page", this.a.a.GT);
                h.k("cms_restore_page_background", this.a.a.GU);
                h.k("cms_restore_page_foreground", this.a.a.GV);
                h.k("conversation_deduping_work", this.a.a.GW);
                h.k("IdentityVerificationPendingMessageHandler", this.a.a.GX);
                h.k("finish_cms_restore_after_message_insertion", this.a.a.GY);
                h.k("insert_new_message_from_cms", this.a.a.He);
                h.k("refresh_cms_server_storage_info", this.a.a.Hf);
                h.k("remove_to_be_delivered_label", this.a.a.Hg);
                h.k("StarAnalyticsWorkerHandler", this.a.a.Hh);
                h.k("turn_on_bnr", this.a.a.Hi);
                h.k("upload_previous_cms_session_ids", this.a.a.Hj);
                h.k("__UNHANDLED_HANDLER", this.a.mW);
                h.k("cms_restore_validation_work_handler", this.a.a.Hk);
                h.k("backup_now_incremental_work_handler", this.a.a.Hl);
                h.k("batch_contacts_import", this.a.a.Ht);
                h.k("batch_deleted_contacts_sync", this.a.a.Hw);
                h.k("clear_session_ids", this.a.a.Hx);
                h.k("contact_recipient_change_sync", this.a.a.HB);
                h.k("contact_recipient_deleted_sync", this.a.a.HC);
                h.k("conversation_latcher", this.a.a.HD);
                h.k("delayed_incremental_work_handler", this.a.a.HE);
                h.k("delete_part_cms_attachment", this.a.a.HF);
                h.k("encrypted_message_delete", this.a.a.HG);
                h.k("end_heavy_work", this.a.a.HJ);
                h.k("expire_wap_push_si_message", this.a.a.HM);
                h.k("fi_multi_sync_grpc", this.a.a.HQ);
                h.k("force_contacts_sync", this.a.a.Ih);
                h.k("gaia_auth_check_result", this.a.a.Ii);
                h.k("add_members_to_rcs_conversation", this.a.a.Im);
                h.k("ari_work_handler", this.a.a.In);
                h.k("attachment_to_telephony_sync", this.a.a.Io);
                h.k("backup_upgraded_mms_group", this.a.a.It);
                h.k("bard_deletion_sender", this.a.a.Iu);
                h.k("block_on_initial_backup_preconditions", this.a.a.Iv);
                h.k("cancel_notification", this.a.a.IE);
                h.k("cancel_rcs_file_transfer", this.a.a.IF);
                h.k("CLASSIFY_MISSING_MESSAGES", this.a.a.IN);
                h.k("CLASSIFY_SPECIFIC_MESSAGES", this.a.a.IO);
                h.k("cleanup_part_uri_handler", this.a.a.IP);
                h.k("cms_back_fill_bnr_state_for_fi_md", this.a.a.IQ);
                h.k("cms_backup", this.a.a.IR);
                h.k("cms_batch_backup", this.a.a.IS);
                h.k("cms_box_copy_multi_device_and_initial_sync_status_on_app_upgrade", this.a.a.IT);
                h.k("cms_check_missing_restore_work_on_app_upgrade", this.a.a.IU);
                h.k("cms_key_sync", this.a.a.IV);
                h.k("cms_multi_device_opt_out", this.a.a.IX);
                h.k("cms_restore_backup_key", this.a.a.IY);
                h.k("cms_restore_conversations", this.a.a.IZ);
                h.k("cms_restore_encryption_key", this.a.a.Ja);
                h.k("cms_restore_messages", this.a.a.Jb);
                h.k("cms_restore_participants", this.a.a.Jc);
                h.k("cms_sync_stale_status_on_app_upgrade", this.a.a.Jd);
                h.k("connect_to_tachyon_anonymously", this.a.a.Je);
                h.k("contact_keys_loader_handler", this.a.a.Jf);
                h.k("conversation_metadata_full_sync", this.a.a.Jj);
                h.k("conversation_thread_id_updater_worker", this.a.a.Jk);
                h.k("create_notification", this.a.a.Jq);
                h.k("create_or_update_lighter_conversation", this.a.a.Js);
                h.k("custom_themes_sender", this.a.a.Jt);
                h.k("data_upgrade", this.a.a.Jy);
                h.k("delete_conversation_handler", this.a.a.JB);
                h.k("delete_parts_work_item", this.a.a.JC);
                h.k("delete_message_from_telephony", this.a.a.JD);
                h.k("delete_message", this.a.a.JF);
                h.k("delete_thread_from_telephony", this.a.a.JG);
                h.k("spam_recheck_handler", this.a.ng);
                h.k("ditto_conversation_retry_handler", this.a.a.JH);
                h.k("ditto_message_retry_handler", this.a.a.JI);
                h.k("ditto_retry_handler", this.a.a.JJ);
                h.k("downgrade_on_unencrypted_message", this.a.a.JL);
                h.k("download_mms", this.a.a.Ke);
                h.k("file_audio_levels", this.a.a.Kf);
                h.k("file_download_completed", this.a.a.Kk);
                h.k("file_download_failed", this.a.a.Km);
                h.k("file_download", this.a.a.Kp);
                h.k("file_transfer_processor", this.a.a.Kq);
                h.k("messaging_file_upload", this.a.a.Ks);
                h.k("forward_sync_batch", this.a.a.Kz);
                h.k("ftd_data_clean_up_work", this.a.a.KA);
                h.k("FtdHandlerWorkItem", this.a.a.KC);
                h.k("rcs_engine_get_single_message", this.a.a.KD);
                h.k("google_photos_api_callback", this.a.a.KE);
                h.k("group_session_start_failed", this.a.a.KF);
                h.k("group_session_started", this.a.a.KG);
                h.k("icing_index_rebuild_handler", this.a.a.KJ);
                h.k("icing_index_rebuild_single_work_handler", this.a.a.KK);
                h.k("icing_index_update_handler", this.a.a.KL);
                h.k("chatapi_incoming_group_notification_list_message", this.a.a.KN);
                h.k("incoming_rbm_message_handler", this.a.a.KO);
                h.k("incoming_rcs_group_invitation", this.a.a.KP);
                h.k("IncrementalReverseSyncWorkItemHandler", this.a.a.KQ);
                h.k("leave_rcs_group_conversation", this.a.a.KR);
                h.k("lighter_incremental_sync", this.a.a.La);
                h.k("log_message_sent_or_received", this.a.a.DO);
                h.k("magic_compose_send_clicked_log_handler", this.a.a.Ld);
                h.k("mark_all_rcs_groups_as_left", this.a.a.Le);
                h.k("mark_as_notified", this.a.a.Lg);
                h.k("mark_failures_as_notified", this.a.a.Lh);
                h.k("MessagesRestoreWorkItemHandler", this.a.a.LP);
                h.k("on_add_user_to_group_chat_complete", this.a.a.LQ);
                h.k("on_create_group_chat_complete", this.a.a.LR);
                h.k("on_remove_user_from_group_chat_complete", this.a.a.LS);
                h.k("on_trigger_chat_group_full_state_update_complete", this.a.nw);
                h.k("PARTICIPANT_BASED_QUICK_CLASSIFICATION", this.a.a.LT);
                h.k("participant_contact_sync", this.a.a.LU);
                h.k("persist_ios_reaction", this.a.a.LV);
                h.k("persist_thumbnail", this.a.a.LW);
                h.k("pipeline_work_handler", this.a.a.LX);
                h.k("post_incoming_message_to_chat_api", this.a.a.Ma);
                h.k("ditto_process_user_alert", this.a.a.Mb);
                h.k("forward_sync_engine", this.a.a.Md);
                h.k("rcs_group_identifiers_telephony_migration", this.a.a.Me);
                h.k("recover_chat_api_to_vanilla_rcs_downgraded_rcs_group", this.a.a.Mf);
                h.k("refresh_incoming_message_notifications", this.a.a.Mg);
                h.k("refresh_message_failure_notification", this.a.a.Mh);
                h.k("remote_user_identity_key_change_handler", this.a.a.Mi);
                h.k("remove_members_from_rcs_conversation", this.a.a.Mj);
                h.k("resizing", this.a.a.Mk);
                h.k("retry_manager", this.a.a.uQ);
                h.k("run_analyze", this.a.a.Ml);
                h.k("chatapi_send_chat_message_response", this.a.a.Bz);
                h.k("smarts_send_message_listener_handler", this.a.a.Mm);
                h.k("soda_file_transcription", this.a.a.Mo);
                h.k("spam_reclassification_handler", this.a.a.Mp);
                h.k("spot_sync", this.a.a.Mq);
                h.k("sync_rcs_groups", this.a.a.Ms);
                h.k("tachygram_add_user_to_group", this.a.a.Mu);
                h.k("tachygram_create_group", this.a.a.Mv);
                h.k("tachygram_get_group_info", this.a.a.Mw);
                h.k("tachygram_inbox_message_retry", this.a.a.Mz);
                h.k("tachygram_remove_user_from_group", this.a.a.MA);
                h.k("tachygram_revoke_message", this.a.a.MB);
                h.k("tachygram_send_message", this.a.a.CG);
                h.k("tachygram_update_group", this.a.a.MC);
                h.k("thumbnail_download_completed", this.a.a.MD);
                h.k("tombstone_manager_on_rcs_group_e2ee_status_change", this.a.a.ME);
                h.k("undelivered_message_fallback", this.a.a.MF);
                h.k("unregister_google_rcs_call", this.a.a.MG);
                h.k("UPDATE_ARCHIVE_STATUS", this.a.a.MH);
                h.k("update_conversation_encryption_status", this.a.a.MI);
                h.k("update_timestamp_in_telephony", this.a.a.MJ);
                h.k("update_unread_counter", this.a.nB);
                h.k("upload_attachments_to_blobstore", this.a.a.MK);
                h.k("vendor_ims_call", this.a.a.ML);
                h.k("EmotifyReactionDatabaseUpdateHandler", this.a.a.MM);
                h.k("TelephonyDatabaseUpdateWorkItemHandler", this.a.a.MP);
                h.k("chatapi_incoming_group_chat_notification_message", this.a.a.Nd);
                h.k("incremental_contacts_import", this.a.a.Ne);
                h.k("load_paged_conversation_timeout_fallback", this.a.a.Np);
                h.k("low_storage", this.a.a.Nr);
                h.k("mark_messages_as_read_handler", this.a.a.Ns);
                h.k("mark_rcs_messages_in_telephony", this.a.a.Nt);
                h.k("otp_deletion_handler", this.a.a.Nx);
                h.k("p13n_work", this.a.a.Ny);
                h.k("parent_allowlist_update", this.a.a.NA);
                h.k("penpal_bot_recipient_restore", this.a.a.NB);
                h.k("penpal_conversation_auto_generate", this.b.j);
                h.k("process_rcs_group_notify", this.b.m);
                h.k("rbm_business_info_retrieval", this.a.a.NE);
                h.k("rbm_chatbot_directory_welcome_message", this.b.n);
                h.k("recover_disabled_rcs_group", this.a.a.NG);
                h.k("request_link_preview", this.b.q);
                h.k("request_smart_suggestions", this.b.r);
                h.k("retrieve_questionnaire", this.b.s);
                h.k("ReverseTelephonySync", this.a.a.NM);
                h.k("chatapi_revoke_chat_message_response", this.b.t);
                h.k("rich_card_media_uri_cleanup", this.b.u);
                h.k("satellite_network_state_updater", this.a.a.NQ);
                h.k("schedule_contacts_import", this.b.w);
                h.k("schedule_delete_and_import_contacts", this.b.y);
                h.k("sim_state_update", this.a.a.On);
                h.k("start_heavy_work", this.b.A);
                h.k("sync_conversation_data_to_wearable", this.a.a.Or);
                h.k("sync_data_to_wearable_app", this.a.a.Os);
                h.k("sync_group_then_encryption_status", this.b.B);
                h.k("UPDATE_MARK_UNREAD", this.a.a.Ow);
                h.k("update_rcs_group_name", this.a.a.Ox);
                h.k("CopyFileTelephonyPartHandler", this.a.a.Oy);
                h.k("cms_drop_unscheduled_item_to_dlq", this.b.D);
                return h.h();
            case 26:
                ffsk ffskVar = (ffsk) this.a.a.q.b();
                akkp akkpVar18 = this.a.a;
                fbbf fbbfVar53 = akkpVar18.my;
                fbbf fbbfVar54 = akkpVar18.sX;
                Optional of2 = Optional.of(new aepm());
                akis akisVar22 = this.a;
                akgg akggVar17 = this.b;
                return new ajco(ffskVar, fbbfVar53, fbbfVar54, of2, akisVar22.a.Z, akggVar17.f, akggVar17.g, akggVar17.c, akggVar17.i, akisVar22.aZ);
            case 27:
                return Optional.of(this.b.g());
            case 28:
                errl errlVar8 = (errl) this.a.p.b();
                errl errlVar9 = (errl) this.a.t.b();
                ckju ckjuVar = (ckju) this.a.a.ky.b();
                dtuu dtuuVar3 = (dtuu) this.a.a.ay.b();
                akis akisVar23 = this.a;
                akgg akggVar18 = this.b;
                fbbf fbbfVar55 = akisVar23.cz;
                fbbf fbbfVar56 = akisVar23.a.ib;
                cqoh cqohVar4 = (cqoh) fbbfVar55.b();
                cbfs cbfsVar = (cbfs) this.a.a.er.b();
                cbvt cbvtVar = (cbvt) this.a.a.pJ.b();
                bdtd bdtdVar = (bdtd) this.a.a.aO.b();
                akgg akggVar19 = this.b;
                return new ckxo(errlVar8, errlVar9, ckjuVar, dtuuVar3, fbbfVar56, akggVar18.k, cqohVar4, cbfsVar, cbvtVar, bdtdVar, akggVar19.A(), (cbgf) akggVar19.l.b(), (akzt) this.a.a.f.b(), this.a.kk);
            case 29:
                byzp byzpVar = (byzp) this.a.a.iy.b();
                bavs bavsVar = (bavs) this.a.a.tF.b();
                akkp akkpVar19 = this.a.a;
                fbbf fbbfVar57 = akkpVar19.ib;
                fbbf fbbfVar58 = akkpVar19.pQ;
                fbbf fbbfVar59 = akkpVar19.BF;
                dtuu dtuuVar4 = (dtuu) akkpVar19.ay.b();
                akis akisVar24 = this.a;
                akgg akggVar20 = this.b;
                akkp akkpVar20 = akisVar24.a;
                fbbf fbbfVar60 = akkpVar20.dp;
                fbbf fbbfVar61 = akisVar24.iz;
                return new cerv(byzpVar, bavsVar, fbbfVar57, fbbfVar58, fbbfVar59, dtuuVar4, akisVar24.aR, akggVar20.l, fbbfVar60, fbbfVar61, (cqoh) this.a.cz.b());
            case 30:
                errl errlVar10 = (errl) this.a.t.b();
                akgg akggVar21 = this.b;
                return new bdwz(errlVar10, akggVar21.o, akggVar21.p, (bdwr) this.a.a.rn.b(), (cbvt) this.a.a.pJ.b(), (bdtd) this.a.a.aO.b(), (cqoh) this.a.cz.b(), (cbgf) this.b.l.b(), (bdvi) this.a.a.jh.b(), (ahor) this.a.a.ii.b(), (ecrj) this.a.cN.b());
            case 31:
                return new bdvu((dtuu) this.a.a.ay.b(), this.b.l);
            case 32:
                bauu bauuVar = (bauu) this.a.a.ud.b();
                barw barwVar = (barw) this.a.a.tQ.b();
                akis akisVar25 = this.a;
                fbbf fbbfVar62 = akisVar25.a.nj;
                errm errmVar2 = (errm) akisVar25.t.b();
                akgg akggVar22 = this.b;
                akis akisVar26 = this.a;
                return new ctss(bauuVar, barwVar, fbbfVar62, errmVar2, akggVar22.p, akisVar26.a.nr, (cqoh) akisVar26.cz.b());
            case 33:
                ffsk ffskVar2 = (ffsk) this.a.a.q.b();
                cnnh cnnhVar = (cnnh) this.a.a.bQ.b();
                bdjr bdjrVar = (bdjr) this.a.a.pQ.b();
                akkp akkpVar21 = this.a.a;
                cnro jP = akkpVar21.jP();
                cnqv jO = akkpVar21.jO();
                bdtd bdtdVar2 = (bdtd) akkpVar21.aO.b();
                akkp akkpVar22 = this.a.a;
                cnvr jS = akkpVar22.jS();
                Optional of3 = Optional.of((cpdd) akkpVar22.jo.b());
                akis akisVar27 = this.a;
                akgg akggVar23 = this.b;
                akkp akkpVar23 = akisVar27.a;
                fbbf fbbfVar63 = akkpVar23.fP;
                fbbf fbbfVar64 = akkpVar23.NJ;
                fbbf fbbfVar65 = akkpVar23.NK;
                cnnv C = akggVar23.C();
                aolr aolrVar2 = (aolr) akkpVar23.Z.b();
                cnvc cnvcVar = (cnvc) this.a.a.mH.b();
                akis akisVar28 = this.a;
                akgg akggVar24 = this.b;
                akkp akkpVar24 = akisVar28.a;
                return new cnsm(ffskVar2, cnnhVar, bdjrVar, jP, jO, bdtdVar2, jS, of3, fbbfVar63, fbbfVar64, fbbfVar65, C, aolrVar2, cnvcVar, akkpVar24.ay, akggVar24.E(), akkpVar24.fs, (asmj) akkpVar24.jD.b(), this.a.a.jF);
            case 34:
                return new awqv(this.b.r(), (cfyt) this.a.a.cf.b());
            case 35:
                return new cblv((errl) this.a.t.b(), (cbgf) this.b.l.b());
            case 36:
                ffsk ffskVar3 = (ffsk) this.a.a.p.b();
                cbwj cbwjVar2 = (cbwj) this.a.a.kG.b();
                comc comcVar = (comc) this.a.a.HR.b();
                axwk axwkVar = (axwk) this.a.a.mo.b();
                akgg akggVar25 = this.b;
                akis akisVar29 = this.a;
                axzk q = akggVar25.q();
                aybz aybzVar = (aybz) akisVar29.a.Ig.b();
                akkp akkpVar25 = this.a.a;
                return new ayar(ffskVar3, cbwjVar2, comcVar, axwkVar, q, aybzVar, akkpVar25.ej, akkpVar25.al, akkpVar25.mj, akkpVar25.ml, akkpVar25.Hs);
            case 37:
                ffsk ffskVar4 = (ffsk) this.a.a.p.b();
                ffhd ffhdVar = (ffhd) this.a.cP.b();
                cbwj cbwjVar3 = (cbwj) this.a.a.kG.b();
                comc comcVar2 = (comc) this.a.a.HR.b();
                akgg akggVar26 = this.b;
                akis akisVar30 = this.a;
                akkp akkpVar26 = akisVar30.a;
                return new ayba(ffskVar4, ffhdVar, cbwjVar3, comcVar2, akggVar26.x, akkpVar26.al, akisVar30.cN, akkpVar26.Hu, akkpVar26.Hs, akkpVar26.mn);
            case 38:
                return new axzq(this.a.a.cc);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return new cflt((ffsk) this.a.a.q.b(), enip.q(), (cfkw) this.a.a.HH.b(), (cflm) this.a.a.HI.b(), (ceww) this.b.z.b(), (cbwj) this.a.a.kG.b(), (cevh) this.a.a.cc.b());
            case 40:
                akis akisVar31 = this.a;
                akgg akggVar27 = this.b;
                akkp akkpVar27 = akisVar31.a;
                return new cain(akkpVar27.kN, akkpVar27.sU, akkpVar27.ib, akggVar27.k, akkpVar27.gx, akkpVar27.Ou, akkpVar27.Z, akisVar31.cz, (ffsk) akkpVar27.aq.b(), (ffsk) this.a.a.q.b());
            case 41:
                return new cdfh((ffsk) this.a.a.q.b(), (ffhd) this.a.co.b(), (axkm) this.a.a.ck.b(), (babm) this.a.a.wl.b(), this.b.u(), Optional.empty(), (axdf) this.a.a.cm.b(), (akzt) this.a.a.f.b());
            case 42:
                akis akisVar32 = this.a;
                return new aple(akisVar32.a.aq, this.b.h, akisVar32.cz, akisVar32.hi);
            case 43:
                return new apli(this.b.P);
            case 44:
                akgg akggVar28 = this.b;
                return new aobd(akggVar28.M, akggVar28.O);
            case 45:
                return new aoaz(this.b.L, this.a.a.yZ);
            case 46:
                akis akisVar33 = this.a;
                akgg akggVar29 = this.b;
                akkp akkpVar28 = akisVar33.a;
                return new anyg(akkpVar28.p, akisVar33.hi, akisVar33.iE, akkpVar28.nn, akkpVar28.np, akggVar29.K, akkpVar28.nr);
            case 47:
                return new ctrg((ffhd) this.a.co.b(), (ffhd) this.a.cP.b(), this.b.F(), (cqoh) this.a.cz.b());
            case 48:
                return new aobb(this.b.N, this.a.a.yZ);
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                akis akisVar34 = this.a;
                akgg akggVar30 = this.b;
                fbbf fbbfVar66 = akisVar34.q;
                akkp akkpVar29 = akisVar34.a;
                return new anyz(fbbfVar66, akkpVar29.p, akisVar34.hi, akisVar34.iE, akkpVar29.nn, akkpVar29.np, akggVar30.K, akkpVar29.nr);
            case 50:
                return new cnsb(this.b.D(), (ffhd) this.a.co.b(), (ffsk) this.a.a.q.b());
            case 51:
                return new akge(this);
            case 52:
                ffhd ffhdVar2 = (ffhd) this.a.cP.b();
                ffsk ffskVar5 = (ffsk) this.a.a.p.b();
                cqoh cqohVar5 = (cqoh) this.a.cz.b();
                amhs amhsVar = (amhs) this.b.h.b();
                akgg akggVar31 = this.b;
                akis akisVar35 = this.a;
                avkj avkjVar = (avkj) akisVar35.a.jf.b();
                ayif ayifVar = (ayif) this.a.a.ia.b();
                akis akisVar36 = this.a;
                fbbf fbbfVar67 = akisVar36.cN;
                fbbf fbbfVar68 = akisVar36.a.ky;
                ecrj ecrjVar = (ecrj) fbbfVar67.b();
                akkp akkpVar30 = this.a.a;
                fbbf fbbfVar69 = akkpVar30.kI;
                fbbf fbbfVar70 = akkpVar30.Q;
                fbbf fbbfVar71 = akkpVar30.kv;
                akkpVar30.dJ();
                return new amlt(ffhdVar2, ffskVar5, cqohVar5, amhsVar, akggVar31.f, akisVar35.aZ, avkjVar, ayifVar, fbbfVar68, ecrjVar, fbbfVar69, fbbfVar70, fbbfVar71, this.a.a.cr());
            case 53:
                akis akisVar37 = this.a;
                akgg akggVar32 = this.b;
                return new bafp(akisVar37.cz, akggVar32.U, akggVar32.c, akisVar37.p);
            case 54:
                errl errlVar11 = (errl) this.a.aK.b();
                errl errlVar12 = (errl) this.a.p.b();
                errl errlVar13 = (errl) this.a.t.b();
                fazb a = fbaz.a(this.a.a.pJ);
                akis akisVar38 = this.a;
                akgg akggVar33 = this.b;
                akkp akkpVar31 = akisVar38.a;
                fbbf fbbfVar72 = akkpVar31.ib;
                ctvb ctvbVar = (ctvb) akkpVar31.u.b();
                bdtd bdtdVar3 = (bdtd) this.a.a.aO.b();
                cbgf cbgfVar = (cbgf) this.b.l.b();
                dtuu dtuuVar5 = (dtuu) this.a.a.ay.b();
                bcvw bcvwVar = (bcvw) this.a.a.gB.b();
                Optional of4 = Optional.of((cpdd) this.a.a.jo.b());
                avkj avkjVar2 = (avkj) this.a.a.jf.b();
                akkp akkpVar32 = this.a.a;
                fbbf fbbfVar73 = akkpVar32.G;
                aolr aolrVar3 = (aolr) this.a.a.Z.b();
                ayif ayifVar2 = (ayif) this.a.a.ia.b();
                akis akisVar39 = this.a;
                fbbf fbbfVar74 = akisVar39.cN;
                akkp akkpVar33 = akisVar39.a;
                fbbf fbbfVar75 = akkpVar33.ky;
                fbbf fbbfVar76 = akkpVar33.lY;
                ecrj ecrjVar2 = (ecrj) fbbfVar74.b();
                akkp akkpVar34 = this.a.a;
                return new ammv(errlVar11, errlVar12, errlVar13, a, fbbfVar72, akggVar33.k, ctvbVar, bdtdVar3, cbgfVar, dtuuVar5, bcvwVar, of4, avkjVar2, fbbfVar73, aolrVar3, ayifVar2, fbbfVar75, fbbfVar76, ecrjVar2, akkpVar34.Q, (asmj) akkpVar34.jD.b(), this.a.a.jF);
            case 55:
                akis akisVar40 = this.a;
                akgg akggVar34 = this.b;
                akkp akkpVar35 = akisVar40.a;
                fbbf fbbfVar77 = akkpVar35.ib;
                fbbf fbbfVar78 = akkpVar35.ip;
                fbbf fbbfVar79 = akkpVar35.id;
                fbbf fbbfVar80 = akkpVar35.Z;
                fbbf fbbfVar81 = akkpVar35.xb;
                dtuu dtuuVar6 = (dtuu) akkpVar35.ay.b();
                akgg akggVar35 = this.b;
                akis akisVar41 = this.a;
                fbbf fbbfVar82 = akisVar41.co;
                fbbf fbbfVar83 = akisVar41.a.im;
                ffhd ffhdVar3 = (ffhd) fbbfVar82.b();
                ffsk ffskVar6 = (ffsk) this.a.a.q.b();
                fbbf fbbfVar84 = akggVar35.aa;
                fbbf fbbfVar85 = akggVar35.ab;
                return new crsa(fbbfVar77, akggVar34.k, fbbfVar78, akggVar34.Z, fbbfVar79, fbbfVar80, akggVar34.f, fbbfVar81, dtuuVar6, fbbfVar84, fbbfVar85, fbbfVar83, ffhdVar3, ffskVar6);
            case 56:
                akis akisVar42 = this.a;
                akgg akggVar36 = this.b;
                akkp akkpVar36 = akisVar42.a;
                fbbf fbbfVar86 = akkpVar36.iw;
                croc crocVar = (croc) akkpVar36.id.b();
                akis akisVar43 = this.a;
                akgg akggVar37 = this.b;
                akkp akkpVar37 = akisVar43.a;
                fbbf fbbfVar87 = akkpVar37.ib;
                fbbf fbbfVar88 = akkpVar37.iq;
                fbbf fbbfVar89 = akkpVar37.xb;
                dtuu dtuuVar7 = (dtuu) akkpVar37.ay.b();
                akis akisVar44 = this.a;
                return new cucf(fbbfVar86, akggVar36.X, akggVar36.Y, crocVar, fbbfVar87, akggVar37.k, fbbfVar88, fbbfVar89, dtuuVar7, akisVar44.a.f22io, akisVar44.hB);
            case 57:
                Context context4 = (Context) this.a.q.b();
                akis akisVar45 = this.a;
                akgg akggVar38 = this.b;
                akkp akkpVar38 = akisVar45.a;
                return new cujh(context4, akkpVar38.nT, akggVar38.p, akkpVar38.ib, akkpVar38.ia, akkpVar38.CT, akkpVar38.iy, akkpVar38.aO, akkpVar38.Z, akggVar38.W, akkpVar38.ft, (ffsk) akkpVar38.aq.b());
            case 58:
                Context context5 = (Context) this.a.q.b();
                cuiw cuiwVar = new cuiw();
                akis akisVar46 = this.a;
                akgg akggVar39 = this.b;
                fbbf fbbfVar90 = akisVar46.iz;
                akkp akkpVar39 = akisVar46.a;
                return new cuiv(context5, cuiwVar, fbbfVar90, akkpVar39.nH, akisVar46.hd, akisVar46.iq, akkpVar39.nK, akggVar39.d, akkpVar39.br);
            case 59:
                akgg akggVar40 = this.b;
                akis akisVar47 = this.a;
                akkp akkpVar40 = akisVar47.a;
                fbbf fbbfVar91 = akkpVar40.nH;
                fbbf fbbfVar92 = akkpVar40.Bu;
                fbbf fbbfVar93 = akkpVar40.G;
                fbbf fbbfVar94 = akkpVar40.aO;
                errl errlVar14 = (errl) akisVar47.t.b();
                errl errlVar15 = (errl) this.a.p.b();
                akkp akkpVar41 = this.a.a;
                return new cuse(akggVar40.p, akggVar40.k, fbbfVar91, fbbfVar92, fbbfVar93, fbbfVar94, akggVar40.d, errlVar14, errlVar15, akkpVar41.br, akkpVar41.CW);
            case 60:
                return new crsg(this.b.k);
            case 61:
                akis akisVar48 = this.a;
                akgg akggVar41 = this.b;
                akkp akkpVar42 = akisVar48.a;
                return new crsl(akkpVar42.ib, akggVar41.k, akggVar41.p, akggVar41.c, akkpVar42.Z, (ffsk) akkpVar42.q.b());
            case 62:
                akis akisVar49 = this.a;
                akgg akggVar42 = this.b;
                fbbf fbbfVar95 = akisVar49.hi;
                fbbf fbbfVar96 = akisVar49.q;
                fbbf fbbfVar97 = akisVar49.p;
                fbbf fbbfVar98 = akisVar49.aK;
                fbbf fbbfVar99 = akisVar49.iE;
                akkp akkpVar43 = akisVar49.a;
                return new amhp(fbbfVar95, fbbfVar96, fbbfVar97, fbbfVar98, fbbfVar99, akggVar42.c, akggVar42.af, akkpVar43.Z, akkpVar43.mL, akkpVar43.Q, akkpVar43.le, akggVar42.f, akkpVar43.bR, akkpVar43.mM, akkpVar43.lW, akkpVar43.mO, akkpVar43.mN);
            case 63:
                akgg akggVar43 = this.b;
                akis akisVar50 = this.a;
                akkp akkpVar44 = akisVar50.a;
                return new amsk(akggVar43.ae, akkpVar44.mC, akkpVar44.aq, akkpVar44.q, akisVar50.jq, akisVar50.jr);
            case 64:
                akis akisVar51 = this.a;
                akgg akggVar44 = this.b;
                akkp akkpVar45 = akisVar51.a;
                return new amtb(akkpVar45.p, akkpVar45.q, akisVar51.hi, akisVar51.iE, akggVar44.ad, akkpVar45.G, akkpVar45.kP);
            case 65:
                return Optional.of(this.b.y());
            case 66:
                errl errlVar16 = (errl) this.a.aK.b();
                errl errlVar17 = (errl) this.a.p.b();
                akgg akggVar45 = this.b;
                akkp akkpVar46 = this.a.a;
                return new amui(errlVar16, errlVar17, akggVar45.k, akggVar45.l, akkpVar46.iF, akkpVar46.xg);
            case 67:
                akis akisVar52 = this.a;
                akgg akggVar46 = this.b;
                akkp akkpVar47 = akisVar52.a;
                return enip.v(akkpVar47.ay(), akkpVar47.ln(), akggVar46.j(), akkpVar47.jN(), akkpVar47.aA(), akkpVar47.C(), akggVar46.B(), this.b.f(), akis.iV(), this.a.a.aB());
            case 68:
                return new ckqj(this.a.a.cc);
            case 69:
                return Optional.of(this.b.k());
            case 70:
                ffsk ffskVar7 = (ffsk) this.a.a.aq.b();
                ffsk ffskVar8 = (ffsk) this.a.a.q.b();
                akkp akkpVar48 = this.a.a;
                fbbf fbbfVar100 = akkpVar48.xp;
                avkj avkjVar3 = (avkj) akkpVar48.jf.b();
                cktv cktvVar = (cktv) this.a.a.xq.b();
                akgg akggVar47 = this.b;
                akis akisVar53 = this.a;
                amvj l = akggVar47.l();
                cktw cktwVar = (cktw) akisVar53.a.xv.b();
                akis akisVar54 = this.a;
                fbbf fbbfVar101 = akisVar54.cz;
                alja ap = akisVar54.a.ap();
                cqoh cqohVar6 = (cqoh) fbbfVar101.b();
                akkp akkpVar49 = this.a.a;
                return new amut(ffskVar7, ffskVar8, fbbfVar100, avkjVar3, cktvVar, l, cktwVar, ap, cqohVar6, akkpVar49.xr, akkpVar49.C);
            case 71:
                ffsk ffskVar9 = (ffsk) this.a.a.p.b();
                ffhd ffhdVar4 = (ffhd) this.a.co.b();
                akis akisVar55 = this.a;
                return new amih(ffskVar9, ffhdVar4, akisVar55.cz, akisVar55.a.jh, (ckqj) this.b.aj.b());
            case 72:
                return new enpx(this.b.s());
            case 73:
                akis akisVar56 = this.a;
                akgg akggVar48 = this.b;
                akkp akkpVar50 = akisVar56.a;
                return new amyj(akkpVar50.p, akkpVar50.aq, akisVar56.hi, akisVar56.iE, akggVar48.ao);
            case 74:
                ejvb ejvbVar = (ejvb) this.a.dy.b();
                akis akisVar57 = this.a;
                dtuu dtuuVar8 = (dtuu) akisVar57.a.ay.b();
                akis akisVar58 = this.a;
                akgg akggVar49 = this.b;
                akkp akkpVar51 = akisVar58.a;
                return new avjw(ejvbVar, akisVar57.cz, dtuuVar8, akkpVar51.rq, akkpVar51.vL, akkpVar51.eT, akggVar49.f, akkpVar51.ld, (atky) akkpVar51.rs.b(), (ffsk) this.a.a.q.b());
            case 75:
                return new amxw(this.a.a.q, this.b.aq);
            case 76:
                return new ampf(this.a.a.zj, this.b.g);
            case 77:
                return new apxn(this.b.at);
            case 78:
                return new anwt(this.b.as);
            case 79:
                akis akisVar59 = this.a;
                akgg akggVar50 = this.b;
                akkp akkpVar52 = akisVar59.a;
                return new aoaj(akkpVar52.p, akkpVar52.aq, akisVar59.hi, akggVar50.N, akkpVar52.nx, akkpVar52.ny);
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                return new amvu(this.a.a.q, this.b.aq);
            case 81:
                akis akisVar60 = this.a;
                akgg akggVar51 = this.b;
                akkp akkpVar53 = akisVar60.a;
                return new bczv(akkpVar53.ay, akggVar51.ay, (ffsk) akkpVar53.p.b());
            case 82:
                akgg akggVar52 = this.b;
                return enip.r(akggVar52.t(), akggVar52.x());
            case 83:
                akis akisVar61 = this.a;
                akgg akggVar53 = this.b;
                akkp akkpVar54 = akisVar61.a;
                return new aqyi(akkpVar54.bC, akkpVar54.bF, akkpVar54.hd, akkpVar54.he, akggVar53.aC);
            case 84:
                akis akisVar62 = this.a;
                akgg akggVar54 = this.b;
                akkp akkpVar55 = akisVar62.a;
                return new aqyr(akkpVar55.G, akkpVar55.gE, akkpVar55.Z, akggVar54.d, akkpVar55.gU);
            case 85:
                akis akisVar63 = this.a;
                akgg akggVar55 = this.b;
                akkp akkpVar56 = akisVar63.a;
                return new aqya(akkpVar56.fu, akkpVar56.fM, akggVar55.aF, (Context) akisVar63.q.b());
            case 86:
                akgg akggVar56 = this.b;
                akis akisVar64 = this.a;
                akkp akkpVar57 = akisVar64.a;
                return new batz(akggVar56.k, akkpVar57.fs, akkpVar57.hv, akkpVar57.c, akkpVar57.u, akkpVar57.ds, akkpVar57.di, akkpVar57.hw, akkpVar57.hx, akggVar56.l, akkpVar57.ay, akkpVar57.Z, akisVar64.q);
            case 87:
                this.b.Q();
                aoye aoyeVar = (aoye) this.b.bh.b();
                aozh.a(aoyeVar);
                return aoyeVar;
            case 88:
                ffsk ffskVar10 = (ffsk) this.a.a.p.b();
                akis akisVar65 = this.a;
                return new apbl(ffskVar10, akisVar65.in, akisVar65.jt, (aoye) this.b.bh.b(), this.b.ba);
            case 89:
                akis akisVar66 = this.a;
                akgg akggVar57 = this.b;
                fbbf fbbfVar102 = akisVar66.hi;
                fbbf fbbfVar103 = akisVar66.p;
                fbbf fbbfVar104 = akisVar66.t;
                akkp akkpVar58 = akisVar66.a;
                return new aoye(fbbfVar102, fbbfVar103, fbbfVar104, akisVar66.aK, akggVar57.aQ, akggVar57.aZ, akkpVar58.qZ, akkpVar58.ra, akggVar57.ba, akkpVar58.ro, akkpVar58.rL, akisVar66.kp, akisVar66.kq, akkpVar58.rT, akisVar66.jt, akggVar57.aT, akisVar66.hu, akggVar57.bb, akkpVar58.pw, akisVar66.jS, akkpVar58.iF, akkpVar58.rV, akggVar57.bd, akkpVar58.sc, akkpVar58.gp, akkpVar58.sd, akisVar66.ku, akkpVar58.sf, akkpVar58.jU, akkpVar58.sj, akkpVar58.sk, akkpVar58.so, akggVar57.aW, akkpVar58.st, akisVar66.cz, akggVar57.be, akkpVar58.hI, akisVar66.ky, akkpVar58.sw, akisVar66.ko, akkpVar58.sy, akisVar66.kz, akkpVar58.sz, akkpVar58.ng, akkpVar58.sB, akkpVar58.hh, akggVar57.bf, akisVar66.kA, akkpVar58.sD, akkpVar58.sE, akggVar57.bg);
            case 90:
                akis akisVar67 = this.a;
                akgg akggVar58 = this.b;
                akkp akkpVar59 = akisVar67.a;
                return new apfv(akisVar67.p, akisVar67.hu, akkpVar59.mR, akggVar58.aJ, akggVar58.G, akggVar58.aN, akggVar58.aP, fbbg.a(akisVar67.cz), akkpVar59.nM);
            case 91:
                akis akisVar68 = this.a;
                akgg akggVar59 = this.b;
                akkp akkpVar60 = akisVar68.a;
                return new apgz(akisVar68.hi, akisVar68.p, akisVar68.t, akkpVar60.mK, akisVar68.aO, akkpVar60.Q, akkpVar60.mJ, akggVar59.f, akkpVar60.mS, fbbg.a(akggVar59.aH), akkpVar60.mV, akkpVar60.lW, akkpVar60.mW, akkpVar60.mX, akggVar59.aI, akkpVar60.mZ);
            case 92:
                errl errlVar18 = (errl) this.a.aK.b();
                akgg akggVar60 = this.b;
                akis akisVar69 = this.a;
                return new amib(errlVar18, akggVar60.h, akisVar69.a.fP, akisVar69.cz);
            case 93:
                return new amna(this.b.h, (ffsk) this.a.a.p.b());
            case 94:
                akis akisVar70 = this.a;
                akgg akggVar61 = this.b;
                akkp akkpVar61 = akisVar70.a;
                return new aoam(akkpVar61.ld, akggVar61.aK, akggVar61.as, akisVar70.cP, akggVar61.L, akggVar61.N, akggVar61.aL, akggVar61.aM, akkpVar61.nr, akkpVar61.nF, akkpVar61.p);
            case 95:
                akis akisVar71 = this.a;
                akgg akggVar62 = this.b;
                akkp akkpVar62 = akisVar71.a;
                return new anzv(akkpVar62.p, akkpVar62.aq, akisVar71.hi, akggVar62.L, akkpVar62.nt, akkpVar62.nu);
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                akis akisVar72 = this.a;
                return new anxe(akisVar72.a.p, akisVar72.hi, akisVar72.iE, this.b.K);
            case 97:
                akis akisVar73 = this.a;
                return new anxn(akisVar73.a.p, akisVar73.hi, akisVar73.iE, this.b.K);
            case 98:
                akgg akggVar63 = this.b;
                akis akisVar74 = this.a;
                akkp akkpVar63 = akisVar74.a;
                return new aply(akggVar63.aO, akkpVar63.nK, akkpVar63.p, akisVar74.co, akisVar74.cz, akkpVar63.la);
            case 99:
                akis akisVar75 = this.a;
                fbbf fbbfVar105 = akisVar75.fM;
                couo couoVar = (couo) akisVar75.a.nH.b();
                akis akisVar76 = this.a;
                akgg akggVar64 = this.b;
                cozz cv = akisVar76.cv();
                akkp akkpVar64 = akisVar76.a;
                return new cpaa(fbbfVar105, couoVar, cv, akggVar64.d, akkpVar64.br, akkpVar64.gE);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object c() {
        int i = this.c;
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                akgg akggVar = this.b;
                akis akisVar = this.a;
                return new aqbp(akggVar.aT, akisVar.a.fP, akggVar.aW, akggVar.aY, akisVar.p);
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                akis akisVar2 = this.a;
                akgg akggVar2 = this.b;
                akkp akkpVar = akisVar2.a;
                fbbf fbbfVar = akkpVar.nS;
                fbbf fbbfVar2 = akkpVar.nT;
                fbbf fbbfVar3 = akkpVar.iy;
                fbbf fbbfVar4 = akkpVar.pE;
                fbbf fbbfVar5 = akkpVar.pS;
                fbbf fbbfVar6 = akkpVar.iF;
                errl errlVar = (errl) akisVar2.t.b();
                akgg akggVar3 = this.b;
                akkp akkpVar2 = this.a.a;
                return new amca(fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, akggVar2.aR, fbbfVar5, fbbfVar6, errlVar, akggVar3.aS, akkpVar2.c);
            case 102:
                akis akisVar3 = this.a;
                akgg akggVar4 = this.b;
                akkp akkpVar3 = akisVar3.a;
                return new bauy(akkpVar3.Z, akggVar4.p, akggVar4.d, akkpVar3.aO, akisVar3.cz, akkpVar3.pH, akkpVar3.fP, akkpVar3.dE, akkpVar3.pI, akkpVar3.qJ, akkpVar3.fr, akkpVar3.pP, akkpVar3.ck, akkpVar3.qL, akisVar3.p, akkpVar3.Q, akkpVar3.pf, akkpVar3.pD, akkpVar3.cj, akkpVar3.ci);
            case 103:
                return new amcq(this.a.a.cc);
            case 104:
                return Optional.of((coja) this.b.aV.b());
            case 105:
                cqoh cqohVar = (cqoh) this.a.cz.b();
                errl errlVar2 = (errl) this.a.t.b();
                errl errlVar3 = (errl) this.a.p.b();
                akgg akggVar5 = this.b;
                akis akisVar4 = this.a;
                fbbf fbbfVar7 = akisVar4.aR;
                akkp akkpVar4 = akisVar4.a;
                fbbf fbbfVar8 = akkpVar4.iy;
                fbbf fbbfVar9 = akkpVar4.ad;
                ejvp ejvpVar = (ejvp) fbbfVar7.b();
                aktq aktqVar = (aktq) this.a.kc.b();
                akgg akggVar6 = this.b;
                akis akisVar5 = this.a;
                akkp akkpVar5 = akisVar5.a;
                return new aksw(cqohVar, errlVar2, errlVar3, akggVar5.aT, fbbfVar8, fbbfVar9, ejvpVar, aktqVar, akggVar6.aU, akkpVar5.qQ, akkpVar5.qR, akkpVar5.qS, akkpVar5.aO, akisVar5.bC(), akggVar6.C, akggVar6.p, akggVar6.k);
            case 106:
                errl errlVar4 = (errl) this.a.t.b();
                akis akisVar6 = this.a;
                fbbf fbbfVar10 = akisVar6.cz;
                fbbf fbbfVar11 = akisVar6.a.hv;
                cqoh cqohVar2 = (cqoh) fbbfVar10.b();
                akgg akggVar7 = this.b;
                akkp akkpVar6 = this.a.a;
                return new akrr(errlVar4, fbbfVar11, cqohVar2, akggVar7.l, akkpVar6.ad, (dtuu) akkpVar6.ay.b(), this.a.a.pQ);
            case 107:
                return enip.r(this.a.a.iK(), this.b.m());
            case 108:
                return new anzg(this.a.a.cc);
            case 109:
                return Optional.of(this.b.n());
            case 110:
                return new aouh(this.b.f);
            case 111:
                akgg akggVar8 = this.b;
                return new apqz(akggVar8.bc, this.a.a.pE, akggVar8.aR);
            case 112:
                akis akisVar7 = this.a;
                akgg akggVar9 = this.b;
                fbbf fbbfVar12 = akisVar7.q;
                fbbf fbbfVar13 = akisVar7.t;
                akkp akkpVar7 = akisVar7.a;
                return new bajc(fbbfVar12, fbbfVar13, akggVar9.p, akkpVar7.oO, akkpVar7.oQ, akkpVar7.pr, akkpVar7.rW);
            case 113:
                return Optional.of(this.b.v());
            case 114:
                akgg akggVar10 = this.b;
                akis akisVar8 = this.a;
                fbbf fbbfVar14 = akisVar8.cP;
                fbbf fbbfVar15 = akisVar8.a.pJ;
                ffhd ffhdVar = (ffhd) fbbfVar14.b();
                akis akisVar9 = this.a;
                fbbf fbbfVar16 = akisVar9.cz;
                fbbf fbbfVar17 = akisVar9.a.aO;
                cqoh cqohVar3 = (cqoh) fbbfVar16.b();
                akkp akkpVar8 = this.a.a;
                return new aqes(akggVar10.p, fbbfVar15, ffhdVar, fbbfVar17, cqohVar3, akkpVar8.pS, akkpVar8.pR, (dtuu) akkpVar8.ay.b(), (ffsk) this.a.a.p.b());
            case 115:
                ffsk ffskVar = (ffsk) this.a.a.aq.b();
                akis akisVar10 = this.a;
                akgg akggVar11 = this.b;
                akkp akkpVar9 = akisVar10.a;
                return new apsk(ffskVar, akkpVar9.iy, akkpVar9.sH, akggVar11.p, akkpVar9.pQ, akkpVar9.fs, (dtuu) akkpVar9.ay.b(), this.a.a.sI);
            case 116:
                akis akisVar11 = this.a;
                akgg akggVar12 = this.b;
                akkp akkpVar10 = akisVar11.a;
                return new ckmm(akkpVar10.bj, akkpVar10.br, akkpVar10.cG, akggVar12.d, akisVar11.cT, akkpVar10.c);
            case 117:
                Context context = (Context) this.a.q.b();
                ffsk ffskVar2 = (ffsk) this.a.a.p.b();
                akis akisVar12 = this.a;
                akgg akggVar13 = this.b;
                fbbf fbbfVar18 = akggVar13.bo;
                akko akkoVar = akisVar12.b;
                akkp akkpVar11 = akisVar12.a;
                return new dejl(context, ffskVar2, akkpVar11.Tg, akggVar13.c, akggVar13.f, Optional.empty(), akkoVar.od, akkoVar.R, akkpVar11.uJ, (Optional) fbbfVar18.b(), this.a.a.Dy);
            case 118:
                return Optional.of(this.b.h());
            case 119:
                return new deln();
            case 120:
                return this.b.J();
            case 121:
                return new aelg((ffsk) this.a.a.p.b(), (aqvh) this.b.c.b());
            case 122:
                return new adtk((Context) this.a.q.b(), (ctbe) this.a.b.hn.b(), (cgag) this.b.bl.b(), (crjx) this.a.a.r.b(), (ejar) this.a.a.au.b());
            case 123:
                return new cgdc(this.b.w(), this.a.mu);
            case 124:
                akis akisVar13 = this.a;
                akgg akggVar14 = this.b;
                fbbf fbbfVar19 = akisVar13.cz;
                akko akkoVar2 = akisVar13.b;
                akkp akkpVar12 = akisVar13.a;
                fbbf fbbfVar20 = akkpVar12.jc;
                fbbf fbbfVar21 = akkoVar2.dW;
                fbbf fbbfVar22 = akkoVar2.l;
                fbbf fbbfVar23 = akkpVar12.fM;
                fbbf fbbfVar24 = akkpVar12.iG;
                cqoh cqohVar4 = (cqoh) fbbfVar19.b();
                akkp akkpVar13 = this.a.a;
                fbbf fbbfVar25 = akkpVar13.fJ;
                fbbf fbbfVar26 = akkpVar13.bN;
                fbbf fbbfVar27 = akkpVar13.jV;
                fazb a = fbaz.a(akkpVar13.iN);
                akis akisVar14 = this.a;
                akko akkoVar3 = akisVar14.b;
                akkp akkpVar14 = akisVar14.a;
                fbbf fbbfVar28 = akkpVar14.fP;
                fbbf fbbfVar29 = akkpVar14.iW;
                fbbf fbbfVar30 = akkoVar3.D;
                fbbf fbbfVar31 = akkpVar14.nW;
                fbbf fbbfVar32 = akkpVar14.dp;
                Context context2 = (Context) akisVar14.q.b();
                akis akisVar15 = this.a;
                akgg akggVar15 = this.b;
                fbbf fbbfVar33 = akisVar15.ps;
                akkp akkpVar15 = akisVar15.a;
                fbbf fbbfVar34 = akkpVar15.ql;
                fbbf fbbfVar35 = akkpVar15.uP;
                fbbf fbbfVar36 = akkpVar15.fw;
                fbbf fbbfVar37 = akkpVar15.ds;
                fbbf fbbfVar38 = akkpVar15.c;
                fbbf fbbfVar39 = akkpVar15.dl;
                fbbf fbbfVar40 = akkpVar15.Fu;
                errl errlVar5 = (errl) fbbfVar33.b();
                fazb a2 = fbaz.a(this.a.a.gr);
                akis akisVar16 = this.a;
                akgg akggVar16 = this.b;
                akko akkoVar4 = akisVar16.b;
                akkp akkpVar16 = akisVar16.a;
                fbbf fbbfVar41 = akisVar16.kE;
                fbbf fbbfVar42 = akisVar16.ig;
                fbbf fbbfVar43 = akisVar16.hv;
                fbbf fbbfVar44 = akkpVar16.iX;
                fbbf fbbfVar45 = akkpVar16.cz;
                fbbf fbbfVar46 = akkpVar16.cq;
                fbbf fbbfVar47 = akkpVar16.wU;
                fbbf fbbfVar48 = akkoVar4.fd;
                fbbf fbbfVar49 = akkpVar16.iK;
                fbbf fbbfVar50 = akkpVar16.fy;
                fbbf fbbfVar51 = akkoVar4.os;
                fbbf fbbfVar52 = akkpVar16.nk;
                fbbf fbbfVar53 = akkpVar16.cp;
                fbbf fbbfVar54 = akkpVar16.kG;
                fbbf fbbfVar55 = akkpVar16.vg;
                fbbf fbbfVar56 = akisVar16.jU;
                fbbf fbbfVar57 = akkpVar16.vy;
                fbbf fbbfVar58 = akkpVar16.cx;
                errm errmVar = (errm) akisVar16.p.b();
                akis akisVar17 = this.a;
                akkp akkpVar17 = akisVar17.a;
                fbbf fbbfVar59 = akisVar17.b.ot;
                fbbf fbbfVar60 = akkpVar17.qr;
                errm errmVar2 = (errm) akisVar17.t.b();
                akis akisVar18 = this.a;
                akkp akkpVar18 = akisVar18.a;
                akko akkoVar5 = akisVar18.b;
                fbbf fbbfVar61 = akkoVar5.fm;
                fbbf fbbfVar62 = akisVar18.dE;
                fbbf fbbfVar63 = akkoVar5.ir;
                cmne cmneVar = (cmne) akkpVar18.Cv.b();
                akis akisVar19 = this.a;
                akkp akkpVar19 = akisVar19.a;
                fbbf fbbfVar64 = akisVar16.cX;
                fbbf fbbfVar65 = akggVar16.bB;
                fbbf fbbfVar66 = akkpVar16.RQ;
                fbbf fbbfVar67 = akggVar16.bA;
                fbbf fbbfVar68 = akggVar16.by;
                fbbf fbbfVar69 = akggVar15.p;
                fbbf fbbfVar70 = akggVar15.k;
                fbbf fbbfVar71 = akkpVar14.Px;
                fbbf fbbfVar72 = akisVar14.aU;
                fbbf fbbfVar73 = akggVar14.bw;
                fbbf fbbfVar74 = akggVar14.bv;
                akko akkoVar6 = akisVar19.b;
                fbbf fbbfVar75 = akisVar19.aK;
                fbbf fbbfVar76 = akkpVar19.iA;
                fbbf fbbfVar77 = akkoVar6.is;
                fbbf fbbfVar78 = akkoVar6.ou;
                fbbf fbbfVar79 = akkoVar6.iw;
                Object dr = akkoVar6.dr();
                fbbf fbbfVar80 = akkoVar6.ov;
                fbbf fbbfVar81 = akkoVar6.iy;
                fbbf fbbfVar82 = akkpVar19.EM;
                fbbf fbbfVar83 = akkpVar19.gJ;
                fbbf fbbfVar84 = akkoVar6.iz;
                fbbf fbbfVar85 = akkpVar19.cG;
                fbbf fbbfVar86 = akkpVar19.jt;
                fbbf fbbfVar87 = akkpVar19.aT;
                fbbf fbbfVar88 = akkoVar6.iD;
                fbbf fbbfVar89 = akkoVar6.iE;
                fbbf fbbfVar90 = akkoVar6.iF;
                fbbf fbbfVar91 = akkoVar6.iG;
                fbbf fbbfVar92 = akkpVar19.Z;
                fbbf fbbfVar93 = akkpVar19.f7do;
                fbbf fbbfVar94 = akkoVar6.iH;
                fbbf fbbfVar95 = akkoVar6.G;
                errl errlVar6 = (errl) fbbfVar75.b();
                akis akisVar20 = this.a;
                akgg akggVar17 = this.b;
                akkp akkpVar20 = akisVar20.a;
                akko akkoVar7 = akisVar20.b;
                fbbf fbbfVar96 = akkoVar7.iI;
                fbbf fbbfVar97 = akkpVar20.bj;
                fbbf fbbfVar98 = akkoVar7.iJ;
                fbbf fbbfVar99 = akkoVar7.iK;
                fbbf fbbfVar100 = akkpVar20.uJ;
                fbbf fbbfVar101 = akkoVar7.iL;
                akis akisVar21 = this.a;
                akgg akggVar18 = this.b;
                akkp akkpVar21 = akisVar21.a;
                fbbf fbbfVar102 = akkpVar21.Lf;
                fbbf fbbfVar103 = akkpVar21.br;
                fbbf fbbfVar104 = akkpVar21.vV;
                akko akkoVar8 = akisVar21.b;
                fbbf fbbfVar105 = akkoVar8.fj;
                fbbf fbbfVar106 = akkpVar21.LM;
                fbbf fbbfVar107 = akkoVar8.iM;
                fbbf fbbfVar108 = akkoVar8.iN;
                fbbf fbbfVar109 = akkoVar8.iR;
                fbbf fbbfVar110 = akkpVar21.kA;
                fbbf fbbfVar111 = akkpVar21.pD;
                fbbf fbbfVar112 = akkoVar8.gw;
                fbbf fbbfVar113 = akkpVar21.Ln;
                fbbf fbbfVar114 = akkpVar21.Ll;
                fbbf fbbfVar115 = akkpVar21.Uo;
                fbbf fbbfVar116 = akkoVar8.iS;
                fbbf fbbfVar117 = akkoVar8.iT;
                fbbf fbbfVar118 = akkpVar21.bS;
                fbba a3 = fbbh.a();
                Optional of = Optional.of((bzgw) akkpVar21.cX.b());
                akis akisVar22 = this.a;
                fbbf fbbfVar119 = akisVar19.aJ;
                akko akkoVar9 = akisVar22.b;
                akkp akkpVar22 = akisVar22.a;
                fbbf fbbfVar120 = akkpVar22.zO;
                fbbf fbbfVar121 = akkpVar22.Cu;
                fbbf fbbfVar122 = akkoVar9.ow;
                fbbf fbbfVar123 = akkpVar22.mn;
                fbbf fbbfVar124 = akggVar18.bM;
                fbbf fbbfVar125 = akggVar18.f;
                fbbf fbbfVar126 = akkpVar21.Pu;
                fbbf fbbfVar127 = akggVar18.bL;
                fbbf fbbfVar128 = akisVar21.ox;
                fbbf fbbfVar129 = akggVar18.bK;
                fbbf fbbfVar130 = akkoVar7.dl;
                fbbf fbbfVar131 = akisVar20.cs;
                fbbf fbbfVar132 = akggVar17.bI;
                fbbf fbbfVar133 = akisVar20.aR;
                fbbf fbbfVar134 = akggVar17.bF;
                return new dauv(fbbfVar20, fbbfVar74, fbbfVar21, fbbfVar22, fbbfVar73, fbbfVar23, fbbfVar24, cqohVar4, fbbfVar25, fbbfVar26, fbbfVar27, a, fbbfVar72, fbbfVar28, fbbfVar29, fbbfVar30, fbbfVar71, fbbfVar31, fbbfVar32, context2, fbbfVar34, fbbfVar35, fbbfVar36, fbbfVar37, fbbfVar38, fbbfVar70, fbbfVar69, fbbfVar39, fbbfVar40, errlVar5, a2, fbbfVar41, fbbfVar42, fbbfVar43, fbbfVar68, fbbfVar67, fbbfVar44, fbbfVar66, fbbfVar65, fbbfVar45, fbbfVar46, fbbfVar47, fbbfVar48, fbbfVar49, fbbfVar64, fbbfVar50, fbbfVar51, fbbfVar52, fbbfVar53, fbbfVar54, fbbfVar55, fbbfVar56, fbbfVar57, fbbfVar58, errmVar, fbbfVar59, fbbfVar60, errmVar2, fbbfVar61, fbbfVar62, fbbfVar63, cmneVar, fbbfVar76, fbbfVar77, fbbfVar78, fbbfVar79, (dadg) dr, fbbfVar80, fbbfVar119, fbbfVar81, fbbfVar82, fbbfVar83, fbbfVar84, fbbfVar85, fbbfVar86, fbbfVar87, fbbfVar88, akkpVar19.Pw, fbbfVar89, fbbfVar90, akkpVar19.RF, fbbfVar91, fbbfVar92, fbbfVar93, fbbfVar94, fbbfVar95, errlVar6, fbbfVar96, fbbfVar134, fbbfVar97, fbbfVar98, fbbfVar132, fbbfVar133, fbbfVar99, fbbfVar131, fbbfVar100, fbbfVar101, fbbfVar130, fbbfVar102, fbbfVar103, fbbfVar104, fbbfVar105, fbbfVar129, fbbfVar106, fbbfVar107, fbbfVar108, fbbfVar128, fbbfVar109, fbbfVar110, fbbfVar127, fbbfVar111, fbbfVar112, fbbfVar113, fbbfVar114, fbbfVar115, fbbfVar126, fbbfVar116, fbbfVar117, fbbfVar125, fbbfVar118, a3, fbbfVar124, of, fbbfVar120, fbbfVar121, fbbfVar122, fbbfVar123);
            case 125:
                return new cpem((Context) this.a.q.b(), (ciqn) this.a.a.aN.b(), (cins) this.a.a.jc.b(), (cnmx) this.b.bn.b());
            case 126:
                akgg akggVar19 = this.b;
                akkp akkpVar23 = this.a.a;
                return new baik(akggVar19.k, akggVar19.p, akkpVar23.dp, akkpVar23.f, akkpVar23.ay, akkpVar23.gC);
            case 127:
                return Optional.of(this.b.H());
            case 128:
                akkp akkpVar24 = this.a.a;
                fbbf fbbfVar135 = akkpVar24.lO;
                ffsk ffskVar3 = (ffsk) akkpVar24.aq.b();
                akgg akggVar20 = this.b;
                akis akisVar23 = this.a;
                fbbf fbbfVar136 = akisVar23.cP;
                akko akkoVar10 = akisVar23.b;
                akkp akkpVar25 = akisVar23.a;
                cjwz z = akggVar20.z();
                fbbf fbbfVar137 = akkpVar25.Dy;
                fbbf fbbfVar138 = akkoVar10.Q;
                ffhd ffhdVar2 = (ffhd) fbbfVar136.b();
                akko akkoVar11 = this.a.b;
                return new cjrb(fbbfVar135, ffskVar3, z, fbbfVar137, akggVar20.c, fbbfVar138, ffhdVar2, akkoVar11.R, akkoVar11.S);
            case 129:
                akis akisVar24 = this.a;
                akgg akggVar21 = this.b;
                akkp akkpVar26 = akisVar24.a;
                return new cipd(akisVar24.q, akkpVar26.aM, akkpVar26.iG, akkpVar26.sY, akkpVar26.fr, akkpVar26.f, akisVar24.cz, akkpVar26.nW, akggVar21.bz, akisVar24.cM, akkpVar26.rq, akkpVar26.pD, akggVar21.k, akkpVar26.rs);
            case 130:
                return new cipe((Context) this.a.q.b(), (ayfg) this.a.a.nW.b(), (cnmx) this.b.bn.b());
            case 131:
                Context context3 = (Context) this.a.q.b();
                akis akisVar25 = this.a;
                akgg akggVar22 = this.b;
                akkp akkpVar27 = akisVar25.a;
                return new dave(context3, akkpVar27.ib, akggVar22.p, (cpdg) akkpVar27.ap.b(), (errl) this.a.t.b());
            case 132:
                return Optional.of(this.b.I());
            case 133:
                cqoh cqohVar5 = (cqoh) this.a.cz.b();
                ceyw ceywVar = (ceyw) this.b.bD.b();
                cfdt cfdtVar = (cfdt) this.a.a.OL.b();
                ejoc ejocVar = (ejoc) this.a.dX.b();
                cexi cexiVar = (cexi) this.a.a.OM.b();
                akkp akkpVar28 = this.a.a;
                return new cfgt(cqohVar5, ceywVar, cfdtVar, ejocVar, cexiVar, akkpVar28.C, (ffsk) akkpVar28.q.b(), (ffsk) this.a.a.aq.b());
            case 134:
                ceza cezaVar = (ceza) this.a.a.OF.b();
                akgg akggVar23 = this.b;
                return new ceyf(cezaVar, akggVar23.bC, (cexi) this.a.a.OM.b(), (ffsk) this.a.a.q.b());
            case 135:
                cbwj cbwjVar = (cbwj) this.a.a.kG.b();
                cqoh cqohVar6 = (cqoh) this.a.cz.b();
                ceww cewwVar = (ceww) this.b.z.b();
                akis akisVar26 = this.a;
                ejoc ejocVar2 = (ejoc) akisVar26.dX.b();
                dtuu dtuuVar = (dtuu) this.a.a.ay.b();
                cfdt cfdtVar2 = (cfdt) this.a.a.OL.b();
                cetc cetcVar = (cetc) this.a.a.yh.b();
                akkp akkpVar29 = this.a.a;
                fbbf fbbfVar139 = akkpVar29.C;
                ffsk ffskVar4 = (ffsk) akkpVar29.q.b();
                ffsk ffskVar5 = (ffsk) this.a.a.aq.b();
                akis akisVar27 = this.a;
                akkp akkpVar30 = akisVar26.a;
                fbbf fbbfVar140 = akkpVar30.OI;
                fbbf fbbfVar141 = akkpVar30.OK;
                akkp akkpVar31 = akisVar27.a;
                return new cfdp(cbwjVar, cqohVar6, cewwVar, fbbfVar140, fbbfVar141, ejocVar2, dtuuVar, cfdtVar2, cetcVar, fbbfVar139, ffskVar4, ffskVar5, akkpVar31.bW(), akkpVar31.cN());
            case 136:
                ffsk ffskVar6 = (ffsk) this.a.a.aq.b();
                akis akisVar28 = this.a;
                akkp akkpVar32 = akisVar28.a;
                fbbf fbbfVar142 = akkpVar32.bj;
                fbbf fbbfVar143 = akkpVar32.Cv;
                dkvu dkvuVar = (dkvu) akisVar28.hl.b();
                asqs asqsVar = (asqs) this.a.a.bo.b();
                ajoz ajozVar = (ajoz) this.b.bH.b();
                akkp akkpVar33 = this.a.a;
                return new cmnk(ffskVar6, fbbfVar142, fbbfVar143, dkvuVar, asqsVar, ajozVar, akkpVar33.wb, akkpVar33.cA());
            case 137:
                akgg akggVar24 = this.b;
                akis akisVar29 = this.a;
                akkp akkpVar34 = akisVar29.a;
                return new ajoz(akggVar24.bG, akisVar29.cl(), (csjk) akkpVar34.fQ.b(), (dkvu) this.a.hl.b(), this.a.t);
            case 138:
                return new ajon(this.a.a.cc);
            case 139:
                dbir dbirVar = (dbir) this.a.b.ir.b();
                dhzj dhzjVar = (dhzj) this.a.nI.b();
                akkp akkpVar35 = this.a.a;
                comc ka = akkpVar35.ka();
                cvhr cvhrVar = (cvhr) akkpVar35.No.b();
                cviz cvizVar = (cviz) this.a.os.b();
                akgg akggVar25 = this.b;
                return new dbne(dbirVar, dhzjVar, ka, cvhrVar, cvizVar, akggVar25.bJ, (elbx) this.a.aJ.b(), (ddwn) this.a.a.Pu.b(), (ffsk) this.a.a.aq.b());
            case 140:
                return new deii(this.a.a.cc);
            case 141:
                return new cktd((ffsk) this.a.a.q.b(), (alxl) this.b.g.b(), (cktz) this.a.mZ.b());
            case 142:
                ffsk ffskVar7 = (ffsk) this.a.a.q.b();
                ffhd ffhdVar3 = (ffhd) this.a.cP.b();
                csiy csiyVar = (csiy) this.a.aN.b();
                Context context4 = (Context) this.a.q.b();
                akzt akztVar = (akzt) this.a.a.C.b();
                ctvs ctvsVar = (ctvs) this.a.aZ.b();
                akgg akggVar26 = this.b;
                akkp akkpVar36 = this.a.a;
                fbbf fbbfVar144 = akkpVar36.jk;
                fbbf fbbfVar145 = akkpVar36.ib;
                coxk coxkVar = (coxk) akkpVar36.iN.b();
                aolr aolrVar = (aolr) this.a.a.Z.b();
                ayif ayifVar = (ayif) this.a.a.ia.b();
                bdtd bdtdVar = (bdtd) this.a.a.aO.b();
                aqvh aqvhVar = (aqvh) this.b.c.b();
                dtuu dtuuVar2 = (dtuu) this.a.a.ay.b();
                akis akisVar30 = this.a;
                fbbf fbbfVar146 = akisVar30.oN;
                akkp akkpVar37 = akisVar30.a;
                return new ckwi(ffskVar7, ffhdVar3, csiyVar, context4, akztVar, ctvsVar, akggVar26.p, akggVar26.k, fbbfVar144, fbbfVar145, coxkVar, aolrVar, ayifVar, bdtdVar, aqvhVar, dtuuVar2, akkpVar37.TO, akkpVar37.TP, (effy) fbbfVar146.b(), (cqoh) this.a.cz.b(), this.a.a.TQ);
            case 143:
                return new aczj((Context) this.a.q.b(), (ffsk) this.a.a.q.b(), this.b.bO, this.a.a.nW);
            case 144:
                akis akisVar31 = this.a;
                akgg akggVar27 = this.b;
                return new aczo(akisVar31.a.Z, akggVar27.f, akggVar27.g);
            case 145:
                return new uar((Context) this.a.q.b(), (errl) this.a.t.b(), (ames) this.a.a.pD.b(), (amet) this.b.aw.b(), this.a.a.nW);
            case 146:
                return new cndl(this.b.L());
            case 147:
                cmsl cmslVar = (cmsl) this.a.lY.b();
                bbfb bbfbVar = (bbfb) this.a.a.nT.b();
                byzp byzpVar = (byzp) this.a.a.iy.b();
                cndj cndjVar = (cndj) this.a.iw.b();
                cqoh cqohVar7 = (cqoh) this.a.cz.b();
                return new cnda(cmslVar, bbfbVar, byzpVar, cndjVar, cqohVar7, (awtm) this.a.iz.b(), this.b.d);
            case 148:
                akgg akggVar28 = this.b;
                return new bbag(akggVar28.k, this.a.a.pJ, akggVar28.l);
            case 149:
                Context context5 = (Context) this.a.q.b();
                akis akisVar32 = this.a;
                bzac bC = akisVar32.bC();
                ejvb ejvbVar = (ejvb) akisVar32.dy.b();
                ejvp ejvpVar2 = (ejvp) this.a.aR.b();
                cubr cubrVar = (cubr) this.a.a.ty.b();
                errl errlVar7 = (errl) this.a.t.b();
                errl errlVar8 = (errl) this.a.p.b();
                bctx bctxVar = (bctx) this.a.a.Fz.b();
                akgg akggVar29 = this.b;
                akkp akkpVar38 = this.a.a;
                fbbf fbbfVar147 = akkpVar38.RO;
                fbbf fbbfVar148 = akkpVar38.qq;
                cthz cthzVar = (cthz) fbbfVar147.b();
                akis akisVar33 = this.a;
                akgg akggVar30 = this.b;
                akkp akkpVar39 = akisVar33.a;
                fbbf fbbfVar149 = akkpVar39.vm;
                fbbf fbbfVar150 = akkpVar39.uM;
                fbbf fbbfVar151 = akkpVar39.ib;
                fbbf fbbfVar152 = akkpVar39.Z;
                atbw atbwVar = (atbw) akkpVar39.ry.b();
                fbbf fbbfVar153 = akggVar30.g;
                return new wch(context5, bC, ejvbVar, ejvpVar2, cubrVar, errlVar7, errlVar8, bctxVar, akggVar29.ac, akggVar29.ab, fbbfVar148, cthzVar, fbbfVar149, akisVar33.cI, fbbfVar150, fbbfVar151, fbbfVar152, fbbfVar153, atbwVar);
            case 150:
                akgg akggVar31 = this.b;
                akkp akkpVar40 = this.a.a;
                return new dekm(akggVar31.bV, akkpVar40.au, (ffsk) akkpVar40.p.b(), this.a.b.jO);
            case 151:
                return new dekd(this.a.a.KU);
            case 152:
                return new calb((errl) this.a.t.b(), (bzqb) this.a.a.qq.b(), (bbfg) this.b.aR.b(), this.a.a.nY);
            case 153:
                Context context6 = (Context) this.a.q.b();
                dtuu dtuuVar3 = (dtuu) this.a.a.ay.b();
                akis akisVar34 = this.a;
                akgg akggVar32 = this.b;
                fbbf fbbfVar154 = akggVar32.bY;
                return new cbxr(context6, dtuuVar3, akisVar34.a.ib, akggVar32.k, (baam) fbbfVar154.b(), (cvbr) this.a.a.fe.b(), (ctyz) this.a.fM.b(), (cbgf) this.b.l.b(), (errl) this.a.t.b());
            case 154:
                crji crjiVar = (crji) this.a.a.ab.b();
                akgg akggVar33 = this.b;
                return new baam(crjiVar, akggVar33.k, (dtuu) this.a.a.ay.b());
            case 155:
                ejvb ejvbVar2 = (ejvb) this.a.dy.b();
                ejvp ejvpVar3 = (ejvp) this.a.aR.b();
                errl errlVar9 = (errl) this.a.t.b();
                errm errmVar3 = (errm) this.a.p.b();
                akgg akggVar34 = this.b;
                akis akisVar35 = this.a;
                return new cygi(ejvbVar2, ejvpVar3, errlVar9, errmVar3, akggVar34.p, akisVar35.a.wC, (cjdi) akisVar35.jC.b());
            case 156:
                return new cyjd((ejvb) this.a.dy.b(), (ejvp) this.a.aR.b(), (cucf) this.b.Z.b(), (bctx) this.a.a.Fz.b(), this.b.G(), (errl) this.a.t.b());
            case 157:
                ejvb ejvbVar3 = (ejvb) this.a.dy.b();
                ejvp ejvpVar4 = (ejvp) this.a.aR.b();
                bctx bctxVar2 = (bctx) this.a.a.Fz.b();
                akgg akggVar35 = this.b;
                return new cyll(ejvbVar3, ejvpVar4, bctxVar2, akggVar35.ac, (croc) this.a.a.id.b(), (cpbs) this.a.a.ft.b(), (errl) this.a.t.b());
            case 158:
                Optional optional = (Optional) this.a.a.RQ.b();
                Optional of2 = Optional.of((ddjv) this.a.oa.b());
                akgg akggVar36 = this.b;
                akis akisVar36 = this.a;
                fbbf fbbfVar155 = akisVar36.a.ib;
                ddlw ddlwVar = (ddlw) akisVar36.b.pr.b();
                ejvp ejvpVar5 = (ejvp) this.a.aR.b();
                ejvb ejvbVar4 = (ejvb) this.a.dy.b();
                cqoh cqohVar8 = (cqoh) this.a.cz.b();
                errl errlVar10 = (errl) this.a.t.b();
                return new cyhs(optional, of2, akggVar36.p, fbbfVar155, akggVar36.k, ddlwVar, ejvpVar5, ejvbVar4, cqohVar8, errlVar10);
            case 159:
                return new cyed((errl) this.a.p.b(), (byzz) this.a.b.pt.b(), (aqkp) this.b.f.b());
            case 160:
                return new cyev((errl) this.a.p.b(), (byzz) this.a.b.pt.b(), (aqkp) this.b.f.b());
            case 161:
                errl errlVar11 = (errl) this.a.p.b();
                ffsk ffskVar8 = (ffsk) this.a.a.q.b();
                ejvb ejvbVar5 = (ejvb) this.a.dy.b();
                akkp akkpVar41 = this.a.a;
                return new cyfk(errlVar11, ffskVar8, ejvbVar5, akkpVar41.dR, (ctwb) akkpVar41.c.b(), (byzz) this.a.b.pt.b(), (aqkp) this.b.f.b());
            case 162:
                cqoh cqohVar9 = (cqoh) this.a.cz.b();
                akis akisVar37 = this.a;
                fbbf fbbfVar156 = akisVar37.aK;
                akkp akkpVar42 = akisVar37.a;
                Optional of3 = Optional.of(akkpVar42.Px);
                fbbf fbbfVar157 = akkpVar42.ap;
                fbbf fbbfVar158 = akkpVar42.iN;
                fbbf fbbfVar159 = akkpVar42.yL;
                errl errlVar12 = (errl) fbbfVar156.b();
                akgg akggVar37 = this.b;
                akis akisVar38 = this.a;
                fbbf fbbfVar160 = akisVar38.cN;
                fbbf fbbfVar161 = akisVar38.a.iK;
                ecrj ecrjVar = (ecrj) fbbfVar160.b();
                alsh alshVar = (alsh) this.a.b.ep.b();
                akis akisVar39 = this.a;
                akko akkoVar12 = akisVar39.b;
                akkp akkpVar43 = akisVar39.a;
                return new cnkx(cqohVar9, of3, fbbfVar157, fbbfVar158, fbbfVar159, errlVar12, akggVar37.ch, fbbfVar161, ecrjVar, alshVar, akkpVar43.fP, akkpVar43.iy, akkpVar43.aO, akkpVar43.ca, akkpVar43.cb, akkoVar12.fg);
            case 163:
                akis akisVar40 = this.a;
                akgg akggVar38 = this.b;
                akkp akkpVar44 = akisVar40.a;
                return new bauh(akisVar40.q, akkpVar44.ib, akggVar38.p, akkpVar44.fs, akkpVar44.ki, akkpVar44.ia, akkpVar44.sY, akkpVar44.tw, akkpVar44.ty, akkpVar44.di, akkpVar44.ds, akkpVar44.aO, akkpVar44.fP, akkpVar44.pt, akkpVar44.jh, akisVar40.b.eq, akkpVar44.iy, akkpVar44.ay, akkpVar44.fJ, akkpVar44.ip, akkpVar44.pQ, akkpVar44.rg, akkpVar44.kt, akkpVar44.Z, akkpVar44.pC, akkpVar44.hw, akkpVar44.ku);
            case 164:
                fbbf fbbfVar162 = this.b.cj;
                return new bapk(fbbfVar162, fbbfVar162);
            case 165:
                akis akisVar41 = this.a;
                akgg akggVar39 = this.b;
                akkp akkpVar45 = akisVar41.a;
                return new barb(akisVar41.q, akkpVar45.ib, akggVar39.k, akggVar39.p, akkpVar45.fs, akkpVar45.ki, akkpVar45.sY, akkpVar45.aO, akisVar41.cz, akkpVar45.iN, akkpVar45.c, akkpVar45.fw, akkpVar45.ap, akkpVar45.fP, akkpVar45.nE, akkpVar45.nD, akkpVar45.iM, akkpVar45.ft, akkpVar45.tw, akkpVar45.ty, akkpVar45.jd, akggVar39.bY, akkpVar45.yz, akkpVar45.pt, akkpVar45.hw, akkpVar45.hx, akggVar39.l, akkpVar45.jh, akkpVar45.dv, akkpVar45.er, akkpVar45.kG, akkpVar45.qJ, akkpVar45.fJ, akkpVar45.pg, akkpVar45.ip, akkpVar45.AV, akkpVar45.Z, akisVar41.b.em, akkpVar45.ia, akkpVar45.kk, akkpVar45.yC, akkpVar45.kt, akkpVar45.pw, akkpVar45.pC, akkpVar45.p, akisVar41.cn, akkpVar45.q, akisVar41.co, akisVar41.cP, akkpVar45.f, akkpVar45.wf, akkpVar45.pQ, akkpVar45.JN, akkpVar45.iK, akisVar41.lS, akisVar41.jT, akkpVar45.ku, akisVar41.ou, akkpVar45.pB, akisVar41.gW, akkpVar45.pA, akkpVar45.py);
            case 166:
                return wmw.a((wmx) this.a.nq.b(), this.a.nr);
            case 167:
                akis akisVar42 = this.a;
                akgg akggVar40 = this.b;
                return new vzx(akisVar42.a.C, akggVar40.aw, akisVar42.cI, akisVar42.b.iZ);
            case 168:
                return new bbae(this.b.k, this.a.a.ay);
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        return this.c / 100 != 0 ? c() : a();
    }
}
