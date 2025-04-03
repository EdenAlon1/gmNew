package defpackage;

import android.os.Bundle;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxa extends nwt {
    public static final long[] g(String str) {
        str.getClass();
        return new long[]{((Number) oab.e.c(str)).longValue()};
    }

    @Override // defpackage.nwt
    public final /* bridge */ /* synthetic */ Object a() {
        return new long[0];
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
        long[] longArray = bundle.getLongArray(str);
        if (longArray != null) {
            return longArray;
        }
        throw new IllegalStateException(a.a(str, "The saved state value associated with the key '", "' is either null or not of the expected type. This might happen if the value was saved with a different type or if the saved state has been modified unexpectedly."));
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return g(str);
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj) {
        long[] jArr = (long[]) obj;
        if (jArr == null) {
            return g(str);
        }
        long[] g = g(str);
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, length + 1);
        System.arraycopy(g, 0, copyOf, length, 1);
        copyOf.getClass();
        return copyOf;
    }

    @Override // defpackage.oab
    public final String e() {
        return "long[]";
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        long[] jArr = (long[]) obj;
        str.getClass();
        if (jArr != null) {
            bundle.putLongArray(str, jArr);
        } else {
            bundle.putString(str, null);
        }
    }
}
