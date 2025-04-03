package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jhp extends ActionMode.Callback2 {
    private final jhr a;

    public jhp(jhr jhrVar) {
        this.a = jhrVar;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        int i = jhq.a.f;
        jhr jhrVar = this.a;
        if (itemId == i) {
            ffix ffixVar = jhrVar.c;
            if (ffixVar != null) {
                ffixVar.invoke();
            }
        } else if (itemId == jhq.b.f) {
            ffix ffixVar2 = jhrVar.d;
            if (ffixVar2 != null) {
                ffixVar2.invoke();
            }
        } else if (itemId == jhq.c.f) {
            ffix ffixVar3 = jhrVar.e;
            if (ffixVar3 != null) {
                ffixVar3.invoke();
            }
        } else if (itemId == jhq.d.f) {
            ffix ffixVar4 = jhrVar.f;
            if (ffixVar4 != null) {
                ffixVar4.invoke();
            }
        } else {
            if (itemId != jhq.e.f) {
                return false;
            }
            ffix ffixVar5 = jhrVar.g;
            if (ffixVar5 != null) {
                ffixVar5.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        jhr jhrVar = this.a;
        if (jhrVar.c != null) {
            jhr.a(menu, jhq.a);
        }
        if (jhrVar.d != null) {
            jhr.a(menu, jhq.b);
        }
        if (jhrVar.e != null) {
            jhr.a(menu, jhq.c);
        }
        if (jhrVar.f != null) {
            jhr.a(menu, jhq.d);
        }
        if (jhrVar.g == null) {
            return true;
        }
        jhr.a(menu, jhq.e);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        ffix ffixVar = this.a.a;
        if (ffixVar != null) {
            ffixVar.invoke();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        iam iamVar = this.a.b;
        if (rect != null) {
            rect.set((int) iamVar.b, (int) iamVar.c, (int) iamVar.d, (int) iamVar.e);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        jhr jhrVar = this.a;
        jhr.b(menu, jhq.a, jhrVar.c);
        jhr.b(menu, jhq.b, jhrVar.d);
        jhr.b(menu, jhq.c, jhrVar.e);
        jhr.b(menu, jhq.d, jhrVar.f);
        jhr.b(menu, jhq.e, jhrVar.g);
        return true;
    }
}
