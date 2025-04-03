package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvta {
    public final View a;
    public final dvsz b;
    public final int c;
    public final int d;

    public dvta(View view, View view2, int i, int i2) {
        view.getClass();
        this.a = view2;
        this.c = i;
        this.d = i2;
        dvsz dvszVar = new dvsz(view.getContext());
        this.b = dvszVar;
        dvszVar.e = view;
        dvszVar.c = new PopupWindow(dvszVar, 0, 0, !dvdl.b(dvszVar.getContext()) && fdnr.a.get().b());
        dvszVar.addView(view);
        if (fdnr.b()) {
            int[] iArr = kvo.a;
            dvszVar.setImportantForAccessibility(4);
        }
    }

    public final void a() {
        PopupWindow popupWindow = this.b.c;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final boolean b() {
        return this.b.isShown();
    }
}
