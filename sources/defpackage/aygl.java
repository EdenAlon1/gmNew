package defpackage;

import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aygl {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/conversation/draft/ComposeRowStateKt");

    public static final ComposeRowState a(Intent intent) {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        intent.getClass();
        if (Build.VERSION.SDK_INT > 33) {
            parcelableExtra2 = intent.getParcelableExtra("compose_row_state", ComposeRowState.class);
            parcelableExtra = (Parcelable) parcelableExtra2;
        } else {
            parcelableExtra = intent.getParcelableExtra("compose_row_state");
        }
        ComposeRowState composeRowState = (ComposeRowState) parcelableExtra;
        ensk h = a.h();
        h.Y(ente.a, "BugleComposeRow2");
        enrr enrrVar = (enrr) h;
        enrrVar.aa(ensy.SMALL);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/conversation/draft/ComposeRowStateKt", "getComposeRowState", 196, "ComposeRowState.kt")).t("Intent.getComposeRowState %s", composeRowState);
        return aygn.a(composeRowState, 3);
    }

    public static final ComposeRowState b(llv llvVar) {
        ComposeRowState composeRowState = (ComposeRowState) llvVar.b("compose_row_state");
        ensk h = a.h();
        h.Y(ente.a, "BugleComposeRow2");
        enrr enrrVar = (enrr) h;
        enrrVar.aa(ensy.SMALL);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/conversation/draft/ComposeRowStateKt", "getComposeRowState", 240, "ComposeRowState.kt")).t("SavedStateHandle.getComposeRowState %s", composeRowState);
        return aygn.a(composeRowState, 5);
    }

    public static final ComposeRowState c(Intent intent) {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        intent.getClass();
        if (Build.VERSION.SDK_INT > 33) {
            parcelableExtra2 = intent.getParcelableExtra("compose_row_state", ComposeRowState.class);
            parcelableExtra = (Parcelable) parcelableExtra2;
        } else {
            parcelableExtra = intent.getParcelableExtra("compose_row_state");
        }
        ComposeRowState composeRowState = (ComposeRowState) parcelableExtra;
        intent.removeExtra("compose_row_state");
        ensk h = a.h();
        h.Y(ente.a, "BugleComposeRow2");
        enrr enrrVar = (enrr) h;
        enrrVar.aa(ensy.SMALL);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/conversation/draft/ComposeRowStateKt", "removeComposeRowState", 207, "ComposeRowState.kt")).t("Intent.removeComposeRowState %s", composeRowState);
        return aygn.a(composeRowState, 3);
    }

    public static final ComposeRowState d(llv llvVar) {
        ComposeRowState composeRowState = (ComposeRowState) llvVar.c("compose_row_state");
        ensk h = a.h();
        h.Y(ente.a, "BugleComposeRow2");
        enrr enrrVar = (enrr) h;
        enrrVar.aa(ensy.SMALL);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/conversation/draft/ComposeRowStateKt", "removeComposeRowState", 249, "ComposeRowState.kt")).t("SavedStateHandle.removeComposeRowState %s", composeRowState);
        return aygn.a(composeRowState, 5);
    }

    public static final boolean e(Intent intent) {
        intent.getClass();
        return intent.hasExtra("compose_row_state");
    }

    public static final void f(Intent intent, ComposeRowState composeRowState) {
        intent.getClass();
        ComposeRowState b = aygn.b(composeRowState, 3);
        ensk h = a.h();
        h.Y(ente.a, "BugleComposeRow2");
        enrr enrrVar = (enrr) h;
        enrrVar.aa(ensy.SMALL);
        ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/conversation/draft/ComposeRowStateKt", "putComposeRowState", 214, "ComposeRowState.kt")).t("Intent.putComposeRowState %s", b);
        intent.putExtra("compose_row_state", b).getClass();
    }
}
