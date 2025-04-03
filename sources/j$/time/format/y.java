package j$.time.format;

import j$.time.DateTimeException;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import java.util.Locale;

/* loaded from: classes9.dex */
final class y {
    private TemporalAccessor a;
    private DateTimeFormatter b;
    private int c;

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    y(j$.time.temporal.TemporalAccessor r10, j$.time.format.DateTimeFormatter r11) {
        /*
            r9 = this;
            r9.<init>()
            j$.time.chrono.Chronology r0 = r11.a()
            j$.time.ZoneId r1 = r11.d()
            if (r0 != 0) goto L11
            if (r1 != 0) goto L11
            goto Lf3
        L11:
            j$.time.temporal.m r2 = j$.time.temporal.j.e()
            java.lang.Object r2 = r10.D(r2)
            j$.time.chrono.Chronology r2 = (j$.time.chrono.Chronology) r2
            j$.time.temporal.m r3 = j$.time.temporal.j.l()
            java.lang.Object r3 = r10.D(r3)
            j$.time.ZoneId r3 = (j$.time.ZoneId) r3
            boolean r4 = j$.util.Objects.equals(r0, r2)
            r5 = 0
            if (r4 == 0) goto L2d
            r0 = r5
        L2d:
            boolean r4 = j$.util.Objects.equals(r1, r3)
            if (r4 == 0) goto L34
            r1 = r5
        L34:
            if (r0 != 0) goto L3a
            if (r1 != 0) goto L3a
            goto Lf3
        L3a:
            if (r0 == 0) goto L3e
            r4 = r0
            goto L3f
        L3e:
            r4 = r2
        L3f:
            if (r1 == 0) goto La5
            j$.time.temporal.ChronoField r6 = j$.time.temporal.ChronoField.INSTANT_SECONDS
            boolean r6 = r10.f(r6)
            if (r6 == 0) goto L5b
            j$.time.chrono.r r0 = j$.time.chrono.r.e
            java.lang.Object r0 = j$.util.Objects.requireNonNullElse(r4, r0)
            j$.time.chrono.Chronology r0 = (j$.time.chrono.Chronology) r0
            j$.time.Instant r10 = j$.time.Instant.a0(r10)
            j$.time.chrono.i r10 = r0.R(r10, r1)
            goto Lf3
        L5b:
            j$.time.zone.ZoneRules r6 = r1.getRules()     // Catch: j$.time.zone.e -> L6c
            boolean r7 = r6.h()     // Catch: j$.time.zone.e -> L6c
            if (r7 == 0) goto L6d
            j$.time.Instant r7 = j$.time.Instant.EPOCH     // Catch: j$.time.zone.e -> L6c
            j$.time.ZoneOffset r6 = r6.d(r7)     // Catch: j$.time.zone.e -> L6c
            goto L6e
        L6c:
        L6d:
            r6 = r1
        L6e:
            boolean r6 = r6 instanceof j$.time.ZoneOffset
            if (r6 == 0) goto La5
            j$.time.temporal.ChronoField r6 = j$.time.temporal.ChronoField.OFFSET_SECONDS
            boolean r7 = r10.f(r6)
            if (r7 == 0) goto La5
            int r6 = r10.get(r6)
            j$.time.zone.ZoneRules r7 = r1.getRules()
            j$.time.Instant r8 = j$.time.Instant.EPOCH
            j$.time.ZoneOffset r7 = r7.d(r8)
            int r7 = r7.getTotalSeconds()
            if (r6 != r7) goto L8f
            goto La5
        L8f:
            j$.time.DateTimeException r11 = new j$.time.DateTimeException
            java.lang.String r0 = java.lang.String.valueOf(r1)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r1 = "Unable to apply override zone '"
            java.lang.String r2 = "' because the temporal object being formatted has a different offset but does not represent an instant: "
            java.lang.String r10 = j$.time.d.d(r1, r0, r2, r10)
            r11.<init>(r10)
            throw r11
        La5:
            if (r1 == 0) goto La8
            r3 = r1
        La8:
            if (r0 == 0) goto Led
            j$.time.temporal.ChronoField r1 = j$.time.temporal.ChronoField.EPOCH_DAY
            boolean r1 = r10.f(r1)
            if (r1 == 0) goto Lb7
            j$.time.chrono.ChronoLocalDate r5 = r4.r(r10)
            goto Led
        Lb7:
            j$.time.chrono.r r1 = j$.time.chrono.r.e
            if (r0 != r1) goto Lbd
            if (r2 == 0) goto Led
        Lbd:
            j$.time.temporal.ChronoField[] r1 = j$.time.temporal.ChronoField.values()
            int r2 = r1.length
            r6 = 0
        Lc3:
            if (r6 >= r2) goto Led
            r7 = r1[r6]
            boolean r8 = r7.Z()
            if (r8 == 0) goto Lea
            boolean r7 = r10.f(r7)
            if (r7 != 0) goto Ld4
            goto Lea
        Ld4:
            j$.time.DateTimeException r11 = new j$.time.DateTimeException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r1 = "Unable to apply override chronology '"
            java.lang.String r2 = "' because the temporal object being formatted contains date fields but does not represent a whole date: "
            java.lang.String r10 = j$.time.d.d(r1, r0, r2, r10)
            r11.<init>(r10)
            throw r11
        Lea:
            int r6 = r6 + 1
            goto Lc3
        Led:
            j$.time.format.x r0 = new j$.time.format.x
            r0.<init>(r5, r10, r4, r3)
            r10 = r0
        Lf3:
            r9.a = r10
            r9.b = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.y.<init>(j$.time.temporal.TemporalAccessor, j$.time.format.DateTimeFormatter):void");
    }

    final void a() {
        this.c--;
    }

    final DecimalStyle b() {
        return this.b.b();
    }

    final Locale c() {
        return this.b.c();
    }

    final TemporalAccessor d() {
        return this.a;
    }

    final Long e(TemporalField temporalField) {
        int i = this.c;
        TemporalAccessor temporalAccessor = this.a;
        if (i <= 0 || temporalAccessor.f(temporalField)) {
            return Long.valueOf(temporalAccessor.y(temporalField));
        }
        return null;
    }

    final Object f(j$.time.temporal.m mVar) {
        TemporalAccessor temporalAccessor = this.a;
        Object D = temporalAccessor.D(mVar);
        if (D == null && this.c == 0) {
            throw new DateTimeException(j$.time.d.d("Unable to extract ", String.valueOf(mVar), " from temporal ", String.valueOf(temporalAccessor)));
        }
        return D;
    }

    final void g() {
        this.c++;
    }

    public final String toString() {
        return this.a.toString();
    }
}
