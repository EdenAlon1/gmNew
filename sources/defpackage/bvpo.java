package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bvpo extends dtrr {
    public int A;
    public String B;
    public boolean C;
    public int D;
    public String E;
    public byzi F;
    public String G;
    public byte[] H;
    public long I;
    public boolean J;
    public boolean K;
    public String L;
    public csgg M;
    public aorb N;
    public bdpy O;
    public cjwi P;
    public cjwi Q;
    public cjwe R;
    public aqkt S;
    public boolean T;
    public String a;
    public azsu b;
    public azsu c;
    public int d;
    public int e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public long k;
    public String l;
    public String m;
    public String n;
    public Uri o;
    public Uri p;
    public long q;
    public String r;
    public int s;
    public int t;
    public int u;
    public boolean v;
    public String w;
    public int x;
    public String y;
    public int z;

    public bvpo() {
        super(ParticipantsTable.q());
        this.b = null;
        this.c = null;
        this.d = -2;
        this.e = -1;
        this.q = -1L;
        this.s = -1;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.x = 0;
        this.z = 0;
        this.A = 0;
        this.C = false;
        this.D = 0;
        this.F = byzi.VERIFICATION_NA;
        this.I = -1L;
        this.J = azzr.a();
        this.K = true;
        this.M = csgg.UNKNOWN;
        this.N = aorb.NOT_MODIFIED;
        this.O = bdqc.a();
        cjwi cjwiVar = cjwi.PROFILE_CONTACT_SOURCE;
        this.P = cjwiVar;
        this.Q = cjwiVar;
        this.R = cjwe.PREFER_PROFILE_PHOTO;
    }

    public final void A(boolean z) {
        int i = this.aB;
        if (i < 55010) {
            dtub.w("is_valid_phone_number_data", i);
        }
        aE(36);
        this.K = z;
    }

    public final void B(bdpy bdpyVar) {
        int i = this.aB;
        if (i < 59440) {
            dtub.w("last_modified_by_key", i);
        }
        aE(40);
        this.O = bdpyVar;
    }

    public final void C(byzi byziVar) {
        int i = this.aB;
        if (i < 31030) {
            dtub.w("latest_verification_status", i);
        }
        aE(31);
        this.F = byziVar;
    }

    public final void D(String str) {
        aE(17);
        this.r = str;
    }

    public final void E(azsu azsuVar) {
        if (this.aB < 59930) {
            return;
        }
        aE(1);
        this.b = azsuVar;
    }

    public final void F(azsu azsuVar) {
        if (this.aB < 60160) {
            return;
        }
        aE(2);
        this.c = azsuVar;
    }

    public final void G(cjwi cjwiVar) {
        int i = this.aB;
        if (i < 59550) {
            dtub.w("name_source", i);
        }
        aE(41);
        this.P = cjwiVar;
    }

    public final void H(aorb aorbVar) {
        int i = this.aB;
        if (i < 58620) {
            dtub.w("norm_ui_status", i);
        }
        aE(39);
        this.N = aorbVar;
    }

    public final void I(String str) {
        aE(5);
        if (!this.aC) {
            str = cuxd.a(str);
        }
        this.f = str;
    }

    public final void J(int i) {
        int i2 = this.aB;
        if (i2 < 12001) {
            dtub.w("participant_type", i2);
        }
        aE(25);
        this.z = i;
    }

    public final void K(cjwi cjwiVar) {
        int i = this.aB;
        if (i < 59550) {
            dtub.w("photo_source", i);
        }
        aE(42);
        this.Q = cjwiVar;
    }

    public final void L(String str) {
        int i = this.aB;
        if (i < 33000) {
            dtub.w("profile_photo_blob_id", i);
        }
        aE(32);
        this.G = str;
    }

    public final void M(byte[] bArr) {
        int i = this.aB;
        if (i < 33060) {
            dtub.w("profile_photo_encryption_key", i);
        }
        aE(33);
        this.H = bArr;
    }

    public final void N(Uri uri) {
        aE(14);
        this.o = uri;
    }

    public final void O(cjwe cjweVar) {
        int i = this.aB;
        if (i < 60060) {
            dtub.w("profile_photo_user_preference", i);
        }
        aE(43);
        this.R = cjweVar;
    }

    public final void P(String str) {
        int i = this.aB;
        if (i < 58090) {
            dtub.w("recipient_canonical_address", i);
        }
        aE(11);
        this.l = str;
    }

    public final void Q(long j) {
        int i = this.aB;
        if (i < 58090) {
            dtub.w("recipient_id", i);
        }
        aE(10);
        this.k = j;
    }

    public final void R(String str) {
        aE(6);
        if (!this.aC) {
            str = cuxd.a(str);
        }
        this.g = str;
    }

    public final void S(int i) {
        int i2 = this.aB;
        if (i2 < 2000) {
            dtub.w("sim_slot_id", i2);
        }
        aE(4);
        this.e = i;
    }

    public final void T(int i) {
        aE(3);
        this.d = i;
    }

    public final void U(int i) {
        int i2 = this.aB;
        if (i2 < 2000) {
            dtub.w("subscription_color", i2);
        }
        aE(23);
        this.x = i;
    }

    public final void V(String str) {
        int i = this.aB;
        if (i < 2000) {
            dtub.w("subscription_name", i);
        }
        aE(22);
        this.w = str;
    }

    public final void W(int i) {
        int i2 = this.aB;
        if (i2 < 13050) {
            dtub.w("video_reachability", i2);
        }
        aE(26);
        this.A = i;
    }

    public final ParticipantsTable.BindData a() {
        return b(new Supplier() { // from class: bvpl
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bvpk();
            }
        });
    }

    public final ParticipantsTable.BindData b(Supplier supplier) {
        Object obj;
        try {
            azsu azsuVar = this.b;
            if (azsuVar != null) {
                F(azsuVar);
            }
            obj = supplier.get();
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
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
            bindData.cK = aC();
            return bindData;
        } catch (Throwable th) {
            throw new dtqp(th);
        }
    }

    public final ParticipantsTable.BindData c() {
        ParticipantsTable.BindData b = b(new Supplier() { // from class: bvpn
            @Override // java.util.function.Supplier
            public final Object get() {
                return new bvpk();
            }
        });
        b.J();
        return b;
    }

    public final void d(String str) {
        int i = this.aB;
        if (i < 20060) {
            dtub.w("alias", i);
        }
        aE(27);
        this.B = str;
    }

    public final void e(boolean z) {
        aE(21);
        this.v = z;
    }

    public final void f(String str) {
        int i = this.aB;
        if (i < 31020) {
            dtub.w("cms_id", i);
        }
        aE(30);
        this.E = str;
    }

    public final void g(csgg csggVar) {
        int i = this.aB;
        if (i < 58210) {
            dtub.w("cms_life_cycle", i);
        }
        aE(38);
        this.M = csggVar;
    }

    public final void h(int i) {
        aE(18);
        this.s = i;
    }

    public final void i(int i) {
        int i2 = this.aB;
        if (i2 < 1000) {
            dtub.w("color_type", i2);
        }
        aE(19);
        this.t = i;
    }

    public final void j(String str) {
        int i = this.aB;
        if (i < 54040) {
            dtub.w("comparable_destination", i);
        }
        aE(8);
        if (!this.aC) {
            str = cuxs.a(str);
        }
        this.i = str;
    }

    public final void k(String str) {
        int i = this.aB;
        if (i < 4000) {
            dtub.w("contact_destination", i);
        }
        aE(24);
        this.y = str;
    }

    public final void l(long j) {
        aE(16);
        this.q = j;
    }

    public final void m(aqkt aqktVar) {
        int i = this.aB;
        if (i < 60070) {
            dtub.w("contact_metadata", i);
        }
        aE(44);
        this.S = aqktVar;
    }

    public final void n(Uri uri) {
        int i = this.aB;
        if (i < 59850) {
            dtub.w("contact_photo_uri", i);
        }
        aE(15);
        this.p = uri;
    }

    public final void o(String str) {
        int i = this.aB;
        if (i < 54040) {
            dtub.w("country_code", i);
        }
        aE(9);
        if (!this.aC) {
            str = cuxs.a(str);
        }
        this.j = str;
    }

    public final void p(long j) {
        int i = this.aB;
        if (i < 35010) {
            dtub.w("directory_id", i);
        }
        aE(34);
        this.I = j;
    }

    public final void q(String str) {
        aE(7);
        if (!this.aC) {
            str = cuxd.a(str);
        }
        this.h = str;
    }

    public final void r(String str) {
        int i = this.aB;
        if (i < 58090) {
            dtub.w("duplicate_of", i);
        }
        aE(37);
        this.L = str;
    }

    public final void s(int i) {
        int i2 = this.aB;
        if (i2 < 10027) {
            dtub.w("extended_color", i2);
        }
        aE(20);
        this.u = i;
    }

    public final void t(String str) {
        aE(13);
        if (!this.aC) {
            str = cuxs.a(str);
        }
        this.n = str;
    }

    public final void u(String str) {
        aE(12);
        if (!this.aC) {
            str = cuxs.a(str);
        }
        this.m = str;
    }

    public final void v(String str) {
        aE(0);
        this.a = str;
    }

    public final void w(boolean z) {
        int i = this.aB;
        if (i < 55010) {
            dtub.w("is_check_constraint_enabled_via_phenotype", i);
        }
        aE(35);
        this.J = z;
    }

    public final void x(boolean z) {
        if (this.aB < 60640) {
            return;
        }
        aE(45);
        this.T = z;
    }

    public final void y(boolean z) {
        int i = this.aB;
        if (i < 24060) {
            dtub.w("is_spam", i);
        }
        aE(28);
        this.C = z;
    }

    public final void z(int i) {
        int i2 = this.aB;
        if (i2 < 30000) {
            dtub.w("is_spam_source", i2);
        }
        aE(29);
        this.D = i;
    }
}
