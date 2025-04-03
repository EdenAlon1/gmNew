package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzu extends oab {
    public nzu() {
        super(false);
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (bundle.containsKey(str)) {
            return Integer.valueOf(bundle.getInt(str, 0));
        }
        throw new IllegalArgumentException(a.a(str, "No saved state was found associated with the key '", "'."));
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object c(String str) {
        int parseInt;
        str.getClass();
        if (ffpc.t(str, "0x")) {
            String substring = str.substring(2);
            substring.getClass();
            parseInt = Integer.parseInt(substring, 16);
        } else {
            parseInt = Integer.parseInt(str);
        }
        return Integer.valueOf(parseInt);
    }

    @Override // defpackage.oab
    public final String e() {
        return "reference";
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        int intValue = ((Number) obj).intValue();
        str.getClass();
        bundle.putInt(str, intValue);
    }
}
