package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jou implements jlg {
    public final jyr a;
    public final long b;
    public final jsy c;
    public final jss d;
    public final jst e;
    public final jsf f;
    public final String g;
    public final long h;
    public final jxv i;
    public final jys j;
    public final jws k;
    public final long l;
    public final jyk m;
    public final idg n;
    public final jmp o;
    public final ifs p;

    public jou(jyr jyrVar, long j, jsy jsyVar, jss jssVar, jst jstVar, jsf jsfVar, String str, long j2, jxv jxvVar, jys jysVar, jws jwsVar, long j3, jyk jykVar, idg idgVar, jmp jmpVar, ifs ifsVar) {
        this.a = jyrVar;
        this.b = j;
        this.c = jsyVar;
        this.d = jssVar;
        this.e = jstVar;
        this.f = jsfVar;
        this.g = str;
        this.h = j2;
        this.i = jxvVar;
        this.j = jysVar;
        this.k = jwsVar;
        this.l = j3;
        this.m = jykVar;
        this.n = idgVar;
        this.o = jmpVar;
        this.p = ifsVar;
    }

    public final float a() {
        return this.a.a();
    }

    public final long b() {
        return this.a.b();
    }

    public final ibq c() {
        return this.a.c();
    }

    public final jou d(jou jouVar) {
        if (jouVar == null) {
            return this;
        }
        jyr jyrVar = jouVar.a;
        return jow.b(this, jyrVar.b(), jyrVar.c(), jyrVar.a(), jouVar.b, jouVar.c, jouVar.d, jouVar.e, jouVar.f, jouVar.g, jouVar.h, jouVar.i, jouVar.j, jouVar.k, jouVar.l, jouVar.m, jouVar.n, jouVar.o, jouVar.p);
    }

    public final boolean e(jou jouVar) {
        if (this == jouVar) {
            return true;
        }
        if (!kak.e(this.b, jouVar.b) || !ffkj.e(this.c, jouVar.c) || !ffkj.e(this.d, jouVar.d) || !ffkj.e(this.e, jouVar.e) || !ffkj.e(this.f, jouVar.f) || !ffkj.e(this.g, jouVar.g) || !kak.e(this.h, jouVar.h) || !ffkj.e(this.i, jouVar.i) || !ffkj.e(this.j, jouVar.j) || !ffkj.e(this.k, jouVar.k)) {
            return false;
        }
        long j = this.l;
        long j2 = jouVar.l;
        long j3 = ibw.a;
        return ffcp.a(j, j2) && ffkj.e(this.o, jouVar.o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jou)) {
            return false;
        }
        jou jouVar = (jou) obj;
        return e(jouVar) && f(jouVar);
    }

    public final boolean f(jou jouVar) {
        return ffkj.e(this.a, jouVar.a) && ffkj.e(this.m, jouVar.m) && ffkj.e(this.n, jouVar.n) && ffkj.e(this.p, jouVar.p);
    }

    public final int hashCode() {
        long b = b();
        long j = ibw.a;
        int a = ffco.a(b);
        ibq c = c();
        int hashCode = (((a * 31) + (c != null ? c.hashCode() : 0)) * 31) + Float.floatToIntBits(a());
        long j2 = this.b;
        long j3 = kak.a;
        jsy jsyVar = this.c;
        int a2 = ((((hashCode * 31) + kaj.a(j2)) * 31) + (jsyVar != null ? jsyVar.i : 0)) * 31;
        jss jssVar = this.d;
        int i = (a2 + (jssVar != null ? jssVar.a : 0)) * 31;
        jst jstVar = this.e;
        int i2 = (i + (jstVar != null ? jstVar.a : 0)) * 31;
        jsf jsfVar = this.f;
        int hashCode2 = (i2 + (jsfVar != null ? jsfVar.hashCode() : 0)) * 31;
        String str = this.g;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + kaj.a(this.h)) * 31;
        jxv jxvVar = this.i;
        int floatToIntBits = (hashCode3 + (jxvVar != null ? Float.floatToIntBits(jxvVar.a) : 0)) * 31;
        jys jysVar = this.j;
        int hashCode4 = (floatToIntBits + (jysVar != null ? jysVar.hashCode() : 0)) * 31;
        jws jwsVar = this.k;
        int hashCode5 = (((hashCode4 + (jwsVar != null ? jwsVar.hashCode() : 0)) * 31) + ffco.a(this.l)) * 31;
        jyk jykVar = this.m;
        int i3 = (hashCode5 + (jykVar != null ? jykVar.d : 0)) * 31;
        idg idgVar = this.n;
        int hashCode6 = (i3 + (idgVar != null ? idgVar.hashCode() : 0)) * 31;
        jmp jmpVar = this.o;
        int hashCode7 = (hashCode6 + (jmpVar != null ? jmpVar.hashCode() : 0)) * 31;
        ifs ifsVar = this.p;
        return hashCode7 + (ifsVar != null ? ifsVar.hashCode() : 0);
    }

    public final String toString() {
        return "SpanStyle(color=" + ((Object) ibw.g(b())) + ", brush=" + c() + ", alpha=" + a() + ", fontSize=" + ((Object) kak.d(this.b)) + ", fontWeight=" + this.c + ", fontStyle=" + this.d + ", fontSynthesis=" + this.e + ", fontFamily=" + this.f + ", fontFeatureSettings=" + this.g + ", letterSpacing=" + ((Object) kak.d(this.h)) + ", baselineShift=" + this.i + ", textGeometricTransform=" + this.j + ", localeList=" + this.k + ", background=" + ((Object) ibw.g(this.l)) + ", textDecoration=" + this.m + ", shadow=" + this.n + ", platformStyle=" + this.o + ", drawStyle=" + this.p + ')';
    }

    public /* synthetic */ jou(long j, long j2, jsy jsyVar, jss jssVar, jst jstVar, jsf jsfVar, String str, long j3, jxv jxvVar, jys jysVar, jws jwsVar, long j4, jyk jykVar, idg idgVar, int i) {
        this((i & 1) != 0 ? ibw.h : j, (i & 2) != 0 ? kak.a : j2, (i & 4) != 0 ? null : jsyVar, (i & 8) != 0 ? null : jssVar, (i & 16) != 0 ? null : jstVar, (i & 32) != 0 ? null : jsfVar, (i & 64) != 0 ? null : str, (i & 128) != 0 ? kak.a : j3, (i & 256) != 0 ? null : jxvVar, (i & 512) != 0 ? null : jysVar, (i & 1024) != 0 ? null : jwsVar, (i & 2048) != 0 ? ibw.h : j4, (i & 4096) != 0 ? null : jykVar, (i & 8192) != 0 ? null : idgVar);
    }

    public /* synthetic */ jou(long j, long j2, jsy jsyVar, jss jssVar, jst jstVar, jsf jsfVar, String str, long j3, jxv jxvVar, jys jysVar, jws jwsVar, long j4, jyk jykVar, idg idgVar) {
        this(jyn.a(j), j2, jsyVar, jssVar, jstVar, jsfVar, str, j3, jxvVar, jysVar, jwsVar, j4, jykVar, idgVar, null, null);
    }
}
