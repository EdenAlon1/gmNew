package defpackage;

import java.util.Date;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgyz extends fgvf {
    private static final long serialVersionUID = -8401010870773304348L;
    public boolean a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public fgyz(long r10, java.util.TimeZone r12) {
        /*
            r9 = this;
            java.util.TimeZone r0 = defpackage.fhew.a
            java.lang.String r0 = "Etc/UTC"
            java.lang.String r1 = r12.getID()
            boolean r0 = r0.equals(r1)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1f
            java.lang.String r0 = r12.getID()
            java.lang.String r3 = "GMT"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L1d
            goto L1f
        L1d:
            r0 = r1
            goto L20
        L1f:
            r0 = r2
        L20:
            if (r2 == r0) goto L25
            java.lang.String r2 = "HHmmss"
            goto L27
        L25:
            java.lang.String r2 = "HHmmss'Z'"
        L27:
            r6 = r2
            r7 = 0
            r3 = r9
            r4 = r10
            r8 = r12
            r3.<init>(r4, r6, r7, r8)
            r3.a = r1
            java.text.DateFormat r10 = r3.b
            r10.setTimeZone(r8)
            r3.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgyz.<init>(long, java.util.TimeZone):void");
    }

    public fgyz(Date date, TimeZone timeZone, boolean z) {
        super(date.getTime(), true != z ? "HHmmss" : "HHmmss'Z'", 0, timeZone);
        this.a = false;
        this.b.setTimeZone(timeZone);
        this.a = z;
    }
}
