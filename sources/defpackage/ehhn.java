package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.material.internal.CheckableImageButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehhn extends ktb {
    final /* synthetic */ CheckableImageButton a;

    public ehhn(CheckableImageButton checkableImageButton) {
        this.a = checkableImageButton;
    }

    @Override // defpackage.ktb
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        accessibilityEvent.setChecked(this.a.a);
    }

    @Override // defpackage.ktb
    public final void c(View view, kxu kxuVar) {
        super.c(view, kxuVar);
        kxuVar.p(this.a.b);
        kxuVar.q(this.a.a);
    }
}
