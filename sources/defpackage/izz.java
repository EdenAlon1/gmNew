package defpackage;

import android.view.accessibility.AccessibilityEvent;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class izz extends ffkk implements ffji {
    final /* synthetic */ jae a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public izz(jae jaeVar) {
        super(1);
        this.a = jaeVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AndroidComposeView androidComposeView = this.a.b;
        return Boolean.valueOf(androidComposeView.getParent().requestSendAccessibilityEvent(androidComposeView, (AccessibilityEvent) obj));
    }
}
