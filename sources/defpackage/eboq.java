package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.apps.messaging.R;
import java.util.EnumMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class eboq {
    public static eboq e(Context context) {
        return f(context, emux.a);
    }

    public static eboq f(Context context, emxc emxcVar) {
        boolean g = g(context);
        enhk h = h(context, emxcVar);
        enhd enhdVar = new enhd();
        for (eboo ebooVar : eboo.values()) {
            enhdVar.k(ebooVar, Integer.valueOf(context.getColor(g ? ebooVar.e : ebooVar.f)));
        }
        return new ebns(g, h, enhdVar.c());
    }

    public static boolean g(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    /* JADX WARN: Finally extract failed */
    private static enhk h(Context context, emxc emxcVar) {
        ebop[] values = ebop.values();
        int length = values.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = values[i].g;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        EnumMap enumMap = new EnumMap(ebop.class);
        for (int i2 = 0; i2 < values.length; i2++) {
            try {
                try {
                    ebop ebopVar = values[i2];
                    enumMap.put((EnumMap) ebopVar, (ebop) Integer.valueOf(obtainStyledAttributes.getColor(i2, context.getResources().getColor(ebopVar.h))));
                } catch (UnsupportedOperationException e) {
                    if (!emxcVar.g()) {
                        throw e;
                    }
                    Object c = emxcVar.c();
                    final String packageName = context.getPackageName();
                    final boolean c2 = ebos.c(context);
                    final boolean f = ebnr.f(context);
                    final boolean g = g(context);
                    final int min = Math.min(i2, 3);
                    final boolean i3 = i(i2 + 1, obtainStyledAttributes, context);
                    final ebun ebunVar = (ebun) c;
                    ((ebun) c).a(new Runnable() { // from class: ebum
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((efkw) ((ebvd) ebun.this.a.get()).k.get()).a(packageName, Boolean.valueOf(c2), Boolean.valueOf(f), Boolean.valueOf(g), Integer.valueOf(min), Boolean.valueOf(i3));
                        }
                    });
                    throw e;
                }
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        obtainStyledAttributes.recycle();
        return ennc.c(enumMap);
    }

    private static boolean i(int i, TypedArray typedArray, Context context) {
        ebop[] values = ebop.values();
        if (i == values.length) {
            return false;
        }
        try {
            typedArray.getColor(i, context.getResources().getColor(values[i].h));
            return false;
        } catch (UnsupportedOperationException unused) {
            return true;
        }
    }

    public abstract enhk a();

    public abstract enhk b();

    public abstract boolean c();

    public final int d(eboo ebooVar) {
        Integer num = (Integer) b().get(ebooVar);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("Unsupported GoogleColors value");
    }
}
