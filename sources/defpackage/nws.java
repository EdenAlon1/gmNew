package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nws extends oab {
    public nws() {
        super(false);
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
        if (bundle.containsKey(str)) {
            return Boolean.valueOf(bundle.getBoolean(str, false));
        }
        throw new IllegalArgumentException(a.a(str, "No saved state was found associated with the key '", "'."));
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object c(String str) {
        boolean z;
        str.getClass();
        if (ffkj.e(str, "true")) {
            z = true;
        } else {
            if (!ffkj.e(str, "false")) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.oab
    public final String e() {
        return "boolean";
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        str.getClass();
        bundle.putBoolean(str, booleanValue);
    }
}
