package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nww extends oab {
    public nww() {
        super(false);
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object b(Bundle bundle, String str) {
        str.getClass();
        if (bundle.containsKey(str)) {
            return Float.valueOf(bundle.getFloat(str, 0.0f));
        }
        throw new IllegalArgumentException(a.a(str, "No saved state was found associated with the key '", "'."));
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object c(String str) {
        str.getClass();
        return Float.valueOf(Float.parseFloat(str));
    }

    @Override // defpackage.oab
    public final String e() {
        return "float";
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        float floatValue = ((Number) obj).floatValue();
        str.getClass();
        bundle.putFloat(str, floatValue);
    }
}
