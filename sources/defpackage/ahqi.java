package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahqi implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ ahqt a;
    final /* synthetic */ int b;

    public ahqi(ahqt ahqtVar, int i) {
        this.a = ahqtVar;
        this.b = i;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        if (this.a.b.findViewById(R.id.contact_picker_fragment_container) != null) {
            this.a.b.getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.a.y(this.b);
        }
    }
}
