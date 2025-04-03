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
public class bigm extends dtro {
    public String A;
    public fjay H;
    public String J;
    public String[] K;
    public MessageIdType L;
    public String[] M;
    public Uri[] N;
    public String[] O;
    public Uri[] P;
    public Uri[] Q;
    public int[] R;
    public int[] S;
    public long T;
    public Uri U;
    public long[] V;
    public byzc W;
    public byyu[] X;
    public ConversationIdType Y;
    public byyp Z;
    public boolean aA;
    public long aB;
    public String aC;
    public byza[] aD;
    public dteh aE;
    public byzo aF;
    public awap aG;
    public byzh aH;
    public byyz aI;
    public boolean aJ;
    public long[] aK;
    public PartsTable.BindData[] aL;
    public String aM;
    public String aN;
    public String aO;
    public String aP;
    public String aQ;
    public Uri aR;
    public long aS;
    public String aT;
    public int aU;
    public int aV;
    public int aW;
    public boolean aX;
    public int aY;
    public boolean aZ;
    public byyp aa;
    public long ab;
    public double ac;
    public double ad;
    public Uri[] ae;
    public String af;
    public Uri[] ag;
    public int[] ah;
    public int[] ai;
    public String[] aj;
    public String[] ak;
    public String al;
    public byte[] am;
    public byte[] an;
    public boolean[] ao;
    public long[] ap;
    public String[] aq;
    public String[] ar;
    public long[] as;
    public String[] at;
    public String au;
    public boolean[] av;
    public long[] aw;
    public byte[][] ax;
    public byte[][] ay;
    public boolean[] az;
    public bync bA;
    public MessageIdType bB;
    public String bC;
    public long bD;
    public String bE;
    public String bF;
    public String bG;
    public String bH;
    public String bI;
    public boolean bJ;
    public boolean bK;
    public bton bL;
    public String bM;
    public String bN;
    public Uri bO;
    public byul bP;
    public String bQ;
    public int bR;
    public boolean bS;
    public String bT;
    public String bU;
    public boolean bV;
    public Optional bW;
    public cmrf bX;
    public String bY;
    public MessageIdType bZ;
    public byzi ba;
    public long bb;
    public cjwi bc;
    public cjwi bd;
    public ParticipantsTable.BindData be;
    public String bf;
    public MessageIdType bg;
    public long[] bh;
    public long[] bi;
    public long[] bj;
    public Optional[] bk;
    public long[] bl;
    public boph bm;
    public MessageIdType bn;
    public long[] bo;
    public long[] bp;
    public long[] bq;
    public String[] br;
    public String[] bs;
    public String[] bt;
    public String[] bu;
    public String[] bv;
    public int[] bw;
    public int[] bx;
    public int[] by;
    public long[] bz;
    public String c;
    public String cA;
    public boolean cB;
    public bmwr cC;
    public String cD;
    public String cE;
    public MessagesTable.BindData cF;
    public cjia ca;
    public String[] cb;
    public ardn[] cc;
    public String[] cd;
    public String[] ce;
    public long[] cf;
    public VmtTable.BindData[] cg;
    public MessageIdType ch;
    public MessageIdType ci;
    public long cj;
    public String ck;
    public int cl;
    public String cm;
    public String cn;
    public String co;
    public String cp;
    public String[] cq;
    public String[] cr;
    public Uri[] cs;
    public String[] ct;
    public String[] cu;
    public long[] cv;
    public long[] cw;
    public String cx;
    public long cy;
    public String cz;
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

    protected bigm() {
        MessageIdType messageIdType = bdhb.a;
        this.L = messageIdType;
        this.W = byzc.SUCCEEDED;
        this.Y = bdgq.a;
        this.Z = new byyp(-1);
        this.aa = new byyp(-1);
        this.ab = -1L;
        this.ac = eobe.a;
        this.ad = eobe.a;
        this.aA = false;
        this.aF = byzo.UNKNOWN;
        this.aG = null;
        this.aH = byzh.NONE;
        this.aI = byyz.DEFAULT_NO_VERDICT;
        this.aJ = false;
        this.aS = -1L;
        this.aU = -1;
        this.aV = 0;
        this.aW = 0;
        this.aX = false;
        this.aY = 0;
        this.aZ = false;
        this.ba = byzi.VERIFICATION_NA;
        this.bb = -1L;
        cjwi cjwiVar = cjwi.PROFILE_CONTACT_SOURCE;
        this.bc = cjwiVar;
        this.bd = cjwiVar;
        this.bg = messageIdType;
        this.bn = messageIdType;
        this.bB = messageIdType;
        this.bD = 0L;
        this.bJ = false;
        this.bK = false;
        this.bR = 0;
        this.bS = false;
        this.bV = true;
        this.bW = bdhe.b(-1L);
        MessageIdType messageIdType2 = bdhb.a;
        this.bZ = messageIdType2;
        this.ch = messageIdType2;
        this.ci = messageIdType2;
    }

    private final String[] l() {
        az(36, "_id");
        return this.K;
    }

    private final String[] m() {
        az(151, "part_id");
        return this.cb;
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
        String aL = aL(this.K);
        String valueOf36 = String.valueOf(this.L);
        String aL2 = aL(this.M);
        String aK = aK(this.N);
        String aL3 = aL(this.O);
        String aK2 = aK(this.P);
        String aK3 = aK(this.Q);
        String aI = aI(this.R);
        String aI2 = aI(this.S);
        String valueOf37 = String.valueOf(this.T);
        String valueOf38 = String.valueOf(this.U);
        String aJ = aJ(this.V);
        String valueOf39 = String.valueOf(this.W);
        String aK4 = aK(this.X);
        String valueOf40 = String.valueOf(this.Y);
        String valueOf41 = String.valueOf(this.Z);
        String valueOf42 = String.valueOf(this.aa);
        String valueOf43 = String.valueOf(this.ab);
        String valueOf44 = String.valueOf(this.ac);
        String valueOf45 = String.valueOf(this.ad);
        String aK5 = aK(this.ae);
        String valueOf46 = String.valueOf(this.af);
        String aK6 = aK(this.ag);
        String aI3 = aI(this.ah);
        String aI4 = aI(this.ai);
        String aL4 = aL(this.aj);
        String valueOf47 = String.valueOf(this.al);
        byte[] bArr = this.am;
        String concat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
        byte[] bArr2 = this.an;
        return String.format(locale, "ConversationMessagesQuery [messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_sender_id: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_message_report_status: %s,\n  messages.messages_seen: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_message_uri: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_sms_message_size: %s,\n  messages.messages_mms_subject: %s,\n  messages.messages_mms_expiry: %s,\n  messages.messages_rcs_expiry: %s,\n  messages.messages_mms_retrieve_text: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_self_id: %s,\n  messages.messages_rcs_message_id_with_text_type: %s,\n  messages.messages_etouffee_status: %s,\n  messages.messages_verification_status: %s,\n  messages.messages_is_hidden: %s,\n  messages.messages_rcs_file_transfer_session_id: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  messages.messages_cms_id: %s,\n  messages.messages_web_id: %s,\n  messages.messages_usage_stats_logging_id: %s,\n  messages.messages_original_rcs_message_id: %s,\n  messages.messages_result_code: %s,\n  messages.messages_cms_life_cycle: %s,\n  messages.messages_fallback_reason: %s,\n  messages.messages_trace_id: %s,\n  messages.messages_xms_transport: %s,\n  null.parts_count: %s,\n  parts.parts__id: %s,\n  parts.parts_message_id: %s,\n  parts.parts_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  parts.parts_original_uri: %s,\n  parts.parts_storage_uri: %s,\n  parts.parts_width: %s,\n  parts.parts_height: %s,\n  parts.parts_timestamp: %s,\n  parts.parts_output_uri: %s,\n  parts.parts_target_size: %s,\n  parts.parts_processing_status: %s,\n  parts.parts_cms_attachment_processing_status: %s,\n  parts.parts_conversation_id: %s,\n  parts.parts_sticker_set_id: %s,\n  parts.parts_sticker_id: %s,\n  parts.parts_media_modified_timestamp: %s,\n  parts.parts_longitude: %s,\n  parts.parts_latitude: %s,\n  parts.parts_preview_content_uri: %s,\n  parts.parts_preview_content_type: %s,\n  parts.parts_fallback_uri: %s,\n  parts.parts_source: %s,\n  parts.parts_bundle_index: %s,\n  parts.parts_blob_id: %s,\n  parts.parts_blob_gaia_email: %s,\n  parts.parts_cms_full_size_blob_id: %s,\n  parts.parts_cms_media_encryption_key: %s,\n  parts.parts_cms_compressed_media_encryption_key: %s,\n  parts.parts_blob_upload_permanent_failure: %s,\n  parts.parts_blob_upload_timestamp: %s,\n  parts.parts_expressive_sticker_name: %s,\n  parts.parts_file_name: %s,\n  parts.parts_duration: %s,\n  parts.parts_compressed_blob_id: %s,\n  parts.parts_cms_compressed_blob_id: %s,\n  parts.parts_compressed_blob_upload_permanent_failure: %s,\n  parts.parts_compressed_blob_upload_timestamp: %s,\n  parts.parts_media_encryption_key: %s,\n  parts.parts_compressed_media_encryption_key: %s,\n  parts.parts_missing_entry_in_telephony: %s,\n  parts.parts_awaiting_reverse_sync: %s,\n  parts.parts_file_size_bytes: %s,\n  parts.parts_local_cache_path: %s,\n  parts.parts_media_send_type: %s,\n  parts.parts_voice_metadata: %s,\n  parts.parts_validation_status: %s,\n  parts.parts_processing_id: %s,\n  parts.parts_rich_card_media_download_failure_reason: %s,\n  parts.parts_image_display_state: %s,\n  parts.parts_preserve_size: %s,\n  parts.parts_rowid: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_send_destination: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  participants.participants_profile_photo_uri: %s,\n  participants.participants_contact_id: %s,\n  participants.participants_lookup_key: %s,\n  participants.participants_color_palette_index: %s,\n  participants.participants_color_type: %s,\n  participants.participants_extended_color: %s,\n  participants.participants_blocked: %s,\n  participants.participants_participant_type: %s,\n  participants.participants_is_spam: %s,\n  participants.participants_latest_verification_status: %s,\n  participants.participants_directory_id: %s,\n  participants.participants_name_source: %s,\n  participants.participants_photo_source: %s,\n  reports_concat_view.reports_concat_view_read_reports__id: %s,\n  reports_concat_view.reports_concat_view_read_reports_message_id: %s,\n  reports_concat_view.reports_concat_view_read_reports_participant_id: %s,\n  reports_concat_view.reports_concat_view_read_reports_receive_time: %s,\n  reports_concat_view.reports_concat_view_read_reports_read_time: %s,\n  reports_concat_view.reports_concat_view_read_reports_ftd_time: %s,\n  reports_concat_view.reports_concat_view_read_reports_read_reports__ROWID: %s,\n  user_refs_concat_view.user_refs_concat_view_user_references_message_id: %s,\n  user_refs_concat_view.user_refs_concat_view_user_references_participant_id: %s,\n  user_refs_concat_view.user_refs_concat_view_user_references_user_ref_datetime: %s,\n  user_refs_concat_view.user_refs_concat_view_user_references_user_references__ROWID: %s,\n  user_refs_concat_view.user_refs_concat_view_user_ref_display_name: %s,\n  user_refs_concat_view.user_refs_concat_view_user_ref_profile_photo_uri: %s,\n  user_refs_concat_view.user_refs_concat_view_user_ref_full_name: %s,\n  user_refs_concat_view.user_refs_concat_view_user_ref_lookup_key: %s,\n  user_refs_concat_view.user_refs_concat_view_participants_normalized_destination: %s,\n  user_refs_concat_view.user_refs_concat_view_participants_color_palette_index: %s,\n  user_refs_concat_view.user_refs_concat_view_participants_color_type: %s,\n  user_refs_concat_view.user_refs_concat_view_participants_extended_color: %s,\n  user_refs_concat_view.user_refs_concat_view_participants_participants__ROWID: %s,\n  link_preview.link_preview_message_id: %s,\n  link_preview.link_preview_trigger_url: %s,\n  link_preview.link_preview_expiration_time_millis: %s,\n  link_preview.link_preview_link_title: %s,\n  link_preview.link_preview_link_description: %s,\n  link_preview.link_preview_link_image_url: %s,\n  link_preview.link_preview_link_domain: %s,\n  link_preview.link_preview_link_canonical_url: %s,\n  link_preview.link_preview_link_preview_prevented: %s,\n  link_preview.link_preview_link_preview_failed: %s,\n  verified_sms_brands.verified_sms_brands_name: %s,\n  verified_sms_brands.verified_sms_brands_description: %s,\n  verified_sms_brands.verified_sms_brands_logo_uri: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_rcs_group_id: %s,\n  conversations.conversations_rcs_conference_uri: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_recipient_offline_timestamp_ms: %s,\n  message_reactions.message_reactions_reactions_data: %s,\n  file_transfer.file_transfer_transfer_id: %s,\n  message_star.message_star_message_id: %s,\n  message_photos_sharing.message_photos_sharing_sharing_state: %s,\n  vmt.vmt_part_id: %s,\n  vmt.vmt_vmt_status: %s,\n  vmt.vmt_text: %s,\n  vmt.vmt_locale: %s,\n  vmt.vmt_rowid: %s,\n  message_replies_view.message_replies_view_message_replies_message_id: %s,\n  message_replies_view.message_replies_view_messages__id: %s,\n  message_replies_view.message_replies_view_messages_received_timestamp: %s,\n  message_replies_view.message_replies_view_participants__id: %s,\n  message_replies_view.message_replies_view_participants_sub_id: %s,\n  message_replies_view.message_replies_view_participants_normalized_destination: %s,\n  message_replies_view.message_replies_view_participants_display_destination: %s,\n  message_replies_view.message_replies_view_participants_full_name: %s,\n  message_replies_view.message_replies_view_participants_first_name: %s,\n  message_replies_view.message_replies_view_parts__id: %s,\n  message_replies_view.message_replies_view_parts_text: %s,\n  message_replies_view.message_replies_view_parts_uri: %s,\n  message_replies_view.message_replies_view_parts_content_type: %s,\n  message_replies_view.message_replies_view_parts_file_name: %s,\n  message_replies_view.message_replies_view_parts_duration: %s,\n  message_replies_view.message_replies_view_parts_parts__ROWID: %s,\n  message_replies_view.message_replies_view_link_preview_trigger_url: %s,\n  message_replies_view.message_replies_view_link_preview_expiration_time_millis: %s,\n  message_replies_view.message_replies_view_link_preview_link_title: %s,\n  message_replies_view.message_replies_view_link_preview_link_image_url: %s,\n  message_replies_view.message_replies_view_link_preview_link_preview_failed: %s,\n  profiles_table.profiles_table_display_name: %s,\n  message_captions.message_captions_caption: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, "REDACTED", aL, valueOf36, aL2, aK, aL3, aK2, aK3, aI, aI2, valueOf37, valueOf38, aJ, valueOf39, aK4, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, aK5, valueOf46, aK6, aI3, aI4, aL4, "REDACTED", valueOf47, concat, "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL")), aM(this.ao), aJ(this.ap), aL(this.aq), aL(this.ar), aJ(this.as), aL(this.at), String.valueOf(this.au), aM(this.av), aJ(this.aw), aK(this.ax), aK(this.ay), aM(this.az), String.valueOf(this.aA), String.valueOf(this.aB), String.valueOf(this.aC), aK(this.aD), String.valueOf(this.aE), String.valueOf(this.aF), String.valueOf(this.aG), String.valueOf(this.aH), String.valueOf(this.aI), String.valueOf(this.aJ), aJ(this.aK), String.valueOf(this.aM), String.valueOf(this.aN), String.valueOf(this.aO), String.valueOf(this.aP), String.valueOf(this.aQ), String.valueOf(this.aR), String.valueOf(this.aS), String.valueOf(this.aT), String.valueOf(this.aU), String.valueOf(this.aV), String.valueOf(this.aW), String.valueOf(this.aX), String.valueOf(this.aY), String.valueOf(this.aZ), String.valueOf(this.ba), String.valueOf(this.bb), String.valueOf(this.bc), String.valueOf(this.bd), String.valueOf(this.bf), String.valueOf(this.bg), aJ(this.bh), aJ(this.bi), aJ(this.bj), aK(this.bk), aJ(this.bl), String.valueOf(this.bn), aJ(this.bo), aJ(this.bp), aJ(this.bq), aL(this.br), aL(this.bs), aL(this.bt), aL(this.bu), aL(this.bv), aI(this.bw), aI(this.bx), aI(this.by), aJ(this.bz), String.valueOf(this.bB), String.valueOf(this.bC), String.valueOf(this.bD), String.valueOf(this.bE), String.valueOf(this.bF), String.valueOf(this.bG), String.valueOf(this.bH), String.valueOf(this.bI), String.valueOf(this.bJ), String.valueOf(this.bK), String.valueOf(this.bM), String.valueOf(this.bN), String.valueOf(this.bO), String.valueOf(this.bQ), String.valueOf(this.bR), String.valueOf(this.bS), String.valueOf(this.bT), String.valueOf(this.bU), String.valueOf(this.bV), String.valueOf(this.bW), String.valueOf(this.bX), String.valueOf(this.bY), String.valueOf(this.bZ), String.valueOf(this.ca), aL(this.cb), aK(this.cc), aL(this.cd), aL(this.ce), aJ(this.cf), String.valueOf(this.ch), String.valueOf(this.ci), String.valueOf(this.cj), String.valueOf(this.ck), String.valueOf(this.cl), String.valueOf(this.cm), String.valueOf(this.cn), String.valueOf(this.co), String.valueOf(this.cp), aL(this.cq), aL(this.cr), aK(this.cs), aL(this.ct), aL(this.cu), aJ(this.cv), aJ(this.cw), String.valueOf(this.cx), String.valueOf(this.cy), String.valueOf(this.cz), String.valueOf(this.cA), String.valueOf(this.cB), String.valueOf(this.cD), String.valueOf(this.cE));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        bjjn.c().intValue();
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        dteh dtehVar;
        bjje bjjeVar = (bjje) ((bjjd) dtsuVar);
        aB();
        this.cL = bjjeVar.cU();
        if (bjjeVar.di(0)) {
            this.a = bjjeVar.j();
            fY(0);
        }
        if (bjjeVar.di(1)) {
            this.b = bjjeVar.i();
            fY(1);
        }
        if (bjjeVar.di(2)) {
            this.c = bjjeVar.r();
            fY(2);
        }
        if (bjjeVar.di(3)) {
            this.d = bjjeVar.R();
            fY(3);
        }
        if (bjjeVar.di(4)) {
            this.e = bjjeVar.f();
            fY(4);
        }
        if (bjjeVar.di(5)) {
            this.f = bjjeVar.c();
            fY(5);
        }
        if (bjjeVar.di(6)) {
            this.g = bjjeVar.e();
            fY(6);
        }
        if (bjjeVar.di(7)) {
            this.h = bjjeVar.A();
            fY(7);
        }
        if (bjjeVar.di(8)) {
            this.i = bjjeVar.bj();
            fY(8);
        }
        if (bjjeVar.di(9)) {
            this.j = bjjeVar.bm();
            fY(9);
        }
        if (bjjeVar.di(10)) {
            this.k = bjjeVar.h();
            fY(10);
        }
        if (bjjeVar.di(11)) {
            this.l = bjjeVar.F();
            fY(11);
        }
        if (bjjeVar.di(12)) {
            this.m = bjjeVar.S();
            fY(12);
        }
        if (bjjeVar.di(13)) {
            this.n = bjjeVar.aP();
            fY(13);
        }
        if (bjjeVar.di(14)) {
            this.o = bjjeVar.N();
            fY(14);
        }
        if (bjjeVar.di(15)) {
            this.p = bjjeVar.O();
            fY(15);
        }
        if (bjjeVar.di(16)) {
            this.q = bjjeVar.o();
            fY(16);
        }
        if (bjjeVar.di(17)) {
            this.r = bjjeVar.d();
            fY(17);
        }
        if (bjjeVar.di(18)) {
            this.s = bjjeVar.q();
            fY(18);
        }
        if (bjjeVar.di(19)) {
            this.t = bjjeVar.ae();
            fY(19);
        }
        if (bjjeVar.di(20)) {
            this.u = bjjeVar.C();
            fY(20);
        }
        if (bjjeVar.di(21)) {
            this.v = bjjeVar.m();
            fY(21);
        }
        if (bjjeVar.di(22)) {
            this.w = bjjeVar.be();
            fY(22);
        }
        if (bjjeVar.di(23)) {
            this.x = bjjeVar.P();
            fY(23);
        }
        if (bjjeVar.di(24)) {
            this.y = bjjeVar.E();
            fY(24);
        }
        if (bjjeVar.di(25)) {
            this.z = bjjeVar.aY();
            fY(25);
        }
        if (bjjeVar.di(26)) {
            this.A = bjjeVar.av();
            fY(26);
        }
        if (bjjeVar.di(27)) {
            this.B = bjjeVar.getString(bjjeVar.cM(27, bjjn.a));
            fY(27);
        }
        if (bjjeVar.di(28)) {
            this.C = bjjeVar.getLong(bjjeVar.cM(28, bjjn.a));
            fY(28);
        }
        if (bjjeVar.di(29)) {
            this.D = bjjeVar.ad();
            fY(29);
        }
        if (bjjeVar.di(30)) {
            this.E = bjjeVar.D();
            fY(30);
        }
        if (bjjeVar.di(31)) {
            this.F = bjjeVar.aq();
            fY(31);
        }
        if (bjjeVar.di(32)) {
            this.G = bjjeVar.ah();
            fY(32);
        }
        if (bjjeVar.di(33)) {
            this.H = bjjeVar.bb();
            fY(33);
        }
        if (bjjeVar.di(34)) {
            byzl[] values = byzl.values();
            int i = bjjeVar.getInt(bjjeVar.cM(34, bjjn.a));
            if (i >= values.length) {
                throw new IllegalArgumentException();
            }
            this.I = values[i];
            fY(34);
        }
        if (bjjeVar.di(35)) {
            this.J = bjjeVar.aU();
            fY(35);
        }
        if (bjjeVar.di(36)) {
            this.K = bjjeVar.t();
            fY(36);
        }
        if (bjjeVar.di(37)) {
            this.L = bjjeVar.aa();
            fY(37);
        }
        if (bjjeVar.di(38)) {
            this.M = bjjeVar.cf();
            fY(38);
        }
        if (bjjeVar.di(39)) {
            this.N = bjjeVar.bN();
            fY(39);
        }
        if (bjjeVar.di(40)) {
            this.O = bjjeVar.bW();
            fY(40);
        }
        if (bjjeVar.di(41)) {
            this.P = bjjeVar.bK();
            fY(41);
        }
        if (bjjeVar.di(42)) {
            this.Q = bjjeVar.bM();
            fY(42);
        }
        if (bjjeVar.di(43)) {
            this.R = dtub.z(bjje.ds(bjjeVar.getString(88)), bjje.dr(bjjeVar.getString(bjjeVar.cM(43, bjjn.a))));
            fY(43);
        }
        if (bjjeVar.di(44)) {
            this.S = bjjeVar.bt();
            fY(44);
        }
        if (bjjeVar.di(45)) {
            this.T = bjjeVar.g();
            fY(45);
        }
        if (bjjeVar.di(46)) {
            this.U = bjjeVar.U();
            fY(46);
        }
        if (bjjeVar.di(47)) {
            this.V = bjjeVar.bH();
            fY(47);
        }
        if (bjjeVar.di(48)) {
            this.W = bjjeVar.aj();
            fY(48);
        }
        if (bjjeVar.di(49)) {
            this.X = bjjeVar.bQ();
            fY(49);
        }
        if (bjjeVar.di(50)) {
            this.Y = bjjeVar.X();
            fY(50);
        }
        if (bjjeVar.di(51)) {
            this.Z = bjjeVar.ag();
            fY(51);
        }
        if (bjjeVar.di(52)) {
            this.aa = bjjeVar.af();
            fY(52);
        }
        if (bjjeVar.di(53)) {
            this.ab = bjjeVar.M();
            fY(53);
        }
        if (bjjeVar.di(54)) {
            this.ac = bjjeVar.v();
            fY(54);
        }
        if (bjjeVar.di(55)) {
            this.ad = bjjeVar.u();
            fY(55);
        }
        if (bjjeVar.di(56)) {
            this.ae = bjjeVar.bL();
            fY(56);
        }
        if (bjjeVar.di(57)) {
            this.af = bjjeVar.aV();
            fY(57);
        }
        if (bjjeVar.di(58)) {
            this.ag = bjjeVar.bJ();
            fY(58);
        }
        if (bjjeVar.di(59)) {
            this.ah = bjjeVar.bu();
            fY(59);
        }
        if (bjjeVar.di(60)) {
            this.ai = bjjeVar.bp();
            fY(60);
        }
        if (bjjeVar.di(61)) {
            this.aj = bjjeVar.bU();
            fY(61);
        }
        if (bjjeVar.di(62)) {
            this.ak = bjjeVar.bT();
            fY(62);
        }
        if (bjjeVar.di(63)) {
            this.al = bjjeVar.au();
            fY(63);
        }
        if (bjjeVar.di(64)) {
            this.am = bjjeVar.bo();
            fY(64);
        }
        if (bjjeVar.di(65)) {
            this.an = bjjeVar.bn();
            fY(65);
        }
        if (bjjeVar.di(66)) {
            this.ao = bjjeVar.cm();
            fY(66);
        }
        if (bjjeVar.di(67)) {
            this.ap = bjjeVar.bv();
            fY(67);
        }
        if (bjjeVar.di(68)) {
            this.aq = bjjeVar.bY();
            fY(68);
        }
        if (bjjeVar.di(69)) {
            this.ar = bjjeVar.bZ();
            fY(69);
        }
        if (bjjeVar.di(70)) {
            this.as = bjjeVar.bx();
            fY(70);
        }
        if (bjjeVar.di(71)) {
            this.at = bjjeVar.bV();
            fY(71);
        }
        if (bjjeVar.di(72)) {
            this.au = bjjeVar.at();
            fY(72);
        }
        if (bjjeVar.di(73)) {
            this.av = bjjeVar.cn();
            fY(73);
        }
        if (bjjeVar.di(74)) {
            this.aw = bjjeVar.bw();
            fY(74);
        }
        if (bjjeVar.di(75)) {
            this.ax = bjjeVar.cq();
            fY(75);
        }
        if (bjjeVar.di(76)) {
            this.ay = bjjeVar.cp();
            fY(76);
        }
        if (bjjeVar.di(77)) {
            this.az = bjjeVar.co();
            fY(77);
        }
        if (bjjeVar.di(78)) {
            this.aA = bjjeVar.bc();
            fY(78);
        }
        if (bjjeVar.di(79)) {
            this.aB = bjjeVar.L();
            fY(79);
        }
        if (bjjeVar.di(80)) {
            this.aC = bjjeVar.aN();
            fY(80);
        }
        if (bjjeVar.di(81)) {
            this.aD = bjjeVar.bR();
            fY(81);
        }
        if (bjjeVar.di(82)) {
            byte[] blob = bjjeVar.getBlob(bjjeVar.cM(82, bjjn.a));
            if (blob == null) {
                dtehVar = null;
            } else {
                try {
                    dtehVar = (dteh) eyfy.parseFrom(dteh.a, blob, eyfc.a());
                } catch (Throwable unused) {
                    dtehVar = dteh.a;
                }
            }
            this.aE = dtehVar;
            fY(82);
        }
        if (bjjeVar.di(83)) {
            this.aF = bjjeVar.am();
            fY(83);
        }
        if (bjjeVar.di(84)) {
            this.aG = bjjeVar.W();
            fY(84);
        }
        if (bjjeVar.di(85)) {
            this.aH = bjjeVar.ak();
            fY(85);
        }
        if (bjjeVar.di(86)) {
            this.aI = bjjeVar.ai();
            fY(86);
        }
        if (bjjeVar.di(87)) {
            this.aJ = bjjeVar.bk();
            fY(87);
        }
        if (bjjeVar.di(88)) {
            this.aK = bjjeVar.bC();
            fY(88);
        }
        if (bjjeVar.di(89)) {
            this.aM = bjjeVar.aR();
            fY(89);
        }
        if (bjjeVar.di(90)) {
            this.aN = bjjeVar.aX();
            fY(90);
        }
        if (bjjeVar.di(91)) {
            this.aO = bjjeVar.ax();
            fY(91);
        }
        if (bjjeVar.di(92)) {
            this.aP = bjjeVar.aC();
            fY(92);
        }
        if (bjjeVar.di(93)) {
            this.aQ = bjjeVar.aA();
            fY(93);
        }
        if (bjjeVar.di(94)) {
            this.aR = bjjeVar.V();
            fY(94);
        }
        if (bjjeVar.di(95)) {
            this.aS = bjjeVar.H();
            fY(95);
        }
        if (bjjeVar.di(96)) {
            this.aT = bjjeVar.aO();
            fY(96);
        }
        if (bjjeVar.di(97)) {
            this.aU = bjjeVar.w();
            fY(97);
        }
        if (bjjeVar.di(98)) {
            this.aV = bjjeVar.x();
            fY(98);
        }
        if (bjjeVar.di(99)) {
            this.aW = bjjeVar.z();
            fY(99);
        }
        if (bjjeVar.di(100)) {
            this.aX = bjjeVar.bd();
            fY(100);
        }
        if (bjjeVar.di(EnergyProfile.EVCONNECTOR_TYPE_OTHER)) {
            this.aY = bjjeVar.B();
            fY(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
        }
        if (bjjeVar.di(102)) {
            this.aZ = bjjeVar.bf();
            fY(102);
        }
        if (bjjeVar.di(103)) {
            this.ba = bjjeVar.al();
            fY(103);
        }
        if (bjjeVar.di(104)) {
            this.bb = bjjeVar.I();
            fY(104);
        }
        if (bjjeVar.di(105)) {
            this.bc = bjjeVar.ao();
            fY(105);
        }
        if (bjjeVar.di(106)) {
            this.bd = bjjeVar.ap();
            fY(106);
        }
        if (bjjeVar.di(107)) {
            this.bf = bjjeVar.aF();
            fY(107);
        }
        if (bjjeVar.di(108)) {
            this.bg = bjjeVar.ab();
            fY(108);
        }
        if (bjjeVar.di(109)) {
            this.bh = bjjeVar.bz();
            fY(109);
        }
        if (bjjeVar.di(110)) {
            this.bi = bjjeVar.bG();
            fY(110);
        }
        if (bjjeVar.di(111)) {
            this.bj = bjjeVar.bF();
            fY(111);
        }
        if (bjjeVar.di(112)) {
            this.bk = bjjeVar.bS();
            fY(112);
        }
        if (bjjeVar.di(113)) {
            this.bl = bjjeVar.bE();
            fY(113);
        }
        if (bjjeVar.di(114)) {
            this.bn = bjjeVar.ac();
            fY(114);
        }
        if (bjjeVar.di(115)) {
            this.bo = bjjeVar.bA();
            fY(115);
        }
        if (bjjeVar.di(116)) {
            this.bp = bjjeVar.bI();
            fY(116);
        }
        if (bjjeVar.di(117)) {
            this.bq = dtub.B(null, bjje.ds(bjjeVar.getString(bjjeVar.cM(117, bjjn.a))));
            fY(117);
        }
        if (bjjeVar.di(118)) {
            this.br = bjjeVar.ci();
            fY(118);
        }
        if (bjjeVar.di(119)) {
            this.bs = bjjeVar.cl();
            fY(119);
        }
        if (bjjeVar.di(120)) {
            this.bt = bjjeVar.cj();
            fY(120);
        }
        if (bjjeVar.di(121)) {
            this.bu = bjjeVar.ck();
            fY(121);
        }
        if (bjjeVar.di(122)) {
            this.bv = bjjeVar.cd();
            fY(122);
        }
        if (bjjeVar.di(123)) {
            this.bw = bjjeVar.bq();
            fY(123);
        }
        if (bjjeVar.di(124)) {
            this.bx = bjjeVar.br();
            fY(124);
        }
        if (bjjeVar.di(125)) {
            this.by = bjjeVar.bs();
            fY(125);
        }
        if (bjjeVar.di(126)) {
            this.bz = bjjeVar.bB();
            fY(126);
        }
        if (bjjeVar.di(127)) {
            this.bB = bjjeVar.Z();
            fY(127);
        }
        if (bjjeVar.di(128)) {
            this.bC = bjjeVar.ba();
            fY(128);
        }
        if (bjjeVar.di(129)) {
            this.bD = bjjeVar.J();
            fY(129);
        }
        if (bjjeVar.di(130)) {
            this.bE = bjjeVar.aL();
            fY(130);
        }
        if (bjjeVar.di(131)) {
            this.bF = bjjeVar.aH();
            fY(131);
        }
        if (bjjeVar.di(132)) {
            this.bG = bjjeVar.aJ();
            fY(132);
        }
        if (bjjeVar.di(133)) {
            this.bH = bjjeVar.aI();
            fY(133);
        }
        if (bjjeVar.di(134)) {
            this.bI = bjjeVar.aG();
            fY(134);
        }
        if (bjjeVar.di(135)) {
            this.bJ = bjjeVar.bi();
            fY(135);
        }
        if (bjjeVar.di(136)) {
            this.bK = bjjeVar.bg();
            fY(136);
        }
        if (bjjeVar.di(137)) {
            this.bM = bjjeVar.aQ();
            fY(137);
        }
        if (bjjeVar.di(138)) {
            this.bN = bjjeVar.aw();
            fY(138);
        }
        if (bjjeVar.di(139)) {
            this.bO = bjjeVar.T();
            fY(139);
        }
        if (bjjeVar.di(140)) {
            this.bQ = bjjeVar.aT();
            fY(140);
        }
        if (bjjeVar.di(141)) {
            this.bR = bjjeVar.y();
            fY(141);
        }
        if (bjjeVar.di(142)) {
            this.bS = bjjeVar.s();
            fY(142);
        }
        if (bjjeVar.di(143)) {
            this.bT = bjjeVar.p();
            fY(143);
        }
        if (bjjeVar.di(144)) {
            this.bU = bjjeVar.aW();
            fY(144);
        }
        if (bjjeVar.di(145)) {
            this.bV = bjjeVar.bl();
            fY(145);
        }
        if (bjjeVar.di(146)) {
            this.bW = bjjeVar.ar();
            fY(146);
        }
        if (bjjeVar.di(147)) {
            this.bX = bjjeVar.n();
            fY(147);
        }
        if (bjjeVar.di(148)) {
            this.bY = bjjeVar.aZ();
            fY(148);
        }
        if (bjjeVar.di(149)) {
            this.bZ = bjjeVar.l();
            fY(149);
        }
        if (bjjeVar.di(150)) {
            this.ca = bjjeVar.an();
            fY(150);
        }
        if (bjjeVar.di(151)) {
            this.cb = bjjeVar.ce();
            fY(151);
        }
        if (bjjeVar.di(152)) {
            this.cc = bjjeVar.bP();
            fY(152);
        }
        if (bjjeVar.di(153)) {
            this.cd = bjjeVar.ch();
            fY(153);
        }
        if (bjjeVar.di(154)) {
            this.ce = bjjeVar.cc();
            fY(154);
        }
        if (bjjeVar.di(155)) {
            this.cf = dtub.B(bjje.ds(bjjeVar.getString(155)), bjje.ds(bjjeVar.getString(bjjeVar.cM(155, bjjn.a))));
            fY(155);
        }
        if (bjjeVar.di(156)) {
            this.ch = bjjeVar.k();
            fY(156);
        }
        if (bjjeVar.di(157)) {
            this.ci = bjjeVar.Y();
            fY(157);
        }
        if (bjjeVar.di(158)) {
            this.cj = bjjeVar.Q();
            fY(158);
        }
        if (bjjeVar.di(159)) {
            this.ck = bjjeVar.aE();
            fY(159);
        }
        if (bjjeVar.di(160)) {
            this.cl = bjjeVar.G();
            fY(160);
        }
        if (bjjeVar.di(161)) {
            this.cm = bjjeVar.aS();
            fY(161);
        }
        if (bjjeVar.di(162)) {
            this.cn = bjjeVar.ay();
            fY(162);
        }
        if (bjjeVar.di(163)) {
            this.co = bjjeVar.aD();
            fY(163);
        }
        if (bjjeVar.di(164)) {
            this.cp = bjjeVar.aB();
            fY(164);
        }
        if (bjjeVar.di(165)) {
            this.cq = bjjeVar.cb();
            fY(165);
        }
        if (bjjeVar.di(166)) {
            this.cr = bjjeVar.cg();
            fY(166);
        }
        if (bjjeVar.di(167)) {
            this.cs = bjjeVar.bO();
            fY(167);
        }
        if (bjjeVar.di(168)) {
            this.ct = bjjeVar.bX();
            fY(168);
        }
        if (bjjeVar.di(169)) {
            this.cu = bjjeVar.ca();
            fY(169);
        }
        if (bjjeVar.di(170)) {
            this.cv = bjjeVar.by();
            fY(170);
        }
        if (bjjeVar.di(171)) {
            this.cw = bjjeVar.bD();
            fY(171);
        }
        if (bjjeVar.di(172)) {
            this.cx = bjjeVar.getString(bjjeVar.cM(172, bjjn.a));
            fY(172);
        }
        if (bjjeVar.di(173)) {
            this.cy = bjjeVar.K();
            fY(173);
        }
        if (bjjeVar.di(174)) {
            this.cz = bjjeVar.aM();
            fY(174);
        }
        if (bjjeVar.di(175)) {
            this.cA = bjjeVar.aK();
            fY(175);
        }
        if (bjjeVar.di(176)) {
            this.cB = bjjeVar.bh();
            fY(176);
        }
        if (bjjeVar.di(177)) {
            this.cD = bjjeVar.az();
            fY(177);
        }
        if (bjjeVar.di(178)) {
            this.cE = bjjeVar.as();
            fY(178);
        }
        i();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bigm)) {
            return false;
        }
        bigm bigmVar = (bigm) obj;
        return super.aD(bigmVar.cL) && Objects.equals(this.a, bigmVar.a) && Objects.equals(this.b, bigmVar.b) && Objects.equals(this.c, bigmVar.c) && this.d == bigmVar.d && this.e == bigmVar.e && this.f == bigmVar.f && this.g == bigmVar.g && this.h == bigmVar.h && this.i == bigmVar.i && this.j == bigmVar.j && Objects.equals(this.k, bigmVar.k) && this.l == bigmVar.l && this.m == bigmVar.m && Objects.equals(this.n, bigmVar.n) && this.o == bigmVar.o && this.p == bigmVar.p && Objects.equals(this.q, bigmVar.q) && this.r == bigmVar.r && Objects.equals(this.s, bigmVar.s) && Objects.equals(this.t, bigmVar.t) && this.u == bigmVar.u && this.v == bigmVar.v && this.w == bigmVar.w && this.x == bigmVar.x && this.y == bigmVar.y && Objects.equals(this.z, bigmVar.z) && Objects.equals(this.A, bigmVar.A) && Objects.equals(this.B, bigmVar.B) && this.C == bigmVar.C && Objects.equals(this.D, bigmVar.D) && this.E == bigmVar.E && this.F == bigmVar.F && this.G == bigmVar.G && Objects.equals(this.H, bigmVar.H) && this.I == bigmVar.I && Objects.equals(this.J, bigmVar.J) && Arrays.equals(this.K, bigmVar.K) && Objects.equals(this.L, bigmVar.L) && Arrays.equals(this.M, bigmVar.M) && Arrays.equals(this.N, bigmVar.N) && Arrays.equals(this.O, bigmVar.O) && Arrays.equals(this.P, bigmVar.P) && Arrays.equals(this.Q, bigmVar.Q) && Arrays.equals(this.R, bigmVar.R) && Arrays.equals(this.S, bigmVar.S) && this.T == bigmVar.T && Objects.equals(this.U, bigmVar.U) && Arrays.equals(this.V, bigmVar.V) && this.W == bigmVar.W && Arrays.equals(this.X, bigmVar.X) && Objects.equals(this.Y, bigmVar.Y) && Objects.equals(this.Z, bigmVar.Z) && Objects.equals(this.aa, bigmVar.aa) && this.ab == bigmVar.ab && this.ac == bigmVar.ac && this.ad == bigmVar.ad && Arrays.equals(this.ae, bigmVar.ae) && Objects.equals(this.af, bigmVar.af) && Arrays.equals(this.ag, bigmVar.ag) && Arrays.equals(this.ah, bigmVar.ah) && Arrays.equals(this.ai, bigmVar.ai) && Arrays.equals(this.aj, bigmVar.aj) && Arrays.equals(this.ak, bigmVar.ak) && Objects.equals(this.al, bigmVar.al) && Arrays.equals(this.am, bigmVar.am) && Arrays.equals(this.an, bigmVar.an) && Arrays.equals(this.ao, bigmVar.ao) && Arrays.equals(this.ap, bigmVar.ap) && Arrays.equals(this.aq, bigmVar.aq) && Arrays.equals(this.ar, bigmVar.ar) && Arrays.equals(this.as, bigmVar.as) && Arrays.equals(this.at, bigmVar.at) && Objects.equals(this.au, bigmVar.au) && Arrays.equals(this.av, bigmVar.av) && Arrays.equals(this.aw, bigmVar.aw) && Arrays.deepEquals(this.ax, bigmVar.ax) && Arrays.deepEquals(this.ay, bigmVar.ay) && Arrays.equals(this.az, bigmVar.az) && this.aA == bigmVar.aA && this.aB == bigmVar.aB && Objects.equals(this.aC, bigmVar.aC) && Arrays.equals(this.aD, bigmVar.aD) && Objects.equals(this.aE, bigmVar.aE) && this.aF == bigmVar.aF && Objects.equals(this.aG, bigmVar.aG) && this.aH == bigmVar.aH && this.aI == bigmVar.aI && this.aJ == bigmVar.aJ && Arrays.equals(this.aK, bigmVar.aK) && Objects.equals(this.aM, bigmVar.aM) && Objects.equals(this.aN, bigmVar.aN) && Objects.equals(this.aO, bigmVar.aO) && Objects.equals(this.aP, bigmVar.aP) && Objects.equals(this.aQ, bigmVar.aQ) && Objects.equals(this.aR, bigmVar.aR) && this.aS == bigmVar.aS && Objects.equals(this.aT, bigmVar.aT) && this.aU == bigmVar.aU && this.aV == bigmVar.aV && this.aW == bigmVar.aW && this.aX == bigmVar.aX && this.aY == bigmVar.aY && this.aZ == bigmVar.aZ && this.ba == bigmVar.ba && this.bb == bigmVar.bb && this.bc == bigmVar.bc && this.bd == bigmVar.bd && Objects.equals(this.bf, bigmVar.bf) && Objects.equals(this.bg, bigmVar.bg) && Arrays.equals(this.bh, bigmVar.bh) && Arrays.equals(this.bi, bigmVar.bi) && Arrays.equals(this.bj, bigmVar.bj) && Arrays.equals(this.bk, bigmVar.bk) && Arrays.equals(this.bl, bigmVar.bl) && Objects.equals(this.bn, bigmVar.bn) && Arrays.equals(this.bo, bigmVar.bo) && Arrays.equals(this.bp, bigmVar.bp) && Arrays.equals(this.bq, bigmVar.bq) && Arrays.equals(this.br, bigmVar.br) && Arrays.equals(this.bs, bigmVar.bs) && Arrays.equals(this.bt, bigmVar.bt) && Arrays.equals(this.bu, bigmVar.bu) && Arrays.equals(this.bv, bigmVar.bv) && Arrays.equals(this.bw, bigmVar.bw) && Arrays.equals(this.bx, bigmVar.bx) && Arrays.equals(this.by, bigmVar.by) && Arrays.equals(this.bz, bigmVar.bz) && Objects.equals(this.bB, bigmVar.bB) && Objects.equals(this.bC, bigmVar.bC) && this.bD == bigmVar.bD && Objects.equals(this.bE, bigmVar.bE) && Objects.equals(this.bF, bigmVar.bF) && Objects.equals(this.bG, bigmVar.bG) && Objects.equals(this.bH, bigmVar.bH) && Objects.equals(this.bI, bigmVar.bI) && this.bJ == bigmVar.bJ && this.bK == bigmVar.bK && Objects.equals(this.bM, bigmVar.bM) && Objects.equals(this.bN, bigmVar.bN) && Objects.equals(this.bO, bigmVar.bO) && Objects.equals(this.bQ, bigmVar.bQ) && this.bR == bigmVar.bR && this.bS == bigmVar.bS && Objects.equals(this.bT, bigmVar.bT) && Objects.equals(this.bU, bigmVar.bU) && this.bV == bigmVar.bV && Objects.equals(this.bW, bigmVar.bW) && Objects.equals(this.bX, bigmVar.bX) && Objects.equals(this.bY, bigmVar.bY) && Objects.equals(this.bZ, bigmVar.bZ) && Objects.equals(this.ca, bigmVar.ca) && Arrays.equals(this.cb, bigmVar.cb) && Arrays.equals(this.cc, bigmVar.cc) && Arrays.equals(this.cd, bigmVar.cd) && Arrays.equals(this.ce, bigmVar.ce) && Arrays.equals(this.cf, bigmVar.cf) && Objects.equals(this.ch, bigmVar.ch) && Objects.equals(this.ci, bigmVar.ci) && this.cj == bigmVar.cj && Objects.equals(this.ck, bigmVar.ck) && this.cl == bigmVar.cl && Objects.equals(this.cm, bigmVar.cm) && Objects.equals(this.cn, bigmVar.cn) && Objects.equals(this.co, bigmVar.co) && Objects.equals(this.cp, bigmVar.cp) && Arrays.equals(this.cq, bigmVar.cq) && Arrays.equals(this.cr, bigmVar.cr) && Arrays.equals(this.cs, bigmVar.cs) && Arrays.equals(this.ct, bigmVar.ct) && Arrays.equals(this.cu, bigmVar.cu) && Arrays.equals(this.cv, bigmVar.cv) && Arrays.equals(this.cw, bigmVar.cw) && Objects.equals(this.cx, bigmVar.cx) && this.cy == bigmVar.cy && Objects.equals(this.cz, bigmVar.cz) && Objects.equals(this.cA, bigmVar.cA) && this.cB == bigmVar.cB && Objects.equals(this.cD, bigmVar.cD) && Objects.equals(this.cE, bigmVar.cE);
    }

    public final int f() {
        az(141, "conv_type");
        return this.bR;
    }

    public final String g() {
        az(177, "display_name");
        return this.cD;
    }

    public final String h() {
        az(140, "participant_normalized_destination");
        return this.bQ;
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
        String str8 = this.J;
        Integer valueOf23 = Integer.valueOf(Arrays.hashCode(this.K));
        MessageIdType messageIdType2 = this.L;
        Integer valueOf24 = Integer.valueOf(Arrays.hashCode(this.M));
        Integer valueOf25 = Integer.valueOf(Arrays.hashCode(this.N));
        Integer valueOf26 = Integer.valueOf(Arrays.hashCode(this.O));
        Integer valueOf27 = Integer.valueOf(Arrays.hashCode(this.P));
        Integer valueOf28 = Integer.valueOf(Arrays.hashCode(this.Q));
        Integer valueOf29 = Integer.valueOf(Arrays.hashCode(this.R));
        Integer valueOf30 = Integer.valueOf(Arrays.hashCode(this.S));
        Long valueOf31 = Long.valueOf(this.T);
        Uri uri2 = this.U;
        Integer valueOf32 = Integer.valueOf(Arrays.hashCode(this.V));
        byzc byzcVar = this.W;
        Integer valueOf33 = Integer.valueOf(byzcVar == null ? 0 : byzcVar.ordinal());
        Integer valueOf34 = Integer.valueOf(Arrays.hashCode(this.X));
        ConversationIdType conversationIdType2 = this.Y;
        byyp byypVar = this.Z;
        byyp byypVar2 = this.aa;
        Long valueOf35 = Long.valueOf(this.ab);
        Double valueOf36 = Double.valueOf(this.ac);
        Double valueOf37 = Double.valueOf(this.ad);
        Integer valueOf38 = Integer.valueOf(Arrays.hashCode(this.ae));
        String str9 = this.af;
        Integer valueOf39 = Integer.valueOf(Arrays.hashCode(this.ag));
        Integer valueOf40 = Integer.valueOf(Arrays.hashCode(this.ah));
        Integer valueOf41 = Integer.valueOf(Arrays.hashCode(this.ai));
        Integer valueOf42 = Integer.valueOf(Arrays.hashCode(this.aj));
        Integer valueOf43 = Integer.valueOf(Arrays.hashCode(this.ak));
        String str10 = this.al;
        Integer valueOf44 = Integer.valueOf(Arrays.hashCode(this.am));
        Integer valueOf45 = Integer.valueOf(Arrays.hashCode(this.an));
        Integer valueOf46 = Integer.valueOf(Arrays.hashCode(this.ao));
        Integer valueOf47 = Integer.valueOf(Arrays.hashCode(this.ap));
        Integer valueOf48 = Integer.valueOf(Arrays.hashCode(this.aq));
        Integer valueOf49 = Integer.valueOf(Arrays.hashCode(this.ar));
        Integer valueOf50 = Integer.valueOf(Arrays.hashCode(this.as));
        Integer valueOf51 = Integer.valueOf(Arrays.hashCode(this.at));
        String str11 = this.au;
        Integer valueOf52 = Integer.valueOf(Arrays.hashCode(this.av));
        Integer valueOf53 = Integer.valueOf(Arrays.hashCode(this.aw));
        Integer valueOf54 = Integer.valueOf(Arrays.hashCode(this.ax));
        Integer valueOf55 = Integer.valueOf(Arrays.hashCode(this.ay));
        Integer valueOf56 = Integer.valueOf(Arrays.hashCode(this.az));
        Boolean valueOf57 = Boolean.valueOf(this.aA);
        Long valueOf58 = Long.valueOf(this.aB);
        String str12 = this.aC;
        Integer valueOf59 = Integer.valueOf(Arrays.hashCode(this.aD));
        dteh dtehVar = this.aE;
        byzo byzoVar = this.aF;
        Integer valueOf60 = Integer.valueOf(byzoVar == null ? 0 : byzoVar.ordinal());
        awap awapVar = this.aG;
        byzh byzhVar = this.aH;
        Integer valueOf61 = Integer.valueOf(byzhVar == null ? 0 : byzhVar.ordinal());
        byyz byyzVar = this.aI;
        Integer valueOf62 = Integer.valueOf(byyzVar == null ? 0 : byyzVar.ordinal());
        Boolean valueOf63 = Boolean.valueOf(this.aJ);
        Integer valueOf64 = Integer.valueOf(Arrays.hashCode(this.aK));
        String str13 = this.aM;
        String str14 = this.aN;
        String str15 = this.aO;
        String str16 = this.aP;
        String str17 = this.aQ;
        Uri uri3 = this.aR;
        Long valueOf65 = Long.valueOf(this.aS);
        String str18 = this.aT;
        Integer valueOf66 = Integer.valueOf(this.aU);
        Integer valueOf67 = Integer.valueOf(this.aV);
        Integer valueOf68 = Integer.valueOf(this.aW);
        Boolean valueOf69 = Boolean.valueOf(this.aX);
        Integer valueOf70 = Integer.valueOf(this.aY);
        Boolean valueOf71 = Boolean.valueOf(this.aZ);
        byzi byziVar2 = this.ba;
        return Objects.hash(dtsqVar3, messageIdType, conversationIdType, str, valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, uri, valueOf8, valueOf9, str2, valueOf10, valueOf11, str3, valueOf12, str4, bdhgVar, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, str5, str6, str7, valueOf18, bdhgVar2, valueOf19, valueOf20, valueOf21, fjayVar, valueOf22, str8, valueOf23, messageIdType2, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, uri2, valueOf32, valueOf33, valueOf34, conversationIdType2, byypVar, byypVar2, valueOf35, valueOf36, valueOf37, valueOf38, str9, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, str10, valueOf44, valueOf45, valueOf46, valueOf47, valueOf48, valueOf49, valueOf50, valueOf51, str11, valueOf52, valueOf53, valueOf54, valueOf55, valueOf56, valueOf57, valueOf58, str12, valueOf59, dtehVar, valueOf60, awapVar, valueOf61, valueOf62, valueOf63, valueOf64, str13, str14, str15, str16, str17, uri3, valueOf65, str18, valueOf66, valueOf67, valueOf68, valueOf69, valueOf70, valueOf71, Integer.valueOf(byziVar2 == null ? 0 : byziVar2.ordinal()), Long.valueOf(this.bb), this.bc, this.bd, this.bf, this.bg, Integer.valueOf(Arrays.hashCode(this.bh)), Integer.valueOf(Arrays.hashCode(this.bi)), Integer.valueOf(Arrays.hashCode(this.bj)), Integer.valueOf(Arrays.hashCode(this.bk)), Integer.valueOf(Arrays.hashCode(this.bl)), this.bn, Integer.valueOf(Arrays.hashCode(this.bo)), Integer.valueOf(Arrays.hashCode(this.bp)), Integer.valueOf(Arrays.hashCode(this.bq)), Integer.valueOf(Arrays.hashCode(this.br)), Integer.valueOf(Arrays.hashCode(this.bs)), Integer.valueOf(Arrays.hashCode(this.bt)), Integer.valueOf(Arrays.hashCode(this.bu)), Integer.valueOf(Arrays.hashCode(this.bv)), Integer.valueOf(Arrays.hashCode(this.bw)), Integer.valueOf(Arrays.hashCode(this.bx)), Integer.valueOf(Arrays.hashCode(this.by)), Integer.valueOf(Arrays.hashCode(this.bz)), this.bB, this.bC, Long.valueOf(this.bD), this.bE, this.bF, this.bG, this.bH, this.bI, Boolean.valueOf(this.bJ), Boolean.valueOf(this.bK), this.bM, this.bN, this.bO, this.bQ, Integer.valueOf(this.bR), Boolean.valueOf(this.bS), this.bT, this.bU, Boolean.valueOf(this.bV), this.bW, this.bX, this.bY, this.bZ, this.ca, Integer.valueOf(Arrays.hashCode(this.cb)), Integer.valueOf(Arrays.hashCode(this.cc)), Integer.valueOf(Arrays.hashCode(this.cd)), Integer.valueOf(Arrays.hashCode(this.ce)), Integer.valueOf(Arrays.hashCode(this.cf)), this.ch, this.ci, Long.valueOf(this.cj), this.ck, Integer.valueOf(this.cl), this.cm, this.cn, this.co, this.cp, Integer.valueOf(Arrays.hashCode(this.cq)), Integer.valueOf(Arrays.hashCode(this.cr)), Integer.valueOf(Arrays.hashCode(this.cs)), Integer.valueOf(Arrays.hashCode(this.ct)), Integer.valueOf(Arrays.hashCode(this.cu)), Integer.valueOf(Arrays.hashCode(this.cv)), Integer.valueOf(Arrays.hashCode(this.cw)), this.cx, Long.valueOf(this.cy), this.cz, this.cA, Boolean.valueOf(this.cB), this.cD, this.cE, null);
    }

    public final void i() {
        int length;
        String str;
        int length2;
        int intValue = bjjn.c().intValue();
        buoy c = MessagesTable.c();
        int i = 0;
        String str2 = "_id";
        az(0, "_id");
        c.v(this.a);
        az(1, "conversation_id");
        c.m(this.b);
        az(2, "sender_id");
        c.ag(this.c);
        az(3, "sent_timestamp");
        c.ai(this.d);
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
        this.cF = c.a();
        ArrayList arrayList = new ArrayList();
        long[] jArr = this.aK;
        int length3 = (jArr == null || (length2 = jArr.length) == 0 || (length2 == 1 && jArr[0] == 0)) ? 0 : l().length;
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (i2 < length3) {
            long j = jArr[i2];
            if (j != 0) {
                Long valueOf = Long.valueOf(j);
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(valueOf);
                    bvwp b = PartsTable.b();
                    b.B(l()[i2]);
                    az(37, "message_id");
                    b.J(this.L);
                    az(38, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
                    b.Y(this.M[i2]);
                    az(39, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
                    b.aa(this.N[i2]);
                    az(40, "content_type");
                    b.t(this.O[i2]);
                    if (intValue >= 10021) {
                        az(41, "original_uri");
                        b.L(this.P[i2]);
                    }
                    if (intValue >= 29060) {
                        az(42, "storage_uri");
                        b.W(this.Q[i2]);
                    }
                    az(43, "width");
                    b.ad(this.R[i2]);
                    az(44, "height");
                    b.A(this.S[i2]);
                    if (intValue >= 3010) {
                        az(45, "timestamp");
                        b.Z(this.T);
                    }
                    if (intValue >= 4020) {
                        az(46, "output_uri");
                        b.Q(this.U);
                    }
                    if (intValue >= 4020) {
                        az(47, "target_size");
                        str = str2;
                        b.X(this.V[i2]);
                    } else {
                        str = str2;
                    }
                    if (intValue >= 4020) {
                        az(48, "processing_status");
                        b.R(this.W);
                    }
                    if (intValue >= 44010) {
                        az(49, "cms_attachment_processing_status");
                        b.k(this.X[i2]);
                    }
                    az(50, "conversation_id");
                    b.u(this.Y);
                    if (intValue >= 5020) {
                        az(51, "sticker_set_id");
                        b.V(this.Z);
                    }
                    if (intValue >= 5020) {
                        az(52, "sticker_id");
                        b.U(this.aa);
                    }
                    if (intValue >= 7000) {
                        az(53, "media_modified_timestamp");
                        b.H(this.ab);
                    }
                    if (intValue >= 10005) {
                        az(54, "longitude");
                        b.F(this.ac);
                    }
                    if (intValue >= 10005) {
                        az(55, "latitude");
                        b.D(this.ad);
                    }
                    if (intValue >= 10017) {
                        az(56, "preview_content_uri");
                        b.O(this.ae[i2]);
                    }
                    if (intValue >= 10017) {
                        az(57, "preview_content_type");
                        b.N(this.af);
                    }
                    if (intValue >= 13000) {
                        az(58, "fallback_uri");
                        b.x(this.ag[i2]);
                    }
                    if (intValue >= 14010) {
                        az(59, "source");
                        b.T(this.ah[i2]);
                    }
                    if (intValue >= 17010) {
                        az(60, "bundle_index");
                        b.j(this.ai[i2]);
                    }
                    if (intValue >= 17020) {
                        az(61, "blob_id");
                        b.g(this.aj[i2]);
                    }
                    if (intValue >= 59570) {
                        az(62, "blob_gaia_email");
                        b.f(this.ak[i2]);
                    }
                    if (intValue >= 40040) {
                        az(63, "cms_full_size_blob_id");
                        b.n(this.al);
                    }
                    if (intValue >= 42010) {
                        az(64, "cms_media_encryption_key");
                        b.o(this.am);
                    }
                    if (intValue >= 42070) {
                        az(65, "cms_compressed_media_encryption_key");
                        b.m(this.an);
                    }
                    if (intValue >= 18000) {
                        az(66, "blob_upload_permanent_failure");
                        b.h(this.ao[i2]);
                    }
                    if (intValue >= 19030) {
                        az(67, "blob_upload_timestamp");
                        b.i(this.ap[i2]);
                    }
                    if (intValue >= 22060) {
                        az(68, "expressive_sticker_name");
                        b.w(this.aq[i2]);
                    }
                    if (intValue >= 26000) {
                        az(69, "file_name");
                        b.y(this.ar[i2]);
                    }
                    if (intValue >= 26040) {
                        az(70, "duration");
                        b.v(this.as[i2]);
                    }
                    if (intValue >= 27000) {
                        az(71, "compressed_blob_id");
                        b.p(this.at[i2]);
                    }
                    if (intValue >= 40040) {
                        az(72, "cms_compressed_blob_id");
                        b.l(this.au);
                    }
                    if (intValue >= 27000) {
                        az(73, "compressed_blob_upload_permanent_failure");
                        b.q(this.av[i2]);
                    }
                    if (intValue >= 27000) {
                        az(74, "compressed_blob_upload_timestamp");
                        b.r(this.aw[i2]);
                    }
                    if (intValue >= 30040) {
                        az(75, "media_encryption_key");
                        b.G(this.ax[i2]);
                    }
                    if (intValue >= 30040) {
                        az(76, "compressed_media_encryption_key");
                        b.s(this.ay[i2]);
                    }
                    if (intValue >= 52030) {
                        az(77, "missing_entry_in_telephony");
                        b.K(this.az[i2]);
                    }
                    if (intValue >= 53040) {
                        az(78, "awaiting_reverse_sync");
                        b.e(this.aA);
                    }
                    if (intValue >= 52050) {
                        az(79, "file_size_bytes");
                        b.z(this.aB);
                    }
                    if (intValue >= 52050) {
                        az(80, "local_cache_path");
                        b.E(this.aC);
                    }
                    if (intValue >= 58150) {
                        az(81, "media_send_type");
                        b.I(this.aD[i2]);
                    }
                    if (intValue >= 59470) {
                        az(82, "voice_metadata");
                        b.ac(this.aE);
                    }
                    if (intValue >= 58770) {
                        az(83, "validation_status");
                        b.ab(this.aF);
                    }
                    if (intValue >= 60080) {
                        az(84, "processing_id");
                        b.P(this.aG);
                    }
                    if (intValue >= 60230) {
                        az(85, "rich_card_media_download_failure_reason");
                        b.S(this.aH);
                    }
                    if (intValue >= 60240) {
                        az(86, "image_display_state");
                        b.C(this.aI);
                    }
                    if (intValue >= 60680) {
                        az(87, "preserve_size");
                        b.M(this.aJ);
                    }
                    arrayList.add(b.a());
                    i2++;
                    str2 = str;
                    i = 0;
                }
            }
            str = str2;
            i2++;
            str2 = str;
            i = 0;
        }
        String str3 = str2;
        this.aL = (PartsTable.BindData[]) arrayList.toArray(new PartsTable.BindData[i]);
        bvpo d = ParticipantsTable.d();
        az(89, "normalized_destination");
        d.I(this.aM);
        az(90, "send_destination");
        d.R(this.aN);
        az(91, "display_destination");
        d.q(this.aO);
        az(92, "full_name");
        d.u(this.aP);
        az(93, "first_name");
        d.t(this.aQ);
        az(94, "profile_photo_uri");
        d.N(this.aR);
        az(95, "contact_id");
        d.l(this.aS);
        az(96, "lookup_key");
        d.D(this.aT);
        az(97, "color_palette_index");
        d.h(this.aU);
        if (intValue >= 1000) {
            az(98, "color_type");
            d.i(this.aV);
        }
        if (intValue >= 10027) {
            az(99, "extended_color");
            d.s(this.aW);
        }
        az(100, "blocked");
        d.e(this.aX);
        if (intValue >= 12001) {
            az(EnergyProfile.EVCONNECTOR_TYPE_OTHER, "participant_type");
            d.J(this.aY);
        }
        if (intValue >= 24060) {
            az(102, "is_spam");
            d.y(this.aZ);
        }
        if (intValue >= 31030) {
            az(103, "latest_verification_status");
            d.C(this.ba);
        }
        if (intValue >= 35010) {
            az(104, "directory_id");
            d.p(this.bb);
        }
        if (intValue >= 59550) {
            az(105, "name_source");
            d.G(this.bc);
        }
        if (intValue >= 59550) {
            az(106, "photo_source");
            d.K(this.bd);
        }
        this.be = d.a();
        String[] strArr = boqc.a;
        bopk bopkVar = new bopk();
        bopkVar.aF();
        az(107, str3);
        String str4 = this.bf;
        bopkVar.aE(0);
        bopkVar.a = str4;
        az(108, "message_id");
        MessageIdType messageIdType = this.bg;
        bopkVar.aE(1);
        bopkVar.b = messageIdType;
        az(109, "participant_id");
        long[] jArr2 = this.bh;
        bopkVar.aE(2);
        bopkVar.c = jArr2;
        az(110, "receive_time");
        long[] jArr3 = this.bi;
        bopkVar.aE(3);
        bopkVar.d = jArr3;
        az(111, "read_time");
        long[] jArr4 = this.bj;
        bopkVar.aE(4);
        bopkVar.e = jArr4;
        az(112, "ftd_time");
        Optional[] optionalArr = this.bk;
        int i3 = bopkVar.aB;
        if (i3 < 58880) {
            dtub.w("ftd_time", i3);
        }
        bopkVar.aE(5);
        bopkVar.f = optionalArr;
        az(113, "read_reports__ROWID");
        long[] jArr5 = this.bl;
        int i4 = bopkVar.aB;
        if (i4 < 0) {
            dtub.w("read_reports.rowid", i4);
        }
        bopkVar.aE(6);
        bopkVar.g = jArr5;
        bopi bopiVar = new bopi();
        bopiVar.aC(bopkVar.aB());
        bopiVar.a = bopkVar.a;
        bopiVar.b = bopkVar.b;
        bopiVar.c = bopkVar.c;
        bopiVar.d = bopkVar.d;
        bopiVar.e = bopkVar.e;
        bopiVar.f = bopkVar.f;
        bopiVar.g = bopkVar.g;
        bopiVar.cK = bopkVar.aC();
        this.bm = bopiVar;
        String[] strArr2 = byrv.a;
        bynf bynfVar = new bynf();
        bynfVar.aF();
        az(114, "message_id");
        MessageIdType messageIdType2 = this.bn;
        bynfVar.aE(0);
        bynfVar.a = messageIdType2;
        az(115, "participant_id");
        long[] jArr6 = this.bo;
        bynfVar.aE(1);
        bynfVar.b = jArr6;
        az(116, "user_ref_datetime");
        long[] jArr7 = this.bp;
        bynfVar.aE(2);
        bynfVar.c = jArr7;
        az(117, "user_references__ROWID");
        long[] jArr8 = this.bq;
        int i5 = bynfVar.aB;
        if (i5 < 0) {
            dtub.w("user_references.rowid", i5);
        }
        bynfVar.aE(3);
        bynfVar.d = jArr8;
        az(118, "user_ref_display_name");
        String[] strArr3 = this.br;
        int i6 = bynfVar.aB;
        if (i6 < 0) {
            dtub.w("(coalesce(participants.first_name,participants.full_name,participants.display_destination))", i6);
        }
        bynfVar.aE(4);
        bynfVar.e = strArr3;
        az(119, "user_ref_profile_photo_uri");
        String[] strArr4 = this.bs;
        int i7 = bynfVar.aB;
        if (i7 < 0) {
            dtub.w("(ifnull(participants.profile_photo_uri,\"\"))", i7);
        }
        bynfVar.aE(5);
        bynfVar.f = strArr4;
        az(120, "user_ref_full_name");
        String[] strArr5 = this.bt;
        int i8 = bynfVar.aB;
        if (i8 < 0) {
            dtub.w("(ifnull(participants.full_name,\"\"))", i8);
        }
        bynfVar.aE(6);
        bynfVar.g = strArr5;
        az(121, "user_ref_lookup_key");
        String[] strArr6 = this.bu;
        int i9 = bynfVar.aB;
        if (i9 < 0) {
            dtub.w("(ifnull(participants.lookup_key,\"\"))", i9);
        }
        bynfVar.aE(7);
        bynfVar.h = strArr6;
        az(122, "normalized_destination");
        String[] strArr7 = this.bv;
        bynfVar.aE(8);
        bynfVar.i = strArr7;
        az(123, "color_palette_index");
        int[] iArr = this.bw;
        bynfVar.aE(9);
        bynfVar.j = iArr;
        az(124, "color_type");
        int[] iArr2 = this.bx;
        int i10 = bynfVar.aB;
        if (i10 < 1000) {
            dtub.w("color_type", i10);
        }
        bynfVar.aE(10);
        bynfVar.k = iArr2;
        az(125, "extended_color");
        int[] iArr3 = this.by;
        int i11 = bynfVar.aB;
        if (i11 < 10027) {
            dtub.w("extended_color", i11);
        }
        bynfVar.aE(11);
        bynfVar.l = iArr3;
        az(126, "participants__ROWID");
        long[] jArr9 = this.bz;
        int i12 = bynfVar.aB;
        if (i12 < 0) {
            dtub.w("participants.rowid", i12);
        }
        bynfVar.aE(12);
        bynfVar.m = jArr9;
        bynd byndVar = new bynd();
        byndVar.aC(bynfVar.aB());
        byndVar.a = bynfVar.a;
        byndVar.b = bynfVar.b;
        byndVar.c = bynfVar.c;
        byndVar.d = bynfVar.d;
        byndVar.e = bynfVar.e;
        byndVar.f = bynfVar.f;
        byndVar.g = bynfVar.g;
        byndVar.h = bynfVar.h;
        byndVar.i = bynfVar.i;
        byndVar.j = bynfVar.j;
        byndVar.k = bynfVar.k;
        byndVar.l = bynfVar.l;
        byndVar.m = bynfVar.m;
        byndVar.cK = bynfVar.aC();
        this.bA = byndVar;
        btor a = btqq.a();
        az(127, "message_id");
        a.m(this.bB);
        az(128, "trigger_url");
        a.n(this.bC);
        az(129, "expiration_time_millis");
        a.e(this.bD);
        az(130, "link_title");
        a.l(this.bE);
        az(131, "link_description");
        a.g(this.bF);
        az(132, "link_image_url");
        a.i(this.bG);
        az(133, "link_domain");
        a.h(this.bH);
        az(134, "link_canonical_url");
        a.f(this.bI);
        if (intValue >= 21010) {
            az(135, "link_preview_prevented");
            a.k(this.bJ);
        }
        if (intValue >= 22020) {
            az(136, "link_preview_failed");
            a.j(this.bK);
        }
        this.bL = a.a();
        byxc.a().a();
        byun a2 = byvy.a();
        az(137, "name");
        a2.g(this.bM);
        az(138, "description");
        a2.c(this.bN);
        az(139, "logo_uri");
        a2.e(this.bO);
        this.bP = a2.a();
        ArrayList arrayList2 = new ArrayList();
        long[] jArr10 = this.cf;
        int length4 = (jArr10 == null || (length = jArr10.length) == 0 || (length == 1 && jArr10[0] == 0)) ? 0 : m().length;
        HashSet hashSet2 = new HashSet();
        for (int i13 = 0; i13 < length4; i13++) {
            long j2 = jArr10[i13];
            if (j2 != 0) {
                Long valueOf2 = Long.valueOf(j2);
                if (!hashSet2.contains(valueOf2)) {
                    hashSet2.add(valueOf2);
                    byxk a3 = VmtTable.a();
                    a3.c(m()[i13]);
                    az(152, "vmt_status");
                    a3.e(this.cc[i13]);
                    az(153, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
                    a3.d(this.cd[i13]);
                    az(154, "locale");
                    a3.b(this.ce[i13]);
                    arrayList2.add(a3.a());
                }
            }
        }
        this.cg = (VmtTable.BindData[]) arrayList2.toArray(new VmtTable.BindData[0]);
        bmwt a4 = bnlv.a();
        az(156, "message_id");
        a4.o(this.ch);
        az(157, str3);
        a4.i(this.ci);
        az(158, "received_timestamp");
        a4.r(this.cj);
        az(159, str3);
        a4.j(this.ck);
        az(160, "sub_id");
        a4.s(this.cl);
        az(161, "normalized_destination");
        a4.p(this.cm);
        az(162, "display_destination");
        a4.c(this.cn);
        az(163, "full_name");
        a4.h(this.co);
        az(164, "first_name");
        a4.g(this.cp);
        az(165, str3);
        a4.k(this.cq);
        az(166, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        a4.t(this.cr);
        az(167, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        a4.v(this.cs);
        az(168, "content_type");
        a4.b(this.ct);
        az(169, "file_name");
        a4.f(this.cu);
        az(170, "duration");
        a4.d(this.cv);
        az(171, "parts__ROWID");
        a4.q(this.cw);
        az(172, "trigger_url");
        a4.u(this.cx);
        az(173, "expiration_time_millis");
        a4.e(this.cy);
        az(174, "link_title");
        a4.n(this.cz);
        az(175, "link_image_url");
        a4.l(this.cA);
        az(176, "link_preview_failed");
        a4.m(this.cB);
        this.cC = a4.a();
    }

    public final boolean j() {
        az(142, "has_ea2p_bot_recipient");
        return this.bS;
    }

    public final boolean k() {
        az(145, "rcs_session_allows_revocation");
        return this.bV;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationMessagesQuery -- REDACTED") : a();
    }
}
