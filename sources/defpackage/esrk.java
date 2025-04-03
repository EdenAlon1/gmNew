package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esrk {
    public final String a;
    public final String b;
    public final String c;

    public esrk(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        if (str2.length() <= 0) {
            throw new IllegalStateException("Header name must not be empty.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esrk)) {
            return false;
        }
        esrk esrkVar = (esrk) obj;
        return ffkj.e(this.a, esrkVar.a) && ffkj.e(this.b, esrkVar.b) && ffkj.e(this.c, esrkVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Header(namespace=" + this.a + ", name=" + this.b + ", value=" + this.c + ")";
    }
}
