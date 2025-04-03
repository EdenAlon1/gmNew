package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djtg extends djtr {
    public final String A;
    public final boolean B;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final String k;
    public final String l;
    public final String m;
    public final String n;
    public final float o;
    public final String p;
    public final int q;
    public final boolean r;
    public final String s;
    public final String t;
    public final String u;
    public final String v;
    public final String w;
    public final int x;
    public final int y;
    public final String z;

    public djtg(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, int i3, int i4, String str7, String str8, String str9, String str10, float f, String str11, int i5, boolean z, String str12, String str13, String str14, String str15, String str16, int i6, int i7, String str17, String str18, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = str7;
        this.l = str8;
        this.m = str9;
        this.n = str10;
        this.o = f;
        this.p = str11;
        this.q = i5;
        this.r = z;
        this.s = str12;
        this.t = str13;
        this.u = str14;
        this.v = str15;
        this.w = str16;
        this.x = i6;
        this.y = i7;
        this.z = str17;
        this.A = str18;
        this.B = z2;
    }

    @Override // defpackage.djtr
    public final String A() {
        return this.d;
    }

    @Override // defpackage.djtr
    public final boolean B() {
        return this.r;
    }

    @Override // defpackage.djtr
    public final boolean C() {
        return this.B;
    }

    @Override // defpackage.djtr
    public final float a() {
        return this.o;
    }

    @Override // defpackage.djtr
    public final int b() {
        return this.j;
    }

    @Override // defpackage.djtr
    public final int c() {
        return this.q;
    }

    @Override // defpackage.djtr
    public final int d() {
        return this.x;
    }

    @Override // defpackage.djtr
    public final int e() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof djtr) {
            djtr djtrVar = (djtr) obj;
            if (this.a.equals(djtrVar.v()) && this.b.equals(djtrVar.t()) && this.c.equals(djtrVar.u()) && this.d.equals(djtrVar.A()) && this.e.equals(djtrVar.y()) && this.f.equals(djtrVar.z()) && this.g == djtrVar.f() && this.h == djtrVar.g() && this.i == djtrVar.h() && this.j == djtrVar.b() && this.k.equals(djtrVar.s()) && this.l.equals(djtrVar.w()) && this.m.equals(djtrVar.x()) && this.n.equals(djtrVar.n()) && Float.floatToIntBits(this.o) == Float.floatToIntBits(djtrVar.a()) && this.p.equals(djtrVar.q()) && this.q == djtrVar.c() && this.r == djtrVar.B() && this.s.equals(djtrVar.r()) && this.t.equals(djtrVar.m()) && this.u.equals(djtrVar.l()) && this.v.equals(djtrVar.j()) && this.w.equals(djtrVar.k()) && this.x == djtrVar.d() && this.y == djtrVar.e() && this.z.equals(djtrVar.p()) && this.A.equals(djtrVar.o()) && this.B == djtrVar.C()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.djtr
    public final int f() {
        return this.g;
    }

    @Override // defpackage.djtr
    public final int g() {
        return this.h;
    }

    @Override // defpackage.djtr
    public final int h() {
        return this.i;
    }

    public final int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g) * 1000003) ^ this.h) * 1000003) ^ this.i) * 1000003) ^ this.j) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ Float.floatToIntBits(this.o)) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q) * 1000003) ^ (true != this.r ? 1237 : 1231)) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u.hashCode()) * 1000003) ^ this.v.hashCode()) * 1000003) ^ this.w.hashCode()) * 1000003) ^ this.x) * 1000003) ^ this.y) * 1000003) ^ this.z.hashCode()) * 1000003) ^ this.A.hashCode()) * 1000003) ^ (true == this.B ? 1231 : 1237);
    }

    @Override // defpackage.djtr
    public final djtq i() {
        return new djtf(this);
    }

    @Override // defpackage.djtr
    public final String j() {
        return this.v;
    }

    @Override // defpackage.djtr
    public final String k() {
        return this.w;
    }

    @Override // defpackage.djtr
    public final String l() {
        return this.u;
    }

    @Override // defpackage.djtr
    public final String m() {
        return this.t;
    }

    @Override // defpackage.djtr
    public final String n() {
        return this.n;
    }

    @Override // defpackage.djtr
    public final String o() {
        return this.A;
    }

    @Override // defpackage.djtr
    public final String p() {
        return this.z;
    }

    @Override // defpackage.djtr
    public final String q() {
        return this.p;
    }

    @Override // defpackage.djtr
    public final String r() {
        return this.s;
    }

    @Override // defpackage.djtr
    public final String s() {
        return this.k;
    }

    @Override // defpackage.djtr
    public final String t() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableImsConfiguration{psSipTransport=");
        sb.append(this.a);
        sb.append(", psMediaTransport=");
        sb.append(this.b);
        sb.append(", psRtpTransport=");
        sb.append(this.c);
        sb.append(", wifiSipTransport=");
        sb.append(this.d);
        sb.append(", wifiMediaTransport=");
        sb.append(this.e);
        sb.append(", wifiRtpTransport=");
        sb.append(this.f);
        sb.append(", timerT1=");
        sb.append(this.g);
        sb.append(", timerT2=");
        sb.append(this.h);
        sb.append(", timerT4=");
        sb.append(this.i);
        sb.append(", localSipPort=");
        sb.append(this.j);
        sb.append(", privateIdentity=");
        sb.append(this.k);
        sb.append(", publicIdentity=");
        sb.append(this.l);
        sb.append(", username=");
        sb.append(this.m);
        sb.append(", domain=");
        sb.append(this.n);
        sb.append(", q=");
        sb.append(this.o);
        sb.append(", pcscfAddress=");
        sb.append(this.p);
        sb.append(", pcscfPort=");
        sb.append(this.q);
        sb.append(", keepAlive=");
        sb.append(this.r);
        sb.append(", phoneContext=");
        sb.append(this.s);
        sb.append(", authenticationScheme=");
        sb.append(this.t);
        sb.append(", authDigestUsername=");
        sb.append(this.u);
        sb.append(", authDigestPassword=");
        sb.append(this.v);
        sb.append(", authDigestRealm=");
        sb.append(this.w);
        sb.append(", regRetryBaseTime=");
        boolean z = this.B;
        String str = this.A;
        String str2 = this.z;
        int i = this.y;
        sb.append(this.x);
        sb.append(", regRetryMaxTime=");
        sb.append(i);
        sb.append(", natUrlFmt=");
        sb.append(str2);
        sb.append(", intUrlFmt=");
        sb.append(str);
        sb.append(", rcsVolteSingleRegistration=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }

    @Override // defpackage.djtr
    public final String u() {
        return this.c;
    }

    @Override // defpackage.djtr
    public final String v() {
        return this.a;
    }

    @Override // defpackage.djtr
    public final String w() {
        return this.l;
    }

    @Override // defpackage.djtr
    public final String x() {
        return this.m;
    }

    @Override // defpackage.djtr
    public final String y() {
        return this.e;
    }

    @Override // defpackage.djtr
    public final String z() {
        return this.f;
    }
}
