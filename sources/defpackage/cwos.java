package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwos {
    private static final enru b = enru.c("com/google/android/apps/messaging/toast/ToastsImpl");
    public final fgcl a;

    public cwos(Context context) {
        context.getClass();
        this.a = fgcu.d(0, 5, 1);
    }

    public final void a(String str) {
        cwot cwotVar = new cwot(str);
        enru enruVar = b;
        ((enrr) enruVar.e().h("com/google/android/apps/messaging/toast/ToastsImpl", "showToast", 38, "ToastsImpl.kt")).t("showToast: %s", cwotVar);
        if (this.a.h(cwotVar)) {
            return;
        }
        ((enrr) enruVar.i().h("com/google/android/apps/messaging/toast/ToastsImpl", "showToast", 43, "ToastsImpl.kt")).t("Too many toasts that have not been collected yet. Failed with %s", cwotVar);
    }
}
