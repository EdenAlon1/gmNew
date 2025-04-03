package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oar extends oab {
    public oar() {
        super(true);
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
        String string = bundle.getString(str);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException(a.a(str, "The saved state value associated with the key '", "' is either null or not of the expected type. This might happen if the value was saved with a different type or if the saved state has been modified unexpectedly."));
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ Object c(String str) {
        str.getClass();
        if (ffkj.e(str, "null")) {
            return null;
        }
        return str;
    }

    @Override // defpackage.oab
    public final String e() {
        return "string";
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ void f(Bundle bundle, String str, Object obj) {
        String str2 = (String) obj;
        str.getClass();
        if (str2 != null) {
            bundle.putString(str, str2);
        } else {
            bundle.putString(str, null);
        }
    }

    @Override // defpackage.oab
    public final /* bridge */ /* synthetic */ String h(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return "null";
        }
        String encode = Uri.encode(str, null);
        encode.getClass();
        return encode;
    }
}
