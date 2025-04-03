package defpackage;

import android.support.v7.view.menu.ActionMenuItemView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class no extends tq {
    final /* synthetic */ ActionMenuItemView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.a = actionMenuItemView;
    }

    @Override // defpackage.tq
    public final ou a() {
        pk pkVar;
        np npVar = this.a.c;
        if (npVar == null || (pkVar = ((pl) npVar).a.k) == null) {
            return null;
        }
        return pkVar.a();
    }

    @Override // defpackage.tq
    protected final boolean b() {
        ou a;
        ActionMenuItemView actionMenuItemView = this.a;
        oc ocVar = actionMenuItemView.b;
        return ocVar != null && ocVar.b(actionMenuItemView.a) && (a = a()) != null && a.x();
    }
}
