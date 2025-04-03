package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class wz {
    public static int a(wo woVar, uy uyVar, View view, View view2, vx vxVar, boolean z) {
        if (vxVar.at() == 0 || woVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(vx.bv(view) - vx.bv(view2)) + 1;
        }
        return Math.min(uyVar.k(), uyVar.a(view2) - uyVar.d(view));
    }

    public static int b(wo woVar, uy uyVar, View view, View view2, vx vxVar, boolean z, boolean z2) {
        if (vxVar.at() == 0 || woVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (woVar.a() - Math.max(vx.bv(view), vx.bv(view2))) - 1) : Math.max(0, Math.min(vx.bv(view), vx.bv(view2)));
        if (z) {
            return Math.round((max * (Math.abs(uyVar.a(view2) - uyVar.d(view)) / (Math.abs(vx.bv(view) - vx.bv(view2)) + 1))) + (uyVar.j() - uyVar.d(view)));
        }
        return max;
    }

    public static int c(wo woVar, uy uyVar, View view, View view2, vx vxVar, boolean z) {
        if (vxVar.at() == 0 || woVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return woVar.a();
        }
        return (int) (((uyVar.a(view2) - uyVar.d(view)) / (Math.abs(vx.bv(view) - vx.bv(view2)) + 1)) * woVar.a());
    }
}
