package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rkh {
    public static final char[] a = "0123456789abcdef".toCharArray();
    public static final char[] b = new char[64];
    private static volatile Handler c;

    private rkh() {
    }

    public static int a(Bitmap bitmap) {
        if (!bitmap.isRecycled()) {
            try {
                return bitmap.getAllocationByteCount();
            } catch (NullPointerException unused) {
                return bitmap.getHeight() * bitmap.getRowBytes();
            }
        }
        throw new IllegalStateException("Cannot obtain size for recycled Bitmap: " + String.valueOf(bitmap) + "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + String.valueOf(bitmap.getConfig()));
    }

    public static int b(int i, int i2, Bitmap.Config config) {
        return i * i2 * c(config);
    }

    public static int c(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i = rkg.a[config.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2 && i != 3) {
                return i != 4 ? 4 : 8;
            }
        }
        return i2;
    }

    public static int d(int i) {
        return e(i, 17);
    }

    public static int e(int i, int i2) {
        return (i2 * 31) + i;
    }

    public static int f(Object obj, int i) {
        return e(obj == null ? 0 : obj.hashCode(), i);
    }

    public static Handler g() {
        if (c == null) {
            synchronized (rkh.class) {
                if (c == null) {
                    c = new Handler(Looper.getMainLooper());
                }
            }
        }
        return c;
    }

    public static List h(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static void i() {
        if (!m()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
    }

    public static void j() {
        if (!n()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static void k(Runnable runnable) {
        g().post(runnable);
    }

    public static boolean l(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static boolean m() {
        return !n();
    }

    public static boolean n() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean o(int i) {
        return i > 0 || i == Integer.MIN_VALUE;
    }

    public static boolean p(int i, int i2) {
        return o(i) && o(i2);
    }
}
