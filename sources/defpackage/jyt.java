package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jyt {
    public static final jyt a = new jyt(0L, 3);
    public final long b;
    public final long c;

    public jyt(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jyt)) {
            return false;
        }
        jyt jytVar = (jyt) obj;
        return kak.e(this.b, jytVar.b) && kak.e(this.c, jytVar.c);
    }

    public final int hashCode() {
        long j = kak.a;
        return (kaj.a(this.b) * 31) + kaj.a(this.c);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) kak.d(this.b)) + ", restLine=" + ((Object) kak.d(this.c)) + ')';
    }

    public /* synthetic */ jyt(long j, int i) {
        this((i & 1) != 0 ? kal.c(0) : 0L, (i & 2) != 0 ? kal.c(0) : j);
    }
}
