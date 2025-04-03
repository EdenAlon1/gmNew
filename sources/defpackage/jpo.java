package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpo {
    public static final jpo a = new jpo(0, 0, null, null, 0, 0, 0, 16777215);
    public final jou b;
    public final jmk c;
    public final jmq d;

    public jpo(jou jouVar, jmk jmkVar, jmq jmqVar) {
        this.b = jouVar;
        this.c = jmkVar;
        this.d = jmqVar;
    }

    public static /* synthetic */ jpo y(jpo jpoVar, long j, long j2, jsy jsyVar, jss jssVar, jsf jsfVar, String str, long j3, idg idgVar, int i, int i2, long j4, jmq jmqVar, jyh jyhVar, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        ifs ifsVar;
        idg idgVar2;
        long j5;
        jyt jytVar;
        jmq jmqVar2;
        long j6;
        jyh jyhVar2;
        jyh jyhVar3;
        int i8;
        long b = (i4 & 1) != 0 ? jpoVar.b.b() : j;
        long j7 = (i4 & 2) != 0 ? jpoVar.b.b : j2;
        jsy jsyVar2 = (i4 & 4) != 0 ? jpoVar.b.c : jsyVar;
        jss jssVar2 = (i4 & 8) != 0 ? jpoVar.b.d : jssVar;
        jst jstVar = (i4 & 16) != 0 ? jpoVar.b.e : null;
        jsf jsfVar2 = (i4 & 32) != 0 ? jpoVar.b.f : jsfVar;
        String str2 = (i4 & 64) != 0 ? jpoVar.b.g : str;
        long j8 = (i4 & 128) != 0 ? jpoVar.b.h : j3;
        jxv jxvVar = (i4 & 256) != 0 ? jpoVar.b.i : null;
        jys jysVar = (i4 & 512) != 0 ? jpoVar.b.j : null;
        jws jwsVar = (i4 & 1024) != 0 ? jpoVar.b.k : null;
        long j9 = j7;
        long j10 = (i4 & 2048) != 0 ? jpoVar.b.l : 0L;
        jyk jykVar = (i4 & 4096) != 0 ? jpoVar.b.m : null;
        idg idgVar3 = (i4 & 8192) != 0 ? jpoVar.b.n : idgVar;
        jyk jykVar2 = jykVar;
        ifs ifsVar2 = (i4 & 16384) != 0 ? jpoVar.b.p : null;
        int i9 = (i4 & 32768) != 0 ? jpoVar.c.a : i;
        if ((i4 & 65536) != 0) {
            i5 = i9;
            i6 = jpoVar.c.b;
        } else {
            i5 = i9;
            i6 = i2;
        }
        if ((i4 & 131072) != 0) {
            i7 = i6;
            ifsVar = ifsVar2;
            idgVar2 = idgVar3;
            j5 = jpoVar.c.c;
        } else {
            i7 = i6;
            ifsVar = ifsVar2;
            idgVar2 = idgVar3;
            j5 = j4;
        }
        jyt jytVar2 = (i4 & 262144) != 0 ? jpoVar.c.d : null;
        if ((i4 & 524288) != 0) {
            jytVar = jytVar2;
            jmqVar2 = jpoVar.d;
        } else {
            jytVar = jytVar2;
            jmqVar2 = jmqVar;
        }
        if ((i4 & 1048576) != 0) {
            j6 = j5;
            jyhVar2 = jpoVar.c.f;
        } else {
            j6 = j5;
            jyhVar2 = jyhVar;
        }
        int i10 = (i4 & 2097152) != 0 ? jpoVar.c.g : 0;
        if ((i4 & 4194304) != 0) {
            jyhVar3 = jyhVar2;
            i8 = jpoVar.c.h;
        } else {
            jyhVar3 = jyhVar2;
            i8 = i3;
        }
        jyv jyvVar = jpoVar.c.i;
        int i11 = i10;
        jsy jsyVar3 = jsyVar2;
        long b2 = jpoVar.b.b();
        long j11 = ibw.a;
        ifs ifsVar3 = ifsVar;
        return new jpo(new jou(ffcp.a(b, b2) ? jpoVar.b.a : jyn.a(b), j9, jsyVar3, jssVar2, jstVar, jsfVar2, str2, j8, jxvVar, jysVar, jwsVar, j10, jykVar2, idgVar2, jmqVar2 != null ? jmqVar2.a : null, ifsVar3), new jmk(i5, i7, j6, jytVar, jmqVar2 != null ? jmqVar2.b : null, jyhVar3, i11, i8, jyvVar), jmqVar2);
    }

    public static /* synthetic */ jpo z(jpo jpoVar, long j, long j2, jsy jsyVar, jss jssVar, jsf jsfVar, long j3, int i, long j4, int i2) {
        long j5 = (i2 & 1) != 0 ? ibw.h : j;
        long j6 = (i2 & 2) != 0 ? kak.a : j2;
        jsy jsyVar2 = (i2 & 4) != 0 ? null : jsyVar;
        jss jssVar2 = (i2 & 8) != 0 ? null : jssVar;
        jsf jsfVar2 = (i2 & 32) != 0 ? null : jsfVar;
        long j7 = (i2 & 128) != 0 ? kak.a : j3;
        long j8 = (i2 & 2048) != 0 ? ibw.h : 0L;
        int i3 = (32768 & i2) != 0 ? Integer.MIN_VALUE : i;
        int i4 = (65536 & i2) == 0 ? 0 : Integer.MIN_VALUE;
        long j9 = (i2 & 131072) != 0 ? kak.a : j4;
        jou b = jow.b(jpoVar.b, j5, null, Float.NaN, j6, jsyVar2, jssVar2, null, jsfVar2, null, j7, null, null, null, j8, null, null, null, null);
        jmk a2 = jml.a(jpoVar.c, i3, i4, j9, null, null, null, 0, Integer.MIN_VALUE, null);
        return (jpoVar.b == b && jpoVar.c == a2) ? jpoVar : new jpo(b, a2);
    }

    public final float a() {
        return this.b.a();
    }

    public final int b() {
        return this.c.g;
    }

    public final int c() {
        return this.c.a;
    }

    public final int d() {
        return this.c.b;
    }

    public final long e() {
        return this.b.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpo)) {
            return false;
        }
        jpo jpoVar = (jpo) obj;
        return ffkj.e(this.b, jpoVar.b) && ffkj.e(this.c, jpoVar.c) && ffkj.e(this.d, jpoVar.d);
    }

    public final long f() {
        return this.b.b();
    }

    public final long g() {
        return this.b.b;
    }

    public final long h() {
        return this.b.h;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() * 31) + this.c.hashCode();
        jmq jmqVar = this.d;
        return (hashCode * 31) + (jmqVar != null ? jmqVar.hashCode() : 0);
    }

    public final long i() {
        return this.c.c;
    }

    public final ibq j() {
        return this.b.c();
    }

    public final idg k() {
        return this.b.n;
    }

    public final ifs l() {
        return this.b.p;
    }

    public final jpo m(jpo jpoVar) {
        if (jpoVar == null || ffkj.e(jpoVar, a)) {
            return this;
        }
        return new jpo(this.b.d(jpoVar.b), this.c.a(jpoVar.c));
    }

    public final jsf n() {
        return this.b.f;
    }

    public final jss o() {
        return this.b.d;
    }

    public final jst p() {
        return this.b.e;
    }

    public final jsy q() {
        return this.b.c;
    }

    public final jws r() {
        return this.b.k;
    }

    public final jyh s() {
        return this.c.f;
    }

    public final jyk t() {
        return this.b.m;
    }

    public final String toString() {
        return "TextStyle(color=" + ((Object) ibw.g(f())) + ", brush=" + j() + ", alpha=" + a() + ", fontSize=" + ((Object) kak.d(g())) + ", fontWeight=" + q() + ", fontStyle=" + o() + ", fontSynthesis=" + p() + ", fontFamily=" + n() + ", fontFeatureSettings=" + this.b.g + ", letterSpacing=" + ((Object) kak.d(h())) + ", baselineShift=" + this.b.i + ", textGeometricTransform=" + this.b.j + ", localeList=" + r() + ", background=" + ((Object) ibw.g(e())) + ", textDecoration=" + t() + ", shadow=" + k() + ", drawStyle=" + l() + ", textAlign=" + ((Object) jyj.a(c())) + ", textDirection=" + ((Object) jyl.a(d())) + ", lineHeight=" + ((Object) kak.d(i())) + ", textIndent=" + u() + ", platformStyle=" + this.d + ", lineHeightStyle=" + s() + ", lineBreak=" + ((Object) jyc.a(b())) + ", hyphens=" + ((Object) jxy.a(this.c.h)) + ", textMotion=" + v() + ')';
    }

    public final jyt u() {
        return this.c.d;
    }

    public final jyv v() {
        return this.c.i;
    }

    public final boolean w(jpo jpoVar) {
        return this == jpoVar || this.b.f(jpoVar.b);
    }

    public final boolean x(jpo jpoVar) {
        if (this != jpoVar) {
            return ffkj.e(this.c, jpoVar.c) && this.b.e(jpoVar.b);
        }
        return true;
    }

    public /* synthetic */ jpo(long j, long j2, jsy jsyVar, jsf jsfVar, long j3, int i, long j4, int i2) {
        this(new jou((i2 & 1) != 0 ? ibw.h : j, (i2 & 2) != 0 ? kak.a : j2, (i2 & 4) != 0 ? null : jsyVar, null, null, (i2 & 32) != 0 ? null : jsfVar, null, (i2 & 128) != 0 ? kak.a : j3, null, null, null, (i2 & 2048) != 0 ? ibw.h : 0L, null, null), new jmk((32768 & i2) != 0 ? Integer.MIN_VALUE : i, (65536 & i2) == 0 ? 0 : Integer.MIN_VALUE, (i2 & 131072) != 0 ? kak.a : j4, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public jpo(defpackage.jou r4, defpackage.jmk r5) {
        /*
            r3 = this;
            jmp r0 = r4.o
            jmo r1 = r5.e
            if (r0 != 0) goto La
            if (r1 != 0) goto La
            r0 = 0
            goto L10
        La:
            jmq r2 = new jmq
            r2.<init>(r0, r1)
            r0 = r2
        L10:
            r3.<init>(r4, r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpo.<init>(jou, jmk):void");
    }
}
