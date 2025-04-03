package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes9.dex */
final class g extends k {
    private final boolean g;

    g(ChronoField chronoField, int i, int i2, boolean z) {
        this(chronoField, i, i2, z, 0);
        Objects.a(chronoField, "field");
        if (!chronoField.o().g()) {
            throw new IllegalArgumentException("Field must have a fixed set of values: ".concat(String.valueOf(chronoField)));
        }
        if (i < 0 || i > 9) {
            throw new IllegalArgumentException("Minimum width must be from 0 to 9 inclusive but was " + i);
        }
        if (i2 < 1 || i2 > 9) {
            throw new IllegalArgumentException("Maximum width must be from 1 to 9 inclusive but was " + i2);
        }
        if (i2 >= i) {
            return;
        }
        throw new IllegalArgumentException("Maximum width must exceed or equal the minimum width but " + i2 + " < " + i);
    }

    @Override // j$.time.format.k
    final boolean c(w wVar) {
        return wVar.l() && this.b == this.c && !this.g;
    }

    @Override // j$.time.format.k
    final k e() {
        if (this.e == -1) {
            return this;
        }
        return new g(this.a, this.b, this.c, this.g, -1);
    }

    @Override // j$.time.format.k
    final k f(int i) {
        return new g(this.a, this.b, this.c, this.g, this.e + i);
    }

    @Override // j$.time.format.k, j$.time.format.InterfaceC0036f
    public final boolean o(y yVar, StringBuilder sb) {
        TemporalField temporalField = this.a;
        Long e = yVar.e(temporalField);
        if (e == null) {
            return false;
        }
        DecimalStyle b = yVar.b();
        long longValue = e.longValue();
        j$.time.temporal.o o = temporalField.o();
        o.b(longValue, temporalField);
        BigDecimal valueOf = BigDecimal.valueOf(o.e());
        BigDecimal add = BigDecimal.valueOf(o.d()).subtract(valueOf).add(BigDecimal.ONE);
        BigDecimal subtract = BigDecimal.valueOf(longValue).subtract(valueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal divide = subtract.divide(add, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (divide.compareTo(bigDecimal) != 0) {
            bigDecimal = divide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : divide.stripTrailingZeros();
        }
        int scale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (scale != 0) {
            String a = b.a(bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2));
            if (z) {
                sb.append(b.c());
            }
            sb.append(a);
            return true;
        }
        if (i <= 0) {
            return true;
        }
        if (z) {
            sb.append(b.c());
        }
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(b.e());
        }
        return true;
    }

    @Override // j$.time.format.k
    public final String toString() {
        String str = this.g ? ",DecimalPoint" : "";
        return "Fraction(" + String.valueOf(this.a) + "," + this.b + "," + this.c + str + ")";
    }

    @Override // j$.time.format.k, j$.time.format.InterfaceC0036f
    public final int u(w wVar, CharSequence charSequence, int i) {
        int i2 = (wVar.l() || c(wVar)) ? this.b : 0;
        int i3 = (wVar.l() || c(wVar)) ? this.c : 9;
        int length = charSequence.length();
        if (i != length) {
            if (this.g) {
                if (charSequence.charAt(i) == wVar.g().c()) {
                    i++;
                } else if (i2 > 0) {
                    return ~i;
                }
            }
            int i4 = i;
            int i5 = i2 + i4;
            if (i5 > length) {
                return ~i4;
            }
            int min = Math.min(i3 + i4, length);
            int i6 = i4;
            int i7 = 0;
            while (true) {
                if (i6 >= min) {
                    break;
                }
                int i8 = i6 + 1;
                int b = wVar.g().b(charSequence.charAt(i6));
                if (b >= 0) {
                    i7 = (i7 * 10) + b;
                    i6 = i8;
                } else if (i8 < i5) {
                    return ~i4;
                }
            }
            BigDecimal movePointLeft = new BigDecimal(i7).movePointLeft(i6 - i4);
            j$.time.temporal.o o = this.a.o();
            BigDecimal valueOf = BigDecimal.valueOf(o.e());
            return wVar.o(this.a, movePointLeft.multiply(BigDecimal.valueOf(o.d()).subtract(valueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(valueOf).longValueExact(), i4, i6);
        }
        if (i2 > 0) {
            return ~i;
        }
        return i;
    }

    g(TemporalField temporalField, int i, int i2, boolean z, int i3) {
        super(temporalField, i, i2, E.NOT_NEGATIVE, i3);
        this.g = z;
    }
}
