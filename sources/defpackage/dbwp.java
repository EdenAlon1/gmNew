package defpackage;

import android.view.animation.Animation;
import com.google.android.apps.messaging.ui.generic.spannedautocomplete.SpannedAutoCompleteList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbwp implements Animation.AnimationListener {
    final /* synthetic */ SpannedAutoCompleteList a;

    public dbwp(SpannedAutoCompleteList spannedAutoCompleteList) {
        this.a = spannedAutoCompleteList;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        SpannedAutoCompleteList spannedAutoCompleteList = this.a;
        if (!spannedAutoCompleteList.b) {
            spannedAutoCompleteList.setVisibility(8);
            this.a.a.setVisibility(8);
            this.a.a.layout(0, 0, 0, 0);
        }
        this.a.a.setVerticalScrollBarEnabled(true);
        this.a.c = null;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
