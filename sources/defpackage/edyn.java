package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edyn {
    private static String a;
    private static Boolean b;

    private edyn() {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r6) {
        /*
            java.lang.String r0 = "CurrentProcess"
            java.lang.String r1 = defpackage.edyn.a
            if (r1 == 0) goto L7
            return r1
        L7:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L14
            java.lang.String r6 = defpackage.abj$$ExternalSyntheticApiModelOutline0.m37m()
            defpackage.edyn.a = r6
            return r6
        L14:
            java.lang.String r1 = "robolectric"
            java.lang.String r2 = android.os.Build.FINGERPRINT
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 != 0) goto L92
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class<edyn> r3 = defpackage.edyn.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: java.lang.Throwable -> L45
            r4 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r4, r3)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "currentProcessName"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L45
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r5)     // Catch: java.lang.Throwable -> L45
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L45
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.Throwable -> L45
            boolean r3 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L4b
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L45
            goto L4c
        L45:
            r1 = move-exception
            java.lang.String r3 = "Unable to check ActivityThread"
            android.util.Log.d(r0, r3, r1)
        L4b:
            r1 = r2
        L4c:
            defpackage.edyn.a = r1
            if (r1 != 0) goto L91
            android.os.StrictMode$ThreadPolicy r1 = android.os.StrictMode.allowThreadDiskReads()
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            java.lang.String r5 = "/proc/self/cmdline"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            r5 = 50
            r3.<init>(r4, r5)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            java.lang.String r4 = r3.readLine()     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = r4.trim()     // Catch: java.lang.Throwable -> L71
            r3.close()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            android.os.StrictMode.setThreadPolicy(r1)
            goto L87
        L71:
            r4 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L76
            goto L7a
        L76:
            r3 = move-exception
            r4.addSuppressed(r3)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
        L7a:
            throw r4     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
        L7b:
            r6 = move-exception
            goto L8d
        L7d:
            r3 = move-exception
            java.lang.String r4 = "Unable to read /proc/self/cmdline"
            android.util.Log.e(r0, r4, r3)     // Catch: java.lang.Throwable -> L7b
            android.os.StrictMode.setThreadPolicy(r1)
            r4 = r2
        L87:
            defpackage.edyn.a = r4
            if (r4 != 0) goto L8c
            goto L92
        L8c:
            return r4
        L8d:
            android.os.StrictMode.setThreadPolicy(r1)
            throw r6
        L91:
            return r1
        L92:
            java.lang.String r0 = "activity"
            java.lang.Object r6 = r6.getSystemService(r0)
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6
            java.util.List r6 = r6.getRunningAppProcesses()
            if (r6 == 0) goto Lba
            int r0 = android.os.Process.myPid()
            java.util.Iterator r6 = r6.iterator()
        La8:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto Lba
            java.lang.Object r1 = r6.next()
            android.app.ActivityManager$RunningAppProcessInfo r1 = (android.app.ActivityManager.RunningAppProcessInfo) r1
            int r3 = r1.pid
            if (r3 != r0) goto La8
            java.lang.String r2 = r1.processName
        Lba:
            defpackage.edyn.a = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.edyn.a(android.content.Context):java.lang.String");
    }

    public static boolean b() {
        boolean isApplicationUid;
        if (b == null) {
            isApplicationUid = Process.isApplicationUid(Process.myUid());
            b = Boolean.valueOf(isApplicationUid);
        }
        return b.booleanValue();
    }
}
