package defpackage;

import android.util.Pair;
import java.nio.ByteOrder;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bif {
    final List b = Collections.list(new bid());
    public final ByteOrder c;
    private static final Pattern d = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
    private static final Pattern e = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    private static final Pattern f = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
    static final List a = Collections.list(new bic());

    public bif(ByteOrder byteOrder) {
        this.c = byteOrder;
    }

    private static Pair d(String str) {
        if (str.contains(",")) {
            String[] split = str.split(",", -1);
            Pair d2 = d(split[0]);
            if (((Integer) d2.first).intValue() != 2) {
                for (int i = 1; i < split.length; i++) {
                    Pair d3 = d(split[i]);
                    int intValue = (((Integer) d3.first).equals(d2.first) || ((Integer) d3.second).equals(d2.first)) ? ((Integer) d2.first).intValue() : -1;
                    int intValue2 = (((Integer) d2.second).intValue() == -1 || !(((Integer) d3.first).equals(d2.second) || ((Integer) d3.second).equals(d2.second))) ? -1 : ((Integer) d2.second).intValue();
                    if (intValue == -1) {
                        if (intValue2 == -1) {
                            return new Pair(2, -1);
                        }
                        intValue = -1;
                    }
                    if (intValue == -1) {
                        d2 = new Pair(Integer.valueOf(intValue2), -1);
                    } else if (intValue2 == -1) {
                        d2 = new Pair(Integer.valueOf(intValue), -1);
                    }
                }
            }
            return d2;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long parseLong = Long.parseLong(str);
                    return (parseLong < 0 || parseLong > 65535) ? parseLong < 0 ? new Pair(9, -1) : new Pair(4, -1) : new Pair(3, 4);
                } catch (NumberFormatException unused) {
                    Double.parseDouble(str);
                    return new Pair(12, -1);
                }
            } catch (NumberFormatException unused2) {
                return new Pair(2, -1);
            }
        }
        String[] split2 = str.split("/", -1);
        if (split2.length == 2) {
            try {
                long parseDouble = (long) Double.parseDouble(split2[0]);
                long parseDouble2 = (long) Double.parseDouble(split2[1]);
                if (parseDouble >= 0 && parseDouble2 >= 0) {
                    if (parseDouble <= 2147483647L && parseDouble2 <= 2147483647L) {
                        return new Pair(10, 5);
                    }
                    return new Pair(5, -1);
                }
                return new Pair(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair(2, -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0157, code lost:
    
        if (r7 != r9) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0046, code lost:
    
        if (r8 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0049, code lost:
    
        if (r8 != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void e(java.lang.String r20, java.lang.String r21, java.util.List r22) {
        /*
            Method dump skipped, instructions count: 938
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bif.e(java.lang.String, java.lang.String, java.util.List):void");
    }

    public final void a(String str, String str2, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Map) it.next()).containsKey(str)) {
                return;
            }
        }
        e(str, str2, list);
    }

    public final void b(String str, String str2) {
        e(str, str2, this.b);
    }

    public final void c(int i) {
        int i2;
        if (i == 0) {
            i2 = 1;
        } else if (i == 90) {
            i2 = 6;
        } else if (i == 180) {
            i2 = 3;
        } else if (i != 270) {
            avw.f("ExifData", a.f(i, "Unexpected orientation value: ", ". Must be one of 0, 90, 180, 270."));
            i2 = 0;
        } else {
            i2 = 8;
        }
        b("Orientation", String.valueOf(i2));
    }
}
