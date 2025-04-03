package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxsv extends View.AccessibilityDelegate {
    final /* synthetic */ cxsw a;

    public cxsv(cxsw cxswVar) {
        this.a = cxswVar;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        cxsw cxswVar = this.a;
        cxswVar.d.get();
        accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, cxswVar.c.getString(R.string.scheduled_send_long_click_accessibility_description)));
    }
}
