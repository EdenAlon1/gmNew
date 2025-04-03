package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class rg extends SeekBar {
    private final rh a;

    public rg(Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        rh rhVar = this.a;
        Drawable drawable = rhVar.c;
        if (drawable != null && drawable.isStateful() && drawable.setState(rhVar.b.getDrawableState())) {
            rhVar.b.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a.c;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        rh rhVar = this.a;
        if (rhVar.c != null) {
            int max = rhVar.b.getMax();
            if (max > 1) {
                int intrinsicWidth = rhVar.c.getIntrinsicWidth();
                int intrinsicHeight = rhVar.c.getIntrinsicHeight();
                int i = intrinsicWidth >= 0 ? intrinsicWidth >> 1 : 1;
                int i2 = intrinsicHeight >= 0 ? intrinsicHeight >> 1 : 1;
                rhVar.c.setBounds(-i, -i2, i, i2);
                int width = (rhVar.b.getWidth() - rhVar.b.getPaddingLeft()) - rhVar.b.getPaddingRight();
                int save = canvas.save();
                canvas.translate(rhVar.b.getPaddingLeft(), rhVar.b.getHeight() / 2);
                for (int i3 = 0; i3 <= max; i3++) {
                    rhVar.c.draw(canvas);
                    canvas.translate(width / max, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    public rg(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.seekBarStyle);
    }

    public rg(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        yo.d(this, getContext());
        rh rhVar = new rh(this);
        this.a = rhVar;
        rhVar.b(attributeSet, i);
    }
}
