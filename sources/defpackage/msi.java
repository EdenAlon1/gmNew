package defpackage;

import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class msi extends IOException {
    public msi(int i) {
        this(i, -9223372036854775807L, -9223372036854775807L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public msi(int r11, long r12, long r14) {
        /*
            r10 = this;
            if (r11 == 0) goto L29
            r0 = 1
            if (r11 == r0) goto L26
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r11 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            r3 = 0
            if (r11 == 0) goto L17
            int r11 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r11 == 0) goto L15
            r4 = r14
            goto L19
        L15:
            r4 = r1
            goto L18
        L17:
            r4 = r14
        L18:
            r0 = r3
        L19:
            defpackage.lti.c(r0)
            java.lang.String r8 = "start exceeds end. Start time: "
            java.lang.String r9 = ", End time: "
            r6 = r12
            java.lang.String r11 = defpackage.a.D(r4, r6, r8, r9)
            goto L2b
        L26:
            java.lang.String r11 = "not seekable to start"
            goto L2b
        L29:
            java.lang.String r11 = "invalid period count"
        L2b:
            java.lang.String r12 = "Illegal clipping: "
            java.lang.String r11 = r12.concat(r11)
            r10.<init>(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.msi.<init>(int, long, long):void");
    }
}
