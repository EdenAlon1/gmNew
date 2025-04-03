package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class kte {
    private static final String TAG = "ActionProvider(support)";
    private final Context mContext;
    private ktc mSubUiVisibilityListener;
    private ktd mVisibilityListener;

    public kte(Context context) {
        this.mContext = context;
    }

    public Context getContext() {
        return this.mContext;
    }

    public boolean hasSubMenu() {
        return false;
    }

    public boolean isVisible() {
        return true;
    }

    public abstract View onCreateActionView();

    public View onCreateActionView(MenuItem menuItem) {
        return onCreateActionView();
    }

    public boolean onPerformDefaultAction() {
        return false;
    }

    public boolean overridesItemVisibility() {
        return false;
    }

    public void refreshVisibility() {
        if (this.mVisibilityListener == null || !overridesItemVisibility()) {
            return;
        }
        ktd ktdVar = this.mVisibilityListener;
        isVisible();
        ktdVar.a();
    }

    public void reset() {
        this.mVisibilityListener = null;
        this.mSubUiVisibilityListener = null;
    }

    public void setSubUiVisibilityListener(ktc ktcVar) {
        this.mSubUiVisibilityListener = ktcVar;
    }

    public void setVisibilityListener(ktd ktdVar) {
        if (this.mVisibilityListener != null && ktdVar != null) {
            Log.w(TAG, "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.mVisibilityListener = ktdVar;
    }

    public void subUiVisibilityChanged(boolean z) {
        ktc ktcVar = this.mSubUiVisibilityListener;
        if (ktcVar != null) {
            ktcVar.k(z);
        }
    }

    public void onPrepareSubMenu(SubMenu subMenu) {
    }
}
