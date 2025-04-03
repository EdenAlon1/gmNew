package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.google.android.apps.messaging.R;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cwpv extends cwqh {
    public static final cskc o = cskc.g("Bugle", "BugleActionBarActivity");
    public ffbr A;
    public ffbr B;
    public ffbr C;
    public ffbr D;
    public elbx E;
    public ffbr F;
    private ActionMode G;
    private ActionMode.Callback H;
    private long n;
    public cwpu p;
    public Menu q;
    boolean r;
    boolean s;

    public boolean K() {
        return false;
    }

    public boolean Q() {
        return false;
    }

    public final ActionMode.Callback V() {
        if (K()) {
            return this.H;
        }
        cwpu cwpuVar = this.p;
        if (cwpuVar == null) {
            return null;
        }
        return cwpuVar.c;
    }

    public final Optional W() {
        return Optional.ofNullable(K() ? this.G : this.p);
    }

    public void X() {
        if (!K()) {
            cwpu cwpuVar = this.p;
            if (cwpuVar != null) {
                cwpuVar.finish();
                this.p = null;
                Z();
                return;
            }
            return;
        }
        ActionMode actionMode = this.G;
        if (actionMode != null) {
            actionMode.finish();
            this.G = null;
            this.H = null;
            o();
        }
    }

    public void Y(Exception exc) {
        o.n("Bad custom theme detected");
        setTheme(R.style.FallbackAppCompatTheme);
        if (this.r) {
            cwqc.b(this);
        }
        this.s = true;
    }

    public final void Z() {
        Menu menu;
        im k = k();
        if (k == null || this.G != null) {
            return;
        }
        cwpu cwpuVar = this.p;
        if (cwpuVar == null) {
            fx(k);
            return;
        }
        Menu menu2 = cwpuVar.d.q;
        if (menu2 != null) {
            menu2.clear();
        }
        k.setDisplayOptions(4);
        k.setHomeActionContentDescription(cwpuVar.d.getResources().getString(R.string.action_close));
        CharSequence charSequence = cwpuVar.a;
        if (charSequence != null) {
            k.setTitle(charSequence);
            k.setDisplayShowTitleEnabled(true);
        } else {
            k.setDisplayShowTitleEnabled(false);
        }
        k.setDisplayShowCustomEnabled(false);
        ActionMode.Callback callback = cwpuVar.c;
        if (callback != null && (menu = cwpuVar.d.q) != null) {
            callback.onCreateActionMode(cwpuVar, menu);
            cwpuVar.c.onPrepareActionMode(cwpuVar, cwpuVar.d.q);
        }
        k.setBackgroundDrawable(new ColorDrawable(ehdr.d(cwpuVar.d, R.attr.colorPrimaryBackground, "BugleActionBarActivity")));
        k.setHomeAsUpIndicator(R.drawable.tinted_quantum_ic_clear_24);
        cwpuVar.d.ac(8);
        k.show();
    }

    public final void aa() {
        ekzz f = eleg.f("BugleActionBarActivity requestReceiveWapPushPermissionIfNeeded");
        try {
            if (((cpbs) this.B.b()).a.get() && !((ctud) this.C.b()).n()) {
                o.m("WAP Push SI enabled but no permission to receive. Requesting.");
                ((ctuk) this.v.b()).i(new cwpt(this));
            }
            f.close();
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public void ab(ActionMode.Callback callback, View view, String str) {
        if (K()) {
            this.G = startActionMode(callback);
            this.H = callback;
            Menu menu = this.q;
            if (menu != null) {
                menu.clear();
                return;
            }
            return;
        }
        cwpu cwpuVar = new cwpu(this, callback);
        this.p = cwpuVar;
        cwpuVar.b = view;
        cwpuVar.a = str;
        o();
        Z();
    }

    public final void ac(int i) {
        View findViewById = findViewById(R.id.lockup);
        if (findViewById != null) {
            findViewById.setVisibility(i);
        }
    }

    public final boolean ad() {
        return !K();
    }

    @Override // defpackage.cwps
    public cwml eY() {
        return cwml.c;
    }

    protected void fx(im imVar) {
        imVar.setHomeAsUpIndicator((Drawable) null);
        ac(0);
    }

    @Override // defpackage.iy
    public final im k() {
        try {
            return super.k();
        } catch (IllegalStateException e) {
            Y(e);
            return super.k();
        }
    }

    @Override // defpackage.cwps, defpackage.cwqf, defpackage.efac, defpackage.eg, defpackage.abe, defpackage.hl, android.app.Activity
    protected void onCreate(Bundle bundle) {
        this.r = false;
        super.onCreate(bundle);
        csjb a = o.a();
        a.I(getLocalClassName());
        a.I(".onCreate");
        a.r();
        P().c((lkq) this.D.b());
    }

    @Override // defpackage.efac, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.q = menu;
        cwpu cwpuVar = this.p;
        return cwpuVar != null && cwpuVar.c.onCreateActionMode(cwpuVar, menu);
    }

    @Override // defpackage.efac, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        cwpu cwpuVar = this.p;
        if (cwpuVar != null && cwpuVar.c.onActionItemClicked(cwpuVar, menuItem)) {
            return true;
        }
        if (menuItem.getItemId() != 16908332 || this.p == null) {
            return super.onOptionsItemSelected(menuItem);
        }
        X();
        return true;
    }

    @Override // defpackage.cwps, defpackage.efac, defpackage.eg, android.app.Activity
    protected void onPause() {
        super.onPause();
        csjb a = o.a();
        a.I(getLocalClassName());
        a.I(".onPause");
        a.r();
        ((cwqc) this.F.b()).a(this.t.f().toEpochMilli() - this.n);
    }

    @Override // defpackage.efac, android.app.Activity
    public boolean onPrepareOptionsMenu(Menu menu) {
        this.q = menu;
        cwpu cwpuVar = this.p;
        if (cwpuVar == null || !cwpuVar.c.onPrepareActionMode(cwpuVar, menu)) {
            return super.onPrepareOptionsMenu(menu);
        }
        return true;
    }

    @Override // defpackage.cwps, android.app.Activity
    protected void onRestart() {
        ekzm b = this.E.b("BugleActionBarActivity onRestart");
        try {
            csjb a = o.a();
            a.I(getLocalClassName());
            a.I(".onRestart");
            a.r();
            super.onRestart();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.cwps, defpackage.efac, defpackage.eg, android.app.Activity
    protected void onResume() {
        this.r = true;
        super.onResume();
        csjb a = o.a();
        a.I(getLocalClassName());
        a.I(".onResume");
        a.r();
        if (this.s) {
            cwqc.b(this);
            return;
        }
        this.n = this.t.f().toEpochMilli();
        if (Q()) {
            return;
        }
        aa();
    }

    @Override // defpackage.cwps, defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    protected void onStart() {
        super.onStart();
        csjb a = o.a();
        a.I(getLocalClassName());
        a.I(".onStart");
        a.r();
    }

    @Override // defpackage.cwps, defpackage.efac, defpackage.iy, defpackage.eg, android.app.Activity
    protected void onStop() {
        super.onStop();
        csjb a = o.a();
        a.I(getLocalClassName());
        a.I(".onStop");
        a.r();
    }

    @Override // defpackage.iy, defpackage.abe, android.app.Activity
    public void setContentView(int i) {
        try {
            super.setContentView(i);
        } catch (IllegalStateException e) {
            Y(e);
        }
    }

    @Override // android.app.Activity
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        im k = k();
        if (k != null) {
            k.setTitle(charSequence);
        }
    }
}
