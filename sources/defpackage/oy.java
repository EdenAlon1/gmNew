package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oy extends od implements SubMenu {
    public final od l;
    public final og m;

    public oy(Context context, od odVar, og ogVar) {
        super(context);
        this.l = odVar;
        this.m = ogVar;
    }

    @Override // defpackage.od
    public final od a() {
        return this.l.a();
    }

    @Override // defpackage.od
    public final String d() {
        int i = this.m.a;
        if (i == 0) {
            return null;
        }
        return a.h(i, "android:menu:actionviewstates:");
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.m;
    }

    @Override // defpackage.od
    public final void p(ob obVar) {
        this.l.p(obVar);
    }

    @Override // defpackage.od, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.l.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        super.q(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        super.q(i, null, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        super.q(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.m.setIcon(i);
        return this;
    }

    @Override // defpackage.od, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.l.setQwertyMode(z);
    }

    @Override // defpackage.od
    public final boolean t(og ogVar) {
        return this.l.t(ogVar);
    }

    @Override // defpackage.od
    public final boolean u(od odVar, MenuItem menuItem) {
        return super.u(odVar, menuItem) || this.l.u(odVar, menuItem);
    }

    @Override // defpackage.od
    public final boolean v(og ogVar) {
        return this.l.v(ogVar);
    }

    @Override // defpackage.od
    public final boolean w() {
        return this.l.w();
    }

    @Override // defpackage.od
    public final boolean x() {
        return this.l.x();
    }

    @Override // defpackage.od
    public final boolean y() {
        return this.l.y();
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        super.q(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        super.q(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.m.setIcon(drawable);
        return this;
    }
}
