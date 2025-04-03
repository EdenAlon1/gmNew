package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nxb extends nwt {
    public static final List g(String str) {
        str.getClass();
        return ffdx.b(oab.e.c(str));
    }

    @Override // defpackage.nwt
    public final /* synthetic */ Object a() {
        return ffel.a;
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
        if (longArray == null) {
            throw new IllegalStateException(a.a(str, "The saved state value associated with the key '", "' is either null or not of the expected type. This might happen if the value was saved with a different type or if the saved state has been modified unexpectedly."));
        }
        int length = longArray.length;
        if (length == 0) {
            return ffel.a;
        }
        if (length == 1) {
            return ffdx.g(Long.valueOf(longArray[0]));
        }
        ArrayList arrayList = new ArrayList(length);
        for (long j : longArray) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object c(String str) {
        return g(str);
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object d(String str, Object obj) {
        List list = (List) obj;
        return list != null ? ffdx.ad(list, g(str)) : g(str);
    }

    @Override // defpackage.oab
    public final String e() {
        return "List<Long>";
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        List list = (List) obj;
        str.getClass();
        if (list != null) {
            bundle.putLongArray(str, ffdx.ay(list));
        } else {
            bundle.putString(str, null);
        }
    }
}
