package defpackage;

import android.R;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvto implements dvtw, dvtv {
    public dvta a;
    public dvtq b;
    public dvtx c;
    public View d;
    private final Rect e = new Rect();
    private final int[] f = new int[2];

    public dvto(dvtq dvtqVar) {
        this.b = dvtqVar;
    }

    static boolean c(View view) {
        if (view == null || !view.isShown()) {
            return false;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return view.getMeasuredHeight() == rect.height() && view.getMeasuredWidth() == rect.width();
    }

    private final Rect d(Rect rect) {
        this.e.set(rect);
        this.d.getLocationInWindow(this.f);
        int[] iArr = this.f;
        this.e.offset(iArr[0], iArr[1]);
        return this.e;
    }

    public final void a() {
        dvta dvtaVar = this.a;
        if (dvtaVar == null || !dvtaVar.b()) {
            return;
        }
        dvtaVar.a();
        if (dvtaVar == this.a) {
            this.a = null;
            this.b = null;
        }
    }

    @Override // defpackage.dvtw
    public final void b(dvtt dvttVar) {
        if (this.a == null) {
            return;
        }
        if (dvttVar.b()) {
            dvtq dvtqVar = this.b;
            if (c(dvtqVar != null ? ((dvsw) dvtqVar).a : null)) {
                if (this.a.b()) {
                    dvta dvtaVar = this.a;
                    dvtaVar.b.a(d(dvttVar.a));
                    dvtaVar.b.requestLayout();
                    return;
                }
                Rect d = d(dvttVar.a);
                dvta dvtaVar2 = this.a;
                int i = dvtaVar2.c;
                int i2 = dvtaVar2.d;
                dvtaVar2.b.d(dvtaVar2.a, d, i, i2);
                dvsz dvszVar = dvtaVar2.b;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                dvszVar.measure(makeMeasureSpec, makeMeasureSpec);
                if ((dvszVar.getMeasuredHeightAndState() & (-16777216)) == 16777216) {
                    dvtaVar2.b.d(dvtaVar2.a, d, i == 1 ? 2 : 1, i2);
                }
                final dvsz dvszVar2 = dvtaVar2.b;
                dvszVar2.c.setClippingEnabled(false);
                dvszVar2.c.setAnimationStyle(R.style.Animation.Dialog);
                dvszVar2.c.setTouchable(true);
                dvszVar2.c.setBackgroundDrawable(new ColorDrawable(0));
                dvszVar2.c.setOutsideTouchable(dvszVar2.d);
                dvszVar2.c.setTouchInterceptor(new View.OnTouchListener() { // from class: dvsy
                    @Override // android.view.View.OnTouchListener
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        dvsz dvszVar3 = dvsz.this;
                        View.OnClickListener onClickListener = dvszVar3.k;
                        if (onClickListener != null) {
                            onClickListener.onClick(view);
                        }
                        if (dvszVar3.j == null || motionEvent.getActionMasked() != 4 || !dvszVar3.a.contains(Math.round(motionEvent.getRawX()), Math.round(motionEvent.getRawY()))) {
                            return false;
                        }
                        dvszVar3.j.onClick(dvszVar3.f);
                        return false;
                    }
                });
                if (Build.VERSION.SDK_INT >= 29) {
                    dvszVar2.c();
                    dvszVar2.c.setWidth(dvszVar2.getMeasuredWidth());
                    dvszVar2.c.setHeight(dvszVar2.getMeasuredHeight());
                }
                dvszVar2.c.showAtLocation(dvszVar2.f, 0, dvszVar2.h, dvszVar2.i);
                return;
            }
        }
        a();
    }
}
