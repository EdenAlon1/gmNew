package com.google.android.libraries.onegoogle.accountmanagement;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import defpackage.eave;
import defpackage.eawd;
import defpackage.eaxw;
import defpackage.eaxx;
import defpackage.eaxy;
import defpackage.eaxz;
import defpackage.emxc;
import defpackage.emxf;
import defpackage.kvo;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class SelectedAccountView<AccountT> extends ConstraintLayout implements eaxy<AccountT> {
    private static final Property l = Property.of(ImageView.class, Float.class, "rotation");
    public final AccountParticleDisc i;
    public final ImageView j;
    final ObjectAnimator k;
    private final TextView m;
    private final TextView n;
    private final TextView o;
    private final ImageView p;
    private final FrameLayout q;
    private final String r;
    private final String s;
    private eaxx t;
    private boolean u;
    private eaxz v;
    private String w;
    private String x;
    private eaxw y;

    public SelectedAccountView(Context context) {
        this(context, null);
    }

    private final void o() {
        emxc emxcVar = this.v.a;
        if (emxcVar.g()) {
            emxcVar.c();
        }
        emxf.m(true, "Cannot show right drawable (info/chevron) and counter at the same time");
    }

    private final void p(boolean z) {
        int[] iArr = kvo.a;
        this.p.setImportantForAccessibility(1);
        this.p.setContentDescription(z ? this.w : this.x);
        kvo.r(this, z ? this.s : this.r);
    }

    public final void e(boolean z) {
        if (z == this.u) {
            return;
        }
        this.u = z;
        p(z);
        if (z) {
            this.k.start();
        } else {
            this.k.reverse();
        }
    }

    @Override // defpackage.eaxy
    public final TextView f() {
        return this.o;
    }

    @Override // defpackage.eaxy
    public final TextView g() {
        return this.m;
    }

    @Override // defpackage.eaxy
    public final TextView h() {
        return this.n;
    }

    @Override // defpackage.eaxy
    public final AccountParticleDisc i() {
        return this.i;
    }

    public final void j(eawd eawdVar, eave eaveVar, eaxz eaxzVar, eaxw eaxwVar, String str, String str2) {
        this.v = eaxzVar;
        o();
        this.t = new eaxx(this, eaveVar, eaxzVar);
        this.i.i(eawdVar, eaveVar);
        this.w = str;
        this.x = str2;
        this.y = eaxwVar;
        this.u = false;
        this.p.setRotation(360.0f);
        p(false);
    }

    public final void k(Object obj) {
        emxf.m(this.t != null, "Initialize must be called before setting an account.");
        this.t.a(obj, this.y);
    }

    public final void l(long j) {
        this.k.setDuration(j);
    }

    public final void m(Interpolator interpolator) {
        this.k.setInterpolator(interpolator);
    }

    public final void n(int i) {
        this.j.setVisibility(i == 2 ? 0 : 8);
        this.p.setVisibility(i == 1 ? 0 : 8);
        this.q.setVisibility(i == 3 ? 8 : 0);
        o();
    }

    public SelectedAccountView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SelectedAccountView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.v = eaxz.a().a();
        LayoutInflater.from(context).inflate(R.layout.selected_account_view, this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.account_menu_header_signed_in_layout_min_height);
        if (dimensionPixelSize != this.d) {
            this.d = dimensionPixelSize;
            requestLayout();
        }
        this.m = (TextView) findViewById(R.id.og_primary_account_information);
        this.n = (TextView) findViewById(R.id.og_secondary_account_information);
        this.o = (TextView) findViewById(R.id.counter);
        this.i = (AccountParticleDisc) findViewById(R.id.account_avatar);
        ImageView imageView = (ImageView) findViewById(R.id.og_collapsed_chevron);
        this.p = imageView;
        this.k = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) l, 360.0f, 180.0f);
        this.j = (ImageView) findViewById(R.id.og_custom_icon);
        this.q = (FrameLayout) findViewById(R.id.og_trailing_drawable_container);
        this.r = getResources().getString(R.string.og_account_list_collapsed_a11y);
        this.s = getResources().getString(R.string.og_account_list_expanded_a11y);
    }
}
