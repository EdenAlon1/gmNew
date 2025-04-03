package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oap extends nwt {
    public static final String[] g(String str) {
        str.getClass();
        return new String[]{str};
    }

    @Override // defpackage.nwt
    public final /* bridge */ /* synthetic */ Object a() {
        return new String[0];
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
        String[] stringArray = bundle.getStringArray(str);
        if (stringArray != null) {
            return stringArray;
        }
        throw new IllegalStateException(a.a(str, "The saved state value associated with the key '", "' is either null or not of the expected type. This might happen if the value was saved with a different type or if the saved state has been modified unexpectedly."));
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return g(str);
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj) {
        String[] strArr = (String[]) obj;
        if (strArr == null) {
            return g(str);
        }
        String[] g = g(str);
        int length = strArr.length;
        Object[] copyOf = Arrays.copyOf(strArr, length + 1);
        System.arraycopy(g, 0, copyOf, length, 1);
        copyOf.getClass();
        return (String[]) copyOf;
    }

    @Override // defpackage.oab
    public final String e() {
        return "string[]";
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        String[] strArr = (String[]) obj;
        str.getClass();
        if (strArr != null) {
            bundle.putStringArray(str, strArr);
        } else {
            bundle.putString(str, null);
        }
    }
}
