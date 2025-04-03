package j$.time.format;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.Period;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes9.dex */
final class C implements TemporalAccessor {
    ZoneId b;
    Chronology c;
    boolean d;
    private D e;
    private ChronoLocalDate f;
    private LocalTime g;
    final HashMap a = new HashMap();
    Period h = Period.d;

    C() {
    }

    private void g(TemporalAccessor temporalAccessor) {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            TemporalField temporalField = (TemporalField) entry.getKey();
            if (temporalAccessor.f(temporalField)) {
                try {
                    long y = temporalAccessor.y(temporalField);
                    long longValue = ((Long) entry.getValue()).longValue();
                    if (y != longValue) {
                        throw new DateTimeException("Conflict found: Field " + String.valueOf(temporalField) + " " + y + " differs from " + String.valueOf(temporalField) + " " + longValue + " derived from " + String.valueOf(temporalAccessor));
                    }
                    it.remove();
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    private void m() {
        HashMap hashMap = this.a;
        if (hashMap.containsKey(ChronoField.INSTANT_SECONDS)) {
            ZoneId zoneId = this.b;
            if (zoneId != null) {
                n(zoneId);
                return;
            }
            Long l = (Long) hashMap.get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                n(ZoneOffset.ofTotalSeconds(l.intValue()));
            }
        }
    }

    private void n(ZoneId zoneId) {
        HashMap hashMap = this.a;
        ChronoField chronoField = ChronoField.INSTANT_SECONDS;
        t(this.c.R(Instant.ofEpochSecond(((Long) hashMap.remove(chronoField)).longValue()), zoneId).b());
        w(chronoField, ChronoField.SECOND_OF_DAY, Long.valueOf(r5.toLocalTime().s0()));
    }

    private void p(long j, long j2, long j3, long j4) {
        if (this.e == D.LENIENT) {
            long c = j$.time.b.c(j$.time.b.c(j$.time.b.c(j$.time.b.d(j, 3600000000000L), j$.time.b.d(j2, 60000000000L)), j$.time.b.d(j3, 1000000000L)), j4);
            s(LocalTime.j0(j$.nio.file.attribute.p.g(c, 86400000000000L)), Period.b((int) j$.nio.file.attribute.p.f(c, 86400000000000L)));
            return;
        }
        int a0 = ChronoField.MINUTE_OF_HOUR.a0(j2);
        int a02 = ChronoField.NANO_OF_SECOND.a0(j4);
        if (this.e == D.SMART && j == 24 && a0 == 0 && j3 == 0 && a02 == 0) {
            s(LocalTime.MIDNIGHT, Period.b(1));
        } else {
            s(LocalTime.i0(ChronoField.HOUR_OF_DAY.a0(j), a0, ChronoField.SECOND_OF_MINUTE.a0(j3), a02), Period.d);
        }
    }

    private void r() {
        HashMap hashMap = this.a;
        ChronoField chronoField = ChronoField.CLOCK_HOUR_OF_DAY;
        if (hashMap.containsKey(chronoField)) {
            long longValue = ((Long) hashMap.remove(chronoField)).longValue();
            D d = this.e;
            if (d == D.STRICT || (d == D.SMART && longValue != 0)) {
                chronoField.b0(longValue);
            }
            ChronoField chronoField2 = ChronoField.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            w(chronoField, chronoField2, Long.valueOf(longValue));
        }
        ChronoField chronoField3 = ChronoField.CLOCK_HOUR_OF_AMPM;
        if (hashMap.containsKey(chronoField3)) {
            long longValue2 = ((Long) hashMap.remove(chronoField3)).longValue();
            D d2 = this.e;
            if (d2 == D.STRICT || (d2 == D.SMART && longValue2 != 0)) {
                chronoField3.b0(longValue2);
            }
            w(chronoField3, ChronoField.HOUR_OF_AMPM, Long.valueOf(longValue2 != 12 ? longValue2 : 0L));
        }
        ChronoField chronoField4 = ChronoField.AMPM_OF_DAY;
        if (hashMap.containsKey(chronoField4)) {
            ChronoField chronoField5 = ChronoField.HOUR_OF_AMPM;
            if (hashMap.containsKey(chronoField5)) {
                long longValue3 = ((Long) hashMap.remove(chronoField4)).longValue();
                long longValue4 = ((Long) hashMap.remove(chronoField5)).longValue();
                if (this.e == D.LENIENT) {
                    w(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf(j$.time.b.c(j$.time.b.d(longValue3, 12), longValue4)));
                } else {
                    chronoField4.b0(longValue3);
                    chronoField5.b0(longValue3);
                    w(chronoField4, ChronoField.HOUR_OF_DAY, Long.valueOf((longValue3 * 12) + longValue4));
                }
            }
        }
        ChronoField chronoField6 = ChronoField.NANO_OF_DAY;
        if (hashMap.containsKey(chronoField6)) {
            long longValue5 = ((Long) hashMap.remove(chronoField6)).longValue();
            if (this.e != D.LENIENT) {
                chronoField6.b0(longValue5);
            }
            w(chronoField6, ChronoField.HOUR_OF_DAY, Long.valueOf(longValue5 / 3600000000000L));
            w(chronoField6, ChronoField.MINUTE_OF_HOUR, Long.valueOf((longValue5 / 60000000000L) % 60));
            w(chronoField6, ChronoField.SECOND_OF_MINUTE, Long.valueOf((longValue5 / 1000000000) % 60));
            w(chronoField6, ChronoField.NANO_OF_SECOND, Long.valueOf(longValue5 % 1000000000));
        }
        ChronoField chronoField7 = ChronoField.MICRO_OF_DAY;
        if (hashMap.containsKey(chronoField7)) {
            long longValue6 = ((Long) hashMap.remove(chronoField7)).longValue();
            if (this.e != D.LENIENT) {
                chronoField7.b0(longValue6);
            }
            w(chronoField7, ChronoField.SECOND_OF_DAY, Long.valueOf(longValue6 / 1000000));
            w(chronoField7, ChronoField.MICRO_OF_SECOND, Long.valueOf(longValue6 % 1000000));
        }
        ChronoField chronoField8 = ChronoField.MILLI_OF_DAY;
        if (hashMap.containsKey(chronoField8)) {
            long longValue7 = ((Long) hashMap.remove(chronoField8)).longValue();
            if (this.e != D.LENIENT) {
                chronoField8.b0(longValue7);
            }
            w(chronoField8, ChronoField.SECOND_OF_DAY, Long.valueOf(longValue7 / 1000));
            w(chronoField8, ChronoField.MILLI_OF_SECOND, Long.valueOf(longValue7 % 1000));
        }
        ChronoField chronoField9 = ChronoField.SECOND_OF_DAY;
        if (hashMap.containsKey(chronoField9)) {
            long longValue8 = ((Long) hashMap.remove(chronoField9)).longValue();
            if (this.e != D.LENIENT) {
                chronoField9.b0(longValue8);
            }
            w(chronoField9, ChronoField.HOUR_OF_DAY, Long.valueOf(longValue8 / 3600));
            w(chronoField9, ChronoField.MINUTE_OF_HOUR, Long.valueOf((longValue8 / 60) % 60));
            w(chronoField9, ChronoField.SECOND_OF_MINUTE, Long.valueOf(longValue8 % 60));
        }
        ChronoField chronoField10 = ChronoField.MINUTE_OF_DAY;
        if (hashMap.containsKey(chronoField10)) {
            long longValue9 = ((Long) hashMap.remove(chronoField10)).longValue();
            if (this.e != D.LENIENT) {
                chronoField10.b0(longValue9);
            }
            w(chronoField10, ChronoField.HOUR_OF_DAY, Long.valueOf(longValue9 / 60));
            w(chronoField10, ChronoField.MINUTE_OF_HOUR, Long.valueOf(longValue9 % 60));
        }
        ChronoField chronoField11 = ChronoField.NANO_OF_SECOND;
        if (hashMap.containsKey(chronoField11)) {
            long longValue10 = ((Long) hashMap.get(chronoField11)).longValue();
            D d3 = this.e;
            D d4 = D.LENIENT;
            if (d3 != d4) {
                chronoField11.b0(longValue10);
            }
            ChronoField chronoField12 = ChronoField.MICRO_OF_SECOND;
            if (hashMap.containsKey(chronoField12)) {
                long longValue11 = ((Long) hashMap.remove(chronoField12)).longValue();
                if (this.e != d4) {
                    chronoField12.b0(longValue11);
                }
                longValue10 = (longValue10 % 1000) + (longValue11 * 1000);
                w(chronoField12, chronoField11, Long.valueOf(longValue10));
            }
            ChronoField chronoField13 = ChronoField.MILLI_OF_SECOND;
            if (hashMap.containsKey(chronoField13)) {
                long longValue12 = ((Long) hashMap.remove(chronoField13)).longValue();
                if (this.e != d4) {
                    chronoField13.b0(longValue12);
                }
                w(chronoField13, chronoField11, Long.valueOf((longValue10 % 1000000) + (longValue12 * 1000000)));
            }
        }
        ChronoField chronoField14 = ChronoField.HOUR_OF_DAY;
        if (hashMap.containsKey(chronoField14)) {
            ChronoField chronoField15 = ChronoField.MINUTE_OF_HOUR;
            if (hashMap.containsKey(chronoField15)) {
                ChronoField chronoField16 = ChronoField.SECOND_OF_MINUTE;
                if (hashMap.containsKey(chronoField16) && hashMap.containsKey(chronoField11)) {
                    p(((Long) hashMap.remove(chronoField14)).longValue(), ((Long) hashMap.remove(chronoField15)).longValue(), ((Long) hashMap.remove(chronoField16)).longValue(), ((Long) hashMap.remove(chronoField11)).longValue());
                }
            }
        }
    }

    private void s(LocalTime localTime, Period period) {
        LocalTime localTime2 = this.g;
        if (localTime2 == null) {
            this.g = localTime;
            this.h = period;
        } else {
            if (!localTime2.equals(localTime)) {
                throw new DateTimeException(j$.time.d.d("Conflict found: Fields resolved to different times: ", String.valueOf(this.g), " ", String.valueOf(localTime)));
            }
            Period period2 = this.h;
            period2.getClass();
            Period period3 = Period.d;
            if (period2 != period3 && period != period3 && !this.h.equals(period)) {
                throw new DateTimeException(j$.time.d.d("Conflict found: Fields resolved to different excess periods: ", String.valueOf(this.h), " ", String.valueOf(period)));
            }
            this.h = period;
        }
    }

    private void t(ChronoLocalDate chronoLocalDate) {
        ChronoLocalDate chronoLocalDate2 = this.f;
        if (chronoLocalDate2 != null) {
            if (chronoLocalDate != null && !chronoLocalDate2.equals(chronoLocalDate)) {
                throw new DateTimeException(j$.time.d.d("Conflict found: Fields resolved to two different dates: ", String.valueOf(this.f), " ", String.valueOf(chronoLocalDate)));
            }
        } else if (chronoLocalDate != null) {
            if (!this.c.equals(chronoLocalDate.a())) {
                throw new DateTimeException("ChronoLocalDate must use the effective parsed chronology: ".concat(String.valueOf(this.c)));
            }
            this.f = chronoLocalDate;
        }
    }

    private void w(TemporalField temporalField, ChronoField chronoField, Long l) {
        Long l2 = (Long) this.a.put(chronoField, l);
        if (l2 == null || l2.longValue() == l.longValue()) {
            return;
        }
        throw new DateTimeException("Conflict found: " + String.valueOf(chronoField) + " " + l2 + " differs from " + String.valueOf(chronoField) + " " + l + " while resolving  " + String.valueOf(temporalField));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.m mVar) {
        if (mVar == j$.time.temporal.j.l()) {
            return this.b;
        }
        if (mVar == j$.time.temporal.j.e()) {
            return this.c;
        }
        if (mVar == j$.time.temporal.j.f()) {
            ChronoLocalDate chronoLocalDate = this.f;
            if (chronoLocalDate != null) {
                return LocalDate.b0(chronoLocalDate);
            }
            return null;
        }
        if (mVar == j$.time.temporal.j.g()) {
            return this.g;
        }
        if (mVar == j$.time.temporal.j.i()) {
            Long l = (Long) this.a.get(ChronoField.OFFSET_SECONDS);
            if (l != null) {
                return ZoneOffset.ofTotalSeconds(l.intValue());
            }
            ZoneId zoneId = this.b;
            return zoneId instanceof ZoneOffset ? zoneId : mVar.g(this);
        }
        if (mVar == j$.time.temporal.j.k()) {
            return mVar.g(this);
        }
        if (mVar == j$.time.temporal.j.j()) {
            return null;
        }
        return mVar.g(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        if (this.a.containsKey(temporalField)) {
            return true;
        }
        ChronoLocalDate chronoLocalDate = this.f;
        if (chronoLocalDate != null && chronoLocalDate.f(temporalField)) {
            return true;
        }
        LocalTime localTime = this.g;
        if (localTime == null || !localTime.f(temporalField)) {
            return (temporalField == null || (temporalField instanceof ChronoField) || !temporalField.y(this)) ? false : true;
        }
        return true;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.j.a(this, temporalField);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void h(j$.time.format.D r27) {
        /*
            Method dump skipped, instructions count: 755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.C.h(j$.time.format.D):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append(',');
        sb.append(this.c);
        if (this.b != null) {
            sb.append(',');
            sb.append(this.b);
        }
        if (this.f != null || this.g != null) {
            sb.append(" resolved to ");
            ChronoLocalDate chronoLocalDate = this.f;
            if (chronoLocalDate != null) {
                sb.append(chronoLocalDate);
                if (this.g != null) {
                    sb.append('T');
                    sb.append(this.g);
                }
            } else {
                sb.append(this.g);
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ j$.time.temporal.o v(TemporalField temporalField) {
        return j$.time.temporal.j.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        Objects.a(temporalField, "field");
        Long l = (Long) this.a.get(temporalField);
        if (l != null) {
            return l.longValue();
        }
        ChronoLocalDate chronoLocalDate = this.f;
        if (chronoLocalDate != null && chronoLocalDate.f(temporalField)) {
            return this.f.y(temporalField);
        }
        LocalTime localTime = this.g;
        if (localTime != null && localTime.f(temporalField)) {
            return this.g.y(temporalField);
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
        }
        return temporalField.v(this);
    }
}
