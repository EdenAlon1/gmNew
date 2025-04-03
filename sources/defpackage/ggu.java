package defpackage;

import android.content.Context;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ggu extends iya implements kei {
    private final Window a;
    private final boolean b;
    private final ffix c;
    private final cxj d;
    private final ffsk e;
    private final hho f;
    private Object g;
    private boolean h;

    public ggu(Context context, Window window, ffix ffixVar, cxj cxjVar, ffsk ffskVar) {
        super(context, null, 0, 6, null);
        this.a = window;
        this.b = true;
        this.c = ffixVar;
        this.d = cxjVar;
        this.e = ffskVar;
        this.f = new hic(fyt.a, hla.a);
    }

    @Override // defpackage.kei
    public final Window a() {
        return this.a;
    }

    public final void b(hfr hfrVar, ffjm ffjmVar) {
        super.i(hfrVar);
        this.f.b(ffjmVar);
        this.h = true;
        e();
    }

    @Override // defpackage.iya
    protected final boolean c() {
        return this.h;
    }

    @Override // defpackage.iya
    public final void d(hfd hfdVar) {
        hfdVar.v(576708319);
        ((ffjm) this.f.a()).a(hfdVar, 0);
        hfdVar.o();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        r1 = findOnBackInvokedDispatcher();
     */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.window.OnBackInvokedCallback, java.lang.Object] */
    @Override // defpackage.iya, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            boolean r0 = r4.b
            if (r0 == 0) goto L3f
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 >= r1) goto Le
            goto L3f
        Le:
            java.lang.Object r0 = r4.g
            if (r0 != 0) goto L2d
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            if (r0 < r1) goto L24
            ffix r0 = r4.c
            cxj r1 = r4.d
            ffsk r2 = r4.e
            ggt r3 = new ggt
            r3.<init>(r2, r1, r0)
            goto L2b
        L24:
            ffix r0 = r4.c
            ggp r3 = new ggp
            r3.<init>()
        L2b:
            r4.g = r3
        L2d:
            java.lang.Object r0 = r4.g
            boolean r1 = defpackage.ja$$ExternalSyntheticApiModelOutline0.m460m(r0)
            if (r1 == 0) goto L3f
            android.window.OnBackInvokedDispatcher r1 = defpackage.ja$$ExternalSyntheticApiModelOutline0.m(r4)
            if (r1 == 0) goto L3f
            r2 = 0
            defpackage.ja$$ExternalSyntheticApiModelOutline0.m(r1, r2, r0)
        L3f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggu.onAttachedToWindow():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r1 = findOnBackInvokedDispatcher();
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.window.OnBackInvokedCallback, java.lang.Object] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onDetachedFromWindow() {
        /*
            r2 = this;
            super.onDetachedFromWindow()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L1a
            java.lang.Object r0 = r2.g
            boolean r1 = defpackage.ja$$ExternalSyntheticApiModelOutline0.m460m(r0)
            if (r1 == 0) goto L1a
            android.window.OnBackInvokedDispatcher r1 = defpackage.ja$$ExternalSyntheticApiModelOutline0.m(r2)
            if (r1 == 0) goto L1a
            defpackage.ja$$ExternalSyntheticApiModelOutline0.m(r1, r0)
        L1a:
            r0 = 0
            r2.g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ggu.onDetachedFromWindow():void");
    }
}
