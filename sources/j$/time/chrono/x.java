package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class x implements l, Serializable {
    public static final x d;
    private static final x[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    private final transient int a;
    private final transient LocalDate b;
    private final transient String c;

    static {
        x xVar = new x(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = xVar;
        e = new x[]{xVar, new x(0, LocalDate.of(1912, 7, 30), "Taisho"), new x(1, LocalDate.of(1926, 12, 25), "Showa"), new x(2, LocalDate.of(1989, 1, 8), "Heisei"), new x(3, LocalDate.of(2019, 5, 1), "Reiwa")};
    }

    private x(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    static x g(LocalDate localDate) {
        if (localDate.f0(w.d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 are not supported");
        }
        x[] xVarArr = e;
        for (int length = xVarArr.length - 1; length >= 0; length--) {
            x xVar = xVarArr[length];
            if (localDate.compareTo((ChronoLocalDate) xVar.b) >= 0) {
                return xVar;
            }
        }
        return null;
    }

    static x h() {
        return e[r0.length - 1];
    }

    public static x p(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            x[] xVarArr = e;
            if (i2 < xVarArr.length) {
                return xVarArr[i2];
            }
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    static long r() {
        long f = ChronoField.DAY_OF_YEAR.o().f();
        for (x xVar : e) {
            f = Math.min(f, (xVar.b.U() - xVar.b.d0()) + 1);
            if (xVar.n() != null) {
                f = Math.min(f, xVar.n().b.d0() - 1);
            }
        }
        return f;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    static long s() {
        int year = 1000000000 - h().b.getYear();
        x[] xVarArr = e;
        int year2 = xVarArr[0].b.getYear();
        for (int i = 1; i < xVarArr.length; i++) {
            x xVar = xVarArr[i];
            year = Math.min(year, (xVar.b.getYear() - year2) + 1);
            year2 = xVar.b.getYear();
        }
        return year;
    }

    public static x[] t() {
        x[] xVarArr = e;
        return (x[]) Arrays.copyOf(xVarArr, xVarArr.length);
    }

    private Object writeReplace() {
        return new D((byte) 5, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object D(j$.time.temporal.m mVar) {
        return AbstractC0028g.m(this, mVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final Temporal G(Temporal temporal) {
        return temporal.c(getValue(), ChronoField.ERA);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean f(TemporalField temporalField) {
        return AbstractC0028g.i(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return AbstractC0028g.f(this, temporalField);
    }

    @Override // j$.time.chrono.l
    public final int getValue() {
        return this.a;
    }

    final LocalDate m() {
        return this.b;
    }

    final x n() {
        if (this == h()) {
            return null;
        }
        return p(this.a + 1);
    }

    public final String toString() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o v(TemporalField temporalField) {
        ChronoField chronoField = ChronoField.ERA;
        return temporalField == chronoField ? u.e.Q(chronoField) : j$.time.temporal.j.d(this, temporalField);
    }

    final void w(DataOutput dataOutput) {
        dataOutput.writeByte(this.a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long y(TemporalField temporalField) {
        return AbstractC0028g.g(this, temporalField);
    }
}
