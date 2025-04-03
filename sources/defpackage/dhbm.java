package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.maps.internal.IMapViewDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dhbm implements MapLifecycleDelegate {
    private final ViewGroup a;
    private final IMapViewDelegate b;
    private View c;

    public dhbm(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
        this.b = iMapViewDelegate;
        dfwv.n(viewGroup);
        this.a = viewGroup;
    }

    @Override // defpackage.dggo
    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
    }

    @Override // defpackage.dggo
    public final void b(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            dhca.b(bundle, bundle2);
            this.b.onCreate(bundle2);
            dhca.b(bundle2, bundle);
            this.c = (View) ObjectWrapper.unwrap(this.b.getView());
            this.a.removeAllViews();
            this.a.addView(this.c);
        } catch (RemoteException e) {
            throw new dhcw(e);
        }
    }

    @Override // defpackage.dggo
    public final void c() {
        try {
            this.b.onDestroy();
        } catch (RemoteException e) {
            throw new dhcw(e);
        }
    }

    @Override // defpackage.dggo
    public final void d() {
        throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
    }

    @Override // defpackage.dggo
    public final void e(Activity activity, Bundle bundle, Bundle bundle2) {
        throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
    }

    @Override // defpackage.dggo
    public final void f() {
        try {
            this.b.onLowMemory();
        } catch (RemoteException e) {
            throw new dhcw(e);
        }
    }

    @Override // defpackage.dggo
    public final void g() {
        try {
            this.b.onPause();
        } catch (RemoteException e) {
            throw new dhcw(e);
        }
    }

    @Override // com.google.android.gms.maps.internal.MapLifecycleDelegate
    public final void getMapAsync(dhbq dhbqVar) {
        try {
            this.b.getMapAsync(new dhbl(dhbqVar));
        } catch (RemoteException e) {
            throw new dhcw(e);
        }
    }

    @Override // defpackage.dggo
    public final void h() {
        try {
            this.b.onResume();
        } catch (RemoteException e) {
            throw new dhcw(e);
        }
    }

    @Override // defpackage.dggo
    public final void i(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            dhca.b(bundle, bundle2);
            this.b.onSaveInstanceState(bundle2);
            dhca.b(bundle2, bundle);
        } catch (RemoteException e) {
            throw new dhcw(e);
        }
    }

    @Override // defpackage.dggo
    public final void j() {
        try {
            this.b.onStart();
        } catch (RemoteException e) {
            throw new dhcw(e);
        }
    }

    @Override // defpackage.dggo
    public final void k() {
        try {
            this.b.onStop();
        } catch (RemoteException e) {
            throw new dhcw(e);
        }
    }
}
