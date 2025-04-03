package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: PG */
/* loaded from: classes.dex */
class kqa extends kqh {
    private static Class a = null;
    private static Constructor b = null;
    private static Method c = null;
    private static Method d = null;
    private static boolean e = false;

    private static Object g() {
        h();
        try {
            return b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static void h() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        if (e) {
            return;
        }
        e = true;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            e = e2;
        }
        try {
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            b = constructor;
            a = cls;
            c = method2;
            d = method;
        }
        b = constructor;
        a = cls;
        c = method2;
        d = method;
    }

    private static final File i(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    @Override // defpackage.kqh
    public Typeface a(Context context, kpc kpcVar, Resources resources, int i) {
        kpd[] kpdVarArr = kpcVar.a;
        Object g = g();
        for (kpd kpdVar : kpdVarArr) {
            File a2 = kqi.a(context);
            if (a2 != null) {
                try {
                    if (kqi.d(a2, resources, kpdVar.f)) {
                        String path = a2.getPath();
                        int i2 = kpdVar.b;
                        boolean z = kpdVar.c;
                        h();
                        try {
                            if (((Boolean) c.invoke(g, path, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue()) {
                                a2.delete();
                            }
                        } catch (IllegalAccessException | InvocationTargetException e2) {
                            throw new RuntimeException(e2);
                        }
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    a2.delete();
                    throw th;
                }
                a2.delete();
            }
            return null;
        }
        h();
        try {
            Object newInstance = Array.newInstance((Class<?>) a, 1);
            Array.set(newInstance, 0, g);
            return (Typeface) d.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // defpackage.kqh
    public Typeface b(Context context, krt[] krtVarArr, int i) {
        FileInputStream fileInputStream;
        Typeface l;
        if (krtVarArr.length <= 0) {
            return null;
        }
        krt m = m(krtVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(m.a, "r", null);
            if (openFileDescriptor == null) {
                return null;
            }
            try {
                File i2 = i(openFileDescriptor);
                try {
                    if (i2 != null && i2.canRead()) {
                        l = Typeface.createFromFile(i2);
                        openFileDescriptor.close();
                        return l;
                    }
                    l = super.l(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return l;
                } finally {
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
