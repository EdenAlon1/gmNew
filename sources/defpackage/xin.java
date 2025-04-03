package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xin {
    public static final xim a(Bundle bundle) {
        if (bundle.containsKey("COMPOSE_ROW_MODE")) {
            return xim.values()[bundle.getInt("COMPOSE_ROW_MODE")];
        }
        return null;
    }

    public static final void b(Bundle bundle, xim ximVar) {
        if (ximVar == null) {
            bundle.remove("COMPOSE_ROW_MODE");
        } else {
            bundle.putInt("COMPOSE_ROW_MODE", ximVar.ordinal());
        }
    }
}
