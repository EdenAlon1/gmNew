package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.PreferenceScreen;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class efad extends ont {
    protected final eezc am = new eezc();

    @Override // defpackage.ea
    public View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        this.am.g(bundle);
        TypedArray obtainStyledAttributes = A().obtainStyledAttributes(null, ooj.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.ag = obtainStyledAttributes.getResourceId(0, this.ag);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(A());
        View inflate = cloneInContext.inflate(this.ag, viewGroup, false);
        View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        if (!A().getPackageManager().hasSystemFeature("android.hardware.type.automotive") || (recyclerView = (RecyclerView) viewGroup2.findViewById(R.id.recycler_view)) == null) {
            recyclerView = (RecyclerView) cloneInContext.inflate(R.layout.preference_recyclerview, viewGroup2, false);
            A();
            recyclerView.ap(new LinearLayoutManager());
            recyclerView.al(new ooh(recyclerView));
        }
        if (recyclerView == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.c = recyclerView;
        recyclerView.w(this.a);
        onp onpVar = this.a;
        if (drawable != null) {
            onpVar.b = drawable.getIntrinsicHeight();
        } else {
            onpVar.b = 0;
        }
        onpVar.a = drawable;
        onpVar.d.c.S();
        if (dimensionPixelSize != -1) {
            onp onpVar2 = this.a;
            onpVar2.b = dimensionPixelSize;
            onpVar2.d.c.S();
        }
        this.a.c = z;
        if (this.c.getParent() == null) {
            viewGroup2.addView(this.c);
        }
        this.ah.post(this.ai);
        return inflate;
    }

    @Override // defpackage.ea
    public final void aC(boolean z) {
        this.am.h(z);
        super.aC(z);
    }

    @Override // defpackage.ea
    public final boolean aL(MenuItem menuItem) {
        return this.am.L();
    }

    @Override // defpackage.ea
    public boolean aM(MenuItem menuItem) {
        return this.am.O();
    }

    @Override // defpackage.ea
    public final void aS() {
        this.am.Q();
    }

    @Override // defpackage.ea
    public void ae(Bundle bundle) {
        this.am.a(bundle);
        super.ae(bundle);
    }

    @Override // defpackage.ea
    public void af(int i, int i2, Intent intent) {
        super.af(i, i2, intent);
        this.am.J();
    }

    @Override // defpackage.ea
    public void ag(Activity activity) {
        this.am.j();
        super.ag(activity);
    }

    @Override // defpackage.ea
    public final void ah(Menu menu, MenuInflater menuInflater) {
        if (this.am.N()) {
            av(true);
        }
    }

    @Override // defpackage.ea
    public void ai() {
        this.am.d();
        super.ai();
    }

    @Override // defpackage.ea
    public void am() {
        this.am.f();
        super.am();
    }

    @Override // defpackage.ea
    public final void an(Menu menu) {
        if (this.am.P()) {
            av(true);
        }
    }

    @Override // defpackage.ea
    public void ao() {
        efal.a(I());
        this.am.z();
        super.ao();
    }

    @Override // defpackage.ont, defpackage.ea
    public void h(Bundle bundle) {
        this.am.x(bundle);
        super.h(bundle);
    }

    @Override // defpackage.ont, defpackage.ea
    public void i() {
        this.am.b();
        super.i();
    }

    @Override // defpackage.ea
    public void j() {
        this.am.c();
        super.j();
    }

    @Override // defpackage.ea
    public void k(Bundle bundle) {
        this.am.A(bundle);
        PreferenceScreen b = b();
        if (b != null) {
            Bundle bundle2 = new Bundle();
            b.y(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // defpackage.ont, defpackage.ea
    public void l() {
        efal.a(I());
        this.am.B();
        super.l();
    }

    @Override // defpackage.ont, defpackage.ea
    public void m() {
        this.am.C();
        super.m();
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.am.K();
        super.onConfigurationChanged(configuration);
    }

    @Override // defpackage.ea, android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.am.M();
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // defpackage.ea, android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.am.y();
        super.onLowMemory();
    }
}
