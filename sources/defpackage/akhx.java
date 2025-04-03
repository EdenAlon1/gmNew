package defpackage;

import android.content.Context;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BiFunction;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class akhx implements fbbf {
    public final akis a;
    public final akhy b;
    private final int c;

    public akhx(akis akisVar, akhy akhyVar, int i) {
        this.a = akisVar;
        this.b = akhyVar;
        this.c = i;
    }

    private final Object a() {
        eisx eisxVar;
        int i = this.c;
        switch (i) {
            case 0:
                akhy akhyVar = this.b;
                fbbf fbbfVar = akhyVar.j;
                tmf n = akhyVar.n();
                tns tnsVar = (tns) akhyVar.k.b();
                axkm axkmVar = (axkm) this.a.a.ck.b();
                akis akisVar = this.a;
                return new tlv(fbbfVar, n, tnsVar, axkmVar, akisVar.b.gr, (errl) akisVar.p.b(), this.a.b.gs);
            case 1:
                return tlw.a(this.b.i, (ekpg) this.a.b.gq.b(), (ekpr) this.a.de.b(), (euzy) this.a.a.bx.b(), emxc.h());
            case 2:
                return ekpy.a(this.b.gN(), (cpn) this.a.db.b(), this.a.fo());
            case 3:
                return new ekqe((eisx) this.b.b.b(), (eiyk) this.a.a.o.b(), (ejar) this.a.a.au.b(), emxc.j(ejbq.a()));
            case 4:
                eisxVar = this.b.pk;
                ekla.a(eisxVar);
                return eisxVar;
            case 5:
                final ekfm fI = this.b.fI();
                return new evgu() { // from class: evgv
                    @Override // defpackage.evgu
                    public final ListenableFuture a() {
                        ekhn ekhnVar = (ekhn) ekfm.this;
                        ekbo ekboVar = ekhnVar.b;
                        final ListenableFuture a = ekhnVar.a.a();
                        final ListenableFuture a2 = ekboVar.a();
                        return elfr.d(a, a2).a(new Callable() { // from class: ekhm
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Object q = erqt.q(ListenableFuture.this);
                                q.getClass();
                                Object q2 = erqt.q(a2);
                                q2.getClass();
                                return ffew.j((Map) q, (Map) q2);
                            }
                        }, erpp.a);
                    }
                };
            case 6:
                ekbp ekbpVar = (ekbp) this.a.bS.b();
                errl errlVar = (errl) this.a.aK.b();
                eisx eisxVar2 = (eisx) this.b.b.b();
                ekgu ekguVar = (ekgu) this.b.e.b();
                akhy akhyVar2 = this.b;
                akkp akkpVar = this.a.a;
                return ekhl.a(ekbpVar, errlVar, eisxVar2, ekguVar, akhyVar2.fC(), (ekav) akkpVar.ba.b(), enhk.k(), (eixo) this.a.a.as.b(), this.a.a.mz());
            case 7:
                return new akhn(this);
            case 8:
                return ekgo.a((ekgu) this.b.e.b(), (ekbp) this.a.bS.b(), (eisx) this.b.b.b(), enhk.k(), this.b.fB(), (ekav) this.a.a.ba.b(), (Executor) this.a.a.m.b(), (eixo) this.a.a.as.b(), this.a.a.mz());
            case 9:
                return new tns((axkm) this.a.a.ck.b(), (errl) this.a.p.b());
            case 10:
                return new ekqb();
            case 11:
                return new tfw((chje) this.b.o.b(), (ejvb) this.a.dy.b(), (axkm) this.a.a.ck.b(), (cqoh) this.a.cz.b(), (errl) this.a.p.b(), (errl) this.a.t.b(), (ctvb) this.a.a.u.b(), (aolr) this.a.a.Z.b(), this.a.a.br);
            case 12:
                akis akisVar2 = this.a;
                akhy akhyVar3 = this.b;
                akkp akkpVar2 = akisVar2.a;
                fbbf fbbfVar2 = akisVar2.b.gr;
                fbbf fbbfVar3 = akhyVar3.n;
                chga chgaVar = (chga) akkpVar2.cp.b();
                return new chje(fbbfVar2, fbbfVar3, chgaVar);
            case 13:
                return chju.a(this.b.i, (ekpg) this.a.b.gt.b(), (ekpr) this.a.de.b(), (euzy) this.a.a.bx.b(), emxc.h());
            case 14:
                akhy akhyVar4 = this.b;
                return cgxz.a(akhyVar4.de(), (chkj) akhyVar4.D.b(), (chln) this.a.b.gw.b());
            case 15:
                akis akisVar3 = this.a;
                chhw chhwVar = (chhw) akisVar3.a.aX.b();
                chhw chhwVar2 = (chhw) this.b.v.b();
                Optional of = Optional.of((chix) this.b.w.b());
                chii chiiVar = (chii) this.a.a.bz.b();
                chio chioVar = (chio) this.a.a.bA.b();
                chio chioVar2 = (chio) this.a.a.bB.b();
                akkp akkpVar3 = this.a.a;
                return new chrv(akisVar3.da, chhwVar, chhwVar2, of, chiiVar, chioVar, chioVar2, akkpVar3.bH, akkpVar3.bM);
            case 16:
                return achv.a((chhw) this.a.a.aX.b(), Optional.of((chhw) this.b.u.b()));
            case 17:
                akhy akhyVar5 = this.b;
                akko akkoVar = this.a.b;
                chjb dg = akhyVar5.dg();
                fbbf fbbfVar4 = akkoVar.gr;
                fbbf fbbfVar5 = akhyVar5.s;
                fbbf fbbfVar6 = akhyVar5.t;
                chke.a();
                chki.a();
                return chjn.a(dg, fbbfVar4, fbbfVar5, fbbfVar6);
            case 18:
                return chjw.a(this.b.i, (ekpg) this.a.dp.b(), (ekpr) this.a.de.b(), (euzy) this.a.a.bx.b(), emxc.h());
            case 19:
                return chjv.a(this.b.i, (ekpg) this.a.dp.b(), (ekpr) this.a.de.b(), (euzy) this.a.a.bx.b(), emxc.h());
            case 20:
                return chjr.a(this.b.i, (ekpg) this.a.b.gv.b(), (ekpr) this.a.de.b(), (euzy) this.a.a.bx.b(), emxc.h());
            case 21:
                return chjq.a(this.b.i, (ekpg) this.a.b.gv.b(), (ekpr) this.a.de.b(), (euzy) this.a.a.bx.b(), emxc.h());
            case 22:
                return new akhp(this);
            case 23:
                akis akisVar4 = this.a;
                akhy akhyVar6 = this.b;
                akkp akkpVar4 = akisVar4.a;
                return new chxr(akkpVar4.Fq, akisVar4.da, akisVar4.p, akhyVar6.y, akkpVar4.jX);
            case 24:
                return new chwa((ffsk) this.a.a.p.b(), Optional.of((bzgw) this.a.a.cX.b()), this.a.a.lj());
            case 25:
                return new chwi(this.a.p);
            case 26:
                akis akisVar5 = this.a;
                akhy akhyVar7 = this.b;
                akkp akkpVar5 = akisVar5.a;
                return new chwf(akisVar5.cz, akisVar5.p, akkpVar5.Fq, akhyVar7.y, akkpVar5.jX);
            case 27:
                akis akisVar6 = this.a;
                akhy akhyVar8 = this.b;
                fbbf fbbfVar7 = akisVar6.b.gr;
                chjd dh = akhyVar8.dh();
                fbbf fbbfVar8 = akhyVar8.C;
                String a = chkh.a();
                chki.a();
                return chjm.a(fbbfVar7, dh, fbbfVar8, a);
            case 28:
                return chka.a(this.b.i, (ekpg) this.a.hg.b(), (ekpr) this.a.de.b(), (euzy) this.a.a.bx.b(), emxc.h());
            case 29:
                akhy akhyVar9 = this.b;
                akkp akkpVar6 = this.a.a;
                return new tta(akhyVar9.gT(), akkpVar6.ck, akkpVar6.al);
            case 30:
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                ffhd ffhdVar = (ffhd) this.a.co.b();
                eisx eisxVar3 = (eisx) this.b.b.b();
                ejar ejarVar = (ejar) this.a.a.au.b();
                crok crokVar = (crok) this.a.a.Gj.b();
                crty crtyVar = (crty) this.b.m.b();
                crtz crtzVar = (crtz) this.b.H.b();
                axkm axkmVar2 = (axkm) this.a.a.ck.b();
                crvy crvyVar = (crvy) this.a.b.gy.b();
                akis akisVar7 = this.a;
                akkp akkpVar7 = akisVar7.a;
                return new axlx(ffskVar, ffhdVar, eisxVar3, ejarVar, crokVar, crtyVar, crtzVar, axkmVar2, crvyVar, akkpVar7.al, akisVar7.cE, (axmm) akkpVar7.qL.b());
            case 31:
                this.b.hd();
                crty crtyVar2 = (crty) this.b.m.b();
                axkm axkmVar3 = (axkm) this.a.a.ck.b();
                akhy akhyVar10 = this.b;
                return new tnn(crtyVar2, axkmVar3, akhyVar10.F, akhyVar10.G, (axmm) this.a.a.qL.b(), (arep) this.a.a.pL.b(), (errl) this.a.t.b(), (errl) this.a.p.b());
            case 32:
                return new tnx();
            case 33:
                return new toa();
            case 34:
                return Optional.of((ceww) this.b.lJ.b());
            case 35:
                return new cewx(this.b.lR, this.a.nN);
            case 36:
                akis akisVar8 = this.a;
                enhd h = enhk.h(206);
                h.k("backup_self_participant", akisVar8.a.Gp);
                h.k("block_on_telephony_sync", this.a.a.Gq);
                h.k("cms_backfill_missing_field_work_handler", this.a.a.Gr);
                h.k("cms_backup_validation_work_handler", this.a.a.Gs);
                h.k("cms_batch_backup_foreground", this.b.hG);
                h.k("disable_multi_device_on_server_when_enable_bnr", this.b.hJ);
                h.k("cms_local_media_restore", this.b.hK);
                h.k("cms_local_media_restore_requiring_charging", this.b.hL);
                h.k("cms_local_media_restore_requiring_wifi", this.b.hM);
                h.k("cms_local_media_restore_requiring_wifi_and_charging", this.b.hN);
                h.k("cms_local_media_restore_requiring_battery_not_low", this.b.hO);
                h.k("cms_local_media_restore_requiring_wifi_and_battery_not_low", this.b.hP);
                h.k("cms_media_download_queuer_work_handler", this.b.hQ);
                h.k("cms_media_upload_queuer_work_handler", this.b.hR);
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
                h.k("cms_restore_page", this.b.hS);
                h.k("cms_restore_page_background", this.b.hT);
                h.k("cms_restore_page_foreground", this.b.hU);
                h.k("conversation_deduping_work", this.b.hV);
                h.k("IdentityVerificationPendingMessageHandler", this.b.hW);
                h.k("finish_cms_restore_after_message_insertion", this.a.a.GY);
                h.k("insert_new_message_from_cms", this.b.hX);
                h.k("refresh_cms_server_storage_info", this.a.a.Hf);
                h.k("remove_to_be_delivered_label", this.b.hY);
                h.k("StarAnalyticsWorkerHandler", this.a.a.Hh);
                h.k("turn_on_bnr", this.b.hZ);
                h.k("upload_previous_cms_session_ids", this.a.a.Hj);
                h.k("__UNHANDLED_HANDLER", this.a.mW);
                h.k("cms_restore_validation_work_handler", this.b.ib);
                h.k("backup_now_incremental_work_handler", this.a.a.Hl);
                h.k("batch_contacts_import", this.b.id);
                h.k("batch_deleted_contacts_sync", this.b.ig);
                h.k("clear_session_ids", this.b.ih);
                h.k("contact_recipient_change_sync", this.b.ij);
                h.k("contact_recipient_deleted_sync", this.b.ik);
                h.k("conversation_latcher", this.b.il);
                h.k("delayed_incremental_work_handler", this.b.ip);
                h.k("delete_part_cms_attachment", this.a.a.HF);
                h.k("encrypted_message_delete", this.a.a.HG);
                h.k("end_heavy_work", this.a.a.HJ);
                h.k("expire_wap_push_si_message", this.b.is);
                h.k("fi_multi_sync_grpc", this.a.a.HQ);
                h.k("force_contacts_sync", this.b.iz);
                h.k("gaia_auth_check_result", this.a.a.Ii);
                h.k("add_members_to_rcs_conversation", this.b.iA);
                h.k("ari_work_handler", this.a.a.In);
                h.k("attachment_to_telephony_sync", this.b.iB);
                h.k("backup_upgraded_mms_group", this.b.iD);
                h.k("bard_deletion_sender", this.b.iE);
                h.k("block_on_initial_backup_preconditions", this.a.a.Iv);
                h.k("cancel_notification", this.b.iG);
                h.k("cancel_rcs_file_transfer", this.a.a.IF);
                h.k("CLASSIFY_MISSING_MESSAGES", this.b.iI);
                h.k("CLASSIFY_SPECIFIC_MESSAGES", this.b.iJ);
                h.k("cleanup_part_uri_handler", this.a.a.IP);
                h.k("cms_back_fill_bnr_state_for_fi_md", this.a.a.IQ);
                h.k("cms_backup", this.a.a.IR);
                h.k("cms_batch_backup", this.b.iK);
                h.k("cms_box_copy_multi_device_and_initial_sync_status_on_app_upgrade", this.a.a.IT);
                h.k("cms_check_missing_restore_work_on_app_upgrade", this.a.a.IU);
                h.k("cms_key_sync", this.b.iL);
                h.k("cms_multi_device_opt_out", this.b.iN);
                h.k("cms_restore_backup_key", this.b.iO);
                h.k("cms_restore_conversations", this.b.iP);
                h.k("cms_restore_encryption_key", this.b.iQ);
                h.k("cms_restore_messages", this.b.iR);
                h.k("cms_restore_participants", this.b.iS);
                h.k("cms_sync_stale_status_on_app_upgrade", this.a.a.Jd);
                h.k("connect_to_tachyon_anonymously", this.b.iU);
                h.k("contact_keys_loader_handler", this.a.a.Jf);
                h.k("conversation_metadata_full_sync", this.a.a.Jj);
                h.k("conversation_thread_id_updater_worker", this.b.iV);
                h.k("create_notification", this.b.iW);
                h.k("create_or_update_lighter_conversation", this.a.a.Js);
                h.k("custom_themes_sender", this.b.iX);
                h.k("data_upgrade", this.a.a.Jy);
                h.k("delete_conversation_handler", this.b.ja);
                h.k("delete_parts_work_item", this.a.a.JC);
                h.k("delete_message_from_telephony", this.a.a.JD);
                h.k("delete_message", this.b.jc);
                h.k("delete_thread_from_telephony", this.a.a.JG);
                h.k("spam_recheck_handler", this.a.ng);
                h.k("ditto_conversation_retry_handler", this.b.jn);
                h.k("ditto_message_retry_handler", this.b.js);
                h.k("ditto_retry_handler", this.b.jx);
                h.k("downgrade_on_unencrypted_message", this.b.jz);
                h.k("download_mms", this.a.a.Ke);
                h.k("file_audio_levels", this.b.jG);
                h.k("file_download_completed", this.b.jI);
                h.k("file_download_failed", this.b.jJ);
                h.k("file_download", this.b.jM);
                h.k("file_transfer_processor", this.b.jN);
                h.k("messaging_file_upload", this.b.jP);
                h.k("forward_sync_batch", this.b.jU);
                h.k("ftd_data_clean_up_work", this.a.a.KA);
                h.k("FtdHandlerWorkItem", this.b.jW);
                h.k("rcs_engine_get_single_message", this.b.jX);
                h.k("google_photos_api_callback", this.b.jY);
                h.k("group_session_start_failed", this.b.jZ);
                h.k("group_session_started", this.b.ka);
                h.k("icing_index_rebuild_handler", this.b.kb);
                h.k("icing_index_rebuild_single_work_handler", this.b.kd);
                h.k("icing_index_update_handler", this.b.ke);
                h.k("chatapi_incoming_group_notification_list_message", this.b.kf);
                h.k("incoming_rbm_message_handler", this.b.kg);
                h.k("incoming_rcs_group_invitation", this.b.kh);
                h.k("IncrementalReverseSyncWorkItemHandler", this.b.ki);
                h.k("leave_rcs_group_conversation", this.b.kj);
                h.k("lighter_incremental_sync", this.b.kk);
                h.k("log_message_sent_or_received", this.a.a.DO);
                h.k("magic_compose_send_clicked_log_handler", this.a.a.Ld);
                h.k("mark_all_rcs_groups_as_left", this.b.kl);
                h.k("mark_as_notified", this.a.a.Lg);
                h.k("mark_failures_as_notified", this.b.km);
                h.k("MessagesRestoreWorkItemHandler", this.a.a.LP);
                h.k("on_add_user_to_group_chat_complete", this.a.a.LQ);
                h.k("on_create_group_chat_complete", this.b.kn);
                h.k("on_remove_user_from_group_chat_complete", this.a.a.LS);
                h.k("on_trigger_chat_group_full_state_update_complete", this.a.nw);
                h.k("PARTICIPANT_BASED_QUICK_CLASSIFICATION", this.b.ko);
                h.k("participant_contact_sync", this.b.kp);
                h.k("persist_ios_reaction", this.b.kq);
                h.k("persist_thumbnail", this.b.kr);
                h.k("pipeline_work_handler", this.b.ks);
                h.k("post_incoming_message_to_chat_api", this.b.kt);
                h.k("ditto_process_user_alert", this.b.ku);
                h.k("forward_sync_engine", this.b.kx);
                h.k("rcs_group_identifiers_telephony_migration", this.b.ky);
                h.k("recover_chat_api_to_vanilla_rcs_downgraded_rcs_group", this.b.kz);
                h.k("refresh_incoming_message_notifications", this.a.a.Mg);
                h.k("refresh_message_failure_notification", this.a.a.Mh);
                h.k("remote_user_identity_key_change_handler", this.b.kA);
                h.k("remove_members_from_rcs_conversation", this.b.kB);
                h.k("resizing", this.a.a.Mk);
                h.k("retry_manager", this.a.a.uQ);
                h.k("run_analyze", this.a.a.Ml);
                h.k("chatapi_send_chat_message_response", this.b.eb);
                h.k("smarts_send_message_listener_handler", this.b.kC);
                h.k("soda_file_transcription", this.b.kD);
                h.k("spam_reclassification_handler", this.b.kE);
                h.k("spot_sync", this.b.kF);
                h.k("sync_rcs_groups", this.b.kH);
                h.k("tachygram_add_user_to_group", this.b.kJ);
                h.k("tachygram_create_group", this.b.kK);
                h.k("tachygram_get_group_info", this.b.kL);
                h.k("tachygram_inbox_message_retry", this.b.kO);
                h.k("tachygram_remove_user_from_group", this.b.kP);
                h.k("tachygram_revoke_message", this.b.kQ);
                h.k("tachygram_send_message", this.b.fa);
                h.k("tachygram_update_group", this.b.kR);
                h.k("thumbnail_download_completed", this.b.kS);
                h.k("tombstone_manager_on_rcs_group_e2ee_status_change", this.b.kT);
                h.k("undelivered_message_fallback", this.b.kU);
                h.k("unregister_google_rcs_call", this.a.a.MG);
                h.k("UPDATE_ARCHIVE_STATUS", this.a.a.MH);
                h.k("update_conversation_encryption_status", this.b.kV);
                h.k("update_timestamp_in_telephony", this.b.kW);
                h.k("update_unread_counter", this.a.nB);
                h.k("upload_attachments_to_blobstore", this.b.kX);
                h.k("vendor_ims_call", this.a.a.ML);
                h.k("EmotifyReactionDatabaseUpdateHandler", this.a.a.MM);
                h.k("TelephonyDatabaseUpdateWorkItemHandler", this.b.kY);
                h.k("chatapi_incoming_group_chat_notification_message", this.b.le);
                h.k("incremental_contacts_import", this.b.lf);
                h.k("load_paged_conversation_timeout_fallback", this.b.lk);
                h.k("low_storage", this.a.a.Nr);
                h.k("mark_messages_as_read_handler", this.b.ll);
                h.k("mark_rcs_messages_in_telephony", this.b.lm);
                h.k("otp_deletion_handler", this.b.ln);
                h.k("p13n_work", this.b.lo);
                h.k("parent_allowlist_update", this.b.lq);
                h.k("penpal_bot_recipient_restore", this.b.lr);
                h.k("penpal_conversation_auto_generate", this.b.lt);
                h.k("process_rcs_group_notify", this.b.lu);
                h.k("rbm_business_info_retrieval", this.b.lv);
                h.k("rbm_chatbot_directory_welcome_message", this.b.lw);
                h.k("recover_disabled_rcs_group", this.b.lx);
                h.k("request_link_preview", this.b.lz);
                h.k("request_smart_suggestions", this.b.lA);
                h.k("retrieve_questionnaire", this.b.lB);
                h.k("ReverseTelephonySync", this.b.lC);
                h.k("chatapi_revoke_chat_message_response", this.b.lD);
                h.k("rich_card_media_uri_cleanup", this.b.lE);
                h.k("satellite_network_state_updater", this.b.lF);
                h.k("schedule_contacts_import", this.b.lG);
                h.k("schedule_delete_and_import_contacts", this.b.lI);
                h.k("sim_state_update", this.a.a.On);
                h.k("start_heavy_work", this.b.lK);
                h.k("sync_conversation_data_to_wearable", this.a.a.Or);
                h.k("sync_data_to_wearable_app", this.b.lL);
                h.k("sync_group_then_encryption_status", this.b.lO);
                h.k("UPDATE_MARK_UNREAD", this.a.a.Ow);
                h.k("update_rcs_group_name", this.b.lP);
                h.k("CopyFileTelephonyPartHandler", this.a.a.Oy);
                h.k("cms_drop_unscheduled_item_to_dlq", this.b.lQ);
                return h.h();
            case 37:
                return this.b.bK();
            case 38:
                akkp akkpVar8 = this.a.a;
                akkpVar8.fR();
                akkpVar8.fV();
                this.a.a.fP();
                this.a.a.fU();
                akhy akhyVar11 = this.b;
                akis akisVar9 = this.a;
                akhyVar11.bA();
                return new ccbt(akhyVar11.bM(), (errl) akisVar9.p.b(), (errl) this.a.t.b());
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return Optional.of(this.b.gL());
            case 40:
                akis akisVar10 = this.a;
                akhy akhyVar12 = this.b;
                akkp akkpVar9 = akisVar10.a;
                return new bdmq(akkpVar9.ab, akkpVar9.iy, akhyVar12.bu, akisVar10.kk, akhyVar12.W, akhyVar12.P, akkpVar9.ay, akhyVar12.O, akkpVar9.Kt, akkpVar9.Z, akkpVar9.ad, akhyVar12.bv, akisVar10.kv, akkpVar9.SV, akkpVar9.pU);
            case 41:
                akis akisVar11 = this.a;
                akhy akhyVar13 = this.b;
                akkp akkpVar10 = akisVar11.a;
                return new bdpt(akisVar11.q, akkpVar10.ad, akkpVar10.dy, akhyVar13.O, akkpVar10.ay);
            case 42:
                Context context = (Context) this.a.q.b();
                dtuu dtuuVar = (dtuu) this.a.a.ay.b();
                ejvp ejvpVar = (ejvp) this.a.aR.b();
                Optional of2 = Optional.of(this.b.N);
                akhy akhyVar14 = this.b;
                akis akisVar12 = this.a;
                fbbf fbbfVar9 = akisVar12.aK;
                return new cbgf(context, dtuuVar, ejvpVar, of2, akhyVar14.hD, akisVar12.da, (errl) fbbfVar9.b(), (errl) this.a.p.b());
            case 43:
                akis akisVar13 = this.a;
                akkp akkpVar11 = akisVar13.a;
                fbbf fbbfVar10 = akkpVar11.aS;
                fbbf fbbfVar11 = akkpVar11.dQ;
                fbbf fbbfVar12 = akkpVar11.cn;
                Context context2 = (Context) akisVar13.q.b();
                akis akisVar14 = this.a;
                fbbf fbbfVar13 = akisVar14.cz;
                fbbf fbbfVar14 = akisVar14.a.ae;
                cqoh cqohVar = (cqoh) fbbfVar13.b();
                akis akisVar15 = this.a;
                fbbf fbbfVar15 = akisVar15.aK;
                akkp akkpVar12 = akisVar15.a;
                fbbf fbbfVar16 = akkpVar12.r;
                errl errlVar2 = (errl) fbbfVar15.b();
                errl errlVar3 = (errl) this.a.t.b();
                errm errmVar = (errm) this.a.p.b();
                akhy akhyVar15 = this.b;
                return new debh(fbbfVar10, fbbfVar11, fbbfVar12, context2, fbbfVar14, cqohVar, fbbfVar16, akkpVar12.Pj, errlVar2, errlVar3, errmVar, Optional.empty(), akhyVar15.am, (cuay) akhyVar15.hC.b(), this.a.a.Jm);
            case 44:
                return new amet(this.b.ao);
            case 45:
                akhy akhyVar16 = this.b;
                akkp akkpVar13 = this.a.a;
                return new amfk(akhyVar16.gC(), akkpVar13.Q, akkpVar13.no, akkpVar13.ld, akkpVar13.hJ);
            case 46:
                return new aprl(this.b.hn);
            case 47:
                akis akisVar16 = this.a;
                akhy akhyVar17 = this.b;
                akkp akkpVar14 = akisVar16.a;
                return new apin(akkpVar14.p, akhyVar17.aQ, akisVar16.cz, akkpVar14.lh, akhyVar17.hm, akkpVar14.lm, akkpVar14.ln, akkpVar14.lo, akkpVar14.lp, akkpVar14.lq);
            case 48:
                akis akisVar17 = this.a;
                akhy akhyVar18 = this.b;
                fbbf fbbfVar17 = akisVar17.p;
                akkp akkpVar15 = akisVar17.a;
                return new apsa(fbbfVar17, akisVar17.aK, akisVar17.t, akkpVar15.kX, akkpVar15.iy, akkpVar15.kY, akhyVar18.fd, akkpVar15.lc, akhyVar18.aF, akisVar17.iz, akhyVar18.S, akkpVar15.Q, akisVar17.cz, akkpVar15.ld, akkpVar15.lb, akkpVar15.kW, akkpVar15.le, akkpVar15.lf, akkpVar15.hH);
            case Maneuver.TYPE_FERRY_TRAIN_LEFT /* 49 */:
                return new clwb((clvk) this.b.L.b(), (errl) this.a.t.b(), (aqvh) this.b.M.b());
            case 50:
                return new akhq(this);
            case 51:
                ffhd ffhdVar2 = (ffhd) this.a.cP.b();
                ffsk ffskVar2 = (ffsk) this.a.a.aq.b();
                ffsk ffskVar3 = (ffsk) this.a.a.p.b();
                akis akisVar18 = this.a;
                akhy akhyVar19 = this.b;
                akkp akkpVar16 = akisVar18.a;
                return new cpsu(ffhdVar2, ffskVar2, ffskVar3, akkpVar16.gq, akkpVar16.gt, akkpVar16.gu, akkpVar16.bF, akkpVar16.bE, akhyVar19.fO());
            case 52:
                return new akhr(this);
            case 53:
                aqte aqteVar = (aqte) this.a.a.hA.b();
                this.b.hg();
                aqvg.a(aqteVar);
                return aqteVar;
            case 54:
                return new akhs(this);
            case 55:
                return new aqwd(this.b.he);
            case 56:
                akhy akhyVar20 = this.b;
                akis akisVar19 = this.a;
                akkp akkpVar17 = akisVar19.a;
                return new aqwo(akhyVar20.aF, akisVar19.hi, akisVar19.t, akkpVar17.cx, fbbg.a(akkpVar17.gR));
            case 57:
                akis akisVar20 = this.a;
                akhy akhyVar21 = this.b;
                fbbf fbbfVar18 = akisVar20.cn;
                akkp akkpVar18 = akisVar20.a;
                return new ckac(akkpVar18.gE, akhyVar21.M, akhyVar21.P, akkpVar18.gO, akkpVar18.G, akkpVar18.bF, akkpVar18.gP, akkpVar18.u, (ffhd) fbbfVar18.b(), (ffhd) this.a.cP.b(), (ffsk) this.a.a.p.b());
            case 58:
                akis akisVar21 = this.a;
                akhy akhyVar22 = this.b;
                fbbf fbbfVar19 = akisVar21.a.aO;
                Optional of3 = Optional.of(akhyVar22.N);
                akis akisVar22 = this.a;
                akhy akhyVar23 = this.b;
                akkp akkpVar19 = akisVar22.a;
                fbbf fbbfVar20 = akkpVar19.f;
                fbbf fbbfVar21 = akkpVar19.C;
                fbbf fbbfVar22 = akkpVar19.MX;
                fbbf fbbfVar23 = akhyVar23.O;
                fbbf fbbfVar24 = akkpVar19.ab;
                fbbf fbbfVar25 = akkpVar19.fx;
                dtuu dtuuVar2 = (dtuu) akkpVar19.ay.b();
                akhy akhyVar24 = this.b;
                akis akisVar23 = this.a;
                fbbf fbbfVar26 = akisVar23.cz;
                fbbf fbbfVar27 = akhyVar24.W;
                fbbf fbbfVar28 = akisVar23.mE;
                cqoh cqohVar2 = (cqoh) fbbfVar26.b();
                akis akisVar24 = this.a;
                akhy akhyVar25 = this.b;
                akkp akkpVar20 = akisVar24.a;
                return new bdem(fbbfVar19, of3, fbbfVar20, fbbfVar21, fbbfVar22, fbbfVar23, fbbfVar24, fbbfVar25, dtuuVar2, fbbfVar27, fbbfVar28, cqohVar2, akkpVar20.ej, akkpVar20.Z, akkpVar20.u, akhyVar25.cn, akhyVar25.ha, akkpVar20.G, akhyVar25.hb, akhyVar25.hd, akkpVar20.L, akkpVar20.Q, akkpVar20.MR, akkpVar20.kv, akkpVar20.Pm, akkpVar20.hJ);
            case 59:
                akhy akhyVar26 = this.b;
                akkp akkpVar21 = this.a.a;
                fbbf fbbfVar29 = akhyVar26.R;
                Optional of4 = Optional.of(akkpVar21.fp);
                Optional of5 = Optional.of(this.b.gK);
                akis akisVar25 = this.a;
                akhy akhyVar27 = this.b;
                akkp akkpVar22 = akisVar25.a;
                aswk bU = akkpVar22.bU();
                fbbf fbbfVar30 = akkpVar22.ap;
                fbbf fbbfVar31 = akkpVar22.aO;
                fbbf fbbfVar32 = akhyVar27.gW;
                fbbf fbbfVar33 = akkpVar22.ay;
                fbbf fbbfVar34 = akisVar25.mr;
                fbbf fbbfVar35 = akkpVar22.aA;
                fbbf fbbfVar36 = akkpVar22.md;
                fbbf fbbfVar37 = akhyVar27.O;
                fbbf fbbfVar38 = akkpVar22.L;
                fbbf fbbfVar39 = akhyVar27.gZ;
                azzp azzpVar = (azzp) akkpVar22.aI.b();
                akis akisVar26 = this.a;
                akhy akhyVar28 = this.b;
                akkp akkpVar23 = akisVar26.a;
                return new bdrr(fbbfVar29, of4, of5, bU, fbbfVar30, fbbfVar31, fbbfVar32, fbbfVar33, fbbfVar34, fbbfVar35, fbbfVar36, fbbfVar37, fbbfVar38, fbbfVar39, azzpVar, akkpVar23.hV, akkpVar23.Dm, akhyVar28.aD);
            case 60:
                akhy akhyVar29 = this.b;
                fbbf fbbfVar40 = this.a.a.Pn;
                fbbf fbbfVar41 = akhyVar29.P;
                cbfr cbfrVar = (cbfr) fbbfVar40.b();
                akis akisVar27 = this.a;
                fbbf fbbfVar42 = akisVar27.a.hC;
                Context context3 = (Context) akisVar27.q.b();
                akhy akhyVar30 = this.b;
                akis akisVar28 = this.a;
                akkp akkpVar24 = akisVar28.a;
                fbbf fbbfVar43 = akhyVar30.O;
                fbbf fbbfVar44 = akkpVar24.aO;
                dtuu dtuuVar3 = (dtuu) akkpVar24.ay.b();
                akis akisVar29 = this.a;
                akhy akhyVar31 = this.b;
                fbbf fbbfVar45 = akisVar29.aK;
                akkp akkpVar25 = akisVar29.a;
                fbbf fbbfVar46 = akkpVar25.aA;
                fbbf fbbfVar47 = akkpVar25.il;
                fbbf fbbfVar48 = akkpVar25.az;
                fbbf fbbfVar49 = akkpVar25.Z;
                fbbf fbbfVar50 = akkpVar25.md;
                fbbf fbbfVar51 = akkpVar25.aF;
                fbbf fbbfVar52 = akkpVar25.kn;
                fbbf fbbfVar53 = akkpVar25.f;
                fbbf fbbfVar54 = akkpVar25.aD;
                fbbf fbbfVar55 = akkpVar25.ko;
                fbbf fbbfVar56 = akkpVar25.c;
                fbbf fbbfVar57 = akhyVar31.Q;
                fbbf fbbfVar58 = akhyVar31.M;
                errl errlVar4 = (errl) fbbfVar45.b();
                fbbf fbbfVar59 = this.a.he;
                fbbf fbbfVar60 = akkpVar25.Pp;
                fbbf fbbfVar61 = akkpVar25.Po;
                return new cbfs(fbbfVar41, cbfrVar, fbbfVar42, context3, fbbfVar43, akisVar28.cT, fbbfVar44, dtuuVar3, fbbfVar46, fbbfVar47, fbbfVar48, akisVar29.nQ, fbbfVar49, fbbfVar50, fbbfVar51, fbbfVar52, fbbfVar53, fbbfVar54, fbbfVar61, fbbfVar55, fbbfVar56, fbbfVar57, fbbfVar58, fbbfVar60, errlVar4, fbbfVar59);
            case 61:
                return new bdfv(this.b.P, (aolr) this.a.a.Z.b(), (djsi) this.a.a.gE.b(), (bdtd) this.a.a.aO.b(), (ffhd) this.a.co.b(), (ffsk) this.a.a.q.b());
            case 62:
                dgea dgeaVar = (dgea) this.a.fP.b();
                ffsk ffskVar4 = (ffsk) this.a.a.aq.b();
                akhy akhyVar32 = this.b;
                akis akisVar30 = this.a;
                fbbf fbbfVar62 = akisVar30.cz;
                akkp akkpVar26 = akisVar30.a;
                fbbf fbbfVar63 = akhyVar32.gV;
                fbbf fbbfVar64 = akkpVar26.Z;
                fbbf fbbfVar65 = akisVar30.fO;
                cqoh cqohVar3 = (cqoh) fbbfVar62.b();
                akis akisVar31 = this.a;
                akhy akhyVar33 = this.b;
                akkp akkpVar27 = akisVar31.a;
                return new cvdy(dgeaVar, ffskVar4, fbbfVar63, fbbfVar64, fbbfVar65, cqohVar3, akkpVar27.bU(), akkpVar27.bV(), akhyVar33.aS, akhyVar33.S);
            case 63:
                return new cveb((bdtd) this.a.a.aO.b(), (cqoh) this.a.cz.b(), this.b.cX);
            case 64:
                akis akisVar32 = this.a;
                akhy akhyVar34 = this.b;
                akkp akkpVar28 = akisVar32.a;
                fbbf fbbfVar66 = akkpVar28.fr;
                fbbf fbbfVar67 = akhyVar34.P;
                fbbf fbbfVar68 = akhyVar34.S;
                fbbf fbbfVar69 = akhyVar34.X;
                cpbw cpbwVar = (cpbw) akkpVar28.fw.b();
                cqoh cqohVar4 = (cqoh) this.a.cz.b();
                akzt akztVar = (akzt) this.a.a.f.b();
                akis akisVar33 = this.a;
                akhy akhyVar35 = this.b;
                fbbf fbbfVar70 = akisVar33.a.aO;
                cbgf cbgfVar = (cbgf) akhyVar35.O.b();
                azze azzeVar = (azze) this.a.a.fx.b();
                bdvi bdviVar = (bdvi) this.b.bn.b();
                dtuu dtuuVar4 = (dtuu) this.a.a.ay.b();
                byzp byzpVar = (byzp) this.a.a.iy.b();
                Optional of6 = Optional.of((cbvu) this.a.a.Dg.b());
                akhy akhyVar36 = this.b;
                akis akisVar34 = this.a;
                akkp akkpVar29 = akisVar34.a;
                return new cbvt(fbbfVar66, fbbfVar67, fbbfVar68, fbbfVar69, cpbwVar, cqohVar4, akztVar, fbbfVar70, cbgfVar, azzeVar, bdviVar, dtuuVar4, byzpVar, of6, akhyVar36.bv, akisVar34.kk, akhyVar36.Y, akhyVar36.M, akkpVar29.Z, akkpVar29.hJ, (errl) akisVar34.t.b());
            case 65:
                Context context4 = (Context) this.a.q.b();
                akkp akkpVar30 = this.a.a;
                fbbf fbbfVar71 = akkpVar30.aO;
                dtuu dtuuVar5 = (dtuu) akkpVar30.ay.b();
                akhy akhyVar37 = this.b;
                akis akisVar35 = this.a;
                fbbf fbbfVar72 = akisVar35.cz;
                akkp akkpVar31 = akisVar35.a;
                fbbf fbbfVar73 = akhyVar37.S;
                fbbf fbbfVar74 = akhyVar37.P;
                fbbf fbbfVar75 = akkpVar31.DZ;
                cqoh cqohVar5 = (cqoh) fbbfVar72.b();
                cbgf cbgfVar2 = (cbgf) this.b.O.b();
                akkp akkpVar32 = this.a.a;
                return new bdfl(context4, fbbfVar71, dtuuVar5, akhyVar37.cD, fbbfVar73, fbbfVar74, fbbfVar75, cqohVar5, cbgfVar2, akkpVar32.by(), akkpVar32.bA());
            case 66:
                akhy akhyVar38 = this.b;
                akkp akkpVar33 = this.a.a;
                fbbf fbbfVar76 = akhyVar38.P;
                fbbf fbbfVar77 = akhyVar38.V;
                fbbf fbbfVar78 = akkpVar33.dL;
                cbgf cbgfVar3 = (cbgf) akhyVar38.O.b();
                bbfd bbfdVar = (bbfd) this.b.fm.b();
                dtuu dtuuVar6 = (dtuu) this.a.a.ay.b();
                akhy akhyVar39 = this.b;
                return new croe(fbbfVar76, fbbfVar77, fbbfVar78, cbgfVar3, bbfdVar, dtuuVar6, akhyVar39.cT, (akvy) this.a.a.DY.b(), this.b.fk());
            case 67:
                return new bdgh(this.b.P, (dtuu) this.a.a.ay.b(), this.b.U);
            case 68:
                return new cesi(this.a.a.cc);
            case 69:
                akis akisVar36 = this.a;
                akhy akhyVar40 = this.b;
                fbbf fbbfVar79 = akisVar36.q;
                akkp akkpVar34 = akisVar36.a;
                return new baih(fbbfVar79, akisVar36.cz, akkpVar34.u, akkpVar34.f, akkpVar34.fP, akkpVar34.iN, akkpVar34.ay, akkpVar34.ap, akkpVar34.AS, akhyVar40.ak, akkpVar34.ix, akkpVar34.fr, akhyVar40.P, akkpVar34.BF, akhyVar40.cT, akkpVar34.az, akkpVar34.dE, akkpVar34.aO, akkpVar34.DX);
            case 70:
                akis akisVar37 = this.a;
                akhy akhyVar41 = this.b;
                akkp akkpVar35 = akisVar37.a;
                return new cbdx(akkpVar35.f, akkpVar35.iN, Optional.of(akhyVar41.aj), this.b.ai);
            case 71:
                Context context5 = (Context) this.a.q.b();
                dtuu dtuuVar7 = (dtuu) this.a.a.ay.b();
                akhy akhyVar42 = this.b;
                akkp akkpVar36 = this.a.a;
                fbbf fbbfVar80 = akhyVar42.W;
                fbbf fbbfVar81 = akhyVar42.P;
                fbbf fbbfVar82 = akhyVar42.Z;
                fbbf fbbfVar83 = akhyVar42.ab;
                coxk coxkVar = (coxk) akkpVar36.iN.b();
                byzp byzpVar2 = (byzp) this.a.a.iy.b();
                bcwz bcwzVar = (bcwz) this.a.a.ad.b();
                akhy akhyVar43 = this.b;
                akkp akkpVar37 = this.a.a;
                ccpr by = akhyVar43.by();
                comy comyVar = (comy) akkpVar37.aT.b();
                cqoh cqohVar6 = (cqoh) this.a.cz.b();
                errl errlVar5 = (errl) this.a.aK.b();
                akkp akkpVar38 = this.a.a;
                fbbf fbbfVar84 = akkpVar38.bi;
                fbbf fbbfVar85 = akkpVar38.az;
                fbbf fbbfVar86 = akkpVar38.jl;
                fbbf fbbfVar87 = akkpVar38.c;
                fbbf fbbfVar88 = akkpVar38.dv;
                fbbf fbbfVar89 = akkpVar38.aO;
                Optional optional = (Optional) akkpVar38.jp.b();
                akhy akhyVar44 = this.b;
                akis akisVar38 = this.a;
                akkp akkpVar39 = akisVar38.a;
                return new cpvp(context5, dtuuVar7, fbbfVar80, fbbfVar81, fbbfVar82, fbbfVar83, coxkVar, byzpVar2, bcwzVar, by, comyVar, cqohVar6, errlVar5, fbbfVar84, fbbfVar85, fbbfVar86, fbbfVar87, fbbfVar88, fbbfVar89, optional, akhyVar44.ae, akkpVar39.jv, akkpVar39.js, akkpVar39.jy, akkpVar39.iN, akhyVar44.ac, akhyVar44.ai, akisVar38.ij, akkpVar39.jH, akkpVar39.jI, akkpVar39.AF, (asmj) akkpVar39.jD.b(), this.a.a.jF);
            case 72:
                dtuu dtuuVar8 = (dtuu) this.a.a.ay.b();
                akhy akhyVar45 = this.b;
                return new bdes(dtuuVar8, akhyVar45.X, akhyVar45.Y);
            case 73:
                akhy akhyVar46 = this.b;
                akkp akkpVar40 = this.a.a;
                fbbf fbbfVar90 = akhyVar46.O;
                dtuu dtuuVar9 = (dtuu) akkpVar40.ay.b();
                akis akisVar39 = this.a;
                akhy akhyVar47 = this.b;
                akkp akkpVar41 = akisVar39.a;
                return new cgpv(fbbfVar90, dtuuVar9, akkpVar41.dy, akhyVar47.S, akhyVar47.P, akhyVar47.X, akkpVar41.C);
            case 74:
                akis akisVar40 = this.a;
                akhy akhyVar48 = this.b;
                akkp akkpVar42 = akisVar40.a;
                return new bdfw(akkpVar42.f, akhyVar48.aa, akkpVar42.Z, akhyVar48.P);
            case 75:
                akis akisVar41 = this.a;
                akhy akhyVar49 = this.b;
                akkp akkpVar43 = akisVar41.a;
                fbbf fbbfVar91 = akkpVar43.ds;
                fbbf fbbfVar92 = akhyVar49.S;
                fbbf fbbfVar93 = akkpVar43.f;
                coxk coxkVar2 = (coxk) akkpVar43.iN.b();
                akkp akkpVar44 = this.a.a;
                return new cbee(fbbfVar91, fbbfVar92, fbbfVar93, coxkVar2, akkpVar44.Z, akkpVar44.aF);
            case 76:
                Context context6 = (Context) this.a.q.b();
                ctyx ctyxVar = (ctyx) this.a.aU.b();
                ctud ctudVar = (ctud) this.a.cT.b();
                bazb bazbVar = (bazb) this.b.ac.b();
                cerb cerbVar = (cerb) this.b.ad.b();
                akkp akkpVar45 = this.a.a;
                return new cngp(context6, ctyxVar, ctudVar, bazbVar, cerbVar, akkpVar45.jt, akkpVar45.jw);
            case 77:
                akis akisVar42 = this.a;
                akhy akhyVar50 = this.b;
                akkp akkpVar46 = akisVar42.a;
                return new bazb(akkpVar46.fJ, akhyVar50.ab, akhyVar50.Y, akkpVar46.ds, akkpVar46.jt, akkpVar46.pt, akkpVar46.kl, akkpVar46.az, akkpVar46.Ex);
            case 78:
                return new cerb(this.a.a.cc);
            case 79:
                akis akisVar43 = this.a;
                akhy akhyVar51 = this.b;
                akkp akkpVar47 = akisVar43.a;
                fbbf fbbfVar94 = akkpVar47.iN;
                fbbf fbbfVar95 = akisVar43.ih;
                fbbf fbbfVar96 = akhyVar51.ag;
                fbbf fbbfVar97 = akhyVar51.ah;
                fbbf fbbfVar98 = akkpVar47.C;
                Optional of7 = Optional.of((cpdd) akkpVar47.jo.b());
                asmj asmjVar = (asmj) this.a.a.jD.b();
                akis akisVar44 = this.a;
                return new ayfp(akisVar43.cv, fbbfVar94, fbbfVar95, fbbfVar96, fbbfVar97, fbbfVar98, of7, asmjVar, akisVar44.a.jF, (Context) akisVar44.q.b());
            case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                return new ayza((ayvn) this.a.a.L.b(), (ayyn) this.b.af.b(), (errl) this.a.t.b(), this.a.a.az);
            case 81:
                akis akisVar45 = this.a;
                akhy akhyVar52 = this.b;
                akkp akkpVar48 = akisVar45.a;
                return new ayyn(akkpVar48.L, akhyVar52.P, akkpVar48.dR, akkpVar48.iN, akkpVar48.jv, akkpVar48.dE, akkpVar48.jz, akisVar45.t);
            case 82:
                return new ayfs(this.a.a.cc);
            case 83:
                akhy akhyVar53 = this.b;
                akis akisVar46 = this.a;
                return new cjbe(akhyVar53.al, akhyVar53.gU, akisVar46.jS, akisVar46.a.py, akhyVar53.dL, akhyVar53.dK, akisVar46.p);
            case 84:
                akhy akhyVar54 = this.b;
                return new ciwj(akhyVar54.dt(), akhyVar54.ds());
            case 85:
                Context context7 = (Context) this.a.q.b();
                errl errlVar6 = (errl) this.a.p.b();
                errl errlVar7 = (errl) this.a.aK.b();
                errm errmVar2 = (errm) this.a.aK.b();
                akis akisVar47 = this.a;
                akhy akhyVar55 = this.b;
                akkp akkpVar49 = akisVar47.a;
                cjat m166if = akkpVar49.m166if();
                ciyg id = akkpVar49.id();
                cjcf ig = akkpVar49.ig();
                cjam cjamVar = (cjam) akhyVar55.gO.b();
                akis akisVar48 = this.a;
                akhy akhyVar56 = this.b;
                ciyy cg = akisVar48.cg();
                ayfg ayfgVar = (ayfg) akhyVar56.an.b();
                Optional optional2 = (Optional) this.a.a.aQ.b();
                akis akisVar49 = this.a;
                cqoh cqohVar7 = (cqoh) akisVar49.cz.b();
                cjad cjadVar = (cjad) this.a.a.Iy.b();
                cjcj cjcjVar = (cjcj) this.a.jS.b();
                akhy akhyVar57 = this.b;
                akkp akkpVar50 = this.a.a;
                cjci dy = akhyVar57.dy();
                ciyv dx = akhyVar57.dx();
                Optional optional3 = (Optional) akkpVar50.ag.b();
                akis akisVar50 = this.a;
                akhy akhyVar58 = this.b;
                fbbf fbbfVar99 = akisVar50.a.sY;
                Optional empty = Optional.empty();
                ciwj ciwjVar = (ciwj) akhyVar58.al.b();
                akis akisVar51 = this.a;
                akhy akhyVar59 = this.b;
                akkp akkpVar51 = akisVar51.a;
                return new cizx(context7, errlVar6, errlVar7, errmVar2, m166if, id, ig, cjamVar, cg, ayfgVar, optional2, akisVar49.a.Pj, cqohVar7, cjadVar, cjcjVar, dy, dx, optional3, fbbfVar99, empty, ciwjVar, Optional.of(akisVar51.os), akkpVar51.C, akhyVar59.gT, akhyVar59.P);
            case 86:
                return new cjan((Context) this.a.q.b(), (ciwb) this.b.gN.b(), (Optional) this.a.a.aQ.b());
            case 87:
                return new ciwb((Context) this.a.q.b(), this.a.a.an, this.b.gM);
            case 88:
                akkp akkpVar52 = this.a.a;
                cixf cixfVar = cixf.NT_INCOMING_MESSAGE;
                civa civaVar = (civa) akkpVar52.px.b();
                akis akisVar52 = this.a;
                akhy akhyVar60 = this.b;
                fbbf fbbfVar100 = akisVar52.ou;
                return enhk.p(cixfVar, civaVar, cixf.NT_SAFETYCORE_MISSING, akisVar52.ci(), cixf.NT_SECONDARY_USER, akhyVar60.dz(), cixf.NT_SHARE_PDU, (civa) fbbfVar100.b(), cixf.NT_INCOMING_UNAPPROVED_MESSAGE, this.b.dA());
            case 89:
                akis akisVar53 = this.a;
                akhy akhyVar61 = this.b;
                akkp akkpVar53 = akisVar53.a;
                return new tuu(akkpVar53.iy, akhyVar61.am, akkpVar53.ld, akkpVar53.nV, akisVar53.cz);
            case 90:
                akis akisVar54 = this.a;
                fbbf fbbfVar101 = this.b.aE;
                fbbf fbbfVar102 = akisVar54.a.p;
                fbbf fbbfVar103 = akisVar54.jm;
                aqkp aqkpVar = (aqkp) fbbfVar101.b();
                aqly aqlyVar = (aqly) this.a.a.lV.b();
                return new cgie(akisVar54.cP, akisVar54.cn, fbbfVar102, fbbfVar103, akisVar54.cN, aqkpVar, aqlyVar);
            case 91:
                Context context8 = (Context) this.a.q.b();
                errl errlVar8 = (errl) this.a.p.b();
                errl errlVar9 = (errl) this.a.aK.b();
                akhy akhyVar62 = this.b;
                akis akisVar55 = this.a;
                arai ad = akhyVar62.ad();
                ctbk ctbkVar = (ctbk) akisVar55.hi.b();
                aolr aolrVar = (aolr) this.a.a.Z.b();
                akhy akhyVar63 = this.b;
                akkp akkpVar54 = this.a.a;
                aqhl aa = akhyVar63.aa();
                aqky aqkyVar = (aqky) akkpVar54.kp.b();
                akhy akhyVar64 = this.b;
                akis akisVar56 = this.a;
                akkp akkpVar55 = akisVar56.a;
                fbbf fbbfVar104 = akkpVar55.ma;
                fbbf fbbfVar105 = akkpVar55.mb;
                fbbf fbbfVar106 = akkpVar55.mc;
                fbbf fbbfVar107 = akhyVar64.W;
                fbbf fbbfVar108 = akkpVar55.ay;
                fbbf fbbfVar109 = akkpVar55.gX;
                Optional of8 = Optional.of(akhyVar64.ac());
                Optional of9 = Optional.of(this.b.gK);
                fbbf fbbfVar110 = this.a.ho;
                fbbf fbbfVar111 = akhyVar64.aD;
                return new aqjw(context8, errlVar8, errlVar9, ad, ctbkVar, aolrVar, aa, aqkyVar, akhyVar64.ay, fbbfVar104, fbbfVar105, fbbfVar106, akisVar56.cy, fbbfVar107, fbbfVar108, fbbfVar111, fbbfVar109, of8, of9, fbbfVar110);
            case 92:
                return elbz.a(this.a.ab.b(), this.a.aI, this.b.gS());
            case 93:
                akis akisVar57 = this.a;
                akhy akhyVar65 = this.b;
                akkp akkpVar56 = akisVar57.a;
                return new cjvr(akisVar57.p, akhyVar65.at, akkpVar56.p, akkpVar56.lJ, akkpVar56.gX, akkpVar56.lK, akkpVar56.lQ, akkpVar56.lR);
            case 94:
                return Optional.of(fbaz.a(this.b.as));
            case 95:
                return new cjux((ejiq) this.b.aq.b(), (ffsk) this.a.a.p.b(), (cqoh) this.a.cz.b(), (elho) this.b.ar.b());
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                dlpw dlpwVar = (dlpw) this.a.l.b();
                eyfc eyfcVar = (eyfc) this.a.b.gz.b();
                errl errlVar10 = (errl) this.a.p.b();
                this.b.ho();
                return cjul.a(dlpwVar, eyfcVar, errlVar10, cjuy.a(), this.b.fA());
            case 97:
                return new elho((elbx) this.b.ap.b());
            case 98:
                azac azacVar = (azac) this.a.a.kD.b();
                azac azacVar2 = (azac) this.a.a.kE.b();
                akis akisVar58 = this.a;
                fbbf fbbfVar112 = akisVar58.co;
                akkp akkpVar57 = akisVar58.a;
                return new azcf(azacVar, azacVar2, akkpVar57.kH, akkpVar57.u, (ffhd) fbbfVar112.b(), (ffsk) this.a.a.p.b(), (azpx) this.a.a.hB.b(), (azpo) this.a.a.he.b(), this.b.aw);
            case 99:
                azcn azcnVar = (azcn) this.b.av.b();
                azpx azpxVar = (azpx) this.a.a.hB.b();
                azac azacVar3 = (azac) this.a.it.b();
                azac azacVar4 = (azac) this.a.iu.b();
                akhy akhyVar66 = this.b;
                akkp akkpVar58 = this.a.a;
                fbbf fbbfVar113 = akhyVar66.P;
                fbbf fbbfVar114 = akkpVar58.G;
                ffsk ffskVar5 = (ffsk) akkpVar58.p.b();
                ffhd ffhdVar3 = (ffhd) this.a.cP.b();
                akis akisVar59 = this.a;
                return new azfe(azcnVar, azpxVar, azacVar3, azacVar4, fbbfVar113, fbbfVar114, ffskVar5, ffhdVar3, akisVar59.a.en(), (emar) akisVar59.iv.b(), this.a.a.el());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r8v10, types: [ampj, java.lang.Object] */
    private final Object c() {
        Object aoyeVar;
        int i = this.c;
        switch (i) {
            case VCardConstants.DEFAULT_PREF /* 100 */:
                return new aqmk((ffsk) this.a.a.p.b(), (ffhd) this.a.cP.b(), this.b.ax);
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                akis akisVar = this.a;
                akhy akhyVar = this.b;
                akkp akkpVar = akisVar.a;
                fbbf fbbfVar = akkpVar.Z;
                fbbf fbbfVar2 = akhyVar.P;
                fbbf fbbfVar3 = akkpVar.kp;
                fbbf fbbfVar4 = akhyVar.W;
                dtuu dtuuVar = (dtuu) akkpVar.ay.b();
                akis akisVar2 = this.a;
                fbbf fbbfVar5 = akisVar2.a.aF;
                fazb a = fbaz.a(akisVar2.jn);
                fazb a2 = fbaz.a(this.a.jo);
                akkp akkpVar2 = this.a.a;
                return new bdso(fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, dtuuVar, fbbfVar5, a, a2, akkpVar2.hS, akkpVar2.aE, akkpVar2.hQ, akkpVar2.C, akkpVar2.w, akkpVar2.lX);
            case 102:
                aolr aolrVar = (aolr) this.a.a.Z.b();
                akkp akkpVar3 = this.a.a;
                fbbf fbbfVar6 = akkpVar3.md;
                fbbf fbbfVar7 = akkpVar3.kn;
                fbbf fbbfVar8 = akkpVar3.al;
                ffsk ffskVar = (ffsk) akkpVar3.q.b();
                akis akisVar3 = this.a;
                akhy akhyVar2 = this.b;
                akkp akkpVar4 = akisVar3.a;
                return new aqqu(aolrVar, fbbfVar6, fbbfVar7, fbbfVar8, ffskVar, akkpVar4.c, akkpVar4.mh, akkpVar4.mi, akkpVar4.kG, akisVar3.cN, akhyVar2.aA, akhyVar2.aC, akkpVar4.bi, akkpVar4.il, akkpVar4.mp, akkpVar4.mn);
            case 103:
                akis akisVar4 = this.a;
                fbbf fbbfVar9 = akisVar4.aK;
                fbbf fbbfVar10 = akisVar4.a.hR;
                errl errlVar = (errl) fbbfVar9.b();
                errl errlVar2 = (errl) this.a.t.b();
                errl errlVar3 = (errl) this.a.p.b();
                fazb a3 = fbaz.a(this.a.a.hS);
                akis akisVar5 = this.a;
                fbbf fbbfVar11 = akisVar5.cN;
                fbbf fbbfVar12 = akisVar5.a.ay;
                ecrj ecrjVar = (ecrj) fbbfVar11.b();
                akhy akhyVar3 = this.b;
                akis akisVar6 = this.a;
                akkp akkpVar5 = akisVar6.a;
                return new ayxm(fbbfVar10, errlVar, errlVar2, errlVar3, a3, fbbfVar12, ecrjVar, akhyVar3.P, akkpVar5.C, akkpVar5.hT, akkpVar5.L, akhyVar3.az, akkpVar5.w, akisVar6.hw, akkpVar5.H, akkpVar5.hV, akkpVar5.hW);
            case 104:
                return new ayhu(this.b.P, this.a.a.L);
            case 105:
                Context context = (Context) this.a.q.b();
                ffhd ffhdVar = (ffhd) this.a.co.b();
                akis akisVar7 = this.a;
                fbbf fbbfVar13 = akisVar7.a.aq;
                Executor executor = (Executor) akisVar7.p.b();
                ejtr ejtrVar = (ejtr) this.b.aB.b();
                akkp akkpVar6 = this.a.a;
                return new axyy(context, ffhdVar, fbbfVar13, akisVar7.cP, executor, ejtrVar, akkpVar6.mj, akkpVar6.mk, akkpVar6.ml, akkpVar6.mm, akkpVar6.mn);
            case 106:
                akis akisVar8 = this.a;
                return new ejtr(akisVar8.ep(), (Context) akisVar8.q.b(), (ejvp) this.a.aR.b(), (errl) this.a.aK.b(), (dlpw) this.a.l.b(), (elbx) this.b.ap.b(), (Executor) this.a.a.m.b());
            case 107:
                return Optional.of(this.b.dT());
            case 108:
                akhy akhyVar4 = this.b;
                akis akisVar9 = this.a;
                fbbf fbbfVar14 = akisVar9.cz;
                akkp akkpVar7 = akisVar9.a;
                amiz M = akhyVar4.M();
                fbbf fbbfVar15 = akhyVar4.gi;
                ?? fj = akisVar9.fj();
                fbbf fbbfVar16 = akkpVar7.wO;
                fbbf fbbfVar17 = akhyVar4.gj;
                fbbf fbbfVar18 = akhyVar4.O;
                fbbf fbbfVar19 = akhyVar4.gl;
                fbbf fbbfVar20 = akhyVar4.P;
                fbbf fbbfVar21 = akhyVar4.gn;
                fbbf fbbfVar22 = akhyVar4.gu;
                fbbf fbbfVar23 = akkpVar7.xe;
                fbbf fbbfVar24 = akhyVar4.gv;
                fbbf fbbfVar25 = akhyVar4.gw;
                fbbf fbbfVar26 = akkpVar7.xm;
                fbbf fbbfVar27 = akhyVar4.gd;
                fbbf fbbfVar28 = akkpVar7.br;
                cqoh cqohVar = (cqoh) fbbfVar14.b();
                errl errlVar4 = (errl) this.a.p.b();
                errl errlVar5 = (errl) this.a.t.b();
                errl errlVar6 = (errl) this.a.aK.b();
                cbwj cbwjVar = (cbwj) this.a.a.kG.b();
                ckqj ckqjVar = (ckqj) this.b.gx.b();
                akhy akhyVar5 = this.b;
                fbbf fbbfVar29 = akhyVar5.aK;
                fbbf fbbfVar30 = akhyVar5.gy;
                fbbf fbbfVar31 = akhyVar5.dK;
                amsk amskVar = (amsk) fbbfVar29.b();
                akhy akhyVar6 = this.b;
                akkp akkpVar8 = this.a.a;
                return new amkx(M, fbbfVar15, fj, fbbfVar16, fbbfVar17, fbbfVar18, fbbfVar19, fbbfVar20, fbbfVar21, fbbfVar22, akhyVar4.cD, akhyVar4.aL, fbbfVar23, fbbfVar24, fbbfVar25, fbbfVar26, fbbfVar27, fbbfVar28, cqohVar, errlVar4, errlVar5, errlVar6, cbwjVar, ckqjVar, fbbfVar30, akhyVar5.cn, fbbfVar31, amskVar, akhyVar6.gA, akhyVar6.gB, akkpVar8.wL, akkpVar8.xA, akhyVar6.gC, akkpVar8.xC, akkpVar8.xE, akhyVar6.gD, akhyVar6.gF, akhyVar6.gG, akhyVar6.gI, (atbw) akkpVar8.ry.b(), this.b.gJ);
            case 109:
                akis akisVar10 = this.a;
                akhy akhyVar7 = this.b;
                fbbf fbbfVar32 = akisVar10.hi;
                fbbf fbbfVar33 = akisVar10.q;
                fbbf fbbfVar34 = akisVar10.p;
                fbbf fbbfVar35 = akisVar10.aK;
                fbbf fbbfVar36 = akisVar10.iE;
                fbbf fbbfVar37 = akhyVar7.M;
                akkp akkpVar9 = akisVar10.a;
                return new amhp(fbbfVar32, fbbfVar33, fbbfVar34, fbbfVar35, fbbfVar36, fbbfVar37, akhyVar7.aK, akkpVar9.Z, akkpVar9.mL, akkpVar9.Q, akkpVar9.le, akhyVar7.aE, akkpVar9.bR, akkpVar9.mM, akkpVar9.lW, akkpVar9.mO, akkpVar9.mN);
            case 110:
                akhy akhyVar8 = this.b;
                akis akisVar11 = this.a;
                akkp akkpVar10 = akisVar11.a;
                return new amsk(akhyVar8.aJ, akkpVar10.mC, akkpVar10.aq, akkpVar10.q, akisVar11.jq, akisVar11.jr);
            case 111:
                akis akisVar12 = this.a;
                akhy akhyVar9 = this.b;
                akkp akkpVar11 = akisVar12.a;
                return new amtb(akkpVar11.p, akkpVar11.q, akisVar12.hi, akisVar12.iE, akhyVar9.aI, akkpVar11.G, akkpVar11.kP);
            case 112:
                return Optional.of(this.b.dB());
            case 113:
                akis akisVar13 = this.a;
                akhy akhyVar10 = this.b;
                akkp akkpVar12 = akisVar13.a;
                return new cppk(akisVar13.jp, akkpVar12.au, akhyVar10.aG, (akzt) akkpVar12.C.b());
            case 114:
                ffsk ffskVar2 = (ffsk) this.a.a.aq.b();
                ffsk ffskVar3 = (ffsk) this.a.a.p.b();
                lap lapVar = (lap) this.a.a.mw.b();
                akis akisVar14 = this.a;
                akhy akhyVar11 = this.b;
                akkp akkpVar13 = akisVar14.a;
                return new cjfw(ffskVar2, ffskVar3, lapVar, akkpVar13.as, akisVar14.aR, akhyVar11.ao, akhyVar11.aE, akkpVar13.Z);
            case 115:
                this.b.hi();
                aoye aoyeVar2 = (aoye) this.b.fO.b();
                aozh.a(aoyeVar2);
                return aoyeVar2;
            case 116:
                ffsk ffskVar4 = (ffsk) this.a.a.p.b();
                akis akisVar15 = this.a;
                return new apbl(ffskVar4, akisVar15.in, akisVar15.jt, (aoye) this.b.fO.b(), this.b.fx);
            case 117:
                akis akisVar16 = this.a;
                akhy akhyVar12 = this.b;
                fbbf fbbfVar38 = akisVar16.hi;
                fbbf fbbfVar39 = akisVar16.p;
                fbbf fbbfVar40 = akisVar16.t;
                akkp akkpVar14 = akisVar16.a;
                aoyeVar = new aoye(fbbfVar38, fbbfVar39, fbbfVar40, akisVar16.aK, akhyVar12.ff, akhyVar12.fw, akkpVar14.qZ, akkpVar14.ra, akhyVar12.fx, akhyVar12.fy, akhyVar12.fC, akisVar16.kp, akisVar16.kq, akkpVar14.rT, akisVar16.jt, akhyVar12.fo, akisVar16.hu, akhyVar12.fD, akhyVar12.al, akisVar16.jS, akhyVar12.fm, akkpVar14.rV, akhyVar12.fF, akhyVar12.fG, akkpVar14.gp, akkpVar14.sd, akisVar16.ku, akkpVar14.sf, akkpVar14.jU, akkpVar14.sj, akhyVar12.fH, akkpVar14.so, akhyVar12.fr, akkpVar14.st, akisVar16.cz, akhyVar12.fJ, akhyVar12.bq, akisVar16.ky, akkpVar14.sw, akisVar16.ko, akkpVar14.sy, akisVar16.kz, akkpVar14.sz, akhyVar12.cz, akhyVar12.fK, akkpVar14.hh, akhyVar12.fL, akisVar16.kA, akkpVar14.sD, akkpVar14.sE, akhyVar12.fN);
                break;
            case 118:
                akis akisVar17 = this.a;
                akhy akhyVar13 = this.b;
                akkp akkpVar15 = akisVar17.a;
                return new apfv(akisVar17.p, akisVar17.hu, akkpVar15.mR, akhyVar13.aP, akhyVar13.aQ, akhyVar13.bd, akhyVar13.fe, fbbg.a(akisVar17.cz), akkpVar15.nM);
            case 119:
                akis akisVar18 = this.a;
                akhy akhyVar14 = this.b;
                akkp akkpVar16 = akisVar18.a;
                return new apgz(akisVar18.hi, akisVar18.p, akisVar18.t, akkpVar16.mK, akisVar18.aO, akkpVar16.Q, akkpVar16.mJ, akhyVar14.aE, akkpVar16.mS, fbbg.a(akhyVar14.aN), akkpVar16.mV, akkpVar16.lW, akkpVar16.mW, akkpVar16.mX, akhyVar14.aO, akkpVar16.mZ);
            case 120:
                errl errlVar7 = (errl) this.a.aK.b();
                akhy akhyVar15 = this.b;
                akis akisVar19 = this.a;
                return new amib(errlVar7, akhyVar15.aM, akisVar19.a.fP, akisVar19.cz);
            case 121:
                return new amna(this.b.aM, (ffsk) this.a.a.p.b());
            case 122:
                akis akisVar20 = this.a;
                akhy akhyVar16 = this.b;
                akkp akkpVar17 = akisVar20.a;
                return new aoam(akkpVar17.ld, akhyVar16.aU, akhyVar16.aW, akisVar20.cP, akhyVar16.aT, akhyVar16.aV, akhyVar16.aX, akhyVar16.aY, akhyVar16.aS, akhyVar16.bc, akkpVar17.p);
            case 123:
                akis akisVar21 = this.a;
                akhy akhyVar17 = this.b;
                akkp akkpVar18 = akisVar21.a;
                return new anzv(akkpVar18.p, akkpVar18.aq, akisVar21.hi, akhyVar17.aT, akkpVar18.nt, akkpVar18.nu);
            case 124:
                akis akisVar22 = this.a;
                akhy akhyVar18 = this.b;
                akkp akkpVar19 = akisVar22.a;
                return new anyg(akkpVar19.p, akisVar22.hi, akisVar22.iE, akkpVar19.nn, akkpVar19.np, akhyVar18.aR, akhyVar18.aS);
            case 125:
                return new ctrg((ffhd) this.a.co.b(), (ffhd) this.a.cP.b(), this.b.fj(), (cqoh) this.a.cz.b());
            case 126:
                return new ctrc((ffsk) this.a.a.q.b(), (ffhd) this.a.co.b(), (ffsk) this.a.a.p.b(), (ffhd) this.a.cn.b(), (cqoh) this.a.cz.b(), this.b.O, (dtuu) this.a.a.ay.b(), this.a.jA);
            case 127:
                akis akisVar23 = this.a;
                akhy akhyVar19 = this.b;
                akkp akkpVar20 = akisVar23.a;
                return new aoaj(akkpVar20.p, akkpVar20.aq, akisVar23.hi, akhyVar19.aV, akkpVar20.nx, akkpVar20.ny);
            case 128:
                akis akisVar24 = this.a;
                akhy akhyVar20 = this.b;
                akkp akkpVar21 = akisVar24.a;
                return new anyz(akisVar24.q, akkpVar21.p, akisVar24.hi, akisVar24.iE, akkpVar21.nn, akkpVar21.np, akhyVar20.aR, akhyVar20.aS);
            case 129:
                akis akisVar25 = this.a;
                return new anxe(akisVar25.a.p, akisVar25.hi, akisVar25.iE, this.b.aR);
            case 130:
                akis akisVar26 = this.a;
                return new anxn(akisVar26.a.p, akisVar26.hi, akisVar26.iE, this.b.aR);
            case 131:
                return Optional.of((ctjh) this.b.bb.b());
            case 132:
                akhy akhyVar21 = this.b;
                fbbf fbbfVar41 = this.a.co;
                fbbf fbbfVar42 = akhyVar21.S;
                ffhd ffhdVar2 = (ffhd) fbbfVar41.b();
                ffhd ffhdVar3 = (ffhd) this.a.cn.b();
                ffsk ffskVar5 = (ffsk) this.a.a.q.b();
                ffsk ffskVar6 = (ffsk) this.a.a.p.b();
                akhy akhyVar22 = this.b;
                akkp akkpVar22 = this.a.a;
                return new ctko(fbbfVar42, akhyVar21.aS, ffhdVar2, ffhdVar3, ffskVar5, ffskVar6, akhyVar22.ba, akkpVar22.nj, akkpVar22.nD);
            case 133:
                ffhd ffhdVar4 = (ffhd) this.a.co.b();
                akis akisVar27 = this.a;
                akhy akhyVar23 = this.b;
                return new ctoo(ffhdVar4, akisVar27.cz, akhyVar23.S, akhyVar23.W, akisVar27.aO, akhyVar23.aS, akhyVar23.aZ);
            case 134:
                return new airu((ffhd) this.a.co.b(), (ffsk) this.a.a.p.b(), (cbwj) this.a.a.kG.b(), (cqoh) this.a.cz.b(), this.a.a.Dn, this.b.S);
            case 135:
                akhy akhyVar24 = this.b;
                akis akisVar28 = this.a;
                akkp akkpVar23 = akisVar28.a;
                return new aply(akhyVar24.fc, akkpVar23.nK, akkpVar23.p, akisVar28.co, akisVar28.cz, akhyVar24.fd);
            case 136:
                akis akisVar29 = this.a;
                fbbf fbbfVar43 = this.b.cj;
                fbbf fbbfVar44 = akisVar29.fM;
                couo couoVar = (couo) fbbfVar43.b();
                akis akisVar30 = this.a;
                akhy akhyVar25 = this.b;
                cozz cv = akisVar30.cv();
                akkp akkpVar24 = akisVar30.a;
                return new cpaa(fbbfVar44, couoVar, cv, akhyVar25.aF, akkpVar24.br, akkpVar24.gE);
            case 137:
                avkj avkjVar = (avkj) this.b.bj.b();
                awtm awtmVar = (awtm) this.a.iz.b();
                avtu avtuVar = (avtu) this.a.lD.b();
                avla avlaVar = (avla) this.a.lC.b();
                akis akisVar31 = this.a;
                fbbf fbbfVar45 = akisVar31.aK;
                akkp akkpVar25 = akisVar31.a;
                fbbf fbbfVar46 = akkpVar25.uL;
                fbbf fbbfVar47 = akkpVar25.nK;
                fbbf fbbfVar48 = akkpVar25.kR;
                errl errlVar8 = (errl) fbbfVar45.b();
                akis akisVar32 = this.a;
                return new couo(avkjVar, awtmVar, avtuVar, avlaVar, fbbfVar46, fbbfVar47, fbbfVar48, errlVar8, akisVar32.a.yq, (avuh) akisVar32.hd.b(), (cslr) this.a.iq.b(), (avtx) this.a.jE.b(), (cpev) this.a.a.gp.b());
            case 138:
                return new awtl(this.b.gM(), this.a.a.cG);
            case 139:
                akis akisVar33 = this.a;
                akhy akhyVar26 = this.b;
                clgs co = akisVar33.co();
                Object gm = akhyVar26.gm();
                club clubVar = (club) akhyVar26.eG.b();
                akhy akhyVar27 = this.b;
                Object go = akhyVar27.go();
                clue clueVar = (clue) akhyVar27.eH.b();
                akhy akhyVar28 = this.b;
                Object fP = akhyVar28.fP();
                clti cltiVar = (clti) akhyVar28.eI.b();
                akhy akhyVar29 = this.b;
                clev ed = akhyVar29.ed();
                cltm cltmVar = (cltm) akhyVar29.eJ.b();
                akhy akhyVar30 = this.b;
                clhl ee = akhyVar30.ee();
                clty cltyVar = (clty) akhyVar30.eK.b();
                akhy akhyVar31 = this.b;
                clid eg = akhyVar31.eg();
                clun clunVar = (clun) akhyVar31.eL.b();
                akhy akhyVar32 = this.b;
                clia ef = akhyVar32.ef();
                cluk clukVar = (cluk) akhyVar32.eM.b();
                akis akisVar34 = this.a;
                return new clhh(co, (clhp) gm, clubVar, (clhx) go, clueVar, (cles) fP, cltiVar, ed, cltmVar, ee, cltyVar, eg, clunVar, ef, clukVar, akisVar34.a.jg(), (errl) akisVar34.p.b());
            case 140:
                akis akisVar35 = this.a;
                akhy akhyVar33 = this.b;
                akkp akkpVar26 = akisVar35.a;
                fbbf fbbfVar49 = akkpVar26.u;
                fbbf fbbfVar50 = akhyVar33.eb;
                awnv ao = akhyVar33.ao();
                awnw ap = akhyVar33.ap();
                fbbf fbbfVar51 = akkpVar26.wM;
                awgx al = akhyVar33.al();
                awgq ai = akhyVar33.ai();
                awgv ak = akhyVar33.ak();
                awgt aj = akhyVar33.aj();
                akvz akvzVar = (akvz) akkpVar26.dE.b();
                akis akisVar36 = this.a;
                fbbf fbbfVar52 = akisVar36.a.uL;
                errl errlVar9 = (errl) akisVar36.t.b();
                errl errlVar10 = (errl) this.a.p.b();
                akis akisVar37 = this.a;
                clie jg = akisVar37.a.jg();
                avuh avuhVar = (avuh) akisVar37.hd.b();
                cetc cetcVar = (cetc) this.a.a.yh.b();
                akis akisVar38 = this.a;
                akhy akhyVar34 = this.b;
                akkp akkpVar27 = akisVar38.a;
                return new awoo(fbbfVar49, fbbfVar50, ao, ap, fbbfVar51, al, ai, ak, aj, akvzVar, fbbfVar52, errlVar9, errlVar10, jg, avuhVar, cetcVar, akkpVar27.f, akhyVar34.eD, akkpVar27.wL, akhyVar34.eF, akkpVar27.xC, akkpVar27.xD, (atmb) akkpVar27.kS.b());
            case 141:
                bbfr bbfrVar = (bbfr) this.b.bs.b();
                cfyt cfytVar = (cfyt) this.a.a.cf.b();
                akhy akhyVar35 = this.b;
                akis akisVar39 = this.a;
                akkp akkpVar28 = akisVar39.a;
                fbbf fbbfVar53 = akhyVar35.S;
                fbbf fbbfVar54 = akkpVar28.fP;
                cnkb ez = akhyVar35.ez();
                avla avlaVar2 = (avla) akisVar39.lC.b();
                avtu avtuVar2 = (avtu) this.a.lD.b();
                akis akisVar40 = this.a;
                akhy akhyVar36 = this.b;
                fbbf fbbfVar55 = akisVar40.a.Bu;
                fbbf fbbfVar56 = akhyVar36.ea;
                Map iU = akis.iU();
                errl errlVar11 = (errl) akisVar40.p.b();
                errl errlVar12 = (errl) this.a.aK.b();
                akis akisVar41 = this.a;
                fbbf fbbfVar57 = akisVar41.cz;
                akkp akkpVar29 = akisVar41.a;
                fbbf fbbfVar58 = akkpVar29.yq;
                fbbf fbbfVar59 = akkpVar29.yk;
                cqoh cqohVar2 = (cqoh) fbbfVar57.b();
                autk autkVar = (autk) this.a.a.Bn.b();
                return new awrg(bbfrVar, cfytVar, fbbfVar53, fbbfVar54, ez, avlaVar2, avtuVar2, fbbfVar55, fbbfVar56, iU, errlVar11, errlVar12, fbbfVar58, fbbfVar59, cqohVar2, autkVar, this.a.a.kR);
            case 142:
                return new baoj(this.b.dY, this.a.a.Bt);
            case 143:
                Context context2 = (Context) this.a.q.b();
                covr covrVar = (covr) this.a.a.iM.b();
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                coxk coxkVar = (coxk) this.a.a.iN.b();
                cpbs cpbsVar = (cpbs) this.a.a.ft.b();
                akhy akhyVar37 = this.b;
                akkp akkpVar30 = this.a.a;
                Object b = akhyVar37.bt.b();
                fbbf fbbfVar60 = akhyVar37.S;
                bdtd bdtdVar = (bdtd) akkpVar30.aO.b();
                dtuu dtuuVar2 = (dtuu) this.a.a.ay.b();
                akkp akkpVar31 = this.a.a;
                fbbf fbbfVar61 = akkpVar31.Q;
                fbbf fbbfVar62 = akkpVar31.yg;
                aslt asltVar = (aslt) akkpVar31.iL.b();
                akis akisVar42 = this.a;
                return baok.a(context2, covrVar, cqohVar3, coxkVar, cpbsVar, b, fbbfVar60, bdtdVar, dtuuVar2, fbbfVar61, fbbfVar62, asltVar, akisVar42.a.al, (errl) akisVar42.aK.b());
            case 144:
                akhy akhyVar38 = this.b;
                akkp akkpVar32 = this.a.a;
                fbbf fbbfVar63 = akhyVar38.P;
                fbbf fbbfVar64 = akhyVar38.ab;
                fbbf fbbfVar65 = akhyVar38.S;
                altk altkVar = (altk) akkpVar32.fP.b();
                ctvb ctvbVar = (ctvb) this.a.a.u.b();
                cpdg cpdgVar = (cpdg) this.a.a.ap.b();
                Optional optional = (Optional) this.b.be.b();
                akzt akztVar = (akzt) this.a.a.f.b();
                ckds ckdsVar = (ckds) this.a.a.dp.b();
                cvlf cvlfVar = (cvlf) this.b.bg.b();
                cqoh cqohVar4 = (cqoh) this.a.cz.b();
                cpbs cpbsVar2 = (cpbs) this.a.a.ft.b();
                cins cinsVar = (cins) this.a.a.jc.b();
                covo covoVar = (covo) this.a.a.jd.b();
                aliv alivVar = (aliv) this.a.ig.b();
                cisl cislVar = (cisl) this.b.bh.b();
                bbfq bbfqVar = (bbfq) this.b.bi.b();
                bdvi bdviVar = (bdvi) this.b.bn.b();
                bbhf bbhfVar = (bbhf) this.b.dg.b();
                Optional optional2 = (Optional) this.a.a.Bo.b();
                Optional of = Optional.of(this.b.eq());
                csrv csrvVar = (csrv) this.a.a.iK.b();
                akis akisVar43 = this.a;
                akhy akhyVar39 = this.b;
                fbbf fbbfVar66 = akisVar43.a.Bp;
                cbgf cbgfVar = (cbgf) akhyVar39.O.b();
                Optional of2 = Optional.of((cpdd) this.a.a.jo.b());
                akkp akkpVar33 = this.a.a;
                bbbo eJ = akkpVar33.eJ();
                bbbr bbbrVar = (bbbr) akkpVar33.xP.b();
                akhy akhyVar40 = this.b;
                akis akisVar44 = this.a;
                akkp akkpVar34 = akisVar44.a;
                fbbf fbbfVar67 = akkpVar34.eo;
                fbbf fbbfVar68 = akkpVar34.aO;
                fbbf fbbfVar69 = akkpVar34.iz;
                errl errlVar13 = (errl) akisVar44.t.b();
                alwb alwbVar = (alwb) this.a.mg.b();
                cpez cpezVar = (cpez) this.a.a.xT.b();
                akis akisVar45 = this.a;
                fbbf fbbfVar70 = akisVar45.aK;
                akkp akkpVar35 = akisVar45.a;
                fbbf fbbfVar71 = akkpVar35.xU;
                fbbf fbbfVar72 = akkpVar35.pP;
                fbbf fbbfVar73 = akkpVar35.sl;
                errl errlVar14 = (errl) fbbfVar70.b();
                azei azeiVar = (azei) this.a.a.sm.b();
                akis akisVar46 = this.a;
                fbbf fbbfVar74 = this.b.cf;
                fbbf fbbfVar75 = akisVar46.a.pK;
                cmlm cmlmVar = (cmlm) fbbfVar74.b();
                akis akisVar47 = this.a;
                akhy akhyVar41 = this.b;
                akkp akkpVar36 = akisVar47.a;
                fbbf fbbfVar76 = akkpVar36.fq;
                fbbf fbbfVar77 = akkpVar36.iN;
                bdge aF = akhyVar41.aF();
                asvn asvnVar = (asvn) akkpVar36.Q.b();
                akkp akkpVar37 = this.a.a;
                fbbf fbbfVar78 = akkpVar37.Bq;
                asmj asmjVar = (asmj) akkpVar37.jD.b();
                akkp akkpVar38 = this.a.a;
                return new baxz(fbbfVar63, fbbfVar64, fbbfVar65, altkVar, ctvbVar, cpdgVar, optional, akztVar, ckdsVar, cvlfVar, cqohVar4, cpbsVar2, cinsVar, covoVar, alivVar, cislVar, bbfqVar, bdviVar, bbhfVar, optional2, of, csrvVar, fbbfVar66, cbgfVar, of2, eJ, bbbrVar, akhyVar40.ch, fbbfVar67, fbbfVar68, fbbfVar69, errlVar13, alwbVar, cpezVar, fbbfVar71, fbbfVar72, fbbfVar73, errlVar14, azeiVar, fbbfVar75, cmlmVar, fbbfVar76, fbbfVar77, aF, asvnVar, fbbfVar78, asmjVar, akkpVar38.jF, akkpVar38.hJ, akkpVar38.fO);
            case 145:
                return Optional.of(this.b.v());
            case 146:
                return new cvlf(this.b.P, (altk) this.a.a.fP.b(), (cbgf) this.b.O.b(), (dtuu) this.a.a.ay.b(), (cqoh) this.a.cz.b(), (errl) this.a.t.b());
            case 147:
                return new bdga(this.a.a.f, this.b.ac);
            case 148:
                return new cisl(this.a.a.cc);
            case 149:
                return new bbfq((cqoh) this.a.cz.b(), this.b.aC());
            case 150:
                return new ckce((ffhd) this.a.co.b(), (ffsk) this.a.a.p.b(), this.b.bj, this.a.a.C);
            case 151:
                Context context3 = (Context) this.a.q.b();
                ctvb ctvbVar2 = (ctvb) this.a.a.u.b();
                ctwb ctwbVar = (ctwb) this.a.a.c.b();
                cpbs cpbsVar3 = (cpbs) this.a.a.ft.b();
                akis akisVar48 = this.a;
                akhy akhyVar42 = this.b;
                akkp akkpVar39 = akisVar48.a;
                return new bdvi(context3, ctvbVar2, ctwbVar, cpbsVar3, akkpVar39.sY, akhyVar42.bm, akisVar48.kk, (crnx) akkpVar39.Df.b());
            case 152:
                return new cgst(this.b.t(), (errl) this.a.p.b());
            case 153:
                return new aknr(this.b.I(), (errl) this.a.p.b());
            case 154:
                Context context4 = (Context) this.a.q.b();
                cqoh cqohVar5 = (cqoh) this.a.cz.b();
                akhy akhyVar43 = this.b;
                akkp akkpVar40 = this.a.a;
                return new bbhf(context4, cqohVar5, akhyVar43.W, akhyVar43.P, akhyVar43.X, akkpVar40.aO, akhyVar43.br, (altk) akkpVar40.fP.b(), fbaz.a(this.a.a.iN), Optional.of((cpbz) this.a.a.ji.b()), (bbge) this.b.dX.b(), (dtuu) this.a.a.ay.b(), (csrv) this.a.a.iK.b(), (aolr) this.a.a.Z.b(), (cbut) this.b.df.b(), (Optional) this.a.a.pg.b(), (cmlm) this.b.cf.b(), this.b.bh, this.a.a.Bn);
            case 155:
                akhy akhyVar44 = this.b;
                akis akisVar49 = this.a;
                akkp akkpVar41 = akisVar49.a;
                fbbf fbbfVar79 = akhyVar44.S;
                fbbf fbbfVar80 = akhyVar44.P;
                fbbf fbbfVar81 = akkpVar41.fO;
                fbbf fbbfVar82 = akkpVar41.Z;
                fbbf fbbfVar83 = akkpVar41.fP;
                fbbf fbbfVar84 = akkpVar41.aO;
                errl errlVar15 = (errl) akisVar49.p.b();
                errl errlVar16 = (errl) this.a.aK.b();
                akkp akkpVar42 = this.a.a;
                return new ameo(fbbfVar79, fbbfVar80, fbbfVar81, fbbfVar82, fbbfVar83, fbbfVar84, akhyVar44.bq, errlVar15, errlVar16, akkpVar42.ay, akkpVar42.bQ(), akkpVar42.hJ, (asvn) akkpVar42.Q.b());
            case 156:
                bdmr bdmrVar = (bdmr) this.b.bp.b();
                aqvh aqvhVar = (aqvh) this.b.M.b();
                csjk csjkVar = (csjk) this.a.a.el.b();
                errl errlVar17 = (errl) this.a.t.b();
                errl errlVar18 = (errl) this.a.p.b();
                errl errlVar19 = (errl) this.a.aK.b();
                ctyx ctyxVar = (ctyx) this.a.aU.b();
                akhy akhyVar45 = this.b;
                akkp akkpVar43 = this.a.a;
                return new aqgw(bdmrVar, aqvhVar, csjkVar, errlVar17, errlVar18, errlVar19, ctyxVar, akhyVar45.az(), akkpVar43.fP, akhyVar45.P, akhyVar45.S, akkpVar43.hH, akkpVar43.cE());
            case 157:
                return new bdmr(this.b.bo, this.a.a.dp);
            case 158:
                akhy akhyVar46 = this.b;
                akkp akkpVar44 = this.a.a;
                fbbf fbbfVar85 = akhyVar46.P;
                fbbf fbbfVar86 = akkpVar44.dR;
                fbbf fbbfVar87 = akkpVar44.fQ;
                fbbf fbbfVar88 = akkpVar44.fR;
                ctyw ctywVar = (ctyw) akkpVar44.fu.b();
                akkp akkpVar45 = this.a.a;
                return new bcvw(fbbfVar85, fbbfVar86, fbbfVar87, fbbfVar88, ctywVar, akkpVar45.c, akkpVar45.fw, akkpVar45.br, akkpVar45.al, (azaw) akkpVar45.gA.b(), (errl) this.a.aK.b());
            case 159:
                akis akisVar50 = this.a;
                akhy akhyVar47 = this.b;
                fbbf fbbfVar89 = akisVar50.q;
                akkp akkpVar46 = akisVar50.a;
                fbbf fbbfVar90 = akhyVar47.bs;
                fbbf fbbfVar91 = akkpVar46.br;
                fbbf fbbfVar92 = akhyVar47.ak;
                fbbf fbbfVar93 = akkpVar46.aO;
                fbbf fbbfVar94 = akhyVar47.bt;
                fbbf fbbfVar95 = akkpVar46.iN;
                fbbf fbbfVar96 = akkpVar46.AL;
                fbbf fbbfVar97 = akisVar50.cz;
                fbbf fbbfVar98 = akkpVar46.fP;
                fbbf fbbfVar99 = akkpVar46.di;
                fbbf fbbfVar100 = akkpVar46.c;
                fbbf fbbfVar101 = akhyVar47.bD;
                fbbf fbbfVar102 = akkpVar46.ds;
                fbbf fbbfVar103 = akkpVar46.AN;
                fbbf fbbfVar104 = akkpVar46.iK;
                fbbf fbbfVar105 = akkpVar46.fJ;
                fbbf fbbfVar106 = akisVar50.aK;
                fbbf fbbfVar107 = akisVar50.cI;
                fbbf fbbfVar108 = akisVar50.me;
                fbbf fbbfVar109 = akkpVar46.AQ;
                fbbf fbbfVar110 = akhyVar47.bO;
                fbbf fbbfVar111 = akhyVar47.ck;
                fbbf fbbfVar112 = akkpVar46.AS;
                fbbf fbbfVar113 = akkpVar46.AT;
                fbbf fbbfVar114 = akkpVar46.nK;
                fbbf fbbfVar115 = akhyVar47.ct;
                fbbf fbbfVar116 = akhyVar47.bp;
                fbbf fbbfVar117 = akkpVar46.eT;
                fbbf fbbfVar118 = akisVar50.mf;
                fbbf fbbfVar119 = akkpVar46.pd;
                fbbf fbbfVar120 = akkpVar46.xP;
                fbbf fbbfVar121 = akhyVar47.ai;
                fbbf fbbfVar122 = akkpVar46.Z;
                fbbf fbbfVar123 = akkpVar46.gp;
                fbbf fbbfVar124 = akisVar50.mg;
                fbbf fbbfVar125 = akkpVar46.AX;
                fbbf fbbfVar126 = akkpVar46.Q;
                fbbf fbbfVar127 = akhyVar47.cv;
                fbbf fbbfVar128 = akhyVar47.cf;
                fbbf fbbfVar129 = akhyVar47.dj;
                fbbf fbbfVar130 = akkpVar46.yg;
                fbbf fbbfVar131 = akkpVar46.oQ;
                fbbf fbbfVar132 = akhyVar47.dT;
                fbbf fbbfVar133 = akkpVar46.oz;
                fbbf fbbfVar134 = akhyVar47.S;
                fbbf fbbfVar135 = akkpVar46.al;
                fbbf fbbfVar136 = akkpVar46.pa;
                fbbf fbbfVar137 = akkpVar46.Bi;
                fbbf fbbfVar138 = akhyVar47.dV;
                fbbf fbbfVar139 = akkpVar46.yu;
                fbbf fbbfVar140 = akisVar50.iq;
                fbbf fbbfVar141 = akhyVar47.dp;
                fbbf fbbfVar142 = akhyVar47.dW;
                fbbf fbbfVar143 = akhyVar47.cu;
                aoyeVar = new baws(fbbfVar89, fbbfVar90, fbbfVar91, fbbfVar92, fbbfVar93, fbbfVar94, fbbfVar95, fbbfVar96, fbbfVar97, fbbfVar98, fbbfVar99, fbbfVar100, fbbfVar101, fbbfVar102, fbbfVar103, fbbfVar104, fbbfVar105, fbbfVar106, fbbfVar107, fbbfVar108, fbbfVar109, fbbfVar110, fbbfVar111, fbbfVar112, fbbfVar113, fbbfVar114, fbbfVar115, fbbfVar116, fbbfVar117, fbbfVar118, fbbfVar119, fbbfVar120, fbbfVar121, fbbfVar122, fbbfVar123, fbbfVar143, fbbfVar143, fbbfVar124, fbbfVar125, fbbfVar126, fbbfVar127, fbbfVar128, fbbfVar129, fbbfVar130, fbbfVar131, fbbfVar132, fbbfVar133, fbbfVar134, fbbfVar135, fbbfVar136, fbbfVar137, fbbfVar138, fbbfVar139, fbbfVar140, fbbfVar141, fbbfVar142);
                break;
            case 160:
                Context context5 = (Context) this.a.q.b();
                dtuu dtuuVar3 = (dtuu) this.a.a.ay.b();
                akis akisVar51 = this.a;
                akkp akkpVar47 = akisVar51.a;
                fbbf fbbfVar144 = akkpVar47.dp;
                csum csumVar = (csum) akkpVar47.dr.b();
                akis akisVar52 = this.a;
                akhy akhyVar48 = this.b;
                akkp akkpVar48 = akisVar52.a;
                fbbf fbbfVar145 = akkpVar48.dv;
                fbbf fbbfVar146 = akhyVar48.S;
                fbbf fbbfVar147 = akhyVar48.X;
                fbbf fbbfVar148 = akhyVar48.ab;
                fbbf fbbfVar149 = akkpVar48.iN;
                fbbf fbbfVar150 = akkpVar48.di;
                fbbf fbbfVar151 = akisVar52.mB;
                fbbf fbbfVar152 = akkpVar48.iy;
                Optional optional3 = (Optional) akkpVar48.jp.b();
                Optional optional4 = (Optional) this.a.a.pg.b();
                errl errlVar20 = (errl) this.a.aK.b();
                akhy akhyVar49 = this.b;
                ckeq ckeqVar = (ckeq) this.a.mC.b();
                akis akisVar53 = this.a;
                akkp akkpVar49 = akisVar53.a;
                fbbf fbbfVar153 = akkpVar49.D;
                fbbf fbbfVar154 = akkpVar49.Z;
                fbbf fbbfVar155 = akkpVar49.ds;
                fbbf fbbfVar156 = akkpVar49.tE;
                fbbf fbbfVar157 = akkpVar49.Ea;
                fbbf fbbfVar158 = akkpVar49.Eb;
                errl errlVar21 = (errl) akisVar53.p.b();
                akkp akkpVar50 = this.a.a;
                aslp bD = akkpVar50.bD();
                asmj asmjVar2 = (asmj) akkpVar50.jD.b();
                akkp akkpVar51 = this.a.a;
                fbbf fbbfVar159 = akkpVar51.jF;
                atxd cp = akkpVar51.cp();
                fbbf fbbfVar160 = akisVar53.ct;
                return new ckdm(context5, dtuuVar3, fbbfVar144, akisVar51.cv, csumVar, fbbfVar145, akhyVar48.bu, fbbfVar146, fbbfVar147, fbbfVar148, fbbfVar149, fbbfVar150, fbbfVar151, fbbfVar152, optional3, optional4, errlVar20, akhyVar49.bv, ckeqVar, fbbfVar160, fbbfVar153, fbbfVar154, fbbfVar155, fbbfVar156, fbbfVar157, fbbfVar158, errlVar21, bD, asmjVar2, fbbfVar159, cp);
            case 161:
                dtuu dtuuVar4 = (dtuu) this.a.a.ay.b();
                akhy akhyVar50 = this.b;
                akis akisVar54 = this.a;
                fbbf fbbfVar161 = akisVar54.cz;
                akkp akkpVar52 = akisVar54.a;
                fbbf fbbfVar162 = akhyVar50.O;
                fbbf fbbfVar163 = akisVar54.iz;
                fbbf fbbfVar164 = akkpVar52.dE;
                fbbf fbbfVar165 = akkpVar52.dy;
                fbbf fbbfVar166 = akhyVar50.W;
                fbbf fbbfVar167 = akkpVar52.Z;
                cqoh cqohVar6 = (cqoh) fbbfVar161.b();
                akkp akkpVar53 = this.a.a;
                return new bdjr(dtuuVar4, fbbfVar162, fbbfVar163, fbbfVar164, fbbfVar165, fbbfVar166, akhyVar50.bC, fbbfVar167, cqohVar6, akkpVar53.qi, akkpVar53.qj);
            case 162:
                return new bdol((ffhd) this.a.co.b(), (ffhd) this.a.cn.b(), (ffsk) this.a.a.p.b(), fbaz.a(this.b.bB));
            case 163:
                akhy akhyVar51 = this.b;
                akkp akkpVar54 = this.a.a;
                sgd e = akhyVar51.e();
                shh j = akkpVar54.j();
                celv cK = akhyVar51.cK();
                alwo av = akkpVar54.av();
                aczs aczsVar = new aczs();
                akhy akhyVar52 = this.b;
                cmjf el = akhyVar52.el();
                akhy akhyVar53 = this.b;
                return enip.v(e, j, cK, av, aczsVar, el, akhyVar52.en(), this.b.dE(), this.b.dc(), this.b.K(), akhyVar53.x(), akhyVar53.D(), this.b.et(), this.a.a.jK(), this.a.a.lt(), this.b.h());
            case 164:
                akis akisVar55 = this.a;
                akhy akhyVar54 = this.b;
                return new cmje(akisVar55.a.iy, akhyVar54.bv, akisVar55.iz, akhyVar54.bw);
            case 165:
                return new cgrq(this.b.da(), (errm) this.a.p.b(), (asix) this.a.a.pR.b());
            case 166:
                return new cmky((cbgf) this.b.O.b());
            case 167:
                return new bdxd(this.b.aG(), this.a.a.ay);
            case 168:
                dtuu dtuuVar5 = (dtuu) this.a.a.ay.b();
                cbgf cbgfVar2 = (cbgf) this.b.O.b();
                akis akisVar56 = this.a;
                return new cnbr(dtuuVar5, cbgfVar2, akisVar56.a.bN(), this.b.gW(), (cqoh) akisVar56.cz.b());
            case 169:
                akhy akhyVar55 = this.b;
                return new cqos(akhyVar55.bH, akhyVar55.bI, akhyVar55.bM, akhyVar55.bN, this.a.a.cG);
            case 170:
                return new cqvf((errl) this.a.p.b(), this.b.bG, (avya) this.a.a.op.b());
            case 171:
                errl errlVar22 = (errl) this.a.t.b();
                errl errlVar23 = (errl) this.a.p.b();
                akhy akhyVar56 = this.b;
                return new cqvb(errlVar22, errlVar23, akhyVar56.bE, akhyVar56.bF, this.a.a.nZ);
            case 172:
                return new avxv(this.a.a.cc);
            case 173:
                return new cqrl((errl) this.a.t.b(), (dtuu) this.a.a.ay.b(), this.b.S, (cqoh) this.a.cz.b());
            case 174:
                akis akisVar57 = this.a;
                return new cqvs(akisVar57.a.dk, this.b.bF, (Context) akisVar57.q.b(), (errl) this.a.aK.b(), (errl) this.a.t.b(), (errl) this.a.p.b());
            case 175:
                errl errlVar24 = (errl) this.a.p.b();
                errl errlVar25 = (errl) this.a.t.b();
                akhy akhyVar57 = this.b;
                return new crez(errlVar24, errlVar25, akhyVar57.bK, this.a.a.oK, akhyVar57.bF, akhyVar57.bL);
            case 176:
                return new crda(this.b.bJ, (errl) this.a.t.b(), (errl) this.a.p.b(), this.b.bF);
            case 177:
                return new crdm(this.a.a.cc);
            case 178:
                errl errlVar26 = (errl) this.a.t.b();
                errl errlVar27 = (errl) this.a.aK.b();
                akhy akhyVar58 = this.b;
                return new cqps(errlVar26, errlVar27, akhyVar58.S, (cqrl) akhyVar58.bF.b(), (cqoh) this.a.cz.b());
            case 179:
                akkp akkpVar55 = this.a.a;
                return new crdl(akkpVar55.dk, (dtuu) akkpVar55.ay.b(), (Context) this.a.q.b(), this.b.bF, (errl) this.a.t.b(), (errl) this.a.aK.b());
            case 180:
                return new cfsi(this.b.aY(), (asqi) this.a.a.mV.b());
            case 181:
                akhy akhyVar59 = this.b;
                return new cafe(akhyVar59.bh(), akhyVar59.S, akhyVar59.bX, (ffhd) this.a.cP.b(), (ffsk) this.a.a.aq.b(), this.a.a.al);
            case 182:
                dtuu dtuuVar6 = (dtuu) this.a.a.ay.b();
                cqoh cqohVar7 = (cqoh) this.a.cz.b();
                akhy akhyVar60 = this.b;
                return new chef(dtuuVar6, cqohVar7, fbaz.a(akhyVar60.bP), this.a.a.ch(), fbaz.a(akhyVar60.bT));
            case 183:
                return enip.r(this.b.aS(), new caeo());
            case 184:
                return new enpx(this.b.aT());
            case 185:
                errl errlVar28 = (errl) this.a.t.b();
                caen caenVar = (caen) this.b.bR.b();
                bzqa bzqaVar = (bzqa) this.a.cI.b();
                akis akisVar58 = this.a;
                akhy akhyVar61 = this.b;
                akkp akkpVar56 = akisVar58.a;
                fbbf fbbfVar168 = akkpVar56.fr;
                fbbf fbbfVar169 = akhyVar61.S;
                dtuu dtuuVar7 = (dtuu) akkpVar56.ay.b();
                akhy akhyVar62 = this.b;
                akis akisVar59 = this.a;
                fbbf fbbfVar170 = akhyVar62.bQ;
                akkp akkpVar57 = akisVar59.a;
                fbbf fbbfVar171 = akhyVar62.O;
                fbbf fbbfVar172 = akhyVar62.P;
                fbbf fbbfVar173 = akkpVar57.aO;
                caqi bl = akhyVar62.bl();
                chef chefVar = (chef) fbbfVar170.b();
                akis akisVar60 = this.a;
                fbbf fbbfVar174 = akisVar60.a.C;
                awtm awtmVar2 = (awtm) akisVar60.iz.b();
                akkp akkpVar58 = this.a.a;
                return new caly(errlVar28, caenVar, bzqaVar, fbbfVar168, fbbfVar169, dtuuVar7, fbbfVar171, fbbfVar172, fbbfVar173, bl, chefVar, fbbfVar174, awtmVar2, akkpVar58.gE, akkpVar58.ci(), akkpVar58.pi);
            case 186:
                cqoh cqohVar8 = (cqoh) this.a.cz.b();
                dtuu dtuuVar8 = (dtuu) this.a.a.ay.b();
                akis akisVar61 = this.a;
                fbbf fbbfVar175 = akisVar61.a.qn;
                errl errlVar29 = (errl) akisVar61.t.b();
                akis akisVar62 = this.a;
                fbbf fbbfVar176 = this.b.bQ;
                akkp akkpVar59 = akisVar62.a;
                fbbf fbbfVar177 = akkpVar59.az;
                fbbf fbbfVar178 = akkpVar59.qo;
                chef chefVar2 = (chef) fbbfVar176.b();
                akzt akztVar2 = (akzt) this.a.a.f.b();
                akhy akhyVar63 = this.b;
                akkp akkpVar60 = this.a.a;
                return new caen(cqohVar8, dtuuVar8, fbbfVar175, errlVar29, fbbfVar177, fbbfVar178, chefVar2, akztVar2, fbaz.a(akhyVar63.bP), akkpVar60.qt, akkpVar60.ch());
            case 187:
                akis akisVar63 = this.a;
                akhy akhyVar64 = this.b;
                fbbf fbbfVar179 = akisVar63.p;
                akkp akkpVar61 = akisVar63.a;
                return new bbab(fbbfVar179, akhyVar64.bX, akkpVar61.aO, akkpVar61.G, akkpVar61.gE, akhyVar64.bS, akkpVar61.sV);
            case 188:
                return new akht(this);
            case 189:
                return new akhu(this);
            case 190:
                return new akhv(this);
            case 191:
                errl errlVar30 = (errl) this.a.p.b();
                errl errlVar31 = (errl) this.a.aK.b();
                akis akisVar64 = this.a;
                akhy akhyVar65 = this.b;
                akkp akkpVar62 = akisVar64.a;
                return new cahm(errlVar30, errlVar31, akkpVar62.nK, akhyVar65.S, akhyVar65.P, akkpVar62.uq, akkpVar62.cv, akkpVar62.qo, akkpVar62.C, akhyVar65.aq());
            case 192:
                return new caij(this.a.a.cc);
            case 193:
                akhy akhyVar66 = this.b;
                akis akisVar65 = this.a;
                return new cbej(akhyVar66.O, akisVar65.a.ay, akisVar65.cI);
            case 194:
                cvlf cvlfVar2 = (cvlf) this.b.bg.b();
                altk altkVar2 = (altk) this.a.a.fP.b();
                cqoh cqohVar9 = (cqoh) this.a.cz.b();
                akis akisVar66 = this.a;
                akhy akhyVar67 = this.b;
                akkp akkpVar63 = akisVar66.a;
                fbbf fbbfVar180 = akkpVar63.fr;
                fbbf fbbfVar181 = akhyVar67.ab;
                fbbf fbbfVar182 = akhyVar67.S;
                fbbf fbbfVar183 = akhyVar67.W;
                akzt akztVar3 = (akzt) akkpVar63.f.b();
                dtuu dtuuVar9 = (dtuu) this.a.a.ay.b();
                csrv csrvVar2 = (csrv) this.a.a.iK.b();
                Optional optional5 = (Optional) this.a.a.pg.b();
                awtm awtmVar3 = (awtm) this.a.iz.b();
                akis akisVar67 = this.a;
                akhy akhyVar68 = this.b;
                fbbf fbbfVar184 = akisVar67.aK;
                akkp akkpVar64 = akisVar67.a;
                fbbf fbbfVar185 = akkpVar64.xP;
                fbbf fbbfVar186 = akhyVar68.P;
                fbbf fbbfVar187 = akhyVar68.O;
                fbbf fbbfVar188 = akkpVar64.G;
                fbbf fbbfVar189 = akkpVar64.gp;
                fbbf fbbfVar190 = akkpVar64.al;
                fbbf fbbfVar191 = akkpVar64.yg;
                errl errlVar32 = (errl) fbbfVar184.b();
                errl errlVar33 = (errl) this.a.p.b();
                akkp akkpVar65 = this.a.a;
                fbbf fbbfVar192 = akkpVar65.sl;
                azei azeiVar2 = (azei) akkpVar65.sm.b();
                akhy akhyVar69 = this.b;
                akkp akkpVar66 = this.a.a;
                return new cldf(cvlfVar2, altkVar2, cqohVar9, fbbfVar180, fbbfVar181, fbbfVar182, fbbfVar183, akhyVar67.cc, akztVar3, dtuuVar9, csrvVar2, optional5, awtmVar3, fbbfVar185, fbbfVar186, akisVar67.cI, akhyVar68.bS, akhyVar68.ch, fbbfVar187, fbbfVar188, fbbfVar189, fbbfVar190, fbbfVar191, errlVar32, errlVar33, fbbfVar192, azeiVar2, akhyVar69.br, akkpVar66.yk, akhyVar69.bV);
            case 195:
                akhy akhyVar70 = this.b;
                return new bdob(akhyVar70.ce, akhyVar70.cg);
            case 196:
                return enip.s((bdoa) this.a.a.uj.b(), this.a.a.oZ(), (bdoa) this.b.cd.b());
            case 197:
                cqoh cqohVar10 = (cqoh) this.a.cz.b();
                akkp akkpVar67 = this.a.a;
                cgcq ho = akkpVar67.ho();
                cins cinsVar2 = (cins) akkpVar67.jc.b();
                akhy akhyVar71 = this.b;
                akis akisVar68 = this.a;
                fbbf fbbfVar193 = akisVar68.aK;
                akkp akkpVar68 = akisVar68.a;
                fbbf fbbfVar194 = akhyVar71.P;
                fbbf fbbfVar195 = akhyVar71.S;
                fbbf fbbfVar196 = akkpVar68.dp;
                fbbf fbbfVar197 = akkpVar68.xW;
                fbbf fbbfVar198 = akisVar68.lH;
                fbbf fbbfVar199 = akkpVar68.xX;
                errl errlVar34 = (errl) fbbfVar193.b();
                akkp akkpVar69 = this.a.a;
                return new cmlu(cqohVar10, ho, cinsVar2, fbbfVar194, fbbfVar195, fbbfVar196, fbbfVar197, fbbfVar198, akhyVar71.bq, fbbfVar199, errlVar34, akkpVar69.xY, akkpVar69.jY, akkpVar69.xZ, akkpVar69.ya, (attl) akkpVar69.hJ.b());
            case 198:
                return enip.r(this.a.a.oY(), (bdnz) this.b.cf.b());
            case 199:
                akis akisVar69 = this.a;
                fbbf fbbfVar200 = akisVar69.cz;
                fbbf fbbfVar201 = akisVar69.a.xS;
                cqoh cqohVar11 = (cqoh) fbbfVar200.b();
                akhy akhyVar72 = this.b;
                akkp akkpVar70 = this.a.a;
                return new cmlm(fbbfVar201, cqohVar11, akhyVar72.P, akhyVar72.bq, akhyVar72.cd, akhyVar72.S, akkpVar70.yc, (attl) akkpVar70.hJ.b());
            default:
                throw new AssertionError(i);
        }
        return aoyeVar;
    }

    private final Object d() {
        int i = this.c;
        switch (i) {
            case BasePaymentResult.ERROR_REQUEST_FAILED /* 200 */:
                akhy akhyVar = this.b;
                return cken.a(akhyVar.cs, akhyVar.cr);
            case BasePaymentResult.ERROR_REQUEST_TIMEOUT /* 201 */:
                ckjh ckjhVar = (ckjh) this.b.cr.b();
                akis akisVar = this.a;
                akkp akkpVar = akisVar.a;
                return new ckjk(ckjhVar, akkpVar.G, akkpVar.Z, akkpVar.kp, (errl) akisVar.t.b());
            case BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED /* 202 */:
                errl errlVar = (errl) this.a.t.b();
                akhy akhyVar2 = this.b;
                akkp akkpVar2 = this.a.a;
                Object gl = akhyVar2.gl();
                clbd clbdVar = (clbd) akkpVar2.kl.b();
                akzt akztVar = (akzt) this.a.a.f.b();
                akis akisVar2 = this.a;
                akhy akhyVar3 = this.b;
                akkp akkpVar3 = akisVar2.a;
                return new ckjh(errlVar, (ckjt) gl, clbdVar, akztVar, akkpVar3.di, akhyVar3.cn, akhyVar3.co, akhyVar3.cq, akhyVar3.ai, akkpVar3.iN(), akkpVar3.ku, fbaz.a(akkpVar3.Z), (atlx) this.a.a.kv.b());
            case BasePaymentResult.ERROR_BOT_DOMAIN_NOT_WHITELISTED /* 203 */:
                return new bdgb(this.b.P);
            case 204:
                akhy akhyVar4 = this.b;
                return ayhy.a(akhyVar4.aA, akhyVar4.cm);
            case 205:
                akis akisVar3 = this.a;
                akhy akhyVar5 = this.b;
                akkp akkpVar4 = akisVar3.a;
                return new ayiu(akkpVar4.ay, akhyVar5.aA, akkpVar4.hY, (errl) akisVar3.t.b(), (errl) this.a.p.b(), (ecrj) this.a.cN.b());
            case 206:
                return new ayzn(this.b.ag);
            case 207:
                akhy akhyVar6 = this.b;
                akkp akkpVar5 = this.a.a;
                fbbf fbbfVar = akhyVar6.W;
                fbbf fbbfVar2 = akkpVar5.iN;
                dtuu dtuuVar = (dtuu) akkpVar5.ay.b();
                Context context = (Context) this.a.q.b();
                akkp akkpVar6 = this.a.a;
                fbbf fbbfVar3 = akkpVar6.Z;
                aqky aqkyVar = (aqky) akkpVar6.kp.b();
                akis akisVar4 = this.a;
                akhy akhyVar7 = this.b;
                akkp akkpVar7 = akisVar4.a;
                return new cpye(akhyVar6.bD, fbbfVar, fbbfVar2, dtuuVar, context, fbbfVar3, aqkyVar, akkpVar7.kq, akhyVar7.cp, akkpVar7.ks);
            case 208:
                akhy akhyVar8 = this.b;
                akkp akkpVar8 = this.a.a;
                return new cozl(akhyVar8.P, akkpVar8.iN, akkpVar8.Z);
            case 209:
                Context context2 = (Context) this.a.q.b();
                errl errlVar2 = (errl) this.a.aK.b();
                errl errlVar3 = (errl) this.a.t.b();
                errl errlVar4 = (errl) this.a.p.b();
                cpbw cpbwVar = (cpbw) this.a.a.fw.b();
                coxk coxkVar = (coxk) this.a.a.iN.b();
                cgtc cgtcVar = (cgtc) this.a.a.dv.b();
                covr covrVar = (covr) this.a.a.iM.b();
                ecnx ecnxVar = (ecnx) this.a.fC.b();
                akis akisVar5 = this.a;
                akhy akhyVar9 = this.b;
                return new cvkz(context2, errlVar2, errlVar3, errlVar4, cpbwVar, coxkVar, cgtcVar, covrVar, ecnxVar, akisVar5.a.ly(), akhyVar9.fp(), akhyVar9.S);
            case 210:
                return new cnru((ffsk) this.a.a.p.b(), (ffhd) this.a.co.b(), this.a.a.bQ, this.b.S);
            case 211:
                Context context3 = (Context) this.a.q.b();
                akis akisVar6 = this.a;
                akhy akhyVar10 = this.b;
                akkp akkpVar9 = akisVar6.a;
                fbbf fbbfVar4 = akkpVar9.fr;
                fbbf fbbfVar5 = akhyVar10.P;
                fbbf fbbfVar6 = akhyVar10.ab;
                fbbf fbbfVar7 = akkpVar9.dR;
                fbbf fbbfVar8 = akhyVar10.S;
                fbbf fbbfVar9 = akhyVar10.X;
                fbbf fbbfVar10 = akhyVar10.ak;
                bdtd bdtdVar = (bdtd) akkpVar9.aO.b();
                bcvw bcvwVar = (bcvw) this.b.bo.b();
                cpbw cpbwVar2 = (cpbw) this.a.a.fw.b();
                akis akisVar7 = this.a;
                fbbf fbbfVar11 = this.b.bz;
                fbbf fbbfVar12 = akisVar7.a.ds;
                bdxd bdxdVar = (bdxd) fbbfVar11.b();
                akhy akhyVar11 = this.b;
                akkp akkpVar10 = this.a.a;
                fbbf fbbfVar13 = akkpVar10.nj;
                ctml ctmlVar = (ctml) akkpVar10.ni.b();
                ctud ctudVar = (ctud) this.a.cT.b();
                csum csumVar = (csum) this.a.a.dr.b();
                coxk coxkVar2 = (coxk) this.a.a.iN.b();
                Optional optional = (Optional) this.a.aV.b();
                cqoh cqohVar = (cqoh) this.a.cz.b();
                albq albqVar = (albq) this.a.a.di.b();
                akzt akztVar2 = (akzt) this.a.a.f.b();
                akis akisVar8 = this.a;
                akkp akkpVar11 = akisVar8.a;
                fbbf fbbfVar14 = akkpVar11.fP;
                baft aK = akisVar8.aK();
                bdwt bdwtVar = (bdwt) akkpVar11.tz.b();
                bdve bdveVar = (bdve) this.a.a.pI.b();
                cbgf cbgfVar = (cbgf) this.b.O.b();
                bauj baujVar = (bauj) this.b.cW.b();
                Object b = this.a.a.iy.b();
                fbbf fbbfVar15 = akhyVar11.bb;
                fbbf fbbfVar16 = akhyVar10.cx;
                fbbf fbbfVar17 = akhyVar10.cl;
                fbbf fbbfVar18 = akhyVar10.bu;
                fbbf fbbfVar19 = akhyVar10.cw;
                byzp byzpVar = (byzp) b;
                dtuu dtuuVar2 = (dtuu) this.a.a.ay.b();
                akis akisVar9 = this.a;
                fbbf fbbfVar20 = this.b.df;
                fbbf fbbfVar21 = akisVar9.a.fJ;
                cbut cbutVar = (cbut) fbbfVar20.b();
                akhy akhyVar12 = this.b;
                aolr aolrVar = (aolr) this.a.a.Z.b();
                akhy akhyVar13 = this.b;
                cipm cipmVar = (cipm) this.a.a.ix.b();
                akis akisVar10 = this.a;
                akhy akhyVar14 = this.b;
                akkp akkpVar12 = akisVar10.a;
                fbbf fbbfVar22 = akkpVar12.cf;
                fbbf fbbfVar23 = akhyVar14.ai;
                fbbf fbbfVar24 = akkpVar12.kp;
                fbbf fbbfVar25 = akkpVar12.AN;
                fbbf fbbfVar26 = akkpVar12.iz;
                fbbf fbbfVar27 = akkpVar12.iA;
                fbbf fbbfVar28 = akkpVar12.Q;
                fbbf fbbfVar29 = akkpVar12.AX;
                fbbf fbbfVar30 = akkpVar12.Ba;
                fbbf fbbfVar31 = akkpVar12.c;
                fbbf fbbfVar32 = akkpVar12.sm;
                fbbf fbbfVar33 = akisVar10.iz;
                asku bz = akkpVar12.bz();
                errl errlVar5 = (errl) akisVar10.p.b();
                ffsk ffskVar = (ffsk) this.a.a.aq.b();
                akhy akhyVar15 = this.b;
                akkp akkpVar13 = this.a.a;
                bzpo aP = akhyVar15.aP();
                areq areqVar = (areq) akkpVar13.cu.b();
                akkp akkpVar14 = this.a.a;
                fbbf fbbfVar34 = akkpVar14.ku;
                fbbf fbbfVar35 = akkpVar14.ck;
                fbbf fbbfVar36 = akkpVar14.qL;
                AtomicReference atomicReference = (AtomicReference) akkpVar14.cj.b();
                akkp akkpVar15 = this.a.a;
                fbbf fbbfVar37 = akkpVar15.Be;
                fbbf fbbfVar38 = akkpVar15.oQ;
                fbbf fbbfVar39 = akkpVar15.Bf;
                fbbf fbbfVar40 = akkpVar15.Bg;
                asyf asyfVar = (asyf) akkpVar15.ci.b();
                asqi asqiVar = (asqi) this.a.a.mV.b();
                augw augwVar = (augw) this.a.a.le.b();
                fbbf fbbfVar41 = akhyVar14.aF;
                fbbf fbbfVar42 = akhyVar14.cT;
                fbbf fbbfVar43 = akhyVar14.dg;
                fbbf fbbfVar44 = akhyVar14.aE;
                fbbf fbbfVar45 = akhyVar14.cn;
                fbbf fbbfVar46 = akhyVar14.cq;
                return new bahp(context3, fbbfVar4, fbbfVar19, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar18, fbbfVar8, fbbfVar9, fbbfVar17, fbbfVar16, fbbfVar10, bdtdVar, bcvwVar, cpbwVar2, fbbfVar12, bdxdVar, fbbfVar15, fbbfVar13, ctmlVar, ctudVar, csumVar, coxkVar2, optional, cqohVar, albqVar, akztVar2, fbbfVar14, aK, bdwtVar, bdveVar, cbgfVar, baujVar, byzpVar, dtuuVar2, fbbfVar21, cbutVar, akhyVar12.bv, aolrVar, akhyVar13.bB, akhyVar13.bC, cipmVar, fbbfVar22, fbbfVar45, fbbfVar46, fbbfVar23, fbbfVar24, fbbfVar44, fbbfVar25, fbbfVar42, fbbfVar43, fbbfVar26, fbbfVar41, fbbfVar27, fbbfVar28, fbbfVar29, fbbfVar30, fbbfVar31, fbbfVar32, fbbfVar33, bz, errlVar5, ffskVar, aP, areqVar, fbbfVar34, fbbfVar35, fbbfVar36, atomicReference, fbbfVar37, fbbfVar38, fbbfVar39, fbbfVar40, asyfVar, asqiVar, augwVar);
            case 212:
                return new ctgv(this.b.O, (dtuu) this.a.a.ay.b());
            case 213:
                akhy akhyVar16 = this.b;
                akkp akkpVar16 = this.a.a;
                fbbf fbbfVar47 = akhyVar16.O;
                dtuu dtuuVar3 = (dtuu) akkpVar16.ay.b();
                akhy akhyVar17 = this.b;
                return new axmt(fbbfVar47, dtuuVar3, akhyVar17.W, akhyVar17.P);
            case 214:
                return new bauj(this.b.cV, this.a.a.nj);
            case 215:
                akhy akhyVar18 = this.b;
                fbbf fbbfVar48 = akhyVar18.ba;
                fbbf fbbfVar49 = akhyVar18.S;
                ctiz ctizVar = (ctiz) fbbfVar48.b();
                ctiw ctiwVar = (ctiw) this.a.a.tJ.b();
                akis akisVar11 = this.a;
                return new bauu(fbbfVar49, ctizVar, ctiwVar, akisVar11.a.nD, this.b.aE(), (errl) akisVar11.p.b(), (errl) this.a.t.b(), (bafi) this.a.a.uc.b());
            case 216:
                akhy akhyVar19 = this.b;
                akis akisVar12 = this.a;
                akkp akkpVar17 = akisVar12.a;
                fbbf fbbfVar50 = akhyVar19.S;
                ctrh fi = akhyVar19.fi();
                fbbf fbbfVar51 = akkpVar17.nj;
                fbbf fbbfVar52 = akkpVar17.tP;
                errl errlVar6 = (errl) akisVar12.t.b();
                return new barw(fbbfVar50, akhyVar19.cz, akhyVar19.cB, fi, fbbfVar51, akhyVar19.cT, fbbfVar52, errlVar6);
            case 217:
                return Optional.of((cgoo) this.b.cy.b());
            case 218:
                return new ahsc((ffsk) this.a.a.p.b(), (ffhd) this.a.co.b(), (dtve) this.a.a.cD.b(), this.b.S);
            case 219:
                return Optional.of((ahrq) this.b.cA.b());
            case 220:
                return new ahrw((ffsk) this.a.a.p.b(), (ffsk) this.a.a.q.b(), (ffhd) this.a.co.b(), this.b.S, (cqoh) this.a.cz.b());
            case 221:
                akhy akhyVar20 = this.b;
                return new curf(akhyVar20.cM, akhyVar20.cO, akhyVar20.cG, (ffsk) this.a.a.q.b());
            case 222:
                akis akisVar13 = this.a;
                akhy akhyVar21 = this.b;
                akkp akkpVar18 = akisVar13.a;
                return new cumi(akkpVar18.tn, akhyVar21.W, akhyVar21.P, akhyVar21.cC, akhyVar21.cD, akkpVar18.fo, akhyVar21.cG, akhyVar21.cF, akhyVar21.cK, akhyVar21.cL, akisVar13.cP);
            case 223:
                akhy akhyVar22 = this.b;
                akis akisVar14 = this.a;
                akkp akkpVar19 = akisVar14.a;
                return new cuvp(akhyVar22.W, akhyVar22.P, akhyVar22.S, akisVar14.cz, (dtuu) akkpVar19.ay.b(), (ffsk) this.a.a.aq.b());
            case 224:
                return new culy(this.b.cF, this.a.co);
            case 225:
                akhy akhyVar23 = this.b;
                akkp akkpVar20 = this.a.a;
                return new cufr(akhyVar23.cE, akkpVar20.in, (ffsk) akkpVar20.p.b(), (ffsk) this.a.a.aq.b());
            case 226:
                akis akisVar15 = this.a;
                akhy akhyVar24 = this.b;
                fbbf fbbfVar53 = akisVar15.cP;
                akkp akkpVar21 = akisVar15.a;
                return new cugi(akkpVar21.ie, akkpVar21.ih, akkpVar21.ig, akkpVar21.ii, akkpVar21.ik, akhyVar24.W, akhyVar24.P, akhyVar24.S, akkpVar21.Z, akkpVar21.il, akisVar15.cz, akkpVar21.el, (ffhd) fbbfVar53.b());
            case 227:
                akhy akhyVar25 = this.b;
                akkp akkpVar22 = this.a.a;
                return new cuwv(akhyVar25.W, akhyVar25.P, akhyVar25.S, akhyVar25.cC, akhyVar25.cH, akhyVar25.cJ, (ffsk) akkpVar22.q.b(), (ffsk) this.a.a.aq.b());
            case 228:
                akis akisVar16 = this.a;
                akhy akhyVar26 = this.b;
                fbbf fbbfVar54 = akisVar16.co;
                akkp akkpVar23 = akisVar16.a;
                return new cuwf(akkpVar23.ir, akkpVar23.ap, akkpVar23.dE, akisVar16.cz, akkpVar23.cp, akhyVar26.W, akisVar16.hC, akkpVar23.is, akkpVar23.ie, akkpVar23.c, (ffhd) fbbfVar54.b());
            case 229:
                akhy akhyVar27 = this.b;
                akkp akkpVar24 = this.a.a;
                fbbf fbbfVar55 = akkpVar24.cf;
                ffsk ffskVar2 = (ffsk) akkpVar24.aq.b();
                return new culs(akhyVar27.cC, fbbfVar55, akhyVar27.cF, akhyVar27.cI, ffskVar2);
            case 230:
                akhy akhyVar28 = this.b;
                akkp akkpVar25 = this.a.a;
                return new cugm(akhyVar28.cE, akkpVar25.in, (ffsk) akkpVar25.q.b());
            case 231:
                akis akisVar17 = this.a;
                akhy akhyVar29 = this.b;
                fbbf fbbfVar56 = akisVar17.cP;
                return new cuqs(akisVar17.a.ik, akhyVar29.cD, (ffhd) fbbfVar56.b());
            case 232:
                akhy akhyVar30 = this.b;
                akis akisVar18 = this.a;
                akkp akkpVar26 = akisVar18.a;
                return new cuke(akhyVar30.cN, akhyVar30.W, akhyVar30.P, akhyVar30.S, akkpVar26.Z, akkpVar26.aO, akkpVar26.il, akhyVar30.M, akisVar18.co);
            case 233:
                akis akisVar19 = this.a;
                akhy akhyVar31 = this.b;
                fbbf fbbfVar57 = akisVar19.co;
                akkp akkpVar27 = akisVar19.a;
                return new cubw(akkpVar27.ih, akkpVar27.ig, akhyVar31.S, akhyVar31.W, akhyVar31.P, akkpVar27.Z, (ffhd) fbbfVar57.b(), (ffsk) this.a.a.q.b());
            case 234:
                akhy akhyVar32 = this.b;
                fbbf fbbfVar58 = akhyVar32.S;
                cbgf cbgfVar2 = (cbgf) akhyVar32.O.b();
                fbbf fbbfVar59 = this.b.aS;
                return new ctqg(akhyVar32.cQ, fbbfVar58, akhyVar32.cR, cbgfVar2, fbbfVar59);
            case 235:
                akhy akhyVar33 = this.b;
                akkp akkpVar28 = this.a.a;
                return new curl(akhyVar33.cM, akhyVar33.cO, akhyVar33.cG, akhyVar33.cB, akhyVar33.S, (ffsk) akkpVar28.q.b());
            case 236:
                akhy akhyVar34 = this.b;
                akkp akkpVar29 = this.a.a;
                return new crlt(akhyVar34.S, akhyVar34.bv, akhyVar34.bw, (byzp) akkpVar29.iy.b(), (asix) this.a.a.pR.b(), (ffsk) this.a.a.q.b(), (ffhd) this.a.co.b(), this.a.cz);
            case 237:
                akzt akztVar3 = (akzt) this.a.a.f.b();
                akis akisVar20 = this.a;
                akhy akhyVar35 = this.b;
                akkp akkpVar30 = akisVar20.a;
                fbbf fbbfVar60 = akkpVar30.fr;
                fbbf fbbfVar61 = akhyVar35.S;
                fbbf fbbfVar62 = akhyVar35.P;
                fbbf fbbfVar63 = akhyVar35.Y;
                fbbf fbbfVar64 = akkpVar30.aO;
                dtuu dtuuVar4 = (dtuu) akkpVar30.ay.b();
                cpdg cpdgVar = (cpdg) this.a.a.ap.b();
                akhy akhyVar36 = this.b;
                errl errlVar7 = (errl) this.a.t.b();
                akhy akhyVar37 = this.b;
                akkp akkpVar31 = this.a.a;
                return new cano(akztVar3, fbbfVar60, fbbfVar61, fbbfVar62, fbbfVar63, fbbfVar64, dtuuVar4, cpdgVar, akhyVar36.cX, errlVar7, akhyVar37.de, akhyVar37.br, akkpVar31.qD, akkpVar31.qk, akkpVar31.qG, akkpVar31.qH, akkpVar31.Z, akkpVar31.qI, akkpVar31.hJ);
            case 238:
                akis akisVar21 = this.a;
                akhy akhyVar38 = this.b;
                akkp akkpVar32 = akisVar21.a;
                return new camv(akkpVar32.ay, akkpVar32.kG, akhyVar38.da, akhyVar38.db, akhyVar38.dc, akhyVar38.dd, akkpVar32.dR, akkpVar32.qk);
            case 239:
                akhy akhyVar39 = this.b;
                return new canc(akhyVar39.S, this.a.a.qk, akhyVar39.cZ, akhyVar39.cY);
            case 240:
                akis akisVar22 = this.a;
                akhy akhyVar40 = this.b;
                akkp akkpVar33 = akisVar22.a;
                return new canw(akkpVar33.aO, akhyVar40.P, akhyVar40.S, akhyVar40.Y, akhyVar40.cX, akhyVar40.bS, akkpVar33.qk, akhyVar40.br, akhyVar40.cY);
            case 241:
                return new cans(this.b.S);
            case 242:
                akhy akhyVar41 = this.b;
                akis akisVar23 = this.a;
                return new canq(akhyVar41.S, akhyVar41.bS, akhyVar41.P, akhyVar41.cX, akhyVar41.cZ, akhyVar41.cY, akisVar23.a.qy);
            case 243:
                akhy akhyVar42 = this.b;
                return new camq(akhyVar42.bv, akhyVar42.db);
            case 244:
                akhy akhyVar43 = this.b;
                return new camr(akhyVar43.S, akhyVar43.cZ, akhyVar43.db);
            case 245:
                Context context4 = (Context) this.a.q.b();
                akis akisVar24 = this.a;
                akhy akhyVar44 = this.b;
                akkp akkpVar34 = akisVar24.a;
                return new cbjl(context4, akkpVar34.fN, akhyVar44.dh, akkpVar34.ay, akisVar24.iL, akkpVar34.lB, akkpVar34.Bc);
            case 246:
                return new bdor((cbgf) this.b.O.b(), this.b.br);
            case 247:
                return new awah(this.b.ag(), (ffsk) this.a.a.p.b());
            case 248:
                dtuu dtuuVar5 = (dtuu) this.a.a.ay.b();
                errl errlVar8 = (errl) this.a.aK.b();
                akhy akhyVar45 = this.b;
                fbbf fbbfVar65 = akhyVar45.dg;
                return new crbp(dtuuVar5, errlVar8, akhyVar45.S, (bbhf) fbbfVar65.b(), this.b.aA(), (crga) this.a.a.pd.b(), (baoy) this.b.dR.b(), (cqoh) this.a.cz.b());
            case 249:
                akhy akhyVar46 = this.b;
                return new baxl(akhyVar46.dk, this.a.a.iA, akhyVar46.dQ);
            case 250:
                ctyx ctyxVar = (ctyx) this.a.aU.b();
                Context context5 = (Context) this.a.q.b();
                akhy akhyVar47 = this.b;
                akis akisVar25 = this.a;
                fbbf fbbfVar66 = akhyVar47.dl;
                akkp akkpVar35 = akisVar25.a;
                fbbf fbbfVar67 = akhyVar47.S;
                fbbf fbbfVar68 = akkpVar35.fP;
                avkk avkkVar = (avkk) this.a.a.cH.b();
                dtuu dtuuVar6 = (dtuu) this.a.a.ay.b();
                clws clwsVar = (clws) this.a.a.iA.b();
                akis akisVar26 = this.a;
                akhy akhyVar48 = this.b;
                akkp akkpVar36 = akisVar26.a;
                return new cluu(ctyxVar, context5, fbbfVar67, fbbfVar68, avkkVar, dtuuVar6, clwsVar, akkpVar36.iy, akhyVar48.dm, akhyVar48.dP, akkpVar36.nJ, akkpVar36.CJ, akkpVar36.G, akhyVar48.W, akkpVar36.kR, akkpVar36.uG, (errl) akisVar26.p.b());
            case 251:
                return new cfsj(this.b.aZ(), (asqi) this.a.a.mV.b());
            case 252:
                akis akisVar27 = this.a;
                akhy akhyVar49 = this.b;
                akkp akkpVar37 = akisVar27.a;
                return new coww(akkpVar37.nK, akhyVar49.dl, akkpVar37.fP, akkpVar37.cH, akkpVar37.Z, akhyVar49.P, akhyVar49.W, akisVar27.cn(), akkpVar37.kR, akkpVar37.uG, (ffsk) akkpVar37.q.b(), this.a.a.G);
            case 253:
                return new cjni(this.b.dK(), (ffsk) this.a.a.q.b());
            case 254:
                this.b.hj();
                akhy akhyVar50 = this.b;
                akkp akkpVar38 = this.a.a;
                return cjmq.a(akhyVar50.dJ(), akkpVar38.iB(), akkpVar38.ix(), akhyVar50.dH(), (aurd) akkpVar38.yp.b());
            case PrivateKeyType.INVALID /* 255 */:
                akhy akhyVar51 = this.b;
                return new avkr(akhyVar51.av, akhyVar51.aw, akhyVar51.dn);
            case 256:
                return new akhw(this);
            case 257:
                return new cfme(this.a.a.ay, (cbgf) this.b.O.b());
            case 258:
                return caqd.a(this.b.aV());
            case 259:
                cjop cjopVar = new cjop();
                akis akisVar28 = this.a;
                akhy akhyVar52 = this.b;
                akkp akkpVar39 = akisVar28.a;
                cjmc it = akkpVar39.it();
                cjom iC = akkpVar39.iC();
                cjmg dG = akhyVar52.dG();
                cjmy iv = akkpVar39.iv();
                cjnf dI = akhyVar52.dI();
                cjmv cjmvVar = new cjmv();
                akis akisVar29 = this.a;
                akhy akhyVar53 = this.b;
                cjly is = akisVar29.a.is();
                akhyVar53.he();
                this.b.hl();
                return cjmp.a(cjopVar, it, iC, dG, iv, dI, cjmvVar, is, (autj) this.a.a.yu.b());
            case 260:
                akis akisVar30 = this.a;
                akhy akhyVar54 = this.b;
                cjpa iE = akisVar30.a.iE();
                cjqe dN = akhyVar54.dN();
                akhyVar54.hk();
                akhy akhyVar55 = this.b;
                cjqc dM = akhyVar55.dM();
                cjot dL = akhyVar55.dL();
                akhyVar55.hh();
                return cjqa.a(iE, dN, dM, dL, (asnb) this.a.a.cb.b());
            case 261:
                Context context6 = (Context) this.a.q.b();
                akhy akhyVar56 = this.b;
                akkp akkpVar40 = this.a.a;
                fbbf fbbfVar69 = akhyVar56.W;
                fbbf fbbfVar70 = akhyVar56.P;
                fbbf fbbfVar71 = akhyVar56.S;
                fbbf fbbfVar72 = akhyVar56.X;
                fbbf fbbfVar73 = akkpVar40.sY;
                fbbf fbbfVar74 = akkpVar40.aO;
                fbbf fbbfVar75 = akkpVar40.ds;
                fbbf fbbfVar76 = akhyVar56.dz;
                fbbf fbbfVar77 = akhyVar56.dA;
                fbbf fbbfVar78 = akkpVar40.rg;
                fbbf fbbfVar79 = akkpVar40.nj;
                fbbf fbbfVar80 = akkpVar40.fP;
                fbbf fbbfVar81 = akkpVar40.ej;
                fbbf fbbfVar82 = akkpVar40.ap;
                fbbf fbbfVar83 = akkpVar40.hC;
                fbbf fbbfVar84 = akkpVar40.yx;
                fbbf fbbfVar85 = akkpVar40.ay;
                fbbf fbbfVar86 = akkpVar40.ft;
                fbbf fbbfVar87 = akhyVar56.dB;
                fbbf fbbfVar88 = akhyVar56.O;
                fbbf fbbfVar89 = akhyVar56.R;
                fbbf fbbfVar90 = akkpVar40.iy;
                fbbf fbbfVar91 = akkpVar40.fJ;
                fbbf fbbfVar92 = akkpVar40.e;
                Optional optional2 = (Optional) akkpVar40.jp.b();
                akis akisVar31 = this.a;
                akhy akhyVar57 = this.b;
                fbbf fbbfVar93 = akisVar31.aK;
                fbbf fbbfVar94 = akisVar31.a.pg;
                fbbf fbbfVar95 = akhyVar57.dD;
                errl errlVar9 = (errl) fbbfVar93.b();
                akhy akhyVar58 = this.b;
                fazb a = fbaz.a(akhyVar58.dG);
                akis akisVar32 = this.a;
                akhy akhyVar59 = this.b;
                fbbf fbbfVar96 = akisVar32.cN;
                fbbf fbbfVar97 = akisVar32.a.Z;
                fbbf fbbfVar98 = akhyVar59.dH;
                fbbf fbbfVar99 = akhyVar59.dI;
                ecrj ecrjVar = (ecrj) fbbfVar96.b();
                akhy akhyVar60 = this.b;
                fbbf fbbfVar100 = akhyVar60.ai;
                Optional of = Optional.of((cyfw) akhyVar60.dJ.b());
                akhy akhyVar61 = this.b;
                akis akisVar33 = this.a;
                akkp akkpVar41 = akisVar33.a;
                fbbf fbbfVar101 = akkpVar41.yE;
                fbbf fbbfVar102 = akkpVar41.rr;
                fbbf fbbfVar103 = akisVar33.lS;
                fbbf fbbfVar104 = akisVar33.jT;
                fbbf fbbfVar105 = akkpVar41.ku;
                fbbf fbbfVar106 = akisVar33.lT;
                fbbf fbbfVar107 = akhyVar61.dK;
                cjdh cjdhVar = (cjdh) akhyVar61.dL.b();
                azei azeiVar = (azei) this.a.a.yH.b();
                akhy akhyVar62 = this.b;
                asmg asmgVar = (asmg) this.a.a.yI.b();
                akkp akkpVar42 = this.a.a;
                auif cy = akkpVar42.cy();
                fbbf fbbfVar108 = akkpVar42.yJ;
                fbbf fbbfVar109 = akkpVar42.py;
                fbbf fbbfVar110 = akhyVar62.aE;
                fbbf fbbfVar111 = akhyVar61.bh;
                fbbf fbbfVar112 = akhyVar61.bv;
                fbbf fbbfVar113 = akhyVar60.ax;
                fbbf fbbfVar114 = akhyVar60.cq;
                fbbf fbbfVar115 = akhyVar60.cT;
                fbbf fbbfVar116 = akhyVar58.cn;
                fbbf fbbfVar117 = akhyVar56.df;
                fbbf fbbfVar118 = akhyVar56.cW;
                fbbf fbbfVar119 = akhyVar56.bn;
                fbbf fbbfVar120 = akhyVar56.be;
                fbbf fbbfVar121 = akhyVar56.bz;
                fbbf fbbfVar122 = akhyVar56.bb;
                asmj asmjVar = (asmj) akkpVar42.jD.b();
                akkp akkpVar43 = this.a.a;
                return new batc(context6, fbbfVar69, fbbfVar70, fbbfVar71, fbbfVar72, fbbfVar73, fbbfVar74, fbbfVar75, fbbfVar76, fbbfVar77, fbbfVar78, fbbfVar79, fbbfVar80, fbbfVar122, fbbfVar121, fbbfVar120, fbbfVar81, fbbfVar82, fbbfVar83, fbbfVar84, fbbfVar85, fbbfVar86, fbbfVar87, fbbfVar88, fbbfVar119, fbbfVar118, fbbfVar89, fbbfVar90, fbbfVar117, fbbfVar91, fbbfVar92, optional2, fbbfVar94, fbbfVar95, errlVar9, fbbfVar116, a, fbbfVar97, fbbfVar98, fbbfVar99, ecrjVar, fbbfVar115, fbbfVar100, fbbfVar114, fbbfVar113, of, fbbfVar112, fbbfVar101, fbbfVar102, fbbfVar103, fbbfVar104, fbbfVar105, fbbfVar106, fbbfVar107, fbbfVar111, cjdhVar, azeiVar, fbbfVar110, asmgVar, cy, fbbfVar108, fbbfVar109, asmjVar, akkpVar43.jF, akkpVar43.yK);
            case 262:
                akhy akhyVar63 = this.b;
                akkp akkpVar44 = this.a.a;
                return new cukj(akhyVar63.du, akhyVar63.dw, akhyVar63.dy, akhyVar63.cM, akhyVar63.cJ, akhyVar63.cG, akhyVar63.cO, akhyVar63.cL, akkpVar44.tv, (ffsk) akkpVar44.aq.b());
            case 263:
                return enip.o(this.b.gP());
            case 264:
                akis akisVar34 = this.a;
                akhy akhyVar64 = this.b;
                akkp akkpVar45 = akisVar34.a;
                return new cumu(akisVar34.kG, akhyVar64.cH, akisVar34.kH, akkpVar45.C, (ffsk) akkpVar45.p.b());
            case 265:
                akhy akhyVar65 = this.b;
                akkp akkpVar46 = this.a.a;
                return new cukm(akhyVar65.dv, akhyVar65.cM, akhyVar65.cJ, akhyVar65.cG, (ffsk) akkpVar46.aq.b());
            case 266:
                return enip.o(this.b.gQ());
            case 267:
                akhy akhyVar66 = this.b;
                akis akisVar35 = this.a;
                return new cusm(akhyVar66.du, akhyVar66.P, akhyVar66.S, akhyVar66.cC, akhyVar66.dx, akhyVar66.cM, akhyVar66.cJ, akhyVar66.dw, akhyVar66.cO, akisVar35.cz, akisVar35.cP);
            case 268:
                return new cusp(this.a.a.cc);
            case 269:
                akhy akhyVar67 = this.b;
                akis akisVar36 = this.a;
                return new cubr(akhyVar67.W, akhyVar67.P, akhyVar67.S, akisVar36.a.tx, (errl) akisVar36.t.b());
            case 270:
                akis akisVar37 = this.a;
                akhy akhyVar68 = this.b;
                akkp akkpVar47 = akisVar37.a;
                return new batu(akisVar37.q, akkpVar47.sY, akkpVar47.yy, akhyVar68.dB, akhyVar68.P, akhyVar68.R);
            case 271:
                Context context7 = (Context) this.a.q.b();
                akhy akhyVar69 = this.b;
                fbbf fbbfVar123 = this.a.cX;
                fbbf fbbfVar124 = akhyVar69.W;
                fbbf fbbfVar125 = akhyVar69.P;
                crqw crqwVar = (crqw) fbbfVar123.b();
                akis akisVar38 = this.a;
                fbbf fbbfVar126 = this.b.cD;
                fbbf fbbfVar127 = akisVar38.a.ic;
                croc crocVar = (croc) fbbfVar126.b();
                cbgf cbgfVar3 = (cbgf) this.b.O.b();
                akkp akkpVar48 = this.a.a;
                fbbf fbbfVar128 = akkpVar48.cf;
                dtuu dtuuVar7 = (dtuu) akkpVar48.ay.b();
                akhy akhyVar70 = this.b;
                akis akisVar39 = this.a;
                akkp akkpVar49 = akisVar39.a;
                fbbf fbbfVar129 = akisVar39.hA;
                ffsk ffskVar3 = (ffsk) akkpVar49.aq.b();
                fbbf fbbfVar130 = this.b.dC;
                return new crrm(context7, akhyVar69.bf, akhyVar69.cn, fbbfVar124, fbbfVar125, crqwVar, fbbfVar127, crocVar, cbgfVar3, fbbfVar128, dtuuVar7, akhyVar70.cI, fbbfVar129, ffskVar3, fbbfVar130);
            case 272:
                return new bdnv(fbaz.a(this.b.dF));
            case 273:
                bdnx bdnxVar = (bdnx) this.a.a.uj.b();
                akhy akhyVar71 = this.b;
                akkp akkpVar50 = this.a.a;
                return enip.u(bdnxVar, akhyVar71.es(), akkpVar50.hs(), akkpVar50.lt(), akhyVar71.ew());
            case 274:
                return new cnej(this.a.a.cc);
            case 275:
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                akhy akhyVar72 = this.b;
                return new clvi(cqohVar2, akhyVar72.S, akhyVar72.P, this.a.a.dp);
            case 276:
                return new avln((errl) this.a.aK.b(), this.b.P, (azaw) this.a.a.uE.b(), this.a.a.eh());
            case 277:
                return new cyfw((errl) this.a.p.b(), (errl) this.a.t.b(), (ctjh) this.b.bb.b());
            case 278:
                akis akisVar40 = this.a;
                akhy akhyVar73 = this.b;
                akkp akkpVar51 = akisVar40.a;
                return new amoc(akisVar40.jT, akkpVar51.aq, akisVar40.cP, akisVar40.jl, akisVar40.jm, akkpVar51.lV, akkpVar51.eX, akkpVar51.lU, akhyVar73.aE, akkpVar51.aO);
            case 279:
                return new cjdh((ciwj) this.b.al.b(), this.b.dA());
            case 280:
                return new avkv((azcn) this.b.av.b(), (azfv) this.b.aw.b());
            case 281:
                Context context8 = (Context) this.a.q.b();
                akhy akhyVar74 = this.b;
                akkp akkpVar52 = this.a.a;
                return new baoy(context8, akhyVar74.S, akhyVar74.bu, (coxk) akkpVar52.iN.b(), (dtuu) this.a.a.ay.b());
            case 282:
                return new cjmk((cjmj) this.b.dU.b(), (ffsk) this.a.a.p.b());
            case 283:
                return new cjok((awtm) this.a.iz.b(), this.b.dF(), (azei) this.a.a.ys.b(), (ffsk) this.a.a.p.b(), (autg) this.a.a.yt.b());
            case 284:
                return new avkt((avks) this.b.dO.b(), (ffsk) this.a.a.p.b());
            case 285:
                return new axcc(this.b.av(), new axbm());
            case 286:
                return new axbu((avkh) this.b.bU.b(), (ffsk) this.a.a.p.b());
            case 287:
                errl errlVar10 = (errl) this.a.p.b();
                akhy akhyVar75 = this.b;
                akis akisVar41 = this.a;
                cfmq cW = akhyVar75.cW();
                avtx avtxVar = (avtx) akisVar41.jE.b();
                akis akisVar42 = this.a;
                akkp akkpVar53 = akisVar42.a;
                return new awqr(errlVar10, cW, avtxVar, (awov) akisVar42.fn(), akkpVar53.yq, akkpVar53.uL, akkpVar53.br, akkpVar53.gE, akkpVar53.bF);
            case 288:
                awqj awqjVar = (awqj) this.b.el.b();
                awti awtiVar = (awti) this.a.ju.b();
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                akis akisVar43 = this.a;
                akhy akhyVar76 = this.b;
                akkp akkpVar54 = akisVar43.a;
                return new awpq(awqjVar, awtiVar, cqohVar3, akkpVar54.br, akkpVar54.wt, akhyVar76.en, akhyVar76.eo, (errl) akisVar43.t.b(), (atmb) this.a.a.kS.b());
            case 289:
                bzgd bzgdVar = (bzgd) this.b.ec.b();
                akkp akkpVar55 = this.a.a;
                fbbf fbbfVar131 = akkpVar55.jZ;
                chep chepVar = (chep) akkpVar55.ql.b();
                akhy akhyVar77 = this.b;
                fbbf fbbfVar132 = akhyVar77.eh;
                chww chwwVar = (chww) akhyVar77.ek.b();
                errl errlVar11 = (errl) this.a.p.b();
                akis akisVar44 = this.a;
                return new awqj(bzgdVar, fbbfVar131, chepVar, fbbfVar132, chwwVar, errlVar11, akisVar44.da, akisVar44.a.bT());
            case 290:
                cqoh cqohVar4 = (cqoh) this.a.cz.b();
                akhy akhyVar78 = this.b;
                akis akisVar45 = this.a;
                fbbf fbbfVar133 = akhyVar78.O;
                fbbf fbbfVar134 = akisVar45.gX;
                errl errlVar12 = (errl) akisVar45.t.b();
                ctyx ctyxVar2 = (ctyx) this.a.aU.b();
                ejar ejarVar = (ejar) this.a.a.au.b();
                akis akisVar46 = this.a;
                return new bzgd(cqohVar4, fbbfVar133, fbbfVar134, errlVar12, ctyxVar2, ejarVar, akisVar46.da, akisVar46.a.eZ);
            case 291:
                return new chez((errl) this.a.t.b(), (Optional) this.a.a.uP.b(), (chrv) this.b.x.b(), (ciji) this.a.a.uQ.b(), (chdj) this.b.eg.b(), this.b.fM(), (chbx) this.a.a.gr.b(), (akzt) this.a.a.f.b(), (Optional) this.a.ip.b(), fbaz.a(this.a.a.uV), (chga) this.a.a.cp.b(), (albq) this.a.a.di.b(), (chih) this.a.a.wq.b());
            case 292:
                return achw.a((cgwk) this.b.ed.b(), Optional.of((cgxw) this.b.ef.b()));
            case 293:
                errl errlVar13 = (errl) this.a.t.b();
                errl errlVar14 = (errl) this.a.p.b();
                errl errlVar15 = (errl) this.a.aK.b();
                chrv chrvVar = (chrv) this.b.x.b();
                chga chgaVar = (chga) this.a.a.cp.b();
                akis akisVar47 = this.a;
                fbbf fbbfVar135 = akisVar47.cz;
                fbbf fbbfVar136 = akisVar47.a.cq;
                cqoh cqohVar5 = (cqoh) fbbfVar135.b();
                akkp akkpVar56 = this.a.a;
                chrz hI = akkpVar56.hI();
                Optional optional3 = (Optional) akkpVar56.Fs.b();
                fazb a2 = fbaz.a(this.a.a.Ft);
                akkp akkpVar57 = this.a.a;
                return new cgwk(errlVar13, errlVar14, errlVar15, chrvVar, chgaVar, fbbfVar136, cqohVar5, hI, optional3, a2, akkpVar57.Fu, (chhg) akkpVar57.cA.b());
            case 294:
                akhy akhyVar79 = this.b;
                return cgxy.a(akhyVar79.de(), (chkj) akhyVar79.ee.b(), (chln) this.a.a.vc.b());
            case 295:
                akis akisVar48 = this.a;
                akhy akhyVar80 = this.b;
                fbbf fbbfVar137 = akisVar48.b.gr;
                chjd dh = akhyVar80.dh();
                fbbf fbbfVar138 = akhyVar80.C;
                chke.a();
                chki.a();
                return chjo.a(fbbfVar137, dh, fbbfVar138);
            case 296:
                akhy akhyVar81 = this.b;
                akis akisVar49 = this.a;
                fbbf fbbfVar139 = akhyVar81.ej;
                return new chww(fbbfVar139, akisVar49.da, fbbfVar139, fbbfVar139);
            case 297:
                akis akisVar50 = this.a;
                akhy akhyVar82 = this.b;
                akkp akkpVar58 = akisVar50.a;
                fbbf fbbfVar140 = akkpVar58.ka;
                fbbf fbbfVar141 = akhyVar82.ec;
                fbbf fbbfVar142 = akkpVar58.ql;
                fbbf fbbfVar143 = akisVar50.p;
                fbbf fbbfVar144 = akkpVar58.jZ;
                fbbf a3 = fbbg.a(akkpVar58.uV);
                akis akisVar51 = this.a;
                akhy akhyVar83 = this.b;
                akkp akkpVar59 = akisVar51.a;
                return new chwx(fbbfVar140, akisVar50.cz, akisVar50.aU, fbbfVar141, fbbfVar142, fbbfVar143, fbbfVar144, a3, akkpVar59.f, akkpVar59.vb, akhyVar83.ei, akkpVar59.ve, akkpVar59.aX, akhyVar83.v, akisVar51.da, akisVar51.ly);
            case 298:
                bzgd bzgdVar2 = (bzgd) this.b.ec.b();
                akis akisVar52 = this.a;
                fbbf fbbfVar145 = akisVar52.cz;
                akkp akkpVar60 = akisVar52.a;
                return new bzaw(bzgdVar2, akkpVar60.cq, akkpVar60.vc, (cqoh) fbbfVar145.b(), (errl) this.a.t.b());
            case 299:
                return new awss((awsp) this.b.em.b(), (ffsk) this.a.a.p.b());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object e() {
        int i = this.c;
        switch (i) {
            case 300:
                return new awsv((alxl) this.b.ao.b(), (aqvh) this.b.M.b(), this.a.a.bg());
            case 301:
                return new azfw((azfv) this.b.aw.b(), (ffsk) this.a.a.p.b());
            case 302:
                akis akisVar = this.a;
                akhy akhyVar = this.b;
                akkp akkpVar = akisVar.a;
                return new baed(akkpVar.f, akhyVar.P, akhyVar.S, akisVar.cz, akkpVar.fP, akkpVar.dp, akkpVar.ay, akhyVar.M, akisVar.p);
            case 303:
                errl errlVar = (errl) this.a.aK.b();
                akis akisVar2 = this.a;
                akhy akhyVar2 = this.b;
                fbbf fbbfVar = akhyVar2.dl;
                akkp akkpVar2 = akisVar2.a;
                fbbf fbbfVar2 = akkpVar2.fP;
                fbbf fbbfVar3 = akkpVar2.aV;
                fbbf fbbfVar4 = akhyVar2.W;
                fbbf fbbfVar5 = akhyVar2.P;
                fbbf fbbfVar6 = akhyVar2.S;
                fbbf fbbfVar7 = akhyVar2.X;
                fbbf fbbfVar8 = akisVar2.li;
                cowq cowqVar = (cowq) fbbfVar.b();
                avkm avkmVar = (avkm) this.a.a.nK.b();
                ckju ckjuVar = (ckju) this.b.ct.b();
                akkp akkpVar3 = this.a.a;
                fbbf fbbfVar9 = akkpVar3.fJ;
                dtuu dtuuVar = (dtuu) akkpVar3.ay.b();
                byzp byzpVar = (byzp) this.a.a.iy.b();
                akhy akhyVar3 = this.b;
                fbbf fbbfVar10 = akhyVar3.dz;
                cubr cubrVar = (cubr) akhyVar3.dA.b();
                cbut cbutVar = (cbut) this.b.df.b();
                bdvi bdviVar = (bdvi) this.b.bn.b();
                cqoh cqohVar = (cqoh) this.a.cz.b();
                ckch ckchVar = (ckch) this.b.bD.b();
                bbgg bbggVar = (bbgg) this.b.dk.b();
                bbfo bbfoVar = (bbfo) this.a.jU.b();
                cqos cqosVar = (cqos) this.b.bO.b();
                cvlf cvlfVar = (cvlf) this.b.bg.b();
                avff avffVar = (avff) this.a.a.uf.b();
                akis akisVar3 = this.a;
                akhy akhyVar4 = this.b;
                fbbf fbbfVar11 = akhyVar4.bF;
                cfmp hi = akisVar3.a.hi();
                fbbf fbbfVar12 = akhyVar4.dD;
                fbbf fbbfVar13 = akhyVar4.er;
                fazb a = fbaz.a(this.b.et);
                akis akisVar4 = this.a;
                fbbf fbbfVar14 = akisVar4.a.Z;
                akkp akkpVar4 = this.a.a;
                akhy akhyVar5 = this.b;
                fbbf fbbfVar15 = akkpVar4.sY;
                cers cersVar = (cers) akhyVar5.eu.b();
                akhy akhyVar6 = this.b;
                akkp akkpVar5 = this.a.a;
                fbbf fbbfVar16 = akhyVar6.dI;
                fbbf fbbfVar17 = akkpVar5.tE;
                cqvy cqvyVar = (cqvy) akkpVar5.oP.b();
                akhy akhyVar7 = this.b;
                Object b = this.a.ml.b();
                akis akisVar5 = this.a;
                akhy akhyVar8 = this.b;
                akkp akkpVar6 = akisVar5.a;
                fbbf fbbfVar18 = akkpVar6.pi;
                fbbf fbbfVar19 = akkpVar6.uL;
                fbbf fbbfVar20 = akhyVar8.ev;
                atmc ce = akkpVar6.ce();
                atmb atmbVar = (atmb) akkpVar6.kS.b();
                akis akisVar6 = this.a;
                akhy akhyVar9 = this.b;
                akkp akkpVar7 = akisVar6.a;
                fbbf fbbfVar21 = akkpVar7.yJ;
                fbbf fbbfVar22 = akhyVar9.en;
                fbbf fbbfVar23 = akhyVar9.ew;
                fbbf fbbfVar24 = akhyVar9.aw;
                fbbf fbbfVar25 = akhyVar9.ai;
                fbbf fbbfVar26 = akkpVar7.kR;
                return cqzy.a(errlVar, fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, cowqVar, avkmVar, ckjuVar, fbbfVar9, dtuuVar, byzpVar, fbbfVar10, cubrVar, cbutVar, bdviVar, cqohVar, ckchVar, bbggVar, bbfoVar, cqosVar, cvlfVar, avffVar, hi, fbbfVar12, fbbfVar13, a, fbbfVar14, fbbfVar15, cersVar, fbbfVar16, fbbfVar17, akhyVar6.cT, cqvyVar, akhyVar7.bv, b, fbbfVar18, akhyVar8.dm, fbbfVar19, fbbfVar20, ce, atmbVar, fbbfVar21, fbbfVar22, fbbfVar23, fbbfVar24, fbbfVar25, fbbfVar26);
            case 304:
                return new cqxx(this.a.a.cc);
            case 305:
                akhy akhyVar10 = this.b;
                akkp akkpVar8 = this.a.a;
                cmjg em = akhyVar10.em();
                cagw bj = akhyVar10.bj();
                cmle eo = akhyVar10.eo();
                bdnu bdnuVar = (bdnu) akkpVar8.uj.b();
                akhy akhyVar11 = this.b;
                return enip.v(em, bj, eo, bdnuVar, akhyVar11.er(), akhyVar11.bk(), this.a.a.pa(), this.b.dc(), this.b.es(), (bdnu) this.a.kv.b(), this.b.E(), this.b.ev(), this.b.eA(), this.a.a.lA(), this.a.a.hs(), this.a.a.lt(), this.b.h());
            case 306:
                akhy akhyVar12 = this.b;
                akis akisVar7 = this.a;
                akkp akkpVar9 = akisVar7.a;
                return new cmtk(akhyVar12.bA, akisVar7.iy, akkpVar9.uo, akkpVar9.q, akkpVar9.lb);
            case 307:
                return new cers(this.a.a.cc);
            case 308:
                akhy akhyVar13 = this.b;
                return new cldk(akhyVar13.aF, akhyVar13.Q, (ffhd) this.a.cP.b(), (ffsk) this.a.a.p.b());
            case 309:
                Context context = (Context) this.a.q.b();
                akis akisVar8 = this.a;
                akhy akhyVar14 = this.b;
                akkp akkpVar10 = akisVar8.a;
                return new avhl(context, akkpVar10.kG, akkpVar10.fP, akisVar8.cv, akhyVar14.W, akhyVar14.P, akisVar8.aR, akkpVar10.iN, akhyVar14.cT);
            case 310:
                return new avig((errl) this.a.p.b(), (errl) this.a.t.b(), this.b.ey, this.a.iz);
            case 311:
                akhy akhyVar15 = this.b;
                akis akisVar9 = this.a;
                akkp akkpVar11 = akisVar9.a;
                return new bart(akhyVar15.W, akhyVar15.P, akkpVar11.BF, akhyVar15.S, akkpVar11.sY, akisVar9.cz, akhyVar15.O, akhyVar15.bD, akhyVar15.cn);
            case 312:
                atmh atmhVar = (atmh) this.a.a.sG.b();
                akhy akhyVar16 = this.b;
                return clcw.a(atmhVar, akhyVar16.eb(), akhyVar16.ec());
            case 313:
                akhy akhyVar17 = this.b;
                akis akisVar10 = this.a;
                fbbf fbbfVar27 = akhyVar17.S;
                fbbf fbbfVar28 = akhyVar17.bD;
                fbbf fbbfVar29 = akhyVar17.eu;
                fbbf fbbfVar30 = akisVar10.p;
                akkp akkpVar12 = akisVar10.a;
                return new bahx(fbbfVar27, fbbfVar28, fbbfVar29, fbbfVar30, akisVar10.aK, akkpVar12.Z, akhyVar17.ai, akkpVar12.sG);
            case 314:
                return new cthl(this.b.cw);
            case 315:
                Object b2 = this.b.eD.b();
                akhy akhyVar18 = this.b;
                return awpv.a(b2, akhyVar18.ar(), (avgr) akhyVar18.eE.b(), (ffsk) this.a.a.aq.b());
            case 316:
                akis akisVar11 = this.a;
                avhf cR = akisVar11.a.cR();
                errl errlVar2 = (errl) akisVar11.p.b();
                errl errlVar3 = (errl) this.a.t.b();
                akkp akkpVar13 = this.a.a;
                return new avgr(cR, errlVar2, errlVar3, akkpVar13.u, fbaz.a(akkpVar13.BN), fbaz.a(this.a.a.BO), (Context) this.a.q.b(), (avff) this.a.a.uf.b(), (cqoh) this.a.cz.b(), (avjf) this.a.a.eT.b(), (albq) this.a.a.di.b(), (avhl) this.b.ew.b(), (errm) this.a.p.b(), this.a.a.BP);
            case 317:
                return new club((cltu) this.b.gd(), (errl) this.a.p.b());
            case 318:
                akhy akhyVar19 = this.b;
                akis akisVar12 = this.a;
                return new clue((cltu) akhyVar19.ge(), akisVar12.a.jg(), (errl) akisVar12.p.b());
            case 319:
                return new clti((errl) this.a.p.b(), (cltu) this.b.ga());
            case 320:
                return new cltm((errl) this.a.p.b(), (cltu) this.b.gb());
            case 321:
                return new clty((errl) this.a.p.b(), (cltu) this.b.gc());
            case 322:
                return new clun((errl) this.a.p.b(), (cltu) this.b.gg());
            case 323:
                return new cluk((errl) this.a.p.b(), (cltu) this.b.gf());
            case 324:
                akhy akhyVar20 = this.b;
                akis akisVar13 = this.a;
                akkp akkpVar14 = akisVar13.a;
                return new cpmk(akhyVar20.eO, akhyVar20.eP, akhyVar20.eQ, akhyVar20.eR, akhyVar20.eS, akhyVar20.eT, akhyVar20.eU, akkpVar14.dE, akkpVar14.gm, akhyVar20.fa, akkpVar14.yh, (errm) akisVar13.p.b(), (errl) this.a.t.b(), this.a.a.jc);
            case 325:
                return new cpnp(this.a.a.cc);
            case 326:
                return new cpnk(this.a.a.cc);
            case 327:
                return new cpji(this.a.a.cc);
            case 328:
                return new cpiy(this.a.a.cc);
            case 329:
                return new cpne(this.a.a.cc);
            case 330:
                return new cpop(this.a.a.cc);
            case 331:
                return new cpkf(this.a.a.cc);
            case 332:
                return new cpob((cpnb) this.b.gu(), this.a.a.jc);
            case 333:
                akis akisVar14 = this.a;
                return new cpow(akisVar14.a.G, this.b.eV, (errl) akisVar14.p.b());
            case 334:
                return new cpke(this.b.ct, (akzt) this.a.a.f.b(), (errl) this.a.t.b(), (errl) this.a.p.b());
            case 335:
                return Optional.of((cppe) this.b.eY.b());
            case 336:
                return new akhd(this);
            case 337:
                return Optional.of((cppg) this.b.aH.b());
            case 338:
                akhy akhyVar21 = this.b;
                akis akisVar15 = this.a;
                return new aqbp(akhyVar21.fo, akisVar15.a.fP, akhyVar21.fr, akhyVar21.fv, akisVar15.p);
            case 339:
                akis akisVar16 = this.a;
                akhy akhyVar22 = this.b;
                akkp akkpVar15 = akisVar16.a;
                return new amca(akkpVar15.nS, akhyVar22.fg, akkpVar15.iy, akhyVar22.fk, akhyVar22.fl, akhyVar22.bw, akhyVar22.fm, (errl) akisVar16.t.b(), this.b.fn, this.a.a.c);
            case 340:
                akis akisVar17 = this.a;
                akhy akhyVar23 = this.b;
                akkp akkpVar16 = akisVar17.a;
                return new bagj(akkpVar16.fr, akhyVar23.P, akkpVar16.ay, akkpVar16.Z, akkpVar16.ix, akkpVar16.iz, akkpVar16.iA, akkpVar16.CS, akhyVar23.dj, akhyVar23.dX, akkpVar16.mV, akkpVar16.le);
            case 341:
                akis akisVar18 = this.a;
                akhy akhyVar24 = this.b;
                fbbf fbbfVar31 = akisVar18.q;
                fbbf fbbfVar32 = akhyVar24.S;
                akkp akkpVar17 = akisVar18.a;
                return new batq(fbbfVar31, fbbfVar32, akisVar18.cz, akhyVar24.an, akhyVar24.fh, akkpVar17.pt, akhyVar24.fj, akhyVar24.cT, akhyVar24.bh, akkpVar17.pD, akhyVar24.P);
            case 342:
                akhy akhyVar25 = this.b;
                akis akisVar19 = this.a;
                fbbf fbbfVar33 = akhyVar25.S;
                akkp akkpVar18 = akisVar19.a;
                return new bavo(fbbfVar33, akisVar19.cz, akkpVar18.f, akisVar19.t, akisVar19.p, akhyVar25.bO, akkpVar18.oP, akkpVar18.oQ, akhyVar25.dT, akkpVar18.pq);
            case 343:
                return new banu((csxu) this.a.aO.b(), (bbgq) this.b.fi.b());
            case 344:
                return new bbgq(this.b.S, (bbfw) this.a.a.pt.b());
            case 345:
                akis akisVar20 = this.a;
                akhy akhyVar26 = this.b;
                akkp akkpVar19 = akisVar20.a;
                return new bauy(akkpVar19.Z, akhyVar26.S, akhyVar26.aF, akkpVar19.aO, akisVar20.cz, akkpVar19.pH, akkpVar19.fP, akkpVar19.dE, akkpVar19.pI, akhyVar26.df, akkpVar19.fr, akkpVar19.pP, akkpVar19.ck, akkpVar19.qL, akisVar20.p, akkpVar19.Q, akhyVar26.dg, akkpVar19.pD, akkpVar19.cj, akkpVar19.ci);
            case 346:
                return new amcq(this.a.a.cc);
            case 347:
                return Optional.of((coja) this.b.fq.b());
            case 348:
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                errl errlVar4 = (errl) this.a.t.b();
                errl errlVar5 = (errl) this.a.p.b();
                akhy akhyVar27 = this.b;
                akis akisVar21 = this.a;
                fbbf fbbfVar34 = akisVar21.aR;
                akkp akkpVar20 = akisVar21.a;
                fbbf fbbfVar35 = akhyVar27.fo;
                fbbf fbbfVar36 = akkpVar20.iy;
                fbbf fbbfVar37 = akkpVar20.ad;
                ejvp ejvpVar = (ejvp) fbbfVar34.b();
                aktq aktqVar = (aktq) this.a.kc.b();
                akhy akhyVar28 = this.b;
                akis akisVar22 = this.a;
                akkp akkpVar21 = akisVar22.a;
                return new aksw(cqohVar2, errlVar4, errlVar5, fbbfVar35, fbbfVar36, fbbfVar37, ejvpVar, aktqVar, akhyVar28.fp, akkpVar21.qQ, akkpVar21.qR, akkpVar21.qS, akkpVar21.aO, akisVar22.bC(), akhyVar28.bu, akhyVar28.S, akhyVar28.P);
            case 349:
                errl errlVar6 = (errl) this.a.t.b();
                akhy akhyVar29 = this.b;
                fbbf fbbfVar38 = this.a.cz;
                fbbf fbbfVar39 = akhyVar29.Y;
                cqoh cqohVar3 = (cqoh) fbbfVar38.b();
                akhy akhyVar30 = this.b;
                akkp akkpVar22 = this.a.a;
                return new akrr(errlVar6, fbbfVar39, cqohVar3, akhyVar30.O, akkpVar22.ad, (dtuu) akkpVar22.ay.b(), this.b.bv);
            case 350:
                akhy akhyVar31 = this.b;
                return enip.r(akhyVar31.dU(), akhyVar31.U());
            case 351:
                return Optional.of((cjyx) this.b.fs.b());
            case 352:
                return new cjyx();
            case 353:
                return new anzg(this.a.a.cc);
            case 354:
                return Optional.of(this.b.X());
            case 355:
                akis akisVar23 = this.a;
                akhy akhyVar32 = this.b;
                akkp akkpVar23 = akisVar23.a;
                return new apxd(akkpVar23.rn, akhyVar32.bz, (ffsk) akkpVar23.aq.b());
            case 356:
                akis akisVar24 = this.a;
                akhy akhyVar33 = this.b;
                akkp akkpVar24 = akisVar24.a;
                return new aoyw(akisVar24.q, akhyVar33.fA, akkpVar24.rB, akkpVar24.rF, akhyVar33.fB, akisVar24.kn, akkpVar24.hH, akkpVar24.rH, akkpVar24.rI, akkpVar24.rJ, akkpVar24.rK);
            case 357:
                return new akhe(this);
            case 358:
                Context context2 = (Context) this.a.q.b();
                ffsk ffskVar = (ffsk) this.a.a.q.b();
                csrv csrvVar = (csrv) this.a.a.iK.b();
                bcsq bcsqVar = (bcsq) this.a.a.rq.b();
                coxk coxkVar = (coxk) this.a.a.iN.b();
                bigl biglVar = (bigl) this.a.ki.b();
                bdnf bdnfVar = (bdnf) this.a.a.rr.b();
                ctwb ctwbVar = (ctwb) this.a.a.c.b();
                akis akisVar25 = this.a;
                akhy akhyVar34 = this.b;
                akkp akkpVar25 = akisVar25.a;
                return new aosg(context2, ffskVar, csrvVar, bcsqVar, coxkVar, biglVar, bdnfVar, ctwbVar, akkpVar25.hH, akhyVar34.fm(), (asnv) akkpVar25.oQ.b(), (atky) this.a.a.rs.b());
            case 359:
                return aqdn.a(this.a.a.rF(), this.b.gE());
            case 360:
                return new aouh(this.b.aE);
            case 361:
                akhy akhyVar35 = this.b;
                return new apqz(akhyVar35.fE, akhyVar35.fk, akhyVar35.fl);
            case 362:
                akis akisVar26 = this.a;
                akhy akhyVar36 = this.b;
                fbbf fbbfVar40 = akisVar26.q;
                fbbf fbbfVar41 = akisVar26.t;
                fbbf fbbfVar42 = akhyVar36.S;
                akkp akkpVar26 = akisVar26.a;
                return new bajc(fbbfVar40, fbbfVar41, fbbfVar42, akhyVar36.bO, akkpVar26.oQ, akhyVar36.dT, akkpVar26.rW);
            case 363:
                return Optional.of(this.b.V());
            case 364:
                akis akisVar27 = this.a;
                akhy akhyVar37 = this.b;
                akkp akkpVar27 = akisVar27.a;
                return new aqen(akkpVar27.p, akkpVar27.aq, akhyVar37.df, akhyVar37.cX);
            case 365:
                return Optional.of(this.b.bZ());
            case 366:
                akhy akhyVar38 = this.b;
                return new cdkp(akhyVar38.bS(), akhyVar38.bU(), akhyVar38.bX(), akhyVar38.bW(), akhyVar38.bT(), akhyVar38.bV(), (axkm) this.a.a.ck.b(), (cbwj) this.a.a.kG.b(), (ffsk) this.a.a.aq.b(), (ffhd) this.a.cP.b(), (cevh) this.a.a.cc.b(), this.a.a.bX());
            case 367:
                return Optional.of(this.b.Z());
            case 368:
                akhy akhyVar39 = this.b;
                fbbf fbbfVar43 = this.a.cP;
                fbbf fbbfVar44 = akhyVar39.S;
                ffhd ffhdVar = (ffhd) fbbfVar43.b();
                akis akisVar28 = this.a;
                fbbf fbbfVar45 = akisVar28.cz;
                fbbf fbbfVar46 = akisVar28.a.aO;
                cqoh cqohVar4 = (cqoh) fbbfVar45.b();
                akhy akhyVar40 = this.b;
                akkp akkpVar28 = this.a.a;
                return new aqes(fbbfVar44, akhyVar39.cX, ffhdVar, fbbfVar46, cqohVar4, akhyVar40.bw, akkpVar28.pR, (dtuu) akkpVar28.ay.b(), (ffsk) this.a.a.p.b());
            case 369:
                ffsk ffskVar2 = (ffsk) this.a.a.aq.b();
                akis akisVar29 = this.a;
                akhy akhyVar41 = this.b;
                akkp akkpVar29 = akisVar29.a;
                return new apsk(ffskVar2, akkpVar29.iy, akhyVar41.eA, akhyVar41.S, akhyVar41.bv, akhyVar41.X, (dtuu) akkpVar29.ay.b(), this.b.fM);
            case 370:
                return Optional.of((cnbg) this.b.bA.b());
            case 371:
                akis akisVar30 = this.a;
                akhy akhyVar42 = this.b;
                akkp akkpVar30 = akisVar30.a;
                return enip.v(akkpVar30.ay(), akkpVar30.ln(), akhyVar42.O(), akkpVar30.jN(), akhyVar42.N(), akkpVar30.C(), this.b.dZ(), this.b.A(), this.b.G(), this.a.a.aB());
            case 372:
                return Optional.of(this.b.B());
            case 373:
                return new ajca((Context) this.a.q.b(), (cqoh) this.a.cz.b(), this.b.aS);
            case 374:
                ffsk ffskVar3 = (ffsk) this.a.a.p.b();
                ejnr ejnrVar = (ejnr) this.b.fT.b();
                akis akisVar31 = this.a;
                akhy akhyVar43 = this.b;
                akko akkoVar = akisVar31.b;
                return new cjxc(ffskVar3, ejnrVar, akkoVar.gA, akkoVar.gB, akkoVar.gC, akhyVar43.dS(), akisVar31.p);
            case 375:
                Context context3 = (Context) this.a.q.b();
                ejpq ejpqVar = (ejpq) this.a.dX.b();
                Executor executor = (Executor) this.a.t.b();
                return new ejot(context3, ejpqVar, executor, (eisx) this.b.b.b());
            case 376:
                akhy akhyVar44 = this.b;
                akis akisVar32 = this.a;
                akko akkoVar2 = akisVar32.b;
                akkp akkpVar31 = akisVar32.a;
                cjui dP = akhyVar44.dP();
                fbbf fbbfVar47 = akhyVar44.fZ;
                fbbf fbbfVar48 = akhyVar44.ga;
                fbbf fbbfVar49 = akkpVar31.lI;
                fbbf fbbfVar50 = akkoVar2.gF;
                fbbf fbbfVar51 = akkoVar2.gG;
                fbbf fbbfVar52 = akkpVar31.dg;
                fbbf fbbfVar53 = akkpVar31.Z;
                cjzg cjzgVar = (cjzg) akkpVar31.ms.b();
                akkp akkpVar32 = this.a.a;
                return new cjsn(dP, fbbfVar47, fbbfVar48, fbbfVar49, fbbfVar50, fbbfVar51, fbbfVar52, fbbfVar53, cjzgVar, akkpVar32.lP, (ffsk) akkpVar32.q.b(), (ffhd) this.a.cP.b(), (cghm) this.a.a.eX.b(), (aulk) this.a.a.gX.b());
            case 377:
                return dyfx.a((dyfb) this.a.pc.b(), (eisx) this.b.b.b(), (ejar) this.a.a.au.b(), (errm) this.a.p.b());
            case 378:
                return cjuj.a((ewru) this.b.fV.b(), (ekqb) this.b.l.b());
            case 379:
                akhy akhyVar45 = this.b;
                akis akisVar33 = this.a;
                return cjuk.a(akhyVar45.fL(), akisVar33.b.gr, (chhs) akisVar33.a.aW.b());
            case 380:
                return Optional.of((cjsx) this.b.fY.b());
            case 381:
                return new cjtn((effy) this.b.fX.b(), (errm) this.a.t.b(), (ffhd) this.a.cP.b());
            case 382:
                return cjtx.a(cjto.a(), this.b.fD(), (efbm) this.a.aM.b());
            case 383:
                akkp akkpVar33 = this.a.a;
                return new cjve(akkpVar33.ab, akkpVar33.lI, akkpVar33.km);
            case 384:
                akhy akhyVar46 = this.b;
                akis akisVar34 = this.a;
                return new aper(akhyVar46.gg, akhyVar46.bb, akisVar34.a.p, akisVar34.co);
            case 385:
                akis akisVar35 = this.a;
                akhy akhyVar47 = this.b;
                akkp akkpVar34 = akisVar35.a;
                return new apfk(akkpVar34.p, akkpVar34.aq, akisVar35.hi, akisVar35.iE, akhyVar47.gf, akisVar35.lB, akisVar35.jC);
            case 386:
                return Optional.of((ctta) this.b.ge.b());
            case 387:
                errl errlVar7 = (errl) this.a.p.b();
                ffsk ffskVar4 = (ffsk) this.a.a.p.b();
                ffsk ffskVar5 = (ffsk) this.a.a.aq.b();
                akis akisVar36 = this.a;
                return new cttm(errlVar7, ffskVar4, ffskVar5, akisVar36.jx, akisVar36.a.jZ(), akisVar36.dy, akisVar36.aR, this.b.cz);
            case 388:
                return new akhf(this);
            case 389:
                ffhd ffhdVar2 = (ffhd) this.a.cP.b();
                ffsk ffskVar6 = (ffsk) this.a.a.p.b();
                cqoh cqohVar5 = (cqoh) this.a.cz.b();
                amhs amhsVar = (amhs) this.b.aM.b();
                akhy akhyVar48 = this.b;
                akis akisVar37 = this.a;
                avkj avkjVar = (avkj) akhyVar48.bj.b();
                ayif ayifVar = (ayif) this.b.cn.b();
                akhy akhyVar49 = this.b;
                ecrj ecrjVar = (ecrj) this.a.cN.b();
                akhy akhyVar50 = this.b;
                akkp akkpVar35 = this.a.a;
                fbbf fbbfVar54 = akhyVar50.aw;
                fbbf fbbfVar55 = akkpVar35.Q;
                fbbf fbbfVar56 = akkpVar35.kv;
                akkpVar35.dJ();
                return new amlt(ffhdVar2, ffskVar6, cqohVar5, amhsVar, akhyVar48.aE, akisVar37.aZ, avkjVar, ayifVar, akhyVar49.ct, ecrjVar, fbbfVar54, fbbfVar55, fbbfVar56, this.a.a.cr());
            case 390:
                akis akisVar38 = this.a;
                akhy akhyVar51 = this.b;
                return new bafp(akisVar38.cz, akhyVar51.gk, akhyVar51.M, akisVar38.p);
            case 391:
                errl errlVar8 = (errl) this.a.aK.b();
                errl errlVar9 = (errl) this.a.p.b();
                errl errlVar10 = (errl) this.a.t.b();
                akhy akhyVar52 = this.b;
                akkp akkpVar36 = this.a.a;
                fazb a2 = fbaz.a(akhyVar52.cX);
                fbbf fbbfVar57 = akhyVar52.W;
                fbbf fbbfVar58 = akhyVar52.P;
                ctvb ctvbVar = (ctvb) akkpVar36.u.b();
                bdtd bdtdVar = (bdtd) this.a.a.aO.b();
                cbgf cbgfVar = (cbgf) this.b.O.b();
                dtuu dtuuVar2 = (dtuu) this.a.a.ay.b();
                bcvw bcvwVar = (bcvw) this.b.bo.b();
                Optional of = Optional.of((cpdd) this.a.a.jo.b());
                avkj avkjVar2 = (avkj) this.b.bj.b();
                akkp akkpVar37 = this.a.a;
                fbbf fbbfVar59 = akkpVar37.G;
                aolr aolrVar = (aolr) this.a.a.Z.b();
                ayif ayifVar2 = (ayif) this.b.cn.b();
                akhy akhyVar53 = this.b;
                ecrj ecrjVar2 = (ecrj) this.a.cN.b();
                akkp akkpVar38 = this.a.a;
                return new ammv(errlVar8, errlVar9, errlVar10, a2, fbbfVar57, fbbfVar58, ctvbVar, bdtdVar, cbgfVar, dtuuVar2, bcvwVar, of, avkjVar2, fbbfVar59, aolrVar, ayifVar2, akhyVar53.ct, akhyVar53.ax, ecrjVar2, akkpVar38.Q, (asmj) akkpVar38.jD.b(), this.a.a.jF);
            case 392:
                errl errlVar11 = (errl) this.a.t.b();
                akhy akhyVar54 = this.b;
                return new aygf(errlVar11, akhyVar54.O, this.a.a.ay, akhyVar54.Y, akhyVar54.gm);
            case 393:
                return new ceqc(this.a.a.cc);
            case 394:
                akhy akhyVar55 = this.b;
                akkp akkpVar39 = this.a.a;
                fbbf fbbfVar60 = akhyVar55.W;
                fbbf fbbfVar61 = akhyVar55.P;
                fbbf fbbfVar62 = akhyVar55.dD;
                fbbf fbbfVar63 = akhyVar55.gr;
                fbbf fbbfVar64 = akkpVar39.Z;
                fbbf fbbfVar65 = akkpVar39.xb;
                dtuu dtuuVar3 = (dtuu) akkpVar39.ay.b();
                akhy akhyVar56 = this.b;
                fbbf fbbfVar66 = this.a.co;
                fbbf fbbfVar67 = akhyVar56.gs;
                fbbf fbbfVar68 = akhyVar56.gt;
                ffhd ffhdVar3 = (ffhd) fbbfVar66.b();
                ffsk ffskVar7 = (ffsk) this.a.a.q.b();
                return new crsa(fbbfVar60, fbbfVar61, fbbfVar62, fbbfVar63, akhyVar55.cD, fbbfVar64, akhyVar55.aE, fbbfVar65, dtuuVar3, fbbfVar67, fbbfVar68, akhyVar56.cE, ffhdVar3, ffskVar7);
            case 395:
                akhy akhyVar57 = this.b;
                fbbf fbbfVar69 = akhyVar57.cD;
                fbbf fbbfVar70 = akhyVar57.gp;
                fbbf fbbfVar71 = akhyVar57.gq;
                croc crocVar = (croc) fbbfVar69.b();
                akhy akhyVar58 = this.b;
                akkp akkpVar40 = this.a.a;
                fbbf fbbfVar72 = akhyVar58.W;
                fbbf fbbfVar73 = akhyVar58.P;
                fbbf fbbfVar74 = akkpVar40.xb;
                dtuu dtuuVar4 = (dtuu) akkpVar40.ay.b();
                akhy akhyVar59 = this.b;
                return new cucf(akhyVar57.cK, fbbfVar70, fbbfVar71, crocVar, fbbfVar72, fbbfVar73, akhyVar58.cC, fbbfVar74, dtuuVar4, akhyVar59.cI, akhyVar59.dC);
            case 396:
                Context context4 = (Context) this.a.q.b();
                akhy akhyVar60 = this.b;
                akkp akkpVar41 = this.a.a;
                return new cujh(context4, akhyVar60.fg, akhyVar60.S, akhyVar60.W, akhyVar60.cn, akkpVar41.CT, akkpVar41.iy, akkpVar41.aO, akkpVar41.Z, akhyVar60.go, akkpVar41.ft, (ffsk) akkpVar41.aq.b());
            case 397:
                Context context5 = (Context) this.a.q.b();
                cuiw cuiwVar = new cuiw();
                akis akisVar39 = this.a;
                akhy akhyVar61 = this.b;
                fbbf fbbfVar75 = akisVar39.iz;
                akkp akkpVar42 = akisVar39.a;
                return new cuiv(context5, cuiwVar, fbbfVar75, akhyVar61.cj, akisVar39.hd, akisVar39.iq, akkpVar42.nK, akhyVar61.aF, akkpVar42.br);
            case 398:
                akhy akhyVar62 = this.b;
                akis akisVar40 = this.a;
                akkp akkpVar43 = akisVar40.a;
                fbbf fbbfVar76 = akhyVar62.S;
                fbbf fbbfVar77 = akhyVar62.P;
                fbbf fbbfVar78 = akkpVar43.Bu;
                fbbf fbbfVar79 = akkpVar43.G;
                fbbf fbbfVar80 = akkpVar43.aO;
                errl errlVar12 = (errl) akisVar40.t.b();
                errl errlVar13 = (errl) this.a.p.b();
                akkp akkpVar44 = this.a.a;
                return new cuse(fbbfVar76, fbbfVar77, akhyVar62.cj, fbbfVar78, fbbfVar79, fbbfVar80, akhyVar62.aF, errlVar12, errlVar13, akkpVar44.br, akkpVar44.CW);
            case 399:
                return new crsg(this.b.P);
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r7v34, types: [avtc, java.lang.Object] */
    private final Object f() {
        int i = this.c;
        switch (i) {
            case 400:
                akhy akhyVar = this.b;
                akkp akkpVar = this.a.a;
                return new crsl(akhyVar.W, akhyVar.P, akhyVar.S, akhyVar.M, akkpVar.Z, (ffsk) akkpVar.q.b());
            case 401:
                return Optional.of((cbvt) this.b.cX.b());
            case 402:
                errl errlVar = (errl) this.a.aK.b();
                errl errlVar2 = (errl) this.a.p.b();
                akhy akhyVar2 = this.b;
                return new amui(errlVar, errlVar2, akhyVar2.P, akhyVar2.O, akhyVar2.fm, this.a.a.xg);
            case 403:
                return new ckqj(this.a.a.cc);
            case 404:
                return Optional.of(this.b.P());
            case 405:
                ffsk ffskVar = (ffsk) this.a.a.aq.b();
                ffsk ffskVar2 = (ffsk) this.a.a.q.b();
                akis akisVar = this.a;
                fbbf fbbfVar = this.b.bj;
                fbbf fbbfVar2 = akisVar.a.xp;
                avkj avkjVar = (avkj) fbbfVar.b();
                cktv cktvVar = (cktv) this.b.gz.b();
                akhy akhyVar3 = this.b;
                akkp akkpVar2 = this.a.a;
                amvj S = akhyVar3.S();
                cktw cktwVar = (cktw) akkpVar2.xv.b();
                akhy akhyVar4 = this.b;
                fbbf fbbfVar3 = this.a.cz;
                alja J = akhyVar4.J();
                cqoh cqohVar = (cqoh) fbbfVar3.b();
                akkp akkpVar3 = this.a.a;
                return new amut(ffskVar, ffskVar2, fbbfVar2, avkjVar, cktvVar, S, cktwVar, J, cqohVar, akkpVar3.xr, akkpVar3.C);
            case 406:
                return new cktv((dtuu) this.a.a.ay.b(), (ffhd) this.a.cP.b(), (ffsk) this.a.a.aq.b(), this.b.P, (cqoh) this.a.cz.b());
            case 407:
                Context context = (Context) this.a.q.b();
                ffsk ffskVar3 = (ffsk) this.a.a.aq.b();
                ffsk ffskVar4 = (ffsk) this.a.a.p.b();
                akis akisVar2 = this.a;
                akhy akhyVar5 = this.b;
                akkp akkpVar4 = akisVar2.a;
                return new amzm(context, ffskVar3, ffskVar4, akisVar2.cN, akhyVar5.cn, akkpVar4.w, akkpVar4.hS, akkpVar4.hR, akkpVar4.xx, akkpVar4.xy, akhyVar5.dK);
            case 408:
                ffsk ffskVar5 = (ffsk) this.a.a.p.b();
                ffhd ffhdVar = (ffhd) this.a.co.b();
                akis akisVar3 = this.a;
                akhy akhyVar6 = this.b;
                return new amih(ffskVar5, ffhdVar, akisVar3.cz, akhyVar6.bn, (ckqj) akhyVar6.gx.b());
            case 409:
                akhy akhyVar7 = this.b;
                akis akisVar4 = this.a;
                fbbf fbbfVar4 = akisVar4.cP;
                akkp akkpVar5 = akisVar4.a;
                fbbf fbbfVar5 = akhyVar7.av;
                fbbf fbbfVar6 = akkpVar5.C;
                fbbf fbbfVar7 = akkpVar5.kp;
                fbbf fbbfVar8 = akkpVar5.Z;
                ffhd ffhdVar2 = (ffhd) fbbfVar4.b();
                ffsk ffskVar6 = (ffsk) this.a.a.p.b();
                atlx atlxVar = (atlx) this.a.a.kv.b();
                return new amnr(fbbfVar5, akhyVar7.cn, fbbfVar6, fbbfVar7, fbbfVar8, akhyVar7.dn, ffhdVar2, ffskVar6, atlxVar);
            case 410:
                return Optional.of(this.b.fl());
            case 411:
                ffhd ffhdVar3 = (ffhd) this.a.cn.b();
                akhy akhyVar8 = this.b;
                akis akisVar5 = this.a;
                akkp akkpVar6 = akisVar5.a;
                fbbf fbbfVar9 = akhyVar8.dU;
                fbbf fbbfVar10 = akkpVar6.nK;
                cslr cslrVar = (cslr) akisVar5.iq.b();
                akkp akkpVar7 = this.a.a;
                return new cuev(ffhdVar3, fbbfVar9, fbbfVar10, cslrVar, akkpVar7.G, akkpVar7.kP, akkpVar7.yQ, akkpVar7.yt, akkpVar7.cI(), akkpVar7.mr());
            case 412:
                return Optional.of((cbvt) this.b.cX.b());
            case 413:
                return new enpx(this.b.aQ());
            case 414:
                return new bzrd(this.a.a.cc);
            case 415:
                return Optional.of((cbvt) this.b.cX.b());
            case 416:
                return Optional.of((cnla) this.b.gQ.b());
            case 417:
                Context context2 = (Context) this.a.q.b();
                akhy akhyVar9 = this.b;
                akis akisVar6 = this.a;
                fbbf fbbfVar11 = akhyVar9.S;
                fbbf fbbfVar12 = akhyVar9.gP;
                errl errlVar3 = (errl) akisVar6.t.b();
                errl errlVar4 = (errl) this.a.p.b();
                akis akisVar7 = this.a;
                fazb a = fbaz.a(akisVar7.a.jc);
                akis akisVar8 = this.a;
                akhy akhyVar10 = this.b;
                akkp akkpVar8 = akisVar8.a;
                fbbf fbbfVar13 = akkpVar8.fP;
                fbbf fbbfVar14 = akkpVar8.az;
                fbbf fbbfVar15 = akkpVar8.dE;
                fbbf fbbfVar16 = akhyVar10.an;
                fbbf fbbfVar17 = akisVar8.oa;
                fbbf fbbfVar18 = akhyVar10.O;
                fbbf fbbfVar19 = akisVar8.od;
                return new ddcy(context2, fbbfVar11, fbbfVar12, errlVar3, errlVar4, akisVar7.cz, a, fbbfVar13, fbbfVar14, fbbfVar15, fbbfVar16, fbbfVar17, fbbfVar18, akisVar8.ob, akisVar8.oc, Optional.of(fbbfVar19));
            case 418:
                return new cirp(this.a.a.cc);
            case 419:
                ffsk ffskVar7 = (ffsk) this.a.a.aq.b();
                ffhd ffhdVar4 = (ffhd) this.a.cP.b();
                akis akisVar9 = this.a;
                akhy akhyVar11 = this.b;
                fbbf fbbfVar20 = akisVar9.a.C;
                fbbf fbbfVar21 = akhyVar11.S;
                fbbf fbbfVar22 = akhyVar11.W;
                fazb a2 = fbaz.a(akhyVar11.gS);
                akkp akkpVar9 = this.a.a;
                return new curi(ffskVar7, ffhdVar4, fbbfVar20, fbbfVar21, fbbfVar22, a2, akkpVar9.ih, akkpVar9.ig);
            case 420:
                return new crnf(this.b.W, (altk) this.a.a.fP.b());
            case 421:
                Context context3 = (Context) this.a.q.b();
                cbbu cbbuVar = (cbbu) this.a.dB.b();
                akis akisVar10 = this.a;
                return new azzu(context3, cbbuVar, akisVar10.a.t, this.b.P, akisVar10.t);
            case 422:
                return new bdql(this.b.gY, this.a.a.ay);
            case 423:
                akhy akhyVar12 = this.b;
                return enip.r(akhyVar12.ab(), akhyVar12.eQ());
            case 424:
                return new aqpx(this.a.a.cc);
            case 425:
                return new ayvt(this.b.ct);
            case 426:
                return new bdvl((ckac) this.b.aF.b(), (aolr) this.a.a.Z.b());
            case 427:
                akis akisVar11 = this.a;
                akhy akhyVar13 = this.b;
                akkp akkpVar10 = akisVar11.a;
                return new bczv(akkpVar10.ay, akhyVar13.hc, (ffsk) akkpVar10.p.b());
            case 428:
                akhy akhyVar14 = this.b;
                return enip.r(akhyVar14.aR(), akhyVar14.cY());
            case 429:
                akis akisVar12 = this.a;
                akhy akhyVar15 = this.b;
                akkp akkpVar11 = akisVar12.a;
                return new aqyi(akkpVar11.bC, akkpVar11.bF, akkpVar11.hd, akkpVar11.he, akhyVar15.hg);
            case 430:
                akis akisVar13 = this.a;
                akhy akhyVar16 = this.b;
                akkp akkpVar12 = akisVar13.a;
                return new aqyr(akkpVar12.G, akkpVar12.gE, akkpVar12.Z, akhyVar16.aF, akkpVar12.gU);
            case 431:
                akis akisVar14 = this.a;
                akhy akhyVar17 = this.b;
                akkp akkpVar13 = akisVar14.a;
                return new aqya(akkpVar13.fu, akkpVar13.fM, akhyVar17.hk, (Context) akisVar14.q.b());
            case 432:
                akhy akhyVar18 = this.b;
                akis akisVar15 = this.a;
                akkp akkpVar14 = akisVar15.a;
                return new batz(akhyVar18.P, akhyVar18.X, akhyVar18.Y, akkpVar14.c, akkpVar14.u, akkpVar14.ds, akkpVar14.di, akhyVar18.bh, akhyVar18.hj, akhyVar18.O, akkpVar14.ay, akkpVar14.Z, akisVar15.q);
            case 433:
                return new cish(this.a.a.cc);
            case 434:
                akis akisVar16 = this.a;
                akhy akhyVar19 = this.b;
                akkp akkpVar15 = akisVar16.a;
                return new apkm(akisVar16.p, akkpVar15.p, akisVar16.hi, akisVar16.iB, akkpVar15.li, akkpVar15.lj, akkpVar15.lk, akhyVar19.ap);
            case 435:
                akis akisVar17 = this.a;
                return new aple(akisVar17.a.aq, this.b.aM, akisVar17.cz, akisVar17.hi);
            case 436:
                return new apli(this.b.hs);
            case 437:
                akhy akhyVar20 = this.b;
                return new aobd(akhyVar20.hq, akhyVar20.hr);
            case 438:
                return new aoaz(this.b.aT, this.a.a.yZ);
            case 439:
                return new aobb(this.b.aV, this.a.a.yZ);
            case 440:
                return new cnsb(this.b.eC(), (ffhd) this.a.co.b(), (ffsk) this.a.a.q.b());
            case 441:
                akis akisVar18 = this.a;
                akhy akhyVar21 = this.b;
                akkp akkpVar16 = akisVar18.a;
                return new amyj(akkpVar16.p, akkpVar16.aq, akisVar18.hi, akisVar18.iE, akhyVar21.hv);
            case 442:
                ejvb ejvbVar = (ejvb) this.a.dy.b();
                akis akisVar19 = this.a;
                dtuu dtuuVar = (dtuu) akisVar19.a.ay.b();
                akis akisVar20 = this.a;
                akhy akhyVar22 = this.b;
                akkp akkpVar17 = akisVar20.a;
                fbbf fbbfVar23 = akkpVar17.rq;
                fbbf fbbfVar24 = akkpVar17.vL;
                fbbf fbbfVar25 = akkpVar17.eT;
                fbbf fbbfVar26 = akkpVar17.ld;
                atky atkyVar = (atky) akkpVar17.rs.b();
                ffsk ffskVar8 = (ffsk) this.a.a.q.b();
                return new avjw(ejvbVar, akisVar19.cz, dtuuVar, fbbfVar23, fbbfVar24, fbbfVar25, akhyVar22.aE, fbbfVar26, atkyVar, ffskVar8);
            case 443:
                return new amxw(this.a.a.q, this.b.hx);
            case 444:
                return new ampf(this.a.a.zj, this.b.ao);
            case 445:
                return new apxn(this.b.hz);
            case 446:
                return new anwt(this.b.aW);
            case 447:
                return new amvu(this.a.a.q, this.b.hx);
            case 448:
                return new cube((ffsk) this.a.a.p.b(), (Context) this.a.q.b(), this.a.a.ap, this.b.an);
            case 449:
                return new cesz(this.a.a.cc);
            case 450:
                return cdxj.a(this.a.a.gC(), this.b.cj());
            case 451:
                return new cehz(this.a.a.cc);
            case 452:
                return new ceib(this.a.a.cc);
            case 453:
                return cdld.a(this.a.a.gC(), this.b.bY());
            case 454:
                return cdlf.a(this.a.a.gC(), this.b.bY());
            case 455:
                return cdli.a(this.a.a.gC(), this.b.bY());
            case 456:
                return cdlh.a(this.a.a.gC(), this.b.bY());
            case 457:
                return cdle.a(this.a.a.gC(), this.b.bY());
            case 458:
                return cdlg.a(this.a.a.gC(), this.b.bY());
            case 459:
                return cdqg.a(this.a.a.gC(), this.b.ce());
            case 460:
                return cdqy.a(this.a.a.gC(), this.b.cf());
            case 461:
                return ceiy.a(this.a.a.gC(), this.b.cC());
            case 462:
                return ceiz.a(this.a.a.gC(), this.b.cC());
            case 463:
                akis akisVar21 = this.a;
                akhy akhyVar23 = this.b;
                akkp akkpVar18 = akisVar21.a;
                return ceja.a(akkpVar18.gC(), akhyVar23.cC(), akkpVar18.fY());
            case 464:
                return this.b.ay();
            case 465:
                return this.b.bd();
            case 466:
                akis akisVar22 = this.a;
                akhy akhyVar24 = this.b;
                akkp akkpVar19 = akisVar22.a;
                return cemq.a(akkpVar19.gC(), akhyVar24.cM(), akkpVar19.gS());
            case 467:
                akis akisVar23 = this.a;
                akhy akhyVar25 = this.b;
                akkp akkpVar20 = akisVar23.a;
                return cemw.a(akkpVar20.gC(), akhyVar25.cO(), akkpVar20.gT());
            case 468:
                return cdyo.a(this.a.a.gC(), this.b.cl());
            case 469:
                return ceoq.a(this.a.a.gC(), this.b.cR());
            case 470:
                return new cbto(this.a.a.cc);
            case 471:
                ffsk ffskVar9 = (ffsk) this.a.a.p.b();
                cbwj cbwjVar = (cbwj) this.a.a.kG.b();
                axwk axwkVar = (axwk) this.b.aC.b();
                axwf axwfVar = (axwf) this.a.a.Hm.b();
                akhy akhyVar26 = this.b;
                akkp akkpVar21 = this.a.a;
                ayag ax = akhyVar26.ax();
                fbbf fbbfVar27 = akkpVar21.ml;
                aydo aydoVar = (aydo) akhyVar26.ic.b();
                akkp akkpVar22 = this.a.a;
                return new axzh(ffskVar9, cbwjVar, axwkVar, axwfVar, ax, fbbfVar27, aydoVar, akkpVar22.ej, akkpVar22.mj, akkpVar22.al, akkpVar22.Hs);
            case 472:
                return new aydo(this.a.a.cc);
            case 473:
                ffsk ffskVar10 = (ffsk) this.a.a.p.b();
                akhy akhyVar27 = this.b;
                akis akisVar24 = this.a;
                akkp akkpVar23 = akisVar24.a;
                return new axzn(ffskVar10, akhyVar27.aC, akhyVar27.ie, akhyVar27.f2if, akkpVar23.al, akisVar24.cN, akkpVar23.Hs);
            case 474:
                return new ayas(this.a.a.cc);
            case 475:
                return new aydt(this.a.a.cc);
            case 476:
                return new cepn((cbgf) this.b.O.b(), (dtuu) this.a.a.ay.b(), (errl) this.a.t.b());
            case 477:
                ffsk ffskVar11 = (ffsk) this.a.a.p.b();
                akhy akhyVar28 = this.b;
                akis akisVar25 = this.a;
                akkp akkpVar24 = akisVar25.a;
                return new aydl(ffskVar11, akhyVar28.ii, akkpVar24.mt, akkpVar24.Hz, akkpVar24.HA, akisVar25.cN, akisVar25.cz, akisVar25.ay, akkpVar24.Hs, akkpVar24.al);
            case 478:
                return new aydx((aqkp) this.b.aE.b(), this.a.cN);
            case 479:
                ffsk ffskVar12 = (ffsk) this.a.a.p.b();
                akhy akhyVar29 = this.b;
                akis akisVar26 = this.a;
                akkp akkpVar25 = akisVar26.a;
                return new aydq(ffskVar12, akhyVar29.ii, akkpVar25.mt, akkpVar25.Hz, akkpVar25.HA, akisVar26.ay, akisVar26.cz, akkpVar25.al);
            case 480:
                return new clvd((ffsk) this.a.a.aq.b(), (cvlf) this.b.bg.b(), (azcn) this.b.av.b(), (azcj) this.b.dn.b(), this.a.a.pV());
            case 481:
                return new cdgz((ffsk) this.a.a.aq.b(), (Context) this.a.q.b(), (babm) this.a.a.wl.b(), (cqoh) this.a.cz.b(), (axkm) this.a.a.ck.b(), (cdgx) this.b.f19io.b());
            case 482:
                return new cdgy((cdhd) this.b.im.b(), (cdgw) this.b.in.b());
            case 483:
                return new cdhd(this.a.a.cc);
            case 484:
                return new cdgw(this.a.a.cc);
            case 485:
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                errl errlVar5 = (errl) this.a.t.b();
                errl errlVar6 = (errl) this.a.p.b();
                akhy akhyVar30 = this.b;
                return new ceqz(cqohVar2, errlVar5, errlVar6, akhyVar30.cV(), (badw) akhyVar30.ir.b());
            case 486:
                akhy akhyVar31 = this.b;
                fbbf fbbfVar28 = this.a.cz;
                return new badw(akhyVar31.S, akhyVar31.P, (cqoh) fbbfVar28.b(), this.a.a.ds, (bbel) this.b.iq.b(), (ayif) this.b.cn.b());
            case 487:
                return new bbel(this.b.Y, (coxk) this.a.a.iN.b());
            case 488:
                return new aydd((ffsk) this.a.a.p.b(), (aybz) this.b.iy.b());
            case 489:
                ffsk ffskVar13 = (ffsk) this.a.a.p.b();
                akis akisVar27 = this.a;
                akhy akhyVar32 = this.b;
                akkp akkpVar26 = akisVar27.a;
                fbbf fbbfVar29 = akkpVar26.HU;
                fbbf fbbfVar30 = akkpVar26.Ic;
                fbbf fbbfVar31 = akhyVar32.it;
                fbbf fbbfVar32 = akhyVar32.iw;
                fbbf fbbfVar33 = akhyVar32.ix;
                ejoc ejocVar = (ejoc) akisVar27.dX.b();
                akis akisVar28 = this.a;
                akkp akkpVar27 = akisVar28.a;
                return new aycd(ffskVar13, fbbfVar29, fbbfVar30, fbbfVar31, fbbfVar32, fbbfVar33, ejocVar, akkpVar27.Ie, akisVar28.mY, akkpVar27.HR, akkpVar27.If);
            case 490:
                ffhd ffhdVar5 = (ffhd) this.a.cn.b();
                ffhd ffhdVar6 = (ffhd) this.a.co.b();
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                cbwj cbwjVar2 = (cbwj) this.a.a.kG.b();
                comc comcVar = (comc) this.a.a.HR.b();
                axwk axwkVar2 = (axwk) this.b.aC.b();
                axwf axwfVar2 = (axwf) this.a.a.Hm.b();
                akis akisVar29 = this.a;
                akhy akhyVar33 = this.b;
                akkp akkpVar28 = akisVar29.a;
                fbbf fbbfVar34 = akkpVar28.ej;
                fbbf fbbfVar35 = akkpVar28.C;
                fbbf fbbfVar36 = akkpVar28.al;
                fbbf fbbfVar37 = akkpVar28.ml;
                fbbf fbbfVar38 = akkpVar28.HS;
                aydo aydoVar2 = (aydo) akhyVar33.ic.b();
                aydt aydtVar = (aydt) this.b.f2if.b();
                akis akisVar30 = this.a;
                return new aybp(ffhdVar5, ffhdVar6, cqohVar3, cbwjVar2, comcVar, axwkVar2, axwfVar2, fbbfVar34, fbbfVar35, fbbfVar36, fbbfVar37, fbbfVar38, aydoVar2, aydtVar, akisVar30.a.mj, akisVar30.ay);
            case 491:
                ffhd ffhdVar7 = (ffhd) this.a.cn.b();
                ffhd ffhdVar8 = (ffhd) this.a.co.b();
                cqoh cqohVar4 = (cqoh) this.a.cz.b();
                cbwj cbwjVar3 = (cbwj) this.a.a.kG.b();
                comc comcVar2 = (comc) this.a.a.HR.b();
                axwk axwkVar3 = (axwk) this.b.aC.b();
                axwf axwfVar3 = (axwf) this.a.a.Hm.b();
                akis akisVar31 = this.a;
                akhy akhyVar34 = this.b;
                akkp akkpVar29 = akisVar31.a;
                return new aycs(ffhdVar7, ffhdVar8, cqohVar4, cbwjVar3, comcVar2, axwkVar3, axwfVar3, akkpVar29.ej, akkpVar29.C, akkpVar29.al, akhyVar34.iv, akkpVar29.HZ, akkpVar29.Ia, akkpVar29.ml, (aydt) akhyVar34.f2if.b(), this.a.ay);
            case 492:
                ffhd ffhdVar9 = (ffhd) this.a.cn.b();
                cbwj cbwjVar4 = (cbwj) this.a.a.kG.b();
                ayas ayasVar = (ayas) this.b.ie.b();
                comc comcVar3 = (comc) this.a.a.HR.b();
                cqoh cqohVar5 = (cqoh) this.a.cz.b();
                akhy akhyVar35 = this.b;
                akkp akkpVar30 = this.a.a;
                return new axzx(ffhdVar9, cbwjVar4, ayasVar, comcVar3, cqohVar5, akhyVar35.iu, akkpVar30.ml, akkpVar30.HW, akkpVar30.HX, akkpVar30.al);
            case 493:
                return new aybb(this.a.a.cc);
            case 494:
                return new ayde();
            case 495:
                errl errlVar7 = (errl) this.a.t.b();
                errl errlVar8 = (errl) this.a.p.b();
                akhy akhyVar36 = this.b;
                akis akisVar32 = this.a;
                fbbf fbbfVar39 = akhyVar36.bj;
                akkp akkpVar31 = akisVar32.a;
                fbbf fbbfVar40 = akhyVar36.P;
                fbbf fbbfVar41 = akkpVar31.wL;
                avkj avkjVar2 = (avkj) fbbfVar39.b();
                avkc avkcVar = (avkc) this.a.a.G.b();
                akis akisVar33 = this.a;
                akkp akkpVar32 = akisVar33.a;
                fbbf fbbfVar42 = akkpVar32.Ij;
                fbbf fbbfVar43 = akkpVar32.Ik;
                avuh avuhVar = (avuh) this.a.hd.b();
                akis akisVar34 = this.a;
                akhy akhyVar37 = this.b;
                akkp akkpVar33 = akisVar34.a;
                return new ckyx(errlVar7, errlVar8, fbbfVar40, fbbfVar41, avkjVar2, avkcVar, fbbfVar42, fbbfVar43, avuhVar, akkpVar33.AX, akhyVar37.aF, akkpVar33.Il, akkpVar33.cq());
            case 496:
                ffsk ffskVar14 = (ffsk) this.a.a.aq.b();
                akhy akhyVar38 = this.b;
                akkp akkpVar34 = this.a.a;
                return new cqwa(ffskVar14, akhyVar38.bD, akhyVar38.S, (cins) akkpVar34.jc.b(), this.a.a.bD());
            case 497:
                ffsk ffskVar15 = (ffsk) this.a.a.q.b();
                akhy akhyVar39 = this.b;
                akkp akkpVar35 = this.a.a;
                fbbf fbbfVar44 = akhyVar39.P;
                fbbf fbbfVar45 = akkpVar35.iN;
                fbbf fbbfVar46 = akhyVar39.S;
                ckwy ckwyVar = (ckwy) akhyVar39.iC.b();
                akis akisVar35 = this.a;
                akkp akkpVar36 = akisVar35.a;
                return new ckwt(ffskVar15, fbbfVar44, fbbfVar45, fbbfVar46, ckwyVar, akkpVar36.ay, akisVar35.mZ, akkpVar36.xv, akkpVar36.Iq, akkpVar36.Ir, akkpVar36.Is);
            case 498:
                return new ckwy(this.a.a.cc);
            case 499:
                return new cjgh((ffsk) this.a.a.q.b(), this.b.au(), new atlg());
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r3v10, types: [cebg, java.lang.Object] */
    private final Object g() {
        int i = this.c;
        switch (i) {
            case 500:
                return new cito((Context) this.a.q.b(), (errl) this.a.p.b(), this.a.a.Iw, (Map) this.b.iF.b(), this.a.cf(), (ciwb) this.b.gN.b(), this.b.du());
            case 501:
                return enhk.m(cixf.NT_INCOMING_MESSAGE, this.b.dw(), cixf.NT_DIRECTOR, this.a.a.ib());
            case 502:
                akis akisVar = this.a;
                return new tbm(akisVar.a.dG, (tba) this.b.fR(), (errl) akisVar.t.b(), (errl) this.a.p.b());
            case 503:
                errl errlVar = (errl) this.a.aK.b();
                akhy akhyVar = this.b;
                akkp akkpVar = this.a.a;
                fbbf fbbfVar = akhyVar.S;
                dtuu dtuuVar = (dtuu) akkpVar.ay.b();
                akkp akkpVar2 = this.a.a;
                return new aeza(errlVar, fbbfVar, dtuuVar, akkpVar2.IK, akkpVar2.IL);
            case 504:
                akis akisVar2 = this.a;
                return new tbr(akisVar2.a.dG, (tba) this.b.fR(), (errl) akisVar2.t.b(), (errl) this.a.p.b());
            case 505:
                return new cddg((cddx) this.b.fS());
            case 506:
                akkp akkpVar3 = this.a.a;
                return new cdjb((cdit) akkpVar3.pl(), (axkm) akkpVar3.ck.b(), (cdih) this.a.a.FF.b(), (axdf) this.a.a.cm.b(), (errl) this.a.p.b());
            case 507:
                akkp akkpVar4 = this.a.a;
                ?? pW = akkpVar4.pW();
                axkm axkmVar = (axkm) akkpVar4.ck.b();
                return new ceap(pW, axkmVar, (axdf) this.a.a.cm.b(), (cqoh) this.a.cz.b(), (akzt) this.a.a.al.b());
            case 508:
                return new cead(this.a.a.cc);
            case 509:
                return new cefq((axdf) this.a.a.cm.b(), (babm) this.a.a.wl.b(), (errl) this.a.t.b(), (Context) this.a.q.b(), this.a.a.fZ());
            case 510:
                babm babmVar = (babm) this.a.a.wl.b();
                axdf axdfVar = (axdf) this.a.a.cm.b();
                errl errlVar2 = (errl) this.a.t.b();
                Context context = (Context) this.a.q.b();
                akkp akkpVar5 = this.a.a;
                return new cefy(babmVar, axdfVar, errlVar2, context, akkpVar5.fY(), akkpVar5.fZ());
            case 511:
                return new cegg((babm) this.a.a.wl.b(), (errl) this.a.t.b(), (axdf) this.a.a.cm.b(), (Context) this.a.q.b(), this.a.a.fZ());
            case 512:
                babm babmVar2 = (babm) this.a.a.wl.b();
                Context context2 = (Context) this.a.q.b();
                errl errlVar3 = (errl) this.a.t.b();
                axdf axdfVar2 = (axdf) this.a.a.cm.b();
                akkp akkpVar6 = this.a.a;
                return new cegm(babmVar2, context2, errlVar3, axdfVar2, akkpVar6.fY(), akkpVar6.fZ());
            case 513:
                babm babmVar3 = (babm) this.a.a.wl.b();
                errl errlVar4 = (errl) this.a.t.b();
                axdf axdfVar3 = (axdf) this.a.a.cm.b();
                Context context3 = (Context) this.a.q.b();
                akkp akkpVar7 = this.a.a;
                return new cejt(babmVar3, errlVar4, axdfVar3, context3, akkpVar7.fY(), akkpVar7.fZ());
            case 514:
                return new bzob(fbaz.a(this.b.iT), fbaz.a(this.a.a.kd), (errl) this.a.p.b(), (errl) this.a.t.b());
            case 515:
                return new bznv(this.a.a.cc);
            case 516:
                return new ayfr(this.b.ai);
            case 517:
                Map map = (Map) this.b.gM.b();
                Context context4 = (Context) this.a.q.b();
                errl errlVar5 = (errl) this.a.p.b();
                errl errlVar6 = (errl) this.a.aK.b();
                akhy akhyVar2 = this.b;
                akis akisVar3 = this.a;
                civj dv = akhyVar2.dv();
                cixm cf = akisVar3.cf();
                ciwb ciwbVar = (ciwb) akhyVar2.gN.b();
                Map map2 = (Map) this.b.iF.b();
                Optional optional = (Optional) this.a.ne.b();
                Optional optional2 = (Optional) this.a.nf.b();
                akhy akhyVar3 = this.b;
                akis akisVar4 = this.a;
                fbbf fbbfVar2 = akisVar4.cN;
                akkp akkpVar8 = akisVar4.a;
                return new ciun(map, context4, errlVar5, errlVar6, dv, cf, ciwbVar, map2, optional, optional2, akhyVar3.du(), akkpVar8.Jo, akkpVar8.Jp, akkpVar8.IC, (ecrj) fbbfVar2.b(), (cqoh) this.a.cz.b(), (ctvs) this.a.aZ.b());
            case 518:
                return new amqi((ffsk) this.a.a.q.b(), this.b.au(), new atlg());
            case 519:
                Context context5 = (Context) this.a.q.b();
                errl errlVar7 = (errl) this.a.p.b();
                errl errlVar8 = (errl) this.a.t.b();
                dtuu dtuuVar2 = (dtuu) this.a.a.ay.b();
                akhy akhyVar4 = this.b;
                akkp akkpVar9 = this.a.a;
                ceqr cU = akhyVar4.cU();
                cepg cS = akhyVar4.cS();
                ceqm cT = akhyVar4.cT();
                cgri db = akhyVar4.db();
                axmw axmwVar = (axmw) akkpVar9.AS.b();
                akhy akhyVar5 = this.b;
                akkp akkpVar10 = this.a.a;
                fbbf fbbfVar3 = akhyVar5.Y;
                fbbf fbbfVar4 = akhyVar5.P;
                fbbf fbbfVar5 = akhyVar5.S;
                fbbf fbbfVar6 = akhyVar5.ak;
                akvy akvyVar = (akvy) akkpVar10.DY.b();
                Optional optional3 = (Optional) this.a.a.aQ.b();
                akkp akkpVar11 = this.a.a;
                fbbf fbbfVar7 = akkpVar11.fP;
                fbbf fbbfVar8 = akkpVar11.Jz;
                alrv alrvVar = (alrv) akkpVar11.ej.b();
                cbgf cbgfVar = (cbgf) this.b.O.b();
                bdvi bdviVar = (bdvi) this.b.bn.b();
                akhy akhyVar6 = this.b;
                akkp akkpVar12 = this.a.a;
                return new ceqb(context5, errlVar7, errlVar8, dtuuVar2, cU, cS, cT, db, axmwVar, fbbfVar3, akhyVar5.cx, fbbfVar4, fbbfVar5, fbbfVar6, akvyVar, optional3, fbbfVar7, fbbfVar8, alrvVar, cbgfVar, bdviVar, akhyVar6.eN(), akhyVar6.gO, akhyVar6.cT, akhyVar6.cI, akkpVar12.qL, akkpVar12.ck, fbaz.a(akhyVar6.iZ));
            case 520:
                Context context6 = (Context) this.a.q.b();
                akhy akhyVar7 = this.b;
                akkp akkpVar13 = this.a.a;
                return new cjgb(context6, akhyVar7.dC(), akhyVar7.aM, akkpVar13.G, akhyVar7.P, akhyVar7.iY, (akzt) akkpVar13.C.b(), (ffsk) this.a.a.q.b());
            case 521:
                return Optional.of((cjeo) this.b.aG.b());
            case 522:
                Context context7 = (Context) this.a.q.b();
                errl errlVar9 = (errl) this.a.p.b();
                errl errlVar10 = (errl) this.a.t.b();
                akhy akhyVar8 = this.b;
                fbbf fbbfVar9 = this.a.a.ej;
                cbut cbutVar = (cbut) this.b.df.b();
                akzt akztVar = (akzt) this.a.a.f.b();
                axmw axmwVar2 = (axmw) this.a.a.AS.b();
                akhy akhyVar9 = this.b;
                akis akisVar5 = this.a;
                fbbf fbbfVar10 = akhyVar9.Y;
                fbbf fbbfVar11 = akhyVar9.S;
                akkp akkpVar14 = akisVar5.a;
                return new cgqz(context7, errlVar9, errlVar10, fbbfVar9, cbutVar, akztVar, axmwVar2, fbbfVar10, fbbfVar11, akhyVar9.cT, akhyVar9.eN(), akhyVar9.bi(), akkpVar14.qG, akkpVar14.pR, akkpVar14.hH);
            case 523:
                return new cagi(this.a.a.cc);
            case 524:
                chww chwwVar = (chww) this.b.ek.b();
                fazb a = fbaz.a(this.b.jg);
                akis akisVar6 = this.a;
                akkp akkpVar15 = akisVar6.a;
                fbbf fbbfVar12 = akisVar6.ip;
                fazb a2 = fbaz.a(akkpVar15.uV);
                akis akisVar7 = this.a;
                akhy akhyVar10 = this.b;
                akkp akkpVar16 = akisVar7.a;
                fbbf fbbfVar13 = akkpVar16.fr;
                fbbf fbbfVar14 = akkpVar16.ka;
                fazb a3 = fbaz.a(akhyVar10.ec);
                chqc chqcVar = (chqc) this.b.jh.b();
                akis akisVar8 = this.a;
                return new cijy(chwwVar, a, fbbfVar12, a2, fbbfVar13, fbbfVar14, a3, chqcVar, akisVar8.a.f, (errl) akisVar8.p.b(), (errl) this.a.t.b(), this.b.jm, this.a.da);
            case 525:
                akhy akhyVar11 = this.b;
                return ciky.a(akhyVar11.dp(), (cgwk) akhyVar11.ed.b(), fbaz.a(this.a.a.eY), this.a.a.jZ, (chrv) this.b.x.b());
            case 526:
                return new cikx(this.a.a.cc);
            case 527:
                return new cikf(this.a.a.cc);
            case 528:
                return new cijz(this.a.a.cc);
            case 529:
                return new chqs((errl) this.a.p.b(), (errl) this.a.t.b(), this.a.a.t, (aqvh) this.b.M.b(), (aqkp) this.b.aE.b(), (amhs) this.b.aM.b(), this.a.a.bK());
            case 530:
                errl errlVar11 = (errl) this.a.p.b();
                errl errlVar12 = (errl) this.a.t.b();
                akhy akhyVar12 = this.b;
                akis akisVar9 = this.a;
                akkp akkpVar17 = akisVar9.a;
                return new chrr(errlVar11, errlVar12, akhyVar12.jl, akkpVar17.Z, akkpVar17.cx, akisVar9.cI, akhyVar12.M);
            case 531:
                ffsk ffskVar = (ffsk) this.a.a.p.b();
                akhy akhyVar13 = this.b;
                return new cakn(ffskVar, akhyVar13.jj, akhyVar13.jk, (ejvb) this.a.dy.b(), this.b.ji);
            case 532:
                akis akisVar10 = this.a;
                akhy akhyVar14 = this.b;
                akkp akkpVar18 = akisVar10.a;
                return new cakx(akkpVar18.p, akisVar10.cP, akhyVar14.P, akhyVar14.bQ, akkpVar18.G, akkpVar18.cx, akisVar10.cz, akhyVar14.ji);
            case 533:
                ffhd ffhdVar = (ffhd) this.a.co.b();
                akhy akhyVar15 = this.b;
                return new cakk(ffhdVar, akhyVar15.bR, akhyVar15.bQ, this.a.a.G);
            case 534:
                akis akisVar11 = this.a;
                akhy akhyVar16 = this.b;
                akkp akkpVar19 = akisVar11.a;
                return new cakd(akkpVar19.q, akisVar11.co, akisVar11.cn, akhyVar16.aE, akhyVar16.ao, akhyVar16.ji, akkpVar19.cx, akisVar11.cz, akkpVar19.vk);
            case 535:
                chww chwwVar2 = (chww) this.b.ek.b();
                fazb a4 = fbaz.a(this.b.jg);
                akis akisVar12 = this.a;
                akkp akkpVar20 = akisVar12.a;
                fbbf fbbfVar15 = akisVar12.ip;
                fazb a5 = fbaz.a(akkpVar20.uV);
                akis akisVar13 = this.a;
                akhy akhyVar17 = this.b;
                akkp akkpVar21 = akisVar13.a;
                fbbf fbbfVar16 = akkpVar21.vK;
                fbbf fbbfVar17 = akhyVar17.jq;
                fbbf fbbfVar18 = akhyVar17.jr;
                fbbf fbbfVar19 = akkpVar21.ka;
                fazb a6 = fbaz.a(akhyVar17.ec);
                akis akisVar14 = this.a;
                fbbf fbbfVar20 = akisVar14.a.f;
                errl errlVar13 = (errl) akisVar14.p.b();
                akis akisVar15 = this.a;
                fbbf fbbfVar21 = akisVar15.cz;
                akkp akkpVar22 = akisVar15.a;
                fbbf fbbfVar22 = akkpVar22.rq;
                fbbf fbbfVar23 = akkpVar22.vL;
                fbbf fbbfVar24 = akkpVar22.vM;
                cqoh cqohVar = (cqoh) fbbfVar21.b();
                akis akisVar16 = this.a;
                return new cike(chwwVar2, a4, fbbfVar15, a5, fbbfVar16, fbbfVar17, fbbfVar18, fbbfVar19, a6, fbbfVar20, errlVar13, fbbfVar22, fbbfVar23, fbbfVar24, cqohVar, akisVar16.da, (atky) akisVar16.a.rs.b());
            case 536:
                akhy akhyVar18 = this.b;
                akis akisVar17 = this.a;
                return new bbav(akhyVar18.jo, akhyVar18.eg, akhyVar18.bu, akisVar17.t, akhyVar18.jp, akisVar17.a.au);
            case 537:
                akis akisVar18 = this.a;
                return new bznu(akisVar18.ip, akisVar18.a.ka, (errl) akisVar18.t.b(), this.a.a.ay, this.b.bu);
            case 538:
                return Optional.of((eisx) this.b.b.b());
            case 539:
                return new bzpi(this.a.a.cc);
            case 540:
                chww chwwVar3 = (chww) this.b.ek.b();
                fazb a7 = fbaz.a(this.b.jg);
                akis akisVar19 = this.a;
                akkp akkpVar23 = akisVar19.a;
                fbbf fbbfVar25 = akisVar19.ip;
                fazb a8 = fbaz.a(akkpVar23.uV);
                akis akisVar20 = this.a;
                akhy akhyVar19 = this.b;
                fbbf fbbfVar26 = akisVar20.a.ka;
                fbbf fbbfVar27 = akhyVar19.jw;
                fazb a9 = fbaz.a(akhyVar19.ec);
                akis akisVar21 = this.a;
                return new cikw(chwwVar3, a7, fbbfVar25, a8, fbbfVar26, fbbfVar27, a9, akisVar21.a.f, (errl) akisVar21.p.b(), (errl) this.a.t.b(), this.a.da);
            case 541:
                return new bzaf((Context) this.a.q.b(), (csjk) this.a.a.el.b(), (bbfs) this.b.ju.b(), this.b.jv, (akzt) this.a.a.f.b(), (elbx) this.b.ap.b());
            case 542:
                akis akisVar22 = this.a;
                akhy akhyVar20 = this.b;
                akkp akkpVar24 = akisVar22.a;
                return new baov(akkpVar24.ql, akhyVar20.jt, akhyVar20.ec, akkpVar24.f, akisVar22.p, akisVar22.t, akkpVar24.Au, akhyVar20.ek, akisVar22.da);
            case 543:
                return Optional.of((cikg) this.b.jg.b());
            case 544:
                akhy akhyVar21 = this.b;
                akkp akkpVar25 = this.a.a;
                return new bzpm(akhyVar21.aL(), akkpVar25.Av, (akzt) akkpVar25.f.b());
            case 545:
                akhy akhyVar22 = this.b;
                akis akisVar23 = this.a;
                akkp akkpVar26 = akisVar23.a;
                fbbf fbbfVar28 = akhyVar22.S;
                fbbf fbbfVar29 = akkpVar26.ej;
                fbbf fbbfVar30 = akhyVar22.ab;
                fbbf fbbfVar31 = akhyVar22.jy;
                fbbf fbbfVar32 = akkpVar26.qo;
                fbbf fbbfVar33 = akkpVar26.dR;
                errl errlVar14 = (errl) akisVar23.t.b();
                akis akisVar24 = this.a;
                return new cagv(akhyVar22.bV, fbbfVar28, fbbfVar29, fbbfVar30, fbbfVar31, fbbfVar32, fbbfVar33, errlVar14, akisVar24.a.C, akisVar24.iz);
            case 546:
                return new cahf(this.a.a.cc);
            case 547:
                return new sgo((ffsk) this.a.a.q.b(), this.b.f());
            case 548:
                return new akhg(this);
            case 549:
                return dpcc.a((ffhd) this.b.jC.b());
            case 550:
                return dpca.a((errm) this.a.nj.b(), (dqkk) this.b.jB.b());
            case 551:
                return dsfd.a(Optional.of(umb.a()), this.b.jA, this.a.lk);
            case 552:
                return new dsfc((elbx) this.b.ap.b(), this.a.er());
            case 553:
                return new akhh(this);
            case 554:
                Context context8 = (Context) this.a.q.b();
                errl errlVar15 = (errl) this.a.p.b();
                errl errlVar16 = (errl) this.a.t.b();
                errl errlVar17 = (errl) this.a.aK.b();
                akis akisVar25 = this.a;
                akhy akhyVar23 = this.b;
                fbbf fbbfVar34 = akhyVar23.dk;
                akkp akkpVar27 = akisVar25.a;
                fbbf fbbfVar35 = akkpVar27.sY;
                fbbf fbbfVar36 = akhyVar23.S;
                fbbf fbbfVar37 = akhyVar23.X;
                fbbf fbbfVar38 = akkpVar27.co;
                fbbf fbbfVar39 = akhyVar23.er;
                fbbf fbbfVar40 = akkpVar27.ay;
                fbbf fbbfVar41 = akhyVar23.O;
                crab eP = akhyVar23.eP();
                bzxq fg = akkpVar27.fg();
                bbgg bbggVar = (bbgg) fbbfVar34.b();
                akhy akhyVar24 = this.b;
                akis akisVar26 = this.a;
                fbbf fbbfVar42 = akhyVar24.bh;
                akkp akkpVar28 = akisVar26.a;
                fbbf fbbfVar43 = akhyVar24.jH;
                fbbf fbbfVar44 = akkpVar28.gp;
                fbbf fbbfVar45 = akkpVar28.cH;
                cqvy cqvyVar = (cqvy) this.a.a.oP.b();
                akis akisVar27 = this.a;
                return new cqxi(context8, errlVar15, errlVar16, errlVar17, fbbfVar35, fbbfVar36, fbbfVar37, akhyVar23.bD, fbbfVar38, fbbfVar39, fbbfVar40, fbbfVar41, eP, fg, bbggVar, akhyVar24.cT, akhyVar24.bu, fbbfVar43, fbbfVar44, fbbfVar45, cqvyVar, akisVar27.a.dl(), (bbfo) akisVar27.jU.b(), this.a.a.Eb);
            case 555:
                akhy akhyVar25 = this.b;
                akkp akkpVar29 = this.a.a;
                return enip.v(akhyVar25.e(), akkpVar29.j(), akhyVar25.s(), akkpVar29.qc(), akhyVar25.g(), akhyVar25.eu(), akhyVar25.fq(), this.b.i());
            case 556:
                errl errlVar18 = (errl) this.a.p.b();
                errl errlVar19 = (errl) this.a.t.b();
                akhy akhyVar26 = this.b;
                fbbf fbbfVar46 = akhyVar26.bh;
                fbbf fbbfVar47 = akhyVar26.S;
                akhy akhyVar27 = this.b;
                akkp akkpVar30 = this.a.a;
                crab eP2 = akhyVar27.eP();
                Optional optional4 = (Optional) akkpVar30.pg.b();
                akis akisVar28 = this.a;
                akhy akhyVar28 = this.b;
                akkp akkpVar31 = akisVar28.a;
                return new cqxu(errlVar18, errlVar19, fbbfVar47, eP2, optional4, akkpVar31.oP, akhyVar28.ah(), akkpVar31.Kl);
            case 557:
                cins cinsVar = (cins) this.a.a.jc.b();
                errl errlVar20 = (errl) this.a.t.b();
                avya avyaVar = (avya) this.a.a.op.b();
                cqqb cqqbVar = (cqqb) this.a.a.pc.b();
                akhy akhyVar29 = this.b;
                return new avxz(cinsVar, errlVar20, avyaVar, cqqbVar, akhyVar29.eO(), (cqps) akhyVar29.bL.b());
            case 558:
                return new cqxl(this.a.a.cc);
            case 559:
                return new cray(this.a.a.cc);
            case 560:
                return new avzo((ffsk) this.a.a.q.b(), this.b.af(), (cins) this.a.a.jc.b(), this.a.a.pe);
            case 561:
                crcc crccVar = (crcc) this.a.a.oK.b();
                errl errlVar21 = (errl) this.a.t.b();
                errl errlVar22 = (errl) this.a.p.b();
                cins cinsVar2 = (cins) this.a.a.jc.b();
                cqqb cqqbVar2 = (cqqb) this.a.a.pc.b();
                cqps cqpsVar = (cqps) this.b.bL.b();
                crbq crbqVar = (crbq) this.b.dS.b();
                akis akisVar29 = this.a;
                akkp akkpVar32 = akisVar29.a;
                fbbf fbbfVar48 = akisVar29.jQ;
                crga crgaVar = (crga) akkpVar32.pd.b();
                akhy akhyVar30 = this.b;
                akis akisVar30 = this.a;
                akkp akkpVar33 = akisVar30.a;
                fbbf fbbfVar49 = akhyVar30.S;
                fbbf fbbfVar50 = akhyVar30.jO;
                fbbf fbbfVar51 = akkpVar33.gt;
                return new crcq(crccVar, errlVar21, errlVar22, cinsVar2, cqqbVar2, cqpsVar, crbqVar, fbbfVar48, crgaVar, fbbfVar49, fbbfVar50, akhyVar30.bF, fbbfVar51);
            case 562:
                akis akisVar31 = this.a;
                akhy akhyVar31 = this.b;
                akkp akkpVar34 = akisVar31.a;
                return new axbz(akkpVar34.Bv, akhyVar31.dZ, akkpVar34.Bx, new axbm());
            case 563:
                return new cpyn((Context) this.a.q.b(), this.a.a.jc, this.b.jT);
            case 564:
                errl errlVar23 = (errl) this.a.t.b();
                ctyx ctyxVar = (ctyx) this.a.aU.b();
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                akis akisVar32 = this.a;
                akhy akhyVar32 = this.b;
                fbbf fbbfVar52 = akhyVar32.cp;
                akkp akkpVar35 = akisVar32.a;
                fbbf fbbfVar53 = akkpVar35.ej;
                fbbf fbbfVar54 = akkpVar35.iN;
                fbbf fbbfVar55 = akhyVar32.jQ;
                fbbf fbbfVar56 = akkpVar35.Er;
                fbbf fbbfVar57 = akkpVar35.u;
                fbbf fbbfVar58 = akkpVar35.fJ;
                fbbf fbbfVar59 = akhyVar32.jS;
                fbbf fbbfVar60 = akkpVar35.Kx;
                fbbf fbbfVar61 = akkpVar35.jO;
                fbbf fbbfVar62 = akkpVar35.jP;
                cozl cozlVar = (cozl) fbbfVar52.b();
                cbgf cbgfVar2 = (cbgf) this.b.O.b();
                akis akisVar33 = this.a;
                akkp akkpVar36 = akisVar33.a;
                return new cpyk(errlVar23, ctyxVar, cqohVar2, fbbfVar53, fbbfVar54, fbbfVar55, fbbfVar56, fbbfVar57, fbbfVar58, fbbfVar59, fbbfVar60, fbbfVar61, fbbfVar62, cozlVar, cbgfVar2, akkpVar36.f, akkpVar36.Z, akkpVar36.Eo, akisVar33.cT, akkpVar36.Es);
            case 565:
                akis akisVar34 = this.a;
                akhy akhyVar33 = this.b;
                akkp akkpVar37 = akisVar34.a;
                return new cqbj(akkpVar37.yx, akkpVar37.jd, akhyVar33.W, akhyVar33.P, akhyVar33.X, akhyVar33.Z, akhyVar33.cl, akhyVar33.Y, akkpVar37.iN, akhyVar33.cp, akhyVar33.O, akkpVar37.tF, akkpVar37.iy, akkpVar37.ay, akisVar34.q, akkpVar37.fJ, akisVar34.cT, akkpVar37.c, akhyVar33.bv, akkpVar37.f, akhyVar33.cn, akhyVar33.cq, akkpVar37.Z, akhyVar33.ct, akisVar34.no, akkpVar37.Kt, akhyVar33.S, akkpVar37.Ku, akkpVar37.Kv, akisVar34.cN, akkpVar37.ks, akkpVar37.AK, akisVar34.cv, akkpVar37.C, akkpVar37.qj);
            case 566:
                return Optional.of(this.b.fY());
            case 567:
                return new cpyl(this.a.a.cc);
            case 568:
                Context context9 = (Context) this.a.q.b();
                akhy akhyVar34 = this.b;
                return new cabh(context9, akhyVar34.bb(), akhyVar34.jV, (cins) this.a.a.jc.b(), this.a.a.G);
            case 569:
                cafn cafnVar = (cafn) this.a.a.sP.b();
                akkp akkpVar38 = this.a.a;
                fbbf fbbfVar63 = akkpVar38.sQ;
                cafi cafiVar = (cafi) akkpVar38.cv.b();
                cqoh cqohVar3 = (cqoh) this.a.cz.b();
                akis akisVar35 = this.a;
                akhy akhyVar35 = this.b;
                fbbf fbbfVar64 = akhyVar35.bR;
                fbbf fbbfVar65 = akisVar35.a.fr;
                fbbf fbbfVar66 = akhyVar35.W;
                fbbf fbbfVar67 = akhyVar35.S;
                caen caenVar = (caen) fbbfVar64.b();
                errl errlVar24 = (errl) this.a.t.b();
                bbfo bbfoVar = (bbfo) this.a.jU.b();
                dtuu dtuuVar3 = (dtuu) this.a.a.ay.b();
                fazb a10 = fbaz.a(this.a.a.cC);
                akis akisVar36 = this.a;
                fbbf fbbfVar68 = this.b.bZ;
                fbbf fbbfVar69 = akisVar36.a.f;
                return new cabg(cafnVar, fbbfVar63, cafiVar, cqohVar3, fbbfVar65, fbbfVar66, fbbfVar67, caenVar, errlVar24, bbfoVar, dtuuVar3, a10, fbbfVar69, (awtm) this.a.iz.b());
            case 570:
                akhy akhyVar36 = this.b;
                akis akisVar37 = this.a;
                clja eh = akhyVar36.eh();
                ctzw ctzwVar = (ctzw) akisVar37.dI.b();
                akkp akkpVar39 = this.a.a;
                BiFunction rJ = akkpVar39.rJ();
                clhd clhdVar = (clhd) akkpVar39.BV.b();
                akhy akhyVar37 = this.b;
                akis akisVar38 = this.a;
                clna ek = akhyVar37.ek();
                errl errlVar25 = (errl) akisVar38.t.b();
                errl errlVar26 = (errl) this.a.aK.b();
                errl errlVar27 = (errl) this.a.p.b();
                akis akisVar39 = this.a;
                akhy akhyVar38 = this.b;
                akkp akkpVar40 = akisVar39.a;
                return new clmw(eh, ctzwVar, rJ, clhdVar, ek, errlVar25, errlVar26, errlVar27, akkpVar40.jg(), akhyVar38.ej(), (akvz) akkpVar40.dE.b(), (cqoh) this.a.cz.b(), this.b.P);
            case 571:
                return new cjhh(this.b.dD(), (ffsk) this.a.a.p.b(), this.a.a.im());
            case 572:
                return new ckop((cbgf) this.b.O.b());
            case 573:
                return new ckpb((errm) this.a.t.b(), (errl) this.a.p.b(), (ckju) this.b.ct.b(), (dtuu) this.a.a.ay.b());
            case 574:
                cbpl cbplVar = (cbpl) this.a.a.sr.b();
                akis akisVar40 = this.a;
                return new cbtn(cbplVar, akisVar40.bK(), (errl) akisVar40.p.b(), (errl) this.a.t.b(), (cbtp) this.a.a.KI.b(), (cbta) this.a.a.KH.b());
            case 575:
                errl errlVar28 = (errl) this.a.t.b();
                errl errlVar29 = (errl) this.a.p.b();
                fazb a11 = fbaz.a(this.a.a.tT);
                fbaz.a(this.b.kc);
                akkp akkpVar41 = this.a.a;
                fbbf fbbfVar70 = akkpVar41.tV;
                cbpl cbplVar2 = (cbpl) akkpVar41.sr.b();
                akis akisVar41 = this.a;
                return new cbua(errlVar28, errlVar29, a11, fbbfVar70, cbplVar2, akisVar41.bK(), (cbtp) akisVar41.a.KI.b());
            case 576:
                return new cbma();
            case 577:
                fazb a12 = fbaz.a(this.a.a.tT);
                akis akisVar42 = this.a;
                return new cbue(a12, akisVar42.a.tV, (errl) akisVar42.p.b());
            case 578:
                return new awpn(this.b.ao(), (akvz) this.a.a.dE.b(), (ffsk) this.a.a.p.b(), (azfv) this.b.aw.b(), (akzt) this.a.a.C.b(), this.a.a.KM);
            case 579:
                Object b = this.b.eD.b();
                avgr avgrVar = (avgr) this.b.eE.b();
                errl errlVar30 = (errl) this.a.p.b();
                return awqa.a(b, avgrVar, errlVar30);
            case 580:
                Context context10 = (Context) this.a.q.b();
                errm errmVar = (errm) this.a.t.b();
                errl errlVar31 = (errl) this.a.p.b();
                ckju ckjuVar = (ckju) this.b.ct.b();
                dtuu dtuuVar4 = (dtuu) this.a.a.ay.b();
                akhy akhyVar39 = this.b;
                fbbf fbbfVar71 = akhyVar39.W;
                fbbf fbbfVar72 = akhyVar39.S;
                fbbf fbbfVar73 = akhyVar39.X;
                cbfs cbfsVar = (cbfs) akhyVar39.R.b();
                akhy akhyVar40 = this.b;
                fbbf fbbfVar74 = this.a.cz;
                fbbf fbbfVar75 = akhyVar40.dD;
                cqoh cqohVar4 = (cqoh) fbbfVar74.b();
                akis akisVar43 = this.a;
                return new ckpp(context10, errmVar, errlVar31, ckjuVar, dtuuVar4, fbbfVar71, fbbfVar72, fbbfVar73, cbfsVar, akhyVar40.cX, fbbfVar75, cqohVar4, akisVar43.kk, (ckds) akisVar43.a.dp.b());
            case 581:
                return new cptm((ffsk) this.a.a.q.b(), this.b.eL(), (cqoh) this.a.cz.b());
            case 582:
                errl errlVar32 = (errl) this.a.t.b();
                errl errlVar33 = (errl) this.a.aK.b();
                errl errlVar34 = (errl) this.a.p.b();
                akhy akhyVar41 = this.b;
                fbbf fbbfVar76 = akhyVar41.cX;
                fbbf fbbfVar77 = akhyVar41.P;
                ayfy ayfyVar = (ayfy) this.b.gn.b();
                bdvi bdviVar2 = (bdvi) this.b.bn.b();
                avkj avkjVar = (avkj) this.b.bj.b();
                avkc avkcVar = (avkc) this.a.a.G.b();
                akkp akkpVar42 = this.a.a;
                fbbf fbbfVar78 = akkpVar42.wL;
                akhy akhyVar42 = this.b;
                avkh avkhVar = (avkh) akhyVar42.bU.b();
                akis akisVar44 = this.a;
                akhy akhyVar43 = this.b;
                fbbf fbbfVar79 = akisVar44.a.xA;
                return new ckqe(errlVar32, errlVar33, errlVar34, fbbfVar77, ayfyVar, bdviVar2, avkjVar, avkcVar, fbbfVar78, akhyVar42.aF, avkhVar, fbbfVar79);
            case 583:
                akis akisVar45 = this.a;
                akkp akkpVar43 = akisVar45.a;
                return new cglc(akkpVar43.KS, akkpVar43.fg, akkpVar43.KV, (errl) akisVar45.t.b(), this.b.R(), (ecrj) this.a.cN.b());
            case 584:
                return new ckqp((errl) this.a.t.b(), this.b.P, (cqoh) this.a.cz.b(), (bdtd) this.a.a.aO.b(), (cbvt) this.b.cX.b(), (dtuu) this.a.a.ay.b(), (cbgf) this.b.O.b(), (akzt) this.a.a.C.b());
            case 585:
                akhy akhyVar44 = this.b;
                return new cirr(akhyVar44.S, akhyVar44.bh, (errl) this.a.t.b());
            case 586:
                ckju ckjuVar2 = (ckju) this.b.ct.b();
                cbgf cbgfVar3 = (cbgf) this.b.O.b();
                akkp akkpVar44 = this.a.a;
                avlc cU2 = akkpVar44.cU();
                fbbf fbbfVar80 = akkpVar44.Ik;
                dtuu dtuuVar5 = (dtuu) akkpVar44.ay.b();
                akis akisVar46 = this.a;
                akhy akhyVar45 = this.b;
                fbbf fbbfVar81 = akisVar46.a.wL;
                return new awgs(ckjuVar2, cbgfVar3, cU2, fbbfVar80, dtuuVar5, fbbfVar81);
            case 587:
                akis akisVar47 = this.a;
                akhy akhyVar46 = this.b;
                akkp akkpVar45 = akisVar47.a;
                fbbf fbbfVar82 = akkpVar45.dG;
                fbbf fbbfVar83 = akhyVar46.iH;
                Object fR = akhyVar46.fR();
                return new tcl(fbbfVar82, fbbfVar83, (tba) fR, (errl) this.a.t.b(), (errl) this.a.p.b());
            case 588:
                akis akisVar48 = this.a;
                akhy akhyVar47 = this.b;
                akkp akkpVar46 = akisVar48.a;
                return new aqpu(akkpVar46.p, akisVar48.cP, akhyVar47.aD, akkpVar46.Dj);
            case 589:
                return new cnel(this.b.ex(), (ffsk) this.a.a.q.b());
            case 590:
                errl errlVar35 = (errl) this.a.p.b();
                errl errlVar36 = (errl) this.a.t.b();
                akhy akhyVar48 = this.b;
                return new craf(errlVar35, errlVar36, akhyVar48.eP(), (cray) akhyVar48.jL.b());
            case 591:
                ffsk ffskVar2 = (ffsk) this.a.a.p.b();
                akhy akhyVar49 = this.b;
                akis akisVar49 = this.a;
                akkp akkpVar47 = akisVar49.a;
                return new cjkj(ffskVar2, akhyVar49.dF(), akisVar49.cj(), akkpVar47.ip(), akkpVar47.iq());
            case 592:
                avkh avkhVar2 = (avkh) this.b.bU.b();
                akkp akkpVar48 = this.a.a;
                return new clmy(avkhVar2, akkpVar48.LY, akkpVar48.LZ, (ffsk) akkpVar48.aq.b(), this.a.a.jg());
            case 593:
                Context context11 = (Context) this.a.q.b();
                akis akisVar50 = this.a;
                akhy akhyVar50 = this.b;
                return new bzox(context11, akisVar50.a.Av, akhyVar50.aO(), (bzgd) akhyVar50.ec.b(), (akzt) this.a.a.f.b(), (errl) this.a.t.b(), (errl) this.a.p.b(), this.a.da);
            case 594:
                akis akisVar51 = this.a;
                akhy akhyVar51 = this.b;
                fbbf fbbfVar84 = akisVar51.cz;
                akkp akkpVar49 = akisVar51.a;
                return new cqfc(akkpVar49.Ev, akhyVar51.kv, akkpVar49.jc, (cqoh) fbbfVar84.b(), (cqew) this.b.kw.b(), (ffsk) this.a.a.q.b(), (Context) this.a.q.b());
            case 595:
                akis akisVar52 = this.a;
                akhy akhyVar52 = this.b;
                fbbf fbbfVar85 = akisVar52.cz;
                akkp akkpVar50 = akisVar52.a;
                fbbf fbbfVar86 = akkpVar50.Er;
                fbbf fbbfVar87 = akkpVar50.fJ;
                fbbf fbbfVar88 = akhyVar52.jT;
                fbbf fbbfVar89 = akhyVar52.jQ;
                fbbf fbbfVar90 = akhyVar52.O;
                fbbf fbbfVar91 = akkpVar50.jJ;
                fbbf fbbfVar92 = akkpVar50.Kx;
                cqoh cqohVar5 = (cqoh) fbbfVar85.b();
                ecrj ecrjVar = (ecrj) this.a.cN.b();
                coxk coxkVar = (coxk) this.a.a.iN.b();
                akis akisVar53 = this.a;
                akkp akkpVar51 = akisVar53.a;
                return new cqev(fbbfVar86, fbbfVar87, akhyVar52.cp, akisVar52.aZ, fbbfVar88, fbbfVar89, fbbfVar90, fbbfVar91, fbbfVar92, cqohVar5, ecrjVar, coxkVar, akkpVar51.Eo, akisVar53.cT, akkpVar51.Es);
            case 596:
                return new cqew(this.a.a.cc);
            case 597:
                return new ckoh((errl) this.a.p.b(), (errl) this.a.t.b(), this.b.dV());
            case 598:
                return new clae((errl) this.a.p.b(), (errl) this.a.t.b(), (cbgf) this.b.O.b(), (akzt) this.a.a.f.b());
            case 599:
                return new bzrj((ffsk) this.a.a.q.b(), this.a.a.C, this.b.P);
            default:
                throw new AssertionError(i);
        }
    }

    /* JADX WARN: Type inference failed for: r12v28, types: [bznw, java.lang.Object] */
    private final Object h() {
        int i = this.c;
        switch (i) {
            case 600:
                errl errlVar = (errl) this.a.t.b();
                errl errlVar2 = (errl) this.a.p.b();
                akhy akhyVar = this.b;
                akis akisVar = this.a;
                fbbf fbbfVar = akhyVar.bj;
                akkp akkpVar = akisVar.a;
                fbbf fbbfVar2 = akhyVar.P;
                fbbf fbbfVar3 = akkpVar.wL;
                avkj avkjVar = (avkj) fbbfVar.b();
                akis akisVar2 = this.a;
                akhy akhyVar2 = this.b;
                akkp akkpVar2 = akisVar2.a;
                return new ckzj(errlVar, errlVar2, fbbfVar2, fbbfVar3, avkjVar, akkpVar2.nJ, akkpVar2.Z, akhyVar2.W);
            case 601:
                ffsk ffskVar = (ffsk) this.a.a.aq.b();
                akhy akhyVar3 = this.b;
                return new anzf(ffskVar, akhyVar3.bb, akhyVar3.cy);
            case 602:
                return new slv((ffsk) this.a.a.q.b(), this.b.k());
            case 603:
                return new cuso(this.b.dy, (ffsk) this.a.a.q.b());
            case 604:
                return new cpzo((cqoh) this.a.cz.b(), (cqel) this.b.kv.b(), (albq) this.a.a.sO.b(), (ffsk) this.a.a.aq.b());
            case 605:
                return new cppa((cpip) this.b.kG.b(), this.b.K, (ffsk) this.a.a.q.b(), this.a.a.Mr);
            case 606:
                return new akhi(this);
            case 607:
                akhy akhyVar4 = this.b;
                akkp akkpVar3 = this.a.a;
                return new cpjd((cpnb) akhyVar4.gq(), akkpVar3.jc);
            case 608:
                return cpim.a(this.b.eW.b(), (errl) this.a.p.b());
            case 609:
                akhy akhyVar5 = this.b;
                akkp akkpVar4 = this.a.a;
                return new cpjn((cpnb) akhyVar5.gr(), akkpVar4.jc);
            case 610:
                akhy akhyVar6 = this.b;
                akkp akkpVar5 = this.a.a;
                return new cpkm((cpnb) akhyVar6.gv(), akkpVar5.jc);
            case 611:
                akhy akhyVar7 = this.b;
                akkp akkpVar6 = this.a.a;
                return new cplr(akhyVar7.gF(), akkpVar6.Mx, akkpVar6.My, (ffsk) akkpVar6.p.b());
            case 612:
                return new akhj(this);
            case 613:
                return new akhk();
            case 614:
                akhy akhyVar8 = this.b;
                akkp akkpVar7 = this.a.a;
                return new cpnj((cpnb) akhyVar8.gs(), akkpVar7.jc);
            case 615:
                akhy akhyVar9 = this.b;
                akkp akkpVar8 = this.a.a;
                return new cpno((cpnb) akhyVar9.gt(), akkpVar8.jc);
            case 616:
                akhy akhyVar10 = this.b;
                akkp akkpVar9 = this.a.a;
                return new cpoo((cpnb) akhyVar10.gw(), akkpVar9.jc);
            case 617:
                errl errlVar3 = (errl) this.a.p.b();
                errl errlVar4 = (errl) this.a.t.b();
                akhy akhyVar11 = this.b;
                akkp akkpVar10 = this.a.a;
                crab eP = akhyVar11.eP();
                bbfw bbfwVar = (bbfw) akkpVar10.pt.b();
                akhy akhyVar12 = this.b;
                akis akisVar3 = this.a;
                fbbf fbbfVar4 = akhyVar12.bD;
                akkp akkpVar11 = akisVar3.a;
                fbbf fbbfVar5 = akhyVar12.S;
                fbbf fbbfVar6 = akhyVar12.X;
                fbbf fbbfVar7 = akkpVar11.gp;
                ckch ckchVar = (ckch) fbbfVar4.b();
                dtuu dtuuVar = (dtuu) this.a.a.ay.b();
                akkp akkpVar12 = this.a.a;
                bzxq fg = akkpVar12.fg();
                cqvy cqvyVar = (cqvy) akkpVar12.oP.b();
                akkp akkpVar13 = this.a.a;
                return new crav(errlVar3, errlVar4, eP, bbfwVar, fbbfVar5, akhyVar12.bu, fbbfVar6, fbbfVar7, ckchVar, dtuuVar, fg, cqvyVar, akkpVar13.aw, akkpVar13.Eb);
            case 618:
                return new caqf((ffsk) this.a.a.aq.b(), this.b.df, this.a.a.sY);
            case 619:
                akhy akhyVar13 = this.b;
                akis akisVar4 = this.a;
                return new cahc(akhyVar13.bS, akisVar4.a.qo, akisVar4.t, akhyVar13.br);
            case 620:
                return new bzra(this.b.bX);
            case 621:
                return new cesr((errl) this.a.p.b(), (ejtr) this.b.aB.b(), this.a.a.f);
            case 622:
                akhy akhyVar14 = this.b;
                akis akisVar5 = this.a;
                return new bzpf(akhyVar14.jo, akisVar5.a.vK, (errl) akisVar5.p.b(), (errl) this.a.t.b(), (bcsq) this.a.a.rq.b(), (bigl) this.a.ki.b(), (chdj) this.b.eg.b(), fbaz.a(this.a.a.eY), (atky) this.a.a.rs.b());
            case 623:
                ffsk ffskVar2 = (ffsk) this.a.a.q.b();
                akhy akhyVar15 = this.b;
                akkp akkpVar14 = this.a.a;
                return new cqmo(ffskVar2, akhyVar15.eM(), akkpVar14.MN, akkpVar14.MO);
            case 624:
                errl errlVar5 = (errl) this.a.p.b();
                errl errlVar6 = (errl) this.a.t.b();
                akis akisVar6 = this.a;
                akhy akhyVar16 = this.b;
                akkp akkpVar15 = akisVar6.a;
                fbbf fbbfVar8 = akkpVar15.cG;
                awmi an = akhyVar16.an();
                akkpVar15.rZ();
                akhy akhyVar17 = this.b;
                akkp akkpVar16 = this.a.a;
                fbbf fbbfVar9 = akhyVar17.kZ;
                fbbf fbbfVar10 = akhyVar17.la;
                fbbf fbbfVar11 = akhyVar17.lc;
                bdtd bdtdVar = (bdtd) akkpVar16.aO.b();
                cbfs cbfsVar = (cbfs) this.b.R.b();
                akhy akhyVar18 = this.b;
                cqoh cqohVar = (cqoh) this.a.cz.b();
                akhy akhyVar19 = this.b;
                akkp akkpVar17 = this.a.a;
                fbbf fbbfVar12 = akhyVar19.W;
                fbbf fbbfVar13 = akhyVar19.gH;
                fbbf fbbfVar14 = akkpVar17.br;
                fbbf fbbfVar15 = akhyVar19.ld;
                fbbf fbbfVar16 = akkpVar17.Nc;
                return new awpj(errlVar5, errlVar6, fbbfVar8, an, fbbfVar9, fbbfVar10, fbbfVar11, bdtdVar, cbfsVar, akhyVar18.cX, cqohVar, fbbfVar12, fbbfVar13, fbbfVar14, fbbfVar15, fbbfVar16);
            case 625:
                return new awlh(new awhv(), this.b.gV(), (errl) this.a.p.b(), (errl) this.a.t.b());
            case 626:
                return new awlh(new awit(), this.b.gU(), (errl) this.a.p.b(), (errl) this.a.t.b());
            case 627:
                akhy akhyVar20 = this.b;
                akis akisVar7 = this.a;
                Object fQ = akhyVar20.fQ();
                Object fW = akhyVar20.fW();
                Object gk = akhyVar20.gk();
                Object gp = akhyVar20.gp();
                awlk am = akhyVar20.am();
                Object gn = akhyVar20.gn();
                errl errlVar7 = (errl) akisVar7.p.b();
                akhy akhyVar21 = this.b;
                akis akisVar8 = this.a;
                akkp akkpVar18 = akisVar8.a;
                Object fX = akhyVar21.fX();
                return new awkq((awjs) fQ, (awju) fW, (awmr) gk, (awnd) gp, am, (awna) gn, errlVar7, (awkf) fX, (awnf) akisVar8.fC(), akkpVar18.MR);
            case 628:
                akhy akhyVar22 = this.b;
                return enip.r(akhyVar22.bg(), akhyVar22.cZ());
            case 629:
                akis akisVar9 = this.a;
                akhy akhyVar23 = this.b;
                akkp akkpVar19 = akisVar9.a;
                return new cknb(akkpVar19.dt, akkpVar19.br, akkpVar19.G, (aqvh) akhyVar23.M.b(), this.b.P, (ffsk) this.a.a.q.b());
            case 630:
                ffsk ffskVar3 = (ffsk) this.a.a.p.b();
                comc comcVar = (comc) this.a.a.HR.b();
                aybz aybzVar = (aybz) this.b.iy.b();
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                akis akisVar10 = this.a;
                akkp akkpVar20 = akisVar10.a;
                return new ayaf(ffskVar3, comcVar, aybzVar, cqohVar2, akkpVar20.mj, akisVar10.cN, akkpVar20.al, akkpVar20.Hs, akkpVar20.ml);
            case 631:
                ffsk ffskVar4 = (ffsk) this.a.a.p.b();
                akis akisVar11 = this.a;
                akhy akhyVar24 = this.b;
                fbbf fbbfVar17 = akisVar11.nC;
                akkp akkpVar21 = akisVar11.a;
                return new degf(ffskVar4, fbbfVar17, akhyVar24.lj, akkpVar21.Ng, akkpVar21.No, akkpVar21.Nk);
            case 632:
                akhy akhyVar25 = this.b;
                akis akisVar12 = this.a;
                fbbf fbbfVar18 = akisVar12.cn;
                akkp akkpVar22 = akisVar12.a;
                return new degd(akhyVar25.lh, akkpVar22.Nk, (ffhd) fbbfVar18.b(), (ffsk) this.a.a.p.b(), this.b.li, this.a.a.Ng);
            case 633:
                akis akisVar13 = this.a;
                fbbf fbbfVar19 = akisVar13.co;
                fbbf fbbfVar20 = akisVar13.a.Z;
                ffhd ffhdVar = (ffhd) fbbfVar19.b();
                ffhd ffhdVar2 = (ffhd) this.a.cn.b();
                akis akisVar14 = this.a;
                akhy akhyVar26 = this.b;
                akkp akkpVar23 = akisVar14.a;
                return new defp(fbbfVar20, akisVar13.cz, ffhdVar, ffhdVar2, akkpVar23.Ng, akhyVar26.lg, akisVar14.q, akkpVar23.ko, (bdfp) akhyVar26.Q.b(), this.a.a.Q);
            case 634:
                bcsf bcsfVar = (bcsf) this.a.a.vK.b();
                akis akisVar15 = this.a;
                akhy akhyVar27 = this.b;
                akkp akkpVar24 = akisVar15.a;
                return new cvgy(bcsfVar, akkpVar24.dQ, akkpVar24.lv(), akkpVar24.lw(), akisVar15.dB, akkpVar24.rq, akkpVar24.vL, akkpVar24.Z, akhyVar27.Q, akkpVar24.Nh, (atky) akkpVar24.rs.b());
            case 635:
                return new degg(this.a.a.cc);
            case 636:
                ctvb ctvbVar = (ctvb) this.a.a.u.b();
                Context context = (Context) this.a.q.b();
                cbgf cbgfVar = (cbgf) this.b.O.b();
                errl errlVar8 = (errl) this.a.t.b();
                errl errlVar9 = (errl) this.a.p.b();
                errl errlVar10 = (errl) this.a.aK.b();
                coxk coxkVar = (coxk) this.a.a.iN.b();
                akhy akhyVar28 = this.b;
                return new amcp(ctvbVar, context, cbgfVar, errlVar8, errlVar9, errlVar10, coxkVar, akhyVar28.cx, akhyVar28.S, (cbek) akhyVar28.ak.b(), (axmw) this.a.a.AS.b(), (bbgg) this.b.dk.b(), (cish) this.b.hj.b(), (cisl) this.b.bh.b());
            case 637:
                return new clxk((ffhd) this.a.co.b(), (ffsk) this.a.a.p.b(), (ejtr) this.b.aB.b(), (akzt) this.a.a.f.b());
            case 638:
                errl errlVar11 = (errl) this.a.t.b();
                cgrq cgrqVar = (cgrq) this.b.bw.b();
                aitz aitzVar = (aitz) this.a.a.Nu.b();
                akkp akkpVar25 = this.a.a;
                return new aitg(errlVar11, cgrqVar, aitzVar, akkpVar25.f, akkpVar25.Nw, (aiuv) akkpVar25.Nv.b(), this.b.S, (asix) this.a.a.pR.b());
            case 639:
                return new aixi((errm) this.a.p.b(), this.b.w());
            case 640:
                akis akisVar16 = this.a;
                akkp akkpVar26 = akisVar16.a;
                fbbf fbbfVar21 = akkpVar26.p;
                fbbf fbbfVar22 = akkpVar26.Z;
                fbbf fbbfVar23 = akkpVar26.lV;
                cggu cgguVar = (cggu) akisVar16.gW.b();
                akis akisVar17 = this.a;
                akhy akhyVar29 = this.b;
                fbbf fbbfVar24 = akisVar17.aR;
                akkp akkpVar27 = akisVar17.a;
                fbbf fbbfVar25 = akkpVar27.ay;
                fbbf fbbfVar26 = akisVar17.jT;
                fbbf fbbfVar27 = akhyVar29.O;
                fbbf fbbfVar28 = akkpVar27.uy;
                fbbf fbbfVar29 = akkpVar27.eW;
                ejvp ejvpVar = (ejvp) fbbfVar24.b();
                akhy akhyVar30 = this.b;
                ecrj ecrjVar = (ecrj) this.a.cN.b();
                fazb a = fbaz.a(this.b.lp);
                return new cghv(fbbfVar21, akisVar16.cP, fbbfVar22, fbbfVar23, cgguVar, fbbfVar25, fbbfVar26, fbbfVar27, fbbfVar28, fbbfVar29, ejvpVar, akhyVar30.cT, ecrjVar, a);
            case 641:
                return new enpx(this.b.cX());
            case 642:
                return new ajhh((ffsk) this.a.a.p.b(), (aqkp) this.b.aE.b(), (alxl) this.b.ao.b(), (aolr) this.a.a.Z.b(), this.a.cs);
            case 643:
                ffsk ffskVar5 = (ffsk) this.a.a.q.b();
                akhy akhyVar31 = this.b;
                fbbf fbbfVar30 = akhyVar31.fR;
                Optional of = Optional.of((aepg) akhyVar31.ls.b());
                akis akisVar18 = this.a;
                akhy akhyVar32 = this.b;
                return new ajco(ffskVar5, akhyVar31.aG, fbbfVar30, of, akisVar18.a.Z, akhyVar32.aE, akhyVar32.ao, akhyVar32.M, akhyVar32.fS, akisVar18.aZ);
            case 644:
                return new aepk((eisx) this.b.b.b(), (eixo) this.a.a.as.b(), (ejar) this.a.a.au.b(), (ffsk) this.a.a.q.b(), (ffhd) this.a.co.b());
            case 645:
                errl errlVar12 = (errl) this.a.p.b();
                errl errlVar13 = (errl) this.a.t.b();
                ckju ckjuVar = (ckju) this.b.ct.b();
                dtuu dtuuVar2 = (dtuu) this.a.a.ay.b();
                akhy akhyVar33 = this.b;
                fbbf fbbfVar31 = this.a.cz;
                fbbf fbbfVar32 = akhyVar33.W;
                fbbf fbbfVar33 = akhyVar33.P;
                cqoh cqohVar3 = (cqoh) fbbfVar31.b();
                cbfs cbfsVar2 = (cbfs) this.b.R.b();
                cbvt cbvtVar = (cbvt) this.b.cX.b();
                bdtd bdtdVar2 = (bdtd) this.a.a.aO.b();
                akhy akhyVar34 = this.b;
                return new ckxo(errlVar12, errlVar13, ckjuVar, dtuuVar2, fbbfVar32, fbbfVar33, cqohVar3, cbfsVar2, cbvtVar, bdtdVar2, akhyVar34.dW(), (cbgf) akhyVar34.O.b(), (akzt) this.a.a.f.b(), this.a.kk);
            case 646:
                return new cern((avgr) this.b.eE.b());
            case 647:
                byzp byzpVar = (byzp) this.a.a.iy.b();
                bavs bavsVar = (bavs) this.a.a.tF.b();
                akhy akhyVar35 = this.b;
                akkp akkpVar28 = this.a.a;
                fbbf fbbfVar34 = akhyVar35.W;
                fbbf fbbfVar35 = akkpVar28.BF;
                dtuu dtuuVar3 = (dtuu) akkpVar28.ay.b();
                akis akisVar19 = this.a;
                akhy akhyVar36 = this.b;
                akkp akkpVar29 = akisVar19.a;
                fbbf fbbfVar36 = akhyVar36.O;
                fbbf fbbfVar37 = akkpVar29.dp;
                fbbf fbbfVar38 = akisVar19.iz;
                cqoh cqohVar4 = (cqoh) this.a.cz.b();
                return new cerv(byzpVar, bavsVar, fbbfVar34, akhyVar35.bv, fbbfVar35, dtuuVar3, akisVar19.aR, fbbfVar36, fbbfVar37, fbbfVar38, cqohVar4);
            case 648:
                errl errlVar14 = (errl) this.a.t.b();
                errl errlVar15 = (errl) this.a.p.b();
                avkj avkjVar2 = (avkj) this.b.bj.b();
                akkp akkpVar30 = this.a.a;
                return new clan(errlVar14, errlVar15, avkjVar2, akkpVar30.G, (clbd) akkpVar30.kl.b(), (akzt) this.a.a.f.b());
            case 649:
                errl errlVar16 = (errl) this.a.t.b();
                akhy akhyVar37 = this.b;
                return new bdwz(errlVar16, akhyVar37.ly, akhyVar37.S, (bdwr) this.a.a.rn.b(), (cbvt) this.b.cX.b(), (bdtd) this.a.a.aO.b(), (cqoh) this.a.cz.b(), (cbgf) this.b.O.b(), (bdvi) this.b.bn.b(), (ahor) this.a.a.ii.b(), (ecrj) this.a.cN.b());
            case 650:
                return new bdvu((dtuu) this.a.a.ay.b(), this.b.O);
            case 651:
                bauu bauuVar = (bauu) this.b.cV.b();
                barw barwVar = (barw) this.b.cU.b();
                akis akisVar20 = this.a;
                fbbf fbbfVar39 = akisVar20.a.nj;
                errm errmVar = (errm) akisVar20.t.b();
                akhy akhyVar38 = this.b;
                fbbf fbbfVar40 = this.a.cz;
                return new ctss(bauuVar, barwVar, fbbfVar39, errmVar, akhyVar38.S, akhyVar38.aS, (cqoh) fbbfVar40.b());
            case 652:
                ffsk ffskVar6 = (ffsk) this.a.a.q.b();
                cnnh cnnhVar = (cnnh) this.a.a.bQ.b();
                bdjr bdjrVar = (bdjr) this.b.bv.b();
                akkp akkpVar31 = this.a.a;
                cnro jP = akkpVar31.jP();
                cnqv jO = akkpVar31.jO();
                bdtd bdtdVar3 = (bdtd) akkpVar31.aO.b();
                akhy akhyVar39 = this.b;
                akkp akkpVar32 = this.a.a;
                cnvr eE = akhyVar39.eE();
                Optional of2 = Optional.of((cpdd) akkpVar32.jo.b());
                akis akisVar21 = this.a;
                akhy akhyVar40 = this.b;
                akkp akkpVar33 = akisVar21.a;
                fbbf fbbfVar41 = akkpVar33.fP;
                fbbf fbbfVar42 = akkpVar33.NJ;
                fbbf fbbfVar43 = akkpVar33.NK;
                cnnv eB = akhyVar40.eB();
                aolr aolrVar = (aolr) akkpVar33.Z.b();
                cnvc cnvcVar = (cnvc) this.a.a.mH.b();
                akis akisVar22 = this.a;
                akhy akhyVar41 = this.b;
                akkp akkpVar34 = akisVar22.a;
                return new cnsm(ffskVar6, cnnhVar, bdjrVar, jP, jO, bdtdVar3, eE, of2, fbbfVar41, fbbfVar42, fbbfVar43, eB, aolrVar, cnvcVar, akkpVar34.ay, akhyVar41.eD(), akhyVar41.X, (asmj) akkpVar34.jD.b(), this.a.a.jF);
            case 653:
                return new cpwc((cqoh) this.a.cz.b(), this.b.eL(), (cins) this.a.a.jc.b(), (errm) this.a.p.b(), this.a.a.cf);
            case 654:
                return new awqv(this.b.aD(), (cfyt) this.a.a.cf.b());
            case 655:
                return new cblv((errl) this.a.t.b(), (cbgf) this.b.O.b());
            case 656:
                return new cspl((ffsk) this.a.a.p.b(), this.b.fh(), (csjk) this.a.a.el.b());
            case 657:
                ffsk ffskVar7 = (ffsk) this.a.a.p.b();
                cbwj cbwjVar = (cbwj) this.a.a.kG.b();
                comc comcVar2 = (comc) this.a.a.HR.b();
                axwk axwkVar = (axwk) this.b.aC.b();
                akhy akhyVar42 = this.b;
                axzk aw = akhyVar42.aw();
                aybz aybzVar2 = (aybz) akhyVar42.iy.b();
                akkp akkpVar35 = this.a.a;
                return new ayar(ffskVar7, cbwjVar, comcVar2, axwkVar, aw, aybzVar2, akkpVar35.ej, akkpVar35.al, akkpVar35.mj, akkpVar35.ml, akkpVar35.Hs);
            case 658:
                ffsk ffskVar8 = (ffsk) this.a.a.p.b();
                ffhd ffhdVar3 = (ffhd) this.a.cP.b();
                cbwj cbwjVar2 = (cbwj) this.a.a.kG.b();
                comc comcVar3 = (comc) this.a.a.HR.b();
                akhy akhyVar43 = this.b;
                akis akisVar23 = this.a;
                akkp akkpVar36 = akisVar23.a;
                return new ayba(ffskVar8, ffhdVar3, cbwjVar2, comcVar3, akhyVar43.lH, akkpVar36.al, akisVar23.cN, akhyVar43.ie, akkpVar36.Hs, akkpVar36.mn);
            case 659:
                return new axzq(this.a.a.cc);
            case 660:
                return new cflt((ffsk) this.a.a.q.b(), enip.q(), (cfkw) this.a.a.HH.b(), (cflm) this.a.a.HI.b(), (ceww) this.b.lJ.b(), (cbwj) this.a.a.kG.b(), (cevh) this.a.a.cc.b());
            case 661:
                Context context2 = (Context) this.a.q.b();
                dhzj dhzjVar = (dhzj) this.a.nI.b();
                akhy akhyVar44 = this.b;
                akis akisVar24 = this.a;
                akkp akkpVar37 = akisVar24.a;
                fbbf fbbfVar44 = akhyVar44.lg;
                fbbf fbbfVar45 = akkpVar37.dQ;
                fbbf fbbfVar46 = akkpVar37.ft;
                fbbf fbbfVar47 = akkpVar37.u;
                fbbf fbbfVar48 = akkpVar37.No;
                errl errlVar17 = (errl) akisVar24.t.b();
                errl errlVar18 = (errl) this.a.p.b();
                akhy akhyVar45 = this.b;
                akis akisVar25 = this.a;
                fbbf fbbfVar49 = akhyVar45.lj;
                akkp akkpVar38 = akisVar25.a;
                return new deig(context2, dhzjVar, fbbfVar44, fbbfVar45, akisVar24.cT, fbbfVar46, fbbfVar47, fbbfVar48, errlVar17, errlVar18, fbbfVar49, akisVar25.nJ, akkpVar38.al, akisVar25.cN, akkpVar38.Q, akkpVar38.Oq);
            case 662:
                akhy akhyVar46 = this.b;
                akis akisVar26 = this.a;
                akkp akkpVar39 = akisVar26.a;
                fbbf fbbfVar50 = akhyVar46.kG;
                fbbf fbbfVar51 = akhyVar46.W;
                fbbf fbbfVar52 = akhyVar46.P;
                fbbf fbbfVar53 = akhyVar46.K;
                fbbf fbbfVar54 = akhyVar46.lN;
                fbbf fbbfVar55 = akkpVar39.Z;
                ffsk ffskVar9 = (ffsk) akkpVar39.aq.b();
                ffsk ffskVar10 = (ffsk) this.a.a.q.b();
                return new cain(fbbfVar50, akhyVar46.bX, fbbfVar51, fbbfVar52, fbbfVar53, fbbfVar54, fbbfVar55, akisVar26.cz, ffskVar9, ffskVar10);
            case 663:
                akke akkeVar = (akke) this.a.a.gq.b();
                akhy akhyVar47 = this.b;
                akis akisVar27 = this.a;
                return cpri.a(akkeVar, akhyVar47.fK(), akisVar27.a.kJ(), (Optional) akisVar27.nA.b());
            case 664:
                return new cpsm(this.b.hc(), (ffsk) this.a.a.aq.b(), (ffhd) this.a.cP.b());
            case 665:
                return new ckst(this.b.dX());
            case 666:
                return new cdfh((ffsk) this.a.a.q.b(), (ffhd) this.a.co.b(), (axkm) this.a.a.ck.b(), (babm) this.a.a.wl.b(), this.b.bL(), Optional.empty(), (axdf) this.a.a.cm.b(), (akzt) this.a.a.f.b());
            case 667:
                Optional optional = (Optional) this.b.jp.b();
                bzaf bzafVar = (bzaf) this.b.jw.b();
                fazb a2 = fbaz.a(this.b.lV);
                fazb a3 = fbaz.a(this.a.lv);
                Optional optional2 = (Optional) this.a.a.ag.b();
                errl errlVar19 = (errl) this.a.p.b();
                ctyx ctyxVar = (ctyx) this.a.aU.b();
                bzgd bzgdVar = (bzgd) this.b.ec.b();
                akis akisVar28 = this.a;
                akhy akhyVar48 = this.b;
                fbbf fbbfVar56 = akisVar28.a.ka;
                ?? fV = akhyVar48.fV();
                bbfl bbflVar = (bbfl) akhyVar48.lT.b();
                Optional optional3 = (Optional) this.a.ip.b();
                csjk csjkVar = (csjk) this.a.a.fQ.b();
                akhy akhyVar49 = this.b;
                akkp akkpVar40 = this.a.a;
                fbbf fbbfVar57 = akhyVar49.lW;
                fbbf fbbfVar58 = akkpVar40.vR;
                banr aB = akhyVar49.aB();
                fazb a4 = fbaz.a(akkpVar40.vS);
                fazb a5 = fbaz.a(this.b.lY);
                bbem bbemVar = (bbem) this.b.lU.b();
                bbfs bbfsVar = (bbfs) this.b.ju.b();
                akis akisVar29 = this.a;
                akhy akhyVar50 = this.b;
                akkp akkpVar41 = akisVar29.a;
                fbbf fbbfVar59 = akkpVar41.wj;
                fbbf fbbfVar60 = akkpVar41.fJ;
                fbbf fbbfVar61 = akhyVar50.ei;
                fbbf fbbfVar62 = akhyVar50.lZ;
                Optional optional4 = (Optional) akkpVar41.uP.b();
                akis akisVar30 = this.a;
                akhy akhyVar51 = this.b;
                akkp akkpVar42 = akisVar30.a;
                return new bzdx(optional, bzafVar, a2, a3, optional2, errlVar19, ctyxVar, bzgdVar, fbbfVar56, fV, bbflVar, optional3, csjkVar, fbbfVar57, fbbfVar58, aB, a4, a5, bbemVar, bbfsVar, fbbfVar59, fbbfVar60, fbbfVar61, fbbfVar62, optional4, akkpVar42.vp, akkpVar42.vq, akkpVar42.vB, (Map) akhyVar51.ma.b());
            case 668:
                Context context3 = (Context) this.a.q.b();
                akhy akhyVar52 = this.b;
                return new bzcf(context3, (bzce) akhyVar52.gh(), (aqvh) akhyVar52.M.b(), (aqkp) this.b.aE.b(), (ejtr) this.b.aB.b());
            case 669:
                akhy akhyVar53 = this.b;
                akis akisVar31 = this.a;
                akkp akkpVar43 = akisVar31.a;
                return new bakp(akhyVar53.ec, akkpVar43.f, akisVar31.p, akisVar31.t, akisVar31.aK, akisVar31.lx, akkpVar43.dR, akkpVar43.ka, akhyVar53.jt, akhyVar53.ek, akhyVar53.jh, akkpVar43.fr, akhyVar53.jm, akisVar31.da, akkpVar43.vo, akisVar31.cN, akkpVar43.vp, akkpVar43.vq, akkpVar43.vB, akkpVar43.vC);
            case 670:
                akhy akhyVar54 = this.b;
                akkp akkpVar44 = this.a.a;
                fbbf fbbfVar63 = akhyVar54.lU;
                fbbf fbbfVar64 = akhyVar54.ec;
                fbbf a6 = fbbg.a(akkpVar44.uV);
                akis akisVar32 = this.a;
                akhy akhyVar55 = this.b;
                akkp akkpVar45 = akisVar32.a;
                return new bacs(fbbfVar63, fbbfVar64, a6, akkpVar45.jZ, akkpVar45.ql, akhyVar55.eh, akisVar32.t, akisVar32.p, akisVar32.cz, akkpVar45.f, akhyVar55.ek, akisVar32.da);
            case 671:
                return new bzdz((errl) this.a.t.b(), (cgzv) this.a.a.ka.b(), (Optional) this.a.ip.b(), this.b.jt, (ctud) this.a.cT.b(), (chww) this.b.ek.b(), this.a.da);
            case 672:
                return new caqn(fbbg.a(this.b.lX), this.b.ap);
            case 673:
                akis akisVar33 = this.a;
                akhy akhyVar56 = this.b;
                akkp akkpVar46 = akisVar33.a;
                return new banb(akkpVar46.jZ, akkpVar46.ql, akhyVar56.eh, akhyVar56.ek, akhyVar56.ec);
            case 674:
                akhy akhyVar57 = this.b;
                return new chvw(akhyVar57.ek, akhyVar57.jt, akhyVar57.ec, (ffsk) this.a.a.aq.b());
            case 675:
                return enhk.m("CMS", (ciap) this.a.a.wm.b(), "GDitto", this.b.dm());
            case 676:
                return new chyn(this.b.ec, this.a.t);
            case 677:
                eisx eisxVar = (eisx) this.b.b.b();
                Context context4 = (Context) this.a.q.b();
                chja chjaVar = (chja) this.b.u.b();
                cgxw cgxwVar = (cgxw) this.b.ef.b();
                Optional of3 = Optional.of(this.b.m161do());
                Optional of4 = Optional.of(this.b.dl());
                Optional of5 = Optional.of(this.a.a.hP());
                Optional optional5 = (Optional) this.a.ip.b();
                akhy akhyVar58 = this.b;
                return acig.a(eisxVar, context4, chjaVar, cgxwVar, of3, of4, of5, optional5, akhyVar58.nn, (errl) this.a.p.b());
            case 678:
                akhy akhyVar59 = this.b;
                enhd h = enhk.h(10);
                h.k(fbzs.TACHYGRAM_CONTROL_MESSAGE, akhyVar59.md);
                h.k(fbzs.TACHYGRAM_MESSAGE, this.b.me);
                h.k(fbzs.GROUP, this.b.mf);
                h.k(fbzs.DITTO, this.b.mF);
                h.k(fbzs.WIREBALL, this.b.mF);
                h.k(fbzs.BUGLE_AGENT, this.b.mF);
                h.k(fbzs.REFLECTED_TACHYGRAM_MESSAGE, this.b.mH);
                h.k(fbzs.USERDATA, this.b.mI);
                h.k(fbzs.CMS_RPC_MESSAGE, this.b.mQ);
                h.k(fbzs.CMS_NOTIFICATION, this.b.nl);
                return h.h();
            case 679:
                return this.b.eK();
            case 680:
                return this.b.eJ();
            case 681:
                return this.b.eJ();
            case 682:
                bzgd bzgdVar2 = (bzgd) this.b.ec.b();
                errl errlVar20 = (errl) this.a.t.b();
                akhy akhyVar60 = this.b;
                akkp akkpVar47 = this.a.a;
                return new cigu(bzgdVar2, errlVar20, akhyVar60.dj(), akkpVar47.jZ, fbaz.a(akkpVar47.eY));
            case 683:
                return new cict((ffsk) this.a.a.aq.b(), (ctvs) this.a.aZ.b(), (alxl) this.b.ao.b(), (aqkp) this.b.aE.b(), (aolr) this.a.a.Z.b(), (cidg) this.a.a.zr.b());
            case 684:
                akhy akhyVar61 = this.b;
                return new bbag(akhyVar61.P, akhyVar61.cX, akhyVar61.O);
            case 685:
                return new caqz(this.b.O);
            case 686:
                akkp akkpVar48 = this.a.a;
                fbbf fbbfVar65 = akkpVar48.dQ;
                cgzv cgzvVar = (cgzv) akkpVar48.ka.b();
                chqc chqcVar = (chqc) this.b.jh.b();
                akis akisVar34 = this.a;
                fbbf fbbfVar66 = akisVar34.a.fr;
                errl errlVar21 = (errl) akisVar34.t.b();
                errl errlVar22 = (errl) this.a.p.b();
                akis akisVar35 = this.a;
                akhy akhyVar62 = this.b;
                akkp akkpVar49 = akisVar35.a;
                return new cieq(fbbfVar65, cgzvVar, chqcVar, fbbfVar66, errlVar21, errlVar22, akkpVar49.vp, akkpVar49.vq, akkpVar49.vB, akhyVar62.jm);
            case 687:
                cgzv cgzvVar2 = (cgzv) this.a.a.ka.b();
                bbgi bbgiVar = (bbgi) this.b.jq.b();
                akhy akhyVar63 = this.b;
                akkp akkpVar50 = this.a.a;
                fbbf fbbfVar67 = akhyVar63.jr;
                bcsf bcsfVar2 = (bcsf) akkpVar50.vK.b();
                akzt akztVar = (akzt) this.a.a.f.b();
                bcsq bcsqVar = (bcsq) this.a.a.rq.b();
                akhy akhyVar64 = this.b;
                fbbf fbbfVar68 = this.a.a.au;
                Optional optional6 = (Optional) akhyVar64.jp.b();
                akhy akhyVar65 = this.b;
                akis akisVar36 = this.a;
                return new ciey(cgzvVar2, bbgiVar, fbbfVar67, bcsfVar2, akztVar, bcsqVar, akhyVar64.bu, fbbfVar68, optional6, akhyVar65.mk, (errl) akisVar36.p.b());
            case 688:
                akhy akhyVar66 = this.b;
                akkp akkpVar51 = this.a.a;
                return new cgxd(akhyVar66.cn, akhyVar66.ha, (ffsk) akkpVar51.q.b(), this.a.a.bB());
            case 689:
                Context context5 = (Context) this.a.q.b();
                bbfb bbfbVar = (bbfb) this.b.fg.b();
                akis akisVar37 = this.a;
                return new cifx(context5, bbfbVar, akisVar37.a.fr, this.b.ab, (errl) akisVar37.t.b(), (errl) this.a.p.b(), (cgzv) this.a.a.ka.b(), (akzt) this.a.a.f.b(), (cqoh) this.a.cz.b(), (bcvw) this.b.bo.b(), (bcwz) this.a.a.ad.b(), (byzp) this.a.a.iy.b(), (ctvb) this.a.a.u.b(), (albq) this.a.a.di.b(), (aolr) this.a.a.Z.b(), (chdj) this.b.eg.b(), (bdtd) this.a.a.aO.b(), (Optional) this.b.jp.b(), this.a.a.zz);
            case 690:
                ckqj ckqjVar = (ckqj) this.b.gx.b();
                errl errlVar23 = (errl) this.a.p.b();
                akis akisVar38 = this.a;
                akhy akhyVar67 = this.b;
                akkp akkpVar52 = akisVar38.a;
                return new cids(ckqjVar, errlVar23, akkpVar52.zz, akkpVar52.xA, akhyVar67.mn);
            case 691:
                ffsk ffskVar11 = (ffsk) this.a.a.p.b();
                ffhd ffhdVar4 = (ffhd) this.a.co.b();
                akhy akhyVar68 = this.b;
                return new cida(ffskVar11, ffhdVar4, akhyVar68.gx, this.a.a.zz, akhyVar68.aF);
            case 692:
                aolr aolrVar2 = (aolr) this.a.a.Z.b();
                akhy akhyVar69 = this.b;
                akis akisVar39 = this.a;
                return new cibq(aolrVar2, akhyVar69.dY(), (errl) akisVar39.p.b(), this.b.aF, this.a.a.zz);
            case 693:
                errl errlVar24 = (errl) this.a.t.b();
                errl errlVar25 = (errl) this.a.p.b();
                akhy akhyVar70 = this.b;
                akkp akkpVar53 = this.a.a;
                fbbf fbbfVar69 = akhyVar70.P;
                aolr aolrVar3 = (aolr) akkpVar53.Z.b();
                cowz cowzVar = (cowz) this.b.fc.b();
                avkm avkmVar = (avkm) this.a.a.nK.b();
                akis akisVar40 = this.a;
                return new cigi(errlVar24, errlVar25, fbbfVar69, aolrVar3, cowzVar, avkmVar, akisVar40.a.G, (cqoh) akisVar40.cz.b(), this.a.a.zz);
            case 694:
                errl errlVar26 = (errl) this.a.t.b();
                errl errlVar27 = (errl) this.a.p.b();
                chqc chqcVar2 = (chqc) this.b.jh.b();
                akis akisVar41 = this.a;
                akhy akhyVar71 = this.b;
                akkp akkpVar54 = akisVar41.a;
                return new cidp(errlVar26, errlVar27, chqcVar2, akkpVar54.ka, akhyVar71.jm, akkpVar54.fr, akhyVar71.mk);
            case 695:
                Context context6 = (Context) this.a.q.b();
                ffsk ffskVar12 = (ffsk) this.a.a.q.b();
                ffsk ffskVar13 = (ffsk) this.a.a.p.b();
                bzgd bzgdVar3 = (bzgd) this.b.ec.b();
                cibf cibfVar = (cibf) this.a.lU.b();
                Optional of6 = Optional.of((bzme) this.a.a.zK.b());
                akis akisVar42 = this.a;
                cgvp cgvpVar = (cgvp) akisVar42.lV.b();
                akis akisVar43 = this.a;
                akhy akhyVar72 = this.b;
                fbbf fbbfVar70 = akisVar43.a.jZ;
                Optional optional7 = (Optional) akhyVar72.jp.b();
                cgvn cgvnVar = (cgvn) this.a.lW.b();
                akis akisVar44 = this.a;
                akkp akkpVar55 = akisVar44.a;
                return new cice(context6, ffskVar12, ffskVar13, bzgdVar3, cibfVar, of6, akisVar42.da, cgvpVar, fbbfVar70, optional7, cgvnVar, akkpVar55.zN, akkpVar55.zO, akkpVar55.zP, akisVar44.lX, akkpVar55.dE);
            case 696:
                return new cigq((ffsk) this.a.a.p.b(), (ffsk) this.a.a.q.b(), this.a.da, this.b.ec);
            case 697:
                ffsk ffskVar14 = (ffsk) this.a.a.p.b();
                ffsk ffskVar15 = (ffsk) this.a.a.q.b();
                chqc chqcVar3 = (chqc) this.b.jh.b();
                amav amavVar = (amav) this.a.a.zX.b();
                alxl alxlVar = (alxl) this.b.ao.b();
                aqkp aqkpVar = (aqkp) this.b.aE.b();
                akkp akkpVar56 = this.a.a;
                return new cicd(ffskVar14, ffskVar15, chqcVar3, amavVar, alxlVar, aqkpVar, akkpVar56.dQ, akkpVar56.ka, (aolr) akkpVar56.Z.b());
            case 698:
                return new cidw((ffsk) this.a.a.p.b(), (ffsk) this.a.a.q.b(), (Optional) this.b.jp.b(), this.a.a.zO);
            case 699:
                return new cigm((ffsk) this.a.a.p.b(), (ffsk) this.a.a.q.b(), (Optional) this.b.jp.b(), this.a.a.zO);
            default:
                throw new AssertionError(i);
        }
    }

    private final Object i() {
        int i = this.c;
        switch (i) {
            case 700:
                akhy akhyVar = this.b;
                akkp akkpVar = this.a.a;
                return new cmsj(akhyVar.mB, akhyVar.mC, akkpVar.zz, akkpVar.cF());
            case 701:
                errl errlVar = (errl) this.a.t.b();
                errl errlVar2 = (errl) this.a.p.b();
                akhy akhyVar2 = this.b;
                akkp akkpVar2 = this.a.a;
                fbbf fbbfVar = akkpVar2.dp;
                fbbf fbbfVar2 = akkpVar2.br;
                fbbf fbbfVar3 = akkpVar2.cx;
                fbbf fbbfVar4 = akhyVar2.P;
                bcsf bcsfVar = (bcsf) akkpVar2.vK.b();
                akzt akztVar = (akzt) this.a.a.f.b();
                cmsl cmslVar = (cmsl) this.a.lY.b();
                akkp akkpVar3 = this.a.a;
                return new cndv(errlVar, errlVar2, akhyVar2.mA, fbbfVar, fbbfVar2, fbbfVar3, fbbfVar4, bcsfVar, akztVar, cmslVar, akkpVar3.Z, akkpVar3.lu, akkpVar3.rq, akkpVar3.vL, akkpVar3.jG(), akkpVar3.aO, (atky) akkpVar3.rs.b());
            case 702:
                return new cndl(this.b.gH());
            case 703:
                return cneu.a(this.b.ey());
            case 704:
                return cnet.a(this.b.ey());
            case 705:
                cmsl cmslVar2 = (cmsl) this.a.lY.b();
                bbfb bbfbVar = (bbfb) this.b.fg.b();
                byzp byzpVar = (byzp) this.a.a.iy.b();
                cndj cndjVar = (cndj) this.a.iw.b();
                cqoh cqohVar = (cqoh) this.a.cz.b();
                return new cnda(cmslVar2, bbfbVar, byzpVar, cndjVar, cqohVar, (awtm) this.a.iz.b(), this.b.aF);
            case 706:
                return new cmsc(this.b.ep(), (ffsk) this.a.a.q.b());
            case 707:
                return new calb((errl) this.a.t.b(), (bzqb) this.b.bS.b(), (bbfg) this.b.fl.b(), this.b.bF);
            case 708:
                ffsk ffskVar = (ffsk) this.a.a.q.b();
                akis akisVar = this.a;
                akhy akhyVar3 = this.b;
                return new cihr(ffskVar, akisVar.cz, akisVar.a.zP, akisVar.lX, akhyVar3.gB(), akhyVar3.gJ());
            case 709:
                akhy akhyVar4 = this.b;
                akis akisVar2 = this.a;
                return new ciif(akhyVar4.M, akhyVar4.aE, akhyVar4.ao, akisVar2.a.Z);
            case 710:
                return new cigw(this.b.gK());
            case 711:
                ffsk ffskVar2 = (ffsk) this.a.a.q.b();
                eisx eisxVar = (eisx) this.b.b.b();
                akkp akkpVar4 = this.a.a;
                fbbf fbbfVar5 = akkpVar4.as;
                axkm axkmVar = (axkm) akkpVar4.ck.b();
                axmm axmmVar = (axmm) this.a.a.qL.b();
                akhy akhyVar5 = this.b;
                return new tdi(ffskVar2, eisxVar, fbbfVar5, axkmVar, axmmVar, akhyVar5.di(), akhyVar5.eh, akhyVar5.gG(), (aslr) this.a.a.jX.b());
            case 712:
                return Optional.of((chja) this.b.mL.b());
            case 713:
                akhy akhyVar6 = this.b;
                akko akkoVar = this.a.b;
                chjb dg = akhyVar6.dg();
                fbbf fbbfVar6 = akkoVar.gr;
                String a = chkh.a();
                chki.a();
                return chjl.a(dg, fbbfVar6, akhyVar6.mJ, akhyVar6.mK, a);
            case 714:
                return chjz.a(this.b.i, (ekpg) this.a.b.gL.b(), (ekpr) this.a.de.b(), (euzy) this.a.a.bx.b(), emxc.h());
            case 715:
                return chjy.a(this.b.i, (ekpg) this.a.b.gL.b(), (ekpr) this.a.de.b(), (euzy) this.a.a.bx.b(), emxc.h());
            case 716:
                return cgxe.a((akhl) this.b.mO.b(), (chkj) this.b.D.b(), (chln) this.a.b.gw.b());
            case 717:
                return new akhl(this);
            case 718:
                return new akhm(this);
            case 719:
                akhy akhyVar7 = this.b;
                return new tpx(akhyVar7.gD(), (cscn) akhyVar7.nk.b(), (axkm) this.a.a.ck.b(), (axmm) this.a.a.qL.b(), (errl) this.a.t.b(), (errl) this.a.p.b());
            case 720:
                csbt csbtVar = (csbt) this.a.a.Ha.b();
                crty crtyVar = (crty) this.b.m.b();
                cgrq cgrqVar = (cgrq) this.b.bw.b();
                akhy akhyVar8 = this.b;
                akis akisVar3 = this.a;
                akkp akkpVar5 = akisVar3.a;
                tqr o = akhyVar8.o();
                dtuu dtuuVar = (dtuu) akkpVar5.ay.b();
                akhy akhyVar9 = this.b;
                akis akisVar4 = this.a;
                fbbf fbbfVar7 = akhyVar9.dD;
                errl errlVar3 = (errl) akisVar4.t.b();
                errl errlVar4 = (errl) this.a.p.b();
                akis akisVar5 = this.a;
                fbbf fbbfVar8 = akisVar5.b.gS;
                asix asixVar = (asix) akisVar5.a.pR.b();
                akhy akhyVar10 = this.b;
                akkp akkpVar6 = this.a.a;
                return new trv(csbtVar, crtyVar, cgrqVar, o, akisVar3.cE, dtuuVar, fbbfVar7, errlVar3, errlVar4, fbbfVar8, asixVar, akhyVar10.cL(), akhyVar10.bu(), (arep) akkpVar6.pL.b());
            case 721:
                return new crwy((cryl) this.a.a.GZ.b());
            case 722:
                Queue queue = (Queue) this.a.b.gN.b();
                Queue queue2 = (Queue) this.a.b.gO.b();
                Queue queue3 = (Queue) this.a.b.gP.b();
                akzt akztVar2 = (akzt) this.a.a.al.b();
                ffsk ffskVar3 = (ffsk) this.a.a.aq.b();
                eisx eisxVar2 = (eisx) this.b.b.b();
                ccdo ccdoVar = (ccdo) this.a.a.tX.b();
                akhy akhyVar11 = this.b;
                return new ccub(queue, queue2, queue3, akztVar2, ffskVar3, eisxVar2, ccdoVar, akhyVar11.bJ(), (crty) akhyVar11.m.b(), (cryg) this.a.cE.b());
            case 723:
                return new crwo((cryl) this.a.a.GZ.b());
            case 724:
                ayfy ayfyVar = (ayfy) this.b.gn.b();
                akhy akhyVar12 = this.b;
                return new tqc(ayfyVar, akhyVar12.o(), akhyVar12.p(), (errl) this.a.t.b(), (errl) this.a.p.b());
            case 725:
                return new trw(this.b.q());
            case 726:
                akhy akhyVar13 = this.b;
                return new tpg(akhyVar13.mX, (crty) akhyVar13.m.b(), (tns) this.b.k.b(), (errl) this.a.p.b());
            case 727:
                akhy akhyVar14 = this.b;
                return new tpq(akhyVar14.m, akhyVar14.k, (ffsk) this.a.a.aq.b(), (ffhd) this.a.cP.b());
            case 728:
                akhy akhyVar15 = this.b;
                akkp akkpVar7 = this.a.a;
                return new tpi(akhyVar15.mX, akhyVar15.I, akhyVar15.ni, (dtuu) akkpVar7.ay.b(), (ffsk) this.a.a.aq.b());
            case 729:
                dtve dtveVar = (dtve) this.a.a.cD.b();
                akhy akhyVar16 = this.b;
                akkp akkpVar8 = this.a.a;
                ccrm bB = akhyVar16.bB();
                cccl ccclVar = (cccl) akkpVar8.tW.b();
                akhy akhyVar17 = this.b;
                akkp akkpVar9 = this.a.a;
                cefm cw = akhyVar17.cw();
                cegb cy = akhyVar17.cy();
                cejp cD = akhyVar17.cD();
                cefu cx = akhyVar17.cx();
                cegh cz = akhyVar17.cz();
                cdxt gG = akkpVar9.gG();
                cdiv bP = akhyVar17.bP();
                cdcc gf = akkpVar9.gf();
                cdyb gH = akkpVar9.gH();
                cedy cu = akhyVar17.cu();
                cdeq gh = akkpVar9.gh();
                cbzo bm = akhyVar17.bm();
                ceib ceibVar = (ceib) akhyVar17.hI.b();
                akhy akhyVar18 = this.b;
                cegs cA = akhyVar18.cA();
                cehz cehzVar = (cehz) akhyVar18.hH.b();
                crud crudVar = (crud) this.a.mQ.b();
                csct csctVar = (csct) this.a.mR.b();
                ashs ashsVar = (ashs) this.a.a.FJ.b();
                babf babfVar = (babf) this.a.a.pN.b();
                axkm axkmVar2 = (axkm) this.a.a.ck.b();
                cead ceadVar = (cead) this.b.iM.b();
                akis akisVar6 = this.a;
                akkp akkpVar10 = akisVar6.a;
                cdyu bS = akisVar6.bS();
                dtuu dtuuVar2 = (dtuu) akkpVar10.ay.b();
                cdkg cdkgVar = (cdkg) this.b.fI.b();
                akkp akkpVar11 = this.a.a;
                axeb dU = akkpVar11.dU();
                asiv bq = akkpVar11.bq();
                ffsk ffskVar4 = (ffsk) akkpVar11.p.b();
                axcn axcnVar = (axcn) this.a.cG.b();
                cdrh cdrhVar = (cdrh) this.b.na.b();
                cdri cdriVar = (cdri) this.b.nb.b();
                cdrk cdrkVar = (cdrk) this.b.nc.b();
                cdrq cdrqVar = (cdrq) this.b.nd.b();
                cdrm cdrmVar = (cdrm) this.b.ne.b();
                cdro cdroVar = (cdro) this.b.nf.b();
                akzt akztVar3 = (akzt) this.a.a.al.b();
                akkp akkpVar12 = this.a.a;
                return new crzn(dtveVar, bB, ccclVar, cw, cy, cD, cx, cz, gG, bP, gf, gH, cu, gh, bm, ceibVar, cA, cehzVar, crudVar, csctVar, ashsVar, babfVar, axkmVar2, ceadVar, bS, dtuuVar2, cdkgVar, dU, bq, ffskVar4, axcnVar, cdrhVar, cdriVar, cdrkVar, cdrqVar, cdrmVar, cdroVar, akztVar3, akkpVar12.ca(), (cefc) akkpVar12.Gd.b(), (cdhd) this.b.im.b(), (cdgw) this.b.in.b(), (cdyp) this.b.ng.b(), (cdyj) this.b.nh.b(), this.b.cQ());
            case 730:
                akis akisVar7 = this.a;
                akhy akhyVar19 = this.b;
                akkp akkpVar13 = akisVar7.a;
                return enip.v(akkpVar13.fV(), akkpVar13.fU(), akkpVar13.fP(), akhyVar19.bA(), akkpVar13.fR(), new ccdv(), new cctr[0]);
            case 731:
                return new cdrh(this.a.a.cc);
            case 732:
                return new cdri(this.a.a.cc);
            case 733:
                return new cdrk(this.a.a.cc);
            case 734:
                return new cdrq(this.a.a.cc);
            case 735:
                return new cdrm(this.a.a.cc);
            case 736:
                return new cdro(this.a.a.cc);
            case 737:
                return new cdyp(this.a.a.cc);
            case 738:
                return new cdyj(this.a.a.cc);
            case 739:
                return new cscn((cins) this.a.a.jc.b(), (crue) this.a.a.Gk.b(), (axkm) this.a.a.ck.b(), (eisx) this.b.b.b(), (errl) this.a.p.b());
            case 740:
                return new akho(this);
            case 741:
                eisx eisxVar3 = (eisx) this.b.b.b();
                akis akisVar8 = this.a;
                akhy akhyVar20 = this.b;
                akkp akkpVar14 = akisVar8.a;
                fbbf fbbfVar9 = akkpVar14.as;
                fbbf fbbfVar10 = akkpVar14.pN;
                fbbf fbbfVar11 = akkpVar14.ck;
                fbbf fbbfVar12 = akkpVar14.cX;
                fbbf fbbfVar13 = akhyVar20.ec;
                chvu dk = akhyVar20.dk();
                akhyVar20.hn();
                akis akisVar9 = this.a;
                akhy akhyVar21 = this.b;
                akkp akkpVar15 = akisVar9.a;
                fbbf fbbfVar14 = akkpVar15.vc;
                fbbf fbbfVar15 = akhyVar21.x;
                fbbf fbbfVar16 = akkpVar15.cp;
                fbbf fbbfVar17 = akkpVar15.uV;
                fbbf fbbfVar18 = akhyVar21.ef;
                ffsk ffskVar5 = (ffsk) akkpVar15.q.b();
                ejar ejarVar = (ejar) this.a.a.au.b();
                Context context = (Context) this.a.q.b();
                akis akisVar10 = this.a;
                fbbf fbbfVar19 = akhyVar21.no;
                akkp akkpVar16 = akisVar10.a;
                return new bzid(eisxVar3, fbbfVar9, fbbfVar10, fbbfVar11, fbbfVar12, fbbfVar13, dk, fbbfVar14, fbbfVar15, fbbfVar16, fbbfVar17, fbbfVar19, fbbfVar18, ffskVar5, ejarVar, context, akkpVar16.C, akkpVar16.jY, akkpVar16.eV);
            case 742:
                akhy akhyVar22 = this.b;
                return enhk.p(3, akhyVar22.bt(), 1, akhyVar22.bs(), 2, akhyVar22.br(), 5, akhyVar22.fU(), 7, akhyVar22.fT());
            case 743:
                akis akisVar11 = this.a;
                fbbf fbbfVar20 = akisVar11.a.ay;
                akko akkoVar2 = akisVar11.b;
                return new cdag(fbbfVar20, akisVar11.co, akkoVar2.gT, akkoVar2.gU);
            case 744:
                akis akisVar12 = this.a;
                akko akkoVar3 = akisVar12.b;
                akkp akkpVar17 = akisVar12.a;
                return new cdar(akkpVar17.al, akkpVar17.cf, akkpVar17.ch, akkpVar17.p, akkpVar17.q, akkpVar17.cm, akkoVar3.gV);
            case 745:
                akis akisVar13 = this.a;
                akhy akhyVar23 = this.b;
                cdoa gw = akisVar13.a.gw();
                eisx eisxVar4 = (eisx) akhyVar23.b.b();
                akis akisVar14 = this.a;
                fbbf fbbfVar21 = akisVar14.a.ck;
                errl errlVar5 = (errl) akisVar14.t.b();
                errl errlVar6 = (errl) this.a.aK.b();
                cqoh cqohVar2 = (cqoh) this.a.cz.b();
                akhy akhyVar24 = this.b;
                axdf axdfVar = (axdf) this.a.a.cm.b();
                cbwj cbwjVar = (cbwj) this.a.a.kG.b();
                akis akisVar15 = this.a;
                fbbf fbbfVar22 = akhyVar24.nd;
                fbbf fbbfVar23 = akhyVar24.ne;
                fbbf fbbfVar24 = akhyVar24.nf;
                fbbf fbbfVar25 = akhyVar24.nc;
                fbbf fbbfVar26 = akhyVar24.ns;
                fbbf fbbfVar27 = akhyVar24.nt;
                fbbf fbbfVar28 = akhyVar24.nu;
                fbbf fbbfVar29 = akhyVar24.nv;
                fbbf fbbfVar30 = akhyVar24.na;
                fbbf fbbfVar31 = akhyVar24.nb;
                akkp akkpVar18 = akisVar15.a;
                return new cdnz(gw, eisxVar4, fbbfVar21, errlVar5, errlVar6, cqohVar2, fbbfVar22, fbbfVar23, fbbfVar24, fbbfVar25, fbbfVar26, fbbfVar27, fbbfVar28, fbbfVar29, fbbfVar30, fbbfVar31, axdfVar, cbwjVar, akkpVar18.GF, akkpVar18.cc);
            case 746:
                return new cdrp(this.a.a.cc);
            case 747:
                return new cdrl(this.a.a.cc);
            case 748:
                return new cdrn(this.a.a.cc);
            case 749:
                return new cdrj(this.a.a.cc);
            case 750:
                return new cdlw((crty) this.b.m.b(), (errl) this.a.t.b());
            case 751:
                eisx eisxVar5 = (eisx) this.b.b.b();
                cdmr cdmrVar = (cdmr) this.b.nz.b();
                crty crtyVar2 = (crty) this.b.m.b();
                akhy akhyVar25 = this.b;
                akkp akkpVar19 = this.a.a;
                return new cdoy(eisxVar5, cdmrVar, crtyVar2, akhyVar25.W, akhyVar25.bu, (axkm) akkpVar19.ck.b(), (ccbt) this.b.hF.b(), (axdf) this.a.a.cm.b(), (ccdo) this.a.a.tX.b(), (cqoh) this.a.cz.b(), (akzt) this.a.a.al.b(), (errl) this.a.t.b(), (errl) this.a.p.b(), (errl) this.a.aK.b());
            case 752:
                akhy akhyVar26 = this.b;
                akkp akkpVar20 = this.a.a;
                cdpu cd = akhyVar26.cd();
                dtuu dtuuVar3 = (dtuu) akkpVar20.ay.b();
                akhy akhyVar27 = this.b;
                fbbf fbbfVar32 = akhyVar27.P;
                fbbf fbbfVar33 = akhyVar27.O;
                eisx eisxVar6 = (eisx) akhyVar27.b.b();
                akis akisVar16 = this.a;
                akhy akhyVar28 = this.b;
                akko akkoVar4 = akisVar16.b;
                akkp akkpVar21 = akisVar16.a;
                return new cdnb(cd, dtuuVar3, fbbfVar32, akhyVar27.bu, fbbfVar33, eisxVar6, akkpVar21.gw(), akhyVar28.cg(), akkpVar21.al, akkoVar4.ag(), (errl) akisVar16.t.b(), (errl) this.a.p.b());
            case 753:
                return new cena((crzf) this.b.ni.b(), (dtuu) this.a.a.ay.b(), (ffhd) this.a.co.b(), (ffsk) this.a.a.q.b());
            case 754:
                akis akisVar17 = this.a;
                akhy akhyVar29 = this.b;
                csal kT = akisVar17.a.kT();
                cdvd ci = akhyVar29.ci();
                errl errlVar7 = (errl) akisVar17.t.b();
                errl errlVar8 = (errl) this.a.p.b();
                akhy akhyVar30 = this.b;
                akkp akkpVar22 = this.a.a;
                ccpr by = akhyVar30.by();
                axkm axkmVar3 = (axkm) akkpVar22.ck.b();
                akhy akhyVar31 = this.b;
                fbbf fbbfVar34 = akhyVar31.p;
                cbgf cbgfVar = (cbgf) akhyVar31.O.b();
                dtuu dtuuVar4 = (dtuu) this.a.a.ay.b();
                cgrq cgrqVar2 = (cgrq) this.b.bw.b();
                eisx eisxVar7 = (eisx) this.b.b.b();
                akis akisVar18 = this.a;
                fbbf fbbfVar35 = akisVar18.cz;
                fbbf fbbfVar36 = akisVar18.a.al;
                cqoh cqohVar3 = (cqoh) fbbfVar35.b();
                akhy akhyVar32 = this.b;
                akkp akkpVar23 = this.a.a;
                cefl cv = akhyVar32.cv();
                ashs ashsVar2 = (ashs) akkpVar23.FJ.b();
                asix asixVar2 = (asix) this.a.a.pR.b();
                akhy akhyVar33 = this.b;
                akkp akkpVar24 = this.a.a;
                cdmg bZ = akhyVar33.bZ();
                ashm ashmVar = (ashm) akkpVar24.FO.b();
                akis akisVar19 = this.a;
                akko akkoVar5 = akisVar19.b;
                asik bn = akisVar19.a.bn();
                asji ah = akkoVar5.ah();
                asio asioVar = (asio) akkoVar5.gM.b();
                ccub ccubVar = (ccub) this.b.mS.b();
                akkp akkpVar25 = this.a.a;
                return new ccpg(kT, ci, errlVar7, errlVar8, by, axkmVar3, fbbfVar34, cbgfVar, dtuuVar4, cgrqVar2, eisxVar7, fbbfVar36, cqohVar3, cv, ashsVar2, asixVar2, bZ, ashmVar, bn, ah, asioVar, ccubVar, akkpVar25.bo(), (axdf) akkpVar25.cm.b(), this.a.b.ar());
            case 755:
                ccpg ccpgVar = (ccpg) this.b.nC.b();
                akhy akhyVar34 = this.b;
                return new ccml(ccpgVar, akhyVar34.bp(), (crty) akhyVar34.m.b(), (errl) this.a.t.b(), (errl) this.a.p.b(), (axkm) this.a.a.ck.b(), (asio) this.a.b.gM.b());
            case 756:
                return tcp.a((Context) this.a.q.b(), (chja) this.b.mL.b(), (cgxw) this.b.E.b(), Optional.of(this.b.m161do()), Optional.of(this.b.dl()), Optional.of(this.a.a.hP()), (errl) this.a.p.b());
            case 757:
                return cgxf.a((akhl) this.b.mO.b(), (chkj) this.b.ee.b(), (chln) this.a.a.vc.b());
            case 758:
                return new enpx(this.b.H());
            case 759:
                return Optional.of(this.b.aK());
            case 760:
                Context context2 = (Context) this.a.q.b();
                ffhd ffhdVar = (ffhd) this.a.cP.b();
                akis akisVar20 = this.a;
                eisx eisxVar8 = (eisx) this.b.b.b();
                ejar ejarVar2 = (ejar) this.a.a.au.b();
                akis akisVar21 = this.a;
                akhy akhyVar35 = this.b;
                return new delf(context2, ffhdVar, akisVar20.b.dj, eisxVar8, ejarVar2, akisVar21.cz, akhyVar35.nH, akisVar21.aO);
            case 761:
                akko akkoVar6 = this.a.b;
                return new delm(akkoVar6.hf, akkoVar6.hg);
            case 762:
                akis akisVar22 = this.a;
                akko akkoVar7 = akisVar22.b;
                akkp akkpVar26 = akisVar22.a;
                return new dekv(akkpVar26.p, akkpVar26.al, akkpVar26.bi, akkoVar7.hj);
            case 763:
                return bzhq.a(this.b.nK);
            case 764:
                eisx eisxVar9 = (eisx) this.b.b.b();
                ffsk ffskVar6 = (ffsk) this.a.a.q.b();
                akis akisVar23 = this.a;
                akhy akhyVar36 = this.b;
                akkp akkpVar27 = akisVar23.a;
                return new bzho(eisxVar9, ffskVar6, akkpVar27.as, akhyVar36.np, akkpVar27.C);
            case 765:
                return ajcw.a(this.b.nN);
            case 766:
                return new ajcv((ffsk) this.a.a.q.b(), (eisx) this.b.b.b(), (cjeo) this.b.aG.b(), this.b.y(), (cqoh) this.a.cz.b(), this.b.C());
            case 767:
                return Optional.of((emdw) this.a.b.hm.b());
            case 768:
                return cjxu.a(this.b.nP, this.a.b.gA);
            case 769:
                eisx eisxVar10 = (eisx) this.b.b.b();
                eixo eixoVar = (eixo) this.a.a.as.b();
                ffhd ffhdVar2 = (ffhd) this.a.cP.b();
                ffsk ffskVar7 = (ffsk) this.a.a.p.b();
                akhy akhyVar37 = this.b;
                akis akisVar24 = this.a;
                akkp akkpVar28 = akisVar24.a;
                akko akkoVar8 = akisVar24.b;
                return new cjxt(eisxVar10, eixoVar, ffhdVar2, ffskVar7, akhyVar37.dS(), akkoVar8.hc, akkoVar8.hd, akkpVar28.Tg, akkpVar28.Dy);
            case 770:
                return alnx.a(this.b.nT);
            case 771:
                return new alnw((ffsk) this.a.a.q.b(), (eisx) this.b.b.b(), this.a.a.DT, this.b.nS);
            case 772:
                akhy akhyVar38 = this.b;
                return enip.r(akhyVar38.z(), akhyVar38.L());
            case 773:
                return Optional.of(this.b.y());
            case 774:
                return cjuz.a(this.b.aq);
            case 775:
                return ejiw.a(this.b.nW);
            case 776:
                return new ejiv(akhy.hb(), this.b.fB(), (errl) this.a.t.b());
            case 777:
                return enip.o(this.b.gO());
            case 778:
                return new adtk((Context) this.a.q.b(), (ctbe) this.a.b.hn.b(), (cgag) this.b.oa.b(), (crjx) this.a.a.r.b(), (ejar) this.a.a.au.b());
            case 779:
                return new cgag(this.b.gI(), (errl) this.a.p.b(), this.a.a.cl());
            case 780:
                akis akisVar25 = this.a;
                akhy akhyVar39 = this.b;
                akkp akkpVar29 = akisVar25.a;
                return new ckmm(akkpVar29.bj, akkpVar29.br, akkpVar29.cG, akhyVar39.aF, akisVar25.cT, akkpVar29.c);
            case 781:
                return new akou(this.b.I());
            case 782:
                return dedm.a(Optional.of(fbaz.a(this.b.od)));
            case 783:
                return new dedy((ejtr) this.b.aB.b(), (errl) this.a.t.b(), (cbar) this.a.cB.b(), this.a.cK());
            case 784:
                return aeuh.a(aeuf.a(), this.b.fD(), (efbm) this.a.aM.b());
            case 785:
                return aeug.a(aeue.a(), this.b.fD(), (efbm) this.a.aM.b());
            case 786:
                return new ellq((elbx) this.b.ap.b());
            case 787:
                ffsk ffskVar8 = (ffsk) this.a.a.aq.b();
                akis akisVar26 = this.a;
                akkp akkpVar30 = akisVar26.a;
                fbbf fbbfVar37 = akkpVar30.bj;
                fbbf fbbfVar38 = akkpVar30.Cv;
                dkvu dkvuVar = (dkvu) akisVar26.hl.b();
                asqs asqsVar = (asqs) this.a.a.bo.b();
                ajoz ajozVar = (ajoz) this.b.oj.b();
                akkp akkpVar31 = this.a.a;
                return new cmnk(ffskVar8, fbbfVar37, fbbfVar38, dkvuVar, asqsVar, ajozVar, akkpVar31.wb, akkpVar31.cA());
            case 788:
                akhy akhyVar40 = this.b;
                akis akisVar27 = this.a;
                akkp akkpVar32 = akisVar27.a;
                return new ajoz(akhyVar40.oi, akisVar27.cl(), (csjk) akkpVar32.fQ.b(), (dkvu) this.a.hl.b(), this.a.t);
            case 789:
                return new ajon(this.a.a.cc);
            case 790:
                return new ddwu((elbx) this.b.ap.b());
            case 791:
                return new cmqy(this.b.ap);
            case 792:
                return new baam((crji) this.a.a.ab.b(), this.b.P, (dtuu) this.a.a.ay.b());
            case 793:
                akis akisVar28 = this.a;
                akhy akhyVar41 = this.b;
                fbbf fbbfVar39 = akisVar28.cz;
                akko akkoVar9 = akisVar28.b;
                akkp akkpVar33 = akisVar28.a;
                fbbf fbbfVar40 = akkpVar33.jc;
                fbbf fbbfVar41 = akkoVar9.dW;
                fbbf fbbfVar42 = akkoVar9.l;
                fbbf fbbfVar43 = akkpVar33.fM;
                fbbf fbbfVar44 = akkpVar33.iG;
                cqoh cqohVar4 = (cqoh) fbbfVar39.b();
                akis akisVar29 = this.a;
                akhy akhyVar42 = this.b;
                akkp akkpVar34 = akisVar29.a;
                fbbf fbbfVar45 = akkpVar34.fJ;
                fbbf fbbfVar46 = akhyVar42.x;
                fbbf fbbfVar47 = akhyVar42.ed;
                fazb a2 = fbaz.a(akkpVar34.iN);
                akis akisVar30 = this.a;
                akhy akhyVar43 = this.b;
                akko akkoVar10 = akisVar30.b;
                akkp akkpVar35 = akisVar30.a;
                fbbf fbbfVar48 = akkpVar35.fP;
                fbbf fbbfVar49 = akkpVar35.iW;
                fbbf fbbfVar50 = akkoVar10.D;
                fbbf fbbfVar51 = akhyVar43.an;
                fbbf fbbfVar52 = akkpVar35.dp;
                Context context3 = (Context) akisVar30.q.b();
                akis akisVar31 = this.a;
                akhy akhyVar44 = this.b;
                fbbf fbbfVar53 = akisVar31.ps;
                akkp akkpVar36 = akisVar31.a;
                fbbf fbbfVar54 = akkpVar36.ql;
                fbbf fbbfVar55 = akkpVar36.uP;
                fbbf fbbfVar56 = akkpVar36.fw;
                fbbf fbbfVar57 = akkpVar36.ds;
                fbbf fbbfVar58 = akkpVar36.c;
                fbbf fbbfVar59 = akhyVar44.P;
                fbbf fbbfVar60 = akhyVar44.S;
                fbbf fbbfVar61 = akkpVar36.dl;
                fbbf fbbfVar62 = akkpVar36.Fu;
                errl errlVar9 = (errl) fbbfVar53.b();
                fazb a3 = fbaz.a(this.a.a.gr);
                akis akisVar32 = this.a;
                akhy akhyVar45 = this.b;
                akko akkoVar11 = akisVar32.b;
                akkp akkpVar37 = akisVar32.a;
                fbbf fbbfVar63 = akisVar32.kE;
                fbbf fbbfVar64 = akisVar32.ig;
                fbbf fbbfVar65 = akisVar32.hv;
                fbbf fbbfVar66 = akkpVar37.iX;
                fbbf fbbfVar67 = akhyVar45.gR;
                fbbf fbbfVar68 = akkpVar37.cz;
                fbbf fbbfVar69 = akkpVar37.cq;
                fbbf fbbfVar70 = akkpVar37.wU;
                fbbf fbbfVar71 = akkoVar11.fd;
                fbbf fbbfVar72 = akkpVar37.iK;
                fbbf fbbfVar73 = akkpVar37.fy;
                fbbf fbbfVar74 = akkpVar37.nk;
                fbbf fbbfVar75 = akkpVar37.cp;
                fbbf fbbfVar76 = akkpVar37.kG;
                fbbf fbbfVar77 = akhyVar45.ek;
                fbbf fbbfVar78 = akisVar32.jU;
                fbbf fbbfVar79 = akhyVar45.ju;
                fbbf fbbfVar80 = akkpVar37.cx;
                errm errmVar = (errm) akisVar32.p.b();
                akhy akhyVar46 = this.b;
                errm errmVar2 = (errm) this.a.t.b();
                akis akisVar33 = this.a;
                akkp akkpVar38 = akisVar33.a;
                akko akkoVar12 = akisVar33.b;
                fbbf fbbfVar81 = akkoVar12.fm;
                fbbf fbbfVar82 = akisVar33.dE;
                fbbf fbbfVar83 = akkoVar12.ir;
                cmne cmneVar = (cmne) akkpVar38.Cv.b();
                akis akisVar34 = this.a;
                fbbf fbbfVar84 = akhyVar46.bT;
                fbbf fbbfVar85 = akhyVar46.oy;
                fbbf fbbfVar86 = akhyVar45.ox;
                fbbf fbbfVar87 = akisVar32.cX;
                fbbf fbbfVar88 = akhyVar45.ow;
                fbbf fbbfVar89 = akhyVar45.ov;
                fbbf fbbfVar90 = akhyVar45.ot;
                fbbf fbbfVar91 = akkpVar35.Px;
                fbbf fbbfVar92 = akisVar30.aU;
                fbbf fbbfVar93 = akhyVar41.or;
                fbbf fbbfVar94 = akhyVar41.oq;
                akkp akkpVar39 = akisVar34.a;
                akko akkoVar13 = akisVar34.b;
                akhy akhyVar47 = this.b;
                fbbf fbbfVar95 = akisVar34.aK;
                fbbf fbbfVar96 = akkpVar39.iA;
                fbbf fbbfVar97 = akkoVar13.is;
                fbbf fbbfVar98 = akkoVar13.iw;
                Object dr = akkoVar13.dr();
                fbbf fbbfVar99 = akhyVar47.ap;
                fbbf fbbfVar100 = akkoVar13.iy;
                fbbf fbbfVar101 = akkpVar39.EM;
                fbbf fbbfVar102 = akkpVar39.gJ;
                fbbf fbbfVar103 = akkoVar13.iz;
                fbbf fbbfVar104 = akkpVar39.cG;
                fbbf fbbfVar105 = akkpVar39.jt;
                fbbf fbbfVar106 = akkpVar39.aT;
                fbbf fbbfVar107 = akkoVar13.iD;
                fbbf fbbfVar108 = akkoVar13.iE;
                fbbf fbbfVar109 = akkoVar13.iF;
                fbbf fbbfVar110 = akkoVar13.iG;
                fbbf fbbfVar111 = akkpVar39.Z;
                fbbf fbbfVar112 = akkoVar13.iH;
                fbbf fbbfVar113 = akkoVar13.G;
                errl errlVar10 = (errl) fbbfVar95.b();
                akis akisVar35 = this.a;
                akhy akhyVar48 = this.b;
                akkp akkpVar40 = akisVar35.a;
                akko akkoVar14 = akisVar35.b;
                fbbf fbbfVar114 = akkoVar14.iI;
                fbbf fbbfVar115 = akkpVar40.bj;
                fbbf fbbfVar116 = akkoVar14.iJ;
                fbbf fbbfVar117 = akkoVar14.iK;
                fbbf fbbfVar118 = akhyVar48.iY;
                fbbf fbbfVar119 = akkoVar14.iL;
                akis akisVar36 = this.a;
                akhy akhyVar49 = this.b;
                akkp akkpVar41 = akisVar36.a;
                fbbf fbbfVar120 = akkpVar41.br;
                fbbf fbbfVar121 = akkpVar41.vV;
                akko akkoVar15 = akisVar36.b;
                fbbf fbbfVar122 = akkoVar15.fj;
                fbbf fbbfVar123 = akkpVar41.LM;
                fbbf fbbfVar124 = akkoVar15.iM;
                fbbf fbbfVar125 = akkoVar15.iN;
                fbbf fbbfVar126 = akkoVar15.iR;
                fbbf fbbfVar127 = akkpVar41.kA;
                fbbf fbbfVar128 = akkpVar41.pD;
                fbbf fbbfVar129 = akkoVar15.gw;
                fbbf fbbfVar130 = akkpVar41.Ln;
                fbbf fbbfVar131 = akkpVar41.Ll;
                fbbf fbbfVar132 = akkpVar41.Uo;
                fbbf fbbfVar133 = akkoVar15.iS;
                fbbf fbbfVar134 = akkoVar15.iT;
                fbba a4 = fbbh.a();
                Optional of = Optional.of((bzgw) akkpVar41.cX.b());
                akis akisVar37 = this.a;
                akhy akhyVar50 = this.b;
                akkp akkpVar42 = akisVar37.a;
                fbbf fbbfVar135 = akkpVar42.zO;
                fbbf fbbfVar136 = akkpVar42.Cu;
                fbbf fbbfVar137 = akhyVar50.oN;
                fbbf fbbfVar138 = akkpVar42.mn;
                fbbf fbbfVar139 = akhyVar49.oK;
                fbbf fbbfVar140 = akhyVar49.aE;
                fbbf fbbfVar141 = akhyVar49.oJ;
                fbbf fbbfVar142 = akkpVar41.Pu;
                fbbf fbbfVar143 = akhyVar49.oI;
                fbbf fbbfVar144 = akisVar36.ox;
                fbbf fbbfVar145 = akhyVar49.oH;
                fbbf fbbfVar146 = akkoVar14.dl;
                fbbf fbbfVar147 = akhyVar49.oF;
                fbbf fbbfVar148 = akisVar35.cs;
                fbbf fbbfVar149 = akhyVar48.ok;
                fbbf fbbfVar150 = akisVar35.aR;
                fbbf fbbfVar151 = akhyVar48.oE;
                fbbf fbbfVar152 = akhyVar47.aB;
                fbbf fbbfVar153 = akkpVar39.RF;
                fbbf fbbfVar154 = akkpVar39.Pw;
                fbbf fbbfVar155 = akhyVar47.oA;
                return new dauv(fbbfVar40, fbbfVar94, fbbfVar41, fbbfVar42, fbbfVar93, fbbfVar43, fbbfVar44, cqohVar4, fbbfVar45, fbbfVar46, fbbfVar47, a2, fbbfVar92, fbbfVar48, fbbfVar49, fbbfVar50, fbbfVar91, fbbfVar51, fbbfVar52, context3, fbbfVar54, fbbfVar55, fbbfVar56, fbbfVar57, fbbfVar58, fbbfVar59, fbbfVar60, fbbfVar61, fbbfVar62, errlVar9, a3, fbbfVar63, fbbfVar64, fbbfVar65, fbbfVar90, fbbfVar89, fbbfVar66, fbbfVar67, fbbfVar88, fbbfVar68, fbbfVar69, fbbfVar70, fbbfVar71, fbbfVar72, fbbfVar87, fbbfVar73, fbbfVar86, fbbfVar74, fbbfVar75, fbbfVar76, fbbfVar77, fbbfVar78, fbbfVar79, fbbfVar80, errmVar, fbbfVar85, fbbfVar84, errmVar2, fbbfVar81, fbbfVar82, fbbfVar83, cmneVar, fbbfVar96, fbbfVar97, akhyVar47.oz, fbbfVar98, (dadg) dr, fbbfVar155, fbbfVar99, fbbfVar100, fbbfVar101, fbbfVar102, fbbfVar103, fbbfVar104, fbbfVar105, fbbfVar106, fbbfVar107, fbbfVar154, fbbfVar108, fbbfVar109, fbbfVar153, fbbfVar110, fbbfVar111, fbbfVar152, fbbfVar112, fbbfVar113, errlVar10, fbbfVar114, fbbfVar151, fbbfVar115, fbbfVar116, fbbfVar149, fbbfVar150, fbbfVar117, fbbfVar148, fbbfVar118, fbbfVar119, fbbfVar146, fbbfVar147, fbbfVar120, fbbfVar121, fbbfVar122, fbbfVar145, fbbfVar123, fbbfVar124, fbbfVar125, fbbfVar144, fbbfVar126, fbbfVar127, fbbfVar143, fbbfVar128, fbbfVar129, fbbfVar130, fbbfVar131, fbbfVar132, fbbfVar142, fbbfVar133, fbbfVar134, fbbfVar140, fbbfVar141, a4, fbbfVar139, of, fbbfVar135, fbbfVar136, fbbfVar137, fbbfVar138);
            case 794:
                return new cpem((Context) this.a.q.b(), (ciqn) this.a.a.aN.b(), (cins) this.a.a.jc.b(), (cnmx) this.b.op.b());
            case 795:
                return new ajvm((Context) this.a.q.b(), this.b.oo, this.a.nX);
            case 796:
                return new adza((Context) this.a.q.b(), (crjx) this.a.a.r.b(), fbaz.a(this.b.oa), this.a.cU);
            case 797:
                akhy akhyVar51 = this.b;
                akkp akkpVar43 = this.a.a;
                return new baik(akhyVar51.P, akhyVar51.S, akkpVar43.dp, akkpVar43.f, akkpVar43.ay, akhyVar51.bp);
            case 798:
                return Optional.of(this.b.fw());
            case 799:
                akkp akkpVar44 = this.a.a;
                fbbf fbbfVar156 = akkpVar44.lO;
                ffsk ffskVar9 = (ffsk) akkpVar44.aq.b();
                akhy akhyVar52 = this.b;
                akis akisVar38 = this.a;
                fbbf fbbfVar157 = akisVar38.cP;
                akko akkoVar16 = akisVar38.b;
                akkp akkpVar45 = akisVar38.a;
                cjwz dQ = akhyVar52.dQ();
                fbbf fbbfVar158 = akkpVar45.Dy;
                fbbf fbbfVar159 = akhyVar52.M;
                fbbf fbbfVar160 = akkoVar16.Q;
                ffhd ffhdVar3 = (ffhd) fbbfVar157.b();
                akko akkoVar17 = this.a.b;
                return new cjrb(fbbfVar156, ffskVar9, dQ, fbbfVar158, fbbfVar159, fbbfVar160, ffhdVar3, akkoVar17.R, akkoVar17.S);
            default:
                throw new AssertionError(i);
        }
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final Object b() {
        int i = this.c;
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
            default:
                switch (i) {
                    case 800:
                        akis akisVar = this.a;
                        akhy akhyVar = this.b;
                        akkp akkpVar = akisVar.a;
                        return new cipd(akisVar.q, akkpVar.aM, akkpVar.iG, akkpVar.sY, akkpVar.fr, akkpVar.f, akisVar.cz, akhyVar.an, akhyVar.ou, akisVar.cM, akkpVar.rq, akkpVar.pD, akhyVar.P, akkpVar.rs);
                    case 801:
                        return new cipe((Context) this.a.q.b(), (ayfg) this.b.an.b(), (cnmx) this.b.op.b());
                    case 802:
                        Context context = (Context) this.a.q.b();
                        akhy akhyVar2 = this.b;
                        return new dave(context, akhyVar2.W, akhyVar2.S, (cpdg) this.a.a.ap.b(), (errl) this.a.t.b());
                    case 803:
                        return new dacf((ddzb) this.a.a.nk.b(), (cbeq) this.a.a.fy.b(), (elbx) this.b.ap.b(), (aolr) this.a.a.Z.b(), (errl) this.a.aK.b());
                    case 804:
                        return new daxf((cers) this.b.eu.b());
                    case 805:
                        akhy akhyVar3 = this.b;
                        axkm axkmVar = (axkm) akhyVar3.a.a.ck.b();
                        errl errlVar = (errl) akhyVar3.a.t.b();
                        errl errlVar2 = (errl) akhyVar3.a.p.b();
                        akkp akkpVar2 = akhyVar3.a.a;
                        dazm dazmVar = new dazm(axkmVar, errlVar, errlVar2, akkpVar2.cc, (babf) akkpVar2.pN.b(), (elbx) akhyVar3.ap.b(), (axmm) akhyVar3.a.a.qL.b());
                        dbir dbirVar = (dbir) akhyVar3.a.b.ir.b();
                        akkp akkpVar3 = akhyVar3.a.a;
                        fbbf fbbfVar = akkpVar3.aT;
                        axmm axmmVar = (axmm) akkpVar3.qL.b();
                        ffsk ffskVar = (ffsk) akhyVar3.a.a.q.b();
                        ffhd ffhdVar = (ffhd) akhyVar3.a.cn.b();
                        akis akisVar2 = akhyVar3.a;
                        akkp akkpVar4 = akisVar2.a;
                        akko akkoVar = akisVar2.b;
                        fbbf fbbfVar2 = akkoVar.it;
                        fbbf fbbfVar3 = akkoVar.iu;
                        fbbf fbbfVar4 = akkpVar4.pN;
                        cgwa cgwaVar = (cgwa) akkpVar4.zO.b();
                        akis akisVar3 = akhyVar3.a;
                        akko akkoVar2 = akisVar3.b;
                        akkp akkpVar5 = akisVar3.a;
                        return Optional.of(new dayt(dazmVar, dbirVar, fbbfVar, axmmVar, ffskVar, ffhdVar, fbbfVar2, fbbfVar3, fbbfVar4, cgwaVar, akkpVar5.gE, akkpVar5.gr, akkpVar5.bn(), akhyVar3.ap, akkoVar2.iv, akhyVar3.im, akhyVar3.in, akkpVar5.qK, akhyVar3.f19io));
                    case 806:
                        return Optional.of((aeyq) this.b.iH.b());
                    case 807:
                        akhy akhyVar4 = this.b;
                        cqoh cqohVar = (cqoh) akhyVar4.a.cz.b();
                        dbir dbirVar2 = (dbir) akhyVar4.a.b.ir.b();
                        cfgt cfgtVar = (cfgt) akhyVar4.oD.b();
                        akkp akkpVar6 = akhyVar4.a.a;
                        return Optional.of(new dbnz(cqohVar, dbirVar2, cfgtVar, akkpVar6.OK, (cevh) akkpVar6.cc.b(), (Context) akhyVar4.a.q.b(), (ffsk) akhyVar4.a.a.q.b()));
                    case 808:
                        cqoh cqohVar2 = (cqoh) this.a.cz.b();
                        ceyw ceywVar = (ceyw) this.b.oC.b();
                        cfdt cfdtVar = (cfdt) this.a.a.OL.b();
                        ejoc ejocVar = (ejoc) this.a.dX.b();
                        cexi cexiVar = (cexi) this.a.a.OM.b();
                        akkp akkpVar7 = this.a.a;
                        return new cfgt(cqohVar2, ceywVar, cfdtVar, ejocVar, cexiVar, akkpVar7.C, (ffsk) akkpVar7.q.b(), (ffsk) this.a.a.aq.b());
                    case 809:
                        return new ceyf((ceza) this.a.a.OF.b(), this.b.oB, (cexi) this.a.a.OM.b(), (ffsk) this.a.a.q.b());
                    case 810:
                        cbwj cbwjVar = (cbwj) this.a.a.kG.b();
                        cqoh cqohVar3 = (cqoh) this.a.cz.b();
                        ceww cewwVar = (ceww) this.b.lJ.b();
                        akis akisVar4 = this.a;
                        ejoc ejocVar2 = (ejoc) akisVar4.dX.b();
                        dtuu dtuuVar = (dtuu) this.a.a.ay.b();
                        cfdt cfdtVar2 = (cfdt) this.a.a.OL.b();
                        cetc cetcVar = (cetc) this.a.a.yh.b();
                        akkp akkpVar8 = this.a.a;
                        fbbf fbbfVar5 = akkpVar8.C;
                        ffsk ffskVar2 = (ffsk) akkpVar8.q.b();
                        ffsk ffskVar3 = (ffsk) this.a.a.aq.b();
                        akis akisVar5 = this.a;
                        akkp akkpVar9 = akisVar4.a;
                        fbbf fbbfVar6 = akkpVar9.OI;
                        fbbf fbbfVar7 = akkpVar9.OK;
                        akkp akkpVar10 = akisVar5.a;
                        return new cfdp(cbwjVar, cqohVar3, cewwVar, fbbfVar6, fbbfVar7, ejocVar2, dtuuVar, cfdtVar2, cetcVar, fbbfVar5, ffskVar2, ffskVar3, akkpVar10.bW(), akkpVar10.cN());
                    case 811:
                        return new cjcr((ciwj) this.b.al.b(), this.b.dz());
                    case 812:
                        dbir dbirVar3 = (dbir) this.a.b.ir.b();
                        dhzj dhzjVar = (dhzj) this.a.nI.b();
                        akkp akkpVar11 = this.a.a;
                        comc ka = akkpVar11.ka();
                        cvhr cvhrVar = (cvhr) akkpVar11.No.b();
                        cviz cvizVar = (cviz) this.a.os.b();
                        akhy akhyVar5 = this.b;
                        return new dbne(dbirVar3, dhzjVar, ka, cvhrVar, cvizVar, akhyVar5.oG, (elbx) akhyVar5.ap.b(), (ddwn) this.a.a.Pu.b(), (ffsk) this.a.a.aq.b());
                    case 813:
                        return new deii(this.a.a.cc);
                    case 814:
                        return new cktd((ffsk) this.a.a.q.b(), (alxl) this.b.ao.b(), (cktz) this.a.mZ.b());
                    case 815:
                        return new cnoi((Context) this.a.q.b(), (errl) this.a.p.b(), (ffsk) this.a.a.p.b(), (elbx) this.b.ap.b(), (cnnh) this.a.a.bQ.b(), (ausa) this.a.a.bR.b());
                    case 816:
                        ffsk ffskVar4 = (ffsk) this.a.a.q.b();
                        ffhd ffhdVar2 = (ffhd) this.a.cP.b();
                        csiy csiyVar = (csiy) this.a.aN.b();
                        Context context2 = (Context) this.a.q.b();
                        akzt akztVar = (akzt) this.a.a.C.b();
                        ctvs ctvsVar = (ctvs) this.a.aZ.b();
                        akhy akhyVar6 = this.b;
                        akkp akkpVar12 = this.a.a;
                        fbbf fbbfVar8 = akhyVar6.S;
                        fbbf fbbfVar9 = akhyVar6.P;
                        fbbf fbbfVar10 = akhyVar6.Z;
                        fbbf fbbfVar11 = akhyVar6.W;
                        coxk coxkVar = (coxk) akkpVar12.iN.b();
                        aolr aolrVar = (aolr) this.a.a.Z.b();
                        ayif ayifVar = (ayif) this.b.cn.b();
                        bdtd bdtdVar = (bdtd) this.a.a.aO.b();
                        aqvh aqvhVar = (aqvh) this.b.M.b();
                        dtuu dtuuVar2 = (dtuu) this.a.a.ay.b();
                        akis akisVar6 = this.a;
                        fbbf fbbfVar12 = akisVar6.oN;
                        akkp akkpVar13 = akisVar6.a;
                        return new ckwi(ffskVar4, ffhdVar2, csiyVar, context2, akztVar, ctvsVar, fbbfVar8, fbbfVar9, fbbfVar10, fbbfVar11, coxkVar, aolrVar, ayifVar, bdtdVar, aqvhVar, dtuuVar2, akkpVar13.TO, akkpVar13.TP, (effy) fbbfVar12.b(), (cqoh) this.a.cz.b(), this.a.a.TQ);
                    case 817:
                        ffsk ffskVar5 = (ffsk) this.a.a.p.b();
                        akhy akhyVar7 = this.b;
                        return new ayeg(ffskVar5, akhyVar7.oL, akhyVar7.oM);
                    case 818:
                        ffhd ffhdVar3 = (ffhd) this.a.cP.b();
                        akis akisVar7 = this.a;
                        akhy akhyVar8 = this.b;
                        akkp akkpVar14 = akisVar7.a;
                        return new ayex(ffhdVar3, akisVar7.cz, akkpVar14.HR, akkpVar14.Z, akhyVar8.aC, akkpVar14.HS, akhyVar8.ic, akhyVar8.f2if, akisVar7.cN, akkpVar14.C);
                    case 819:
                        akis akisVar8 = this.a;
                        return new ayei(akisVar8.a.mn, akisVar8.mY, this.b.aC);
                    case 820:
                        akis akisVar9 = this.a;
                        return new vzx(akisVar9.a.C, this.b.am, akisVar9.cI, akisVar9.b.iZ);
                    case 821:
                        return (famj) ((famj) famj.h(new fami(), ekpn.a(this.b.i, (ekpg) this.a.b.jl.b(), (euzy) this.a.a.bx.b(), emux.a))).l((ekpr) this.a.de.b());
                    case 822:
                        return new dqjj(this.a.lm, this.b.jB);
                    case 823:
                        ayfg ayfgVar = (ayfg) this.b.an.b();
                        akkp akkpVar15 = this.a.a;
                        return new dbvq(ayfgVar, akkpVar15.C, akkpVar15.zL);
                    case 824:
                        akhy akhyVar9 = this.b;
                        errl errlVar3 = (errl) akhyVar9.a.p.b();
                        errl errlVar4 = (errl) akhyVar9.a.t.b();
                        bzgd bzgdVar = (bzgd) akhyVar9.ec.b();
                        akis akisVar10 = akhyVar9.a;
                        akkp akkpVar16 = akisVar10.a;
                        return Optional.of(new adsw(errlVar3, errlVar4, bzgdVar, akkpVar16.fb, akkpVar16.as, akkpVar16.cX, akkpVar16.ck, akisVar10.dQ));
                    case 825:
                        ekqx k = ekqy.k();
                        ((ekqr) k).a = "SpatulaZeroDayHomeBannerStore";
                        k.d(cvpd.a);
                        return this.b.fD().a(k.a(), (efbm) this.a.aM.b());
                    case 826:
                        return new abar((alxl) this.b.ao.b());
                    case 827:
                        akhy akhyVar10 = this.b;
                        return dozk.a(enhk.n(new dozp("audio"), (dozo) akhyVar10.oX.b(), new dozp("image"), (dozo) akhyVar10.oX.b(), new dozp("video"), (dozo) akhyVar10.oX.b()));
                    case 828:
                        return new drpd((drpz) this.a.b.kA.b(), (ernh) this.a.lm.b(), this.b.oW, this.a.b.ky);
                    case 829:
                        dqhs dqhsVar = (dqhs) this.a.b.kw.b();
                        akhy akhyVar11 = this.b;
                        return new dqgo(dqhsVar, new dqgw((ffsk) akhyVar11.a.a.q.b(), (dqkk) akhyVar11.jB.b()));
                    case 830:
                        return new cxmc((csmj) this.a.b.le.b(), (cuxz) this.a.kf.b(), (elbx) this.b.ap.b());
                    case 831:
                        return new elew((elbx) this.b.ap.b());
                    case 832:
                        Context context3 = (Context) this.a.q.b();
                        ffsk ffskVar6 = (ffsk) this.a.a.p.b();
                        akis akisVar11 = this.a;
                        akhy akhyVar12 = this.b;
                        fbbf fbbfVar13 = akisVar11.a.Tg;
                        fbbf fbbfVar14 = akhyVar12.M;
                        Optional of = Optional.of(akhyVar12.gb);
                        akhy akhyVar13 = this.b;
                        return new dejl(context3, ffskVar6, fbbfVar13, fbbfVar14, akhyVar12.aE, of, akhyVar13.nJ, this.a.b.R, akhyVar13.iY, (Optional) akhyVar13.pb.b(), this.a.a.Dy);
                    case 833:
                        return Optional.of(this.b.F());
                    case 834:
                        return new wda(new ckzm(this.b.a.a.cc), (errl) this.a.p.b(), this.a.a.wL, this.b.aF);
                    case 835:
                        return new ctsz(fbaz.a(this.b.gf), (errl) this.a.p.b());
                    case 836:
                        ffsk ffskVar7 = (ffsk) this.a.a.q.b();
                        ffsk ffskVar8 = (ffsk) this.a.a.p.b();
                        akhy akhyVar14 = this.b;
                        return new amxk(ffskVar7, ffskVar8, akhyVar14.T(), akhyVar14.aM, akhyVar14.hv, akhyVar14.cX);
                    case 837:
                        ffsk ffskVar9 = (ffsk) this.a.a.p.b();
                        ffsk ffskVar10 = (ffsk) this.a.a.aq.b();
                        Context context4 = (Context) this.a.q.b();
                        akhy akhyVar15 = this.b;
                        return new amqw(ffskVar9, ffskVar10, context4, akhyVar15.Q(), (amhs) akhyVar15.aM.b(), (amrw) this.a.iA.b());
                    case 838:
                        akhy akhyVar16 = this.b;
                        ewpm ewpmVar = (ewpm) ((ewpm) ewpm.h(new ewpl(), ekpn.a(akhyVar16.i, (ekpg) akhyVar16.a.b.nx.b(), (euzy) akhyVar16.a.a.bx.b(), emux.a))).l((ekpr) akhyVar16.a.de.b());
                        akis akisVar12 = this.a;
                        akkp akkpVar17 = akisVar12.a;
                        fbbf fbbfVar15 = akisVar12.b.gr;
                        chhs chhsVar = (chhs) akkpVar17.aW.b();
                        ekqb ekqbVar = (ekqb) this.b.l.b();
                        fbbfVar15.getClass();
                        chhsVar.getClass();
                        ekqbVar.getClass();
                        ewpm ewpmVar2 = ((Boolean) fbbfVar15.b()).booleanValue() ? (ewpm) ewpmVar.m(evgq.b, 8721) : (ewpm) ewpmVar.k(chhsVar.g(10));
                        fdxi fdxiVar = evcy.a;
                        evby evbyVar = new evby();
                        evbyVar.b(new enpx("https://www.googleapis.com/auth/myphonenumbers"));
                        return (ewpm) ewpmVar2.m(fdxiVar, new evce(evbyVar.c()));
                    case 839:
                        akhy akhyVar17 = this.b;
                        enhk m = enhk.m(ckas.RCS, akhyVar17.a.a.EW, ckas.BOT_INFO, akhyVar17.pi);
                        akis akisVar13 = this.a;
                        akko akkoVar3 = akisVar13.b;
                        return new ckar(m, akisVar13.a.cG, akkoVar3.nz, akkoVar3.nA, akkoVar3.nB);
                    case 840:
                        akhy akhyVar18 = this.b;
                        akkp akkpVar18 = this.a.a;
                        return new colf(akhyVar18.eE, akkpVar18.G, (crgh) akkpVar18.cG.b(), (avjf) this.a.a.eT.b(), (ffsk) this.a.a.q.b());
                    default:
                        throw new AssertionError(i);
                }
        }
    }
}
