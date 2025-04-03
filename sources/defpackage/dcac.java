package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcac extends View.AccessibilityDelegate {
    final /* synthetic */ dcad a;

    public dcac(dcad dcadVar) {
        this.a = dcadVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.c2o_accessibility_category_offset);
            dcad dcadVar = this.a;
            dcadVar.g.aQ(dcadVar.l, dimensionPixelSize);
        }
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
