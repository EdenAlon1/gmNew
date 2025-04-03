package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jmm {
    public final long a;
    public final long b;
    public final int c;

    public jmm(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
        this.c = i;
        if (kak.b(j) == 0) {
            jwo.b("width cannot be TextUnit.Unspecified");
        }
        if (kak.b(j2) == 0) {
            jwo.b("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmm)) {
            return false;
        }
        jmm jmmVar = (jmm) obj;
        return kak.e(this.a, jmmVar.a) && kak.e(this.b, jmmVar.b) && jmn.a(this.c, jmmVar.c);
    }

    public final int hashCode() {
        long j = kak.a;
        return (((kaj.a(this.a) * 31) + kaj.a(this.b)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Placeholder(width=");
        sb.append((Object) kak.d(this.a));
        sb.append(", height=");
        sb.append((Object) kak.d(this.b));
        sb.append(", placeholderVerticalAlign=");
        int i = this.c;
        sb.append((Object) (jmn.a(i, 1) ? "AboveBaseline" : jmn.a(i, 2) ? "Top" : jmn.a(i, 3) ? "Bottom" : jmn.a(i, 4) ? "Center" : jmn.a(i, 5) ? "TextTop" : jmn.a(i, 6) ? "TextBottom" : jmn.a(i, 7) ? "TextCenter" : "Invalid"));
        sb.append(')');
        return sb.toString();
    }
}
