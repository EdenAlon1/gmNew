package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiok implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ TemplateLayout a;

    public eiok(TemplateLayout templateLayout) {
        this.a = templateLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        TemplateLayout templateLayout = this.a;
        templateLayout.getViewTreeObserver().removeOnPreDrawListener(templateLayout.e);
        TemplateLayout templateLayout2 = this.a;
        templateLayout2.setXFraction(templateLayout2.d);
        return true;
    }
}
