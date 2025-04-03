package defpackage;

import android.view.MenuItem;
import android.view.SubMenu;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehkj {
    public final od a;
    public int b = 0;
    private int e = 0;
    public int c = 0;
    private final List d = new ArrayList();

    public ehkj(od odVar) {
        this.a = odVar;
        c();
    }

    public final int a() {
        return this.d.size();
    }

    public final MenuItem b(int i) {
        return (MenuItem) this.d.get(i);
    }

    public final void c() {
        this.d.clear();
        this.b = 0;
        this.e = 0;
        this.c = 0;
        for (int i = 0; i < this.a.size(); i++) {
            MenuItem item = this.a.getItem(i);
            if (item.hasSubMenu()) {
                if (!this.d.isEmpty()) {
                    if (!(this.d.get(r3.size() - 1) instanceof ehkb) && item.isVisible()) {
                        this.d.add(new ehkb());
                    }
                }
                this.d.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i2 = 0; i2 < subMenu.size(); i2++) {
                    MenuItem item2 = subMenu.getItem(i2);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    this.d.add(item2);
                    this.b++;
                    if (item2.isVisible()) {
                        this.e++;
                    }
                }
                this.d.add(new ehkb());
            } else {
                this.d.add(item);
                this.b++;
                if (item.isVisible()) {
                    this.e++;
                    this.c++;
                }
            }
        }
        if (this.d.isEmpty()) {
            return;
        }
        if (this.d.get(r0.size() - 1) instanceof ehkb) {
            this.d.remove(r0.size() - 1);
        }
    }
}
