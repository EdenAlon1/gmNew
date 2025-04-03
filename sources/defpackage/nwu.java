package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nwu extends nwt {
    public static final float[] g(String str) {
        str.getClass();
        return new float[]{((Number) oab.h.c(str)).floatValue()};
    }

    @Override // defpackage.nwt
    public final /* bridge */ /* synthetic */ Object a() {
        return new float[0];
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (!bundle.containsKey(str)) {
            return null;
        }
        if (bundle.containsKey(str) && bundle.get(str) == null) {
            return null;
        }
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException(a.a(str, "No saved state was found associated with the key '", "'."));
        }
        float[] floatArray = bundle.getFloatArray(str);
        if (floatArray != null) {
            return floatArray;
        }
        throw new IllegalStateException(a.a(str, "The saved state value associated with the key '", "' is either null or not of the expected type. This might happen if the value was saved with a different type or if the saved state has been modified unexpectedly."));
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return g(str);
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj) {
        float[] fArr = (float[]) obj;
        if (fArr == null) {
            return g(str);
        }
        float[] g = g(str);
        int length = fArr.length;
        float[] copyOf = Arrays.copyOf(fArr, length + 1);
        System.arraycopy(g, 0, copyOf, length, 1);
        copyOf.getClass();
        return copyOf;
    }

    @Override // defpackage.oab
    public final String e() {
        return "float[]";
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        float[] fArr = (float[]) obj;
        str.getClass();
        if (fArr != null) {
            bundle.putFloatArray(str, fArr);
        } else {
            bundle.putString(str, null);
        }
    }
}
