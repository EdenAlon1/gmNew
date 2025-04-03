package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ddbi extends FrameLayout implements View.OnClickListener {
    protected ddbh a;
    protected View b;

    public ddbi(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected abstract View a();

    protected abstract void b();

    public final void c() {
        if (this.a == null) {
            throw new IllegalStateException("bind() must be called before show the popup.");
        }
        b();
        setVisibility(0);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == this.b) {
            this.a.i();
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        View a = a();
        this.b = a;
        if (a != null) {
            a.setOnClickListener(this);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }
}
