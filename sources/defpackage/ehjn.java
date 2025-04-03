package defpackage;

import android.window.OnBackInvokedCallback;

/* compiled from: PG */
/* loaded from: classes5.dex */
class ehjn {
    private OnBackInvokedCallback a;

    public OnBackInvokedCallback a(final ehjl ehjlVar) {
        ehjlVar.getClass();
        return new OnBackInvokedCallback() { // from class: ehjm
            public final void onBackInvoked() {
                ehjl.this.z();
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r3 = r3.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(defpackage.ehjl r2, android.view.View r3, boolean r4) {
        /*
            r1 = this;
            android.window.OnBackInvokedCallback r0 = r1.a
            if (r0 == 0) goto L5
            goto L1c
        L5:
            android.window.OnBackInvokedDispatcher r3 = defpackage.ja$$ExternalSyntheticApiModelOutline0.m(r3)
            if (r3 == 0) goto L1c
            android.window.OnBackInvokedCallback r2 = r1.a(r2)
            r1.a = r2
            r0 = 1
            if (r0 == r4) goto L16
            r4 = 0
            goto L19
        L16:
            r4 = 1000000(0xf4240, float:1.401298E-39)
        L19:
            defpackage.ja$$ExternalSyntheticApiModelOutline0.m(r3, r4, r2)
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehjn.b(ehjl, android.view.View, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r2 = r2.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.view.View r2) {
        /*
            r1 = this;
            android.window.OnBackInvokedCallback r0 = r1.a
            if (r0 != 0) goto L5
            goto L13
        L5:
            android.window.OnBackInvokedDispatcher r2 = defpackage.ja$$ExternalSyntheticApiModelOutline0.m(r2)
            if (r2 == 0) goto L13
            android.window.OnBackInvokedCallback r0 = r1.a
            defpackage.ja$$ExternalSyntheticApiModelOutline0.m(r2, r0)
            r2 = 0
            r1.a = r2
        L13:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ehjn.c(android.view.View):void");
    }

    final boolean d() {
        return this.a != null;
    }
}
