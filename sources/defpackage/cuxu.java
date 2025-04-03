package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuxu {
    public static final /* synthetic */ int a = 0;
    private static final ellw b;

    static {
        String str = (String) cvdf.a.e();
        if (str == null) {
            str = "null";
        }
        int i = ellw.c;
        b = new ellw(Pattern.compile(str, 1), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 != 0) goto L7b
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Le
            return r1
        Le:
            ellw r0 = defpackage.cuxu.b
            if (r6 != 0) goto L14
        L12:
            r6 = r1
            goto L69
        L14:
            java.util.regex.Pattern r2 = r0.b
            java.util.regex.Matcher r6 = r2.matcher(r6)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r0 = r0.a
            r3 = 0
            if (r0 == 0) goto L42
        L24:
            boolean r0 = r6.find()
            if (r0 == 0) goto L32
            java.lang.String r0 = r6.group(r3)
            r2.add(r0)
            goto L24
        L32:
            boolean r6 = r2.isEmpty()
            if (r6 == 0) goto L39
            goto L12
        L39:
            java.lang.String[] r6 = new java.lang.String[r3]
            java.lang.Object[] r6 = r2.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            goto L69
        L42:
            boolean r0 = r6.find()
            if (r0 != 0) goto L49
            goto L12
        L49:
            java.lang.String r0 = r6.group(r3)
            r2.add(r0)
            int r0 = r6.groupCount()
            r4 = r3
        L55:
            if (r4 >= r0) goto L61
            int r4 = r4 + 1
            java.lang.String r5 = r6.group(r4)
            r2.add(r5)
            goto L55
        L61:
            java.lang.String[] r6 = new java.lang.String[r3]
            java.lang.Object[] r6 = r2.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
        L69:
            if (r6 == 0) goto L7b
            int r0 = r6.length
            r2 = 1
            if (r0 > r2) goto L70
            return r1
        L70:
            int r0 = r6.length
            if (r2 >= r0) goto L7b
            r0 = r6[r2]
            if (r0 == 0) goto L78
            return r0
        L78:
            int r2 = r2 + 1
            goto L70
        L7b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuxu.a(java.lang.String):java.lang.String");
    }

    public static boolean b(String str) {
        return !TextUtils.isEmpty(str) && Pattern.matches("(http(s?)://)?((maps\\.google\\.(\\w)+/)|((www\\.)?google\\.(\\w)+/maps[/?])|(maps.app.goo.gl/)|(goo.gl/maps/)).*", str);
    }

    public static boolean c(String str) {
        if (b(str)) {
            return true;
        }
        return !TextUtils.isEmpty(str) && Pattern.matches("(http(s?)://)?(maps.apple.com/).*", str);
    }
}
