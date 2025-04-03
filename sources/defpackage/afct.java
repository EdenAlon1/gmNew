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
/* loaded from: classes2.dex */
public class afct extends dtro {
    private String A;
    private String F;
    private String I;
    private String J;
    private String K;
    private String T;
    private String U;
    private String Z;
    private int aA;
    private String aa;
    private String ab;
    private byte[] ac;
    private ConversationIdType ai;
    private ConversationIdType aj;
    private ayhd ak;
    private csgg al;
    private String am;
    private Optional an;
    private Optional ao;
    private boolean ap;
    private boolean aq;
    private ckkz ar;
    private ckte as;
    private int at;
    private cfmh au;
    private cfmf av;
    private String aw;
    private Uri ax;
    private int ay;
    private long az;
    private String c;
    private String e;
    private String g;
    private String h;
    private Uri i;
    private String j;
    private String l;
    private String m;
    private Uri n;
    private String o;
    private String t;
    private String w;
    private String x;
    private String y;
    private String z;
    private ConversationIdType a = bdgq.a;
    private cpxu b = new cpxu();
    private byyy d = byyy.NAME_IS_AUTOMATIC;
    private MessageIdType f = bdhb.a;
    private boolean k = false;
    private int p = 0;
    private byyt q = byyt.UNARCHIVED;
    private long r = 0;
    private long s = 0;
    private long u = -1;
    private long v = -1;
    private azsu B = null;
    private azcr C = null;
    private int D = 0;
    private boolean E = true;
    private boolean G = true;
    private boolean H = false;
    private int L = 0;
    private long M = -1;
    private int N = 0;
    private int O = 0;
    private int P = 0;
    private boolean Q = false;
    private boolean R = false;
    private long S = 0;
    private boolean V = false;
    private int W = 0;
    private long X = 0;
    private long Y = 0;
    private long ad = 0;
    private long ae = -1;
    private boolean af = true;
    private cknh ag = new cknh(0);
    private boolean ah = false;

    protected afct() {
        ConversationIdType conversationIdType = bdgq.a;
        this.ai = conversationIdType;
        this.aj = conversationIdType;
        this.ak = ayhd.b(0);
        this.al = csgg.UNKNOWN;
        this.an = bdhe.b(-1L);
        this.ao = bdhe.b(-1L);
        this.ap = false;
        this.aq = false;
        this.as = ckte.a;
        this.at = 0;
        this.au = new cfmh(0L);
        this.av = null;
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
        byte[] bArr = this.ac;
        return String.format(locale, "ConversationOptionalLabelsQuery [conversations.conversations__id: %s,\n  conversations.conversations_sms_thread_id: %s,\n  conversations.conversations_name: %s,\n  conversations.conversations_name_is_automatic: %s,\n  conversations.conversations_subtitle: %s,\n  conversations.conversations_latest_message_id: %s,\n  conversations.conversations_snippet_text: %s,\n  conversations.conversations_subject_text: %s,\n  conversations.conversations_preview_uri: %s,\n  conversations.conversations_preview_content_type: %s,\n  conversations.conversations_show_draft: %s,\n  conversations.conversations_draft_snippet_text: %s,\n  conversations.conversations_draft_subject_text: %s,\n  conversations.conversations_draft_preview_uri: %s,\n  conversations.conversations_draft_preview_content_type: %s,\n  conversations.conversations_etouffee_default: %s,\n  conversations.conversations_archive_status: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversations.conversations_last_read_timestamp: %s,\n  conversations.conversations_icon: %s,\n  conversations.conversations_participant_contact_id: %s,\n  conversations.conversations_normalized_participant_contact_id: %s,\n  conversations.conversations_participant_lookup_key: %s,\n  conversations.conversations_normalized_participant_lookup_key: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_participant_comparable_destination: %s,\n  conversations.conversations_current_self_id: %s,\n  conversations.conversations_current_my_identity_foreign_key: %s,\n  conversations.conversations_destination_token: %s,\n  conversations.conversations_participant_count: %s,\n  conversations.conversations_notification_enabled: %s,\n  conversations.conversations_notification_sound_uri: %s,\n  conversations.conversations_notification_vibration: %s,\n  conversations.conversations_include_email_addr: %s,\n  conversations.conversations_sms_service_center: %s,\n  conversations.conversations_participant_id_list: %s,\n  conversations.conversations_normalized_participant_id_list: %s,\n  conversations.conversations_source_type: %s,\n  conversations.conversations_rcs_session_id: %s,\n  conversations.conversations_join_state: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_send_mode: %s,\n  conversations.conversations_IS_ENTERPRISE: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_last_interactive_event_timestamp: %s,\n  conversations.conversations_participant_display_destination: %s,\n  conversations.conversations_normalized_participant_display_destination: %s,\n  conversations.conversations_spam_warning_dismiss_status: %s,\n  conversations.conversations_open_count: %s,\n  conversations.conversations_last_logged_scooby_metadata_timestamp: %s,\n  conversations.conversations_delete_timestamp: %s,\n  conversations.conversations_cms_id: %s,\n  conversations.conversations_rcs_group_id: %s,\n  conversations.conversations_rcs_conference_uri: %s,\n  conversations.conversations_tachygram_group_routing_info_token: %s,\n  conversations.conversations_cms_most_recent_read_message_timestamp_ms: %s,\n  conversations.conversations_rcs_subject_change_timestamp_ms: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_rcs_group_capabilities: %s,\n  conversations.conversations_awaiting_reverse_sync: %s,\n  conversations.conversations_duplicate_of: %s,\n  conversations.conversations_new_duplicate_of: %s,\n  conversations.conversations_error_state: %s,\n  conversations.conversations_cms_life_cycle: %s,\n  conversations.conversations_rcs_group_self_msisdn: %s,\n  conversations.conversations_recipient_offline_timestamp_ms: %s,\n  conversations.conversations_rcs_group_last_sync_timestamp: %s,\n  conversations.conversations_has_been_e2ee: %s,\n  conversations.conversations_marked_as_unread: %s,\n  conversations.conversations_custom_theme: %s,\n  conversations.conversations_mms_group_upgrade_status: %s,\n  conversations.conversations_mms_group_upgrade_retries: %s,\n  conversations.conversations_encryption_protocol: %s,\n  conversations.conversations_encryption_id: %s,\n  conversations.conversations_cms_correlation_id: %s,\n  conversations.conversations_rcs_group_icon_url: %s,\n  conversations.conversations_unread_count: %s,\n  conversation_labels.conversation_labels__id: %s,\n  conversation_labels.conversation_labels_label: %s\n]\n", valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, valueOf20, valueOf21, valueOf22, valueOf23, valueOf24, valueOf25, valueOf26, valueOf27, valueOf28, valueOf29, valueOf30, valueOf31, valueOf32, valueOf33, valueOf34, valueOf35, valueOf36, valueOf37, valueOf38, valueOf39, valueOf40, valueOf41, valueOf42, valueOf43, valueOf44, valueOf45, valueOf46, valueOf47, valueOf48, valueOf49, valueOf50, valueOf51, valueOf52, valueOf53, valueOf54, "BLOB".concat(String.valueOf(bArr != null ? String.valueOf(bArr.length) : "NULL")), String.valueOf(this.ad), String.valueOf(this.ae), String.valueOf(this.af), String.valueOf(this.ag), String.valueOf(this.ah), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao), String.valueOf(this.ap), String.valueOf(this.aq), String.valueOf(this.ar), String.valueOf(this.as), String.valueOf(this.at), String.valueOf(this.au), String.valueOf(this.av), String.valueOf(this.aw), String.valueOf(this.ax), String.valueOf(this.ay), String.valueOf(this.az), String.valueOf(this.aA));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        afkd.c().intValue();
    }

    @Override // defpackage.dtro
    protected final /* synthetic */ void c(dtsu dtsuVar) {
        ckkz ckkzVar;
        afka afkaVar = (afka) dtsuVar;
        aB();
        this.cL = afkaVar.cU();
        if (afkaVar.di(0)) {
            this.a = new ConversationIdType(afkaVar.getLong(afkaVar.cM(0, afkd.a)));
            fY(0);
        }
        if (afkaVar.di(1)) {
            this.b = cpxu.b(afkaVar.getLong(afkaVar.cM(1, afkd.a)));
            fY(1);
        }
        if (afkaVar.di(2)) {
            this.c = afkaVar.getString(afkaVar.cM(2, afkd.a));
            fY(2);
        }
        if (afkaVar.di(3)) {
            byyy[] values = byyy.values();
            int i = afkaVar.getInt(afkaVar.cM(3, afkd.a));
            if (i >= values.length) {
                throw new IllegalArgumentException();
            }
            this.d = values[i];
            fY(3);
        }
        if (afkaVar.di(4)) {
            this.e = afkaVar.getString(afkaVar.cM(4, afkd.a));
            fY(4);
        }
        if (afkaVar.di(5)) {
            this.f = new MessageIdType(afkaVar.getLong(afkaVar.cM(5, afkd.a)));
            fY(5);
        }
        if (afkaVar.di(6)) {
            this.g = cuxs.a(afkaVar.getString(afkaVar.cM(6, afkd.a)));
            fY(6);
        }
        if (afkaVar.di(7)) {
            this.h = cuxs.a(afkaVar.getString(afkaVar.cM(7, afkd.a)));
            fY(7);
        }
        if (afkaVar.di(8)) {
            String string = afkaVar.getString(afkaVar.cM(8, afkd.a));
            this.i = string == null ? null : Uri.parse(string);
            fY(8);
        }
        if (afkaVar.di(9)) {
            this.j = afkaVar.getString(afkaVar.cM(9, afkd.a));
            fY(9);
        }
        if (afkaVar.di(10)) {
            this.k = afkaVar.getInt(afkaVar.cM(10, afkd.a)) == 1;
            fY(10);
        }
        if (afkaVar.di(11)) {
            this.l = cuxs.a(afkaVar.getString(afkaVar.cM(11, afkd.a)));
            fY(11);
        }
        if (afkaVar.di(12)) {
            this.m = cuxs.a(afkaVar.getString(afkaVar.cM(12, afkd.a)));
            fY(12);
        }
        if (afkaVar.di(13)) {
            String string2 = afkaVar.getString(afkaVar.cM(13, afkd.a));
            this.n = string2 == null ? null : Uri.parse(string2);
            fY(13);
        }
        if (afkaVar.di(14)) {
            this.o = afkaVar.getString(afkaVar.cM(14, afkd.a));
            fY(14);
        }
        if (afkaVar.di(15)) {
            this.p = afkaVar.getInt(afkaVar.cM(15, afkd.a));
            fY(15);
        }
        if (afkaVar.di(16)) {
            this.q = byyt.a(afkaVar.getInt(afkaVar.cM(16, afkd.a)));
            fY(16);
        }
        if (afkaVar.di(17)) {
            this.r = afkaVar.getLong(afkaVar.cM(17, afkd.a));
            fY(17);
        }
        if (afkaVar.di(18)) {
            this.s = afkaVar.getLong(afkaVar.cM(18, afkd.a));
            fY(18);
        }
        if (afkaVar.di(19)) {
            this.t = afkaVar.getString(afkaVar.cM(19, afkd.a));
            fY(19);
        }
        if (afkaVar.di(20)) {
            this.u = afkaVar.getLong(afkaVar.cM(20, afkd.a));
            fY(20);
        }
        if (afkaVar.di(21)) {
            this.v = afkaVar.getLong(afkaVar.cM(21, afkd.a));
            fY(21);
        }
        if (afkaVar.di(22)) {
            this.w = afkaVar.getString(afkaVar.cM(22, afkd.a));
            fY(22);
        }
        if (afkaVar.di(23)) {
            this.x = afkaVar.getString(afkaVar.cM(23, afkd.a));
            fY(23);
        }
        if (afkaVar.di(24)) {
            this.y = afkaVar.getString(afkaVar.cM(24, afkd.a));
            fY(24);
        }
        if (afkaVar.di(25)) {
            this.z = afkaVar.getString(afkaVar.cM(25, afkd.a));
            fY(25);
        }
        if (afkaVar.di(26)) {
            this.A = afkaVar.getString(afkaVar.cM(26, afkd.a));
            fY(26);
        }
        if (afkaVar.di(27)) {
            this.B = azsv.a(afkaVar.getString(afkaVar.cM(27, afkd.a)));
            fY(27);
        }
        if (afkaVar.di(28)) {
            this.C = azcs.a(afkaVar.getString(afkaVar.cM(28, afkd.a)));
            fY(28);
        }
        if (afkaVar.di(29)) {
            this.D = afkaVar.getInt(afkaVar.cM(29, afkd.a));
            fY(29);
        }
        if (afkaVar.di(30)) {
            this.E = afkaVar.getInt(afkaVar.cM(30, afkd.a)) == 1;
            fY(30);
        }
        if (afkaVar.di(31)) {
            this.F = afkaVar.getString(afkaVar.cM(31, afkd.a));
            fY(31);
        }
        if (afkaVar.di(32)) {
            this.G = afkaVar.getInt(afkaVar.cM(32, afkd.a)) == 1;
            fY(32);
        }
        if (afkaVar.di(33)) {
            this.H = afkaVar.getInt(afkaVar.cM(33, afkd.a)) == 1;
            fY(33);
        }
        if (afkaVar.di(34)) {
            this.I = afkaVar.getString(afkaVar.cM(34, afkd.a));
            fY(34);
        }
        if (afkaVar.di(35)) {
            this.J = afkaVar.getString(afkaVar.cM(35, afkd.a));
            fY(35);
        }
        if (afkaVar.di(36)) {
            this.K = afkaVar.getString(afkaVar.cM(36, afkd.a));
            fY(36);
        }
        if (afkaVar.di(37)) {
            this.L = afkaVar.getInt(afkaVar.cM(37, afkd.a));
            fY(37);
        }
        if (afkaVar.di(38)) {
            this.M = afkaVar.getLong(afkaVar.cM(38, afkd.a));
            fY(38);
        }
        if (afkaVar.di(39)) {
            this.N = afkaVar.getInt(afkaVar.cM(39, afkd.a));
            fY(39);
        }
        if (afkaVar.di(40)) {
            this.O = afkaVar.getInt(afkaVar.cM(40, afkd.a));
            fY(40);
        }
        if (afkaVar.di(41)) {
            this.P = afkaVar.getInt(afkaVar.cM(41, afkd.a));
            fY(41);
        }
        if (afkaVar.di(42)) {
            this.Q = afkaVar.getInt(afkaVar.cM(42, afkd.a)) == 1;
            fY(42);
        }
        if (afkaVar.di(43)) {
            this.R = afkaVar.getInt(afkaVar.cM(43, afkd.a)) == 1;
            fY(43);
        }
        if (afkaVar.di(44)) {
            this.S = afkaVar.getLong(afkaVar.cM(44, afkd.a));
            fY(44);
        }
        if (afkaVar.di(45)) {
            this.T = cuxs.a(afkaVar.getString(afkaVar.cM(45, afkd.a)));
            fY(45);
        }
        if (afkaVar.di(46)) {
            this.U = cuxs.a(afkaVar.getString(afkaVar.cM(46, afkd.a)));
            fY(46);
        }
        if (afkaVar.di(47)) {
            this.V = afkaVar.getInt(afkaVar.cM(47, afkd.a)) == 1;
            fY(47);
        }
        if (afkaVar.di(48)) {
            this.W = afkaVar.getInt(afkaVar.cM(48, afkd.a));
            fY(48);
        }
        if (afkaVar.di(49)) {
            this.X = afkaVar.getLong(afkaVar.cM(49, afkd.a));
            fY(49);
        }
        if (afkaVar.di(50)) {
            this.Y = afkaVar.getLong(afkaVar.cM(50, afkd.a));
            fY(50);
        }
        if (afkaVar.di(51)) {
            this.Z = afkaVar.getString(afkaVar.cM(51, afkd.a));
            fY(51);
        }
        if (afkaVar.di(52)) {
            this.aa = afkaVar.getString(afkaVar.cM(52, afkd.a));
            fY(52);
        }
        if (afkaVar.di(53)) {
            this.ab = cuxb.a(afkaVar.getString(afkaVar.cM(53, afkd.a)));
            fY(53);
        }
        if (afkaVar.di(54)) {
            this.ac = afkaVar.getBlob(afkaVar.cM(54, afkd.a));
            fY(54);
        }
        if (afkaVar.di(55)) {
            this.ad = afkaVar.getLong(afkaVar.cM(55, afkd.a));
            fY(55);
        }
        if (afkaVar.di(56)) {
            this.ae = afkaVar.getLong(afkaVar.cM(56, afkd.a));
            fY(56);
        }
        if (afkaVar.di(57)) {
            this.af = afkaVar.getInt(afkaVar.cM(57, afkd.a)) == 1;
            fY(57);
        }
        if (afkaVar.di(58)) {
            this.ag = new cknh(afkaVar.getLong(afkaVar.cM(58, afkd.a)));
            fY(58);
        }
        if (afkaVar.di(59)) {
            this.ah = afkaVar.getInt(afkaVar.cM(59, afkd.a)) == 1;
            fY(59);
        }
        if (afkaVar.di(60)) {
            this.ai = new ConversationIdType(afkaVar.getLong(afkaVar.cM(60, afkd.a)));
            fY(60);
        }
        if (afkaVar.di(61)) {
            this.aj = new ConversationIdType(afkaVar.getLong(afkaVar.cM(61, afkd.a)));
            fY(61);
        }
        if (afkaVar.di(62)) {
            this.ak = ayhd.b(afkaVar.getInt(afkaVar.cM(62, afkd.a)));
            fY(62);
        }
        if (afkaVar.di(63)) {
            csgg[] values2 = csgg.values();
            int i2 = afkaVar.getInt(afkaVar.cM(63, afkd.a));
            if (i2 >= values2.length) {
                throw new IllegalArgumentException();
            }
            this.al = values2[i2];
            fY(63);
        }
        if (afkaVar.di(64)) {
            this.am = afkaVar.getString(afkaVar.cM(64, afkd.a));
            fY(64);
        }
        if (afkaVar.di(65)) {
            this.an = bdhe.b(afkaVar.getLong(afkaVar.cM(65, afkd.a)));
            fY(65);
        }
        if (afkaVar.di(66)) {
            this.ao = bdhe.b(afkaVar.getLong(afkaVar.cM(66, afkd.a)));
            fY(66);
        }
        if (afkaVar.di(67)) {
            this.ap = afkaVar.getInt(afkaVar.cM(67, afkd.a)) == 1;
            fY(67);
        }
        if (afkaVar.di(68)) {
            this.aq = afkaVar.getInt(afkaVar.cM(68, afkd.a)) == 1;
            fY(68);
        }
        if (afkaVar.di(69)) {
            byte[] blob = afkaVar.getBlob(afkaVar.cM(69, afkd.a));
            if (blob == null) {
                ckkzVar = null;
            } else {
                try {
                    ckkzVar = (ckkz) eyfy.parseFrom(ckkz.a, blob, eyfc.a());
                } catch (Throwable unused) {
                    ckkzVar = ckkz.a;
                }
            }
            this.ar = ckkzVar;
            fY(69);
        }
        if (afkaVar.di(70)) {
            ckte[] values3 = ckte.values();
            int i3 = afkaVar.getInt(afkaVar.cM(70, afkd.a));
            if (i3 >= values3.length) {
                throw new IllegalArgumentException();
            }
            this.as = values3[i3];
            fY(70);
        }
        if (afkaVar.di(71)) {
            this.at = afkaVar.getInt(afkaVar.cM(71, afkd.a));
            fY(71);
        }
        if (afkaVar.di(72)) {
            this.au = new cfmh(afkaVar.getLong(afkaVar.cM(72, afkd.a)));
            fY(72);
        }
        if (afkaVar.di(73)) {
            this.av = cfmf.a(afkaVar.getString(afkaVar.cM(73, afkd.a)));
            fY(73);
        }
        if (afkaVar.di(74)) {
            this.aw = afkaVar.getString(afkaVar.cM(74, afkd.a));
            fY(74);
        }
        if (afkaVar.di(75)) {
            String string3 = afkaVar.getString(afkaVar.cM(75, afkd.a));
            this.ax = string3 != null ? Uri.parse(string3) : null;
            fY(75);
        }
        if (afkaVar.di(76)) {
            this.ay = afkaVar.getInt(afkaVar.cM(76, afkd.a));
            fY(76);
        }
        if (afkaVar.di(77)) {
            this.az = afkaVar.getLong(afkaVar.cM(77, afkd.a));
            fY(77);
        }
        if (afkaVar.di(78)) {
            this.aA = afkaVar.getInt(afkaVar.cM(78, afkd.a));
            fY(78);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof afct)) {
            return false;
        }
        afct afctVar = (afct) obj;
        return super.aD(afctVar.cL) && Objects.equals(this.a, afctVar.a) && Objects.equals(this.b, afctVar.b) && Objects.equals(this.c, afctVar.c) && this.d == afctVar.d && Objects.equals(this.e, afctVar.e) && Objects.equals(this.f, afctVar.f) && Objects.equals(this.g, afctVar.g) && Objects.equals(this.h, afctVar.h) && Objects.equals(this.i, afctVar.i) && Objects.equals(this.j, afctVar.j) && this.k == afctVar.k && Objects.equals(this.l, afctVar.l) && Objects.equals(this.m, afctVar.m) && Objects.equals(this.n, afctVar.n) && Objects.equals(this.o, afctVar.o) && this.p == afctVar.p && this.q == afctVar.q && this.r == afctVar.r && this.s == afctVar.s && Objects.equals(this.t, afctVar.t) && this.u == afctVar.u && this.v == afctVar.v && Objects.equals(this.w, afctVar.w) && Objects.equals(this.x, afctVar.x) && Objects.equals(this.y, afctVar.y) && Objects.equals(this.z, afctVar.z) && Objects.equals(this.A, afctVar.A) && Objects.equals(this.B, afctVar.B) && Objects.equals(this.C, afctVar.C) && this.D == afctVar.D && this.E == afctVar.E && Objects.equals(this.F, afctVar.F) && this.G == afctVar.G && this.H == afctVar.H && Objects.equals(this.I, afctVar.I) && Objects.equals(this.J, afctVar.J) && Objects.equals(this.K, afctVar.K) && this.L == afctVar.L && this.M == afctVar.M && this.N == afctVar.N && this.O == afctVar.O && this.P == afctVar.P && this.Q == afctVar.Q && this.R == afctVar.R && this.S == afctVar.S && Objects.equals(this.T, afctVar.T) && Objects.equals(this.U, afctVar.U) && this.V == afctVar.V && this.W == afctVar.W && this.X == afctVar.X && this.Y == afctVar.Y && Objects.equals(this.Z, afctVar.Z) && Objects.equals(this.aa, afctVar.aa) && Objects.equals(this.ab, afctVar.ab) && Arrays.equals(this.ac, afctVar.ac) && this.ad == afctVar.ad && this.ae == afctVar.ae && this.af == afctVar.af && Objects.equals(this.ag, afctVar.ag) && this.ah == afctVar.ah && Objects.equals(this.ai, afctVar.ai) && Objects.equals(this.aj, afctVar.aj) && this.ak == afctVar.ak && this.al == afctVar.al && Objects.equals(this.am, afctVar.am) && Objects.equals(this.an, afctVar.an) && Objects.equals(this.ao, afctVar.ao) && this.ap == afctVar.ap && this.aq == afctVar.aq && Objects.equals(this.ar, afctVar.ar) && this.as == afctVar.as && this.at == afctVar.at && Objects.equals(this.au, afctVar.au) && Objects.equals(this.av, afctVar.av) && Objects.equals(this.aw, afctVar.aw) && Objects.equals(this.ax, afctVar.ax) && this.ay == afctVar.ay && this.az == afctVar.az && this.aA == afctVar.aA;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        ConversationIdType conversationIdType = this.a;
        cpxu cpxuVar = this.b;
        String str = this.c;
        byyy byyyVar = this.d;
        Integer valueOf = Integer.valueOf(byyyVar == null ? 0 : byyyVar.ordinal());
        String str2 = this.e;
        MessageIdType messageIdType = this.f;
        String str3 = this.g;
        String str4 = this.h;
        Uri uri = this.i;
        String str5 = this.j;
        Boolean valueOf2 = Boolean.valueOf(this.k);
        String str6 = this.l;
        String str7 = this.m;
        Uri uri2 = this.n;
        dtsq dtsqVar3 = dtsqVar2;
        String str8 = this.o;
        Integer valueOf3 = Integer.valueOf(this.p);
        byyt byytVar = this.q;
        Long valueOf4 = Long.valueOf(this.r);
        Long valueOf5 = Long.valueOf(this.s);
        String str9 = this.t;
        Long valueOf6 = Long.valueOf(this.u);
        Long valueOf7 = Long.valueOf(this.v);
        String str10 = this.w;
        String str11 = this.x;
        String str12 = this.y;
        String str13 = this.z;
        String str14 = this.A;
        azsu azsuVar = this.B;
        azcr azcrVar = this.C;
        Integer valueOf8 = Integer.valueOf(this.D);
        Boolean valueOf9 = Boolean.valueOf(this.E);
        String str15 = this.F;
        Boolean valueOf10 = Boolean.valueOf(this.G);
        Boolean valueOf11 = Boolean.valueOf(this.H);
        String str16 = this.I;
        String str17 = this.J;
        String str18 = this.K;
        Integer valueOf12 = Integer.valueOf(this.L);
        Long valueOf13 = Long.valueOf(this.M);
        Integer valueOf14 = Integer.valueOf(this.N);
        Integer valueOf15 = Integer.valueOf(this.O);
        Integer valueOf16 = Integer.valueOf(this.P);
        Boolean valueOf17 = Boolean.valueOf(this.Q);
        Boolean valueOf18 = Boolean.valueOf(this.R);
        Long valueOf19 = Long.valueOf(this.S);
        String str19 = this.T;
        String str20 = this.U;
        Boolean valueOf20 = Boolean.valueOf(this.V);
        Integer valueOf21 = Integer.valueOf(this.W);
        Long valueOf22 = Long.valueOf(this.X);
        Long valueOf23 = Long.valueOf(this.Y);
        String str21 = this.Z;
        String str22 = this.aa;
        String str23 = this.ab;
        Integer valueOf24 = Integer.valueOf(Arrays.hashCode(this.ac));
        Long valueOf25 = Long.valueOf(this.ad);
        Long valueOf26 = Long.valueOf(this.ae);
        Boolean valueOf27 = Boolean.valueOf(this.af);
        cknh cknhVar = this.ag;
        Boolean valueOf28 = Boolean.valueOf(this.ah);
        ConversationIdType conversationIdType2 = this.ai;
        ConversationIdType conversationIdType3 = this.aj;
        ayhd ayhdVar = this.ak;
        csgg csggVar = this.al;
        Integer valueOf29 = Integer.valueOf(csggVar == null ? 0 : csggVar.ordinal());
        String str24 = this.am;
        Optional optional = this.an;
        Optional optional2 = this.ao;
        Boolean valueOf30 = Boolean.valueOf(this.ap);
        Boolean valueOf31 = Boolean.valueOf(this.aq);
        ckkz ckkzVar = this.ar;
        ckte ckteVar = this.as;
        return Objects.hash(dtsqVar3, conversationIdType, cpxuVar, str, valueOf, str2, messageIdType, str3, str4, uri, str5, valueOf2, str6, str7, uri2, str8, valueOf3, byytVar, valueOf4, valueOf5, str9, valueOf6, valueOf7, str10, str11, str12, str13, str14, azsuVar, azcrVar, valueOf8, valueOf9, str15, valueOf10, valueOf11, str16, str17, str18, valueOf12, valueOf13, valueOf14, valueOf15, valueOf16, valueOf17, valueOf18, valueOf19, str19, str20, valueOf20, valueOf21, valueOf22, valueOf23, str21, str22, str23, valueOf24, valueOf25, valueOf26, valueOf27, cknhVar, valueOf28, conversationIdType2, conversationIdType3, ayhdVar, valueOf29, str24, optional, optional2, valueOf30, valueOf31, ckkzVar, Integer.valueOf(ckteVar == null ? 0 : ckteVar.ordinal()), Integer.valueOf(this.at), this.au, this.av, this.aw, this.ax, Integer.valueOf(this.ay), Long.valueOf(this.az), Integer.valueOf(this.aA), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationOptionalLabelsQuery -- REDACTED") : a();
    }
}
