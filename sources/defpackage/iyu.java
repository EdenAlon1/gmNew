package defpackage;

import android.view.KeyEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyu extends ffkk implements ffix {
    final /* synthetic */ AndroidComposeView a;
    final /* synthetic */ KeyEvent b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyu(AndroidComposeView androidComposeView, KeyEvent keyEvent) {
        super(0);
        this.a = androidComposeView;
        this.b = keyEvent;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        boolean dispatchKeyEvent;
        dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent(this.b);
        return Boolean.valueOf(dispatchKeyEvent);
    }
}
