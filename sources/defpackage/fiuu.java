package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fiuu {
    final char a;
    final int b;
    final int c;
    final int d;
    final boolean e;
    final int f;

    public fiuu(char c, int i, int i2, int i3, boolean z, int i4) {
        if (c != 'u' && c != 'w' && c != 's') {
            throw new IllegalArgumentException("Unknown mode: " + c);
        }
        this.a = c;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    private final long d(firb firbVar, long j) {
        int i = this.c;
        if (i >= 0) {
            return ((fisa) firbVar).k.h(j, i);
        }
        fisa fisaVar = (fisa) firbVar;
        return fisaVar.k.e(fisaVar.m.e(fisaVar.k.h(j, 1), 1), this.c);
    }

    public final long a(firb firbVar, long j) {
        try {
            return d(firbVar, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                fisa fisaVar = (fisa) firbVar;
                if (fisaVar.n.t(j)) {
                    return d(firbVar, j);
                }
                j = fisaVar.n.e(j, 1);
            }
        }
    }

    public final long b(firb firbVar, long j) {
        try {
            return d(firbVar, j);
        } catch (IllegalArgumentException e) {
            if (this.b != 2 || this.c != 29) {
                throw e;
            }
            while (true) {
                fisa fisaVar = (fisa) firbVar;
                if (fisaVar.n.t(j)) {
                    return d(firbVar, j);
                }
                j = fisaVar.n.e(j, -1);
            }
        }
    }

    public final long c(firb firbVar, long j) {
        fisa fisaVar = (fisa) firbVar;
        int a = this.d - fisaVar.j.a(j);
        if (a == 0) {
            return j;
        }
        if (this.e) {
            if (a < 0) {
                a += 7;
            }
        } else if (a > 0) {
            a -= 7;
        }
        return fisaVar.j.e(j, a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fiuu) {
            fiuu fiuuVar = (fiuu) obj;
            if (this.a == fiuuVar.a && this.b == fiuuVar.b && this.c == fiuuVar.c && this.d == fiuuVar.d && this.e == fiuuVar.e && this.f == fiuuVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Character.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Integer.valueOf(this.f)});
    }

    public final String toString() {
        return "[OfYear]\nMode: " + this.a + "\nMonthOfYear: " + this.b + "\nDayOfMonth: " + this.c + "\nDayOfWeek: " + this.d + "\nAdvanceDayOfWeek: " + this.e + "\nMillisOfDay: " + this.f + "\n";
    }
}
