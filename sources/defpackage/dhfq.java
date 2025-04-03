package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Trace;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhfq {
    public static String b = "0";
    private static final String c = "dhfq";
    private static DynamiteModule e;
    private static final dfpj d = dfpj.d;
    public static final Object a = new Object();

    private dhfq() {
    }

    public static DynamiteModule a() {
        DynamiteModule dynamiteModule;
        synchronized (a) {
            dynamiteModule = e;
        }
        return dynamiteModule;
    }

    @Deprecated
    public static void b(Context context) {
        synchronized (a) {
            if (c()) {
                return;
            }
            new dhfr("PlayServices CronetProviderInstaller#installIfNeeded");
            try {
                dfwv.o(context, "Context must not be null");
                ClassLoader classLoader = dhfq.class.getClassLoader();
                dfwv.n(classLoader);
                try {
                    classLoader.loadClass("org.chromium.net.CronetEngine");
                    new dhfr("PlayServices CronetProviderInstaller#installIfNeeded verifyGooglePlayServicesIsAvailable");
                    try {
                        dfqf.d(context, 11925000);
                        Trace.endSection();
                        try {
                            new dhfr("CronetProviderInstaller#installIfNeeded DynamiteModule#load");
                            try {
                                DynamiteModule d2 = DynamiteModule.d(context, DynamiteModule.a, "com.google.android.gms.cronet_dynamite");
                                Trace.endSection();
                                try {
                                    new dhfr("PlayServices CronetProviderInstaller#installIfNeeded loading class");
                                    try {
                                        Class<?> loadClass = d2.c.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                                        if (loadClass.getClassLoader() == dhfq.class.getClassLoader()) {
                                            Log.e(c, "ImplVersion class is missing from Cronet module.");
                                            throw new dfqc(8);
                                        }
                                        Method method = loadClass.getMethod("getApiLevel", new Class[0]);
                                        Method method2 = loadClass.getMethod("getCronetVersion", new Class[0]);
                                        Integer num = (Integer) d(method, new Object[0]);
                                        dfwv.n(num);
                                        int intValue = num.intValue();
                                        String str = (String) d(method2, new Object[0]);
                                        dfwv.n(str);
                                        b = str;
                                        Trace.endSection();
                                        if (intValue >= 3) {
                                            e = d2;
                                            Trace.endSection();
                                            return;
                                        }
                                        Intent j = d.j(context, 2, "cr");
                                        if (j == null) {
                                            Log.e(c, "Unable to fetch error resolution intent");
                                            throw new dfqc(2);
                                        }
                                        throw new dfqd(2, "Google Play Services update is required. The API Level of the client is 3. The API Level of the implementation is " + intValue + ". The Cronet implementation version is " + b, j);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                } catch (Exception e2) {
                                    Log.e(c, "Unable to read Cronet version from the Cronet module ", e2);
                                    throw ((dfqc) new dfqc(8).initCause(e2));
                                }
                            } finally {
                                try {
                                    Trace.endSection();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                        } catch (dggy e3) {
                            Log.e(c, "Unable to load Cronet module", e3);
                            throw ((dfqc) new dfqc(8).initCause(e3));
                        }
                    } finally {
                    }
                } catch (ClassNotFoundException e4) {
                    Log.e(c, "Cronet API is not available. Have you included all required dependencies?");
                    throw ((dfqc) new dfqc(10).initCause(e4));
                }
            } finally {
            }
        }
    }

    public static boolean c() {
        return a() != null;
    }

    private static Object d(Method method, Object... objArr) {
        return method.invoke(null, objArr);
    }
}
