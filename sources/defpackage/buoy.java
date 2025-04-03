package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.time.Instant;
import j$.util.Optional;
import java.util.BitSet;
import java.util.UUID;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class buoy extends dtrr {
    public long A;
    public String B;
    public bdhg C;
    public int D;
    public byzi E;
    public int F;
    public boolean G;
    public String H;
    public long I;
    public int J;
    public String K;
    public String L;
    public String M;
    public long N;
    public String O;
    public long P;
    public long Q;
    public bdhg R;
    public String S;
    public byte[] T;
    public long U;
    public fayv V;
    public String W;
    public String X;
    public MessageIdType Y;
    public boolean Z;
    public MessageIdType a;
    public Uri aa;
    public Optional ab;
    public int ac;
    public csgg ad;
    public cjco ae;
    public byyw af;
    public int ag;
    public boolean ah;
    public fjay ai;
    public byzg aj;
    public byzg ak;
    public byzl al;
    public int am;
    public bdgr an;
    public cfmh ao;
    public Optional ap;
    public ConversationIdType b;
    public String c;
    public String d;
    public String e;
    public String f;
    public long g;
    public Instant h;
    public long i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public Uri o;
    public int p;
    public long q;
    public String r;
    public String s;
    public String t;
    public long u;
    public long v;
    public String w;
    public int x;
    public String y;
    public azsu z;

    public buoy() {
        super(MessagesTable.k());
        this.a = bdhb.a;
        this.b = bdgq.a;
        this.g = 0L;
        this.h = bdgw.b(0L);
        this.i = 0L;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.m = false;
        this.n = false;
        this.p = 0;
        this.q = 0L;
        this.u = 0L;
        this.v = 0L;
        this.x = 0;
        this.z = null;
        this.A = 0L;
        this.C = bdhg.a;
        this.D = 0;
        this.E = byzi.VERIFICATION_NA;
        this.F = 0;
        this.G = false;
        this.I = -1L;
        this.J = -1;
        this.O = "";
        this.P = 0L;
        this.Q = 1L;
        this.R = bdhg.a;
        this.U = 0L;
        this.Y = bdhb.a;
        this.Z = false;
        this.ab = bdhj.a;
        this.ac = -2;
        this.ad = csgg.UNKNOWN;
        this.ae = cjco.c;
        this.af = byyw.UNKNOWN;
        this.ag = 0;
        this.ah = false;
        byzg byzgVar = byzg.UNKNOWN;
        this.aj = byzgVar;
        this.ak = byzgVar;
        this.al = byzl.UNKNOWN;
        this.am = -1;
        this.an = bdgr.a;
        this.ao = new cfmh(0L);
        this.ap = bdhf.a();
    }

    public final void A(long j) {
        aE(20);
        this.u = j;
    }

    public final void B(String str) {
        int i = this.aB;
        if (i < 9030) {
            dtub.w("mms_retrieve_text", i);
        }
        aE(22);
        this.w = str;
    }

    public final void C(String str) {
        aE(17);
        if (!this.aC) {
            str = cuxs.a(str);
        }
        this.r = str;
    }

    public final void D(String str) {
        aE(18);
        this.s = str;
    }

    public final void E(String str) {
        int i = this.aB;
        if (i < 59340) {
            dtub.w("msisdn_receiving_rcs_message", i);
        }
        aE(4);
        this.e = str;
    }

    public final void F(cjco cjcoVar) {
        int i = this.aB;
        if (i < 60750) {
            dtub.w("mute_priority", i);
        }
        aE(56);
        this.ae = cjcoVar;
    }

    public final void G(azsu azsuVar) {
        int i = this.aB;
        if (i < 60160) {
            dtub.w("my_identity_foreign_key", i);
        }
        aE(25);
        this.z = azsuVar;
    }

    public final void H(boolean z) {
        aE(12);
        this.m = z;
    }

    public final void I(Uri uri) {
        int i = this.aB;
        if (i < 49060) {
            dtub.w("old_sms_message_uri", i);
        }
        aE(52);
        this.aa = uri;
    }

    public final void J(MessageIdType messageIdType) {
        int i = this.aB;
        if (i < 48030) {
            dtub.w("original_message_id", i);
        }
        aE(50);
        this.Y = messageIdType;
    }

    public final void K(int i) {
        int i2 = this.aB;
        if (i2 < 59430) {
            dtub.w("message_original_protocol", i2);
        }
        aE(64);
        this.am = i;
    }

    public final void L(bdhg bdhgVar) {
        int i = this.aB;
        if (i < 35030) {
            dtub.w("original_rcs_message_id", i);
        }
        aE(43);
        this.R = bdhgVar;
    }

    public final void M(byzg byzgVar) {
        int i = this.aB;
        if (i < 58720) {
            dtub.w("outgoing_delivery_report_status", i);
        }
        aE(61);
        this.aj = byzgVar;
    }

    public final void N(byzg byzgVar) {
        int i = this.aB;
        if (i < 58720) {
            dtub.w("outgoing_read_report_status", i);
        }
        aE(62);
        this.ak = byzgVar;
    }

    public final void O(int i) {
        aE(9);
        this.j = i;
    }

    public final void P(Instant instant) {
        int i = this.aB;
        if (i < 17030) {
            dtub.w("queue_insert_timestamp", i);
        }
        aE(7);
        this.h = instant;
    }

    public final void Q(int i) {
        aE(23);
        this.x = i;
    }

    public final void R(int i) {
        int i2 = this.aB;
        if (i2 < 29060) {
            dtub.w("etouffee_status", i2);
        }
        aE(29);
        this.D = i;
    }

    public final void S(long j) {
        int i = this.aB;
        if (i < 59890) {
            dtub.w("rcs_expiry", i);
        }
        aE(21);
        this.v = j;
    }

    public final void T(long j) {
        int i = this.aB;
        if (i < 10004) {
            dtub.w("rcs_file_transfer_session_id", i);
        }
        aE(34);
        this.I = j;
    }

    public final void U(bdhg bdhgVar) {
        int i = this.aB;
        if (i < 41040) {
            dtub.w("rcs_message_id_with_text_type", i);
        }
        aE(28);
        this.C = bdhgVar;
    }

    public final void V(String str) {
        int i = this.aB;
        if (i < 10002) {
            dtub.w("rcs_remote_instance", i);
        }
        aE(33);
        this.H = str;
    }

    public final void W(int i) {
        int i2 = this.aB;
        if (i2 < 39000) {
            dtub.w("rcs_ui_status", i2);
        }
        aE(31);
        this.F = i;
    }

    public final void X(boolean z) {
        aE(13);
        this.n = z;
    }

    public final void Y(long j) {
        aE(8);
        this.i = j;
    }

    public final void Z(String str) {
        int i = this.aB;
        if (i < 54040) {
            dtub.w("receiving_network_country", i);
        }
        aE(5);
        this.f = str;
    }

    public final MessagesTable.BindData a() {
        return b(new Supplier() { // from class: buow
            @Override // java.util.function.Supplier
            public final Object get() {
                return new buov();
            }
        });
    }

    public final void aa(long j) {
        int i = this.aB;
        if (i < 37030) {
            dtub.w("report_attempt_acounter", i);
        }
        aE(46);
        this.U = j;
    }

    public final void ab(int i) {
        int i2 = this.aB;
        if (i2 < 58040) {
            dtub.w("result_code", i2);
        }
        aE(54);
        this.ac = i;
    }

    public final void ac(long j) {
        aE(26);
        this.A = j;
    }

    public final void ad(bdgr bdgrVar) {
        int i = this.aB;
        if (i < 59490) {
            dtub.w("satellite_datagram_id", i);
        }
        aE(65);
        this.an = bdgrVar;
    }

    public final void ae(String str) {
        aE(24);
        this.y = str;
    }

    public final void af(long j) {
        int i = this.aB;
        if (i < 35030) {
            dtub.w("send_counter", i);
        }
        aE(42);
        this.Q = j;
    }

    public final void ag(String str) {
        aE(2);
        this.c = str;
    }

    public final void ah(String str) {
        int i = this.aB;
        if (i < 54040) {
            dtub.w("sender_send_destination", i);
        }
        aE(3);
        this.d = str;
    }

    public final void ai(long j) {
        aE(6);
        this.g = j;
    }

    public final void aj(int i) {
        int i2 = this.aB;
        if (i2 < 9000) {
            dtub.w("sms_error_code", i2);
        }
        aE(35);
        this.J = i;
    }

    public final void ak(String str) {
        int i = this.aB;
        if (i < 9000) {
            dtub.w("sms_error_desc_map_name", i);
        }
        aE(36);
        this.K = str;
    }

    public final void al(long j) {
        aE(16);
        this.q = j;
    }

    public final void am(Uri uri) {
        aE(14);
        this.o = uri;
    }

    public final void an(int i) {
        aE(15);
        this.p = i;
    }

    public final void ao(int i) {
        aE(10);
        this.k = i;
    }

    public final void ap(fjay fjayVar) {
        int i = this.aB;
        if (i < 58680) {
            dtub.w("trace_id", i);
        }
        aE(60);
        this.ai = fjayVar;
    }

    public final void aq(long j) {
        int i = this.aB;
        if (i < 29100) {
            dtub.w("usage_stats_logging_id", i);
        }
        aE(41);
        this.P = j;
    }

    public final void ar(byzi byziVar) {
        int i = this.aB;
        if (i < 29090) {
            dtub.w(BusinessInfoDatabaseConstants.BusinessInfoTableConstants.Columns.VERIFICATION_STATUS, i);
        }
        aE(30);
        this.E = byziVar;
    }

    public final void as(String str) {
        int i = this.aB;
        if (i < 19020) {
            dtub.w("web_id", i);
        }
        aE(40);
        this.O = str;
    }

    public final void at(byzl byzlVar) {
        int i = this.aB;
        if (i < 59310) {
            dtub.w("xms_transport", i);
        }
        aE(63);
        this.al = byzlVar;
    }

    public final MessagesTable.BindData b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        MessagesTable.BindData bindData = (MessagesTable.BindData) obj;
        bindData.aC(aB());
        bindData.a = this.a;
        bindData.b = this.b;
        bindData.c = this.c;
        bindData.d = this.d;
        bindData.e = this.e;
        bindData.f = this.f;
        bindData.g = this.g;
        bindData.h = this.h;
        bindData.i = this.i;
        bindData.j = this.j;
        bindData.k = this.k;
        bindData.l = this.l;
        bindData.m = this.m;
        bindData.n = this.n;
        bindData.o = this.o;
        bindData.p = this.p;
        bindData.q = this.q;
        bindData.r = this.r;
        bindData.s = this.s;
        bindData.t = this.t;
        bindData.u = this.u;
        bindData.v = this.v;
        bindData.w = this.w;
        bindData.x = this.x;
        bindData.y = this.y;
        bindData.z = this.z;
        bindData.A = this.A;
        bindData.B = this.B;
        bindData.C = this.C;
        bindData.D = this.D;
        bindData.E = this.E;
        bindData.F = this.F;
        bindData.G = this.G;
        bindData.H = this.H;
        bindData.I = this.I;
        bindData.J = this.J;
        bindData.K = this.K;
        bindData.L = this.L;
        bindData.M = this.M;
        bindData.N = this.N;
        bindData.O = this.O;
        bindData.P = this.P;
        bindData.Q = this.Q;
        bindData.R = this.R;
        bindData.S = this.S;
        bindData.T = this.T;
        bindData.U = this.U;
        bindData.V = this.V;
        bindData.W = this.W;
        bindData.X = this.X;
        bindData.Y = this.Y;
        bindData.Z = this.Z;
        bindData.aa = this.aa;
        bindData.ab = this.ab;
        bindData.ac = this.ac;
        bindData.ad = this.ad;
        bindData.ae = this.ae;
        bindData.af = this.af;
        bindData.ag = this.ag;
        bindData.ah = this.ah;
        bindData.ai = this.ai;
        bindData.aj = this.aj;
        bindData.ak = this.ak;
        bindData.al = this.al;
        bindData.am = this.am;
        bindData.an = this.an;
        bindData.ao = this.ao;
        bindData.ap = this.ap;
        bindData.cK = aC();
        return bindData;
    }

    public final MessagesTable.BindData c() {
        MessagesTable.BindData b = b(new Supplier() { // from class: buox
            @Override // java.util.function.Supplier
            public final Object get() {
                return new buov();
            }
        });
        b.E();
        return b;
    }

    public final void d(MessagesTable.BindData bindData, boolean z, BitSet bitSet) {
        this.az = bitSet == null ? null : (BitSet) bitSet.clone();
        if (z) {
            BitSet bitSet2 = this.az;
            if (bitSet2 != null) {
                bitSet2.clear(0);
            }
        } else {
            BitSet bitSet3 = this.az;
            if (bitSet3 == null || bitSet3.get(0)) {
                this.a = bindData.D();
            }
        }
        BitSet bitSet4 = this.az;
        if (bitSet4 == null || bitSet4.get(1)) {
            this.b = bindData.C();
        }
        BitSet bitSet5 = this.az;
        if (bitSet5 == null || bitSet5.get(2)) {
            this.c = bindData.X();
        }
        BitSet bitSet6 = this.az;
        if (bitSet6 == null || bitSet6.get(3)) {
            bindData.az(3, "sender_send_destination");
            this.d = bindData.d;
        }
        BitSet bitSet7 = this.az;
        if (bitSet7 == null || bitSet7.get(4)) {
            bindData.az(4, "msisdn_receiving_rcs_message");
            this.e = bindData.e;
        }
        BitSet bitSet8 = this.az;
        if (bitSet8 == null || bitSet8.get(5)) {
            bindData.az(5, "receiving_network_country");
            this.f = bindData.f;
        }
        BitSet bitSet9 = this.az;
        if (bitSet9 == null || bitSet9.get(6)) {
            this.g = bindData.y();
        }
        BitSet bitSet10 = this.az;
        if (bitSet10 == null || bitSet10.get(7)) {
            bindData.az(7, "queue_insert_timestamp");
            this.h = bindData.h;
        }
        BitSet bitSet11 = this.az;
        if (bitSet11 == null || bitSet11.get(8)) {
            this.i = bindData.w();
        }
        BitSet bitSet12 = this.az;
        if (bitSet12 == null || bitSet12.get(9)) {
            this.j = bindData.l();
        }
        BitSet bitSet13 = this.az;
        if (bitSet13 == null || bitSet13.get(10)) {
            this.k = bindData.s();
        }
        BitSet bitSet14 = this.az;
        if (bitSet14 == null || bitSet14.get(11)) {
            this.l = bindData.k();
        }
        BitSet bitSet15 = this.az;
        if (bitSet15 == null || bitSet15.get(12)) {
            this.m = bindData.ae();
        }
        BitSet bitSet16 = this.az;
        if (bitSet16 == null || bitSet16.get(13)) {
            this.n = bindData.af();
        }
        BitSet bitSet17 = this.az;
        if (bitSet17 == null || bitSet17.get(14)) {
            this.o = bindData.B();
        }
        BitSet bitSet18 = this.az;
        if (bitSet18 == null || bitSet18.get(15)) {
            this.p = bindData.r();
        }
        BitSet bitSet19 = this.az;
        if (bitSet19 == null || bitSet19.get(16)) {
            this.q = bindData.z();
        }
        BitSet bitSet20 = this.az;
        if (bitSet20 == null || bitSet20.get(17)) {
            this.r = bindData.V();
        }
        BitSet bitSet21 = this.az;
        if (bitSet21 == null || bitSet21.get(18)) {
            bindData.az(18, "mms_transaction_id");
            this.s = bindData.s;
        }
        BitSet bitSet22 = this.az;
        if (bitSet22 == null || bitSet22.get(19)) {
            this.t = bindData.T();
        }
        BitSet bitSet23 = this.az;
        if (bitSet23 == null || bitSet23.get(20)) {
            this.u = bindData.u();
        }
        BitSet bitSet24 = this.az;
        if (bitSet24 == null || bitSet24.get(21)) {
            bindData.az(21, "rcs_expiry");
            this.v = bindData.v;
        }
        BitSet bitSet25 = this.az;
        if (bitSet25 == null || bitSet25.get(22)) {
            this.w = bindData.U();
        }
        BitSet bitSet26 = this.az;
        if (bitSet26 == null || bitSet26.get(23)) {
            this.x = bindData.m();
        }
        BitSet bitSet27 = this.az;
        if (bitSet27 == null || bitSet27.get(24)) {
            this.y = bindData.W();
        }
        BitSet bitSet28 = this.az;
        if (bitSet28 == null || bitSet28.get(25)) {
            bindData.az(25, "my_identity_foreign_key");
            this.z = bindData.z;
        }
        BitSet bitSet29 = this.az;
        if (bitSet29 == null || bitSet29.get(26)) {
            this.A = bindData.x();
        }
        BitSet bitSet30 = this.az;
        if (bitSet30 == null || bitSet30.get(27)) {
            this.B = bindData.P();
        }
        BitSet bitSet31 = this.az;
        if (bitSet31 == null || bitSet31.get(28)) {
            this.C = bindData.G();
        }
        BitSet bitSet32 = this.az;
        if (bitSet32 == null || bitSet32.get(29)) {
            this.D = bindData.n();
        }
        BitSet bitSet33 = this.az;
        if (bitSet33 == null || bitSet33.get(30)) {
            this.E = bindData.K();
        }
        BitSet bitSet34 = this.az;
        if (bitSet34 == null || bitSet34.get(31)) {
            bindData.az(31, "rcs_ui_status");
            this.F = bindData.F;
        }
        BitSet bitSet35 = this.az;
        if (bitSet35 == null || bitSet35.get(32)) {
            this.G = bindData.ad();
        }
        BitSet bitSet36 = this.az;
        if (bitSet36 == null || bitSet36.get(33)) {
            bindData.az(33, "rcs_remote_instance");
            this.H = bindData.H;
        }
        BitSet bitSet37 = this.az;
        if (bitSet37 == null || bitSet37.get(34)) {
            this.I = bindData.v();
        }
        BitSet bitSet38 = this.az;
        if (bitSet38 == null || bitSet38.get(35)) {
            this.J = bindData.q();
        }
        BitSet bitSet39 = this.az;
        if (bitSet39 == null || bitSet39.get(36)) {
            this.K = bindData.Y();
        }
        BitSet bitSet40 = this.az;
        if (bitSet40 == null || bitSet40.get(37)) {
            this.L = bindData.S();
        }
        BitSet bitSet41 = this.az;
        if (bitSet41 == null || bitSet41.get(38)) {
            this.M = bindData.R();
        }
        BitSet bitSet42 = this.az;
        if (bitSet42 == null || bitSet42.get(39)) {
            this.N = bindData.t();
        }
        BitSet bitSet43 = this.az;
        if (bitSet43 == null || bitSet43.get(40)) {
            this.O = bindData.Z();
        }
        BitSet bitSet44 = this.az;
        if (bitSet44 == null || bitSet44.get(41)) {
            this.P = bindData.A();
        }
        BitSet bitSet45 = this.az;
        if (bitSet45 == null || bitSet45.get(42)) {
            bindData.az(42, "send_counter");
            this.Q = bindData.Q;
        }
        BitSet bitSet46 = this.az;
        if (bitSet46 == null || bitSet46.get(43)) {
            this.R = bindData.F();
        }
        BitSet bitSet47 = this.az;
        if (bitSet47 == null || bitSet47.get(44)) {
            bindData.az(44, "custom_delivery_receipt_mime_type");
            this.S = bindData.S;
        }
        BitSet bitSet48 = this.az;
        if (bitSet48 == null || bitSet48.get(45)) {
            bindData.az(45, "custom_delivery_receipt_content");
            this.T = bindData.T;
        }
        BitSet bitSet49 = this.az;
        if (bitSet49 == null || bitSet49.get(46)) {
            bindData.az(46, "report_attempt_acounter");
            this.U = bindData.U;
        }
        BitSet bitSet50 = this.az;
        if (bitSet50 == null || bitSet50.get(47)) {
            this.V = bindData.N();
        }
        BitSet bitSet51 = this.az;
        if (bitSet51 == null || bitSet51.get(48)) {
            this.W = bindData.Q();
        }
        BitSet bitSet52 = this.az;
        if (bitSet52 == null || bitSet52.get(49)) {
            bindData.az(49, "group_private_participant");
            this.X = bindData.X;
        }
        BitSet bitSet53 = this.az;
        if (bitSet53 == null || bitSet53.get(50)) {
            bindData.az(50, "original_message_id");
            this.Y = bindData.Y;
        }
        BitSet bitSet54 = this.az;
        if (bitSet54 == null || bitSet54.get(51)) {
            bindData.az(51, "awaiting_reverse_sync");
            this.Z = bindData.Z;
        }
        BitSet bitSet55 = this.az;
        if (bitSet55 == null || bitSet55.get(52)) {
            bindData.az(52, "old_sms_message_uri");
            this.aa = bindData.aa;
        }
        BitSet bitSet56 = this.az;
        if (bitSet56 == null || bitSet56.get(53)) {
            bindData.az(53, "draft_id");
            this.ab = bindData.ab;
        }
        BitSet bitSet57 = this.az;
        if (bitSet57 == null || bitSet57.get(54)) {
            this.ac = bindData.o();
        }
        BitSet bitSet58 = this.az;
        if (bitSet58 == null || bitSet58.get(55)) {
            this.ad = bindData.M();
        }
        BitSet bitSet59 = this.az;
        if (bitSet59 == null || bitSet59.get(56)) {
            bindData.az(56, "mute_priority");
            this.ae = bindData.ae;
        }
        BitSet bitSet60 = this.az;
        if (bitSet60 == null || bitSet60.get(57)) {
            this.af = bindData.J();
        }
        BitSet bitSet61 = this.az;
        if (bitSet61 == null || bitSet61.get(58)) {
            bindData.az(58, "auto_retry_counter");
            this.ag = bindData.ag;
        }
        BitSet bitSet62 = this.az;
        if (bitSet62 == null || bitSet62.get(59)) {
            bindData.az(59, "can_revoke_before_delivered_with_rcs");
            this.ah = bindData.ah;
        }
        BitSet bitSet63 = this.az;
        if (bitSet63 == null || bitSet63.get(60)) {
            this.ai = bindData.aa();
        }
        BitSet bitSet64 = this.az;
        if (bitSet64 == null || bitSet64.get(61)) {
            bindData.az(61, "outgoing_delivery_report_status");
            this.aj = bindData.aj;
        }
        BitSet bitSet65 = this.az;
        if (bitSet65 == null || bitSet65.get(62)) {
            bindData.az(62, "outgoing_read_report_status");
            this.ak = bindData.ak;
        }
        BitSet bitSet66 = this.az;
        if (bitSet66 == null || bitSet66.get(63)) {
            this.al = bindData.L();
        }
        BitSet bitSet67 = this.az;
        if (bitSet67 == null || bitSet67.get(64)) {
            bindData.az(64, "message_original_protocol");
            this.am = bindData.am;
        }
        BitSet bitSet68 = this.az;
        if (bitSet68 == null || bitSet68.get(65)) {
            bindData.az(65, "satellite_datagram_id");
            this.an = bindData.an;
        }
        BitSet bitSet69 = this.az;
        if (bitSet69 == null || bitSet69.get(66)) {
            bindData.az(66, "encryption_protocol");
            this.ao = bindData.ao;
        }
        BitSet bitSet70 = this.az;
        if (bitSet70 == null || bitSet70.get(67)) {
            this.ap = bindData.O();
        }
    }

    public final void e(int i) {
        int i2 = this.aB;
        if (i2 < 58230) {
            dtub.w("auto_retry_counter", i2);
        }
        aE(58);
        this.ag = i;
    }

    public final void f(boolean z) {
        int i = this.aB;
        if (i < 49060) {
            dtub.w("awaiting_reverse_sync", i);
        }
        aE(51);
        this.Z = z;
    }

    public final void g(boolean z) {
        int i = this.aB;
        if (i < 58280) {
            dtub.w("can_revoke_before_delivered_with_rcs", i);
        }
        aE(59);
        this.ah = z;
    }

    public final void h(String str) {
        int i = this.aB;
        if (i < 8500) {
            dtub.w("cloud_sync_id", i);
        }
        aE(27);
        this.B = str;
    }

    public final void i(String str) {
        int i = this.aB;
        if (i < 46010) {
            dtub.w("cms_correlation_id", i);
        }
        aE(48);
        this.W = str;
    }

    public final void j(String str) {
        int i = this.aB;
        if (i < 31010) {
            dtub.w("cms_id", i);
        }
        aE(38);
        this.M = str;
    }

    public final void k(long j) {
        int i = this.aB;
        if (i < 37040) {
            dtub.w("cms_last_mod_seq", i);
        }
        aE(39);
        this.N = j;
    }

    public final void l(csgg csggVar) {
        int i = this.aB;
        if (i < 58210) {
            dtub.w("cms_life_cycle", i);
        }
        aE(55);
        this.ad = csggVar;
    }

    public final void m(ConversationIdType conversationIdType) {
        aE(1);
        this.b = conversationIdType;
    }

    public final void n(String str) {
        int i = this.aB;
        if (i < 9010) {
            dtub.w("correlation_id", i);
        }
        aE(37);
        this.L = str;
    }

    public final void o(byte[] bArr) {
        int i = this.aB;
        if (i < 37020) {
            dtub.w("custom_delivery_receipt_content", i);
        }
        aE(45);
        this.T = bArr;
    }

    public final void p(String str) {
        int i = this.aB;
        if (i < 37020) {
            dtub.w("custom_delivery_receipt_mime_type", i);
        }
        aE(44);
        this.S = str;
    }

    public final void q(fayv fayvVar) {
        int i = this.aB;
        if (i < 45020) {
            dtub.w("custom_headers", i);
        }
        aE(47);
        this.V = fayvVar;
    }

    public final void r(Optional optional) {
        int i = this.aB;
        if (i < 56000) {
            dtub.w("draft_id", i);
        }
        aE(53);
        this.ab = optional;
    }

    public final void s(cfmh cfmhVar) {
        int i = this.aB;
        if (i < 60190) {
            dtub.w("encryption_protocol", i);
        }
        aE(66);
        this.ao = cfmhVar;
    }

    public final void t(byyw byywVar) {
        int i = this.aB;
        if (i < 58710) {
            dtub.w("fallback_reason", i);
        }
        aE(57);
        this.af = byywVar;
    }

    public final void u(String str) {
        int i = this.aB;
        if (i < 48030) {
            dtub.w("group_private_participant", i);
        }
        aE(49);
        this.X = str;
    }

    public final void v(MessageIdType messageIdType) {
        aE(0);
        this.a = messageIdType;
    }

    public final void w(boolean z) {
        int i = this.aB;
        if (i < 30010) {
            dtub.w("is_hidden", i);
        }
        aE(32);
        this.G = z;
    }

    public final void x(Optional optional) {
        int i = this.aB;
        if (i < 60370) {
            dtub.w("message_persistence_id", i);
        }
        aE(67);
        if (!this.aC && !optional.isPresent()) {
            enrr enrrVar = (enrr) cuxg.a.j();
            enrrVar.aa(ensy.MEDIUM);
            ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/util/text/MessagePersistenceIdValueFilterForSet", "filter", 20, "MessagePersistenceIdValueFilterForSet.java")).q("Empty UUID passed to Message Persistence ID!");
            optional = Optional.of(UUID.randomUUID());
        }
        this.ap = optional;
    }

    public final void y(int i) {
        int i2 = this.aB;
        if (i2 < 13020) {
            dtub.w("message_report_status", i2);
        }
        aE(11);
        this.l = i;
    }

    public final void z(String str) {
        aE(19);
        this.t = str;
    }
}
