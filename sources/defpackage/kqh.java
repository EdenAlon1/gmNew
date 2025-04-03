package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kqh {
    private final ConcurrentHashMap a = new ConcurrentHashMap();

    private static long g(Typeface typeface) {
        if (typeface == null) {
            return 0L;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (IllegalAccessException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0L;
        } catch (NoSuchFieldException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0L;
        }
    }

    private static Object h(Object[] objArr, int i, kqg kqgVar) {
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        Object obj = null;
        for (Object obj2 : objArr) {
            int i3 = i & 1;
            boolean z = (i & 2) != 0;
            int abs = Math.abs(kqgVar.a(obj2) - (1 != i3 ? 400 : 700));
            int i4 = abs + abs + (kqgVar.b(obj2) == z ? 0 : 1);
            if (obj == null || i2 > i4) {
                i2 = i4;
                obj = obj2;
            }
        }
        return obj;
    }

    public Typeface a(Context context, kpc kpcVar, Resources resources, int i) {
        kpd kpdVar = (kpd) h(kpcVar.a, i, new kqf());
        if (kpdVar == null) {
            return null;
        }
        Typeface a = kpz.a(context, resources, kpdVar.f, kpdVar.a, 0, i);
        long g = g(a);
        if (g != 0) {
            this.a.put(Long.valueOf(g), kpcVar);
        }
        return a;
    }

    public Typeface b(Context context, krt[] krtVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (krtVarArr.length <= 0) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(m(krtVarArr, i).a);
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            Typeface l = l(context, inputStream);
            kqi.b(inputStream);
            return l;
        } catch (IOException unused2) {
            kqi.b(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            inputStream2 = inputStream;
            kqi.b(inputStream2);
            throw th;
        }
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File a = kqi.a(context);
        Typeface typeface = null;
        if (a == null) {
            return null;
        }
        try {
            if (kqi.d(a, resources, i)) {
                typeface = Typeface.createFromFile(a.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            a.delete();
            throw th;
        }
        a.delete();
        return typeface;
    }

    public Typeface f(Context context, List list, int i) {
        throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }

    protected Typeface l(Context context, InputStream inputStream) {
        File a = kqi.a(context);
        Typeface typeface = null;
        if (a == null) {
            return null;
        }
        try {
            if (kqi.c(a, inputStream)) {
                typeface = Typeface.createFromFile(a.getPath());
            }
        } catch (RuntimeException unused) {
        } catch (Throwable th) {
            a.delete();
            throw th;
        }
        a.delete();
        return typeface;
    }

    protected krt m(krt[] krtVarArr, int i) {
        return (krt) h(krtVarArr, i, new kqe());
    }
}
