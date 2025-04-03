package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efrp implements ViewTreeObserver.OnScrollChangedListener {
    final /* synthetic */ efrq a;

    public efrp(efrq efrqVar) {
        this.a = efrqVar;
    }

    private static final void b(View view, float f) {
        if (view != null) {
            view.setElevation(f);
        }
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
            efrq r0 = r5.a
            boolean r1 = r0.S
            if (r1 != 0) goto L7
            return
        L7:
            com.google.android.libraries.surveys.internal.view.ScrollViewWithSizeCallback r0 = r0.aj
            int r0 = r0.getScrollY()
            efrq r1 = r5.a
            android.view.View r1 = r1.ai
            int r1 = r1.getBottom()
            efrq r2 = r5.a
            com.google.android.libraries.surveys.internal.view.ScrollViewWithSizeCallback r2 = r2.aj
            int r2 = r2.getScrollY()
            int r2 = r2 + r6
            efrq r3 = r5.a
            android.view.View r3 = r3.ai
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
            efrq r6 = r5.a
            android.view.View r0 = r6.ag
            android.content.res.Resources r6 = r6.B()
            r4 = 2131168943(0x7f070eaf, float:1.7952202E38)
            int r6 = r6.getDimensionPixelSize(r4)
            float r6 = (float) r6
            b(r0, r6)
            goto L4e
        L45:
            efrq r0 = r5.a
            android.view.View r0 = r0.ag
            b(r0, r3)
            if (r6 == 0) goto L65
        L4e:
            if (r1 != r2) goto L51
            goto L65
        L51:
            efrq r6 = r5.a
            android.view.View r0 = r6.ah
            android.content.res.Resources r6 = r6.B()
            r1 = 2131168921(0x7f070e99, float:1.7952157E38)
            int r6 = r6.getDimensionPixelSize(r1)
            float r6 = (float) r6
            b(r0, r6)
            return
        L65:
            efrq r6 = r5.a
            android.view.View r6 = r6.ah
            b(r6, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.efrp.a(int):void");
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        efpb efpbVar = efor.c;
        if (!efor.b(fdvs.c(efor.b)) || this.a.aT()) {
            a(this.a.aj.getHeight());
        }
    }
}
