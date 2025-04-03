package defpackage;

import android.graphics.PointF;
import android.view.View;
import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
public class uh extends xy {
    private uy c;
    private uy d;

    private final int h(vx vxVar, uy uyVar, int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY, Integer.MIN_VALUE, Alert.DURATION_SHOW_INDEFINITELY);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int at = vxVar.at();
        float f = 1.0f;
        if (at != 0) {
            View view = null;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < at; i5++) {
                View aH = vxVar.aH(i5);
                int bv = vx.bv(aH);
                if (bv != -1) {
                    int i6 = bv < i3 ? bv : i3;
                    if (bv < i3) {
                        view = aH;
                    }
                    if (bv > i4) {
                        view2 = aH;
                        i4 = bv;
                    }
                    i3 = i6;
                }
            }
            if (view != null && view2 != null) {
                int max = Math.max(uyVar.a(view), uyVar.a(view2)) - Math.min(uyVar.d(view), uyVar.d(view2));
                if (max != 0) {
                    f = max / ((i4 - i3) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round(iArr[Math.abs(iArr[0]) > Math.abs(iArr[1]) ? (char) 0 : (char) 1] / f);
    }

    private final uy i(vx vxVar) {
        uy uyVar = this.d;
        if (uyVar == null || uyVar.a != vxVar) {
            this.d = new uw(vxVar);
        }
        return this.d;
    }

    private final uy j(vx vxVar) {
        uy uyVar = this.c;
        if (uyVar == null || uyVar.a != vxVar) {
            this.c = new ux(vxVar);
        }
        return this.c;
    }

    private static final int k(View view, uy uyVar) {
        return (uyVar.d(view) + (uyVar.b(view) / 2)) - (uyVar.j() + (uyVar.k() / 2));
    }

    private static View l(vx vxVar, uy uyVar) {
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
        int av;
        View b;
        int bv;
        int i3;
        PointF Q;
        int i4;
        int i5;
        if (!(vxVar instanceof wm) || (av = vxVar.av()) == 0 || (b = b(vxVar)) == null || (bv = vx.bv(b)) == -1 || (Q = ((wm) vxVar).Q(av - 1)) == null) {
            return -1;
        }
        if (vxVar.af()) {
            i4 = h(vxVar, i(vxVar), i, 0);
            if (Q.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (vxVar.ag()) {
            i5 = h(vxVar, j(vxVar), 0, i2);
            if (Q.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (true == vxVar.ag()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i6 = bv + i4;
        int i7 = i6 >= 0 ? i6 : 0;
        return i7 >= av ? i3 : i7;
    }

    @Override // defpackage.xy
    public View b(vx vxVar) {
        if (vxVar.ag()) {
            return l(vxVar, j(vxVar));
        }
        if (vxVar.af()) {
            return l(vxVar, i(vxVar));
        }
        return null;
    }

    @Override // defpackage.xy
    public int[] c(vx vxVar, View view) {
        int[] iArr = new int[2];
        if (vxVar.af()) {
            iArr[0] = k(view, i(vxVar));
        } else {
            iArr[0] = 0;
        }
        if (vxVar.ag()) {
            iArr[1] = k(view, j(vxVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }
}
