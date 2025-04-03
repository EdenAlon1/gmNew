package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duli implements ViewTreeObserver.OnScrollChangedListener {
    final /* synthetic */ dulj a;

    public duli(dulj duljVar) {
        this.a = duljVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r6 != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r6) {
        /*
            r5 = this;
            dulj r0 = r5.a
            boolean r1 = r0.S
            if (r1 != 0) goto L7
            return
        L7:
            com.google.android.libraries.hats20.view.ScrollViewWithSizeCallback r0 = r0.ak
            int r0 = r0.getScrollY()
            dulj r1 = r5.a
            android.view.View r1 = r1.aj
            int r1 = r1.getBottom()
            dulj r2 = r5.a
            com.google.android.libraries.hats20.view.ScrollViewWithSizeCallback r2 = r2.ak
            int r2 = r2.getScrollY()
            int r2 = r2 + r6
            dulj r3 = r5.a
            android.view.View r3 = r3.aj
            int r3 = r3.getBottom()
            if (r3 <= r6) goto L2a
            r6 = 1
            goto L2b
        L2a:
            r6 = 0
        L2b:
            r3 = 0
            if (r6 == 0) goto L45
            if (r0 != 0) goto L31
            goto L45
        L31:
            dulj r6 = r5.a
            android.view.View r0 = r6.ah
            android.content.res.Resources r6 = r6.B()
            r4 = 2131166813(0x7f07065d, float:1.7947882E38)
            int r6 = r6.getDimensionPixelSize(r4)
            float r6 = (float) r6
            r0.setElevation(r6)
            goto L4e
        L45:
            dulj r0 = r5.a
            android.view.View r0 = r0.ah
            r0.setElevation(r3)
            if (r6 == 0) goto L65
        L4e:
            if (r1 != r2) goto L51
            goto L65
        L51:
            dulj r6 = r5.a
            android.view.View r0 = r6.ai
            android.content.res.Resources r6 = r6.B()
            r1 = 2131166828(0x7f07066c, float:1.7947912E38)
            int r6 = r6.getDimensionPixelSize(r1)
            float r6 = (float) r6
            r0.setElevation(r6)
            return
        L65:
            dulj r6 = r5.a
            android.view.View r6 = r6.ai
            r6.setElevation(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duli.a(int):void");
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        a(this.a.ak.getHeight());
    }
}
