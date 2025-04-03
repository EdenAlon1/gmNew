package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhbx extends ea {
    public final dhbw a = new dhbw(this);

    @Override // defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        dhbw dhbwVar = this.a;
        dhbwVar.j(bundle, new dggi(dhbwVar, frameLayout, layoutInflater, viewGroup, bundle));
        if (dhbwVar.a == null) {
            dggn.k(frameLayout);
        }
        frameLayout.setClickable(true);
        return frameLayout;
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        ClassLoader classLoader = dhbx.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.ae(bundle);
    }

    @Override // defpackage.ea
    public final void ag(Activity activity) {
        super.ag(activity);
        this.a.n(activity);
    }

    @Override // defpackage.ea
    public final void ai() {
        this.a.b();
        super.ai();
    }

    @Override // defpackage.ea
    public final void aj(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.aj(activity, attributeSet, bundle);
            this.a.n(activity);
            GoogleMapOptions a = GoogleMapOptions.a(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", a);
            dhbw dhbwVar = this.a;
            dhbwVar.j(bundle, new dggg(dhbwVar, activity, bundle2, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // defpackage.ea
    public final void am() {
        this.a.d();
        super.am();
    }

    @Override // defpackage.ea
    public final void ao() {
        super.ao();
        this.a.e();
    }

    @Override // defpackage.ea
    public final void h(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.h(bundle);
            this.a.a(bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // defpackage.ea
    public final void i() {
        dhbw dhbwVar = this.a;
        dggo dggoVar = dhbwVar.a;
        if (dggoVar != null) {
            dggoVar.d();
        } else {
            dhbwVar.i(2);
        }
        super.i();
    }

    @Override // defpackage.ea
    public final void k(Bundle bundle) {
        ClassLoader classLoader = dhbx.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        this.a.f(bundle);
    }

    @Override // defpackage.ea
    public final void l() {
        super.l();
        this.a.g();
    }

    @Override // defpackage.ea
    public final void m() {
        this.a.h();
        super.m();
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.a.c();
        super.onLowMemory();
    }
}
