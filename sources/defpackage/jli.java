package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jli {
    public int a;
    private final Object b;
    private final int c;
    private final String d;

    public jli(Object obj, int i, int i2, String str) {
        this.b = obj;
        this.c = i;
        this.a = i2;
        this.d = str;
    }

    public final jlk a(int i) {
        int i2 = this.a;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (i == Integer.MIN_VALUE) {
            jwo.c("Item.end should be set first");
        }
        return new jlk(this.b, this.c, i, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jli)) {
            return false;
        }
        jli jliVar = (jli) obj;
        return ffkj.e(this.b, jliVar.b) && this.c == jliVar.c && this.a == jliVar.a && ffkj.e(this.d, jliVar.d);
    }

    public final int hashCode() {
        Object obj = this.b;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.c) * 31) + this.a) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "MutableRange(item=" + this.b + ", start=" + this.c + ", end=" + this.a + ", tag=" + this.d + ')';
    }

    public /* synthetic */ jli(Object obj, int i, int i2, String str, int i3) {
        this(obj, i, (i3 & 4) != 0 ? Integer.MIN_VALUE : i2, (i3 & 8) != 0 ? "" : str);
    }
}
