package defpackage;

import java.text.ParseException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtpe {
    public static dtpd a(byte[] bArr, int i) {
        boolean z = false;
        int i2 = 0;
        long j = 0;
        long j2 = -1;
        long j3 = -1;
        int i3 = 0;
        while (i3 < i) {
            int i4 = i3 + 1;
            byte b = bArr[i3];
            if (b != 32) {
                if (b < 48 || b > 57 || j > 922337203685477580L) {
                    break;
                }
                j = (j * 10) + (b - 48);
                i3 = i4;
                z = true;
            } else {
                if (!z) {
                    break;
                }
                if (i2 != 0) {
                    if (i2 != 1) {
                        break;
                    }
                    j3 = j;
                } else {
                    j2 = j;
                }
                i2++;
                z = false;
                j = 0;
                i3 = i4;
            }
        }
        if (i2 == 2) {
            return new dtoz(j2, j3, j);
        }
        throw new ParseException("Failed to parse SchedStat", i2);
    }
}
