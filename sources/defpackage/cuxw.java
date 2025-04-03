package defpackage;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuxw {
    public static final ZoneId a = ZoneId.of("America/Los_Angeles");

    public static eyja a(long j) {
        int nanos = (int) TimeUnit.MILLISECONDS.toNanos(j % TimeUnit.SECONDS.toMillis(1L));
        eyiz eyizVar = (eyiz) eyja.a.createBuilder();
        long seconds = TimeUnit.MILLISECONDS.toSeconds(j);
        eyizVar.copyOnWrite();
        ((eyja) eyizVar.instance).b = seconds;
        eyizVar.copyOnWrite();
        ((eyja) eyizVar.instance).c = nanos;
        return (eyja) eyizVar.build();
    }

    public static eyja b(eyja eyjaVar) {
        return eykm.f(Math.round(eyjaVar.b / 3600.0f) * 3600);
    }

    public static eyja c(eyja eyjaVar) {
        return eykj.b(eykj.d(eyjaVar).atZone(ZoneOffset.UTC).b().atStartOfDay(ZoneOffset.UTC).toInstant());
    }
}
