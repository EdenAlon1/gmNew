package defpackage;

import com.google.android.gms.time.trustedtime.dto.ParcelableClockAdjustmentPeriod;
import j$.util.Objects;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhui implements dhso {
    private final dhts a;

    public dhui(dhts dhtsVar) {
        dhtsVar.getClass();
        this.a = dhtsVar;
    }

    static long[] b(List list, long j) {
        boolean z;
        Iterator it;
        if (list.isEmpty()) {
            return new long[]{0, 0};
        }
        long j2 = 0;
        boolean z2 = true;
        long[] jArr = {0, 0};
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ParcelableClockAdjustmentPeriod parcelableClockAdjustmentPeriod = (ParcelableClockAdjustmentPeriod) it2.next();
            if (Math.abs(j2) >= Math.abs(j)) {
                break;
            }
            long a = parcelableClockAdjustmentPeriod.a.a();
            if (Math.abs(j2) < Math.abs(a)) {
                if (Math.abs(a) >= Math.abs(j)) {
                    break;
                }
                j2 = a;
            }
            long a2 = parcelableClockAdjustmentPeriod.c.a();
            long a3 = parcelableClockAdjustmentPeriod.d.a();
            long a4 = parcelableClockAdjustmentPeriod.b.a();
            long a5 = dhut.a(j2, a4);
            if (Math.abs(a5) > Math.abs(j)) {
                z = z2;
                it = it2;
                j2 = dhut.c(j, j2);
                double d = j2 / a4;
                jArr[0] = jArr[0] + ((int) (a2 * d));
                jArr[z ? 1 : 0] = jArr[z ? 1 : 0] + ((int) (a3 * d));
            } else {
                z = z2;
                it = it2;
                jArr[0] = jArr[0] + a2;
                jArr[z ? 1 : 0] = jArr[z ? 1 : 0] + a3;
                j2 = a5;
            }
            it2 = it;
            z2 = z;
        }
        return jArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
    @Override // defpackage.dhso
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dhsm a() {
        /*
            r12 = this;
            dhts r0 = r12.a
            dhsh r0 = r0.c
            dhtr r1 = r0.a
            long r2 = android.os.SystemClock.elapsedRealtime()
            dhsh r9 = new dhsh
            r9.<init>(r1, r2)
            long r1 = r1.a(r0, r9)
            dhts r3 = r12.a
            com.google.android.gms.time.dto.ParcelableInstant r3 = r3.b
            long r4 = r3.a
            int r3 = r3.b
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            r10 = 1000000(0xf4240, float:1.401298E-39)
            int r3 = r3 / r10
            if (r8 >= 0) goto L2c
            if (r3 <= 0) goto L2c
            r10 = 1
            long r4 = r4 + r10
            int r3 = r3 + (-1000)
        L2c:
            r10 = 1000(0x3e8, double:4.94E-321)
            long r4 = defpackage.dhut.b(r4, r10)
            long r10 = (long) r3
            long r4 = r4 + r10
            long r3 = defpackage.dhut.a(r4, r1)
            int r5 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            r8 = 1
            r10 = 0
            if (r5 <= 0) goto L47
            dhts r5 = r12.a
            engw r5 = r5.d
            long[] r1 = b(r5, r1)
            goto L59
        L47:
            if (r5 >= 0) goto L52
            dhts r5 = r12.a
            engw r5 = r5.e
            long[] r1 = b(r5, r1)
            goto L59
        L52:
            r1 = 2
            long[] r1 = new long[r1]
            r1[r10] = r6
            r1[r8] = r6
        L59:
            r5 = r1[r10]
            r7 = r1[r8]
            long r1 = defpackage.dhut.a(r3, r5)
            dhtr r3 = r0.a
            dhtr r4 = r9.a
            if (r3 != r4) goto Lbf
            r4 = r3
            dhtj r4 = (defpackage.dhtj) r4
            java.lang.Long r5 = r4.a
            r6 = 0
            if (r5 != 0) goto L71
        L6f:
            r0 = r6
            goto L95
        L71:
            long r10 = r3.a(r0, r9)
            long r10 = java.lang.Math.abs(r10)
            int r0 = r4.b
            if (r0 != 0) goto L85
            r3 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 <= 0) goto L85
            goto L6f
        L85:
            long r3 = r5.longValue()
            long r3 = defpackage.dhut.b(r3, r10)
            r10 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 / r10
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
        L95:
            if (r0 == 0) goto Lb6
            dhts r3 = r12.a
            com.google.android.gms.time.dto.ParcelableDuration r3 = r3.a
            long r3 = r3.a()
            long r5 = r0.longValue()
            long r3 = defpackage.dhut.a(r5, r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r0.getClass()
            long r3 = defpackage.dhut.a(r3, r7)
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
        Lb6:
            r8 = r6
            dhsm r4 = new dhsm
            r5 = r12
            r6 = r1
            r4.<init>(r5, r6, r8, r9)
            return r4
        Lbf:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Ticks must be from the same origin"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dhui.a():dhsm");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.a, ((dhui) obj).a);
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }

    public final String toString() {
        return "TimeSignalAdapter{internalTimeSignal=" + this.a.toString() + "}";
    }
}
