package defpackage;

import android.app.Activity;
import android.content.ComponentCallbacks2;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egab {
    public static void a(Activity activity) {
        try {
            ComponentCallbacks2 application = activity.getApplication();
            if (application instanceof efus) {
                ((efus) application).a().b(activity);
                return;
            }
            if (application instanceof fazf) {
                ComponentCallbacks2 application2 = activity.getApplication();
                if (!(application2 instanceof fazf)) {
                    throw new RuntimeException(String.format("%s does not implement %s", application2.getClass().getCanonicalName(), fazf.class.getCanonicalName()));
                }
                fazf fazfVar = (fazf) application2;
                faze ab = fazfVar.ab();
                fazfVar.getClass();
                ab.getClass();
                ab.a(activity);
            }
        } catch (IllegalArgumentException unused) {
        }
    }
}
