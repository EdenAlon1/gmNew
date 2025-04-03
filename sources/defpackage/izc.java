package defpackage;

import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class izc extends ffkk implements ffix {
    final /* synthetic */ AndroidComposeView a;
    final /* synthetic */ MotionEvent b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izc(AndroidComposeView androidComposeView, MotionEvent motionEvent) {
        super(0);
        this.a = androidComposeView;
        this.b = motionEvent;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean dispatchGenericMotionEvent;
        dispatchGenericMotionEvent = super/*android.view.ViewGroup*/.dispatchGenericMotionEvent(this.b);
        return Boolean.valueOf(dispatchGenericMotionEvent);
    }
}
