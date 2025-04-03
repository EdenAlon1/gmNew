package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehgr extends ehgf {
    final /* synthetic */ ExtendedFloatingActionButton c;
    private final ehgu d;
    private final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ehgr(ExtendedFloatingActionButton extendedFloatingActionButton, ehgd ehgdVar, ehgu ehguVar, boolean z) {
        super(extendedFloatingActionButton, ehgdVar);
        this.c = extendedFloatingActionButton;
        this.d = ehguVar;
        this.e = z;
    }

    @Override // defpackage.ehgf, defpackage.ehhj
    public final AnimatorSet a() {
        egza c = c();
        if (c.f("width")) {
            PropertyValuesHolder[] g = c.g("width");
            g[0].setFloatValues(this.c.getWidth(), this.d.d());
            c.e("width", g);
        }
        if (c.f("height")) {
            PropertyValuesHolder[] g2 = c.g("height");
            g2[0].setFloatValues(this.c.getHeight(), this.d.a());
            c.e("height", g2);
        }
        if (c.f("paddingStart")) {
            PropertyValuesHolder[] g3 = c.g("paddingStart");
            g3[0].setFloatValues(this.c.getPaddingStart(), this.d.c());
            c.e("paddingStart", g3);
        }
        if (c.f("paddingEnd")) {
            PropertyValuesHolder[] g4 = c.g("paddingEnd");
            g4[0].setFloatValues(this.c.getPaddingEnd(), this.d.b());
            c.e("paddingEnd", g4);
        }
        if (c.f("labelOpacity")) {
            PropertyValuesHolder[] g5 = c.g("labelOpacity");
            boolean z = this.e;
            g5[0].setFloatValues(true != z ? 1.0f : 0.0f, true != z ? 0.0f : 1.0f);
            c.e("labelOpacity", g5);
        }
        return super.b(c);
    }

    @Override // defpackage.ehgf, defpackage.ehhj
    public final void f() {
        super.f();
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        extendedFloatingActionButton.s = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.width = this.d.e().width;
        layoutParams.height = this.d.e().height;
    }

    @Override // defpackage.ehgf, defpackage.ehhj
    public final void g(Animator animator) {
        super.g(animator);
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        extendedFloatingActionButton.r = this.e;
        extendedFloatingActionButton.s = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
    }

    @Override // defpackage.ehhj
    public final int h() {
        return this.e ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // defpackage.ehhj
    public final void i() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        extendedFloatingActionButton.r = this.e;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!this.e) {
            this.c.u = layoutParams.width;
            this.c.v = layoutParams.height;
        }
        layoutParams.width = this.d.e().width;
        layoutParams.height = this.d.e().height;
        if (this.e) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = this.c;
            extendedFloatingActionButton2.r(extendedFloatingActionButton2.t);
        } else if (this.c.getText() != null && this.c.getText() != "") {
            this.c.r(ColorStateList.valueOf(0));
        }
        ExtendedFloatingActionButton extendedFloatingActionButton3 = this.c;
        ehgu ehguVar = this.d;
        extendedFloatingActionButton3.setPaddingRelative(ehguVar.c(), extendedFloatingActionButton3.getPaddingTop(), ehguVar.b(), extendedFloatingActionButton3.getPaddingBottom());
        this.c.requestLayout();
    }

    @Override // defpackage.ehhj
    public final boolean j() {
        boolean z = this.e;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.c;
        return z == extendedFloatingActionButton.r || extendedFloatingActionButton.d == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }

    @Override // defpackage.ehhj
    public final void k() {
    }
}
