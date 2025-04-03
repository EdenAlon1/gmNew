package defpackage;

import j$.util.DesugarTimeZone;
import java.util.TimeZone;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evpb {
    private static final TimeZone a = DesugarTimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1 A[Catch: IllegalArgumentException -> 0x01bc, IllegalArgumentException | IndexOutOfBoundsException -> 0x01be, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01be, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:18:0x0056, B:20:0x0066, B:21:0x0068, B:23:0x0074, B:24:0x0077, B:26:0x007d, B:30:0x0087, B:35:0x0097, B:37:0x009f, B:38:0x00a3, B:40:0x00a9, B:44:0x00b6, B:48:0x00c1, B:53:0x00eb, B:55:0x00f1, B:57:0x00f7, B:58:0x0182, B:64:0x0103, B:65:0x0110, B:66:0x0111, B:68:0x011c, B:69:0x0122, B:71:0x012f, B:74:0x0138, B:76:0x014c, B:79:0x015b, B:80:0x017d, B:82:0x0180, B:83:0x01b4, B:84:0x01bb, B:85:0x00d1, B:86:0x00d4, B:89:0x00bd), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b4 A[Catch: IllegalArgumentException -> 0x01bc, IllegalArgumentException | IndexOutOfBoundsException -> 0x01be, TryCatch #2 {IllegalArgumentException | IndexOutOfBoundsException -> 0x01be, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0036, B:13:0x003c, B:18:0x0056, B:20:0x0066, B:21:0x0068, B:23:0x0074, B:24:0x0077, B:26:0x007d, B:30:0x0087, B:35:0x0097, B:37:0x009f, B:38:0x00a3, B:40:0x00a9, B:44:0x00b6, B:48:0x00c1, B:53:0x00eb, B:55:0x00f1, B:57:0x00f7, B:58:0x0182, B:64:0x0103, B:65:0x0110, B:66:0x0111, B:68:0x011c, B:69:0x0122, B:71:0x012f, B:74:0x0138, B:76:0x014c, B:79:0x015b, B:80:0x017d, B:82:0x0180, B:83:0x01b4, B:84:0x01bb, B:85:0x00d1, B:86:0x00d4, B:89:0x00bd), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Date a(java.lang.String r17, java.text.ParsePosition r18) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evpb.a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int b(String str, int i, int i2) {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: ".concat(String.valueOf(str.substring(i, i2))));
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: ".concat(String.valueOf(str.substring(i, i2))));
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }

    private static boolean c(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }
}
