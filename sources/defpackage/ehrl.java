package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class ehrl {
    static RectF b(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.z || !(view instanceof ehrw)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        ehrw ehrwVar = (ehrw) view;
        View[] viewArr = {ehrwVar.a, ehrwVar.b, ehrwVar.c};
        int i = 0;
        int i2 = 0;
        boolean z = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view2 = viewArr[i3];
            if (view2 != null && view2.getVisibility() == 0) {
                i2 = z ? Math.min(i2, view2.getLeft()) : view2.getLeft();
                i = z ? Math.max(i, view2.getRight()) : view2.getRight();
                z = true;
            }
        }
        int i4 = i - i2;
        View[] viewArr2 = {ehrwVar.a, ehrwVar.b, ehrwVar.c};
        int i5 = 0;
        int i6 = 0;
        boolean z2 = false;
        for (int i7 = 0; i7 < 3; i7++) {
            View view3 = viewArr2[i7];
            if (view3 != null && view3.getVisibility() == 0) {
                i6 = z2 ? Math.min(i6, view3.getTop()) : view3.getTop();
                i5 = z2 ? Math.max(i5, view3.getBottom()) : view3.getBottom();
                z2 = true;
            }
        }
        int i8 = i5 - i6;
        int a = (int) ehjg.a(ehrwVar.getContext(), 24);
        if (i4 < a) {
            i4 = a;
        }
        int left = (ehrwVar.getLeft() + ehrwVar.getRight()) / 2;
        int top = (ehrwVar.getTop() + ehrwVar.getBottom()) / 2;
        int i9 = i4 / 2;
        return new RectF(left - i9, top - (i8 / 2), left + i9, (left / 2) + top);
    }

    public void a(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF b = b(tabLayout, view);
        RectF b2 = b(tabLayout, view2);
        drawable.setBounds(egyv.b((int) b.left, (int) b2.left, f), drawable.getBounds().top, egyv.b((int) b.right, (int) b2.right, f), drawable.getBounds().bottom);
    }
}
