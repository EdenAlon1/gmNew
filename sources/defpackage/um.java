package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes.dex */
final class um implements View.OnTouchListener {
    final /* synthetic */ uo a;

    public um(uo uoVar) {
        this.a = uoVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action != 0) {
            if (action != 1) {
                return false;
            }
            uo uoVar = this.a;
            uoVar.p.removeCallbacks(uoVar.o);
            return false;
        }
        PopupWindow popupWindow = this.a.r;
        if (popupWindow == null || !popupWindow.isShowing() || x < 0 || x >= this.a.r.getWidth() || y < 0 || y >= this.a.r.getHeight()) {
            return false;
        }
        uo uoVar2 = this.a;
        uoVar2.p.postDelayed(uoVar2.o, 250L);
        return false;
    }
}
