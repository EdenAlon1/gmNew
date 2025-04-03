package j$.time;

import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;

/* loaded from: classes9.dex */
final class r implements TemporalAccessor {
    final /* synthetic */ ZoneId a;

    r(ZoneId zoneId) {
        this.a = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(j$.time.temporal.m mVar) {
        return mVar == j$.time.temporal.j.l() ? this.a : j$.time.temporal.j.c(this, mVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(TemporalField temporalField) {
        return false;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.j.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ j$.time.temporal.o v(TemporalField temporalField) {
        return j$.time.temporal.j.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long y(TemporalField temporalField) {
        throw new j$.time.temporal.n("Unsupported field: ".concat(String.valueOf(temporalField)));
    }
}
