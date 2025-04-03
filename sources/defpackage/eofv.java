package defpackage;

import j$.time.Duration;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eofv extends eofx {
    final int a;
    final Duration b;
    final double c;

    public eofv(Duration duration, double d, int i) {
        this.a = eofx.c(i);
        int i2 = erne.a;
        emxf.f((duration.isNegative() || duration.isZero()) ? false : true, "duration (%s) must be positive", duration);
        this.b = duration;
        emxf.i(d > eobe.a, "%s (%s) must be > 0", "multiplier", Double.valueOf(d));
        this.c = d;
    }

    @Override // defpackage.eofx
    public final Duration a(int i) {
        return i == 0 ? Duration.ZERO : !b(i) ? eofx.d : Duration.ofNanos((long) (erne.b(this.b) * Math.pow(this.c, i - 1)));
    }

    @Override // defpackage.eofx
    public final boolean b(int i) {
        emxf.h(r3 >= 0, "%s (%s) must be >= 0", "tries", i);
        return i < this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof eofv) {
            eofv eofvVar = (eofv) obj;
            if (this.b.equals(eofvVar.b) && this.c == eofvVar.c && this.a == eofvVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, Double.valueOf(this.c)});
    }
}
