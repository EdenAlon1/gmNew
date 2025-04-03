package com.google.android.gms.dynamite;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.android.vcard.VCardConfig;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.IDynamiteLoader;
import com.google.android.gms.dynamite.IDynamiteLoaderV2;
import dalvik.system.DelegateLastClassLoader;
import defpackage.a;
import defpackage.dfpj;
import defpackage.dfwq;
import defpackage.dfwv;
import defpackage.dfyl;
import defpackage.dfyw;
import defpackage.dggq;
import defpackage.dggr;
import defpackage.dggs;
import defpackage.dggt;
import defpackage.dggu;
import defpackage.dggv;
import defpackage.dggw;
import defpackage.dggx;
import defpackage.dggy;
import defpackage.dggz;
import defpackage.dgha;
import defpackage.dghb;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class DynamiteModule {
    private static Boolean d = null;
    private static IDynamiteLoader e = null;
    private static IDynamiteLoaderV2 f = null;
    private static String g = null;
    private static boolean h = false;
    private static int i = -1;
    private static Boolean j;
    public final Context c;
    private static final ThreadLocal k = new ThreadLocal();
    private static final ThreadLocal l = new dggs();
    private static final dggz m = new dggt();
    public static final dghb a = new dggu();
    public static final dghb b = new dggv();

    /* compiled from: PG */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    private DynamiteModule(Context context) {
        this.c = context;
    }

    public static int a(Context context, String str) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass(a.a(str, "com.google.android.gms.dynamite.descriptors.", ".ModuleDescriptor"));
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (dfwq.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id '" + str + "'");
            return 0;
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", a.a(str, "Local module descriptor class for ", " not found."));
            return 0;
        } catch (Exception e2) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e2.getMessage())));
            return 0;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01ab -> B:24:0x01b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01ad -> B:24:0x01b0). Please report as a decompilation issue!!! */
    public static int b(Context context, String str, boolean z) {
        Field declaredField;
        Throwable th;
        RemoteException remoteException;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = d;
                int i2 = 0;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e2) {
                        Log.w("DynamiteModule", a.G(e2, "Failed to load module via V2: "));
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == ClassLoader.getSystemClassLoader()) {
                            bool = Boolean.FALSE;
                        } else if (classLoader != null) {
                            try {
                                h(classLoader);
                            } catch (dggy unused) {
                            }
                            bool = Boolean.TRUE;
                        } else {
                            if (!j(context)) {
                                return 0;
                            }
                            if (h || Boolean.TRUE.equals(null)) {
                                declaredField.set(null, ClassLoader.getSystemClassLoader());
                                bool = Boolean.FALSE;
                            } else {
                                try {
                                    int e3 = e(context, str, z, true);
                                    String str2 = g;
                                    if (str2 != null && !str2.isEmpty()) {
                                        ClassLoader a2 = dggq.a();
                                        if (a2 == null) {
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                String str3 = g;
                                                dfwv.n(str3);
                                                a2 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                            } else {
                                                String str4 = g;
                                                dfwv.n(str4);
                                                a2 = new dggr(str4, ClassLoader.getSystemClassLoader());
                                            }
                                        }
                                        h(a2);
                                        declaredField.set(null, a2);
                                        d = Boolean.TRUE;
                                        return e3;
                                    }
                                    return e3;
                                } catch (dggy unused2) {
                                    declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    bool = Boolean.FALSE;
                                }
                            }
                        }
                        d = bool;
                    }
                }
                if (bool.booleanValue()) {
                    try {
                        return e(context, str, z, false);
                    } catch (dggy e4) {
                        Log.w("DynamiteModule", "Failed to retrieve remote module version: " + e4.getMessage());
                        return 0;
                    }
                }
                IDynamiteLoader g2 = g(context);
                try {
                    if (g2 != null) {
                        try {
                            int iDynamiteLoaderVersion = g2.getIDynamiteLoaderVersion();
                            if (iDynamiteLoaderVersion >= 3) {
                                dggw dggwVar = (dggw) k.get();
                                if (dggwVar == null || (cursor = dggwVar.a) == null) {
                                    Cursor cursor2 = (Cursor) ObjectWrapper.unwrap(g2.queryForDynamiteModuleNoCrashUtils(ObjectWrapper.wrap(context), str, z, ((Long) l.get()).longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int i3 = cursor2.getInt(0);
                                                r2 = (i3 <= 0 || !i(cursor2)) ? cursor2 : null;
                                                if (r2 != null) {
                                                    r2.close();
                                                }
                                                i2 = i3;
                                            }
                                        } catch (RemoteException e5) {
                                            remoteException = e5;
                                            r2 = cursor2;
                                            Log.w("DynamiteModule", "Failed to retrieve remote module version: " + remoteException.getMessage());
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            return i2;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r2 = cursor2;
                                            if (r2 == null) {
                                                throw th;
                                            }
                                            r2.close();
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                } else {
                                    i2 = cursor.getInt(0);
                                }
                            } else if (iDynamiteLoaderVersion == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                i2 = g2.getModuleVersion2NoCrashUtils(ObjectWrapper.wrap(context), str, z);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                i2 = g2.getModuleVersion2(ObjectWrapper.wrap(context), str, z);
                            }
                        } catch (RemoteException e6) {
                            remoteException = e6;
                        }
                    }
                    return i2;
                } catch (Throwable th3) {
                    th = th3;
                }
            }
        } catch (Throwable th4) {
            dfyl.a(context);
            throw th4;
        }
    }

    public static DynamiteModule d(Context context, dghb dghbVar, String str) {
        long j2;
        DynamiteModule f2;
        Boolean bool;
        IObjectWrapper createModuleContext;
        DynamiteModule dynamiteModule;
        IDynamiteLoaderV2 iDynamiteLoaderV2;
        boolean z;
        Boolean valueOf;
        IObjectWrapper loadModule2;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            throw new dggy("null application Context");
        }
        ThreadLocal threadLocal = k;
        dggw dggwVar = (dggw) threadLocal.get();
        dggw dggwVar2 = new dggw();
        threadLocal.set(dggwVar2);
        ThreadLocal threadLocal2 = l;
        Long l2 = (Long) threadLocal2.get();
        long longValue = l2.longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.uptimeMillis()));
            dgha a2 = dghbVar.a(context, str, m);
            j2 = 0;
            try {
                Log.i("DynamiteModule", "Considering local module " + str + ":" + a2.a + " and remote module " + str + ":" + a2.b);
                int i2 = a2.c;
                if (i2 == 0 || ((i2 == -1 && a2.a == 0) || (i2 == 1 && a2.b == 0))) {
                    throw new dggy("No acceptable module " + str + " found. Local version is " + a2.a + " and remote version is " + a2.b + ".");
                }
                if (i2 == -1) {
                    f2 = f(applicationContext, str);
                } else {
                    if (i2 != 1) {
                        throw new dggy(a.h(0, "VersionPolicy returned invalid code:"));
                    }
                    try {
                        int i3 = a2.b;
                        try {
                            synchronized (DynamiteModule.class) {
                                if (!j(context)) {
                                    throw new dggy("Remote loading disabled");
                                }
                                bool = d;
                            }
                            if (bool == null) {
                                throw new dggy("Failed to determine which loading route to use.");
                            }
                            if (bool.booleanValue()) {
                                Log.i("DynamiteModule", a.z(i3, str, "Selected remote version of ", ", version >= "));
                                synchronized (DynamiteModule.class) {
                                    iDynamiteLoaderV2 = f;
                                }
                                if (iDynamiteLoaderV2 == null) {
                                    throw new dggy("DynamiteLoaderV2 was not cached.");
                                }
                                dggw dggwVar3 = (dggw) threadLocal.get();
                                if (dggwVar3 == null || dggwVar3.a == null) {
                                    throw new dggy("No result cursor");
                                }
                                Context applicationContext2 = context.getApplicationContext();
                                Cursor cursor = dggwVar3.a;
                                ObjectWrapper.wrap(null);
                                synchronized (DynamiteModule.class) {
                                    z = i >= 2;
                                    valueOf = Boolean.valueOf(z);
                                }
                                valueOf.getClass();
                                if (z) {
                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                    loadModule2 = iDynamiteLoaderV2.loadModule2NoCrashUtils(ObjectWrapper.wrap(applicationContext2), str, i3, ObjectWrapper.wrap(cursor));
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                    loadModule2 = iDynamiteLoaderV2.loadModule2(ObjectWrapper.wrap(applicationContext2), str, i3, ObjectWrapper.wrap(cursor));
                                }
                                Context context2 = (Context) ObjectWrapper.unwrap(loadModule2);
                                if (context2 == null) {
                                    throw new dggy("Failed to get module context");
                                }
                                dynamiteModule = new DynamiteModule(context2);
                            } else {
                                Log.i("DynamiteModule", a.z(i3, str, "Selected remote version of ", ", version >= "));
                                IDynamiteLoader g2 = g(context);
                                if (g2 == null) {
                                    throw new dggy("Failed to create IDynamiteLoader.");
                                }
                                int iDynamiteLoaderVersion = g2.getIDynamiteLoaderVersion();
                                if (iDynamiteLoaderVersion >= 3) {
                                    dggw dggwVar4 = (dggw) threadLocal.get();
                                    if (dggwVar4 == null) {
                                        throw new dggy("No cached result cursor holder");
                                    }
                                    createModuleContext = g2.createModuleContext3NoCrashUtils(ObjectWrapper.wrap(context), str, i3, ObjectWrapper.wrap(dggwVar4.a));
                                } else if (iDynamiteLoaderVersion == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    createModuleContext = g2.createModuleContextNoCrashUtils(ObjectWrapper.wrap(context), str, i3);
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    createModuleContext = g2.createModuleContext(ObjectWrapper.wrap(context), str, i3);
                                }
                                Object unwrap = ObjectWrapper.unwrap(createModuleContext);
                                if (unwrap == null) {
                                    throw new dggy("Failed to load remote module.");
                                }
                                dynamiteModule = new DynamiteModule((Context) unwrap);
                            }
                            f2 = dynamiteModule;
                        } catch (RemoteException e2) {
                            throw new dggy("Failed to load remote module.", e2);
                        } catch (dggy e3) {
                            throw e3;
                        } catch (Throwable th) {
                            dfyl.a(context);
                            throw new dggy("Failed to load remote module.", th);
                        }
                    } catch (dggy e4) {
                        Log.w("DynamiteModule", "Failed to load remote module: " + e4.getMessage());
                        int i4 = a2.a;
                        if (i4 == 0 || dghbVar.a(context, str, new dggx(i4)).c != -1) {
                            throw new dggy("Remote load failed. No local fallback found.", e4);
                        }
                        f2 = f(applicationContext, str);
                    }
                }
                if (longValue == 0) {
                    l.remove();
                } else {
                    l.set(l2);
                }
                Cursor cursor2 = dggwVar2.a;
                if (cursor2 != null) {
                    cursor2.close();
                }
                k.set(dggwVar);
                return f2;
            } catch (Throwable th2) {
                th = th2;
                if (longValue == j2) {
                    l.remove();
                } else {
                    l.set(l2);
                }
                Cursor cursor3 = dggwVar2.a;
                if (cursor3 != null) {
                    cursor3.close();
                }
                k.set(dggwVar);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            j2 = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x011d, code lost:
    
        if (i(r3) != false) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int e(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    private static DynamiteModule f(Context context, String str) {
        Log.i("DynamiteModule", "Selected local version of ".concat(str));
        return new DynamiteModule(context);
    }

    private static IDynamiteLoader g(Context context) {
        synchronized (DynamiteModule.class) {
            IDynamiteLoader iDynamiteLoader = e;
            if (iDynamiteLoader != null) {
                return iDynamiteLoader;
            }
            try {
                IDynamiteLoader asInterface = IDynamiteLoader.Stub.asInterface((IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance());
                if (asInterface != null) {
                    e = asInterface;
                    return asInterface;
                }
            } catch (Exception e2) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e2.getMessage());
            }
            return null;
        }
    }

    private static void h(ClassLoader classLoader) {
        try {
            f = IDynamiteLoaderV2.Stub.asInterface((IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new dggy("Failed to instantiate dynamite loader", e2);
        }
    }

    private static boolean i(Cursor cursor) {
        dggw dggwVar = (dggw) k.get();
        if (dggwVar == null || dggwVar.a != null) {
            return false;
        }
        dggwVar.a = cursor;
        return true;
    }

    private static boolean j(Context context) {
        if (Boolean.TRUE.equals(null) || Boolean.TRUE.equals(j)) {
            return true;
        }
        boolean z = false;
        if (j == null) {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.chimera", true != dfyw.b() ? 0 : VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            if (dfpj.d.i(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z = true;
            }
            Boolean valueOf = Boolean.valueOf(z);
            j = valueOf;
            valueOf.getClass();
            if (z && resolveContentProvider.applicationInfo != null && (resolveContentProvider.applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                h = true;
            }
        }
        if (!z) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z;
    }

    public final IBinder c(String str) {
        try {
            return (IBinder) this.c.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            throw new dggy("Failed to instantiate module class: ".concat(str), e2);
        }
    }
}
