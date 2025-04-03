package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.VmtTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.dtro;
import j$.util.Objects;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bgmp extends dtro {
    public String A;
    public fjay H;
    public String[] J;
    public String[] K;
    public String[] L;
    public String[] M;
    public String N;
    public String[] O;
    public MessageIdType P;
    public String[] Q;
    public Uri[] R;
    public String[] S;
    public Uri[] T;
    public Uri[] U;
    public int[] V;
    public int[] W;
    public long X;
    public Uri Y;
    public long[] Z;
    public long[] aA;
    public byte[][] aB;
    public byte[][] aC;
    public boolean[] aD;
    public boolean aE;
    public long aF;
    public String aG;
    public byza[] aH;
    public dteh aI;
    public byzo aJ;
    public awap aK;
    public byzh aL;
    public byyz aM;
    public boolean aN;
    public long[] aO;
    public PartsTable.BindData[] aP;
    public String aQ;
    public String aR;
    public String aS;
    public String aT;
    public String aU;
    public Uri aV;
    public long aW;
    public String aX;
    public int aY;
    public int aZ;
    public byzc aa;
    public byyu[] ab;
    public ConversationIdType ac;
    public byyp ad;
    public byyp ae;
    public long af;
    public double ag;
    public double ah;
    public Uri[] ai;
    public String aj;
    public Uri[] ak;
    public int[] al;
    public int[] am;
    public String[] an;
    public String[] ao;
    public String ap;
    public byte[] aq;
    public byte[] ar;
    public boolean[] as;
    public long[] at;
    public String[] au;
    public String[] av;
    public long[] aw;
    public String[] ax;
    public String ay;
    public boolean[] az;
    public int[] bA;
    public int[] bB;
    public long[] bC;
    public ParticipantsTable.BindData[] bD;
    public MessageIdType bE;
    public String bF;
    public long bG;
    public String bH;
    public String bI;
    public String bJ;
    public String bK;
    public String bL;
    public boolean bM;
    public boolean bN;
    public bton bO;
    public String bP;
    public String bQ;
    public Uri bR;
    public byul bS;
    public String bT;
    public int bU;
    public boolean bV;
    public String bW;
    public String bX;
    public boolean bY;
    public Optional bZ;
    public int ba;
    public boolean bb;
    public int bc;
    public boolean bd;
    public byzi be;
    public long bf;
    public cjwi bg;
    public cjwi bh;
    public ParticipantsTable.BindData bi;
    public String bj;
    public MessageIdType bk;
    public long[] bl;
    public long[] bm;
    public long[] bn;
    public Optional[] bo;
    public long[] bp;
    public bwuo[] bq;
    public String br;
    public MessageIdType bs;
    public long[] bt;
    public long[] bu;
    public long[] bv;
    public bysc[] bw;
    public String[] bx;
    public int[] by;
    public int[] bz;
    public String c;
    public String cA;
    public long cB;
    public String cC;
    public String cD;
    public boolean cE;
    public bton cF;
    public String cG;
    public String cH;
    public MessagesTable.BindData cI;
    public cmrf ca;
    public String cb;
    public MessageIdType cc;
    public cjia cd;
    public String[] ce;
    public ardn[] cf;
    public String[] cg;
    public String[] ch;
    public long[] ci;
    public VmtTable.BindData[] cj;
    public MessageIdType ck;
    public long cl;
    public MessagesTable.BindData cm;
    public String cn;
    public int co;
    public String cp;
    public String cq;
    public String cr;
    public String cs;
    public ParticipantsTable.BindData ct;
    public String cu;
    public Uri cv;
    public String cw;
    public String cx;
    public long cy;
    public PartsTable.BindData cz;
    public Uri k;
    public String n;
    public String q;
    public String s;
    public String z;
    public MessageIdType a = bdhb.a;
    public ConversationIdType b = bdgq.a;
    public long d = 0;
    public long e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;
    public boolean i = false;
    public boolean j = false;
    public int l = 0;
    public long m = 0;
    public long o = 0;
    public long p = 0;
    public int r = 0;
    public bdhg t = bdhg.a;
    public int u = 0;
    public byzi v = byzi.VERIFICATION_NA;
    public boolean w = false;
    public long x = -1;
    public int y = -1;
    public String B = "";
    public long C = 0;
    public bdhg D = bdhg.a;
    public int E = -2;
    public csgg F = csgg.UNKNOWN;
    public byyw G = byyw.UNKNOWN;
    public byzl I = byzl.UNKNOWN;

    protected bgmp() {
        MessageIdType messageIdType = bdhb.a;
        this.P = messageIdType;
        this.aa = byzc.SUCCEEDED;
        this.ac = bdgq.a;
        this.ad = new byyp(-1);
        this.ae = new byyp(-1);
        this.af = -1L;
        this.ag = eobe.a;
        this.ah = eobe.a;
        this.aE = false;
        this.aJ = byzo.UNKNOWN;
        this.aK = null;
        this.aL = byzh.NONE;
        this.aM = byyz.DEFAULT_NO_VERDICT;
        this.aN = false;
        this.aW = -1L;
        this.aY = -1;
        this.aZ = 0;
        this.ba = 0;
        this.bb = false;
        this.bc = 0;
        this.bd = false;
        this.be = byzi.VERIFICATION_NA;
        this.bf = -1L;
        cjwi cjwiVar = cjwi.PROFILE_CONTACT_SOURCE;
        this.bg = cjwiVar;
        this.bh = cjwiVar;
        this.bk = messageIdType;
        this.bs = messageIdType;
        this.bE = messageIdType;
        this.bG = 0L;
        this.bM = false;
        this.bN = false;
        this.bU = 0;
        this.bV = false;
        this.bY = true;
        this.bZ = bdhe.b(-1L);
        MessageIdType messageIdType2 = bdhb.a;
        this.cc = messageIdType2;
        this.ck = messageIdType2;
        this.cl = 0L;
        this.co = -2;
        this.cB = 0L;
        this.cE = false;
    }

    private final long[] l() {
        az(113, "participant_id");
        return this.bl;
    }

    private final long[] m() {
        az(120, "user_ref_id");
        return this.bt;
    }

    private final String[] n() {
        az(40, "_id");
        return this.O;
    }

    private final String[] o() {
        az(123, "normalized_destination");
        return this.bx;
    }

    private final String[] q() {
        az(153, "part_id");
        return this.ce;
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        String valueOf5 = String.valueOf(this.e);
        String valueOf6 = String.valueOf(this.f);
        String valueOf7 = String.valueOf(this.g);
        String valueOf8 = String.valueOf(this.h);
        String valueOf9 = String.valueOf(this.i);
        String valueOf10 = String.valueOf(this.j);
        String valueOf11 = String.valueOf(this.k);
        String valueOf12 = String.valueOf(this.l);
        String valueOf13 = String.valueOf(this.m);
        String valueOf14 = String.valueOf(this.n);
        String valueOf15 = String.valueOf(this.o);
        String valueOf16 = String.valueOf(this.p);
        String valueOf17 = String.valueOf(this.q);
        String valueOf18 = String.valueOf(this.r);
        String valueOf19 = String.valueOf(this.s);
        String valueOf20 = String.valueOf(this.t);
        String valueOf21 = String.valueOf(this.u);
        String valueOf22 = String.valueOf(this.v);
        String valueOf23 = String.valueOf(this.w);
        String valueOf24 = String.valueOf(this.x);
        String valueOf25 = String.valueOf(this.y);
        String valueOf26 = String.valueOf(this.z);
        String valueOf27 = String.valueOf(this.A);
        String valueOf28 = String.valueOf(this.B);
        String valueOf29 = String.valueOf(this.C);
        String valueOf30 = String.valueOf(this.D);
        String valueOf31 = String.valueOf(this.E);
        String valueOf32 = String.valueOf(this.F);
        String valueOf33 = String.valueOf(this.G);
        String valueOf34 = String.valueOf(this.H);
        String valueOf35 = String.valueOf(this.I);
        String aL = aL(this.O);
        String valueOf36 = String.valueOf(this.P);
        String aL2 = aL(this.Q);
        String aK = aK(this.R);
        String aL3 = aL(this.S);
        String aK2 = aK(this.T);
        String aK3 = aK(this.U);
        String aI = aI(this.V);
        String aI2 = aI(this.W);
        String valueOf37 = String.valueOf(this.X);
        String valueOf38 = String.valueOf(this.Y);
        String aJ = aJ(this.Z);
        String valueOf39 = String.valueOf(this.aa);
        String aK4 = aK(this.ab);
        String valueOf40 = String.valueOf(this.ac);
        String valueOf41 = String.valueOf(this.ad);
        String valueOf42 = String.valueOf(this.ae);
        String valueOf43 = String.valueOf(this.af);
        String valueOf44 = String.valueOf(this.ag);
        String valueOf45 = String.valueOf(this.ah);
        String aK5 = aK(this.ai);
        String valueOf46 = String.valueOf(this.aj);
        String aK6 = aK(this.ak);
        String aI3 = aI(this.al);
        String aI4 = aI(this.am);
        String aL4 = aL(this.an);
        String valueOf47 = String.valueOf(this.ap);
        byte[] bArr = this.aq;
        String concat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
        byte[] bArr2 = this.ar;
        return String.format(locale, "ConversationMessagesOptimizedQuery [messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_sender_id: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_message_report_status: %s,\n  messages.messages_seen: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_message_uri: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_sms_message_size: %s,\n  messages.messages_mms_subject: %s,\n  messages.messages_mms_expiry: %s,\n  messages.messages_rcs_expiry: %s,\n  messages.messages_mms_retrieve_text: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_self_id: %s,\n  messages.messages_rcs_message_id_with_text_type: %s,\n  messages.messages_etouffee_status: %s,\n  messages.messages_verification_status: %s,\n  messages.messages_is_hidden: %s,\n  messages.messages_rcs_file_transfer_session_id: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  messages.messages_cms_id: %s,\n  messages.messages_web_id: %s,\n  messages.messages_usage_stats_logging_id: %s,\n  messages.messages_original_rcs_message_id: %s,\n  messages.messages_result_code: %s,\n  messages.messages_cms_life_cycle: %s,\n  messages.messages_fallback_reason: %s,\n  messages.messages_trace_id: %s,\n  messages.messages_xms_transport: %s,\n  null.user_ref_display_name: %s,\n  null.user_ref_profile_photo_uri: %s,\n  null.user_ref_full_name: %s,\n  null.user_ref_lookup_key: %s,\n  null.parts_count: %s,\n  parts.parts__id: %s,\n  parts.parts_message_id: %s,\n  parts.parts_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_original_uri: %s,\n  parts.parts_storage_uri: %s,\n  parts.parts_width: %s,\n  parts.parts_height: %s,\n  parts.parts_timestamp: %s,\n  parts.parts_output_uri: %s,\n  parts.parts_target_size: %s,\n  parts.parts_processing_status: %s,\n  parts.parts_cms_attachment_processing_status: %s,\n  parts.parts_conversation_id: %s,\n  parts.parts_sticker_set_id: %s,\n  parts.parts_sticker_id: %s,\n  parts.parts_media_modified_timestamp: %s,\n  parts.parts_longitude: %s,\n  parts.parts_latitude: %s,\n  parts.parts_preview_content_uri: %s,\n  parts.parts_preview_content_type: %s,\n  parts.parts_fallback_uri: %s,\n  parts.parts_source: %s,\n  parts.parts_bundle_index: %s,\n  parts.parts_blob_id: %s,\n  parts.parts_blob_gaia_email: %s,\n  parts.parts_cms_full_size_blob_id: %s,\n  parts.parts_cms_media_encryption_key: %s,\n  parts.parts_cms_compressed_media_encryption_key: %s,\n  parts.parts_blob_upload_permanent_failure: %s,\n  parts.parts_blob_upload_timestamp: %s,\n  parts.parts_expressive_sticker_name: %s,\n  parts.parts_file_name: %s,\n  parts.parts_duration: %s,\n  parts.parts_compressed_blob_id: %s,\n  parts.parts_cms_compressed_blob_id: %s,\n  parts.parts_compressed_blob_upload_permanent_failure: %s,\n  parts.parts_compressed_blob_upload_timestamp: %s,\n  parts.parts_media_encryption_key: %s,\n  parts.parts_compressed_media_encryption_key: %s,\n  parts.parts_missing_entry_in_telephony: %s,\n  parts.parts_awaiting_reverse_sync: %s,\n  parts.parts_file_size_bytes: %s,\n  parts.parts_local_cache_path: %s,\n  parts.parts_media_send_type: %s,\n  parts.parts_voice_metadata: %s,\n  parts.parts_validation_status: %s,\n  parts.parts_processing_id: %s,\n  parts.parts_rich_card_media_download_failure_reason: %s,\n  parts.parts_image_display_state: %s,\n  parts.parts_preserve_size: %s,\n  parts.parts_rowid: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_send_destination: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  participants.participants_profile_photo_uri: %s,\n  participants.participants_contact_id: %s,\n  participants.participants_lookup_key: %s,\n  participants.participants_color_palette_index: %s,\n  participants.participants_color_type: %s,\n  participants.participants_extended_color: %s,\n  participants.participants_blocked: %s,\n  participants.participants_participant_type: %s,\n  participants.participants_is_spam: %s,\n  participants.participants_latest_verification_status: %s,\n  participants.participants_directory_id: %s,\n  participants.participants_name_source: %s,\n  participants.participants_photo_source: %s,\n  read_reports.read_reports__id: %s,\n  read_reports.read_reports_message_id: %s,\n  read_reports.read_reports_participant_id: %s,\n  read_reports.read_reports_receive_time: %s,\n  read_reports.read_reports_read_time: %s,\n  read_reports.read_reports_ftd_time: %s,\n  read_reports.read_reports_rowid: %s,\n  user_references.user_references__id: %s,\n  user_references.user_references_message_id: %s,\n  user_references.user_references_user_ref_id: %s,\n  user_references.user_references_user_ref_datetime: %s,\n  user_references.user_references_rowid: %s,\n  user_ref_participant.user_ref_participant_normalized_destination: %s,\n  user_ref_participant.user_ref_participant_color_palette_index: %s,\n  user_ref_participant.user_ref_participant_color_type: %s,\n  user_ref_participant.user_ref_participant_extended_color: %s,\n  user_ref_participant.user_ref_participant_participant_type: %s,\n  user_ref_participant.user_ref_participant_rowid: %s,\n  link_preview.link_preview_message_id: %s,\n  link_preview.link_preview_trigger_url: %s,\n  link_preview.link_preview_expiration_time_millis: %s,\n  link_preview.link_preview_link_title: %s,\n  link_preview.link_preview_link_description: %s,\n  link_preview.link_preview_link_image_url: %s,\n  link_preview.link_preview_link_domain: %s,\n  link_preview.link_preview_link_canonical_url: %s,\n  link_preview.link_preview_link_preview_prevented: %s,\n  link_preview.link_preview_link_preview_failed: %s,\n  verified_sms_brands.verified_sms_brands_name: %s,\n  verified_sms_brands.verified_sms_brands_description: %s,\n  verified_sms_brands.verified_sms_brands_logo_uri: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_rcs_group_id: %s,\n  conversations.conversations_rcs_conference_uri: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_recipient_offline_timestamp_ms: %s,\n  message_reactions.message_reactions_reactions_data: %s,\n  file_transfer.file_transfer_transfer_id: %s,\n  message_star.message_star_message_id: %s,\n  message_photos_sharing.message_photos_sharing_sharing_state: %s,\n  vmt.vmt_part_id: %s,\n  vmt.vmt_vmt_status: %s,\n  vmt.vmt_text: %s,\n  vmt.vmt_locale: %s,\n  vmt.vmt_rowid: %s,\n  replied_to_message.replied_to_message__id: %s,\n  replied_to_message.replied_to_message_received_timestamp: %s,\n  replied_to_participant.replied_to_participant__id: %s,\n  replied_to_participant.replied_to_participant_sub_id: %s,\n  replied_to_participant.replied_to_participant_normalized_destination: %s,\n  replied_to_participant.replied_to_participant_display_destination: %s,\n  replied_to_participant.replied_to_participant_full_name: %s,\n  replied_to_participant.replied_to_participant_first_name: %s,\n  replied_to_message_part.replied_to_message_part_text: %s,\n  replied_to_message_part.replied_to_message_part_uri: %s,\n  replied_to_message_part.replied_to_message_part_content_type: %s,\n  replied_to_message_part.replied_to_message_part_file_name: %s,\n  replied_to_message_part.replied_to_message_part_duration: %s,\n  replied_to_message_link_preview.replied_to_message_link_preview_trigger_url: %s,\n  replied_to_message_link_preview.replied_to_message_link_preview_expiration_time_millis: %s,\n  replied_to_message_link_preview.replied_to_message_link_preview_link_title: %s,\n  replied_to_message_link_preview.replied_to_message_link_preview_link_image_url: %s,\n  replied_to_message_link_preview.replied_to_message_link_preview_link_preview_failed: %s,\n  profiles_table.profiles_table_display_name: %s,\n  message_captions.message_captions_caption: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, "REDACTED", "REDACTED", "REDACTED", "REDACTED", "REDACTED", aL, valueOf36, aL2, aK, aL3, aK2, aK3, aI, aI2, valueOf37, valueOf38, aJ, valueOf39, aK4, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, aK5, valueOf46, aK6, aI3, aI4, aL4, "REDACTED", valueOf47, concat, "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL")), aM(this.as), aJ(this.at), aL(this.au), aL(this.av), aJ(this.aw), aL(this.ax), String.valueOf(this.ay), aM(this.az), aJ(this.aA), aK(this.aB), aK(this.aC), aM(this.aD), String.valueOf(this.aE), String.valueOf(this.aF), String.valueOf(this.aG), aK(this.aH), String.valueOf(this.aI), String.valueOf(this.aJ), String.valueOf(this.aK), String.valueOf(this.aL), String.valueOf(this.aM), String.valueOf(this.aN), aJ(this.aO), String.valueOf(this.aQ), String.valueOf(this.aR), String.valueOf(this.aS), String.valueOf(this.aT), String.valueOf(this.aU), String.valueOf(this.aV), String.valueOf(this.aW), String.valueOf(this.aX), String.valueOf(this.aY), String.valueOf(this.aZ), String.valueOf(this.ba), String.valueOf(this.bb), String.valueOf(this.bc), String.valueOf(this.bd), String.valueOf(this.be), String.valueOf(this.bf), String.valueOf(this.bg), String.valueOf(this.bh), String.valueOf(this.bj), String.valueOf(this.bk), aJ(this.bl), aJ(this.bm), aJ(this.bn), aK(this.bo), aJ(this.bp), String.valueOf(this.br), String.valueOf(this.bs), aJ(this.bt), aJ(this.bu), aJ(this.bv), aL(this.bx), aI(this.by), aI(this.bz), aI(this.bA), aI(this.bB), aJ(this.bC), String.valueOf(this.bE), String.valueOf(this.bF), String.valueOf(this.bG), String.valueOf(this.bH), String.valueOf(this.bI), String.valueOf(this.bJ), String.valueOf(this.bK), String.valueOf(this.bL), String.valueOf(this.bM), String.valueOf(this.bN), String.valueOf(this.bP), String.valueOf(this.bQ), String.valueOf(this.bR), String.valueOf(this.bT), String.valueOf(this.bU), String.valueOf(this.bV), String.valueOf(this.bW), String.valueOf(this.bX), String.valueOf(this.bY), String.valueOf(this.bZ), String.valueOf(this.ca), String.valueOf(this.cb), String.valueOf(this.cc), String.valueOf(this.cd), aL(this.ce), aK(this.cf), aL(this.cg), aL(this.ch), aJ(this.ci), String.valueOf(this.ck), String.valueOf(this.cl), String.valueOf(this.cn), String.valueOf(this.co), String.valueOf(this.cp), String.valueOf(this.cq), String.valueOf(this.cr), String.valueOf(this.cs), String.valueOf(this.cu), String.valueOf(this.cv), String.valueOf(this.cw), String.valueOf(this.cx), String.valueOf(this.cy), String.valueOf(this.cA), String.valueOf(this.cB), String.valueOf(this.cC), String.valueOf(this.cD), String.valueOf(this.cE), String.valueOf(this.cG), String.valueOf(this.cH));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        bige.c().intValue();
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        dteh dtehVar;
        bifv bifvVar = (bifv) ((bifu) dtsuVar);
        aB();
        this.cL = bifvVar.cU();
        if (bifvVar.di(0)) {
            this.a = bifvVar.g();
            fY(0);
        }
        if (bifvVar.di(1)) {
            this.b = bifvVar.W();
            fY(1);
        }
        if (bifvVar.di(2)) {
            this.c = bifvVar.m();
            fY(2);
        }
        if (bifvVar.di(3)) {
            this.d = bifvVar.O();
            fY(3);
        }
        if (bifvVar.di(4)) {
            this.e = bifvVar.e();
            fY(4);
        }
        if (bifvVar.di(5)) {
            this.f = bifvVar.c();
            fY(5);
        }
        if (bifvVar.di(6)) {
            this.g = bifvVar.d();
            fY(6);
        }
        if (bifvVar.di(7)) {
            this.h = bifvVar.v();
            fY(7);
        }
        if (bifvVar.di(8)) {
            this.i = bifvVar.bn();
            fY(8);
        }
        if (bifvVar.di(9)) {
            this.j = bifvVar.bq();
            fY(9);
        }
        if (bifvVar.di(10)) {
            this.k = bifvVar.T();
            fY(10);
        }
        if (bifvVar.di(11)) {
            this.l = bifvVar.B();
            fY(11);
        }
        if (bifvVar.di(12)) {
            this.m = bifvVar.P();
            fY(12);
        }
        if (bifvVar.di(13)) {
            this.n = bifvVar.aR();
            fY(13);
        }
        if (bifvVar.di(14)) {
            this.o = bifvVar.K();
            fY(14);
        }
        if (bifvVar.di(15)) {
            this.p = bifvVar.L();
            fY(15);
        }
        if (bifvVar.di(16)) {
            this.q = bifvVar.aQ();
            fY(16);
        }
        if (bifvVar.di(17)) {
            this.r = bifvVar.x();
            fY(17);
        }
        if (bifvVar.di(18)) {
            this.s = bifvVar.l();
            fY(18);
        }
        if (bifvVar.di(19)) {
            this.t = bifvVar.ad();
            fY(19);
        }
        if (bifvVar.di(20)) {
            this.u = bifvVar.y();
            fY(20);
        }
        if (bifvVar.di(21)) {
            this.v = bifvVar.j();
            fY(21);
        }
        if (bifvVar.di(22)) {
            this.w = bifvVar.n();
            fY(22);
        }
        if (bifvVar.di(23)) {
            this.x = bifvVar.M();
            fY(23);
        }
        if (bifvVar.di(24)) {
            this.y = bifvVar.A();
            fY(24);
        }
        if (bifvVar.di(25)) {
            this.z = bifvVar.bb();
            fY(25);
        }
        if (bifvVar.di(26)) {
            this.A = bifvVar.at();
            fY(26);
        }
        if (bifvVar.di(27)) {
            this.B = bifvVar.getString(bifvVar.cM(27, bige.a));
            fY(27);
        }
        if (bifvVar.di(28)) {
            this.C = bifvVar.getLong(bifvVar.cM(28, bige.a));
            fY(28);
        }
        if (bifvVar.di(29)) {
            this.D = bifvVar.ac();
            fY(29);
        }
        if (bifvVar.di(30)) {
            this.E = bifvVar.z();
            fY(30);
        }
        if (bifvVar.di(31)) {
            this.F = bifvVar.ao();
            fY(31);
        }
        if (bifvVar.di(32)) {
            this.G = bifvVar.ag();
            fY(32);
        }
        if (bifvVar.di(33)) {
            this.H = bifvVar.bf();
            fY(33);
        }
        if (bifvVar.di(34)) {
            byzl[] values = byzl.values();
            int i = bifvVar.getInt(bifvVar.cM(34, bige.a));
            if (i >= values.length) {
                throw new IllegalArgumentException();
            }
            this.I = values[i];
            fY(34);
        }
        if (bifvVar.di(35)) {
            this.J = bifvVar.cg();
            fY(35);
        }
        if (bifvVar.di(36)) {
            this.K = bifvVar.cj();
            fY(36);
        }
        if (bifvVar.di(37)) {
            this.L = bifvVar.ch();
            fY(37);
        }
        if (bifvVar.di(38)) {
            this.M = bifvVar.ci();
            fY(38);
        }
        if (bifvVar.di(39)) {
            this.N = bifvVar.aW();
            fY(39);
        }
        if (bifvVar.di(40)) {
            this.O = bifvVar.o();
            fY(40);
        }
        if (bifvVar.di(41)) {
            this.P = bifvVar.Z();
            fY(41);
        }
        if (bifvVar.di(42)) {
            this.Q = bifvVar.ce();
            fY(42);
        }
        if (bifvVar.di(43)) {
            this.R = bifvVar.bQ();
            fY(43);
        }
        if (bifvVar.di(44)) {
            this.S = bifvVar.bY();
            fY(44);
        }
        if (bifvVar.di(45)) {
            this.T = bifvVar.bN();
            fY(45);
        }
        if (bifvVar.di(46)) {
            this.U = bifvVar.bP();
            fY(46);
        }
        if (bifvVar.di(47)) {
            this.V = dtub.z(bifv.ds(bifvVar.getString(92)), bifv.dr(bifvVar.getString(bifvVar.cM(47, bige.a))));
            fY(47);
        }
        if (bifvVar.di(48)) {
            this.W = bifvVar.bx();
            fY(48);
        }
        if (bifvVar.di(49)) {
            this.X = bifvVar.f();
            fY(49);
        }
        if (bifvVar.di(50)) {
            this.Y = bifvVar.R();
            fY(50);
        }
        if (bifvVar.di(51)) {
            this.Z = bifvVar.bJ();
            fY(51);
        }
        if (bifvVar.di(52)) {
            this.aa = bifvVar.ai();
            fY(52);
        }
        if (bifvVar.di(53)) {
            this.ab = bifvVar.bS();
            fY(53);
        }
        if (bifvVar.di(54)) {
            this.ac = bifvVar.X();
            fY(54);
        }
        if (bifvVar.di(55)) {
            this.ad = bifvVar.af();
            fY(55);
        }
        if (bifvVar.di(56)) {
            this.ae = bifvVar.ae();
            fY(56);
        }
        if (bifvVar.di(57)) {
            this.af = bifvVar.J();
            fY(57);
        }
        if (bifvVar.di(58)) {
            this.ag = bifvVar.q();
            fY(58);
        }
        if (bifvVar.di(59)) {
            this.ah = bifvVar.p();
            fY(59);
        }
        if (bifvVar.di(60)) {
            this.ai = bifvVar.bO();
            fY(60);
        }
        if (bifvVar.di(61)) {
            this.aj = bifvVar.aX();
            fY(61);
        }
        if (bifvVar.di(62)) {
            this.ak = bifvVar.bM();
            fY(62);
        }
        if (bifvVar.di(63)) {
            this.al = bifvVar.bz();
            fY(63);
        }
        if (bifvVar.di(64)) {
            this.am = bifvVar.bt();
            fY(64);
        }
        if (bifvVar.di(65)) {
            this.an = bifvVar.bW();
            fY(65);
        }
        if (bifvVar.di(66)) {
            this.ao = bifvVar.bV();
            fY(66);
        }
        if (bifvVar.di(67)) {
            this.ap = bifvVar.as();
            fY(67);
        }
        if (bifvVar.di(68)) {
            this.aq = bifvVar.bs();
            fY(68);
        }
        if (bifvVar.di(69)) {
            this.ar = bifvVar.br();
            fY(69);
        }
        if (bifvVar.di(70)) {
            this.as = bifvVar.ck();
            fY(70);
        }
        if (bifvVar.di(71)) {
            this.at = bifvVar.bA();
            fY(71);
        }
        if (bifvVar.di(72)) {
            this.au = bifvVar.bZ();
            fY(72);
        }
        if (bifvVar.di(73)) {
            this.av = bifvVar.ca();
            fY(73);
        }
        if (bifvVar.di(74)) {
            this.aw = bifvVar.bC();
            fY(74);
        }
        if (bifvVar.di(75)) {
            this.ax = bifvVar.bX();
            fY(75);
        }
        if (bifvVar.di(76)) {
            this.ay = bifvVar.ar();
            fY(76);
        }
        if (bifvVar.di(77)) {
            this.az = bifvVar.cl();
            fY(77);
        }
        if (bifvVar.di(78)) {
            this.aA = bifvVar.bB();
            fY(78);
        }
        if (bifvVar.di(79)) {
            this.aB = bifvVar.co();
            fY(79);
        }
        if (bifvVar.di(80)) {
            this.aC = bifvVar.cn();
            fY(80);
        }
        if (bifvVar.di(81)) {
            this.aD = bifvVar.cm();
            fY(81);
        }
        if (bifvVar.di(82)) {
            this.aE = bifvVar.bg();
            fY(82);
        }
        if (bifvVar.di(83)) {
            this.aF = bifvVar.I();
            fY(83);
        }
        if (bifvVar.di(84)) {
            this.aG = bifvVar.aO();
            fY(84);
        }
        if (bifvVar.di(85)) {
            this.aH = bifvVar.bT();
            fY(85);
        }
        if (bifvVar.di(86)) {
            byte[] blob = bifvVar.getBlob(bifvVar.cM(86, bige.a));
            if (blob == null) {
                dtehVar = null;
            } else {
                try {
                    dtehVar = (dteh) eyfy.parseFrom(dteh.a, blob, eyfc.a());
                } catch (Throwable unused) {
                    dtehVar = dteh.a;
                }
            }
            this.aI = dtehVar;
            fY(86);
        }
        if (bifvVar.di(87)) {
            byzo[] values2 = byzo.values();
            int i2 = bifvVar.getInt(bifvVar.cM(87, bige.a));
            if (i2 >= values2.length) {
                throw new IllegalArgumentException();
            }
            this.aJ = values2[i2];
            fY(87);
        }
        if (bifvVar.di(88)) {
            this.aK = bifvVar.V();
            fY(88);
        }
        if (bifvVar.di(89)) {
            this.aL = bifvVar.aj();
            fY(89);
        }
        if (bifvVar.di(90)) {
            this.aM = bifvVar.ah();
            fY(90);
        }
        if (bifvVar.di(91)) {
            this.aN = bifvVar.bo();
            fY(91);
        }
        if (bifvVar.di(92)) {
            this.aO = bifvVar.bF();
            fY(92);
        }
        if (bifvVar.di(93)) {
            this.aQ = bifvVar.aT();
            fY(93);
        }
        if (bifvVar.di(94)) {
            this.aR = bifvVar.ba();
            fY(94);
        }
        if (bifvVar.di(95)) {
            this.aS = bifvVar.aw();
            fY(95);
        }
        if (bifvVar.di(96)) {
            this.aT = bifvVar.aC();
            fY(96);
        }
        if (bifvVar.di(97)) {
            this.aU = bifvVar.aA();
            fY(97);
        }
        if (bifvVar.di(98)) {
            this.aV = bifvVar.S();
            fY(98);
        }
        if (bifvVar.di(99)) {
            this.aW = bifvVar.D();
            fY(99);
        }
        if (bifvVar.di(100)) {
            this.aX = bifvVar.aP();
            fY(100);
        }
        if (bifvVar.di(EnergyProfile.EVCONNECTOR_TYPE_OTHER)) {
            this.aY = bifvVar.r();
            fY(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
        }
        if (bifvVar.di(102)) {
            this.aZ = bifvVar.s();
            fY(102);
        }
        if (bifvVar.di(103)) {
            this.ba = bifvVar.u();
            fY(103);
        }
        if (bifvVar.di(104)) {
            this.bb = bifvVar.bh();
            fY(104);
        }
        if (bifvVar.di(105)) {
            this.bc = bifvVar.w();
            fY(105);
        }
        if (bifvVar.di(106)) {
            this.bd = bifvVar.bj();
            fY(106);
        }
        if (bifvVar.di(107)) {
            this.be = bifvVar.ak();
            fY(107);
        }
        if (bifvVar.di(108)) {
            this.bf = bifvVar.E();
            fY(108);
        }
        if (bifvVar.di(109)) {
            this.bg = bifvVar.am();
            fY(109);
        }
        if (bifvVar.di(110)) {
            this.bh = bifvVar.an();
            fY(110);
        }
        if (bifvVar.di(111)) {
            this.bj = bifvVar.aE();
            fY(111);
        }
        if (bifvVar.di(112)) {
            this.bk = bifvVar.aa();
            fY(112);
        }
        if (bifvVar.di(113)) {
            this.bl = bifvVar.bD();
            fY(113);
        }
        if (bifvVar.di(114)) {
            this.bm = bifvVar.bI();
            fY(114);
        }
        if (bifvVar.di(115)) {
            this.bn = bifvVar.bH();
            fY(115);
        }
        if (bifvVar.di(116)) {
            this.bo = bifvVar.bU();
            fY(116);
        }
        if (bifvVar.di(117)) {
            this.bp = bifvVar.bG();
            fY(117);
        }
        if (bifvVar.di(118)) {
            this.br = bifvVar.aG();
            fY(118);
        }
        if (bifvVar.di(119)) {
            this.bs = bifvVar.ab();
            fY(119);
        }
        if (bifvVar.di(120)) {
            this.bt = bifvVar.bE();
            fY(120);
        }
        if (bifvVar.di(121)) {
            this.bu = bifvVar.bK();
            fY(121);
        }
        if (bifvVar.di(122)) {
            this.bv = dtub.B(null, bifv.ds(bifvVar.getString(bifvVar.cM(122, bige.a))));
            fY(122);
        }
        if (bifvVar.di(123)) {
            this.bx = bifvVar.cc();
            fY(123);
        }
        if (bifvVar.di(124)) {
            this.by = bifvVar.bu();
            fY(124);
        }
        if (bifvVar.di(125)) {
            this.bz = bifvVar.bv();
            fY(125);
        }
        if (bifvVar.di(126)) {
            this.bA = bifvVar.bw();
            fY(126);
        }
        if (bifvVar.di(127)) {
            this.bB = bifvVar.by();
            fY(127);
        }
        if (bifvVar.di(128)) {
            this.bC = bifvVar.bL();
            fY(128);
        }
        if (bifvVar.di(129)) {
            this.bE = bifvVar.Y();
            fY(129);
        }
        if (bifvVar.di(130)) {
            this.bF = bifvVar.be();
            fY(130);
        }
        if (bifvVar.di(131)) {
            this.bG = bifvVar.G();
            fY(131);
        }
        if (bifvVar.di(132)) {
            this.bH = bifvVar.aM();
            fY(132);
        }
        if (bifvVar.di(133)) {
            this.bI = bifvVar.aI();
            fY(133);
        }
        if (bifvVar.di(134)) {
            this.bJ = bifvVar.aK();
            fY(134);
        }
        if (bifvVar.di(135)) {
            this.bK = bifvVar.aJ();
            fY(135);
        }
        if (bifvVar.di(136)) {
            this.bL = bifvVar.aH();
            fY(136);
        }
        if (bifvVar.di(137)) {
            this.bM = bifvVar.bm();
            fY(137);
        }
        if (bifvVar.di(138)) {
            this.bN = bifvVar.bk();
            fY(138);
        }
        if (bifvVar.di(139)) {
            this.bP = bifvVar.aS();
            fY(139);
        }
        if (bifvVar.di(140)) {
            this.bQ = bifvVar.av();
            fY(140);
        }
        if (bifvVar.di(141)) {
            this.bR = bifvVar.Q();
            fY(141);
        }
        if (bifvVar.di(142)) {
            this.bT = bifvVar.aV();
            fY(142);
        }
        if (bifvVar.di(143)) {
            this.bU = bifvVar.t();
            fY(143);
        }
        if (bifvVar.di(144)) {
            this.bV = bifvVar.bi();
            fY(144);
        }
        if (bifvVar.di(145)) {
            this.bW = bifvVar.aZ();
            fY(145);
        }
        if (bifvVar.di(146)) {
            this.bX = bifvVar.aY();
            fY(146);
        }
        if (bifvVar.di(147)) {
            this.bY = bifvVar.bp();
            fY(147);
        }
        if (bifvVar.di(148)) {
            this.bZ = bifvVar.ap();
            fY(148);
        }
        if (bifvVar.di(149)) {
            this.ca = bifvVar.k();
            fY(149);
        }
        if (bifvVar.di(150)) {
            this.cb = bifvVar.bd();
            fY(150);
        }
        if (bifvVar.di(151)) {
            this.cc = bifvVar.i();
            fY(151);
        }
        if (bifvVar.di(152)) {
            this.cd = bifvVar.al();
            fY(152);
        }
        if (bifvVar.di(153)) {
            this.ce = bifvVar.cd();
            fY(153);
        }
        if (bifvVar.di(154)) {
            this.cf = bifvVar.bR();
            fY(154);
        }
        if (bifvVar.di(155)) {
            this.cg = bifvVar.cf();
            fY(155);
        }
        if (bifvVar.di(156)) {
            this.ch = bifvVar.cb();
            fY(156);
        }
        if (bifvVar.di(157)) {
            this.ci = dtub.B(bifv.ds(bifvVar.getString(157)), bifv.ds(bifvVar.getString(bifvVar.cM(157, bige.a))));
            fY(157);
        }
        if (bifvVar.di(158)) {
            this.ck = bifvVar.h();
            fY(158);
        }
        if (bifvVar.di(159)) {
            this.cl = bifvVar.N();
            fY(159);
        }
        if (bifvVar.di(160)) {
            this.cn = bifvVar.aF();
            fY(160);
        }
        if (bifvVar.di(161)) {
            this.co = bifvVar.C();
            fY(161);
        }
        if (bifvVar.di(162)) {
            this.cp = bifvVar.aU();
            fY(162);
        }
        if (bifvVar.di(163)) {
            this.cq = bifvVar.ax();
            fY(163);
        }
        if (bifvVar.di(164)) {
            this.cr = bifvVar.aD();
            fY(164);
        }
        if (bifvVar.di(165)) {
            this.cs = bifvVar.aB();
            fY(165);
        }
        if (bifvVar.di(166)) {
            this.cu = bifvVar.bc();
            fY(166);
        }
        if (bifvVar.di(167)) {
            this.cv = bifvVar.U();
            fY(167);
        }
        if (bifvVar.di(168)) {
            this.cw = bifvVar.au();
            fY(168);
        }
        if (bifvVar.di(169)) {
            this.cx = bifvVar.az();
            fY(169);
        }
        if (bifvVar.di(170)) {
            this.cy = bifvVar.F();
            fY(170);
        }
        if (bifvVar.di(171)) {
            this.cA = bifvVar.getString(bifvVar.cM(171, bige.a));
            fY(171);
        }
        if (bifvVar.di(172)) {
            this.cB = bifvVar.H();
            fY(172);
        }
        if (bifvVar.di(173)) {
            this.cC = bifvVar.aN();
            fY(173);
        }
        if (bifvVar.di(174)) {
            this.cD = bifvVar.aL();
            fY(174);
        }
        if (bifvVar.di(175)) {
            this.cE = bifvVar.bl();
            fY(175);
        }
        if (bifvVar.di(176)) {
            this.cG = bifvVar.ay();
            fY(176);
        }
        if (bifvVar.di(177)) {
            this.cH = bifvVar.aq();
            fY(177);
        }
        i();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bgmp)) {
            return false;
        }
        bgmp bgmpVar = (bgmp) obj;
        return super.aD(bgmpVar.cL) && Objects.equals(this.a, bgmpVar.a) && Objects.equals(this.b, bgmpVar.b) && Objects.equals(this.c, bgmpVar.c) && this.d == bgmpVar.d && this.e == bgmpVar.e && this.f == bgmpVar.f && this.g == bgmpVar.g && this.h == bgmpVar.h && this.i == bgmpVar.i && this.j == bgmpVar.j && Objects.equals(this.k, bgmpVar.k) && this.l == bgmpVar.l && this.m == bgmpVar.m && Objects.equals(this.n, bgmpVar.n) && this.o == bgmpVar.o && this.p == bgmpVar.p && Objects.equals(this.q, bgmpVar.q) && this.r == bgmpVar.r && Objects.equals(this.s, bgmpVar.s) && Objects.equals(this.t, bgmpVar.t) && this.u == bgmpVar.u && this.v == bgmpVar.v && this.w == bgmpVar.w && this.x == bgmpVar.x && this.y == bgmpVar.y && Objects.equals(this.z, bgmpVar.z) && Objects.equals(this.A, bgmpVar.A) && Objects.equals(this.B, bgmpVar.B) && this.C == bgmpVar.C && Objects.equals(this.D, bgmpVar.D) && this.E == bgmpVar.E && this.F == bgmpVar.F && this.G == bgmpVar.G && Objects.equals(this.H, bgmpVar.H) && this.I == bgmpVar.I && Arrays.equals(this.J, bgmpVar.J) && Arrays.equals(this.K, bgmpVar.K) && Arrays.equals(this.L, bgmpVar.L) && Arrays.equals(this.M, bgmpVar.M) && Objects.equals(this.N, bgmpVar.N) && Arrays.equals(this.O, bgmpVar.O) && Objects.equals(this.P, bgmpVar.P) && Arrays.equals(this.Q, bgmpVar.Q) && Arrays.equals(this.R, bgmpVar.R) && Arrays.equals(this.S, bgmpVar.S) && Arrays.equals(this.T, bgmpVar.T) && Arrays.equals(this.U, bgmpVar.U) && Arrays.equals(this.V, bgmpVar.V) && Arrays.equals(this.W, bgmpVar.W) && this.X == bgmpVar.X && Objects.equals(this.Y, bgmpVar.Y) && Arrays.equals(this.Z, bgmpVar.Z) && this.aa == bgmpVar.aa && Arrays.equals(this.ab, bgmpVar.ab) && Objects.equals(this.ac, bgmpVar.ac) && Objects.equals(this.ad, bgmpVar.ad) && Objects.equals(this.ae, bgmpVar.ae) && this.af == bgmpVar.af && this.ag == bgmpVar.ag && this.ah == bgmpVar.ah && Arrays.equals(this.ai, bgmpVar.ai) && Objects.equals(this.aj, bgmpVar.aj) && Arrays.equals(this.ak, bgmpVar.ak) && Arrays.equals(this.al, bgmpVar.al) && Arrays.equals(this.am, bgmpVar.am) && Arrays.equals(this.an, bgmpVar.an) && Arrays.equals(this.ao, bgmpVar.ao) && Objects.equals(this.ap, bgmpVar.ap) && Arrays.equals(this.aq, bgmpVar.aq) && Arrays.equals(this.ar, bgmpVar.ar) && Arrays.equals(this.as, bgmpVar.as) && Arrays.equals(this.at, bgmpVar.at) && Arrays.equals(this.au, bgmpVar.au) && Arrays.equals(this.av, bgmpVar.av) && Arrays.equals(this.aw, bgmpVar.aw) && Arrays.equals(this.ax, bgmpVar.ax) && Objects.equals(this.ay, bgmpVar.ay) && Arrays.equals(this.az, bgmpVar.az) && Arrays.equals(this.aA, bgmpVar.aA) && Arrays.deepEquals(this.aB, bgmpVar.aB) && Arrays.deepEquals(this.aC, bgmpVar.aC) && Arrays.equals(this.aD, bgmpVar.aD) && this.aE == bgmpVar.aE && this.aF == bgmpVar.aF && Objects.equals(this.aG, bgmpVar.aG) && Arrays.equals(this.aH, bgmpVar.aH) && Objects.equals(this.aI, bgmpVar.aI) && this.aJ == bgmpVar.aJ && Objects.equals(this.aK, bgmpVar.aK) && this.aL == bgmpVar.aL && this.aM == bgmpVar.aM && this.aN == bgmpVar.aN && Arrays.equals(this.aO, bgmpVar.aO) && Objects.equals(this.aQ, bgmpVar.aQ) && Objects.equals(this.aR, bgmpVar.aR) && Objects.equals(this.aS, bgmpVar.aS) && Objects.equals(this.aT, bgmpVar.aT) && Objects.equals(this.aU, bgmpVar.aU) && Objects.equals(this.aV, bgmpVar.aV) && this.aW == bgmpVar.aW && Objects.equals(this.aX, bgmpVar.aX) && this.aY == bgmpVar.aY && this.aZ == bgmpVar.aZ && this.ba == bgmpVar.ba && this.bb == bgmpVar.bb && this.bc == bgmpVar.bc && this.bd == bgmpVar.bd && this.be == bgmpVar.be && this.bf == bgmpVar.bf && this.bg == bgmpVar.bg && this.bh == bgmpVar.bh && Objects.equals(this.bj, bgmpVar.bj) && Objects.equals(this.bk, bgmpVar.bk) && Arrays.equals(this.bl, bgmpVar.bl) && Arrays.equals(this.bm, bgmpVar.bm) && Arrays.equals(this.bn, bgmpVar.bn) && Arrays.equals(this.bo, bgmpVar.bo) && Arrays.equals(this.bp, bgmpVar.bp) && Objects.equals(this.br, bgmpVar.br) && Objects.equals(this.bs, bgmpVar.bs) && Arrays.equals(this.bt, bgmpVar.bt) && Arrays.equals(this.bu, bgmpVar.bu) && Arrays.equals(this.bv, bgmpVar.bv) && Arrays.equals(this.bx, bgmpVar.bx) && Arrays.equals(this.by, bgmpVar.by) && Arrays.equals(this.bz, bgmpVar.bz) && Arrays.equals(this.bA, bgmpVar.bA) && Arrays.equals(this.bB, bgmpVar.bB) && Arrays.equals(this.bC, bgmpVar.bC) && Objects.equals(this.bE, bgmpVar.bE) && Objects.equals(this.bF, bgmpVar.bF) && this.bG == bgmpVar.bG && Objects.equals(this.bH, bgmpVar.bH) && Objects.equals(this.bI, bgmpVar.bI) && Objects.equals(this.bJ, bgmpVar.bJ) && Objects.equals(this.bK, bgmpVar.bK) && Objects.equals(this.bL, bgmpVar.bL) && this.bM == bgmpVar.bM && this.bN == bgmpVar.bN && Objects.equals(this.bP, bgmpVar.bP) && Objects.equals(this.bQ, bgmpVar.bQ) && Objects.equals(this.bR, bgmpVar.bR) && Objects.equals(this.bT, bgmpVar.bT) && this.bU == bgmpVar.bU && this.bV == bgmpVar.bV && Objects.equals(this.bW, bgmpVar.bW) && Objects.equals(this.bX, bgmpVar.bX) && this.bY == bgmpVar.bY && Objects.equals(this.bZ, bgmpVar.bZ) && Objects.equals(this.ca, bgmpVar.ca) && Objects.equals(this.cb, bgmpVar.cb) && Objects.equals(this.cc, bgmpVar.cc) && Objects.equals(this.cd, bgmpVar.cd) && Arrays.equals(this.ce, bgmpVar.ce) && Arrays.equals(this.cf, bgmpVar.cf) && Arrays.equals(this.cg, bgmpVar.cg) && Arrays.equals(this.ch, bgmpVar.ch) && Arrays.equals(this.ci, bgmpVar.ci) && Objects.equals(this.ck, bgmpVar.ck) && this.cl == bgmpVar.cl && Objects.equals(this.cn, bgmpVar.cn) && this.co == bgmpVar.co && Objects.equals(this.cp, bgmpVar.cp) && Objects.equals(this.cq, bgmpVar.cq) && Objects.equals(this.cr, bgmpVar.cr) && Objects.equals(this.cs, bgmpVar.cs) && Objects.equals(this.cu, bgmpVar.cu) && Objects.equals(this.cv, bgmpVar.cv) && Objects.equals(this.cw, bgmpVar.cw) && Objects.equals(this.cx, bgmpVar.cx) && this.cy == bgmpVar.cy && Objects.equals(this.cA, bgmpVar.cA) && this.cB == bgmpVar.cB && Objects.equals(this.cC, bgmpVar.cC) && Objects.equals(this.cD, bgmpVar.cD) && this.cE == bgmpVar.cE && Objects.equals(this.cG, bgmpVar.cG) && Objects.equals(this.cH, bgmpVar.cH);
    }

    public final int f() {
        az(143, "conv_type");
        return this.bU;
    }

    public final String g() {
        az(176, "display_name");
        return this.cG;
    }

    public final String h() {
        az(142, "participant_normalized_destination");
        return this.bT;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        MessageIdType messageIdType = this.a;
        ConversationIdType conversationIdType = this.b;
        String str = this.c;
        Long valueOf = Long.valueOf(this.d);
        Long valueOf2 = Long.valueOf(this.e);
        Integer valueOf3 = Integer.valueOf(this.f);
        Integer valueOf4 = Integer.valueOf(this.g);
        Integer valueOf5 = Integer.valueOf(this.h);
        Boolean valueOf6 = Boolean.valueOf(this.i);
        Boolean valueOf7 = Boolean.valueOf(this.j);
        Uri uri = this.k;
        Integer valueOf8 = Integer.valueOf(this.l);
        Long valueOf9 = Long.valueOf(this.m);
        String str2 = this.n;
        dtsq dtsqVar3 = dtsqVar2;
        Long valueOf10 = Long.valueOf(this.o);
        Long valueOf11 = Long.valueOf(this.p);
        String str3 = this.q;
        Integer valueOf12 = Integer.valueOf(this.r);
        String str4 = this.s;
        bdhg bdhgVar = this.t;
        Integer valueOf13 = Integer.valueOf(this.u);
        byzi byziVar = this.v;
        Integer valueOf14 = Integer.valueOf(byziVar == null ? 0 : byziVar.ordinal());
        Boolean valueOf15 = Boolean.valueOf(this.w);
        Long valueOf16 = Long.valueOf(this.x);
        Integer valueOf17 = Integer.valueOf(this.y);
        String str5 = this.z;
        String str6 = this.A;
        String str7 = this.B;
        Long valueOf18 = Long.valueOf(this.C);
        bdhg bdhgVar2 = this.D;
        Integer valueOf19 = Integer.valueOf(this.E);
        csgg csggVar = this.F;
        Integer valueOf20 = Integer.valueOf(csggVar == null ? 0 : csggVar.ordinal());
        byyw byywVar = this.G;
        Integer valueOf21 = Integer.valueOf(byywVar == null ? 0 : byywVar.ordinal());
        fjay fjayVar = this.H;
        byzl byzlVar = this.I;
        Integer valueOf22 = Integer.valueOf(byzlVar == null ? 0 : byzlVar.ordinal());
        Integer valueOf23 = Integer.valueOf(Arrays.hashCode(this.J));
        Integer valueOf24 = Integer.valueOf(Arrays.hashCode(this.K));
        Integer valueOf25 = Integer.valueOf(Arrays.hashCode(this.L));
        Integer valueOf26 = Integer.valueOf(Arrays.hashCode(this.M));
        String str8 = this.N;
        Integer valueOf27 = Integer.valueOf(Arrays.hashCode(this.O));
        MessageIdType messageIdType2 = this.P;
        Integer valueOf28 = Integer.valueOf(Arrays.hashCode(this.Q));
        Integer valueOf29 = Integer.valueOf(Arrays.hashCode(this.R));
        Integer valueOf30 = Integer.valueOf(Arrays.hashCode(this.S));
        Integer valueOf31 = Integer.valueOf(Arrays.hashCode(this.T));
        Integer valueOf32 = Integer.valueOf(Arrays.hashCode(this.U));
        Integer valueOf33 = Integer.valueOf(Arrays.hashCode(this.V));
        Integer valueOf34 = Integer.valueOf(Arrays.hashCode(this.W));
        Long valueOf35 = Long.valueOf(this.X);
        Uri uri2 = this.Y;
        Integer valueOf36 = Integer.valueOf(Arrays.hashCode(this.Z));
        byzc byzcVar = this.aa;
        Integer valueOf37 = Integer.valueOf(byzcVar == null ? 0 : byzcVar.ordinal());
        Integer valueOf38 = Integer.valueOf(Arrays.hashCode(this.ab));
        ConversationIdType conversationIdType2 = this.ac;
        byyp byypVar = this.ad;
        byyp byypVar2 = this.ae;
        Long valueOf39 = Long.valueOf(this.af);
        Double valueOf40 = Double.valueOf(this.ag);
        Double valueOf41 = Double.valueOf(this.ah);
        Integer valueOf42 = Integer.valueOf(Arrays.hashCode(this.ai));
        String str9 = this.aj;
        Integer valueOf43 = Integer.valueOf(Arrays.hashCode(this.ak));
        Integer valueOf44 = Integer.valueOf(Arrays.hashCode(this.al));
        Integer valueOf45 = Integer.valueOf(Arrays.hashCode(this.am));
        Integer valueOf46 = Integer.valueOf(Arrays.hashCode(this.an));
        Integer valueOf47 = Integer.valueOf(Arrays.hashCode(this.ao));
        String str10 = this.ap;
        Integer valueOf48 = Integer.valueOf(Arrays.hashCode(this.aq));
        Integer valueOf49 = Integer.valueOf(Arrays.hashCode(this.ar));
        Integer valueOf50 = Integer.valueOf(Arrays.hashCode(this.as));
        Integer valueOf51 = Integer.valueOf(Arrays.hashCode(this.at));
        Integer valueOf52 = Integer.valueOf(Arrays.hashCode(this.au));
        Integer valueOf53 = Integer.valueOf(Arrays.hashCode(this.av));
        Integer valueOf54 = Integer.valueOf(Arrays.hashCode(this.aw));
        Integer valueOf55 = Integer.valueOf(Arrays.hashCode(this.ax));
        String str11 = this.ay;
        Integer valueOf56 = Integer.valueOf(Arrays.hashCode(this.az));
        Integer valueOf57 = Integer.valueOf(Arrays.hashCode(this.aA));
        Integer valueOf58 = Integer.valueOf(Arrays.hashCode(this.aB));
        Integer valueOf59 = Integer.valueOf(Arrays.hashCode(this.aC));
        Integer valueOf60 = Integer.valueOf(Arrays.hashCode(this.aD));
        Boolean valueOf61 = Boolean.valueOf(this.aE);
        Long valueOf62 = Long.valueOf(this.aF);
        String str12 = this.aG;
        Integer valueOf63 = Integer.valueOf(Arrays.hashCode(this.aH));
        dteh dtehVar = this.aI;
        byzo byzoVar = this.aJ;
        Integer valueOf64 = Integer.valueOf(byzoVar == null ? 0 : byzoVar.ordinal());
        awap awapVar = this.aK;
        byzh byzhVar = this.aL;
        Integer valueOf65 = Integer.valueOf(byzhVar == null ? 0 : byzhVar.ordinal());
        byyz byyzVar = this.aM;
        Integer valueOf66 = Integer.valueOf(byyzVar == null ? 0 : byyzVar.ordinal());
        Boolean valueOf67 = Boolean.valueOf(this.aN);
        Integer valueOf68 = Integer.valueOf(Arrays.hashCode(this.aO));
        String str13 = this.aQ;
        String str14 = this.aR;
        String str15 = this.aS;
        String str16 = this.aT;
        String str17 = this.aU;
        Uri uri3 = this.aV;
        Long valueOf69 = Long.valueOf(this.aW);
        String str18 = this.aX;
        Integer valueOf70 = Integer.valueOf(this.aY);
        Integer valueOf71 = Integer.valueOf(this.aZ);
        Integer valueOf72 = Integer.valueOf(this.ba);
        Boolean valueOf73 = Boolean.valueOf(this.bb);
        Integer valueOf74 = Integer.valueOf(this.bc);
        Boolean valueOf75 = Boolean.valueOf(this.bd);
        byzi byziVar2 = this.be;
        return Objects.hash(dtsqVar3, messageIdType, conversationIdType, str, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, uri, valueOf8, valueOf9, str2, valueOf10, valueOf11, str3, valueOf12, str4, bdhgVar, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, str5, str6, str7, valueOf18, bdhgVar2, valueOf19, valueOf20, valueOf21, fjayVar, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, str8, valueOf27, messageIdType2, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, uri2, valueOf36, valueOf37, valueOf38, conversationIdType2, byypVar, byypVar2, valueOf39, valueOf40, valueOf41, valueOf42, str9, valueOf43, valueOf44, valueOf45, valueOf46, valueOf47, str10, valueOf48, valueOf49, valueOf50, valueOf51, valueOf52, valueOf53, valueOf54, valueOf55, str11, valueOf56, valueOf57, valueOf58, valueOf59, valueOf60, valueOf61, valueOf62, str12, valueOf63, dtehVar, valueOf64, awapVar, valueOf65, valueOf66, valueOf67, valueOf68, str13, str14, str15, str16, str17, uri3, valueOf69, str18, valueOf70, valueOf71, valueOf72, valueOf73, valueOf74, valueOf75, Integer.valueOf(byziVar2 == null ? 0 : byziVar2.ordinal()), Long.valueOf(this.bf), this.bg, this.bh, this.bj, this.bk, Integer.valueOf(Arrays.hashCode(this.bl)), Integer.valueOf(Arrays.hashCode(this.bm)), Integer.valueOf(Arrays.hashCode(this.bn)), Integer.valueOf(Arrays.hashCode(this.bo)), Integer.valueOf(Arrays.hashCode(this.bp)), this.br, this.bs, Integer.valueOf(Arrays.hashCode(this.bt)), Integer.valueOf(Arrays.hashCode(this.bu)), Integer.valueOf(Arrays.hashCode(this.bv)), Integer.valueOf(Arrays.hashCode(this.bx)), Integer.valueOf(Arrays.hashCode(this.by)), Integer.valueOf(Arrays.hashCode(this.bz)), Integer.valueOf(Arrays.hashCode(this.bA)), Integer.valueOf(Arrays.hashCode(this.bB)), Integer.valueOf(Arrays.hashCode(this.bC)), this.bE, this.bF, Long.valueOf(this.bG), this.bH, this.bI, this.bJ, this.bK, this.bL, Boolean.valueOf(this.bM), Boolean.valueOf(this.bN), this.bP, this.bQ, this.bR, this.bT, Integer.valueOf(this.bU), Boolean.valueOf(this.bV), this.bW, this.bX, Boolean.valueOf(this.bY), this.bZ, this.ca, this.cb, this.cc, this.cd, Integer.valueOf(Arrays.hashCode(this.ce)), Integer.valueOf(Arrays.hashCode(this.cf)), Integer.valueOf(Arrays.hashCode(this.cg)), Integer.valueOf(Arrays.hashCode(this.ch)), Integer.valueOf(Arrays.hashCode(this.ci)), this.ck, Long.valueOf(this.cl), this.cn, Integer.valueOf(this.co), this.cp, this.cq, this.cr, this.cs, this.cu, this.cv, this.cw, this.cx, Long.valueOf(this.cy), this.cA, Long.valueOf(this.cB), this.cC, this.cD, Boolean.valueOf(this.cE), this.cG, this.cH, null);
    }

    public final void i() {
        long j;
        int length;
        int length2;
        int length3;
        int length4;
        int i;
        int i2;
        String str;
        int length5;
        int i3;
        HashSet hashSet;
        int i4;
        long[] jArr;
        int length6;
        int i5;
        long[] jArr2;
        HashSet hashSet2;
        int i6;
        boolean z;
        String str2;
        int length7;
        String str3;
        String str4;
        int length8;
        int intValue = bige.c().intValue();
        buoy c = MessagesTable.c();
        int i7 = 0;
        String str5 = "_id";
        az(0, "_id");
        c.v(this.a);
        az(1, "conversation_id");
        c.m(this.b);
        az(2, "sender_id");
        c.ag(this.c);
        az(3, "sent_timestamp");
        c.ai(this.d);
        String str6 = "received_timestamp";
        az(4, "received_timestamp");
        c.Y(this.e);
        az(5, "message_protocol");
        c.O(this.f);
        az(6, "message_status");
        c.ao(this.g);
        if (intValue >= 13020) {
            az(7, "message_report_status");
            c.y(this.h);
        }
        az(8, "seen");
        c.H(this.i);
        az(9, "read");
        c.X(this.j);
        az(10, "sms_message_uri");
        c.am(this.k);
        az(11, "sms_priority");
        c.an(this.l);
        az(12, "sms_message_size");
        c.al(this.m);
        az(13, "mms_subject");
        c.C(this.n);
        az(14, "mms_expiry");
        c.A(this.o);
        if (intValue >= 59890) {
            az(15, "rcs_expiry");
            c.S(this.p);
        }
        if (intValue >= 9030) {
            az(16, "mms_retrieve_text");
            c.B(this.q);
        }
        az(17, "raw_status");
        c.Q(this.r);
        az(18, "self_id");
        c.ae(this.s);
        if (intValue >= 41040) {
            az(19, "rcs_message_id_with_text_type");
            c.U(this.t);
        }
        int i8 = 29060;
        if (intValue >= 29060) {
            az(20, "etouffee_status");
            c.R(this.u);
        }
        if (intValue >= 29090) {
            az(21, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS);
            c.ar(this.v);
        }
        if (intValue >= 30010) {
            az(22, "is_hidden");
            c.w(this.w);
        }
        if (intValue >= 10004) {
            az(23, "rcs_file_transfer_session_id");
            c.T(this.x);
        }
        if (intValue >= 9000) {
            az(24, "sms_error_code");
            c.aj(this.y);
        }
        if (intValue >= 9000) {
            az(25, "sms_error_desc_map_name");
            c.ak(this.z);
        }
        if (intValue >= 31010) {
            az(26, "cms_id");
            c.j(this.A);
        }
        if (intValue >= 19020) {
            az(27, "web_id");
            c.as(this.B);
        }
        if (intValue >= 29100) {
            az(28, "usage_stats_logging_id");
            c.aq(this.C);
        }
        if (intValue >= 35030) {
            az(29, "original_rcs_message_id");
            c.L(this.D);
        }
        if (intValue >= 58040) {
            az(30, "result_code");
            c.ab(this.E);
        }
        if (intValue >= 58210) {
            az(31, "cms_life_cycle");
            c.l(this.F);
        }
        if (intValue >= 58710) {
            az(32, "fallback_reason");
            c.t(this.G);
        }
        if (intValue >= 58680) {
            az(33, "trace_id");
            c.ap(this.H);
        }
        if (intValue >= 59310) {
            az(34, "xms_transport");
            c.at(this.I);
        }
        this.cI = c.a();
        ArrayList arrayList = new ArrayList();
        long[] jArr3 = this.aO;
        long j2 = 0;
        int length9 = (jArr3 == null || (length8 = jArr3.length) == 0 || (length8 == 1 && jArr3[0] == 0)) ? 0 : n().length;
        HashSet hashSet3 = new HashSet();
        int i9 = 0;
        while (true) {
            j = j2;
            if (i9 >= length9) {
                break;
            }
            long j3 = jArr3[i9];
            if (j3 != j) {
                Long valueOf = Long.valueOf(j3);
                if (!hashSet3.contains(valueOf)) {
                    hashSet3.add(valueOf);
                    bvwp b = PartsTable.b();
                    b.B(n()[i9]);
                    az(41, "message_id");
                    b.J(this.P);
                    az(42, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
                    b.Y(this.Q[i9]);
                    az(43, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                    b.aa(this.R[i9]);
                    az(44, "content_type");
                    b.t(this.S[i9]);
                    if (intValue >= 10021) {
                        az(45, "original_uri");
                        b.L(this.T[i9]);
                    }
                    if (intValue >= i8) {
                        az(46, "storage_uri");
                        b.W(this.U[i9]);
                    }
                    az(47, "width");
                    b.ad(this.V[i9]);
                    az(48, "height");
                    b.A(this.W[i9]);
                    if (intValue >= 3010) {
                        az(49, "timestamp");
                        str4 = str6;
                        b.Z(this.X);
                    } else {
                        str4 = str6;
                    }
                    if (intValue >= 4020) {
                        az(50, "output_uri");
                        b.Q(this.Y);
                    }
                    if (intValue >= 4020) {
                        az(51, "target_size");
                        str3 = str5;
                        b.X(this.Z[i9]);
                    } else {
                        str3 = str5;
                    }
                    if (intValue >= 4020) {
                        az(52, "processing_status");
                        b.R(this.aa);
                    }
                    if (intValue >= 44010) {
                        az(53, "cms_attachment_processing_status");
                        b.k(this.ab[i9]);
                    }
                    az(54, "conversation_id");
                    b.u(this.ac);
                    if (intValue >= 5020) {
                        az(55, "sticker_set_id");
                        b.V(this.ad);
                    }
                    if (intValue >= 5020) {
                        az(56, "sticker_id");
                        b.U(this.ae);
                    }
                    if (intValue >= 7000) {
                        az(57, "media_modified_timestamp");
                        b.H(this.af);
                    }
                    if (intValue >= 10005) {
                        az(58, "longitude");
                        b.F(this.ag);
                    }
                    if (intValue >= 10005) {
                        az(59, "latitude");
                        b.D(this.ah);
                    }
                    if (intValue >= 10017) {
                        az(60, "preview_content_uri");
                        b.O(this.ai[i9]);
                    }
                    if (intValue >= 10017) {
                        az(61, "preview_content_type");
                        b.N(this.aj);
                    }
                    if (intValue >= 13000) {
                        az(62, "fallback_uri");
                        b.x(this.ak[i9]);
                    }
                    if (intValue >= 14010) {
                        az(63, "source");
                        b.T(this.al[i9]);
                    }
                    if (intValue >= 17010) {
                        az(64, "bundle_index");
                        b.j(this.am[i9]);
                    }
                    if (intValue >= 17020) {
                        az(65, "blob_id");
                        b.g(this.an[i9]);
                    }
                    if (intValue >= 59570) {
                        az(66, "blob_gaia_email");
                        b.f(this.ao[i9]);
                    }
                    if (intValue >= 40040) {
                        az(67, "cms_full_size_blob_id");
                        b.n(this.ap);
                    }
                    if (intValue >= 42010) {
                        az(68, "cms_media_encryption_key");
                        b.o(this.aq);
                    }
                    if (intValue >= 42070) {
                        az(69, "cms_compressed_media_encryption_key");
                        b.m(this.ar);
                    }
                    if (intValue >= 18000) {
                        az(70, "blob_upload_permanent_failure");
                        b.h(this.as[i9]);
                    }
                    if (intValue >= 19030) {
                        az(71, "blob_upload_timestamp");
                        b.i(this.at[i9]);
                    }
                    if (intValue >= 22060) {
                        az(72, "expressive_sticker_name");
                        b.w(this.au[i9]);
                    }
                    if (intValue >= 26000) {
                        az(73, "file_name");
                        b.y(this.av[i9]);
                    }
                    if (intValue >= 26040) {
                        az(74, "duration");
                        b.v(this.aw[i9]);
                    }
                    if (intValue >= 27000) {
                        az(75, "compressed_blob_id");
                        b.p(this.ax[i9]);
                    }
                    if (intValue >= 40040) {
                        az(76, "cms_compressed_blob_id");
                        b.l(this.ay);
                    }
                    if (intValue >= 27000) {
                        az(77, "compressed_blob_upload_permanent_failure");
                        b.q(this.az[i9]);
                    }
                    if (intValue >= 27000) {
                        az(78, "compressed_blob_upload_timestamp");
                        b.r(this.aA[i9]);
                    }
                    if (intValue >= 30040) {
                        az(79, "media_encryption_key");
                        b.G(this.aB[i9]);
                    }
                    if (intValue >= 30040) {
                        az(80, "compressed_media_encryption_key");
                        b.s(this.aC[i9]);
                    }
                    if (intValue >= 52030) {
                        az(81, "missing_entry_in_telephony");
                        b.K(this.aD[i9]);
                    }
                    if (intValue >= 53040) {
                        az(82, "awaiting_reverse_sync");
                        b.e(this.aE);
                    }
                    if (intValue >= 52050) {
                        az(83, "file_size_bytes");
                        b.z(this.aF);
                    }
                    if (intValue >= 52050) {
                        az(84, "local_cache_path");
                        b.E(this.aG);
                    }
                    if (intValue >= 58150) {
                        az(85, "media_send_type");
                        b.I(this.aH[i9]);
                    }
                    if (intValue >= 59470) {
                        az(86, "voice_metadata");
                        b.ac(this.aI);
                    }
                    if (intValue >= 58770) {
                        az(87, "validation_status");
                        b.ab(this.aJ);
                    }
                    if (intValue >= 60080) {
                        az(88, "processing_id");
                        b.P(this.aK);
                    }
                    if (intValue >= 60230) {
                        az(89, "rich_card_media_download_failure_reason");
                        b.S(this.aL);
                    }
                    if (intValue >= 60240) {
                        az(90, "image_display_state");
                        b.C(this.aM);
                    }
                    if (intValue >= 60680) {
                        az(91, "preserve_size");
                        b.M(this.aN);
                    }
                    arrayList.add(b.a());
                    i9++;
                    str6 = str4;
                    j2 = j;
                    str5 = str3;
                    i7 = 0;
                    i8 = 29060;
                }
            }
            str3 = str5;
            str4 = str6;
            i9++;
            str6 = str4;
            j2 = j;
            str5 = str3;
            i7 = 0;
            i8 = 29060;
        }
        String str7 = str5;
        String str8 = str6;
        this.aP = (PartsTable.BindData[]) arrayList.toArray(new PartsTable.BindData[i7]);
        bvpo d = ParticipantsTable.d();
        az(93, "normalized_destination");
        d.I(this.aQ);
        az(94, "send_destination");
        d.R(this.aR);
        az(95, "display_destination");
        d.q(this.aS);
        az(96, "full_name");
        d.u(this.aT);
        az(97, "first_name");
        d.t(this.aU);
        az(98, "profile_photo_uri");
        d.N(this.aV);
        az(99, "contact_id");
        d.l(this.aW);
        az(100, "lookup_key");
        d.D(this.aX);
        az(EnergyProfile.EVCONNECTOR_TYPE_OTHER, "color_palette_index");
        d.h(this.aY);
        String str9 = "color_type";
        if (intValue >= 1000) {
            az(102, "color_type");
            d.i(this.aZ);
        }
        if (intValue >= 10027) {
            az(103, "extended_color");
            d.s(this.ba);
        }
        az(104, "blocked");
        d.e(this.bb);
        if (intValue >= 12001) {
            az(105, "participant_type");
            d.J(this.bc);
        }
        if (intValue >= 24060) {
            az(106, "is_spam");
            d.y(this.bd);
        }
        if (intValue >= 31030) {
            az(107, "latest_verification_status");
            d.C(this.be);
        }
        if (intValue >= 35010) {
            az(108, "directory_id");
            d.p(this.bf);
        }
        if (intValue >= 59550) {
            az(109, "name_source");
            d.G(this.bg);
        }
        if (intValue >= 59550) {
            az(110, "photo_source");
            d.K(this.bh);
        }
        this.bi = d.a();
        ArrayList arrayList2 = new ArrayList();
        boolean s = dtub.c.s();
        long[] jArr4 = s ? this.bp : null;
        if (s) {
            if (jArr4 != null && (length7 = jArr4.length) != 0 && (length7 != 1 || jArr4[0] != j)) {
                length = l().length;
            }
            length = 0;
        } else {
            if (l() != null) {
                length = l().length;
            }
            length = 0;
        }
        HashSet hashSet4 = new HashSet();
        int i10 = 0;
        while (i10 < length) {
            if (s) {
                long j4 = jArr4[i10];
                if (j4 != j) {
                    i5 = i10;
                    Long valueOf2 = Long.valueOf(j4);
                    if (!hashSet4.contains(valueOf2)) {
                        hashSet4.add(valueOf2);
                    }
                } else {
                    i5 = i10;
                }
                i6 = length;
                hashSet2 = hashSet4;
                jArr2 = jArr4;
                str2 = str7;
                z = s;
                i10 = i5 + 1;
                s = z;
                length = i6;
                jArr4 = jArr2;
                str7 = str2;
                hashSet4 = hashSet2;
            } else {
                i5 = i10;
            }
            bwuq a = bwvy.a();
            i6 = length;
            hashSet2 = hashSet4;
            str2 = str7;
            az(111, str2);
            a.c(this.bj);
            az(112, "message_id");
            a.d(this.bk);
            z = s;
            jArr2 = jArr4;
            a.e(l()[i5]);
            az(114, "receive_time");
            a.g(this.bm[i5]);
            az(115, "read_time");
            a.f(this.bn[i5]);
            if (intValue >= 58880) {
                az(116, "ftd_time");
                a.b(this.bo[i5]);
            }
            arrayList2.add(a.a());
            i10 = i5 + 1;
            s = z;
            length = i6;
            jArr4 = jArr2;
            str7 = str2;
            hashSet4 = hashSet2;
        }
        String str10 = str7;
        this.bq = (bwuo[]) arrayList2.toArray(new bwuo[0]);
        ArrayList arrayList3 = new ArrayList();
        boolean s2 = dtub.c.s();
        long[] jArr5 = s2 ? this.bv : null;
        if (s2) {
            if (jArr5 != null && (length6 = jArr5.length) != 0 && (length6 != 1 || jArr5[0] != j)) {
                length2 = m().length;
            }
            length2 = 0;
        } else {
            if (m() != null) {
                length2 = m().length;
            }
            length2 = 0;
        }
        HashSet hashSet5 = new HashSet();
        int i11 = 0;
        while (i11 < length2) {
            if (s2) {
                long j5 = jArr5[i11];
                if (j5 != j) {
                    i3 = i11;
                    Long valueOf3 = Long.valueOf(j5);
                    if (!hashSet5.contains(valueOf3)) {
                        hashSet5.add(valueOf3);
                    }
                } else {
                    i3 = i11;
                }
                jArr = jArr5;
                i4 = length2;
                hashSet = hashSet5;
                i11 = i3 + 1;
                jArr5 = jArr;
                length2 = i4;
                hashSet5 = hashSet;
            } else {
                i3 = i11;
            }
            byse a2 = bytk.a();
            jArr = jArr5;
            az(118, str10);
            a2.b(this.br);
            az(119, "message_id");
            a2.c(this.bs);
            i4 = length2;
            hashSet = hashSet5;
            a2.d(m()[i3]);
            az(121, "user_ref_datetime");
            a2.e(this.bu[i3]);
            arrayList3.add(a2.a());
            i11 = i3 + 1;
            jArr5 = jArr;
            length2 = i4;
            hashSet5 = hashSet;
        }
        this.bw = (bysc[]) arrayList3.toArray(new bysc[0]);
        ArrayList arrayList4 = new ArrayList();
        boolean s3 = dtub.c.s();
        long[] jArr6 = s3 ? this.bC : null;
        if (s3) {
            if (jArr6 != null && (length5 = jArr6.length) != 0 && (length5 != 1 || jArr6[0] != j)) {
                length3 = o().length;
            }
            length3 = 0;
        } else {
            if (o() != null) {
                length3 = o().length;
            }
            length3 = 0;
        }
        HashSet hashSet6 = new HashSet();
        int i12 = 0;
        while (i12 < length3) {
            if (s3) {
                long j6 = jArr6[i12];
                if (j6 != j) {
                    i = i12;
                    Long valueOf4 = Long.valueOf(j6);
                    if (!hashSet6.contains(valueOf4)) {
                        hashSet6.add(valueOf4);
                    }
                } else {
                    i = i12;
                }
                str = str9;
                i2 = length3;
                i12 = i + 1;
                str9 = str;
                length3 = i2;
            } else {
                i = i12;
            }
            bvpo d2 = ParticipantsTable.d();
            i2 = length3;
            d2.I(o()[i]);
            az(124, "color_palette_index");
            d2.h(this.by[i]);
            if (intValue >= 1000) {
                az(125, str9);
                d2.i(this.bz[i]);
            }
            if (intValue >= 10027) {
                str = str9;
                az(126, "extended_color");
                d2.s(this.bA[i]);
            } else {
                str = str9;
            }
            if (intValue >= 12001) {
                az(127, "participant_type");
                d2.J(this.bB[i]);
            }
            arrayList4.add(d2.a());
            i12 = i + 1;
            str9 = str;
            length3 = i2;
        }
        this.bD = (ParticipantsTable.BindData[]) arrayList4.toArray(new ParticipantsTable.BindData[0]);
        btor a3 = btqq.a();
        az(129, "message_id");
        a3.m(this.bE);
        az(130, "trigger_url");
        a3.n(this.bF);
        az(131, "expiration_time_millis");
        a3.e(this.bG);
        az(132, "link_title");
        a3.l(this.bH);
        az(133, "link_description");
        a3.g(this.bI);
        az(134, "link_image_url");
        a3.i(this.bJ);
        az(135, "link_domain");
        a3.h(this.bK);
        az(136, "link_canonical_url");
        a3.f(this.bL);
        if (intValue >= 21010) {
            az(137, "link_preview_prevented");
            a3.k(this.bM);
        }
        if (intValue >= 22020) {
            az(138, "link_preview_failed");
            a3.j(this.bN);
        }
        this.bO = a3.a();
        byxc.a().a();
        byun a4 = byvy.a();
        az(139, "name");
        a4.g(this.bP);
        az(140, "description");
        a4.c(this.bQ);
        az(141, "logo_uri");
        a4.e(this.bR);
        this.bS = a4.a();
        ArrayList arrayList5 = new ArrayList();
        long[] jArr7 = this.ci;
        int length10 = (jArr7 == null || (length4 = jArr7.length) == 0 || (length4 == 1 && jArr7[0] == j)) ? 0 : q().length;
        HashSet hashSet7 = new HashSet();
        for (int i13 = 0; i13 < length10; i13++) {
            long j7 = jArr7[i13];
            if (j7 != j) {
                Long valueOf5 = Long.valueOf(j7);
                if (!hashSet7.contains(valueOf5)) {
                    hashSet7.add(valueOf5);
                    byxk a5 = VmtTable.a();
                    a5.c(q()[i13]);
                    az(154, "vmt_status");
                    a5.e(this.cf[i13]);
                    az(155, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
                    a5.d(this.cg[i13]);
                    az(156, "locale");
                    a5.b(this.ch[i13]);
                    arrayList5.add(a5.a());
                }
            }
        }
        this.cj = (VmtTable.BindData[]) arrayList5.toArray(new VmtTable.BindData[0]);
        buoy c2 = MessagesTable.c();
        az(158, str10);
        c2.v(this.ck);
        az(159, str8);
        c2.Y(this.cl);
        this.cm = c2.a();
        bvpo d3 = ParticipantsTable.d();
        az(160, str10);
        d3.v(this.cn);
        az(161, "sub_id");
        d3.T(this.co);
        az(162, "normalized_destination");
        d3.I(this.cp);
        az(163, "display_destination");
        d3.q(this.cq);
        az(164, "full_name");
        d3.u(this.cr);
        az(165, "first_name");
        d3.t(this.cs);
        this.ct = d3.a();
        bvwp b2 = PartsTable.b();
        az(166, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        b2.Y(this.cu);
        az(167, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        b2.aa(this.cv);
        az(168, "content_type");
        b2.t(this.cw);
        if (intValue >= 26000) {
            az(169, "file_name");
            b2.y(this.cx);
        }
        if (intValue >= 26040) {
            az(170, "duration");
            b2.v(this.cy);
        }
        this.cz = b2.a();
        btor a6 = btqq.a();
        az(171, "trigger_url");
        a6.n(this.cA);
        az(172, "expiration_time_millis");
        a6.e(this.cB);
        az(173, "link_title");
        a6.l(this.cC);
        az(174, "link_image_url");
        a6.i(this.cD);
        if (intValue >= 22020) {
            az(175, "link_preview_failed");
            a6.j(this.cE);
        }
        this.cF = a6.a();
    }

    public final boolean j() {
        az(144, "has_ea2p_bot_recipient");
        return this.bV;
    }

    public final boolean k() {
        az(147, "rcs_session_allows_revocation");
        return this.bY;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationMessagesOptimizedQuery -- REDACTED") : a();
    }
}
