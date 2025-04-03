package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import j$.time.temporal.TemporalUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* loaded from: classes9.dex */
public final class Duration implements TemporalAmount, Comparable<Duration>, Serializable {
    public static final Duration ZERO = new Duration(0, 0);
    private static final BigInteger c = BigInteger.valueOf(1000000000);
    private static final long serialVersionUID = 3078945930695997490L;
    private final long a;
    private final int b;

    private Duration(long j, int i) {
        this.a = j;
        this.b = i;
    }

    private Duration D(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return ofSeconds(b.c(b.c(this.a, j), j2 / 1000000000), this.b + (j2 % 1000000000));
    }

    private BigDecimal G() {
        return BigDecimal.valueOf(this.a).add(BigDecimal.valueOf(this.b, 9));
    }

    public static Duration between(Temporal temporal, Temporal temporal2) {
        try {
            return ofNanos(temporal.e(temporal2, ChronoUnit.NANOS));
        } catch (DateTimeException | ArithmeticException unused) {
            long e = temporal.e(temporal2, ChronoUnit.SECONDS);
            long j = 0;
            try {
                ChronoField chronoField = ChronoField.NANO_OF_SECOND;
                long y = temporal2.y(chronoField) - temporal.y(chronoField);
                if (e > 0 && y < 0) {
                    e++;
                } else if (e < 0 && y > 0) {
                    e--;
                }
                j = y;
            } catch (DateTimeException unused2) {
            }
            return ofSeconds(e, j);
        }
    }

    public static Duration of(long j, TemporalUnit temporalUnit) {
        Duration duration = ZERO;
        duration.getClass();
        Objects.a(temporalUnit, "unit");
        if (temporalUnit == ChronoUnit.DAYS) {
            return duration.D(b.d(j, 86400), 0L);
        }
        if (temporalUnit.u()) {
            throw new j$.time.temporal.n("Unit must not have an estimated duration");
        }
        if (j == 0) {
            return duration;
        }
        if (temporalUnit instanceof ChronoUnit) {
            int i = c.a[((ChronoUnit) temporalUnit).ordinal()];
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? duration.plusSeconds(b.d(temporalUnit.getDuration().a, j)) : duration.plusSeconds(j) : duration.plusMillis(j) : duration.plusSeconds((j / 1000000000) * 1000).plusNanos((j % 1000000000) * 1000) : duration.plusNanos(j);
        }
        return duration.plusSeconds(temporalUnit.getDuration().multipliedBy(j).getSeconds()).plusNanos(r7.getNano());
    }

    public static Duration ofDays(long j) {
        return v(b.d(j, 86400), 0);
    }

    public static Duration ofHours(long j) {
        return v(b.d(j, 3600), 0);
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i = (int) (j % 1000);
        if (i < 0) {
            i += 1000;
            j2--;
        }
        return v(j2, i * 1000000);
    }

    public static Duration ofMinutes(long j) {
        return v(b.d(j, 60), 0);
    }

    public static Duration ofNanos(long j) {
        long j2 = j / 1000000000;
        int i = (int) (j % 1000000000);
        if (i < 0) {
            i = (int) (i + 1000000000);
            j2--;
        }
        return v(j2, i);
    }

    public static Duration ofSeconds(long j) {
        return v(j, 0);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private static Duration v(long j, int i) {
        return (((long) i) | j) == 0 ? ZERO : new Duration(j, i);
    }

    private Object writeReplace() {
        return new m((byte) 1, this);
    }

    private static Duration y(BigDecimal bigDecimal) {
        BigInteger bigIntegerExact = bigDecimal.movePointRight(9).toBigIntegerExact();
        BigInteger[] divideAndRemainder = bigIntegerExact.divideAndRemainder(c);
        if (divideAndRemainder[0].bitLength() <= 63) {
            return ofSeconds(divideAndRemainder[0].longValue(), divideAndRemainder[1].intValue());
        }
        throw new ArithmeticException("Exceeds capacity of Duration: ".concat(String.valueOf(bigIntegerExact)));
    }

    public Duration abs() {
        return isNegative() ? multipliedBy(-1L) : this;
    }

    public Duration dividedBy(long j) {
        if (j != 0) {
            return j == 1 ? this : y(G().divide(BigDecimal.valueOf(j), RoundingMode.DOWN));
        }
        throw new ArithmeticException("Cannot divide by zero");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.a == duration.a && this.b == duration.b) {
                return true;
            }
        }
        return false;
    }

    public int getNano() {
        return this.b;
    }

    public long getSeconds() {
        return this.a;
    }

    public int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public boolean isNegative() {
        return this.a < 0;
    }

    public boolean isZero() {
        return (((long) this.b) | this.a) == 0;
    }

    public Duration minus(Duration duration) {
        long seconds = duration.getSeconds();
        int nano = duration.getNano();
        return seconds == Long.MIN_VALUE ? D(Long.MAX_VALUE, -nano).D(1L, 0L) : D(-seconds, -nano);
    }

    public Duration minusMillis(long j) {
        return j == Long.MIN_VALUE ? plusMillis(Long.MAX_VALUE).plusMillis(1L) : plusMillis(-j);
    }

    public Duration multipliedBy(long j) {
        return j == 0 ? ZERO : j == 1 ? this : y(G().multiply(BigDecimal.valueOf(j)));
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal o(Temporal temporal) {
        long j = this.a;
        if (j != 0) {
            temporal = temporal.d(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        return i != 0 ? temporal.d(i, ChronoUnit.NANOS) : temporal;
    }

    public Duration plus(Duration duration) {
        return D(duration.getSeconds(), duration.getNano());
    }

    public Duration plusMillis(long j) {
        return D(j / 1000, (j % 1000) * 1000000);
    }

    public Duration plusNanos(long j) {
        return D(0L, j);
    }

    public Duration plusSeconds(long j) {
        return D(j, 0L);
    }

    public long toDays() {
        return this.a / 86400;
    }

    public long toHours() {
        return this.a / 3600;
    }

    public long toMillis() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return b.c(b.d(j2, 1000), j / 1000000);
    }

    public long toMinutes() {
        return this.a / 60;
    }

    public int toMinutesPart() {
        return (int) (toMinutes() % 60);
    }

    public long toNanos() {
        long j = this.b;
        long j2 = this.a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return b.c(b.d(j2, 1000000000L), j);
    }

    public long toSeconds() {
        return this.a;
    }

    public int toSecondsPart() {
        return (int) (this.a % 60);
    }

    public String toString() {
        if (this == ZERO) {
            return "PT0S";
        }
        long j = this.a;
        int i = this.b;
        long j2 = (j >= 0 || i <= 0) ? j : 1 + j;
        long j3 = j2 / 3600;
        int i2 = (int) ((j2 % 3600) / 60);
        int i3 = (int) (j2 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i3 == 0 && i == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j >= 0 || i <= 0) {
            sb.append(i3);
        } else if (i3 == 0) {
            sb.append("-0");
        } else {
            sb.append(i3);
        }
        if (i > 0) {
            int length = sb.length();
            if (j < 0) {
                sb.append(2000000000 - i);
            } else {
                sb.append(i + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal u(Instant instant) {
        long j = this.a;
        if (j != 0) {
            instant = instant.o(j, ChronoUnit.SECONDS);
        }
        int i = this.b;
        return i != 0 ? instant.o(i, ChronoUnit.NANOS) : instant;
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeLong(this.a);
        objectOutput.writeInt(this.b);
    }

    public static Duration ofSeconds(long j, long j2) {
        return v(b.c(j, j$.nio.file.attribute.p.f(j2, 1000000000L)), (int) j$.nio.file.attribute.p.g(j2, 1000000000L));
    }

    @Override // java.lang.Comparable
    public int compareTo(Duration duration) {
        int compare = Long.compare(this.a, duration.a);
        return compare != 0 ? compare : this.b - duration.b;
    }

    public long dividedBy(Duration duration) {
        Objects.a(duration, "divisor");
        return G().divideToIntegralValue(duration.G()).longValueExact();
    }
}
