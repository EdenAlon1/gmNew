package defpackage;

import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.CategoryToggleView;
import java.util.Collections;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dcae implements dcat {
    public final eymn h;
    public dbzn i;
    protected CategoryToggleView j;
    protected int k;
    protected int l;

    protected dcae(eymn eymnVar, int i) {
        this.h = eymnVar;
        this.l = i;
    }

    public abstract int a();

    public abstract int b();

    protected abstract int c();

    public Set d() {
        return Collections.EMPTY_SET;
    }

    public void gB(View view) {
        CategoryToggleView categoryToggleView = (CategoryToggleView) view.findViewById(R.id.c2o_category_toggle);
        if (categoryToggleView == null) {
            return;
        }
        int c = c();
        this.j = categoryToggleView;
        if (c == -1) {
            categoryToggleView.setVisibility(8);
            return;
        }
        categoryToggleView.setVisibility(0);
        this.j.a.setImageResource(c);
        CategoryToggleView categoryToggleView2 = this.j;
        if (m()) {
            categoryToggleView2.a.setAlpha(1.0f);
            TypedArray obtainStyledAttributes = categoryToggleView2.getContext().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
            if (obtainStyledAttributes != null) {
                categoryToggleView2.b.setForeground(obtainStyledAttributes.getDrawable(0));
                obtainStyledAttributes.recycle();
            }
        } else {
            categoryToggleView2.a.setAlpha(categoryToggleView2.c);
            categoryToggleView2.b.setForeground(null);
        }
        CategoryToggleView categoryToggleView3 = this.j;
        categoryToggleView3.d = this;
        categoryToggleView3.getLayoutParams().height = a() != -2 ? categoryToggleView.getResources().getDimensionPixelSize(a()) : -1;
        int b = b();
        FrameLayout frameLayout = this.j.b;
        if (b <= 0 || !m()) {
            frameLayout.setImportantForAccessibility(2);
            frameLayout.setContentDescription(null);
        } else {
            frameLayout.setImportantForAccessibility(1);
            frameLayout.setContentDescription(categoryToggleView.getResources().getString(b));
        }
    }

    public abstract boolean m();

    public abstract int n();

    protected int o() {
        return R.layout.compose2o_item_placeholder;
    }

    public void v(dbzn dbznVar) {
        this.i = dbznVar;
    }

    public void w(int i) {
        this.l = i;
    }

    public void x(int i) {
        this.k = i;
    }

    public void h() {
    }

    public void q() {
    }

    public void r() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    public void f(cxqz cxqzVar) {
    }

    public void g(Bundle bundle) {
    }

    public void i(Bundle bundle) {
    }

    public void p(Configuration configuration) {
    }
}
