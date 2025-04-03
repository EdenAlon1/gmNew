package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecov {
    private final ffbr i;
    private static final enip d = enip.t("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");
    private static final Pattern e = Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
    public static final Pattern a = Pattern.compile("([^\\?]+)(\\?+)");
    private static final Pattern f = Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
    public static final Pattern b = Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+$)");
    public static final Pattern c = Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+\\.[\\w]*$)");
    private static final Pattern g = Pattern.compile("([a-zA-Z0-9-_]+)");
    private static final Pattern h = Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");

    public ecov(ffbr ffbrVar) {
        this.i = ffbrVar;
    }

    static String a(String str) {
        Matcher matcher = f.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    static String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = h.matcher(str);
        return matcher.find() ? matcher.replaceFirst("<ip>") : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String d(java.lang.String r4, boolean r5) {
        /*
            boolean r0 = defpackage.emxe.c(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 1
            if (r5 == 0) goto Ld
        Lb:
            r5 = r0
            goto L16
        Ld:
            java.lang.String r5 = a(r4)
            if (r5 == 0) goto L15
            r4 = r5
            goto Lb
        L15:
            r5 = 0
        L16:
            java.util.regex.Pattern r2 = defpackage.ecov.a
            java.util.regex.Matcher r2 = r2.matcher(r4)
            boolean r3 = r2.find()
            if (r3 == 0) goto L27
            java.lang.String r4 = r2.group(r0)
            r5 = r0
        L27:
            java.lang.String r2 = b(r4)
            if (r2 == 0) goto L34
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L34
            r5 = r0
        L34:
            if (r2 == 0) goto L49
            java.util.regex.Pattern r4 = defpackage.ecov.h
            java.util.regex.Matcher r4 = r4.matcher(r2)
            boolean r3 = r4.find()
            if (r3 == 0) goto L49
            java.lang.String r5 = "<ip>"
            java.lang.String r2 = r4.replaceFirst(r5)
            r5 = r0
        L49:
            if (r2 == 0) goto L5f
            if (r5 != 0) goto L5f
            java.util.regex.Pattern r4 = defpackage.ecov.g
            java.util.regex.Matcher r4 = r4.matcher(r2)
            boolean r5 = r4.find()
            if (r5 != 0) goto L5a
            return r1
        L5a:
            java.lang.String r4 = r4.group(r0)
            return r4
        L5f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecov.d(java.lang.String, boolean):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0160, code lost:
    
        if (r5.equals("http/2+quic/43") != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01cf, code lost:
    
        r5 = d(r5, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01d3, code lost:
    
        if (r5 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01d5, code lost:
    
        r5 = defpackage.ecov.f.matcher(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01df, code lost:
    
        if (r5.matches() == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01e1, code lost:
    
        r5 = r5.group(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e7, code lost:
    
        if (r5 == null) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01e9, code lost:
    
        r4.copyOnWrite();
        r8 = (defpackage.fgna) r4.instance;
        r8.b |= 524288;
        r8.u = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01e6, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01cc, code lost:
    
        if (r8 != 2) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0395 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final defpackage.fgqx c(java.lang.Iterable r19) {
        /*
            Method dump skipped, instructions count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecov.c(java.lang.Iterable):fgqx");
    }
}
