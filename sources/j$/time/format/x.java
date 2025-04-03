package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.ChronoLocalDate;
import j$.time.chrono.Chronology;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;

/* loaded from: classes9.dex */
final class x implements TemporalAccessor {
    final /* synthetic */ ChronoLocalDate a;
    final /* synthetic */ TemporalAccessor b;
    final /* synthetic */ Chronology c;
    final /* synthetic */ ZoneId d;

    x(ChronoLocalDate chronoLocalDate, TemporalAccessor temporalAccessor, Chronology chronology, ZoneId zoneId) {
        this.a = chronoLocalDate;
        this.b = temporalAccessor;
        this.c = chronology;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.m mVar) {
        return mVar == j$.time.temporal.j.e() ? this.c : mVar == j$.time.temporal.j.l() ? this.d : mVar == j$.time.temporal.j.j() ? this.b.D(mVar) : mVar.g(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !temporalField.Z()) ? this.b.f(temporalField) : chronoLocalDate.f(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.j.a(this, temporalField);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        Chronology chronology = this.c;
        String concat = chronology != null ? " with chronology ".concat(String.valueOf(chronology)) : "";
        ZoneId zoneId = this.d;
        return valueOf + concat + (zoneId != null ? " with zone ".concat(String.valueOf(zoneId)) : "");
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.o v(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !temporalField.Z()) ? this.b.v(temporalField) : chronoLocalDate.v(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        ChronoLocalDate chronoLocalDate = this.a;
        return (chronoLocalDate == null || !temporalField.Z()) ? this.b.y(temporalField) : chronoLocalDate.y(temporalField);
    }
}
