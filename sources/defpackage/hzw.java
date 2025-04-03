package defpackage;

import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusTargetNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hzw {
    public static final FocusTargetNode a(FocusTargetNode focusTargetNode) {
        FocusTargetNode focusTargetNode2 = ((FocusOwnerImpl) ((AndroidComposeView) isx.f(focusTargetNode)).d).g;
        if (focusTargetNode2 == null || !focusTargetNode2.z) {
            return null;
        }
        return focusTargetNode2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x001b, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.compose.ui.focus.FocusTargetNode b(androidx.compose.ui.focus.FocusTargetNode r8) {
        /*
            hvh r8 = r8.p
            boolean r0 = r8.z
            r1 = 0
            if (r0 == 0) goto L97
            hne r0 = new hne
            r2 = 16
            hvh[] r3 = new defpackage.hvh[r2]
            r0.<init>(r3)
            hvh r3 = r8.t
            if (r3 != 0) goto L18
            defpackage.isx.j(r0, r8)
            goto L1b
        L18:
            r0.n(r3)
        L1b:
            int r8 = r0.b
            if (r8 == 0) goto L97
            int r8 = r8 + (-1)
            java.lang.Object r8 = r0.c(r8)
            hvh r8 = (defpackage.hvh) r8
            int r3 = r8.r
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 != 0) goto L31
            defpackage.isx.j(r0, r8)
            goto L1b
        L31:
            if (r8 == 0) goto L1b
            int r3 = r8.q
            r3 = r3 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L94
            r3 = r1
        L3a:
            if (r8 == 0) goto L1b
            boolean r4 = r8 instanceof androidx.compose.ui.focus.FocusTargetNode
            r5 = 1
            if (r4 == 0) goto L5a
            androidx.compose.ui.focus.FocusTargetNode r8 = (androidx.compose.ui.focus.FocusTargetNode) r8
            hvh r4 = r8.p
            boolean r4 = r4.z
            if (r4 == 0) goto L8f
            hzo r4 = r8.g()
            int r4 = r4.ordinal()
            if (r4 == 0) goto L59
            if (r4 == r5) goto L59
            r5 = 2
            if (r4 == r5) goto L59
            goto L8f
        L59:
            return r8
        L5a:
            int r4 = r8.q
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L8f
            boolean r4 = r8 instanceof defpackage.isz
            if (r4 == 0) goto L8f
            r4 = r8
            isz r4 = (defpackage.isz) r4
            hvh r4 = r4.n
            r6 = 0
        L6a:
            if (r4 == 0) goto L8d
            int r7 = r4.q
            r7 = r7 & 1024(0x400, float:1.435E-42)
            if (r7 == 0) goto L8a
            int r6 = r6 + 1
            if (r6 != r5) goto L78
            r8 = r4
            goto L8a
        L78:
            if (r3 != 0) goto L81
            hne r3 = new hne
            hvh[] r7 = new defpackage.hvh[r2]
            r3.<init>(r7)
        L81:
            if (r8 == 0) goto L86
            r3.n(r8)
        L86:
            r3.n(r4)
            r8 = r1
        L8a:
            hvh r4 = r4.t
            goto L6a
        L8d:
            if (r6 == r5) goto L3a
        L8f:
            hvh r8 = defpackage.isx.a(r3)
            goto L3a
        L94:
            hvh r8 = r8.t
            goto L31
        L97:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hzw.b(androidx.compose.ui.focus.FocusTargetNode):androidx.compose.ui.focus.FocusTargetNode");
    }

    public static final iam c(FocusTargetNode focusTargetNode) {
        iwi iwiVar = focusTargetNode.v;
        return iwiVar != null ? iod.f(iwiVar).n(iwiVar, false) : iam.a;
    }

    public static final boolean d(FocusTargetNode focusTargetNode) {
        iui iuiVar;
        iwi iwiVar;
        iui iuiVar2;
        iwi iwiVar2 = focusTargetNode.v;
        return (iwiVar2 == null || (iuiVar = iwiVar2.r) == null || !iuiVar.g() || (iwiVar = focusTargetNode.v) == null || (iuiVar2 = iwiVar.r) == null || !iuiVar2.e()) ? false : true;
    }
}
