package defpackage;

import android.app.Activity;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aije implements aigt {
    private static final enru a = enru.c("com/google/android/apps/messaging/navigation/targets/BackNavigationHandler");
    private final Context b;

    public aije(Context context) {
        this.b = context;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        Activity a2 = ddxb.a(this.b);
        if (a2 == null) {
            throw new IllegalArgumentException("BackNavigationHandler must be created with an activity context.");
        }
        ((enrr) a.h().h("com/google/android/apps/messaging/navigation/targets/BackNavigationHandler", "navigate", 51, "Back.kt")).q("Dispatching Back navigation event.");
        ellj.e(aijd.a, a2);
        return ffcu.a;
    }
}
