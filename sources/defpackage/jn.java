package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jn extends kwf {
    final /* synthetic */ jo a;

    public jn(jo joVar) {
        this.a = joVar;
    }

    @Override // defpackage.kwf, defpackage.kwe
    public final void a() {
        this.a.a.s.setVisibility(8);
        jz jzVar = this.a.a;
        PopupWindow popupWindow = jzVar.t;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (jzVar.s.getParent() instanceof View) {
            View view = (View) this.a.a.s.getParent();
            int[] iArr = kvo.a;
            kvb.c(view);
        }
        this.a.a.s.i();
        this.a.a.v.d(null);
        jz jzVar2 = this.a.a;
        jzVar2.v = null;
        ViewGroup viewGroup = jzVar2.y;
        int[] iArr2 = kvo.a;
        kvb.c(viewGroup);
    }
}
