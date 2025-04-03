package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kqb extends kqa {
    protected final Class a;
    protected final Constructor b;
    protected final Method c;
    protected final Method d;
    protected final Method e;
    protected final Method f;
    protected final Method g;

    public kqb() {
        Class<?> cls;
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            constructor = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
            Class<?> cls3 = Integer.TYPE;
            method3 = cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls.getMethod("freeze", new Class[0]);
            method = cls.getMethod("abortCreation", new Class[0]);
            method5 = e(cls);
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(String.valueOf(e.getClass().getName())), e);
            cls = null;
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.a = cls;
        this.b = constructor;
        this.c = method2;
        this.d = method3;
        this.e = method4;
        this.f = method;
        this.g = method5;
    }

    private final Object g() {
        try {
            return this.b.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private final void h(Object obj) {
        try {
            this.f.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private final boolean i(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.c.invoke(obj, context.getAssets(), str, 0, false, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private final boolean j(Object obj) {
        try {
            return ((Boolean) this.e.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private final boolean k() {
        if (this.c == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.c != null;
    }

    @Override // defpackage.kqa, defpackage.kqh
    public final Typeface a(Context context, kpc kpcVar, Resources resources, int i) {
        FontVariationAxis[] fromFontVariationSettings;
        if (!k()) {
            return super.a(context, kpcVar, resources, i);
        }
        Object g = g();
        if (g != null) {
            kpd[] kpdVarArr = kpcVar.a;
            int length = kpdVarArr.length;
            int i2 = 0;
            while (i2 < length) {
                kpd kpdVar = kpdVarArr[i2];
                String str = kpdVar.a;
                int i3 = kpdVar.e;
                int i4 = kpdVar.b;
                boolean z = kpdVar.c;
                fromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(kpdVar.d);
                Context context2 = context;
                if (!i(context2, g, str, i3, i4, z ? 1 : 0, fromFontVariationSettings)) {
                    h(g);
                    return null;
                }
                i2++;
                context = context2;
            }
            if (j(g)) {
                return c(g);
            }
        }
        return null;
    }

    @Override // defpackage.kqa, defpackage.kqh
    public final Typeface b(Context context, krt[] krtVarArr, int i) {
        Typeface c;
        Typeface.Builder weight;
        Typeface.Builder italic;
        Typeface build;
        if (krtVarArr.length <= 0) {
            return null;
        }
        if (!k()) {
            krt m = m(krtVarArr, i);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(m.a, "r", null);
                if (openFileDescriptor == null) {
                    return null;
                }
                try {
                    weight = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(m.c);
                    italic = weight.setItalic(m.d);
                    build = italic.build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (krt krtVar : krtVarArr) {
            if (krtVar.e == 0) {
                Uri uri = krtVar.a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, kqi.e(context, uri));
                }
            }
        }
        Map unmodifiableMap = DesugarCollections.unmodifiableMap(hashMap);
        Object g = g();
        if (g == null) {
            return null;
        }
        int length = krtVarArr.length;
        int i2 = 0;
        boolean z = false;
        while (i2 < length) {
            krt krtVar2 = krtVarArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(krtVar2.a);
            if (byteBuffer != null) {
                if (!((Boolean) this.d.invoke(g, byteBuffer, Integer.valueOf(krtVar2.b), null, Integer.valueOf(krtVar2.c), Integer.valueOf(krtVar2.d ? 1 : 0))).booleanValue()) {
                    h(g);
                    return null;
                }
                z = true;
            }
            i2++;
            z = z;
        }
        if (!z) {
            h(g);
            return null;
        }
        if (j(g) && (c = c(g)) != null) {
            return Typeface.create(c, i);
        }
        return null;
    }

    protected Typeface c(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.a, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.g.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // defpackage.kqh
    public final Typeface d(Context context, Resources resources, int i, String str, int i2) {
        if (!k()) {
            return super.d(context, resources, i, str, i2);
        }
        Object g = g();
        if (g != null) {
            if (!i(context, g, str, 0, -1, -1, null)) {
                h(g);
                return null;
            }
            if (j(g)) {
                return c(g);
            }
        }
        return null;
    }

    protected Method e(Class cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance((Class<?>) cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
