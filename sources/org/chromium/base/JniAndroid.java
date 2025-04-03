package org.chromium.base;

import android.util.Log;
import defpackage.fiee;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class JniAndroid {
    private JniAndroid() {
    }

    private static Throwable handleException(Throwable th, String str) {
        try {
            Log.e("cn_JniAndroid", "Handling uncaught Java exception", th);
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), new fiee(str, th));
            Log.e("cn_JniAndroid", "Global uncaught exception handler did not terminate the process.");
            return null;
        } catch (OutOfMemoryError unused) {
            return null;
        } catch (Throwable th2) {
            Log.e("cn_JniAndroid", "Exception in uncaught exception handler.", th2);
            return th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ae, code lost:
    
        r5 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String sanitizedStacktraceForUnhandledException(java.lang.Throwable r11) {
        /*
            r0 = 0
            java.lang.String r11 = android.util.Log.getStackTraceString(r11)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            java.util.regex.Pattern r1 = defpackage.fiek.a     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            boolean r1 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            if (r1 == 0) goto L10
            java.lang.String r11 = ""
            return r11
        L10:
            java.lang.String r1 = "\\n"
            java.lang.String[] r11 = r11.split(r1)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            r1 = 0
            r2 = r1
        L18:
            int r3 = r11.length     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            if (r2 >= r3) goto Lc8
            r3 = r11[r2]     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            java.lang.String r4 = "\tat "
            boolean r3 = r3.startsWith(r4)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            if (r3 == 0) goto L27
            goto Lc4
        L27:
            r3 = r11[r2]     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            java.util.regex.Pattern r4 = defpackage.fiek.b     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            java.util.regex.Matcher r4 = r4.matcher(r3)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            boolean r4 = r4.find()     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            if (r4 != 0) goto Lc2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            java.util.regex.Pattern r3 = defpackage.fiek.a     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            java.util.regex.Matcher r3 = r3.matcher(r4)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            r5 = r1
        L41:
            boolean r5 = r3.find(r5)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            if (r5 == 0) goto Lbe
            int r5 = r3.start()     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            int r6 = r3.end()     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            java.lang.String r7 = r4.substring(r5, r6)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            java.lang.String[] r8 = defpackage.fiek.c     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            int r9 = r8.length     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            r9 = r1
        L57:
            r10 = 3
            if (r9 >= r10) goto L66
            r10 = r8[r9]     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            boolean r10 = r7.startsWith(r10)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            if (r10 == 0) goto L63
            goto Lae
        L63:
            int r9 = r9 + 1
            goto L57
        L66:
            java.lang.String r8 = "chromium-"
            boolean r8 = r7.startsWith(r8)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            if (r8 == 0) goto L7f
            java.lang.String r8 = ".apk"
            boolean r8 = r7.endsWith(r8)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            if (r8 != 0) goto Lae
            java.lang.String r8 = ".aab"
            boolean r8 = r7.endsWith(r8)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            if (r8 == 0) goto L7f
            goto Lae
        L7f:
            java.lang.String[] r8 = defpackage.fiek.d     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            int r9 = r8.length     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            r9 = r1
        L83:
            r10 = 14
            if (r9 >= r10) goto L93
            r10 = r8[r9]     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            boolean r10 = r7.startsWith(r10)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            if (r10 == 0) goto L90
            goto Lae
        L90:
            int r9 = r9 + 1
            goto L83
        L93:
            boolean r8 = defpackage.fiek.a(r7)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            if (r8 == 0) goto L9a
            goto Lae
        L9a:
            java.lang.String r8 = "."
            int r8 = r7.lastIndexOf(r8)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            r9 = -1
            if (r8 != r9) goto La4
            goto Lb0
        La4:
            java.lang.String r7 = r7.substring(r1, r8)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            boolean r7 = defpackage.fiek.a(r7)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            if (r7 == 0) goto Lb0
        Lae:
            r5 = r6
            goto L41
        Lb0:
            java.lang.String r3 = "HTTP://WEBADDRESS.ELIDED"
            r4.replace(r5, r6, r3)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            int r5 = r5 + 24
            java.util.regex.Pattern r3 = defpackage.fiek.a     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            java.util.regex.Matcher r3 = r3.matcher(r4)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            goto L41
        Lbe:
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
        Lc2:
            r11[r2] = r3     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
        Lc4:
            int r2 = r2 + 1
            goto L18
        Lc8:
            java.lang.String r1 = "\n"
            java.lang.String r11 = android.text.TextUtils.join(r1, r11)     // Catch: java.lang.Throwable -> Lcf java.lang.OutOfMemoryError -> Ldb
            return r11
        Lcf:
            r11 = move-exception
            java.lang.String r11 = android.util.Log.getStackTraceString(r11)     // Catch: java.lang.OutOfMemoryError -> Ldb
            java.lang.String r1 = "Error while getting stack trace: "
            java.lang.String r11 = defpackage.a.t(r11, r1)     // Catch: java.lang.OutOfMemoryError -> Ldb
            return r11
        Ldb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.JniAndroid.sanitizedStacktraceForUnhandledException(java.lang.Throwable):java.lang.String");
    }
}
