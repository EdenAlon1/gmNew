package defpackage;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eadw {
    public final eadv a;

    public eadw(View view, View view2) {
        view.getClass();
        view2.getClass();
        eadv eadvVar = new eadv(dzyd.a(view2.getContext(), fdql.i()));
        eadvVar.setWillNotDraw(false);
        eadvVar.setLayerType(1, eadvVar.a);
        eadvVar.setOnClickListener(new View.OnClickListener() { // from class: eadt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ((eadv) view3).c();
            }
        });
        this.a = eadvVar;
        eadvVar.d = view;
        eadvVar.b = new PopupWindow(eadvVar);
        eadvVar.addView(view);
        eadvVar.f = view2;
        eadvVar.d();
        eadvVar.e = 1;
        eadvVar.g = 2;
    }
}
