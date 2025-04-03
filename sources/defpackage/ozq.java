package defpackage;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ozq extends par {
    private static final String[] v = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property w = new ozi(PointF.class);
    private static final Property x = new ozj(PointF.class);
    private static final Property y = new ozk(PointF.class);
    private static final Property z = new ozl(PointF.class);
    private static final Property A = new ozm(PointF.class);

    private static final void f(pbb pbbVar) {
        View view = pbbVar.b;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        pbbVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        pbbVar.a.put("android:changeBounds:parent", pbbVar.b.getParent());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013a A[RETURN] */
    @Override // defpackage.par
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.animation.Animator a(android.view.ViewGroup r20, defpackage.pbb r21, defpackage.pbb r22) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozq.a(android.view.ViewGroup, pbb, pbb):android.animation.Animator");
    }

    @Override // defpackage.par
    public final void b(pbb pbbVar) {
        f(pbbVar);
    }

    @Override // defpackage.par
    public final void c(pbb pbbVar) {
        f(pbbVar);
    }

    @Override // defpackage.par
    public final boolean d() {
        return true;
    }

    @Override // defpackage.par
    public final String[] e() {
        return v;
    }
}
