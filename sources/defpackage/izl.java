package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izl implements Runnable {
    final /* synthetic */ AndroidComposeView a;

    public izl(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.removeCallbacks(this);
        MotionEvent motionEvent = this.a.I;
        if (motionEvent != null) {
            int toolType = motionEvent.getToolType(0);
            int actionMasked = motionEvent.getActionMasked();
            if (toolType == 3) {
                if (actionMasked == 10 || actionMasked == 1) {
                    return;
                }
            } else if (actionMasked == 1) {
                return;
            }
            int i = 7;
            if (actionMasked != 7 && actionMasked != 9) {
                i = 2;
            }
            AndroidComposeView androidComposeView = this.a;
            androidComposeView.L(motionEvent, i, androidComposeView.J, false);
        }
    }
}
