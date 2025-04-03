package defpackage;

import android.content.ContentValues;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import defpackage.dtro;
import j$.util.Objects;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class afke extends dtro {
    public String J;
    public String L;
    public String M;
    public String N;
    public String O;
    public String P;
    public String Q;
    public String R;
    public boolean T;
    private String W;
    private int X;
    private long Y;
    public String a;
    public String b;
    public String c;
    public Uri d;
    public String e;
    public String g;
    public String h;
    public Uri i;
    public String j;
    public String l;
    public String m;
    public String w;
    private ConversationIdType U = bdgq.a;
    public boolean f = false;
    public byyt k = byyt.UNARCHIVED;
    private long V = 0;
    public int n = 0;
    public boolean o = true;
    public boolean p = false;
    public int q = 0;
    public long r = -1;
    public int s = 0;
    public int t = 0;
    public boolean u = false;
    public boolean v = false;
    public boolean x = true;
    public boolean y = false;
    public ckte z = ckte.a;
    public MessageIdType A = bdhb.a;
    public long B = 0;
    public long C = 0;
    public int D = 0;
    public int E = 0;
    public boolean F = false;
    public int G = 0;
    public int H = 0;
    public int I = -1;
    public int K = -2;
    public long S = 0;

    protected afke() {
    }

    @Override // defpackage.dtro
    public final String a() {
        return String.format(Locale.US, "HomeScreenQuery [conversations.conversations__id: %s,\n  conversations.conversations_name: %s,\n  conversations.conversations_snippet_text: %s,\n  conversations.conversations_subject_text: %s,\n  conversations.conversations_preview_uri: %s,\n  conversations.conversations_preview_content_type: %s,\n  conversations.conversations_show_draft: %s,\n  conversations.conversations_draft_snippet_text: %s,\n  conversations.conversations_draft_subject_text: %s,\n  conversations.conversations_draft_preview_uri: %s,\n  conversations.conversations_draft_preview_content_type: %s,\n  conversations.conversations_archive_status: %s,\n  conversations.conversations_sort_timestamp: %s,\n  conversations.conversations_icon: %s,\n  conversations.conversations_participant_lookup_key: %s,\n  conversations.conversations_participant_normalized_destination: %s,\n  conversations.conversations_participant_count: %s,\n  conversations.conversations_notification_enabled: %s,\n  conversations.conversations_include_email_addr: %s,\n  conversations.conversations_source_type: %s,\n  conversations.conversations_rcs_session_id: %s,\n  conversations.conversations_join_state: %s,\n  conversations.conversations_conv_type: %s,\n  conversations.conversations_IS_ENTERPRISE: %s,\n  conversations.conversations_has_ea2p_bot_recipient: %s,\n  conversations.conversations_participant_display_destination: %s,\n  conversations.conversations_rcs_session_allows_revocation: %s,\n  conversations.conversations_marked_as_unread: %s,\n  conversations.conversations_mms_group_upgrade_status: %s,\n  conversations.conversations_unread_count: %s,\n  messages.messages__id: %s,\n  messages.messages_sent_timestamp: %s,\n  messages.messages_received_timestamp: %s,\n  messages.messages_message_protocol: %s,\n  messages.messages_message_status: %s,\n  messages.messages_read: %s,\n  messages.messages_sms_priority: %s,\n  messages.messages_raw_status: %s,\n  messages.messages_sms_error_code: %s,\n  messages.messages_sms_error_desc_map_name: %s,\n  participants.participants_sub_id: %s,\n  participants.participants_display_destination: %s,\n  participants.participants_full_name: %s,\n  participants.participants_first_name: %s,\n  conversation_to_participants.conversation_to_participants_participant_id: %s,\n  one_on_one_participant.one_on_one_participant_full_name: %s,\n  one_on_one_participant.one_on_one_participant_first_name: %s,\n  profiles_table.profiles_table_display_name: %s,\n  parts.parts_content_type: %s,\n  reminders.reminders_trigger_time: %s,\n  conversation_pin.conversation_pin_pin_status: %s\n]\n", String.valueOf(this.U), String.valueOf(this.a), String.valueOf(this.b), String.valueOf(this.c), String.valueOf(this.d), String.valueOf(this.e), String.valueOf(this.f), String.valueOf(this.g), String.valueOf(this.h), String.valueOf(this.i), String.valueOf(this.j), String.valueOf(this.k), String.valueOf(this.V), String.valueOf(this.l), String.valueOf(this.m), String.valueOf(this.W), String.valueOf(this.n), String.valueOf(this.o), String.valueOf(this.p), String.valueOf(this.q), String.valueOf(this.r), String.valueOf(this.s), String.valueOf(this.t), String.valueOf(this.u), String.valueOf(this.v), String.valueOf(this.w), String.valueOf(this.x), String.valueOf(this.y), String.valueOf(this.z), String.valueOf(this.X), String.valueOf(this.A), String.valueOf(this.B), String.valueOf(this.C), String.valueOf(this.D), String.valueOf(this.E), String.valueOf(this.F), String.valueOf(this.G), String.valueOf(this.H), String.valueOf(this.I), String.valueOf(this.J), String.valueOf(this.K), String.valueOf(this.L), String.valueOf(this.M), String.valueOf(this.N), String.valueOf(this.Y), String.valueOf(this.O), String.valueOf(this.P), String.valueOf(this.Q), String.valueOf(this.R), String.valueOf(this.S), String.valueOf(this.T));
    }

    @Override // defpackage.dtro
    public final void b(ContentValues contentValues) {
        agkp.c().intValue();
    }

    @Override // defpackage.dtro
    protected final /* bridge */ /* synthetic */ void c(dtsu dtsuVar) {
        agki agkiVar = (agki) dtsuVar;
        aB();
        this.cL = agkiVar.cU();
        if (agkiVar.di(0)) {
            this.U = new ConversationIdType(agkiVar.getLong(agkiVar.cM(0, agkp.a)));
            fY(0);
        }
        if (agkiVar.di(1)) {
            this.a = agkiVar.getString(agkiVar.cM(1, agkp.a));
            fY(1);
        }
        if (agkiVar.di(2)) {
            this.b = cuxs.a(agkiVar.getString(agkiVar.cM(2, agkp.a)));
            fY(2);
        }
        if (agkiVar.di(3)) {
            this.c = cuxs.a(agkiVar.getString(agkiVar.cM(3, agkp.a)));
            fY(3);
        }
        if (agkiVar.di(4)) {
            String string = agkiVar.getString(agkiVar.cM(4, agkp.a));
            this.d = string == null ? null : Uri.parse(string);
            fY(4);
        }
        if (agkiVar.di(5)) {
            this.e = agkiVar.getString(agkiVar.cM(5, agkp.a));
            fY(5);
        }
        if (agkiVar.di(6)) {
            this.f = agkiVar.getInt(agkiVar.cM(6, agkp.a)) == 1;
            fY(6);
        }
        if (agkiVar.di(7)) {
            this.g = cuxs.a(agkiVar.getString(agkiVar.cM(7, agkp.a)));
            fY(7);
        }
        if (agkiVar.di(8)) {
            this.h = cuxs.a(agkiVar.getString(agkiVar.cM(8, agkp.a)));
            fY(8);
        }
        if (agkiVar.di(9)) {
            String string2 = agkiVar.getString(agkiVar.cM(9, agkp.a));
            this.i = string2 == null ? null : Uri.parse(string2);
            fY(9);
        }
        if (agkiVar.di(10)) {
            this.j = agkiVar.getString(agkiVar.cM(10, agkp.a));
            fY(10);
        }
        if (agkiVar.di(11)) {
            this.k = byyt.a(agkiVar.getInt(agkiVar.cM(11, agkp.a)));
            fY(11);
        }
        if (agkiVar.di(12)) {
            this.V = agkiVar.getLong(agkiVar.cM(12, agkp.a));
            fY(12);
        }
        if (agkiVar.di(13)) {
            this.l = agkiVar.getString(agkiVar.cM(13, agkp.a));
            fY(13);
        }
        if (agkiVar.di(14)) {
            this.m = agkiVar.getString(agkiVar.cM(14, agkp.a));
            fY(14);
        }
        if (agkiVar.di(15)) {
            this.W = agkiVar.getString(agkiVar.cM(15, agkp.a));
            fY(15);
        }
        if (agkiVar.di(16)) {
            this.n = agkiVar.getInt(agkiVar.cM(16, agkp.a));
            fY(16);
        }
        if (agkiVar.di(17)) {
            this.o = agkiVar.getInt(agkiVar.cM(17, agkp.a)) == 1;
            fY(17);
        }
        if (agkiVar.di(18)) {
            this.p = agkiVar.getInt(agkiVar.cM(18, agkp.a)) == 1;
            fY(18);
        }
        if (agkiVar.di(19)) {
            this.q = agkiVar.getInt(agkiVar.cM(19, agkp.a));
            fY(19);
        }
        if (agkiVar.di(20)) {
            this.r = agkiVar.getLong(agkiVar.cM(20, agkp.a));
            fY(20);
        }
        if (agkiVar.di(21)) {
            this.s = agkiVar.getInt(agkiVar.cM(21, agkp.a));
            fY(21);
        }
        if (agkiVar.di(22)) {
            this.t = agkiVar.getInt(agkiVar.cM(22, agkp.a));
            fY(22);
        }
        if (agkiVar.di(23)) {
            this.u = agkiVar.getInt(agkiVar.cM(23, agkp.a)) == 1;
            fY(23);
        }
        if (agkiVar.di(24)) {
            this.v = agkiVar.getInt(agkiVar.cM(24, agkp.a)) == 1;
            fY(24);
        }
        if (agkiVar.di(25)) {
            this.w = cuxs.a(agkiVar.getString(agkiVar.cM(25, agkp.a)));
            fY(25);
        }
        if (agkiVar.di(26)) {
            this.x = agkiVar.getInt(agkiVar.cM(26, agkp.a)) == 1;
            fY(26);
        }
        if (agkiVar.di(27)) {
            this.y = agkiVar.getInt(agkiVar.cM(27, agkp.a)) == 1;
            fY(27);
        }
        if (agkiVar.di(28)) {
            ckte[] values = ckte.values();
            int i = agkiVar.getInt(agkiVar.cM(28, agkp.a));
            if (i >= values.length) {
                throw new IllegalArgumentException();
            }
            this.z = values[i];
            fY(28);
        }
        if (agkiVar.di(29)) {
            this.X = agkiVar.getInt(agkiVar.cM(29, agkp.a));
            fY(29);
        }
        if (agkiVar.di(30)) {
            this.A = new MessageIdType(agkiVar.getLong(agkiVar.cM(30, agkp.a)));
            fY(30);
        }
        if (agkiVar.di(31)) {
            this.B = agkiVar.getLong(agkiVar.cM(31, agkp.a));
            fY(31);
        }
        if (agkiVar.di(32)) {
            this.C = agkiVar.getLong(agkiVar.cM(32, agkp.a));
            fY(32);
        }
        if (agkiVar.di(33)) {
            this.D = agkiVar.getInt(agkiVar.cM(33, agkp.a));
            fY(33);
        }
        if (agkiVar.di(34)) {
            this.E = agkiVar.getInt(agkiVar.cM(34, agkp.a));
            fY(34);
        }
        if (agkiVar.di(35)) {
            this.F = agkiVar.getInt(agkiVar.cM(35, agkp.a)) == 1;
            fY(35);
        }
        if (agkiVar.di(36)) {
            this.G = agkiVar.getInt(agkiVar.cM(36, agkp.a));
            fY(36);
        }
        if (agkiVar.di(37)) {
            this.H = agkiVar.getInt(agkiVar.cM(37, agkp.a));
            fY(37);
        }
        if (agkiVar.di(38)) {
            this.I = agkiVar.getInt(agkiVar.cM(38, agkp.a));
            fY(38);
        }
        if (agkiVar.di(39)) {
            this.J = agkiVar.getString(agkiVar.cM(39, agkp.a));
            fY(39);
        }
        if (agkiVar.di(40)) {
            this.K = agkiVar.getInt(agkiVar.cM(40, agkp.a));
            fY(40);
        }
        if (agkiVar.di(41)) {
            this.L = cuxd.a(agkiVar.getString(agkiVar.cM(41, agkp.a)));
            fY(41);
        }
        if (agkiVar.di(42)) {
            this.M = cuxs.a(agkiVar.getString(agkiVar.cM(42, agkp.a)));
            fY(42);
        }
        if (agkiVar.di(43)) {
            this.N = cuxs.a(agkiVar.getString(agkiVar.cM(43, agkp.a)));
            fY(43);
        }
        if (agkiVar.di(44)) {
            this.Y = agkiVar.getLong(agkiVar.cM(44, agkp.a));
            fY(44);
        }
        if (agkiVar.di(45)) {
            this.O = cuxs.a(agkiVar.getString(agkiVar.cM(45, agkp.a)));
            fY(45);
        }
        if (agkiVar.di(46)) {
            this.P = cuxs.a(agkiVar.getString(agkiVar.cM(46, agkp.a)));
            fY(46);
        }
        if (agkiVar.di(47)) {
            this.Q = agkiVar.getString(agkiVar.cM(47, agkp.a));
            fY(47);
        }
        if (agkiVar.di(48)) {
            this.R = agkiVar.getString(agkiVar.cM(48, agkp.a));
            fY(48);
        }
        if (agkiVar.di(49)) {
            this.S = agkiVar.getLong(agkiVar.cM(49, agkp.a));
            fY(49);
        }
        if (agkiVar.di(50)) {
            this.T = agkiVar.getInt(agkiVar.cM(50, agkp.a)) == 1;
            fY(50);
        }
    }

    public final long d() {
        az(12, "sort_timestamp");
        return this.V;
    }

    public final ConversationIdType e() {
        az(0, "_id");
        return this.U;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof afke)) {
            return false;
        }
        afke afkeVar = (afke) obj;
        return super.aD(afkeVar.cL) && Objects.equals(this.U, afkeVar.U) && Objects.equals(this.a, afkeVar.a) && Objects.equals(this.b, afkeVar.b) && Objects.equals(this.c, afkeVar.c) && Objects.equals(this.d, afkeVar.d) && Objects.equals(this.e, afkeVar.e) && this.f == afkeVar.f && Objects.equals(this.g, afkeVar.g) && Objects.equals(this.h, afkeVar.h) && Objects.equals(this.i, afkeVar.i) && Objects.equals(this.j, afkeVar.j) && this.k == afkeVar.k && this.V == afkeVar.V && Objects.equals(this.l, afkeVar.l) && Objects.equals(this.m, afkeVar.m) && Objects.equals(this.W, afkeVar.W) && this.n == afkeVar.n && this.o == afkeVar.o && this.p == afkeVar.p && this.q == afkeVar.q && this.r == afkeVar.r && this.s == afkeVar.s && this.t == afkeVar.t && this.u == afkeVar.u && this.v == afkeVar.v && Objects.equals(this.w, afkeVar.w) && this.x == afkeVar.x && this.y == afkeVar.y && this.z == afkeVar.z && this.X == afkeVar.X && Objects.equals(this.A, afkeVar.A) && this.B == afkeVar.B && this.C == afkeVar.C && this.D == afkeVar.D && this.E == afkeVar.E && this.F == afkeVar.F && this.G == afkeVar.G && this.H == afkeVar.H && this.I == afkeVar.I && Objects.equals(this.J, afkeVar.J) && this.K == afkeVar.K && Objects.equals(this.L, afkeVar.L) && Objects.equals(this.M, afkeVar.M) && Objects.equals(this.N, afkeVar.N) && this.Y == afkeVar.Y && Objects.equals(this.O, afkeVar.O) && Objects.equals(this.P, afkeVar.P) && Objects.equals(this.Q, afkeVar.Q) && Objects.equals(this.R, afkeVar.R) && this.S == afkeVar.S && this.T == afkeVar.T;
    }

    public final String f() {
        az(15, "participant_normalized_destination");
        return this.W;
    }

    public final int hashCode() {
        dtsq dtsqVar = this.cL;
        dtsq dtsqVar2 = (dtsqVar == null || dtsqVar.b()) ? null : this.cL;
        ConversationIdType conversationIdType = this.U;
        String str = this.a;
        String str2 = this.b;
        String str3 = this.c;
        Uri uri = this.d;
        String str4 = this.e;
        Boolean valueOf = Boolean.valueOf(this.f);
        String str5 = this.g;
        String str6 = this.h;
        Uri uri2 = this.i;
        String str7 = this.j;
        byyt byytVar = this.k;
        Long valueOf2 = Long.valueOf(this.V);
        String str8 = this.l;
        String str9 = this.m;
        dtsq dtsqVar3 = dtsqVar2;
        String str10 = this.W;
        Integer valueOf3 = Integer.valueOf(this.n);
        Boolean valueOf4 = Boolean.valueOf(this.o);
        Boolean valueOf5 = Boolean.valueOf(this.p);
        Integer valueOf6 = Integer.valueOf(this.q);
        Long valueOf7 = Long.valueOf(this.r);
        Integer valueOf8 = Integer.valueOf(this.s);
        Integer valueOf9 = Integer.valueOf(this.t);
        Boolean valueOf10 = Boolean.valueOf(this.u);
        Boolean valueOf11 = Boolean.valueOf(this.v);
        String str11 = this.w;
        Boolean valueOf12 = Boolean.valueOf(this.x);
        Boolean valueOf13 = Boolean.valueOf(this.y);
        ckte ckteVar = this.z;
        return Objects.hash(dtsqVar3, conversationIdType, str, str2, str3, uri, str4, valueOf, str5, str6, uri2, str7, byytVar, valueOf2, str8, str9, str10, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, valueOf11, str11, valueOf12, valueOf13, Integer.valueOf(ckteVar == null ? 0 : ckteVar.ordinal()), Integer.valueOf(this.X), this.A, Long.valueOf(this.B), Long.valueOf(this.C), Integer.valueOf(this.D), Integer.valueOf(this.E), Boolean.valueOf(this.F), Integer.valueOf(this.G), Integer.valueOf(this.H), Integer.valueOf(this.I), this.J, Integer.valueOf(this.K), this.L, this.M, this.N, Long.valueOf(this.Y), this.O, this.P, this.Q, this.R, Long.valueOf(this.S), Boolean.valueOf(this.T), null);
    }

    public final String toString() {
        return ((dtro.a) ekhw.a(dtub.b, dtro.a.class)).iB().a() ? String.format(Locale.US, "%s", "HomeScreenQuery -- REDACTED") : a();
    }
}
