package defpackage;

import android.os.SystemClock;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehba extends laa {
    final /* synthetic */ BottomSheetBehavior a;

    public ehba(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    @Override // defpackage.laa
    public final void c(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior.w) {
                bottomSheetBehavior.E(1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r7 > r5.a.q) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r5.a.t()) < java.lang.Math.abs(r6.getTop() - r5.a.q)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a9, code lost:
    
        if (java.lang.Math.abs(r7 - r8.q) < java.lang.Math.abs(r7 - r8.s)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c5, code lost:
    
        if (java.lang.Math.abs(r7 - r8.p) < java.lang.Math.abs(r7 - r8.s)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
    
        if (r7 < java.lang.Math.abs(r7 - r8.s)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e8, code lost:
    
        if (java.lang.Math.abs(r7 - r0) < java.lang.Math.abs(r7 - r8.s)) goto L51;
     */
    @Override // defpackage.laa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r6, float r7, float r8) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehba.d(android.view.View, float, float):void");
    }

    @Override // defpackage.laa
    public final boolean e(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.x;
        if (i2 == 1 || bottomSheetBehavior.G) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.F == i) {
            WeakReference weakReference = bottomSheetBehavior.C;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        SystemClock.uptimeMillis();
        WeakReference weakReference2 = this.a.B;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // defpackage.laa
    public final int f(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.laa
    public final int g(View view, int i) {
        return kqp.b(i, this.a.t(), h());
    }

    @Override // defpackage.laa
    public final int h() {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return bottomSheetBehavior.I() ? bottomSheetBehavior.A : bottomSheetBehavior.s;
    }

    @Override // defpackage.laa
    public final void i(View view, int i, int i2) {
        this.a.y(i2);
    }
}
