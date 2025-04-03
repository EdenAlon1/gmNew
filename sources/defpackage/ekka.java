package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.IOException;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class ekka extends ekjz implements ekhr, ekke {
    public static final /* synthetic */ int u = 0;
    public elbx s;
    public ffbr t;

    static {
        SystemClock.elapsedRealtime();
    }

    @Override // defpackage.ekhr
    public final long D() {
        long startElapsedRealtime;
        startElapsedRealtime = Process.getStartElapsedRealtime();
        return startElapsedRealtime;
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        boolean isIsolated;
        ApplicationInfo applicationInfo;
        ClassLoader classLoader;
        isIsolated = Process.isIsolated();
        if (isIsolated) {
            super.attachBaseContext(context);
            return;
        }
        super.attachBaseContext(context);
        Set set = cb.a;
        Log.i("MultiDex", "Installing application");
        if (cb.b) {
            Log.i("MultiDex", "VM has multidex support, MultiDex support library is disabled.");
            return;
        }
        IOException e = null;
        try {
            try {
                applicationInfo = getApplicationInfo();
            } catch (Exception e2) {
                Log.e("MultiDex", "MultiDex installation failure", e2);
                throw new RuntimeException("MultiDex installation failed (" + e2.getMessage() + ").");
            }
        } catch (RuntimeException e3) {
            Log.w("MultiDex", "Failure while trying to obtain ApplicationInfo from Context. Must be running in test mode. Skip patching.", e3);
            applicationInfo = null;
        }
        if (applicationInfo == null) {
            Log.i("MultiDex", "No ApplicationInfo available, i.e. running on a test Context: MultiDex support library is disabled.");
            return;
        }
        File file = new File(applicationInfo.sourceDir);
        File file2 = new File(applicationInfo.dataDir);
        synchronized (cb.a) {
            if (!cb.a.contains(file)) {
                cb.a.add(file);
                Log.w("MultiDex", "MultiDex is not guaranteed to work in SDK version " + Build.VERSION.SDK_INT + ": SDK version higher than 20 should be backed by runtime with built-in multidex capabilty but it's not the case here: java.vm.version=\"" + System.getProperty("java.vm.version") + "\"");
                try {
                    classLoader = getClassLoader();
                } catch (RuntimeException e4) {
                    Log.w("MultiDex", "Failure while trying to obtain Context class loader. Must be running in test mode. Skip patching.", e4);
                }
                if (!(classLoader instanceof BaseDexClassLoader)) {
                    Log.e("MultiDex", "Context class loader is null or not dex-capable. Must be running in test mode. Skip patching.");
                    classLoader = null;
                }
                if (classLoader != null) {
                    try {
                        File file3 = new File(getFilesDir(), "secondary-dexes");
                        if (file3.isDirectory()) {
                            Log.i("MultiDex", "Clearing old secondary dex dir (" + file3.getPath() + ").");
                            File[] listFiles = file3.listFiles();
                            if (listFiles == null) {
                                Log.w("MultiDex", "Failed to list secondary dex dir content (" + file3.getPath() + ").");
                            } else {
                                for (File file4 : listFiles) {
                                    Log.i("MultiDex", "Trying to delete old file " + file4.getPath() + " of size " + file4.length());
                                    if (file4.delete()) {
                                        Log.i("MultiDex", "Deleted old file ".concat(String.valueOf(file4.getPath())));
                                    } else {
                                        Log.w("MultiDex", "Failed to delete old file ".concat(String.valueOf(file4.getPath())));
                                    }
                                }
                                if (file3.delete()) {
                                    Log.i("MultiDex", "Deleted old secondary dex dir ".concat(String.valueOf(file3.getPath())));
                                } else {
                                    Log.w("MultiDex", "Failed to delete secondary dex dir ".concat(String.valueOf(file3.getPath())));
                                }
                            }
                        }
                    } catch (Throwable th) {
                        Log.w("MultiDex", "Something went wrong when trying to clear old MultiDex extraction, continuing without cleaning.", th);
                    }
                    File file5 = new File(file2, "code_cache");
                    try {
                        cb.c(file5);
                    } catch (IOException unused) {
                        file5 = new File(getFilesDir(), "code_cache");
                        cb.c(file5);
                    }
                    File file6 = new File(file5, "secondary-dexes");
                    cb.c(file6);
                    ce ceVar = new ce(file, file6);
                    try {
                        try {
                            cb.b(classLoader, file6, ceVar.a(this, false));
                        } catch (IOException e5) {
                            Log.w("MultiDex", "Failed to install extracted secondary dex files, retrying with forced extraction", e5);
                            cb.b(classLoader, file6, ceVar.a(this, true));
                        }
                        try {
                        } catch (IOException e6) {
                            e = e6;
                        }
                        if (e != null) {
                            throw e;
                        }
                    } finally {
                        try {
                            ceVar.close();
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
        }
        Log.i("MultiDex", "install done");
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0077, code lost:
    
        if (r0.startsWith(":privileged_process") == false) goto L19;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean e() {
        /*
            r7 = this;
            java.lang.Boolean r0 = defpackage.edyt.b
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L80
            defpackage.edyt.c = r2
            boolean r0 = defpackage.abj$$ExternalSyntheticApiModelOutline0.m44m()
            if (r0 == 0) goto L11
        Le:
            r0 = r2
            goto L7a
        L11:
            java.lang.String r0 = defpackage.edyt.a
            r3 = -1
            if (r0 == 0) goto L17
            goto L34
        L17:
            java.lang.String r0 = defpackage.edyn.a(r7)
            if (r0 != 0) goto L1f
            r0 = 0
            goto L34
        L1f:
            r4 = 58
            int r4 = r0.indexOf(r4)
            if (r4 != r3) goto L2c
            java.lang.String r0 = ""
            defpackage.edyt.a = r0
            goto L32
        L2c:
            java.lang.String r0 = r0.substring(r4)
            defpackage.edyt.a = r0
        L32:
            java.lang.String r0 = defpackage.edyt.a
        L34:
            if (r0 != 0) goto L38
        L36:
            r0 = r1
            goto L7a
        L38:
            int r4 = r0.hashCode()
            r5 = 3
            r6 = 2
            switch(r4) {
                case -737791795: goto L60;
                case -733923188: goto L56;
                case 1771111950: goto L4c;
                case 1892872565: goto L42;
                default: goto L41;
            }
        L41:
            goto L69
        L42:
            java.lang.String r4 = ":leakcanary"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L69
            r3 = r5
            goto L69
        L4c:
            java.lang.String r4 = ":train"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L69
            r3 = r2
            goto L69
        L56:
            java.lang.String r4 = ":learning_bg"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L69
            r3 = r1
            goto L69
        L60:
            java.lang.String r4 = ":primes_lifeboat"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L69
            r3 = r6
        L69:
            if (r3 == 0) goto Le
            if (r3 == r2) goto Le
            if (r3 == r6) goto Le
            if (r3 == r5) goto Le
            java.lang.String r3 = ":privileged_process"
            boolean r0 = r0.startsWith(r3)
            if (r0 == 0) goto L36
            goto Le
        L7a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            defpackage.edyt.b = r0
        L80:
            java.lang.Boolean r0 = defpackage.edyt.b
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L89
            return r2
        L89:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekka.e():boolean");
    }

    @Override // android.app.Application
    public void onCreate() {
        ekzz f;
        if (!e()) {
            super.onCreate();
            return;
        }
        if (ekyf.v()) {
            ((edys) this.t.b()).a();
            super.onCreate();
            return;
        }
        long b = ekkb.b();
        long a = ekkb.a(b);
        elds c = elds.c();
        if (c.f()) {
            ekzm e = this.s.e(a, b * 1000000);
            try {
                ekyf.r();
                f = eleg.f("Application.onCreate");
                try {
                    ((edys) this.t.b()).a();
                    super.onCreate();
                    f.close();
                    e.close();
                    return;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    e.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        elav a2 = c.a();
        try {
            f = eleg.f("Application creation");
            try {
                ekzz f2 = eleg.f("Application.onCreate");
                try {
                    ((edys) this.t.b()).a();
                    super.onCreate();
                    f2.close();
                    f.close();
                    a2.close();
                } finally {
                }
            } finally {
                try {
                    f.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
            }
        } catch (Throwable th4) {
            try {
                a2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }
}
