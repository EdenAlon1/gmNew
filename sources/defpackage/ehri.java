package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehri extends ehrl {
    private static float c(float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    private static float d(float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    @Override // defpackage.ehrl
    public final void a(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        float d;
        float c;
        RectF b = b(tabLayout, view);
        RectF b2 = b(tabLayout, view2);
        if (b.left < b2.left) {
            d = c(f);
            c = d(f);
        } else {
            d = d(f);
            c = c(f);
        }
        drawable.setBounds(egyv.b((int) b.left, (int) b2.left, d), drawable.getBounds().top, egyv.b((int) b.right, (int) b2.right, c), drawable.getBounds().bottom);
    }
}
