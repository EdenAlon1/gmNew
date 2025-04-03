package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jpp {
    public static final jpo a(jpo jpoVar, jpo jpoVar2, float f) {
        jyr b;
        jmo jmoVar;
        jou jouVar = jpoVar.b;
        jyr jyrVar = jouVar.a;
        jou jouVar2 = jpoVar2.b;
        jyr jyrVar2 = jouVar2.a;
        long j = jow.a;
        if (jyrVar instanceof jxw) {
            if (jyrVar2 instanceof jxw) {
                b = jyn.b((ibq) jow.c(((jxw) jyrVar).a, ((jxw) jyrVar2).a, f), kav.b(jyrVar.a(), jyrVar2.a(), f));
            }
            b = (jyr) jow.c(jyrVar, jyrVar2, f);
        } else {
            if (!(jyrVar2 instanceof jxw)) {
                b = jyn.a(iby.i(jyrVar.b(), jyrVar2.b(), f));
            }
            b = (jyr) jow.c(jyrVar, jyrVar2, f);
        }
        jyr jyrVar3 = b;
        jsf jsfVar = (jsf) jow.c(jouVar.f, jouVar2.f, f);
        long a = jow.a(jouVar.b, jouVar2.b, f);
        jsy jsyVar = jouVar.c;
        if (jsyVar == null) {
            jsyVar = jsy.e;
        }
        jsy jsyVar2 = jouVar2.c;
        if (jsyVar2 == null) {
            jsyVar2 = jsy.e;
        }
        jsy jsyVar3 = new jsy(ffmk.i(kav.c(jsyVar.i, jsyVar2.i, f), 1, 1000));
        jss jssVar = (jss) jow.c(jouVar.d, jouVar2.d, f);
        jst jstVar = (jst) jow.c(jouVar.e, jouVar2.e, f);
        String str = (String) jow.c(jouVar.g, jouVar2.g, f);
        long a2 = jow.a(jouVar.h, jouVar2.h, f);
        jxv jxvVar = jouVar.i;
        float f2 = jxvVar != null ? jxvVar.a : 0.0f;
        jxv jxvVar2 = jouVar2.i;
        float b2 = kav.b(f2, jxvVar2 != null ? jxvVar2.a : 0.0f, f);
        jys jysVar = jouVar.j;
        if (jysVar == null) {
            jysVar = jys.a;
        }
        jys jysVar2 = jouVar2.j;
        if (jysVar2 == null) {
            jysVar2 = jys.a;
        }
        jys jysVar3 = new jys(kav.b(jysVar.b, jysVar2.b, f), kav.b(jysVar.c, jysVar2.c, f));
        jws jwsVar = (jws) jow.c(jouVar.k, jouVar2.k, f);
        long i = iby.i(jouVar.l, jouVar2.l, f);
        Object c = jow.c(jouVar.m, jouVar2.m, f);
        idg idgVar = jouVar.n;
        jyk jykVar = (jyk) c;
        if (idgVar == null) {
            idgVar = new idg();
        }
        idg idgVar2 = jouVar2.n;
        if (idgVar2 == null) {
            idgVar2 = new idg();
        }
        long i2 = iby.i(idgVar.b, idgVar2.b, f);
        long j2 = idgVar.c;
        long j3 = idgVar2.c;
        float b3 = kav.b(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 >> 32)), f);
        float b4 = kav.b(Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 & 4294967295L)), f);
        idg idgVar3 = new idg(i2, (Float.floatToRawIntBits(b3) << 32) | (Float.floatToRawIntBits(b4) & 4294967295L), kav.b(idgVar.d, idgVar2.d, f));
        jmp jmpVar = jouVar.o;
        jmp jmpVar2 = jouVar2.o;
        if (jmpVar == null && jmpVar2 == null) {
            jmpVar = null;
        } else if (jmpVar == null) {
            jmpVar = jmp.a;
        }
        jou jouVar3 = new jou(jyrVar3, a, jsyVar3, jssVar, jstVar, jsfVar, str, a2, new jxv(b2), jysVar3, jwsVar, i, jykVar, idgVar3, jmpVar, (ifs) jow.c(jouVar.p, jouVar2.p, f));
        jmk jmkVar = jpoVar.c;
        jmk jmkVar2 = jpoVar2.c;
        int i3 = jmkVar.a;
        long j4 = jml.a;
        int i4 = ((jyj) jow.c(new jyj(i3), new jyj(jmkVar2.a), f)).a;
        int i5 = ((jyl) jow.c(new jyl(jmkVar.b), new jyl(jmkVar2.b), f)).a;
        long a3 = jow.a(jmkVar.c, jmkVar2.c, f);
        jyt jytVar = jmkVar.d;
        if (jytVar == null) {
            jytVar = jyt.a;
        }
        jyt jytVar2 = jmkVar2.d;
        if (jytVar2 == null) {
            jytVar2 = jyt.a;
        }
        jyt jytVar3 = new jyt(jow.a(jytVar.b, jytVar2.b, f), jow.a(jytVar.c, jytVar2.c, f));
        jmo jmoVar2 = jmkVar.e;
        jmo jmoVar3 = jmkVar2.e;
        if (jmoVar2 == null && jmoVar3 == null) {
            jmoVar = null;
        } else {
            if (jmoVar2 == null) {
                jmoVar2 = jmo.a;
            }
            if (jmoVar3 == null) {
                jmoVar3 = jmo.a;
            }
            boolean z = jmoVar2.b;
            if (z != jmoVar3.b) {
                jlt jltVar = new jlt();
                int i6 = jmoVar3.c;
                int i7 = ((jlt) jow.c(jltVar, new jlt(), f)).a;
                jmoVar2 = new jmo(((Boolean) jow.c(Boolean.valueOf(z), Boolean.valueOf(jmoVar3.b), f)).booleanValue());
            }
            jmoVar = jmoVar2;
        }
        return new jpo(jouVar3, new jmk(i4, i5, a3, jytVar3, jmoVar, (jyh) jow.c(jmkVar.f, jmkVar2.f, f), ((jyc) jow.c(new jyc(jmkVar.g), new jyc(jmkVar2.g), f)).a, ((jxy) jow.c(new jxy(jmkVar.h), new jxy(jmkVar2.h), f)).a, (jyv) jow.c(jmkVar.i, jmkVar2.i, f)));
    }

    public static final jpo b(jpo jpoVar, kah kahVar) {
        jou jouVar = jpoVar.b;
        jyr jyrVar = jouVar.a;
        long j = jow.a;
        jyr e = jyrVar.e(jov.a);
        long j2 = kak.b(jouVar.b) == 0 ? jow.a : jouVar.b;
        jsy jsyVar = jouVar.c;
        if (jsyVar == null) {
            jsyVar = jsy.e;
        }
        jsy jsyVar2 = jsyVar;
        jss jssVar = jouVar.d;
        jss jssVar2 = new jss(jssVar != null ? jssVar.a : 0);
        jst jstVar = jouVar.e;
        jst jstVar2 = new jst(jstVar != null ? jstVar.a : 65535);
        jsf jsfVar = jouVar.f;
        if (jsfVar == null) {
            jsfVar = jsf.a;
        }
        jsf jsfVar2 = jsfVar;
        String str = jouVar.g;
        long j3 = jouVar.h;
        if (kak.b(j3) == 0) {
            j3 = jow.b;
        }
        long j4 = j3;
        jxv jxvVar = jouVar.i;
        jxv jxvVar2 = new jxv(jxvVar != null ? jxvVar.a : 0.0f);
        jys jysVar = jouVar.j;
        if (jysVar == null) {
            jysVar = jys.a;
        }
        jys jysVar2 = jysVar;
        jws jwsVar = jouVar.k;
        if (jwsVar == null) {
            jws jwsVar2 = jws.a;
            jwsVar = jwr.a();
        }
        jws jwsVar3 = jwsVar;
        long j5 = jouVar.l;
        if (j5 == 16) {
            j5 = jow.c;
        }
        long j6 = j5;
        jyk jykVar = jouVar.m;
        if (jykVar == null) {
            jykVar = jyk.a;
        }
        jyk jykVar2 = jykVar;
        idg idgVar = jouVar.n;
        if (idgVar == null) {
            idgVar = idg.a;
        }
        idg idgVar2 = idgVar;
        jmp jmpVar = jouVar.o;
        ifs ifsVar = jouVar.p;
        if (ifsVar == null) {
            ifsVar = ifu.a;
        }
        ifs ifsVar2 = ifsVar;
        if (str == null) {
            str = "";
        }
        jou jouVar2 = new jou(e, j2, jsyVar2, jssVar2, jstVar2, jsfVar2, str, j4, jxvVar2, jysVar2, jwsVar3, j6, jykVar2, idgVar2, jmpVar, ifsVar2);
        jmk jmkVar = jpoVar.c;
        int i = jmkVar.a;
        long j7 = jml.a;
        int i2 = 5;
        int i3 = jyj.b(i, Integer.MIN_VALUE) ? 5 : jmkVar.a;
        int i4 = jmkVar.b;
        if (jyl.b(i4, 3)) {
            int ordinal = kahVar.ordinal();
            if (ordinal == 0) {
                i2 = 4;
            } else if (ordinal != 1) {
                throw new ffcd();
            }
        } else if (jyl.b(i4, Integer.MIN_VALUE)) {
            int ordinal2 = kahVar.ordinal();
            if (ordinal2 == 0) {
                i2 = 1;
            } else {
                if (ordinal2 != 1) {
                    throw new ffcd();
                }
                i2 = 2;
            }
        } else {
            i2 = i4;
        }
        long j8 = jmkVar.c;
        if (kak.b(j8) == 0) {
            j8 = jml.a;
        }
        jyt jytVar = jmkVar.d;
        if (jytVar == null) {
            jytVar = jyt.a;
        }
        jyt jytVar2 = jytVar;
        jmo jmoVar = jmkVar.e;
        jyh jyhVar = jmkVar.f;
        int i5 = jmkVar.g;
        if (true == jyc.b(i5, 0)) {
            i5 = 66305;
        }
        int i6 = i5;
        int i7 = jmkVar.h;
        boolean b = jxy.b(i7, Integer.MIN_VALUE);
        jyv jyvVar = jmkVar.i;
        if (jyvVar == null) {
            jyvVar = jyv.a;
        }
        return new jpo(jouVar2, new jmk(i3, i2, j8, jytVar2, jmoVar, jyhVar, i6, true == b ? 1 : i7, jyvVar), jpoVar.d);
    }
}
