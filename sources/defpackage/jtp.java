package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jtp {
    public final jsf a;
    public final jsy b;
    public final int c;
    public final int d;
    public final Object e = null;

    public jtp(jsf jsfVar, jsy jsyVar, int i, int i2) {
        this.a = jsfVar;
        this.b = jsyVar;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jtp)) {
            return false;
        }
        jtp jtpVar = (jtp) obj;
        if (!ffkj.e(this.a, jtpVar.a) || !ffkj.e(this.b, jtpVar.b) || !jss.b(this.c, jtpVar.c) || !jst.b(this.d, jtpVar.d)) {
            return false;
        }
        Object obj2 = jtpVar.e;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        jsf jsfVar = this.a;
        return (((((((jsfVar == null ? 0 : jsfVar.hashCode()) * 31) + this.b.i) * 31) + this.c) * 31) + this.d) * 31;
    }

    public final String toString() {
        return "TypefaceRequest(fontFamily=" + this.a + ", fontWeight=" + this.b + ", fontStyle=" + ((Object) jss.a(this.c)) + ", fontSynthesis=" + ((Object) jst.a(this.d)) + ", resourceLoaderCacheKey=null)";
    }
}
