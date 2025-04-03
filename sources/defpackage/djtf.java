package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djtf extends djtq {
    private String A;
    private boolean B;
    private short C;
    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private int h;
    private int i;
    private int j;
    private String k;
    private String l;
    private String m;
    private String n;
    private float o;
    private String p;
    private int q;
    private boolean r;
    private String s;
    private String t;
    private String u;
    private String v;
    private String w;
    private int x;
    private int y;
    private String z;

    public djtf() {
    }

    @Override // defpackage.djtq
    public final void A(String str) {
        if (str == null) {
            throw new NullPointerException("Null wifiMediaTransport");
        }
        this.e = str;
    }

    @Override // defpackage.djtq
    public final void B(String str) {
        if (str == null) {
            throw new NullPointerException("Null wifiRtpTransport");
        }
        this.f = str;
    }

    @Override // defpackage.djtq
    public final void C(String str) {
        if (str == null) {
            throw new NullPointerException("Null wifiSipTransport");
        }
        this.d = str;
    }

    @Override // defpackage.djtq
    public final djtr a() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        if (this.C == 1023 && (str = this.a) != null && (str2 = this.b) != null && (str3 = this.c) != null && (str4 = this.d) != null && (str5 = this.e) != null && (str6 = this.f) != null && (str7 = this.k) != null && (str8 = this.l) != null && (str9 = this.m) != null && (str10 = this.n) != null && (str11 = this.p) != null && (str12 = this.s) != null && (str13 = this.t) != null && (str14 = this.u) != null && (str15 = this.v) != null && (str16 = this.w) != null && (str17 = this.z) != null && (str18 = this.A) != null) {
            return new djtg(str, str2, str3, str4, str5, str6, this.g, this.h, this.i, this.j, str7, str8, str9, str10, this.o, str11, this.q, this.r, str12, str13, str14, str15, str16, this.x, this.y, str17, str18, this.B);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" psSipTransport");
        }
        if (this.b == null) {
            sb.append(" psMediaTransport");
        }
        if (this.c == null) {
            sb.append(" psRtpTransport");
        }
        if (this.d == null) {
            sb.append(" wifiSipTransport");
        }
        if (this.e == null) {
            sb.append(" wifiMediaTransport");
        }
        if (this.f == null) {
            sb.append(" wifiRtpTransport");
        }
        if ((this.C & 1) == 0) {
            sb.append(" timerT1");
        }
        if ((this.C & 2) == 0) {
            sb.append(" timerT2");
        }
        if ((this.C & 4) == 0) {
            sb.append(" timerT4");
        }
        if ((this.C & 8) == 0) {
            sb.append(" localSipPort");
        }
        if (this.k == null) {
            sb.append(" privateIdentity");
        }
        if (this.l == null) {
            sb.append(" publicIdentity");
        }
        if (this.m == null) {
            sb.append(" username");
        }
        if (this.n == null) {
            sb.append(" domain");
        }
        if ((this.C & 16) == 0) {
            sb.append(" q");
        }
        if (this.p == null) {
            sb.append(" pcscfAddress");
        }
        if ((this.C & 32) == 0) {
            sb.append(" pcscfPort");
        }
        if ((this.C & 64) == 0) {
            sb.append(" keepAlive");
        }
        if (this.s == null) {
            sb.append(" phoneContext");
        }
        if (this.t == null) {
            sb.append(" authenticationScheme");
        }
        if (this.u == null) {
            sb.append(" authDigestUsername");
        }
        if (this.v == null) {
            sb.append(" authDigestPassword");
        }
        if (this.w == null) {
            sb.append(" authDigestRealm");
        }
        if ((this.C & 128) == 0) {
            sb.append(" regRetryBaseTime");
        }
        if ((this.C & 256) == 0) {
            sb.append(" regRetryMaxTime");
        }
        if (this.z == null) {
            sb.append(" natUrlFmt");
        }
        if (this.A == null) {
            sb.append(" intUrlFmt");
        }
        if ((this.C & 512) == 0) {
            sb.append(" rcsVolteSingleRegistration");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.djtq
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null authDigestPassword");
        }
        this.v = str;
    }

    @Override // defpackage.djtq
    public final void c(String str) {
        if (str == null) {
            throw new NullPointerException("Null authDigestRealm");
        }
        this.w = str;
    }

    @Override // defpackage.djtq
    public final void d(String str) {
        if (str == null) {
            throw new NullPointerException("Null authDigestUsername");
        }
        this.u = str;
    }

    @Override // defpackage.djtq
    public final void e(String str) {
        if (str == null) {
            throw new NullPointerException("Null authenticationScheme");
        }
        this.t = str;
    }

    @Override // defpackage.djtq
    public final void f(String str) {
        if (str == null) {
            throw new NullPointerException("Null domain");
        }
        this.n = str;
    }

    @Override // defpackage.djtq
    public final void g(String str) {
        if (str == null) {
            throw new NullPointerException("Null intUrlFmt");
        }
        this.A = str;
    }

    @Override // defpackage.djtq
    public final void h(boolean z) {
        this.r = z;
        this.C = (short) (this.C | 64);
    }

    @Override // defpackage.djtq
    public final void i(int i) {
        this.j = i;
        this.C = (short) (this.C | 8);
    }

    @Override // defpackage.djtq
    public final void j(String str) {
        if (str == null) {
            throw new NullPointerException("Null natUrlFmt");
        }
        this.z = str;
    }

    @Override // defpackage.djtq
    public final void k(String str) {
        if (str == null) {
            throw new NullPointerException("Null pcscfAddress");
        }
        this.p = str;
    }

    @Override // defpackage.djtq
    public final void l(int i) {
        this.q = i;
        this.C = (short) (this.C | 32);
    }

    @Override // defpackage.djtq
    public final void m(String str) {
        if (str == null) {
            throw new NullPointerException("Null phoneContext");
        }
        this.s = str;
    }

    @Override // defpackage.djtq
    public final void n(String str) {
        if (str == null) {
            throw new NullPointerException("Null privateIdentity");
        }
        this.k = str;
    }

    @Override // defpackage.djtq
    public final void o(String str) {
        if (str == null) {
            throw new NullPointerException("Null psMediaTransport");
        }
        this.b = str;
    }

    @Override // defpackage.djtq
    public final void p(String str) {
        if (str == null) {
            throw new NullPointerException("Null psRtpTransport");
        }
        this.c = str;
    }

    @Override // defpackage.djtq
    public final void q(String str) {
        if (str == null) {
            throw new NullPointerException("Null psSipTransport");
        }
        this.a = str;
    }

    @Override // defpackage.djtq
    public final void r(String str) {
        if (str == null) {
            throw new NullPointerException("Null publicIdentity");
        }
        this.l = str;
    }

    @Override // defpackage.djtq
    public final void s(float f) {
        this.o = f;
        this.C = (short) (this.C | 16);
    }

    @Override // defpackage.djtq
    public final void t(boolean z) {
        this.B = z;
        this.C = (short) (this.C | 512);
    }

    @Override // defpackage.djtq
    public final void u(int i) {
        this.x = i;
        this.C = (short) (this.C | 128);
    }

    @Override // defpackage.djtq
    public final void v(int i) {
        this.y = i;
        this.C = (short) (this.C | 256);
    }

    @Override // defpackage.djtq
    public final void w(int i) {
        this.g = i;
        this.C = (short) (this.C | 1);
    }

    @Override // defpackage.djtq
    public final void x(int i) {
        this.h = i;
        this.C = (short) (this.C | 2);
    }

    @Override // defpackage.djtq
    public final void y(int i) {
        this.i = i;
        this.C = (short) (this.C | 4);
    }

    @Override // defpackage.djtq
    public final void z(String str) {
        if (str == null) {
            throw new NullPointerException("Null username");
        }
        this.m = str;
    }

    public djtf(djtr djtrVar) {
        djtg djtgVar = (djtg) djtrVar;
        this.a = djtgVar.a;
        this.b = djtgVar.b;
        this.c = djtgVar.c;
        this.d = djtgVar.d;
        this.e = djtgVar.e;
        this.f = djtgVar.f;
        this.g = djtgVar.g;
        this.h = djtgVar.h;
        this.i = djtgVar.i;
        this.j = djtgVar.j;
        this.k = djtgVar.k;
        this.l = djtgVar.l;
        this.m = djtgVar.m;
        this.n = djtgVar.n;
        this.o = djtgVar.o;
        this.p = djtgVar.p;
        this.q = djtgVar.q;
        this.r = djtgVar.r;
        this.s = djtgVar.s;
        this.t = djtgVar.t;
        this.u = djtgVar.u;
        this.v = djtgVar.v;
        this.w = djtgVar.w;
        this.x = djtgVar.x;
        this.y = djtgVar.y;
        this.z = djtgVar.z;
        this.A = djtgVar.A;
        this.B = djtgVar.B;
        this.C = (short) 1023;
    }
}
