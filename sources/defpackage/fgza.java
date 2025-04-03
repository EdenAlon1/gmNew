package defpackage;

import j$.time.TimeConversions;
import j$.time.ZoneId;
import j$.util.DesugarTimeZone;
import j$.util.TimeZoneRetargetInterface;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgza extends TimeZone implements TimeZoneRetargetInterface {
    private static final long serialVersionUID = -5620979316746547234L;
    private final fhaj a;
    private final int b;

    protected fgza() {
        this.a = null;
        this.b = 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fgza fgzaVar = (fgza) obj;
        if (this.b != fgzaVar.b) {
            return false;
        }
        fhaj fhajVar = this.a;
        return fhajVar == null ? fgzaVar.a == null : fhajVar.equals(fgzaVar.a);
    }

    @Override // java.util.TimeZone
    public final int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(0, i);
        calendar.set(1, i2);
        calendar.set(2, i3);
        calendar.set(6, i4);
        calendar.set(7, i5);
        calendar.set(14, i6);
        fgzk c = this.a.c(new fgvb(calendar.getTime()));
        if (c != null) {
            return (int) ((fhed) c.a("TZOFFSETTO")).c.a;
        }
        return 0;
    }

    @Override // java.util.TimeZone
    public final int getRawOffset() {
        return this.b;
    }

    public final int hashCode() {
        fhaj fhajVar = this.a;
        return ((fhajVar != null ? fhajVar.hashCode() : 0) * 31) + this.b;
    }

    @Override // java.util.TimeZone
    public final boolean inDaylightTime(Date date) {
        fgzk c = this.a.c(new fgvb(date));
        return c != null && (c instanceof fgzj);
    }

    @Override // java.util.TimeZone
    public final void setRawOffset(int i) {
        throw new UnsupportedOperationException("Updates to the VTIMEZONE object must be performed directly");
    }

    @Override // java.util.TimeZone, j$.util.TimeZoneRetargetInterface
    public final /* synthetic */ ZoneId toZoneId() {
        return DesugarTimeZone.toZoneId(this);
    }

    @Override // java.util.TimeZone
    public final boolean useDaylightTime() {
        return !this.a.c.a("DAYLIGHT").isEmpty();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r0.isEmpty() != false) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fgza(defpackage.fhaj r9) {
        /*
            r8 = this;
            r8.<init>()
            r8.a = r9
            java.lang.String r0 = "TZID"
            fgwo r0 = r9.a(r0)
            fhea r0 = (defpackage.fhea) r0
            java.lang.String r0 = r0.c
            r8.setID(r0)
            fguv r0 = r9.c
            java.lang.String r1 = "STANDARD"
            fguv r0 = r0.a(r1)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L30
            fguv r9 = r9.c
            java.lang.String r0 = "DAYLIGHT"
            fguv r0 = r9.a(r0)
            boolean r9 = r0.isEmpty()
            if (r9 == 0) goto L30
            goto L77
        L30:
            int r9 = r0.size()
            r1 = 1
            if (r9 <= r1) goto L5f
            fgvb r9 = new fgvb
            r9.<init>()
            r1 = 0
            r3 = r1
            r4 = r2
        L3f:
            int r5 = r0.size()
            if (r4 >= r5) goto L66
            java.lang.Object r5 = r0.get(r4)
            fgzk r5 = (defpackage.fgzk) r5
            fgux r6 = r5.c(r9)
            if (r6 != 0) goto L52
            goto L5c
        L52:
            if (r3 == 0) goto L5a
            boolean r7 = r6.after(r3)
            if (r7 == 0) goto L5c
        L5a:
            r1 = r5
            r3 = r6
        L5c:
            int r4 = r4 + 1
            goto L3f
        L5f:
            java.lang.Object r9 = r0.get(r2)
            r1 = r9
            fgzk r1 = (defpackage.fgzk) r1
        L66:
            if (r1 == 0) goto L77
            java.lang.String r9 = "TZOFFSETTO"
            fgwo r9 = r1.a(r9)
            fhed r9 = (defpackage.fhed) r9
            if (r9 == 0) goto L77
            fgze r9 = r9.c
            long r0 = r9.a
            int r2 = (int) r0
        L77:
            r8.b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgza.<init>(fhaj):void");
    }

    @Override // java.util.TimeZone
    public final /* synthetic */ java.time.ZoneId toZoneId() {
        return TimeConversions.convert(DesugarTimeZone.toZoneId(this));
    }

    @Override // java.util.TimeZone
    public final int getOffset(long j) {
        fgzk c = this.a.c(new fgvb(j));
        if (c == null) {
            return 0;
        }
        long j2 = ((fhed) c.a("TZOFFSETTO")).c.a;
        int i = this.b;
        return j2 < ((long) i) ? i : (int) j2;
    }
}
