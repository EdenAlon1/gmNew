package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
final class kln {
    protected static final Class a;
    protected static final Field b;
    protected static final Field c;
    protected static final Method d;
    protected static final Method e;
    protected static final Method f;
    public static final Handler g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            defpackage.kln.g = r0
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r1 = r0
        L14:
            defpackage.kln.a = r1
            r1 = 1
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r2 = r0
        L24:
            defpackage.kln.b = r2
            java.lang.Class<android.app.Activity> r2 = android.app.Activity.class
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L32
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L32
            goto L33
        L32:
            r2 = r0
        L33:
            defpackage.kln.c = r2
            java.lang.Class r2 = defpackage.kln.a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r2 != 0) goto L40
        L3e:
            r2 = r0
            goto L55
        L40:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L3e
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L3e
            r7[r1] = r8     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch: java.lang.Throwable -> L3e
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L3e
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L3e
        L55:
            defpackage.kln.d = r2
            java.lang.Class r2 = defpackage.kln.a
            if (r2 != 0) goto L5d
        L5b:
            r2 = r0
            goto L6e
        L5d:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L5b
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L5b
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L5b
            r7[r1] = r8     // Catch: java.lang.Throwable -> L5b
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L5b
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> L5b
        L6e:
            defpackage.kln.e = r2
            boolean r2 = a()
            if (r2 == 0) goto Lab
            java.lang.Class r2 = defpackage.kln.a
            if (r2 != 0) goto L7b
            goto Lab
        L7b:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lab
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> Lab
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r1] = r6     // Catch: java.lang.Throwable -> Lab
            r7[r5] = r6     // Catch: java.lang.Throwable -> Lab
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lab
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lab
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lab
            r5 = 4
            r7[r5] = r3     // Catch: java.lang.Throwable -> Lab
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            r6 = 5
            r7[r6] = r5     // Catch: java.lang.Throwable -> Lab
            r6 = 6
            r7[r6] = r5     // Catch: java.lang.Throwable -> Lab
            r5 = 7
            r7[r5] = r3     // Catch: java.lang.Throwable -> Lab
            r5 = 8
            r7[r5] = r3     // Catch: java.lang.Throwable -> Lab
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> Lab
            r2.setAccessible(r1)     // Catch: java.lang.Throwable -> Lab
            r0 = r2
        Lab:
            defpackage.kln.f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kln.<clinit>():void");
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT == 26 || Build.VERSION.SDK_INT == 27;
    }
}
