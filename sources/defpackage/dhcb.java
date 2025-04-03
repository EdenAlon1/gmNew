package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.maps.internal.ICreator;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhcb {
    private static final String a = "dhcb";
    private static Context b;
    private static ICreator c;

    public static ICreator a(Context context) {
        return b(context, null);
    }

    public static ICreator b(Context context, dhbo dhboVar) {
        dfwv.n(context);
        String str = a;
        Log.d(str, "preferredRenderer: ".concat(String.valueOf(String.valueOf(dhboVar))));
        ICreator iCreator = c;
        if (iCreator != null) {
            return iCreator;
        }
        int i = dfqe.a;
        int b2 = dfqf.b(context, 13400000);
        if (b2 != 0) {
            throw new dfqc(b2);
        }
        ICreator e = e(context, dhboVar);
        c = e;
        try {
            int rendererType = e.getRendererType();
            String packageName = context.getPackageName();
            if (rendererType != 2 || packageName.equals("com.google.android.apps.photos")) {
                Log.d(str, "not early loading native code");
            } else {
                Log.d(str, "early loading native code");
                try {
                    c.preInit(ObjectWrapper.wrap(d(context, dhboVar)));
                } catch (RemoteException e2) {
                    throw new dhcw(e2);
                } catch (UnsatisfiedLinkError unused) {
                    Log.w(a, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer's native library. Attempting to use the LEGACY renderer instead.");
                    b = null;
                    c = e(context, dhbo.LEGACY);
                }
            }
            try {
                c.initV2(ObjectWrapper.wrap(d(context, dhboVar).getResources()), 19010000);
                return c;
            } catch (RemoteException e3) {
                throw new dhcw(e3);
            }
        } catch (RemoteException e4) {
            throw new dhcw(e4);
        }
    }

    private static Context c(Exception exc, Context context) {
        Log.e(a, "Failed to load maps module, use pre-Chimera", exc);
        int i = dfqe.a;
        return dfqf.c(context);
    }

    private static Context d(Context context, dhbo dhboVar) {
        Context c2;
        Context context2 = b;
        if (context2 != null) {
            return context2;
        }
        String str = dhboVar == dhbo.LEGACY ? "com.google.android.gms.maps_legacy_dynamite" : "com.google.android.gms.maps_core_dynamite";
        try {
            c2 = DynamiteModule.d(context, DynamiteModule.a, str).c;
        } catch (Exception e) {
            if (str.equals("com.google.android.gms.maps_dynamite")) {
                c2 = c(e, context);
            } else {
                try {
                    Log.d(a, "Attempting to load maps_dynamite again.");
                    c2 = DynamiteModule.d(context, DynamiteModule.a, "com.google.android.gms.maps_dynamite").c;
                } catch (Exception e2) {
                    c2 = c(e2, context);
                }
            }
        }
        b = c2;
        if (c2 != null) {
            return c2;
        }
        throw new RuntimeException("Unable to load maps module, maps container context is null");
    }

    private static ICreator e(Context context, dhbo dhboVar) {
        Log.i(a, "Making Creator dynamically");
        ClassLoader classLoader = d(context, dhboVar).getClassLoader();
        try {
            dfwv.n(classLoader);
            IBinder iBinder = (IBinder) f(classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl"));
            if (iBinder != null) {
                return ICreator.Stub.asInterface(iBinder);
            }
            throw new RuntimeException("Unable to load maps module, IBinder for com.google.android.gms.maps.internal.CreatorImpl is null");
        } catch (ClassNotFoundException e) {
            throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl", e);
        }
    }

    private static Object f(Class cls) {
        try {
            return cls.newInstance();
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Unable to call the default constructor of ".concat(String.valueOf(cls.getName())), e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(String.valueOf(cls.getName())), e2);
        }
    }
}
