package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nwx extends nwt {
    public static final int[] g(String str) {
        str.getClass();
        return new int[]{((Number) oab.a.c(str)).intValue()};
    }

    @Override // defpackage.nwt
    public final /* bridge */ /* synthetic */ Object a() {
        return new int[0];
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
        int[] intArray = bundle.getIntArray(str);
        if (intArray != null) {
            return intArray;
        }
        throw new IllegalStateException(a.a(str, "The saved state value associated with the key '", "' is either null or not of the expected type. This might happen if the value was saved with a different type or if the saved state has been modified unexpectedly."));
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return g(str);
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj) {
        int[] iArr = (int[]) obj;
        return iArr != null ? ffdo.f(iArr, g(str)) : g(str);
    }

    @Override // defpackage.oab
    public final String e() {
        return "integer[]";
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        int[] iArr = (int[]) obj;
        str.getClass();
        if (iArr != null) {
            bundle.putIntArray(str, iArr);
        } else {
            bundle.putString(str, null);
        }
    }
}
