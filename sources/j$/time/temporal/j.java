package j$.time.temporal;

import j$.time.DateTimeException;
import j$.util.Objects;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class j {
    static final m a = new l(1);
    static final m b = new l(2);
    static final m c = new l(3);
    static final m d = new l(4);
    static final m e = new l(5);
    static final m f = new l(6);
    static final m g = new l(7);

    public static int a(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        o v = temporalAccessor.v(temporalField);
        if (!v.h()) {
            throw new n("Invalid field " + String.valueOf(temporalField) + " for get() method, use getLong() instead");
        }
        long y = temporalAccessor.y(temporalField);
        if (v.i(y)) {
            return (int) y;
        }
        throw new DateTimeException("Invalid value for " + String.valueOf(temporalField) + " (valid values " + String.valueOf(v) + "): " + y);
    }

    public static Temporal b(Temporal temporal, long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            temporal = temporal.d(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return temporal.d(j2, temporalUnit);
    }

    public static Object c(TemporalAccessor temporalAccessor, m mVar) {
        if (mVar == a || mVar == b || mVar == c) {
            return null;
        }
        return mVar.g(temporalAccessor);
    }

    public static o d(TemporalAccessor temporalAccessor, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            Objects.a(temporalField, "field");
            return temporalField.G(temporalAccessor);
        }
        if (temporalAccessor.f(temporalField)) {
            return ((ChronoField) temporalField).o();
        }
        throw new n("Unsupported field: ".concat(String.valueOf(temporalField)));
    }

    public static m e() {
        return b;
    }

    public static m f() {
        return f;
    }

    public static m g() {
        return g;
    }

    public static /* synthetic */ int h(int i) {
        int i2 = i % 7;
        if (i2 == 0) {
            return 0;
        }
        return (((i ^ 7) >> 31) | 1) > 0 ? i2 : i2 + 7;
    }

    public static m i() {
        return d;
    }

    public static m j() {
        return c;
    }

    public static m k() {
        return e;
    }

    public static m l() {
        return a;
    }
}
