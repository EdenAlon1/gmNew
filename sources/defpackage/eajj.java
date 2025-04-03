package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eajj {
    private static final entd a = entd.c("GnpSdk");
    private static volatile eajk b = null;

    public static eajk a(Context context) {
        eajk a2;
        if (b == null) {
            Object applicationContext = context.getApplicationContext();
            if (applicationContext instanceof sdt) {
                a2 = (eajk) ((sdt) applicationContext).a();
            } else {
                try {
                    a2 = (eajk) ekhw.a(context, eajk.class);
                } catch (IllegalStateException e) {
                    ((ensz) ((ensz) a.o().g(e)).h("com/google/android/libraries/notifications/platform/inject/Gnp", "getComponent", 63, "Gnp.java")).q("Couldn't fetch GnpComponent entry point (relevant for Hilt/Tiktok integrations)");
                    try {
                        a2 = ((eajl) ekhw.a(context, eajl.class)).a();
                    } catch (IllegalStateException e2) {
                        ((ensz) ((ensz) a.o().g(e2)).h("com/google/android/libraries/notifications/platform/inject/Gnp", "getComponent", 74, "Gnp.java")).q("Couldn't fetch GnpComponentSupplier entry point (relevant for custom integrations)");
                        throw new IllegalStateException("Unable to get GnpComponent from host app: ".concat(String.valueOf(context.getPackageName())));
                    }
                }
            }
            b = a2;
        }
        b.dT().a(context);
        return b;
    }
}
