package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izk extends ffkk implements ffix {
    final /* synthetic */ AndroidComposeView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izk(AndroidComposeView androidComposeView) {
        super(0);
        this.a = androidComposeView;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        int actionMasked;
        MotionEvent motionEvent = this.a.I;
        if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
            this.a.J = SystemClock.uptimeMillis();
            AndroidComposeView androidComposeView = this.a;
            androidComposeView.post(androidComposeView.L);
        }
        return ffcu.a;
    }
}
