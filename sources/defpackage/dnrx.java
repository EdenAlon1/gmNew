package defpackage;

import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dnrx {
    public static final dnrx a = new dnrx();

    private dnrx() {
    }

    public static final float b(float f, boolean z, boolean z2, hfd hfdVar, int i) {
        float f2;
        hfdVar.v(-508501803);
        int width = ((View) hfdVar.e(AndroidCompositionLocals_androidKt.g)).getWidth();
        if (width > 0) {
            hfdVar.v(940191643);
            f2 = ((jzn) hfdVar.e(jdr.e)).ek(width);
            hfdVar.o();
        } else {
            hfdVar.v(940275312);
            f2 = ((Configuration) hfdVar.e(AndroidCompositionLocals_androidKt.a)).screenWidthDp;
            hfdVar.o();
        }
        if (1 == (i & 1)) {
            f = 360.0f;
        }
        if (z && Float.compare(f, 325.0f) > 0) {
            Log.println(4, "getBubbleMaxWidth", " the max width passed to the function was bigger than the maximum allowed: " + jzq.a(f) + " > " + jzq.a(325.0f));
            f = 325.0f;
        }
        float f3 = z ? ((jzq) ffmk.m(new jzq((f2 - 16.0f) - 70.0f), new jzq(0.0f))).a : ((jzq) ffmk.m(new jzq((f2 - 30.0f) - 16.0f), new jzq(0.0f))).a;
        boolean z3 = z2 & ((i & 4) == 0);
        float min = Math.min(f, f3);
        if (z3) {
            min -= 22.0f;
        }
        hfdVar.o();
        return min;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0099, code lost:
    
        if (defpackage.cxj.j(r1, r2, r3, null, r5, 12) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        if (defpackage.cxj.j(r1, r2, r3, null, r5, 12) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (defpackage.cxj.j(r1, r2, r3, null, r5, 12) != r0) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.cxj r13, defpackage.ffgu r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.dnrw
            if (r0 == 0) goto L13
            r0 = r14
            dnrw r0 = (defpackage.dnrw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            dnrw r0 = new dnrw
            r0.<init>(r12, r14)
        L18:
            r5 = r0
            java.lang.Object r14 = r5.a
            ffhh r0 = defpackage.ffhh.a
            int r1 = r5.c
            r7 = 0
            r8 = 200(0xc8, float:2.8E-43)
            r9 = 3
            r2 = 1
            r10 = 0
            r11 = 2
            if (r1 == 0) goto L48
            if (r1 == r2) goto L41
            if (r1 == r11) goto L3a
            if (r1 != r9) goto L32
            defpackage.ffci.b(r14)
            goto L9c
        L32:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L3a:
            cxj r13 = r5.d
            defpackage.ffci.b(r14)
            r1 = r13
            goto L80
        L41:
            cxj r13 = r5.d
            defpackage.ffci.b(r14)
            r1 = r13
            goto L66
        L48:
            defpackage.ffci.b(r14)
            r14 = r2
            java.lang.Float r2 = new java.lang.Float
            r1 = -1046478848(0xffffffffc1a00000, float:-20.0)
            r2.<init>(r1)
            r1 = 6
            dbu r3 = defpackage.cxu.c(r8, r10, r7, r1)
            r5.d = r13
            r5.c = r14
            r4 = 0
            r6 = 12
            r1 = r13
            java.lang.Object r13 = defpackage.cxj.j(r1, r2, r3, r4, r5, r6)
            if (r13 == r0) goto L9f
        L66:
            java.lang.Float r2 = new java.lang.Float
            r13 = 1084227584(0x40a00000, float:5.0)
            r2.<init>(r13)
            cym r13 = defpackage.cyp.d
            dbu r3 = defpackage.cxu.c(r8, r10, r13, r11)
            r5.d = r1
            r5.c = r11
            r4 = 0
            r6 = 12
            java.lang.Object r13 = defpackage.cxj.j(r1, r2, r3, r4, r5, r6)
            if (r13 == r0) goto L9f
        L80:
            java.lang.Float r2 = new java.lang.Float
            r13 = 0
            r2.<init>(r13)
            r13 = 100
            cym r14 = defpackage.cyp.d
            dbu r3 = defpackage.cxu.c(r13, r10, r14, r11)
            r5.d = r7
            r5.c = r9
            r4 = 0
            r6 = 12
            java.lang.Object r13 = defpackage.cxj.j(r1, r2, r3, r4, r5, r6)
            if (r13 != r0) goto L9c
            goto L9f
        L9c:
            ffcu r13 = defpackage.ffcu.a
            return r13
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dnrx.a(cxj, ffgu):java.lang.Object");
    }
}
