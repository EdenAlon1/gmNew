package defpackage;

import android.app.Activity;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aint implements aigt {
    private static final enru a = enru.c("com/google/android/apps/messaging/navigation/targets/SignOutOfAccountNavigationHandler");
    private final Context b;

    public aint(Context context) {
        this.b = context;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        Activity a2 = ddxb.a(this.b);
        if (a2 == null) {
            throw new IllegalArgumentException("SignOutOfAccountNavigationHandler must be created with an activity context.");
        }
        ((enrr) a.h().h("com/google/android/apps/messaging/navigation/targets/SignOutOfAccountNavigationHandler", "navigate", 49, "SignOutOfAccount.kt")).q("Dispatching finish activity navigation event.");
        ellj.e(ains.a, a2);
        return ffcu.a;
    }
}
