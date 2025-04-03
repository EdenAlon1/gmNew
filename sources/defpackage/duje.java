package defpackage;

import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duje implements View.OnTouchListener {
    final /* synthetic */ Button a;

    public duje(Button button) {
        this.a = button;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.a.onTouchEvent(motionEvent);
        return true;
    }
}
