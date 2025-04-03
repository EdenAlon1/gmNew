package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecbo extends View {
    public final Paint a;
    public boolean b;
    private final ecba c;
    private final Runnable d;
    private final Rect e;
    private final Path f;

    public ecbo(Context context, ecba ecbaVar, Runnable runnable) {
        super(context);
        this.e = new Rect();
        this.f = new Path();
        Paint paint = new Paint();
        this.a = paint;
        this.c = ecbaVar;
        this.d = runnable;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.b) {
            canvas.drawPath(this.f, this.a);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f.rewind();
        this.f.addRect(0.0f, 0.0f, i3 - i, i4 - i2, Path.Direction.CW);
        SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) this.c;
        Rect b = selectedAccountDisc.b();
        float width = b.width();
        float exactCenterX = b.exactCenterX();
        float exactCenterY = b.exactCenterY();
        Path path = this.f;
        float f = width * 0.6f;
        path.addCircle(exactCenterX, exactCenterY, f, Path.Direction.CCW);
        selectedAccountDisc.c.getGlobalVisibleRect(selectedAccountDisc.a);
        float f2 = exactCenterY - f;
        if (selectedAccountDisc.a.top > f2) {
            path.addRect(exactCenterX - f, f2, exactCenterX + f, selectedAccountDisc.a.top, Path.Direction.CW);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0038  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            float r0 = r5.getRawX()
            int r0 = java.lang.Math.round(r0)
            float r1 = r5.getRawY()
            int r1 = java.lang.Math.round(r1)
            int r5 = r5.getAction()
            r2 = 1
            if (r5 != 0) goto L46
            ecba r5 = r4.c
            android.graphics.Rect r3 = r4.e
            com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc r5 = (com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc) r5
            com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc r5 = r5.c
            r5.getGlobalVisibleRect(r3)
            android.graphics.Rect r5 = r4.e
            boolean r5 = r5.contains(r0, r1)
            r0 = 0
            if (r5 != 0) goto L35
            r4.performClick()
            boolean r5 = r4.b
            if (r5 != 0) goto L33
            goto L35
        L33:
            r5 = r0
            goto L36
        L35:
            r5 = r2
        L36:
            if (r5 != 0) goto L3d
            r4.b = r0
            r4.invalidate()
        L3d:
            java.lang.Runnable r1 = r4.d
            r1.run()
            if (r5 != 0) goto L45
            return r2
        L45:
            return r0
        L46:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecbo.onTouchEvent(android.view.MotionEvent):boolean");
    }
}
