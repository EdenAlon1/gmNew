package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.FragmentContainerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import defpackage.a;
import defpackage.cg;
import defpackage.ea;
import defpackage.ffbz;
import defpackage.ffca;
import defpackage.nyj;
import defpackage.nzn;
import defpackage.oaf;
import defpackage.oao;
import defpackage.obo;
import defpackage.obp;

/* compiled from: PG */
/* loaded from: classes.dex */
public class NavHostFragment extends ea {
    public int a;
    private final ffbz b = ffca.a(new obo(this));
    private View c;
    private boolean d;

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(a());
        return fragmentContainerView;
    }

    public final int a() {
        int i = this.F;
        return (i == 0 || i == -1) ? R.id.nav_host_fragment_container : i;
    }

    @Override // defpackage.ea
    public final void ak(Context context, AttributeSet attributeSet, Bundle bundle) {
        attributeSet.getClass();
        super.ak(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, oao.b);
        obtainStyledAttributes.getClass();
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.a = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, obp.c);
        obtainStyledAttributes2.getClass();
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.d = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // defpackage.ea
    public final void ap(View view, Bundle bundle) {
        view.getClass();
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(a.i(view, "created host view ", " is not a ViewGroup"));
        }
        oaf.a(view, b());
        if (view.getParent() != null) {
            Object parent = view.getParent();
            parent.getClass();
            View view2 = (View) parent;
            this.c = view2;
            view2.getClass();
            if (view2.getId() == this.F) {
                View view3 = this.c;
                view3.getClass();
                oaf.a(view3, b());
            }
        }
    }

    public final nzn b() {
        return (nzn) this.b.a();
    }

    @Override // defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (this.d) {
            cg cgVar = new cg(J());
            cgVar.p(this);
            cgVar.j();
        }
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        b();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.d = true;
            cg cgVar = new cg(J());
            cgVar.p(this);
            cgVar.j();
        }
        super.h(bundle);
    }

    @Override // defpackage.ea
    public final void i() {
        super.i();
        View view = this.c;
        if (view != null) {
            nyj b = oaf.b(view);
            if (b == null) {
                throw new IllegalStateException(a.i(view, "View ", " does not have a NavController set"));
            }
            if (b == b()) {
                oaf.a(view, null);
            }
        }
        this.c = null;
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        if (this.d) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }
}
