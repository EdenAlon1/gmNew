package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.autofill.AutofillId;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hvx extends hwd implements jjq, hyq {
    public final jjy a;
    public final View b;
    public final jky c;
    public final String d;
    public final Rect e = new Rect();
    public AutofillId f;
    public cnx g;
    public boolean h;
    public cnx i;
    public final hwl j;

    public hvx(hwl hwlVar, jjy jjyVar, View view, jky jkyVar, String str) {
        this.j = hwlVar;
        this.a = jjyVar;
        this.b = view;
        this.c = jkyVar;
        this.d = str;
        view.setImportantForAutofill(1);
        Object obj = jhu.a(view).a;
        if (obj == null) {
            imn.a("Required value was null.");
            throw new ffbx();
        }
        this.f = iy$$ExternalSyntheticApiModelOutline1.m414m(obj);
        this.g = new cnx((byte[]) null);
        this.i = new cnx((byte[]) null);
    }

    @Override // defpackage.hyq
    public final void a(hzq hzqVar, hzq hzqVar2) {
        iui d;
        jjn B;
        iui d2;
        jjn B2;
        if (hzqVar != null && (d2 = isx.d(hzqVar)) != null && (B2 = d2.B()) != null && hvy.a(B2)) {
            this.j.a.notifyViewExited(this.b, d2.d);
        }
        if (hzqVar2 == null || (d = isx.d(hzqVar2)) == null || (B = d.B()) == null || !hvy.a(B)) {
            return;
        }
        int i = d.d;
        this.c.a.b(i, new hvv(this, i));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    @Override // defpackage.jjq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.jjp r5, defpackage.jjn r6) {
        /*
            r4 = this;
            jjn r0 = r5.B()
            iui r5 = (defpackage.iui) r5
            int r5 = r5.d
            r1 = 0
            if (r6 == 0) goto L1a
            jku r2 = defpackage.jkm.a
            jku r2 = defpackage.jkm.C
            java.lang.Object r2 = defpackage.jjo.a(r6, r2)
            jlm r2 = (defpackage.jlm) r2
            if (r2 == 0) goto L1a
            java.lang.String r2 = r2.b
            goto L1b
        L1a:
            r2 = r1
        L1b:
            if (r0 == 0) goto L2b
            jku r3 = defpackage.jkm.a
            jku r3 = defpackage.jkm.C
            java.lang.Object r3 = defpackage.jjo.a(r0, r3)
            jlm r3 = (defpackage.jlm) r3
            if (r3 == 0) goto L2b
            java.lang.String r1 = r3.b
        L2b:
            if (r2 == 0) goto L63
            int r3 = r2.length()
            if (r3 != 0) goto L34
            goto L63
        L34:
            boolean r2 = defpackage.ffkj.e(r2, r1)
            if (r2 != 0) goto L63
            if (r1 == 0) goto L63
            int r2 = r1.length()
            if (r2 == 0) goto L63
            jku r2 = defpackage.jkm.a
            jku r2 = defpackage.jkm.q
            java.lang.Object r2 = defpackage.jjo.a(r0, r2)
            hwh r2 = (defpackage.hwh) r2
            int r3 = defpackage.hwh.c
            hwh r3 = defpackage.hwg.a
            boolean r2 = defpackage.ffkj.e(r2, r3)
            if (r2 == 0) goto L63
            hwl r2 = r4.j
            android.view.View r3 = r4.b
            android.view.autofill.AutofillValue r1 = defpackage.iy$$ExternalSyntheticApiModelOutline1.m(r1)
            android.view.autofill.AutofillManager r2 = r2.a
            defpackage.iy$$ExternalSyntheticApiModelOutline1.m(r2, r3, r5, r1)
        L63:
            r1 = 0
            r2 = 1
            if (r6 == 0) goto L6f
            boolean r6 = defpackage.hvy.b(r6)
            if (r6 != r2) goto L6f
            r6 = r2
            goto L70
        L6f:
            r6 = r1
        L70:
            if (r0 == 0) goto L79
            boolean r0 = defpackage.hvy.b(r0)
            if (r0 != r2) goto L79
            r1 = r2
        L79:
            if (r6 == r1) goto L8a
            if (r1 == 0) goto L83
            cnx r6 = r4.g
            r6.e(r5)
            goto L88
        L83:
            cnx r6 = r4.g
            r6.f(r5)
        L88:
            r4.h = r2
        L8a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hvx.b(jjp, jjn):void");
    }
}
