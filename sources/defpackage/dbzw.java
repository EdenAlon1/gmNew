package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dbzw extends View.AccessibilityDelegate {
    final /* synthetic */ int a;
    final /* synthetic */ dbzx b;

    public dbzw(dbzx dbzxVar, int i) {
        this.a = i;
        this.b = dbzxVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.c2o_accessibility_offset);
            dbzx dbzxVar = this.b;
            int i = this.a;
            dbzy dbzyVar = dbzxVar.d;
            ContentGridView contentGridView = dbzyVar.e;
            if (contentGridView != null) {
                contentGridView.aQ(dbzyVar.c, dimensionPixelSize / 2);
                dcau dcauVar = dbzyVar.d;
                if (dcauVar != null) {
                    dcauVar.C(i, dimensionPixelSize);
                }
            }
        }
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }
}
