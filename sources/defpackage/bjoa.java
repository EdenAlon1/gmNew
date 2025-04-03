package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bjoa extends dtro {
    private String A;
    private String D;
    private String J;
    private String M;
    private String N;
    private String O;
    private long P;
    private String U;
    private byte[] V;
    private fayv X;
    private String Y;
    private String Z;
    public bmwr a;
    private String aA;
    private String[] aB;
    private String[] aC;
    private Uri[] aD;
    private String[] aE;
    private String[] aF;
    private long[] aG;
    private long[] aH;
    private String aI;
    private long aJ;
    private String aK;
    private String aL;
    private boolean aM;
    private Uri ac;
    private fjay ak;
    private byzg al;
    private byzg am;
    private byzl an;
    private int ao;
    private bdgr ap;
    private cfmh aq;
    private Optional ar;
    private MessageIdType as;
    private MessageIdType at;
    private long au;
    private String av;
    private int aw;
    private String ax;
    private String ay;
    private String az;
    public MessagesTable.BindData b;
    private String e;
    private String f;
    private String g;
    private String h;
    private Uri q;
    private String t;
    private String u;
    private String v;
    private String y;
    private MessageIdType c = bdhb.a;
    private ConversationIdType d = bdgq.a;
    private long i = 0;
    private Instant j = bdgw.b(0);
    private long k = 0;
    private int l = 0;
    private int m = 0;
    private int n = 0;
    private boolean o = false;
    private boolean p = false;
    private int r = 0;
    private long s = 0;
    private long w = 0;
    private long x = 0;
    private int z = 0;
    private azsu B = null;
    private long C = 0;
    private bdhg E = bdhg.a;
    private int F = 0;
    private byzi G = byzi.VERIFICATION_NA;
    private int H = 0;
    private boolean I = false;
    private long K = -1;
    private int L = -1;
    private String Q = "";
    private long R = 0;
    private long S = 1;
    private bdhg T = bdhg.a;
    private long W = 0;
    private MessageIdType aa = bdhb.a;
    private boolean ab = false;
    private Optional ad = bdhj.a;
    private int ae = -2;
    private csgg af = csgg.UNKNOWN;
    private cjco ag = cjco.c;
    private byyw ah = byyw.UNKNOWN;
    private int ai = 0;
    private boolean aj = false;

    protected bjoa() {
        byzg byzgVar = byzg.UNKNOWN;
        this.al = byzgVar;
        this.am = byzgVar;
        this.an = byzl.UNKNOWN;
        this.ao = -1;
        this.ap = bdgr.a;
        this.aq = new cfmh(0L);
        this.ar = bdhf.a();
        MessageIdType messageIdType = bdhb.a;
        this.as = messageIdType;
        this.at = messageIdType;
    }

    private final MessagesTable.BindData f(int i) {
        buoy c = MessagesTable.c();
        az(0, "_id");
        c.v(this.c);
        az(1, "conversation_id");
        c.m(this.d);
        az(2, "sender_id");
        c.ag(this.e);
        if (i >= 54040) {
            az(3, "sender_send_destination");
            c.ah(this.f);
        }
        if (i >= 59340) {
            az(4, "msisdn_receiving_rcs_message");
            c.E(this.g);
        }
        if (i >= 54040) {
            az(5, "receiving_network_country");
            c.Z(this.h);
        }
        az(6, "sent_timestamp");
        c.ai(this.i);
        if (i >= 17030) {
            az(7, "queue_insert_timestamp");
            c.P(this.j);
        }
        az(8, "received_timestamp");
        c.Y(this.k);
        az(9, "message_protocol");
        c.O(this.l);
        az(10, "message_status");
        c.ao(this.m);
        if (i >= 13020) {
            az(11, "message_report_status");
            c.y(this.n);
        }
        az(12, "seen");
        c.H(this.o);
        az(13, "read");
        c.X(this.p);
        az(14, "sms_message_uri");
        c.am(this.q);
        az(15, "sms_priority");
        c.an(this.r);
        az(16, "sms_message_size");
        c.al(this.s);
        az(17, "mms_subject");
        c.C(this.t);
        az(18, "mms_transaction_id");
        c.D(this.u);
        az(19, "mms_content_location");
        c.z(this.v);
        az(20, "mms_expiry");
        c.A(this.w);
        if (i >= 59890) {
            az(21, "rcs_expiry");
            c.S(this.x);
        }
        if (i >= 9030) {
            az(22, "mms_retrieve_text");
            c.B(this.y);
        }
        az(23, "raw_status");
        c.Q(this.z);
        az(24, "self_id");
        c.ae(this.A);
        if (i >= 60160) {
            az(25, "my_identity_foreign_key");
            c.G(this.B);
        }
        az(26, "retry_start_timestamp");
        c.ac(this.C);
        if (i >= 8500) {
            az(27, "cloud_sync_id");
            c.h(this.D);
        }
        if (i >= 41040) {
            az(28, "rcs_message_id_with_text_type");
            c.U(this.E);
        }
        if (i >= 29060) {
            az(29, "etouffee_status");
            c.R(this.F);
        }
        if (i >= 29090) {
            az(30, BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS);
            c.ar(this.G);
        }
        if (i >= 39000) {
            az(31, "rcs_ui_status");
            c.W(this.H);
        }
        if (i >= 30010) {
            az(32, "is_hidden");
            c.w(this.I);
        }
        if (i >= 10002) {
            az(33, "rcs_remote_instance");
            c.V(this.J);
        }
        if (i >= 10004) {
            az(34, "rcs_file_transfer_session_id");
            c.T(this.K);
        }
        if (i >= 9000) {
            az(35, "sms_error_code");
            c.aj(this.L);
        }
        if (i >= 9000) {
            az(36, "sms_error_desc_map_name");
            c.ak(this.M);
        }
        if (i >= 9010) {
            az(37, "correlation_id");
            c.n(this.N);
        }
        if (i >= 31010) {
            az(38, "cms_id");
            c.j(this.O);
        }
        if (i >= 37040) {
            az(39, "cms_last_mod_seq");
            c.k(this.P);
        }
        if (i >= 19020) {
            az(40, "web_id");
            c.as(this.Q);
        }
        if (i >= 29100) {
            az(41, "usage_stats_logging_id");
            c.aq(this.R);
        }
        if (i >= 35030) {
            az(42, "send_counter");
            c.af(this.S);
        }
        if (i >= 35030) {
            az(43, "original_rcs_message_id");
            c.L(this.T);
        }
        if (i >= 37020) {
            az(44, "custom_delivery_receipt_mime_type");
            c.p(this.U);
        }
        if (i >= 37020) {
            az(45, "custom_delivery_receipt_content");
            c.o(this.V);
        }
        if (i >= 37030) {
            az(46, "report_attempt_acounter");
            c.aa(this.W);
        }
        if (i >= 45020) {
            az(47, "custom_headers");
            c.q(this.X);
        }
        if (i >= 46010) {
            az(48, "cms_correlation_id");
            c.i(this.Y);
        }
        if (i >= 48030) {
            az(49, "group_private_participant");
            c.u(this.Z);
        }
        if (i >= 48030) {
            az(50, "original_message_id");
            c.J(this.aa);
        }
        if (i >= 49060) {
            az(51, "awaiting_reverse_sync");
            c.f(this.ab);
        }
        if (i >= 49060) {
            az(52, "old_sms_message_uri");
            c.I(this.ac);
        }
        if (i >= 56000) {
            az(53, "draft_id");
            c.r(this.ad);
        }
        if (i >= 58040) {
            az(54, "result_code");
            c.ab(this.ae);
        }
        if (i >= 58210) {
            az(55, "cms_life_cycle");
            c.l(this.af);
        }
        if (i >= 60750) {
            az(56, "mute_priority");
            c.F(this.ag);
        }
        if (i >= 58710) {
            az(57, "fallback_reason");
            c.t(this.ah);
        }
        if (i >= 58230) {
            az(58, "auto_retry_counter");
            c.e(this.ai);
        }
        if (i >= 58280) {
            az(59, "can_revoke_before_delivered_with_rcs");
            c.g(this.aj);
        }
        if (i >= 58680) {
            az(60, "trace_id");
            c.ap(this.ak);
        }
        if (i >= 58720) {
            az(61, "outgoing_delivery_report_status");
            c.M(this.al);
        }
        if (i >= 58720) {
            az(62, "outgoing_read_report_status");
            c.N(this.am);
        }
        if (i >= 59310) {
            az(63, "xms_transport");
            c.at(this.an);
        }
        if (i >= 59430) {
            az(64, "message_original_protocol");
            c.K(this.ao);
        }
        if (i >= 59490) {
            az(65, "satellite_datagram_id");
            c.ad(this.ap);
        }
        if (i >= 60190) {
            az(66, "encryption_protocol");
            c.s(this.aq);
        }
        if (i >= 60370) {
            az(67, "message_persistence_id");
            c.x(this.ar);
        }
        return c.a();
    }

    @Override // defpackage.dtro
    public final String a() {
        Locale locale = Locale.US;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        String valueOf4 = String.valueOf(this.f);
        String valueOf5 = String.valueOf(this.g);
        String valueOf6 = String.valueOf(this.h);
        String valueOf7 = String.valueOf(this.i);
        String valueOf8 = String.valueOf(this.j);
        String valueOf9 = String.valueOf(this.k);
        String valueOf10 = String.valueOf(this.l);
        String valueOf11 = String.valueOf(this.m);
        String valueOf12 = String.valueOf(this.n);
        String valueOf13 = String.valueOf(this.o);
        String valueOf14 = String.valueOf(this.p);
        String valueOf15 = String.valueOf(this.q);
        String valueOf16 = String.valueOf(this.r);
        String valueOf17 = String.valueOf(this.s);
        String valueOf18 = String.valueOf(this.t);
        String valueOf19 = String.valueOf(this.u);
        String valueOf20 = String.valueOf(this.v);
        String valueOf21 = String.valueOf(this.w);
        String valueOf22 = String.valueOf(this.x);
        String valueOf23 = String.valueOf(this.y);
        String valueOf24 = String.valueOf(this.z);
        String valueOf25 = String.valueOf(this.A);
        String valueOf26 = String.valueOf(this.B);
        String valueOf27 = String.valueOf(this.C);
        String valueOf28 = String.valueOf(this.D);
        String valueOf29 = String.valueOf(this.E);
        String valueOf30 = String.valueOf(this.F);
        String valueOf31 = String.valueOf(this.G);
        String valueOf32 = String.valueOf(this.H);
        String valueOf33 = String.valueOf(this.I);
        String valueOf34 = String.valueOf(this.J);
        String valueOf35 = String.valueOf(this.K);
        String valueOf36 = String.valueOf(this.L);
        String valueOf37 = String.valueOf(this.M);
        String valueOf38 = String.valueOf(this.N);
        String valueOf39 = String.valueOf(this.O);
        String valueOf40 = String.valueOf(this.P);
        String valueOf41 = String.valueOf(this.Q);
        String valueOf42 = String.valueOf(this.R);
        String valueOf43 = String.valueOf(this.S);
        String valueOf44 = String.valueOf(this.T);
        String valueOf45 = String.valueOf(this.U);
        byte[] bArr = this.V;
        return String.format(locale, "DraftDataServiceQuery [messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_sender_id: %s,\n  messages.messages_sender_send_destination: %s,\n  messages.messages_msisdn_receiving_rcs_message: %s,\n  messages.messages_receiving_network_country: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_queue_insert_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_message_report_status: %s,\n  messages.messages_seen: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_message_uri: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_sms_message_size: %s,\n  messages.messages_mms_subject: %s,\n  messages.messages_mms_transaction_id: %s,\n  messages.messages_mms_content_location: %s,\n  messages.messages_mms_expiry: %s,\n  messages.messages_rcs_expiry: %s,\n  messages.messages_mms_retrieve_text: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_self_id: %s,\n  messages.messages_my_identity_foreign_key: %s,\n  messages.messages_retry_start_timestamp: %s,\n  messages.messages_cloud_sync_id: %s,\n  messages.messages_rcs_message_id_with_text_type: %s,\n  messages.messages_etouffee_status: %s,\n  messages.messages_verification_status: %s,\n  messages.messages_rcs_ui_status: %s,\n  messages.messages_is_hidden: %s,\n  messages.messages_rcs_remote_instance: %s,\n  messages.messages_rcs_file_transfer_session_id: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  messages.messages_correlation_id: %s,\n  messages.messages_cms_id: %s,\n  messages.messages_cms_last_mod_seq: %s,\n  messages.messages_web_id: %s,\n  messages.messages_usage_stats_logging_id: %s,\n  messages.messages_send_counter: %s,\n  messages.messages_original_rcs_message_id: %s,\n  messages.messages_custom_delivery_receipt_mime_type: %s,\n  messages.messages_custom_delivery_receipt_content: %s,\n  messages.messages_report_attempt_acounter: %s,\n  messages.messages_custom_headers: %s,\n  messages.messages_cms_correlation_id: %s,\n  messages.messages_group_private_participant: %s,\n  messages.messages_original_message_id: %s,\n  messages.messages_awaiting_reverse_sync: %s,\n  messages.messages_old_sms_message_uri: %s,\n  messages.messages_draft_id: %s,\n  messages.messages_result_code: %s,\n  messages.messages_cms_life_cycle: %s,\n  messages.messages_mute_priority: %s,\n  messages.messages_fallback_reason: %s,\n  messages.messages_auto_retry_counter: %s,\n  messages.messages_can_revoke_before_delivered_with_rcs: %s,\n  messages.messages_trace_id: %s,\n  messages.messages_outgoing_delivery_report_status: %s,\n  messages.messages_outgoing_read_report_status: %s,\n  messages.messages_xms_transport: %s,\n  messages.messages_message_original_protocol: %s,\n  messages.messages_satellite_datagram_id: %s,\n  messages.messages_encryption_protocol: %s,\n  messages.messages_message_persistence_id: %s,\n  message_replies_view.message_replies_view_message_replies_message_id: %s,\n  message_replies_view.message_replies_view_messages__id: %s,\n  message_replies_view.message_replies_view_messages_received_timestamp: %s,\n  message_replies_view.message_replies_view_participants__id: %s,\n  message_replies_view.message_replies_view_participants_sub_id: %s,\n  message_replies_view.message_replies_view_participants_normalized_destination: %s,\n  message_replies_view.message_replies_view_participants_display_destination: %s,\n  message_replies_view.message_replies_view_participants_full_name: %s,\n  message_replies_view.message_replies_view_participants_first_name: %s,\n  message_replies_view.message_replies_view_parts__id: %s,\n  message_replies_view.message_replies_view_parts_text: %s,\n  message_replies_view.message_replies_view_parts_uri: %s,\n  message_replies_view.message_replies_view_parts_content_type: %s,\n  message_replies_view.message_replies_view_parts_file_name: %s,\n  message_replies_view.message_replies_view_parts_duration: %s,\n  message_replies_view.message_replies_view_parts_parts__ROWID: %s,\n  message_replies_view.message_replies_view_link_preview_trigger_url: %s,\n  message_replies_view.message_replies_view_link_preview_expiration_time_millis: %s,\n  message_replies_view.message_replies_view_link_preview_link_title: %s,\n  message_replies_view.message_replies_view_link_preview_link_image_url: %s,\n  message_replies_view.message_replies_view_link_preview_link_preview_failed: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.W), String.valueOf(this.X), String.valueOf(this.Y), String.valueOf(this.Z), String.valueOf(this.aa), String.valueOf(this.ab), String.valueOf(this.ac), String.valueOf(this.ad), String.valueOf(this.ae), String.valueOf(this.af), String.valueOf(this.ag), String.valueOf(this.ah), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao), String.valueOf(this.ap), String.valueOf(this.aq), String.valueOf(this.ar), String.valueOf(this.as), String.valueOf(this.at), String.valueOf(this.au), String.valueOf(this.av), String.valueOf(this.aw), String.valueOf(this.ax), String.valueOf(this.ay), String.valueOf(this.az), String.valueOf(this.aA), aL(this.aB), aL(this.aC), aK(this.aD), aL(this.aE), aL(this.aF), aJ(this.aG), aJ(this.aH), String.valueOf(this.aI), String.valueOf(this.aJ), String.valueOf(this.aK), String.valueOf(this.aL), String.valueOf(this.aM));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        bjvk.b().intValue();
    }

    @Override // defpackage.dtro
    protected final /* synthetic */ void c(dtsu dtsuVar) {
        fjay fjayVar;
        fayv fayvVar;
        bjvf bjvfVar = (bjvf) dtsuVar;
        aB();
        this.cL = bjvfVar.cU();
        if (bjvfVar.di(0)) {
            this.c = new MessageIdType(bjvfVar.getLong(bjvfVar.cM(0, bjvk.a)));
            fY(0);
        }
        if (bjvfVar.di(1)) {
            this.d = new ConversationIdType(bjvfVar.getLong(bjvfVar.cM(1, bjvk.a)));
            fY(1);
        }
        if (bjvfVar.di(2)) {
            this.e = bjvfVar.getString(bjvfVar.cM(2, bjvk.a));
            fY(2);
        }
        if (bjvfVar.di(3)) {
            this.f = bjvfVar.getString(bjvfVar.cM(3, bjvk.a));
            fY(3);
        }
        if (bjvfVar.di(4)) {
            this.g = bjvfVar.getString(bjvfVar.cM(4, bjvk.a));
            fY(4);
        }
        if (bjvfVar.di(5)) {
            this.h = bjvfVar.getString(bjvfVar.cM(5, bjvk.a));
            fY(5);
        }
        if (bjvfVar.di(6)) {
            this.i = bjvfVar.getLong(bjvfVar.cM(6, bjvk.a));
            fY(6);
        }
        if (bjvfVar.di(7)) {
            this.j = bdgw.b(bjvfVar.getLong(bjvfVar.cM(7, bjvk.a)));
            fY(7);
        }
        if (bjvfVar.di(8)) {
            this.k = bjvfVar.getLong(bjvfVar.cM(8, bjvk.a));
            fY(8);
        }
        if (bjvfVar.di(9)) {
            this.l = bjvfVar.getInt(bjvfVar.cM(9, bjvk.a));
            fY(9);
        }
        if (bjvfVar.di(10)) {
            this.m = bjvfVar.getInt(bjvfVar.cM(10, bjvk.a));
            fY(10);
        }
        if (bjvfVar.di(11)) {
            this.n = bjvfVar.getInt(bjvfVar.cM(11, bjvk.a));
            fY(11);
        }
        if (bjvfVar.di(12)) {
            this.o = bjvfVar.getInt(bjvfVar.cM(12, bjvk.a)) == 1;
            fY(12);
        }
        if (bjvfVar.di(13)) {
            this.p = bjvfVar.getInt(bjvfVar.cM(13, bjvk.a)) == 1;
            fY(13);
        }
        if (bjvfVar.di(14)) {
            String string = bjvfVar.getString(bjvfVar.cM(14, bjvk.a));
            this.q = string == null ? null : Uri.parse(string);
            fY(14);
        }
        if (bjvfVar.di(15)) {
            this.r = bjvfVar.getInt(bjvfVar.cM(15, bjvk.a));
            fY(15);
        }
        if (bjvfVar.di(16)) {
            this.s = bjvfVar.getLong(bjvfVar.cM(16, bjvk.a));
            fY(16);
        }
        if (bjvfVar.di(17)) {
            this.t = cuxs.a(bjvfVar.getString(bjvfVar.cM(17, bjvk.a)));
            fY(17);
        }
        if (bjvfVar.di(18)) {
            this.u = bjvfVar.getString(bjvfVar.cM(18, bjvk.a));
            fY(18);
        }
        if (bjvfVar.di(19)) {
            this.v = bjvfVar.getString(bjvfVar.cM(19, bjvk.a));
            fY(19);
        }
        if (bjvfVar.di(20)) {
            this.w = bjvfVar.getLong(bjvfVar.cM(20, bjvk.a));
            fY(20);
        }
        if (bjvfVar.di(21)) {
            this.x = bjvfVar.getLong(bjvfVar.cM(21, bjvk.a));
            fY(21);
        }
        if (bjvfVar.di(22)) {
            this.y = bjvfVar.getString(bjvfVar.cM(22, bjvk.a));
            fY(22);
        }
        if (bjvfVar.di(23)) {
            this.z = bjvfVar.getInt(bjvfVar.cM(23, bjvk.a));
            fY(23);
        }
        if (bjvfVar.di(24)) {
            this.A = bjvfVar.getString(bjvfVar.cM(24, bjvk.a));
            fY(24);
        }
        if (bjvfVar.di(25)) {
            this.B = azsv.a(bjvfVar.getString(bjvfVar.cM(25, bjvk.a)));
            fY(25);
        }
        if (bjvfVar.di(26)) {
            this.C = bjvfVar.getLong(bjvfVar.cM(26, bjvk.a));
            fY(26);
        }
        if (bjvfVar.di(27)) {
            this.D = bjvfVar.getString(bjvfVar.cM(27, bjvk.a));
            fY(27);
        }
        if (bjvfVar.di(28)) {
            this.E = bdhg.a(bjvfVar.getString(bjvfVar.cM(28, bjvk.a)));
            fY(28);
        }
        if (bjvfVar.di(29)) {
            this.F = bjvfVar.getInt(bjvfVar.cM(29, bjvk.a));
            fY(29);
        }
        if (bjvfVar.di(30)) {
            byzi[] values = byzi.values();
            int i = bjvfVar.getInt(bjvfVar.cM(30, bjvk.a));
            if (i >= values.length) {
                throw new IllegalArgumentException();
            }
            this.G = values[i];
            fY(30);
        }
        if (bjvfVar.di(31)) {
            this.H = bjvfVar.getInt(bjvfVar.cM(31, bjvk.a));
            fY(31);
        }
        if (bjvfVar.di(32)) {
            this.I = bjvfVar.getInt(bjvfVar.cM(32, bjvk.a)) == 1;
            fY(32);
        }
        if (bjvfVar.di(33)) {
            this.J = bjvfVar.getString(bjvfVar.cM(33, bjvk.a));
            fY(33);
        }
        if (bjvfVar.di(34)) {
            this.K = bjvfVar.getLong(bjvfVar.cM(34, bjvk.a));
            fY(34);
        }
        if (bjvfVar.di(35)) {
            this.L = bjvfVar.getInt(bjvfVar.cM(35, bjvk.a));
            fY(35);
        }
        if (bjvfVar.di(36)) {
            this.M = bjvfVar.getString(bjvfVar.cM(36, bjvk.a));
            fY(36);
        }
        if (bjvfVar.di(37)) {
            this.N = bjvfVar.getString(bjvfVar.cM(37, bjvk.a));
            fY(37);
        }
        if (bjvfVar.di(38)) {
            this.O = bjvfVar.getString(bjvfVar.cM(38, bjvk.a));
            fY(38);
        }
        if (bjvfVar.di(39)) {
            this.P = bjvfVar.getLong(bjvfVar.cM(39, bjvk.a));
            fY(39);
        }
        if (bjvfVar.di(40)) {
            this.Q = bjvfVar.getString(bjvfVar.cM(40, bjvk.a));
            fY(40);
        }
        if (bjvfVar.di(41)) {
            this.R = bjvfVar.getLong(bjvfVar.cM(41, bjvk.a));
            fY(41);
        }
        if (bjvfVar.di(42)) {
            this.S = bjvfVar.getLong(bjvfVar.cM(42, bjvk.a));
            fY(42);
        }
        if (bjvfVar.di(43)) {
            this.T = bdhg.a(bjvfVar.getString(bjvfVar.cM(43, bjvk.a)));
            fY(43);
        }
        if (bjvfVar.di(44)) {
            this.U = bjvfVar.getString(bjvfVar.cM(44, bjvk.a));
            fY(44);
        }
        if (bjvfVar.di(45)) {
            this.V = bjvfVar.getBlob(bjvfVar.cM(45, bjvk.a));
            fY(45);
        }
        if (bjvfVar.di(46)) {
            this.W = bjvfVar.getLong(bjvfVar.cM(46, bjvk.a));
            fY(46);
        }
        if (bjvfVar.di(47)) {
            byte[] blob = bjvfVar.getBlob(bjvfVar.cM(47, bjvk.a));
            if (blob == null) {
                fayvVar = null;
            } else {
                try {
                    fayvVar = (fayv) eyfy.parseFrom(fayv.a, blob, eyfc.a());
                } catch (Throwable unused) {
                    fayvVar = fayv.a;
                }
            }
            this.X = fayvVar;
            fY(47);
        }
        if (bjvfVar.di(48)) {
            this.Y = bjvfVar.getString(bjvfVar.cM(48, bjvk.a));
            fY(48);
        }
        if (bjvfVar.di(49)) {
            this.Z = bjvfVar.getString(bjvfVar.cM(49, bjvk.a));
            fY(49);
        }
        if (bjvfVar.di(50)) {
            this.aa = new MessageIdType(bjvfVar.getLong(bjvfVar.cM(50, bjvk.a)));
            fY(50);
        }
        if (bjvfVar.di(51)) {
            this.ab = bjvfVar.getInt(bjvfVar.cM(51, bjvk.a)) == 1;
            fY(51);
        }
        if (bjvfVar.di(52)) {
            String string2 = bjvfVar.getString(bjvfVar.cM(52, bjvk.a));
            this.ac = string2 == null ? null : Uri.parse(string2);
            fY(52);
        }
        if (bjvfVar.di(53)) {
            this.ad = bdhj.a(bjvfVar.getString(bjvfVar.cM(53, bjvk.a)));
            fY(53);
        }
        if (bjvfVar.di(54)) {
            this.ae = bjvfVar.getInt(bjvfVar.cM(54, bjvk.a));
            fY(54);
        }
        if (bjvfVar.di(55)) {
            csgg[] values2 = csgg.values();
            int i2 = bjvfVar.getInt(bjvfVar.cM(55, bjvk.a));
            if (i2 >= values2.length) {
                throw new IllegalArgumentException();
            }
            this.af = values2[i2];
            fY(55);
        }
        if (bjvfVar.di(56)) {
            cjco[] values3 = cjco.values();
            int i3 = bjvfVar.getInt(bjvfVar.cM(56, bjvk.a));
            if (i3 >= values3.length) {
                throw new IllegalArgumentException();
            }
            this.ag = values3[i3];
            fY(56);
        }
        if (bjvfVar.di(57)) {
            byyw[] values4 = byyw.values();
            int i4 = bjvfVar.getInt(bjvfVar.cM(57, bjvk.a));
            if (i4 >= values4.length) {
                throw new IllegalArgumentException();
            }
            this.ah = values4[i4];
            fY(57);
        }
        if (bjvfVar.di(58)) {
            this.ai = bjvfVar.getInt(bjvfVar.cM(58, bjvk.a));
            fY(58);
        }
        if (bjvfVar.di(59)) {
            this.aj = bjvfVar.getInt(bjvfVar.cM(59, bjvk.a)) == 1;
            fY(59);
        }
        if (bjvfVar.di(60)) {
            byte[] blob2 = bjvfVar.getBlob(bjvfVar.cM(60, bjvk.a));
            if (blob2 == null) {
                fjayVar = null;
            } else {
                try {
                    fjayVar = (fjay) eyfy.parseFrom(fjay.a, blob2, eyfc.a());
                } catch (Throwable unused2) {
                    fjayVar = fjay.a;
                }
            }
            this.ak = fjayVar;
            fY(60);
        }
        if (bjvfVar.di(61)) {
            byzg[] values5 = byzg.values();
            int i5 = bjvfVar.getInt(bjvfVar.cM(61, bjvk.a));
            if (i5 >= values5.length) {
                throw new IllegalArgumentException();
            }
            this.al = values5[i5];
            fY(61);
        }
        if (bjvfVar.di(62)) {
            byzg[] values6 = byzg.values();
            int i6 = bjvfVar.getInt(bjvfVar.cM(62, bjvk.a));
            if (i6 >= values6.length) {
                throw new IllegalArgumentException();
            }
            this.am = values6[i6];
            fY(62);
        }
        if (bjvfVar.di(63)) {
            byzl[] values7 = byzl.values();
            int i7 = bjvfVar.getInt(bjvfVar.cM(63, bjvk.a));
            if (i7 >= values7.length) {
                throw new IllegalArgumentException();
            }
            this.an = values7[i7];
            fY(63);
        }
        if (bjvfVar.di(64)) {
            this.ao = bjvfVar.getInt(bjvfVar.cM(64, bjvk.a));
            fY(64);
        }
        if (bjvfVar.di(65)) {
            this.ap = new bdgr(bjvfVar.getString(bjvfVar.cM(65, bjvk.a)));
            fY(65);
        }
        if (bjvfVar.di(66)) {
            this.aq = new cfmh(bjvfVar.getLong(bjvfVar.cM(66, bjvk.a)));
            fY(66);
        }
        if (bjvfVar.di(67)) {
            this.ar = bdhj.a(bjvfVar.getString(bjvfVar.cM(67, bjvk.a)));
            fY(67);
        }
        if (bjvfVar.di(68)) {
            this.as = new MessageIdType(bjvfVar.getLong(bjvfVar.cM(68, bjvk.a)));
            fY(68);
        }
        if (bjvfVar.di(69)) {
            this.at = new MessageIdType(bjvfVar.getLong(bjvfVar.cM(69, bjvk.a)));
            fY(69);
        }
        if (bjvfVar.di(70)) {
            this.au = bjvfVar.getLong(bjvfVar.cM(70, bjvk.a));
            fY(70);
        }
        if (bjvfVar.di(71)) {
            this.av = bjvfVar.getString(bjvfVar.cM(71, bjvk.a));
            fY(71);
        }
        if (bjvfVar.di(72)) {
            this.aw = bjvfVar.getInt(bjvfVar.cM(72, bjvk.a));
            fY(72);
        }
        if (bjvfVar.di(73)) {
            this.ax = cuxd.a(bjvfVar.getString(bjvfVar.cM(73, bjvk.a)));
            fY(73);
        }
        if (bjvfVar.di(74)) {
            this.ay = cuxd.a(bjvfVar.getString(bjvfVar.cM(74, bjvk.a)));
            fY(74);
        }
        if (bjvfVar.di(75)) {
            this.az = cuxs.a(bjvfVar.getString(bjvfVar.cM(75, bjvk.a)));
            fY(75);
        }
        if (bjvfVar.di(76)) {
            this.aA = cuxs.a(bjvfVar.getString(bjvfVar.cM(76, bjvk.a)));
            fY(76);
        }
        if (bjvfVar.di(77)) {
            this.aB = (String[]) dtub.C(null, bjvf.dt(bjvfVar.getString(bjvfVar.cM(77, bjvk.a))), new String[0]);
            fY(77);
        }
        if (bjvfVar.di(78)) {
            String[] dt = bjvf.dt(bjvfVar.getString(bjvfVar.cM(78, bjvk.a)));
            for (int i8 = 0; i8 < dt.length; i8++) {
                dt[i8] = cuxs.a(dt[i8]);
            }
            this.aC = (String[]) dtub.C(null, dt, new String[0]);
            fY(78);
        }
        if (bjvfVar.di(79)) {
            String[] dt2 = bjvf.dt(bjvfVar.getString(bjvfVar.cM(79, bjvk.a)));
            int length = dt2.length;
            Uri[] uriArr = new Uri[length];
            int i9 = 0;
            int i10 = 0;
            while (i9 < length) {
                String str = dt2[i9];
                int i11 = i10 + 1;
                uriArr[i10] = (str == null || str.length() == 0) ? null : Uri.parse(str);
                i9++;
                i10 = i11;
            }
            this.aD = (Uri[]) dtub.C(null, uriArr, new Uri[0]);
            fY(79);
        }
        if (bjvfVar.di(80)) {
            this.aE = (String[]) dtub.C(null, bjvf.dt(bjvfVar.getString(bjvfVar.cM(80, bjvk.a))), new String[0]);
            fY(80);
        }
        if (bjvfVar.di(81)) {
            this.aF = (String[]) dtub.C(null, bjvf.dt(bjvfVar.getString(bjvfVar.cM(81, bjvk.a))), new String[0]);
            fY(81);
        }
        if (bjvfVar.di(82)) {
            this.aG = dtub.B(null, bjvf.ds(bjvfVar.getString(bjvfVar.cM(82, bjvk.a))));
            fY(82);
        }
        if (bjvfVar.di(83)) {
            this.aH = dtub.B(null, bjvf.ds(bjvfVar.getString(bjvfVar.cM(83, bjvk.a))));
            fY(83);
        }
        if (bjvfVar.di(84)) {
            this.aI = bjvfVar.getString(bjvfVar.cM(84, bjvk.a));
            fY(84);
        }
        if (bjvfVar.di(85)) {
            this.aJ = bjvfVar.getLong(bjvfVar.cM(85, bjvk.a));
            fY(85);
        }
        if (bjvfVar.di(86)) {
            this.aK = cuxs.a(bjvfVar.getString(bjvfVar.cM(86, bjvk.a)));
            fY(86);
        }
        if (bjvfVar.di(87)) {
            this.aL = bjvfVar.getString(bjvfVar.cM(87, bjvk.a));
            fY(87);
        }
        if (bjvfVar.di(88)) {
            this.aM = bjvfVar.getInt(bjvfVar.cM(88, bjvk.a)) == 1;
            fY(88);
        }
        this.b = f(bjvk.b().intValue());
        bmwt a = bnlv.a();
        az(68, "message_id");
        a.o(this.as);
        az(69, "_id");
        a.i(this.at);
        az(70, "received_timestamp");
        a.r(this.au);
        az(71, "_id");
        a.j(this.av);
        az(72, "sub_id");
        a.s(this.aw);
        az(73, "normalized_destination");
        a.p(this.ax);
        az(74, "display_destination");
        a.c(this.ay);
        az(75, "full_name");
        a.h(this.az);
        az(76, "first_name");
        a.g(this.aA);
        az(77, "_id");
        a.k(this.aB);
        az(78, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT);
        a.t(this.aC);
        az(79, ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        a.v(this.aD);
        az(80, "content_type");
        a.b(this.aE);
        az(81, "file_name");
        a.f(this.aF);
        az(82, "duration");
        a.d(this.aG);
        az(83, "parts__ROWID");
        a.q(this.aH);
        az(84, "trigger_url");
        a.u(this.aI);
        az(85, "expiration_time_millis");
        a.e(this.aJ);
        az(86, "link_title");
        a.n(this.aK);
        az(87, "link_image_url");
        a.l(this.aL);
        az(88, "link_preview_failed");
        a.m(this.aM);
        this.a = a.a();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bjoa)) {
            return false;
        }
        bjoa bjoaVar = (bjoa) obj;
        return super.aD(bjoaVar.cL) && Objects.equals(this.c, bjoaVar.c) && Objects.equals(this.d, bjoaVar.d) && Objects.equals(this.e, bjoaVar.e) && Objects.equals(this.f, bjoaVar.f) && Objects.equals(this.g, bjoaVar.g) && Objects.equals(this.h, bjoaVar.h) && this.i == bjoaVar.i && Objects.equals(this.j, bjoaVar.j) && this.k == bjoaVar.k && this.l == bjoaVar.l && this.m == bjoaVar.m && this.n == bjoaVar.n && this.o == bjoaVar.o && this.p == bjoaVar.p && Objects.equals(this.q, bjoaVar.q) && this.r == bjoaVar.r && this.s == bjoaVar.s && Objects.equals(this.t, bjoaVar.t) && Objects.equals(this.u, bjoaVar.u) && Objects.equals(this.v, bjoaVar.v) && this.w == bjoaVar.w && this.x == bjoaVar.x && Objects.equals(this.y, bjoaVar.y) && this.z == bjoaVar.z && Objects.equals(this.A, bjoaVar.A) && Objects.equals(this.B, bjoaVar.B) && this.C == bjoaVar.C && Objects.equals(this.D, bjoaVar.D) && Objects.equals(this.E, bjoaVar.E) && this.F == bjoaVar.F && this.G == bjoaVar.G && this.H == bjoaVar.H && this.I == bjoaVar.I && Objects.equals(this.J, bjoaVar.J) && this.K == bjoaVar.K && this.L == bjoaVar.L && Objects.equals(this.M, bjoaVar.M) && Objects.equals(this.N, bjoaVar.N) && Objects.equals(this.O, bjoaVar.O) && this.P == bjoaVar.P && Objects.equals(this.Q, bjoaVar.Q) && this.R == bjoaVar.R && this.S == bjoaVar.S && Objects.equals(this.T, bjoaVar.T) && Objects.equals(this.U, bjoaVar.U) && Arrays.equals(this.V, bjoaVar.V) && this.W == bjoaVar.W && Objects.equals(this.X, bjoaVar.X) && Objects.equals(this.Y, bjoaVar.Y) && Objects.equals(this.Z, bjoaVar.Z) && Objects.equals(this.aa, bjoaVar.aa) && this.ab == bjoaVar.ab && Objects.equals(this.ac, bjoaVar.ac) && Objects.equals(this.ad, bjoaVar.ad) && this.ae == bjoaVar.ae && this.af == bjoaVar.af && this.ag == bjoaVar.ag && this.ah == bjoaVar.ah && this.ai == bjoaVar.ai && this.aj == bjoaVar.aj && Objects.equals(this.ak, bjoaVar.ak) && this.al == bjoaVar.al && this.am == bjoaVar.am && this.an == bjoaVar.an && this.ao == bjoaVar.ao && Objects.equals(this.ap, bjoaVar.ap) && Objects.equals(this.aq, bjoaVar.aq) && Objects.equals(this.ar, bjoaVar.ar) && Objects.equals(this.as, bjoaVar.as) && Objects.equals(this.at, bjoaVar.at) && this.au == bjoaVar.au && Objects.equals(this.av, bjoaVar.av) && this.aw == bjoaVar.aw && Objects.equals(this.ax, bjoaVar.ax) && Objects.equals(this.ay, bjoaVar.ay) && Objects.equals(this.az, bjoaVar.az) && Objects.equals(this.aA, bjoaVar.aA) && Arrays.equals(this.aB, bjoaVar.aB) && Arrays.equals(this.aC, bjoaVar.aC) && Arrays.equals(this.aD, bjoaVar.aD) && Arrays.equals(this.aE, bjoaVar.aE) && Arrays.equals(this.aF, bjoaVar.aF) && Arrays.equals(this.aG, bjoaVar.aG) && Arrays.equals(this.aH, bjoaVar.aH) && Objects.equals(this.aI, bjoaVar.aI) && this.aJ == bjoaVar.aJ && Objects.equals(this.aK, bjoaVar.aK) && Objects.equals(this.aL, bjoaVar.aL) && this.aM == bjoaVar.aM;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        MessageIdType messageIdType = this.c;
        ConversationIdType conversationIdType = this.d;
        String str = this.e;
        String str2 = this.f;
        String str3 = this.g;
        String str4 = this.h;
        Long valueOf = Long.valueOf(this.i);
        Instant instant = this.j;
        Long valueOf2 = Long.valueOf(this.k);
        Integer valueOf3 = Integer.valueOf(this.l);
        Integer valueOf4 = Integer.valueOf(this.m);
        Integer valueOf5 = Integer.valueOf(this.n);
        Boolean valueOf6 = Boolean.valueOf(this.o);
        Boolean valueOf7 = Boolean.valueOf(this.p);
        dtsq dtsqVar3 = dtsqVar2;
        Uri uri = this.q;
        Integer valueOf8 = Integer.valueOf(this.r);
        Long valueOf9 = Long.valueOf(this.s);
        String str5 = this.t;
        String str6 = this.u;
        String str7 = this.v;
        Long valueOf10 = Long.valueOf(this.w);
        Long valueOf11 = Long.valueOf(this.x);
        String str8 = this.y;
        Integer valueOf12 = Integer.valueOf(this.z);
        String str9 = this.A;
        azsu azsuVar = this.B;
        Long valueOf13 = Long.valueOf(this.C);
        String str10 = this.D;
        bdhg bdhgVar = this.E;
        Integer valueOf14 = Integer.valueOf(this.F);
        byzi byziVar = this.G;
        Integer valueOf15 = Integer.valueOf(byziVar == null ? 0 : byziVar.ordinal());
        Integer valueOf16 = Integer.valueOf(this.H);
        Boolean valueOf17 = Boolean.valueOf(this.I);
        String str11 = this.J;
        Long valueOf18 = Long.valueOf(this.K);
        Integer valueOf19 = Integer.valueOf(this.L);
        String str12 = this.M;
        String str13 = this.N;
        String str14 = this.O;
        Long valueOf20 = Long.valueOf(this.P);
        String str15 = this.Q;
        Long valueOf21 = Long.valueOf(this.R);
        Long valueOf22 = Long.valueOf(this.S);
        bdhg bdhgVar2 = this.T;
        String str16 = this.U;
        Integer valueOf23 = Integer.valueOf(Arrays.hashCode(this.V));
        Long valueOf24 = Long.valueOf(this.W);
        fayv fayvVar = this.X;
        String str17 = this.Y;
        String str18 = this.Z;
        MessageIdType messageIdType2 = this.aa;
        Boolean valueOf25 = Boolean.valueOf(this.ab);
        Uri uri2 = this.ac;
        Optional optional = this.ad;
        Integer valueOf26 = Integer.valueOf(this.ae);
        csgg csggVar = this.af;
        Integer valueOf27 = Integer.valueOf(csggVar == null ? 0 : csggVar.ordinal());
        cjco cjcoVar = this.ag;
        Integer valueOf28 = Integer.valueOf(cjcoVar == null ? 0 : cjcoVar.ordinal());
        byyw byywVar = this.ah;
        Integer valueOf29 = Integer.valueOf(byywVar == null ? 0 : byywVar.ordinal());
        Integer valueOf30 = Integer.valueOf(this.ai);
        Boolean valueOf31 = Boolean.valueOf(this.aj);
        fjay fjayVar = this.ak;
        byzg byzgVar = this.al;
        Integer valueOf32 = Integer.valueOf(byzgVar == null ? 0 : byzgVar.ordinal());
        byzg byzgVar2 = this.am;
        Integer valueOf33 = Integer.valueOf(byzgVar2 == null ? 0 : byzgVar2.ordinal());
        byzl byzlVar = this.an;
        return Objects.hash(dtsqVar3, messageIdType, conversationIdType, str, str2, str3, str4, valueOf, instant, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, uri, valueOf8, valueOf9, str5, str6, str7, valueOf10, valueOf11, str8, valueOf12, str9, azsuVar, valueOf13, str10, bdhgVar, valueOf14, valueOf15, valueOf16, valueOf17, str11, valueOf18, valueOf19, str12, str13, str14, valueOf20, str15, valueOf21, valueOf22, bdhgVar2, str16, valueOf23, valueOf24, fayvVar, str17, str18, messageIdType2, valueOf25, uri2, optional, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, fjayVar, valueOf32, valueOf33, Integer.valueOf(byzlVar == null ? 0 : byzlVar.ordinal()), Integer.valueOf(this.ao), this.ap, this.aq, this.ar, this.as, this.at, Long.valueOf(this.au), this.av, Integer.valueOf(this.aw), this.ax, this.ay, this.az, this.aA, Integer.valueOf(Arrays.hashCode(this.aB)), Integer.valueOf(Arrays.hashCode(this.aC)), Integer.valueOf(Arrays.hashCode(this.aD)), Integer.valueOf(Arrays.hashCode(this.aE)), Integer.valueOf(Arrays.hashCode(this.aF)), Integer.valueOf(Arrays.hashCode(this.aG)), Integer.valueOf(Arrays.hashCode(this.aH)), this.aI, Long.valueOf(this.aJ), this.aK, this.aL, Boolean.valueOf(this.aM), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "DraftDataServiceQuery -- REDACTED") : a();
    }
}
