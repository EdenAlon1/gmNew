package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public class va extends xy {
    private uy c;
    private uy d;

    private final uy h(vx vxVar) {
        uy uyVar = this.d;
        if (uyVar == null || uyVar.a != vxVar) {
            this.d = new uw(vxVar);
        }
        return this.d;
    }

    private final uy i(vx vxVar) {
        uy uyVar = this.c;
        if (uyVar == null || uyVar.a != vxVar) {
            this.c = new ux(vxVar);
        }
        return this.c;
    }

    private static final int j(View view, uy uyVar) {
        return (uyVar.d(view) + (uyVar.b(view) / 2)) - (uyVar.j() + (uyVar.k() / 2));
    }

    private static final View k(vx vxVar, uy uyVar) {
        int at = vxVar.at();
        View view = null;
        if (at == 0) {
            return null;
        }
        int j = uyVar.j() + (uyVar.k() / 2);
        int i = 0;
        int i2 = Alert.DURATION_SHOW_INDEFINITELY;
        while (i < at) {
            View aH = vxVar.aH(i);
            int abs = Math.abs((uyVar.d(aH) + (uyVar.b(aH) / 2)) - j);
            int i3 = abs < i2 ? abs : i2;
            if (abs < i2) {
                view = aH;
            }
            i++;
            i2 = i3;
        }
        return view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xy
    public final int a(vx vxVar, int i, int i2) {
        PointF Q;
        int av = vxVar.av();
        if (av != 0) {
            View view = null;
            uy i3 = vxVar.ag() ? i(vxVar) : vxVar.af() ? h(vxVar) : null;
            if (i3 != null) {
                int at = vxVar.at();
                boolean z = false;
                int i4 = Integer.MIN_VALUE;
                int i5 = Integer.MAX_VALUE;
                View view2 = null;
                for (int i6 = 0; i6 < at; i6++) {
                    View aH = vxVar.aH(i6);
                    if (aH != null) {
                        int j = j(aH, i3);
                        if (j <= 0 && j > i4) {
                            view2 = aH;
                            i4 = j;
                        }
                        if (j >= 0 && j < i5) {
                            view = aH;
                            i5 = j;
                        }
                    }
                }
                if (true != vxVar.af()) {
                    i = i2;
                }
                boolean z2 = i > 0;
                if (z2 && view != null) {
                    return vx.bv(view);
                }
                if (!z2 && view2 != null) {
                    return vx.bv(view2);
                }
                if (true == z2) {
                    view = view2;
                }
                if (view != null) {
                    int bv = vx.bv(view);
                    int av2 = vxVar.av();
                    if ((vxVar instanceof wm) && (Q = ((wm) vxVar).Q(av2 - 1)) != null && (Q.x < 0.0f || Q.y < 0.0f)) {
                        z = true;
                    }
                    int i7 = bv + (z == z2 ? -1 : 1);
                    if (i7 >= 0 && i7 < av) {
                        return i7;
                    }
                }
            }
        }
        return -1;
    }

    @Override // defpackage.xy
    public View b(vx vxVar) {
        if (vxVar.ag()) {
            return k(vxVar, i(vxVar));
        }
        if (vxVar.af()) {
            return k(vxVar, h(vxVar));
        }
        return null;
    }

    @Override // defpackage.xy
    public final int[] c(vx vxVar, View view) {
        int[] iArr = new int[2];
        if (vxVar.af()) {
            iArr[0] = j(view, h(vxVar));
        } else {
            iArr[0] = 0;
        }
        if (vxVar.ag()) {
            iArr[1] = j(view, i(vxVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // defpackage.xy
    protected final wn d(vx vxVar) {
        if (vxVar instanceof wm) {
            return new uz(this, this.a.getContext());
        }
        return null;
    }
}
