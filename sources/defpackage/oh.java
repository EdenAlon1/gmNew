package defpackage;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class oh extends kte implements ActionProvider.VisibilityListener {
    public static final /* synthetic */ int c = 0;
    public final ActionProvider a;
    final /* synthetic */ ol b;
    private ktd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oh(ol olVar, Context context, ActionProvider actionProvider) {
        super(context);
        this.b = olVar;
        this.a = actionProvider;
    }

    @Override // defpackage.kte
    public final boolean hasSubMenu() {
        return this.a.hasSubMenu();
    }

    @Override // defpackage.kte
    public final boolean isVisible() {
        return this.a.isVisible();
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        ktd ktdVar = this.d;
        if (ktdVar != null) {
            ktdVar.a();
        }
    }

    @Override // defpackage.kte
    public final View onCreateActionView() {
        return this.a.onCreateActionView();
    }

    @Override // defpackage.kte
    public final boolean onPerformDefaultAction() {
        return this.a.onPerformDefaultAction();
    }

    @Override // defpackage.kte
    public final void onPrepareSubMenu(SubMenu subMenu) {
        this.a.onPrepareSubMenu(this.b.b(subMenu));
    }

    @Override // defpackage.kte
    public final boolean overridesItemVisibility() {
        return this.a.overridesItemVisibility();
    }

    @Override // defpackage.kte
    public final void refreshVisibility() {
        this.a.refreshVisibility();
    }

    @Override // defpackage.kte
    public final void setVisibilityListener(ktd ktdVar) {
        this.d = ktdVar;
        this.a.setVisibilityListener(ktdVar != null ? this : null);
    }

    @Override // defpackage.kte
    public final View onCreateActionView(MenuItem menuItem) {
        return this.a.onCreateActionView(menuItem);
    }
}
