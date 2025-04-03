package j$.nio.file.attribute;

import j$.time.Instant;
import j$.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class y implements Comparable {
    private final long a;
    private Instant b;
    private String c;

    private y(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a = j;
        this.b = null;
    }

    private static long D(long j, long j2, long j3) {
        if (j > j3) {
            return Long.MAX_VALUE;
        }
        if (j < (-j3)) {
            return Long.MIN_VALUE;
        }
        return j * j2;
    }

    private long Z(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit == null) {
            return TimeUnit.SECONDS.toNanos(a0().getEpochSecond() - TimeUnit.DAYS.toSeconds(j));
        }
        return timeUnit.toNanos(this.a - timeUnit.convert(j, TimeUnit.DAYS));
    }

    private static void o(StringBuilder sb, int i, int i2) {
        while (i > 0) {
            sb.append((char) ((i2 / i) + 48));
            i2 %= i;
            i /= 10;
        }
    }

    public static y v(long j) {
        Objects.a(TimeUnit.MILLISECONDS, "unit");
        return new y(j);
    }

    public static y y(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return new y(j);
    }

    public final long G() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Objects.a(timeUnit, "unit");
        if (timeUnit != null) {
            return timeUnit.convert(this.a, timeUnit);
        }
        long convert = timeUnit.convert(this.b.getEpochSecond(), TimeUnit.SECONDS);
        if (convert == Long.MIN_VALUE || convert == Long.MAX_VALUE) {
            return convert;
        }
        long convert2 = timeUnit.convert(this.b.getNano(), TimeUnit.NANOSECONDS);
        long j = convert + convert2;
        return ((convert2 ^ j) & (convert ^ j)) < 0 ? convert < 0 ? Long.MIN_VALUE : Long.MAX_VALUE : j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.Instant a0() {
        /*
            r8 = this;
            j$.time.Instant r0 = r8.b
            if (r0 != 0) goto L91
            int[] r0 = j$.nio.file.attribute.x.a
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            int r1 = r1.ordinal()
            r0 = r0[r1]
            long r1 = r8.a
            r7 = 0
            switch(r0) {
                case 1: goto L62;
                case 2: goto L56;
                case 3: goto L4a;
                case 4: goto L6e;
                case 5: goto L39;
                case 6: goto L2a;
                case 7: goto L1c;
                default: goto L14;
            }
        L14:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "Unit not handled"
            r0.<init>(r1)
            throw r0
        L1c:
            r3 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            long r5 = j$.nio.file.attribute.p.f(r1, r3)
            long r0 = j$.nio.file.attribute.p.g(r1, r3)
            int r7 = (int) r0
        L28:
            r1 = r5
            goto L6e
        L2a:
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = j$.nio.file.attribute.p.f(r1, r3)
            long r0 = j$.nio.file.attribute.p.g(r1, r3)
            int r1 = (int) r0
            int r7 = r1 * 1000
            goto L28
        L39:
            r3 = 1000(0x3e8, double:4.94E-321)
            long r5 = j$.nio.file.attribute.p.f(r1, r3)
            long r0 = j$.nio.file.attribute.p.g(r1, r3)
            int r1 = (int) r0
            r0 = 1000000(0xf4240, float:1.401298E-39)
            int r7 = r1 * r0
            goto L28
        L4a:
            r3 = 60
            r5 = 153722867280912930(0x222222222222222, double:2.166167076120538E-298)
            long r1 = D(r1, r3, r5)
            goto L6e
        L56:
            r3 = 3600(0xe10, double:1.7786E-320)
            r5 = 2562047788015215(0x91a2b3c4d5e6f, double:1.2658197950618743E-308)
            long r1 = D(r1, r3, r5)
            goto L6e
        L62:
            r3 = 86400(0x15180, double:4.26873E-319)
            r5 = 106751991167300(0x611722833944, double:5.2742491460911E-310)
            long r1 = D(r1, r3, r5)
        L6e:
            r3 = -31557014167219200(0xff8fe31014641400, double:-2.7989734602046733E306)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L7c
            j$.time.Instant r0 = j$.time.Instant.MIN
            r8.b = r0
            goto L91
        L7c:
            r3 = 31556889864403199(0x701cd2fa9578ff, double:1.434068493154717E-306)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 < 0) goto L8a
            j$.time.Instant r0 = j$.time.Instant.MAX
            r8.b = r0
            goto L91
        L8a:
            long r3 = (long) r7
            j$.time.Instant r0 = j$.time.Instant.ofEpochSecond(r1, r3)
            r8.b = r0
        L91:
            j$.time.Instant r0 = r8.b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.nio.file.attribute.y.a0():j$.time.Instant");
    }

    public final long b0() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (timeUnit != null) {
            return timeUnit.toMillis(this.a);
        }
        long epochSecond = this.b.getEpochSecond();
        long j = epochSecond * 1000;
        return (((Math.abs(epochSecond) | 1000) >>> 31) == 0 || j / 1000 == epochSecond) ? j + (this.b.getNano() / 1000000) : epochSecond < 0 ? Long.MIN_VALUE : Long.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof y) && compareTo((y) obj) == 0;
    }

    public final int hashCode() {
        return a0().hashCode();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r12 = this;
            java.lang.String r0 = r12.c
            if (r0 != 0) goto Lfb
            j$.time.Instant r0 = r12.b
            if (r0 != 0) goto L1a
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            int r0 = r1.compareTo(r0)
            if (r0 < 0) goto L1a
            long r2 = r12.a
            long r0 = r1.toSeconds(r2)
            r2 = 0
            goto L2a
        L1a:
            j$.time.Instant r0 = r12.a0()
            long r0 = r0.getEpochSecond()
            j$.time.Instant r2 = r12.a0()
            int r2 = r2.getNano()
        L2a:
            r3 = -62167219200(0xfffffff1868b8400, double:NaN)
            r5 = 10000(0x2710, float:1.4013E-41)
            r6 = 62167219200(0xe79747c00, double:3.0714687304E-313)
            r8 = 315569520000(0x497968bd80, double:1.559120587066E-312)
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 < 0) goto L60
            r3 = 253402300800(0x3afff44180, double:1.251973714024E-312)
            long r0 = r0 - r3
            long r3 = j$.nio.file.attribute.p.f(r0, r8)
            r10 = 1
            long r3 = r3 + r10
            long r0 = j$.nio.file.attribute.p.g(r0, r8)
            long r0 = r0 - r6
            j$.time.ZoneOffset r6 = j$.time.ZoneOffset.UTC
            j$.time.LocalDateTime r0 = j$.time.LocalDateTime.e0(r0, r2, r6)
            int r1 = r0.getYear()
        L5b:
            int r2 = (int) r3
            int r2 = r2 * 10000
            int r2 = r2 + r1
            goto L70
        L60:
            long r0 = r0 + r6
            long r3 = r0 / r8
            long r0 = r0 % r8
            long r0 = r0 - r6
            j$.time.ZoneOffset r6 = j$.time.ZoneOffset.UTC
            j$.time.LocalDateTime r0 = j$.time.LocalDateTime.e0(r0, r2, r6)
            int r1 = r0.getYear()
            goto L5b
        L70:
            if (r2 > 0) goto L74
            int r2 = r2 + (-1)
        L74:
            int r1 = r0.b0()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 64
            r3.<init>(r4)
            if (r2 >= 0) goto L84
            java.lang.String r4 = "-"
            goto L86
        L84:
            java.lang.String r4 = ""
        L86:
            r3.append(r4)
            int r2 = java.lang.Math.abs(r2)
            if (r2 >= r5) goto L99
            r4 = 1000(0x3e8, float:1.401E-42)
            int r2 = java.lang.Math.abs(r2)
            o(r3, r4, r2)
            goto La0
        L99:
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r3.append(r2)
        La0:
            r2 = 45
            r3.append(r2)
            int r4 = r0.getMonthValue()
            r5 = 10
            o(r3, r5, r4)
            r3.append(r2)
            int r2 = r0.getDayOfMonth()
            o(r3, r5, r2)
            r2 = 84
            r3.append(r2)
            int r2 = r0.getHour()
            o(r3, r5, r2)
            r2 = 58
            r3.append(r2)
            int r4 = r0.getMinute()
            o(r3, r5, r4)
            r3.append(r2)
            int r0 = r0.c0()
            o(r3, r5, r0)
            if (r1 == 0) goto Lf0
            r0 = 46
            r3.append(r0)
            r0 = 100000000(0x5f5e100, float:2.3122341E-35)
        Le4:
            int r2 = r1 % 10
            if (r2 != 0) goto Led
            int r1 = r1 / 10
            int r0 = r0 / 10
            goto Le4
        Led:
            o(r3, r0, r1)
        Lf0:
            r0 = 90
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r12.c = r0
        Lfb:
            java.lang.String r0 = r12.c
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.nio.file.attribute.y.toString():java.lang.String");
    }

    @Override // java.lang.Comparable
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final int compareTo(y yVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long j = this.a;
        if (timeUnit != null) {
            yVar.getClass();
            return Long.compare(j, yVar.a);
        }
        long epochSecond = a0().getEpochSecond();
        int compare = Long.compare(epochSecond, yVar.a0().getEpochSecond());
        if (compare != 0) {
            return compare;
        }
        int compare2 = Long.compare(a0().getNano(), yVar.a0().getNano());
        if (compare2 != 0) {
            return compare2;
        }
        if (epochSecond != 31556889864403199L && epochSecond != -31557014167219200L) {
            return 0;
        }
        long days = timeUnit != null ? timeUnit.toDays(j) : TimeUnit.SECONDS.toDays(a0().getEpochSecond());
        long days2 = timeUnit != null ? timeUnit.toDays(yVar.a) : TimeUnit.SECONDS.toDays(yVar.a0().getEpochSecond());
        return days == days2 ? Long.compare(Z(days), yVar.Z(days2)) : Long.compare(days, days2);
    }
}
