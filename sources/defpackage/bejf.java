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
public class bejf extends dtro<bfkf, bfki, bfkk, bejf, bfke> {
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

    protected bejf() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "ConversationListFromConversationToParticipantsQuery [conversations.conversations__id: %s,\n  conversations.conversations_sms_thread_id: %s,\n  conversations.conversations_name: %s,\n  conversations.conversations_name_is_automatic: %s,\n  conversations.conversations_snippet_text: %s,\n  conversations.conversations_subject_text: %s,\n  conversations.conversations_preview_uri: %s,\n  conversations.conversations_preview_content_type: %s,\n  conversations.conversations_show_draft: %s,\n  conversations.conversations_draft_snippet_text: %s,\n  conversations.conversations_draft_subject_text: %s,\n  conversations.conversations_draft_preview_uri: %s,\n  conversations.conversations_draft_preview_content_type: %s,\n  conversations.conversations_etouffee_default: %s,\n  conversations.conversations_archive_status: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversations.conversations_icon: %s,\n  conversations.conversations_participant_contact_id: %s,\n  conversations.conversations_participant_lookup_key: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_current_self_id: %s,\n  conversations.conversations_current_my_identity_foreign_key: %s,\n  conversations.conversations_participant_count: %s,\n  conversations.conversations_notification_enabled: %s,\n  conversations.conversations_notification_sound_uri: %s,\n  conversations.conversations_notification_vibration: %s,\n  conversations.conversations_include_email_addr: %s,\n  conversations.conversations_source_type: %s,\n  conversations.conversations_rcs_session_id: %s,\n  conversations.conversations_join_state: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_send_mode: %s,\n  conversations.conversations_IS_ENTERPRISE: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_participant_display_destination: %s,\n  conversations.conversations_delete_timestamp: %s,\n  conversations.conversations_cms_id: %s,\n  conversations.conversations_rcs_group_id: %s,\n  conversations.conversations_rcs_conference_uri: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_awaiting_reverse_sync: %s,\n  conversations.conversations_error_state: %s,\n  conversations.conversations_rcs_group_last_sync_timestamp: %s,\n  conversations.conversations_has_been_e2ee: %s,\n  conversations.conversations_marked_as_unread: %s,\n  conversations.conversations_encryption_protocol: %s,\n  conversations.conversations_unread_count: %s,\n  messages.messages__id: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  participants.participants_directory_id: %s,\n  conversation_to_participants.conversation_to_participants_participant_id: %s,\n  one_on_one_participant.one_on_one_participant_full_name: %s,\n  one_on_one_participant.one_on_one_participant_first_name: %s,\n  profiles_table.profiles_table_display_name: %s,\n  parts.parts_text: %s,\n  parts.parts_uri: %s,\n  parts.parts_content_type: %s,\n  vmt.vmt_vmt_status: %s,\n  vmt.vmt_text: %s,\n  reminders.reminders_trigger_time: %s,\n  messages_annotations.messages_annotations_annotation_type: %s,\n  messages_annotations.messages_annotations_annotation_details: %s,\n  message_star.message_star__id: %s,\n  parent_disallowed_conversations.parent_disallowed_conversations_conversation_id: %s\n]\n", String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t), String.valueOf(this.u), String.valueOf(this.v), String.valueOf(this.w), String.valueOf(this.x), String.valueOf(this.y), String.valueOf(this.z), String.valueOf(this.A), String.valueOf(this.B), String.valueOf(this.C), String.valueOf(this.D), String.valueOf(this.E), String.valueOf(this.F), String.valueOf(this.G), String.valueOf(this.H), String.valueOf(this.I), String.valueOf(this.J), String.valueOf(this.K), String.valueOf(this.L), String.valueOf(this.M), String.valueOf(this.N), String.valueOf(this.O), String.valueOf(this.P), String.valueOf(this.Q), String.valueOf(this.R), String.valueOf(this.S), String.valueOf(this.T), String.valueOf(this.U), String.valueOf(this.V), String.valueOf(this.W), String.valueOf(this.X), String.valueOf(this.Y), String.valueOf(this.Z), String.valueOf(this.aa), String.valueOf(this.ab), String.valueOf(this.ac), String.valueOf(this.ad), String.valueOf(this.ae), String.valueOf(this.af), String.valueOf(this.ag), String.valueOf(this.ah), String.valueOf(this.ai), String.valueOf(this.aj), String.valueOf(this.ak), String.valueOf(this.al), String.valueOf(this.am), String.valueOf(this.an), String.valueOf(this.ao), String.valueOf(this.ap), String.valueOf(this.aq), String.valueOf(this.ar), String.valueOf(this.as), String.valueOf(this.at), String.valueOf(this.au), String.valueOf(this.av), String.valueOf(this.aw), String.valueOf(this.ax));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        bfkq.d().intValue();
    }

    @Override // defpackage.dtro
    protected final /* synthetic */ void c(dtsu dtsuVar) {
        fbuk fbukVar;
        bfkg bfkgVar = (bfkg) ((bfkf) dtsuVar);
        aB();
        this.cL = bfkgVar.cU();
        if (bfkgVar.di(0)) {
            this.a = bfkgVar.u();
            fY(0);
        }
        if (bfkgVar.di(1)) {
            this.b = cpxu.b(bfkgVar.getLong(bfkgVar.cM(1, bfkq.a)));
            fY(1);
        }
        if (bfkgVar.di(2)) {
            this.c = bfkgVar.I();
            fY(2);
        }
        if (bfkgVar.di(3)) {
            byyy[] values = byyy.values();
            int i = bfkgVar.getInt(bfkgVar.cM(3, bfkq.a));
            if (i >= values.length) {
                throw new IllegalArgumentException();
            }
            this.d = values[i];
            fY(3);
        }
        if (bfkgVar.di(4)) {
            this.e = cuxs.a(bfkgVar.getString(bfkgVar.cM(4, bfkq.a)));
            fY(4);
        }
        if (bfkgVar.di(5)) {
            this.f = bfkgVar.N();
            fY(5);
        }
        if (bfkgVar.di(6)) {
            String string = bfkgVar.getString(bfkgVar.cM(6, bfkq.a));
            this.g = string == null ? null : Uri.parse(string);
            fY(6);
        }
        if (bfkgVar.di(7)) {
            this.h = bfkgVar.getString(bfkgVar.cM(7, bfkq.a));
            fY(7);
        }
        if (bfkgVar.di(8)) {
            this.i = bfkgVar.W();
            fY(8);
        }
        if (bfkgVar.di(9)) {
            this.j = bfkgVar.B();
            fY(9);
        }
        if (bfkgVar.di(10)) {
            this.k = bfkgVar.C();
            fY(10);
        }
        if (bfkgVar.di(11)) {
            this.l = bfkgVar.q();
            fY(11);
        }
        if (bfkgVar.di(12)) {
            this.m = bfkgVar.A();
            fY(12);
        }
        if (bfkgVar.di(13)) {
            this.n = bfkgVar.getInt(bfkgVar.cM(13, bfkq.a));
            fY(13);
        }
        if (bfkgVar.di(14)) {
            this.o = bfkgVar.w();
            fY(14);
        }
        if (bfkgVar.di(15)) {
            this.p = bfkgVar.getLong(bfkgVar.cM(15, bfkq.a));
            fY(15);
        }
        if (bfkgVar.di(16)) {
            this.q = bfkgVar.H();
            fY(16);
        }
        if (bfkgVar.di(17)) {
            this.r = bfkgVar.getLong(bfkgVar.cM(17, bfkq.a));
            fY(17);
        }
        if (bfkgVar.di(18)) {
            this.s = bfkgVar.K();
            fY(18);
        }
        if (bfkgVar.di(19)) {
            this.t = bfkgVar.L();
            fY(19);
        }
        if (bfkgVar.di(20)) {
            this.u = bfkgVar.getString(bfkgVar.cM(20, bfkq.a));
            fY(20);
        }
        if (bfkgVar.di(21)) {
            this.v = azsv.a(bfkgVar.getString(bfkgVar.cM(21, bfkq.a)));
            fY(21);
        }
        if (bfkgVar.di(22)) {
            this.w = bfkgVar.e();
            fY(22);
        }
        if (bfkgVar.di(23)) {
            this.x = bfkgVar.T();
            fY(23);
        }
        if (bfkgVar.di(24)) {
            this.y = bfkgVar.getString(bfkgVar.cM(24, bfkq.a));
            fY(24);
        }
        if (bfkgVar.di(25)) {
            this.z = bfkgVar.getInt(bfkgVar.cM(25, bfkq.a)) == 1;
            fY(25);
        }
        if (bfkgVar.di(26)) {
            this.A = bfkgVar.getInt(bfkgVar.cM(26, bfkq.a)) == 1;
            fY(26);
        }
        if (bfkgVar.di(27)) {
            this.B = bfkgVar.j();
            fY(27);
        }
        if (bfkgVar.di(28)) {
            this.C = bfkgVar.m();
            fY(28);
        }
        if (bfkgVar.di(29)) {
            this.D = bfkgVar.d();
            fY(29);
        }
        if (bfkgVar.di(30)) {
            this.E = bfkgVar.c();
            fY(30);
        }
        if (bfkgVar.di(31)) {
            this.F = bfkgVar.getInt(bfkgVar.cM(31, bfkq.a));
            fY(31);
        }
        if (bfkgVar.di(32)) {
            this.G = bfkgVar.R();
            fY(32);
        }
        if (bfkgVar.di(33)) {
            this.H = bfkgVar.Q();
            fY(33);
        }
        if (bfkgVar.di(34)) {
            this.I = bfkgVar.J();
            fY(34);
        }
        if (bfkgVar.di(35)) {
            this.J = bfkgVar.getLong(bfkgVar.cM(35, bfkq.a));
            fY(35);
        }
        if (bfkgVar.di(36)) {
            this.K = bfkgVar.getString(bfkgVar.cM(36, bfkq.a));
            fY(36);
        }
        if (bfkgVar.di(37)) {
            this.L = bfkgVar.getString(bfkgVar.cM(37, bfkq.a));
            fY(37);
        }
        if (bfkgVar.di(38)) {
            this.M = cuxb.a(bfkgVar.getString(bfkgVar.cM(38, bfkq.a)));
            fY(38);
        }
        if (bfkgVar.di(39)) {
            this.N = bfkgVar.U();
            fY(39);
        }
        if (bfkgVar.di(40)) {
            this.O = bfkgVar.getInt(bfkgVar.cM(40, bfkq.a)) == 1;
            fY(40);
        }
        if (bfkgVar.di(41)) {
            this.P = ayhd.b(bfkgVar.getInt(bfkgVar.cM(41, bfkq.a)));
            fY(41);
        }
        if (bfkgVar.di(42)) {
            this.Q = bdhe.b(bfkgVar.getLong(bfkgVar.cM(42, bfkq.a)));
            fY(42);
        }
        if (bfkgVar.di(43)) {
            this.R = bfkgVar.getInt(bfkgVar.cM(43, bfkq.a)) == 1;
            fY(43);
        }
        if (bfkgVar.di(44)) {
            this.S = bfkgVar.S();
            fY(44);
        }
        if (bfkgVar.di(45)) {
            this.T = new cfmh(bfkgVar.getLong(bfkgVar.cM(45, bfkq.a)));
            fY(45);
        }
        if (bfkgVar.di(46)) {
            this.U = bfkgVar.getInt(bfkgVar.cM(46, bfkq.a));
            fY(46);
        }
        if (bfkgVar.di(47)) {
            this.V = bfkgVar.v();
            fY(47);
        }
        if (bfkgVar.di(48)) {
            this.W = bfkgVar.o();
            fY(48);
        }
        if (bfkgVar.di(49)) {
            this.X = bfkgVar.n();
            fY(49);
        }
        if (bfkgVar.di(50)) {
            this.Y = bfkgVar.f();
            fY(50);
        }
        if (bfkgVar.di(51)) {
            this.Z = bfkgVar.k();
            fY(51);
        }
        if (bfkgVar.di(52)) {
            this.aa = bfkgVar.V();
            fY(52);
        }
        if (bfkgVar.di(53)) {
            this.ab = bfkgVar.i();
            fY(53);
        }
        if (bfkgVar.di(54)) {
            this.ac = bfkgVar.g();
            fY(54);
        }
        if (bfkgVar.di(55)) {
            this.ad = bfkgVar.h();
            fY(55);
        }
        if (bfkgVar.di(56)) {
            this.ae = bfkgVar.M();
            fY(56);
        }
        if (bfkgVar.di(57)) {
            this.af = bfkgVar.l();
            fY(57);
        }
        if (bfkgVar.di(58)) {
            this.ag = bfkgVar.z();
            fY(58);
        }
        if (bfkgVar.di(59)) {
            this.ah = bfkgVar.G();
            fY(59);
        }
        if (bfkgVar.di(60)) {
            this.ai = bfkgVar.E();
            fY(60);
        }
        if (bfkgVar.di(61)) {
            this.aj = bfkgVar.getLong(bfkgVar.cM(61, bfkq.a));
            fY(61);
        }
        if (bfkgVar.di(62)) {
            this.ak = bfkgVar.getLong(bfkgVar.cM(62, bfkq.a));
            fY(62);
        }
        if (bfkgVar.di(63)) {
            this.al = bfkgVar.F();
            fY(63);
        }
        if (bfkgVar.di(64)) {
            this.am = bfkgVar.D();
            fY(64);
        }
        if (bfkgVar.di(65)) {
            this.an = bfkgVar.getString(bfkgVar.cM(65, bfkq.a));
            fY(65);
        }
        if (bfkgVar.di(66)) {
            this.ao = bfkgVar.O();
            fY(66);
        }
        if (bfkgVar.di(67)) {
            this.ap = bfkgVar.r();
            fY(67);
        }
        if (bfkgVar.di(68)) {
            this.aq = bfkgVar.y();
            fY(68);
        }
        if (bfkgVar.di(69)) {
            this.ar = bfkgVar.s();
            fY(69);
        }
        if (bfkgVar.di(70)) {
            this.as = bfkgVar.P();
            fY(70);
        }
        if (bfkgVar.di(71)) {
            this.at = bfkgVar.p();
            fY(71);
        }
        if (bfkgVar.di(72)) {
            this.au = bfkgVar.getInt(bfkgVar.cM(72, bfkq.a));
            fY(72);
        }
        if (bfkgVar.di(73)) {
            byte[] blob = bfkgVar.getBlob(bfkgVar.cM(73, bfkq.a));
            if (blob == null) {
                fbukVar = null;
            } else {
                try {
                    fbukVar = (fbuk) eyfy.parseFrom(fbuk.a, blob, eyfc.a());
                } catch (Throwable unused) {
                    fbukVar = fbuk.a;
                }
            }
            this.av = fbukVar;
            fY(73);
        }
        if (bfkgVar.di(74)) {
            this.aw = bfkgVar.getLong(bfkgVar.cM(74, bfkq.a));
            fY(74);
        }
        if (bfkgVar.di(75)) {
            this.ax = bfkgVar.t();
            fY(75);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bejf)) {
            return false;
        }
        bejf bejfVar = (bejf) obj;
        return super.aD(bejfVar.cL) && Objects.equals(this.a, bejfVar.a) && Objects.equals(this.b, bejfVar.b) && Objects.equals(this.c, bejfVar.c) && this.d == bejfVar.d && Objects.equals(this.e, bejfVar.e) && Objects.equals(this.f, bejfVar.f) && Objects.equals(this.g, bejfVar.g) && Objects.equals(this.h, bejfVar.h) && this.i == bejfVar.i && Objects.equals(this.j, bejfVar.j) && Objects.equals(this.k, bejfVar.k) && Objects.equals(this.l, bejfVar.l) && Objects.equals(this.m, bejfVar.m) && this.n == bejfVar.n && this.o == bejfVar.o && this.p == bejfVar.p && Objects.equals(this.q, bejfVar.q) && this.r == bejfVar.r && Objects.equals(this.s, bejfVar.s) && Objects.equals(this.t, bejfVar.t) && Objects.equals(this.u, bejfVar.u) && Objects.equals(this.v, bejfVar.v) && this.w == bejfVar.w && this.x == bejfVar.x && Objects.equals(this.y, bejfVar.y) && this.z == bejfVar.z && this.A == bejfVar.A && this.B == bejfVar.B && this.C == bejfVar.C && this.D == bejfVar.D && this.E == bejfVar.E && this.F == bejfVar.F && this.G == bejfVar.G && this.H == bejfVar.H && Objects.equals(this.I, bejfVar.I) && this.J == bejfVar.J && Objects.equals(this.K, bejfVar.K) && Objects.equals(this.L, bejfVar.L) && Objects.equals(this.M, bejfVar.M) && this.N == bejfVar.N && this.O == bejfVar.O && this.P == bejfVar.P && Objects.equals(this.Q, bejfVar.Q) && this.R == bejfVar.R && this.S == bejfVar.S && Objects.equals(this.T, bejfVar.T) && this.U == bejfVar.U && Objects.equals(this.V, bejfVar.V) && this.W == bejfVar.W && this.X == bejfVar.X && this.Y == bejfVar.Y && this.Z == bejfVar.Z && this.aa == bejfVar.aa && this.ab == bejfVar.ab && this.ac == bejfVar.ac && this.ad == bejfVar.ad && Objects.equals(this.ae, bejfVar.ae) && this.af == bejfVar.af && Objects.equals(this.ag, bejfVar.ag) && Objects.equals(this.ah, bejfVar.ah) && Objects.equals(this.ai, bejfVar.ai) && this.aj == bejfVar.aj && this.ak == bejfVar.ak && Objects.equals(this.al, bejfVar.al) && Objects.equals(this.am, bejfVar.am) && Objects.equals(this.an, bejfVar.an) && Objects.equals(this.ao, bejfVar.ao) && Objects.equals(this.ap, bejfVar.ap) && Objects.equals(this.aq, bejfVar.aq) && this.ar == bejfVar.ar && Objects.equals(this.as, bejfVar.as) && this.at == bejfVar.at && this.au == bejfVar.au && Objects.equals(this.av, bejfVar.av) && this.aw == bejfVar.aw && Objects.equals(this.ax, bejfVar.ax);
    }

    public final int f() {
        az(30, "conv_type");
        return this.E;
    }

    public final int g() {
        az(13, "etouffee_default");
        return this.n;
    }

    public final int h() {
        az(27, "source_type");
        return this.B;
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

    public final int i() {
        az(51, "message_status");
        return this.Z;
    }

    public final long j() {
        az(28, "rcs_session_id");
        return this.C;
    }

    public final ConversationIdType k() {
        az(0, "_id");
        return this.a;
    }

    public final MessageIdType l() {
        az(47, "_id");
        return this.V;
    }

    public final String m() {
        az(20, "current_self_id");
        return this.u;
    }

    public final String n() {
        az(2, "name");
        return this.c;
    }

    public final String o() {
        az(19, "participant_normalized_destination");
        return this.t;
    }

    public final boolean p() {
        az(33, "has_ea2p_bot_recipient");
        return this.H;
    }

    public final boolean q() {
        az(8, "show_draft");
        return this.i;
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "ConversationListFromConversationToParticipantsQuery -- REDACTED") : a();
    }
}
