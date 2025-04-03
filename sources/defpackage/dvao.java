package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvao {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/utils/ProcessUtil");
    private static final dume b = new dume();

    private dvao() {
    }

    public static boolean a(final Context context) {
        String str = (String) b.a(new emyl() { // from class: dvan
            /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
            
                if (r0 == null) goto L43;
             */
            /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
            @Override // defpackage.emyl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object get() {
                /*
                    r10 = this;
                    int r0 = android.os.Build.VERSION.SDK_INT
                    r1 = 28
                    if (r0 < r1) goto Lb
                    java.lang.String r0 = defpackage.abj$$ExternalSyntheticApiModelOutline0.m37m()
                    return r0
                Lb:
                    boolean r0 = defpackage.dvak.a
                    r1 = 0
                    if (r0 == 0) goto La3
                    java.lang.String r0 = "android.app.ActivityThread"
                    java.lang.Class<dvao> r2 = defpackage.dvao.class
                    java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L36
                    r3 = 0
                    java.lang.Class r0 = java.lang.Class.forName(r0, r3, r2)     // Catch: java.lang.Throwable -> L36
                    java.lang.String r2 = "currentProcessName"
                    java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L36
                    java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L36
                    r2 = 1
                    r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L36
                    java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L36
                    java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Throwable -> L36
                    boolean r2 = r0 instanceof java.lang.String     // Catch: java.lang.Throwable -> L36
                    if (r2 == 0) goto L4b
                    java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L36
                    goto L4c
                L36:
                    r0 = move-exception
                    r8 = r0
                    enru r0 = defpackage.dvao.a
                    ensk r2 = r0.e()
                    java.lang.String r5 = "processNameFromActivityThread"
                    r6 = 178(0xb2, float:2.5E-43)
                    java.lang.String r3 = "Unable to check ActivityThread"
                    java.lang.String r4 = "com/google/android/libraries/inputmethod/utils/ProcessUtil"
                    java.lang.String r7 = "ProcessUtil.java"
                    defpackage.a.p(r2, r3, r4, r5, r6, r7, r8)
                L4b:
                    r0 = r1
                L4c:
                    if (r0 == 0) goto L51
                L4e:
                    r1 = r0
                    goto Ld0
                L51:
                    android.os.StrictMode$ThreadPolicy r2 = android.os.StrictMode.allowThreadDiskReads()
                    java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
                    java.io.FileReader r0 = new java.io.FileReader     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
                    java.lang.String r4 = "/proc/self/cmdline"
                    r0.<init>(r4)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
                    r4 = 50
                    r3.<init>(r0, r4)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
                    java.lang.String r0 = r3.readLine()     // Catch: java.lang.Throwable -> L76
                    if (r0 == 0) goto L6e
                    java.lang.String r0 = r0.trim()     // Catch: java.lang.Throwable -> L76
                    goto L6f
                L6e:
                    r0 = r1
                L6f:
                    r3.close()     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
                    android.os.StrictMode.setThreadPolicy(r2)
                    goto L9c
                L76:
                    r0 = move-exception
                    r4 = r0
                    r3.close()     // Catch: java.lang.Throwable -> L7c
                    goto L80
                L7c:
                    r0 = move-exception
                    r4.addSuppressed(r0)     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
                L80:
                    throw r4     // Catch: java.lang.Throwable -> L81 java.lang.Exception -> L83
                L81:
                    r0 = move-exception
                    goto L9f
                L83:
                    r0 = move-exception
                    r9 = r0
                    enru r0 = defpackage.dvao.a     // Catch: java.lang.Throwable -> L81
                    ensk r3 = r0.i()     // Catch: java.lang.Throwable -> L81
                    java.lang.String r5 = "com/google/android/libraries/inputmethod/utils/ProcessUtil"
                    java.lang.String r6 = "processNameFromProc"
                    java.lang.String r8 = "ProcessUtil.java"
                    java.lang.String r4 = "Unable to read /proc/self/cmdline"
                    r7 = 155(0x9b, float:2.17E-43)
                    defpackage.a.p(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L81
                    android.os.StrictMode.setThreadPolicy(r2)
                    r0 = r1
                L9c:
                    if (r0 == 0) goto La3
                    goto L4e
                L9f:
                    android.os.StrictMode.setThreadPolicy(r2)
                    throw r0
                La3:
                    android.content.Context r0 = r1
                    java.lang.String r2 = "activity"
                    java.lang.Object r0 = r0.getSystemService(r2)
                    android.app.ActivityManager r0 = (android.app.ActivityManager) r0
                    if (r0 != 0) goto Lb0
                    goto Ld0
                Lb0:
                    java.util.List r0 = r0.getRunningAppProcesses()
                    if (r0 == 0) goto Ld0
                    int r2 = android.os.Process.myPid()
                    java.util.Iterator r0 = r0.iterator()
                Lbe:
                    boolean r3 = r0.hasNext()
                    if (r3 == 0) goto Ld0
                    java.lang.Object r3 = r0.next()
                    android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3
                    int r4 = r3.pid
                    if (r4 != r2) goto Lbe
                    java.lang.String r1 = r3.processName
                Ld0:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dvan.get():java.lang.Object");
            }
        });
        if (str != null) {
            return str.equals(context.getPackageName());
        }
        ((enrr) ((enrr) a.i()).h("com/google/android/libraries/inputmethod/utils/ProcessUtil", "isMainProcess", 54, "ProcessUtil.java")).q("Process name wasn't available. Assuming we're on the main process");
        return true;
    }
}
