package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehki extends od {
    private final Class l;

    public ehki(Context context, Class cls) {
        super(context);
        this.l = cls;
    }

    @Override // defpackage.od, android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(String.valueOf(this.l.getSimpleName()).concat(" does not support submenus"));
    }

    @Override // defpackage.od
    protected final MenuItem c(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= 6) {
            s();
            MenuItem c = super.c(i, i2, i3, charSequence);
            r();
            return c;
        }
        String simpleName = this.l.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is 6. Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }
}
