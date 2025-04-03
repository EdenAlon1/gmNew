package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bsel extends dtrr {
    public String A;
    public azsu B;
    public azcr C;
    public int D;
    public boolean E;
    public String F;
    public boolean G;
    public boolean H;
    public String I;
    public String J;
    public String K;
    public int L;
    public long M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public boolean R;
    public long S;
    public String T;
    public String U;
    public boolean V;
    public int W;
    public long X;
    public long Y;
    public String Z;
    public ConversationIdType a;
    public String aa;
    public String ab;
    public byte[] ac;
    public long ad;
    public long ae;
    public boolean af;
    public cknh ag;
    public boolean ah;
    public ConversationIdType ai;
    public ConversationIdType aj;
    public ayhd ak;
    public csgg al;
    public String am;
    public Optional an;
    public Optional ao;
    public boolean ap;
    public boolean aq;
    public ckkz ar;
    public ckte as;
    public int at;
    public cfmh au;
    public cfmf av;
    public String aw;
    public Uri ax;
    public int ay;
    public cpxu b;
    public String c;
    public byyy d;
    public String e;
    public MessageIdType f;
    public String g;
    public String h;
    public Uri i;
    public String j;
    public boolean k;
    public String l;
    public String m;
    public Uri n;
    public String o;
    public int p;
    public byyt q;
    public long r;
    public long s;
    public String t;
    public long u;
    public long v;
    public String w;
    public String x;
    public String y;
    public String z;

    public bsel() {
        super(bsom.o());
        this.a = bdgq.a;
        this.b = new cpxu();
        this.d = byyy.NAME_IS_AUTOMATIC;
        this.f = bdhb.a;
        this.k = false;
        this.p = 0;
        this.q = byyt.UNARCHIVED;
        this.r = 0L;
        this.s = 0L;
        this.u = -1L;
        this.v = -1L;
        this.B = null;
        this.C = null;
        this.D = 0;
        this.E = true;
        this.G = true;
        this.H = false;
        this.L = 0;
        this.M = -1L;
        this.N = 0;
        this.O = 0;
        this.P = 0;
        this.Q = false;
        this.R = false;
        this.S = 0L;
        this.V = false;
        this.W = 0;
        this.X = 0L;
        this.Y = 0L;
        this.ad = 0L;
        this.ae = -1L;
        this.af = true;
        this.ag = new cknh(0L);
        this.ah = false;
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

    public final void A(String str) {
        aE(19);
        this.t = str;
    }

    public final void B(ConversationIdType conversationIdType) {
        aE(0);
        this.a = conversationIdType;
    }

    public final void C(boolean z) {
        aE(33);
        this.H = z;
    }

    public final void D(boolean z) {
        int i = this.aB;
        if (i < 10018) {
            dtub.w("IS_ENTERPRISE", i);
        }
        aE(42);
        this.Q = z;
    }

    public final void E(int i) {
        int i2 = this.aB;
        if (i2 < 10006) {
            dtub.w("join_state", i2);
        }
        aE(39);
        this.N = i;
    }

    public final void F(long j) {
        int i = this.aB;
        if (i < 15000) {
            dtub.w("last_interactive_event_timestamp", i);
        }
        aE(44);
        this.S = j;
    }

    public final void G(long j) {
        int i = this.aB;
        if (i < 28010) {
            dtub.w("last_logged_scooby_metadata_timestamp", i);
        }
        aE(49);
        this.X = j;
    }

    public final void H(long j) {
        aE(18);
        this.s = j;
    }

    public final void I(MessageIdType messageIdType) {
        aE(5);
        this.f = messageIdType;
    }

    public final void J(boolean z) {
        int i = this.aB;
        if (i < 59220) {
            dtub.w("marked_as_unread", i);
        }
        aE(68);
        this.aq = z;
    }

    public final void K(int i) {
        int i2 = this.aB;
        if (i2 < 60050) {
            dtub.w("mms_group_upgrade_retries", i2);
        }
        aE(71);
        this.at = i;
    }

    public final void L(ckte ckteVar) {
        int i = this.aB;
        if (i < 60050) {
            dtub.w("mms_group_upgrade_status", i);
        }
        aE(70);
        this.as = ckteVar;
    }

    public final void M(String str) {
        aE(2);
        if (!this.aC) {
            str = cuxf.a(str);
        }
        this.c = str;
    }

    public final void N(byyy byyyVar) {
        int i = this.aB;
        if (i < 10012) {
            dtub.w("name_is_automatic", i);
        }
        aE(3);
        this.d = byyyVar;
    }

    public final void O(long j) {
        int i = this.aB;
        if (i < 58090) {
            dtub.w("normalized_participant_contact_id", i);
        }
        aE(21);
        this.v = j;
    }

    public final void P(String str) {
        int i = this.aB;
        if (i < 58090) {
            dtub.w("normalized_participant_display_destination", i);
        }
        aE(46);
        if (!this.aC) {
            str = cuxs.a(str);
        }
        this.U = str;
    }

    public final void Q(String str) {
        int i = this.aB;
        if (i < 58090) {
            dtub.w("normalized_participant_id_list", i);
        }
        aE(36);
        this.K = str;
    }

    public final void R(String str) {
        int i = this.aB;
        if (i < 58090) {
            dtub.w("normalized_participant_lookup_key", i);
        }
        aE(23);
        this.x = str;
    }

    public final void S(boolean z) {
        aE(30);
        this.E = z;
    }

    public final void T(String str) {
        aE(31);
        this.F = str;
    }

    public final void U(boolean z) {
        aE(32);
        this.G = z;
    }

    public final void V(int i) {
        int i2 = this.aB;
        if (i2 < 26020) {
            dtub.w("open_count", i2);
        }
        aE(48);
        this.W = i;
    }

    public final void W(String str) {
        int i = this.aB;
        if (i < 58090) {
            dtub.w("participant_comparable_destination", i);
        }
        aE(25);
        this.z = str;
    }

    public final void X(long j) {
        aE(20);
        this.u = j;
    }

    public final void Y(int i) {
        aE(29);
        this.D = i;
    }

    public final void Z(String str) {
        int i = this.aB;
        if (i < 15010) {
            dtub.w("participant_display_destination", i);
        }
        aE(45);
        if (!this.aC) {
            str = cuxs.a(str);
        }
        this.T = str;
    }

    public final bseh a() {
        return b(new Supplier() { // from class: bsej
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bsei();
            }
        });
    }

    public final void aA(int i) {
        int i2 = this.aB;
        if (i2 < 60740) {
            dtub.w("unread_count", i2);
        }
        aE(76);
        this.ay = i;
    }

    public final void aa(String str) {
        int i = this.aB;
        if (i < 8500) {
            dtub.w("participant_id_list", i);
        }
        aE(35);
        this.J = str;
    }

    public final void ab(String str) {
        aE(22);
        this.w = str;
    }

    public final void ac(String str) {
        aE(24);
        this.y = str;
    }

    public final void ad(String str) {
        aE(9);
        this.j = str;
    }

    public final void ae(Uri uri) {
        aE(8);
        this.i = uri;
    }

    public final void af(String str) {
        int i = this.aB;
        if (i < 40050) {
            dtub.w("rcs_conference_uri", i);
        }
        aE(53);
        if (!this.aC) {
            str = cuxc.a(str);
        }
        this.ab = str;
    }

    public final void ag(cknh cknhVar) {
        int i = this.aB;
        if (i < 49020) {
            dtub.w("rcs_group_capabilities", i);
        }
        aE(58);
        this.ag = cknhVar;
    }

    public final void ah(Uri uri) {
        int i = this.aB;
        if (i < 60590) {
            dtub.w("rcs_group_icon_url", i);
        }
        aE(75);
        this.ax = uri;
    }

    public final void ai(String str) {
        int i = this.aB;
        if (i < 40050) {
            dtub.w("rcs_group_id", i);
        }
        aE(52);
        this.aa = str;
    }

    public final void aj(Optional optional) {
        int i = this.aB;
        if (i < 58910) {
            dtub.w("rcs_group_last_sync_timestamp", i);
        }
        aE(66);
        this.ao = optional;
    }

    public final void ak(String str) {
        int i = this.aB;
        if (i < 58540) {
            dtub.w("rcs_group_self_msisdn", i);
        }
        aE(64);
        this.am = str;
    }

    public final void al(boolean z) {
        int i = this.aB;
        if (i < 48040) {
            dtub.w("rcs_session_allows_revocation", i);
        }
        aE(57);
        this.af = z;
    }

    public final void am(long j) {
        int i = this.aB;
        if (i < 10000) {
            dtub.w("rcs_session_id", i);
        }
        aE(38);
        this.M = j;
    }

    public final void an(long j) {
        int i = this.aB;
        if (i < 46050) {
            dtub.w("rcs_subject_change_timestamp_ms", i);
        }
        aE(56);
        this.ae = j;
    }

    public final void ao(Optional optional) {
        int i = this.aB;
        if (i < 58750) {
            dtub.w("recipient_offline_timestamp_ms", i);
        }
        aE(65);
        this.an = optional;
    }

    public final void ap(int i) {
        int i2 = this.aB;
        if (i2 < 10016) {
            dtub.w("send_mode", i2);
        }
        aE(41);
        this.P = i;
    }

    public final void aq(boolean z) {
        aE(10);
        this.k = z;
    }

    public final void ar(String str) {
        aE(34);
        this.I = str;
    }

    public final void as(cpxu cpxuVar) {
        aE(1);
        this.b = cpxuVar;
    }

    public final void at(String str) {
        aE(6);
        if (!this.aC) {
            str = cuxs.a(str);
        }
        this.g = str;
    }

    public final void au(long j) {
        aE(17);
        this.r = j;
    }

    public final void av(int i) {
        int i2 = this.aB;
        if (i2 < 8500) {
            dtub.w("source_type", i2);
        }
        aE(37);
        this.L = i;
    }

    public final void aw(boolean z) {
        int i = this.aB;
        if (i < 23000) {
            dtub.w("spam_warning_dismiss_status", i);
        }
        aE(47);
        this.V = z;
    }

    public final void ax(String str) {
        aE(7);
        if (!this.aC) {
            str = cuxs.a(str);
        }
        this.h = str;
    }

    public final void ay(String str) {
        int i = this.aB;
        if (i < 59760) {
            dtub.w("subtitle", i);
        }
        aE(4);
        this.e = str;
    }

    public final void az(byte[] bArr) {
        int i = this.aB;
        if (i < 58120) {
            dtub.w("tachygram_group_routing_info_token", i);
        }
        aE(54);
        this.ac = bArr;
    }

    public final bseh b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        bseh bsehVar = (bseh) obj;
        bsehVar.aC(aB());
        bsehVar.a = this.a;
        bsehVar.b = this.b;
        bsehVar.c = this.c;
        bsehVar.d = this.d;
        bsehVar.e = this.e;
        bsehVar.f = this.f;
        bsehVar.g = this.g;
        bsehVar.h = this.h;
        bsehVar.i = this.i;
        bsehVar.j = this.j;
        bsehVar.k = this.k;
        bsehVar.l = this.l;
        bsehVar.m = this.m;
        bsehVar.n = this.n;
        bsehVar.o = this.o;
        bsehVar.p = this.p;
        bsehVar.q = this.q;
        bsehVar.r = this.r;
        bsehVar.s = this.s;
        bsehVar.t = this.t;
        bsehVar.u = this.u;
        bsehVar.v = this.v;
        bsehVar.w = this.w;
        bsehVar.x = this.x;
        bsehVar.y = this.y;
        bsehVar.z = this.z;
        bsehVar.A = this.A;
        bsehVar.B = this.B;
        bsehVar.C = this.C;
        bsehVar.D = this.D;
        bsehVar.E = this.E;
        bsehVar.F = this.F;
        bsehVar.G = this.G;
        bsehVar.H = this.H;
        bsehVar.I = this.I;
        bsehVar.J = this.J;
        bsehVar.K = this.K;
        bsehVar.L = this.L;
        bsehVar.M = this.M;
        bsehVar.N = this.N;
        bsehVar.O = this.O;
        bsehVar.P = this.P;
        bsehVar.Q = this.Q;
        bsehVar.R = this.R;
        bsehVar.S = this.S;
        bsehVar.T = this.T;
        bsehVar.U = this.U;
        bsehVar.V = this.V;
        bsehVar.W = this.W;
        bsehVar.X = this.X;
        bsehVar.Y = this.Y;
        bsehVar.Z = this.Z;
        bsehVar.aa = this.aa;
        bsehVar.ab = this.ab;
        bsehVar.ac = this.ac;
        bsehVar.ad = this.ad;
        bsehVar.ae = this.ae;
        bsehVar.af = this.af;
        bsehVar.ag = this.ag;
        bsehVar.ah = this.ah;
        bsehVar.ai = this.ai;
        bsehVar.aj = this.aj;
        bsehVar.ak = this.ak;
        bsehVar.al = this.al;
        bsehVar.am = this.am;
        bsehVar.an = this.an;
        bsehVar.ao = this.ao;
        bsehVar.ap = this.ap;
        bsehVar.aq = this.aq;
        bsehVar.ar = this.ar;
        bsehVar.as = this.as;
        bsehVar.at = this.at;
        bsehVar.au = this.au;
        bsehVar.av = this.av;
        bsehVar.aw = this.aw;
        bsehVar.ax = this.ax;
        bsehVar.ay = this.ay;
        bsehVar.cK = aC();
        return bsehVar;
    }

    public final void c(byyt byytVar) {
        aE(16);
        this.q = byytVar;
    }

    public final void d(boolean z) {
        int i = this.aB;
        if (i < 49060) {
            dtub.w("awaiting_reverse_sync", i);
        }
        aE(59);
        this.ah = z;
    }

    public final void e(String str) {
        int i = this.aB;
        if (i < 60250) {
            dtub.w("cms_correlation_id", i);
        }
        aE(74);
        this.aw = str;
    }

    public final void f(String str) {
        int i = this.aB;
        if (i < 32000) {
            dtub.w("cms_id", i);
        }
        aE(51);
        this.Z = str;
    }

    public final void g(csgg csggVar) {
        int i = this.aB;
        if (i < 58210) {
            dtub.w("cms_life_cycle", i);
        }
        aE(63);
        this.al = csggVar;
    }

    public final void h(long j) {
        int i = this.aB;
        if (i < 53030) {
            dtub.w("cms_most_recent_read_message_timestamp_ms", i);
        }
        aE(55);
        this.ad = j;
    }

    public final void i(int i) {
        int i2 = this.aB;
        if (i2 < 10007) {
            dtub.w("conv_type", i2);
        }
        aE(40);
        this.O = i;
    }

    public final void j(azsu azsuVar) {
        int i = this.aB;
        if (i < 60160) {
            dtub.w("current_my_identity_foreign_key", i);
        }
        aE(27);
        this.B = azsuVar;
    }

    public final void k(String str) {
        aE(26);
        this.A = str;
    }

    public final void l(ckkz ckkzVar) {
        int i = this.aB;
        if (i < 59820) {
            dtub.w("custom_theme", i);
        }
        aE(69);
        this.ar = ckkzVar;
    }

    public final void m(long j) {
        int i = this.aB;
        if (i < 29020) {
            dtub.w("delete_timestamp", i);
        }
        aE(50);
        this.Y = j;
    }

    public final void n(ConversationIdType conversationIdType) {
        int i = this.aB;
        if (i < 58090) {
            dtub.w("duplicate_of", i);
        }
        aE(60);
        this.ai = conversationIdType;
    }

    public final void o(azcr azcrVar) {
        int i = this.aB;
        if (i < 60360) {
            dtub.w("destination_token", i);
        }
        aE(28);
        this.C = azcrVar;
    }

    public final void p(int i) {
        int i2 = this.aB;
        if (i2 < 29060) {
            dtub.w("etouffee_default", i2);
        }
        aE(15);
        this.p = i;
    }

    public final void q(String str) {
        aE(14);
        this.o = str;
    }

    public final void r(Uri uri) {
        aE(13);
        this.n = uri;
    }

    public final void s(String str) {
        aE(11);
        if (!this.aC) {
            str = cuxs.a(str);
        }
        this.l = str;
    }

    public final void t(String str) {
        aE(12);
        if (!this.aC) {
            str = cuxs.a(str);
        }
        this.m = str;
    }

    public final void u(ConversationIdType conversationIdType) {
        int i = this.aB;
        if (i < 59130) {
            dtub.w("new_duplicate_of", i);
        }
        aE(61);
        this.aj = conversationIdType;
    }

    public final void v(cfmf cfmfVar) {
        int i = this.aB;
        if (i < 60210) {
            dtub.w("encryption_id", i);
        }
        aE(73);
        this.av = cfmfVar;
    }

    public final void w(cfmh cfmhVar) {
        int i = this.aB;
        if (i < 60180) {
            dtub.w("encryption_protocol", i);
        }
        aE(72);
        this.au = cfmhVar;
    }

    public final void x(ayhd ayhdVar) {
        int i = this.aB;
        if (i < 58140) {
            dtub.w("error_state", i);
        }
        aE(62);
        this.ak = ayhdVar;
    }

    public final void y(boolean z) {
        int i = this.aB;
        if (i < 59210) {
            dtub.w("has_been_e2ee", i);
        }
        aE(67);
        this.ap = z;
    }

    public final void z(boolean z) {
        int i = this.aB;
        if (i < 12001) {
            dtub.w("has_ea2p_bot_recipient", i);
        }
        aE(43);
        this.R = z;
    }
}
