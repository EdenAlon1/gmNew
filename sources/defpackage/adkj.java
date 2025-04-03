package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adkj implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ adkk a;

    public adkj(adkk adkkVar) {
        this.a = adkkVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        eg G = this.a.b.G();
        if ((G != null ? (SelectedAccountDisc) G.findViewById(R.id.selected_account_disc) : null) != null) {
            this.a.b.fe().findViewById(android.R.id.content).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ensk e = adkk.a.e();
            e.Y(ente.a, "BugleGaia");
            ((enrr) e.h("com/google/android/apps/messaging/gaia/autosignin/AutoSignInTooltipPresenterImpl$getOnGlobalLayoutListener$1", "onGlobalLayout", 129, "AutoSignInTooltipPresenterImpl.kt")).q("[Auto sign-in] Account disc found in view tree. Notifying state change");
            this.a.c();
        }
    }
}
