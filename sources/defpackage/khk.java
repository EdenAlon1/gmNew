package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public class khk implements Cloneable {
    private final char[] a;
    protected long b = -1;
    protected long c = Long.MAX_VALUE;
    protected khj d;
    private int e;

    public khk(char[] cArr) {
        this.a = cArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khk)) {
            return false;
        }
        khk khkVar = (khk) obj;
        if (this.b != khkVar.b || this.c != khkVar.c) {
            return false;
        }
        int i = khkVar.e;
        if (Arrays.equals(this.a, khkVar.a)) {
            return Objects.equals(this.d, khkVar.d);
        }
        return false;
    }

    @Override // 
    public khk g() {
        try {
            return (khk) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.a) * 31;
        long j = this.b;
        long j2 = j ^ (j >>> 32);
        long j3 = this.c;
        long j4 = j3 ^ (j3 >>> 32);
        khj khjVar = this.d;
        return (((((hashCode + ((int) j2)) * 31) + ((int) j4)) * 31) + (khjVar != null ? khjVar.hashCode() : 0)) * 31;
    }

    public float t() {
        if (this instanceof khm) {
            return ((khm) this).t();
        }
        return Float.NaN;
    }

    public String toString() {
        long j = this.b;
        long j2 = this.c;
        if (j > j2 || j2 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.b + "-" + this.c + ")";
        }
        return w() + " (" + this.b + " : " + this.c + ") <<" + new String(this.a).substring((int) j, ((int) j2) + 1) + ">>";
    }

    public int u() {
        if (this instanceof khm) {
            return ((khm) this).u();
        }
        return 0;
    }

    public final String v() {
        String str = new String(this.a);
        if (str.length() <= 0) {
            return "";
        }
        long j = this.c;
        if (j != Long.MAX_VALUE) {
            long j2 = this.b;
            if (j >= j2) {
                return str.substring((int) j2, ((int) j) + 1);
            }
        }
        int i = (int) this.b;
        return str.substring(i, i + 1);
    }

    public final String w() {
        String cls = getClass().toString();
        return cls.substring(cls.lastIndexOf(46) + 1);
    }

    public final void x(long j) {
        if (this.c != Long.MAX_VALUE) {
            return;
        }
        this.c = j;
        khj khjVar = this.d;
        if (khjVar != null) {
            khjVar.q(this);
        }
    }

    public final boolean y() {
        char[] cArr = this.a;
        return cArr != null && cArr.length > 0;
    }

    public final void z() {
        this.b = 0L;
    }
}
