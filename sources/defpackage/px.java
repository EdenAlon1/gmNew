package defpackage;

import android.support.v7.widget.ActionMenuView;
import android.view.MenuItem;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class px implements ob {
    final /* synthetic */ ActionMenuView a;

    public px(ActionMenuView actionMenuView) {
        this.a = actionMenuView;
    }

    @Override // defpackage.ob
    public final void H(od odVar) {
        ob obVar = this.a.d;
        if (obVar != null) {
            obVar.H(odVar);
        }
    }

    @Override // defpackage.ob
    public final boolean L(od odVar, MenuItem menuItem) {
        yw ywVar = this.a.e;
        if (ywVar == null) {
            return false;
        }
        if (ywVar.a.v.c(menuItem)) {
            return true;
        }
        zd zdVar = ywVar.a.x;
        return zdVar != null && zdVar.a(menuItem);
    }
}
