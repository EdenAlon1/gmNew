package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcsd extends uh {
    private uy c;
    private uy d;

    private static View h(vx vxVar, uy uyVar) {
        int abs;
        int at = vxVar.at();
        View view = null;
        if (at == 0) {
            return null;
        }
        int j = vxVar.bm() ? uyVar.j() + (uyVar.k() / 2) : uyVar.e() / 2;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i2 = 0; i2 < at; i2++) {
            View aH = vxVar.aH(i2);
            if (aH != null && (abs = Math.abs((aH.getLeft() + (aH.getWidth() / 2)) - j)) < i) {
                view = aH;
                i = abs;
            }
        }
        return view;
    }

    @Override // defpackage.uh, defpackage.xy
    public final View b(vx vxVar) {
        if (vxVar.ag()) {
            uy uyVar = this.c;
            if (uyVar == null || uyVar.a != vxVar) {
                this.c = new ux(vxVar);
            }
            return h(vxVar, this.c);
        }
        if (!vxVar.af()) {
            return null;
        }
        uy uyVar2 = this.d;
        if (uyVar2 == null || uyVar2.a != vxVar) {
            this.d = new uw(vxVar);
        }
        return h(vxVar, this.d);
    }

    @Override // defpackage.uh, defpackage.xy
    public final int[] c(vx vxVar, View view) {
        int[] c = super.c(vxVar, view);
        int aw = vxVar.aw();
        int marginEnd = ((vy) view.getLayoutParams()).getMarginEnd() - ((vy) view.getLayoutParams()).getMarginStart();
        if (aw == 1) {
            c[0] = c[0] + (marginEnd / 2);
            return c;
        }
        c[0] = c[0] - (marginEnd / 2);
        return c;
    }
}
