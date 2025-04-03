package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.R;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.google.android.setupcompat.internal.TemplateLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiqr implements eiph {
    public final TemplateLayout a;
    public final boolean b;
    private final boolean c;

    public eiqr(TemplateLayout templateLayout, AttributeSet attributeSet, int i) {
        this.a = templateLayout;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = templateLayout.getContext().obtainStyledAttributes(attributeSet, eipy.p, i, 0);
            r0 = obtainStyledAttributes.hasValue(0) ? obtainStyledAttributes.getBoolean(0, false) : false;
            obtainStyledAttributes.recycle();
            ProgressBar a = a();
            if (a != null) {
                a.setVisibility(true != this.b ? 8 : 4);
            }
        }
        this.b = r0;
        this.c = eios.q(templateLayout.getContext());
    }

    public final ProgressBar a() {
        if (this.c) {
            return (LinearProgressIndicator) this.a.g(R.id.sud_layout_progress_indicator);
        }
        return (ProgressBar) this.a.g(true != this.b ? R.id.sud_layout_progress : R.id.sud_glif_progress_bar);
    }
}
