package defpackage;

/* compiled from: PG */
@ffiv
/* loaded from: classes.dex */
public final class jyc {
    public final int a;

    public static String a(int i) {
        StringBuilder sb = new StringBuilder("LineBreak(strategy=");
        int a = jyd.a(i);
        String str = "Invalid";
        sb.append((Object) (jxz.a(a, 1) ? "Strategy.Simple" : jxz.a(a, 2) ? "Strategy.HighQuality" : jxz.a(a, 3) ? "Strategy.Balanced" : jxz.a(a, 0) ? "Strategy.Unspecified" : "Invalid"));
        sb.append(", strictness=");
        int b = jyd.b(i);
        sb.append((Object) (jya.a(b, 1) ? "Strictness.None" : jya.a(b, 2) ? "Strictness.Loose" : jya.a(b, 3) ? "Strictness.Normal" : jya.a(b, 4) ? "Strictness.Strict" : jya.a(b, 0) ? "Strictness.Unspecified" : "Invalid"));
        sb.append(", wordBreak=");
        int c = jyd.c(i);
        if (jyb.a(c, 1)) {
            str = "WordBreak.None";
        } else if (jyb.a(c, 2)) {
            str = "WordBreak.Phrase";
        } else if (jyb.a(c, 0)) {
            str = "WordBreak.Unspecified";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }

    public static final boolean b(int i, int i2) {
        return i == i2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof jyc) && this.a == ((jyc) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return a(this.a);
    }
}
