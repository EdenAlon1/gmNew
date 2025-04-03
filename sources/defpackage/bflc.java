package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import j$.util.Optional;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bflc extends dtro {
    public String I;
    public String K;
    public String L;
    public String M;
    public int U;
    public String ae;
    public String ag;
    public String ah;
    public String ai;
    public long ak;
    public String al;
    public String am;
    public String an;
    public String ao;
    public Uri ap;
    public String aq;
    public String as;
    public fbuk av;
    public long aw;
    public String c;
    public String e;
    public String f;
    public Uri g;
    public String h;
    public String j;
    public String k;
    public Uri l;
    public String m;
    public String q;
    public String s;
    public String t;
    public String u;
    public String y;
    public ConversationIdType a = bdgq.a;
    public cpxu b = new cpxu();
    public byyy d = byyy.NAME_IS_AUTOMATIC;
    public boolean i = false;
    public int n = 0;
    public byyt o = byyt.UNARCHIVED;
    public long p = 0;
    public long r = -1;
    public azsu v = null;
    public int w = 0;
    public boolean x = true;
    public boolean z = true;
    public boolean A = false;
    public int B = 0;
    public long C = -1;
    public int D = 0;
    public int E = 0;
    public int F = 0;
    public boolean G = false;
    public boolean H = false;
    public long J = 0;
    public boolean N = true;
    public boolean O = false;
    public ayhd P = ayhd.b(0);
    public Optional Q = bdhe.b(-1);
    public boolean R = false;
    public boolean S = false;
    public cfmh T = new cfmh(0);
    public MessageIdType V = bdhb.a;
    public long W = 0;
    public long X = 0;
    public int Y = 0;
    public int Z = 0;
    public boolean aa = false;
    public int ab = 0;
    public int ac = 0;
    public int ad = -1;
    public int af = -2;
    public long aj = -1;
    public ardn ar = ardn.VMT_STATUS_UNKNOWN;
    public long at = 0;
    public int au = 0;
    public ConversationIdType ax = bdgq.a;

    protected bflc() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ConversationListQuery [conversations.conversations__id: %s,\n  conversations.conversations_sms_thread_id: %s,\n  conversations.conversations_name: %s,\n  conversations.conversations_name_is_automatic: %s,\n  conversations.conversations_snippet_text: %s,\n  conversations.conversations_subject_text: %s,\n  conversations.conversations_preview_uri: %s,\n  conversations.conversations_preview_content_type: %s,\n  conversations.conversations_show_draft: %s,\n  conversations.conversations_draft_snippet_text: %s,\n  conversations.conversations_draft_subject_text: %s,\n  conversations.conversations_draft_preview_uri: %s,\n  conversations.conversations_draft_preview_content_type: %s,\n  conversations.conversations_etouffee_default: %s,\n  conversations.conversations_archive_status: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversations.conversations_icon: %s,\n  conversations.conversations_participant_contact_id: %s,\n  conversations.conversations_participant_lookup_key: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_current_self_id: %s,\n  conversations.conversations_current_my_identity_foreign_key: %s,\n  conversations.conversations_participant_count: %s,\n  conversations.conversations_notification_enabled: %s,\n  conversations.conversations_notification_sound_uri: %s,\n  conversations.conversations_notification_vibration: %s,\n  conversations.conversations_include_email_addr: %s,\n  conversations.conversations_source_type: %s,\n  conversations.conversations_rcs_session_id: %s,\n  conversations.conversations_join_state: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_send_mode: %s,\n  conversations.conversations_IS_ENTERPRISE: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_participant_display_destination: %s,\n  conversations.conversations_delete_timestamp: %s,\n  conversations.conversations_cms_id: %s,\n  conversations.conversations_rcs_group_id: %s,\n  conversations.conversations_rcs_conference_uri: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_awaiting_reverse_sync: %s,\n  conversations.conversations_error_state: %s,\n  conversations.conversations_rcs_group_last_sync_timestamp: %s,\n  conversations.conversations_has_been_e2ee: %s,\n  conversations.conversations_marked_as_unread: %s,\n  conversations.conversations_encryption_protocol: %s,\n  conversations.conversations_unread_count: %s,\n  messages.messages__id: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  participants.participants_directory_id: %s,\n  conversation_participants.conversation_participants_participant_id: %s,\n  one_on_one_participant.one_on_one_participant_full_name: %s,\n  one_on_one_participant.one_on_one_participant_first_name: %s,\n  profiles_table.profiles_table_display_name: %s,\n  parts.parts_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  vmt.vmt_vmt_status: %s,\n  vmt.vmt_text: %s,\n  reminders.reminders_trigger_time: %s,\n  messages_annotations.messages_annotations_annotation_type: %s,\n  messages_annotations.messages_annotations_annotation_details: %s,\n  message_star.message_star__id: %s,\n  parent_disallowed_conversations.parent_disallowed_conversations_conversation_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t), String.valueOf(this.u), String.valueOf(this.v), String.valueOf(this.w), String.valueOf(this.x), String.valueOf(this.y), String.valueOf(this.z), String.valueOf(this.A), String.valueOf(this.B), String.valueOf(this.C), String.valueOf(this.D), String.valueOf(this.E), String.valueOf(this.F), String.valueOf(this.G), String.valueOf(this.H), String.valueOf(this.I), String.valueOf(this.J), String.valueOf(this.K), String.valueOf(this.L), String.valueOf(this.M), String.valueOf(this.N), String.valueOf(this.O), String.valueOf(this.P), String.valueOf(this.Q), String.valueOf(this.R), String.valueOf(this.S), String.valueOf(this.T), String.valueOf(this.U), String.valueOf(this.V), String.valueOf(this.W), String.valueOf(this.X), String.valueOf(this.Y), String.valueOf(this.Z), String.valueOf(this.aa), String.valueOf(this.ab), String.valueOf(this.ac), String.valueOf(this.ad), String.valueOf(this.ae), String.valueOf(this.af), String.valueOf(this.ag), String.valueOf(this.ah), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao), String.valueOf(this.ap), String.valueOf(this.aq), String.valueOf(this.ar), String.valueOf(this.as), String.valueOf(this.at), String.valueOf(this.au), String.valueOf(this.av), String.valueOf(this.aw), String.valueOf(this.ax));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        bgmn.c().intValue();
    }

    @Override // defpackage.dtro
    protected final /* synthetic */ void c(dtsu dtsuVar) {
        bgmg bgmgVar = (bgmg) dtsuVar;
        aB();
        this.cL = bgmgVar.cU();
        if (bgmgVar.di(0)) {
            this.a = new ConversationIdType(bgmgVar.getLong(bgmgVar.cM(0, bgmn.a)));
            fY(0);
        }
        if (bgmgVar.di(1)) {
            this.b = cpxu.b(bgmgVar.getLong(bgmgVar.cM(1, bgmn.a)));
            fY(1);
        }
        if (bgmgVar.di(2)) {
            this.c = bgmgVar.getString(bgmgVar.cM(2, bgmn.a));
            fY(2);
        }
        if (bgmgVar.di(3)) {
            byyy[] values = byyy.values();
            int i = bgmgVar.getInt(bgmgVar.cM(3, bgmn.a));
            if (i >= values.length) {
                throw new IllegalArgumentException();
            }
            this.d = values[i];
            fY(3);
        }
        if (bgmgVar.di(4)) {
            this.e = cuxs.a(bgmgVar.getString(bgmgVar.cM(4, bgmn.a)));
            fY(4);
        }
        if (bgmgVar.di(5)) {
            this.f = cuxs.a(bgmgVar.getString(bgmgVar.cM(5, bgmn.a)));
            fY(5);
        }
        fbuk fbukVar = null;
        if (bgmgVar.di(6)) {
            String string = bgmgVar.getString(bgmgVar.cM(6, bgmn.a));
            this.g = string == null ? null : Uri.parse(string);
            fY(6);
        }
        if (bgmgVar.di(7)) {
            this.h = bgmgVar.getString(bgmgVar.cM(7, bgmn.a));
            fY(7);
        }
        if (bgmgVar.di(8)) {
            this.i = bgmgVar.getInt(bgmgVar.cM(8, bgmn.a)) == 1;
            fY(8);
        }
        if (bgmgVar.di(9)) {
            this.j = cuxs.a(bgmgVar.getString(bgmgVar.cM(9, bgmn.a)));
            fY(9);
        }
        if (bgmgVar.di(10)) {
            this.k = cuxs.a(bgmgVar.getString(bgmgVar.cM(10, bgmn.a)));
            fY(10);
        }
        if (bgmgVar.di(11)) {
            String string2 = bgmgVar.getString(bgmgVar.cM(11, bgmn.a));
            this.l = string2 == null ? null : Uri.parse(string2);
            fY(11);
        }
        if (bgmgVar.di(12)) {
            this.m = bgmgVar.getString(bgmgVar.cM(12, bgmn.a));
            fY(12);
        }
        if (bgmgVar.di(13)) {
            this.n = bgmgVar.getInt(bgmgVar.cM(13, bgmn.a));
            fY(13);
        }
        if (bgmgVar.di(14)) {
            this.o = byyt.a(bgmgVar.getInt(bgmgVar.cM(14, bgmn.a)));
            fY(14);
        }
        if (bgmgVar.di(15)) {
            this.p = bgmgVar.getLong(bgmgVar.cM(15, bgmn.a));
            fY(15);
        }
        if (bgmgVar.di(16)) {
            this.q = bgmgVar.getString(bgmgVar.cM(16, bgmn.a));
            fY(16);
        }
        if (bgmgVar.di(17)) {
            this.r = bgmgVar.getLong(bgmgVar.cM(17, bgmn.a));
            fY(17);
        }
        if (bgmgVar.di(18)) {
            this.s = bgmgVar.getString(bgmgVar.cM(18, bgmn.a));
            fY(18);
        }
        if (bgmgVar.di(19)) {
            this.t = bgmgVar.getString(bgmgVar.cM(19, bgmn.a));
            fY(19);
        }
        if (bgmgVar.di(20)) {
            this.u = bgmgVar.getString(bgmgVar.cM(20, bgmn.a));
            fY(20);
        }
        if (bgmgVar.di(21)) {
            this.v = azsv.a(bgmgVar.getString(bgmgVar.cM(21, bgmn.a)));
            fY(21);
        }
        if (bgmgVar.di(22)) {
            this.w = bgmgVar.getInt(bgmgVar.cM(22, bgmn.a));
            fY(22);
        }
        if (bgmgVar.di(23)) {
            this.x = bgmgVar.getInt(bgmgVar.cM(23, bgmn.a)) == 1;
            fY(23);
        }
        if (bgmgVar.di(24)) {
            this.y = bgmgVar.getString(bgmgVar.cM(24, bgmn.a));
            fY(24);
        }
        if (bgmgVar.di(25)) {
            this.z = bgmgVar.getInt(bgmgVar.cM(25, bgmn.a)) == 1;
            fY(25);
        }
        if (bgmgVar.di(26)) {
            this.A = bgmgVar.getInt(bgmgVar.cM(26, bgmn.a)) == 1;
            fY(26);
        }
        if (bgmgVar.di(27)) {
            this.B = bgmgVar.getInt(bgmgVar.cM(27, bgmn.a));
            fY(27);
        }
        if (bgmgVar.di(28)) {
            this.C = bgmgVar.getLong(bgmgVar.cM(28, bgmn.a));
            fY(28);
        }
        if (bgmgVar.di(29)) {
            this.D = bgmgVar.getInt(bgmgVar.cM(29, bgmn.a));
            fY(29);
        }
        if (bgmgVar.di(30)) {
            this.E = bgmgVar.getInt(bgmgVar.cM(30, bgmn.a));
            fY(30);
        }
        if (bgmgVar.di(31)) {
            this.F = bgmgVar.getInt(bgmgVar.cM(31, bgmn.a));
            fY(31);
        }
        if (bgmgVar.di(32)) {
            this.G = bgmgVar.getInt(bgmgVar.cM(32, bgmn.a)) == 1;
            fY(32);
        }
        if (bgmgVar.di(33)) {
            this.H = bgmgVar.getInt(bgmgVar.cM(33, bgmn.a)) == 1;
            fY(33);
        }
        if (bgmgVar.di(34)) {
            this.I = cuxs.a(bgmgVar.getString(bgmgVar.cM(34, bgmn.a)));
            fY(34);
        }
        if (bgmgVar.di(35)) {
            this.J = bgmgVar.getLong(bgmgVar.cM(35, bgmn.a));
            fY(35);
        }
        if (bgmgVar.di(36)) {
            this.K = bgmgVar.getString(bgmgVar.cM(36, bgmn.a));
            fY(36);
        }
        if (bgmgVar.di(37)) {
            this.L = bgmgVar.getString(bgmgVar.cM(37, bgmn.a));
            fY(37);
        }
        if (bgmgVar.di(38)) {
            this.M = cuxb.a(bgmgVar.getString(bgmgVar.cM(38, bgmn.a)));
            fY(38);
        }
        if (bgmgVar.di(39)) {
            this.N = bgmgVar.getInt(bgmgVar.cM(39, bgmn.a)) == 1;
            fY(39);
        }
        if (bgmgVar.di(40)) {
            this.O = bgmgVar.getInt(bgmgVar.cM(40, bgmn.a)) == 1;
            fY(40);
        }
        if (bgmgVar.di(41)) {
            this.P = ayhd.b(bgmgVar.getInt(bgmgVar.cM(41, bgmn.a)));
            fY(41);
        }
        if (bgmgVar.di(42)) {
            this.Q = bdhe.b(bgmgVar.getLong(bgmgVar.cM(42, bgmn.a)));
            fY(42);
        }
        if (bgmgVar.di(43)) {
            this.R = bgmgVar.getInt(bgmgVar.cM(43, bgmn.a)) == 1;
            fY(43);
        }
        if (bgmgVar.di(44)) {
            this.S = bgmgVar.getInt(bgmgVar.cM(44, bgmn.a)) == 1;
            fY(44);
        }
        if (bgmgVar.di(45)) {
            this.T = new cfmh(bgmgVar.getLong(bgmgVar.cM(45, bgmn.a)));
            fY(45);
        }
        if (bgmgVar.di(46)) {
            this.U = bgmgVar.getInt(bgmgVar.cM(46, bgmn.a));
            fY(46);
        }
        if (bgmgVar.di(47)) {
            this.V = new MessageIdType(bgmgVar.getLong(bgmgVar.cM(47, bgmn.a)));
            fY(47);
        }
        if (bgmgVar.di(48)) {
            this.W = bgmgVar.getLong(bgmgVar.cM(48, bgmn.a));
            fY(48);
        }
        if (bgmgVar.di(49)) {
            this.X = bgmgVar.getLong(bgmgVar.cM(49, bgmn.a));
            fY(49);
        }
        if (bgmgVar.di(50)) {
            this.Y = bgmgVar.getInt(bgmgVar.cM(50, bgmn.a));
            fY(50);
        }
        if (bgmgVar.di(51)) {
            this.Z = bgmgVar.getInt(bgmgVar.cM(51, bgmn.a));
            fY(51);
        }
        if (bgmgVar.di(52)) {
            this.aa = bgmgVar.getInt(bgmgVar.cM(52, bgmn.a)) == 1;
            fY(52);
        }
        if (bgmgVar.di(53)) {
            this.ab = bgmgVar.getInt(bgmgVar.cM(53, bgmn.a));
            fY(53);
        }
        if (bgmgVar.di(54)) {
            this.ac = bgmgVar.getInt(bgmgVar.cM(54, bgmn.a));
            fY(54);
        }
        if (bgmgVar.di(55)) {
            this.ad = bgmgVar.getInt(bgmgVar.cM(55, bgmn.a));
            fY(55);
        }
        if (bgmgVar.di(56)) {
            this.ae = bgmgVar.getString(bgmgVar.cM(56, bgmn.a));
            fY(56);
        }
        if (bgmgVar.di(57)) {
            this.af = bgmgVar.getInt(bgmgVar.cM(57, bgmn.a));
            fY(57);
        }
        if (bgmgVar.di(58)) {
            this.ag = cuxd.a(bgmgVar.getString(bgmgVar.cM(58, bgmn.a)));
            fY(58);
        }
        if (bgmgVar.di(59)) {
            this.ah = cuxs.a(bgmgVar.getString(bgmgVar.cM(59, bgmn.a)));
            fY(59);
        }
        if (bgmgVar.di(60)) {
            this.ai = cuxs.a(bgmgVar.getString(bgmgVar.cM(60, bgmn.a)));
            fY(60);
        }
        if (bgmgVar.di(61)) {
            this.aj = bgmgVar.getLong(bgmgVar.cM(61, bgmn.a));
            fY(61);
        }
        if (bgmgVar.di(62)) {
            this.ak = bgmgVar.getLong(bgmgVar.cM(62, bgmn.a));
            fY(62);
        }
        if (bgmgVar.di(63)) {
            this.al = cuxs.a(bgmgVar.getString(bgmgVar.cM(63, bgmn.a)));
            fY(63);
        }
        if (bgmgVar.di(64)) {
            this.am = cuxs.a(bgmgVar.getString(bgmgVar.cM(64, bgmn.a)));
            fY(64);
        }
        if (bgmgVar.di(65)) {
            this.an = bgmgVar.getString(bgmgVar.cM(65, bgmn.a));
            fY(65);
        }
        if (bgmgVar.di(66)) {
            this.ao = cuxs.a(bgmgVar.getString(bgmgVar.cM(66, bgmn.a)));
            fY(66);
        }
        if (bgmgVar.di(67)) {
            String string3 = bgmgVar.getString(bgmgVar.cM(67, bgmn.a));
            this.ap = string3 == null ? null : Uri.parse(string3);
            fY(67);
        }
        if (bgmgVar.di(68)) {
            this.aq = bgmgVar.getString(bgmgVar.cM(68, bgmn.a));
            fY(68);
        }
        if (bgmgVar.di(69)) {
            this.ar = ardn.b(bgmgVar.getInt(bgmgVar.cM(69, bgmn.a)));
            fY(69);
        }
        if (bgmgVar.di(70)) {
            this.as = bgmgVar.getString(bgmgVar.cM(70, bgmn.a));
            fY(70);
        }
        if (bgmgVar.di(71)) {
            this.at = bgmgVar.getLong(bgmgVar.cM(71, bgmn.a));
            fY(71);
        }
        if (bgmgVar.di(72)) {
            this.au = bgmgVar.getInt(bgmgVar.cM(72, bgmn.a));
            fY(72);
        }
        if (bgmgVar.di(73)) {
            byte[] blob = bgmgVar.getBlob(bgmgVar.cM(73, bgmn.a));
            if (blob != null) {
                try {
                    fbukVar = (fbuk) eyfy.parseFrom(fbuk.a, blob, eyfc.a());
                } catch (Throwable unused) {
                    fbukVar = fbuk.a;
                }
            }
            this.av = fbukVar;
            fY(73);
        }
        if (bgmgVar.di(74)) {
            this.aw = bgmgVar.getLong(bgmgVar.cM(74, bgmn.a));
            fY(74);
        }
        if (bgmgVar.di(75)) {
            this.ax = new ConversationIdType(bgmgVar.getLong(bgmgVar.cM(75, bgmn.a)));
            fY(75);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bflc)) {
            return false;
        }
        bflc bflcVar = (bflc) obj;
        return super.aD(bflcVar.cL) && Objects.equals(this.a, bflcVar.a) && Objects.equals(this.b, bflcVar.b) && Objects.equals(this.c, bflcVar.c) && this.d == bflcVar.d && Objects.equals(this.e, bflcVar.e) && Objects.equals(this.f, bflcVar.f) && Objects.equals(this.g, bflcVar.g) && Objects.equals(this.h, bflcVar.h) && this.i == bflcVar.i && Objects.equals(this.j, bflcVar.j) && Objects.equals(this.k, bflcVar.k) && Objects.equals(this.l, bflcVar.l) && Objects.equals(this.m, bflcVar.m) && this.n == bflcVar.n && this.o == bflcVar.o && this.p == bflcVar.p && Objects.equals(this.q, bflcVar.q) && this.r == bflcVar.r && Objects.equals(this.s, bflcVar.s) && Objects.equals(this.t, bflcVar.t) && Objects.equals(this.u, bflcVar.u) && Objects.equals(this.v, bflcVar.v) && this.w == bflcVar.w && this.x == bflcVar.x && Objects.equals(this.y, bflcVar.y) && this.z == bflcVar.z && this.A == bflcVar.A && this.B == bflcVar.B && this.C == bflcVar.C && this.D == bflcVar.D && this.E == bflcVar.E && this.F == bflcVar.F && this.G == bflcVar.G && this.H == bflcVar.H && Objects.equals(this.I, bflcVar.I) && this.J == bflcVar.J && Objects.equals(this.K, bflcVar.K) && Objects.equals(this.L, bflcVar.L) && Objects.equals(this.M, bflcVar.M) && this.N == bflcVar.N && this.O == bflcVar.O && this.P == bflcVar.P && Objects.equals(this.Q, bflcVar.Q) && this.R == bflcVar.R && this.S == bflcVar.S && Objects.equals(this.T, bflcVar.T) && this.U == bflcVar.U && Objects.equals(this.V, bflcVar.V) && this.W == bflcVar.W && this.X == bflcVar.X && this.Y == bflcVar.Y && this.Z == bflcVar.Z && this.aa == bflcVar.aa && this.ab == bflcVar.ab && this.ac == bflcVar.ac && this.ad == bflcVar.ad && Objects.equals(this.ae, bflcVar.ae) && this.af == bflcVar.af && Objects.equals(this.ag, bflcVar.ag) && Objects.equals(this.ah, bflcVar.ah) && Objects.equals(this.ai, bflcVar.ai) && this.aj == bflcVar.aj && this.ak == bflcVar.ak && Objects.equals(this.al, bflcVar.al) && Objects.equals(this.am, bflcVar.am) && Objects.equals(this.an, bflcVar.an) && Objects.equals(this.ao, bflcVar.ao) && Objects.equals(this.ap, bflcVar.ap) && Objects.equals(this.aq, bflcVar.aq) && this.ar == bflcVar.ar && Objects.equals(this.as, bflcVar.as) && this.at == bflcVar.at && this.au == bflcVar.au && Objects.equals(this.av, bflcVar.av) && this.aw == bflcVar.aw && Objects.equals(this.ax, bflcVar.ax);
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        ConversationIdType conversationIdType = this.a;
        cpxu cpxuVar = this.b;
        String str = this.c;
        byyy byyyVar = this.d;
        return Objects.hash(dtsqVar2, conversationIdType, cpxuVar, str, Integer.valueOf(byyyVar == null ? 0 : byyyVar.ordinal()), this.e, this.f, this.g, this.h, Boolean.valueOf(this.i), this.j, this.k, this.l, this.m, Integer.valueOf(this.n), this.o, Long.valueOf(this.p), this.q, Long.valueOf(this.r), this.s, this.t, this.u, this.v, Integer.valueOf(this.w), Boolean.valueOf(this.x), this.y, Boolean.valueOf(this.z), Boolean.valueOf(this.A), Integer.valueOf(this.B), Long.valueOf(this.C), Integer.valueOf(this.D), Integer.valueOf(this.E), Integer.valueOf(this.F), Boolean.valueOf(this.G), Boolean.valueOf(this.H), this.I, Long.valueOf(this.J), this.K, this.L, this.M, Boolean.valueOf(this.N), Boolean.valueOf(this.O), this.P, this.Q, Boolean.valueOf(this.R), Boolean.valueOf(this.S), this.T, Integer.valueOf(this.U), this.V, Long.valueOf(this.W), Long.valueOf(this.X), Integer.valueOf(this.Y), Integer.valueOf(this.Z), Boolean.valueOf(this.aa), Integer.valueOf(this.ab), Integer.valueOf(this.ac), Integer.valueOf(this.ad), this.ae, Integer.valueOf(this.af), this.ag, this.ah, this.ai, Long.valueOf(this.aj), Long.valueOf(this.ak), this.al, this.am, this.an, this.ao, this.ap, this.aq, this.ar, this.as, Long.valueOf(this.at), Integer.valueOf(this.au), this.av, Long.valueOf(this.aw), this.ax, null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationListQuery -- REDACTED") : a();
    }
}
