package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class blre extends dtro {
    private long A;
    private String B;
    private String C;
    private String D;
    private String E;
    private String F;
    private azsu G;
    private azcr H;
    private int I;
    private boolean J;
    private String K;
    private boolean L;
    private boolean M;
    private String N;
    private String O;
    private String P;
    private int Q;
    private long R;
    private int S;
    private int T;
    private int U;
    private boolean V;
    private boolean W;
    private long X;
    private String Y;
    private String Z;
    private String a;
    private cfmf aA;
    private String aB;
    private Uri aC;
    private int aD;
    private boolean aa;
    private int ab;
    private long ac;
    private long ad;
    private String ae;
    private String af;
    private String ag;
    private byte[] ah;
    private long ai;
    private long aj;
    private boolean ak;
    private cknh al;
    private boolean am;
    private ConversationIdType an;
    private ConversationIdType ao;
    private ayhd ap;
    private csgg aq;
    private String ar;
    private Optional as;
    private Optional at;
    private boolean au;
    private boolean av;
    private ckkz aw;
    private ckte ax;
    private int ay;
    private cfmh az;
    private ConversationIdType b;
    private MessageIdType c;
    private int d;
    private fbuk e;
    private ConversationIdType f;
    private cpxu g;
    private String h;
    private byyy i;
    private String j;
    private MessageIdType k;
    private String l;
    private String m;
    private Uri n;
    private String o;
    private boolean p;
    private String q;
    private String r;
    private Uri s;
    private String t;
    private int u;
    private byyt v;
    private long w;
    private long x;
    private String y;
    private long z;

    protected blre() {
        ConversationIdType conversationIdType = bdgq.a;
        this.b = conversationIdType;
        this.c = bdhb.a;
        this.d = 0;
        this.f = conversationIdType;
        this.g = new cpxu();
        this.i = byyy.NAME_IS_AUTOMATIC;
        this.k = bdhb.a;
        this.p = false;
        this.u = 0;
        this.v = byyt.UNARCHIVED;
        this.w = 0L;
        this.x = 0L;
        this.z = -1L;
        this.A = -1L;
        this.G = null;
        this.H = null;
        this.I = 0;
        this.J = true;
        this.L = true;
        this.M = false;
        this.Q = 0;
        this.R = -1L;
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = 0L;
        this.aa = false;
        this.ab = 0;
        this.ac = 0L;
        this.ad = 0L;
        this.ai = 0L;
        this.aj = -1L;
        this.ak = true;
        this.al = new cknh(0L);
        this.am = false;
        ConversationIdType conversationIdType2 = bdgq.a;
        this.an = conversationIdType2;
        this.ao = conversationIdType2;
        this.ap = ayhd.b(0);
        this.aq = csgg.UNKNOWN;
        this.as = bdhe.b(-1L);
        this.at = bdhe.b(-1L);
        this.au = false;
        this.av = false;
        this.ax = ckte.a;
        this.ay = 0;
        this.az = new cfmh(0L);
        this.aA = null;
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
        String valueOf46 = String.valueOf(this.T);
        String valueOf47 = String.valueOf(this.U);
        String valueOf48 = String.valueOf(this.V);
        String valueOf49 = String.valueOf(this.W);
        String valueOf50 = String.valueOf(this.X);
        String valueOf51 = String.valueOf(this.Y);
        String valueOf52 = String.valueOf(this.Z);
        String valueOf53 = String.valueOf(this.aa);
        String valueOf54 = String.valueOf(this.ab);
        String valueOf55 = String.valueOf(this.ac);
        String valueOf56 = String.valueOf(this.ad);
        String valueOf57 = String.valueOf(this.ae);
        String valueOf58 = String.valueOf(this.af);
        String valueOf59 = String.valueOf(this.ag);
        byte[] bArr = this.ah;
        return String.format(locale, "MessageAnnotationJoinConversations [messages_annotations.messages_annotations__id: %s,\n  messages_annotations.messages_annotations_conversation_id: %s,\n  messages_annotations.messages_annotations_message_id: %s,\n  messages_annotations.messages_annotations_annotation_type: %s,\n  messages_annotations.messages_annotations_annotation_details: %s,\n  conversations.conversations__id: %s,\n  conversations.conversations_sms_thread_id: %s,\n  conversations.conversations_name: %s,\n  conversations.conversations_name_is_automatic: %s,\n  conversations.conversations_subtitle: %s,\n  conversations.conversations_latest_message_id: %s,\n  conversations.conversations_snippet_text: %s,\n  conversations.conversations_subject_text: %s,\n  conversations.conversations_preview_uri: %s,\n  conversations.conversations_preview_content_type: %s,\n  conversations.conversations_show_draft: %s,\n  conversations.conversations_draft_snippet_text: %s,\n  conversations.conversations_draft_subject_text: %s,\n  conversations.conversations_draft_preview_uri: %s,\n  conversations.conversations_draft_preview_content_type: %s,\n  conversations.conversations_etouffee_default: %s,\n  conversations.conversations_archive_status: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversations.conversations_last_read_timestamp: %s,\n  conversations.conversations_icon: %s,\n  conversations.conversations_participant_contact_id: %s,\n  conversations.conversations_normalized_participant_contact_id: %s,\n  conversations.conversations_participant_lookup_key: %s,\n  conversations.conversations_normalized_participant_lookup_key: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_participant_comparable_destination: %s,\n  conversations.conversations_current_self_id: %s,\n  conversations.conversations_current_my_identity_foreign_key: %s,\n  conversations.conversations_destination_token: %s,\n  conversations.conversations_participant_count: %s,\n  conversations.conversations_notification_enabled: %s,\n  conversations.conversations_notification_sound_uri: %s,\n  conversations.conversations_notification_vibration: %s,\n  conversations.conversations_include_email_addr: %s,\n  conversations.conversations_sms_service_center: %s,\n  conversations.conversations_participant_id_list: %s,\n  conversations.conversations_normalized_participant_id_list: %s,\n  conversations.conversations_source_type: %s,\n  conversations.conversations_rcs_session_id: %s,\n  conversations.conversations_join_state: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_send_mode: %s,\n  conversations.conversations_IS_ENTERPRISE: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_last_interactive_event_timestamp: %s,\n  conversations.conversations_participant_display_destination: %s,\n  conversations.conversations_normalized_participant_display_destination: %s,\n  conversations.conversations_spam_warning_dismiss_status: %s,\n  conversations.conversations_open_count: %s,\n  conversations.conversations_last_logged_scooby_metadata_timestamp: %s,\n  conversations.conversations_delete_timestamp: %s,\n  conversations.conversations_cms_id: %s,\n  conversations.conversations_rcs_group_id: %s,\n  conversations.conversations_rcs_conference_uri: %s,\n  conversations.conversations_tachygram_group_routing_info_token: %s,\n  conversations.conversations_cms_most_recent_read_message_timestamp_ms: %s,\n  conversations.conversations_rcs_subject_change_timestamp_ms: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_rcs_group_capabilities: %s,\n  conversations.conversations_awaiting_reverse_sync: %s,\n  conversations.conversations_duplicate_of: %s,\n  conversations.conversations_new_duplicate_of: %s,\n  conversations.conversations_error_state: %s,\n  conversations.conversations_cms_life_cycle: %s,\n  conversations.conversations_rcs_group_self_msisdn: %s,\n  conversations.conversations_recipient_offline_timestamp_ms: %s,\n  conversations.conversations_rcs_group_last_sync_timestamp: %s,\n  conversations.conversations_has_been_e2ee: %s,\n  conversations.conversations_marked_as_unread: %s,\n  conversations.conversations_custom_theme: %s,\n  conversations.conversations_mms_group_upgrade_status: %s,\n  conversations.conversations_mms_group_upgrade_retries: %s,\n  conversations.conversations_encryption_protocol: %s,\n  conversations.conversations_encryption_id: %s,\n  conversations.conversations_cms_correlation_id: %s,\n  conversations.conversations_rcs_group_icon_url: %s,\n  conversations.conversations_unread_count: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, valueOf46, valueOf47, valueOf48, valueOf49, valueOf50, valueOf51, valueOf52, valueOf53, valueOf54, valueOf55, valueOf56, valueOf57, valueOf58, valueOf59, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao), String.valueOf(this.ap), String.valueOf(this.aq), String.valueOf(this.ar), String.valueOf(this.as), String.valueOf(this.at), String.valueOf(this.au), String.valueOf(this.av), String.valueOf(this.aw), String.valueOf(this.ax), String.valueOf(this.ay), String.valueOf(this.az), String.valueOf(this.aA), String.valueOf(this.aB), String.valueOf(this.aC), String.valueOf(this.aD));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        blxy.c().intValue();
    }

    @Override // defpackage.dtro
    protected final /* synthetic */ void c(dtsu dtsuVar) {
        ckkz ckkzVar;
        fbuk fbukVar;
        blxt blxtVar = (blxt) dtsuVar;
        aB();
        this.cL = blxtVar.cU();
        if (blxtVar.di(0)) {
            this.a = blxtVar.getString(blxtVar.cM(0, blxy.a));
            fY(0);
        }
        if (blxtVar.di(1)) {
            this.b = bdgq.b(blxtVar.getString(blxtVar.cM(1, blxy.a)));
            fY(1);
        }
        if (blxtVar.di(2)) {
            this.c = new MessageIdType(blxtVar.getLong(blxtVar.cM(2, blxy.a)));
            fY(2);
        }
        if (blxtVar.di(3)) {
            this.d = blxtVar.getInt(blxtVar.cM(3, blxy.a));
            fY(3);
        }
        if (blxtVar.di(4)) {
            byte[] blob = blxtVar.getBlob(blxtVar.cM(4, blxy.a));
            if (blob == null) {
                fbukVar = null;
            } else {
                try {
                    fbukVar = (fbuk) eyfy.parseFrom(fbuk.a, blob, eyfc.a());
                } catch (Throwable unused) {
                    fbukVar = fbuk.a;
                }
            }
            this.e = fbukVar;
            fY(4);
        }
        if (blxtVar.di(5)) {
            this.f = new ConversationIdType(blxtVar.getLong(blxtVar.cM(5, blxy.a)));
            fY(5);
        }
        if (blxtVar.di(6)) {
            this.g = cpxu.b(blxtVar.getLong(blxtVar.cM(6, blxy.a)));
            fY(6);
        }
        if (blxtVar.di(7)) {
            this.h = blxtVar.getString(blxtVar.cM(7, blxy.a));
            fY(7);
        }
        if (blxtVar.di(8)) {
            byyy[] values = byyy.values();
            int i = blxtVar.getInt(blxtVar.cM(8, blxy.a));
            if (i >= values.length) {
                throw new IllegalArgumentException();
            }
            this.i = values[i];
            fY(8);
        }
        if (blxtVar.di(9)) {
            this.j = blxtVar.getString(blxtVar.cM(9, blxy.a));
            fY(9);
        }
        if (blxtVar.di(10)) {
            this.k = new MessageIdType(blxtVar.getLong(blxtVar.cM(10, blxy.a)));
            fY(10);
        }
        if (blxtVar.di(11)) {
            this.l = cuxs.a(blxtVar.getString(blxtVar.cM(11, blxy.a)));
            fY(11);
        }
        if (blxtVar.di(12)) {
            this.m = cuxs.a(blxtVar.getString(blxtVar.cM(12, blxy.a)));
            fY(12);
        }
        if (blxtVar.di(13)) {
            String string = blxtVar.getString(blxtVar.cM(13, blxy.a));
            this.n = string == null ? null : Uri.parse(string);
            fY(13);
        }
        if (blxtVar.di(14)) {
            this.o = blxtVar.getString(blxtVar.cM(14, blxy.a));
            fY(14);
        }
        if (blxtVar.di(15)) {
            this.p = blxtVar.getInt(blxtVar.cM(15, blxy.a)) == 1;
            fY(15);
        }
        if (blxtVar.di(16)) {
            this.q = cuxs.a(blxtVar.getString(blxtVar.cM(16, blxy.a)));
            fY(16);
        }
        if (blxtVar.di(17)) {
            this.r = cuxs.a(blxtVar.getString(blxtVar.cM(17, blxy.a)));
            fY(17);
        }
        if (blxtVar.di(18)) {
            String string2 = blxtVar.getString(blxtVar.cM(18, blxy.a));
            this.s = string2 == null ? null : Uri.parse(string2);
            fY(18);
        }
        if (blxtVar.di(19)) {
            this.t = blxtVar.getString(blxtVar.cM(19, blxy.a));
            fY(19);
        }
        if (blxtVar.di(20)) {
            this.u = blxtVar.getInt(blxtVar.cM(20, blxy.a));
            fY(20);
        }
        if (blxtVar.di(21)) {
            this.v = byyt.a(blxtVar.getInt(blxtVar.cM(21, blxy.a)));
            fY(21);
        }
        if (blxtVar.di(22)) {
            this.w = blxtVar.getLong(blxtVar.cM(22, blxy.a));
            fY(22);
        }
        if (blxtVar.di(23)) {
            this.x = blxtVar.getLong(blxtVar.cM(23, blxy.a));
            fY(23);
        }
        if (blxtVar.di(24)) {
            this.y = blxtVar.getString(blxtVar.cM(24, blxy.a));
            fY(24);
        }
        if (blxtVar.di(25)) {
            this.z = blxtVar.getLong(blxtVar.cM(25, blxy.a));
            fY(25);
        }
        if (blxtVar.di(26)) {
            this.A = blxtVar.getLong(blxtVar.cM(26, blxy.a));
            fY(26);
        }
        if (blxtVar.di(27)) {
            this.B = blxtVar.getString(blxtVar.cM(27, blxy.a));
            fY(27);
        }
        if (blxtVar.di(28)) {
            this.C = blxtVar.getString(blxtVar.cM(28, blxy.a));
            fY(28);
        }
        if (blxtVar.di(29)) {
            this.D = blxtVar.getString(blxtVar.cM(29, blxy.a));
            fY(29);
        }
        if (blxtVar.di(30)) {
            this.E = blxtVar.getString(blxtVar.cM(30, blxy.a));
            fY(30);
        }
        if (blxtVar.di(31)) {
            this.F = blxtVar.getString(blxtVar.cM(31, blxy.a));
            fY(31);
        }
        if (blxtVar.di(32)) {
            this.G = azsv.a(blxtVar.getString(blxtVar.cM(32, blxy.a)));
            fY(32);
        }
        if (blxtVar.di(33)) {
            this.H = azcs.a(blxtVar.getString(blxtVar.cM(33, blxy.a)));
            fY(33);
        }
        if (blxtVar.di(34)) {
            this.I = blxtVar.getInt(blxtVar.cM(34, blxy.a));
            fY(34);
        }
        if (blxtVar.di(35)) {
            this.J = blxtVar.getInt(blxtVar.cM(35, blxy.a)) == 1;
            fY(35);
        }
        if (blxtVar.di(36)) {
            this.K = blxtVar.getString(blxtVar.cM(36, blxy.a));
            fY(36);
        }
        if (blxtVar.di(37)) {
            this.L = blxtVar.getInt(blxtVar.cM(37, blxy.a)) == 1;
            fY(37);
        }
        if (blxtVar.di(38)) {
            this.M = blxtVar.getInt(blxtVar.cM(38, blxy.a)) == 1;
            fY(38);
        }
        if (blxtVar.di(39)) {
            this.N = blxtVar.getString(blxtVar.cM(39, blxy.a));
            fY(39);
        }
        if (blxtVar.di(40)) {
            this.O = blxtVar.getString(blxtVar.cM(40, blxy.a));
            fY(40);
        }
        if (blxtVar.di(41)) {
            this.P = blxtVar.getString(blxtVar.cM(41, blxy.a));
            fY(41);
        }
        if (blxtVar.di(42)) {
            this.Q = blxtVar.getInt(blxtVar.cM(42, blxy.a));
            fY(42);
        }
        if (blxtVar.di(43)) {
            this.R = blxtVar.getLong(blxtVar.cM(43, blxy.a));
            fY(43);
        }
        if (blxtVar.di(44)) {
            this.S = blxtVar.getInt(blxtVar.cM(44, blxy.a));
            fY(44);
        }
        if (blxtVar.di(45)) {
            this.T = blxtVar.getInt(blxtVar.cM(45, blxy.a));
            fY(45);
        }
        if (blxtVar.di(46)) {
            this.U = blxtVar.getInt(blxtVar.cM(46, blxy.a));
            fY(46);
        }
        if (blxtVar.di(47)) {
            this.V = blxtVar.getInt(blxtVar.cM(47, blxy.a)) == 1;
            fY(47);
        }
        if (blxtVar.di(48)) {
            this.W = blxtVar.getInt(blxtVar.cM(48, blxy.a)) == 1;
            fY(48);
        }
        if (blxtVar.di(49)) {
            this.X = blxtVar.getLong(blxtVar.cM(49, blxy.a));
            fY(49);
        }
        if (blxtVar.di(50)) {
            this.Y = cuxs.a(blxtVar.getString(blxtVar.cM(50, blxy.a)));
            fY(50);
        }
        if (blxtVar.di(51)) {
            this.Z = cuxs.a(blxtVar.getString(blxtVar.cM(51, blxy.a)));
            fY(51);
        }
        if (blxtVar.di(52)) {
            this.aa = blxtVar.getInt(blxtVar.cM(52, blxy.a)) == 1;
            fY(52);
        }
        if (blxtVar.di(53)) {
            this.ab = blxtVar.getInt(blxtVar.cM(53, blxy.a));
            fY(53);
        }
        if (blxtVar.di(54)) {
            this.ac = blxtVar.getLong(blxtVar.cM(54, blxy.a));
            fY(54);
        }
        if (blxtVar.di(55)) {
            this.ad = blxtVar.getLong(blxtVar.cM(55, blxy.a));
            fY(55);
        }
        if (blxtVar.di(56)) {
            this.ae = blxtVar.getString(blxtVar.cM(56, blxy.a));
            fY(56);
        }
        if (blxtVar.di(57)) {
            this.af = blxtVar.getString(blxtVar.cM(57, blxy.a));
            fY(57);
        }
        if (blxtVar.di(58)) {
            this.ag = cuxb.a(blxtVar.getString(blxtVar.cM(58, blxy.a)));
            fY(58);
        }
        if (blxtVar.di(59)) {
            this.ah = blxtVar.getBlob(blxtVar.cM(59, blxy.a));
            fY(59);
        }
        if (blxtVar.di(60)) {
            this.ai = blxtVar.getLong(blxtVar.cM(60, blxy.a));
            fY(60);
        }
        if (blxtVar.di(61)) {
            this.aj = blxtVar.getLong(blxtVar.cM(61, blxy.a));
            fY(61);
        }
        if (blxtVar.di(62)) {
            this.ak = blxtVar.getInt(blxtVar.cM(62, blxy.a)) == 1;
            fY(62);
        }
        if (blxtVar.di(63)) {
            this.al = new cknh(blxtVar.getLong(blxtVar.cM(63, blxy.a)));
            fY(63);
        }
        if (blxtVar.di(64)) {
            this.am = blxtVar.getInt(blxtVar.cM(64, blxy.a)) == 1;
            fY(64);
        }
        if (blxtVar.di(65)) {
            this.an = new ConversationIdType(blxtVar.getLong(blxtVar.cM(65, blxy.a)));
            fY(65);
        }
        if (blxtVar.di(66)) {
            this.ao = new ConversationIdType(blxtVar.getLong(blxtVar.cM(66, blxy.a)));
            fY(66);
        }
        if (blxtVar.di(67)) {
            this.ap = ayhd.b(blxtVar.getInt(blxtVar.cM(67, blxy.a)));
            fY(67);
        }
        if (blxtVar.di(68)) {
            csgg[] values2 = csgg.values();
            int i2 = blxtVar.getInt(blxtVar.cM(68, blxy.a));
            if (i2 >= values2.length) {
                throw new IllegalArgumentException();
            }
            this.aq = values2[i2];
            fY(68);
        }
        if (blxtVar.di(69)) {
            this.ar = blxtVar.getString(blxtVar.cM(69, blxy.a));
            fY(69);
        }
        if (blxtVar.di(70)) {
            this.as = bdhe.b(blxtVar.getLong(blxtVar.cM(70, blxy.a)));
            fY(70);
        }
        if (blxtVar.di(71)) {
            this.at = bdhe.b(blxtVar.getLong(blxtVar.cM(71, blxy.a)));
            fY(71);
        }
        if (blxtVar.di(72)) {
            this.au = blxtVar.getInt(blxtVar.cM(72, blxy.a)) == 1;
            fY(72);
        }
        if (blxtVar.di(73)) {
            this.av = blxtVar.getInt(blxtVar.cM(73, blxy.a)) == 1;
            fY(73);
        }
        if (blxtVar.di(74)) {
            byte[] blob2 = blxtVar.getBlob(blxtVar.cM(74, blxy.a));
            if (blob2 == null) {
                ckkzVar = null;
            } else {
                try {
                    ckkzVar = (ckkz) eyfy.parseFrom(ckkz.a, blob2, eyfc.a());
                } catch (Throwable unused2) {
                    ckkzVar = ckkz.a;
                }
            }
            this.aw = ckkzVar;
            fY(74);
        }
        if (blxtVar.di(75)) {
            ckte[] values3 = ckte.values();
            int i3 = blxtVar.getInt(blxtVar.cM(75, blxy.a));
            if (i3 >= values3.length) {
                throw new IllegalArgumentException();
            }
            this.ax = values3[i3];
            fY(75);
        }
        if (blxtVar.di(76)) {
            this.ay = blxtVar.getInt(blxtVar.cM(76, blxy.a));
            fY(76);
        }
        if (blxtVar.di(77)) {
            this.az = new cfmh(blxtVar.getLong(blxtVar.cM(77, blxy.a)));
            fY(77);
        }
        if (blxtVar.di(78)) {
            this.aA = cfmf.a(blxtVar.getString(blxtVar.cM(78, blxy.a)));
            fY(78);
        }
        if (blxtVar.di(79)) {
            this.aB = blxtVar.getString(blxtVar.cM(79, blxy.a));
            fY(79);
        }
        if (blxtVar.di(80)) {
            String string3 = blxtVar.getString(blxtVar.cM(80, blxy.a));
            this.aC = string3 != null ? Uri.parse(string3) : null;
            fY(80);
        }
        if (blxtVar.di(81)) {
            this.aD = blxtVar.getInt(blxtVar.cM(81, blxy.a));
            fY(81);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof blre)) {
            return false;
        }
        blre blreVar = (blre) obj;
        return super.aD(blreVar.cL) && Objects.equals(this.a, blreVar.a) && Objects.equals(this.b, blreVar.b) && Objects.equals(this.c, blreVar.c) && this.d == blreVar.d && Objects.equals(this.e, blreVar.e) && Objects.equals(this.f, blreVar.f) && Objects.equals(this.g, blreVar.g) && Objects.equals(this.h, blreVar.h) && this.i == blreVar.i && Objects.equals(this.j, blreVar.j) && Objects.equals(this.k, blreVar.k) && Objects.equals(this.l, blreVar.l) && Objects.equals(this.m, blreVar.m) && Objects.equals(this.n, blreVar.n) && Objects.equals(this.o, blreVar.o) && this.p == blreVar.p && Objects.equals(this.q, blreVar.q) && Objects.equals(this.r, blreVar.r) && Objects.equals(this.s, blreVar.s) && Objects.equals(this.t, blreVar.t) && this.u == blreVar.u && this.v == blreVar.v && this.w == blreVar.w && this.x == blreVar.x && Objects.equals(this.y, blreVar.y) && this.z == blreVar.z && this.A == blreVar.A && Objects.equals(this.B, blreVar.B) && Objects.equals(this.C, blreVar.C) && Objects.equals(this.D, blreVar.D) && Objects.equals(this.E, blreVar.E) && Objects.equals(this.F, blreVar.F) && Objects.equals(this.G, blreVar.G) && Objects.equals(this.H, blreVar.H) && this.I == blreVar.I && this.J == blreVar.J && Objects.equals(this.K, blreVar.K) && this.L == blreVar.L && this.M == blreVar.M && Objects.equals(this.N, blreVar.N) && Objects.equals(this.O, blreVar.O) && Objects.equals(this.P, blreVar.P) && this.Q == blreVar.Q && this.R == blreVar.R && this.S == blreVar.S && this.T == blreVar.T && this.U == blreVar.U && this.V == blreVar.V && this.W == blreVar.W && this.X == blreVar.X && Objects.equals(this.Y, blreVar.Y) && Objects.equals(this.Z, blreVar.Z) && this.aa == blreVar.aa && this.ab == blreVar.ab && this.ac == blreVar.ac && this.ad == blreVar.ad && Objects.equals(this.ae, blreVar.ae) && Objects.equals(this.af, blreVar.af) && Objects.equals(this.ag, blreVar.ag) && Arrays.equals(this.ah, blreVar.ah) && this.ai == blreVar.ai && this.aj == blreVar.aj && this.ak == blreVar.ak && Objects.equals(this.al, blreVar.al) && this.am == blreVar.am && Objects.equals(this.an, blreVar.an) && Objects.equals(this.ao, blreVar.ao) && this.ap == blreVar.ap && this.aq == blreVar.aq && Objects.equals(this.ar, blreVar.ar) && Objects.equals(this.as, blreVar.as) && Objects.equals(this.at, blreVar.at) && this.au == blreVar.au && this.av == blreVar.av && Objects.equals(this.aw, blreVar.aw) && this.ax == blreVar.ax && this.ay == blreVar.ay && Objects.equals(this.az, blreVar.az) && Objects.equals(this.aA, blreVar.aA) && Objects.equals(this.aB, blreVar.aB) && Objects.equals(this.aC, blreVar.aC) && this.aD == blreVar.aD;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        String str = this.a;
        ConversationIdType conversationIdType = this.b;
        MessageIdType messageIdType = this.c;
        Integer valueOf = Integer.valueOf(this.d);
        fbuk fbukVar = this.e;
        ConversationIdType conversationIdType2 = this.f;
        cpxu cpxuVar = this.g;
        String str2 = this.h;
        byyy byyyVar = this.i;
        Integer valueOf2 = Integer.valueOf(byyyVar == null ? 0 : byyyVar.ordinal());
        String str3 = this.j;
        MessageIdType messageIdType2 = this.k;
        String str4 = this.l;
        String str5 = this.m;
        Uri uri = this.n;
        dtsq dtsqVar3 = dtsqVar2;
        String str6 = this.o;
        Boolean valueOf3 = Boolean.valueOf(this.p);
        String str7 = this.q;
        String str8 = this.r;
        Uri uri2 = this.s;
        String str9 = this.t;
        Integer valueOf4 = Integer.valueOf(this.u);
        byyt byytVar = this.v;
        Long valueOf5 = Long.valueOf(this.w);
        Long valueOf6 = Long.valueOf(this.x);
        String str10 = this.y;
        Long valueOf7 = Long.valueOf(this.z);
        Long valueOf8 = Long.valueOf(this.A);
        String str11 = this.B;
        String str12 = this.C;
        String str13 = this.D;
        String str14 = this.E;
        String str15 = this.F;
        azsu azsuVar = this.G;
        azcr azcrVar = this.H;
        Integer valueOf9 = Integer.valueOf(this.I);
        Boolean valueOf10 = Boolean.valueOf(this.J);
        String str16 = this.K;
        Boolean valueOf11 = Boolean.valueOf(this.L);
        Boolean valueOf12 = Boolean.valueOf(this.M);
        String str17 = this.N;
        String str18 = this.O;
        String str19 = this.P;
        Integer valueOf13 = Integer.valueOf(this.Q);
        Long valueOf14 = Long.valueOf(this.R);
        Integer valueOf15 = Integer.valueOf(this.S);
        Integer valueOf16 = Integer.valueOf(this.T);
        Integer valueOf17 = Integer.valueOf(this.U);
        Boolean valueOf18 = Boolean.valueOf(this.V);
        Boolean valueOf19 = Boolean.valueOf(this.W);
        Long valueOf20 = Long.valueOf(this.X);
        String str20 = this.Y;
        String str21 = this.Z;
        Boolean valueOf21 = Boolean.valueOf(this.aa);
        Integer valueOf22 = Integer.valueOf(this.ab);
        Long valueOf23 = Long.valueOf(this.ac);
        Long valueOf24 = Long.valueOf(this.ad);
        String str22 = this.ae;
        String str23 = this.af;
        String str24 = this.ag;
        Integer valueOf25 = Integer.valueOf(Arrays.hashCode(this.ah));
        Long valueOf26 = Long.valueOf(this.ai);
        Long valueOf27 = Long.valueOf(this.aj);
        Boolean valueOf28 = Boolean.valueOf(this.ak);
        cknh cknhVar = this.al;
        Boolean valueOf29 = Boolean.valueOf(this.am);
        ConversationIdType conversationIdType3 = this.an;
        ConversationIdType conversationIdType4 = this.ao;
        ayhd ayhdVar = this.ap;
        csgg csggVar = this.aq;
        Integer valueOf30 = Integer.valueOf(csggVar == null ? 0 : csggVar.ordinal());
        String str25 = this.ar;
        Optional optional = this.as;
        Optional optional2 = this.at;
        Boolean valueOf31 = Boolean.valueOf(this.au);
        Boolean valueOf32 = Boolean.valueOf(this.av);
        ckkz ckkzVar = this.aw;
        ckte ckteVar = this.ax;
        return Objects.hash(dtsqVar3, str, conversationIdType, messageIdType, valueOf, fbukVar, conversationIdType2, cpxuVar, str2, valueOf2, str3, messageIdType2, str4, str5, uri, str6, valueOf3, str7, str8, uri2, str9, valueOf4, byytVar, valueOf5, valueOf6, str10, valueOf7, valueOf8, str11, str12, str13, str14, str15, azsuVar, azcrVar, valueOf9, valueOf10, str16, valueOf11, valueOf12, str17, str18, str19, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, str20, str21, valueOf21, valueOf22, valueOf23, valueOf24, str22, str23, str24, valueOf25, valueOf26, valueOf27, valueOf28, cknhVar, valueOf29, conversationIdType3, conversationIdType4, ayhdVar, valueOf30, str25, optional, optional2, valueOf31, valueOf32, ckkzVar, Integer.valueOf(ckteVar == null ? 0 : ckteVar.ordinal()), Integer.valueOf(this.ay), this.az, this.aA, this.aB, this.aC, Integer.valueOf(this.aD), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "MessageAnnotationJoinConversations -- REDACTED") : a();
    }
}
