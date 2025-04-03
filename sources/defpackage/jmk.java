package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmk implements jlg {
    public final int a;
    public final int b;
    public final long c;
    public final jyt d;
    public final jmo e;
    public final jyh f;
    public final int g;
    public final int h;
    public final jyv i;

    public jmk(int i, int i2, long j, jyt jytVar, jmo jmoVar, jyh jyhVar, int i3, int i4, jyv jyvVar) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = jytVar;
        this.e = jmoVar;
        this.f = jyhVar;
        this.g = i3;
        this.h = i4;
        this.i = jyvVar;
        if (kak.e(j, kak.a) || kak.a(j) >= 0.0f) {
            return;
        }
        jwo.c("lineHeight can't be negative (" + kak.a(j) + ')');
    }

    public final jmk a(jmk jmkVar) {
        return jmkVar == null ? this : jml.a(this, jmkVar.a, jmkVar.b, jmkVar.c, jmkVar.d, jmkVar.e, jmkVar.f, jmkVar.g, jmkVar.h, jmkVar.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmk)) {
            return false;
        }
        jmk jmkVar = (jmk) obj;
        return jyj.b(this.a, jmkVar.a) && jyl.b(this.b, jmkVar.b) && kak.e(this.c, jmkVar.c) && ffkj.e(this.d, jmkVar.d) && ffkj.e(this.e, jmkVar.e) && ffkj.e(this.f, jmkVar.f) && jyc.b(this.g, jmkVar.g) && jxy.b(this.h, jmkVar.h) && ffkj.e(this.i, jmkVar.i);
    }

    public final int hashCode() {
        long j = kak.a;
        jyt jytVar = this.d;
        int hashCode = jytVar != null ? jytVar.hashCode() : 0;
        int i = this.a;
        long j2 = this.c;
        int i2 = this.b;
        jmo jmoVar = this.e;
        int hashCode2 = jmoVar != null ? jmoVar.hashCode() : 0;
        int a = (((((i * 31) + i2) * 31) + kaj.a(j2)) * 31) + hashCode;
        jyh jyhVar = this.f;
        int hashCode3 = ((((((((a * 31) + hashCode2) * 31) + (jyhVar != null ? jyhVar.hashCode() : 0)) * 31) + this.g) * 31) + this.h) * 31;
        jyv jyvVar = this.i;
        return hashCode3 + (jyvVar != null ? jyvVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) jyj.a(this.a)) + ", textDirection=" + ((Object) jyl.a(this.b)) + ", lineHeight=" + ((Object) kak.d(this.c)) + ", textIndent=" + this.d + ", platformStyle=" + this.e + ", lineHeightStyle=" + this.f + ", lineBreak=" + ((Object) jyc.a(this.g)) + ", hyphens=" + ((Object) jxy.a(this.h)) + ", textMotion=" + this.i + ')';
    }
}
