package defpackage;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
/* loaded from: classes.dex */
public class pbq extends par {
    private static final String[] w = {"android:visibility:visibility", "android:visibility:parent"};
    public int v = 3;

    public static final void O(pbb pbbVar) {
        pbbVar.a.put("android:visibility:visibility", Integer.valueOf(pbbVar.b.getVisibility()));
        pbbVar.a.put("android:visibility:parent", pbbVar.b.getParent());
        int[] iArr = new int[2];
        pbbVar.b.getLocationOnScreen(iArr);
        pbbVar.a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r8 == 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
    
        if (r0.e == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        if (r0.c == 0) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final defpackage.pbp P(defpackage.pbb r7, defpackage.pbb r8) {
        /*
            pbp r0 = new pbp
            r0.<init>()
            r1 = 0
            r0.a = r1
            r0.b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r7 == 0) goto L33
            java.util.Map r6 = r7.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L33
            java.util.Map r6 = r7.a
            java.lang.Object r6 = r6.get(r5)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.c = r6
            java.util.Map r6 = r7.a
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L37
        L33:
            r0.c = r4
            r0.e = r3
        L37:
            if (r8 == 0) goto L5a
            java.util.Map r6 = r8.a
            boolean r6 = r6.containsKey(r5)
            if (r6 == 0) goto L5a
            java.util.Map r3 = r8.a
            java.lang.Object r3 = r3.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.util.Map r3 = r8.a
            java.lang.Object r2 = r3.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L5e
        L5a:
            r0.d = r4
            r0.f = r3
        L5e:
            r2 = 1
            if (r7 == 0) goto L87
            if (r8 == 0) goto L87
            int r7 = r0.c
            int r8 = r0.d
            if (r7 != r8) goto L6f
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 == r4) goto L95
        L6f:
            if (r7 == r8) goto L7d
            if (r7 != 0) goto L78
        L73:
            r0.b = r1
        L75:
            r0.a = r2
            return r0
        L78:
            if (r8 != 0) goto L95
        L7a:
            r0.b = r2
            goto L75
        L7d:
            android.view.ViewGroup r7 = r0.f
            if (r7 != 0) goto L82
            goto L73
        L82:
            android.view.ViewGroup r7 = r0.e
            if (r7 != 0) goto L95
            goto L7a
        L87:
            if (r7 != 0) goto L8e
            int r7 = r0.d
            if (r7 != 0) goto L8e
            goto L7a
        L8e:
            if (r8 != 0) goto L95
            int r7 = r0.c
            if (r7 != 0) goto L95
            goto L73
        L95:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pbq.P(pbb, pbb):pbp");
    }

    @Override // defpackage.par
    public final boolean D(pbb pbbVar, pbb pbbVar2) {
        if (pbbVar == null && pbbVar2 == null) {
            return false;
        }
        if (pbbVar != null && pbbVar2 != null) {
            if (pbbVar2.a.containsKey("android:visibility:visibility") != pbbVar.a.containsKey("android:visibility:visibility")) {
                return false;
            }
        }
        pbp P = P(pbbVar, pbbVar2);
        if (P.a) {
            return P.c == 0 || P.d == 0;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01cb  */
    @Override // defpackage.par
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator a(android.view.ViewGroup r25, defpackage.pbb r26, defpackage.pbb r27) {
        /*
            Method dump skipped, instructions count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pbq.a(android.view.ViewGroup, pbb, pbb):android.animation.Animator");
    }

    @Override // defpackage.par
    public final void b(pbb pbbVar) {
        O(pbbVar);
    }

    @Override // defpackage.par
    public void c(pbb pbbVar) {
        O(pbbVar);
    }

    @Override // defpackage.par
    public final String[] e() {
        return w;
    }

    public Animator f(ViewGroup viewGroup, View view, pbb pbbVar, pbb pbbVar2) {
        throw null;
    }

    public Animator g(ViewGroup viewGroup, View view, pbb pbbVar) {
        throw null;
    }
}
