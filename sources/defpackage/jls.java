package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jls {
    private final jpf a;

    public jls(jpf jpfVar) {
        this.a = jpfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jls)) {
            return false;
        }
        jpf jpfVar = this.a;
        jls jlsVar = (jls) obj;
        if (ffkj.e(jpfVar.a, jlsVar.a.a) && jpfVar.b.x(jlsVar.a.b) && ffkj.e(jpfVar.c, jlsVar.a.c)) {
            int i = jpfVar.d;
            jpf jpfVar2 = jlsVar.a;
            if (i == jpfVar2.d && jpfVar.e == jpfVar2.e && jyw.a(jpfVar.f, jpfVar2.f) && ffkj.e(jpfVar.g, jpfVar2.g)) {
                kah kahVar = jpfVar.h;
                jpf jpfVar3 = jlsVar.a;
                return kahVar == jpfVar3.h && jpfVar.i == jpfVar3.i && jzk.g(jpfVar.j, jpfVar3.j);
            }
        }
        return false;
    }

    public final int hashCode() {
        jpf jpfVar = this.a;
        int hashCode = jpfVar.a.hashCode() * 31;
        jpo jpoVar = jpfVar.b;
        jou jouVar = jpoVar.b;
        long j = jouVar.b;
        jsy jsyVar = jouVar.c;
        long j2 = kak.a;
        int a = ((kaj.a(j) * 31) + (jsyVar != null ? jsyVar.i : 0)) * 31;
        jss jssVar = jouVar.d;
        int i = (a + (jssVar != null ? jssVar.a : 0)) * 31;
        jst jstVar = jouVar.e;
        int i2 = (i + (jstVar != null ? jstVar.a : 0)) * 31;
        jsf jsfVar = jouVar.f;
        int hashCode2 = (i2 + (jsfVar != null ? jsfVar.hashCode() : 0)) * 31;
        String str = jouVar.g;
        int hashCode3 = (((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + kaj.a(jouVar.h)) * 31;
        jxv jxvVar = jouVar.i;
        int floatToIntBits = (hashCode3 + (jxvVar != null ? Float.floatToIntBits(jxvVar.a) : 0)) * 31;
        jys jysVar = jouVar.j;
        int hashCode4 = (floatToIntBits + (jysVar != null ? jysVar.hashCode() : 0)) * 31;
        jws jwsVar = jouVar.k;
        int hashCode5 = (hashCode4 + (jwsVar != null ? jwsVar.hashCode() : 0)) * 31;
        long j3 = jouVar.l;
        long j4 = ibw.a;
        int a2 = (hashCode5 + ffco.a(j3)) * 31;
        jmp jmpVar = jouVar.o;
        int hashCode6 = (((a2 + (jmpVar != null ? jmpVar.hashCode() : 0)) * 31) + jpoVar.c.hashCode()) * 31;
        jmq jmqVar = jpoVar.d;
        return ((((((((((((((((hashCode + hashCode6 + (jmqVar != null ? jmqVar.hashCode() : 0)) * 31) + jpfVar.c.hashCode()) * 31) + jpfVar.d) * 31) + (true != jpfVar.e ? 1237 : 1231)) * 31) + jpfVar.f) * 31) + jpfVar.g.hashCode()) * 31) + jpfVar.h.hashCode()) * 31) + jpfVar.i.hashCode()) * 31) + jzi.a(jpfVar.j);
    }
}
