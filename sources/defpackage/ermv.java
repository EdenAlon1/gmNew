package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ermv extends Number implements Comparable {
    public static final /* synthetic */ int b = 0;
    public final long a;

    static {
        new ermv(0L);
        new ermv(1L);
        new ermv(-1L);
    }

    public ermv(long j) {
        this.a = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        ermv ermvVar = (ermv) obj;
        ermvVar.getClass();
        return ermw.a(this.a, ermvVar.a);
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        long j = this.a;
        if (j >= 0) {
            return j;
        }
        double d = (j & 1) | (j >>> 1);
        return d + d;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ermv) && this.a == ((ermv) obj).a;
    }

    @Override // java.lang.Number
    public final float floatValue() {
        long j = this.a;
        if (j >= 0) {
            return j;
        }
        float f = (j & 1) | (j >>> 1);
        return f + f;
    }

    public final int hashCode() {
        return ermr.a(this.a);
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) this.a;
    }

    @Override // java.lang.Number
    public final long longValue() {
        return this.a;
    }

    public final String toString() {
        emxf.d(true, "radix (%s) must be between Character.MIN_RADIX and Character.MAX_RADIX", 10);
        long j = this.a;
        if (j == 0) {
            return "0";
        }
        if (j > 0) {
            return Long.toString(j, 10);
        }
        long j2 = (j >>> 1) / 5;
        char[] cArr = new char[64];
        int i = 63;
        cArr[63] = Character.forDigit((int) (j - (j2 * 10)), 10);
        while (j2 > 0) {
            i--;
            cArr[i] = Character.forDigit((int) (j2 % 10), 10);
            j2 /= 10;
        }
        return new String(cArr, i, 64 - i);
    }
}
