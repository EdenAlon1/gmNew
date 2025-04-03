package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.time.Instant;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class agst extends dtro {
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
    private int ar;
    private String c;
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

    protected agst() {
        byzg byzgVar = byzg.UNKNOWN;
        this.aj = byzgVar;
        this.ak = byzgVar;
        this.al = byzl.UNKNOWN;
        this.am = -1;
        this.an = bdgr.a;
        this.ao = new cfmh(0L);
        this.ap = bdhf.a();
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
        return String.format(locale, "MessageOptionalLabelsQuery [messages.messages__id: %s,\n  messages.messages_conversation_id: %s,\n  messages.messages_sender_id: %s,\n  messages.messages_sender_send_destination: %s,\n  messages.messages_msisdn_receiving_rcs_message: %s,\n  messages.messages_receiving_network_country: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_queue_insert_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_message_report_status: %s,\n  messages.messages_seen: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_message_uri: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_sms_message_size: %s,\n  messages.messages_mms_subject: %s,\n  messages.messages_mms_transaction_id: %s,\n  messages.messages_mms_content_location: %s,\n  messages.messages_mms_expiry: %s,\n  messages.messages_rcs_expiry: %s,\n  messages.messages_mms_retrieve_text: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_self_id: %s,\n  messages.messages_my_identity_foreign_key: %s,\n  messages.messages_retry_start_timestamp: %s,\n  messages.messages_cloud_sync_id: %s,\n  messages.messages_rcs_message_id_with_text_type: %s,\n  messages.messages_etouffee_status: %s,\n  messages.messages_verification_status: %s,\n  messages.messages_rcs_ui_status: %s,\n  messages.messages_is_hidden: %s,\n  messages.messages_rcs_remote_instance: %s,\n  messages.messages_rcs_file_transfer_session_id: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  messages.messages_correlation_id: %s,\n  messages.messages_cms_id: %s,\n  messages.messages_cms_last_mod_seq: %s,\n  messages.messages_web_id: %s,\n  messages.messages_usage_stats_logging_id: %s,\n  messages.messages_send_counter: %s,\n  messages.messages_original_rcs_message_id: %s,\n  messages.messages_custom_delivery_receipt_mime_type: %s,\n  messages.messages_custom_delivery_receipt_content: %s,\n  messages.messages_report_attempt_acounter: %s,\n  messages.messages_custom_headers: %s,\n  messages.messages_cms_correlation_id: %s,\n  messages.messages_group_private_participant: %s,\n  messages.messages_original_message_id: %s,\n  messages.messages_awaiting_reverse_sync: %s,\n  messages.messages_old_sms_message_uri: %s,\n  messages.messages_draft_id: %s,\n  messages.messages_result_code: %s,\n  messages.messages_cms_life_cycle: %s,\n  messages.messages_mute_priority: %s,\n  messages.messages_fallback_reason: %s,\n  messages.messages_auto_retry_counter: %s,\n  messages.messages_can_revoke_before_delivered_with_rcs: %s,\n  messages.messages_trace_id: %s,\n  messages.messages_outgoing_delivery_report_status: %s,\n  messages.messages_outgoing_read_report_status: %s,\n  messages.messages_xms_transport: %s,\n  messages.messages_message_original_protocol: %s,\n  messages.messages_satellite_datagram_id: %s,\n  messages.messages_encryption_protocol: %s,\n  messages.messages_message_persistence_id: %s,\n  message_labels.message_labels__id: %s,\n  message_labels.message_labels_label: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.U), String.valueOf(this.V), String.valueOf(this.W), String.valueOf(this.X), String.valueOf(this.Y), String.valueOf(this.Z), String.valueOf(this.aa), String.valueOf(this.ab), String.valueOf(this.ac), String.valueOf(this.ad), String.valueOf(this.ae), String.valueOf(this.af), String.valueOf(this.ag), String.valueOf(this.ah), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao), String.valueOf(this.ap), String.valueOf(this.aq), String.valueOf(this.ar));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        agze.c().intValue();
    }

    @Override // defpackage.dtro
    protected final /* synthetic */ void c(dtsu dtsuVar) {
        fayv fayvVar;
        agyz agyzVar = (agyz) dtsuVar;
        aB();
        this.cL = agyzVar.cU();
        if (agyzVar.di(0)) {
            this.a = new MessageIdType(agyzVar.getLong(agyzVar.cM(0, agze.a)));
            fY(0);
        }
        if (agyzVar.di(1)) {
            this.b = new ConversationIdType(agyzVar.getLong(agyzVar.cM(1, agze.a)));
            fY(1);
        }
        if (agyzVar.di(2)) {
            this.c = agyzVar.getString(agyzVar.cM(2, agze.a));
            fY(2);
        }
        if (agyzVar.di(3)) {
            this.d = agyzVar.getString(agyzVar.cM(3, agze.a));
            fY(3);
        }
        if (agyzVar.di(4)) {
            this.e = agyzVar.getString(agyzVar.cM(4, agze.a));
            fY(4);
        }
        if (agyzVar.di(5)) {
            this.f = agyzVar.getString(agyzVar.cM(5, agze.a));
            fY(5);
        }
        if (agyzVar.di(6)) {
            this.g = agyzVar.getLong(agyzVar.cM(6, agze.a));
            fY(6);
        }
        if (agyzVar.di(7)) {
            this.h = bdgw.b(agyzVar.getLong(agyzVar.cM(7, agze.a)));
            fY(7);
        }
        if (agyzVar.di(8)) {
            this.i = agyzVar.getLong(agyzVar.cM(8, agze.a));
            fY(8);
        }
        if (agyzVar.di(9)) {
            this.j = agyzVar.getInt(agyzVar.cM(9, agze.a));
            fY(9);
        }
        if (agyzVar.di(10)) {
            this.k = agyzVar.getInt(agyzVar.cM(10, agze.a));
            fY(10);
        }
        if (agyzVar.di(11)) {
            this.l = agyzVar.getInt(agyzVar.cM(11, agze.a));
            fY(11);
        }
        if (agyzVar.di(12)) {
            this.m = agyzVar.getInt(agyzVar.cM(12, agze.a)) == 1;
            fY(12);
        }
        if (agyzVar.di(13)) {
            this.n = agyzVar.getInt(agyzVar.cM(13, agze.a)) == 1;
            fY(13);
        }
        fjay fjayVar = null;
        if (agyzVar.di(14)) {
            String string = agyzVar.getString(agyzVar.cM(14, agze.a));
            this.o = string == null ? null : Uri.parse(string);
            fY(14);
        }
        if (agyzVar.di(15)) {
            this.p = agyzVar.getInt(agyzVar.cM(15, agze.a));
            fY(15);
        }
        if (agyzVar.di(16)) {
            this.q = agyzVar.getLong(agyzVar.cM(16, agze.a));
            fY(16);
        }
        if (agyzVar.di(17)) {
            this.r = cuxs.a(agyzVar.getString(agyzVar.cM(17, agze.a)));
            fY(17);
        }
        if (agyzVar.di(18)) {
            this.s = agyzVar.getString(agyzVar.cM(18, agze.a));
            fY(18);
        }
        if (agyzVar.di(19)) {
            this.t = agyzVar.getString(agyzVar.cM(19, agze.a));
            fY(19);
        }
        if (agyzVar.di(20)) {
            this.u = agyzVar.getLong(agyzVar.cM(20, agze.a));
            fY(20);
        }
        if (agyzVar.di(21)) {
            this.v = agyzVar.getLong(agyzVar.cM(21, agze.a));
            fY(21);
        }
        if (agyzVar.di(22)) {
            this.w = agyzVar.getString(agyzVar.cM(22, agze.a));
            fY(22);
        }
        if (agyzVar.di(23)) {
            this.x = agyzVar.getInt(agyzVar.cM(23, agze.a));
            fY(23);
        }
        if (agyzVar.di(24)) {
            this.y = agyzVar.getString(agyzVar.cM(24, agze.a));
            fY(24);
        }
        if (agyzVar.di(25)) {
            this.z = azsv.a(agyzVar.getString(agyzVar.cM(25, agze.a)));
            fY(25);
        }
        if (agyzVar.di(26)) {
            this.A = agyzVar.getLong(agyzVar.cM(26, agze.a));
            fY(26);
        }
        if (agyzVar.di(27)) {
            this.B = agyzVar.getString(agyzVar.cM(27, agze.a));
            fY(27);
        }
        if (agyzVar.di(28)) {
            this.C = bdhg.a(agyzVar.getString(agyzVar.cM(28, agze.a)));
            fY(28);
        }
        if (agyzVar.di(29)) {
            this.D = agyzVar.getInt(agyzVar.cM(29, agze.a));
            fY(29);
        }
        if (agyzVar.di(30)) {
            byzi[] values = byzi.values();
            int i = agyzVar.getInt(agyzVar.cM(30, agze.a));
            if (i >= values.length) {
                throw new IllegalArgumentException();
            }
            this.E = values[i];
            fY(30);
        }
        if (agyzVar.di(31)) {
            this.F = agyzVar.getInt(agyzVar.cM(31, agze.a));
            fY(31);
        }
        if (agyzVar.di(32)) {
            this.G = agyzVar.getInt(agyzVar.cM(32, agze.a)) == 1;
            fY(32);
        }
        if (agyzVar.di(33)) {
            this.H = agyzVar.getString(agyzVar.cM(33, agze.a));
            fY(33);
        }
        if (agyzVar.di(34)) {
            this.I = agyzVar.getLong(agyzVar.cM(34, agze.a));
            fY(34);
        }
        if (agyzVar.di(35)) {
            this.J = agyzVar.getInt(agyzVar.cM(35, agze.a));
            fY(35);
        }
        if (agyzVar.di(36)) {
            this.K = agyzVar.getString(agyzVar.cM(36, agze.a));
            fY(36);
        }
        if (agyzVar.di(37)) {
            this.L = agyzVar.getString(agyzVar.cM(37, agze.a));
            fY(37);
        }
        if (agyzVar.di(38)) {
            this.M = agyzVar.getString(agyzVar.cM(38, agze.a));
            fY(38);
        }
        if (agyzVar.di(39)) {
            this.N = agyzVar.getLong(agyzVar.cM(39, agze.a));
            fY(39);
        }
        if (agyzVar.di(40)) {
            this.O = agyzVar.getString(agyzVar.cM(40, agze.a));
            fY(40);
        }
        if (agyzVar.di(41)) {
            this.P = agyzVar.getLong(agyzVar.cM(41, agze.a));
            fY(41);
        }
        if (agyzVar.di(42)) {
            this.Q = agyzVar.getLong(agyzVar.cM(42, agze.a));
            fY(42);
        }
        if (agyzVar.di(43)) {
            this.R = bdhg.a(agyzVar.getString(agyzVar.cM(43, agze.a)));
            fY(43);
        }
        if (agyzVar.di(44)) {
            this.S = agyzVar.getString(agyzVar.cM(44, agze.a));
            fY(44);
        }
        if (agyzVar.di(45)) {
            this.T = agyzVar.getBlob(agyzVar.cM(45, agze.a));
            fY(45);
        }
        if (agyzVar.di(46)) {
            this.U = agyzVar.getLong(agyzVar.cM(46, agze.a));
            fY(46);
        }
        if (agyzVar.di(47)) {
            byte[] blob = agyzVar.getBlob(agyzVar.cM(47, agze.a));
            if (blob == null) {
                fayvVar = null;
            } else {
                try {
                    fayvVar = (fayv) eyfy.parseFrom(fayv.a, blob, eyfc.a());
                } catch (Throwable unused) {
                    fayvVar = fayv.a;
                }
            }
            this.V = fayvVar;
            fY(47);
        }
        if (agyzVar.di(48)) {
            this.W = agyzVar.getString(agyzVar.cM(48, agze.a));
            fY(48);
        }
        if (agyzVar.di(49)) {
            this.X = agyzVar.getString(agyzVar.cM(49, agze.a));
            fY(49);
        }
        if (agyzVar.di(50)) {
            this.Y = new MessageIdType(agyzVar.getLong(agyzVar.cM(50, agze.a)));
            fY(50);
        }
        if (agyzVar.di(51)) {
            this.Z = agyzVar.getInt(agyzVar.cM(51, agze.a)) == 1;
            fY(51);
        }
        if (agyzVar.di(52)) {
            String string2 = agyzVar.getString(agyzVar.cM(52, agze.a));
            this.aa = string2 == null ? null : Uri.parse(string2);
            fY(52);
        }
        if (agyzVar.di(53)) {
            this.ab = bdhj.a(agyzVar.getString(agyzVar.cM(53, agze.a)));
            fY(53);
        }
        if (agyzVar.di(54)) {
            this.ac = agyzVar.getInt(agyzVar.cM(54, agze.a));
            fY(54);
        }
        if (agyzVar.di(55)) {
            csgg[] values2 = csgg.values();
            int i2 = agyzVar.getInt(agyzVar.cM(55, agze.a));
            if (i2 >= values2.length) {
                throw new IllegalArgumentException();
            }
            this.ad = values2[i2];
            fY(55);
        }
        if (agyzVar.di(56)) {
            cjco[] values3 = cjco.values();
            int i3 = agyzVar.getInt(agyzVar.cM(56, agze.a));
            if (i3 >= values3.length) {
                throw new IllegalArgumentException();
            }
            this.ae = values3[i3];
            fY(56);
        }
        if (agyzVar.di(57)) {
            byyw[] values4 = byyw.values();
            int i4 = agyzVar.getInt(agyzVar.cM(57, agze.a));
            if (i4 >= values4.length) {
                throw new IllegalArgumentException();
            }
            this.af = values4[i4];
            fY(57);
        }
        if (agyzVar.di(58)) {
            this.ag = agyzVar.getInt(agyzVar.cM(58, agze.a));
            fY(58);
        }
        if (agyzVar.di(59)) {
            this.ah = agyzVar.getInt(agyzVar.cM(59, agze.a)) == 1;
            fY(59);
        }
        if (agyzVar.di(60)) {
            byte[] blob2 = agyzVar.getBlob(agyzVar.cM(60, agze.a));
            if (blob2 != null) {
                try {
                    fjayVar = (fjay) eyfy.parseFrom(fjay.a, blob2, eyfc.a());
                } catch (Throwable unused2) {
                    fjayVar = fjay.a;
                }
            }
            this.ai = fjayVar;
            fY(60);
        }
        if (agyzVar.di(61)) {
            byzg[] values5 = byzg.values();
            int i5 = agyzVar.getInt(agyzVar.cM(61, agze.a));
            if (i5 >= values5.length) {
                throw new IllegalArgumentException();
            }
            this.aj = values5[i5];
            fY(61);
        }
        if (agyzVar.di(62)) {
            byzg[] values6 = byzg.values();
            int i6 = agyzVar.getInt(agyzVar.cM(62, agze.a));
            if (i6 >= values6.length) {
                throw new IllegalArgumentException();
            }
            this.ak = values6[i6];
            fY(62);
        }
        if (agyzVar.di(63)) {
            byzl[] values7 = byzl.values();
            int i7 = agyzVar.getInt(agyzVar.cM(63, agze.a));
            if (i7 >= values7.length) {
                throw new IllegalArgumentException();
            }
            this.al = values7[i7];
            fY(63);
        }
        if (agyzVar.di(64)) {
            this.am = agyzVar.getInt(agyzVar.cM(64, agze.a));
            fY(64);
        }
        if (agyzVar.di(65)) {
            this.an = new bdgr(agyzVar.getString(agyzVar.cM(65, agze.a)));
            fY(65);
        }
        if (agyzVar.di(66)) {
            this.ao = new cfmh(agyzVar.getLong(agyzVar.cM(66, agze.a)));
            fY(66);
        }
        if (agyzVar.di(67)) {
            this.ap = bdhj.a(agyzVar.getString(agyzVar.cM(67, agze.a)));
            fY(67);
        }
        if (agyzVar.di(68)) {
            this.aq = agyzVar.getString(agyzVar.cM(68, agze.a));
            fY(68);
        }
        if (agyzVar.di(69)) {
            this.ar = agyzVar.getInt(agyzVar.cM(69, agze.a));
            fY(69);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof agst)) {
            return false;
        }
        agst agstVar = (agst) obj;
        return super.aD(agstVar.cL) && Objects.equals(this.a, agstVar.a) && Objects.equals(this.b, agstVar.b) && Objects.equals(this.c, agstVar.c) && Objects.equals(this.d, agstVar.d) && Objects.equals(this.e, agstVar.e) && Objects.equals(this.f, agstVar.f) && this.g == agstVar.g && Objects.equals(this.h, agstVar.h) && this.i == agstVar.i && this.j == agstVar.j && this.k == agstVar.k && this.l == agstVar.l && this.m == agstVar.m && this.n == agstVar.n && Objects.equals(this.o, agstVar.o) && this.p == agstVar.p && this.q == agstVar.q && Objects.equals(this.r, agstVar.r) && Objects.equals(this.s, agstVar.s) && Objects.equals(this.t, agstVar.t) && this.u == agstVar.u && this.v == agstVar.v && Objects.equals(this.w, agstVar.w) && this.x == agstVar.x && Objects.equals(this.y, agstVar.y) && Objects.equals(this.z, agstVar.z) && this.A == agstVar.A && Objects.equals(this.B, agstVar.B) && Objects.equals(this.C, agstVar.C) && this.D == agstVar.D && this.E == agstVar.E && this.F == agstVar.F && this.G == agstVar.G && Objects.equals(this.H, agstVar.H) && this.I == agstVar.I && this.J == agstVar.J && Objects.equals(this.K, agstVar.K) && Objects.equals(this.L, agstVar.L) && Objects.equals(this.M, agstVar.M) && this.N == agstVar.N && Objects.equals(this.O, agstVar.O) && this.P == agstVar.P && this.Q == agstVar.Q && Objects.equals(this.R, agstVar.R) && Objects.equals(this.S, agstVar.S) && Arrays.equals(this.T, agstVar.T) && this.U == agstVar.U && Objects.equals(this.V, agstVar.V) && Objects.equals(this.W, agstVar.W) && Objects.equals(this.X, agstVar.X) && Objects.equals(this.Y, agstVar.Y) && this.Z == agstVar.Z && Objects.equals(this.aa, agstVar.aa) && Objects.equals(this.ab, agstVar.ab) && this.ac == agstVar.ac && this.ad == agstVar.ad && this.ae == agstVar.ae && this.af == agstVar.af && this.ag == agstVar.ag && this.ah == agstVar.ah && Objects.equals(this.ai, agstVar.ai) && this.aj == agstVar.aj && this.ak == agstVar.ak && this.al == agstVar.al && this.am == agstVar.am && Objects.equals(this.an, agstVar.an) && Objects.equals(this.ao, agstVar.ao) && Objects.equals(this.ap, agstVar.ap) && Objects.equals(this.aq, agstVar.aq) && this.ar == agstVar.ar;
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
        return Objects.hash(dtsqVar3, messageIdType, conversationIdType, str, str2, str3, str4, valueOf, instant, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, uri, valueOf8, valueOf9, str5, str6, str7, valueOf10, valueOf11, str8, valueOf12, str9, azsuVar, valueOf13, str10, bdhgVar, valueOf14, valueOf15, valueOf16, valueOf17, str11, valueOf18, valueOf19, str12, str13, str14, valueOf20, str15, valueOf21, valueOf22, bdhgVar2, str16, valueOf23, valueOf24, fayvVar, str17, str18, messageIdType2, valueOf25, uri2, optional, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, fjayVar, valueOf32, valueOf33, Integer.valueOf(byzlVar == null ? 0 : byzlVar.ordinal()), Integer.valueOf(this.am), this.an, this.ao, this.ap, this.aq, Integer.valueOf(this.ar), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageOptionalLabelsQuery -- REDACTED") : a();
    }
}
