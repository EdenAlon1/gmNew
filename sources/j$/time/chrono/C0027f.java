package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalAmount;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* renamed from: j$.time.chrono.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
final class C0027f implements TemporalAmount, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    private final Chronology a;
    final int b;
    final int c;
    final int d;

    static {
        j$.desugar.sun.nio.fs.g.b(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    C0027f(Chronology chronology, int i, int i2, int i3) {
        this.a = chronology;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private long a() {
        j$.time.temporal.o Q = this.a.Q(ChronoField.MONTH_OF_YEAR);
        if (Q.g() && Q.h()) {
            return (Q.d() - Q.e()) + 1;
        }
        return -1L;
    }

    private void b(Temporal temporal) {
        Chronology chronology = (Chronology) temporal.D(j$.time.temporal.j.e());
        if (chronology != null) {
            Chronology chronology2 = this.a;
            if (!chronology2.equals(chronology)) {
                throw new DateTimeException(j$.time.d.d("Chronology mismatch, expected: ", chronology2.n(), ", actual: ", chronology.n()));
            }
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0027f) {
            C0027f c0027f = (C0027f) obj;
            if (this.b == c0027f.b && this.c == c0027f.c && this.d == c0027f.d && this.a.equals(c0027f.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal o(Temporal temporal) {
        b(temporal);
        int i = this.b;
        int i2 = this.c;
        if (i2 != 0) {
            long a = a();
            if (a > 0) {
                temporal = temporal.d((i * a) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    temporal = temporal.d(i, ChronoUnit.YEARS);
                }
                temporal = temporal.d(i2, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            temporal = temporal.d(i, ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? temporal.d(i3, ChronoUnit.DAYS) : temporal;
    }

    public final String toString() {
        Chronology chronology = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 == 0 && i2 == 0 && i == 0) {
            return chronology.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(chronology.toString());
        sb.append(" P");
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('D');
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAmount
    public final Temporal u(Instant instant) {
        b(instant);
        int i = this.b;
        int i2 = this.c;
        if (i2 != 0) {
            long a = a();
            if (a > 0) {
                instant = instant.o((i * a) + i2, ChronoUnit.MONTHS);
            } else {
                if (i != 0) {
                    instant = instant.o(i, ChronoUnit.YEARS);
                }
                instant = instant.o(i2, ChronoUnit.MONTHS);
            }
        } else if (i != 0) {
            instant = instant.o(i, ChronoUnit.YEARS);
        }
        int i3 = this.d;
        return i3 != 0 ? instant.o(i3, ChronoUnit.DAYS) : instant;
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.a.n());
        objectOutput.writeInt(this.b);
        objectOutput.writeInt(this.c);
        objectOutput.writeInt(this.d);
    }

    protected Object writeReplace() {
        return new D((byte) 9, this);
    }
}
