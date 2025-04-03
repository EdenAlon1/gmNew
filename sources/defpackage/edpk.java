package defpackage;

import android.util.Log;
import j$.time.DateTimeException;
import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.OffsetDateTime;
import j$.time.ZoneOffset;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edpk {
    public static final /* synthetic */ int a = 0;
    private static final enhk b;
    private static final edpc c;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k(DayOfWeek.SUNDAY, edor.SUNDAY);
        enhdVar.k(DayOfWeek.MONDAY, edor.MONDAY);
        enhdVar.k(DayOfWeek.TUESDAY, edor.TUESDAY);
        enhdVar.k(DayOfWeek.WEDNESDAY, edor.WEDNESDAY);
        enhdVar.k(DayOfWeek.THURSDAY, edor.THURSDAY);
        enhdVar.k(DayOfWeek.FRIDAY, edor.FRIDAY);
        enhdVar.k(DayOfWeek.SATURDAY, edor.SATURDAY);
        b = enhdVar.c();
        c = edpc.c(23, 59);
    }

    static long a(ZoneOffset zoneOffset, edpb edpbVar, int i, int i2) {
        return OffsetDateTime.of(LocalDate.of(edpbVar.c(), edpbVar.b(), edpbVar.a()), LocalTime.of(i, i2), zoneOffset).toInstant().toEpochMilli();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0088, code lost:
    
        if (defpackage.enop.c(java.lang.Long.valueOf(a(r1, r6, 0, 0)), java.lang.Long.valueOf(a(r1, r5, 23, 59))).a(java.lang.Long.valueOf(r13)) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Boolean b(defpackage.edqc r12, long r13) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edpk.b(edqc, long):java.lang.Boolean");
    }

    private static ZoneOffset c(int i) {
        try {
            return ZoneOffset.ofTotalSeconds(i * 60);
        } catch (DateTimeException unused) {
            Log.w("Places OpeningHoursUtil", String.format("Cannot find timezone that associates with utcOffsetMinutes %d from Place object.", Integer.valueOf(i)));
            return null;
        }
    }
}
