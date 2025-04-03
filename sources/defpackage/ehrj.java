package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehrj extends ehrl {
    @Override // defpackage.ehrl
    public final void a(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        if (f >= 0.5f) {
            view = view2;
        }
        RectF b = b(tabLayout, view);
        float a = f < 0.5f ? egyv.a(1.0f, 0.0f, 0.0f, 0.5f, f) : egyv.a(0.0f, 1.0f, 0.5f, 1.0f, f);
        drawable.setBounds((int) b.left, drawable.getBounds().top, (int) b.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (a * 255.0f));
    }
}
