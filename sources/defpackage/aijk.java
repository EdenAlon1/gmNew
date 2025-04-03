package defpackage;

import android.app.Activity;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aijk implements aigt {
    private static final enru a = enru.c("com/google/android/apps/messaging/navigation/targets/CloseConversationNavigationHandler");
    private final Context b;

    public aijk(Context context) {
        this.b = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        Activity a2 = ddxb.a(this.b);
        if (a2 == 0) {
            throw new IllegalArgumentException("CloseConversationNavigationHandler must be created with an activity context.");
        }
        Object H = a2 instanceof ekhu ? ((ekhu) a2).H() : null;
        if (H instanceof ahpk) {
            ((enrr) a.e().h("com/google/android/apps/messaging/navigation/targets/CloseConversationNavigationHandler", "navigate", 55, "CloseConversation.kt")).q("Invoking onFinishCurrentConversation on conversation host");
            ((ahpk) H).d();
        } else {
            ((enrr) a.h().h("com/google/android/apps/messaging/navigation/targets/CloseConversationNavigationHandler", "navigate", 58, "CloseConversation.kt")).q("Dispatching Close Conversation event.");
            ellj.e(aijj.a, a2);
        }
        return ffcu.a;
    }
}
