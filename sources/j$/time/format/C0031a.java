package j$.time.format;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.TemporalAccessor;

/* renamed from: j$.time.format.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0031a implements j$.time.temporal.m {
    @Override // j$.time.temporal.m
    public final Object g(TemporalAccessor temporalAccessor) {
        int i = DateTimeFormatterBuilder.j;
        ZoneId zoneId = (ZoneId) temporalAccessor.D(j$.time.temporal.j.l());
        if (zoneId == null || (zoneId instanceof ZoneOffset)) {
            return null;
        }
        return zoneId;
    }
}
