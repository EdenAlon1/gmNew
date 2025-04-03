package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ehpy extends laa {
    final /* synthetic */ SideSheetBehavior a;

    public ehpy(SideSheetBehavior sideSheetBehavior) {
        this.a = sideSheetBehavior;
    }

    @Override // defpackage.laa
    public final int a(View view) {
        SideSheetBehavior sideSheetBehavior = this.a;
        return sideSheetBehavior.f + sideSheetBehavior.i;
    }

    @Override // defpackage.laa
    public final void c(int i) {
        if (i == 1) {
            SideSheetBehavior sideSheetBehavior = this.a;
            if (sideSheetBehavior.b) {
                sideSheetBehavior.w(1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004b, code lost:
    
        if (java.lang.Math.abs(r6 - r0.t()) < java.lang.Math.abs(r6 - r0.a.d())) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (r0.a.m(r5) == false) goto L18;
     */
    @Override // defpackage.laa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r5, float r6, float r7) {
        /*
            r4 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r4.a
            ehpt r1 = r0.a
            boolean r1 = r1.l(r6)
            r2 = 3
            if (r1 == 0) goto Lc
            goto L4d
        Lc:
            ehpt r1 = r0.a
            boolean r1 = r1.o(r5, r6)
            r3 = 5
            if (r1 == 0) goto L27
            ehpt r1 = r0.a
            boolean r6 = r1.n(r6, r7)
            if (r6 != 0) goto L25
            ehpt r6 = r0.a
            boolean r6 = r6.m(r5)
            if (r6 == 0) goto L4d
        L25:
            r2 = r3
            goto L4d
        L27:
            r1 = 0
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 == 0) goto L32
            boolean r6 = defpackage.ehpu.a(r6, r7)
            if (r6 != 0) goto L25
        L32:
            int r6 = r5.getLeft()
            int r7 = r0.t()
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            ehpt r0 = r0.a
            int r0 = r0.d()
            int r6 = r6 - r0
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto L25
        L4d:
            com.google.android.material.sidesheet.SideSheetBehavior r6 = r4.a
            r7 = 1
            r6.y(r5, r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehpy.d(android.view.View, float, float):void");
    }

    @Override // defpackage.laa
    public final boolean e(View view, int i) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.a;
        return (sideSheetBehavior.c == 1 || (weakReference = sideSheetBehavior.j) == null || weakReference.get() != view) ? false : true;
    }

    @Override // defpackage.laa
    public final int f(View view, int i) {
        return kqp.b(i, this.a.a.f(), this.a.a.e());
    }

    @Override // defpackage.laa
    public final int g(View view, int i) {
        return view.getTop();
    }

    @Override // defpackage.laa
    public final void i(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View u = this.a.u();
        if (u != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) u.getLayoutParams()) != null) {
            this.a.a.k(marginLayoutParams, view.getLeft(), view.getRight());
            u.setLayoutParams(marginLayoutParams);
        }
        SideSheetBehavior sideSheetBehavior = this.a;
        if (sideSheetBehavior.k.isEmpty()) {
            return;
        }
        sideSheetBehavior.a.p();
        Iterator it = sideSheetBehavior.k.iterator();
        while (it.hasNext()) {
            ((ehps) it.next()).a();
        }
    }
}
