package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: PG */
/* loaded from: classes.dex */
class oqh extends GestureDetector.SimpleOnGestureListener {
    protected final ord a;

    public oqh(ord ordVar) {
        ksw.a(true);
        ksw.a(true);
        ksw.a(true);
        this.a = ordVar;
    }

    static boolean a(oqd oqdVar) {
        return (oqdVar == null || ((aeil) oqdVar).a == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void b(defpackage.oqd r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            defpackage.ksw.a(r2)
            r2 = -1
            if (r7 == 0) goto L16
            r3 = r7
            aeil r3 = (defpackage.aeil) r3
            int r3 = r3.b
            if (r3 == r2) goto L17
            r3 = r0
            goto L18
        L16:
            r7 = 0
        L17:
            r3 = r1
        L18:
            defpackage.ksw.a(r3)
            boolean r3 = a(r7)
            defpackage.ksw.a(r3)
            ord r3 = r6.a
            aeil r7 = (defpackage.aeil) r7
            java.lang.String r4 = r7.a
            if (r4 == 0) goto L2c
            r5 = r0
            goto L2d
        L2c:
            r5 = r1
        L2d:
            defpackage.ksw.a(r5)
            opq r3 = (defpackage.opq) r3
            oqt r5 = r3.a
            boolean r5 = r5.c(r4)
            if (r5 == 0) goto L3b
            goto L6f
        L3b:
            oqt r5 = r3.a
            java.util.Set r5 = r5.a
            r5.add(r4)
            r3.d(r4, r0)
            r3.e()
            ord r3 = r6.a
            int r7 = r7.b
            if (r7 == r2) goto L4f
            goto L50
        L4f:
            r0 = r1
        L50:
            defpackage.ksw.a(r0)
            opq r3 = (defpackage.opq) r3
            oqf r0 = r3.b
            aeby r0 = (defpackage.aeby) r0
            java.lang.String r0 = r0.b(r7)
            oqt r1 = r3.a
            boolean r0 = r1.c(r0)
            defpackage.ksw.a(r0)
            opp r0 = r3.c
            oqo r1 = new oqo
            r1.<init>(r7, r0)
            r3.e = r1
        L6f:
            ord r7 = r6.a
            opq r7 = (defpackage.opq) r7
            oqt r7 = r7.a
            r7.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oqh.b(oqd):void");
    }

    final void c(MotionEvent motionEvent) {
        if (oqg.a(motionEvent.getMetaState(), 1)) {
            this.a.j();
        }
    }
}
