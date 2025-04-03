package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxvs extends View.AccessibilityDelegate {
    final /* synthetic */ cxvv a;

    public cxvs(cxvv cxvvVar) {
        this.a = cxvvVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(view, accessibilityEvent);
        if (accessibilityEvent.getEventType() == 2) {
            accessibilityEvent.getText().clear();
            int i = this.a.W() ? true != this.a.af() ? R.string.send_button_long_click_description_no_sim_selector : R.string.send_button_long_click_description_with_sim_selector : this.a.af() ? R.string.send_button_long_click_description_with_sim_selector_in_widget : 0;
            if (i != 0) {
                accessibilityEvent.getText().add(this.a.an.getResources().getText(i));
                accessibilityEvent.setEventType(16384);
            }
        }
    }
}
