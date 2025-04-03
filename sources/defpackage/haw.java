package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class haw {
    public final String a;
    public final char b;
    public final String c;

    public haw(String str, char c) {
        this.a = str;
        this.b = c;
        this.c = ffpc.q(str, String.valueOf(c), "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof haw)) {
            return false;
        }
        haw hawVar = (haw) obj;
        return ffkj.e(this.a, hawVar.a) && this.b == hawVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }

    public final String toString() {
        return "DateInputFormat(patternWithDelimiters=" + this.a + ", delimiter=" + this.b + ')';
    }
}
