package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import java.util.BitSet;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bvwp extends dtrr {
    public String A;
    public String B;
    public byte[] C;
    public byte[] D;
    public boolean E;
    public long F;
    public String G;
    public String H;
    public long I;
    public String J;
    public String K;
    public boolean L;
    public long M;
    public byte[] N;
    public byte[] O;
    public boolean P;
    public boolean Q;
    public long R;
    public String S;
    public byza T;
    public dteh U;
    public byzo V;
    public awap W;
    public byzh X;
    public byyz Y;
    public boolean Z;
    public String a;
    public MessageIdType b;
    public String c;
    public Uri d;
    public String e;
    public Uri f;
    public Uri g;
    public int h;
    public int i;
    public long j;
    public Uri k;
    public long l;
    public byzc m;
    public byyu n;
    public ConversationIdType o;
    public byyp p;
    public byyp q;
    public long r;
    public double s;
    public double t;
    public Uri u;
    public String v;
    public Uri w;
    public int x;
    public int y;
    public String z;

    public bvwp() {
        super(PartsTable.g());
        this.b = bdhb.a;
        this.h = -1;
        this.i = -1;
        this.l = 0L;
        this.m = byzc.SUCCEEDED;
        this.n = byyu.NOT_FROM_CMS;
        this.o = bdgq.a;
        this.p = new byyp(-1);
        this.q = new byyp(-1);
        this.r = -1L;
        this.s = eobe.a;
        this.t = eobe.a;
        this.x = 13;
        this.y = 0;
        this.E = false;
        this.F = 0L;
        this.L = false;
        this.M = 0L;
        this.Q = false;
        this.T = byza.STANDARD;
        this.V = byzo.UNKNOWN;
        this.W = null;
        this.X = byzh.NONE;
        this.Y = byyz.DEFAULT_NO_VERDICT;
        this.Z = false;
    }

    public final void A(int i) {
        aE(8);
        this.i = i;
    }

    public final void B(String str) {
        aE(0);
        this.a = str;
    }

    public final void C(byyz byyzVar) {
        int i = this.aB;
        if (i < 60240) {
            dtub.w("image_display_state", i);
        }
        aE(50);
        this.Y = byyzVar;
    }

    public final void D(double d) {
        int i = this.aB;
        if (i < 10005) {
            dtub.w("latitude", i);
        }
        aE(19);
        this.t = d;
    }

    public final void E(String str) {
        int i = this.aB;
        if (i < 52050) {
            dtub.w("local_cache_path", i);
        }
        aE(44);
        this.S = str;
    }

    public final void F(double d) {
        int i = this.aB;
        if (i < 10005) {
            dtub.w("longitude", i);
        }
        aE(18);
        this.s = d;
    }

    public final void G(byte[] bArr) {
        int i = this.aB;
        if (i < 30040) {
            dtub.w("media_encryption_key", i);
        }
        aE(39);
        this.N = bArr;
    }

    public final void H(long j) {
        int i = this.aB;
        if (i < 7000) {
            dtub.w("media_modified_timestamp", i);
        }
        aE(17);
        this.r = j;
    }

    public final void I(byza byzaVar) {
        int i = this.aB;
        if (i < 58150) {
            dtub.w("media_send_type", i);
        }
        aE(45);
        this.T = byzaVar;
    }

    public final void J(MessageIdType messageIdType) {
        aE(1);
        this.b = messageIdType;
    }

    public final void K(boolean z) {
        int i = this.aB;
        if (i < 52030) {
            dtub.w("missing_entry_in_telephony", i);
        }
        aE(41);
        this.P = z;
    }

    public final void L(Uri uri) {
        int i = this.aB;
        if (i < 10021) {
            dtub.w("original_uri", i);
        }
        aE(5);
        this.f = uri;
    }

    public final void M(boolean z) {
        int i = this.aB;
        if (i < 60680) {
            dtub.w("preserve_size", i);
        }
        aE(51);
        this.Z = z;
    }

    public final void N(String str) {
        int i = this.aB;
        if (i < 10017) {
            dtub.w("preview_content_type", i);
        }
        aE(21);
        this.v = str;
    }

    public final void O(Uri uri) {
        int i = this.aB;
        if (i < 10017) {
            dtub.w("preview_content_uri", i);
        }
        aE(20);
        this.u = uri;
    }

    public final void P(awap awapVar) {
        int i = this.aB;
        if (i < 60080) {
            dtub.w("processing_id", i);
        }
        aE(48);
        this.W = awapVar;
    }

    public final void Q(Uri uri) {
        int i = this.aB;
        if (i < 4020) {
            dtub.w("output_uri", i);
        }
        aE(10);
        this.k = uri;
    }

    public final void R(byzc byzcVar) {
        int i = this.aB;
        if (i < 4020) {
            dtub.w("processing_status", i);
        }
        aE(12);
        this.m = byzcVar;
    }

    public final void S(byzh byzhVar) {
        int i = this.aB;
        if (i < 60230) {
            dtub.w("rich_card_media_download_failure_reason", i);
        }
        aE(49);
        this.X = byzhVar;
    }

    public final void T(int i) {
        int i2 = this.aB;
        if (i2 < 14010) {
            dtub.w("source", i2);
        }
        aE(23);
        this.x = i;
    }

    public final void U(byyp byypVar) {
        int i = this.aB;
        if (i < 5020) {
            dtub.w("sticker_id", i);
        }
        aE(16);
        this.q = byypVar;
    }

    public final void V(byyp byypVar) {
        int i = this.aB;
        if (i < 5020) {
            dtub.w("sticker_set_id", i);
        }
        aE(15);
        this.p = byypVar;
    }

    public final void W(Uri uri) {
        int i = this.aB;
        if (i < 29060) {
            dtub.w("storage_uri", i);
        }
        aE(6);
        this.g = uri;
    }

    public final void X(long j) {
        int i = this.aB;
        if (i < 4020) {
            dtub.w("target_size", i);
        }
        aE(11);
        this.l = j;
    }

    public final void Y(String str) {
        aE(2);
        if (!this.aC) {
            str = cuxs.a(str);
        }
        this.c = str;
    }

    public final void Z(long j) {
        int i = this.aB;
        if (i < 3010) {
            dtub.w("timestamp", i);
        }
        aE(9);
        this.j = j;
    }

    public final PartsTable.BindData a() {
        return b(new Supplier() { // from class: bvwo
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bvwl();
            }
        });
    }

    public final void aa(Uri uri) {
        aE(3);
        this.d = uri;
    }

    public final void ab(byzo byzoVar) {
        int i = this.aB;
        if (i < 58770) {
            dtub.w("validation_status", i);
        }
        aE(47);
        this.V = byzoVar;
    }

    public final void ac(dteh dtehVar) {
        int i = this.aB;
        if (i < 59470) {
            dtub.w("voice_metadata", i);
        }
        aE(46);
        this.U = dtehVar;
    }

    public final void ad(int i) {
        aE(7);
        this.h = i;
    }

    public final PartsTable.BindData b(Supplier supplier) {
        Object obj;
        obj = supplier.get();
        PartsTable.BindData bindData = (PartsTable.BindData) obj;
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
        bindData.cK = aC();
        return bindData;
    }

    public final void c(PartsTable.BindData bindData, boolean z, BitSet bitSet) {
        this.az = bitSet == null ? null : (BitSet) bitSet.clone();
        if (z) {
            BitSet bitSet2 = this.az;
            if (bitSet2 != null) {
                bitSet2.clear(0);
            }
        } else {
            BitSet bitSet3 = this.az;
            if (bitSet3 == null || bitSet3.get(0)) {
                this.a = bindData.J();
            }
        }
        BitSet bitSet4 = this.az;
        if (bitSet4 == null || bitSet4.get(1)) {
            this.b = bindData.v();
        }
        BitSet bitSet5 = this.az;
        if (bitSet5 == null || bitSet5.get(2)) {
            this.c = bindData.K();
        }
        BitSet bitSet6 = this.az;
        if (bitSet6 == null || bitSet6.get(3)) {
            this.d = bindData.t();
        }
        BitSet bitSet7 = this.az;
        if (bitSet7 == null || bitSet7.get(4)) {
            this.e = bindData.H();
        }
        BitSet bitSet8 = this.az;
        if (bitSet8 == null || bitSet8.get(5)) {
            bindData.az(5, "original_uri");
            this.f = bindData.f;
        }
        BitSet bitSet9 = this.az;
        if (bitSet9 == null || bitSet9.get(6)) {
            bindData.az(6, "storage_uri");
            this.g = bindData.g;
        }
        BitSet bitSet10 = this.az;
        if (bitSet10 == null || bitSet10.get(7)) {
            this.h = bindData.n();
        }
        BitSet bitSet11 = this.az;
        if (bitSet11 == null || bitSet11.get(8)) {
            this.i = bindData.m();
        }
        BitSet bitSet12 = this.az;
        if (bitSet12 == null || bitSet12.get(9)) {
            bindData.az(9, "timestamp");
            this.j = bindData.j;
        }
        BitSet bitSet13 = this.az;
        if (bitSet13 == null || bitSet13.get(10)) {
            bindData.az(10, "output_uri");
            this.k = bindData.k;
        }
        BitSet bitSet14 = this.az;
        if (bitSet14 == null || bitSet14.get(11)) {
            this.l = bindData.s();
        }
        BitSet bitSet15 = this.az;
        if (bitSet15 == null || bitSet15.get(12)) {
            bindData.az(12, "processing_status");
            this.m = bindData.m;
        }
        BitSet bitSet16 = this.az;
        if (bitSet16 == null || bitSet16.get(13)) {
            this.n = bindData.y();
        }
        BitSet bitSet17 = this.az;
        if (bitSet17 == null || bitSet17.get(14)) {
            this.o = bindData.u();
        }
        BitSet bitSet18 = this.az;
        if (bitSet18 == null || bitSet18.get(15)) {
            bindData.az(15, "sticker_set_id");
            this.p = bindData.p;
        }
        BitSet bitSet19 = this.az;
        if (bitSet19 == null || bitSet19.get(16)) {
            bindData.az(16, "sticker_id");
            this.q = bindData.q;
        }
        BitSet bitSet20 = this.az;
        if (bitSet20 == null || bitSet20.get(17)) {
            bindData.az(17, "media_modified_timestamp");
            this.r = bindData.r;
        }
        BitSet bitSet21 = this.az;
        if (bitSet21 == null || bitSet21.get(18)) {
            this.s = bindData.l();
        }
        BitSet bitSet22 = this.az;
        if (bitSet22 == null || bitSet22.get(19)) {
            this.t = bindData.k();
        }
        BitSet bitSet23 = this.az;
        if (bitSet23 == null || bitSet23.get(20)) {
            bindData.az(20, "preview_content_uri");
            this.u = bindData.u;
        }
        BitSet bitSet24 = this.az;
        if (bitSet24 == null || bitSet24.get(21)) {
            bindData.az(21, "preview_content_type");
            this.v = bindData.v;
        }
        BitSet bitSet25 = this.az;
        if (bitSet25 == null || bitSet25.get(22)) {
            bindData.az(22, "fallback_uri");
            this.w = bindData.w;
        }
        BitSet bitSet26 = this.az;
        if (bitSet26 == null || bitSet26.get(23)) {
            bindData.az(23, "source");
            this.x = bindData.x;
        }
        BitSet bitSet27 = this.az;
        if (bitSet27 == null || bitSet27.get(24)) {
            bindData.az(24, "bundle_index");
            this.y = bindData.y;
        }
        BitSet bitSet28 = this.az;
        if (bitSet28 == null || bitSet28.get(25)) {
            this.z = bindData.D();
        }
        BitSet bitSet29 = this.az;
        if (bitSet29 == null || bitSet29.get(26)) {
            this.A = bindData.C();
        }
        BitSet bitSet30 = this.az;
        if (bitSet30 == null || bitSet30.get(27)) {
            this.B = bindData.F();
        }
        BitSet bitSet31 = this.az;
        if (bitSet31 == null || bitSet31.get(28)) {
            this.C = bindData.P();
        }
        BitSet bitSet32 = this.az;
        if (bitSet32 == null || bitSet32.get(29)) {
            bindData.az(29, "cms_compressed_media_encryption_key");
            this.D = bindData.D;
        }
        BitSet bitSet33 = this.az;
        if (bitSet33 == null || bitSet33.get(30)) {
            this.E = bindData.N();
        }
        BitSet bitSet34 = this.az;
        if (bitSet34 == null || bitSet34.get(31)) {
            this.F = bindData.o();
        }
        BitSet bitSet35 = this.az;
        if (bitSet35 == null || bitSet35.get(32)) {
            bindData.az(32, "expressive_sticker_name");
            this.G = bindData.G;
        }
        BitSet bitSet36 = this.az;
        if (bitSet36 == null || bitSet36.get(33)) {
            this.H = bindData.I();
        }
        BitSet bitSet37 = this.az;
        if (bitSet37 == null || bitSet37.get(34)) {
            this.I = bindData.r();
        }
        BitSet bitSet38 = this.az;
        if (bitSet38 == null || bitSet38.get(35)) {
            this.J = bindData.G();
        }
        BitSet bitSet39 = this.az;
        if (bitSet39 == null || bitSet39.get(36)) {
            this.K = bindData.E();
        }
        BitSet bitSet40 = this.az;
        if (bitSet40 == null || bitSet40.get(37)) {
            this.L = bindData.O();
        }
        BitSet bitSet41 = this.az;
        if (bitSet41 == null || bitSet41.get(38)) {
            this.M = bindData.q();
        }
        BitSet bitSet42 = this.az;
        if (bitSet42 == null || bitSet42.get(39)) {
            this.N = bindData.R();
        }
        BitSet bitSet43 = this.az;
        if (bitSet43 == null || bitSet43.get(40)) {
            this.O = bindData.Q();
        }
        BitSet bitSet44 = this.az;
        if (bitSet44 == null || bitSet44.get(41)) {
            bindData.az(41, "missing_entry_in_telephony");
            this.P = bindData.P;
        }
        BitSet bitSet45 = this.az;
        if (bitSet45 == null || bitSet45.get(42)) {
            bindData.az(42, "awaiting_reverse_sync");
            this.Q = bindData.Q;
        }
        BitSet bitSet46 = this.az;
        if (bitSet46 == null || bitSet46.get(43)) {
            bindData.az(43, "file_size_bytes");
            this.R = bindData.R;
        }
        BitSet bitSet47 = this.az;
        if (bitSet47 == null || bitSet47.get(44)) {
            bindData.az(44, "local_cache_path");
            this.S = bindData.S;
        }
        BitSet bitSet48 = this.az;
        if (bitSet48 == null || bitSet48.get(45)) {
            bindData.az(45, "media_send_type");
            this.T = bindData.T;
        }
        BitSet bitSet49 = this.az;
        if (bitSet49 == null || bitSet49.get(46)) {
            this.U = bindData.z();
        }
        BitSet bitSet50 = this.az;
        if (bitSet50 == null || bitSet50.get(47)) {
            bindData.az(47, "validation_status");
            this.V = bindData.V;
        }
        BitSet bitSet51 = this.az;
        if (bitSet51 == null || bitSet51.get(48)) {
            bindData.az(48, "processing_id");
            this.W = bindData.W;
        }
        BitSet bitSet52 = this.az;
        if (bitSet52 == null || bitSet52.get(49)) {
            bindData.az(49, "rich_card_media_download_failure_reason");
            this.X = bindData.X;
        }
        BitSet bitSet53 = this.az;
        if (bitSet53 == null || bitSet53.get(50)) {
            bindData.az(50, "image_display_state");
            this.Y = bindData.Y;
        }
        BitSet bitSet54 = this.az;
        if (bitSet54 == null || bitSet54.get(51)) {
            bindData.az(51, "preserve_size");
            this.Z = bindData.Z;
        }
    }

    public final void d() {
        b(new Supplier() { // from class: bvwn
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bvwl();
            }
        }).B();
    }

    public final void e(boolean z) {
        int i = this.aB;
        if (i < 53040) {
            dtub.w("awaiting_reverse_sync", i);
        }
        aE(42);
        this.Q = z;
    }

    public final void f(String str) {
        int i = this.aB;
        if (i < 59570) {
            dtub.w("blob_gaia_email", i);
        }
        aE(26);
        this.A = str;
    }

    public final void g(String str) {
        int i = this.aB;
        if (i < 17020) {
            dtub.w("blob_id", i);
        }
        aE(25);
        this.z = str;
    }

    public final void h(boolean z) {
        int i = this.aB;
        if (i < 18000) {
            dtub.w("blob_upload_permanent_failure", i);
        }
        aE(30);
        this.E = z;
    }

    public final void i(long j) {
        int i = this.aB;
        if (i < 19030) {
            dtub.w("blob_upload_timestamp", i);
        }
        aE(31);
        this.F = j;
    }

    public final void j(int i) {
        int i2 = this.aB;
        if (i2 < 17010) {
            dtub.w("bundle_index", i2);
        }
        aE(24);
        this.y = i;
    }

    public final void k(byyu byyuVar) {
        int i = this.aB;
        if (i < 44010) {
            dtub.w("cms_attachment_processing_status", i);
        }
        aE(13);
        this.n = byyuVar;
    }

    public final void l(String str) {
        int i = this.aB;
        if (i < 40040) {
            dtub.w("cms_compressed_blob_id", i);
        }
        aE(36);
        this.K = str;
    }

    public final void m(byte[] bArr) {
        int i = this.aB;
        if (i < 42070) {
            dtub.w("cms_compressed_media_encryption_key", i);
        }
        aE(29);
        this.D = bArr;
    }

    public final void n(String str) {
        int i = this.aB;
        if (i < 40040) {
            dtub.w("cms_full_size_blob_id", i);
        }
        aE(27);
        this.B = str;
    }

    public final void o(byte[] bArr) {
        int i = this.aB;
        if (i < 42010) {
            dtub.w("cms_media_encryption_key", i);
        }
        aE(28);
        this.C = bArr;
    }

    public final void p(String str) {
        int i = this.aB;
        if (i < 27000) {
            dtub.w("compressed_blob_id", i);
        }
        aE(35);
        this.J = str;
    }

    public final void q(boolean z) {
        int i = this.aB;
        if (i < 27000) {
            dtub.w("compressed_blob_upload_permanent_failure", i);
        }
        aE(37);
        this.L = z;
    }

    public final void r(long j) {
        int i = this.aB;
        if (i < 27000) {
            dtub.w("compressed_blob_upload_timestamp", i);
        }
        aE(38);
        this.M = j;
    }

    public final void s(byte[] bArr) {
        int i = this.aB;
        if (i < 30040) {
            dtub.w("compressed_media_encryption_key", i);
        }
        aE(40);
        this.O = bArr;
    }

    public final void t(String str) {
        aE(4);
        this.e = str;
    }

    public final void u(ConversationIdType conversationIdType) {
        aE(14);
        this.o = conversationIdType;
    }

    public final void v(long j) {
        int i = this.aB;
        if (i < 26040) {
            dtub.w("duration", i);
        }
        aE(34);
        this.I = j;
    }

    public final void w(String str) {
        int i = this.aB;
        if (i < 22060) {
            dtub.w("expressive_sticker_name", i);
        }
        aE(32);
        this.G = str;
    }

    public final void x(Uri uri) {
        int i = this.aB;
        if (i < 13000) {
            dtub.w("fallback_uri", i);
        }
        aE(22);
        this.w = uri;
    }

    public final void y(String str) {
        int i = this.aB;
        if (i < 26000) {
            dtub.w("file_name", i);
        }
        aE(33);
        this.H = str;
    }

    public final void z(long j) {
        int i = this.aB;
        if (i < 52050) {
            dtub.w("file_size_bytes", i);
        }
        aE(43);
        this.R = j;
    }
}
