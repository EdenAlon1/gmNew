package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nwq extends nwt {
    public static final boolean[] g(String str) {
        str.getClass();
        return new boolean[]{((Boolean) oab.k.c(str)).booleanValue()};
    }

    @Override // defpackage.nwt
    public final /* bridge */ /* synthetic */ Object a() {
        return new boolean[0];
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
        boolean[] booleanArray = bundle.getBooleanArray(str);
        if (booleanArray != null) {
            return booleanArray;
        }
        throw new IllegalStateException(a.a(str, "The saved state value associated with the key '", "' is either null or not of the expected type. This might happen if the value was saved with a different type or if the saved state has been modified unexpectedly."));
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return g(str);
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj) {
        boolean[] zArr = (boolean[]) obj;
        if (zArr == null) {
            return g(str);
        }
        boolean[] g = g(str);
        int length = zArr.length;
        boolean[] copyOf = Arrays.copyOf(zArr, length + 1);
        System.arraycopy(g, 0, copyOf, length, 1);
        copyOf.getClass();
        return copyOf;
    }

    @Override // defpackage.oab
    public final String e() {
        return "boolean[]";
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        boolean[] zArr = (boolean[]) obj;
        str.getClass();
        if (zArr != null) {
            bundle.putBooleanArray(str, zArr);
        } else {
            bundle.putString(str, null);
        }
    }
}
