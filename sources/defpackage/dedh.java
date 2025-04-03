package defpackage;

import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.MotionEvent;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dedh extends LinkMovementMethod {
    private final bcse a;
    private final MovementMethod b;
    private final ddxs c;

    public dedh(bcse bcseVar, ddxs ddxsVar, MovementMethod movementMethod) {
        this.a = bcseVar;
        this.b = movementMethod;
        this.c = ddxsVar;
    }

    @Override // android.text.method.LinkMovementMethod, android.text.method.ScrollingMovementMethod, android.text.method.BaseMovementMethod, android.text.method.MovementMethod
    public final boolean onTouchEvent(TextView textView, Spannable spannable, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 1 || !this.a.bd()) {
            return this.b.onTouchEvent(textView, spannable, motionEvent);
        }
        this.c.d(textView.getContext(), this.a);
        return true;
    }
}
