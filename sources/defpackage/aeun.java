package defpackage;

import android.app.Activity;
import android.widget.Button;
import android.widget.LinearLayout;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aeun {
    private static final entd a = entd.c("BugleInAppUpdate");

    public static void a(Activity activity, aevv aevvVar) {
        ehft ehftVar = new ehft(activity, R.style.InAppUpgradeDialogStyle);
        ehftVar.y(aevvVar.a);
        ehftVar.n(aevvVar.b);
        ehftVar.u(aevvVar.c, aevvVar.f);
        ehftVar.p(aevvVar.d, aevvVar.e);
        ehftVar.j(false);
        iv a2 = ehftVar.a();
        b(a2.b(-1));
        b(a2.b(-2));
    }

    private static void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        if (layoutParams == null) {
            ((ensz) a.n().h("com/google/android/apps/messaging/inappupdate/InAppUpdateDialogLauncher", "centerDialogButton", 45, "InAppUpdateDialogLauncher.java")).q("Unable to center buttons in the in app update warning dialog; layout params are null");
        } else {
            layoutParams.gravity = 17;
            button.setLayoutParams(layoutParams);
        }
    }
}
