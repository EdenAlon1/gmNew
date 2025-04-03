package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bori extends dtro {
    private String B;
    private String H;
    private String K;
    private String L;
    private String M;
    private long N;
    private String S;
    private byte[] T;
    private fayv V;
    private String W;
    private String X;
    private long aA;
    private String aB;
    private String aC;
    private String aD;
    private Uri aE;
    private Uri aF;
    private long aG;
    private String aH;
    private int aI;
    private int aJ;
    private int aK;
    private boolean aL;
    private String aM;
    private int aN;
    private String aO;
    private int aP;
    private int aQ;
    private String aR;
    private boolean aS;
    private int aT;
    private String aU;
    private byzi aV;
    private String aW;
    private byte[] aX;
    private long aY;
    private boolean aZ;
    private Uri aa;
    private fjay ai;
    private byzg aj;
    private byzg ak;
    private byzl al;
    private int am;
    private bdgr an;
    private cfmh ao;
    private Optional ap;
    private String aq;
    private azsu ar;
    private azsu as;
    private int at;
    private int au;
    private String av;
    private String aw;
    private String ax;
    private String ay;
    private String az;
    private byyt bA;
    private long bB;
    private long bC;
    private String bD;
    private long bE;
    private long bF;
    private String bG;
    private String bH;
    private String bI;
    private String bJ;
    private String bK;
    private azsu bL;
    private azcr bM;
    private int bN;
    private boolean bO;
    private String bP;
    private boolean bQ;
    private boolean bR;
    private String bS;
    private String bT;
    private String bU;
    private int bV;
    private long bW;
    private int bX;
    private int bY;
    private int bZ;
    private boolean ba;
    private String bb;
    private csgg bc;
    private aorb bd;
    private bdpy be;
    private cjwi bf;
    private cjwi bg;
    private cjwe bh;
    private aqkt bi;
    private boolean bj;
    private ConversationIdType bk;
    private cpxu bl;
    private String bm;
    private byyy bn;
    private String bo;
    private MessageIdType bp;
    private String bq;
    private String br;
    private Uri bs;
    private String bt;
    private boolean bu;
    private String bv;
    private String bw;
    private Uri bx;
    private String by;
    private int bz;
    private String c;
    private boolean cA;
    private ckkz cB;
    private ckte cC;
    private int cD;
    private cfmh cE;
    private cfmf cF;
    private String cG;
    private Uri cH;
    private int cI;
    private boolean ca;
    private boolean cb;
    private long cc;
    private String cd;
    private String ce;
    private boolean cf;
    private int cg;
    private long ch;
    private long ci;
    private String cj;
    private String ck;
    private String cl;
    private byte[] cm;
    private long cn;
    private long co;
    private boolean cp;
    private cknh cq;
    private boolean cr;
    private ConversationIdType cs;
    private ConversationIdType ct;
    private ayhd cu;
    private csgg cv;
    private String cw;
    private Optional cx;
    private Optional cy;
    private boolean cz;
    private String d;
    private String e;
    private String f;
    private Uri o;
    private String r;
    private String s;
    private String t;
    private String w;
    private String y;
    private MessageIdType a = bdhb.a;
    private ConversationIdType b = bdgq.a;
    private long g = 0;
    private Instant h = bdgw.b(0);
    private long i = 0;
    private int j = 0;
    private int k = 0;
    private int l = 0;
    private boolean m = false;
    private boolean n = false;
    private int p = 0;
    private long q = 0;
    private long u = 0;
    private long v = 0;
    private int x = 0;
    private azsu z = null;
    private long A = 0;
    private bdhg C = bdhg.a;
    private int D = 0;
    private byzi E = byzi.VERIFICATION_NA;
    private int F = 0;
    private boolean G = false;
    private long I = -1;
    private int J = -1;
    private String O = "";
    private long P = 0;
    private long Q = 1;
    private bdhg R = bdhg.a;
    private long U = 0;
    private MessageIdType Y = bdhb.a;
    private boolean Z = false;
    private Optional ab = bdhj.a;
    private int ac = -2;
    private csgg ad = csgg.UNKNOWN;
    private cjco ae = cjco.c;
    private byyw af = byyw.UNKNOWN;
    private int ag = 0;
    private boolean ah = false;

    protected bori() {
        byzg byzgVar = byzg.UNKNOWN;
        this.aj = byzgVar;
        this.ak = byzgVar;
        this.al = byzl.UNKNOWN;
        this.am = -1;
        this.an = bdgr.a;
        this.ao = new cfmh(0L);
        this.ap = bdhf.a();
        this.ar = null;
        this.as = null;
        this.at = -2;
        this.au = -1;
        this.aG = -1L;
        this.aI = -1;
        this.aJ = 0;
        this.aK = 0;
        this.aL = false;
        this.aN = 0;
        this.aP = 0;
        this.aQ = 0;
        this.aS = false;
        this.aT = 0;
        this.aV = byzi.VERIFICATION_NA;
        this.aY = -1L;
        this.aZ = azzr.a();
        this.ba = true;
        this.bc = csgg.UNKNOWN;
        this.bd = aorb.NOT_MODIFIED;
        this.be = bdqc.a();
        cjwi cjwiVar = cjwi.PROFILE_CONTACT_SOURCE;
        this.bf = cjwiVar;
        this.bg = cjwiVar;
        this.bh = cjwe.PREFER_PROFILE_PHOTO;
        this.bk = bdgq.a;
        this.bl = new cpxu();
        this.bn = byyy.NAME_IS_AUTOMATIC;
        this.bp = bdhb.a;
        this.bu = false;
        this.bz = 0;
        this.bA = byyt.UNARCHIVED;
        this.bB = 0L;
        this.bC = 0L;
        this.bE = -1L;
        this.bF = -1L;
        this.bL = null;
        this.bM = null;
        this.bN = 0;
        this.bO = true;
        this.bQ = true;
        this.bR = false;
        this.bV = 0;
        this.bW = -1L;
        this.bX = 0;
        this.bY = 0;
        this.bZ = 0;
        this.ca = false;
        this.cb = false;
        this.cc = 0L;
        this.cf = false;
        this.cg = 0;
        this.ch = 0L;
        this.ci = 0L;
        this.cn = 0L;
        this.co = -1L;
        this.cp = true;
        this.cq = new cknh(0L);
        this.cr = false;
        ConversationIdType conversationIdType = bdgq.a;
        this.cs = conversationIdType;
        this.ct = conversationIdType;
        this.cu = ayhd.b(0);
        this.cv = csgg.UNKNOWN;
        this.cx = bdhe.b(-1L);
        this.cy = bdhe.b(-1L);
        this.cz = false;
        this.cA = false;
        this.cC = ckte.a;
        this.cD = 0;
        this.cE = new cfmh(0L);
        this.cF = null;
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
        String valueOf36 = String.valueOf(this.J);
        String valueOf37 = String.valueOf(this.K);
        String valueOf38 = String.valueOf(this.L);
        String valueOf39 = String.valueOf(this.M);
        String valueOf40 = String.valueOf(this.N);
        String valueOf41 = String.valueOf(this.O);
        String valueOf42 = String.valueOf(this.P);
        String valueOf43 = String.valueOf(this.Q);
        String valueOf44 = String.valueOf(this.R);
        String valueOf45 = String.valueOf(this.S);
        byte[] bArr = this.T;
        String concat = "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL"));
        String valueOf46 = String.valueOf(this.U);
        String valueOf47 = String.valueOf(this.V);
        String valueOf48 = String.valueOf(this.W);
        String valueOf49 = String.valueOf(this.X);
        String valueOf50 = String.valueOf(this.Y);
        String valueOf51 = String.valueOf(this.Z);
        String valueOf52 = String.valueOf(this.aa);
        String valueOf53 = String.valueOf(this.ab);
        String valueOf54 = String.valueOf(this.ac);
        String valueOf55 = String.valueOf(this.ad);
        String valueOf56 = String.valueOf(this.ae);
        String valueOf57 = String.valueOf(this.af);
        String valueOf58 = String.valueOf(this.ag);
        String valueOf59 = String.valueOf(this.ah);
        String valueOf60 = String.valueOf(this.ai);
        String valueOf61 = String.valueOf(this.aj);
        String valueOf62 = String.valueOf(this.ak);
        String valueOf63 = String.valueOf(this.al);
        String valueOf64 = String.valueOf(this.am);
        String valueOf65 = String.valueOf(this.an);
        String valueOf66 = String.valueOf(this.ao);
        String valueOf67 = String.valueOf(this.ap);
        String valueOf68 = String.valueOf(this.aq);
        String valueOf69 = String.valueOf(this.ar);
        String valueOf70 = String.valueOf(this.as);
        String valueOf71 = String.valueOf(this.at);
        String valueOf72 = String.valueOf(this.au);
        String valueOf73 = String.valueOf(this.av);
        String valueOf74 = String.valueOf(this.aw);
        String valueOf75 = String.valueOf(this.ax);
        String valueOf76 = String.valueOf(this.ay);
        String valueOf77 = String.valueOf(this.az);
        String valueOf78 = String.valueOf(this.aA);
        String valueOf79 = String.valueOf(this.aB);
        String valueOf80 = String.valueOf(this.aC);
        String valueOf81 = String.valueOf(this.aD);
        String valueOf82 = String.valueOf(this.aE);
        String valueOf83 = String.valueOf(this.aF);
        String valueOf84 = String.valueOf(this.aG);
        String valueOf85 = String.valueOf(this.aH);
        String valueOf86 = String.valueOf(this.aI);
        String valueOf87 = String.valueOf(this.aJ);
        String valueOf88 = String.valueOf(this.aK);
        String valueOf89 = String.valueOf(this.aL);
        String valueOf90 = String.valueOf(this.aM);
        String valueOf91 = String.valueOf(this.aN);
        String valueOf92 = String.valueOf(this.aO);
        String valueOf93 = String.valueOf(this.aP);
        String valueOf94 = String.valueOf(this.aQ);
        String valueOf95 = String.valueOf(this.aR);
        String valueOf96 = String.valueOf(this.aS);
        String valueOf97 = String.valueOf(this.aT);
        String valueOf98 = String.valueOf(this.aU);
        String valueOf99 = String.valueOf(this.aV);
        String valueOf100 = String.valueOf(this.aW);
        byte[] bArr2 = this.aX;
        String concat2 = "BLOB".concat(String.valueOf(bArr2 != null ? String.valueOf(bArr2.length) : "NULL"));
        String valueOf101 = String.valueOf(this.aY);
        String valueOf102 = String.valueOf(this.aZ);
        String valueOf103 = String.valueOf(this.ba);
        String valueOf104 = String.valueOf(this.bb);
        String valueOf105 = String.valueOf(this.bc);
        String valueOf106 = String.valueOf(this.bd);
        String valueOf107 = String.valueOf(this.be);
        String valueOf108 = String.valueOf(this.bf);
        String valueOf109 = String.valueOf(this.bg);
        String valueOf110 = String.valueOf(this.bh);
        String valueOf111 = String.valueOf(this.bi);
        String valueOf112 = String.valueOf(this.bj);
        String valueOf113 = String.valueOf(this.bk);
        String valueOf114 = String.valueOf(this.bl);
        String valueOf115 = String.valueOf(this.bm);
        String valueOf116 = String.valueOf(this.bn);
        String valueOf117 = String.valueOf(this.bo);
        String valueOf118 = String.valueOf(this.bp);
        String valueOf119 = String.valueOf(this.bq);
        String valueOf120 = String.valueOf(this.br);
        String valueOf121 = String.valueOf(this.bs);
        String valueOf122 = String.valueOf(this.bt);
        String valueOf123 = String.valueOf(this.bu);
        String valueOf124 = String.valueOf(this.bv);
        String valueOf125 = String.valueOf(this.bw);
        String valueOf126 = String.valueOf(this.bx);
        String valueOf127 = String.valueOf(this.by);
        String valueOf128 = String.valueOf(this.bz);
        String valueOf129 = String.valueOf(this.bA);
        String valueOf130 = String.valueOf(this.bB);
        String valueOf131 = String.valueOf(this.bC);
        String valueOf132 = String.valueOf(this.bD);
        String valueOf133 = String.valueOf(this.bE);
        String valueOf134 = String.valueOf(this.bF);
        String valueOf135 = String.valueOf(this.bG);
        String valueOf136 = String.valueOf(this.bH);
        String valueOf137 = String.valueOf(this.bI);
        String valueOf138 = String.valueOf(this.bJ);
        String valueOf139 = String.valueOf(this.bK);
        String valueOf140 = String.valueOf(this.bL);
        String valueOf141 = String.valueOf(this.bM);
        String valueOf142 = String.valueOf(this.bN);
        String valueOf143 = String.valueOf(this.bO);
        String valueOf144 = String.valueOf(this.bP);
        String valueOf145 = String.valueOf(this.bQ);
        String valueOf146 = String.valueOf(this.bR);
        String valueOf147 = String.valueOf(this.bS);
        String valueOf148 = String.valueOf(this.bT);
        String valueOf149 = String.valueOf(this.bU);
        String valueOf150 = String.valueOf(this.bV);
        String valueOf151 = String.valueOf(this.bW);
        String valueOf152 = String.valueOf(this.bX);
        String valueOf153 = String.valueOf(this.bY);
        String valueOf154 = String.valueOf(this.bZ);
        String valueOf155 = String.valueOf(this.ca);
        String valueOf156 = String.valueOf(this.cb);
        String valueOf157 = String.valueOf(this.cc);
        String valueOf158 = String.valueOf(this.cd);
        String valueOf159 = String.valueOf(this.ce);
        String valueOf160 = String.valueOf(this.cf);
        String valueOf161 = String.valueOf(this.cg);
        String valueOf162 = String.valueOf(this.ch);
        String valueOf163 = String.valueOf(this.ci);
        String valueOf164 = String.valueOf(this.cj);
        String valueOf165 = String.valueOf(this.ck);
        String valueOf166 = String.valueOf(this.cl);
        byte[] bArr3 = this.cm;
        return String.format(locale, "UnreadQuery [messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_sender_id: %s,\n  messages.messages_sender_send_destination: %s,\n  messages.messages_msisdn_receiving_rcs_message: %s,\n  messages.messages_receiving_network_country: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_queue_insert_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_message_report_status: %s,\n  messages.messages_seen: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_message_uri: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_sms_message_size: %s,\n  messages.messages_mms_subject: %s,\n  messages.messages_mms_transaction_id: %s,\n  messages.messages_mms_content_location: %s,\n  messages.messages_mms_expiry: %s,\n  messages.messages_rcs_expiry: %s,\n  messages.messages_mms_retrieve_text: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_self_id: %s,\n  messages.messages_my_identity_foreign_key: %s,\n  messages.messages_retry_start_timestamp: %s,\n  messages.messages_cloud_sync_id: %s,\n  messages.messages_rcs_message_id_with_text_type: %s,\n  messages.messages_etouffee_status: %s,\n  messages.messages_verification_status: %s,\n  messages.messages_rcs_ui_status: %s,\n  messages.messages_is_hidden: %s,\n  messages.messages_rcs_remote_instance: %s,\n  messages.messages_rcs_file_transfer_session_id: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  messages.messages_correlation_id: %s,\n  messages.messages_cms_id: %s,\n  messages.messages_cms_last_mod_seq: %s,\n  messages.messages_web_id: %s,\n  messages.messages_usage_stats_logging_id: %s,\n  messages.messages_send_counter: %s,\n  messages.messages_original_rcs_message_id: %s,\n  messages.messages_custom_delivery_receipt_mime_type: %s,\n  messages.messages_custom_delivery_receipt_content: %s,\n  messages.messages_report_attempt_acounter: %s,\n  messages.messages_custom_headers: %s,\n  messages.messages_cms_correlation_id: %s,\n  messages.messages_group_private_participant: %s,\n  messages.messages_original_message_id: %s,\n  messages.messages_awaiting_reverse_sync: %s,\n  messages.messages_old_sms_message_uri: %s,\n  messages.messages_draft_id: %s,\n  messages.messages_result_code: %s,\n  messages.messages_cms_life_cycle: %s,\n  messages.messages_mute_priority: %s,\n  messages.messages_fallback_reason: %s,\n  messages.messages_auto_retry_counter: %s,\n  messages.messages_can_revoke_before_delivered_with_rcs: %s,\n  messages.messages_trace_id: %s,\n  messages.messages_outgoing_delivery_report_status: %s,\n  messages.messages_outgoing_read_report_status: %s,\n  messages.messages_xms_transport: %s,\n  messages.messages_message_original_protocol: %s,\n  messages.messages_satellite_datagram_id: %s,\n  messages.messages_encryption_protocol: %s,\n  messages.messages_message_persistence_id: %s,\n  participants.participants__id: %s,\n  participants.participants_my_identity_token: %s,\n  participants.participants_my_identity_token_foreign_key: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_sim_slot_id: %s,\n  participants.participants_normalized_destination: %s,\n  participants.participants_send_destination: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_comparable_destination: %s,\n  participants.participants_country_code: %s,\n  participants.participants_recipient_id: %s,\n  participants.participants_recipient_canonical_address: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  participants.participants_profile_photo_uri: %s,\n  participants.participants_contact_photo_uri: %s,\n  participants.participants_contact_id: %s,\n  participants.participants_lookup_key: %s,\n  participants.participants_color_palette_index: %s,\n  participants.participants_color_type: %s,\n  participants.participants_extended_color: %s,\n  participants.participants_blocked: %s,\n  participants.participants_subscription_name: %s,\n  participants.participants_subscription_color: %s,\n  participants.participants_contact_destination: %s,\n  participants.participants_participant_type: %s,\n  participants.participants_video_reachability: %s,\n  participants.participants_alias: %s,\n  participants.participants_is_spam: %s,\n  participants.participants_is_spam_source: %s,\n  participants.participants_cms_id: %s,\n  participants.participants_latest_verification_status: %s,\n  participants.participants_profile_photo_blob_id: %s,\n  participants.participants_profile_photo_encryption_key: %s,\n  participants.participants_directory_id: %s,\n  participants.participants_is_check_constraint_enabled_via_phenotype: %s,\n  participants.participants_is_valid_phone_number_data: %s,\n  participants.participants_duplicate_of: %s,\n  participants.participants_cms_life_cycle: %s,\n  participants.participants_norm_ui_status: %s,\n  participants.participants_last_modified_by_key: %s,\n  participants.participants_name_source: %s,\n  participants.participants_photo_source: %s,\n  participants.participants_profile_photo_user_preference: %s,\n  participants.participants_contact_metadata: %s,\n  participants.participants_is_enterprise_contact: %s,\n  conversations.conversations__id: %s,\n  conversations.conversations_sms_thread_id: %s,\n  conversations.conversations_name: %s,\n  conversations.conversations_name_is_automatic: %s,\n  conversations.conversations_subtitle: %s,\n  conversations.conversations_latest_message_id: %s,\n  conversations.conversations_snippet_text: %s,\n  conversations.conversations_subject_text: %s,\n  conversations.conversations_preview_uri: %s,\n  conversations.conversations_preview_content_type: %s,\n  conversations.conversations_show_draft: %s,\n  conversations.conversations_draft_snippet_text: %s,\n  conversations.conversations_draft_subject_text: %s,\n  conversations.conversations_draft_preview_uri: %s,\n  conversations.conversations_draft_preview_content_type: %s,\n  conversations.conversations_etouffee_default: %s,\n  conversations.conversations_archive_status: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversations.conversations_last_read_timestamp: %s,\n  conversations.conversations_icon: %s,\n  conversations.conversations_participant_contact_id: %s,\n  conversations.conversations_normalized_participant_contact_id: %s,\n  conversations.conversations_participant_lookup_key: %s,\n  conversations.conversations_normalized_participant_lookup_key: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_participant_comparable_destination: %s,\n  conversations.conversations_current_self_id: %s,\n  conversations.conversations_current_my_identity_foreign_key: %s,\n  conversations.conversations_destination_token: %s,\n  conversations.conversations_participant_count: %s,\n  conversations.conversations_notification_enabled: %s,\n  conversations.conversations_notification_sound_uri: %s,\n  conversations.conversations_notification_vibration: %s,\n  conversations.conversations_include_email_addr: %s,\n  conversations.conversations_sms_service_center: %s,\n  conversations.conversations_participant_id_list: %s,\n  conversations.conversations_normalized_participant_id_list: %s,\n  conversations.conversations_source_type: %s,\n  conversations.conversations_rcs_session_id: %s,\n  conversations.conversations_join_state: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_send_mode: %s,\n  conversations.conversations_IS_ENTERPRISE: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_last_interactive_event_timestamp: %s,\n  conversations.conversations_participant_display_destination: %s,\n  conversations.conversations_normalized_participant_display_destination: %s,\n  conversations.conversations_spam_warning_dismiss_status: %s,\n  conversations.conversations_open_count: %s,\n  conversations.conversations_last_logged_scooby_metadata_timestamp: %s,\n  conversations.conversations_delete_timestamp: %s,\n  conversations.conversations_cms_id: %s,\n  conversations.conversations_rcs_group_id: %s,\n  conversations.conversations_rcs_conference_uri: %s,\n  conversations.conversations_tachygram_group_routing_info_token: %s,\n  conversations.conversations_cms_most_recent_read_message_timestamp_ms: %s,\n  conversations.conversations_rcs_subject_change_timestamp_ms: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_rcs_group_capabilities: %s,\n  conversations.conversations_awaiting_reverse_sync: %s,\n  conversations.conversations_duplicate_of: %s,\n  conversations.conversations_new_duplicate_of: %s,\n  conversations.conversations_error_state: %s,\n  conversations.conversations_cms_life_cycle: %s,\n  conversations.conversations_rcs_group_self_msisdn: %s,\n  conversations.conversations_recipient_offline_timestamp_ms: %s,\n  conversations.conversations_rcs_group_last_sync_timestamp: %s,\n  conversations.conversations_has_been_e2ee: %s,\n  conversations.conversations_marked_as_unread: %s,\n  conversations.conversations_custom_theme: %s,\n  conversations.conversations_mms_group_upgrade_status: %s,\n  conversations.conversations_mms_group_upgrade_retries: %s,\n  conversations.conversations_encryption_protocol: %s,\n  conversations.conversations_encryption_id: %s,\n  conversations.conversations_cms_correlation_id: %s,\n  conversations.conversations_rcs_group_icon_url: %s,\n  conversations.conversations_unread_count: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, concat, valueOf46, valueOf47, valueOf48, valueOf49, valueOf50, valueOf51, valueOf52, valueOf53, valueOf54, valueOf55, valueOf56, valueOf57, valueOf58, valueOf59, valueOf60, valueOf61, valueOf62, valueOf63, valueOf64, valueOf65, valueOf66, valueOf67, valueOf68, valueOf69, valueOf70, valueOf71, valueOf72, valueOf73, valueOf74, valueOf75, valueOf76, valueOf77, valueOf78, valueOf79, valueOf80, valueOf81, valueOf82, valueOf83, valueOf84, valueOf85, valueOf86, valueOf87, valueOf88, valueOf89, valueOf90, valueOf91, valueOf92, valueOf93, valueOf94, valueOf95, valueOf96, valueOf97, valueOf98, valueOf99, valueOf100, concat2, valueOf101, valueOf102, valueOf103, valueOf104, valueOf105, valueOf106, valueOf107, valueOf108, valueOf109, valueOf110, valueOf111, valueOf112, valueOf113, valueOf114, valueOf115, valueOf116, valueOf117, valueOf118, valueOf119, valueOf120, valueOf121, valueOf122, valueOf123, valueOf124, valueOf125, valueOf126, valueOf127, valueOf128, valueOf129, valueOf130, valueOf131, valueOf132, valueOf133, valueOf134, valueOf135, valueOf136, valueOf137, valueOf138, valueOf139, valueOf140, valueOf141, valueOf142, valueOf143, valueOf144, valueOf145, valueOf146, valueOf147, valueOf148, valueOf149, valueOf150, valueOf151, valueOf152, valueOf153, valueOf154, valueOf155, valueOf156, valueOf157, valueOf158, valueOf159, valueOf160, valueOf161, valueOf162, valueOf163, valueOf164, valueOf165, valueOf166, "BLOB".concat(String.valueOf(bArr3 != null ? String.valueOf(bArr3.length) : "NULL")), String.valueOf(this.cn), String.valueOf(this.co), String.valueOf(this.cp), String.valueOf(this.cq), String.valueOf(this.cr), String.valueOf(this.cs), String.valueOf(this.ct), String.valueOf(this.cu), String.valueOf(this.cv), String.valueOf(this.cw), String.valueOf(this.cx), String.valueOf(this.cy), String.valueOf(this.cz), String.valueOf(this.cA), String.valueOf(this.cB), String.valueOf(this.cC), String.valueOf(this.cD), String.valueOf(this.cE), String.valueOf(this.cF), String.valueOf(this.cG), String.valueOf(this.cH), String.valueOf(this.cI));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        bpgu.b().intValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bori)) {
            return false;
        }
        bori boriVar = (bori) obj;
        return super.aD(boriVar.cL) && Objects.equals(this.a, boriVar.a) && Objects.equals(this.b, boriVar.b) && Objects.equals(this.c, boriVar.c) && Objects.equals(this.d, boriVar.d) && Objects.equals(this.e, boriVar.e) && Objects.equals(this.f, boriVar.f) && this.g == boriVar.g && Objects.equals(this.h, boriVar.h) && this.i == boriVar.i && this.j == boriVar.j && this.k == boriVar.k && this.l == boriVar.l && this.m == boriVar.m && this.n == boriVar.n && Objects.equals(this.o, boriVar.o) && this.p == boriVar.p && this.q == boriVar.q && Objects.equals(this.r, boriVar.r) && Objects.equals(this.s, boriVar.s) && Objects.equals(this.t, boriVar.t) && this.u == boriVar.u && this.v == boriVar.v && Objects.equals(this.w, boriVar.w) && this.x == boriVar.x && Objects.equals(this.y, boriVar.y) && Objects.equals(this.z, boriVar.z) && this.A == boriVar.A && Objects.equals(this.B, boriVar.B) && Objects.equals(this.C, boriVar.C) && this.D == boriVar.D && this.E == boriVar.E && this.F == boriVar.F && this.G == boriVar.G && Objects.equals(this.H, boriVar.H) && this.I == boriVar.I && this.J == boriVar.J && Objects.equals(this.K, boriVar.K) && Objects.equals(this.L, boriVar.L) && Objects.equals(this.M, boriVar.M) && this.N == boriVar.N && Objects.equals(this.O, boriVar.O) && this.P == boriVar.P && this.Q == boriVar.Q && Objects.equals(this.R, boriVar.R) && Objects.equals(this.S, boriVar.S) && Arrays.equals(this.T, boriVar.T) && this.U == boriVar.U && Objects.equals(this.V, boriVar.V) && Objects.equals(this.W, boriVar.W) && Objects.equals(this.X, boriVar.X) && Objects.equals(this.Y, boriVar.Y) && this.Z == boriVar.Z && Objects.equals(this.aa, boriVar.aa) && Objects.equals(this.ab, boriVar.ab) && this.ac == boriVar.ac && this.ad == boriVar.ad && this.ae == boriVar.ae && this.af == boriVar.af && this.ag == boriVar.ag && this.ah == boriVar.ah && Objects.equals(this.ai, boriVar.ai) && this.aj == boriVar.aj && this.ak == boriVar.ak && this.al == boriVar.al && this.am == boriVar.am && Objects.equals(this.an, boriVar.an) && Objects.equals(this.ao, boriVar.ao) && Objects.equals(this.ap, boriVar.ap) && Objects.equals(this.aq, boriVar.aq) && Objects.equals(this.ar, boriVar.ar) && Objects.equals(this.as, boriVar.as) && this.at == boriVar.at && this.au == boriVar.au && Objects.equals(this.av, boriVar.av) && Objects.equals(this.aw, boriVar.aw) && Objects.equals(this.ax, boriVar.ax) && Objects.equals(this.ay, boriVar.ay) && Objects.equals(this.az, boriVar.az) && this.aA == boriVar.aA && Objects.equals(this.aB, boriVar.aB) && Objects.equals(this.aC, boriVar.aC) && Objects.equals(this.aD, boriVar.aD) && Objects.equals(this.aE, boriVar.aE) && Objects.equals(this.aF, boriVar.aF) && this.aG == boriVar.aG && Objects.equals(this.aH, boriVar.aH) && this.aI == boriVar.aI && this.aJ == boriVar.aJ && this.aK == boriVar.aK && this.aL == boriVar.aL && Objects.equals(this.aM, boriVar.aM) && this.aN == boriVar.aN && Objects.equals(this.aO, boriVar.aO) && this.aP == boriVar.aP && this.aQ == boriVar.aQ && Objects.equals(this.aR, boriVar.aR) && this.aS == boriVar.aS && this.aT == boriVar.aT && Objects.equals(this.aU, boriVar.aU) && this.aV == boriVar.aV && Objects.equals(this.aW, boriVar.aW) && Arrays.equals(this.aX, boriVar.aX) && this.aY == boriVar.aY && this.aZ == boriVar.aZ && this.ba == boriVar.ba && Objects.equals(this.bb, boriVar.bb) && this.bc == boriVar.bc && this.bd == boriVar.bd && Objects.equals(this.be, boriVar.be) && this.bf == boriVar.bf && this.bg == boriVar.bg && this.bh == boriVar.bh && Objects.equals(this.bi, boriVar.bi) && this.bj == boriVar.bj && Objects.equals(this.bk, boriVar.bk) && Objects.equals(this.bl, boriVar.bl) && Objects.equals(this.bm, boriVar.bm) && this.bn == boriVar.bn && Objects.equals(this.bo, boriVar.bo) && Objects.equals(this.bp, boriVar.bp) && Objects.equals(this.bq, boriVar.bq) && Objects.equals(this.br, boriVar.br) && Objects.equals(this.bs, boriVar.bs) && Objects.equals(this.bt, boriVar.bt) && this.bu == boriVar.bu && Objects.equals(this.bv, boriVar.bv) && Objects.equals(this.bw, boriVar.bw) && Objects.equals(this.bx, boriVar.bx) && Objects.equals(this.by, boriVar.by) && this.bz == boriVar.bz && this.bA == boriVar.bA && this.bB == boriVar.bB && this.bC == boriVar.bC && Objects.equals(this.bD, boriVar.bD) && this.bE == boriVar.bE && this.bF == boriVar.bF && Objects.equals(this.bG, boriVar.bG) && Objects.equals(this.bH, boriVar.bH) && Objects.equals(this.bI, boriVar.bI) && Objects.equals(this.bJ, boriVar.bJ) && Objects.equals(this.bK, boriVar.bK) && Objects.equals(this.bL, boriVar.bL) && Objects.equals(this.bM, boriVar.bM) && this.bN == boriVar.bN && this.bO == boriVar.bO && Objects.equals(this.bP, boriVar.bP) && this.bQ == boriVar.bQ && this.bR == boriVar.bR && Objects.equals(this.bS, boriVar.bS) && Objects.equals(this.bT, boriVar.bT) && Objects.equals(this.bU, boriVar.bU) && this.bV == boriVar.bV && this.bW == boriVar.bW && this.bX == boriVar.bX && this.bY == boriVar.bY && this.bZ == boriVar.bZ && this.ca == boriVar.ca && this.cb == boriVar.cb && this.cc == boriVar.cc && Objects.equals(this.cd, boriVar.cd) && Objects.equals(this.ce, boriVar.ce) && this.cf == boriVar.cf && this.cg == boriVar.cg && this.ch == boriVar.ch && this.ci == boriVar.ci && Objects.equals(this.cj, boriVar.cj) && Objects.equals(this.ck, boriVar.ck) && Objects.equals(this.cl, boriVar.cl) && Arrays.equals(this.cm, boriVar.cm) && this.cn == boriVar.cn && this.co == boriVar.co && this.cp == boriVar.cp && Objects.equals(this.cq, boriVar.cq) && this.cr == boriVar.cr && Objects.equals(this.cs, boriVar.cs) && Objects.equals(this.ct, boriVar.ct) && this.cu == boriVar.cu && this.cv == boriVar.cv && Objects.equals(this.cw, boriVar.cw) && Objects.equals(this.cx, boriVar.cx) && Objects.equals(this.cy, boriVar.cy) && this.cz == boriVar.cz && this.cA == boriVar.cA && Objects.equals(this.cB, boriVar.cB) && this.cC == boriVar.cC && this.cD == boriVar.cD && Objects.equals(this.cE, boriVar.cE) && Objects.equals(this.cF, boriVar.cF) && Objects.equals(this.cG, boriVar.cG) && Objects.equals(this.cH, boriVar.cH) && this.cI == boriVar.cI;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dtro
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final void c(bpgo bpgoVar) {
        bpgp bpgpVar = (bpgp) bpgoVar;
        aB();
        this.cL = bpgpVar.cU();
        if (aH(bpgpVar, 0)) {
            this.a = bpgpVar.ay();
            fY(0);
        }
        if (aH(bpgpVar, 1)) {
            this.b = bpgpVar.at();
            fY(1);
        }
        if (aH(bpgpVar, 2)) {
            this.c = bpgpVar.ce();
            fY(2);
        }
        if (aH(bpgpVar, 3)) {
            this.d = bpgpVar.cf();
            fY(3);
        }
        if (aH(bpgpVar, 4)) {
            this.e = bpgpVar.bI();
            fY(4);
        }
        if (aH(bpgpVar, 5)) {
            this.f = bpgpVar.ca();
            fY(5);
        }
        if (aH(bpgpVar, 6)) {
            this.g = bpgpVar.aa();
            fY(6);
        }
        if (aH(bpgpVar, 7)) {
            this.h = bpgpVar.bb();
            fY(7);
        }
        if (aH(bpgpVar, 8)) {
            this.i = bpgpVar.V();
            fY(8);
        }
        if (aH(bpgpVar, 9)) {
            this.j = bpgpVar.r();
            fY(9);
        }
        if (aH(bpgpVar, 10)) {
            this.k = bpgpVar.B();
            fY(10);
        }
        if (aH(bpgpVar, 11)) {
            this.l = bpgpVar.l();
            fY(11);
        }
        if (aH(bpgpVar, 12)) {
            this.m = bpgpVar.cE();
            fY(12);
        }
        if (aH(bpgpVar, 13)) {
            this.n = bpgpVar.cG();
            fY(13);
        }
        if (aH(bpgpVar, 14)) {
            this.o = bpgpVar.ak();
            fY(14);
        }
        if (aH(bpgpVar, 15)) {
            this.p = bpgpVar.z();
            fY(15);
        }
        if (aH(bpgpVar, 16)) {
            this.q = bpgpVar.ab();
            fY(16);
        }
        if (aH(bpgpVar, 17)) {
            this.r = bpgpVar.bG();
            fY(17);
        }
        if (aH(bpgpVar, 18)) {
            this.s = bpgpVar.bH();
            fY(18);
        }
        if (aH(bpgpVar, 19)) {
            this.t = bpgpVar.bE();
            fY(19);
        }
        if (aH(bpgpVar, 20)) {
            this.u = bpgpVar.O();
            fY(20);
        }
        if (aH(bpgpVar, 21)) {
            this.v = bpgpVar.R();
            fY(21);
        }
        if (aH(bpgpVar, 22)) {
            this.w = bpgpVar.bF();
            fY(22);
        }
        if (aH(bpgpVar, 23)) {
            this.x = bpgpVar.s();
            fY(23);
        }
        if (aH(bpgpVar, 24)) {
            this.y = bpgpVar.cc();
            fY(24);
        }
        if (aH(bpgpVar, 25)) {
            this.z = bpgpVar.aq();
            fY(25);
        }
        if (aH(bpgpVar, 26)) {
            this.A = bpgpVar.Y();
            fY(26);
        }
        if (aH(bpgpVar, 27)) {
            this.B = bpgpVar.bh();
            fY(27);
        }
        if (aH(bpgpVar, 28)) {
            this.C = bpgpVar.aC();
            fY(28);
        }
        if (aH(bpgpVar, 29)) {
            this.D = bpgpVar.t();
            fY(29);
        }
        if (aH(bpgpVar, 30)) {
            this.E = bpgpVar.aK();
            fY(30);
        }
        if (aH(bpgpVar, 31)) {
            this.F = bpgpVar.u();
            fY(31);
        }
        if (aH(bpgpVar, 32)) {
            this.G = bpgpVar.cy();
            fY(32);
        }
        if (aH(bpgpVar, 33)) {
            this.H = bpgpVar.bZ();
            fY(33);
        }
        if (aH(bpgpVar, 34)) {
            this.I = bpgpVar.S();
            fY(34);
        }
        if (aH(bpgpVar, 35)) {
            this.J = bpgpVar.y();
            fY(35);
        }
        if (aH(bpgpVar, 36)) {
            this.K = bpgpVar.cg();
            fY(36);
        }
        if (aH(bpgpVar, 37)) {
            this.L = bpgpVar.bp();
            fY(37);
        }
        if (aH(bpgpVar, 38)) {
            this.M = bpgpVar.bl();
            fY(38);
        }
        if (aH(bpgpVar, 39)) {
            this.N = bpgpVar.G();
            fY(39);
        }
        if (aH(bpgpVar, 40)) {
            this.O = bpgpVar.cm();
            fY(40);
        }
        if (aH(bpgpVar, 41)) {
            this.P = bpgpVar.ad();
            fY(41);
        }
        if (aH(bpgpVar, 42)) {
            this.Q = bpgpVar.Z();
            fY(42);
        }
        if (aH(bpgpVar, 43)) {
            this.R = bpgpVar.aB();
            fY(43);
        }
        if (aH(bpgpVar, 44)) {
            this.S = bpgpVar.bs();
            fY(44);
        }
        if (aH(bpgpVar, 45)) {
            this.T = bpgpVar.cJ();
            fY(45);
        }
        if (aH(bpgpVar, 46)) {
            this.U = bpgpVar.X();
            fY(46);
        }
        if (aH(bpgpVar, 47)) {
            this.V = bpgpVar.ba();
            fY(47);
        }
        if (aH(bpgpVar, 48)) {
            this.W = bpgpVar.bj();
            fY(48);
        }
        if (aH(bpgpVar, 49)) {
            this.X = bpgpVar.bA();
            fY(49);
        }
        if (aH(bpgpVar, 50)) {
            this.Y = bpgpVar.aA();
            fY(50);
        }
        if (aH(bpgpVar, 51)) {
            this.Z = bpgpVar.cp();
            fY(51);
        }
        if (aH(bpgpVar, 52)) {
            this.aa = bpgpVar.ag();
            fY(52);
        }
        if (aH(bpgpVar, 53)) {
            this.ab = bpgpVar.bc();
            fY(53);
        }
        if (aH(bpgpVar, 54)) {
            this.ac = bpgpVar.v();
            fY(54);
        }
        if (aH(bpgpVar, 55)) {
            this.ad = bpgpVar.aY();
            fY(55);
        }
        if (aH(bpgpVar, 56)) {
            this.ae = bpgpVar.aP();
            fY(56);
        }
        if (aH(bpgpVar, 57)) {
            this.af = bpgpVar.aF();
            fY(57);
        }
        if (aH(bpgpVar, 58)) {
            this.ag = bpgpVar.c();
            fY(58);
        }
        if (aH(bpgpVar, 59)) {
            this.ah = bpgpVar.cr();
            fY(59);
        }
        if (aH(bpgpVar, 60)) {
            this.ai = bpgpVar.cn();
            fY(60);
        }
        if (aH(bpgpVar, 61)) {
            this.aj = bpgpVar.aH();
            fY(61);
        }
        if (aH(bpgpVar, 62)) {
            this.ak = bpgpVar.aI();
            fY(62);
        }
        if (aH(bpgpVar, 63)) {
            this.al = bpgpVar.aL();
            fY(63);
        }
        if (aH(bpgpVar, 64)) {
            this.am = bpgpVar.o();
            fY(64);
        }
        if (aH(bpgpVar, 65)) {
            this.an = bpgpVar.ax();
            fY(65);
        }
        if (aH(bpgpVar, 66)) {
            this.ao = bpgpVar.aO();
            fY(66);
        }
        if (aH(bpgpVar, 67)) {
            this.ap = bpgpVar.bd();
            fY(67);
        }
        if (aH(bpgpVar, 68)) {
            this.aq = bpgpVar.bC();
            fY(68);
        }
        if (aH(bpgpVar, 69)) {
            this.ar = bpgpVar.ar();
            fY(69);
        }
        if (aH(bpgpVar, 70)) {
            this.as = bpgpVar.as();
            fY(70);
        }
        if (aH(bpgpVar, 71)) {
            this.at = bpgpVar.C();
            fY(71);
        }
        if (aH(bpgpVar, 72)) {
            this.au = bpgpVar.x();
            fY(72);
        }
        if (aH(bpgpVar, 73)) {
            this.av = bpgpVar.bK();
            fY(73);
        }
        if (aH(bpgpVar, 74)) {
            this.aw = bpgpVar.cd();
            fY(74);
        }
        if (aH(bpgpVar, 75)) {
            this.ax = bpgpVar.bt();
            fY(75);
        }
        if (aH(bpgpVar, 76)) {
            this.ay = bpgpVar.bn();
            fY(76);
        }
        if (aH(bpgpVar, 77)) {
            this.az = bpgpVar.bq();
            fY(77);
        }
        if (aH(bpgpVar, 78)) {
            this.aA = bpgpVar.W();
            fY(78);
        }
        if (aH(bpgpVar, 79)) {
            this.aB = bpgpVar.cb();
            fY(79);
        }
        if (aH(bpgpVar, 80)) {
            this.aC = bpgpVar.bz();
            fY(80);
        }
        if (aH(bpgpVar, 81)) {
            this.aD = bpgpVar.by();
            fY(81);
        }
        if (aH(bpgpVar, 82)) {
            this.aE = bpgpVar.ai();
            fY(82);
        }
        if (aH(bpgpVar, 83)) {
            this.aF = bpgpVar.ae();
            fY(83);
        }
        if (aH(bpgpVar, 84)) {
            this.aG = bpgpVar.I();
            fY(84);
        }
        if (aH(bpgpVar, 85)) {
            this.aH = bpgpVar.bD();
            fY(85);
        }
        if (aH(bpgpVar, 86)) {
            this.aI = bpgpVar.e();
            fY(86);
        }
        if (aH(bpgpVar, 87)) {
            this.aJ = bpgpVar.f();
            fY(87);
        }
        if (aH(bpgpVar, 88)) {
            this.aK = bpgpVar.i();
            fY(88);
        }
        if (aH(bpgpVar, 89)) {
            this.aL = bpgpVar.cq();
            fY(89);
        }
        if (aH(bpgpVar, 90)) {
            this.aM = bpgpVar.ck();
            fY(90);
        }
        if (aH(bpgpVar, 91)) {
            this.aN = bpgpVar.D();
            fY(91);
        }
        if (aH(bpgpVar, 92)) {
            this.aO = bpgpVar.bo();
            fY(92);
        }
        if (aH(bpgpVar, 93)) {
            this.aP = bpgpVar.q();
            fY(93);
        }
        if (aH(bpgpVar, 94)) {
            this.aQ = bpgpVar.F();
            fY(94);
        }
        if (aH(bpgpVar, 95)) {
            this.aR = bpgpVar.bg();
            fY(95);
        }
        if (aH(bpgpVar, 96)) {
            this.aS = bpgpVar.cz();
            fY(96);
        }
        if (aH(bpgpVar, 97)) {
            this.aT = bpgpVar.j();
            fY(97);
        }
        if (aH(bpgpVar, 98)) {
            this.aU = bpgpVar.bm();
            fY(98);
        }
        if (aH(bpgpVar, 99)) {
            this.aV = bpgpVar.aJ();
            fY(99);
        }
        if (aH(bpgpVar, 100)) {
            this.aW = bpgpVar.bV();
            fY(100);
        }
        if (aH(bpgpVar, EnergyProfile.EVCONNECTOR_TYPE_OTHER)) {
            this.aX = bpgpVar.cK();
            fY(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
        }
        if (aH(bpgpVar, 102)) {
            this.aY = bpgpVar.K();
            fY(102);
        }
        if (aH(bpgpVar, 103)) {
            this.aZ = bpgpVar.cv();
            fY(103);
        }
        if (aH(bpgpVar, 104)) {
            this.ba = bpgpVar.cA();
            fY(104);
        }
        if (aH(bpgpVar, 105)) {
            this.bb = bpgpVar.bx();
            fY(105);
        }
        if (aH(bpgpVar, 106)) {
            this.bc = bpgpVar.aZ();
            fY(106);
        }
        if (aH(bpgpVar, 107)) {
            this.bd = bpgpVar.al();
            fY(107);
        }
        if (aH(bpgpVar, 108)) {
            this.be = bpgpVar.aD();
            fY(108);
        }
        if (aH(bpgpVar, 109)) {
            this.bf = bpgpVar.aR();
            fY(109);
        }
        if (aH(bpgpVar, 110)) {
            this.bg = bpgpVar.aS();
            fY(110);
        }
        if (aH(bpgpVar, 111)) {
            this.bh = bpgpVar.aQ();
            fY(111);
        }
        if (aH(bpgpVar, 112)) {
            this.bi = bpgpVar.am();
            fY(112);
        }
        if (aH(bpgpVar, 113)) {
            this.bj = bpgpVar.cx();
            fY(113);
        }
        if (aH(bpgpVar, 114)) {
            this.bk = bpgpVar.aw();
            fY(114);
        }
        if (aH(bpgpVar, 115)) {
            this.bl = bpgpVar.aW();
            fY(115);
        }
        if (aH(bpgpVar, 116)) {
            this.bm = bpgpVar.bJ();
            fY(116);
        }
        if (aH(bpgpVar, 117)) {
            this.bn = bpgpVar.aG();
            fY(117);
        }
        if (aH(bpgpVar, 118)) {
            this.bo = bpgpVar.cl();
            fY(118);
        }
        if (aH(bpgpVar, 119)) {
            this.bp = bpgpVar.az();
            fY(119);
        }
        if (aH(bpgpVar, 120)) {
            this.bq = bpgpVar.ci();
            fY(120);
        }
        if (aH(bpgpVar, 121)) {
            this.br = bpgpVar.cj();
            fY(121);
        }
        if (aH(bpgpVar, 122)) {
            this.bs = bpgpVar.ah();
            fY(122);
        }
        if (aH(bpgpVar, 123)) {
            this.bt = bpgpVar.bU();
            fY(123);
        }
        if (aH(bpgpVar, 124)) {
            this.bu = bpgpVar.cH();
            fY(124);
        }
        if (aH(bpgpVar, 125)) {
            this.bv = bpgpVar.bv();
            fY(125);
        }
        if (aH(bpgpVar, 126)) {
            this.bw = bpgpVar.bw();
            fY(126);
        }
        if (aH(bpgpVar, 127)) {
            this.bx = bpgpVar.af();
            fY(127);
        }
        if (aH(bpgpVar, 128)) {
            this.by = bpgpVar.bu();
            fY(128);
        }
        if (aH(bpgpVar, 129)) {
            this.bz = bpgpVar.h();
            fY(129);
        }
        if (aH(bpgpVar, 130)) {
            this.bA = bpgpVar.aE();
            fY(130);
        }
        if (aH(bpgpVar, 131)) {
            this.bB = bpgpVar.ac();
            fY(131);
        }
        if (aH(bpgpVar, 132)) {
            this.bC = bpgpVar.N();
            fY(132);
        }
        if (aH(bpgpVar, 133)) {
            this.bD = bpgpVar.bB();
            fY(133);
        }
        if (aH(bpgpVar, 134)) {
            this.bE = bpgpVar.Q();
            fY(134);
        }
        if (aH(bpgpVar, 135)) {
            this.bF = bpgpVar.P();
            fY(135);
        }
        if (aH(bpgpVar, 136)) {
            this.bG = bpgpVar.bS();
            fY(136);
        }
        if (aH(bpgpVar, 137)) {
            this.bH = bpgpVar.bN();
            fY(137);
        }
        if (aH(bpgpVar, 138)) {
            this.bI = bpgpVar.bT();
            fY(138);
        }
        if (aH(bpgpVar, 139)) {
            this.bJ = bpgpVar.bP();
            fY(139);
        }
        if (aH(bpgpVar, 140)) {
            this.bK = bpgpVar.br();
            fY(140);
        }
        if (aH(bpgpVar, 141)) {
            this.bL = bpgpVar.ap();
            fY(141);
        }
        if (aH(bpgpVar, 142)) {
            this.bM = bpgpVar.ao();
            fY(142);
        }
        if (aH(bpgpVar, 143)) {
            this.bN = bpgpVar.p();
            fY(143);
        }
        if (aH(bpgpVar, 144)) {
            this.bO = bpgpVar.cC();
            fY(144);
        }
        if (aH(bpgpVar, 145)) {
            this.bP = bpgpVar.bO();
            fY(145);
        }
        if (aH(bpgpVar, 146)) {
            this.bQ = bpgpVar.cD();
            fY(146);
        }
        if (aH(bpgpVar, 147)) {
            this.bR = bpgpVar.cu();
            fY(147);
        }
        if (aH(bpgpVar, 148)) {
            this.bS = bpgpVar.ch();
            fY(148);
        }
        if (aH(bpgpVar, 149)) {
            this.bT = bpgpVar.bR();
            fY(149);
        }
        if (aH(bpgpVar, 150)) {
            this.bU = bpgpVar.bM();
            fY(150);
        }
        if (aH(bpgpVar, 151)) {
            this.bV = bpgpVar.A();
            fY(151);
        }
        if (aH(bpgpVar, 152)) {
            this.bW = bpgpVar.T();
            fY(152);
        }
        if (aH(bpgpVar, 153)) {
            this.bX = bpgpVar.k();
            fY(153);
        }
        if (aH(bpgpVar, 154)) {
            this.bY = bpgpVar.g();
            fY(154);
        }
        if (aH(bpgpVar, 155)) {
            this.bZ = bpgpVar.w();
            fY(155);
        }
        if (aH(bpgpVar, 156)) {
            this.ca = bpgpVar.cw();
            fY(156);
        }
        if (aH(bpgpVar, 157)) {
            this.cb = bpgpVar.ct();
            fY(157);
        }
        if (aH(bpgpVar, 158)) {
            this.cc = bpgpVar.L();
            fY(158);
        }
        if (aH(bpgpVar, 159)) {
            this.cd = bpgpVar.bQ();
            fY(159);
        }
        if (aH(bpgpVar, 160)) {
            this.ce = bpgpVar.bL();
            fY(160);
        }
        if (aH(bpgpVar, 161)) {
            this.cf = bpgpVar.cI();
            fY(161);
        }
        if (aH(bpgpVar, 162)) {
            this.cg = bpgpVar.n();
            fY(162);
        }
        if (aH(bpgpVar, 163)) {
            this.ch = bpgpVar.M();
            fY(163);
        }
        if (aH(bpgpVar, 164)) {
            this.ci = bpgpVar.J();
            fY(164);
        }
        if (aH(bpgpVar, 165)) {
            this.cj = bpgpVar.bk();
            fY(165);
        }
        if (aH(bpgpVar, 166)) {
            this.ck = bpgpVar.bX();
            fY(166);
        }
        if (aH(bpgpVar, 167)) {
            this.cl = bpgpVar.bW();
            fY(167);
        }
        if (aH(bpgpVar, 168)) {
            this.cm = bpgpVar.cL();
            fY(168);
        }
        if (aH(bpgpVar, 169)) {
            this.cn = bpgpVar.H();
            fY(169);
        }
        if (aH(bpgpVar, 170)) {
            this.co = bpgpVar.U();
            fY(170);
        }
        if (aH(bpgpVar, 171)) {
            this.cp = bpgpVar.cF();
            fY(171);
        }
        if (aH(bpgpVar, 172)) {
            this.cq = bpgpVar.aU();
            fY(172);
        }
        if (aH(bpgpVar, 173)) {
            this.cr = bpgpVar.co();
            fY(173);
        }
        if (aH(bpgpVar, 174)) {
            this.cs = bpgpVar.au();
            fY(174);
        }
        if (aH(bpgpVar, 175)) {
            this.ct = bpgpVar.av();
            fY(175);
        }
        if (aH(bpgpVar, 176)) {
            this.cu = bpgpVar.an();
            fY(176);
        }
        if (aH(bpgpVar, 177)) {
            this.cv = bpgpVar.aX();
            fY(177);
        }
        if (aH(bpgpVar, 178)) {
            this.cw = bpgpVar.bY();
            fY(178);
        }
        if (aH(bpgpVar, 179)) {
            this.cx = bpgpVar.bf();
            fY(179);
        }
        if (aH(bpgpVar, 180)) {
            this.cy = bpgpVar.be();
            fY(180);
        }
        if (aH(bpgpVar, 181)) {
            this.cz = bpgpVar.cs();
            fY(181);
        }
        if (aH(bpgpVar, 182)) {
            this.cA = bpgpVar.cB();
            fY(182);
        }
        if (aH(bpgpVar, 183)) {
            this.cB = bpgpVar.aT();
            fY(183);
        }
        if (aH(bpgpVar, 184)) {
            this.cC = bpgpVar.aV();
            fY(184);
        }
        if (aH(bpgpVar, 185)) {
            this.cD = bpgpVar.m();
            fY(185);
        }
        if (aH(bpgpVar, 186)) {
            this.cE = bpgpVar.aN();
            fY(186);
        }
        if (aH(bpgpVar, 187)) {
            this.cF = bpgpVar.aM();
            fY(187);
        }
        if (aH(bpgpVar, 188)) {
            this.cG = bpgpVar.bi();
            fY(188);
        }
        if (aH(bpgpVar, 189)) {
            this.cH = bpgpVar.aj();
            fY(189);
        }
        if (aH(bpgpVar, 190)) {
            this.cI = bpgpVar.E();
            fY(190);
        }
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        MessageIdType messageIdType = this.a;
        ConversationIdType conversationIdType = this.b;
        String str = this.c;
        String str2 = this.d;
        String str3 = this.e;
        String str4 = this.f;
        Long valueOf = Long.valueOf(this.g);
        Instant instant = this.h;
        Long valueOf2 = Long.valueOf(this.i);
        Integer valueOf3 = Integer.valueOf(this.j);
        Integer valueOf4 = Integer.valueOf(this.k);
        Integer valueOf5 = Integer.valueOf(this.l);
        Boolean valueOf6 = Boolean.valueOf(this.m);
        Boolean valueOf7 = Boolean.valueOf(this.n);
        dtsq dtsqVar3 = dtsqVar2;
        Uri uri = this.o;
        Integer valueOf8 = Integer.valueOf(this.p);
        Long valueOf9 = Long.valueOf(this.q);
        String str5 = this.r;
        String str6 = this.s;
        String str7 = this.t;
        Long valueOf10 = Long.valueOf(this.u);
        Long valueOf11 = Long.valueOf(this.v);
        String str8 = this.w;
        Integer valueOf12 = Integer.valueOf(this.x);
        String str9 = this.y;
        azsu azsuVar = this.z;
        Long valueOf13 = Long.valueOf(this.A);
        String str10 = this.B;
        bdhg bdhgVar = this.C;
        Integer valueOf14 = Integer.valueOf(this.D);
        byzi byziVar = this.E;
        Integer valueOf15 = Integer.valueOf(byziVar == null ? 0 : byziVar.ordinal());
        Integer valueOf16 = Integer.valueOf(this.F);
        Boolean valueOf17 = Boolean.valueOf(this.G);
        String str11 = this.H;
        Long valueOf18 = Long.valueOf(this.I);
        Integer valueOf19 = Integer.valueOf(this.J);
        String str12 = this.K;
        String str13 = this.L;
        String str14 = this.M;
        Long valueOf20 = Long.valueOf(this.N);
        String str15 = this.O;
        Long valueOf21 = Long.valueOf(this.P);
        Long valueOf22 = Long.valueOf(this.Q);
        bdhg bdhgVar2 = this.R;
        String str16 = this.S;
        Integer valueOf23 = Integer.valueOf(Arrays.hashCode(this.T));
        Long valueOf24 = Long.valueOf(this.U);
        fayv fayvVar = this.V;
        String str17 = this.W;
        String str18 = this.X;
        MessageIdType messageIdType2 = this.Y;
        Boolean valueOf25 = Boolean.valueOf(this.Z);
        Uri uri2 = this.aa;
        Optional optional = this.ab;
        Integer valueOf26 = Integer.valueOf(this.ac);
        csgg csggVar = this.ad;
        Integer valueOf27 = Integer.valueOf(csggVar == null ? 0 : csggVar.ordinal());
        cjco cjcoVar = this.ae;
        Integer valueOf28 = Integer.valueOf(cjcoVar == null ? 0 : cjcoVar.ordinal());
        byyw byywVar = this.af;
        Integer valueOf29 = Integer.valueOf(byywVar == null ? 0 : byywVar.ordinal());
        Integer valueOf30 = Integer.valueOf(this.ag);
        Boolean valueOf31 = Boolean.valueOf(this.ah);
        fjay fjayVar = this.ai;
        byzg byzgVar = this.aj;
        Integer valueOf32 = Integer.valueOf(byzgVar == null ? 0 : byzgVar.ordinal());
        byzg byzgVar2 = this.ak;
        Integer valueOf33 = Integer.valueOf(byzgVar2 == null ? 0 : byzgVar2.ordinal());
        byzl byzlVar = this.al;
        Integer valueOf34 = Integer.valueOf(byzlVar == null ? 0 : byzlVar.ordinal());
        Integer valueOf35 = Integer.valueOf(this.am);
        bdgr bdgrVar = this.an;
        cfmh cfmhVar = this.ao;
        Optional optional2 = this.ap;
        String str19 = this.aq;
        azsu azsuVar2 = this.ar;
        azsu azsuVar3 = this.as;
        Integer valueOf36 = Integer.valueOf(this.at);
        Integer valueOf37 = Integer.valueOf(this.au);
        String str20 = this.av;
        String str21 = this.aw;
        String str22 = this.ax;
        String str23 = this.ay;
        String str24 = this.az;
        Long valueOf38 = Long.valueOf(this.aA);
        String str25 = this.aB;
        String str26 = this.aC;
        String str27 = this.aD;
        Uri uri3 = this.aE;
        Uri uri4 = this.aF;
        Long valueOf39 = Long.valueOf(this.aG);
        String str28 = this.aH;
        Integer valueOf40 = Integer.valueOf(this.aI);
        Integer valueOf41 = Integer.valueOf(this.aJ);
        Integer valueOf42 = Integer.valueOf(this.aK);
        Boolean valueOf43 = Boolean.valueOf(this.aL);
        String str29 = this.aM;
        Integer valueOf44 = Integer.valueOf(this.aN);
        String str30 = this.aO;
        Integer valueOf45 = Integer.valueOf(this.aP);
        Integer valueOf46 = Integer.valueOf(this.aQ);
        String str31 = this.aR;
        Boolean valueOf47 = Boolean.valueOf(this.aS);
        Integer valueOf48 = Integer.valueOf(this.aT);
        String str32 = this.aU;
        byzi byziVar2 = this.aV;
        Integer valueOf49 = Integer.valueOf(byziVar2 == null ? 0 : byziVar2.ordinal());
        String str33 = this.aW;
        Integer valueOf50 = Integer.valueOf(Arrays.hashCode(this.aX));
        Long valueOf51 = Long.valueOf(this.aY);
        Boolean valueOf52 = Boolean.valueOf(this.aZ);
        Boolean valueOf53 = Boolean.valueOf(this.ba);
        String str34 = this.bb;
        csgg csggVar2 = this.bc;
        Integer valueOf54 = Integer.valueOf(csggVar2 == null ? 0 : csggVar2.ordinal());
        aorb aorbVar = this.bd;
        bdpy bdpyVar = this.be;
        cjwi cjwiVar = this.bf;
        cjwi cjwiVar2 = this.bg;
        cjwe cjweVar = this.bh;
        aqkt aqktVar = this.bi;
        Boolean valueOf55 = Boolean.valueOf(this.bj);
        ConversationIdType conversationIdType2 = this.bk;
        cpxu cpxuVar = this.bl;
        String str35 = this.bm;
        byyy byyyVar = this.bn;
        Integer valueOf56 = Integer.valueOf(byyyVar == null ? 0 : byyyVar.ordinal());
        String str36 = this.bo;
        MessageIdType messageIdType3 = this.bp;
        String str37 = this.bq;
        String str38 = this.br;
        Uri uri5 = this.bs;
        String str39 = this.bt;
        Boolean valueOf57 = Boolean.valueOf(this.bu);
        String str40 = this.bv;
        String str41 = this.bw;
        Uri uri6 = this.bx;
        String str42 = this.by;
        Integer valueOf58 = Integer.valueOf(this.bz);
        byyt byytVar = this.bA;
        Long valueOf59 = Long.valueOf(this.bB);
        Long valueOf60 = Long.valueOf(this.bC);
        String str43 = this.bD;
        Long valueOf61 = Long.valueOf(this.bE);
        Long valueOf62 = Long.valueOf(this.bF);
        String str44 = this.bG;
        String str45 = this.bH;
        String str46 = this.bI;
        String str47 = this.bJ;
        String str48 = this.bK;
        azsu azsuVar4 = this.bL;
        azcr azcrVar = this.bM;
        Integer valueOf63 = Integer.valueOf(this.bN);
        Boolean valueOf64 = Boolean.valueOf(this.bO);
        String str49 = this.bP;
        Boolean valueOf65 = Boolean.valueOf(this.bQ);
        Boolean valueOf66 = Boolean.valueOf(this.bR);
        String str50 = this.bS;
        String str51 = this.bT;
        String str52 = this.bU;
        Integer valueOf67 = Integer.valueOf(this.bV);
        Long valueOf68 = Long.valueOf(this.bW);
        Integer valueOf69 = Integer.valueOf(this.bX);
        Integer valueOf70 = Integer.valueOf(this.bY);
        Integer valueOf71 = Integer.valueOf(this.bZ);
        Boolean valueOf72 = Boolean.valueOf(this.ca);
        Boolean valueOf73 = Boolean.valueOf(this.cb);
        Long valueOf74 = Long.valueOf(this.cc);
        String str53 = this.cd;
        String str54 = this.ce;
        Boolean valueOf75 = Boolean.valueOf(this.cf);
        Integer valueOf76 = Integer.valueOf(this.cg);
        Long valueOf77 = Long.valueOf(this.ch);
        Long valueOf78 = Long.valueOf(this.ci);
        String str55 = this.cj;
        String str56 = this.ck;
        String str57 = this.cl;
        Integer valueOf79 = Integer.valueOf(Arrays.hashCode(this.cm));
        Long valueOf80 = Long.valueOf(this.cn);
        Long valueOf81 = Long.valueOf(this.co);
        Boolean valueOf82 = Boolean.valueOf(this.cp);
        cknh cknhVar = this.cq;
        Boolean valueOf83 = Boolean.valueOf(this.cr);
        ConversationIdType conversationIdType3 = this.cs;
        ConversationIdType conversationIdType4 = this.ct;
        ayhd ayhdVar = this.cu;
        csgg csggVar3 = this.cv;
        Integer valueOf84 = Integer.valueOf(csggVar3 == null ? 0 : csggVar3.ordinal());
        String str58 = this.cw;
        Optional optional3 = this.cx;
        Optional optional4 = this.cy;
        Boolean valueOf85 = Boolean.valueOf(this.cz);
        Boolean valueOf86 = Boolean.valueOf(this.cA);
        ckkz ckkzVar = this.cB;
        ckte ckteVar = this.cC;
        return Objects.hash(dtsqVar3, messageIdType, conversationIdType, str, str2, str3, str4, valueOf, instant, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, uri, valueOf8, valueOf9, str5, str6, str7, valueOf10, valueOf11, str8, valueOf12, str9, azsuVar, valueOf13, str10, bdhgVar, valueOf14, valueOf15, valueOf16, valueOf17, str11, valueOf18, valueOf19, str12, str13, str14, valueOf20, str15, valueOf21, valueOf22, bdhgVar2, str16, valueOf23, valueOf24, fayvVar, str17, str18, messageIdType2, valueOf25, uri2, optional, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, fjayVar, valueOf32, valueOf33, valueOf34, valueOf35, bdgrVar, cfmhVar, optional2, str19, azsuVar2, azsuVar3, valueOf36, valueOf37, str20, str21, str22, str23, str24, valueOf38, str25, str26, str27, uri3, uri4, valueOf39, str28, valueOf40, valueOf41, valueOf42, valueOf43, str29, valueOf44, str30, valueOf45, valueOf46, str31, valueOf47, valueOf48, str32, valueOf49, str33, valueOf50, valueOf51, valueOf52, valueOf53, str34, valueOf54, aorbVar, bdpyVar, cjwiVar, cjwiVar2, cjweVar, aqktVar, valueOf55, conversationIdType2, cpxuVar, str35, valueOf56, str36, messageIdType3, str37, str38, uri5, str39, valueOf57, str40, str41, uri6, str42, valueOf58, byytVar, valueOf59, valueOf60, str43, valueOf61, valueOf62, str44, str45, str46, str47, str48, azsuVar4, azcrVar, valueOf63, valueOf64, str49, valueOf65, valueOf66, str50, str51, str52, valueOf67, valueOf68, valueOf69, valueOf70, valueOf71, valueOf72, valueOf73, valueOf74, str53, str54, valueOf75, valueOf76, valueOf77, valueOf78, str55, str56, str57, valueOf79, valueOf80, valueOf81, valueOf82, cknhVar, valueOf83, conversationIdType3, conversationIdType4, ayhdVar, valueOf84, str58, optional3, optional4, valueOf85, valueOf86, ckkzVar, Integer.valueOf(ckteVar == null ? 0 : ckteVar.ordinal()), Integer.valueOf(this.cD), this.cE, this.cF, this.cG, this.cH, Integer.valueOf(this.cI), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "UnreadQuery -- REDACTED") : a();
    }
}
