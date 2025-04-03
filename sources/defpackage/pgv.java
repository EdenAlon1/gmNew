package defpackage;

import java.math.BigInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class pgv implements Comparable {
    public static final pgv a;
    public final int b;
    public final int c;
    public final int d;
    private final String e;
    private final ffbz f = ffca.a(new pgu(this));

    static {
        new pgv(0, 0, 0, "");
        a = new pgv(0, 1, 0, "");
        new pgv(1, 0, 0, "");
    }

    public pgv(int i, int i2, int i3, String str) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = str;
    }

    private final BigInteger b() {
        Object a2 = this.f.a();
        a2.getClass();
        return (BigInteger) a2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(pgv pgvVar) {
        pgvVar.getClass();
        return b().compareTo(pgvVar.b());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof pgv)) {
            return false;
        }
        pgv pgvVar = (pgv) obj;
        return this.b == pgvVar.b && this.c == pgvVar.c && this.d == pgvVar.d;
    }

    public final int hashCode() {
        return ((((this.b + 527) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        String str;
        if (ffpc.J(this.e)) {
            str = "";
        } else {
            str = "-" + this.e;
        }
        return this.b + '.' + this.c + '.' + this.d + str;
    }
}
