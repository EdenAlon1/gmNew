package defpackage;

import android.net.Uri;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class bvit extends dtrr {
    public int A;
    public String B;
    public int C;
    public int D;
    public String E;
    public boolean F;
    public int G;
    public String H;
    public byzi I;
    public String J;
    public byte[] K;
    public long L;
    public boolean M;
    public boolean N;
    public String O;
    public csgg P;
    public aorb Q;
    public bdpy R;
    public cjwi S;
    public cjwi T;
    public cjwe U;
    public aqkt V;
    public boolean W;
    public String a;
    public Instant b;
    public long c;
    public String d;
    public azsu e;
    public azsu f;
    public int g;
    public int h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public long n;
    public String o;
    public String p;
    public String q;
    public Uri r;
    public Uri s;
    public long t;
    public String u;
    public int v;
    public int w;
    public int x;
    public boolean y;
    public String z;

    public bvit() {
        super(bvoy.f());
        this.b = Instant.EPOCH;
        this.e = null;
        this.f = null;
        this.Q = aorb.b(0);
        this.R = bdpy.a;
        this.S = cjwi.b(0);
        this.T = cjwi.b(0);
        this.U = cjwe.b(0);
    }

    public final void A(byzi byziVar) {
        aE(34);
        this.I = byziVar;
    }

    public final void B(String str) {
        aE(20);
        this.u = str;
    }

    public final void C(azsu azsuVar) {
        int i = this.aB;
        if (i < 59930) {
            dtub.w("my_identity_token", i);
        }
        aE(4);
        this.e = azsuVar;
    }

    public final void D(azsu azsuVar) {
        int i = this.aB;
        if (i < 60160) {
            dtub.w("my_identity_token_foreign_key", i);
        }
        aE(5);
        this.f = azsuVar;
    }

    public final void E(cjwi cjwiVar) {
        int i = this.aB;
        if (i < 59550) {
            dtub.w("name_source", i);
        }
        aE(44);
        this.S = cjwiVar;
    }

    public final void F(aorb aorbVar) {
        aE(42);
        this.Q = aorbVar;
    }

    public final void G(String str) {
        aE(8);
        this.i = str;
    }

    public final void H(Instant instant) {
        aE(1);
        this.b = instant;
    }

    public final void I(long j) {
        aE(2);
        this.c = j;
    }

    public final void J(String str) {
        aE(3);
        this.d = str;
    }

    public final void K(int i) {
        aE(28);
        this.C = i;
    }

    public final void L(cjwi cjwiVar) {
        int i = this.aB;
        if (i < 59550) {
            dtub.w("photo_source", i);
        }
        aE(45);
        this.T = cjwiVar;
    }

    public final void M(String str) {
        aE(35);
        this.J = str;
    }

    public final void N(byte[] bArr) {
        aE(36);
        this.K = bArr;
    }

    public final void O(cjwe cjweVar) {
        int i = this.aB;
        if (i < 60060) {
            dtub.w("profile_photo_user_preference", i);
        }
        aE(46);
        this.U = cjweVar;
    }

    public final bvir a() {
        bvis bvisVar = new bvis();
        bvisVar.aC(aB());
        bvisVar.a = this.a;
        bvisVar.b = this.b;
        bvisVar.c = this.c;
        bvisVar.d = this.d;
        bvisVar.e = this.e;
        bvisVar.f = this.f;
        bvisVar.g = this.g;
        bvisVar.h = this.h;
        bvisVar.i = this.i;
        bvisVar.j = this.j;
        bvisVar.k = this.k;
        bvisVar.l = this.l;
        bvisVar.m = this.m;
        bvisVar.n = this.n;
        bvisVar.o = this.o;
        bvisVar.p = this.p;
        bvisVar.q = this.q;
        bvisVar.r = this.r;
        bvisVar.s = this.s;
        bvisVar.t = this.t;
        bvisVar.u = this.u;
        bvisVar.v = this.v;
        bvisVar.w = this.w;
        bvisVar.x = this.x;
        bvisVar.y = this.y;
        bvisVar.z = this.z;
        bvisVar.A = this.A;
        bvisVar.B = this.B;
        bvisVar.C = this.C;
        bvisVar.D = this.D;
        bvisVar.E = this.E;
        bvisVar.F = this.F;
        bvisVar.G = this.G;
        bvisVar.H = this.H;
        bvisVar.I = this.I;
        bvisVar.J = this.J;
        bvisVar.K = this.K;
        bvisVar.L = this.L;
        bvisVar.M = this.M;
        bvisVar.N = this.N;
        bvisVar.O = this.O;
        bvisVar.P = this.P;
        bvisVar.Q = this.Q;
        bvisVar.R = this.R;
        bvisVar.S = this.S;
        bvisVar.T = this.T;
        bvisVar.U = this.U;
        bvisVar.V = this.V;
        bvisVar.W = this.W;
        bvisVar.cK = aC();
        return bvisVar;
    }

    public final void b(String str) {
        aE(30);
        this.E = str;
    }

    public final void c(boolean z) {
        aE(24);
        this.y = z;
    }

    public final void d(String str) {
        aE(33);
        this.H = str;
    }

    public final void e(csgg csggVar) {
        aE(41);
        this.P = csggVar;
    }

    public final void f(int i) {
        aE(21);
        this.v = i;
    }

    public final void g(int i) {
        aE(22);
        this.w = i;
    }

    public final void h(String str) {
        aE(11);
        this.l = str;
    }

    public final void i(String str) {
        aE(27);
        this.B = str;
    }

    public final void j(long j) {
        aE(19);
        this.t = j;
    }

    public final void k(aqkt aqktVar) {
        int i = this.aB;
        if (i < 60070) {
            dtub.w("contact_metadata", i);
        }
        aE(47);
        this.V = aqktVar;
    }

    public final void l(Uri uri) {
        int i = this.aB;
        if (i < 59850) {
            dtub.w("contact_photo_uri", i);
        }
        aE(18);
        this.s = uri;
    }

    public final void m(String str) {
        aE(12);
        this.m = str;
    }

    public final void n(long j) {
        aE(37);
        this.L = j;
    }

    public final void o(String str) {
        aE(10);
        this.k = str;
    }

    public final void p(String str) {
        aE(40);
        this.O = str;
    }

    public final void q(int i) {
        aE(23);
        this.x = i;
    }

    public final void r(String str) {
        aE(16);
        this.q = str;
    }

    public final void s(String str) {
        aE(15);
        this.p = str;
    }

    public final void t(String str) {
        aE(0);
        this.a = str;
    }

    public final void u(boolean z) {
        aE(38);
        this.M = z;
    }

    public final void v(boolean z) {
        int i = this.aB;
        if (i < 60640) {
            dtub.w("is_enterprise_contact", i);
        }
        aE(48);
        this.W = z;
    }

    public final void w(boolean z) {
        aE(31);
        this.F = z;
    }

    public final void x(int i) {
        aE(32);
        this.G = i;
    }

    public final void y(boolean z) {
        aE(39);
        this.N = z;
    }

    public final void z(bdpy bdpyVar) {
        int i = this.aB;
        if (i < 59440) {
            dtub.w("last_modified_by_key", i);
        }
        aE(43);
        this.R = bdpyVar;
    }
}
