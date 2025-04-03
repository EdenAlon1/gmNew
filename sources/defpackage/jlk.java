package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jlk {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public jlk(Object obj, int i, int i2) {
        this(obj, i, i2, "");
    }

    public static /* synthetic */ jlk a(jlk jlkVar, Object obj, int i, int i2) {
        if ((i2 & 1) != 0) {
            obj = jlkVar.a;
        }
        int i3 = (i2 & 2) != 0 ? jlkVar.b : 0;
        if ((i2 & 4) != 0) {
            i = jlkVar.c;
        }
        return new jlk(obj, i3, i, jlkVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlk)) {
            return false;
        }
        jlk jlkVar = (jlk) obj;
        return ffkj.e(this.a, jlkVar.a) && this.b == jlkVar.b && this.c == jlkVar.c && ffkj.e(this.d, jlkVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
    }

    public jlk(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        jwo.b("Reversed range is not supported");
    }
}
