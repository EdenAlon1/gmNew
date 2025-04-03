package defpackage;

import android.graphics.drawable.RippleDrawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxpy extends GestureDetector {
    public static final /* synthetic */ int a = 0;
    private final View b;
    private final cxpz c;
    private final List d;

    public cxpy(View view, final cxpz cxpzVar, View... viewArr) {
        super(view.getContext(), cxpzVar);
        this.b = view;
        this.c = cxpzVar;
        view.setOnTouchListener(new View.OnTouchListener() { // from class: cxpw
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return cxpy.this.onTouchEvent(motionEvent);
            }
        });
        view.setOnClickListener(new View.OnClickListener() { // from class: cxpx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i = cxpy.a;
                cxpz.this.a();
            }
        });
        this.d = Arrays.asList(viewArr);
    }

    private final void a(boolean z) {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setEnabled(z);
        }
    }

    private final void b(boolean z) {
        if (this.b.getBackground() instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) this.b.getBackground();
            rippleDrawable.setHotspot(this.b.getWidth() / 2, this.b.getHeight() / 2);
            rippleDrawable.setVisible(true, true);
        }
        this.b.setPressed(z);
    }

    @Override // android.view.GestureDetector
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            a(false);
            b(true);
            return onTouchEvent;
        }
        if (actionMasked == 1) {
            cxpz cxpzVar = this.c;
            if (cxpzVar != null && cxpzVar.a) {
                cxpzVar.b();
            }
        } else if (actionMasked != 3) {
            return onTouchEvent;
        }
        a(true);
        b(false);
        return onTouchEvent;
    }
}
