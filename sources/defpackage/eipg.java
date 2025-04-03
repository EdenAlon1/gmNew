package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eipg extends MaterialButton implements eipf {
    eipc k;

    public eipg(Context context, int i) {
        super(context, null, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getAction();
        return super.onTouchEvent(motionEvent);
    }
}
