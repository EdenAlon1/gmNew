package defpackage;

import android.content.ComponentCallbacks2;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ainv implements aigt {
    private static final enru a = enru.c("com/google/android/apps/messaging/navigation/targets/StartChatNavigationHandler");
    private final Context b;
    private final eisx c;

    public ainv(Context context, ffbr ffbrVar, eisx eisxVar) {
        ffbrVar.getClass();
        eisxVar.getClass();
        this.b = context;
        this.c = eisxVar;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        cvqo cvqoVar = ((ainu) aihsVar).a;
        ComponentCallbacks2 a2 = ddxb.a(this.b);
        if (a2 == null) {
            throw new IllegalArgumentException("StartChatNavigationHandler must be created with an activity context.");
        }
        Object H = a2 instanceof ekhu ? ((ekhu) a2).H() : null;
        if (H == null || !(H instanceof cvrj)) {
            ensk i = a.i();
            i.Y(ente.a, "StartChat");
            ((enrr) i.h("com/google/android/apps/messaging/navigation/targets/StartChatNavigationHandler", "handleGroupRename", 110, "StartChat.kt")).q("Activity to host group name edit was not found");
        } else {
            ((cvrj) H).a(cvqoVar.a, cvqoVar.b, cvqoVar.c, this.c);
        }
        return ffcu.a;
    }
}
